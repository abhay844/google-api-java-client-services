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

package com.google.api.services.content.model;

/**
 * Model definition for TestOrderDeliveryDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestOrderDeliveryDetails extends com.google.api.client.json.GenericJson {

  /**
   * The delivery address
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestOrderAddress address;

  /**
   * Whether the order is scheduled delivery order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isScheduledDelivery;

  /**
   * The phone number of the person receiving the delivery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * The delivery address
   * @return value or {@code null} for none
   */
  public TestOrderAddress getAddress() {
    return address;
  }

  /**
   * The delivery address
   * @param address address or {@code null} for none
   */
  public TestOrderDeliveryDetails setAddress(TestOrderAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Whether the order is scheduled delivery order.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsScheduledDelivery() {
    return isScheduledDelivery;
  }

  /**
   * Whether the order is scheduled delivery order.
   * @param isScheduledDelivery isScheduledDelivery or {@code null} for none
   */
  public TestOrderDeliveryDetails setIsScheduledDelivery(java.lang.Boolean isScheduledDelivery) {
    this.isScheduledDelivery = isScheduledDelivery;
    return this;
  }

  /**
   * The phone number of the person receiving the delivery.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * The phone number of the person receiving the delivery.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public TestOrderDeliveryDetails setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  @Override
  public TestOrderDeliveryDetails set(String fieldName, Object value) {
    return (TestOrderDeliveryDetails) super.set(fieldName, value);
  }

  @Override
  public TestOrderDeliveryDetails clone() {
    return (TestOrderDeliveryDetails) super.clone();
  }

}
