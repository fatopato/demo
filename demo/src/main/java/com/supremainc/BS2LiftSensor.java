/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2LiftSensor {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2LiftSensor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2LiftSensor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2LiftSensor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDeviceID(long value) {
    BS_SDK_V2JNI.BS2LiftSensor_deviceID_set(swigCPtr, this, value);
  }

  public long getDeviceID() {
    return BS_SDK_V2JNI.BS2LiftSensor_deviceID_get(swigCPtr, this);
  }

  public void setPort(short value) {
    BS_SDK_V2JNI.BS2LiftSensor_port_set(swigCPtr, this, value);
  }

  public short getPort() {
    return BS_SDK_V2JNI.BS2LiftSensor_port_get(swigCPtr, this);
  }

  public void setSwitchType(short value) {
    BS_SDK_V2JNI.BS2LiftSensor_switchType_set(swigCPtr, this, value);
  }

  public short getSwitchType() {
    return BS_SDK_V2JNI.BS2LiftSensor_switchType_get(swigCPtr, this);
  }

  public void setDuration(int value) {
    BS_SDK_V2JNI.BS2LiftSensor_duration_set(swigCPtr, this, value);
  }

  public int getDuration() {
    return BS_SDK_V2JNI.BS2LiftSensor_duration_get(swigCPtr, this);
  }

  public void setScheduleID(long value) {
    BS_SDK_V2JNI.BS2LiftSensor_scheduleID_set(swigCPtr, this, value);
  }

  public long getScheduleID() {
    return BS_SDK_V2JNI.BS2LiftSensor_scheduleID_get(swigCPtr, this);
  }

  public BS2LiftSensor() {
    this(BS_SDK_V2JNI.new_BS2LiftSensor(), true);
  }

}
