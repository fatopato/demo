/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2WiegandDeviceConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2WiegandDeviceConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2WiegandDeviceConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2WiegandDeviceConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTamper(BS2WiegandTamperInput value) {
    BS_SDK_V2JNI.BS2WiegandDeviceConfig_tamper_set(swigCPtr, this, BS2WiegandTamperInput.getCPtr(value), value);
  }

  public BS2WiegandTamperInput getTamper() {
    long cPtr = BS_SDK_V2JNI.BS2WiegandDeviceConfig_tamper_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2WiegandTamperInput(cPtr, false);
  }

  public void setLed(BS2WiegandLedOutput value) {
    BS_SDK_V2JNI.BS2WiegandDeviceConfig_led_set(swigCPtr, this, BS2WiegandLedOutput.getCPtr(value), value);
  }

  public BS2WiegandLedOutput getLed() {
    long cPtr = BS_SDK_V2JNI.BS2WiegandDeviceConfig_led_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2WiegandLedOutput(cPtr, false);
  }

  public void setBuzzer(BS2WiegandBuzzerOutput value) {
    BS_SDK_V2JNI.BS2WiegandDeviceConfig_buzzer_set(swigCPtr, this, BS2WiegandBuzzerOutput.getCPtr(value), value);
  }

  public BS2WiegandBuzzerOutput getBuzzer() {
    long cPtr = BS_SDK_V2JNI.BS2WiegandDeviceConfig_buzzer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2WiegandBuzzerOutput(cPtr, false);
  }

  public void setReserved(SWIGTYPE_p_unsigned_int value) {
    BS_SDK_V2JNI.BS2WiegandDeviceConfig_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2WiegandDeviceConfig_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public BS2WiegandDeviceConfig() {
    this(BS_SDK_V2JNI.new_BS2WiegandDeviceConfig(), true);
  }

}
