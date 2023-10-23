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
 * Batch order modification results
 */
public class AmendOrderResult {
    public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    private String orderId;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private String amount;

    public static final String SERIALIZED_NAME_PRICE = "price";
    @SerializedName(SERIALIZED_NAME_PRICE)
    private String price;

    public static final String SERIALIZED_NAME_AMEND_TEXT = "amend_text";
    @SerializedName(SERIALIZED_NAME_AMEND_TEXT)
    private String amendText;

    public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
    @SerializedName(SERIALIZED_NAME_SUCCEEDED)
    private Boolean succeeded;

    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;

    public static final String SERIALIZED_NAME_MESSAGE = "message";
    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_ACCOUNT = "account";
    @SerializedName(SERIALIZED_NAME_ACCOUNT)
    private String account;


     /**
     * Order ID
     * @return orderId
    **/
    @javax.annotation.Nullable
    public String getOrderId() {
        return orderId;
    }


     /**
     * Trade amount
     * @return amount
    **/
    @javax.annotation.Nullable
    public String getAmount() {
        return amount;
    }


     /**
     * Order price
     * @return price
    **/
    @javax.annotation.Nullable
    public String getPrice() {
        return price;
    }


     /**
     * The custom data that the user remarked when amending the order
     * @return amendText
    **/
    @javax.annotation.Nullable
    public String getAmendText() {
        return amendText;
    }


     /**
     * Update success status
     * @return succeeded
    **/
    @javax.annotation.Nullable
    public Boolean getSucceeded() {
        return succeeded;
    }


     /**
     * Error indicator for failed modifications; empty when successful
     * @return label
    **/
    @javax.annotation.Nullable
    public String getLabel() {
        return label;
    }


     /**
     * Error description for failed modifications; empty when successful
     * @return message
    **/
    @javax.annotation.Nullable
    public String getMessage() {
        return message;
    }


     /**
     * Account types， spot - spot account, margin - margin account, portfolio - portfolio margin account, cross_margin - cross margin account.Portfolio margin accounts can only be set to &#x60;cross_margin&#x60;
     * @return account
    **/
    @javax.annotation.Nullable
    public String getAccount() {
        return account;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AmendOrderResult amendOrderResult = (AmendOrderResult) o;
        return Objects.equals(this.orderId, amendOrderResult.orderId) &&
                Objects.equals(this.amount, amendOrderResult.amount) &&
                Objects.equals(this.price, amendOrderResult.price) &&
                Objects.equals(this.amendText, amendOrderResult.amendText) &&
                Objects.equals(this.succeeded, amendOrderResult.succeeded) &&
                Objects.equals(this.label, amendOrderResult.label) &&
                Objects.equals(this.message, amendOrderResult.message) &&
                Objects.equals(this.account, amendOrderResult.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, amount, price, amendText, succeeded, label, message, account);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AmendOrderResult {\n");
        sb.append("      orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("      price: ").append(toIndentedString(price)).append("\n");
        sb.append("      amendText: ").append(toIndentedString(amendText)).append("\n");
        sb.append("      succeeded: ").append(toIndentedString(succeeded)).append("\n");
        sb.append("      label: ").append(toIndentedString(label)).append("\n");
        sb.append("      message: ").append(toIndentedString(message)).append("\n");
        sb.append("      account: ").append(toIndentedString(account)).append("\n");
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
