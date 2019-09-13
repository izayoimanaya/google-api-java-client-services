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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * The configuration for exporting to BigQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudHealthcareV1beta1FhirBigQueryDestination extends com.google.api.client.json.GenericJson {

  /**
   * BigQuery URI to a dataset, up to 2000 characters long, in the format
   * `bq://projectId.bqDatasetId`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datasetUri;

  /**
   * If this flag is `TRUE`, all tables will be deleted from the dataset before the new exported
   * tables are written. If the flag is not set and the destination dataset contains tables, the
   * export call returns an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean force;

  /**
   * The configuration for the exported BigQuery schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SchemaConfig schemaConfig;

  /**
   * BigQuery URI to a dataset, up to 2000 characters long, in the format
   * `bq://projectId.bqDatasetId`
   * @return value or {@code null} for none
   */
  public java.lang.String getDatasetUri() {
    return datasetUri;
  }

  /**
   * BigQuery URI to a dataset, up to 2000 characters long, in the format
   * `bq://projectId.bqDatasetId`
   * @param datasetUri datasetUri or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1FhirBigQueryDestination setDatasetUri(java.lang.String datasetUri) {
    this.datasetUri = datasetUri;
    return this;
  }

  /**
   * If this flag is `TRUE`, all tables will be deleted from the dataset before the new exported
   * tables are written. If the flag is not set and the destination dataset contains tables, the
   * export call returns an error.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getForce() {
    return force;
  }

  /**
   * If this flag is `TRUE`, all tables will be deleted from the dataset before the new exported
   * tables are written. If the flag is not set and the destination dataset contains tables, the
   * export call returns an error.
   * @param force force or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1FhirBigQueryDestination setForce(java.lang.Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * The configuration for the exported BigQuery schema.
   * @return value or {@code null} for none
   */
  public SchemaConfig getSchemaConfig() {
    return schemaConfig;
  }

  /**
   * The configuration for the exported BigQuery schema.
   * @param schemaConfig schemaConfig or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1FhirBigQueryDestination setSchemaConfig(SchemaConfig schemaConfig) {
    this.schemaConfig = schemaConfig;
    return this;
  }

  @Override
  public GoogleCloudHealthcareV1beta1FhirBigQueryDestination set(String fieldName, Object value) {
    return (GoogleCloudHealthcareV1beta1FhirBigQueryDestination) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudHealthcareV1beta1FhirBigQueryDestination clone() {
    return (GoogleCloudHealthcareV1beta1FhirBigQueryDestination) super.clone();
  }

}
