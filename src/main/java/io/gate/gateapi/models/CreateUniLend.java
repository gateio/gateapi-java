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
 * Lend or redeem.
 */
public class CreateUniLend {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private String amount;

    /**
     * type: lend - lend, redeem - redeem.
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        LEND("lend"),
        
        REDEEM("redeem");

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

    public static final String SERIALIZED_NAME_MIN_RATE = "min_rate";
    @SerializedName(SERIALIZED_NAME_MIN_RATE)
    private String minRate;


    public CreateUniLend currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Currency name.
     * @return currency
    **/
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CreateUniLend amount(String amount) {
        
        this.amount = amount;
        return this;
    }

     /**
     * The amount of currency could be lent.
     * @return amount
    **/
    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }

    public CreateUniLend type(TypeEnum type) {
        
        this.type = type;
        return this;
    }

     /**
     * type: lend - lend, redeem - redeem.
     * @return type
    **/
    public TypeEnum getType() {
        return type;
    }


    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateUniLend minRate(String minRate) {
        
        this.minRate = minRate;
        return this;
    }

     /**
     * The minimum interest rate. If the value is too high, it might lead to the unsuccessful lending and no profit will be gained for that hour. 
     * @return minRate
    **/
    @javax.annotation.Nullable
    public String getMinRate() {
        return minRate;
    }


    public void setMinRate(String minRate) {
        this.minRate = minRate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUniLend createUniLend = (CreateUniLend) o;
        return Objects.equals(this.currency, createUniLend.currency) &&
                Objects.equals(this.amount, createUniLend.amount) &&
                Objects.equals(this.type, createUniLend.type) &&
                Objects.equals(this.minRate, createUniLend.minRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount, type, minRate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUniLend {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("      type: ").append(toIndentedString(type)).append("\n");
        sb.append("      minRate: ").append(toIndentedString(minRate)).append("\n");
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

