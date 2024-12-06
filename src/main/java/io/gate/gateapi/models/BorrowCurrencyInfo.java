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
 * BorrowCurrencyInfo
 */

public class BorrowCurrencyInfo {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_INDEX_PRICE = "index_price";
  @SerializedName(SERIALIZED_NAME_INDEX_PRICE)
  private String indexPrice;

  public static final String SERIALIZED_NAME_LEFT_REPAY_PRINCIPAL = "left_repay_principal";
  @SerializedName(SERIALIZED_NAME_LEFT_REPAY_PRINCIPAL)
  private String leftRepayPrincipal;

  public static final String SERIALIZED_NAME_LEFT_REPAY_INTEREST = "left_repay_interest";
  @SerializedName(SERIALIZED_NAME_LEFT_REPAY_INTEREST)
  private String leftRepayInterest;

  public static final String SERIALIZED_NAME_LEFT_REPAY_USDT = "left_repay_usdt";
  @SerializedName(SERIALIZED_NAME_LEFT_REPAY_USDT)
  private String leftRepayUsdt;


  public BorrowCurrencyInfo currency(String currency) {
    
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


  public BorrowCurrencyInfo indexPrice(String indexPrice) {
    
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


  public BorrowCurrencyInfo leftRepayPrincipal(String leftRepayPrincipal) {
    
    this.leftRepayPrincipal = leftRepayPrincipal;
    return this;
  }

   /**
   * outstanding principal
   * @return leftRepayPrincipal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "outstanding principal")

  public String getLeftRepayPrincipal() {
    return leftRepayPrincipal;
  }


  public void setLeftRepayPrincipal(String leftRepayPrincipal) {
    this.leftRepayPrincipal = leftRepayPrincipal;
  }


  public BorrowCurrencyInfo leftRepayInterest(String leftRepayInterest) {
    
    this.leftRepayInterest = leftRepayInterest;
    return this;
  }

   /**
   * outstanding interest
   * @return leftRepayInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "outstanding interest")

  public String getLeftRepayInterest() {
    return leftRepayInterest;
  }


  public void setLeftRepayInterest(String leftRepayInterest) {
    this.leftRepayInterest = leftRepayInterest;
  }


  public BorrowCurrencyInfo leftRepayUsdt(String leftRepayUsdt) {
    
    this.leftRepayUsdt = leftRepayUsdt;
    return this;
  }

   /**
   * Value of left total repayments amount in USDT
   * @return leftRepayUsdt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of left total repayments amount in USDT")

  public String getLeftRepayUsdt() {
    return leftRepayUsdt;
  }


  public void setLeftRepayUsdt(String leftRepayUsdt) {
    this.leftRepayUsdt = leftRepayUsdt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BorrowCurrencyInfo borrowCurrencyInfo = (BorrowCurrencyInfo) o;
    return Objects.equals(this.currency, borrowCurrencyInfo.currency) &&
        Objects.equals(this.indexPrice, borrowCurrencyInfo.indexPrice) &&
        Objects.equals(this.leftRepayPrincipal, borrowCurrencyInfo.leftRepayPrincipal) &&
        Objects.equals(this.leftRepayInterest, borrowCurrencyInfo.leftRepayInterest) &&
        Objects.equals(this.leftRepayUsdt, borrowCurrencyInfo.leftRepayUsdt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, indexPrice, leftRepayPrincipal, leftRepayInterest, leftRepayUsdt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BorrowCurrencyInfo {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    indexPrice: ").append(toIndentedString(indexPrice)).append("\n");
    sb.append("    leftRepayPrincipal: ").append(toIndentedString(leftRepayPrincipal)).append("\n");
    sb.append("    leftRepayInterest: ").append(toIndentedString(leftRepayInterest)).append("\n");
    sb.append("    leftRepayUsdt: ").append(toIndentedString(leftRepayUsdt)).append("\n");
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

