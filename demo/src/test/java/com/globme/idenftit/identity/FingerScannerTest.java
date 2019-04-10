package com.globme.idenftit.identity;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.identity.FingerScanner;
import com.supremainc.BS2Fingerprint;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FingerScannerTest {

    @Before
    public void connectBefore(){
        CommunicationManager.searchDevices();
        CommunicationManager.connectDeviceById(Config.TEST_DEVICE_ID_W2);
    }
    @Test
    public void scanFinger() {
        BS2Fingerprint fingerprint = FingerScanner.scanFinger(Config.TEST_DEVICE_ID_W2);
        assertNotNull(fingerprint.getData());
    }

    @Test
    public void verifyFingerprint() {
        BS2Fingerprint fingerprint = FingerScanner.scanFinger(Config.TEST_DEVICE_ID_W2);
        int i = FingerScanner.verifyFingerprint(Config.TEST_DEVICE_ID_W2, fingerprint);
        assertEquals(1,i);
    }
    @After
    public void disconnectAfter(){
        CommunicationManager.disconnectDeviceById(Config.TEST_DEVICE_ID_W2);
    }
}