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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.opentech.acsemv3dsProxyApiClient.model.Extension;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CReq
 */


public class CReq {
  @JsonProperty("acsTransID")
  private String acsTransID = null;

  @JsonProperty("challengeCancel")
  private String challengeCancel = null;

  @JsonProperty("challengeDataEntry")
  private String challengeDataEntry = null;

  @JsonProperty("challengeHTMLDataEntry")
  private String challengeHTMLDataEntry = null;

  @JsonProperty("challengeNoEntry")
  private String challengeNoEntry = null;

  @JsonProperty("challengeWindowSize")
  private String challengeWindowSize = null;

  @JsonProperty("messageExtension")
  private List<Extension> messageExtension = null;

  @JsonProperty("messageType")
  private String messageType = null;

  @JsonProperty("messageVersion")
  private String messageVersion = null;

  @JsonProperty("oobContinue")
  private Boolean oobContinue = null;

  @JsonProperty("resendChallenge")
  private String resendChallenge = null;

  @JsonProperty("sdkCounterStoA")
  private String sdkCounterStoA = null;

  @JsonProperty("sdkTransID")
  private String sdkTransID = null;

  @JsonProperty("threeDSRequestorAppURL")
  private String threeDSRequestorAppURL = null;

  @JsonProperty("threeDSServerTransID")
  private String threeDSServerTransID = null;

  @JsonProperty("whitelistingDataEntry")
  private String whitelistingDataEntry = null;

  public CReq acsTransID(String acsTransID) {
    this.acsTransID = acsTransID;
    return this;
  }

   /**
   * Get acsTransID
   * @return acsTransID
  **/
  @Schema(description = "")
  public String getAcsTransID() {
    return acsTransID;
  }

  public void setAcsTransID(String acsTransID) {
    this.acsTransID = acsTransID;
  }

  public CReq challengeCancel(String challengeCancel) {
    this.challengeCancel = challengeCancel;
    return this;
  }

   /**
   * Get challengeCancel
   * @return challengeCancel
  **/
  @Schema(description = "")
  public String getChallengeCancel() {
    return challengeCancel;
  }

  public void setChallengeCancel(String challengeCancel) {
    this.challengeCancel = challengeCancel;
  }

  public CReq challengeDataEntry(String challengeDataEntry) {
    this.challengeDataEntry = challengeDataEntry;
    return this;
  }

   /**
   * Get challengeDataEntry
   * @return challengeDataEntry
  **/
  @Schema(description = "")
  public String getChallengeDataEntry() {
    return challengeDataEntry;
  }

  public void setChallengeDataEntry(String challengeDataEntry) {
    this.challengeDataEntry = challengeDataEntry;
  }

  public CReq challengeHTMLDataEntry(String challengeHTMLDataEntry) {
    this.challengeHTMLDataEntry = challengeHTMLDataEntry;
    return this;
  }

   /**
   * Get challengeHTMLDataEntry
   * @return challengeHTMLDataEntry
  **/
  @Schema(description = "")
  public String getChallengeHTMLDataEntry() {
    return challengeHTMLDataEntry;
  }

  public void setChallengeHTMLDataEntry(String challengeHTMLDataEntry) {
    this.challengeHTMLDataEntry = challengeHTMLDataEntry;
  }

  public CReq challengeNoEntry(String challengeNoEntry) {
    this.challengeNoEntry = challengeNoEntry;
    return this;
  }

   /**
   * Get challengeNoEntry
   * @return challengeNoEntry
  **/
  @Schema(description = "")
  public String getChallengeNoEntry() {
    return challengeNoEntry;
  }

  public void setChallengeNoEntry(String challengeNoEntry) {
    this.challengeNoEntry = challengeNoEntry;
  }

  public CReq challengeWindowSize(String challengeWindowSize) {
    this.challengeWindowSize = challengeWindowSize;
    return this;
  }

