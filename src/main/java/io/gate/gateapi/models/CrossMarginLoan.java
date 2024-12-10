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
 * CrossMarginLoan
 */
public class CrossMarginLoan {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private Long createTime;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    private Long updateTime;

    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private String amount;

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    /**
     * Deprecated. Currently, all statuses have been set to 2.  Borrow loan status, which includes:  - 1: failed to borrow - 2: borrowed but not repaid - 3: repayment complete
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        NUMBER_1(1),
        
        NUMBER_2(2),
        
        NUMBER_3(3);

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(Integer value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                Integer value =  jsonReader.nextInt();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    public static final String SERIALIZED_NAME_REPAID = "repaid";
    @SerializedName(SERIALIZED_NAME_REPAID)
    private String repaid;

    public static final String SERIALIZED_NAME_REPAID_INTEREST = "repaid_interest";
    @SerializedName(SERIALIZED_NAME_REPAID_INTEREST)
    private String repaidInterest;

    public static final String SERIALIZED_NAME_UNPAID_INTEREST = "unpaid_interest";
    @SerializedName(SERIALIZED_NAME_UNPAID_INTEREST)
    private String unpaidInterest;


     /**
     * Loan record ID
     * @return id
    **/
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }


     /**
     * Creation timestamp, in milliseconds
     * @return createTime
    **/
    @javax.annotation.Nullable
    public Long getCreateTime() {
        return createTime;
    }


     /**
     * Update timestamp, in milliseconds
     * @return updateTime
    **/
    @javax.annotation.Nullable
    public Long getUpdateTime() {
        return updateTime;
    }


    public CrossMarginLoan currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Currency name
     * @return currency
    **/
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CrossMarginLoan amount(String amount) {
        
        this.amount = amount;
        return this;
    }

     /**
     * Borrowed amount
     * @return amount
    **/
    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }

    public CrossMarginLoan text(String text) {
        
        this.text = text;
        return this;
    }

     /**
     * User defined custom ID
     * @return text
    **/
    @javax.annotation.Nullable
    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

     /**
     * Deprecated. Currently, all statuses have been set to 2.  Borrow loan status, which includes:  - 1: failed to borrow - 2: borrowed but not repaid - 3: repayment complete
     * @return status
    **/
    @javax.annotation.Nullable
    public StatusEnum getStatus() {
        return status;
    }


     /**
     * Repaid amount
     * @return repaid
    **/
    @javax.annotation.Nullable
    public String getRepaid() {
        return repaid;
    }


     /**
     * Repaid interest
     * @return repaidInterest
    **/
    @javax.annotation.Nullable
    public String getRepaidInterest() {
        return repaidInterest;
    }


     /**
     * Outstanding interest yet to be paid
     * @return unpaidInterest
    **/
    @javax.annotation.Nullable
    public String getUnpaidInterest() {
        return unpaidInterest;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CrossMarginLoan crossMarginLoan = (CrossMarginLoan) o;
        return Objects.equals(this.id, crossMarginLoan.id) &&
                Objects.equals(this.createTime, crossMarginLoan.createTime) &&
                Objects.equals(this.updateTime, crossMarginLoan.updateTime) &&
                Objects.equals(this.currency, crossMarginLoan.currency) &&
                Objects.equals(this.amount, crossMarginLoan.amount) &&
                Objects.equals(this.text, crossMarginLoan.text) &&
                Objects.equals(this.status, crossMarginLoan.status) &&
                Objects.equals(this.repaid, crossMarginLoan.repaid) &&
                Objects.equals(this.repaidInterest, crossMarginLoan.repaidInterest) &&
                Objects.equals(this.unpaidInterest, crossMarginLoan.unpaidInterest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, updateTime, currency, amount, text, status, repaid, repaidInterest, unpaidInterest);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CrossMarginLoan {\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("      updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("      text: ").append(toIndentedString(text)).append("\n");
        sb.append("      status: ").append(toIndentedString(status)).append("\n");
        sb.append("      repaid: ").append(toIndentedString(repaid)).append("\n");
        sb.append("      repaidInterest: ").append(toIndentedString(repaidInterest)).append("\n");
        sb.append("      unpaidInterest: ").append(toIndentedString(unpaidInterest)).append("\n");
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

