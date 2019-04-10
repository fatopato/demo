package com.globme.idenftit.utils.mapper;

import com.globme.idenftit.device.model.Device;
import com.supremainc.BS2SimpleDeviceInfo;

public class DeviceMapper {

    public static Device device;
    public static Device getDevice(BS2SimpleDeviceInfo info){
        Device device = new Device();
        device.setRootCertExist(info.getRootCertExist());
        device.setCard1xSupported(info.getCard1xSupported());
        device.setCardExSupported(info.getCardExSupported());
        device.setCardSupported(info.getCardSupported());
        device.setId(info.getId());
        device.setType(info.getType());
        device.setConnectionMode(info.getConnectionMode());
        device.setPort(info.getPort());
        device.setMaxNumOfUser(info.getMaxNumOfUser());
        device.setUserNameSupported(info.getUserNameSupported());
        device.setUserPhotoSupported(info.getUserPhotoSupported());
        device.setPinSupported(info.getPinSupported());
        device.setFingerSupported(info.getFingerSupported());
        device.setFaceSupported(info.getFaceSupported());
        device.setWlanSupported(info.getWlanSupported());
        device.setTnaSupported(info.getTnaSupported());
        device.setTriggerActionSupported(info.getTriggerActionSupported());
        device.setWiegandSupported(info.getWiegandSupported());
        device.setImageLogSupported(info.getImageLogSupported());
        device.setDnsSupported(info.getDnsSupported());
        device.setJobCodeSupported(info.getJobCodeSupported());
        device.setWiegandMultiSupported(info.getWiegandMultiSupported());
        device.setRs485Mode(info.getRs485Mode());
        device.setSslSupported(info.getSslSupported());
        device.setRootCertExist(info.getRootCertExist());
        device.setDualIDSupported(info.getDualIDSupported());
        device.setUseAlphanumericID(info.getUseAlphanumericID());
        device.setConnectedIP(info.getConnectedIP());
        device.setPhraseSupported(info.getPhraseSupported());
        device.setSystemExtSupported(info.getSystemExtSupported());
        device.setVoipSupported(info.getVoipSupported());
        return device;
         }

}
