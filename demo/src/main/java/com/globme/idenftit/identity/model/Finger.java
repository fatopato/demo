package com.globme.idenftit.identity.model;

import com.supremainc.SWIGTYPE_p_a_BS2_FINGER_TEMPLATE_SIZE__unsigned_char;
import com.supremainc.SWIGTYPE_p_unsigned_char;

import javax.persistence.Entity;

@Entity
public class Finger {

    private short Index;

    private short Flag;

    private SWIGTYPE_p_unsigned_char Reserved;

    private SWIGTYPE_p_a_BS2_FINGER_TEMPLATE_SIZE__unsigned_char Data;

    public Finger(){

    }

    public short getIndex() {
        return Index;
    }

    public void setIndex(short index) {
        Index = index;
    }

    public short getFlag() {
        return Flag;
    }

    public void setFlag(short flag) {
        Flag = flag;
    }

    public SWIGTYPE_p_unsigned_char getReserved() {
        return Reserved;
    }

    public void setReserved(SWIGTYPE_p_unsigned_char reserved) {
        Reserved = reserved;
    }

    public SWIGTYPE_p_a_BS2_FINGER_TEMPLATE_SIZE__unsigned_char getData() {
        return Data;
    }

    public void setData(SWIGTYPE_p_a_BS2_FINGER_TEMPLATE_SIZE__unsigned_char data) {
        Data = data;
    }
}
