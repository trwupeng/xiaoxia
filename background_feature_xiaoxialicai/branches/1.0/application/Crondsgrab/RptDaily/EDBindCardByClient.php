<?php
namespace PrjCronds;
/**
 * OK
 * php /var/www/licai_php/run/crond.php "__crond/rungrab&task=RptDaily.EDBindCardByClient&ymdh=20160128"
 * Created by PhpStorm.
 * User: li.lianqi
 * Date: 2016/1/28 0028
 * Time: 下午 1:10
 */

class EDBindCardByClient extends \Sooh\Base\Crond\Task{
    public function init(){
        parent::init();
        $this->toBeContinue = true;
        $this->_secondsRunAgain=1200;
        $this->_iissStartAfter=300;
        $this->ret = new \Sooh\Base\Crond\Ret();
        $this->db = \Sooh\DB\Broker::getInstance(\Rpt\Tbname::db_p2prpt);
    }

    public function free() {
        $this->db = null;
        parent::free();
    }

    protected function onRun($dt) {
        $this->oneday($dt->YmdFull);
        if (!$this->_isManual && $dt->hour <= 6) {
            $dt0 = strtotime($dt->YmdFull);
            switch($dt->hour){
                case 1: $this->oneday(date('Ymd',$dt0-86400*10));break;
                case 2: $this->oneday(date('Ymd',$dt0-86400*7));break;
                case 3: $this->oneday(date('Ymd',$dt0-86400*4));break;
                case 4: $this->oneday(date('Ymd',$dt0-86400*3));break;
                case 5: $this->oneday(date('Ymd',$dt0-86400*2));break;
                case 6: $this->oneday(date('Ymd',$dt0-86400*1));break;
            }
        }
        return true;
    }

    protected function oneday($ymd) {
        $db = \Sooh\DB\Broker::getInstance(\Rpt\Tbname::db_p2prpt);
        $bindOk = \Rpt\EvtDaily\BindOk::getCopy('BindOkByClient');
        $where = 'resultYmd='.$ymd.' and statusCode in (16,4) ';
        $result = $this->getResult($this->sqlBase($where));
//error_log('BindOkByClient sql:'.\Sooh\Db\Broker::lastCmd());
        if (!empty($result)) {
            foreach($result as $r) {
                $bindOk->add($r['n'], $r['clientType'], $r['copartnerId'], 0);
            }
            $bindOk->save($db, $ymd);
        }

        $bindOk->reset();

        $bindFailed = \Rpt\EvtDaily\BindFailed::getCopy('BindFailedByClient');
        $where = 'createYmd='.$ymd.' and statusCode =0 and resultMsg!=\'\' '
            .'and tb_bankcard_final.userId not in (select userId from db_p2prpt.tb_bankcard_final where statusCode in(4,16) and resultYmd='.$ymd.') ';
        $result = $this->getResult($this->sqlBase($where));
//error_log('BindFailedByClient sql:'.\Sooh\Db\Broker::lastCmd());
        if (!empty($result)) {
            foreach($result as $r) {
                $bindFailed->add($r['n'], $r['clientType'], $r['copartnerId'], 0);
            }
            $bindFailed->save($db, $ymd);
        }

        $bindFailed->reset();

        $regBindOk = \Rpt\EvtDaily\RegAndBindOk::getCopy('RegAndBindOkByClient');
        $where = 'resultYmd='.$ymd.' and statusCode in (16,4) and ymdReg='.$ymd;
        $result = $this->getResult($this->sqlBaseForNewReg($where));
//error_log('RegAndBindOkByClient sql:'.\Sooh\Db\Broker::lastCmd());
        if (!empty($result)) {
            foreach($result as $r) {
                $regBindOk->add($r['n'], $r['clientType'], $r['copartnerId'], 0);
            }
            $regBindOk->save($db, $ymd);
        }
        $regBindOk->reset();

        $regBindFailed = \Rpt\EvtDaily\RegAndBindFailed::getCopy('RegAndBindFailedByClient');
        $where = 'createYmd='.$ymd.' and statusCode =0 and resultMsg!=\'\'  and ymdReg='.$ymd
            .' and tb_bankcard_final.userId not in (select userId from db_p2prpt.tb_bankcard_final where statusCode in(4,16)  and resultYmd='.$ymd.') ';
        $result = $this->getResult($this->sqlBaseForNewReg($where));
//error_log('RegAndBindFailedByClient sql:'.\Sooh\Db\Broker::lastCmd());
        if (!empty($result)) {
            foreach($result as $r) {
                $regBindFailed->add($r['n'], $r['clientType'], $r['copartnerId'], 0);
            }
            $regBindFailed->save($db, $ymd);
        }
        $regBindFailed->reset();
    }

    protected function sqlBase($where) {
        return 'select tb_user_final.clientType,tb_user_final.copartnerId, count(distinct(tb_bankcard_final.userId)) as n '
              .'from db_p2prpt.tb_bankcard_final '
              .'left join db_p2prpt.tb_user_final on tb_bankcard_final.userId=tb_user_final.userId '
              .'where '.$where
              .' and tb_bankcard_final.userId not in (select userId from db_p2prpt.tb_user_final where flagUser=1)'
              .' group by tb_user_final.clientType,tb_user_final.copartnerId';
    }

    protected function sqlBaseForNewReg ($where) {
        return 'select tb_user_final.clientType,  tb_user_final.copartnerId, count(distinct(tb_bankcard_final.userId)) as n '
              .'from db_p2prpt.tb_bankcard_final '
              .'left join db_p2prpt.tb_user_final on tb_bankcard_final.userId=tb_user_final.userId '
              .'where '.$where
              .' and tb_bankcard_final.userId not in (select userId from db_p2prpt.tb_user_final where flagUser=1)'
              .' group by tb_user_final.clientType,tb_user_final.copartnerId';
    }

    protected function getResult ($sql) {
        $result = $this->db->execCustom(['sql'=>$sql]);
        $rs = $this->db->fetchAssocThenFree($result);
        return $rs;
    }
}