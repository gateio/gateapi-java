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
 * Repayment record.
 */
public class RepayRecord {
    public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    private Long orderId;

    public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
    @SerializedName(SERIALIZED_NAME_RECORD_ID)
    private Long recordId;

    public static final String SERIALIZED_NAME_REPAID_AMOUNT = "repaid_amount";
    @SerializedName(SERIALIZED_NAME_REPAID_AMOUNT)
    private String repaidAmount;

    public static final String SERIALIZED_NAME_BORROW_CURRENCY = "borrow_currency";
    @SerializedName(SERIALIZED_NAME_BORROW_CURRENCY)
    private String borrowCurrency;

    public static final String SERIALIZED_NAME_COLLATERAL_CURRENCY = "collateral_currency";
    @SerializedName(SERIALIZED_NAME_COLLATERAL_CURRENCY)
    private String collateralCurrency;

    public static final String SERIALIZED_NAME_INIT_LTV = "init_ltv";
    @SerializedName(SERIALIZED_NAME_INIT_LTV)
    private String initLtv;

    public static final String SERIALIZED_NAME_BORROW_TIME = "borrow_time";
    @SerializedName(SERIALIZED_NAME_BORROW_TIME)
    private Long borrowTime;

    public static final String SERIALIZED_NAME_REPAY_TIME = "repay_time";
    @SerializedName(SERIALIZED_NAME_REPAY_TIME)
    private Long repayTime;

    public static final String SERIALIZED_NAME_TOTAL_INTEREST = "total_interest";
    @SerializedName(SERIALIZED_NAME_TOTAL_INTEREST)
    private String totalInterest;

    public static final String SERIALIZED_NAME_BEFORE_LEFT_PRINCIPAL = "before_left_principal";
    @SerializedName(SERIALIZED_NAME_BEFORE_LEFT_PRINCIPAL)
    private String beforeLeftPrincipal;

    public static final String SERIALIZED_NAME_AFTER_LEFT_PRINCIPAL = "after_left_principal";
    @SerializedName(SERIALIZED_NAME_AFTER_LEFT_PRINCIPAL)
    private String afterLeftPrincipal;

    public static final String SERIALIZED_NAME_BEFORE_LEFT_COLLATERAL = "before_left_collateral";
    @SerializedName(SERIALIZED_NAME_BEFORE_LEFT_COLLATERAL)
    private String beforeLeftCollateral;

    public static final String SERIALIZED_NAME_AFTER_LEFT_COLLATERAL = "after_left_collateral";
    @SerializedName(SERIALIZED_NAME_AFTER_LEFT_COLLATERAL)
    private String afterLeftCollateral;


    public RepayRecord orderId(Long orderId) {
        
        this.orderId = orderId;
        return this;
    }

     /**
     * Order ID.
     * @return orderId
    **/
    @javax.annotation.Nullable
    public Long getOrderId() {
        return orderId;
    }


    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public RepayRecord recordId(Long recordId) {
        
        this.recordId = recordId;
        return this;
    }

     /**
     * Repayment record ID.
     * @return recordId
    **/
    @javax.annotation.Nullable
    public Long getRecordId() {
        return recordId;
    }


    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public RepayRecord repaidAmount(String repaidAmount) {
        
        this.repaidAmount = repaidAmount;
        return this;
    }

     /**
     * Repayment amount.
     * @return repaidAmount
    **/
    @javax.annotation.Nullable
    public String getRepaidAmount() {
        return repaidAmount;
    }


