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
// Generated from file `samples.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package sooh.services.samples;

/**
 * Provides type-specific helper functions.
 **/
public final class sample0000PrxHelper extends Ice.ObjectPrxHelperBase implements sample0000Prx
{
    private static final String __echohi_name = "echohi";

    public String echohi(String who)
    {
        return echohi(who, null, false);
    }

    public String echohi(String who, java.util.Map<String, String> __ctx)
    {
        return echohi(who, __ctx, true);
    }

    private String echohi(String who, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__echohi_name);
        return end_echohi(begin_echohi(who, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_echohi(String who)
    {
        return begin_echohi(who, null, false, false, null);
    }

    public Ice.AsyncResult begin_echohi(String who, java.util.Map<String, String> __ctx)
    {
        return begin_echohi(who, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_echohi(String who, Ice.Callback __cb)
    {
        return begin_echohi(who, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_echohi(String who, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_echohi(who, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_echohi(String who, Callback_sample0000_echohi __cb)
    {
        return begin_echohi(who, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_echohi(String who, java.util.Map<String, String> __ctx, Callback_sample0000_echohi __cb)
    {
        return begin_echohi(who, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_echohi(String who, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_echohi(who, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_echohi(String who, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_echohi(who, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_echohi(String who, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_echohi(who, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_echohi(String who, 
                                        java.util.Map<String, String> __ctx, 
                                        IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_echohi(who, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_echohi(String who, 
                                         java.util.Map<String, String> __ctx, 
                                         boolean __explicitCtx, 
                                         boolean __synchronous, 
                                         IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_echohi(who, __ctx, __explicitCtx, __synchronous, 
                            new IceInternal.Functional_TwowayCallbackArg1<String>(__responseCb, __exceptionCb, __sentCb)
                                {
                                    public final void __completed(Ice.AsyncResult __result)
                                    {
                                        sample0000PrxHelper.__echohi_completed(this, __result);
                                    }
                                });
    }

    private Ice.AsyncResult begin_echohi(String who, 
                                         java.util.Map<String, String> __ctx, 
                                         boolean __explicitCtx, 
                                         boolean __synchronous, 
                                         IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__echohi_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__echohi_name, __cb);
        try
        {
            __result.prepare(__echohi_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(who);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public String end_echohi(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __echohi_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __echohi_completed(Ice.TwowayCallbackArg1<String> __cb, Ice.AsyncResult __result)
    {
        sooh.services.samples.sample0000Prx __proxy = (sooh.services.samples.sample0000Prx)__result.getProxy();
        String __ret = null;
        try
        {
            __ret = __proxy.end_echohi(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __forwardAsy_name = "forwardAsy";

    public void forwardAsy(String serviceClass, String serviceFunc, String jsonedArray)
    {
        forwardAsy(serviceClass, serviceFunc, jsonedArray, null, false);
    }

    public void forwardAsy(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx)
    {
        forwardAsy(serviceClass, serviceFunc, jsonedArray, __ctx, true);
    }

    private void forwardAsy(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_forwardAsy(begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, String serviceFunc, String jsonedArray)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, null, false, false, null);
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, String serviceFunc, String jsonedArray, Ice.Callback __cb)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, String serviceFunc, String jsonedArray, Callback_sample0000_forwardAsy __cb)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx, Callback_sample0000_forwardAsy __cb)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, 
                                            String serviceFunc, 
                                            String jsonedArray, 
                                            IceInternal.Functional_VoidCallback __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, 
                                            String serviceFunc, 
                                            String jsonedArray, 
                                            IceInternal.Functional_VoidCallback __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, 
                                            String serviceFunc, 
                                            String jsonedArray, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_VoidCallback __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_forwardAsy(String serviceClass, 
                                            String serviceFunc, 
                                            String jsonedArray, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_VoidCallback __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_forwardAsy(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_forwardAsy(String serviceClass, 
                                             String serviceFunc, 
                                             String jsonedArray, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.Functional_VoidCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_forwardAsy(serviceClass, 
                                serviceFunc, 
                                jsonedArray, 
                                __ctx, 
                                __explicitCtx, 
                                __synchronous, 
                                new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_forwardAsy(String serviceClass, 
                                             String serviceFunc, 
                                             String jsonedArray, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__forwardAsy_name, __cb);
        try
        {
            __result.prepare(__forwardAsy_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(serviceClass);
            __os.writeString(serviceFunc);
            __os.writeString(jsonedArray);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_forwardAsy(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __forwardAsy_name);
    }

    private static final String __forwardSyn_name = "forwardSyn";

    public String forwardSyn(String serviceClass, String serviceFunc, String jsonedArray)
    {
        return forwardSyn(serviceClass, serviceFunc, jsonedArray, null, false);
    }

    public String forwardSyn(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx)
    {
        return forwardSyn(serviceClass, serviceFunc, jsonedArray, __ctx, true);
    }

    private String forwardSyn(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__forwardSyn_name);
        return end_forwardSyn(begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, String serviceFunc, String jsonedArray)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, null, false, false, null);
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, String serviceFunc, String jsonedArray, Ice.Callback __cb)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, String serviceFunc, String jsonedArray, Callback_sample0000_forwardSyn __cb)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, String serviceFunc, String jsonedArray, java.util.Map<String, String> __ctx, Callback_sample0000_forwardSyn __cb)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, 
                                            String serviceFunc, 
                                            String jsonedArray, 
                                            IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, 
                                            String serviceFunc, 
                                            String jsonedArray, 
                                            IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, 
                                            String serviceFunc, 
                                            String jsonedArray, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_forwardSyn(String serviceClass, 
                                            String serviceFunc, 
                                            String jsonedArray, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_forwardSyn(String serviceClass, 
                                             String serviceFunc, 
                                             String jsonedArray, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_forwardSyn(serviceClass, serviceFunc, jsonedArray, __ctx, __explicitCtx, __synchronous, 
                                new IceInternal.Functional_TwowayCallbackArg1<String>(__responseCb, __exceptionCb, __sentCb)
                                    {
                                        public final void __completed(Ice.AsyncResult __result)
                                        {
                                            sample0000PrxHelper.__forwardSyn_completed(this, __result);
                                        }
                                    });
    }

    private Ice.AsyncResult begin_forwardSyn(String serviceClass, 
                                             String serviceFunc, 
                                             String jsonedArray, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__forwardSyn_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__forwardSyn_name, __cb);
        try
        {
            __result.prepare(__forwardSyn_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(serviceClass);
            __os.writeString(serviceFunc);
            __os.writeString(jsonedArray);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public String end_forwardSyn(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __forwardSyn_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __forwardSyn_completed(Ice.TwowayCallbackArg1<String> __cb, Ice.AsyncResult __result)
    {
        sooh.services.samples.sample0000Prx __proxy = (sooh.services.samples.sample0000Prx)__result.getProxy();
        String __ret = null;
        try
        {
            __ret = __proxy.end_forwardSyn(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __sayhi_name = "sayhi";

    public void sayhi(String who)
    {
        sayhi(who, null, false);
    }

    public void sayhi(String who, java.util.Map<String, String> __ctx)
    {
        sayhi(who, __ctx, true);
    }

    private void sayhi(String who, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_sayhi(begin_sayhi(who, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_sayhi(String who)
    {
        return begin_sayhi(who, null, false, false, null);
    }

    public Ice.AsyncResult begin_sayhi(String who, java.util.Map<String, String> __ctx)
    {
        return begin_sayhi(who, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_sayhi(String who, Ice.Callback __cb)
    {
        return begin_sayhi(who, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_sayhi(String who, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_sayhi(who, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_sayhi(String who, Callback_sample0000_sayhi __cb)
    {
        return begin_sayhi(who, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_sayhi(String who, java.util.Map<String, String> __ctx, Callback_sample0000_sayhi __cb)
    {
        return begin_sayhi(who, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_sayhi(String who, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_sayhi(who, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_sayhi(String who, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sayhi(who, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_sayhi(String who, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_sayhi(who, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_sayhi(String who, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_VoidCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sayhi(who, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_sayhi(String who, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.Functional_VoidCallback __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sayhi(who, 
                           __ctx, 
                           __explicitCtx, 
                           __synchronous, 
                           new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_sayhi(String who, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__sayhi_name, __cb);
        try
        {
            __result.prepare(__sayhi_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(who);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_sayhi(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __sayhi_name);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static sample0000Prx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), sample0000Prx.class, sample0000PrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static sample0000Prx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), sample0000Prx.class, sample0000PrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static sample0000Prx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), sample0000Prx.class, sample0000PrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static sample0000Prx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), sample0000Prx.class, sample0000PrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static sample0000Prx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, sample0000Prx.class, sample0000PrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static sample0000Prx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, sample0000Prx.class, sample0000PrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::sooh::services::samples::sample0000"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, sample0000Prx v)
    {
        __os.writeProxy(v);
    }

    public static sample0000Prx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            sample0000PrxHelper result = new sample0000PrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
