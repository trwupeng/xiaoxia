<?php
// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `Observer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

require_once __DIR__.'/../Glacier2/Session.php';
require_once __DIR__.'/../IceGrid/Exception.php';
require_once __DIR__.'/../IceGrid/Descriptor.php';
require_once __DIR__.'/../IceGrid/Admin.php';

global $IceGrid__t_ServerDynamicInfo;

if(!class_exists('IceGrid_ServerDynamicInfo',false))
{
    class IceGrid_ServerDynamicInfo
    {
        public function __construct($id='', $state=IceGrid_ServerState::Inactive, $pid=0, $enabled=false)
        {
            $this->id = $id;
            $this->state = $state;
            $this->pid = $pid;
            $this->enabled = $enabled;
        }

        public function __toString()
        {
            global $IceGrid__t_ServerDynamicInfo;
            return IcePHP_stringify($this, $IceGrid__t_ServerDynamicInfo);
        }

        public $id;
        public $state;
        public $pid;
        public $enabled;
    }

    $IceGrid__t_ServerDynamicInfo = IcePHP_defineStruct('::IceGrid::ServerDynamicInfo', 'IceGrid_ServerDynamicInfo', array(
        array('id', $IcePHP__t_string), 
        array('state', $IceGrid__t_ServerState), 
        array('pid', $IcePHP__t_int), 
        array('enabled', $IcePHP__t_bool)));
}

global $IceGrid__t_ServerDynamicInfoSeq;

if(!isset($IceGrid__t_ServerDynamicInfoSeq))
{
    $IceGrid__t_ServerDynamicInfoSeq = IcePHP_defineSequence('::IceGrid::ServerDynamicInfoSeq', $IceGrid__t_ServerDynamicInfo);
}

global $IceGrid__t_AdapterDynamicInfo;

if(!class_exists('IceGrid_AdapterDynamicInfo',false))
{
    class IceGrid_AdapterDynamicInfo
    {
        public function __construct($id='', $proxy=null)
        {
            $this->id = $id;
            $this->proxy = $proxy;
        }

        public function __toString()
        {
            global $IceGrid__t_AdapterDynamicInfo;
            return IcePHP_stringify($this, $IceGrid__t_AdapterDynamicInfo);
        }

        public $id;
        public $proxy;
    }

    $IceGrid__t_AdapterDynamicInfo = IcePHP_defineStruct('::IceGrid::AdapterDynamicInfo', 'IceGrid_AdapterDynamicInfo', array(
        array('id', $IcePHP__t_string), 
        array('proxy', $Ice__t_ObjectPrx)));
}

global $IceGrid__t_AdapterDynamicInfoSeq;

if(!isset($IceGrid__t_AdapterDynamicInfoSeq))
{
    $IceGrid__t_AdapterDynamicInfoSeq = IcePHP_defineSequence('::IceGrid::AdapterDynamicInfoSeq', $IceGrid__t_AdapterDynamicInfo);
}

global $IceGrid__t_NodeDynamicInfo;

if(!class_exists('IceGrid_NodeDynamicInfo',false))
{
    class IceGrid_NodeDynamicInfo
    {
        public function __construct($info=null, $servers=null, $adapters=null)
        {
            $this->info = is_null($info) ? new IceGrid_NodeInfo : $info;
            $this->servers = $servers;
            $this->adapters = $adapters;
        }

        public function __toString()
        {
            global $IceGrid__t_NodeDynamicInfo;
            return IcePHP_stringify($this, $IceGrid__t_NodeDynamicInfo);
        }

        public $info;
        public $servers;
        public $adapters;
    }

    $IceGrid__t_NodeDynamicInfo = IcePHP_defineStruct('::IceGrid::NodeDynamicInfo', 'IceGrid_NodeDynamicInfo', array(
        array('info', $IceGrid__t_NodeInfo), 
        array('servers', $IceGrid__t_ServerDynamicInfoSeq), 
        array('adapters', $IceGrid__t_AdapterDynamicInfoSeq)));
}

global $IceGrid__t_NodeDynamicInfoSeq;

if(!isset($IceGrid__t_NodeDynamicInfoSeq))
{
    $IceGrid__t_NodeDynamicInfoSeq = IcePHP_defineSequence('::IceGrid::NodeDynamicInfoSeq', $IceGrid__t_NodeDynamicInfo);
}

global $IceGrid__t_NodeObserver;
global $IceGrid__t_NodeObserverPrx;

