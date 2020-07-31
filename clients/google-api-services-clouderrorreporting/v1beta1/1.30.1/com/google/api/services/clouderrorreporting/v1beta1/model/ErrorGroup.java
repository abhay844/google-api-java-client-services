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

package com.google.api.services.clouderrorreporting.v1beta1.model;

/**
 * Description of a group of similar error events.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Error Reporting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ErrorGroup extends com.google.api.client.json.GenericJson {

  /**
   * Group IDs are unique for a given project. If the same kind of error occurs in different service
   * contexts, it will receive the same group ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String groupId;

  /**
   * The group resource name. Example: projects/my-project-123/groups/CNSgkpnppqKCUw
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Error group's resolution status.
   *
   * An unspecified resolution status will be interpreted as OPEN
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resolutionStatus;

  /**
   * Associated tracking issues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TrackingIssue> trackingIssues;

  /**
   * Group IDs are unique for a given project. If the same kind of error occurs in different service
   * contexts, it will receive the same group ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroupId() {
    return groupId;
  }

  /**
   * Group IDs are unique for a given project. If the same kind of error occurs in different service
   * contexts, it will receive the same group ID.
   * @param groupId groupId or {@code null} for none
   */
  public ErrorGroup setGroupId(java.lang.String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The group resource name. Example: projects/my-project-123/groups/CNSgkpnppqKCUw
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The group resource name. Example: projects/my-project-123/groups/CNSgkpnppqKCUw
   * @param name name or {@code null} for none
   */
  public ErrorGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Error group's resolution status.
   *
   * An unspecified resolution status will be interpreted as OPEN
   * @return value or {@code null} for none
   */
  public java.lang.String getResolutionStatus() {
    return resolutionStatus;
  }

  /**
   * Error group's resolution status.
   *
   * An unspecified resolution status will be interpreted as OPEN
   * @param resolutionStatus resolutionStatus or {@code null} for none
   */
  public ErrorGroup setResolutionStatus(java.lang.String resolutionStatus) {
    this.resolutionStatus = resolutionStatus;
    return this;
  }

  /**
   * Associated tracking issues.
   * @return value or {@code null} for none
   */
  public java.util.List<TrackingIssue> getTrackingIssues() {
    return trackingIssues;
  }

  /**
   * Associated tracking issues.
   * @param trackingIssues trackingIssues or {@code null} for none
   */
  public ErrorGroup setTrackingIssues(java.util.List<TrackingIssue> trackingIssues) {
    this.trackingIssues = trackingIssues;
    return this;
  }

  @Override
  public ErrorGroup set(String fieldName, Object value) {
    return (ErrorGroup) super.set(fieldName, value);
  }

  @Override
  public ErrorGroup clone() {
    return (ErrorGroup) super.clone();
  }

}
