package com.globme.idenftit.utils;

import com.globme.idenftit.utils.SdkManager;
import com.supremainc.SWIGTYPE_p_void;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SdkManagerTest {

    @Test
    public void getVersion() {
        assertEquals("2.6.2.0", SdkManager.getVersion().trim());
    }

    @Test
    public void allocateContext() {
        SWIGTYPE_p_void context = null;
        context = SdkManager.allocateContext();
        assertNotNull(context);
    }

    @Test
    public void releaseContext() {

    }

    @Test
    public void initialize() {
        SWIGTYPE_p_void context = SdkManager.allocateContext();
        assertEquals(1, SdkManager.initialize());
    }

    @Test
    public void releaseObject() {
    }

    @Test
    public void makePinCode() {
    }
}