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
import io.gate.gateapi.models.RepayRecordCurrency;
import io.gate.gateapi.models.RepayRecordLeftInterest;
import io.gate.gateapi.models.RepayRecordRepaidCurrency;
import io.gate.gateapi.models.RepayRecordTotalInterest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Mult Repay Record.
 */
public class MultiRepayRecord {
    public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    private Long orderId;

    public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
    @SerializedName(SERIALIZED_NAME_RECORD_ID)
    private Long recordId;

    public static final String SERIALIZED_NAME_INIT_LTV = "init_ltv";
    @SerializedName(SERIALIZED_NAME_INIT_LTV)
    private String initLtv;

    public static final String SERIALIZED_NAME_BEFORE_LTV = "before_ltv";
    @SerializedName(SERIALIZED_NAME_BEFORE_LTV)
    private String beforeLtv;

    public static final String SERIALIZED_NAME_AFTER_LTV = "after_ltv";
    @SerializedName(SERIALIZED_NAME_AFTER_LTV)
    private String afterLtv;

    public static final String SERIALIZED_NAME_BORROW_TIME = "borrow_time";
    @SerializedName(SERIALIZED_NAME_BORROW_TIME)
    private Long borrowTime;

    public static final String SERIALIZED_NAME_REPAY_TIME = "repay_time";
    @SerializedName(SERIALIZED_NAME_REPAY_TIME)
    private Long repayTime;

    public static final String SERIALIZED_NAME_BORROW_CURRENCIES = "borrow_currencies";
    @SerializedName(SERIALIZED_NAME_BORROW_CURRENCIES)
    private List<RepayRecordCurrency> borrowCurrencies = null;

    public static final String SERIALIZED_NAME_COLLATERAL_CURRENCIES = "collateral_currencies";
    @SerializedName(SERIALIZED_NAME_COLLATERAL_CURRENCIES)
    private List<RepayRecordCurrency> collateralCurrencies = null;

    public static final String SERIALIZED_NAME_REPAID_CURRENCIES = "repaid_currencies";
    @SerializedName(SERIALIZED_NAME_REPAID_CURRENCIES)
    private List<RepayRecordRepaidCurrency> repaidCurrencies = null;

    public static final String SERIALIZED_NAME_TOTAL_INTEREST_LIST = "total_interest_list";
    @SerializedName(SERIALIZED_NAME_TOTAL_INTEREST_LIST)
    private List<RepayRecordTotalInterest> totalInterestList = null;

    public static final String SERIALIZED_NAME_LEFT_REPAY_INTEREST_LIST = "left_repay_interest_list";
    @SerializedName(SERIALIZED_NAME_LEFT_REPAY_INTEREST_LIST)
    private List<RepayRecordLeftInterest> leftRepayInterestList = null;


