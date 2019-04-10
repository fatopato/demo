/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2DeviceZoneAGEntranceLimit {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2DeviceZoneAGEntranceLimit(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2DeviceZoneAGEntranceLimit obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2DeviceZoneAGEntranceLimit(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setZoneID(long value) {
    BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_zoneID_set(swigCPtr, this, value);
  }

  public long getZoneID() {
    return BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_zoneID_get(swigCPtr, this);
  }

  public void setNumAGEntranceLimit(int value) {
    BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_numAGEntranceLimit_set(swigCPtr, this, value);
  }

  public int getNumAGEntranceLimit() {
    return BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_numAGEntranceLimit_get(swigCPtr, this);
  }

  public void setReserved1(int value) {
    BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_reserved1_set(swigCPtr, this, value);
  }

  public int getReserved1() {
    return BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_reserved1_get(swigCPtr, this);
  }

  public void setPeriodStart_s(SWIGTYPE_p_unsigned_int value) {
    BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_periodStart_s_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getPeriodStart_s() {
    long cPtr = BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_periodStart_s_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public void setPeriodEnd_s(SWIGTYPE_p_unsigned_int value) {
    BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_periodEnd_s_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getPeriodEnd_s() {
    long cPtr = BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_periodEnd_s_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public void setNumEntry(SWIGTYPE_p_unsigned_short value) {
    BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_numEntry_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getNumEntry() {
    long cPtr = BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_numEntry_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setMaxEntry(SWIGTYPE_p_a_BS2_MAX_ACCESS_GROUP_ENTRANCE_LIMIT_PER_ENTRACE_LIMIT__unsigned_short value) {
    BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_maxEntry_set(swigCPtr, this, SWIGTYPE_p_a_BS2_MAX_ACCESS_GROUP_ENTRANCE_LIMIT_PER_ENTRACE_LIMIT__unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_a_BS2_MAX_ACCESS_GROUP_ENTRANCE_LIMIT_PER_ENTRACE_LIMIT__unsigned_short getMaxEntry() {
    long cPtr = BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_maxEntry_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_BS2_MAX_ACCESS_GROUP_ENTRANCE_LIMIT_PER_ENTRACE_LIMIT__unsigned_short(cPtr, false);
  }

  public void setAccessGroupID(SWIGTYPE_p_a_BS2_MAX_ACCESS_GROUP_ENTRANCE_LIMIT_PER_ENTRACE_LIMIT__unsigned_int value) {
    BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_accessGroupID_set(swigCPtr, this, SWIGTYPE_p_a_BS2_MAX_ACCESS_GROUP_ENTRANCE_LIMIT_PER_ENTRACE_LIMIT__unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_a_BS2_MAX_ACCESS_GROUP_ENTRANCE_LIMIT_PER_ENTRACE_LIMIT__unsigned_int getAccessGroupID() {
    long cPtr = BS_SDK_V2JNI.BS2DeviceZoneAGEntranceLimit_accessGroupID_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_BS2_MAX_ACCESS_GROUP_ENTRANCE_LIMIT_PER_ENTRACE_LIMIT__unsigned_int(cPtr, false);
  }

  public BS2DeviceZoneAGEntranceLimit() {
    this(BS_SDK_V2JNI.new_BS2DeviceZoneAGEntranceLimit(), true);
  }

}