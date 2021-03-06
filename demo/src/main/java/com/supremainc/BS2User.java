/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2User {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2User(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2User obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2User(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserID(String value) {
    BS_SDK_V2JNI.BS2User_userID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return BS_SDK_V2JNI.BS2User_userID_get(swigCPtr, this);
  }

  public void setFormatVersion(short value) {
    BS_SDK_V2JNI.BS2User_formatVersion_set(swigCPtr, this, value);
  }

  public short getFormatVersion() {
    return BS_SDK_V2JNI.BS2User_formatVersion_get(swigCPtr, this);
  }

  public void setFlag(short value) {
    BS_SDK_V2JNI.BS2User_flag_set(swigCPtr, this, value);
  }

  public short getFlag() {
    return BS_SDK_V2JNI.BS2User_flag_get(swigCPtr, this);
  }

  public void setVersion(int value) {
    BS_SDK_V2JNI.BS2User_version_set(swigCPtr, this, value);
  }

  public int getVersion() {
    return BS_SDK_V2JNI.BS2User_version_get(swigCPtr, this);
  }

  public void setNumCards(short value) {
    BS_SDK_V2JNI.BS2User_numCards_set(swigCPtr, this, value);
  }

  public short getNumCards() {
    return BS_SDK_V2JNI.BS2User_numCards_get(swigCPtr, this);
  }

  public void setNumFingers(short value) {
    BS_SDK_V2JNI.BS2User_numFingers_set(swigCPtr, this, value);
  }

  public short getNumFingers() {
    return BS_SDK_V2JNI.BS2User_numFingers_get(swigCPtr, this);
  }

  public void setNumFaces(short value) {
    BS_SDK_V2JNI.BS2User_numFaces_set(swigCPtr, this, value);
  }

  public short getNumFaces() {
    return BS_SDK_V2JNI.BS2User_numFaces_get(swigCPtr, this);
  }

  public void setReserved2(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2User_reserved2_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved2() {
    long cPtr = BS_SDK_V2JNI.BS2User_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setAuthGroupID(long value) {
    BS_SDK_V2JNI.BS2User_authGroupID_set(swigCPtr, this, value);
  }

  public long getAuthGroupID() {
    return BS_SDK_V2JNI.BS2User_authGroupID_get(swigCPtr, this);
  }

  public void setFaceChecksum(long value) {
    BS_SDK_V2JNI.BS2User_faceChecksum_set(swigCPtr, this, value);
  }

  public long getFaceChecksum() {
    return BS_SDK_V2JNI.BS2User_faceChecksum_get(swigCPtr, this);
  }

  public BS2User() {
    this(BS_SDK_V2JNI.new_BS2User(), true);
  }

}
