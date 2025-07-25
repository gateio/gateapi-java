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
 * SystemTime
 */
public class SystemTime {
    public static final String SERIALIZED_NAME_SERVER_TIME = "server_time";
    @SerializedName(SERIALIZED_NAME_SERVER_TIME)
    private Long serverTime;


    public SystemTime serverTime(Long serverTime) {
        
        this.serverTime = serverTime;
        return this;
    }

     /**
     * Server current time(ms).
     * @return serverTime
    **/
    @javax.annotation.Nullable
    public Long getServerTime() {
        return serverTime;
    }


    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemTime systemTime = (SystemTime) o;
        return Objects.equals(this.serverTime, systemTime.serverTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemTime {\n");
        sb.append("      serverTime: ").append(toIndentedString(serverTime)).append("\n");
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

