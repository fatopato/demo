package com.globme.idenftit.utils.mapper;

import com.globme.idenftit.identity.model.Finger;
import com.supremainc.BS2Fingerprint;

public class FingerMapper {

    public Finger finger;
    public Finger getFinger(BS2Fingerprint bs2Fingerprint){

        finger = new Finger();
        finger.setIndex(bs2Fingerprint.getIndex());
        finger.setFlag(bs2Fingerprint.getFlag());
        finger.setReserved(bs2Fingerprint.getReserved());
        finger.setData(bs2Fingerprint.getData());
        return finger;
    }
}
