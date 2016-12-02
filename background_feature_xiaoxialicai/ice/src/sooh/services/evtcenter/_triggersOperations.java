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
// Generated from file `evtcenter.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package sooh.services.evtcenter;

public interface _triggersOperations
{
    void onRegister(String data, Ice.Current __current);

    void onLogout(String data, Ice.Current __current);

    void onLogin(String data, Ice.Current __current);

    void onBuyRequest(String data, Ice.Current __current);

    void onBuyConfirm(String data, Ice.Current __current);

    void onRechargeRequest(String data, Ice.Current __current);

    void onRechargeConfirm(String data, Ice.Current __current);

    void onWithdrawRequest(String data, Ice.Current __current);

    void onWithdrawConfirm(String data, Ice.Current __current);

    void onWaresFull(String data, Ice.Current __current);

    void onWaresMonthly(String data, Ice.Current __current);

    void onWaresEnd(String data, Ice.Current __current);

    void onCustomEvt(String evt, String data, Ice.Current __current);
}