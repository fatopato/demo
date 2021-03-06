/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2TimedAntiPassbackZone {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2TimedAntiPassbackZone(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2TimedAntiPassbackZone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2TimedAntiPassbackZone(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setZoneID(long value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_zoneID_set(swigCPtr, this, value);
  }

  public long getZoneID() {
    return BS_SDK_V2JNI.BS2TimedAntiPassbackZone_zoneID_get(swigCPtr, this);
  }

  public void setName(String value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return BS_SDK_V2JNI.BS2TimedAntiPassbackZone_name_get(swigCPtr, this);
  }

  public void setType(short value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return BS_SDK_V2JNI.BS2TimedAntiPassbackZone_type_get(swigCPtr, this);
  }

  public void setNumReaders(short value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_numReaders_set(swigCPtr, this, value);
  }

  public short getNumReaders() {
    return BS_SDK_V2JNI.BS2TimedAntiPassbackZone_numReaders_get(swigCPtr, this);
  }

  public void setNumBypassGroups(short value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_numBypassGroups_set(swigCPtr, this, value);
  }

  public short getNumBypassGroups() {
    return BS_SDK_V2JNI.BS2TimedAntiPassbackZone_numBypassGroups_get(swigCPtr, this);
  }

  public void setDisabled(boolean value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_disabled_set(swigCPtr, this, value);
  }

  public boolean getDisabled() {
    return BS_SDK_V2JNI.BS2TimedAntiPassbackZone_disabled_get(swigCPtr, this);
  }

  public void setAlarmed(boolean value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_alarmed_set(swigCPtr, this, value);
  }

  public boolean getAlarmed() {
    return BS_SDK_V2JNI.BS2TimedAntiPassbackZone_alarmed_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved() {
    long cPtr = BS_SDK_V2JNI.BS2TimedAntiPassbackZone_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setResetDuration(long value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_resetDuration_set(swigCPtr, this, value);
  }

  public long getResetDuration() {
    return BS_SDK_V2JNI.BS2TimedAntiPassbackZone_resetDuration_get(swigCPtr, this);
  }

  public void setAlarm(BS2Action value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_alarm_set(swigCPtr, this, BS2Action.getCPtr(value), value);
  }

  public BS2Action getAlarm() {
    long cPtr = BS_SDK_V2JNI.BS2TimedAntiPassbackZone_alarm_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2Action(cPtr, false);
  }

  public void setReaders(BS2TimedApbMember value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_readers_set(swigCPtr, this, BS2TimedApbMember.getCPtr(value), value);
  }

  public BS2TimedApbMember getReaders() {
    long cPtr = BS_SDK_V2JNI.BS2TimedAntiPassbackZone_readers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BS2TimedApbMember(cPtr, false);
  }

  public void setReserved2(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_reserved2_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getReserved2() {
    long cPtr = BS_SDK_V2JNI.BS2TimedAntiPassbackZone_reserved2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setBypassGroupIDs(SWIGTYPE_p_unsigned_int value) {
    BS_SDK_V2JNI.BS2TimedAntiPassbackZone_bypassGroupIDs_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getBypassGroupIDs() {
    long cPtr = BS_SDK_V2JNI.BS2TimedAntiPassbackZone_bypassGroupIDs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public BS2TimedAntiPassbackZone() {
    this(BS_SDK_V2JNI.new_BS2TimedAntiPassbackZone(), true);
  }

}
