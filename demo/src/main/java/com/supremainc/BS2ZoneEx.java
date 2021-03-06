/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2ZoneEx {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2ZoneEx(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2ZoneEx obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2ZoneEx(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setZoneId(int value) {
    BS_SDK_V2JNI.BS2ZoneEx_zoneId_set(swigCPtr, this, value);
  }

  public int getZoneId() {
    return BS_SDK_V2JNI.BS2ZoneEx_zoneId_get(swigCPtr, this);
  }

  public void setZoneType(int value) {
    BS_SDK_V2JNI.BS2ZoneEx_zoneType_set(swigCPtr, this, value);
  }

  public int getZoneType() {
    return BS_SDK_V2JNI.BS2ZoneEx_zoneType_get(swigCPtr, this);
  }

  public void setApbProperty(BS2APBZoneProperty value) {
    BS_SDK_V2JNI.BS2ZoneEx_apbProperty_set(swigCPtr, this, BS2APBZoneProperty.getCPtr(value), value);
  }

  public BS2APBZoneProperty getApbProperty() {
    long cPtr = BS_SDK_V2JNI.BS2ZoneEx_apbProperty_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2APBZoneProperty(cPtr, false);
  }

  public void setFireAlarmProperty(BS2FireAlarmZoneProperty value) {
    BS_SDK_V2JNI.BS2ZoneEx_fireAlarmProperty_set(swigCPtr, this, BS2FireAlarmZoneProperty.getCPtr(value), value);
  }

  public BS2FireAlarmZoneProperty getFireAlarmProperty() {
    long cPtr = BS_SDK_V2JNI.BS2ZoneEx_fireAlarmProperty_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2FireAlarmZoneProperty(cPtr, false);
  }

  public BS2ZoneEx() {
    this(BS_SDK_V2JNI.new_BS2ZoneEx(), true);
  }

}
