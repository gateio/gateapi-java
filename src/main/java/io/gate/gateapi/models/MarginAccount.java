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
import io.gate.gateapi.models.MarginAccountCurrency;
import java.io.IOException;

/**
 * Margin account detail. &#x60;base&#x60; refers to base currency, while &#x60;quotes to quote currency
 */
public class MarginAccount {
    public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
    @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
    private String currencyPair;

    public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
    @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
    private String accountType;

    public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
    @SerializedName(SERIALIZED_NAME_LEVERAGE)
    private String leverage;

    public static final String SERIALIZED_NAME_LOCKED = "locked";
    @SerializedName(SERIALIZED_NAME_LOCKED)
    private Boolean locked;

    public static final String SERIALIZED_NAME_RISK = "risk";
    @SerializedName(SERIALIZED_NAME_RISK)
    private String risk;

    public static final String SERIALIZED_NAME_MMR = "mmr";
    @SerializedName(SERIALIZED_NAME_MMR)
    private String mmr;

    public static final String SERIALIZED_NAME_BASE = "base";
    @SerializedName(SERIALIZED_NAME_BASE)
    private MarginAccountCurrency base;

    public static final String SERIALIZED_NAME_QUOTE = "quote";
    @SerializedName(SERIALIZED_NAME_QUOTE)
    private MarginAccountCurrency quote;


    public MarginAccount currencyPair(String currencyPair) {
        
        this.currencyPair = currencyPair;
        return this;
    }

     /**
     * Currency pair
     * @return currencyPair
    **/
    @javax.annotation.Nullable
    public String getCurrencyPair() {
        return currencyPair;
    }


    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public MarginAccount accountType(String accountType) {
        
        this.accountType = accountType;
        return this;
    }

     /**
     * Account type, risk - risk rate account, mmr - maintenance margin rate account, inactive - market not activated
     * @return accountType
    **/
    @javax.annotation.Nullable
    public String getAccountType() {
        return accountType;
    }


    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public MarginAccount leverage(String leverage) {
        
        this.leverage = leverage;
        return this;
    }

     /**
     * User current market leverage multiple
     * @return leverage
    **/
    @javax.annotation.Nullable
    public String getLeverage() {
        return leverage;
    }


    public void setLeverage(String leverage) {
        this.leverage = leverage;
    }

    public MarginAccount locked(Boolean locked) {
        
        this.locked = locked;
        return this;
    }

     /**
     * Whether account is locked
     * @return locked
    **/
    @javax.annotation.Nullable
    public Boolean getLocked() {
        return locked;
    }


    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public MarginAccount risk(String risk) {
        
        this.risk = risk;
        return this;
    }

     /**
     * Leveraged Account Current Risk Rate (Returned when the Account is a Risk Rate Account)
     * @return risk
    **/
    @javax.annotation.Nullable
    public String getRisk() {
        return risk;
    }


    public void setRisk(String risk) {
        this.risk = risk;
    }

    public MarginAccount mmr(String mmr) {
        
        this.mmr = mmr;
        return this;
    }

     /**
     * Leveraged Account Current Maintenance Margin Rate (returned when the Account is a Maintenance Margin Rate Account)
     * @return mmr
    **/
    @javax.annotation.Nullable
    public String getMmr() {
        return mmr;
    }


    public void setMmr(String mmr) {
        this.mmr = mmr;
    }

    public MarginAccount base(MarginAccountCurrency base) {
        
        this.base = base;
        return this;
    }

     /**
     * Get base
     * @return base
    **/
    @javax.annotation.Nullable
    public MarginAccountCurrency getBase() {
        return base;
    }


    public void setBase(MarginAccountCurrency base) {
        this.base = base;
    }

    public MarginAccount quote(MarginAccountCurrency quote) {
        
        this.quote = quote;
        return this;
    }

     /**
     * Get quote
     * @return quote
    **/
    @javax.annotation.Nullable
    public MarginAccountCurrency getQuote() {
        return quote;
    }


    public void setQuote(MarginAccountCurrency quote) {
        this.quote = quote;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarginAccount marginAccount = (MarginAccount) o;
        return Objects.equals(this.currencyPair, marginAccount.currencyPair) &&
                Objects.equals(this.accountType, marginAccount.accountType) &&
                Objects.equals(this.leverage, marginAccount.leverage) &&
                Objects.equals(this.locked, marginAccount.locked) &&
                Objects.equals(this.risk, marginAccount.risk) &&
                Objects.equals(this.mmr, marginAccount.mmr) &&
                Objects.equals(this.base, marginAccount.base) &&
                Objects.equals(this.quote, marginAccount.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyPair, accountType, leverage, locked, risk, mmr, base, quote);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarginAccount {\n");
        sb.append("      currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
        sb.append("      accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("      leverage: ").append(toIndentedString(leverage)).append("\n");
        sb.append("      locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("      risk: ").append(toIndentedString(risk)).append("\n");
        sb.append("      mmr: ").append(toIndentedString(mmr)).append("\n");
        sb.append("      base: ").append(toIndentedString(base)).append("\n");
        sb.append("      quote: ").append(toIndentedString(quote)).append("\n");
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

