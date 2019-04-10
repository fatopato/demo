package com.globme.idenftit.utils;

import com.globme.idenftit.common.DeviceSdkListener;
import com.globme.idenftit.exceptions.ContextCanNotInitializedException;
import com.globme.idenftit.exceptions.ContextIsNotInitializedException;
import com.globme.idenftit.utils.model.Event;
import com.supremainc.BS2Event;
import com.supremainc.BS_SDK_V2;
import com.supremainc.SWIGTYPE_p_void;

import java.util.ArrayList;
import java.util.Comparator;

import static com.globme.idenftit.utils.mapper.EventMapper.getEvent;

public class LogManager {

    public static SWIGTYPE_p_void context;
    public static int startMonitoringLogById(long deviceId){
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
        Driver.setter();
        DeviceSdkListener sdkListener = new DeviceSdkListener(context);

        return BS_SDK_V2.BS2_StartMonitoringLog(context,deviceId,sdkListener);
    }
    public static ArrayList<Event> getEventsById(long deviceId){
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
        Driver.setter();

        BS2Event[] bs2Events = new BS2Event[1000];
        ArrayList<Event> eventList= new ArrayList<>();

        BS_SDK_V2.BS2_GetLog(context,deviceId,0,bs2Events.length,bs2Events);
        for(BS2Event e : bs2Events) {
            if(e != null){
                eventList.add(getEvent(e));
            }
        }
        eventList.sort(Comparator.comparing(Event::getDateTime).reversed());
        return eventList;
    }
    public static int stopMonitoringLogById(long deviceId){
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
        return BS_SDK_V2.BS2_StopMonitoringLog(context,deviceId);
    }

}
