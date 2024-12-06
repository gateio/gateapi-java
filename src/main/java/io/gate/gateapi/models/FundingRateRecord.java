/*
 * Gate API v4
 * Welcome to Gate.io API  APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * The version of the OpenAPI document: 4.86.0
 * Contact: support@mail.gate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * FundingRateRecord
 */

public class FundingRateRecord {
  public static final String SERIALIZED_NAME_T = "t";
  @SerializedName(SERIALIZED_NAME_T)
  private Long t;

  public static final String SERIALIZED_NAME_R = "r";
  @SerializedName(SERIALIZED_NAME_R)
  private String r;


  public FundingRateRecord t(Long t) {
    
    this.t = t;
    return this;
  }

   /**
   * Unix timestamp in seconds
   * @return t
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp in seconds")

  public Long getT() {
    return t;
  }


  public void setT(Long t) {
    this.t = t;
  }


  public FundingRateRecord r(String r) {
    
    this.r = r;
    return this;
  }

   /**
   * Funding rate
   * @return r
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Funding rate")

  public String getR() {
    return r;
  }


  public void setR(String r) {
    this.r = r;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingRateRecord fundingRateRecord = (FundingRateRecord) o;
    return Objects.equals(this.t, fundingRateRecord.t) &&
        Objects.equals(this.r, fundingRateRecord.r);
  }

  @Override
  public int hashCode() {
    return Objects.hash(t, r);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingRateRecord {\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    r: ").append(toIndentedString(r)).append("\n");
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

