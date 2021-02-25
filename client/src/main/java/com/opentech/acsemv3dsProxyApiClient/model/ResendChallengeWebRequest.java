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
import com.opentech.acsemv3dsProxyApiClient.model.CReq;
import com.opentech.acsemv3dsProxyApiClient.model.TransactionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResendChallengeWebRequest
 */

public class ResendChallengeWebRequest {
  @JsonProperty("authenticationName")
  private String authenticationName = null;

  @JsonProperty("cReq")
  private CReq cReq = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  @JsonProperty("transactionInfo")
  private TransactionInfo transactionInfo = null;

  @JsonProperty("whitelistingEnabled")
  private Boolean whitelistingEnabled = null;

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

  public ResendChallengeWebRequest cReq(CReq cReq) {
    this.cReq = cReq;
    return this;
  }

   /**
   * Get cReq
   * @return cReq
  **/
  @ApiModelProperty(value = "")
  public CReq getCReq() {
    return cReq;
  }

  public void setCReq(CReq cReq) {
    this.cReq = cReq;
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

  public ResendChallengeWebRequest transactionInfo(TransactionInfo transactionInfo) {
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

  public ResendChallengeWebRequest whitelistingEnabled(Boolean whitelistingEnabled) {
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
    ResendChallengeWebRequest resendChallengeWebRequest = (ResendChallengeWebRequest) o;
    return Objects.equals(this.authenticationName, resendChallengeWebRequest.authenticationName) &&
        Objects.equals(this.cReq, resendChallengeWebRequest.cReq) &&
        Objects.equals(this.cardNumber, resendChallengeWebRequest.cardNumber) &&
        Objects.equals(this.transactionInfo, resendChallengeWebRequest.transactionInfo) &&
        Objects.equals(this.whitelistingEnabled, resendChallengeWebRequest.whitelistingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationName, cReq, cardNumber, transactionInfo, whitelistingEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResendChallengeWebRequest {\n");
    
    sb.append("    authenticationName: ").append(toIndentedString(authenticationName)).append("\n");
    sb.append("    cReq: ").append(toIndentedString(cReq)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
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

