/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2Rs485SlaveDeviceSetting {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2Rs485SlaveDeviceSetting(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2Rs485SlaveDeviceSetting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2Rs485SlaveDeviceSetting(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDeviceID(long value) {
    BS_SDK_V2JNI.BS2Rs485SlaveDeviceSetting_deviceID_set(swigCPtr, this, value);
  }

  public long getDeviceID() {
    return BS_SDK_V2JNI.BS2Rs485SlaveDeviceSetting_deviceID_get(swigCPtr, this);
  }

  public void setDeviceType(int value) {
    BS_SDK_V2JNI.BS2Rs485SlaveDeviceSetting_deviceType_set(swigCPtr, this, value);
  }

  public int getDeviceType() {
    return BS_SDK_V2JNI.BS2Rs485SlaveDeviceSetting_deviceType_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2Rs485SlaveDeviceSetting_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2Rs485SlaveDeviceSetting_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2Rs485SlaveDeviceSetting() {
    this(BS_SDK_V2JNI.new_BS2Rs485SlaveDeviceSetting(), true);
  }

}
