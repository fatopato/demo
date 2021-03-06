/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2AuthUserBlob {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2AuthUserBlob(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2AuthUserBlob obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2AuthUserBlob(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAuthGroupID(long value) {
    BS_SDK_V2JNI.BS2AuthUserBlob_authGroupID_set(swigCPtr, this, value);
  }

  public long getAuthGroupID() {
    return BS_SDK_V2JNI.BS2AuthUserBlob_authGroupID_get(swigCPtr, this);
  }

  public void setNumUsers(long value) {
    BS_SDK_V2JNI.BS2AuthUserBlob_numUsers_set(swigCPtr, this, value);
  }

  public long getNumUsers() {
    return BS_SDK_V2JNI.BS2AuthUserBlob_numUsers_get(swigCPtr, this);
  }

  public void setUserObjs(SWIGTYPE_p_a_BS2_USER_ID_SIZE__char value) {
    BS_SDK_V2JNI.BS2AuthUserBlob_userObjs_set(swigCPtr, this, SWIGTYPE_p_a_BS2_USER_ID_SIZE__char.getCPtr(value));
  }

  public SWIGTYPE_p_a_BS2_USER_ID_SIZE__char getUserObjs() {
    long cPtr = BS_SDK_V2JNI.BS2AuthUserBlob_userObjs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_BS2_USER_ID_SIZE__char(cPtr, false);
  }

  public BS2AuthUserBlob() {
    this(BS_SDK_V2JNI.new_BS2AuthUserBlob(), true);
  }

}
