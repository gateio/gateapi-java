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
 * UnifiedHistoryLoanRateRates
 */
public class UnifiedHistoryLoanRateRates {
    public static final String SERIALIZED_NAME_TIME = "time";
    @SerializedName(SERIALIZED_NAME_TIME)
    private Long time;

    public static final String SERIALIZED_NAME_RATE = "rate";
    @SerializedName(SERIALIZED_NAME_RATE)
    private String rate;


    public UnifiedHistoryLoanRateRates time(Long time) {
        
        this.time = time;
        return this;
    }

     /**
     * The hourly timestamp corresponding to the interest rate, in milliseconds
     * @return time
    **/
    @javax.annotation.Nullable
    public Long getTime() {
        return time;
    }


    public void setTime(Long time) {
        this.time = time;
    }

    public UnifiedHistoryLoanRateRates rate(String rate) {
        
        this.rate = rate;
        return this;
    }

     /**
     * Historical interest rates for this hour
     * @return rate
    **/
    @javax.annotation.Nullable
    public String getRate() {
        return rate;
    }


    public void setRate(String rate) {
        this.rate = rate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnifiedHistoryLoanRateRates unifiedHistoryLoanRateRates = (UnifiedHistoryLoanRateRates) o;
        return Objects.equals(this.time, unifiedHistoryLoanRateRates.time) &&
                Objects.equals(this.rate, unifiedHistoryLoanRateRates.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, rate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnifiedHistoryLoanRateRates {\n");
        sb.append("      time: ").append(toIndentedString(time)).append("\n");
        sb.append("      rate: ").append(toIndentedString(rate)).append("\n");
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

