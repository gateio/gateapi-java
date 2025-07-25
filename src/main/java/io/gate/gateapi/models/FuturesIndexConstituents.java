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
import io.gate.gateapi.models.IndexConstituent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FuturesIndexConstituents
 */
public class FuturesIndexConstituents {
    public static final String SERIALIZED_NAME_INDEX = "index";
    @SerializedName(SERIALIZED_NAME_INDEX)
    private String index;

    public static final String SERIALIZED_NAME_CONSTITUENTS = "constituents";
    @SerializedName(SERIALIZED_NAME_CONSTITUENTS)
    private List<IndexConstituent> constituents = null;


     /**
     * Index name.
     * @return index
    **/
    @javax.annotation.Nullable
    public String getIndex() {
        return index;
    }


     /**
     * Constituents.
     * @return constituents
    **/
    @javax.annotation.Nullable
    public List<IndexConstituent> getConstituents() {
        return constituents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuturesIndexConstituents futuresIndexConstituents = (FuturesIndexConstituents) o;
        return Objects.equals(this.index, futuresIndexConstituents.index) &&
                Objects.equals(this.constituents, futuresIndexConstituents.constituents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, constituents);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuturesIndexConstituents {\n");
        sb.append("      index: ").append(toIndentedString(index)).append("\n");
        sb.append("      constituents: ").append(toIndentedString(constituents)).append("\n");
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

