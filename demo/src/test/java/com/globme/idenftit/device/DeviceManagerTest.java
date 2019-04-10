package com.globme.idenftit.device;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.device.DeviceManager;
import com.globme.idenftit.device.model.Device;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeviceManagerTest {

    @Test
    public void getDeviceList() {
        ArrayList<Device> deviceList = DeviceManager.getDeviceList();
        assertNotEquals(0, deviceList.size());

    }

    /*@Test
    public void getDeviceInfo() {
        BS2SimpleDeviceInfo deviceInfo = DeviceManager.getDeviceInfo(Config.TEST_DEVICE_ID_W2);
        System.out.println(deviceInfo.getId());
    }*/

    /*@Test
    public void getDeviceTime() {
        long deviceTime = DeviceManager.getDeviceTime(Config.TEST_DEVICE_ID_W2);
        System.out.println(deviceTime);
    }*/

    @Before
    public void beforeSetTime() {
        CommunicationManager.searchDevices();
        CommunicationManager.connectDeviceViaIp(Config.TEST_IP_ADRESS);
    }

    @Test //Needs to Connect Before Setting
    public void setDeviceTime() {
        int i = DeviceManager.setDeviceTime(Config.TEST_DEVICE_ID_W2, 1554744088);
        assertEquals(1, i);
    }

    @Test
    public void rebootDeviceById() {
        int i = DeviceManager.rebootDeviceById(Config.TEST_DEVICE_ID_W2);
        assertEquals(i, 1);
    }

    @Test
    public void lockDeviceById() {
        int i = DeviceManager.lockDeviceById(Config.TEST_DEVICE_ID_W2);
        assertEquals(1, i);
    }

    @Test
    public void unlockDeviceById() {
        int i = DeviceManager.unlockDeviceById(Config.TEST_DEVICE_ID_W2);
        assertEquals(i, 1);
    }

    @Test
    public void setKeepAliveTimeoutAsMicroSecond() {
    }

    public void testConnection(){

    }

    static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }
}