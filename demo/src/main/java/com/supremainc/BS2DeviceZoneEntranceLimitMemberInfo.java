/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2DeviceZoneEntranceLimitMemberInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2DeviceZoneEntranceLimitMemberInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2DeviceZoneEntranceLimitMemberInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2DeviceZoneEntranceLimitMemberInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReaderID(long value) {
    BS_SDK_V2JNI.BS2DeviceZoneEntranceLimitMemberInfo_readerID_set(swigCPtr, this, value);
  }

  public long getReaderID() {
    return BS_SDK_V2JNI.BS2DeviceZoneEntranceLimitMemberInfo_readerID_get(swigCPtr, this);
  }

  public BS2DeviceZoneEntranceLimitMemberInfo() {
    this(BS_SDK_V2JNI.new_BS2DeviceZoneEntranceLimitMemberInfo(), true);
  }

}
