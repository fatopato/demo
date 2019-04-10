/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2WeekTime {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2WeekTime(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2WeekTime obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2WeekTime(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setYear(int value) {
    BS_SDK_V2JNI.BS2WeekTime_year_set(swigCPtr, this, value);
  }

  public int getYear() {
    return BS_SDK_V2JNI.BS2WeekTime_year_get(swigCPtr, this);
  }

  public void setMonth(short value) {
    BS_SDK_V2JNI.BS2WeekTime_month_set(swigCPtr, this, value);
  }

  public short getMonth() {
    return BS_SDK_V2JNI.BS2WeekTime_month_get(swigCPtr, this);
  }

  public void setOrdinal(byte value) {
    BS_SDK_V2JNI.BS2WeekTime_ordinal_set(swigCPtr, this, value);
  }

  public byte getOrdinal() {
    return BS_SDK_V2JNI.BS2WeekTime_ordinal_get(swigCPtr, this);
  }

  public void setWeekDay(short value) {
    BS_SDK_V2JNI.BS2WeekTime_weekDay_set(swigCPtr, this, value);
  }

  public short getWeekDay() {
    return BS_SDK_V2JNI.BS2WeekTime_weekDay_get(swigCPtr, this);
  }

  public void setHour(short value) {
    BS_SDK_V2JNI.BS2WeekTime_hour_set(swigCPtr, this, value);
  }

  public short getHour() {
    return BS_SDK_V2JNI.BS2WeekTime_hour_get(swigCPtr, this);
  }

  public void setMinute(short value) {
    BS_SDK_V2JNI.BS2WeekTime_minute_set(swigCPtr, this, value);
  }

  public short getMinute() {
    return BS_SDK_V2JNI.BS2WeekTime_minute_get(swigCPtr, this);
  }

  public void setSecond(short value) {
    BS_SDK_V2JNI.BS2WeekTime_second_set(swigCPtr, this, value);
  }

  public short getSecond() {
    return BS_SDK_V2JNI.BS2WeekTime_second_get(swigCPtr, this);
  }

  public BS2WeekTime() {
    this(BS_SDK_V2JNI.new_BS2WeekTime(), true);
  }

}
