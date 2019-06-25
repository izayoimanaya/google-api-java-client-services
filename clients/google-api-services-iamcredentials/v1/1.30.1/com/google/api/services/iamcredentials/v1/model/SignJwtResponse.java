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

package com.google.api.services.iamcredentials.v1.model;

/**
 * Model definition for SignJwtResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the IAM Service Account Credentials API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SignJwtResponse extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the key used to sign the JWT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyId;

  /**
   * The signed JWT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String signedJwt;

  /**
   * The ID of the key used to sign the JWT.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyId() {
    return keyId;
  }

  /**
   * The ID of the key used to sign the JWT.
   * @param keyId keyId or {@code null} for none
   */
  public SignJwtResponse setKeyId(java.lang.String keyId) {
    this.keyId = keyId;
    return this;
  }

  /**
   * The signed JWT.
   * @return value or {@code null} for none
   */
  public java.lang.String getSignedJwt() {
    return signedJwt;
  }

  /**
   * The signed JWT.
   * @param signedJwt signedJwt or {@code null} for none
   */
  public SignJwtResponse setSignedJwt(java.lang.String signedJwt) {
    this.signedJwt = signedJwt;
    return this;
  }

  @Override
  public SignJwtResponse set(String fieldName, Object value) {
    return (SignJwtResponse) super.set(fieldName, value);
  }

  @Override
  public SignJwtResponse clone() {
    return (SignJwtResponse) super.clone();
  }

}
