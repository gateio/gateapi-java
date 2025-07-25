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
 * FuturesAccountBook
 */
public class FuturesAccountBook {
    public static final String SERIALIZED_NAME_TIME = "time";
    @SerializedName(SERIALIZED_NAME_TIME)
    private Double time;

    public static final String SERIALIZED_NAME_CHANGE = "change";
    @SerializedName(SERIALIZED_NAME_CHANGE)
    private String change;

    public static final String SERIALIZED_NAME_BALANCE = "balance";
    @SerializedName(SERIALIZED_NAME_BALANCE)
    private String balance;

    /**
     * Changing Type：  - dnw: Deposit &amp; Withdraw - pnl: Profit &amp; Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: point_fee: POINT Trading fee - point_refr: POINT Referrer rebate - bonus_offset: bouns deduction
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        DNW("dnw"),
        
        PNL("pnl"),
        
        FEE("fee"),
        
        REFR("refr"),
        
        FUND("fund"),
        
        POINT_DNW("point_dnw"),
        
        POINT_FEE("point_fee"),
        
        POINT_REFR("point_refr"),
        
        BONUS_OFFSET("bonus_offset");

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

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_CONTRACT = "contract";
    @SerializedName(SERIALIZED_NAME_CONTRACT)
    private String contract;

    public static final String SERIALIZED_NAME_TRADE_ID = "trade_id";
    @SerializedName(SERIALIZED_NAME_TRADE_ID)
    private String tradeId;

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;


    public FuturesAccountBook time(Double time) {
        
        this.time = time;
        return this;
    }

     /**
     * Change time.
     * @return time
    **/
    @javax.annotation.Nullable
    public Double getTime() {
        return time;
    }


    public void setTime(Double time) {
        this.time = time;
    }

    public FuturesAccountBook change(String change) {
        
        this.change = change;
        return this;
    }

     /**
     * Change amount.
     * @return change
    **/
    @javax.annotation.Nullable
    public String getChange() {
        return change;
    }


    public void setChange(String change) {
        this.change = change;
    }

    public FuturesAccountBook balance(String balance) {
        
        this.balance = balance;
        return this;
    }

     /**
     * Balance after change.
     * @return balance
    **/
    @javax.annotation.Nullable
    public String getBalance() {
        return balance;
    }


    public void setBalance(String balance) {
        this.balance = balance;
    }

    public FuturesAccountBook type(TypeEnum type) {
        
        this.type = type;
        return this;
    }

     /**
     * Changing Type：  - dnw: Deposit &amp; Withdraw - pnl: Profit &amp; Loss by reducing position - fee: Trading fee - refr: Referrer rebate - fund: Funding - point_dnw: point_fee: POINT Trading fee - point_refr: POINT Referrer rebate - bonus_offset: bouns deduction
     * @return type
    **/
    @javax.annotation.Nullable
    public TypeEnum getType() {
        return type;
    }


    public void setType(TypeEnum type) {
        this.type = type;
    }

    public FuturesAccountBook text(String text) {
        
        this.text = text;
        return this;
    }

     /**
     * Comment.
     * @return text
    **/
    @javax.annotation.Nullable
    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

    public FuturesAccountBook contract(String contract) {
        
        this.contract = contract;
        return this;
    }

     /**
     * Futures contract, the field is only available for data after 2023-10-30.
     * @return contract
    **/
    @javax.annotation.Nullable
    public String getContract() {
        return contract;
    }


    public void setContract(String contract) {
        this.contract = contract;
    }

    public FuturesAccountBook tradeId(String tradeId) {
        
        this.tradeId = tradeId;
        return this;
    }

     /**
     * trade id.
     * @return tradeId
    **/
    @javax.annotation.Nullable
    public String getTradeId() {
        return tradeId;
    }


    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public FuturesAccountBook id(String id) {
        
        this.id = id;
        return this;
    }

     /**
     * Account change record ID.
     * @return id
    **/
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuturesAccountBook futuresAccountBook = (FuturesAccountBook) o;
        return Objects.equals(this.time, futuresAccountBook.time) &&
                Objects.equals(this.change, futuresAccountBook.change) &&
                Objects.equals(this.balance, futuresAccountBook.balance) &&
                Objects.equals(this.type, futuresAccountBook.type) &&
                Objects.equals(this.text, futuresAccountBook.text) &&
                Objects.equals(this.contract, futuresAccountBook.contract) &&
                Objects.equals(this.tradeId, futuresAccountBook.tradeId) &&
                Objects.equals(this.id, futuresAccountBook.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, change, balance, type, text, contract, tradeId, id);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuturesAccountBook {\n");
        sb.append("      time: ").append(toIndentedString(time)).append("\n");
        sb.append("      change: ").append(toIndentedString(change)).append("\n");
        sb.append("      balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("      type: ").append(toIndentedString(type)).append("\n");
        sb.append("      text: ").append(toIndentedString(text)).append("\n");
        sb.append("      contract: ").append(toIndentedString(contract)).append("\n");
        sb.append("      tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
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

