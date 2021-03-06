/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2DeviceZoneConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2DeviceZoneConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2DeviceZoneConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2DeviceZoneConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNumOfZones(int value) {
    BS_SDK_V2JNI.BS2DeviceZoneConfig_numOfZones_set(swigCPtr, this, value);
  }

  public int getNumOfZones() {
    return BS_SDK_V2JNI.BS2DeviceZoneConfig_numOfZones_get(swigCPtr, this);
  }

  public void setZone(BS2DeviceZone value) {
    BS_SDK_V2JNI.BS2DeviceZoneConfig_zone_set(swigCPtr, this, BS2DeviceZone.getCPtr(value), value);
  }

  public BS2DeviceZone getZone() {
    long cPtr = BS_SDK_V2JNI.BS2DeviceZoneConfig_zone_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2DeviceZone(cPtr, false);
  }

  public BS2DeviceZoneConfig() {
    this(BS_SDK_V2JNI.new_BS2DeviceZoneConfig(), true);
  }

}
