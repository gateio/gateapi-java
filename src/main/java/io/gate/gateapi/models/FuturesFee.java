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
 * The returned result is a map type, where the key represents the market and the value represents the taker and maker fee rates.
 */
public class FuturesFee {
    public static final String SERIALIZED_NAME_TAKER_FEE = "taker_fee";
    @SerializedName(SERIALIZED_NAME_TAKER_FEE)
    private String takerFee;

    public static final String SERIALIZED_NAME_MAKER_FEE = "maker_fee";
    @SerializedName(SERIALIZED_NAME_MAKER_FEE)
    private String makerFee;


     /**
     * Taker fee
     * @return takerFee
    **/
    @javax.annotation.Nullable
    public String getTakerFee() {
        return takerFee;
    }


     /**
     * maker fee
     * @return makerFee
    **/
    @javax.annotation.Nullable
    public String getMakerFee() {
        return makerFee;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuturesFee futuresFee = (FuturesFee) o;
        return Objects.equals(this.takerFee, futuresFee.takerFee) &&
                Objects.equals(this.makerFee, futuresFee.makerFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(takerFee, makerFee);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuturesFee {\n");
        sb.append("      takerFee: ").append(toIndentedString(takerFee)).append("\n");
        sb.append("      makerFee: ").append(toIndentedString(makerFee)).append("\n");
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
