package com.globme.idenftit.utils;

import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_unsigned_char;
import com.supremainc.SWIGTYPE_p_void;

public class SdkManager {
    public static SWIGTYPE_p_void context;
    public static String getVersion(){
        return BS_SDK_V2.BS2_Version();
    }
    public static SWIGTYPE_p_void allocateContext(){
        return BS_SDK_V2.BS2_AllocateContext();
    }
    public static void releaseContext(){

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
        BS_SDK_V2.BS2_ReleaseContext(context);
    }
    public static int initialize() {

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
        return BS_SDK_V2.BS2_Initialize(context);
    }
    public static void releaseObject(SWIGTYPE_p_void object) {
        BS_SDK_V2.BS2_ReleaseObject(object);
    }
    public static int makePinCode(SWIGTYPE_p_void context, String plaintext){
        SWIGTYPE_p_unsigned_char ciphertext;
        return 0;
    }

    static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }

}
