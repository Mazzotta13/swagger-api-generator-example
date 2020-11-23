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
import com.opentech.acsemv3dsProxyApiClient.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ThreeRIInfo
 */

public class ThreeRIInfo {
  @JsonProperty("relatedTransaction")
  private Transaction relatedTransaction = null;

  @JsonProperty("threeRI")
  private Boolean threeRI = null;

  public ThreeRIInfo relatedTransaction(Transaction relatedTransaction) {
    this.relatedTransaction = relatedTransaction;
    return this;
  }

   /**
   * Get relatedTransaction
   * @return relatedTransaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getRelatedTransaction() {
    return relatedTransaction;
  }

  public void setRelatedTransaction(Transaction relatedTransaction) {
    this.relatedTransaction = relatedTransaction;
  }

  public ThreeRIInfo threeRI(Boolean threeRI) {
    this.threeRI = threeRI;
    return this;
  }

   /**
   * Get threeRI
   * @return threeRI
  **/
  @ApiModelProperty(value = "")
  public Boolean isThreeRI() {
    return threeRI;
  }

  public void setThreeRI(Boolean threeRI) {
    this.threeRI = threeRI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeRIInfo threeRIInfo = (ThreeRIInfo) o;
    return Objects.equals(this.relatedTransaction, threeRIInfo.relatedTransaction) &&
        Objects.equals(this.threeRI, threeRIInfo.threeRI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedTransaction, threeRI);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeRIInfo {\n");
    
    sb.append("    relatedTransaction: ").append(toIndentedString(relatedTransaction)).append("\n");
    sb.append("    threeRI: ").append(toIndentedString(threeRI)).append("\n");
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

