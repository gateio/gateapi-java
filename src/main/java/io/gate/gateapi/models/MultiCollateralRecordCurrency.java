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
 * MultiCollateralRecordCurrency
 */

public class MultiCollateralRecordCurrency {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_INDEX_PRICE = "index_price";
  @SerializedName(SERIALIZED_NAME_INDEX_PRICE)
  private String indexPrice;

  public static final String SERIALIZED_NAME_BEFORE_AMOUNT = "before_amount";
  @SerializedName(SERIALIZED_NAME_BEFORE_AMOUNT)
  private String beforeAmount;

  public static final String SERIALIZED_NAME_BEFORE_AMOUNT_USDT = "before_amount_usdt";
  @SerializedName(SERIALIZED_NAME_BEFORE_AMOUNT_USDT)
  private String beforeAmountUsdt;

  public static final String SERIALIZED_NAME_AFTER_AMOUNT = "after_amount";
  @SerializedName(SERIALIZED_NAME_AFTER_AMOUNT)
  private String afterAmount;

  public static final String SERIALIZED_NAME_AFTER_AMOUNT_USDT = "after_amount_usdt";
  @SerializedName(SERIALIZED_NAME_AFTER_AMOUNT_USDT)
  private String afterAmountUsdt;


  public MultiCollateralRecordCurrency currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public MultiCollateralRecordCurrency indexPrice(String indexPrice) {
    
    this.indexPrice = indexPrice;
    return this;
  }

   /**
   * Currency Index Price
   * @return indexPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency Index Price")

  public String getIndexPrice() {
    return indexPrice;
  }


  public void setIndexPrice(String indexPrice) {
    this.indexPrice = indexPrice;
  }


  public MultiCollateralRecordCurrency beforeAmount(String beforeAmount) {
    
    this.beforeAmount = beforeAmount;
    return this;
  }

   /**
   * Amount before the operation
   * @return beforeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount before the operation")

  public String getBeforeAmount() {
    return beforeAmount;
  }


  public void setBeforeAmount(String beforeAmount) {
    this.beforeAmount = beforeAmount;
  }


  public MultiCollateralRecordCurrency beforeAmountUsdt(String beforeAmountUsdt) {
    
    this.beforeAmountUsdt = beforeAmountUsdt;
    return this;
  }

   /**
   * USDT Amount before the operation.
   * @return beforeAmountUsdt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "USDT Amount before the operation.")

  public String getBeforeAmountUsdt() {
    return beforeAmountUsdt;
  }


  public void setBeforeAmountUsdt(String beforeAmountUsdt) {
    this.beforeAmountUsdt = beforeAmountUsdt;
  }


  public MultiCollateralRecordCurrency afterAmount(String afterAmount) {
    
    this.afterAmount = afterAmount;
    return this;
  }

   /**
   * Amount after the operation.
   * @return afterAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount after the operation.")

  public String getAfterAmount() {
    return afterAmount;
  }


  public void setAfterAmount(String afterAmount) {
    this.afterAmount = afterAmount;
  }


  public MultiCollateralRecordCurrency afterAmountUsdt(String afterAmountUsdt) {
    
    this.afterAmountUsdt = afterAmountUsdt;
    return this;
  }

   /**
   * USDT Amount after the operation.
   * @return afterAmountUsdt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "USDT Amount after the operation.")

  public String getAfterAmountUsdt() {
    return afterAmountUsdt;
  }


  public void setAfterAmountUsdt(String afterAmountUsdt) {
    this.afterAmountUsdt = afterAmountUsdt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiCollateralRecordCurrency multiCollateralRecordCurrency = (MultiCollateralRecordCurrency) o;
    return Objects.equals(this.currency, multiCollateralRecordCurrency.currency) &&
        Objects.equals(this.indexPrice, multiCollateralRecordCurrency.indexPrice) &&
        Objects.equals(this.beforeAmount, multiCollateralRecordCurrency.beforeAmount) &&
        Objects.equals(this.beforeAmountUsdt, multiCollateralRecordCurrency.beforeAmountUsdt) &&
        Objects.equals(this.afterAmount, multiCollateralRecordCurrency.afterAmount) &&
        Objects.equals(this.afterAmountUsdt, multiCollateralRecordCurrency.afterAmountUsdt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, indexPrice, beforeAmount, beforeAmountUsdt, afterAmount, afterAmountUsdt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiCollateralRecordCurrency {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    indexPrice: ").append(toIndentedString(indexPrice)).append("\n");
    sb.append("    beforeAmount: ").append(toIndentedString(beforeAmount)).append("\n");
    sb.append("    beforeAmountUsdt: ").append(toIndentedString(beforeAmountUsdt)).append("\n");
    sb.append("    afterAmount: ").append(toIndentedString(afterAmount)).append("\n");
    sb.append("    afterAmountUsdt: ").append(toIndentedString(afterAmountUsdt)).append("\n");
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
