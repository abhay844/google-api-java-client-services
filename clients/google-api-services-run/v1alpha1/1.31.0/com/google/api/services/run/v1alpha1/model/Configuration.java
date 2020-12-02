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
 * Configuration represents the "floating HEAD" of a linear history of Revisions, and optionally how
 * the containers those revisions reference are built. Users create new Revisions by updating the
 * Configuration's spec. The "latest created" revision's name is available under status, as is the
 * "latest ready" revision's name. See also:
 * https://github.com/knative/serving/blob/master/docs/spec/overview.md#configuration
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Configuration extends com.google.api.client.json.GenericJson {

  /**
   * The API version for this call such as "serving.knative.dev/v1alpha1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * The kind of resource, in this case always "Configuration".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metadata associated with this Configuration, including name, namespace, labels, and
   * annotations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObjectMeta metadata;

  /**
   * Spec holds the desired state of the Configuration (from the client).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigurationSpec spec;

  /**
   * Status communicates the observed state of the Configuration (from the controller).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigurationStatus status;

  /**
   * The API version for this call such as "serving.knative.dev/v1alpha1".
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * The API version for this call such as "serving.knative.dev/v1alpha1".
   * @param apiVersion apiVersion or {@code null} for none
   */
  public Configuration setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * The kind of resource, in this case always "Configuration".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource, in this case always "Configuration".
   * @param kind kind or {@code null} for none
   */
  public Configuration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metadata associated with this Configuration, including name, namespace, labels, and
   * annotations.
   * @return value or {@code null} for none
   */
  public ObjectMeta getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with this Configuration, including name, namespace, labels, and
   * annotations.
   * @param metadata metadata or {@code null} for none
   */
  public Configuration setMetadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Spec holds the desired state of the Configuration (from the client).
   * @return value or {@code null} for none
   */
  public ConfigurationSpec getSpec() {
    return spec;
  }

  /**
   * Spec holds the desired state of the Configuration (from the client).
   * @param spec spec or {@code null} for none
   */
  public Configuration setSpec(ConfigurationSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Status communicates the observed state of the Configuration (from the controller).
   * @return value or {@code null} for none
   */
  public ConfigurationStatus getStatus() {
    return status;
  }

  /**
   * Status communicates the observed state of the Configuration (from the controller).
   * @param status status or {@code null} for none
   */
  public Configuration setStatus(ConfigurationStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public Configuration set(String fieldName, Object value) {
    return (Configuration) super.set(fieldName, value);
  }

  @Override
  public Configuration clone() {
    return (Configuration) super.clone();
  }

}
