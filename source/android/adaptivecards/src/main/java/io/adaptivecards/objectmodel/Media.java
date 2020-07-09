/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class Media extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Media(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.Media_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Media obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_Media(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Media() {
    this(AdaptiveCardObjectModelJNI.new_Media__SWIG_0(), true);
  }

  public Media(Media arg0) {
    this(AdaptiveCardObjectModelJNI.new_Media__SWIG_1(Media.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.Media_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String GetPoster() {
    return AdaptiveCardObjectModelJNI.Media_GetPoster(swigCPtr, this);
  }

  public void SetPoster(String value) {
    AdaptiveCardObjectModelJNI.Media_SetPoster(swigCPtr, this, value);
  }

  public String GetAltText() {
    return AdaptiveCardObjectModelJNI.Media_GetAltText(swigCPtr, this);
  }

  public void SetAltText(String value) {
    AdaptiveCardObjectModelJNI.Media_SetAltText(swigCPtr, this, value);
  }

  public MediaSourceVector GetSources() {
    return new MediaSourceVector(AdaptiveCardObjectModelJNI.Media_GetSources(swigCPtr, this), false);
  }

  public void GetResourceInformation(RemoteResourceInformationVector resourceInfo) {
    AdaptiveCardObjectModelJNI.Media_GetResourceInformation(swigCPtr, this, RemoteResourceInformationVector.getCPtr(resourceInfo), resourceInfo);
  }

  public static Media dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.Media_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new Media(cPtr, true);
  }

}
