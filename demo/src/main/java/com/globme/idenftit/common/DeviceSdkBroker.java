package com.globme.idenftit.common;

import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_void;

import java.util.ArrayList;

class DeviceSdkBroker implements Runnable {

    @Override
    public void run() {
        System.out.println(BS_SDK_V2.BS2_Version() );

        SWIGTYPE_p_void context =  BS_SDK_V2.BS2_AllocateContext() ;

        long ret =  BS_SDK_V2.BS2_Initialize(context);
        if (BS_SDK_V2.BS_SDK_SUCCESS != ret ) {
            System.out.println("An error occurred on initializing : error code = " +  ret);
        }

        System.out.println( "context = " + context) ;

        BS_SDK_V2.BS2_SetServerPort(context, 51212);

        DeviceSdkListener listener = new DeviceSdkListener(context);

        BS_SDK_V2.BS2_SetDeviceEventListener(context,listener,listener, listener, listener);

        discoverDevices	(context, false);


        try {

            for (int i=0; i<100000; i++) {

                Thread.sleep(10);
            }
        } catch (InterruptedException ex) {}


        BS_SDK_V2.BS2_ReleaseContext(context);
    }



    public ArrayList<Long> discoverDevices(SWIGTYPE_p_void context, boolean isPrinting) {

        BS_SDK_V2.BS2_SearchDevices(context);


        long[] deviceIds = new long[256];
        BS_SDK_V2.BS2_GetDevices(context,deviceIds);

        ArrayList<Long> result = new ArrayList<Long>();

        for(int i =0; i < 256; i++) {

            if(deviceIds[i] ==0) continue;

            result.add(deviceIds[i]);
            if (isPrinting) System.out.println("a device discovered: id = " + deviceIds[i]);
        }

        return result;

    }
}