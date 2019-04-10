/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2SoundAction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2SoundAction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2SoundAction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2SoundAction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCount(short value) {
    BS_SDK_V2JNI.BS2SoundAction_count_set(swigCPtr, this, value);
  }

  public short getCount() {
    return BS_SDK_V2JNI.BS2SoundAction_count_get(swigCPtr, this);
  }

  public void setSoundIndex(int value) {
    BS_SDK_V2JNI.BS2SoundAction_soundIndex_set(swigCPtr, this, value);
  }

  public int getSoundIndex() {
    return BS_SDK_V2JNI.BS2SoundAction_soundIndex_get(swigCPtr, this);
  }

  public void setDelay(int value) {
    BS_SDK_V2JNI.BS2SoundAction_delay_set(swigCPtr, this, value);
  }

  public int getDelay() {
    return BS_SDK_V2JNI.BS2SoundAction_delay_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SoundAction_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2SoundAction_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2SoundAction() {
    this(BS_SDK_V2JNI.new_BS2SoundAction(), true);
  }

}
