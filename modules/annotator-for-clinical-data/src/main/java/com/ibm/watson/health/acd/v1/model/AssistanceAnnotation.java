/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.health.acd.v1.model;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.ibm.watson.developer_cloud.service.model.DynamicModel;
import com.ibm.watson.developer_cloud.util.GsonSerializationHelper;

/**
 * AssistanceAnnotation.
 */
public class AssistanceAnnotation extends DynamicModel {
  private Type idType = new TypeToken<String>() { } .getType();
  private Type typeType = new TypeToken<String>() { } .getType();
  private Type uidType = new TypeToken<Long>() { } .getType();
  private Type beginType = new TypeToken<Long>() { } .getType();
  private Type endType = new TypeToken<Long>() { } .getType();
  private Type coveredTextType = new TypeToken<String>() { } .getType();
  private Type negatedType = new TypeToken<Boolean>() { } .getType();
  private Type hypotheticalType = new TypeToken<Boolean>() { } .getType();
  private Type primaryActionNormalizedNameType = new TypeToken<String>() { } .getType();
  private Type modalityType = new TypeToken<String>() { } .getType();
  private Type primaryActionSurfaceFormType = new TypeToken<String>() { } .getType();
  private Type sectionNormalizedNameType = new TypeToken<String>() { } .getType();
  private Type sectionSurfaceFormType = new TypeToken<String>() { } .getType();

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("id"), idType);
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String getType() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("type"), typeType);
  }

  /**
   * Gets the uid.
   *
   * @return the uid
   */
  public Long getUid() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("uid"), uidType);
  }

  /**
   * Gets the begin.
   *
   * @return the begin
   */
  public Long getBegin() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("begin"), beginType);
  }

  /**
   * Gets the end.
   *
   * @return the end
   */
  public Long getEnd() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("end"), endType);
  }

  /**
   * Gets the coveredText.
   *
   * @return the coveredText
   */
  public String getCoveredText() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("coveredText"), coveredTextType);
  }

  /**
   * Gets the negated.
   *
   * @return the negated
   */
  public Boolean isNegated() {
    Boolean negated = GsonSerializationHelper.serializeDynamicModelProperty(this.get("negated"), negatedType);
    if (negated == null) {
      negated = false;
    }
    return negated;
  }

  /**
   * Gets the hypothetical.
   *
   * @return the hypothetical
   */
  public Boolean isHypothetical() {
    Boolean hypothetical = GsonSerializationHelper.serializeDynamicModelProperty(this.get("hypothetical"), hypotheticalType);
    if (hypothetical == null) {
      hypothetical = false;
    }
    return hypothetical;
  }

  /**
   * Gets the primaryActionNormalizedName.
   *
   * @return the primaryActionNormalizedName
   */
  public String getPrimaryActionNormalizedName() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("primaryActionNormalizedName"), primaryActionNormalizedNameType);
  }

  /**
   * Gets the modality.
   *
   * @return the modality
   */
  public String getModality() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("modality"), modalityType);
  }

  /**
   * Gets the primaryActionSurfaceForm.
   *
   * @return the primaryActionSurfaceForm
   */
  public String getPrimaryActionSurfaceForm() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("primaryActionSurfaceForm"), primaryActionSurfaceFormType);
  }

  /**
   * Gets the sectionNormalizedName.
   *
   * @return the sectionNormalizedName
   */
  public String getSectionNormalizedName() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("sectionNormalizedName"), sectionNormalizedNameType);
  }

  /**
   * Gets the sectionSurfaceForm.
   *
   * @return the sectionSurfaceForm
   */
  public String getSectionSurfaceForm() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("sectionSurfaceForm"), sectionSurfaceFormType);
  }



//  /**
//   * Sets the id.
//   *
//   * @param id the new id
//   */
//  public void setId(final String id) {
//    this.put("id", id);
//  }
//
//  /**
//   * Sets the type.
//   *
//   * @param type the new type
//   */
//  public void setType(final String type) {
//    this.put("type", type);
//  }
//
//  /**
//   * Sets the uid.
//   *
//   * @param uid the new uid
//   */
//  public void setUid(final Long uid) {
//    this.put("uid", uid);
//  }
//
//  /**
//   * Sets the begin.
//   *
//   * @param begin the new begin
//   */
//  public void setBegin(final Long begin) {
//    this.put("begin", begin);
//  }
//
//  /**
//   * Sets the end.
//   *
//   * @param end the new end
//   */
//  public void setEnd(final Long end) {
//    this.put("end", end);
//  }
//
//  /**
//   * Sets the coveredText.
//   *
//   * @param coveredText the new coveredText
//   */
//  public void setCoveredText(final String coveredText) {
//    this.put("coveredText", coveredText);
//  }
//
//  /**
//   * Sets the negated.
//   *
//   * @param negated the new negated
//   */
//  public void setNegated(final Boolean negated) {
//    this.put("negated", negated);
//  }
//
//  /**
//   * Sets the hypothetical.
//   *
//   * @param hypothetical the new hypothetical
//   */
//  public void setHypothetical(final Boolean hypothetical) {
//    this.put("hypothetical", hypothetical);
//  }
//
//  /**
//   * Sets the primaryActionNormalizedName.
//   *
//   * @param primaryActionNormalizedName the new primaryActionNormalizedName
//   */
//  public void setPrimaryActionNormalizedName(final String primaryActionNormalizedName) {
//    this.put("primaryActionNormalizedName", primaryActionNormalizedName);
//  }
//
//  /**
//   * Sets the modality.
//   *
//   * @param modality the new modality
//   */
//  public void setModality(final String modality) {
//    this.put("modality", modality);
//  }
//
//  /**
//   * Sets the primaryActionSurfaceForm.
//   *
//   * @param primaryActionSurfaceForm the new primaryActionSurfaceForm
//   */
//  public void setPrimaryActionSurfaceForm(final String primaryActionSurfaceForm) {
//    this.put("primaryActionSurfaceForm", primaryActionSurfaceForm);
//  }
//
//  /**
//   * Sets the sectionSurfaceForm.
//   *
//   * @param sectionSurfaceForm the new sectionSurfaceForm
//   */
//  public void setSectionSurfaceForm(final String sectionSurfaceForm) {
//    this.put("sectionSurfaceForm", sectionSurfaceForm);
//  }
//
//
//  /**
//   * Sets the sectionNormalizedName.
//   *
//   * @param sectionNormalizedName the new sectionNormalizedName
//   */
//  public void setSectionNormalizedName(final String sectionNormalizedName) {
//    this.put("sectionNormalizedName", sectionNormalizedName);
//  }



}
