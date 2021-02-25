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
import com.opentech.acsemv3dsProxyApiClient.model.AReq;
import com.opentech.acsemv3dsProxyApiClient.model.BrowserInfo;
import com.opentech.acsemv3dsProxyApiClient.model.ThreeRIInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EvaluateAuthenticationWebRequest
 */

public class EvaluateAuthenticationWebRequest {
  @JsonProperty("aReq")
  private AReq aReq = null;

  @JsonProperty("acsTransactionId")
  private String acsTransactionId = null;

  @JsonProperty("browserInfo")
  private BrowserInfo browserInfo = null;

  @JsonProperty("threeRIInfo")
  private ThreeRIInfo threeRIInfo = null;

  @JsonProperty("transactionLanguage")
  private String transactionLanguage = null;

  @JsonProperty("whitelistingEnabled")
  private Boolean whitelistingEnabled = null;

  public EvaluateAuthenticationWebRequest aReq(AReq aReq) {
    this.aReq = aReq;
    return this;
  }

   /**
   * Get aReq
   * @return aReq
  **/
  @ApiModelProperty(value = "")
  public AReq getAReq() {
    return aReq;
  }

  public void setAReq(AReq aReq) {
    this.aReq = aReq;
  }

  public EvaluateAuthenticationWebRequest acsTransactionId(String acsTransactionId) {
    this.acsTransactionId = acsTransactionId;
    return this;
  }

   /**
   * Get acsTransactionId
   * @return acsTransactionId
  **/
  @ApiModelProperty(value = "")
  public String getAcsTransactionId() {
    return acsTransactionId;
  }

  public void setAcsTransactionId(String acsTransactionId) {
    this.acsTransactionId = acsTransactionId;
  }

  public EvaluateAuthenticationWebRequest browserInfo(BrowserInfo browserInfo) {
    this.browserInfo = browserInfo;
    return this;
  }

   /**
   * Get browserInfo
   * @return browserInfo
  **/
  @ApiModelProperty(value = "")
  public BrowserInfo getBrowserInfo() {
    return browserInfo;
  }

  public void setBrowserInfo(BrowserInfo browserInfo) {
    this.browserInfo = browserInfo;
  }

  public EvaluateAuthenticationWebRequest threeRIInfo(ThreeRIInfo threeRIInfo) {
    this.threeRIInfo = threeRIInfo;
    return this;
  }

   /**
   * Get threeRIInfo
   * @return threeRIInfo
  **/
  @ApiModelProperty(value = "")
  public ThreeRIInfo getThreeRIInfo() {
    return threeRIInfo;
  }

  public void setThreeRIInfo(ThreeRIInfo threeRIInfo) {
    this.threeRIInfo = threeRIInfo;
  }

  public EvaluateAuthenticationWebRequest transactionLanguage(String transactionLanguage) {
    this.transactionLanguage = transactionLanguage;
    return this;
  }

   /**
   * Get transactionLanguage
   * @return transactionLanguage
  **/
  @ApiModelProperty(value = "")
  public String getTransactionLanguage() {
    return transactionLanguage;
  }

  public void setTransactionLanguage(String transactionLanguage) {
    this.transactionLanguage = transactionLanguage;
  }

  public EvaluateAuthenticationWebRequest whitelistingEnabled(Boolean whitelistingEnabled) {
    this.whitelistingEnabled = whitelistingEnabled;
    return this;
  }

   /**
   * Get whitelistingEnabled
   * @return whitelistingEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isWhitelistingEnabled() {
    return whitelistingEnabled;
  }

  public void setWhitelistingEnabled(Boolean whitelistingEnabled) {
    this.whitelistingEnabled = whitelistingEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateAuthenticationWebRequest evaluateAuthenticationWebRequest = (EvaluateAuthenticationWebRequest) o;
    return Objects.equals(this.aReq, evaluateAuthenticationWebRequest.aReq) &&
        Objects.equals(this.acsTransactionId, evaluateAuthenticationWebRequest.acsTransactionId) &&
        Objects.equals(this.browserInfo, evaluateAuthenticationWebRequest.browserInfo) &&
        Objects.equals(this.threeRIInfo, evaluateAuthenticationWebRequest.threeRIInfo) &&
        Objects.equals(this.transactionLanguage, evaluateAuthenticationWebRequest.transactionLanguage) &&
        Objects.equals(this.whitelistingEnabled, evaluateAuthenticationWebRequest.whitelistingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aReq, acsTransactionId, browserInfo, threeRIInfo, transactionLanguage, whitelistingEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateAuthenticationWebRequest {\n");
    
    sb.append("    aReq: ").append(toIndentedString(aReq)).append("\n");
    sb.append("    acsTransactionId: ").append(toIndentedString(acsTransactionId)).append("\n");
    sb.append("    browserInfo: ").append(toIndentedString(browserInfo)).append("\n");
    sb.append("    threeRIInfo: ").append(toIndentedString(threeRIInfo)).append("\n");
    sb.append("    transactionLanguage: ").append(toIndentedString(transactionLanguage)).append("\n");
    sb.append("    whitelistingEnabled: ").append(toIndentedString(whitelistingEnabled)).append("\n");
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

