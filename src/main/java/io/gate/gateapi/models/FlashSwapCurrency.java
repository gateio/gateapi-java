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
import java.util.ArrayList;
import java.util.List;

/**
 * Currencies supported in flash swap
 */
public class FlashSwapCurrency {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_MIN_AMOUNT = "min_amount";
    @SerializedName(SERIALIZED_NAME_MIN_AMOUNT)
    private String minAmount;

    public static final String SERIALIZED_NAME_MAX_AMOUNT = "max_amount";
    @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
    private String maxAmount;

    public static final String SERIALIZED_NAME_SWAPPABLE = "swappable";
    @SerializedName(SERIALIZED_NAME_SWAPPABLE)
    private List<String> swappable = null;


     /**
     * Currency name
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


     /**
     * Minimum amount required in flash swap
     * @return minAmount
    **/
    @javax.annotation.Nullable
    public String getMinAmount() {
        return minAmount;
    }


     /**
     * Maximum amount allowed in flash swap
     * @return maxAmount
    **/
    @javax.annotation.Nullable
    public String getMaxAmount() {
        return maxAmount;
    }


     /**
     * Currencies which can be swapped to from this currency
     * @return swappable
    **/
    @javax.annotation.Nullable
    public List<String> getSwappable() {
        return swappable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlashSwapCurrency flashSwapCurrency = (FlashSwapCurrency) o;
        return Objects.equals(this.currency, flashSwapCurrency.currency) &&
                Objects.equals(this.minAmount, flashSwapCurrency.minAmount) &&
                Objects.equals(this.maxAmount, flashSwapCurrency.maxAmount) &&
                Objects.equals(this.swappable, flashSwapCurrency.swappable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, minAmount, maxAmount, swappable);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlashSwapCurrency {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      minAmount: ").append(toIndentedString(minAmount)).append("\n");
        sb.append("      maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
        sb.append("      swappable: ").append(toIndentedString(swappable)).append("\n");
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

