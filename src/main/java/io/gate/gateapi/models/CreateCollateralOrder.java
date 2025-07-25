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
 * CreateCollateralOrder
 */
public class CreateCollateralOrder {
    public static final String SERIALIZED_NAME_COLLATERAL_AMOUNT = "collateral_amount";
    @SerializedName(SERIALIZED_NAME_COLLATERAL_AMOUNT)
    private String collateralAmount;

    public static final String SERIALIZED_NAME_COLLATERAL_CURRENCY = "collateral_currency";
    @SerializedName(SERIALIZED_NAME_COLLATERAL_CURRENCY)
    private String collateralCurrency;

    public static final String SERIALIZED_NAME_BORROW_AMOUNT = "borrow_amount";
    @SerializedName(SERIALIZED_NAME_BORROW_AMOUNT)
    private String borrowAmount;

    public static final String SERIALIZED_NAME_BORROW_CURRENCY = "borrow_currency";
    @SerializedName(SERIALIZED_NAME_BORROW_CURRENCY)
    private String borrowCurrency;


    public CreateCollateralOrder collateralAmount(String collateralAmount) {
        
        this.collateralAmount = collateralAmount;
        return this;
    }

     /**
     * Collateral amount.
     * @return collateralAmount
    **/
    public String getCollateralAmount() {
        return collateralAmount;
    }


    public void setCollateralAmount(String collateralAmount) {
        this.collateralAmount = collateralAmount;
    }

    public CreateCollateralOrder collateralCurrency(String collateralCurrency) {
        
        this.collateralCurrency = collateralCurrency;
        return this;
    }

     /**
     * Collateral.
     * @return collateralCurrency
    **/
    public String getCollateralCurrency() {
        return collateralCurrency;
    }


    public void setCollateralCurrency(String collateralCurrency) {
        this.collateralCurrency = collateralCurrency;
    }

    public CreateCollateralOrder borrowAmount(String borrowAmount) {
        
        this.borrowAmount = borrowAmount;
        return this;
    }

     /**
     * Borrowing amount.
     * @return borrowAmount
    **/
    public String getBorrowAmount() {
        return borrowAmount;
    }


    public void setBorrowAmount(String borrowAmount) {
        this.borrowAmount = borrowAmount;
    }

    public CreateCollateralOrder borrowCurrency(String borrowCurrency) {
        
        this.borrowCurrency = borrowCurrency;
        return this;
    }

     /**
     * Borrowed currency.
     * @return borrowCurrency
    **/
    public String getBorrowCurrency() {
        return borrowCurrency;
    }


    public void setBorrowCurrency(String borrowCurrency) {
        this.borrowCurrency = borrowCurrency;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCollateralOrder createCollateralOrder = (CreateCollateralOrder) o;
        return Objects.equals(this.collateralAmount, createCollateralOrder.collateralAmount) &&
                Objects.equals(this.collateralCurrency, createCollateralOrder.collateralCurrency) &&
                Objects.equals(this.borrowAmount, createCollateralOrder.borrowAmount) &&
                Objects.equals(this.borrowCurrency, createCollateralOrder.borrowCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collateralAmount, collateralCurrency, borrowAmount, borrowCurrency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCollateralOrder {\n");
        sb.append("      collateralAmount: ").append(toIndentedString(collateralAmount)).append("\n");
        sb.append("      collateralCurrency: ").append(toIndentedString(collateralCurrency)).append("\n");
        sb.append("      borrowAmount: ").append(toIndentedString(borrowAmount)).append("\n");
        sb.append("      borrowCurrency: ").append(toIndentedString(borrowCurrency)).append("\n");
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

