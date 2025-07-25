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
 * Blockchain Mining.
 */
public class SwapCoin {
    public static final String SERIALIZED_NAME_COIN = "coin";
    @SerializedName(SERIALIZED_NAME_COIN)
    private String coin;

    public static final String SERIALIZED_NAME_SIDE = "side";
    @SerializedName(SERIALIZED_NAME_SIDE)
    private String side;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private String amount;

    public static final String SERIALIZED_NAME_PID = "pid";
    @SerializedName(SERIALIZED_NAME_PID)
    private Integer pid;


    public SwapCoin coin(String coin) {
        
        this.coin = coin;
        return this;
    }

     /**
     * Currency.
     * @return coin
    **/
    public String getCoin() {
        return coin;
    }


    public void setCoin(String coin) {
        this.coin = coin;
    }

    public SwapCoin side(String side) {
        
        this.side = side;
        return this;
    }

     /**
     * 0 - Stake 1 - Redeem.
     * @return side
    **/
    public String getSide() {
        return side;
    }


    public void setSide(String side) {
        this.side = side;
    }

    public SwapCoin amount(String amount) {
        
        this.amount = amount;
        return this;
    }

     /**
     * Size.
     * @return amount
    **/
    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }

    public SwapCoin pid(Integer pid) {
        
        this.pid = pid;
        return this;
    }

     /**
     * DeFi-type Mining Protocol Identifier.
     * @return pid
    **/
    @javax.annotation.Nullable
    public Integer getPid() {
        return pid;
    }


    public void setPid(Integer pid) {
        this.pid = pid;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwapCoin swapCoin = (SwapCoin) o;
        return Objects.equals(this.coin, swapCoin.coin) &&
                Objects.equals(this.side, swapCoin.side) &&
                Objects.equals(this.amount, swapCoin.amount) &&
                Objects.equals(this.pid, swapCoin.pid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coin, side, amount, pid);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwapCoin {\n");
        sb.append("      coin: ").append(toIndentedString(coin)).append("\n");
        sb.append("      side: ").append(toIndentedString(side)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("      pid: ").append(toIndentedString(pid)).append("\n");
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

