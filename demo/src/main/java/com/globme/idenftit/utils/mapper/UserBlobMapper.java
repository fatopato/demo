package com.globme.idenftit.utils.mapper;

import com.globme.idenftit.user.model.UserBlob;
import com.supremainc.BS2UserBlob;

public class UserBlobMapper {

    public static UserBlob userBlob;

    public static UserBlob getUserBlob(BS2UserBlob bs2UserBlob){

        UserBlob userBlob = new UserBlob();
        userBlob.setUser(bs2UserBlob.getUser());
        userBlob.setSetting(bs2UserBlob.getSetting());
        userBlob.setUser_name(bs2UserBlob.getUser_name());
        userBlob.setUser_photo(bs2UserBlob.getUser_photo());
        userBlob.setPin(bs2UserBlob.getPin());
        userBlob.setCardObjs(bs2UserBlob.getCardObjs());
        userBlob.setFingerObjs(bs2UserBlob.getFingerObjs());
        userBlob.setFaceObjs(bs2UserBlob.getFaceObjs());
        userBlob.setAccessGroupId(bs2UserBlob.getAccessGroupId());
        return userBlob;
    }
}
