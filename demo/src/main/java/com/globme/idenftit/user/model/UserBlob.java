package com.globme.idenftit.user.model;

import com.supremainc.*;

public class UserBlob {
    private BS2User User;
    private BS2UserSetting Setting;
    private short[] User_name;
    private BS2UserPhoto User_photo;
    private short[] Pin;
    private BS2CSNCard CardObjs;
    private BS2Fingerprint FingerObjs;
    private BS2Face FaceObjs;
    private long[] AccessGroupId;

    public BS2User getUser() {
        return User;
    }

    public void setUser(BS2User user) {
        User = user;
    }

    public BS2UserSetting getSetting() {
        return Setting;
    }

    public void setSetting(BS2UserSetting setting) {
        Setting = setting;
    }

    public short[] getUser_name() {
        return User_name;
    }

    public void setUser_name(short[] user_name) {
        User_name = user_name;
    }

    public BS2UserPhoto getUser_photo() {
        return User_photo;
    }

    public void setUser_photo(BS2UserPhoto user_photo) {
        User_photo = user_photo;
    }

    public short[] getPin() {
        return Pin;
    }

    public void setPin(short[] pin) {
        Pin = pin;
    }

    public BS2CSNCard getCardObjs() {
        return CardObjs;
    }

    public void setCardObjs(BS2CSNCard cardObjs) {
        CardObjs = cardObjs;
    }

    public BS2Fingerprint getFingerObjs() {
        return FingerObjs;
    }

    public void setFingerObjs(BS2Fingerprint fingerObjs) {
        FingerObjs = fingerObjs;
    }

    public BS2Face getFaceObjs() {
        return FaceObjs;
    }

    public void setFaceObjs(BS2Face faceObjs) {
        FaceObjs = faceObjs;
    }

    public long[] getAccessGroupId() {
        return AccessGroupId;
    }

    public void setAccessGroupId(long[] accessGroupId) {
        AccessGroupId = accessGroupId;
    }
}
