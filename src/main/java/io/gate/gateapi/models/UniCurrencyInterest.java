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
 * UniCurrencyInterest
 */
public class UniCurrencyInterest {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_INTEREST_STATUS = "interest_status";
    @SerializedName(SERIALIZED_NAME_INTEREST_STATUS)
    private String interestStatus;


     /**
     * Currency
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


     /**
     * Interest status: interest_dividend - regular dividend, interest_reinvest - interest reinvestment
     * @return interestStatus
    **/
    @javax.annotation.Nullable
    public String getInterestStatus() {
        return interestStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UniCurrencyInterest uniCurrencyInterest = (UniCurrencyInterest) o;
        return Objects.equals(this.currency, uniCurrencyInterest.currency) &&
                Objects.equals(this.interestStatus, uniCurrencyInterest.interestStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, interestStatus);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UniCurrencyInterest {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      interestStatus: ").append(toIndentedString(interestStatus)).append("\n");
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
