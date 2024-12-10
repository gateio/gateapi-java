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
 * Multi-currency pledge current interest rate
 */
public class CollateralCurrentRate {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_CURRENT_RATE = "current_rate";
    @SerializedName(SERIALIZED_NAME_CURRENT_RATE)
    private String currentRate;


    public CollateralCurrentRate currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Currency
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CollateralCurrentRate currentRate(String currentRate) {
        
        this.currentRate = currentRate;
        return this;
    }

     /**
     * Currency current interest rate
     * @return currentRate
    **/
    @javax.annotation.Nullable
    public String getCurrentRate() {
        return currentRate;
    }


    public void setCurrentRate(String currentRate) {
        this.currentRate = currentRate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollateralCurrentRate collateralCurrentRate = (CollateralCurrentRate) o;
        return Objects.equals(this.currency, collateralCurrentRate.currency) &&
                Objects.equals(this.currentRate, collateralCurrentRate.currentRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, currentRate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollateralCurrentRate {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      currentRate: ").append(toIndentedString(currentRate)).append("\n");
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

