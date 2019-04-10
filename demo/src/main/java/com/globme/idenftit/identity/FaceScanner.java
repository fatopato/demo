package com.globme.idenftit.identity;

import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.globme.idenftit.utils.ContextCreator;
import com.supremainc.BS2Face;
import com.supremainc.BS2UserBlob;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_void;
import org.springframework.stereotype.Repository;

@Repository
public class FaceScanner {
    public static SWIGTYPE_p_void context;
    public static BS2Face scanFaceById(long deviceId){
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
        BS2Face bs2Face = new BS2Face();
        int i = BS_SDK_V2.BS2_ScanFace(context, deviceId, bs2Face, (short) 0, null);
        System.out.println(i);
        System.out.println("num of template: "+bs2Face.getNumOfTemplate());
        return bs2Face;
    }
    public static void addFaceToUserBlob(BS2UserBlob userBlob, BS2Face bs2Face){
        if(bs2Face != null){
        short previousNumFace = userBlob.getUser().getNumFaces();
        short newNumFace = (short)(previousNumFace + 1);
        userBlob.getUser().setNumFaces(newNumFace);
        userBlob.setFaceObjs(bs2Face);
        }
    }
}
