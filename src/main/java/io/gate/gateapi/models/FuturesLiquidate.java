/*
 * Gate API
 * Welcome to Gate API  APIv4 provides operations related to spot, margin, and contract trading, including public interfaces for querying market data and authenticated private interfaces for implementing API-based automated trading.
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
 * FuturesLiquidate
 */
public class FuturesLiquidate {
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

    public static final String SERIALIZED_NAME_LIQ_PRICE = "liq_price";
    @SerializedName(SERIALIZED_NAME_LIQ_PRICE)
    private String liqPrice;

    public static final String SERIALIZED_NAME_MARK_PRICE = "mark_price";
    @SerializedName(SERIALIZED_NAME_MARK_PRICE)
    private String markPrice;

    public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    private Long orderId;

    public static final String SERIALIZED_NAME_ORDER_PRICE = "order_price";
    @SerializedName(SERIALIZED_NAME_ORDER_PRICE)
    private String orderPrice;

    public static final String SERIALIZED_NAME_FILL_PRICE = "fill_price";
    @SerializedName(SERIALIZED_NAME_FILL_PRICE)
    private String fillPrice;

    public static final String SERIALIZED_NAME_LEFT = "left";
    @SerializedName(SERIALIZED_NAME_LEFT)
    private Long left;


     /**
     * Liquidation time.
     * @return time
    **/
    @javax.annotation.Nullable
    public Long getTime() {
        return time;
    }


     /**
     * Futures contract.
     * @return contract
    **/
    @javax.annotation.Nullable
    public String getContract() {
        return contract;
    }


     /**
     * Position leverage. Not returned in public endpoints.
     * @return leverage
    **/
    @javax.annotation.Nullable
    public String getLeverage() {
        return leverage;
    }


     /**
     * Position size.
     * @return size
    **/
    @javax.annotation.Nullable
    public Long getSize() {
        return size;
    }


     /**
     * Position margin. Not returned in public endpoints.
     * @return margin
    **/
    @javax.annotation.Nullable
    public String getMargin() {
        return margin;
    }


     /**
     * Average entry price. Not returned in public endpoints.
     * @return entryPrice
    **/
    @javax.annotation.Nullable
    public String getEntryPrice() {
        return entryPrice;
    }


     /**
     * Liquidation price. Not returned in public endpoints.
     * @return liqPrice
    **/
    @javax.annotation.Nullable
    public String getLiqPrice() {
        return liqPrice;
    }


     /**
     * Mark price. Not returned in public endpoints.
     * @return markPrice
    **/
    @javax.annotation.Nullable
    public String getMarkPrice() {
        return markPrice;
    }


     /**
     * Liquidation order ID. Not returned in public endpoints.
     * @return orderId
    **/
    @javax.annotation.Nullable
    public Long getOrderId() {
        return orderId;
    }


     /**
     * Liquidation order price.
     * @return orderPrice
    **/
    @javax.annotation.Nullable
    public String getOrderPrice() {
        return orderPrice;
    }


     /**
     * Liquidation order average taker price.
     * @return fillPrice
    **/
    @javax.annotation.Nullable
    public String getFillPrice() {
        return fillPrice;
    }


     /**
     * Liquidation order maker size.
     * @return left
    **/
    @javax.annotation.Nullable
    public Long getLeft() {
        return left;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuturesLiquidate futuresLiquidate = (FuturesLiquidate) o;
        return Objects.equals(this.time, futuresLiquidate.time) &&
                Objects.equals(this.contract, futuresLiquidate.contract) &&
                Objects.equals(this.leverage, futuresLiquidate.leverage) &&
                Objects.equals(this.size, futuresLiquidate.size) &&
                Objects.equals(this.margin, futuresLiquidate.margin) &&
                Objects.equals(this.entryPrice, futuresLiquidate.entryPrice) &&
                Objects.equals(this.liqPrice, futuresLiquidate.liqPrice) &&
                Objects.equals(this.markPrice, futuresLiquidate.markPrice) &&
                Objects.equals(this.orderId, futuresLiquidate.orderId) &&
                Objects.equals(this.orderPrice, futuresLiquidate.orderPrice) &&
                Objects.equals(this.fillPrice, futuresLiquidate.fillPrice) &&
                Objects.equals(this.left, futuresLiquidate.left);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, contract, leverage, size, margin, entryPrice, liqPrice, markPrice, orderId, orderPrice, fillPrice, left);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuturesLiquidate {\n");
        sb.append("      time: ").append(toIndentedString(time)).append("\n");
        sb.append("      contract: ").append(toIndentedString(contract)).append("\n");
        sb.append("      leverage: ").append(toIndentedString(leverage)).append("\n");
        sb.append("      size: ").append(toIndentedString(size)).append("\n");
        sb.append("      margin: ").append(toIndentedString(margin)).append("\n");
        sb.append("      entryPrice: ").append(toIndentedString(entryPrice)).append("\n");
        sb.append("      liqPrice: ").append(toIndentedString(liqPrice)).append("\n");
        sb.append("      markPrice: ").append(toIndentedString(markPrice)).append("\n");
        sb.append("      orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("      orderPrice: ").append(toIndentedString(orderPrice)).append("\n");
        sb.append("      fillPrice: ").append(toIndentedString(fillPrice)).append("\n");
        sb.append("      left: ").append(toIndentedString(left)).append("\n");
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
        return o.toString().replace("\n", "\n        ");
    }

}

