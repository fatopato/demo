package com.globme.idenftit.identity.model;

import com.supremainc.SWIGTYPE_p_a_BS2_FACE_TEMPLATE_LENGTH__unsigned_char;
import com.supremainc.SWIGTYPE_p_unsigned_char;

import javax.persistence.Entity;

@Entity
public class Face {

    private short FaceIndex;

    private short NumOfTemplate;

    private short Flag;

    private short Reserved;

    private int ImageLen;

    private SWIGTYPE_p_unsigned_char Reserved2;

    private SWIGTYPE_p_unsigned_char ImageData;

    private SWIGTYPE_p_a_BS2_FACE_TEMPLATE_LENGTH__unsigned_char TemplateData;

    @Override
    public String toString() {
        return "Face{" +
                "FaceIndex=" + FaceIndex +
                ", NumOfTemplate=" + NumOfTemplate +
                ", Flag=" + Flag +
                ", Reserved=" + Reserved +
                ", ImageLen=" + ImageLen +
                ", Reserved2=" + Reserved2 +
                ", ImageData=" + ImageData +
                ", TemplateData=" + TemplateData +
                '}';
    }

    public Face(){

    }

    public short getFaceIndex() {
        return FaceIndex;
    }

    public void setFaceIndex(short faceIndex) {
        FaceIndex = faceIndex;
    }

    public short getNumOfTemplate() {
        return NumOfTemplate;
    }

    public void setNumOfTemplate(short numOfTemplate) {
        NumOfTemplate = numOfTemplate;
    }

    public short getFlag() {
        return Flag;
    }

    public void setFlag(short flag) {
        Flag = flag;
    }

    public short getReserved() {
        return Reserved;
    }

    public void setReserved(short reserved) {
        Reserved = reserved;
    }

    public int getImageLen() {
        return ImageLen;
    }

    public void setImageLen(int imageLen) {
        ImageLen = imageLen;
    }

    public SWIGTYPE_p_unsigned_char getReserved2() {
        return Reserved2;
    }

    public void setReserved2(SWIGTYPE_p_unsigned_char reserved2) {
        Reserved2 = reserved2;
    }

    public SWIGTYPE_p_unsigned_char getImageData() {
        return ImageData;
    }

    public void setImageData(SWIGTYPE_p_unsigned_char imageData) {
        ImageData = imageData;
    }

    public SWIGTYPE_p_a_BS2_FACE_TEMPLATE_LENGTH__unsigned_char getTemplateData() {
        return TemplateData;
    }

    public void setTemplateData(SWIGTYPE_p_a_BS2_FACE_TEMPLATE_LENGTH__unsigned_char templateData) {
        TemplateData = templateData;
    }
}
