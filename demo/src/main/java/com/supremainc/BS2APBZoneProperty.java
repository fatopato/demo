/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2APBZoneProperty {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2APBZoneProperty(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2APBZoneProperty obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2APBZoneProperty(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAction(BS2Action value) {
    BS_SDK_V2JNI.BS2APBZoneProperty_action_set(swigCPtr, this, BS2Action.getCPtr(value), value);
  }

  public BS2Action getAction() {
    long cPtr = BS_SDK_V2JNI.BS2APBZoneProperty_action_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2Action(cPtr, false);
  }

  public BS2APBZoneProperty() {
    this(BS_SDK_V2JNI.new_BS2APBZoneProperty(), true);
  }

}