/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class Floats {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Floats(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Floats obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_Floats(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Floats(int n) {
    this(touchvgJNI.new_Floats__SWIG_0(n), true);
  }

  public Floats() {
    this(touchvgJNI.new_Floats__SWIG_1(), true);
  }

  public void setSize(int n) {
    touchvgJNI.Floats_setSize(swigCPtr, this, n);
  }

  public int count() {
    return touchvgJNI.Floats_count(swigCPtr, this);
  }

  public float get(int index) {
    return touchvgJNI.Floats_get(swigCPtr, this, index);
  }

  public void set(int index, float value) {
    touchvgJNI.Floats_set__SWIG_0(swigCPtr, this, index, value);
  }

  public void set(int index, float v1, float v2) {
    touchvgJNI.Floats_set__SWIG_1(swigCPtr, this, index, v1, v2);
  }

}
