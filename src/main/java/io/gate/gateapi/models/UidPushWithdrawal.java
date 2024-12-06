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
 * UidPushWithdrawal
 */

public class UidPushWithdrawal {
  public static final String SERIALIZED_NAME_RECEIVE_UID = "receive_uid";
  @SerializedName(SERIALIZED_NAME_RECEIVE_UID)
  private Long receiveUid;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;


  public UidPushWithdrawal receiveUid(Long receiveUid) {
    
    this.receiveUid = receiveUid;
    return this;
  }

   /**
   * Recipient UID
   * @return receiveUid
  **/
  @ApiModelProperty(required = true, value = "Recipient UID")

  public Long getReceiveUid() {
    return receiveUid;
  }


  public void setReceiveUid(Long receiveUid) {
    this.receiveUid = receiveUid;
  }


  public UidPushWithdrawal currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency name
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Currency name")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public UidPushWithdrawal amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Transfer amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Transfer amount")

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
    UidPushWithdrawal uidPushWithdrawal = (UidPushWithdrawal) o;
    return Objects.equals(this.receiveUid, uidPushWithdrawal.receiveUid) &&
        Objects.equals(this.currency, uidPushWithdrawal.currency) &&
        Objects.equals(this.amount, uidPushWithdrawal.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiveUid, currency, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UidPushWithdrawal {\n");
    sb.append("    receiveUid: ").append(toIndentedString(receiveUid)).append("\n");
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
