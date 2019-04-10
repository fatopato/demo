/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2AccessOnCardData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2AccessOnCardData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2AccessOnCardData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2AccessOnCardData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAccessGroupID(SWIGTYPE_p_unsigned_short value) {
    BS_SDK_V2JNI.BS2AccessOnCardData_accessGroupID_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getAccessGroupID() {
    long cPtr = BS_SDK_V2JNI.BS2AccessOnCardData_accessGroupID_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setStartTime(long value) {
    BS_SDK_V2JNI.BS2AccessOnCardData_startTime_set(swigCPtr, this, value);
  }

  public long getStartTime() {
    return BS_SDK_V2JNI.BS2AccessOnCardData_startTime_get(swigCPtr, this);
  }

  public void setEndTime(long value) {
    BS_SDK_V2JNI.BS2AccessOnCardData_endTime_set(swigCPtr, this, value);
  }

  public long getEndTime() {
    return BS_SDK_V2JNI.BS2AccessOnCardData_endTime_get(swigCPtr, this);
  }

  public BS2AccessOnCardData() {
    this(BS_SDK_V2JNI.new_BS2AccessOnCardData(), true);
  }

}
