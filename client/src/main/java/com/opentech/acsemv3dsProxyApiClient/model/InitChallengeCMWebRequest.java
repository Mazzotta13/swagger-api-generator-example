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
import com.opentech.acsemv3dsProxyApiClient.model.TransactionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InitChallengeCMWebRequest
 */

public class InitChallengeCMWebRequest {
  @JsonProperty("arrivalCondition")
  private String arrivalCondition = null;

  @JsonProperty("authenticationName")
  private String authenticationName = null;

  @JsonProperty("deviceChannel")
  private String deviceChannel = null;

  @JsonProperty("transactionInfo")
  private TransactionInfo transactionInfo = null;

  public InitChallengeCMWebRequest arrivalCondition(String arrivalCondition) {
    this.arrivalCondition = arrivalCondition;
    return this;
  }

   /**
   * Get arrivalCondition
   * @return arrivalCondition
  **/
  @ApiModelProperty(value = "")
  public String getArrivalCondition() {
    return arrivalCondition;
  }

  public void setArrivalCondition(String arrivalCondition) {
    this.arrivalCondition = arrivalCondition;
  }

  public InitChallengeCMWebRequest authenticationName(String authenticationName) {
    this.authenticationName = authenticationName;
    return this;
  }

   /**
   * Get authenticationName
   * @return authenticationName
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationName() {
    return authenticationName;
  }

  public void setAuthenticationName(String authenticationName) {
    this.authenticationName = authenticationName;
  }

  public InitChallengeCMWebRequest deviceChannel(String deviceChannel) {
    this.deviceChannel = deviceChannel;
    return this;
  }

   /**
   * Get deviceChannel
   * @return deviceChannel
  **/
  @ApiModelProperty(value = "")
  public String getDeviceChannel() {
    return deviceChannel;
  }

  public void setDeviceChannel(String deviceChannel) {
    this.deviceChannel = deviceChannel;
  }

  public InitChallengeCMWebRequest transactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }

   /**
   * Get transactionInfo
   * @return transactionInfo
  **/
  @ApiModelProperty(value = "")
  public TransactionInfo getTransactionInfo() {
    return transactionInfo;
  }

  public void setTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitChallengeCMWebRequest initChallengeCMWebRequest = (InitChallengeCMWebRequest) o;
    return Objects.equals(this.arrivalCondition, initChallengeCMWebRequest.arrivalCondition) &&
        Objects.equals(this.authenticationName, initChallengeCMWebRequest.authenticationName) &&
        Objects.equals(this.deviceChannel, initChallengeCMWebRequest.deviceChannel) &&
        Objects.equals(this.transactionInfo, initChallengeCMWebRequest.transactionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalCondition, authenticationName, deviceChannel, transactionInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitChallengeCMWebRequest {\n");
    
    sb.append("    arrivalCondition: ").append(toIndentedString(arrivalCondition)).append("\n");
    sb.append("    authenticationName: ").append(toIndentedString(authenticationName)).append("\n");
    sb.append("    deviceChannel: ").append(toIndentedString(deviceChannel)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
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

