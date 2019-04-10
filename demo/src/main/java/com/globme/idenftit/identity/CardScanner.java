package com.globme.idenftit.identity;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.globme.idenftit.user.UserManager;
import com.globme.idenftit.utils.ContextCreator;
import com.supremainc.BS2Card;
import com.supremainc.BS2UserBlob;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_void;
import org.springframework.stereotype.Repository;

@Repository
public class CardScanner {

    public static SWIGTYPE_p_void context;

    public static BS2Card scanCardById(long deviceId){
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

        BS2Card bs2Card = new BS2Card();
        int scanResponse = BS_SDK_V2.BS2_ScanCard(context, deviceId, bs2Card, null);
        if(BS_SDK_V2.BS_SDK_SUCCESS != scanResponse){
            return null;
        }
        return bs2Card;
    }

    public static void addCardToUserBlob(BS2UserBlob userBlob, BS2Card bs2Card) {
        if (bs2Card != null) {
            short previousNumCard = userBlob.getUser().getNumCards();
            short newNumCard = (short) (previousNumCard + 1);
            userBlob.getUser().setNumCards(newNumCard);
            userBlob.setCardObjs(bs2Card.getCard());
        }
    }

    public static void main(String[] args) {
        CommunicationManager.testConnect();
        BS2Card bs2Card = scanCardById(Config.TEST_DEVICE_ID_W2);
        BS2UserBlob user = UserManager.createUserBlob(2231);
        BS2UserBlob[] userlist = new BS2UserBlob[1];
        userlist[0] = user;
        System.out.println(user.getUser().getNumCards());
        addCardToUserBlob(user, bs2Card);
        System.out.println(user.getUser().getNumCards());
        UserManager.enrollUser(Config.TEST_DEVICE_ID_W2,userlist);
        System.out.println("hi");
        int i1 = BS_SDK_V2.BS2_VerifyUser(context, Config.TEST_DEVICE_ID_W2, 1, 1, user);
        System.out.println(i1);

    }
}
