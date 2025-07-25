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
 * Convert Small Balance.
 */
public class SmallBalanceHistory {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private String amount;

    public static final String SERIALIZED_NAME_GT_AMOUNT = "gt_amount";
    @SerializedName(SERIALIZED_NAME_GT_AMOUNT)
    private String gtAmount;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private Long createTime;


     /**
     * Order ID.
     * @return id
    **/
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }


     /**
     * Currency.
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


     /**
     * amount.
     * @return amount
    **/
    @javax.annotation.Nullable
    public String getAmount() {
        return amount;
    }


     /**
     * GT amount.
     * @return gtAmount
    **/
    @javax.annotation.Nullable
    public String getGtAmount() {
        return gtAmount;
    }


     /**
     * Exchange time (in seconds).
     * @return createTime
    **/
    @javax.annotation.Nullable
    public Long getCreateTime() {
        return createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmallBalanceHistory smallBalanceHistory = (SmallBalanceHistory) o;
        return Objects.equals(this.id, smallBalanceHistory.id) &&
                Objects.equals(this.currency, smallBalanceHistory.currency) &&
                Objects.equals(this.amount, smallBalanceHistory.amount) &&
                Objects.equals(this.gtAmount, smallBalanceHistory.gtAmount) &&
                Objects.equals(this.createTime, smallBalanceHistory.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currency, amount, gtAmount, createTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmallBalanceHistory {\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("      gtAmount: ").append(toIndentedString(gtAmount)).append("\n");
        sb.append("      createTime: ").append(toIndentedString(createTime)).append("\n");
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

