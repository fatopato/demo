/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.supremainc;

public class BS2RawImage {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BS2RawImage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BS2RawImage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BS_SDK_V2JNI.delete_BS2RawImage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setWidth(int value) {
    BS_SDK_V2JNI.BS2RawImage_width_set(swigCPtr, this, value);
  }

  public int getWidth() {
    return BS_SDK_V2JNI.BS2RawImage_width_get(swigCPtr, this);
  }

  public void setHeight(int value) {
    BS_SDK_V2JNI.BS2RawImage_height_set(swigCPtr, this, value);
  }

  public int getHeight() {
    return BS_SDK_V2JNI.BS2RawImage_height_get(swigCPtr, this);
  }

  public void setSize(long value) {
    BS_SDK_V2JNI.BS2RawImage_size_set(swigCPtr, this, value);
  }

  public long getSize() {
    return BS_SDK_V2JNI.BS2RawImage_size_get(swigCPtr, this);
  }

  public void setData(SWIGTYPE_p_unsigned_char value) {
    BS_SDK_V2JNI.BS2RawImage_data_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getData() {
    long cPtr = BS_SDK_V2JNI.BS2RawImage_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public BS2RawImage() {
    this(BS_SDK_V2JNI.new_BS2RawImage(), true);
  }

}
