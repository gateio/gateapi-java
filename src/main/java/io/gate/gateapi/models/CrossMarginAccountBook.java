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
 * CrossMarginAccountBook
 */
public class CrossMarginAccountBook {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_TIME = "time";
    @SerializedName(SERIALIZED_NAME_TIME)
    private Long time;

    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_CHANGE = "change";
    @SerializedName(SERIALIZED_NAME_CHANGE)
    private String change;

    public static final String SERIALIZED_NAME_BALANCE = "balance";
    @SerializedName(SERIALIZED_NAME_BALANCE)
    private String balance;

    /**
     * Account change type, including:  - in: transferals into cross margin account - out: transferals out from cross margin account - repay: loan repayment - borrow: borrowed loan - new_order: new order locked - order_fill: order fills - referral_fee: fee refund from referrals - order_fee: order fee generated from fills - unknown: unknown type
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        IN("in"),
        
        OUT("out"),
        
        REPAY("repay"),
        
        BORROW("borrow"),
        
        NEW_ORDER("new_order"),
        
        ORDER_FILL("order_fill"),
        
        REFERRAL_FEE("referral_fee"),
        
        ORDER_FEE("order_fee"),
        
        UNKNOWN("unknown");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private TypeEnum type;


    public CrossMarginAccountBook id(String id) {
        
        this.id = id;
        return this;
    }

     /**
     * Balance change record ID
     * @return id
    **/
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public CrossMarginAccountBook time(Long time) {
        
        this.time = time;
        return this;
    }

     /**
     * Account changed timestamp in milliseconds
     * @return time
    **/
    @javax.annotation.Nullable
    public Long getTime() {
        return time;
    }


    public void setTime(Long time) {
        this.time = time;
    }

    public CrossMarginAccountBook currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Currency changed
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CrossMarginAccountBook change(String change) {
        
        this.change = change;
        return this;
    }

     /**
     * Amount changed. Positive value means transferring in, while negative out
     * @return change
    **/
    @javax.annotation.Nullable
    public String getChange() {
        return change;
    }


    public void setChange(String change) {
        this.change = change;
    }

    public CrossMarginAccountBook balance(String balance) {
        
        this.balance = balance;
        return this;
    }

     /**
     * Balance after change
     * @return balance
    **/
    @javax.annotation.Nullable
    public String getBalance() {
        return balance;
    }


    public void setBalance(String balance) {
        this.balance = balance;
    }

    public CrossMarginAccountBook type(TypeEnum type) {
        
        this.type = type;
        return this;
    }

     /**
     * Account change type, including:  - in: transferals into cross margin account - out: transferals out from cross margin account - repay: loan repayment - borrow: borrowed loan - new_order: new order locked - order_fill: order fills - referral_fee: fee refund from referrals - order_fee: order fee generated from fills - unknown: unknown type
     * @return type
    **/
    @javax.annotation.Nullable
    public TypeEnum getType() {
        return type;
    }


    public void setType(TypeEnum type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CrossMarginAccountBook crossMarginAccountBook = (CrossMarginAccountBook) o;
        return Objects.equals(this.id, crossMarginAccountBook.id) &&
                Objects.equals(this.time, crossMarginAccountBook.time) &&
                Objects.equals(this.currency, crossMarginAccountBook.currency) &&
                Objects.equals(this.change, crossMarginAccountBook.change) &&
                Objects.equals(this.balance, crossMarginAccountBook.balance) &&
                Objects.equals(this.type, crossMarginAccountBook.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, currency, change, balance, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CrossMarginAccountBook {\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      time: ").append(toIndentedString(time)).append("\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      change: ").append(toIndentedString(change)).append("\n");
        sb.append("      balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("      type: ").append(toIndentedString(type)).append("\n");
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
