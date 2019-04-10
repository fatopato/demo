package com.globme.idenftit.identity;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.globme.idenftit.user.UserManager;
import com.globme.idenftit.utils.ContextCreator;
import com.supremainc.BS2Fingerprint;
import com.supremainc.BS2UserBlob;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_void;
import org.springframework.stereotype.Repository;

@Repository
public class FingerScanner {

    public static SWIGTYPE_p_void context;
    public static BS2Fingerprint fingerprint;
    public static BS2Fingerprint scanFinger(long deviceId){
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

        BS2Fingerprint fingerprint = new BS2Fingerprint();
        for(int i = 0; i < Config.NUMBER_OF_TEMPLATES_PER_FINGER_; i++){
            int scanResponse = BS_SDK_V2.BS2_ScanFingerprint(context, deviceId, fingerprint, i, Config.FINGER_QUALITY_LOW, Config.FINGER_FORMAT_SUPREMA, null);
            if(BS_SDK_V2.BS_SDK_SUCCESS == scanResponse)continue;
            else System.out.println(scanResponse);
        }
        return fingerprint;

    }
    public static int verifyFingerprint(long deviceId, BS2Fingerprint bs2Fingerprint){

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
        return BS_SDK_V2.BS2_VerifyFingerprint(context,deviceId,bs2Fingerprint);
    }

    public static int addFinger(long deviceId, BS2UserBlob userBlob){

        fingerprint = scanFinger(deviceId);
        int response = verifyFingerprint(deviceId, fingerprint);
        addFingerToUserBlob(userBlob, fingerprint);
        return response;
    }

    public static void addFingerToUserBlob(BS2UserBlob userBlob, BS2Fingerprint bs2Fingerprint){
        short previousNumFingers = userBlob.getUser().getNumFingers();
        short newNumFingers = (short) (previousNumFingers + 1);
        userBlob.getUser().setNumFingers(newNumFingers);
        userBlob.setFingerObjs(bs2Fingerprint);
         }

    public static void main(String[] args) {
        CommunicationManager.testConnect();
        BS2UserBlob[] userlist = new BS2UserBlob[1];
        BS2UserBlob userBlob = UserManager.createUserBlob(2231);
        userlist[0] = userBlob;
        BS2Fingerprint fingerprint = scanFinger(Config.TEST_DEVICE_ID_W2);
        int i = verifyFingerprint(Config.TEST_DEVICE_ID_W2, fingerprint);
        if(i == Config.SDK_SUCCESS){
            addFingerToUserBlob(userBlob, fingerprint);
        }
        else System.out.println("error : "+ i);
        UserManager.enrollUser(Config.TEST_DEVICE_ID_W2, userlist);
        System.out.println(userBlob.getUser().getNumFingers());
        //int i1 = BS_SDK_V2.BS2_VerifyUser(context, Config.TEST_DEVICE_ID_W2, 1, 1, userBlob);
        //System.out.println(i1);


    }

    static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }



}
