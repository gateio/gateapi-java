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
 * InlineResponse200
 */
public class InlineResponse200 {
    public static final String SERIALIZED_NAME_TX_ID = "tx_id";
    @SerializedName(SERIALIZED_NAME_TX_ID)
    private String txId;

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private String status;


    public InlineResponse200 txId(String txId) {
        
        this.txId = txId;
        return this;
    }

     /**
     * Order id
     * @return txId
    **/
    @javax.annotation.Nullable
    public String getTxId() {
        return txId;
    }


    public void setTxId(String txId) {
        this.txId = txId;
    }

    public InlineResponse200 status(String status) {
        
        this.status = status;
        return this;
    }

     /**
     * Transfer status, PENDING - in process, SUCCESS - successful transfer, FAIL - failed transfer, PARTIAL_SUCCESS - Partially successful (this status will appear when transferring between sub-subs)
     * @return status
    **/
    @javax.annotation.Nullable
    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse200 inlineResponse200 = (InlineResponse200) o;
        return Objects.equals(this.txId, inlineResponse200.txId) &&
                Objects.equals(this.status, inlineResponse200.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txId, status);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse200 {\n");
        sb.append("      txId: ").append(toIndentedString(txId)).append("\n");
        sb.append("      status: ").append(toIndentedString(status)).append("\n");
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

