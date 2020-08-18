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
 * The definition of how a value in a pivot table should be calculated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PivotValue extends com.google.api.client.json.GenericJson {

  /**
   * If specified, indicates that pivot values should be displayed as the result of a calculation
   * with another pivot value. For example, if calculated_display_type is specified as
   * PERCENT_OF_GRAND_TOTAL, all the pivot values are displayed as the percentage of the grand
   * total. In the Sheets UI, this is referred to as "Show As" in the value section of a pivot
   * table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String calculatedDisplayType;

  /**
   * A custom formula to calculate the value. The formula must start with an `=` character.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formula;

  /**
   * A name to use for the value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The column offset of the source range that this value reads from. For example, if the source
   * was `C10:E15`, a `sourceColumnOffset` of `0` means this value refers to column `C`, whereas the
   * offset `1` would refer to column `D`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sourceColumnOffset;

  /**
   * A function to summarize the value. If formula is set, the only supported values are SUM and
   * CUSTOM. If sourceColumnOffset is set, then `CUSTOM` is not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String summarizeFunction;

  /**
   * If specified, indicates that pivot values should be displayed as the result of a calculation
   * with another pivot value. For example, if calculated_display_type is specified as
   * PERCENT_OF_GRAND_TOTAL, all the pivot values are displayed as the percentage of the grand
   * total. In the Sheets UI, this is referred to as "Show As" in the value section of a pivot
   * table.
   * @return value or {@code null} for none
   */
  public java.lang.String getCalculatedDisplayType() {
    return calculatedDisplayType;
  }

  /**
   * If specified, indicates that pivot values should be displayed as the result of a calculation
   * with another pivot value. For example, if calculated_display_type is specified as
   * PERCENT_OF_GRAND_TOTAL, all the pivot values are displayed as the percentage of the grand
   * total. In the Sheets UI, this is referred to as "Show As" in the value section of a pivot
   * table.
   * @param calculatedDisplayType calculatedDisplayType or {@code null} for none
   */
  public PivotValue setCalculatedDisplayType(java.lang.String calculatedDisplayType) {
    this.calculatedDisplayType = calculatedDisplayType;
    return this;
  }

  /**
   * A custom formula to calculate the value. The formula must start with an `=` character.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormula() {
    return formula;
  }

  /**
   * A custom formula to calculate the value. The formula must start with an `=` character.
   * @param formula formula or {@code null} for none
   */
  public PivotValue setFormula(java.lang.String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * A name to use for the value.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A name to use for the value.
   * @param name name or {@code null} for none
   */
  public PivotValue setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The column offset of the source range that this value reads from. For example, if the source
   * was `C10:E15`, a `sourceColumnOffset` of `0` means this value refers to column `C`, whereas the
   * offset `1` would refer to column `D`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSourceColumnOffset() {
    return sourceColumnOffset;
  }

  /**
   * The column offset of the source range that this value reads from. For example, if the source
   * was `C10:E15`, a `sourceColumnOffset` of `0` means this value refers to column `C`, whereas the
   * offset `1` would refer to column `D`.
   * @param sourceColumnOffset sourceColumnOffset or {@code null} for none
   */
  public PivotValue setSourceColumnOffset(java.lang.Integer sourceColumnOffset) {
    this.sourceColumnOffset = sourceColumnOffset;
    return this;
  }

  /**
   * A function to summarize the value. If formula is set, the only supported values are SUM and
   * CUSTOM. If sourceColumnOffset is set, then `CUSTOM` is not supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getSummarizeFunction() {
    return summarizeFunction;
  }

  /**
   * A function to summarize the value. If formula is set, the only supported values are SUM and
   * CUSTOM. If sourceColumnOffset is set, then `CUSTOM` is not supported.
   * @param summarizeFunction summarizeFunction or {@code null} for none
   */
  public PivotValue setSummarizeFunction(java.lang.String summarizeFunction) {
    this.summarizeFunction = summarizeFunction;
    return this;
  }

  @Override
  public PivotValue set(String fieldName, Object value) {
    return (PivotValue) super.set(fieldName, value);
  }

  @Override
  public PivotValue clone() {
    return (PivotValue) super.clone();
  }

}
