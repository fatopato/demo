/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2SystemConfigExt {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2SystemConfigExt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2SystemConfigExt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2SystemConfigExt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPrimarySecureKey(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SystemConfigExt_primarySecureKey_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getPrimarySecureKey() {
    long cPtr = BS_SDK_V2JNI.BS2SystemConfigExt_primarySecureKey_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setSecondarySecureKey(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SystemConfigExt_secondarySecureKey_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getSecondarySecureKey() {
    long cPtr = BS_SDK_V2JNI.BS2SystemConfigExt_secondarySecureKey_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setReserved3(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SystemConfigExt_reserved3_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved3() {
    long cPtr = BS_SDK_V2JNI.BS2SystemConfigExt_reserved3_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2SystemConfigExt() {
    this(BS_SDK_V2JNI.new_BS2SystemConfigExt(), true);
  }

}
