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
// Generated from file `logcenter.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package sooh.services.logcenter;

/**
 * 日志中心
 **/
public interface logerPrx extends Ice.ObjectPrx
{
    public String writeSyn(String logdata, String reqdata);

    public String writeSyn(String logdata, String reqdata, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_writeSyn(String logdata, String reqdata);

    public Ice.AsyncResult begin_writeSyn(String logdata, String reqdata, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_writeSyn(String logdata, String reqdata, Ice.Callback __cb);

    public Ice.AsyncResult begin_writeSyn(String logdata, String reqdata, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_writeSyn(String logdata, String reqdata, Callback_loger_writeSyn __cb);

    public Ice.AsyncResult begin_writeSyn(String logdata, String reqdata, java.util.Map<String, String> __ctx, Callback_loger_writeSyn __cb);

    public Ice.AsyncResult begin_writeSyn(String logdata, 
                                          String reqdata, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_writeSyn(String logdata, 
                                          String reqdata, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_writeSyn(String logdata, 
                                          String reqdata, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_writeSyn(String logdata, 
                                          String reqdata, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb);

    public String end_writeSyn(Ice.AsyncResult __result);

    public void writeAsy(String logdata, String reqdata);

    public void writeAsy(String logdata, String reqdata, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_writeAsy(String logdata, String reqdata);

    public Ice.AsyncResult begin_writeAsy(String logdata, String reqdata, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_writeAsy(String logdata, String reqdata, Ice.Callback __cb);

    public Ice.AsyncResult begin_writeAsy(String logdata, String reqdata, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_writeAsy(String logdata, String reqdata, Callback_loger_writeAsy __cb);

    public Ice.AsyncResult begin_writeAsy(String logdata, String reqdata, java.util.Map<String, String> __ctx, Callback_loger_writeAsy __cb);

    public Ice.AsyncResult begin_writeAsy(String logdata, 
                                          String reqdata, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_writeAsy(String logdata, 
                                          String reqdata, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_writeAsy(String logdata, 
                                          String reqdata, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_writeAsy(String logdata, 
                                          String reqdata, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb);

    public void end_writeAsy(Ice.AsyncResult __result);
}
