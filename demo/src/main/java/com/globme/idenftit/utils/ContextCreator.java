package com.globme.idenftit.utils;

import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_void;

public class ContextCreator {
    private static ContextCreator contextCreator = null;
    private static SWIGTYPE_p_void context = null;
    private static boolean isContextInitialized = false;

    public static ContextCreator getInstance()  {
        return contextCreator != null ? contextCreator : new ContextCreator();
    }

    private ContextCreator() {
    }

    public void initializeContext() throws ContextCanNotInitializedException{
        if(context == null){
            context = BS_SDK_V2.BS2_AllocateContext();
            int responseCode = BS_SDK_V2.BS2_Initialize(context);
             if(responseCode == BS_SDK_V2.BS_SDK_SUCCESS){
                 isContextInitialized = true;
             }else{
                 throw new ContextCanNotInitializedException(responseCode);
             }
        }
    }

    public SWIGTYPE_p_void getContext() throws ContextIsNotInitializedException {
        if(!isContextInitialized){
            throw new ContextIsNotInitializedException();
        }
        return context;

    }

    static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }
}
