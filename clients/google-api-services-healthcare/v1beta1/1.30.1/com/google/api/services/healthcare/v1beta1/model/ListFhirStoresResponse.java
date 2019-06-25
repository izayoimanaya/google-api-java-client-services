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
 * Lists the FHIR stores in the given dataset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListFhirStoresResponse extends com.google.api.client.json.GenericJson {

  /**
   * The returned FHIR stores. Won't be more FHIR stores than the value of page_size in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FhirStore> fhirStores;

  static {
    // hack to force ProGuard to consider FhirStore used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FhirStore.class);
  }

  /**
   * Token to retrieve the next page of results or empty if there are no more results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The returned FHIR stores. Won't be more FHIR stores than the value of page_size in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<FhirStore> getFhirStores() {
    return fhirStores;
  }

  /**
   * The returned FHIR stores. Won't be more FHIR stores than the value of page_size in the request.
   * @param fhirStores fhirStores or {@code null} for none
   */
  public ListFhirStoresResponse setFhirStores(java.util.List<FhirStore> fhirStores) {
    this.fhirStores = fhirStores;
    return this;
  }

  /**
   * Token to retrieve the next page of results or empty if there are no more results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results or empty if there are no more results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListFhirStoresResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListFhirStoresResponse set(String fieldName, Object value) {
    return (ListFhirStoresResponse) super.set(fieldName, value);
  }

  @Override
  public ListFhirStoresResponse clone() {
    return (ListFhirStoresResponse) super.clone();
  }

}
