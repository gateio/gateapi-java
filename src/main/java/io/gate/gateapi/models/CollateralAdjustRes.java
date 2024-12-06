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
import io.gate.gateapi.models.CollateralCurrencyRes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Result of multi-collateral adjustment
 */
@ApiModel(description = "Result of multi-collateral adjustment")

public class CollateralAdjustRes {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId;

  public static final String SERIALIZED_NAME_COLLATERAL_CURRENCIES = "collateral_currencies";
  @SerializedName(SERIALIZED_NAME_COLLATERAL_CURRENCIES)
  private List<CollateralCurrencyRes> collateralCurrencies = null;


  public CollateralAdjustRes orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Order ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order ID")

  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public CollateralAdjustRes collateralCurrencies(List<CollateralCurrencyRes> collateralCurrencies) {
    
    this.collateralCurrencies = collateralCurrencies;
    return this;
  }

  public CollateralAdjustRes addCollateralCurrenciesItem(CollateralCurrencyRes collateralCurrenciesItem) {
    if (this.collateralCurrencies == null) {
      this.collateralCurrencies = new ArrayList<>();
    }
    this.collateralCurrencies.add(collateralCurrenciesItem);
    return this;
  }

   /**
   * Collateral Currency Information
   * @return collateralCurrencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collateral Currency Information")

  public List<CollateralCurrencyRes> getCollateralCurrencies() {
    return collateralCurrencies;
  }


  public void setCollateralCurrencies(List<CollateralCurrencyRes> collateralCurrencies) {
    this.collateralCurrencies = collateralCurrencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollateralAdjustRes collateralAdjustRes = (CollateralAdjustRes) o;
    return Objects.equals(this.orderId, collateralAdjustRes.orderId) &&
        Objects.equals(this.collateralCurrencies, collateralAdjustRes.collateralCurrencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, collateralCurrencies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollateralAdjustRes {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    collateralCurrencies: ").append(toIndentedString(collateralCurrencies)).append("\n");
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

