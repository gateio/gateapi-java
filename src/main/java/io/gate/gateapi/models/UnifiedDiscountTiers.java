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
 * UnifiedDiscountTiers
 */
public class UnifiedDiscountTiers {
    public static final String SERIALIZED_NAME_TIER = "tier";
    @SerializedName(SERIALIZED_NAME_TIER)
    private String tier;

    public static final String SERIALIZED_NAME_DISCOUNT = "discount";
    @SerializedName(SERIALIZED_NAME_DISCOUNT)
    private String discount;

    public static final String SERIALIZED_NAME_LOWER_LIMIT = "lower_limit";
    @SerializedName(SERIALIZED_NAME_LOWER_LIMIT)
    private String lowerLimit;

    public static final String SERIALIZED_NAME_UPPER_LIMIT = "upper_limit";
    @SerializedName(SERIALIZED_NAME_UPPER_LIMIT)
    private String upperLimit;

    public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
    @SerializedName(SERIALIZED_NAME_LEVERAGE)
    private String leverage;


    public UnifiedDiscountTiers tier(String tier) {
        
        this.tier = tier;
        return this;
    }

     /**
     * Tier
     * @return tier
    **/
    @javax.annotation.Nullable
    public String getTier() {
        return tier;
    }


    public void setTier(String tier) {
        this.tier = tier;
    }

    public UnifiedDiscountTiers discount(String discount) {
        
        this.discount = discount;
        return this;
    }

     /**
     * Discount
     * @return discount
    **/
    @javax.annotation.Nullable
    public String getDiscount() {
        return discount;
    }


    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public UnifiedDiscountTiers lowerLimit(String lowerLimit) {
        
        this.lowerLimit = lowerLimit;
        return this;
    }

     /**
     * Lower limit
     * @return lowerLimit
    **/
    @javax.annotation.Nullable
    public String getLowerLimit() {
        return lowerLimit;
    }


    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public UnifiedDiscountTiers upperLimit(String upperLimit) {
        
        this.upperLimit = upperLimit;
        return this;
    }

     /**
     * Upper limit,＋ indicates positive infinity
     * @return upperLimit
    **/
    @javax.annotation.Nullable
    public String getUpperLimit() {
        return upperLimit;
    }


    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public UnifiedDiscountTiers leverage(String leverage) {
        
        this.leverage = leverage;
        return this;
    }

     /**
     * Position leverage
     * @return leverage
    **/
    @javax.annotation.Nullable
    public String getLeverage() {
        return leverage;
    }


    public void setLeverage(String leverage) {
        this.leverage = leverage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnifiedDiscountTiers unifiedDiscountTiers = (UnifiedDiscountTiers) o;
        return Objects.equals(this.tier, unifiedDiscountTiers.tier) &&
                Objects.equals(this.discount, unifiedDiscountTiers.discount) &&
                Objects.equals(this.lowerLimit, unifiedDiscountTiers.lowerLimit) &&
                Objects.equals(this.upperLimit, unifiedDiscountTiers.upperLimit) &&
                Objects.equals(this.leverage, unifiedDiscountTiers.leverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tier, discount, lowerLimit, upperLimit, leverage);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnifiedDiscountTiers {\n");
        sb.append("      tier: ").append(toIndentedString(tier)).append("\n");
        sb.append("      discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("      lowerLimit: ").append(toIndentedString(lowerLimit)).append("\n");
        sb.append("      upperLimit: ").append(toIndentedString(upperLimit)).append("\n");
        sb.append("      leverage: ").append(toIndentedString(leverage)).append("\n");
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

