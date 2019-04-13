package com.suprema.idenfit.demo.device;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.device.DeviceManager;
import com.globme.idenftit.device.model.Device;
import com.globme.idenftit.identity.CardScanner;
import com.globme.idenftit.identity.FaceScanner;
import com.globme.idenftit.identity.FingerScanner;
import com.globme.idenftit.identity.model.Card;
import com.globme.idenftit.user.UserManager;
import com.globme.idenftit.utils.mapper.CardMapper;
import com.supremainc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    //@Autowired
    //private DeviceRepository deviceRepository;

    private CommunicationManager communicationManager;

    private DeviceManager deviceManager;

    private FingerScanner fingerScanner;

    private CardScanner cardScanner;

    private FaceScanner faceScanner;

    private CardMapper cardMapper;

    private UserManager userManager;


    public int searchDevice(){
        return communicationManager.searchDevices();
    }
    public List<Long> getDeviceIds(){
        return communicationManager.getDeviceIds();
    }
    public int unlockDeviceById(long deviceId){
        return deviceManager.unlockDeviceById(deviceId);
    }
    public int lockDeviceById(long deviceId){
        return deviceManager.lockDeviceById(deviceId);
    }
    public int factoryResetById(long deviceId){
        return deviceManager.factoryResetById(deviceId);
    }
    public int clearDatabaseById(long devceId){
        return deviceManager.clearDatabaseById(devceId);
    }
    public int setDeviceTimeById(long deviceId, long timestamp){
        return deviceManager.setDeviceTime(deviceId, timestamp);
    }
    public BS2SimpleDeviceInfo getBs2DeviceInfoById(long deviceId){
        return deviceManager.getBs2DeviceInfoById(deviceId);
    }
    public Device getDeviceInfoById(long deviceId){
        return deviceManager.getDeviceInfoById(deviceId);
    }
    public List<Device> getAllDevices(){
        return deviceManager.getDeviceList();
    }
    public int connectDeviceById(long deviceId){
        return communicationManager.connectDeviceById(deviceId);
    }
    public int disconnectDeviceById(long deviceId){
        return communicationManager.disconnectDeviceById(deviceId);
    }
    public BS2Fingerprint scanFingerById(long deviceId){
        return fingerScanner.scanFinger(deviceId);
    }
    public BS2Card scanCardById(long deviceId){
        return cardScanner.scanCardById(deviceId);
    }
    public BS2Face scanFaceById(long deviceId){
        return faceScanner.scanFaceById(deviceId);
    }
    public int rebootDeviceById(long deviceId){
        return deviceManager.rebootDeviceById(deviceId);
    }
    public String getCardDataById(long deviceId){return cardMapper.getCard(cardScanner.scanCardById(deviceId).getCard()).toString();
    }
    public BS2UserBlob createUser(int userId){return userManager.createUserBlob(userId);}
    public void addFaceToUser(BS2Face bs2Face, BS2UserBlob bs2UserBlob){
        faceScanner.addFaceToUserBlob(bs2UserBlob,bs2Face);
    }
    public int enrollUserById(BS2UserBlob bs2UserBlob, long deviceId){
        BS2UserBlob[] userBlobs = new BS2UserBlob[1];
        userBlobs[0] = bs2UserBlob;
        return userManager.enrollUser(deviceId,userBlobs) ;
    }
}