    public void setRepaidAmount(String repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

    public RepayRecord borrowCurrency(String borrowCurrency) {
        
        this.borrowCurrency = borrowCurrency;
        return this;
    }

     /**
     * Borrowed currency.
     * @return borrowCurrency
    **/
    @javax.annotation.Nullable
    public String getBorrowCurrency() {
        return borrowCurrency;
    }


    public void setBorrowCurrency(String borrowCurrency) {
        this.borrowCurrency = borrowCurrency;
    }

    public RepayRecord collateralCurrency(String collateralCurrency) {
        
        this.collateralCurrency = collateralCurrency;
        return this;
    }

     /**
     * Collateral.
     * @return collateralCurrency
    **/
    @javax.annotation.Nullable
    public String getCollateralCurrency() {
        return collateralCurrency;
    }


    public void setCollateralCurrency(String collateralCurrency) {
        this.collateralCurrency = collateralCurrency;
    }

    public RepayRecord initLtv(String initLtv) {
        
        this.initLtv = initLtv;
        return this;
    }

     /**
     * The initial collateralization rate.
     * @return initLtv
    **/
    @javax.annotation.Nullable
    public String getInitLtv() {
        return initLtv;
    }


    public void setInitLtv(String initLtv) {
        this.initLtv = initLtv;
    }

    public RepayRecord borrowTime(Long borrowTime) {
        
        this.borrowTime = borrowTime;
        return this;
    }

     /**
     * Borrowing time, timestamp.
     * @return borrowTime
    **/
    @javax.annotation.Nullable
    public Long getBorrowTime() {
        return borrowTime;
    }


    public void setBorrowTime(Long borrowTime) {
        this.borrowTime = borrowTime;
    }

    public RepayRecord repayTime(Long repayTime) {
        
        this.repayTime = repayTime;
        return this;
    }

     /**
     * Repayment time, timestamp.
     * @return repayTime
    **/
    @javax.annotation.Nullable
    public Long getRepayTime() {
        return repayTime;
    }


    public void setRepayTime(Long repayTime) {
        this.repayTime = repayTime;
    }

    public RepayRecord totalInterest(String totalInterest) {
        
        this.totalInterest = totalInterest;
        return this;
    }

     /**
     * Total interest.
     * @return totalInterest
    **/
    @javax.annotation.Nullable
    public String getTotalInterest() {
        return totalInterest;
    }


    public void setTotalInterest(String totalInterest) {
        this.totalInterest = totalInterest;
    }

    public RepayRecord beforeLeftPrincipal(String beforeLeftPrincipal) {
        
        this.beforeLeftPrincipal = beforeLeftPrincipal;
        return this;
    }

     /**
     * Principal to be repaid before repayment.
     * @return beforeLeftPrincipal
    **/
    @javax.annotation.Nullable
    public String getBeforeLeftPrincipal() {
        return beforeLeftPrincipal;
    }


    public void setBeforeLeftPrincipal(String beforeLeftPrincipal) {
        this.beforeLeftPrincipal = beforeLeftPrincipal;
    }

    public RepayRecord afterLeftPrincipal(String afterLeftPrincipal) {
        
        this.afterLeftPrincipal = afterLeftPrincipal;
        return this;
    }

     /**
     * Principal to be repaid after repayment.
     * @return afterLeftPrincipal
    **/
    @javax.annotation.Nullable
    public String getAfterLeftPrincipal() {
        return afterLeftPrincipal;
    }


    public void setAfterLeftPrincipal(String afterLeftPrincipal) {
        this.afterLeftPrincipal = afterLeftPrincipal;
    }

    public RepayRecord beforeLeftCollateral(String beforeLeftCollateral) {
        
        this.beforeLeftCollateral = beforeLeftCollateral;
        return this;
    }

     /**
     * Collateral quantity before repayment.
     * @return beforeLeftCollateral
    **/
    @javax.annotation.Nullable
    public String getBeforeLeftCollateral() {
        return beforeLeftCollateral;
    }


    public void setBeforeLeftCollateral(String beforeLeftCollateral) {
        this.beforeLeftCollateral = beforeLeftCollateral;
    }

    public RepayRecord afterLeftCollateral(String afterLeftCollateral) {
        
        this.afterLeftCollateral = afterLeftCollateral;
        return this;
    }

     /**
     * Collateral quantity after repayment.
     * @return afterLeftCollateral
    **/
    @javax.annotation.Nullable
    public String getAfterLeftCollateral() {
        return afterLeftCollateral;
    }


    public void setAfterLeftCollateral(String afterLeftCollateral) {
        this.afterLeftCollateral = afterLeftCollateral;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepayRecord repayRecord = (RepayRecord) o;
        return Objects.equals(this.orderId, repayRecord.orderId) &&
                Objects.equals(this.recordId, repayRecord.recordId) &&
                Objects.equals(this.repaidAmount, repayRecord.repaidAmount) &&
                Objects.equals(this.borrowCurrency, repayRecord.borrowCurrency) &&
                Objects.equals(this.collateralCurrency, repayRecord.collateralCurrency) &&
                Objects.equals(this.initLtv, repayRecord.initLtv) &&
                Objects.equals(this.borrowTime, repayRecord.borrowTime) &&
                Objects.equals(this.repayTime, repayRecord.repayTime) &&
                Objects.equals(this.totalInterest, repayRecord.totalInterest) &&
                Objects.equals(this.beforeLeftPrincipal, repayRecord.beforeLeftPrincipal) &&
                Objects.equals(this.afterLeftPrincipal, repayRecord.afterLeftPrincipal) &&
                Objects.equals(this.beforeLeftCollateral, repayRecord.beforeLeftCollateral) &&
                Objects.equals(this.afterLeftCollateral, repayRecord.afterLeftCollateral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, recordId, repaidAmount, borrowCurrency, collateralCurrency, initLtv, borrowTime, repayTime, totalInterest, beforeLeftPrincipal, afterLeftPrincipal, beforeLeftCollateral, afterLeftCollateral);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepayRecord {\n");
        sb.append("      orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("      recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("      repaidAmount: ").append(toIndentedString(repaidAmount)).append("\n");
        sb.append("      borrowCurrency: ").append(toIndentedString(borrowCurrency)).append("\n");
        sb.append("      collateralCurrency: ").append(toIndentedString(collateralCurrency)).append("\n");
        sb.append("      initLtv: ").append(toIndentedString(initLtv)).append("\n");
        sb.append("      borrowTime: ").append(toIndentedString(borrowTime)).append("\n");
        sb.append("      repayTime: ").append(toIndentedString(repayTime)).append("\n");
        sb.append("      totalInterest: ").append(toIndentedString(totalInterest)).append("\n");
        sb.append("      beforeLeftPrincipal: ").append(toIndentedString(beforeLeftPrincipal)).append("\n");
        sb.append("      afterLeftPrincipal: ").append(toIndentedString(afterLeftPrincipal)).append("\n");
        sb.append("      beforeLeftCollateral: ").append(toIndentedString(beforeLeftCollateral)).append("\n");
        sb.append("      afterLeftCollateral: ").append(toIndentedString(afterLeftCollateral)).append("\n");
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

