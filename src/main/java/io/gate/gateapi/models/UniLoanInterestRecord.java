/*
 * Gate API v4
 * Welcome to Gate.io API  APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
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
 * Interest record
 */
public class UniLoanInterestRecord {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
    @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
    private String currencyPair;

    public static final String SERIALIZED_NAME_ACTUAL_RATE = "actual_rate";
    @SerializedName(SERIALIZED_NAME_ACTUAL_RATE)
    private String actualRate;

    public static final String SERIALIZED_NAME_INTEREST = "interest";
    @SerializedName(SERIALIZED_NAME_INTEREST)
    private String interest;

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private Integer status;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private Long createTime;


     /**
     * Currency name
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


     /**
     * Currency pair
     * @return currencyPair
    **/
    @javax.annotation.Nullable
    public String getCurrencyPair() {
        return currencyPair;
    }


     /**
     * Actual rate
     * @return actualRate
    **/
    @javax.annotation.Nullable
    public String getActualRate() {
        return actualRate;
    }


     /**
     * Interest
     * @return interest
    **/
    @javax.annotation.Nullable
    public String getInterest() {
        return interest;
    }


     /**
     * Status: 0 - fail, 1 - success
     * @return status
    **/
    @javax.annotation.Nullable
    public Integer getStatus() {
        return status;
    }


     /**
     * Type, platform - platform，margin - margin
     * @return type
    **/
    @javax.annotation.Nullable
    public String getType() {
        return type;
    }


     /**
     * Created time
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
        UniLoanInterestRecord uniLoanInterestRecord = (UniLoanInterestRecord) o;
        return Objects.equals(this.currency, uniLoanInterestRecord.currency) &&
                Objects.equals(this.currencyPair, uniLoanInterestRecord.currencyPair) &&
                Objects.equals(this.actualRate, uniLoanInterestRecord.actualRate) &&
                Objects.equals(this.interest, uniLoanInterestRecord.interest) &&
                Objects.equals(this.status, uniLoanInterestRecord.status) &&
                Objects.equals(this.type, uniLoanInterestRecord.type) &&
                Objects.equals(this.createTime, uniLoanInterestRecord.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, currencyPair, actualRate, interest, status, type, createTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UniLoanInterestRecord {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
        sb.append("      actualRate: ").append(toIndentedString(actualRate)).append("\n");
        sb.append("      interest: ").append(toIndentedString(interest)).append("\n");
        sb.append("      status: ").append(toIndentedString(status)).append("\n");
        sb.append("      type: ").append(toIndentedString(type)).append("\n");
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