    public MultiRepayRecord orderId(Long orderId) {
        
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

    public MultiRepayRecord recordId(Long recordId) {
        
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

    public MultiRepayRecord initLtv(String initLtv) {
        
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

    public MultiRepayRecord beforeLtv(String beforeLtv) {
        
        this.beforeLtv = beforeLtv;
        return this;
    }

     /**
     * Ltv before the operation.
     * @return beforeLtv
    **/
    @javax.annotation.Nullable
    public String getBeforeLtv() {
        return beforeLtv;
    }


    public void setBeforeLtv(String beforeLtv) {
        this.beforeLtv = beforeLtv;
    }

    public MultiRepayRecord afterLtv(String afterLtv) {
        
        this.afterLtv = afterLtv;
        return this;
    }

     /**
     * Ltv after the operation.
     * @return afterLtv
    **/
    @javax.annotation.Nullable
    public String getAfterLtv() {
        return afterLtv;
    }


    public void setAfterLtv(String afterLtv) {
        this.afterLtv = afterLtv;
    }

    public MultiRepayRecord borrowTime(Long borrowTime) {
        
        this.borrowTime = borrowTime;
        return this;
    }

     /**
     * Borrowing time, timestamp in seconds.
     * @return borrowTime
    **/
    @javax.annotation.Nullable
    public Long getBorrowTime() {
        return borrowTime;
    }


    public void setBorrowTime(Long borrowTime) {
        this.borrowTime = borrowTime;
    }

    public MultiRepayRecord repayTime(Long repayTime) {
        
        this.repayTime = repayTime;
        return this;
    }

     /**
     * Repayment time, timestamp in seconds.
     * @return repayTime
    **/
    @javax.annotation.Nullable
    public Long getRepayTime() {
        return repayTime;
    }


    public void setRepayTime(Long repayTime) {
        this.repayTime = repayTime;
    }

    public MultiRepayRecord borrowCurrencies(List<RepayRecordCurrency> borrowCurrencies) {
        
        this.borrowCurrencies = borrowCurrencies;
        return this;
    }

    public MultiRepayRecord addBorrowCurrenciesItem(RepayRecordCurrency borrowCurrenciesItem) {
        if (this.borrowCurrencies == null) {
            this.borrowCurrencies = new ArrayList<>();
        }
        this.borrowCurrencies.add(borrowCurrenciesItem);
        return this;
    }

     /**
     * List of borrowing information.
     * @return borrowCurrencies
    **/
    @javax.annotation.Nullable
    public List<RepayRecordCurrency> getBorrowCurrencies() {
        return borrowCurrencies;
    }


    public void setBorrowCurrencies(List<RepayRecordCurrency> borrowCurrencies) {
        this.borrowCurrencies = borrowCurrencies;
    }

    public MultiRepayRecord collateralCurrencies(List<RepayRecordCurrency> collateralCurrencies) {
        
        this.collateralCurrencies = collateralCurrencies;
        return this;
    }

    public MultiRepayRecord addCollateralCurrenciesItem(RepayRecordCurrency collateralCurrenciesItem) {
        if (this.collateralCurrencies == null) {
            this.collateralCurrencies = new ArrayList<>();
        }
        this.collateralCurrencies.add(collateralCurrenciesItem);
        return this;
    }

     /**
     * List of collateral information.
     * @return collateralCurrencies
    **/
    @javax.annotation.Nullable
    public List<RepayRecordCurrency> getCollateralCurrencies() {
        return collateralCurrencies;
    }


    public void setCollateralCurrencies(List<RepayRecordCurrency> collateralCurrencies) {
        this.collateralCurrencies = collateralCurrencies;
    }

    public MultiRepayRecord repaidCurrencies(List<RepayRecordRepaidCurrency> repaidCurrencies) {
        
        this.repaidCurrencies = repaidCurrencies;
        return this;
    }

    public MultiRepayRecord addRepaidCurrenciesItem(RepayRecordRepaidCurrency repaidCurrenciesItem) {
        if (this.repaidCurrencies == null) {
            this.repaidCurrencies = new ArrayList<>();
        }
        this.repaidCurrencies.add(repaidCurrenciesItem);
        return this;
    }

     /**
     * Repay Currency List.
     * @return repaidCurrencies
    **/
    @javax.annotation.Nullable
    public List<RepayRecordRepaidCurrency> getRepaidCurrencies() {
        return repaidCurrencies;
    }


    public void setRepaidCurrencies(List<RepayRecordRepaidCurrency> repaidCurrencies) {
        this.repaidCurrencies = repaidCurrencies;
    }

    public MultiRepayRecord totalInterestList(List<RepayRecordTotalInterest> totalInterestList) {
        
        this.totalInterestList = totalInterestList;
        return this;
    }

    public MultiRepayRecord addTotalInterestListItem(RepayRecordTotalInterest totalInterestListItem) {
        if (this.totalInterestList == null) {
            this.totalInterestList = new ArrayList<>();
        }
        this.totalInterestList.add(totalInterestListItem);
        return this;
    }

     /**
     * Total Interest List.
     * @return totalInterestList
    **/
    @javax.annotation.Nullable
    public List<RepayRecordTotalInterest> getTotalInterestList() {
        return totalInterestList;
    }


    public void setTotalInterestList(List<RepayRecordTotalInterest> totalInterestList) {
        this.totalInterestList = totalInterestList;
    }

    public MultiRepayRecord leftRepayInterestList(List<RepayRecordLeftInterest> leftRepayInterestList) {
        
        this.leftRepayInterestList = leftRepayInterestList;
        return this;
    }

    public MultiRepayRecord addLeftRepayInterestListItem(RepayRecordLeftInterest leftRepayInterestListItem) {
        if (this.leftRepayInterestList == null) {
            this.leftRepayInterestList = new ArrayList<>();
        }
        this.leftRepayInterestList.add(leftRepayInterestListItem);
        return this;
    }

     /**
     * List of left repay interest.
     * @return leftRepayInterestList
    **/
    @javax.annotation.Nullable
    public List<RepayRecordLeftInterest> getLeftRepayInterestList() {
        return leftRepayInterestList;
    }


    public void setLeftRepayInterestList(List<RepayRecordLeftInterest> leftRepayInterestList) {
        this.leftRepayInterestList = leftRepayInterestList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiRepayRecord multiRepayRecord = (MultiRepayRecord) o;
        return Objects.equals(this.orderId, multiRepayRecord.orderId) &&
                Objects.equals(this.recordId, multiRepayRecord.recordId) &&
                Objects.equals(this.initLtv, multiRepayRecord.initLtv) &&
                Objects.equals(this.beforeLtv, multiRepayRecord.beforeLtv) &&
                Objects.equals(this.afterLtv, multiRepayRecord.afterLtv) &&
                Objects.equals(this.borrowTime, multiRepayRecord.borrowTime) &&
                Objects.equals(this.repayTime, multiRepayRecord.repayTime) &&
                Objects.equals(this.borrowCurrencies, multiRepayRecord.borrowCurrencies) &&
                Objects.equals(this.collateralCurrencies, multiRepayRecord.collateralCurrencies) &&
                Objects.equals(this.repaidCurrencies, multiRepayRecord.repaidCurrencies) &&
                Objects.equals(this.totalInterestList, multiRepayRecord.totalInterestList) &&
                Objects.equals(this.leftRepayInterestList, multiRepayRecord.leftRepayInterestList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, recordId, initLtv, beforeLtv, afterLtv, borrowTime, repayTime, borrowCurrencies, collateralCurrencies, repaidCurrencies, totalInterestList, leftRepayInterestList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiRepayRecord {\n");
        sb.append("      orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("      recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("      initLtv: ").append(toIndentedString(initLtv)).append("\n");
        sb.append("      beforeLtv: ").append(toIndentedString(beforeLtv)).append("\n");
        sb.append("      afterLtv: ").append(toIndentedString(afterLtv)).append("\n");
        sb.append("      borrowTime: ").append(toIndentedString(borrowTime)).append("\n");
        sb.append("      repayTime: ").append(toIndentedString(repayTime)).append("\n");
        sb.append("      borrowCurrencies: ").append(toIndentedString(borrowCurrencies)).append("\n");
        sb.append("      collateralCurrencies: ").append(toIndentedString(collateralCurrencies)).append("\n");
        sb.append("      repaidCurrencies: ").append(toIndentedString(repaidCurrencies)).append("\n");
        sb.append("      totalInterestList: ").append(toIndentedString(totalInterestList)).append("\n");
        sb.append("      leftRepayInterestList: ").append(toIndentedString(leftRepayInterestList)).append("\n");
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

