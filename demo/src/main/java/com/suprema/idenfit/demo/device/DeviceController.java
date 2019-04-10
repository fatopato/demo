package com.suprema.idenfit.demo.device;

import com.globme.idenftit.device.model.Device;
import com.supremainc.BS2Card;
import com.supremainc.BS2Face;
import com.supremainc.BS2Fingerprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceController {


    @Autowired
    private DeviceService deviceService;

    @RequestMapping("")
    public int searchDevices(){
        return deviceService.searchDevice();
    }

    @RequestMapping("/devices")
    public List<Device> getAllDevices(){
        deviceService.searchDevice();
        return deviceService.getAllDevices();
    }

    @RequestMapping("/devices/{deviceId}")
    public int connectDeviceById(@PathVariable long deviceId){
        return deviceService.connectDeviceById(deviceId);
    }

    @RequestMapping("/devices/{deviceId}/finger")
    public BS2Fingerprint scanFingerById(@PathVariable long deviceId){
        return deviceService.scanFingerById(deviceId);
    }

    @RequestMapping("/devices/{deviceId}/face")
    public BS2Face scanFaceById(@PathVariable long deviceId){
        return deviceService.scanFaceById(deviceId);
    }

    @RequestMapping("/devices/{deviceId}/card")
    public BS2Card scanCardById(@PathVariable long deviceId){
        return deviceService.scanCardById(deviceId);
    }

}
