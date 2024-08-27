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
 * Options positions
 */
public class MockOptionsPosition {
    public static final String SERIALIZED_NAME_OPTIONS_NAME = "options_name";
    @SerializedName(SERIALIZED_NAME_OPTIONS_NAME)
    private String optionsName;

    public static final String SERIALIZED_NAME_SIZE = "size";
    @SerializedName(SERIALIZED_NAME_SIZE)
    private String size;


    public MockOptionsPosition optionsName(String optionsName) {
        
        this.optionsName = optionsName;
        return this;
    }

     /**
     * Option name, currently only supports options for BTC and ETH with USDT.
     * @return optionsName
    **/
    public String getOptionsName() {
        return optionsName;
    }


    public void setOptionsName(String optionsName) {
        this.optionsName = optionsName;
    }

    public MockOptionsPosition size(String size) {
        
        this.size = size;
        return this;
    }

     /**
     * Position size, measured in contract units.
     * @return size
    **/
    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MockOptionsPosition mockOptionsPosition = (MockOptionsPosition) o;
        return Objects.equals(this.optionsName, mockOptionsPosition.optionsName) &&
                Objects.equals(this.size, mockOptionsPosition.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionsName, size);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MockOptionsPosition {\n");
        sb.append("      optionsName: ").append(toIndentedString(optionsName)).append("\n");
        sb.append("      size: ").append(toIndentedString(size)).append("\n");
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

