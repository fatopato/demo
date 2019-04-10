package com.globme.idenftit.identity;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.identity.FaceScanner;
import com.globme.idenftit.user.UserManager;
import com.supremainc.BS2Face;
import com.supremainc.BS2UserBlob;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FaceScannerTest {

    @Before
    public void connectBefore(){
        CommunicationManager.searchDevices();
        ArrayList<Long> deviceIds = CommunicationManager.getDeviceIds();
        for (long l : deviceIds) System.out.println(l);
        int i = CommunicationManager.connectDeviceById(Config.TEST_DEVICE_ID_FACESTATION);
        System.out.println("connection: "+i);
    }
    @Test
    public void scanFaceById() {
        BS2Face bs2Face = FaceScanner.scanFaceById(Config.TEST_DEVICE_ID_FACESTATION);
        /////////////////////////////////////////
        BS2UserBlob userBlob = UserManager.createUserBlob(2222);
        FaceScanner.addFaceToUserBlob(userBlob,bs2Face);
        BS2UserBlob[] userBlobs = new BS2UserBlob[1];
        userBlobs[0] = userBlob;
        int i = UserManager.enrollUser(Config.TEST_DEVICE_ID_FACESTATION, userBlobs);
        System.out.println(i);
    }
    @Test
    public void removeUserAndFace(){
        int i = UserManager.removeUserById(Config.TEST_DEVICE_ID_FACESTATION, "2222");
        System.out.println("Remove: "+i);
    }
}