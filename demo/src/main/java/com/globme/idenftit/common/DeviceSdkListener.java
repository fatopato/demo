package com.globme.idenftit.common;

import com.supremainc.*;

public class DeviceSdkListener implements Callback {

    SWIGTYPE_p_void context;

    public DeviceSdkListener(SWIGTYPE_p_void con){
        context = con;
    }

    public void OnDeviceFound(long deviceId){
        System.out.println("OnDeviceFound : " + deviceId);
    }
    public void OnDeviceAccepted(long deviceId) {
        System.out.println("OnDeviceAccepted :" + deviceId);

        BS2SimpleDeviceInfo info = new BS2SimpleDeviceInfo();
        BS_SDK_V2.BS2_GetDeviceInfo(context, deviceId,info );

        System.out.println("BS2SimpleDeviceInfo:id = " + info.getId()+ ", type = " + info.getType() + "");
    }
    public void OnDeviceConnected(long deviceId)
    {
        System.out.println("OnDeviceConnected :" + deviceId);
    }
    public void OnDeviceDisconnected(long deviceId){

        System.out.println("OnDeviceDisconnected :" + deviceId);
    }

    public void OnReadyToScan(long deviceId, long sequence){
        System.out.println("OnReadyToScan :" + deviceId);
    }
    public void OnProgressChanged(long deviceId, long progressPercentage){
        System.out.println("OnProgressChanged :" + deviceId);
    }

    public void OnLogReceived(long deviceId, BS2Event event){
        System.out.println("OnLogReceived :" + deviceId);
    }
    public void OnAlarmFired(long deviceId,  BS2Event event){
        System.out.println("OnAlarmFired :" + deviceId);
    }
    public void OnInputDetected(long deviceId,  BS2Event event){
        System.out.println("OnInputDetected :" + deviceId);
    }
    public void OnConfigChanged(long deviceId, long configMask){
        System.out.println("OnConfigChanged :" + deviceId);
    }
    public void OnVerifyUser(long deviceId, short seq, short isCard, short cardType, byte[] data){
        System.out.println("OnVerifyUser :" + deviceId);
    }
    public void OnIdentifyUser(long deviceId, short seq, short format, byte[] templateData ){
        System.out.println("OnIdentifyUser :" + deviceId);
    }
    public int IsAcceptableUserID(String uid){
        System.out.println("IsAcceptableUserID :" + uid);
        return 0;
    }
    public void OnSendRootCA(long deviceId, int result){
        System.out.println("OnSendRootCA :" + deviceId);
    }
    public void OnCheckGlobalAPBViolation(long deviceId, short seq, String userID_1, String userID_2, boolean isDualAuth){
        System.out.println("OnCheckGlobalAPBViolation :" + deviceId);
    }

    public long PreferMethod(long deviceId){
        System.out.println("PreferMethod :" + deviceId);
        return 0;
    }
    public String GetRootCaFilePath(long deviceId){
        System.out.println("GetRootCaFilePath :" + deviceId);
        return "suprema123";
    }
    public String GetServerCaFilePath(long deviceId){
        System.out.println("GetServerCaFilePath :" + deviceId);
        return "suprema123";
    }
    public String GetServerPrivateKeyFilePath(long deviceId){
        System.out.println("GetServerPrivateKeyFilePath :" + deviceId);
        return "suprema123";
    }
    public String GetPassword(long deviceId){
        System.out.println("GetPassword :" + deviceId);
        return "suprema123";
    }
    public void OnErrorOccured(long deviceId, int errCode){
        System.out.println("OnErrorOccured :" + deviceId +","+ errCode);
    }
}