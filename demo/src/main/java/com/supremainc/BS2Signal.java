/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2Signal {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2Signal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2Signal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2Signal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSignalID(long value) {
    BS_SDK_V2JNI.BS2Signal_signalID_set(swigCPtr, this, value);
  }

  public long getSignalID() {
    return BS_SDK_V2JNI.BS2Signal_signalID_get(swigCPtr, this);
  }

  public void setCount(int value) {
    BS_SDK_V2JNI.BS2Signal_count_set(swigCPtr, this, value);
  }

  public int getCount() {
    return BS_SDK_V2JNI.BS2Signal_count_get(swigCPtr, this);
  }

  public void setOnDuration(int value) {
    BS_SDK_V2JNI.BS2Signal_onDuration_set(swigCPtr, this, value);
  }

  public int getOnDuration() {
    return BS_SDK_V2JNI.BS2Signal_onDuration_get(swigCPtr, this);
  }

  public void setOffDuration(int value) {
    BS_SDK_V2JNI.BS2Signal_offDuration_set(swigCPtr, this, value);
  }

  public int getOffDuration() {
    return BS_SDK_V2JNI.BS2Signal_offDuration_get(swigCPtr, this);
  }

  public void setDelay(int value) {
    BS_SDK_V2JNI.BS2Signal_delay_set(swigCPtr, this, value);
  }

  public int getDelay() {
    return BS_SDK_V2JNI.BS2Signal_delay_get(swigCPtr, this);
  }

  public BS2Signal() {
    this(BS_SDK_V2JNI.new_BS2Signal(), true);
  }

}
