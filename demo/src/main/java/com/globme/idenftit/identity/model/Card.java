package com.globme.idenftit.identity.model;

import com.supremainc.SWIGTYPE_p_unsigned_char;

public class Card {

    private short Type;

    private short Size;

    private SWIGTYPE_p_unsigned_char Data;

    public Card(){

    }

    @Override
    public String toString() {
        return "Card{" +
                "Type=" + Type +
                ", Size=" + Size +
                ", Data=" + Data +
                '}';
    }

    public short getType() {
        return Type;
    }

    public void setType(short type) {
        Type = type;
    }

    public short getSize() {
        return Size;
    }

    public void setSize(short size) {
        Size = size;
    }

    public SWIGTYPE_p_unsigned_char getData() {
        return Data;
    }

    public void setData(SWIGTYPE_p_unsigned_char data) {
        Data = data;
    }
}
