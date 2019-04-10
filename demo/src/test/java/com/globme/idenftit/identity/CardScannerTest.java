package com.globme.idenftit.identity;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.identity.CardScanner;
import com.globme.idenftit.user.UserManager;
import com.supremainc.BS2Card;
import com.supremainc.BS2UserBlob;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class CardScannerTest {

    @Before
    public void connectBefore(){
        CommunicationManager.searchDevices();
        CommunicationManager.connectDeviceById(Config.TEST_DEVICE_ID_FACESTATION /* Config.TEST_DEVICE_ID_W2*/);
    }
    @Test
    public void scanCardById() {
        CommunicationManager.searchDevices();
        CommunicationManager.connectDeviceById(Config.TEST_DEVICE_ID_FACESTATION);
        BS2Card bs2Card = CardScanner.scanCardById(Config.TEST_DEVICE_ID_FACESTATION);
        assertNotEquals(0,bs2Card.getCard().getSize());
    }
    @Test
    public void addCardToUserBlob(){
        BS2UserBlob bs2UserBlob = UserManager.createUserBlob(2222);
        BS2Card bs2Card = CardScanner.scanCardById(Config.TEST_DEVICE_ID_FACESTATION);
        bs2UserBlob.getSetting().setCardAuthMode((short)1);
        CardScanner.addCardToUserBlob(bs2UserBlob,bs2Card);
        BS2UserBlob[] userBlobs = new BS2UserBlob[1];
        userBlobs[0] = bs2UserBlob;
        int i = UserManager.enrollUser(Config.TEST_DEVICE_ID_FACESTATION, userBlobs);
        System.out.println(i);
    }
    @After
    public void disconnectAfter(){
        CommunicationManager.disconnectDeviceById(Config.TEST_DEVICE_ID_FACESTATION);
    }
}