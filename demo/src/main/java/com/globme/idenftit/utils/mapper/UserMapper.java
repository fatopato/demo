package com.globme.idenftit.utils.mapper;

import com.globme.idenftit.user.model.User;
import com.supremainc.BS2User;

public class UserMapper {

    public static User user;
    public static User getUser(BS2User bs2User){
        User user = new User();
        user.setUserID(bs2User.getUserID());
        user.setFormatVersion(bs2User.getFormatVersion());
        user.setFlag(bs2User.getFlag());
        user.setVersion(bs2User.getVersion());
        user.setNumCards(bs2User.getNumCards());
        user.setNumFingers(bs2User.getNumFingers());
        user.setNumFaces(bs2User.getNumFaces());
        user.setReserved2(bs2User.getReserved2());
        user.setAuthGroupID(bs2User.getAuthGroupID());
        user.setFaceChecksum(bs2User.getFaceChecksum());
        return user;
    }
}
