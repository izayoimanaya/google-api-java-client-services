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

package com.google.api.services.iam.v1.model;

/**
 * Audit log information specific to Cloud IAM. This message is serialized as an `Any` type in the
 * `ServiceData` message of an `AuditLog` message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuditData extends com.google.api.client.json.GenericJson {

  /**
   * Policy delta between the original policy and the newly set policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyDelta policyDelta;

  /**
   * Policy delta between the original policy and the newly set policy.
   * @return value or {@code null} for none
   */
  public PolicyDelta getPolicyDelta() {
    return policyDelta;
  }

  /**
   * Policy delta between the original policy and the newly set policy.
   * @param policyDelta policyDelta or {@code null} for none
   */
  public AuditData setPolicyDelta(PolicyDelta policyDelta) {
    this.policyDelta = policyDelta;
    return this;
  }

  @Override
  public AuditData set(String fieldName, Object value) {
    return (AuditData) super.set(fieldName, value);
  }

  @Override
  public AuditData clone() {
    return (AuditData) super.clone();
  }

}
