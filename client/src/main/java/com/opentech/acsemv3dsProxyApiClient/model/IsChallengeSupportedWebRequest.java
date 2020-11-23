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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IsChallengeSupportedWebRequest
 */

public class IsChallengeSupportedWebRequest {
  @JsonProperty("aReq")
  private AReq aReq = null;

  @JsonProperty("authenticationName")
  private String authenticationName = null;

  @JsonProperty("authenticationType")
  private String authenticationType = null;

  public IsChallengeSupportedWebRequest aReq(AReq aReq) {
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

  public IsChallengeSupportedWebRequest authenticationName(String authenticationName) {
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

  public IsChallengeSupportedWebRequest authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Get authenticationType
   * @return authenticationType
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsChallengeSupportedWebRequest isChallengeSupportedWebRequest = (IsChallengeSupportedWebRequest) o;
    return Objects.equals(this.aReq, isChallengeSupportedWebRequest.aReq) &&
        Objects.equals(this.authenticationName, isChallengeSupportedWebRequest.authenticationName) &&
        Objects.equals(this.authenticationType, isChallengeSupportedWebRequest.authenticationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aReq, authenticationName, authenticationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsChallengeSupportedWebRequest {\n");
    
    sb.append("    aReq: ").append(toIndentedString(aReq)).append("\n");
    sb.append("    authenticationName: ").append(toIndentedString(authenticationName)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
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

