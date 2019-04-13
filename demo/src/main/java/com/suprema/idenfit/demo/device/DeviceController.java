package com.suprema.idenfit.demo.device;

import com.globme.idenftit.device.model.Device;
import com.sun.deploy.net.HttpResponse;
import com.supremainc.BS2Card;
import com.supremainc.BS2Face;
import com.supremainc.BS2Fingerprint;
import com.supremainc.BS2UserBlob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.List;

@RestController
public class DeviceController {

    public BS2Face bs2Face;
    public BS2UserBlob bs2UserBlob;

    @Autowired
    private DeviceService deviceService;

    @RequestMapping("/")
    public int searchDevices(){
        return deviceService.searchDevice();
    }

    /*@RequestMapping("/devices")
    public List<Device> getAllDevices(){
        deviceService.searchDevice();
        return deviceService.getAllDevices();
    }*/

    /*@RequestMapping("/")
    public String HomeControl(){
        return "Hello World";
    }*/

    @RequestMapping("/devices")
    public List<Long> getDeviceIds(){
        return deviceService.getDeviceIds();
    }

    @RequestMapping(value = "/devices/{deviceId}")
    public Device connectDeviceById(@PathVariable long deviceId){
        return deviceService.getDeviceInfoById(deviceId);
    }

    @RequestMapping(value = "/devices/{deviceId}", params = {"command"})
    public int unlocDeviceById(@PathVariable long deviceId, @RequestParam(required = false,name = "command") String command){
        switch (command){
            case "reboot":return deviceService.rebootDeviceById(deviceId);
            case "connect":return deviceService.connectDeviceById(deviceId);
            case "disconnect":return deviceService.disconnectDeviceById(deviceId);
            case "lock": return deviceService.lockDeviceById(deviceId);
            case "unlock": return deviceService.unlockDeviceById(deviceId);
            case "factoryReset": return deviceService.factoryResetById(deviceId);
            case "clearDatabase": return deviceService.clearDatabaseById(deviceId);
            default:return 0;
        }
    }
    @RequestMapping(value = "/devices/{deviceId}", params = {"userCommand"})
    public String userActions(@PathVariable long deviceId, @RequestParam(required = false,name = "userCommand") String userCommand, HttpServletResponse httpServletResponse){
        switch (userCommand){
            case "getUsers": return "Users: ";
            case "newUser": {
                try {
                    httpServletResponse.sendRedirect("/devices/"+deviceId+"/createUserPage");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return "redirect:devices";
            }
            default: return "Unknown command";
        }
    }
    @RequestMapping(value = "/devices/{deviceId}/createUserPage")
    public String newUserAction(@PathVariable long deviceId){
        return "New user method at: "+deviceId;
    }

    @RequestMapping(value = "/newUser", params = {"command","userId","deviceId"})
    public void createUser (@RequestParam(required = false, name = "command")String command,@RequestParam(required = false, name = "userId")int userId,
                            @RequestParam(required = false,name = "deviceId")long deviceId){
        switch (command){
            case "createUser": bs2UserBlob = deviceService.createUser(userId);
            break;
            case "scanFace": bs2Face = deviceService.scanFaceById(deviceId);
            break;
            case "addFaceToUser": deviceService.addFaceToUser(bs2Face,bs2UserBlob);
            break;
            case "test":
                System.out.println("Test");
        }
    }
    @RequestMapping(value = "/newUser", params = {"action", "deviceId"})
    public int enrollUserToDeviceById(@RequestParam(required = false,name = "action")String action,
                                      @RequestParam(required = false,name = "deviceId")long deviceId){
        switch (action){
            case "enrollUser": return deviceService.enrollUserById(bs2UserBlob,deviceId);
            default:return 0;
        }
    }



    /*@RequestMapping("devices/{deviceId}/commands")
    public String rebootDeviceById(@PathVariable long deviceId, @RequestParam(required = false,name = "command") String command){
        switch (command){
            case "reboot":return deviceService.rebootDeviceById(deviceId);

        }
        return null;
    }*/

    @RequestMapping("/devices/{deviceId}/finger")
    public BS2Fingerprint scanFingerById(@PathVariable long deviceId){
        return deviceService.scanFingerById(deviceId);
    }

    @RequestMapping("/devices/{deviceId}/face")
    public BS2Face scanFaceById(@PathVariable long deviceId){
        return deviceService.scanFaceById(deviceId);
    }

    @RequestMapping("/devices/{deviceId}/card")
    public String scanCardById(@PathVariable long deviceId){
        return deviceService.scanCardById(deviceId).toString();
    }

}
