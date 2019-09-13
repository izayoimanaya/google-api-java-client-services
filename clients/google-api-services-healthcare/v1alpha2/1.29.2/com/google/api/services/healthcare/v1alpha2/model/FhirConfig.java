/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.healthcare.v1alpha2.model;

/**
 * Specifies how to handle the de-identification of a FHIR store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FhirConfig extends com.google.api.client.json.GenericJson {

  /**
   * Specifies FHIR paths to match and how to transform them. Any field that is not matched by a
   * FieldMetadata is passed through to the output dataset unmodified. All extensions are removed in
   * the output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FieldMetadata> fieldMetadataList;

  /**
   * Specifies FHIR paths to match and how to transform them. Any field that is not matched by a
   * FieldMetadata is passed through to the output dataset unmodified. All extensions are removed in
   * the output.
   * @return value or {@code null} for none
   */
  public java.util.List<FieldMetadata> getFieldMetadataList() {
    return fieldMetadataList;
  }

  /**
   * Specifies FHIR paths to match and how to transform them. Any field that is not matched by a
   * FieldMetadata is passed through to the output dataset unmodified. All extensions are removed in
   * the output.
   * @param fieldMetadataList fieldMetadataList or {@code null} for none
   */
  public FhirConfig setFieldMetadataList(java.util.List<FieldMetadata> fieldMetadataList) {
    this.fieldMetadataList = fieldMetadataList;
    return this;
  }

  @Override
  public FhirConfig set(String fieldName, Object value) {
    return (FhirConfig) super.set(fieldName, value);
  }

  @Override
  public FhirConfig clone() {
    return (FhirConfig) super.clone();
  }

}
