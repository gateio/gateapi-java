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
 * RepayRecordCurrency
 */
public class RepayRecordCurrency {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_INDEX_PRICE = "index_price";
    @SerializedName(SERIALIZED_NAME_INDEX_PRICE)
    private String indexPrice;

    public static final String SERIALIZED_NAME_BEFORE_AMOUNT = "before_amount";
    @SerializedName(SERIALIZED_NAME_BEFORE_AMOUNT)
    private String beforeAmount;

    public static final String SERIALIZED_NAME_BEFORE_AMOUNT_USDT = "before_amount_usdt";
    @SerializedName(SERIALIZED_NAME_BEFORE_AMOUNT_USDT)
    private String beforeAmountUsdt;

    public static final String SERIALIZED_NAME_AFTER_AMOUNT = "after_amount";
    @SerializedName(SERIALIZED_NAME_AFTER_AMOUNT)
    private String afterAmount;

    public static final String SERIALIZED_NAME_AFTER_AMOUNT_USDT = "after_amount_usdt";
    @SerializedName(SERIALIZED_NAME_AFTER_AMOUNT_USDT)
    private String afterAmountUsdt;


    public RepayRecordCurrency currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Currency.
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public RepayRecordCurrency indexPrice(String indexPrice) {
        
        this.indexPrice = indexPrice;
        return this;
    }

     /**
     * Currency Index Price.
     * @return indexPrice
    **/
    @javax.annotation.Nullable
    public String getIndexPrice() {
        return indexPrice;
    }


    public void setIndexPrice(String indexPrice) {
        this.indexPrice = indexPrice;
    }

    public RepayRecordCurrency beforeAmount(String beforeAmount) {
        
        this.beforeAmount = beforeAmount;
        return this;
    }

     /**
     * Amount before the operation.
     * @return beforeAmount
    **/
    @javax.annotation.Nullable
    public String getBeforeAmount() {
        return beforeAmount;
    }


    public void setBeforeAmount(String beforeAmount) {
        this.beforeAmount = beforeAmount;
    }

    public RepayRecordCurrency beforeAmountUsdt(String beforeAmountUsdt) {
        
        this.beforeAmountUsdt = beforeAmountUsdt;
        return this;
    }

     /**
     * USDT Amount before the operation.
     * @return beforeAmountUsdt
    **/
    @javax.annotation.Nullable
    public String getBeforeAmountUsdt() {
        return beforeAmountUsdt;
    }


    public void setBeforeAmountUsdt(String beforeAmountUsdt) {
        this.beforeAmountUsdt = beforeAmountUsdt;
    }

    public RepayRecordCurrency afterAmount(String afterAmount) {
        
        this.afterAmount = afterAmount;
        return this;
    }

     /**
     * Amount after the operation.
     * @return afterAmount
    **/
    @javax.annotation.Nullable
    public String getAfterAmount() {
        return afterAmount;
    }


    public void setAfterAmount(String afterAmount) {
        this.afterAmount = afterAmount;
    }

    public RepayRecordCurrency afterAmountUsdt(String afterAmountUsdt) {
        
        this.afterAmountUsdt = afterAmountUsdt;
        return this;
    }

     /**
     * USDT Amount after the operation.
     * @return afterAmountUsdt
    **/
    @javax.annotation.Nullable
    public String getAfterAmountUsdt() {
        return afterAmountUsdt;
    }


    public void setAfterAmountUsdt(String afterAmountUsdt) {
        this.afterAmountUsdt = afterAmountUsdt;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepayRecordCurrency repayRecordCurrency = (RepayRecordCurrency) o;
        return Objects.equals(this.currency, repayRecordCurrency.currency) &&
                Objects.equals(this.indexPrice, repayRecordCurrency.indexPrice) &&
                Objects.equals(this.beforeAmount, repayRecordCurrency.beforeAmount) &&
                Objects.equals(this.beforeAmountUsdt, repayRecordCurrency.beforeAmountUsdt) &&
                Objects.equals(this.afterAmount, repayRecordCurrency.afterAmount) &&
                Objects.equals(this.afterAmountUsdt, repayRecordCurrency.afterAmountUsdt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, indexPrice, beforeAmount, beforeAmountUsdt, afterAmount, afterAmountUsdt);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepayRecordCurrency {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      indexPrice: ").append(toIndentedString(indexPrice)).append("\n");
        sb.append("      beforeAmount: ").append(toIndentedString(beforeAmount)).append("\n");
        sb.append("      beforeAmountUsdt: ").append(toIndentedString(beforeAmountUsdt)).append("\n");
        sb.append("      afterAmount: ").append(toIndentedString(afterAmount)).append("\n");
        sb.append("      afterAmountUsdt: ").append(toIndentedString(afterAmountUsdt)).append("\n");
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

