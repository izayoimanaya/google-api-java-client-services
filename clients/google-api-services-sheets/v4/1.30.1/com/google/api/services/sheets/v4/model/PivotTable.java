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
 * A pivot table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PivotTable extends com.google.api.client.json.GenericJson {

  /**
   * Each column grouping in the pivot table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PivotGroup> columns;

  static {
    // hack to force ProGuard to consider PivotGroup used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PivotGroup.class);
  }

  /**
   * An optional mapping of filters per source column offset. The filters are applied before
   * aggregating data into the pivot table. The map's key is the column offset of the source range
   * that you want to filter, and the value is the criteria for that column. For example, if the
   * source was `C10:E15`, a key of `0` will have the filter for column `C`, whereas the key `1` is
   * for column `D`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, PivotFilterCriteria> criteria;

  static {
    // hack to force ProGuard to consider PivotFilterCriteria used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PivotFilterCriteria.class);
  }

  /**
   * Each row grouping in the pivot table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PivotGroup> rows;

  static {
    // hack to force ProGuard to consider PivotGroup used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PivotGroup.class);
  }

  /**
   * The range the pivot table is reading data from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange source;

  /**
   * Whether values should be listed horizontally (as columns) or vertically (as rows).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueLayout;

  /**
   * A list of values to include in the pivot table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PivotValue> values;

  /**
   * Each column grouping in the pivot table.
   * @return value or {@code null} for none
   */
  public java.util.List<PivotGroup> getColumns() {
    return columns;
  }

  /**
   * Each column grouping in the pivot table.
   * @param columns columns or {@code null} for none
   */
  public PivotTable setColumns(java.util.List<PivotGroup> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * An optional mapping of filters per source column offset. The filters are applied before
   * aggregating data into the pivot table. The map's key is the column offset of the source range
   * that you want to filter, and the value is the criteria for that column. For example, if the
   * source was `C10:E15`, a key of `0` will have the filter for column `C`, whereas the key `1` is
   * for column `D`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, PivotFilterCriteria> getCriteria() {
    return criteria;
  }

  /**
   * An optional mapping of filters per source column offset. The filters are applied before
   * aggregating data into the pivot table. The map's key is the column offset of the source range
   * that you want to filter, and the value is the criteria for that column. For example, if the
   * source was `C10:E15`, a key of `0` will have the filter for column `C`, whereas the key `1` is
   * for column `D`.
   * @param criteria criteria or {@code null} for none
   */
  public PivotTable setCriteria(java.util.Map<String, PivotFilterCriteria> criteria) {
    this.criteria = criteria;
    return this;
  }

  /**
   * Each row grouping in the pivot table.
   * @return value or {@code null} for none
   */
  public java.util.List<PivotGroup> getRows() {
    return rows;
  }

  /**
   * Each row grouping in the pivot table.
   * @param rows rows or {@code null} for none
   */
  public PivotTable setRows(java.util.List<PivotGroup> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * The range the pivot table is reading data from.
   * @return value or {@code null} for none
   */
  public GridRange getSource() {
    return source;
  }

  /**
   * The range the pivot table is reading data from.
   * @param source source or {@code null} for none
   */
  public PivotTable setSource(GridRange source) {
    this.source = source;
    return this;
  }

  /**
   * Whether values should be listed horizontally (as columns) or vertically (as rows).
   * @return value or {@code null} for none
   */
  public java.lang.String getValueLayout() {
    return valueLayout;
  }

  /**
   * Whether values should be listed horizontally (as columns) or vertically (as rows).
   * @param valueLayout valueLayout or {@code null} for none
   */
  public PivotTable setValueLayout(java.lang.String valueLayout) {
    this.valueLayout = valueLayout;
    return this;
  }

  /**
   * A list of values to include in the pivot table.
   * @return value or {@code null} for none
   */
  public java.util.List<PivotValue> getValues() {
    return values;
  }

  /**
   * A list of values to include in the pivot table.
   * @param values values or {@code null} for none
   */
  public PivotTable setValues(java.util.List<PivotValue> values) {
    this.values = values;
    return this;
  }

  @Override
  public PivotTable set(String fieldName, Object value) {
    return (PivotTable) super.set(fieldName, value);
  }

  @Override
  public PivotTable clone() {
    return (PivotTable) super.clone();
  }

}
