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
import com.opentech.acsemv3dsProxyApiClient.model.ExpectedChallengeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * BrowserChallengeInfo
 */

public class BrowserChallengeInfo {
  @JsonProperty("expectedChallengeTypes")
  private List<ExpectedChallengeType> expectedChallengeTypes = null;

  public BrowserChallengeInfo expectedChallengeTypes(List<ExpectedChallengeType> expectedChallengeTypes) {
    this.expectedChallengeTypes = expectedChallengeTypes;
    return this;
  }

  public BrowserChallengeInfo addExpectedChallengeTypesItem(ExpectedChallengeType expectedChallengeTypesItem) {
    if (this.expectedChallengeTypes == null) {
      this.expectedChallengeTypes = new ArrayList<ExpectedChallengeType>();
    }
    this.expectedChallengeTypes.add(expectedChallengeTypesItem);
    return this;
  }

   /**
   * Get expectedChallengeTypes
   * @return expectedChallengeTypes
  **/
  @ApiModelProperty(value = "")
  public List<ExpectedChallengeType> getExpectedChallengeTypes() {
    return expectedChallengeTypes;
  }

  public void setExpectedChallengeTypes(List<ExpectedChallengeType> expectedChallengeTypes) {
    this.expectedChallengeTypes = expectedChallengeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserChallengeInfo browserChallengeInfo = (BrowserChallengeInfo) o;
    return Objects.equals(this.expectedChallengeTypes, browserChallengeInfo.expectedChallengeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedChallengeTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserChallengeInfo {\n");
    
    sb.append("    expectedChallengeTypes: ").append(toIndentedString(expectedChallengeTypes)).append("\n");
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

