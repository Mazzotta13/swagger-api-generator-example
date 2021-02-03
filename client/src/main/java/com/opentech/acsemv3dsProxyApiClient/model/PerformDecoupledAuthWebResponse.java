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
 * PerformDecoupledAuthWebResponse
 */

public class PerformDecoupledAuthWebResponse {
  @JsonProperty("cardholderInfo")
  private String cardholderInfo = null;

  public PerformDecoupledAuthWebResponse cardholderInfo(String cardholderInfo) {
    this.cardholderInfo = cardholderInfo;
    return this;
  }

   /**
   * Get cardholderInfo
   * @return cardholderInfo
  **/
  @ApiModelProperty(value = "")
  public String getCardholderInfo() {
    return cardholderInfo;
  }

  public void setCardholderInfo(String cardholderInfo) {
    this.cardholderInfo = cardholderInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformDecoupledAuthWebResponse performDecoupledAuthWebResponse = (PerformDecoupledAuthWebResponse) o;
    return Objects.equals(this.cardholderInfo, performDecoupledAuthWebResponse.cardholderInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardholderInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformDecoupledAuthWebResponse {\n");
    
    sb.append("    cardholderInfo: ").append(toIndentedString(cardholderInfo)).append("\n");
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
