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
 * ResendChallengeWebRequest
 */

public class ResendChallengeWebRequest {
  @JsonProperty("authenticationName")
  private String authenticationName = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  public ResendChallengeWebRequest authenticationName(String authenticationName) {
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

  public ResendChallengeWebRequest cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResendChallengeWebRequest resendChallengeWebRequest = (ResendChallengeWebRequest) o;
    return Objects.equals(this.authenticationName, resendChallengeWebRequest.authenticationName) &&
        Objects.equals(this.cardNumber, resendChallengeWebRequest.cardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationName, cardNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResendChallengeWebRequest {\n");
    
    sb.append("    authenticationName: ").append(toIndentedString(authenticationName)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
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

