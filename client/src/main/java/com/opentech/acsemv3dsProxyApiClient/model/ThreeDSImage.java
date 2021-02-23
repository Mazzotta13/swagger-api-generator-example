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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ThreeDSImage
 */


public class ThreeDSImage {
  @JsonProperty("extraHigh")
  private String extraHigh = null;

  @JsonProperty("high")
  private String high = null;

  @JsonProperty("medium")
  private String medium = null;

  public ThreeDSImage extraHigh(String extraHigh) {
    this.extraHigh = extraHigh;
    return this;
  }

   /**
   * Get extraHigh
   * @return extraHigh
  **/
  @Schema(description = "")
  public String getExtraHigh() {
    return extraHigh;
  }

  public void setExtraHigh(String extraHigh) {
    this.extraHigh = extraHigh;
  }

  public ThreeDSImage high(String high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @Schema(description = "")
  public String getHigh() {
    return high;
  }

  public void setHigh(String high) {
    this.high = high;
  }

  public ThreeDSImage medium(String medium) {
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @Schema(description = "")
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSImage threeDSImage = (ThreeDSImage) o;
    return Objects.equals(this.extraHigh, threeDSImage.extraHigh) &&
        Objects.equals(this.high, threeDSImage.high) &&
        Objects.equals(this.medium, threeDSImage.medium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraHigh, high, medium);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSImage {\n");
    
    sb.append("    extraHigh: ").append(toIndentedString(extraHigh)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
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
