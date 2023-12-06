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
 * WithdrawalRecord
 */
public class WithdrawalRecord {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_TXID = "txid";
    @SerializedName(SERIALIZED_NAME_TXID)
    private String txid;

    public static final String SERIALIZED_NAME_WITHDRAW_ORDER_ID = "withdraw_order_id";
    @SerializedName(SERIALIZED_NAME_WITHDRAW_ORDER_ID)
    private String withdrawOrderId;

    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    private String timestamp;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private String amount;

    public static final String SERIALIZED_NAME_FEE = "fee";
    @SerializedName(SERIALIZED_NAME_FEE)
    private String fee;

    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_ADDRESS = "address";
    @SerializedName(SERIALIZED_NAME_ADDRESS)
    private String address;

    public static final String SERIALIZED_NAME_MEMO = "memo";
    @SerializedName(SERIALIZED_NAME_MEMO)
    private String memo;

    /**
     * Record status.  - DONE: done - CANCEL: cancelled - REQUEST: requesting - MANUAL: pending manual approval - BCODE: GateCode operation - EXTPEND: pending confirm after sending - FAIL: pending confirm when fail - INVALID: invalid order - VERIFY: verifying - PROCES: processing - PEND: pending - DMOVE: required manual approval - SPLITPEND: the order is automatically split due to large amount
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        DONE("DONE"),
        
        CANCEL("CANCEL"),
        
        REQUEST("REQUEST"),
        
        MANUAL("MANUAL"),
        
        BCODE("BCODE"),
        
        EXTPEND("EXTPEND"),
        
        FAIL("FAIL"),
        
        INVALID("INVALID"),
        
        VERIFY("VERIFY"),
        
        PROCES("PROCES"),
        
        PEND("PEND"),
        
        DMOVE("DMOVE"),
        
        SPLITPEND("SPLITPEND");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
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
                String value =  jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    public static final String SERIALIZED_NAME_CHAIN = "chain";
    @SerializedName(SERIALIZED_NAME_CHAIN)
    private String chain;


     /**
     * Record ID
     * @return id
    **/
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }


     /**
     * Hash record of the withdrawal
     * @return txid
    **/
    @javax.annotation.Nullable
    public String getTxid() {
        return txid;
    }


    public WithdrawalRecord withdrawOrderId(String withdrawOrderId) {
        
        this.withdrawOrderId = withdrawOrderId;
        return this;
    }

     /**
     * Client order id, up to 32 length and can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) 
     * @return withdrawOrderId
    **/
    @javax.annotation.Nullable
    public String getWithdrawOrderId() {
        return withdrawOrderId;
    }


    public void setWithdrawOrderId(String withdrawOrderId) {
        this.withdrawOrderId = withdrawOrderId;
    }

     /**
     * Operation time
     * @return timestamp
    **/
    @javax.annotation.Nullable
    public String getTimestamp() {
        return timestamp;
    }


    public WithdrawalRecord amount(String amount) {
        
        this.amount = amount;
        return this;
    }

     /**
     * Currency amount
     * @return amount
    **/
    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }

     /**
     * fee
     * @return fee
    **/
    @javax.annotation.Nullable
    public String getFee() {
        return fee;
    }


    public WithdrawalRecord currency(String currency) {
        
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

    public WithdrawalRecord address(String address) {
        
        this.address = address;
        return this;
    }

     /**
     * Withdrawal address. Required for withdrawals
     * @return address
    **/
    @javax.annotation.Nullable
    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public WithdrawalRecord memo(String memo) {
        
        this.memo = memo;
        return this;
    }

     /**
     * Additional remarks with regards to the withdrawal
     * @return memo
    **/
    @javax.annotation.Nullable
    public String getMemo() {
        return memo;
    }


    public void setMemo(String memo) {
        this.memo = memo;
    }

     /**
     * Record status.  - DONE: done - CANCEL: cancelled - REQUEST: requesting - MANUAL: pending manual approval - BCODE: GateCode operation - EXTPEND: pending confirm after sending - FAIL: pending confirm when fail - INVALID: invalid order - VERIFY: verifying - PROCES: processing - PEND: pending - DMOVE: required manual approval - SPLITPEND: the order is automatically split due to large amount
     * @return status
    **/
    @javax.annotation.Nullable
    public StatusEnum getStatus() {
        return status;
    }


    public WithdrawalRecord chain(String chain) {
        
        this.chain = chain;
        return this;
    }

     /**
     * Name of the chain used in withdrawals
     * @return chain
    **/
    public String getChain() {
        return chain;
    }


    public void setChain(String chain) {
        this.chain = chain;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WithdrawalRecord withdrawalRecord = (WithdrawalRecord) o;
        return Objects.equals(this.id, withdrawalRecord.id) &&
                Objects.equals(this.txid, withdrawalRecord.txid) &&
                Objects.equals(this.withdrawOrderId, withdrawalRecord.withdrawOrderId) &&
                Objects.equals(this.timestamp, withdrawalRecord.timestamp) &&
                Objects.equals(this.amount, withdrawalRecord.amount) &&
                Objects.equals(this.fee, withdrawalRecord.fee) &&
                Objects.equals(this.currency, withdrawalRecord.currency) &&
                Objects.equals(this.address, withdrawalRecord.address) &&
                Objects.equals(this.memo, withdrawalRecord.memo) &&
                Objects.equals(this.status, withdrawalRecord.status) &&
                Objects.equals(this.chain, withdrawalRecord.chain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, txid, withdrawOrderId, timestamp, amount, fee, currency, address, memo, status, chain);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WithdrawalRecord {\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      txid: ").append(toIndentedString(txid)).append("\n");
        sb.append("      withdrawOrderId: ").append(toIndentedString(withdrawOrderId)).append("\n");
        sb.append("      timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("      fee: ").append(toIndentedString(fee)).append("\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      address: ").append(toIndentedString(address)).append("\n");
        sb.append("      memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("      status: ").append(toIndentedString(status)).append("\n");
        sb.append("      chain: ").append(toIndentedString(chain)).append("\n");
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

