/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2WiegandConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2WiegandConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2WiegandConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2WiegandConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMode(short value) {
    BS_SDK_V2JNI.BS2WiegandConfig_mode_set(swigCPtr, this, value);
  }

  public short getMode() {
    return BS_SDK_V2JNI.BS2WiegandConfig_mode_get(swigCPtr, this);
  }

  public void setUseWiegandBypass(boolean value) {
    BS_SDK_V2JNI.BS2WiegandConfig_useWiegandBypass_set(swigCPtr, this, value);
  }

  public boolean getUseWiegandBypass() {
    return BS_SDK_V2JNI.BS2WiegandConfig_useWiegandBypass_get(swigCPtr, this);
  }

  public void setUseFailCode(boolean value) {
    BS_SDK_V2JNI.BS2WiegandConfig_useFailCode_set(swigCPtr, this, value);
  }

  public boolean getUseFailCode() {
    return BS_SDK_V2JNI.BS2WiegandConfig_useFailCode_get(swigCPtr, this);
  }

  public void setFailCode(short value) {
    BS_SDK_V2JNI.BS2WiegandConfig_failCode_set(swigCPtr, this, value);
  }

  public short getFailCode() {
    return BS_SDK_V2JNI.BS2WiegandConfig_failCode_get(swigCPtr, this);
  }

  public void setOutPulseWidth(int value) {
    BS_SDK_V2JNI.BS2WiegandConfig_outPulseWidth_set(swigCPtr, this, value);
  }

  public int getOutPulseWidth() {
    return BS_SDK_V2JNI.BS2WiegandConfig_outPulseWidth_get(swigCPtr, this);
  }

  public void setOutPulseInterval(int value) {
    BS_SDK_V2JNI.BS2WiegandConfig_outPulseInterval_set(swigCPtr, this, value);
  }

  public int getOutPulseInterval() {
    return BS_SDK_V2JNI.BS2WiegandConfig_outPulseInterval_get(swigCPtr, this);
  }

  public void setFormatID(long value) {
    BS_SDK_V2JNI.BS2WiegandConfig_formatID_set(swigCPtr, this, value);
  }

  public long getFormatID() {
    return BS_SDK_V2JNI.BS2WiegandConfig_formatID_get(swigCPtr, this);
  }

  public void setFormat(BS2WiegandFormat value) {
    BS_SDK_V2JNI.BS2WiegandConfig_format_set(swigCPtr, this, BS2WiegandFormat.getCPtr(value), value);
  }

  public BS2WiegandFormat getFormat() {
    long cPtr = BS_SDK_V2JNI.BS2WiegandConfig_format_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2WiegandFormat(cPtr, false);
  }

  public void setWiegandInputMask(int value) {
    BS_SDK_V2JNI.BS2WiegandConfig_wiegandInputMask_set(swigCPtr, this, value);
  }

  public int getWiegandInputMask() {
    return BS_SDK_V2JNI.BS2WiegandConfig_wiegandInputMask_get(swigCPtr, this);
  }

  public void setWiegandCardMask(int value) {
    BS_SDK_V2JNI.BS2WiegandConfig_wiegandCardMask_set(swigCPtr, this, value);
  }

  public int getWiegandCardMask() {
    return BS_SDK_V2JNI.BS2WiegandConfig_wiegandCardMask_get(swigCPtr, this);
  }

  public void setWiegandCSNIndex(short value) {
    BS_SDK_V2JNI.BS2WiegandConfig_wiegandCSNIndex_set(swigCPtr, this, value);
  }

  public short getWiegandCSNIndex() {
    return BS_SDK_V2JNI.BS2WiegandConfig_wiegandCSNIndex_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2WiegandConfig_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2WiegandConfig_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2WiegandConfig() {
    this(BS_SDK_V2JNI.new_BS2WiegandConfig(), true);
  }

}
