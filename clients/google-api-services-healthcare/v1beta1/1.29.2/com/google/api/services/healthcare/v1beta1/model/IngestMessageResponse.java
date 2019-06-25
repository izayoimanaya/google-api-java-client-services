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
 * Acknowledges that a message has been ingested into the specified HL7v2 store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IngestMessageResponse extends com.google.api.client.json.GenericJson {

  /**
   * HL7v2 ACK message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hl7Ack;

  /**
   * Created message resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Message message;

  /**
   * HL7v2 ACK message.
   * @see #decodeHl7Ack()
   * @return value or {@code null} for none
   */
  public java.lang.String getHl7Ack() {
    return hl7Ack;
  }

  /**
   * HL7v2 ACK message.
   * @see #getHl7Ack()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeHl7Ack() {
    return com.google.api.client.util.Base64.decodeBase64(hl7Ack);
  }

  /**
   * HL7v2 ACK message.
   * @see #encodeHl7Ack()
   * @param hl7Ack hl7Ack or {@code null} for none
   */
  public IngestMessageResponse setHl7Ack(java.lang.String hl7Ack) {
    this.hl7Ack = hl7Ack;
    return this;
  }

  /**
   * HL7v2 ACK message.
   * @see #setHl7Ack()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public IngestMessageResponse encodeHl7Ack(byte[] hl7Ack) {
    this.hl7Ack = com.google.api.client.util.Base64.encodeBase64URLSafeString(hl7Ack);
    return this;
  }

  /**
   * Created message resource.
   * @return value or {@code null} for none
   */
  public Message getMessage() {
    return message;
  }

  /**
   * Created message resource.
   * @param message message or {@code null} for none
   */
  public IngestMessageResponse setMessage(Message message) {
    this.message = message;
    return this;
  }

  @Override
  public IngestMessageResponse set(String fieldName, Object value) {
    return (IngestMessageResponse) super.set(fieldName, value);
  }

  @Override
  public IngestMessageResponse clone() {
    return (IngestMessageResponse) super.clone();
  }

}
