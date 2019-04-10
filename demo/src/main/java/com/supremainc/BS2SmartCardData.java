/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2SmartCardData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2SmartCardData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2SmartCardData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2SmartCardData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHeader(BS2SmartCardHeader value) {
    BS_SDK_V2JNI.BS2SmartCardData_header_set(swigCPtr, this, BS2SmartCardHeader.getCPtr(value), value);
  }

  public BS2SmartCardHeader getHeader() {
    long cPtr = BS_SDK_V2JNI.BS2SmartCardData_header_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2SmartCardHeader(cPtr, false);
  }

  public void setCardID(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2SmartCardData_cardID_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getCardID() {
    long cPtr = BS_SDK_V2JNI.BS2SmartCardData_cardID_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setCredentials(BS2SmartCardCredentials value) {
    BS_SDK_V2JNI.BS2SmartCardData_credentials_set(swigCPtr, this, BS2SmartCardCredentials.getCPtr(value), value);
  }

  public BS2SmartCardCredentials getCredentials() {
    long cPtr = BS_SDK_V2JNI.BS2SmartCardData_credentials_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2SmartCardCredentials(cPtr, false);
  }

  public void setAccessOnData(BS2AccessOnCardData value) {
    BS_SDK_V2JNI.BS2SmartCardData_accessOnData_set(swigCPtr, this, BS2AccessOnCardData.getCPtr(value), value);
  }

  public BS2AccessOnCardData getAccessOnData() {
    long cPtr = BS_SDK_V2JNI.BS2SmartCardData_accessOnData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2AccessOnCardData(cPtr, false);
  }

  public BS2SmartCardData() {
    this(BS_SDK_V2JNI.new_BS2SmartCardData(), true);
  }

}