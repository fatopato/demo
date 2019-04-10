/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2VoipConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2VoipConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2VoipConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2VoipConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setServerUrl(String value) {
    BS_SDK_V2JNI.BS2VoipConfig_serverUrl_set(swigCPtr, this, value);
  }

  public String getServerUrl() {
    return BS_SDK_V2JNI.BS2VoipConfig_serverUrl_get(swigCPtr, this);
  }

  public void setServerPort(int value) {
    BS_SDK_V2JNI.BS2VoipConfig_serverPort_set(swigCPtr, this, value);
  }

  public int getServerPort() {
    return BS_SDK_V2JNI.BS2VoipConfig_serverPort_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    BS_SDK_V2JNI.BS2VoipConfig_userID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return BS_SDK_V2JNI.BS2VoipConfig_userID_get(swigCPtr, this);
  }

  public void setUserPW(String value) {
    BS_SDK_V2JNI.BS2VoipConfig_userPW_set(swigCPtr, this, value);
  }

  public String getUserPW() {
    return BS_SDK_V2JNI.BS2VoipConfig_userPW_get(swigCPtr, this);
  }

  public void setExitButton(short value) {
    BS_SDK_V2JNI.BS2VoipConfig_exitButton_set(swigCPtr, this, value);
  }

  public short getExitButton() {
    return BS_SDK_V2JNI.BS2VoipConfig_exitButton_get(swigCPtr, this);
  }

  public void setDtmfMode(short value) {
    BS_SDK_V2JNI.BS2VoipConfig_dtmfMode_set(swigCPtr, this, value);
  }

  public short getDtmfMode() {
    return BS_SDK_V2JNI.BS2VoipConfig_dtmfMode_get(swigCPtr, this);
  }

  public void setBUse(boolean value) {
    BS_SDK_V2JNI.BS2VoipConfig_bUse_set(swigCPtr, this, value);
  }

  public boolean getBUse() {
    return BS_SDK_V2JNI.BS2VoipConfig_bUse_get(swigCPtr, this);
  }

  public void setReseverd(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2VoipConfig_reseverd_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReseverd() {
    long cPtr = BS_SDK_V2JNI.BS2VoipConfig_reseverd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setNumPhonBook(long value) {
    BS_SDK_V2JNI.BS2VoipConfig_numPhonBook_set(swigCPtr, this, value);
  }

  public long getNumPhonBook() {
    return BS_SDK_V2JNI.BS2VoipConfig_numPhonBook_get(swigCPtr, this);
  }

  public void setPhonebook(BS2UserPhoneItem value) {
    BS_SDK_V2JNI.BS2VoipConfig_phonebook_set(swigCPtr, this, BS2UserPhoneItem.getCPtr(value), value);
  }

  public BS2UserPhoneItem getPhonebook() {
    long cPtr = BS_SDK_V2JNI.BS2VoipConfig_phonebook_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2UserPhoneItem(cPtr, false);
  }

  public void setReserved2(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2VoipConfig_reserved2_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved2() {
    long cPtr = BS_SDK_V2JNI.BS2VoipConfig_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2VoipConfig() {
    this(BS_SDK_V2JNI.new_BS2VoipConfig(), true);
  }

}