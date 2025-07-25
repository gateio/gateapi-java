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
 * SpotCurrencyChain
 */
public class SpotCurrencyChain {
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ADDR = "addr";
    @SerializedName(SERIALIZED_NAME_ADDR)
    private String addr;

    public static final String SERIALIZED_NAME_WITHDRAW_DISABLED = "withdraw_disabled";
    @SerializedName(SERIALIZED_NAME_WITHDRAW_DISABLED)
    private Boolean withdrawDisabled;

    public static final String SERIALIZED_NAME_WITHDRAW_DELAYED = "withdraw_delayed";
    @SerializedName(SERIALIZED_NAME_WITHDRAW_DELAYED)
    private Boolean withdrawDelayed;

    public static final String SERIALIZED_NAME_DEPOSIT_DISABLED = "deposit_disabled";
    @SerializedName(SERIALIZED_NAME_DEPOSIT_DISABLED)
    private Boolean depositDisabled;


    public SpotCurrencyChain name(String name) {
        
        this.name = name;
        return this;
    }

     /**
     * Chain name.
     * @return name
    **/
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public SpotCurrencyChain addr(String addr) {
        
        this.addr = addr;
        return this;
    }

     /**
     * token address.
     * @return addr
    **/
    @javax.annotation.Nullable
    public String getAddr() {
        return addr;
    }


    public void setAddr(String addr) {
        this.addr = addr;
    }

    public SpotCurrencyChain withdrawDisabled(Boolean withdrawDisabled) {
        
        this.withdrawDisabled = withdrawDisabled;
        return this;
    }

     /**
     * Whether currency&#39;s withdrawal is disabled.
     * @return withdrawDisabled
    **/
    @javax.annotation.Nullable
    public Boolean getWithdrawDisabled() {
        return withdrawDisabled;
    }


    public void setWithdrawDisabled(Boolean withdrawDisabled) {
        this.withdrawDisabled = withdrawDisabled;
    }

    public SpotCurrencyChain withdrawDelayed(Boolean withdrawDelayed) {
        
        this.withdrawDelayed = withdrawDelayed;
        return this;
    }

     /**
     * Whether currency&#39;s withdrawal is delayed.
     * @return withdrawDelayed
    **/
    @javax.annotation.Nullable
    public Boolean getWithdrawDelayed() {
        return withdrawDelayed;
    }


    public void setWithdrawDelayed(Boolean withdrawDelayed) {
        this.withdrawDelayed = withdrawDelayed;
    }

    public SpotCurrencyChain depositDisabled(Boolean depositDisabled) {
        
        this.depositDisabled = depositDisabled;
        return this;
    }

     /**
     * Whether currency&#39;s deposit is disabled.
     * @return depositDisabled
    **/
    @javax.annotation.Nullable
    public Boolean getDepositDisabled() {
        return depositDisabled;
    }


    public void setDepositDisabled(Boolean depositDisabled) {
        this.depositDisabled = depositDisabled;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpotCurrencyChain spotCurrencyChain = (SpotCurrencyChain) o;
        return Objects.equals(this.name, spotCurrencyChain.name) &&
                Objects.equals(this.addr, spotCurrencyChain.addr) &&
                Objects.equals(this.withdrawDisabled, spotCurrencyChain.withdrawDisabled) &&
                Objects.equals(this.withdrawDelayed, spotCurrencyChain.withdrawDelayed) &&
                Objects.equals(this.depositDisabled, spotCurrencyChain.depositDisabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addr, withdrawDisabled, withdrawDelayed, depositDisabled);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpotCurrencyChain {\n");
        sb.append("      name: ").append(toIndentedString(name)).append("\n");
        sb.append("      addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("      withdrawDisabled: ").append(toIndentedString(withdrawDisabled)).append("\n");
        sb.append("      withdrawDelayed: ").append(toIndentedString(withdrawDelayed)).append("\n");
        sb.append("      depositDisabled: ").append(toIndentedString(depositDisabled)).append("\n");
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

