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

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.Validator;
/**
 * The addArtifact options.
 *
 * Class allows either a dictionary or attribute entry to be added
 * to the instance.
 */
public class AddArtifactOptions extends GenericModel {

  private String corpus;
  private DictonaryEntry dictionaryEntry;
  private AttributeEntry attributeEntry;

  /**
   * Builder.
   */
  public static class Builder {
    private String corpus;
    private DictonaryEntry dictionaryEntry;
    private AttributeEntry attributeEntry;

    private Builder(final AddArtifactOptions addArtifactOptions) {
      this.corpus = addArtifactOptions.corpus;
      this.dictionaryEntry = addArtifactOptions.dictionaryEntry;
      this.attributeEntry = addArtifactOptions.attributeEntry;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param corpus the corpus
     */
    public Builder(final String corpus) {
      this.corpus = corpus;
    }

    /**
     * Builds a AddArtifactOptions.
     *
     * @return the addArtifactOptions
     */
    public AddArtifactOptions build() {
      return new AddArtifactOptions(this);
    }

    /**
     * Set the corpus.
     *
     * @param corpus the corpus
     * @return the AddArtifactOptions builder
     */
    public Builder corpus(final String corpus) {
      this.corpus = corpus;
      return this;
    }

    /**
     * Set the dictionaryEntry.
     *
     * @param dictionaryEntry the dictionaryEntry
     * @return the AddArtifactOptions builder
     */
    public Builder dictionaryEntry(final DictonaryEntry dictionaryEntry) {
      this.dictionaryEntry = dictionaryEntry;
      return this;
    }

    /**
     * Set the attributeEntry.
     *
     * @param attributeEntry the attributeEntry
     * @return the AddArtifactOptions builder
     */
    public Builder attributeEntry(final AttributeEntry attributeEntry) {
      this.attributeEntry = attributeEntry;
      return this;
    }
  }

  private AddArtifactOptions(final Builder builder) {
    Validator.notEmpty(builder.corpus, "corpus cannot be empty");
    corpus = builder.corpus;
    dictionaryEntry = builder.dictionaryEntry;
    attributeEntry = builder.attributeEntry;
  }

  /**
   * New builder.
   *
   * @return a AddArtifactOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the corpus.
   *
   * Corpus name.
   *
   * @return the corpus
   */
  public String corpus() {
    return corpus;
  }

  /**
   * Gets the dictionaryEntry.
   *
   * @return the dictionaryEntry
   */
  public DictonaryEntry dictionaryEntry() {
    return dictionaryEntry;
  }

  /**
   * Gets the attributeEntry.
   *
   * @return the attributeEntry
   */
  public AttributeEntry attributeEntry() {
    return attributeEntry;
  }
}

