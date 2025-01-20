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
 * AccountRateLimit
 */
public class AccountRateLimit {
    public static final String SERIALIZED_NAME_TIER = "tier";
    @SerializedName(SERIALIZED_NAME_TIER)
    private String tier;

    public static final String SERIALIZED_NAME_RATIO = "ratio";
    @SerializedName(SERIALIZED_NAME_RATIO)
    private String ratio;

    public static final String SERIALIZED_NAME_MAIN_RATIO = "main_ratio";
    @SerializedName(SERIALIZED_NAME_MAIN_RATIO)
    private String mainRatio;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;


    public AccountRateLimit tier(String tier) {
        
        this.tier = tier;
        return this;
    }

     /**
     * Frequency limit level (For detailed frequency limit rules, see [Transaction ratio frequency limit](#rate-limit-based-on-fill-ratio))
     * @return tier
    **/
    @javax.annotation.Nullable
    public String getTier() {
        return tier;
    }


    public void setTier(String tier) {
        this.tier = tier;
    }

    public AccountRateLimit ratio(String ratio) {
        
        this.ratio = ratio;
        return this;
    }

     /**
     * Transaction rate
     * @return ratio
    **/
    @javax.annotation.Nullable
    public String getRatio() {
        return ratio;
    }


    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public AccountRateLimit mainRatio(String mainRatio) {
        
        this.mainRatio = mainRatio;
        return this;
    }

     /**
     * Total transaction ratio of main account
     * @return mainRatio
    **/
    @javax.annotation.Nullable
    public String getMainRatio() {
        return mainRatio;
    }


    public void setMainRatio(String mainRatio) {
        this.mainRatio = mainRatio;
    }

    public AccountRateLimit updatedAt(String updatedAt) {
        
        this.updatedAt = updatedAt;
        return this;
    }

     /**
     * Update time
     * @return updatedAt
    **/
    @javax.annotation.Nullable
    public String getUpdatedAt() {
        return updatedAt;
    }


    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountRateLimit accountRateLimit = (AccountRateLimit) o;
        return Objects.equals(this.tier, accountRateLimit.tier) &&
                Objects.equals(this.ratio, accountRateLimit.ratio) &&
                Objects.equals(this.mainRatio, accountRateLimit.mainRatio) &&
                Objects.equals(this.updatedAt, accountRateLimit.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tier, ratio, mainRatio, updatedAt);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountRateLimit {\n");
        sb.append("      tier: ").append(toIndentedString(tier)).append("\n");
        sb.append("      ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("      mainRatio: ").append(toIndentedString(mainRatio)).append("\n");
        sb.append("      updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

