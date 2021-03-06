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

package com.google.api.services.cloudasset.v1.model;

/**
 * A result of Resource Search, containing information of a cloud resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceSearchResult extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The additional searchable attributes of this resource. The attributes may vary from
   * one resource type to another. Examples: `projectId` for Project, `dnsName` for DNS ManagedZone.
   * This field contains a subset of the resource metadata fields that are returned by the List or
   * Get APIs provided by the corresponding GCP service (e.g., Compute Engine). see [API references
   * and supported searchable attributes](https://cloud.google.com/asset-inventory/docs/supported-
   * asset-types#searchable_asset_types) for more information. You can search values of these fields
   * through free text search. However, you should not consume the field programically as the field
   * names and values may change as the GCP service updates to a new incompatible API version. To
   * search against the `additional_attributes`: * use a free text query to match the attributes
   * values. Example: to search `additional_attributes = { dnsName: "foobar" }`, you can issue a
   * query `foobar`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> additionalAttributes;

  /**
   * Required. The type of this resource. Example: `compute.googleapis.com/Disk`. To search against
   * the `asset_type`: * specify the `asset_type` field in your search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetType;

  /**
   * Optional. One or more paragraphs of text description of this resource. Maximum length could be
   * up to 1M bytes. This field is available only when the resource's proto contains it. To search
   * against the `description`: * use a field query. Example: `description:"important instance"` *
   * use a free text query. Example: `"important instance"`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. The display name of this resource. This field is available only when the resource's
   * proto contains it. To search against the `display_name`: * use a field query. Example:
   * `displayName:"My Instance"` * use a free text query. Example: `"My Instance"`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. The folder(s) that this resource belongs to, in the form of folders/{FOLDER_NUMBER}.
   * This field is available when the resource belongs to one or more folders. To search against
   * `folders`: * use a field query. Example: `folders:(123 OR 456)` * specify the `scope` field as
   * this folder in your search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> folders;

  /**
   * Optional. Labels associated with this resource. See [Labelling and grouping GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-
   * platform-resources) for more information. This field is available only when the resource's
   * proto contains it. To search against the `labels`: * use a field query: - query on any label's
   * key or value. Example: `labels:prod` - query by a given label. Example: `labels.env:prod` -
   * query by a given label's existence. Example: `labels.env:*` * use a free text query. Example:
   * `prod`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`. This
   * field is available only when the resource's proto contains it. To search against the
   * `location`: * use a field query. Example: `location:us-west*` * use a free text query. Example:
   * `us-west*`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Required. The full resource name of this resource. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Cloud
   * Asset Inventory Resource Name Format](https://cloud.google.com/asset-inventory/docs/resource-
   * name-format) for more information. To search against the `name`: * use a field query. Example:
   * `name:instance1` * use a free text query. Example: `instance1`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Network tags associated with this resource. Like labels, network tags are a type of
   * annotations used to group GCP resources. See [Labelling GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-
   * platform-resources) for more information. This field is available only when the resource's
   * proto contains it. To search against the `network_tags`: * use a field query. Example:
   * `networkTags:internal` * use a free text query. Example: `internal`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> networkTags;

  /**
   * Optional. The organization that this resource belongs to, in the form of
   * organizations/{ORGANIZATION_NUMBER}. This field is available when the resource belongs to a
   * organization. To search against `organization`: * use a field query. Example:
   * `organization:123` * specify the `scope` field as this organization in your search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organization;

  /**
   * Optional. The project that this resource belongs to, in the form of projects/{PROJECT_NUMBER}.
   * This field is available when the resource belongs to a project. To search against `project`: *
   * use a field query. Example: `project:12345` * specify the `scope` field as this project in your
   * search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * Optional. The additional searchable attributes of this resource. The attributes may vary from
   * one resource type to another. Examples: `projectId` for Project, `dnsName` for DNS ManagedZone.
   * This field contains a subset of the resource metadata fields that are returned by the List or
   * Get APIs provided by the corresponding GCP service (e.g., Compute Engine). see [API references
   * and supported searchable attributes](https://cloud.google.com/asset-inventory/docs/supported-
   * asset-types#searchable_asset_types) for more information. You can search values of these fields
   * through free text search. However, you should not consume the field programically as the field
   * names and values may change as the GCP service updates to a new incompatible API version. To
   * search against the `additional_attributes`: * use a free text query to match the attributes
   * values. Example: to search `additional_attributes = { dnsName: "foobar" }`, you can issue a
   * query `foobar`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getAdditionalAttributes() {
    return additionalAttributes;
  }

  /**
   * Optional. The additional searchable attributes of this resource. The attributes may vary from
   * one resource type to another. Examples: `projectId` for Project, `dnsName` for DNS ManagedZone.
   * This field contains a subset of the resource metadata fields that are returned by the List or
   * Get APIs provided by the corresponding GCP service (e.g., Compute Engine). see [API references
   * and supported searchable attributes](https://cloud.google.com/asset-inventory/docs/supported-
   * asset-types#searchable_asset_types) for more information. You can search values of these fields
   * through free text search. However, you should not consume the field programically as the field
   * names and values may change as the GCP service updates to a new incompatible API version. To
   * search against the `additional_attributes`: * use a free text query to match the attributes
   * values. Example: to search `additional_attributes = { dnsName: "foobar" }`, you can issue a
   * query `foobar`.
   * @param additionalAttributes additionalAttributes or {@code null} for none
   */
  public ResourceSearchResult setAdditionalAttributes(java.util.Map<String, java.lang.Object> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  /**
   * Required. The type of this resource. Example: `compute.googleapis.com/Disk`. To search against
   * the `asset_type`: * specify the `asset_type` field in your search request.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetType() {
    return assetType;
  }

  /**
   * Required. The type of this resource. Example: `compute.googleapis.com/Disk`. To search against
   * the `asset_type`: * specify the `asset_type` field in your search request.
   * @param assetType assetType or {@code null} for none
   */
  public ResourceSearchResult setAssetType(java.lang.String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Optional. One or more paragraphs of text description of this resource. Maximum length could be
   * up to 1M bytes. This field is available only when the resource's proto contains it. To search
   * against the `description`: * use a field query. Example: `description:"important instance"` *
   * use a free text query. Example: `"important instance"`
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. One or more paragraphs of text description of this resource. Maximum length could be
   * up to 1M bytes. This field is available only when the resource's proto contains it. To search
   * against the `description`: * use a field query. Example: `description:"important instance"` *
   * use a free text query. Example: `"important instance"`
   * @param description description or {@code null} for none
   */
  public ResourceSearchResult setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. The display name of this resource. This field is available only when the resource's
   * proto contains it. To search against the `display_name`: * use a field query. Example:
   * `displayName:"My Instance"` * use a free text query. Example: `"My Instance"`
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. The display name of this resource. This field is available only when the resource's
   * proto contains it. To search against the `display_name`: * use a field query. Example:
   * `displayName:"My Instance"` * use a free text query. Example: `"My Instance"`
   * @param displayName displayName or {@code null} for none
   */
  public ResourceSearchResult setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. The folder(s) that this resource belongs to, in the form of folders/{FOLDER_NUMBER}.
   * This field is available when the resource belongs to one or more folders. To search against
   * `folders`: * use a field query. Example: `folders:(123 OR 456)` * specify the `scope` field as
   * this folder in your search request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFolders() {
    return folders;
  }

  /**
   * Optional. The folder(s) that this resource belongs to, in the form of folders/{FOLDER_NUMBER}.
   * This field is available when the resource belongs to one or more folders. To search against
   * `folders`: * use a field query. Example: `folders:(123 OR 456)` * specify the `scope` field as
   * this folder in your search request.
   * @param folders folders or {@code null} for none
   */
  public ResourceSearchResult setFolders(java.util.List<java.lang.String> folders) {
    this.folders = folders;
    return this;
  }

  /**
   * Optional. Labels associated with this resource. See [Labelling and grouping GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-
   * platform-resources) for more information. This field is available only when the resource's
   * proto contains it. To search against the `labels`: * use a field query: - query on any label's
   * key or value. Example: `labels:prod` - query by a given label. Example: `labels.env:prod` -
   * query by a given label's existence. Example: `labels.env:*` * use a free text query. Example:
   * `prod`
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels associated with this resource. See [Labelling and grouping GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-
   * platform-resources) for more information. This field is available only when the resource's
   * proto contains it. To search against the `labels`: * use a field query: - query on any label's
   * key or value. Example: `labels:prod` - query by a given label. Example: `labels.env:prod` -
   * query by a given label's existence. Example: `labels.env:*` * use a free text query. Example:
   * `prod`
   * @param labels labels or {@code null} for none
   */
  public ResourceSearchResult setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`. This
   * field is available only when the resource's proto contains it. To search against the
   * `location`: * use a field query. Example: `location:us-west*` * use a free text query. Example:
   * `us-west*`
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Optional. Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`. This
   * field is available only when the resource's proto contains it. To search against the
   * `location`: * use a field query. Example: `location:us-west*` * use a free text query. Example:
   * `us-west*`
   * @param location location or {@code null} for none
   */
  public ResourceSearchResult setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Required. The full resource name of this resource. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Cloud
   * Asset Inventory Resource Name Format](https://cloud.google.com/asset-inventory/docs/resource-
   * name-format) for more information. To search against the `name`: * use a field query. Example:
   * `name:instance1` * use a free text query. Example: `instance1`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The full resource name of this resource. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Cloud
   * Asset Inventory Resource Name Format](https://cloud.google.com/asset-inventory/docs/resource-
   * name-format) for more information. To search against the `name`: * use a field query. Example:
   * `name:instance1` * use a free text query. Example: `instance1`
   * @param name name or {@code null} for none
   */
  public ResourceSearchResult setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Network tags associated with this resource. Like labels, network tags are a type of
   * annotations used to group GCP resources. See [Labelling GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-
   * platform-resources) for more information. This field is available only when the resource's
   * proto contains it. To search against the `network_tags`: * use a field query. Example:
   * `networkTags:internal` * use a free text query. Example: `internal`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNetworkTags() {
    return networkTags;
  }

  /**
   * Optional. Network tags associated with this resource. Like labels, network tags are a type of
   * annotations used to group GCP resources. See [Labelling GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-
   * platform-resources) for more information. This field is available only when the resource's
   * proto contains it. To search against the `network_tags`: * use a field query. Example:
   * `networkTags:internal` * use a free text query. Example: `internal`
   * @param networkTags networkTags or {@code null} for none
   */
  public ResourceSearchResult setNetworkTags(java.util.List<java.lang.String> networkTags) {
    this.networkTags = networkTags;
    return this;
  }

  /**
   * Optional. The organization that this resource belongs to, in the form of
   * organizations/{ORGANIZATION_NUMBER}. This field is available when the resource belongs to a
   * organization. To search against `organization`: * use a field query. Example:
   * `organization:123` * specify the `scope` field as this organization in your search request.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganization() {
    return organization;
  }

  /**
   * Optional. The organization that this resource belongs to, in the form of
   * organizations/{ORGANIZATION_NUMBER}. This field is available when the resource belongs to a
   * organization. To search against `organization`: * use a field query. Example:
   * `organization:123` * specify the `scope` field as this organization in your search request.
   * @param organization organization or {@code null} for none
   */
  public ResourceSearchResult setOrganization(java.lang.String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Optional. The project that this resource belongs to, in the form of projects/{PROJECT_NUMBER}.
   * This field is available when the resource belongs to a project. To search against `project`: *
   * use a field query. Example: `project:12345` * specify the `scope` field as this project in your
   * search request.
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * Optional. The project that this resource belongs to, in the form of projects/{PROJECT_NUMBER}.
   * This field is available when the resource belongs to a project. To search against `project`: *
   * use a field query. Example: `project:12345` * specify the `scope` field as this project in your
   * search request.
   * @param project project or {@code null} for none
   */
  public ResourceSearchResult setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  @Override
  public ResourceSearchResult set(String fieldName, Object value) {
    return (ResourceSearchResult) super.set(fieldName, value);
  }

  @Override
  public ResourceSearchResult clone() {
    return (ResourceSearchResult) super.clone();
  }

}
