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

package com.google.api.services.gameservices.v1beta.model;

/**
 * Agones fleet specification and details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeployedFleet extends com.google.api.client.json.GenericJson {

  /**
   * The name of the Agones fleet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fleet;

  /**
   * The fleet spec retrieved from the Agones fleet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fleetSpec;

  /**
   * The source spec that is used to create the Agones fleet. The GameServerConfig resource may no
   * longer exist in the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SpecSource specSource;

  /**
   * The current status of the Agones fleet. Includes count of game servers in various states.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeployedFleetStatus status;

  /**
   * The name of the Agones fleet.
   * @return value or {@code null} for none
   */
  public java.lang.String getFleet() {
    return fleet;
  }

  /**
   * The name of the Agones fleet.
   * @param fleet fleet or {@code null} for none
   */
  public DeployedFleet setFleet(java.lang.String fleet) {
    this.fleet = fleet;
    return this;
  }

  /**
   * The fleet spec retrieved from the Agones fleet.
   * @return value or {@code null} for none
   */
  public java.lang.String getFleetSpec() {
    return fleetSpec;
  }

  /**
   * The fleet spec retrieved from the Agones fleet.
   * @param fleetSpec fleetSpec or {@code null} for none
   */
  public DeployedFleet setFleetSpec(java.lang.String fleetSpec) {
    this.fleetSpec = fleetSpec;
    return this;
  }

  /**
   * The source spec that is used to create the Agones fleet. The GameServerConfig resource may no
   * longer exist in the system.
   * @return value or {@code null} for none
   */
  public SpecSource getSpecSource() {
    return specSource;
  }

  /**
   * The source spec that is used to create the Agones fleet. The GameServerConfig resource may no
   * longer exist in the system.
   * @param specSource specSource or {@code null} for none
   */
  public DeployedFleet setSpecSource(SpecSource specSource) {
    this.specSource = specSource;
    return this;
  }

  /**
   * The current status of the Agones fleet. Includes count of game servers in various states.
   * @return value or {@code null} for none
   */
  public DeployedFleetStatus getStatus() {
    return status;
  }

  /**
   * The current status of the Agones fleet. Includes count of game servers in various states.
   * @param status status or {@code null} for none
   */
  public DeployedFleet setStatus(DeployedFleetStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public DeployedFleet set(String fieldName, Object value) {
    return (DeployedFleet) super.set(fieldName, value);
  }

  @Override
  public DeployedFleet clone() {
    return (DeployedFleet) super.clone();
  }

}