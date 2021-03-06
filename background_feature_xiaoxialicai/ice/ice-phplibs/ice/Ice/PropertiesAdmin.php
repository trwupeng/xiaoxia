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
// Generated from file `PropertiesAdmin.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

require_once __DIR__.'/../Ice/BuiltinSequences.php';

global $Ice__t_PropertyDict;

if(!isset($Ice__t_PropertyDict))
{
    $Ice__t_PropertyDict = IcePHP_defineDictionary('::Ice::PropertyDict', $IcePHP__t_string, $IcePHP__t_string);
}

global $Ice__t_PropertiesAdmin;
global $Ice__t_PropertiesAdminPrx;

if(!interface_exists('Ice_PropertiesAdmin',false))
{
    interface Ice_PropertiesAdmin extends Ice_Object
    {
        public function getProperty($key);
        public function getPropertiesForPrefix($prefix);
        public function setProperties($newProperties);
    }

    class Ice_PropertiesAdminPrxHelper
    {
        public static function checkedCast($proxy, $facetOrCtx=null, $ctx=null)
        {
            return $proxy->ice_checkedCast('::Ice::PropertiesAdmin', $facetOrCtx, $ctx);
        }

        public static function uncheckedCast($proxy, $facet=null)
        {
            return $proxy->ice_uncheckedCast('::Ice::PropertiesAdmin', $facet);
        }

        public static function ice_staticId()
        {
            return '::Ice::PropertiesAdmin';
        }
    }

    $Ice__t_PropertiesAdmin = IcePHP_defineClass('::Ice::PropertiesAdmin', 'Ice_PropertiesAdmin', -1, true, false, $Ice__t_Object, null, null);

    $Ice__t_PropertiesAdminPrx = IcePHP_defineProxy($Ice__t_PropertiesAdmin);

    IcePHP_defineOperation($Ice__t_PropertiesAdmin, 'getProperty', 0, 0, 0, array(array($IcePHP__t_string, false, 0)), null, array($IcePHP__t_string, false, 0), null);
    IcePHP_defineOperation($Ice__t_PropertiesAdmin, 'getPropertiesForPrefix', 0, 0, 0, array(array($IcePHP__t_string, false, 0)), null, array($Ice__t_PropertyDict, false, 0), null);
    IcePHP_defineOperation($Ice__t_PropertiesAdmin, 'setProperties', 0, 0, 0, array(array($Ice__t_PropertyDict, false, 0)), null, null, null);
}
?>
