package com.supremainc;


import com.globme.idenftit.common.Config;
import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.globme.idenftit.utils.ContextCreator;

import java.util.ArrayList;

public class Communication {

    public static int DEFAULT_SERVER_PORT = 51211;
    public static int timeoutSecond;
    public static SWIGTYPE_p_void context;



    public static BS2SimpleDeviceInfo[] getDeviceInfos(){
        context = BS_SDK_V2.BS2_AllocateContext();

        int response = BS_SDK_V2.BS2_Initialize(context);
        //In case SDK couldn't be initialized
        if(BS_SDK_V2.BS_SDK_SUCCESS != response){
            System.out.println("SDK Initialization Error! Error code: "+response);
        }

        //SDK initialized successfully
        BS_SDK_V2.BS2_SetServerPort(context, DEFAULT_SERVER_PORT);
        BS_SDK_V2.BS2_SetDeviceSearchingTimeout(context, timeoutSecond /*seconds, default : 5s*/);
        BS_SDK_V2.BS2_SearchDevices(context);
        long deviceIds[] = new long[256];

        BS_SDK_V2.BS2_GetDevices(context,deviceIds);
        ArrayList<Long> idx = new ArrayList<Long>();
        for (int i = 0; i < 256; i++){
            if(deviceIds[i] == 0) continue;
            idx.add(deviceIds[i]);
            System.out.println("id: "+ deviceIds[i]);
        }
        BS2SimpleDeviceInfo deviceInfos[] = new BS2SimpleDeviceInfo[idx.size()];
        for(int j=0; j<deviceInfos.length; j++)
            deviceInfos[j] = new BS2SimpleDeviceInfo();

        for(int i = 0; i < deviceInfos.length; i++){
            System.out.println("DeviceManager info test");
            int i1 = BS_SDK_V2.BS2_GetDeviceInfo(context, idx.get(i), deviceInfos[i]);
        }
        return deviceInfos;
    }


    public static void main(String[] args) {
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
        SWIGTYPE_p_unsigned_int into = new SWIGTYPE_p_unsigned_int(context.hashCode(),true);

        int i = BS_SDK_V2.BS2_ConnectDeviceViaIP(context, Config.TEST_IP_ADRESS, Config.DEFAULT_SERVER_PORT, into);
        System.out.println(i);
        System.out.println((SWIGTYPE_p_unsigned_int.getCPtr(into)));
        System.out.println(into);

        SWIGTYPE_p_int isConnected = new SWIGTYPE_p_int();
        BS_SDK_V2.BS2_IsConnected(context,Config.TEST_DEVICE_ID_W2, isConnected);

        long cPtr = SWIGTYPE_p_int.getCPtr(isConnected);

    }
        static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }
}



