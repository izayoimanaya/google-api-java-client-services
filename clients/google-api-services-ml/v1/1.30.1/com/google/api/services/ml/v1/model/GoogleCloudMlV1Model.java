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

package com.google.api.services.ml.v1.model;

/**
 * Represents a machine learning solution.
 *
 * A model can have multiple versions, each of which is a deployed, trained model ready to receive
 * prediction requests. The model itself is just a container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1Model extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The default version of the model. This version will be used to handle prediction
   * requests that do not specify a version.
   *
   * You can change the default version by calling projects.models.versions.setDefault.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1Version defaultVersion;

  /**
   * Optional. The description specified for the model when it was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a model from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform model updates in order to avoid race
   * conditions: An `etag` is returned in the response to `GetModel`, and systems are expected to
   * put that etag in the request to `UpdateModel` to ensure that their change will be applied to
   * the model as intended.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. One or more labels that you can add, to organize your models. Each label is a key-
   * value pair, where both the key and the value are arbitrary strings that you supply. For more
   * information, see the documentation on using labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The name specified for the model when it was created.
   *
   * The model name must be unique within the project it is created in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. If true, online prediction nodes send `stderr` and `stdout` streams to Stackdriver
   * Logging. These can be more verbose than the standard access logs (see
   * `onlinePredictionLogging`) and can incur higher cost. However, they are helpful for debugging.
   * Note that [Stackdriver logs may incur a cost](/stackdriver/pricing), especially if your project
   * receives prediction requests at a high QPS. Estimate your costs before enabling this option.
   *
   * Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean onlinePredictionConsoleLogging;

  /**
   * Optional. If true, online prediction access logs are sent to StackDriver Logging. These logs
   * are like standard server access logs, containing information like timestamp and latency for
   * each request. Note that [Stackdriver logs may incur a cost](/stackdriver/pricing), especially
   * if your project receives prediction requests at a high queries per second rate (QPS). Estimate
   * your costs before enabling this option.
   *
   * Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean onlinePredictionLogging;

  /**
   * Optional. The list of regions where the model is going to be deployed. Currently only one
   * region per model is supported. Defaults to 'us-central1' if nothing is set. See the available
   * regions for AI Platform services. Note: *   No matter where a model is deployed, it can always
   * be accessed by     users from anywhere, both for online and batch prediction. *   The region
   * for a batch prediction job is set by the region field when     submitting the batch prediction
   * job and does not take its value from     this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> regions;

  /**
   * Output only. The default version of the model. This version will be used to handle prediction
   * requests that do not specify a version.
   *
   * You can change the default version by calling projects.models.versions.setDefault.
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1Version getDefaultVersion() {
    return defaultVersion;
  }

  /**
   * Output only. The default version of the model. This version will be used to handle prediction
   * requests that do not specify a version.
   *
   * You can change the default version by calling projects.models.versions.setDefault.
   * @param defaultVersion defaultVersion or {@code null} for none
   */
  public GoogleCloudMlV1Model setDefaultVersion(GoogleCloudMlV1Version defaultVersion) {
    this.defaultVersion = defaultVersion;
    return this;
  }

  /**
   * Optional. The description specified for the model when it was created.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The description specified for the model when it was created.
   * @param description description or {@code null} for none
   */
  public GoogleCloudMlV1Model setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a model from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform model updates in order to avoid race
   * conditions: An `etag` is returned in the response to `GetModel`, and systems are expected to
   * put that etag in the request to `UpdateModel` to ensure that their change will be applied to
   * the model as intended.
   * @see #decodeEtag()
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a model from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform model updates in order to avoid race
   * conditions: An `etag` is returned in the response to `GetModel`, and systems are expected to
   * put that etag in the request to `UpdateModel` to ensure that their change will be applied to
   * the model as intended.
   * @see #getEtag()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEtag() {
    return com.google.api.client.util.Base64.decodeBase64(etag);
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a model from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform model updates in order to avoid race
   * conditions: An `etag` is returned in the response to `GetModel`, and systems are expected to
   * put that etag in the request to `UpdateModel` to ensure that their change will be applied to
   * the model as intended.
   * @see #encodeEtag()
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudMlV1Model setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a model from overwriting each other. It is strongly suggested that systems make use of the
   * `etag` in the read-modify-write cycle to perform model updates in order to avoid race
   * conditions: An `etag` is returned in the response to `GetModel`, and systems are expected to
   * put that etag in the request to `UpdateModel` to ensure that their change will be applied to
   * the model as intended.
   * @see #setEtag()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudMlV1Model encodeEtag(byte[] etag) {
    this.etag = com.google.api.client.util.Base64.encodeBase64URLSafeString(etag);
    return this;
  }

  /**
   * Optional. One or more labels that you can add, to organize your models. Each label is a key-
   * value pair, where both the key and the value are arbitrary strings that you supply. For more
   * information, see the documentation on using labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. One or more labels that you can add, to organize your models. Each label is a key-
   * value pair, where both the key and the value are arbitrary strings that you supply. For more
   * information, see the documentation on using labels.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudMlV1Model setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. The name specified for the model when it was created.
   *
   * The model name must be unique within the project it is created in.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name specified for the model when it was created.
   *
   * The model name must be unique within the project it is created in.
   * @param name name or {@code null} for none
   */
  public GoogleCloudMlV1Model setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. If true, online prediction nodes send `stderr` and `stdout` streams to Stackdriver
   * Logging. These can be more verbose than the standard access logs (see
   * `onlinePredictionLogging`) and can incur higher cost. However, they are helpful for debugging.
   * Note that [Stackdriver logs may incur a cost](/stackdriver/pricing), especially if your project
   * receives prediction requests at a high QPS. Estimate your costs before enabling this option.
   *
   * Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOnlinePredictionConsoleLogging() {
    return onlinePredictionConsoleLogging;
  }

  /**
   * Optional. If true, online prediction nodes send `stderr` and `stdout` streams to Stackdriver
   * Logging. These can be more verbose than the standard access logs (see
   * `onlinePredictionLogging`) and can incur higher cost. However, they are helpful for debugging.
   * Note that [Stackdriver logs may incur a cost](/stackdriver/pricing), especially if your project
   * receives prediction requests at a high QPS. Estimate your costs before enabling this option.
   *
   * Default is false.
   * @param onlinePredictionConsoleLogging onlinePredictionConsoleLogging or {@code null} for none
   */
  public GoogleCloudMlV1Model setOnlinePredictionConsoleLogging(java.lang.Boolean onlinePredictionConsoleLogging) {
    this.onlinePredictionConsoleLogging = onlinePredictionConsoleLogging;
    return this;
  }

  /**
   * Optional. If true, online prediction access logs are sent to StackDriver Logging. These logs
   * are like standard server access logs, containing information like timestamp and latency for
   * each request. Note that [Stackdriver logs may incur a cost](/stackdriver/pricing), especially
   * if your project receives prediction requests at a high queries per second rate (QPS). Estimate
   * your costs before enabling this option.
   *
   * Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOnlinePredictionLogging() {
    return onlinePredictionLogging;
  }

  /**
   * Optional. If true, online prediction access logs are sent to StackDriver Logging. These logs
   * are like standard server access logs, containing information like timestamp and latency for
   * each request. Note that [Stackdriver logs may incur a cost](/stackdriver/pricing), especially
   * if your project receives prediction requests at a high queries per second rate (QPS). Estimate
   * your costs before enabling this option.
   *
   * Default is false.
   * @param onlinePredictionLogging onlinePredictionLogging or {@code null} for none
   */
  public GoogleCloudMlV1Model setOnlinePredictionLogging(java.lang.Boolean onlinePredictionLogging) {
    this.onlinePredictionLogging = onlinePredictionLogging;
    return this;
  }

  /**
   * Optional. The list of regions where the model is going to be deployed. Currently only one
   * region per model is supported. Defaults to 'us-central1' if nothing is set. See the available
   * regions for AI Platform services. Note: *   No matter where a model is deployed, it can always
   * be accessed by     users from anywhere, both for online and batch prediction. *   The region
   * for a batch prediction job is set by the region field when     submitting the batch prediction
   * job and does not take its value from     this field.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegions() {
    return regions;
  }

  /**
   * Optional. The list of regions where the model is going to be deployed. Currently only one
   * region per model is supported. Defaults to 'us-central1' if nothing is set. See the available
   * regions for AI Platform services. Note: *   No matter where a model is deployed, it can always
   * be accessed by     users from anywhere, both for online and batch prediction. *   The region
   * for a batch prediction job is set by the region field when     submitting the batch prediction
   * job and does not take its value from     this field.
   * @param regions regions or {@code null} for none
   */
  public GoogleCloudMlV1Model setRegions(java.util.List<java.lang.String> regions) {
    this.regions = regions;
    return this;
  }

  @Override
  public GoogleCloudMlV1Model set(String fieldName, Object value) {
    return (GoogleCloudMlV1Model) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1Model clone() {
    return (GoogleCloudMlV1Model) super.clone();
  }

}
