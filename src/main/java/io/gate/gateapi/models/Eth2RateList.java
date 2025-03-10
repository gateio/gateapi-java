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
 * Eth2RateList
 */
public class Eth2RateList {
    public static final String SERIALIZED_NAME_DATE_TIME = "date_time";
    @SerializedName(SERIALIZED_NAME_DATE_TIME)
    private Long dateTime;

    public static final String SERIALIZED_NAME_DATE = "date";
    @SerializedName(SERIALIZED_NAME_DATE)
    private String date;

    public static final String SERIALIZED_NAME_RATE = "rate";
    @SerializedName(SERIALIZED_NAME_RATE)
    private String rate;


    public Eth2RateList dateTime(Long dateTime) {
        
        this.dateTime = dateTime;
        return this;
    }

     /**
     * Date and Time Stamp
     * @return dateTime
    **/
    @javax.annotation.Nullable
    public Long getDateTime() {
        return dateTime;
    }


    public void setDateTime(Long dateTime) {
        this.dateTime = dateTime;
    }

    public Eth2RateList date(String date) {
        
        this.date = date;
        return this;
    }

     /**
     * Date
     * @return date
    **/
    @javax.annotation.Nullable
    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public Eth2RateList rate(String rate) {
        
        this.rate = rate;
        return this;
    }

     /**
     * percentage
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
        Eth2RateList eth2RateList = (Eth2RateList) o;
        return Objects.equals(this.dateTime, eth2RateList.dateTime) &&
                Objects.equals(this.date, eth2RateList.date) &&
                Objects.equals(this.rate, eth2RateList.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, date, rate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Eth2RateList {\n");
        sb.append("      dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("      date: ").append(toIndentedString(date)).append("\n");
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

