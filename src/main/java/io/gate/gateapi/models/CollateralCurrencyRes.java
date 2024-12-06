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
 * CollateralCurrencyRes
 */

public class CollateralCurrencyRes {
  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private Boolean succeeded;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;


  public CollateralCurrencyRes succeeded(Boolean succeeded) {
    
    this.succeeded = succeeded;
    return this;
  }

   /**
   * Update success status
   * @return succeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Update success status")

  public Boolean getSucceeded() {
    return succeeded;
  }


  public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
  }


  public CollateralCurrencyRes label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Error identifier for unsuccessful operations; empty for successful.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error identifier for unsuccessful operations; empty for successful.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public CollateralCurrencyRes message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Error description in case of operation failure; empty when successful.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error description in case of operation failure; empty when successful.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public CollateralCurrencyRes currency(String currency) {
    
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


  public CollateralCurrencyRes amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Quantity of successful collateral operation; 0 if the operation fails.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quantity of successful collateral operation; 0 if the operation fails.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollateralCurrencyRes collateralCurrencyRes = (CollateralCurrencyRes) o;
    return Objects.equals(this.succeeded, collateralCurrencyRes.succeeded) &&
        Objects.equals(this.label, collateralCurrencyRes.label) &&
        Objects.equals(this.message, collateralCurrencyRes.message) &&
        Objects.equals(this.currency, collateralCurrencyRes.currency) &&
        Objects.equals(this.amount, collateralCurrencyRes.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(succeeded, label, message, currency, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollateralCurrencyRes {\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
