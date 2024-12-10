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
 * SpotFee
 */
public class SpotFee {
    public static final String SERIALIZED_NAME_USER_ID = "user_id";
    @SerializedName(SERIALIZED_NAME_USER_ID)
    private Long userId;

    public static final String SERIALIZED_NAME_TAKER_FEE = "taker_fee";
    @SerializedName(SERIALIZED_NAME_TAKER_FEE)
    private String takerFee;

    public static final String SERIALIZED_NAME_MAKER_FEE = "maker_fee";
    @SerializedName(SERIALIZED_NAME_MAKER_FEE)
    private String makerFee;

    public static final String SERIALIZED_NAME_GT_DISCOUNT = "gt_discount";
    @SerializedName(SERIALIZED_NAME_GT_DISCOUNT)
    private Boolean gtDiscount;

    public static final String SERIALIZED_NAME_GT_TAKER_FEE = "gt_taker_fee";
    @SerializedName(SERIALIZED_NAME_GT_TAKER_FEE)
    private String gtTakerFee;

    public static final String SERIALIZED_NAME_GT_MAKER_FEE = "gt_maker_fee";
    @SerializedName(SERIALIZED_NAME_GT_MAKER_FEE)
    private String gtMakerFee;

    public static final String SERIALIZED_NAME_LOAN_FEE = "loan_fee";
    @SerializedName(SERIALIZED_NAME_LOAN_FEE)
    private String loanFee;

    public static final String SERIALIZED_NAME_POINT_TYPE = "point_type";
    @SerializedName(SERIALIZED_NAME_POINT_TYPE)
    private String pointType;

    public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
    @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
    private String currencyPair;

    public static final String SERIALIZED_NAME_DEBIT_FEE = "debit_fee";
    @SerializedName(SERIALIZED_NAME_DEBIT_FEE)
    private Integer debitFee;


    public SpotFee userId(Long userId) {
        
        this.userId = userId;
        return this;
    }

     /**
     * User ID
     * @return userId
    **/
    @javax.annotation.Nullable
    public Long getUserId() {
        return userId;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public SpotFee takerFee(String takerFee) {
        
        this.takerFee = takerFee;
        return this;
    }

     /**
     * taker fee rate
     * @return takerFee
    **/
    @javax.annotation.Nullable
    public String getTakerFee() {
        return takerFee;
    }


    public void setTakerFee(String takerFee) {
        this.takerFee = takerFee;
    }

    public SpotFee makerFee(String makerFee) {
        
        this.makerFee = makerFee;
        return this;
    }

     /**
     * maker fee rate
     * @return makerFee
    **/
    @javax.annotation.Nullable
    public String getMakerFee() {
        return makerFee;
    }


    public void setMakerFee(String makerFee) {
        this.makerFee = makerFee;
    }

    public SpotFee gtDiscount(Boolean gtDiscount) {
        
        this.gtDiscount = gtDiscount;
        return this;
    }

     /**
     * If GT deduction is enabled
     * @return gtDiscount
    **/
    @javax.annotation.Nullable
    public Boolean getGtDiscount() {
        return gtDiscount;
    }


    public void setGtDiscount(Boolean gtDiscount) {
        this.gtDiscount = gtDiscount;
    }

    public SpotFee gtTakerFee(String gtTakerFee) {
        
        this.gtTakerFee = gtTakerFee;
        return this;
    }

     /**
     * Taker fee rate if using GT deduction. It will be 0 if GT deduction is disabled
     * @return gtTakerFee
    **/
    @javax.annotation.Nullable
    public String getGtTakerFee() {
        return gtTakerFee;
    }


    public void setGtTakerFee(String gtTakerFee) {
        this.gtTakerFee = gtTakerFee;
    }

    public SpotFee gtMakerFee(String gtMakerFee) {
        
        this.gtMakerFee = gtMakerFee;
        return this;
    }

     /**
     * Maker fee rate if using GT deduction. It will be 0 if GT deduction is disabled
     * @return gtMakerFee
    **/
    @javax.annotation.Nullable
    public String getGtMakerFee() {
        return gtMakerFee;
    }


    public void setGtMakerFee(String gtMakerFee) {
        this.gtMakerFee = gtMakerFee;
    }

    public SpotFee loanFee(String loanFee) {
        
        this.loanFee = loanFee;
        return this;
    }

     /**
     * Loan fee rate of margin lending
     * @return loanFee
    **/
    @javax.annotation.Nullable
    public String getLoanFee() {
        return loanFee;
    }


    public void setLoanFee(String loanFee) {
        this.loanFee = loanFee;
    }

    public SpotFee pointType(String pointType) {
        
        this.pointType = pointType;
        return this;
    }

     /**
     * Point type. 0 - Initial version. 1 - new version since 202009
     * @return pointType
    **/
    @javax.annotation.Nullable
    public String getPointType() {
        return pointType;
    }


    public void setPointType(String pointType) {
        this.pointType = pointType;
    }

    public SpotFee currencyPair(String currencyPair) {
        
        this.currencyPair = currencyPair;
        return this;
    }

     /**
     * Currency pair
     * @return currencyPair
    **/
    @javax.annotation.Nullable
    public String getCurrencyPair() {
        return currencyPair;
    }


    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public SpotFee debitFee(Integer debitFee) {
        
        this.debitFee = debitFee;
        return this;
    }

     /**
     * Deduction types for rates, 1 - GT deduction, 2 - Point card deduction, 3 - VIP rates
     * @return debitFee
    **/
    @javax.annotation.Nullable
    public Integer getDebitFee() {
        return debitFee;
    }


    public void setDebitFee(Integer debitFee) {
        this.debitFee = debitFee;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpotFee spotFee = (SpotFee) o;
        return Objects.equals(this.userId, spotFee.userId) &&
                Objects.equals(this.takerFee, spotFee.takerFee) &&
                Objects.equals(this.makerFee, spotFee.makerFee) &&
                Objects.equals(this.gtDiscount, spotFee.gtDiscount) &&
                Objects.equals(this.gtTakerFee, spotFee.gtTakerFee) &&
                Objects.equals(this.gtMakerFee, spotFee.gtMakerFee) &&
                Objects.equals(this.loanFee, spotFee.loanFee) &&
                Objects.equals(this.pointType, spotFee.pointType) &&
                Objects.equals(this.currencyPair, spotFee.currencyPair) &&
                Objects.equals(this.debitFee, spotFee.debitFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, takerFee, makerFee, gtDiscount, gtTakerFee, gtMakerFee, loanFee, pointType, currencyPair, debitFee);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpotFee {\n");
        sb.append("      userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("      takerFee: ").append(toIndentedString(takerFee)).append("\n");
        sb.append("      makerFee: ").append(toIndentedString(makerFee)).append("\n");
        sb.append("      gtDiscount: ").append(toIndentedString(gtDiscount)).append("\n");
        sb.append("      gtTakerFee: ").append(toIndentedString(gtTakerFee)).append("\n");
        sb.append("      gtMakerFee: ").append(toIndentedString(gtMakerFee)).append("\n");
        sb.append("      loanFee: ").append(toIndentedString(loanFee)).append("\n");
        sb.append("      pointType: ").append(toIndentedString(pointType)).append("\n");
        sb.append("      currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
        sb.append("      debitFee: ").append(toIndentedString(debitFee)).append("\n");
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

