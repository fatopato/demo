/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2Rs485Channel {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2Rs485Channel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2Rs485Channel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2Rs485Channel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBaudRate(long value) {
    BS_SDK_V2JNI.BS2Rs485Channel_baudRate_set(swigCPtr, this, value);
  }

  public long getBaudRate() {
    return BS_SDK_V2JNI.BS2Rs485Channel_baudRate_get(swigCPtr, this);
  }

  public void setChannelIndex(short value) {
    BS_SDK_V2JNI.BS2Rs485Channel_channelIndex_set(swigCPtr, this, value);
  }

  public short getChannelIndex() {
    return BS_SDK_V2JNI.BS2Rs485Channel_channelIndex_get(swigCPtr, this);
  }

  public void setUseRegistance(short value) {
    BS_SDK_V2JNI.BS2Rs485Channel_useRegistance_set(swigCPtr, this, value);
  }

  public short getUseRegistance() {
    return BS_SDK_V2JNI.BS2Rs485Channel_useRegistance_get(swigCPtr, this);
  }

  public void setNumOfDevices(short value) {
    BS_SDK_V2JNI.BS2Rs485Channel_numOfDevices_set(swigCPtr, this, value);
  }

  public short getNumOfDevices() {
    return BS_SDK_V2JNI.BS2Rs485Channel_numOfDevices_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2Rs485Channel_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2Rs485Channel_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setSlaveDevices(BS2Rs485SlaveDevice value) {
    BS_SDK_V2JNI.BS2Rs485Channel_slaveDevices_set(swigCPtr, this, BS2Rs485SlaveDevice.getCPtr(value), value);
  }

  public BS2Rs485SlaveDevice getSlaveDevices() {
    long cPtr = BS_SDK_V2JNI.BS2Rs485Channel_slaveDevices_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2Rs485SlaveDevice(cPtr, false);
  }

  public BS2Rs485Channel() {
    this(BS_SDK_V2JNI.new_BS2Rs485Channel(), true);
  }

}
