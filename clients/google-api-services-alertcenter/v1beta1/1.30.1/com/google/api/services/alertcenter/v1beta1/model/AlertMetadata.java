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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * An alert metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Alert Center API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AlertMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The alert identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alertId;

  /**
   * The email address of the user assigned to the alert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assignee;

  /**
   * Output only. The unique identifier of the Google account of the customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerId;

  /**
   * Optional. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of an alert metadata from overwriting each other. It is strongly suggested
   * that systems make use of the `etag` in the read-modify-write cycle to perform metatdata updates
   * in order to avoid race conditions: An `etag` is returned in the response which contains alert
   * metadata, and systems are expected to put that etag in the request to update alert metadata to
   * ensure that their change will be applied to the same version of the alert metadata.
   *
   * If no `etag` is provided in the call to update alert metadata, then the existing alert metadata
   * is overwritten blindly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The severity value of the alert. Alert Center will set this field at alert creation time,
   * default's to an empty string when it could not be determined. The supported values for update
   * actions on this field are the following:
   *
   * * HIGH * MEDIUM * LOW
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * The current status of the alert. The supported values are the following:
   *
   * * NOT_STARTED * IN_PROGRESS * CLOSED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Output only. The time this metadata was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The alert identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlertId() {
    return alertId;
  }

  /**
   * Output only. The alert identifier.
   * @param alertId alertId or {@code null} for none
   */
  public AlertMetadata setAlertId(java.lang.String alertId) {
    this.alertId = alertId;
    return this;
  }

  /**
   * The email address of the user assigned to the alert.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssignee() {
    return assignee;
  }

  /**
   * The email address of the user assigned to the alert.
   * @param assignee assignee or {@code null} for none
   */
  public AlertMetadata setAssignee(java.lang.String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Output only. The unique identifier of the Google account of the customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * Output only. The unique identifier of the Google account of the customer.
   * @param customerId customerId or {@code null} for none
   */
  public AlertMetadata setCustomerId(java.lang.String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Optional. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of an alert metadata from overwriting each other. It is strongly suggested
   * that systems make use of the `etag` in the read-modify-write cycle to perform metatdata updates
   * in order to avoid race conditions: An `etag` is returned in the response which contains alert
   * metadata, and systems are expected to put that etag in the request to update alert metadata to
   * ensure that their change will be applied to the same version of the alert metadata.
   *
   * If no `etag` is provided in the call to update alert metadata, then the existing alert metadata
   * is overwritten blindly.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of an alert metadata from overwriting each other. It is strongly suggested
   * that systems make use of the `etag` in the read-modify-write cycle to perform metatdata updates
   * in order to avoid race conditions: An `etag` is returned in the response which contains alert
   * metadata, and systems are expected to put that etag in the request to update alert metadata to
   * ensure that their change will be applied to the same version of the alert metadata.
   *
   * If no `etag` is provided in the call to update alert metadata, then the existing alert metadata
   * is overwritten blindly.
   * @param etag etag or {@code null} for none
   */
  public AlertMetadata setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The severity value of the alert. Alert Center will set this field at alert creation time,
   * default's to an empty string when it could not be determined. The supported values for update
   * actions on this field are the following:
   *
   * * HIGH * MEDIUM * LOW
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity value of the alert. Alert Center will set this field at alert creation time,
   * default's to an empty string when it could not be determined. The supported values for update
   * actions on this field are the following:
   *
   * * HIGH * MEDIUM * LOW
   * @param severity severity or {@code null} for none
   */
  public AlertMetadata setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The current status of the alert. The supported values are the following:
   *
   * * NOT_STARTED * IN_PROGRESS * CLOSED
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The current status of the alert. The supported values are the following:
   *
   * * NOT_STARTED * IN_PROGRESS * CLOSED
   * @param status status or {@code null} for none
   */
  public AlertMetadata setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. The time this metadata was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time this metadata was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public AlertMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public AlertMetadata set(String fieldName, Object value) {
    return (AlertMetadata) super.set(fieldName, value);
  }

  @Override
  public AlertMetadata clone() {
    return (AlertMetadata) super.clone();
  }

}