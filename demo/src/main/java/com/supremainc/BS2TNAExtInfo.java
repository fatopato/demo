/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2TNAExtInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2TNAExtInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2TNAExtInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2TNAExtInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTnaLabel(SWIGTYPE_p_a_BS2_MAX_TNA_LABEL_LEN__char value) {
    BS_SDK_V2JNI.BS2TNAExtInfo_tnaLabel_set(swigCPtr, this, SWIGTYPE_p_a_BS2_MAX_TNA_LABEL_LEN__char.getCPtr(value));
  }

  public SWIGTYPE_p_a_BS2_MAX_TNA_LABEL_LEN__char getTnaLabel() {
    long cPtr = BS_SDK_V2JNI.BS2TNAExtInfo_tnaLabel_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_BS2_MAX_TNA_LABEL_LEN__char(cPtr, false);
  }

  public void setUnused(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2TNAExtInfo_unused_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getUnused() {
    long cPtr = BS_SDK_V2JNI.BS2TNAExtInfo_unused_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2TNAExtInfo() {
    this(BS_SDK_V2JNI.new_BS2TNAExtInfo(), true);
  }

}