if(!interface_exists('IceGrid_NodeObserver',false))
{
    interface IceGrid_NodeObserver extends Ice_Object
    {
        public function nodeInit($nodes);
        public function nodeUp($node);
        public function nodeDown($name);
        public function updateServer($node, $updatedInfo);
        public function updateAdapter($node, $updatedInfo);
    }

    class IceGrid_NodeObserverPrxHelper
    {
        public static function checkedCast($proxy, $facetOrCtx=null, $ctx=null)
        {
            return $proxy->ice_checkedCast('::IceGrid::NodeObserver', $facetOrCtx, $ctx);
        }

        public static function uncheckedCast($proxy, $facet=null)
        {
            return $proxy->ice_uncheckedCast('::IceGrid::NodeObserver', $facet);
        }

        public static function ice_staticId()
        {
            return '::IceGrid::NodeObserver';
        }
    }

    $IceGrid__t_NodeObserver = IcePHP_defineClass('::IceGrid::NodeObserver', 'IceGrid_NodeObserver', -1, true, false, $Ice__t_Object, null, null);

    $IceGrid__t_NodeObserverPrx = IcePHP_defineProxy($IceGrid__t_NodeObserver);

    IcePHP_defineOperation($IceGrid__t_NodeObserver, 'nodeInit', 0, 0, 0, array(array($IceGrid__t_NodeDynamicInfoSeq, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_NodeObserver, 'nodeUp', 0, 0, 0, array(array($IceGrid__t_NodeDynamicInfo, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_NodeObserver, 'nodeDown', 0, 0, 0, array(array($IcePHP__t_string, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_NodeObserver, 'updateServer', 0, 0, 0, array(array($IcePHP__t_string, false, 0), array($IceGrid__t_ServerDynamicInfo, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_NodeObserver, 'updateAdapter', 0, 0, 0, array(array($IcePHP__t_string, false, 0), array($IceGrid__t_AdapterDynamicInfo, false, 0)), null, null, null);
}

global $IceGrid__t_ApplicationObserver;
global $IceGrid__t_ApplicationObserverPrx;

if(!interface_exists('IceGrid_ApplicationObserver',false))
{
    interface IceGrid_ApplicationObserver extends Ice_Object
    {
        public function applicationInit($serial, $applications);
        public function applicationAdded($serial, $desc);
        public function applicationRemoved($serial, $name);
        public function applicationUpdated($serial, $desc);
    }

    class IceGrid_ApplicationObserverPrxHelper
    {
        public static function checkedCast($proxy, $facetOrCtx=null, $ctx=null)
        {
            return $proxy->ice_checkedCast('::IceGrid::ApplicationObserver', $facetOrCtx, $ctx);
        }

        public static function uncheckedCast($proxy, $facet=null)
        {
            return $proxy->ice_uncheckedCast('::IceGrid::ApplicationObserver', $facet);
        }

        public static function ice_staticId()
        {
            return '::IceGrid::ApplicationObserver';
        }
    }

    $IceGrid__t_ApplicationObserver = IcePHP_defineClass('::IceGrid::ApplicationObserver', 'IceGrid_ApplicationObserver', -1, true, false, $Ice__t_Object, null, null);

    $IceGrid__t_ApplicationObserverPrx = IcePHP_defineProxy($IceGrid__t_ApplicationObserver);

    IcePHP_defineOperation($IceGrid__t_ApplicationObserver, 'applicationInit', 0, 0, 0, array(array($IcePHP__t_int, false, 0), array($IceGrid__t_ApplicationInfoSeq, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_ApplicationObserver, 'applicationAdded', 0, 0, 0, array(array($IcePHP__t_int, false, 0), array($IceGrid__t_ApplicationInfo, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_ApplicationObserver, 'applicationRemoved', 0, 0, 0, array(array($IcePHP__t_int, false, 0), array($IcePHP__t_string, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_ApplicationObserver, 'applicationUpdated', 0, 0, 0, array(array($IcePHP__t_int, false, 0), array($IceGrid__t_ApplicationUpdateInfo, false, 0)), null, null, null);
}

global $IceGrid__t_AdapterObserver;
global $IceGrid__t_AdapterObserverPrx;

if(!interface_exists('IceGrid_AdapterObserver',false))
{
    interface IceGrid_AdapterObserver extends Ice_Object
    {
        public function adapterInit($adpts);
        public function adapterAdded($info);
        public function adapterUpdated($info);
        public function adapterRemoved($id);
    }

    class IceGrid_AdapterObserverPrxHelper
    {
        public static function checkedCast($proxy, $facetOrCtx=null, $ctx=null)
        {
            return $proxy->ice_checkedCast('::IceGrid::AdapterObserver', $facetOrCtx, $ctx);
        }

        public static function uncheckedCast($proxy, $facet=null)
        {
            return $proxy->ice_uncheckedCast('::IceGrid::AdapterObserver', $facet);
        }

        public static function ice_staticId()
        {
            return '::IceGrid::AdapterObserver';
        }
    }

    $IceGrid__t_AdapterObserver = IcePHP_defineClass('::IceGrid::AdapterObserver', 'IceGrid_AdapterObserver', -1, true, false, $Ice__t_Object, null, null);

    $IceGrid__t_AdapterObserverPrx = IcePHP_defineProxy($IceGrid__t_AdapterObserver);

    IcePHP_defineOperation($IceGrid__t_AdapterObserver, 'adapterInit', 0, 0, 0, array(array($IceGrid__t_AdapterInfoSeq, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_AdapterObserver, 'adapterAdded', 0, 0, 0, array(array($IceGrid__t_AdapterInfo, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_AdapterObserver, 'adapterUpdated', 0, 0, 0, array(array($IceGrid__t_AdapterInfo, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_AdapterObserver, 'adapterRemoved', 0, 0, 0, array(array($IcePHP__t_string, false, 0)), null, null, null);
}

global $IceGrid__t_ObjectObserver;
global $IceGrid__t_ObjectObserverPrx;

if(!interface_exists('IceGrid_ObjectObserver',false))
{
    interface IceGrid_ObjectObserver extends Ice_Object
    {
        public function objectInit($objects);
        public function objectAdded($info);
        public function objectUpdated($info);
        public function objectRemoved($id);
    }

    class IceGrid_ObjectObserverPrxHelper
    {
        public static function checkedCast($proxy, $facetOrCtx=null, $ctx=null)
        {
            return $proxy->ice_checkedCast('::IceGrid::ObjectObserver', $facetOrCtx, $ctx);
        }

        public static function uncheckedCast($proxy, $facet=null)
        {
            return $proxy->ice_uncheckedCast('::IceGrid::ObjectObserver', $facet);
        }

        public static function ice_staticId()
        {
            return '::IceGrid::ObjectObserver';
        }
    }

    $IceGrid__t_ObjectObserver = IcePHP_defineClass('::IceGrid::ObjectObserver', 'IceGrid_ObjectObserver', -1, true, false, $Ice__t_Object, null, null);

    $IceGrid__t_ObjectObserverPrx = IcePHP_defineProxy($IceGrid__t_ObjectObserver);

    IcePHP_defineOperation($IceGrid__t_ObjectObserver, 'objectInit', 0, 0, 0, array(array($IceGrid__t_ObjectInfoSeq, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_ObjectObserver, 'objectAdded', 0, 0, 0, array(array($IceGrid__t_ObjectInfo, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_ObjectObserver, 'objectUpdated', 0, 0, 0, array(array($IceGrid__t_ObjectInfo, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_ObjectObserver, 'objectRemoved', 0, 0, 0, array(array($Ice__t_Identity, false, 0)), null, null, null);
}

global $IceGrid__t_RegistryObserver;
global $IceGrid__t_RegistryObserverPrx;

if(!interface_exists('IceGrid_RegistryObserver',false))
{
    interface IceGrid_RegistryObserver extends Ice_Object
    {
        public function registryInit($registries);
        public function registryUp($node);
        public function registryDown($name);
    }

    class IceGrid_RegistryObserverPrxHelper
    {
        public static function checkedCast($proxy, $facetOrCtx=null, $ctx=null)
        {
            return $proxy->ice_checkedCast('::IceGrid::RegistryObserver', $facetOrCtx, $ctx);
        }

        public static function uncheckedCast($proxy, $facet=null)
        {
            return $proxy->ice_uncheckedCast('::IceGrid::RegistryObserver', $facet);
        }

        public static function ice_staticId()
        {
            return '::IceGrid::RegistryObserver';
        }
    }

    $IceGrid__t_RegistryObserver = IcePHP_defineClass('::IceGrid::RegistryObserver', 'IceGrid_RegistryObserver', -1, true, false, $Ice__t_Object, null, null);

    $IceGrid__t_RegistryObserverPrx = IcePHP_defineProxy($IceGrid__t_RegistryObserver);

    IcePHP_defineOperation($IceGrid__t_RegistryObserver, 'registryInit', 0, 0, 0, array(array($IceGrid__t_RegistryInfoSeq, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_RegistryObserver, 'registryUp', 0, 0, 0, array(array($IceGrid__t_RegistryInfo, false, 0)), null, null, null);
    IcePHP_defineOperation($IceGrid__t_RegistryObserver, 'registryDown', 0, 0, 0, array(array($IcePHP__t_string, false, 0)), null, null, null);
}
?>
