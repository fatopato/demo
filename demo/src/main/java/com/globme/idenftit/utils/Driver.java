package com.globme.idenftit.utils;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.common.DeviceSdkListener;
import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_void;

public class Driver {

    public static SWIGTYPE_p_void context;

    public static void setter() {
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context = contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        BS_SDK_V2.BS2_SetServerPort(context, Config.DEFAULT_SERVER_PORT);
        BS_SDK_V2.BS2_SetDeviceSearchingTimeout(context, Config.TIMEOUT_AS_SECOND /*seconds, default : 5s*/);
        DeviceSdkListener sdkListener = new DeviceSdkListener(context);
        BS_SDK_V2.BS2_SetDeviceEventListener(context, sdkListener, sdkListener, sdkListener, sdkListener);
    }

    static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }
}
