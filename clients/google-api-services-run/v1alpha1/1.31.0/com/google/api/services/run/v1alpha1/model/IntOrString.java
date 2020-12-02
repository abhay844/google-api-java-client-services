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

package com.google.api.services.run.v1alpha1.model;

/**
 * IntOrString is a type that can hold an int32 or a string. When used in JSON or YAML marshalling
 * and unmarshalling, it produces or consumes the inner type. This allows you to have, for example,
 * a JSON field that can accept a name or number.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IntOrString extends com.google.api.client.json.GenericJson {

  /**
   * The int value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer intVal;

  /**
   * The string value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String strVal;

  /**
   * The type of the value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer type;

  /**
   * The int value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIntVal() {
    return intVal;
  }

  /**
   * The int value.
   * @param intVal intVal or {@code null} for none
   */
  public IntOrString setIntVal(java.lang.Integer intVal) {
    this.intVal = intVal;
    return this;
  }

  /**
   * The string value.
   * @return value or {@code null} for none
   */
  public java.lang.String getStrVal() {
    return strVal;
  }

  /**
   * The string value.
   * @param strVal strVal or {@code null} for none
   */
  public IntOrString setStrVal(java.lang.String strVal) {
    this.strVal = strVal;
    return this;
  }

  /**
   * The type of the value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getType() {
    return type;
  }

  /**
   * The type of the value.
   * @param type type or {@code null} for none
   */
  public IntOrString setType(java.lang.Integer type) {
    this.type = type;
    return this;
  }

  @Override
  public IntOrString set(String fieldName, Object value) {
    return (IntOrString) super.set(fieldName, value);
  }

  @Override
  public IntOrString clone() {
    return (IntOrString) super.clone();
  }

}
