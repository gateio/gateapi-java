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
import io.gate.gateapi.models.UnifiedHistoryLoanRateRates;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UnifiedHistoryLoanRate
 */
public class UnifiedHistoryLoanRate {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_TIER = "tier";
    @SerializedName(SERIALIZED_NAME_TIER)
    private String tier;

    public static final String SERIALIZED_NAME_TIER_UP_RATE = "tier_up_rate";
    @SerializedName(SERIALIZED_NAME_TIER_UP_RATE)
    private String tierUpRate;

    public static final String SERIALIZED_NAME_RATES = "rates";
    @SerializedName(SERIALIZED_NAME_RATES)
    private List<UnifiedHistoryLoanRateRates> rates = null;


    public UnifiedHistoryLoanRate currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Currency name
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public UnifiedHistoryLoanRate tier(String tier) {
        
        this.tier = tier;
        return this;
    }

     /**
     * The VIP level of the floating rate required
     * @return tier
    **/
    @javax.annotation.Nullable
    public String getTier() {
        return tier;
    }


    public void setTier(String tier) {
        this.tier = tier;
    }

    public UnifiedHistoryLoanRate tierUpRate(String tierUpRate) {
        
        this.tierUpRate = tierUpRate;
        return this;
    }

     /**
     * VIP level corresponding floating rate
     * @return tierUpRate
    **/
    @javax.annotation.Nullable
    public String getTierUpRate() {
        return tierUpRate;
    }


    public void setTierUpRate(String tierUpRate) {
        this.tierUpRate = tierUpRate;
    }

    public UnifiedHistoryLoanRate rates(List<UnifiedHistoryLoanRateRates> rates) {
        
        this.rates = rates;
        return this;
    }

    public UnifiedHistoryLoanRate addRatesItem(UnifiedHistoryLoanRateRates ratesItem) {
        if (this.rates == null) {
            this.rates = new ArrayList<>();
        }
        this.rates.add(ratesItem);
        return this;
    }

     /**
     * Historical interest rate information, one data per hour, the array size is determined by the page and limit parameters provided by the interface request parameters, sorted from recent to far in time
     * @return rates
    **/
    @javax.annotation.Nullable
    public List<UnifiedHistoryLoanRateRates> getRates() {
        return rates;
    }


    public void setRates(List<UnifiedHistoryLoanRateRates> rates) {
        this.rates = rates;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnifiedHistoryLoanRate unifiedHistoryLoanRate = (UnifiedHistoryLoanRate) o;
        return Objects.equals(this.currency, unifiedHistoryLoanRate.currency) &&
                Objects.equals(this.tier, unifiedHistoryLoanRate.tier) &&
                Objects.equals(this.tierUpRate, unifiedHistoryLoanRate.tierUpRate) &&
                Objects.equals(this.rates, unifiedHistoryLoanRate.rates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, tier, tierUpRate, rates);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnifiedHistoryLoanRate {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      tier: ").append(toIndentedString(tier)).append("\n");
        sb.append("      tierUpRate: ").append(toIndentedString(tierUpRate)).append("\n");
        sb.append("      rates: ").append(toIndentedString(rates)).append("\n");
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
