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
 * UnifiedMode
 */
public class UnifiedMode {
    public static final String SERIALIZED_NAME_MODE = "mode";
    @SerializedName(SERIALIZED_NAME_MODE)
    private String mode;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";
    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;


    public UnifiedMode mode(String mode) {
        
        this.mode = mode;
        return this;
    }

     /**
     * Portfolio mode - cross_margin : cross margin - usdt_futures : usdt futures
     * @return mode
    **/
    public String getMode() {
        return mode;
    }


    public void setMode(String mode) {
        this.mode = mode;
    }

    public UnifiedMode enabled(Boolean enabled) {
        
        this.enabled = enabled;
        return this;
    }

     /**
     * Is it enabled?
     * @return enabled
    **/
    public Boolean getEnabled() {
        return enabled;
    }


    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnifiedMode unifiedMode = (UnifiedMode) o;
        return Objects.equals(this.mode, unifiedMode.mode) &&
                Objects.equals(this.enabled, unifiedMode.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, enabled);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnifiedMode {\n");
        sb.append("      mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("      enabled: ").append(toIndentedString(enabled)).append("\n");
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

