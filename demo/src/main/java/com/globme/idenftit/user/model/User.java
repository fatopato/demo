package com.globme.idenftit.user.model;

import com.supremainc.SWIGTYPE_p_unsigned_char;

public class User {

    private String UserID;
    private short FormatVersion;
    private short Flag;
    private int Version;
    private short NumCards;
    private short NumFingers;
    private short NumFaces;
    private SWIGTYPE_p_unsigned_char Reserved2;
    private long AuthGroupID;
    private long FaceChecksum;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public short getFormatVersion() {
        return FormatVersion;
    }

    public void setFormatVersion(short formatVersion) {
        FormatVersion = formatVersion;
    }

    public short getFlag() {
        return Flag;
    }

    public void setFlag(short flag) {
        Flag = flag;
    }

    public int getVersion() {
        return Version;
    }

    public void setVersion(int version) {
        Version = version;
    }

    public short getNumCards() {
        return NumCards;
    }

    public void setNumCards(short numCards) {
        NumCards = numCards;
    }

    public short getNumFingers() {
        return NumFingers;
    }

    public void setNumFingers(short numFingers) {
        NumFingers = numFingers;
    }

    public short getNumFaces() {
        return NumFaces;
    }

    public void setNumFaces(short numFaces) {
        NumFaces = numFaces;
    }

    public SWIGTYPE_p_unsigned_char getReserved2() {
        return Reserved2;
    }

    public void setReserved2(SWIGTYPE_p_unsigned_char reserved2) {
        Reserved2 = reserved2;
    }

    public long getAuthGroupID() {
        return AuthGroupID;
    }

    public void setAuthGroupID(long authGroupID) {
        AuthGroupID = authGroupID;
    }

    public long getFaceChecksum() {
        return FaceChecksum;
    }

    public void setFaceChecksum(long faceChecksum) {
        FaceChecksum = faceChecksum;
    }
}
