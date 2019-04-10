package com.globme.idenftit.utils;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.utils.LogManager;
import com.globme.idenftit.utils.model.Event;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LogManagerTest {

    @Before
    public void beforeLog(){
        CommunicationManager.searchDevices();
        CommunicationManager.connectDeviceById(Config.TEST_DEVICE_ID_W2);
    }
    @Test
    public void startMonitoringLogById() {
        assertEquals(1, LogManager.startMonitoringLogById(Config.TEST_DEVICE_ID_W2));
    }

    @Test
    public void getEventsById() {
        ArrayList<Event> eventsById = LogManager.getEventsById(Config.TEST_DEVICE_ID_W2);
        System.out.println(eventsById.size());
        assertNotEquals(0,eventsById.size());
    }

    @Test
    public void stopMonitoringLogById() {
        assertEquals(1, LogManager.stopMonitoringLogById(Config.TEST_DEVICE_ID_W2));
    }
}