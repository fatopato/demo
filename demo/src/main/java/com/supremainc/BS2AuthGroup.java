/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2AuthGroup {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2AuthGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2AuthGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2AuthGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(long value) {
    BS_SDK_V2JNI.BS2AuthGroup_id_set(swigCPtr, this, value);
  }

  public long getId() {
    return BS_SDK_V2JNI.BS2AuthGroup_id_get(swigCPtr, this);
  }

  public void setName(String value) {
    BS_SDK_V2JNI.BS2AuthGroup_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return BS_SDK_V2JNI.BS2AuthGroup_name_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2AuthGroup_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2AuthGroup_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2AuthGroup() {
    this(BS_SDK_V2JNI.new_BS2AuthGroup(), true);
  }

}
