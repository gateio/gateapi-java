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
 * SubAccountToSubAccount
 */
public class SubAccountToSubAccount {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_SUB_ACCOUNT_TYPE = "sub_account_type";
    @SerializedName(SERIALIZED_NAME_SUB_ACCOUNT_TYPE)
    private String subAccountType;

    public static final String SERIALIZED_NAME_SUB_ACCOUNT_FROM = "sub_account_from";
    @SerializedName(SERIALIZED_NAME_SUB_ACCOUNT_FROM)
    private String subAccountFrom;

    /**
     * Transfer from the account.  &#x60;spot&#x60; - spot account, &#x60;futures&#x60; - perpetual contract account, &#x60;cross_margin&#x60; - cross margin account
     */
    @JsonAdapter(SubAccountFromTypeEnum.Adapter.class)
    public enum SubAccountFromTypeEnum {
        SPOT("spot"),
        
        FUTURES("futures"),
        
        CROSS_MARGIN("cross_margin");

        private String value;

        SubAccountFromTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SubAccountFromTypeEnum fromValue(String value) {
            for (SubAccountFromTypeEnum b : SubAccountFromTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<SubAccountFromTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SubAccountFromTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SubAccountFromTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return SubAccountFromTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_SUB_ACCOUNT_FROM_TYPE = "sub_account_from_type";
    @SerializedName(SERIALIZED_NAME_SUB_ACCOUNT_FROM_TYPE)
    private SubAccountFromTypeEnum subAccountFromType;

    public static final String SERIALIZED_NAME_SUB_ACCOUNT_TO = "sub_account_to";
    @SerializedName(SERIALIZED_NAME_SUB_ACCOUNT_TO)
    private String subAccountTo;

    /**
     * Transfer to the account.  &#x60;spot&#x60; - spot account, &#x60;futures&#x60; - perpetual contract account, &#x60;cross_margin&#x60; - cross margin account
     */
    @JsonAdapter(SubAccountToTypeEnum.Adapter.class)
    public enum SubAccountToTypeEnum {
        SPOT("spot"),
        
        FUTURES("futures"),
        
        CROSS_MARGIN("cross_margin");

        private String value;

        SubAccountToTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SubAccountToTypeEnum fromValue(String value) {
            for (SubAccountToTypeEnum b : SubAccountToTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<SubAccountToTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SubAccountToTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SubAccountToTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return SubAccountToTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_SUB_ACCOUNT_TO_TYPE = "sub_account_to_type";
    @SerializedName(SERIALIZED_NAME_SUB_ACCOUNT_TO_TYPE)
    private SubAccountToTypeEnum subAccountToType;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private String amount;


    public SubAccountToSubAccount currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Transfer currency name
     * @return currency
    **/
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public SubAccountToSubAccount subAccountType(String subAccountType) {
        
        this.subAccountType = subAccountType;
        return this;
    }

     /**
     * Transfer from the account. (deprecate, use &#x60;sub_account_from_type&#x60; and &#x60;sub_account_to_type&#x60; instead)
     * @return subAccountType
    **/
    @javax.annotation.Nullable
    public String getSubAccountType() {
        return subAccountType;
    }


    public void setSubAccountType(String subAccountType) {
        this.subAccountType = subAccountType;
    }

    public SubAccountToSubAccount subAccountFrom(String subAccountFrom) {
        
        this.subAccountFrom = subAccountFrom;
        return this;
    }

     /**
     * Transfer from the user id of the sub-account
     * @return subAccountFrom
    **/
    public String getSubAccountFrom() {
        return subAccountFrom;
    }


    public void setSubAccountFrom(String subAccountFrom) {
        this.subAccountFrom = subAccountFrom;
    }

    public SubAccountToSubAccount subAccountFromType(SubAccountFromTypeEnum subAccountFromType) {
        
        this.subAccountFromType = subAccountFromType;
        return this;
    }

     /**
     * Transfer from the account.  &#x60;spot&#x60; - spot account, &#x60;futures&#x60; - perpetual contract account, &#x60;cross_margin&#x60; - cross margin account
     * @return subAccountFromType
    **/
    public SubAccountFromTypeEnum getSubAccountFromType() {
        return subAccountFromType;
    }


    public void setSubAccountFromType(SubAccountFromTypeEnum subAccountFromType) {
        this.subAccountFromType = subAccountFromType;
    }

    public SubAccountToSubAccount subAccountTo(String subAccountTo) {
        
        this.subAccountTo = subAccountTo;
        return this;
    }

     /**
     * Transfer to the user id of the sub-account
     * @return subAccountTo
    **/
    public String getSubAccountTo() {
        return subAccountTo;
    }


    public void setSubAccountTo(String subAccountTo) {
        this.subAccountTo = subAccountTo;
    }

    public SubAccountToSubAccount subAccountToType(SubAccountToTypeEnum subAccountToType) {
        
        this.subAccountToType = subAccountToType;
        return this;
    }

     /**
     * Transfer to the account.  &#x60;spot&#x60; - spot account, &#x60;futures&#x60; - perpetual contract account, &#x60;cross_margin&#x60; - cross margin account
     * @return subAccountToType
    **/
    public SubAccountToTypeEnum getSubAccountToType() {
        return subAccountToType;
    }


    public void setSubAccountToType(SubAccountToTypeEnum subAccountToType) {
        this.subAccountToType = subAccountToType;
    }

    public SubAccountToSubAccount amount(String amount) {
        
        this.amount = amount;
        return this;
    }

     /**
     * Transfer amount
     * @return amount
    **/
    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubAccountToSubAccount subAccountToSubAccount = (SubAccountToSubAccount) o;
        return Objects.equals(this.currency, subAccountToSubAccount.currency) &&
                Objects.equals(this.subAccountType, subAccountToSubAccount.subAccountType) &&
                Objects.equals(this.subAccountFrom, subAccountToSubAccount.subAccountFrom) &&
                Objects.equals(this.subAccountFromType, subAccountToSubAccount.subAccountFromType) &&
                Objects.equals(this.subAccountTo, subAccountToSubAccount.subAccountTo) &&
                Objects.equals(this.subAccountToType, subAccountToSubAccount.subAccountToType) &&
                Objects.equals(this.amount, subAccountToSubAccount.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, subAccountType, subAccountFrom, subAccountFromType, subAccountTo, subAccountToType, amount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubAccountToSubAccount {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      subAccountType: ").append(toIndentedString(subAccountType)).append("\n");
        sb.append("      subAccountFrom: ").append(toIndentedString(subAccountFrom)).append("\n");
        sb.append("      subAccountFromType: ").append(toIndentedString(subAccountFromType)).append("\n");
        sb.append("      subAccountTo: ").append(toIndentedString(subAccountTo)).append("\n");
        sb.append("      subAccountToType: ").append(toIndentedString(subAccountToType)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
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

