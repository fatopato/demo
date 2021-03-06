/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2DesFireCard {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2DesFireCard(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2DesFireCard obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2DesFireCard(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPrimaryKey(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2DesFireCard_primaryKey_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getPrimaryKey() {
    long cPtr = BS_SDK_V2JNI.BS2DesFireCard_primaryKey_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setSecondaryKey(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2DesFireCard_secondaryKey_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getSecondaryKey() {
    long cPtr = BS_SDK_V2JNI.BS2DesFireCard_secondaryKey_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setAppID(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2DesFireCard_appID_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getAppID() {
    long cPtr = BS_SDK_V2JNI.BS2DesFireCard_appID_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setFileID(short value) {
    BS_SDK_V2JNI.BS2DesFireCard_fileID_set(swigCPtr, this, value);
  }

  public short getFileID() {
    return BS_SDK_V2JNI.BS2DesFireCard_fileID_get(swigCPtr, this);
  }

  public void setEncryptionType(short value) {
    BS_SDK_V2JNI.BS2DesFireCard_encryptionType_set(swigCPtr, this, value);
  }

  public short getEncryptionType() {
    return BS_SDK_V2JNI.BS2DesFireCard_encryptionType_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2DesFireCard_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2DesFireCard_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2DesFireCard() {
    this(BS_SDK_V2JNI.new_BS2DesFireCard(), true);
  }

}
