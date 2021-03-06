/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2IntrusionAlarmZone {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2IntrusionAlarmZone(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2IntrusionAlarmZone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2IntrusionAlarmZone(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setZoneID(long value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_zoneID_set(swigCPtr, this, value);
  }

  public long getZoneID() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_zoneID_get(swigCPtr, this);
  }

  public void setName(String value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_name_get(swigCPtr, this);
  }

  public void setArmDelay(short value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_armDelay_set(swigCPtr, this, value);
  }

  public short getArmDelay() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_armDelay_get(swigCPtr, this);
  }

  public void setAlarmDelay(short value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_alarmDelay_set(swigCPtr, this, value);
  }

  public short getAlarmDelay() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_alarmDelay_get(swigCPtr, this);
  }

  public void setDisabled(boolean value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_disabled_set(swigCPtr, this, value);
  }

  public boolean getDisabled() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_disabled_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2IntrusionAlarmZone_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setNumReaders(short value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_numReaders_set(swigCPtr, this, value);
  }

  public short getNumReaders() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_numReaders_get(swigCPtr, this);
  }

  public void setNumInputs(short value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_numInputs_set(swigCPtr, this, value);
  }

  public short getNumInputs() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_numInputs_get(swigCPtr, this);
  }

  public void setNumOutputs(short value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_numOutputs_set(swigCPtr, this, value);
  }

  public short getNumOutputs() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_numOutputs_get(swigCPtr, this);
  }

  public void setNumCards(short value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_numCards_set(swigCPtr, this, value);
  }

  public short getNumCards() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_numCards_get(swigCPtr, this);
  }

  public void setNumDoors(short value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_numDoors_set(swigCPtr, this, value);
  }

  public short getNumDoors() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_numDoors_get(swigCPtr, this);
  }

  public void setNumGroups(short value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_numGroups_set(swigCPtr, this, value);
  }

  public short getNumGroups() {
    return BS_SDK_V2JNI.BS2IntrusionAlarmZone_numGroups_get(swigCPtr, this);
  }

  public void setReserved2(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2IntrusionAlarmZone_reserved2_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved2() {
    long cPtr = BS_SDK_V2JNI.BS2IntrusionAlarmZone_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2IntrusionAlarmZone() {
    this(BS_SDK_V2JNI.new_BS2IntrusionAlarmZone(), true);
  }

}
