/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.opentech.acsemv3dsProxyApiClient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrowserInfo
 */

public class BrowserInfo {
  @JsonProperty("browser")
  private String browser = null;

  @JsonProperty("browserMajorVersion")
  private String browserMajorVersion = null;

  @JsonProperty("browserType")
  private String browserType = null;

  @JsonProperty("deviceType")
  private String deviceType = null;

  @JsonProperty("platform")
  private String platform = null;

  @JsonProperty("platformVersion")
  private String platformVersion = null;

  @JsonProperty("threeDsServerTransId")
  private String threeDsServerTransId = null;

  public BrowserInfo browser(String browser) {
    this.browser = browser;
    return this;
  }

   /**
   * Get browser
   * @return browser
  **/
  @ApiModelProperty(value = "")
  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }

  public BrowserInfo browserMajorVersion(String browserMajorVersion) {
    this.browserMajorVersion = browserMajorVersion;
    return this;
  }

   /**
   * Get browserMajorVersion
   * @return browserMajorVersion
  **/
  @ApiModelProperty(value = "")
  public String getBrowserMajorVersion() {
    return browserMajorVersion;
  }

  public void setBrowserMajorVersion(String browserMajorVersion) {
    this.browserMajorVersion = browserMajorVersion;
  }

  public BrowserInfo browserType(String browserType) {
    this.browserType = browserType;
    return this;
  }

   /**
   * Get browserType
   * @return browserType
  **/
  @ApiModelProperty(value = "")
  public String getBrowserType() {
    return browserType;
  }

  public void setBrowserType(String browserType) {
    this.browserType = browserType;
  }

  public BrowserInfo deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @ApiModelProperty(value = "")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public BrowserInfo platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(value = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public BrowserInfo platformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
    return this;
  }

   /**
   * Get platformVersion
   * @return platformVersion
  **/
  @ApiModelProperty(value = "")
  public String getPlatformVersion() {
    return platformVersion;
  }

  public void setPlatformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
  }

  public BrowserInfo threeDsServerTransId(String threeDsServerTransId) {
    this.threeDsServerTransId = threeDsServerTransId;
    return this;
  }

   /**
   * Get threeDsServerTransId
   * @return threeDsServerTransId
  **/
  @ApiModelProperty(value = "")
  public String getThreeDsServerTransId() {
    return threeDsServerTransId;
  }

  public void setThreeDsServerTransId(String threeDsServerTransId) {
    this.threeDsServerTransId = threeDsServerTransId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserInfo browserInfo = (BrowserInfo) o;
    return Objects.equals(this.browser, browserInfo.browser) &&
        Objects.equals(this.browserMajorVersion, browserInfo.browserMajorVersion) &&
        Objects.equals(this.browserType, browserInfo.browserType) &&
        Objects.equals(this.deviceType, browserInfo.deviceType) &&
        Objects.equals(this.platform, browserInfo.platform) &&
        Objects.equals(this.platformVersion, browserInfo.platformVersion) &&
        Objects.equals(this.threeDsServerTransId, browserInfo.threeDsServerTransId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browser, browserMajorVersion, browserType, deviceType, platform, platformVersion, threeDsServerTransId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserInfo {\n");
    
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    browserMajorVersion: ").append(toIndentedString(browserMajorVersion)).append("\n");
    sb.append("    browserType: ").append(toIndentedString(browserType)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
    sb.append("    threeDsServerTransId: ").append(toIndentedString(threeDsServerTransId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

