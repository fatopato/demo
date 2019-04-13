package com.globme.idenftit.user;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.user.UserManager;
import com.supremainc.BS2UserBlob;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserManagerTest {

    @Before
    public void connectBefore(){
        CommunicationManager.searchDevices();
        CommunicationManager.connectDeviceById(Config.TEST_DEVICE_ID_W2);
    }
    @Test
    public void enrollUser() {
        BS2UserBlob userBlob = UserManager.createUserBlob(1111);
        BS2UserBlob[] userBlobs = new BS2UserBlob[1];
        userBlobs[0] = userBlob;
        int i = UserManager.enrollUser(Config.TEST_DEVICE_ID_W2, userBlobs);
        assertEquals(1,i);

    }

    @Test
    public void removeUserById() {
        assertEquals(1, UserManager.removeUserById(Config.TEST_DEVICE_ID_W2,"1111"));
    }

    @Test
    public void removeAllUsers() {
    }

    @Test
    public void getUserInfoByUserId() {
        BS2UserBlob bs2UserBlob = UserManager.getUserInfoByUserId(Config.TEST_DEVICE_ID_W2, "37");
        assertEquals(bs2UserBlob.getUser().getUserID(),"37");
    }

    @Test
    public void getUserDataByUserId() {
        BS2UserBlob bs2UserBlob = UserManager.getUserDataByUserId(Config.TEST_DEVICE_ID_W2, "37");
        assertEquals(bs2UserBlob.getUser().getUserID(),"37");
    }

    @Test
    public void createUserBlob() {
    }

    @After
    public void disconnectAfter(){
        CommunicationManager.disconnectDeviceById(Config.TEST_DEVICE_ID_W2);
    }
}