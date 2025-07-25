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
 * The sub broker info.
 */
public class BrokerCommissionSubBrokerInfo {
    public static final String SERIALIZED_NAME_USER_ID = "user_id";
    @SerializedName(SERIALIZED_NAME_USER_ID)
    private Long userId;

    public static final String SERIALIZED_NAME_ORIGINAL_COMMISSION_RATE = "original_commission_rate";
    @SerializedName(SERIALIZED_NAME_ORIGINAL_COMMISSION_RATE)
    private String originalCommissionRate;

    public static final String SERIALIZED_NAME_RELATIVE_COMMISSION_RATE = "relative_commission_rate";
    @SerializedName(SERIALIZED_NAME_RELATIVE_COMMISSION_RATE)
    private String relativeCommissionRate;

    public static final String SERIALIZED_NAME_COMMISSION_RATE = "commission_rate";
    @SerializedName(SERIALIZED_NAME_COMMISSION_RATE)
    private String commissionRate;


    public BrokerCommissionSubBrokerInfo userId(Long userId) {
        
        this.userId = userId;
        return this;
    }

     /**
     * The sub broker user ID.
     * @return userId
    **/
    @javax.annotation.Nullable
    public Long getUserId() {
        return userId;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BrokerCommissionSubBrokerInfo originalCommissionRate(String originalCommissionRate) {
        
        this.originalCommissionRate = originalCommissionRate;
        return this;
    }

     /**
     * The sub broker original commission rate.
     * @return originalCommissionRate
    **/
    @javax.annotation.Nullable
    public String getOriginalCommissionRate() {
        return originalCommissionRate;
    }


    public void setOriginalCommissionRate(String originalCommissionRate) {
        this.originalCommissionRate = originalCommissionRate;
    }

    public BrokerCommissionSubBrokerInfo relativeCommissionRate(String relativeCommissionRate) {
        
        this.relativeCommissionRate = relativeCommissionRate;
        return this;
    }

     /**
     * The sub broker relative commission rate.
     * @return relativeCommissionRate
    **/
    @javax.annotation.Nullable
    public String getRelativeCommissionRate() {
        return relativeCommissionRate;
    }


    public void setRelativeCommissionRate(String relativeCommissionRate) {
        this.relativeCommissionRate = relativeCommissionRate;
    }

    public BrokerCommissionSubBrokerInfo commissionRate(String commissionRate) {
        
        this.commissionRate = commissionRate;
        return this;
    }

     /**
     * The sub broker actual commission rate.
     * @return commissionRate
    **/
    @javax.annotation.Nullable
    public String getCommissionRate() {
        return commissionRate;
    }


    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrokerCommissionSubBrokerInfo brokerCommissionSubBrokerInfo = (BrokerCommissionSubBrokerInfo) o;
        return Objects.equals(this.userId, brokerCommissionSubBrokerInfo.userId) &&
                Objects.equals(this.originalCommissionRate, brokerCommissionSubBrokerInfo.originalCommissionRate) &&
                Objects.equals(this.relativeCommissionRate, brokerCommissionSubBrokerInfo.relativeCommissionRate) &&
                Objects.equals(this.commissionRate, brokerCommissionSubBrokerInfo.commissionRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, originalCommissionRate, relativeCommissionRate, commissionRate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrokerCommissionSubBrokerInfo {\n");
        sb.append("      userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("      originalCommissionRate: ").append(toIndentedString(originalCommissionRate)).append("\n");
        sb.append("      relativeCommissionRate: ").append(toIndentedString(relativeCommissionRate)).append("\n");
        sb.append("      commissionRate: ").append(toIndentedString(commissionRate)).append("\n");
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

