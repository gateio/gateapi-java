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
 * List all supported currencies in flash swap.
 */
public class FlashSwapCurrencyPair {
    public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
    @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
    private String currencyPair;

    public static final String SERIALIZED_NAME_SELL_CURRENCY = "sell_currency";
    @SerializedName(SERIALIZED_NAME_SELL_CURRENCY)
    private String sellCurrency;

    public static final String SERIALIZED_NAME_BUY_CURRENCY = "buy_currency";
    @SerializedName(SERIALIZED_NAME_BUY_CURRENCY)
    private String buyCurrency;

    public static final String SERIALIZED_NAME_SELL_MIN_AMOUNT = "sell_min_amount";
    @SerializedName(SERIALIZED_NAME_SELL_MIN_AMOUNT)
    private String sellMinAmount;

    public static final String SERIALIZED_NAME_SELL_MAX_AMOUNT = "sell_max_amount";
    @SerializedName(SERIALIZED_NAME_SELL_MAX_AMOUNT)
    private String sellMaxAmount;

    public static final String SERIALIZED_NAME_BUY_MIN_AMOUNT = "buy_min_amount";
    @SerializedName(SERIALIZED_NAME_BUY_MIN_AMOUNT)
    private String buyMinAmount;

    public static final String SERIALIZED_NAME_BUY_MAX_AMOUNT = "buy_max_amount";
    @SerializedName(SERIALIZED_NAME_BUY_MAX_AMOUNT)
    private String buyMaxAmount;


     /**
     * The currency pair, BTC_USDT represents selling Bitcoin (BTC) and buying Tether (USDT).
     * @return currencyPair
    **/
    @javax.annotation.Nullable
    public String getCurrencyPair() {
        return currencyPair;
    }


     /**
     * The currency to be sold.
     * @return sellCurrency
    **/
    @javax.annotation.Nullable
    public String getSellCurrency() {
        return sellCurrency;
    }


     /**
     * The currency to be bought.
     * @return buyCurrency
    **/
    @javax.annotation.Nullable
    public String getBuyCurrency() {
        return buyCurrency;
    }


     /**
     * The minimum quantity required for selling.
     * @return sellMinAmount
    **/
    @javax.annotation.Nullable
    public String getSellMinAmount() {
        return sellMinAmount;
    }


     /**
     * The maximum quantity allowed for selling.
     * @return sellMaxAmount
    **/
    @javax.annotation.Nullable
    public String getSellMaxAmount() {
        return sellMaxAmount;
    }


     /**
     * The minimum quantity required for buying.
     * @return buyMinAmount
    **/
    @javax.annotation.Nullable
    public String getBuyMinAmount() {
        return buyMinAmount;
    }


     /**
     * The maximum quantity allowed for buying.
     * @return buyMaxAmount
    **/
    @javax.annotation.Nullable
    public String getBuyMaxAmount() {
        return buyMaxAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlashSwapCurrencyPair flashSwapCurrencyPair = (FlashSwapCurrencyPair) o;
        return Objects.equals(this.currencyPair, flashSwapCurrencyPair.currencyPair) &&
                Objects.equals(this.sellCurrency, flashSwapCurrencyPair.sellCurrency) &&
                Objects.equals(this.buyCurrency, flashSwapCurrencyPair.buyCurrency) &&
                Objects.equals(this.sellMinAmount, flashSwapCurrencyPair.sellMinAmount) &&
                Objects.equals(this.sellMaxAmount, flashSwapCurrencyPair.sellMaxAmount) &&
                Objects.equals(this.buyMinAmount, flashSwapCurrencyPair.buyMinAmount) &&
                Objects.equals(this.buyMaxAmount, flashSwapCurrencyPair.buyMaxAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyPair, sellCurrency, buyCurrency, sellMinAmount, sellMaxAmount, buyMinAmount, buyMaxAmount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlashSwapCurrencyPair {\n");
        sb.append("      currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
        sb.append("      sellCurrency: ").append(toIndentedString(sellCurrency)).append("\n");
        sb.append("      buyCurrency: ").append(toIndentedString(buyCurrency)).append("\n");
        sb.append("      sellMinAmount: ").append(toIndentedString(sellMinAmount)).append("\n");
        sb.append("      sellMaxAmount: ").append(toIndentedString(sellMaxAmount)).append("\n");
        sb.append("      buyMinAmount: ").append(toIndentedString(buyMinAmount)).append("\n");
        sb.append("      buyMaxAmount: ").append(toIndentedString(buyMaxAmount)).append("\n");
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

