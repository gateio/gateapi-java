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
 * Statistical data.
 */
public class FuturesAccountHistory {
    public static final String SERIALIZED_NAME_DNW = "dnw";
    @SerializedName(SERIALIZED_NAME_DNW)
    private String dnw;

    public static final String SERIALIZED_NAME_PNL = "pnl";
    @SerializedName(SERIALIZED_NAME_PNL)
    private String pnl;

    public static final String SERIALIZED_NAME_FEE = "fee";
    @SerializedName(SERIALIZED_NAME_FEE)
    private String fee;

    public static final String SERIALIZED_NAME_REFR = "refr";
    @SerializedName(SERIALIZED_NAME_REFR)
    private String refr;

    public static final String SERIALIZED_NAME_FUND = "fund";
    @SerializedName(SERIALIZED_NAME_FUND)
    private String fund;

    public static final String SERIALIZED_NAME_POINT_DNW = "point_dnw";
    @SerializedName(SERIALIZED_NAME_POINT_DNW)
    private String pointDnw;

    public static final String SERIALIZED_NAME_POINT_FEE = "point_fee";
    @SerializedName(SERIALIZED_NAME_POINT_FEE)
    private String pointFee;

    public static final String SERIALIZED_NAME_POINT_REFR = "point_refr";
    @SerializedName(SERIALIZED_NAME_POINT_REFR)
    private String pointRefr;

    public static final String SERIALIZED_NAME_BONUS_DNW = "bonus_dnw";
    @SerializedName(SERIALIZED_NAME_BONUS_DNW)
    private String bonusDnw;

    public static final String SERIALIZED_NAME_BONUS_OFFSET = "bonus_offset";
    @SerializedName(SERIALIZED_NAME_BONUS_OFFSET)
    private String bonusOffset;


    public FuturesAccountHistory dnw(String dnw) {
        
        this.dnw = dnw;
        return this;
    }

     /**
     * total amount of deposit and withdraw.
     * @return dnw
    **/
    @javax.annotation.Nullable
    public String getDnw() {
        return dnw;
    }


    public void setDnw(String dnw) {
        this.dnw = dnw;
    }

    public FuturesAccountHistory pnl(String pnl) {
        
        this.pnl = pnl;
        return this;
    }

     /**
     * total amount of trading profit and loss.
     * @return pnl
    **/
    @javax.annotation.Nullable
    public String getPnl() {
        return pnl;
    }


    public void setPnl(String pnl) {
        this.pnl = pnl;
    }

    public FuturesAccountHistory fee(String fee) {
        
        this.fee = fee;
        return this;
    }

     /**
     * total amount of fee.
     * @return fee
    **/
    @javax.annotation.Nullable
    public String getFee() {
        return fee;
    }


    public void setFee(String fee) {
        this.fee = fee;
    }

    public FuturesAccountHistory refr(String refr) {
        
        this.refr = refr;
        return this;
    }

     /**
     * total amount of referrer rebates.
     * @return refr
    **/
    @javax.annotation.Nullable
    public String getRefr() {
        return refr;
    }


    public void setRefr(String refr) {
        this.refr = refr;
    }

    public FuturesAccountHistory fund(String fund) {
        
        this.fund = fund;
        return this;
    }

     /**
     * total amount of funding costs.
     * @return fund
    **/
    @javax.annotation.Nullable
    public String getFund() {
        return fund;
    }


    public void setFund(String fund) {
        this.fund = fund;
    }

    public FuturesAccountHistory pointDnw(String pointDnw) {
        
        this.pointDnw = pointDnw;
        return this;
    }

     /**
     * total amount of point deposit and withdraw.
     * @return pointDnw
    **/
    @javax.annotation.Nullable
    public String getPointDnw() {
        return pointDnw;
    }


    public void setPointDnw(String pointDnw) {
        this.pointDnw = pointDnw;
    }

    public FuturesAccountHistory pointFee(String pointFee) {
        
        this.pointFee = pointFee;
        return this;
    }

     /**
     * total amount of point fee.
     * @return pointFee
    **/
    @javax.annotation.Nullable
    public String getPointFee() {
        return pointFee;
    }


    public void setPointFee(String pointFee) {
        this.pointFee = pointFee;
    }

    public FuturesAccountHistory pointRefr(String pointRefr) {
        
        this.pointRefr = pointRefr;
        return this;
    }

     /**
     * total amount of referrer rebates of point fee.
     * @return pointRefr
    **/
    @javax.annotation.Nullable
    public String getPointRefr() {
        return pointRefr;
    }


    public void setPointRefr(String pointRefr) {
        this.pointRefr = pointRefr;
    }

    public FuturesAccountHistory bonusDnw(String bonusDnw) {
        
        this.bonusDnw = bonusDnw;
        return this;
    }

     /**
     * total amount of perpetual contract bonus transfer.
     * @return bonusDnw
    **/
    @javax.annotation.Nullable
    public String getBonusDnw() {
        return bonusDnw;
    }


    public void setBonusDnw(String bonusDnw) {
        this.bonusDnw = bonusDnw;
    }

    public FuturesAccountHistory bonusOffset(String bonusOffset) {
        
        this.bonusOffset = bonusOffset;
        return this;
    }

     /**
     * total amount of perpetual contract bonus deduction.
     * @return bonusOffset
    **/
    @javax.annotation.Nullable
    public String getBonusOffset() {
        return bonusOffset;
    }


    public void setBonusOffset(String bonusOffset) {
        this.bonusOffset = bonusOffset;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuturesAccountHistory futuresAccountHistory = (FuturesAccountHistory) o;
        return Objects.equals(this.dnw, futuresAccountHistory.dnw) &&
                Objects.equals(this.pnl, futuresAccountHistory.pnl) &&
                Objects.equals(this.fee, futuresAccountHistory.fee) &&
                Objects.equals(this.refr, futuresAccountHistory.refr) &&
                Objects.equals(this.fund, futuresAccountHistory.fund) &&
                Objects.equals(this.pointDnw, futuresAccountHistory.pointDnw) &&
                Objects.equals(this.pointFee, futuresAccountHistory.pointFee) &&
                Objects.equals(this.pointRefr, futuresAccountHistory.pointRefr) &&
                Objects.equals(this.bonusDnw, futuresAccountHistory.bonusDnw) &&
                Objects.equals(this.bonusOffset, futuresAccountHistory.bonusOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnw, pnl, fee, refr, fund, pointDnw, pointFee, pointRefr, bonusDnw, bonusOffset);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuturesAccountHistory {\n");
        sb.append("      dnw: ").append(toIndentedString(dnw)).append("\n");
        sb.append("      pnl: ").append(toIndentedString(pnl)).append("\n");
        sb.append("      fee: ").append(toIndentedString(fee)).append("\n");
        sb.append("      refr: ").append(toIndentedString(refr)).append("\n");
        sb.append("      fund: ").append(toIndentedString(fund)).append("\n");
        sb.append("      pointDnw: ").append(toIndentedString(pointDnw)).append("\n");
        sb.append("      pointFee: ").append(toIndentedString(pointFee)).append("\n");
        sb.append("      pointRefr: ").append(toIndentedString(pointRefr)).append("\n");
        sb.append("      bonusDnw: ").append(toIndentedString(bonusDnw)).append("\n");
        sb.append("      bonusOffset: ").append(toIndentedString(bonusOffset)).append("\n");
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