   /**
   * Get challengeWindowSize
   * @return challengeWindowSize
  **/
  @Schema(description = "")
  public String getChallengeWindowSize() {
    return challengeWindowSize;
  }

  public void setChallengeWindowSize(String challengeWindowSize) {
    this.challengeWindowSize = challengeWindowSize;
  }

  public CReq messageExtension(List<Extension> messageExtension) {
    this.messageExtension = messageExtension;
    return this;
  }

  public CReq addMessageExtensionItem(Extension messageExtensionItem) {
    if (this.messageExtension == null) {
      this.messageExtension = new ArrayList<Extension>();
    }
    this.messageExtension.add(messageExtensionItem);
    return this;
  }

   /**
   * Get messageExtension
   * @return messageExtension
  **/
  @Schema(description = "")
  public List<Extension> getMessageExtension() {
    return messageExtension;
  }

  public void setMessageExtension(List<Extension> messageExtension) {
    this.messageExtension = messageExtension;
  }

  public CReq messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @Schema(description = "")
  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public CReq messageVersion(String messageVersion) {
    this.messageVersion = messageVersion;
    return this;
  }

   /**
   * Get messageVersion
   * @return messageVersion
  **/
  @Schema(description = "")
  public String getMessageVersion() {
    return messageVersion;
  }

  public void setMessageVersion(String messageVersion) {
    this.messageVersion = messageVersion;
  }

  public CReq oobContinue(Boolean oobContinue) {
    this.oobContinue = oobContinue;
    return this;
  }

   /**
   * Get oobContinue
   * @return oobContinue
  **/
  @Schema(description = "")
  public Boolean isOobContinue() {
    return oobContinue;
  }

  public void setOobContinue(Boolean oobContinue) {
    this.oobContinue = oobContinue;
  }

  public CReq resendChallenge(String resendChallenge) {
    this.resendChallenge = resendChallenge;
    return this;
  }

   /**
   * Get resendChallenge
   * @return resendChallenge
  **/
  @Schema(description = "")
  public String getResendChallenge() {
    return resendChallenge;
  }

  public void setResendChallenge(String resendChallenge) {
    this.resendChallenge = resendChallenge;
  }

  public CReq sdkCounterStoA(String sdkCounterStoA) {
    this.sdkCounterStoA = sdkCounterStoA;
    return this;
  }

   /**
   * Get sdkCounterStoA
   * @return sdkCounterStoA
  **/
  @Schema(description = "")
  public String getSdkCounterStoA() {
    return sdkCounterStoA;
  }

  public void setSdkCounterStoA(String sdkCounterStoA) {
    this.sdkCounterStoA = sdkCounterStoA;
  }

  public CReq sdkTransID(String sdkTransID) {
    this.sdkTransID = sdkTransID;
    return this;
  }

   /**
   * Get sdkTransID
   * @return sdkTransID
  **/
  @Schema(description = "")
  public String getSdkTransID() {
    return sdkTransID;
  }

  public void setSdkTransID(String sdkTransID) {
    this.sdkTransID = sdkTransID;
  }

  public CReq threeDSRequestorAppURL(String threeDSRequestorAppURL) {
    this.threeDSRequestorAppURL = threeDSRequestorAppURL;
    return this;
  }

   /**
   * Get threeDSRequestorAppURL
   * @return threeDSRequestorAppURL
  **/
  @Schema(description = "")
  public String getThreeDSRequestorAppURL() {
    return threeDSRequestorAppURL;
  }

  public void setThreeDSRequestorAppURL(String threeDSRequestorAppURL) {
    this.threeDSRequestorAppURL = threeDSRequestorAppURL;
  }

  public CReq threeDSServerTransID(String threeDSServerTransID) {
    this.threeDSServerTransID = threeDSServerTransID;
    return this;
  }

   /**
   * Get threeDSServerTransID
   * @return threeDSServerTransID
  **/
  @Schema(description = "")
  public String getThreeDSServerTransID() {
    return threeDSServerTransID;
  }

