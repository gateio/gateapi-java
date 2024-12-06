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
 * DeliverySettlement
 */

public class DeliverySettlement {
  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Long time;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
  @SerializedName(SERIALIZED_NAME_LEVERAGE)
  private String leverage;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_MARGIN = "margin";
  @SerializedName(SERIALIZED_NAME_MARGIN)
  private String margin;

  public static final String SERIALIZED_NAME_ENTRY_PRICE = "entry_price";
  @SerializedName(SERIALIZED_NAME_ENTRY_PRICE)
  private String entryPrice;

  public static final String SERIALIZED_NAME_SETTLE_PRICE = "settle_price";
  @SerializedName(SERIALIZED_NAME_SETTLE_PRICE)
  private String settlePrice;

  public static final String SERIALIZED_NAME_PROFIT = "profit";
  @SerializedName(SERIALIZED_NAME_PROFIT)
  private String profit;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private String fee;


   /**
   * Liquidation time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Liquidation time")

  public Long getTime() {
    return time;
  }




   /**
   * Futures contract
   * @return contract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Futures contract")

  public String getContract() {
    return contract;
  }




   /**
   * Position leverage
   * @return leverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Position leverage")

  public String getLeverage() {
    return leverage;
  }




   /**
   * Position size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Position size")

  public Long getSize() {
    return size;
  }




   /**
   * Position margin
   * @return margin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Position margin")

  public String getMargin() {
    return margin;
  }




   /**
   * Average entry price
   * @return entryPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average entry price")

  public String getEntryPrice() {
    return entryPrice;
  }




   /**
   * Settled price
   * @return settlePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Settled price")

  public String getSettlePrice() {
    return settlePrice;
  }




   /**
   * Profit
   * @return profit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Profit")

  public String getProfit() {
    return profit;
  }




   /**
   * Fee deducted
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fee deducted")

  public String getFee() {
    return fee;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliverySettlement deliverySettlement = (DeliverySettlement) o;
    return Objects.equals(this.time, deliverySettlement.time) &&
        Objects.equals(this.contract, deliverySettlement.contract) &&
        Objects.equals(this.leverage, deliverySettlement.leverage) &&
        Objects.equals(this.size, deliverySettlement.size) &&
        Objects.equals(this.margin, deliverySettlement.margin) &&
        Objects.equals(this.entryPrice, deliverySettlement.entryPrice) &&
        Objects.equals(this.settlePrice, deliverySettlement.settlePrice) &&
        Objects.equals(this.profit, deliverySettlement.profit) &&
        Objects.equals(this.fee, deliverySettlement.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, contract, leverage, size, margin, entryPrice, settlePrice, profit, fee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliverySettlement {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    entryPrice: ").append(toIndentedString(entryPrice)).append("\n");
    sb.append("    settlePrice: ").append(toIndentedString(settlePrice)).append("\n");
    sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

