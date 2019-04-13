package com.globme.idenftit.utils.mapper;

import com.globme.idenftit.identity.model.Face;
import com.supremainc.BS2Face;

public class FaceMapper {

    public Face face;

    public Face getFace(BS2Face bs2Face) {

        face = new Face();
        face.setFaceIndex(bs2Face.getFaceIndex());
        face.setNumOfTemplate(bs2Face.getNumOfTemplate());
        face.setFlag(bs2Face.getFlag());
        face.setReserved(bs2Face.getReserved());
        face.setImageLen(bs2Face.getImageLen());
        face.setReserved2(bs2Face.getReserved2());
        face.setImageData(bs2Face.getImageData());
        face.setTemplateData(bs2Face.getTemplateData());
        return face;
    }
}
