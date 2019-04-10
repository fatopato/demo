package com.suprema.idenfit.demo.device;

import com.globme.idenftit.communication.CommunicationManager;
import com.globme.idenftit.device.DeviceManager;
import com.globme.idenftit.device.model.Device;
import com.globme.idenftit.identity.CardScanner;
import com.globme.idenftit.identity.FaceScanner;
import com.globme.idenftit.identity.FingerScanner;
import com.supremainc.BS2Card;
import com.supremainc.BS2Face;
import com.supremainc.BS2Fingerprint;
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

    public int searchDevice(){
        return communicationManager.searchDevices();
    }
    public List<Device> getAllDevices(){
        return deviceManager.getDeviceList();
    }
    public int connectDeviceById(long deviceId){
        return communicationManager.connectDeviceById(deviceId);
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
}
