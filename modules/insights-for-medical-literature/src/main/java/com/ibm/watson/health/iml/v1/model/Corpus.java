/*
 * Copyright 2018, 2020 IBM Corp. All Rights Reserved.
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
package com.ibm.watson.health.iml.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Corpus.
 */
public class Corpus extends GenericModel {

  private String corpusName;
  private List<String> ontologies;
  private String descriptiveName;
  private String umlsVersion;
  private String umlsRelease;
  private Boolean bvt;
  private String elasticsearchIndex;

  /**
   * Gets the corpusName.
   *
   * @return the corpusName
   */
  public String getCorpusName() {
    return corpusName;
  }

  /**
   * Gets the ontologies.
   *
   * @return the ontologies
   */
  public List<String> getOntologies() {
    return ontologies;
  }

  /**
   * Gets the descriptiveName.
   *
   * @return the descriptiveName
   */
  public String getDescriptiveName() {
    return descriptiveName;
  }

  /**
   * Gets the umlsVersion.
   *
   * @return the umlsVersion
   */
  public String getUmlsVersion() {
    return umlsVersion;
  }

  /**
   * Gets the umlsRelease.
   *
   * @return the umlsRelease
   */
  public String getUmlsRelease() {
    return umlsRelease;
  }

  /**
   * Gets the bvt.
   *
   * @return the bvt
   */
  public Boolean isBvt() {
    return bvt;
  }

  /**
   * Gets the elasticsearchIndex.
   *
   * @return the elasticsearchIndex
   */
  public String getElasticsearchIndex() {
    return elasticsearchIndex;
  }
}

