package com.globme.idenftit.utils.mapper;

import com.globme.idenftit.utils.model.Event;
import com.supremainc.BS2Event;

public class EventMapper {
    Event event;

    public static Event getEvent(BS2Event bs2Event){
        Event event = new Event();
        event.setId(bs2Event.getId());
        event.setDateTime(bs2Event.getDateTime());
        event.setDeviceID(bs2Event.getDeviceID());
        event.setUserID(bs2Event.getUserID());
        event.setUid(bs2Event.getUid());
        event.setDoorID(bs2Event.getDoorID());
        event.setLiftID(bs2Event.getLiftID());
        event.setZoneID(bs2Event.getZoneID());
        event.setIoDeviceID(bs2Event.getIoDeviceID());
        event.setPort(bs2Event.getPort());
        event.setValue(bs2Event.getValue());
        event.setReserved(bs2Event.getReserved());
        event.setCode(bs2Event.getCode());
        event.setSubCode(bs2Event.getSubCode());
        event.setMainCode(bs2Event.getMainCode());
        event.setParam(bs2Event.getParam());
        event.setImage(bs2Event.getImage());
        event.setIsDST(bs2Event.getIsDST());
        event.setHalf(bs2Event.getHalf());
        event.setHour(bs2Event.getHour());
        event.setNegative(bs2Event.getNegative());
        return event;
    }

}
