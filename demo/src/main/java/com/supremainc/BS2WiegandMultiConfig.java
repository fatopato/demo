/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2WiegandMultiConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2WiegandMultiConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2WiegandMultiConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2WiegandMultiConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFormats(BS2WiegandInConfig value) {
    BS_SDK_V2JNI.BS2WiegandMultiConfig_formats_set(swigCPtr, this, BS2WiegandInConfig.getCPtr(value), value);
  }

  public BS2WiegandInConfig getFormats() {
    long cPtr = BS_SDK_V2JNI.BS2WiegandMultiConfig_formats_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2WiegandInConfig(cPtr, false);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2WiegandMultiConfig_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2WiegandMultiConfig_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2WiegandMultiConfig() {
    this(BS_SDK_V2JNI.new_BS2WiegandMultiConfig(), true);
  }

}
