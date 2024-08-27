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
 * Profit and loss range
 */
public class ProfitLossRange {
    public static final String SERIALIZED_NAME_PRICE_PERCENTAGE = "price_percentage";
    @SerializedName(SERIALIZED_NAME_PRICE_PERCENTAGE)
    private String pricePercentage;

    public static final String SERIALIZED_NAME_IMPLIED_VOLATILITY_PERCENTAGE = "implied_volatility_percentage";
    @SerializedName(SERIALIZED_NAME_IMPLIED_VOLATILITY_PERCENTAGE)
    private String impliedVolatilityPercentage;

    public static final String SERIALIZED_NAME_PROFIT_LOSS = "profit_loss";
    @SerializedName(SERIALIZED_NAME_PROFIT_LOSS)
    private String profitLoss;


    public ProfitLossRange pricePercentage(String pricePercentage) {
        
        this.pricePercentage = pricePercentage;
        return this;
    }

     /**
     * Percentage change in price
     * @return pricePercentage
    **/
    @javax.annotation.Nullable
    public String getPricePercentage() {
        return pricePercentage;
    }


    public void setPricePercentage(String pricePercentage) {
        this.pricePercentage = pricePercentage;
    }

    public ProfitLossRange impliedVolatilityPercentage(String impliedVolatilityPercentage) {
        
        this.impliedVolatilityPercentage = impliedVolatilityPercentage;
        return this;
    }

     /**
     * Percentage change in implied volatility
     * @return impliedVolatilityPercentage
    **/
    @javax.annotation.Nullable
    public String getImpliedVolatilityPercentage() {
        return impliedVolatilityPercentage;
    }


    public void setImpliedVolatilityPercentage(String impliedVolatilityPercentage) {
        this.impliedVolatilityPercentage = impliedVolatilityPercentage;
    }

    public ProfitLossRange profitLoss(String profitLoss) {
        
        this.profitLoss = profitLoss;
        return this;
    }

     /**
     * PNL
     * @return profitLoss
    **/
    @javax.annotation.Nullable
    public String getProfitLoss() {
        return profitLoss;
    }


    public void setProfitLoss(String profitLoss) {
        this.profitLoss = profitLoss;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProfitLossRange profitLossRange = (ProfitLossRange) o;
        return Objects.equals(this.pricePercentage, profitLossRange.pricePercentage) &&
                Objects.equals(this.impliedVolatilityPercentage, profitLossRange.impliedVolatilityPercentage) &&
                Objects.equals(this.profitLoss, profitLossRange.profitLoss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pricePercentage, impliedVolatilityPercentage, profitLoss);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfitLossRange {\n");
        sb.append("      pricePercentage: ").append(toIndentedString(pricePercentage)).append("\n");
        sb.append("      impliedVolatilityPercentage: ").append(toIndentedString(impliedVolatilityPercentage)).append("\n");
        sb.append("      profitLoss: ").append(toIndentedString(profitLoss)).append("\n");
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

