/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2LiftAlarm {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2LiftAlarm(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2LiftAlarm obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2LiftAlarm(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSensor(BS2LiftSensor value) {
    BS_SDK_V2JNI.BS2LiftAlarm_sensor_set(swigCPtr, this, BS2LiftSensor.getCPtr(value), value);
  }

  public BS2LiftSensor getSensor() {
    long cPtr = BS_SDK_V2JNI.BS2LiftAlarm_sensor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2LiftSensor(cPtr, false);
  }

  public void setAction(BS2Action value) {
    BS_SDK_V2JNI.BS2LiftAlarm_action_set(swigCPtr, this, BS2Action.getCPtr(value), value);
  }

  public BS2Action getAction() {
    long cPtr = BS_SDK_V2JNI.BS2LiftAlarm_action_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2Action(cPtr, false);
  }

  public BS2LiftAlarm() {
    this(BS_SDK_V2JNI.new_BS2LiftAlarm(), true);
  }

}