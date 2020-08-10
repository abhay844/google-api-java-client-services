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

package com.google.api.services.playablelocations.v3;

/**
 * Service definition for PlayableLocations (v3).
 *
 * <p>
 * 
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/maps/contact-sales/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link PlayableLocationsRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class PlayableLocations extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.10 of the Playable Locations API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://playablelocations.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public PlayableLocations(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  PlayableLocations(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the V3 collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code PlayableLocations playablelocations = new PlayableLocations(...);}
   *   {@code PlayableLocations.V3.List request = playablelocations.v3().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public V3 v3() {
    return new V3();
  }

  /**
   * The "v3" collection of methods.
   */
  public class V3 {

    /**
     * Logs new events when playable locations are displayed, and when they are interacted with.
     * Impressions are not partially saved; either all impressions are saved and this request succeeds,
     * or no impressions are saved, and this request fails.
     *
     * Create a request for the method "v3.logImpressions".
     *
     * This request holds the parameters needed by the playablelocations server.  After setting any
     * optional parameters, call the {@link LogImpressions#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogImpressionsRequest}
     * @return the request
     */
    public LogImpressions logImpressions(com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogImpressionsRequest content) throws java.io.IOException {
      LogImpressions result = new LogImpressions(content);
      initialize(result);
      return result;
    }

    public class LogImpressions extends PlayableLocationsRequest<com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogImpressionsResponse> {

      private static final String REST_PATH = "v3:logImpressions";

      /**
       * Logs new events when playable locations are displayed, and when they are interacted with.
       * Impressions are not partially saved; either all impressions are saved and this request
       * succeeds, or no impressions are saved, and this request fails.
       *
       * Create a request for the method "v3.logImpressions".
       *
       * This request holds the parameters needed by the the playablelocations server.  After setting
       * any optional parameters, call the {@link LogImpressions#execute()} method to invoke the remote
       * operation. <p> {@link LogImpressions#initialize(com.google.api.client.googleapis.services.Abstr
       * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param content the {@link com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogImpressionsRequest}
       * @since 1.13
       */
      protected LogImpressions(com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogImpressionsRequest content) {
        super(PlayableLocations.this, "POST", REST_PATH, content, com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogImpressionsResponse.class);
      }

      @Override
      public LogImpressions set$Xgafv(java.lang.String $Xgafv) {
        return (LogImpressions) super.set$Xgafv($Xgafv);
      }

      @Override
      public LogImpressions setAccessToken(java.lang.String accessToken) {
        return (LogImpressions) super.setAccessToken(accessToken);
      }

      @Override
      public LogImpressions setAlt(java.lang.String alt) {
        return (LogImpressions) super.setAlt(alt);
      }

      @Override
      public LogImpressions setCallback(java.lang.String callback) {
        return (LogImpressions) super.setCallback(callback);
      }

      @Override
      public LogImpressions setFields(java.lang.String fields) {
        return (LogImpressions) super.setFields(fields);
      }

      @Override
      public LogImpressions setKey(java.lang.String key) {
        return (LogImpressions) super.setKey(key);
      }

      @Override
      public LogImpressions setOauthToken(java.lang.String oauthToken) {
        return (LogImpressions) super.setOauthToken(oauthToken);
      }

      @Override
      public LogImpressions setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (LogImpressions) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public LogImpressions setQuotaUser(java.lang.String quotaUser) {
        return (LogImpressions) super.setQuotaUser(quotaUser);
      }

      @Override
      public LogImpressions setUploadType(java.lang.String uploadType) {
        return (LogImpressions) super.setUploadType(uploadType);
      }

      @Override
      public LogImpressions setUploadProtocol(java.lang.String uploadProtocol) {
        return (LogImpressions) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public LogImpressions set(String parameterName, Object value) {
        return (LogImpressions) super.set(parameterName, value);
      }
    }
    /**
     * Logs bad playable location reports submitted by players. Reports are not partially saved; either
     * all reports are saved and this request succeeds, or no reports are saved, and this request fails.
     *
     * Create a request for the method "v3.logPlayerReports".
     *
     * This request holds the parameters needed by the playablelocations server.  After setting any
     * optional parameters, call the {@link LogPlayerReports#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogPlayerReportsRequest}
     * @return the request
     */
    public LogPlayerReports logPlayerReports(com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogPlayerReportsRequest content) throws java.io.IOException {
      LogPlayerReports result = new LogPlayerReports(content);
      initialize(result);
      return result;
    }

    public class LogPlayerReports extends PlayableLocationsRequest<com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogPlayerReportsResponse> {

      private static final String REST_PATH = "v3:logPlayerReports";

      /**
       * Logs bad playable location reports submitted by players. Reports are not partially saved;
       * either all reports are saved and this request succeeds, or no reports are saved, and this
       * request fails.
       *
       * Create a request for the method "v3.logPlayerReports".
       *
       * This request holds the parameters needed by the the playablelocations server.  After setting
       * any optional parameters, call the {@link LogPlayerReports#execute()} method to invoke the
       * remote operation. <p> {@link LogPlayerReports#initialize(com.google.api.client.googleapis.servi
       * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogPlayerReportsRequest}
       * @since 1.13
       */
      protected LogPlayerReports(com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogPlayerReportsRequest content) {
        super(PlayableLocations.this, "POST", REST_PATH, content, com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3LogPlayerReportsResponse.class);
      }

      @Override
      public LogPlayerReports set$Xgafv(java.lang.String $Xgafv) {
        return (LogPlayerReports) super.set$Xgafv($Xgafv);
      }

      @Override
      public LogPlayerReports setAccessToken(java.lang.String accessToken) {
        return (LogPlayerReports) super.setAccessToken(accessToken);
      }

      @Override
      public LogPlayerReports setAlt(java.lang.String alt) {
        return (LogPlayerReports) super.setAlt(alt);
      }

      @Override
      public LogPlayerReports setCallback(java.lang.String callback) {
        return (LogPlayerReports) super.setCallback(callback);
      }

      @Override
      public LogPlayerReports setFields(java.lang.String fields) {
        return (LogPlayerReports) super.setFields(fields);
      }

      @Override
      public LogPlayerReports setKey(java.lang.String key) {
        return (LogPlayerReports) super.setKey(key);
      }

      @Override
      public LogPlayerReports setOauthToken(java.lang.String oauthToken) {
        return (LogPlayerReports) super.setOauthToken(oauthToken);
      }

      @Override
      public LogPlayerReports setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (LogPlayerReports) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public LogPlayerReports setQuotaUser(java.lang.String quotaUser) {
        return (LogPlayerReports) super.setQuotaUser(quotaUser);
      }

      @Override
      public LogPlayerReports setUploadType(java.lang.String uploadType) {
        return (LogPlayerReports) super.setUploadType(uploadType);
      }

      @Override
      public LogPlayerReports setUploadProtocol(java.lang.String uploadProtocol) {
        return (LogPlayerReports) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public LogPlayerReports set(String parameterName, Object value) {
        return (LogPlayerReports) super.set(parameterName, value);
      }
    }
    /**
     * Returns a set of playable locations that lie within a specified area, that satisfy optional
     * filter criteria. Note: Identical `SamplePlayableLocations` requests can return different results
     * as the state of the world changes over time.
     *
     * Create a request for the method "v3.samplePlayableLocations".
     *
     * This request holds the parameters needed by the playablelocations server.  After setting any
     * optional parameters, call the {@link SamplePlayableLocations#execute()} method to invoke the
     * remote operation.
     *
     * @param content the {@link com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest}
     * @return the request
     */
    public SamplePlayableLocations samplePlayableLocations(com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest content) throws java.io.IOException {
      SamplePlayableLocations result = new SamplePlayableLocations(content);
      initialize(result);
      return result;
    }

    public class SamplePlayableLocations extends PlayableLocationsRequest<com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse> {

      private static final String REST_PATH = "v3:samplePlayableLocations";

      /**
       * Returns a set of playable locations that lie within a specified area, that satisfy optional
       * filter criteria. Note: Identical `SamplePlayableLocations` requests can return different
       * results as the state of the world changes over time.
       *
       * Create a request for the method "v3.samplePlayableLocations".
       *
       * This request holds the parameters needed by the the playablelocations server.  After setting
       * any optional parameters, call the {@link SamplePlayableLocations#execute()} method to invoke
       * the remote operation. <p> {@link SamplePlayableLocations#initialize(com.google.api.client.googl
       * eapis.services.AbstractGoogleClientRequest)} must be called to initialize this instance
       * immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest}
       * @since 1.13
       */
      protected SamplePlayableLocations(com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest content) {
        super(PlayableLocations.this, "POST", REST_PATH, content, com.google.api.services.playablelocations.v3.model.GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse.class);
      }

      @Override
      public SamplePlayableLocations set$Xgafv(java.lang.String $Xgafv) {
        return (SamplePlayableLocations) super.set$Xgafv($Xgafv);
      }

      @Override
      public SamplePlayableLocations setAccessToken(java.lang.String accessToken) {
        return (SamplePlayableLocations) super.setAccessToken(accessToken);
      }

      @Override
      public SamplePlayableLocations setAlt(java.lang.String alt) {
        return (SamplePlayableLocations) super.setAlt(alt);
      }

      @Override
      public SamplePlayableLocations setCallback(java.lang.String callback) {
        return (SamplePlayableLocations) super.setCallback(callback);
      }

      @Override
      public SamplePlayableLocations setFields(java.lang.String fields) {
        return (SamplePlayableLocations) super.setFields(fields);
      }

      @Override
      public SamplePlayableLocations setKey(java.lang.String key) {
        return (SamplePlayableLocations) super.setKey(key);
      }

      @Override
      public SamplePlayableLocations setOauthToken(java.lang.String oauthToken) {
        return (SamplePlayableLocations) super.setOauthToken(oauthToken);
      }

      @Override
      public SamplePlayableLocations setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (SamplePlayableLocations) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public SamplePlayableLocations setQuotaUser(java.lang.String quotaUser) {
        return (SamplePlayableLocations) super.setQuotaUser(quotaUser);
      }

      @Override
      public SamplePlayableLocations setUploadType(java.lang.String uploadType) {
        return (SamplePlayableLocations) super.setUploadType(uploadType);
      }

      @Override
      public SamplePlayableLocations setUploadProtocol(java.lang.String uploadProtocol) {
        return (SamplePlayableLocations) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public SamplePlayableLocations set(String parameterName, Object value) {
        return (SamplePlayableLocations) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link PlayableLocations}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link PlayableLocations}. */
    @Override
    public PlayableLocations build() {
      return new PlayableLocations(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link PlayableLocationsRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setPlayableLocationsRequestInitializer(
        PlayableLocationsRequestInitializer playablelocationsRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(playablelocationsRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
