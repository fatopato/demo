/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2UserPhoneItem {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2UserPhoneItem(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2UserPhoneItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2UserPhoneItem(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPhoneNumber(String value) {
    BS_SDK_V2JNI.BS2UserPhoneItem_phoneNumber_set(swigCPtr, this, value);
  }

  public String getPhoneNumber() {
    return BS_SDK_V2JNI.BS2UserPhoneItem_phoneNumber_get(swigCPtr, this);
  }

  public void setDescript(String value) {
    BS_SDK_V2JNI.BS2UserPhoneItem_descript_set(swigCPtr, this, value);
  }

  public String getDescript() {
    return BS_SDK_V2JNI.BS2UserPhoneItem_descript_get(swigCPtr, this);
  }

  public void setReserved2(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2UserPhoneItem_reserved2_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved2() {
    long cPtr = BS_SDK_V2JNI.BS2UserPhoneItem_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2UserPhoneItem() {
    this(BS_SDK_V2JNI.new_BS2UserPhoneItem(), true);
  }

}
