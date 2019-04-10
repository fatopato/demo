package com.globme.idenftit.communication;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CommunicationManagerTest {

    @Test
    public void searchDevices() {
        int i = CommunicationManager.searchDevices();
        assertEquals(i,1);
    }

    @Before
    public void beforeGetDevice(){
        CommunicationManager.searchDevices();
    }
    @Test
    public void getDeviceIds() {
        ArrayList<Long> deviceIds = CommunicationManager.getDeviceIds();
        System.out.println(deviceIds.size());
        assertNotEquals(deviceIds.size(),0);}

    /*@Before
    public void beforeConnectDevice(){
        CommunicationManager.searchDevices();
    }*/

    //ConnectDeviceById requires searching
    @Test
    public void connectDeviceById() {
        int i = CommunicationManager.connectDeviceById(Config.TEST_DEVICE_ID_W2);
        assertEquals(1,i);
    }

    @Before
    public void beforeDisconnect(){
        CommunicationManager.connectDeviceById(Config.TEST_DEVICE_ID_W2);
    }

    @Test
    public void disconnectDeviceById() {
        int i = CommunicationManager.disconnectDeviceById(Config.TEST_DEVICE_ID_W2);
        assertEquals(i,1);
    }


    @Test
    public void connectDeviceViaIp() {
        long l = CommunicationManager.connectDeviceViaIp(Config.TEST_IP_ADRESS);
        assertEquals(1,l);
    }

    @Test
    public void connectDeviceViaIp1() {
        long l = CommunicationManager.connectDeviceViaIp(Config.TEST_IP_ADRESS, Config.DEFAULT_SERVER_PORT);
        assertEquals(1,l);
    }

    @Test
    public void timestampToTime() {
    }

    @Test
    public void testConnect() {
        int i = CommunicationManager.testConnect();
        assertEquals(1,i);
    }
}