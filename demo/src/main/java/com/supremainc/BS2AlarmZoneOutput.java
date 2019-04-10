/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2AlarmZoneOutput {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2AlarmZoneOutput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2AlarmZoneOutput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2AlarmZoneOutput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEvent(int value) {
    BS_SDK_V2JNI.BS2AlarmZoneOutput_event_set(swigCPtr, this, value);
  }

  public int getEvent() {
    return BS_SDK_V2JNI.BS2AlarmZoneOutput_event_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2AlarmZoneOutput_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2AlarmZoneOutput_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setAction(BS2Action value) {
    BS_SDK_V2JNI.BS2AlarmZoneOutput_action_set(swigCPtr, this, BS2Action.getCPtr(value), value);
  }

  public BS2Action getAction() {
    long cPtr = BS_SDK_V2JNI.BS2AlarmZoneOutput_action_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2Action(cPtr, false);
  }

  public BS2AlarmZoneOutput() {
    this(BS_SDK_V2JNI.new_BS2AlarmZoneOutput(), true);
  }

}
