/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2SeosCard {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2SeosCard(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2SeosCard obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2SeosCard(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOid_ADF(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SeosCard_oid_ADF_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getOid_ADF() {
    long cPtr = BS_SDK_V2JNI.BS2SeosCard_oid_ADF_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setSize_ADF(short value) {
    BS_SDK_V2JNI.BS2SeosCard_size_ADF_set(swigCPtr, this, value);
  }

  public short getSize_ADF() {
    return BS_SDK_V2JNI.BS2SeosCard_size_ADF_get(swigCPtr, this);
  }

  public void setReserved1(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SeosCard_reserved1_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved1() {
    long cPtr = BS_SDK_V2JNI.BS2SeosCard_reserved1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setOid_DataObjectID(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SeosCard_oid_DataObjectID_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getOid_DataObjectID() {
    long cPtr = BS_SDK_V2JNI.BS2SeosCard_oid_DataObjectID_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setSize_DataObject(SWIGTYPE_p_unsigned_short value) {
    BS_SDK_V2JNI.BS2SeosCard_size_DataObject_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getSize_DataObject() {
    long cPtr = BS_SDK_V2JNI.BS2SeosCard_size_DataObject_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setPrimaryKeyAuth(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SeosCard_primaryKeyAuth_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getPrimaryKeyAuth() {
    long cPtr = BS_SDK_V2JNI.BS2SeosCard_primaryKeyAuth_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setSecondaryKeyAuth(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SeosCard_secondaryKeyAuth_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getSecondaryKeyAuth() {
    long cPtr = BS_SDK_V2JNI.BS2SeosCard_secondaryKeyAuth_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setReserved2(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SeosCard_reserved2_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved2() {
    long cPtr = BS_SDK_V2JNI.BS2SeosCard_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2SeosCard() {
    this(BS_SDK_V2JNI.new_BS2SeosCard(), true);
  }

}