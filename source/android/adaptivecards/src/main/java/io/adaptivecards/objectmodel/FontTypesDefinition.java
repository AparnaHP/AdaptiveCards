/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class FontTypesDefinition {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FontTypesDefinition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FontTypesDefinition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_FontTypesDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDefaultFontType(FontTypeDefinition value) {
    AdaptiveCardObjectModelJNI.FontTypesDefinition_defaultFontType_set(swigCPtr, this, FontTypeDefinition.getCPtr(value), value);
  }

  public FontTypeDefinition getDefaultFontType() {
    long cPtr = AdaptiveCardObjectModelJNI.FontTypesDefinition_defaultFontType_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FontTypeDefinition(cPtr, false);
  }

  public void setMonospaceFontType(FontTypeDefinition value) {
    AdaptiveCardObjectModelJNI.FontTypesDefinition_monospaceFontType_set(swigCPtr, this, FontTypeDefinition.getCPtr(value), value);
  }

  public FontTypeDefinition getMonospaceFontType() {
    long cPtr = AdaptiveCardObjectModelJNI.FontTypesDefinition_monospaceFontType_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FontTypeDefinition(cPtr, false);
  }

  public static FontTypesDefinition Deserialize(JsonValue json, FontTypesDefinition defaultValue) {
    return new FontTypesDefinition(AdaptiveCardObjectModelJNI.FontTypesDefinition_Deserialize(JsonValue.getCPtr(json), json, FontTypesDefinition.getCPtr(defaultValue), defaultValue), true);
  }

  public FontTypesDefinition() {
    this(AdaptiveCardObjectModelJNI.new_FontTypesDefinition(), true);
  }

}
