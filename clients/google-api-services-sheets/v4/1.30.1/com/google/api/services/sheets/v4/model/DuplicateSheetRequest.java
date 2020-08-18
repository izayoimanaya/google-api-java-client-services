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

package com.google.api.services.sheets.v4.model;

/**
 * Duplicates the contents of a sheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DuplicateSheetRequest extends com.google.api.client.json.GenericJson {

  /**
   * The zero-based index where the new sheet should be inserted. The index of all sheets after this
   * are incremented.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer insertSheetIndex;

  /**
   * If set, the ID of the new sheet. If not set, an ID is chosen. If set, the ID must not conflict
   * with any existing sheet ID. If set, it must be non-negative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer newSheetId;

  /**
   * The name of the new sheet. If empty, a new name is chosen for you.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newSheetName;

  /**
   * The sheet to duplicate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sourceSheetId;

  /**
   * The zero-based index where the new sheet should be inserted. The index of all sheets after this
   * are incremented.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInsertSheetIndex() {
    return insertSheetIndex;
  }

  /**
   * The zero-based index where the new sheet should be inserted. The index of all sheets after this
   * are incremented.
   * @param insertSheetIndex insertSheetIndex or {@code null} for none
   */
  public DuplicateSheetRequest setInsertSheetIndex(java.lang.Integer insertSheetIndex) {
    this.insertSheetIndex = insertSheetIndex;
    return this;
  }

  /**
   * If set, the ID of the new sheet. If not set, an ID is chosen. If set, the ID must not conflict
   * with any existing sheet ID. If set, it must be non-negative.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNewSheetId() {
    return newSheetId;
  }

  /**
   * If set, the ID of the new sheet. If not set, an ID is chosen. If set, the ID must not conflict
   * with any existing sheet ID. If set, it must be non-negative.
   * @param newSheetId newSheetId or {@code null} for none
   */
  public DuplicateSheetRequest setNewSheetId(java.lang.Integer newSheetId) {
    this.newSheetId = newSheetId;
    return this;
  }

  /**
   * The name of the new sheet. If empty, a new name is chosen for you.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewSheetName() {
    return newSheetName;
  }

  /**
   * The name of the new sheet. If empty, a new name is chosen for you.
   * @param newSheetName newSheetName or {@code null} for none
   */
  public DuplicateSheetRequest setNewSheetName(java.lang.String newSheetName) {
    this.newSheetName = newSheetName;
    return this;
  }

  /**
   * The sheet to duplicate.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSourceSheetId() {
    return sourceSheetId;
  }

  /**
   * The sheet to duplicate.
   * @param sourceSheetId sourceSheetId or {@code null} for none
   */
  public DuplicateSheetRequest setSourceSheetId(java.lang.Integer sourceSheetId) {
    this.sourceSheetId = sourceSheetId;
    return this;
  }

  @Override
  public DuplicateSheetRequest set(String fieldName, Object value) {
    return (DuplicateSheetRequest) super.set(fieldName, value);
  }

  @Override
  public DuplicateSheetRequest clone() {
    return (DuplicateSheetRequest) super.clone();
  }

}
