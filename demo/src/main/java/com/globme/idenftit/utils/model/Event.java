package com.globme.idenftit.utils.model;

import com.supremainc.SWIGTYPE_p_unsigned_char;

public class Event {
    private long Id;
    private long DateTime;
    private long DeviceID;
    private String UserID;
    private long Uid;
    private long DoorID;
    private long LiftID;
    private long ZoneID;
    private long IoDeviceID;
    private int Port;
    private byte Value;
    private SWIGTYPE_p_unsigned_char Reserved;
    private int Code;
    private short SubCode;
    private short MainCode;
    private short Param;
    private short Image;
    private short IsDST;
    private short Half;
    private short Hour;
    private short Negative;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getDateTime() {
        return DateTime;
    }

    public void setDateTime(long dateTime) {
        DateTime = dateTime;
    }

    public long getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(long deviceID) {
        DeviceID = deviceID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public long getUid() {
        return Uid;
    }

    public void setUid(long uid) {
        Uid = uid;
    }

    public long getDoorID() {
        return DoorID;
    }

    public void setDoorID(long doorID) {
        DoorID = doorID;
    }

    public long getLiftID() {
        return LiftID;
    }

    public void setLiftID(long liftID) {
        LiftID = liftID;
    }

    public long getZoneID() {
        return ZoneID;
    }

    public void setZoneID(long zoneID) {
        ZoneID = zoneID;
    }

    public long getIoDeviceID() {
        return IoDeviceID;
    }

    public void setIoDeviceID(long ioDeviceID) {
        IoDeviceID = ioDeviceID;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }

    public byte getValue() {
        return Value;
    }

    public void setValue(byte value) {
        Value = value;
    }

    public SWIGTYPE_p_unsigned_char getReserved() {
        return Reserved;
    }

    public void setReserved(SWIGTYPE_p_unsigned_char reserved) {
        Reserved = reserved;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public short getSubCode() {
        return SubCode;
    }

    public void setSubCode(short subCode) {
        SubCode = subCode;
    }

    public short getMainCode() {
        return MainCode;
    }

    public void setMainCode(short mainCode) {
        MainCode = mainCode;
    }

    public short getParam() {
        return Param;
    }

    public void setParam(short param) {
        Param = param;
    }

    public short getImage() {
        return Image;
    }

    public void setImage(short image) {
        Image = image;
    }

    public short getIsDST() {
        return IsDST;
    }

    public void setIsDST(short isDST) {
        IsDST = isDST;
    }

    public short getHalf() {
        return Half;
    }

    public void setHalf(short half) {
        Half = half;
    }

    public short getHour() {
        return Hour;
    }

    public void setHour(short hour) {
        Hour = hour;
    }

    public short getNegative() {
        return Negative;
    }

    public void setNegative(short negative) {
        Negative = negative;
    }
}
