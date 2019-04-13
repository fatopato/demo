package com.globme.idenftit.device;

import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.device.model.Device;
import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.globme.idenftit.utils.ContextCreator;
import com.globme.idenftit.utils.Driver;
import com.globme.idenftit.utils.mapper.DeviceMapper;
import com.supremainc.BS2SimpleDeviceInfo;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_unsigned_int;
import com.supremainc.SWIGTYPE_p_void;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DeviceManager {
    private static SWIGTYPE_p_void context;
    private static ArrayList<Device> deviceList = new ArrayList<>();
    private static BS2SimpleDeviceInfo[] infos;

    public static ArrayList<Device> getDeviceList (){
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
            context = contextCreator.getContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }

        infos = getDeviceInfos();
        for(int i = 0; i < infos.length; i++){
            Device dev = new Device();
            dev = DeviceMapper.getDevice(infos[i]);
            deviceList.add(dev);
        }
        return deviceList;
    }

    public static Device getDeviceInfoById(long deviceId){
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
        BS2SimpleDeviceInfo bs2SimpleDeviceInfo = new BS2SimpleDeviceInfo();
        BS_SDK_V2.BS2_GetDeviceInfo(context,deviceId,bs2SimpleDeviceInfo);
        return DeviceMapper.getDevice(bs2SimpleDeviceInfo);
    }

    private static BS2SimpleDeviceInfo[] getDeviceInfos(){

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

        Driver.setter();
        CommunicationManager.searchDevices();
        ArrayList<Long> deviceIds = CommunicationManager.getDeviceIds();

        BS2SimpleDeviceInfo deviceInfos[] = new BS2SimpleDeviceInfo[deviceIds.size()];
        for(int j=0; j<deviceInfos.length; j++)
            deviceInfos[j] = new BS2SimpleDeviceInfo();

        for(int i = 0; i < deviceInfos.length; i++){
            // System.out.println("DeviceManager info test");
            int i1 = BS_SDK_V2.BS2_GetDeviceInfo(context, deviceIds.get(i), deviceInfos[i]);
        }
        return deviceInfos;
    }
    //It requires to initialize, search devices, get devices. Not need to connect device
    public static BS2SimpleDeviceInfo getBs2DeviceInfoById(long deviceId){
        BS2SimpleDeviceInfo deviceInfo = new BS2SimpleDeviceInfo();
        BS_SDK_V2.BS2_GetDeviceInfo(context,deviceId,deviceInfo);
        return deviceInfo;
    }

    //These methods require connectDevice-------------------------------------------
    public static long getDeviceTime(long deviceId){
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context=contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        SWIGTYPE_p_unsigned_int gmtTime = null;
        //BS_SDK_V2.BS2_GetDeviceTime(context,deviceId,gmtTime);
        return 0; //return gmtTime
    }

    public static int setDeviceTime(long deviceId, long gmtTİme){
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context=contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        return BS_SDK_V2.BS2_SetDeviceTime(context,deviceId,gmtTİme);
    }

    public static int clearDatabaseById(long deviceId){

        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context=contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        return BS_SDK_V2.BS2_ClearDatabase(context,deviceId);
    }

    public static int factoryResetById(long deviceId){

        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context=contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        return BS_SDK_V2.BS2_FactoryReset(context,deviceId);
    }

    public static int rebootDeviceById(long deviceId){
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context=contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        return BS_SDK_V2.BS2_RebootDevice(context,deviceId);
    }

    public static int lockDeviceById(long deviceId){

        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context=contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        return BS_SDK_V2.BS2_LockDevice(context,deviceId);
    }

    public static int unlockDeviceById(long deviceId){

        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context=contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        return BS_SDK_V2.BS2_UnlockDevice(context,deviceId);
    }
    //------------------------------------------------------------------------------------------------

    //It doesn't require any method before
    public static int setKeepAliveTimeoutAsMicroSecond(int ms){

        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context=contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        return BS_SDK_V2.BS2_SetKeepAliveTimeout(context,ms);
    }
}
