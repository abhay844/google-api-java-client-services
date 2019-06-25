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

package com.google.api.services.cloudtrace.v1.model;

/**
 * The response message for the `ListTraces` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Trace API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListTracesResponse extends com.google.api.client.json.GenericJson {

  /**
   * If defined, indicates that there are more traces that match the request and that this value
   * should be passed to the next request to continue retrieving additional traces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of trace records as specified by the view parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Trace> traces;

  /**
   * If defined, indicates that there are more traces that match the request and that this value
   * should be passed to the next request to continue retrieving additional traces.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If defined, indicates that there are more traces that match the request and that this value
   * should be passed to the next request to continue retrieving additional traces.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListTracesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of trace records as specified by the view parameter.
   * @return value or {@code null} for none
   */
  public java.util.List<Trace> getTraces() {
    return traces;
  }

  /**
   * List of trace records as specified by the view parameter.
   * @param traces traces or {@code null} for none
   */
  public ListTracesResponse setTraces(java.util.List<Trace> traces) {
    this.traces = traces;
    return this;
  }

  @Override
  public ListTracesResponse set(String fieldName, Object value) {
    return (ListTracesResponse) super.set(fieldName, value);
  }

  @Override
  public ListTracesResponse clone() {
    return (ListTracesResponse) super.clone();
  }

}
