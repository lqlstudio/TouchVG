/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class Matrix2d {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Matrix2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Matrix2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_Matrix2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM11(float value) {
    touchvgJNI.Matrix2d_m11_set(swigCPtr, this, value);
  }

  public float getM11() {
    return touchvgJNI.Matrix2d_m11_get(swigCPtr, this);
  }

  public void setM12(float value) {
    touchvgJNI.Matrix2d_m12_set(swigCPtr, this, value);
  }

  public float getM12() {
    return touchvgJNI.Matrix2d_m12_get(swigCPtr, this);
  }

  public void setM21(float value) {
    touchvgJNI.Matrix2d_m21_set(swigCPtr, this, value);
  }

  public float getM21() {
    return touchvgJNI.Matrix2d_m21_get(swigCPtr, this);
  }

  public void setM22(float value) {
    touchvgJNI.Matrix2d_m22_set(swigCPtr, this, value);
  }

  public float getM22() {
    return touchvgJNI.Matrix2d_m22_get(swigCPtr, this);
  }

  public void setDx(float value) {
    touchvgJNI.Matrix2d_dx_set(swigCPtr, this, value);
  }

  public float getDx() {
    return touchvgJNI.Matrix2d_dx_get(swigCPtr, this);
  }

  public void setDy(float value) {
    touchvgJNI.Matrix2d_dy_set(swigCPtr, this, value);
  }

  public float getDy() {
    return touchvgJNI.Matrix2d_dy_get(swigCPtr, this);
  }

  public static Matrix2d kIdentity() {
    return new Matrix2d(touchvgJNI.Matrix2d_kIdentity(), false);
  }

  public Matrix2d() {
    this(touchvgJNI.new_Matrix2d__SWIG_0(), true);
  }

  public Matrix2d(Matrix2d src) {
    this(touchvgJNI.new_Matrix2d__SWIG_1(Matrix2d.getCPtr(src), src), true);
  }

  public Matrix2d(float _m11, float _m12, float _m21, float _m22, float _dx, float _dy) {
    this(touchvgJNI.new_Matrix2d__SWIG_2(_m11, _m12, _m21, _m22, _dx, _dy), true);
  }

  public Matrix2d(Vector2d e0, Vector2d e1, Point2d origin) {
    this(touchvgJNI.new_Matrix2d__SWIG_3(Vector2d.getCPtr(e0), e0, Vector2d.getCPtr(e1), e1, Point2d.getCPtr(origin), origin), true);
  }

  public Matrix2d preMultBy(Matrix2d leftSide) {
    return new Matrix2d(touchvgJNI.Matrix2d_preMultBy(swigCPtr, this, Matrix2d.getCPtr(leftSide), leftSide), false);
  }

  public Matrix2d postMultBy(Matrix2d rightSide) {
    return new Matrix2d(touchvgJNI.Matrix2d_postMultBy(swigCPtr, this, Matrix2d.getCPtr(rightSide), rightSide), false);
  }

  public Matrix2d setToProduct(Matrix2d m1, Matrix2d m2) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToProduct(swigCPtr, this, Matrix2d.getCPtr(m1), m1, Matrix2d.getCPtr(m2), m2), false);
  }

  public void TransformPoints(int count, Point2d points) {
    touchvgJNI.Matrix2d_TransformPoints(swigCPtr, this, count, Point2d.getCPtr(points), points);
  }

  public void TransformVectors(int count, Vector2d vectors) {
    touchvgJNI.Matrix2d_TransformVectors(swigCPtr, this, count, Vector2d.getCPtr(vectors), vectors);
  }

  public float det() {
    return touchvgJNI.Matrix2d_det(swigCPtr, this);
  }

  public boolean invert() {
    return touchvgJNI.Matrix2d_invert(swigCPtr, this);
  }

  public Matrix2d inverse() {
    return new Matrix2d(touchvgJNI.Matrix2d_inverse(swigCPtr, this), true);
  }

  public boolean isInvertible() {
    return touchvgJNI.Matrix2d_isInvertible(swigCPtr, this);
  }

  public float scale() {
    return touchvgJNI.Matrix2d_scale(swigCPtr, this);
  }

  public float scaleX() {
    return touchvgJNI.Matrix2d_scaleX(swigCPtr, this);
  }

  public float scaleY() {
    return touchvgJNI.Matrix2d_scaleY(swigCPtr, this);
  }

  public float angle() {
    return touchvgJNI.Matrix2d_angle(swigCPtr, this);
  }

  public boolean isEqualTo(Matrix2d mat, Tol tol) {
    return touchvgJNI.Matrix2d_isEqualTo__SWIG_0(swigCPtr, this, Matrix2d.getCPtr(mat), mat, Tol.getCPtr(tol), tol);
  }

  public boolean isEqualTo(Matrix2d mat) {
    return touchvgJNI.Matrix2d_isEqualTo__SWIG_1(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public boolean isIdentity() {
    return touchvgJNI.Matrix2d_isIdentity(swigCPtr, this);
  }

  public boolean isOrtho() {
    return touchvgJNI.Matrix2d_isOrtho(swigCPtr, this);
  }

  public boolean hasMirror(Vector2d reflex) {
    return touchvgJNI.Matrix2d_hasMirror(swigCPtr, this, Vector2d.getCPtr(reflex), reflex);
  }

  public Matrix2d setCoordSystem(Vector2d e0, Vector2d e1, Point2d origin) {
    return new Matrix2d(touchvgJNI.Matrix2d_setCoordSystem(swigCPtr, this, Vector2d.getCPtr(e0), e0, Vector2d.getCPtr(e1), e1, Point2d.getCPtr(origin), origin), false);
  }

  public void getCoordSystem(Vector2d e0, Vector2d e1, Point2d origin) {
    touchvgJNI.Matrix2d_getCoordSystem(swigCPtr, this, Vector2d.getCPtr(e0), e0, Vector2d.getCPtr(e1), e1, Point2d.getCPtr(origin), origin);
  }

  public static Matrix2d coordSystem(Vector2d e0, Vector2d e1, Point2d origin) {
    return new Matrix2d(touchvgJNI.Matrix2d_coordSystem__SWIG_0(Vector2d.getCPtr(e0), e0, Vector2d.getCPtr(e1), e1, Point2d.getCPtr(origin), origin), true);
  }

  public static Matrix2d coordSystem(Point2d origin, float scaleX, float scaleY, float angle) {
    return new Matrix2d(touchvgJNI.Matrix2d_coordSystem__SWIG_1(Point2d.getCPtr(origin), origin, scaleX, scaleY, angle), true);
  }

  public static Matrix2d coordSystem(Point2d origin, float scaleX, float scaleY) {
    return new Matrix2d(touchvgJNI.Matrix2d_coordSystem__SWIG_2(Point2d.getCPtr(origin), origin, scaleX, scaleY), true);
  }

  public static Matrix2d coordSystem(Point2d origin, float scaleX) {
    return new Matrix2d(touchvgJNI.Matrix2d_coordSystem__SWIG_3(Point2d.getCPtr(origin), origin, scaleX), true);
  }

  public Matrix2d setToIdentity() {
    return new Matrix2d(touchvgJNI.Matrix2d_setToIdentity(swigCPtr, this), false);
  }

  public Matrix2d set(float _m11, float _m12, float _m21, float _m22, float _dx, float _dy) {
    return new Matrix2d(touchvgJNI.Matrix2d_set(swigCPtr, this, _m11, _m12, _m21, _m22, _dx, _dy), false);
  }

  public Matrix2d setToTranslation(Vector2d vec) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToTranslation(swigCPtr, this, Vector2d.getCPtr(vec), vec), false);
  }

  public Matrix2d setToRotation(float angle, Point2d center) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToRotation__SWIG_0(swigCPtr, this, angle, Point2d.getCPtr(center), center), false);
  }

  public Matrix2d setToRotation(float angle) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToRotation__SWIG_1(swigCPtr, this, angle), false);
  }

  public Matrix2d setToScaling(float scale, Point2d center) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToScaling__SWIG_0(swigCPtr, this, scale, Point2d.getCPtr(center), center), false);
  }

  public Matrix2d setToScaling(float scale) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToScaling__SWIG_1(swigCPtr, this, scale), false);
  }

  public Matrix2d setToScaling(float scaleX, float scaleY, Point2d center) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToScaling__SWIG_2(swigCPtr, this, scaleX, scaleY, Point2d.getCPtr(center), center), false);
  }

  public Matrix2d setToScaling(float scaleX, float scaleY) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToScaling__SWIG_3(swigCPtr, this, scaleX, scaleY), false);
  }

  public Matrix2d setToMirroring(Point2d pnt) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToMirroring__SWIG_0(swigCPtr, this, Point2d.getCPtr(pnt), pnt), false);
  }

  public Matrix2d setToMirroring() {
    return new Matrix2d(touchvgJNI.Matrix2d_setToMirroring__SWIG_1(swigCPtr, this), false);
  }

  public Matrix2d setToMirroring(Point2d pnt, Vector2d dir) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToMirroring__SWIG_2(swigCPtr, this, Point2d.getCPtr(pnt), pnt, Vector2d.getCPtr(dir), dir), false);
  }

  public Matrix2d setToShearing(float sx, float sy, Point2d pnt) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToShearing__SWIG_0(swigCPtr, this, sx, sy, Point2d.getCPtr(pnt), pnt), false);
  }

  public Matrix2d setToShearing(float sx, float sy) {
    return new Matrix2d(touchvgJNI.Matrix2d_setToShearing__SWIG_1(swigCPtr, this, sx, sy), false);
  }

  public static Matrix2d translation(Vector2d vec) {
    return new Matrix2d(touchvgJNI.Matrix2d_translation(Vector2d.getCPtr(vec), vec), true);
  }

  public static Matrix2d rotation(float angle, Point2d center) {
    return new Matrix2d(touchvgJNI.Matrix2d_rotation__SWIG_0(angle, Point2d.getCPtr(center), center), true);
  }

  public static Matrix2d rotation(float angle) {
    return new Matrix2d(touchvgJNI.Matrix2d_rotation__SWIG_1(angle), true);
  }

  public static Matrix2d scaling(float scale, Point2d center) {
    return new Matrix2d(touchvgJNI.Matrix2d_scaling__SWIG_0(scale, Point2d.getCPtr(center), center), true);
  }

  public static Matrix2d scaling(float scale) {
    return new Matrix2d(touchvgJNI.Matrix2d_scaling__SWIG_1(scale), true);
  }

  public static Matrix2d scaling(float scaleX, float scaleY, Point2d center) {
    return new Matrix2d(touchvgJNI.Matrix2d_scaling__SWIG_2(scaleX, scaleY, Point2d.getCPtr(center), center), true);
  }

  public static Matrix2d scaling(float scaleX, float scaleY) {
    return new Matrix2d(touchvgJNI.Matrix2d_scaling__SWIG_3(scaleX, scaleY), true);
  }

  public static Matrix2d mirroring(Point2d pnt) {
    return new Matrix2d(touchvgJNI.Matrix2d_mirroring__SWIG_0(Point2d.getCPtr(pnt), pnt), true);
  }

  public static Matrix2d mirroring() {
    return new Matrix2d(touchvgJNI.Matrix2d_mirroring__SWIG_1(), true);
  }

  public static Matrix2d mirroring(Point2d pnt, Vector2d dir) {
    return new Matrix2d(touchvgJNI.Matrix2d_mirroring__SWIG_2(Point2d.getCPtr(pnt), pnt, Vector2d.getCPtr(dir), dir), true);
  }

  public static Matrix2d shearing(float sx, float sy, Point2d pnt) {
    return new Matrix2d(touchvgJNI.Matrix2d_shearing__SWIG_0(sx, sy, Point2d.getCPtr(pnt), pnt), true);
  }

  public static Matrix2d shearing(float sx, float sy) {
    return new Matrix2d(touchvgJNI.Matrix2d_shearing__SWIG_1(sx, sy), true);
  }

}
