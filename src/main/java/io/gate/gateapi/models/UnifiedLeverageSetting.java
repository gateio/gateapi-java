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
 * UnifiedLeverageSetting
 */

public class UnifiedLeverageSetting {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
  @SerializedName(SERIALIZED_NAME_LEVERAGE)
  private String leverage;


  public UnifiedLeverageSetting currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency name
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency name")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public UnifiedLeverageSetting leverage(String leverage) {
    
    this.leverage = leverage;
    return this;
  }

   /**
   * multiple
   * @return leverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "multiple")

  public String getLeverage() {
    return leverage;
  }


  public void setLeverage(String leverage) {
    this.leverage = leverage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnifiedLeverageSetting unifiedLeverageSetting = (UnifiedLeverageSetting) o;
    return Objects.equals(this.currency, unifiedLeverageSetting.currency) &&
        Objects.equals(this.leverage, unifiedLeverageSetting.leverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, leverage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnifiedLeverageSetting {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
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