  public void setThreeDSServerTransID(String threeDSServerTransID) {
    this.threeDSServerTransID = threeDSServerTransID;
  }

  public CReq whitelistingDataEntry(String whitelistingDataEntry) {
    this.whitelistingDataEntry = whitelistingDataEntry;
    return this;
  }

   /**
   * Get whitelistingDataEntry
   * @return whitelistingDataEntry
  **/
  @Schema(description = "")
  public String getWhitelistingDataEntry() {
    return whitelistingDataEntry;
  }

  public void setWhitelistingDataEntry(String whitelistingDataEntry) {
    this.whitelistingDataEntry = whitelistingDataEntry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CReq creq = (CReq) o;
    return Objects.equals(this.acsTransID, creq.acsTransID) &&
        Objects.equals(this.challengeCancel, creq.challengeCancel) &&
        Objects.equals(this.challengeDataEntry, creq.challengeDataEntry) &&
        Objects.equals(this.challengeHTMLDataEntry, creq.challengeHTMLDataEntry) &&
        Objects.equals(this.challengeNoEntry, creq.challengeNoEntry) &&
        Objects.equals(this.challengeWindowSize, creq.challengeWindowSize) &&
        Objects.equals(this.messageExtension, creq.messageExtension) &&
        Objects.equals(this.messageType, creq.messageType) &&
        Objects.equals(this.messageVersion, creq.messageVersion) &&
        Objects.equals(this.oobContinue, creq.oobContinue) &&
        Objects.equals(this.resendChallenge, creq.resendChallenge) &&
        Objects.equals(this.sdkCounterStoA, creq.sdkCounterStoA) &&
        Objects.equals(this.sdkTransID, creq.sdkTransID) &&
        Objects.equals(this.threeDSRequestorAppURL, creq.threeDSRequestorAppURL) &&
        Objects.equals(this.threeDSServerTransID, creq.threeDSServerTransID) &&
        Objects.equals(this.whitelistingDataEntry, creq.whitelistingDataEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsTransID, challengeCancel, challengeDataEntry, challengeHTMLDataEntry, challengeNoEntry, challengeWindowSize, messageExtension, messageType, messageVersion, oobContinue, resendChallenge, sdkCounterStoA, sdkTransID, threeDSRequestorAppURL, threeDSServerTransID, whitelistingDataEntry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CReq {\n");
    
    sb.append("    acsTransID: ").append(toIndentedString(acsTransID)).append("\n");
    sb.append("    challengeCancel: ").append(toIndentedString(challengeCancel)).append("\n");
    sb.append("    challengeDataEntry: ").append(toIndentedString(challengeDataEntry)).append("\n");
    sb.append("    challengeHTMLDataEntry: ").append(toIndentedString(challengeHTMLDataEntry)).append("\n");
    sb.append("    challengeNoEntry: ").append(toIndentedString(challengeNoEntry)).append("\n");
    sb.append("    challengeWindowSize: ").append(toIndentedString(challengeWindowSize)).append("\n");
    sb.append("    messageExtension: ").append(toIndentedString(messageExtension)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    messageVersion: ").append(toIndentedString(messageVersion)).append("\n");
    sb.append("    oobContinue: ").append(toIndentedString(oobContinue)).append("\n");
    sb.append("    resendChallenge: ").append(toIndentedString(resendChallenge)).append("\n");
    sb.append("    sdkCounterStoA: ").append(toIndentedString(sdkCounterStoA)).append("\n");
    sb.append("    sdkTransID: ").append(toIndentedString(sdkTransID)).append("\n");
    sb.append("    threeDSRequestorAppURL: ").append(toIndentedString(threeDSRequestorAppURL)).append("\n");
    sb.append("    threeDSServerTransID: ").append(toIndentedString(threeDSServerTransID)).append("\n");
    sb.append("    whitelistingDataEntry: ").append(toIndentedString(whitelistingDataEntry)).append("\n");
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
