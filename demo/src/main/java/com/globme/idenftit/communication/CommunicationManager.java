package com.globme.idenftit.communication;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.device.model.Device;
import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.globme.idenftit.utils.ContextCreator;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_unsigned_int;
import com.supremainc.SWIGTYPE_p_void;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@Repository
public class CommunicationManager {

    public static SWIGTYPE_p_void context;
    public static Into deviceId;

    public static int searchDevices(){
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
        return BS_SDK_V2.BS2_SearchDevices(context);
    }


    public static ArrayList<Long> getDeviceIds() {
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

        long[] devices = new long[Config.MAX_NUMBER_PER_DEVICE];
        ArrayList<Long> deviceIdList = new ArrayList<Long>();
        int i = BS_SDK_V2.BS2_GetDevices(context, devices);
        if (i != BS_SDK_V2.BS_SDK_SUCCESS) deviceIdList.add((long) i);
        else {
            for (int j = 0; j < devices.length; j++) {
                if (devices[j] == 0) continue;
                deviceIdList.add(devices[j]);
            }
        }
        return deviceIdList;
    }

    public static int connectDeviceById(long deviceId){
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
        return BS_SDK_V2.BS2_ConnectDevice(context,deviceId);
    }

    public static int disconnectDeviceById(long deviceId){
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
        return BS_SDK_V2.BS2_DisconnectDevice(context,deviceId);
    }

    public static long connectDeviceViaIp(String deviceIp, int devicePort){
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
        deviceId = new Into();
        return BS_SDK_V2.BS2_ConnectDeviceViaIP(context, deviceIp, devicePort, deviceId);
    }

    public static long connectDeviceViaIp(String deviceIp){
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
        deviceId = new Into();
        return BS_SDK_V2.BS2_ConnectDeviceViaIP(context, deviceIp, Config.DEFAULT_SERVER_PORT, deviceId);
    }

    public static String timestampToTime(long timestamp){
        Timestamp ts = new Timestamp(timestamp);
        Date time = new Date(ts.getTime());
        return time.toString();
    }

    public static int testConnect(){
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

        CommunicationManager.searchDevices();
        return CommunicationManager.connectDeviceById(Config.TEST_DEVICE_ID_W2);
    }

    static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }

    public static class Into extends SWIGTYPE_p_unsigned_int {

    }
}



