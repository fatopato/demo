/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2BuzzerAction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2BuzzerAction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2BuzzerAction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2BuzzerAction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCount(int value) {
    BS_SDK_V2JNI.BS2BuzzerAction_count_set(swigCPtr, this, value);
  }

  public int getCount() {
    return BS_SDK_V2JNI.BS2BuzzerAction_count_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2BuzzerAction_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2BuzzerAction_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setSignal(BS2BuzzerSignal value) {
    BS_SDK_V2JNI.BS2BuzzerAction_signal_set(swigCPtr, this, BS2BuzzerSignal.getCPtr(value), value);
  }

  public BS2BuzzerSignal getSignal() {
    long cPtr = BS_SDK_V2JNI.BS2BuzzerAction_signal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2BuzzerSignal(cPtr, false);
  }

  public BS2BuzzerAction() {
    this(BS_SDK_V2JNI.new_BS2BuzzerAction(), true);
  }

}
