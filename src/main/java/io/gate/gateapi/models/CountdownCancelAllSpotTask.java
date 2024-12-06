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
 * Countdown cancel task detail
 */
@ApiModel(description = "Countdown cancel task detail")

public class CountdownCancelAllSpotTask {
  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
  private String currencyPair;


  public CountdownCancelAllSpotTask timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Countdown time, in seconds  At least 5 seconds, 0 means cancel the countdown
   * @return timeout
  **/
  @ApiModelProperty(required = true, value = "Countdown time, in seconds  At least 5 seconds, 0 means cancel the countdown")

  public Integer getTimeout() {
    return timeout;
  }


  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public CountdownCancelAllSpotTask currencyPair(String currencyPair) {
    
    this.currencyPair = currencyPair;
    return this;
  }

   /**
   * Currency pair
   * @return currencyPair
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency pair")

  public String getCurrencyPair() {
    return currencyPair;
  }


  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountdownCancelAllSpotTask countdownCancelAllSpotTask = (CountdownCancelAllSpotTask) o;
    return Objects.equals(this.timeout, countdownCancelAllSpotTask.timeout) &&
        Objects.equals(this.currencyPair, countdownCancelAllSpotTask.currencyPair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeout, currencyPair);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountdownCancelAllSpotTask {\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
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

