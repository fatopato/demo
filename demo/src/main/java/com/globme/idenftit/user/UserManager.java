package com.globme.idenftit.user;

import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.globme.idenftit.utils.ContextCreator;
import com.supremainc.BS2User;
import com.supremainc.BS2UserBlob;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_void;

public class UserManager {
    public static SWIGTYPE_p_void context ;

    public static int enrollUser(long deviceId, BS2UserBlob[] userBlobs){
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context = contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }

        int returnCode = BS_SDK_V2.BS2_EnrolUser(context, deviceId, userBlobs, (short) 1);

        return returnCode;
    }

    public static int removeUserById(long deviceId, String userId){
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context = contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        String[] userList = new String[1];
        userList[0] = userId;
        return BS_SDK_V2.BS2_RemoveUser(context,deviceId,userList);
    }

    public static int removeAllUsers(long deviceId){
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context = contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        return BS_SDK_V2.BS2_RemoveAllUser(context,deviceId);
    }

    public static BS2UserBlob getUserInfoByUserId(long deviceId, String userId){
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context = contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        BS2UserBlob bs2UserBlob = new BS2UserBlob();
        String[] userList = new String[1];
        userList[0] = userId;
        BS_SDK_V2.BS2_GetUserInfos(context,deviceId,userList,bs2UserBlob);
        return bs2UserBlob;
    }

    public static BS2UserBlob getUserDataByUserId(long deviceId, String userId){
        ContextCreator contextCreator = ContextCreator.getInstance();
        try {
            contextCreator.initializeContext();
        } catch (ContextCanNotInitializedException e) {
            e.printStackTrace();
        }
        try {
            context = contextCreator.getContext();
        } catch (ContextIsNotInitializedException e) {
            e.printStackTrace();
        }
        BS2UserBlob bs2UserBlob = new BS2UserBlob();
        String[] userList = new String[1];
        userList[0] = userId;
        BS_SDK_V2.BS2_GetUserDatas(context,deviceId,userList,bs2UserBlob, BS_SDK_V2.BS2_USER_MASK_ALL);
        return bs2UserBlob;
    }

    public static BS2UserBlob createUserBlob(int userId){
        BS2User user = BS_SDK_V2.new_BS2UserHandler();
        String userid = Integer.toString(userId);
        user.setUserID(userid);
        user.setAuthGroupID(0);
        user.setNumCards((short) 0);
        user.setNumFaces((short) 0);
        user.setNumFingers((short) 0);
        user.setFlag((short) 0);
        user.setFormatVersion((short) 0);
        BS2UserBlob userBlob = BS_SDK_V2.new_BS2UserBlobHandler();
        userBlob.setUser(user);
        System.out.println(user.getFlag());
        return userBlob;
    }


    static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }
}
