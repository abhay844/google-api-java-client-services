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

package com.google.api.services.cloudtrace.v2.model;

/**
 * A collection of `TimeEvent`s. A `TimeEvent` is a time-stamped annotation on the span, consisting
 * of either user-supplied key:value pairs, or details of a message sent/received between Spans.
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
public final class TimeEvents extends com.google.api.client.json.GenericJson {

  /**
   * The number of dropped annotations in all the included time events. If the value is 0, then no
   * annotations were dropped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer droppedAnnotationsCount;

  /**
   * The number of dropped message events in all the included time events. If the value is 0, then
   * no message events were dropped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer droppedMessageEventsCount;

  /**
   * A collection of `TimeEvent`s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TimeEvent> timeEvent;

  static {
    // hack to force ProGuard to consider TimeEvent used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TimeEvent.class);
  }

  /**
   * The number of dropped annotations in all the included time events. If the value is 0, then no
   * annotations were dropped.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDroppedAnnotationsCount() {
    return droppedAnnotationsCount;
  }

  /**
   * The number of dropped annotations in all the included time events. If the value is 0, then no
   * annotations were dropped.
   * @param droppedAnnotationsCount droppedAnnotationsCount or {@code null} for none
   */
  public TimeEvents setDroppedAnnotationsCount(java.lang.Integer droppedAnnotationsCount) {
    this.droppedAnnotationsCount = droppedAnnotationsCount;
    return this;
  }

  /**
   * The number of dropped message events in all the included time events. If the value is 0, then
   * no message events were dropped.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDroppedMessageEventsCount() {
    return droppedMessageEventsCount;
  }

  /**
   * The number of dropped message events in all the included time events. If the value is 0, then
   * no message events were dropped.
   * @param droppedMessageEventsCount droppedMessageEventsCount or {@code null} for none
   */
  public TimeEvents setDroppedMessageEventsCount(java.lang.Integer droppedMessageEventsCount) {
    this.droppedMessageEventsCount = droppedMessageEventsCount;
    return this;
  }

  /**
   * A collection of `TimeEvent`s.
   * @return value or {@code null} for none
   */
  public java.util.List<TimeEvent> getTimeEvent() {
    return timeEvent;
  }

  /**
   * A collection of `TimeEvent`s.
   * @param timeEvent timeEvent or {@code null} for none
   */
  public TimeEvents setTimeEvent(java.util.List<TimeEvent> timeEvent) {
    this.timeEvent = timeEvent;
    return this;
  }

  @Override
  public TimeEvents set(String fieldName, Object value) {
    return (TimeEvents) super.set(fieldName, value);
  }

  @Override
  public TimeEvents clone() {
    return (TimeEvents) super.clone();
  }

}
