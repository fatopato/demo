/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2LiftAction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2LiftAction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2LiftAction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2LiftAction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLiftID(long value) {
    BS_SDK_V2JNI.BS2LiftAction_liftID_set(swigCPtr, this, value);
  }

  public long getLiftID() {
    return BS_SDK_V2JNI.BS2LiftAction_liftID_get(swigCPtr, this);
  }

  public void setType(short value) {
    BS_SDK_V2JNI.BS2LiftAction_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return BS_SDK_V2JNI.BS2LiftAction_type_get(swigCPtr, this);
  }

  public BS2LiftAction() {
    this(BS_SDK_V2JNI.new_BS2LiftAction(), true);
  }

}
