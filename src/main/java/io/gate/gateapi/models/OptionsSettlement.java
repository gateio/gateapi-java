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
 * OptionsSettlement
 */
public class OptionsSettlement {
    public static final String SERIALIZED_NAME_TIME = "time";
    @SerializedName(SERIALIZED_NAME_TIME)
    private Double time;

    public static final String SERIALIZED_NAME_CONTRACT = "contract";
    @SerializedName(SERIALIZED_NAME_CONTRACT)
    private String contract;

    public static final String SERIALIZED_NAME_PROFIT = "profit";
    @SerializedName(SERIALIZED_NAME_PROFIT)
    private String profit;

    public static final String SERIALIZED_NAME_FEE = "fee";
    @SerializedName(SERIALIZED_NAME_FEE)
    private String fee;

    public static final String SERIALIZED_NAME_STRIKE_PRICE = "strike_price";
    @SerializedName(SERIALIZED_NAME_STRIKE_PRICE)
    private String strikePrice;

    public static final String SERIALIZED_NAME_SETTLE_PRICE = "settle_price";
    @SerializedName(SERIALIZED_NAME_SETTLE_PRICE)
    private String settlePrice;


    public OptionsSettlement time(Double time) {
        
        this.time = time;
        return this;
    }

     /**
     * Last changed time of configuration
     * @return time
    **/
    @javax.annotation.Nullable
    public Double getTime() {
        return time;
    }


    public void setTime(Double time) {
        this.time = time;
    }

    public OptionsSettlement contract(String contract) {
        
        this.contract = contract;
        return this;
    }

     /**
     * Options contract name
     * @return contract
    **/
    @javax.annotation.Nullable
    public String getContract() {
        return contract;
    }


    public void setContract(String contract) {
        this.contract = contract;
    }

    public OptionsSettlement profit(String profit) {
        
        this.profit = profit;
        return this;
    }

     /**
     * Settlement profit per size (quote currency)
     * @return profit
    **/
    @javax.annotation.Nullable
    public String getProfit() {
        return profit;
    }


    public void setProfit(String profit) {
        this.profit = profit;
    }

    public OptionsSettlement fee(String fee) {
        
        this.fee = fee;
        return this;
    }

     /**
     * Settlement fee per size (quote currency)
     * @return fee
    **/
    @javax.annotation.Nullable
    public String getFee() {
        return fee;
    }


    public void setFee(String fee) {
        this.fee = fee;
    }

    public OptionsSettlement strikePrice(String strikePrice) {
        
        this.strikePrice = strikePrice;
        return this;
    }

     /**
     * Strike price (quote currency)
     * @return strikePrice
    **/
    @javax.annotation.Nullable
    public String getStrikePrice() {
        return strikePrice;
    }


    public void setStrikePrice(String strikePrice) {
        this.strikePrice = strikePrice;
    }

    public OptionsSettlement settlePrice(String settlePrice) {
        
        this.settlePrice = settlePrice;
        return this;
    }

     /**
     * Settlement price (quote currency)
     * @return settlePrice
    **/
    @javax.annotation.Nullable
    public String getSettlePrice() {
        return settlePrice;
    }


    public void setSettlePrice(String settlePrice) {
        this.settlePrice = settlePrice;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OptionsSettlement optionsSettlement = (OptionsSettlement) o;
        return Objects.equals(this.time, optionsSettlement.time) &&
                Objects.equals(this.contract, optionsSettlement.contract) &&
                Objects.equals(this.profit, optionsSettlement.profit) &&
                Objects.equals(this.fee, optionsSettlement.fee) &&
                Objects.equals(this.strikePrice, optionsSettlement.strikePrice) &&
                Objects.equals(this.settlePrice, optionsSettlement.settlePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, contract, profit, fee, strikePrice, settlePrice);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptionsSettlement {\n");
        sb.append("      time: ").append(toIndentedString(time)).append("\n");
        sb.append("      contract: ").append(toIndentedString(contract)).append("\n");
        sb.append("      profit: ").append(toIndentedString(profit)).append("\n");
        sb.append("      fee: ").append(toIndentedString(fee)).append("\n");
        sb.append("      strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
        sb.append("      settlePrice: ").append(toIndentedString(settlePrice)).append("\n");
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

