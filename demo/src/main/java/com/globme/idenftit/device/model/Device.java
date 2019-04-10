package com.globme.idenftit.device.model;

import com.globme.idenftit.common.Config;
import com.globme.idenftit.communication.CommunicationManager;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Device {

    @javax.persistence.Id
    private long Id;

    private int Type; 
    private short ConnectionMode;
    private long Ipv4Address;
    private int Port;
    private long MaxNumOfUser;    
    private short UserNameSupported;
    private short UserPhotoSupported;    
    private short PinSupported;   
    private short CardSupported;
    private short FingerSupported;  
    private short FaceSupported;   
    private short WlanSupported;   
    private short TnaSupported;   
    private short TriggerActionSupported;   
    private short WiegandSupported;    
    private short ImageLogSupported;    
    private short DnsSupported;    
    private short JobCodeSupported;    
    private short WiegandMultiSupported;   
    private short Rs485Mode;
    private short SslSupported;
    private short RootCertExist;
    private short DualIDSupported;   
    private short UseAlphanumericID;
    private long ConnectedIP;    
    private short PhraseSupported;
    private short Card1xSupported;   
    private short SystemExtSupported;    
    private short VoipSupported;
    private short Rs485ExSupported;

    public Device(){

    }

    private boolean isConnected;

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public long getConnectionStartTime() {
        return connectionStartTime;
    }

    public void setConnectionStartTime(long connectionStartTime) {
        this.connectionStartTime = connectionStartTime;
    }

    public long getConnectionEndTime() {
        return connectionEndTime;
    }

    public void setConnectionEndTime(long connectionEndTime) {
        this.connectionEndTime = connectionEndTime;
    }

    private long connectionStartTime;
    private long connectionEndTime;



    /*public int connect(){
        int i = CommunicationManager.connectDeviceById(this.Id);
        if(i == Config.SDK_SUCCESS){
            setConnected(true);
            setConnectionStartTime(System.currentTimeMillis()/Config.MILISECOND_DENUMERATOR);
        }
        return i;
    }

    public int disconnect(){
        int i = CommunicationManager.disconnectDeviceById(this.Id);
        if(i == Config.SDK_SUCCESS){
            setConnected(false);
            setConnectionEndTime(System.currentTimeMillis()/Config.MILISECOND_DENUMERATOR);
        }
        return i;
    }
*/
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public short getConnectionMode() {
        return ConnectionMode;
    }

    public void setConnectionMode(short connectionMode) {
        ConnectionMode = connectionMode;
    }

    public long getIpv4Address() {
        return Ipv4Address;
    }

    public void setIpv4Address(long ipv4Address) {
        Ipv4Address = ipv4Address;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }

    public long getMaxNumOfUser() {
        return MaxNumOfUser;
    }

    public void setMaxNumOfUser(long maxNumOfUser) {
        MaxNumOfUser = maxNumOfUser;
    }

    public short getUserNameSupported() {
        return UserNameSupported;
    }

    public void setUserNameSupported(short userNameSupported) {
        UserNameSupported = userNameSupported;
    }

    public short getUserPhotoSupported() {
        return UserPhotoSupported;
    }

    public void setUserPhotoSupported(short userPhotoSupported) {
        UserPhotoSupported = userPhotoSupported;
    }

    public short getPinSupported() {
        return PinSupported;
    }

    public void setPinSupported(short pinSupported) {
        PinSupported = pinSupported;
    }

    public short getCardSupported() {
        return CardSupported;
    }

    public void setCardSupported(short cardSupported) {
        CardSupported = cardSupported;
    }

    public short getFingerSupported() {
        return FingerSupported;
    }

    public void setFingerSupported(short fingerSupported) {
        FingerSupported = fingerSupported;
    }

    public short getFaceSupported() {
        return FaceSupported;
    }

    public void setFaceSupported(short faceSupported) {
        FaceSupported = faceSupported;
    }

    public short getWlanSupported() {
        return WlanSupported;
    }

    public void setWlanSupported(short wlanSupported) {
        WlanSupported = wlanSupported;
    }

    public short getTnaSupported() {
        return TnaSupported;
    }

    public void setTnaSupported(short tnaSupported) {
        TnaSupported = tnaSupported;
    }

    public short getTriggerActionSupported() {
        return TriggerActionSupported;
    }

    public void setTriggerActionSupported(short triggerActionSupported) {
        TriggerActionSupported = triggerActionSupported;
    }

    public short getWiegandSupported() {
        return WiegandSupported;
    }

    public void setWiegandSupported(short wiegandSupported) {
        WiegandSupported = wiegandSupported;
    }

    public short getImageLogSupported() {
        return ImageLogSupported;
    }

    public void setImageLogSupported(short imageLogSupported) {
        ImageLogSupported = imageLogSupported;
    }

    public short getDnsSupported() {
        return DnsSupported;
    }

    public void setDnsSupported(short dnsSupported) {
        DnsSupported = dnsSupported;
    }

    public short getJobCodeSupported() {
        return JobCodeSupported;
    }

    public void setJobCodeSupported(short jobCodeSupported) {
        JobCodeSupported = jobCodeSupported;
    }

    public short getWiegandMultiSupported() {
        return WiegandMultiSupported;
    }

    public void setWiegandMultiSupported(short wiegandMultiSupported) {
        WiegandMultiSupported = wiegandMultiSupported;
    }

    public short getRs485Mode() {
        return Rs485Mode;
    }

    public void setRs485Mode(short rs485Mode) {
        Rs485Mode = rs485Mode;
    }

    public short getSslSupported() {
        return SslSupported;
    }

    public void setSslSupported(short sslSupported) {
        SslSupported = sslSupported;
    }

    public short getRootCertExist() {
        return RootCertExist;
    }

    public void setRootCertExist(short rootCertExist) {
        RootCertExist = rootCertExist;
    }

    public short getDualIDSupported() {
        return DualIDSupported;
    }

    public void setDualIDSupported(short dualIDSupported) {
        DualIDSupported = dualIDSupported;
    }

    public short getUseAlphanumericID() {
        return UseAlphanumericID;
    }

    public void setUseAlphanumericID(short useAlphanumericID) {
        UseAlphanumericID = useAlphanumericID;
    }

    public long getConnectedIP() {
        return ConnectedIP;
    }

    public void setConnectedIP(long connectedIP) {
        ConnectedIP = connectedIP;
    }

    public short getPhraseSupported() {
        return PhraseSupported;
    }

    public void setPhraseSupported(short phraseSupported) {
        PhraseSupported = phraseSupported;
    }

    public short getCard1xSupported() {
        return Card1xSupported;
    }

    public void setCard1xSupported(short card1xSupported) {
        Card1xSupported = card1xSupported;
    }

    public short getSystemExtSupported() {
        return SystemExtSupported;
    }

    public void setSystemExtSupported(short systemExtSupported) {
        SystemExtSupported = systemExtSupported;
    }

    public short getVoipSupported() {
        return VoipSupported;
    }

    public void setVoipSupported(short voipSupported) {
        VoipSupported = voipSupported;
    }

    public short getRs485ExSupported() {
        return Rs485ExSupported;
    }

    public void setRs485ExSupported(short rs485ExSupported) {
        Rs485ExSupported = rs485ExSupported;
    }

    public short getCardExSupported() {
        return CardExSupported;
    }

    public void setCardExSupported(short cardExSupported) {
        CardExSupported = cardExSupported;
    }

    private short CardExSupported;
}
