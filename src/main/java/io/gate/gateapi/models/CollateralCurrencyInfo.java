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
 * CollateralCurrencyInfo
 */
public class CollateralCurrencyInfo {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_INDEX_PRICE = "index_price";
    @SerializedName(SERIALIZED_NAME_INDEX_PRICE)
    private String indexPrice;

    public static final String SERIALIZED_NAME_LEFT_COLLATERAL = "left_collateral";
    @SerializedName(SERIALIZED_NAME_LEFT_COLLATERAL)
    private String leftCollateral;

    public static final String SERIALIZED_NAME_LEFT_COLLATERAL_USDT = "left_collateral_usdt";
    @SerializedName(SERIALIZED_NAME_LEFT_COLLATERAL_USDT)
    private String leftCollateralUsdt;


    public CollateralCurrencyInfo currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Currency
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CollateralCurrencyInfo indexPrice(String indexPrice) {
        
        this.indexPrice = indexPrice;
        return this;
    }

     /**
     * Currency Index Price
     * @return indexPrice
    **/
    @javax.annotation.Nullable
    public String getIndexPrice() {
        return indexPrice;
    }


    public void setIndexPrice(String indexPrice) {
        this.indexPrice = indexPrice;
    }

    public CollateralCurrencyInfo leftCollateral(String leftCollateral) {
        
        this.leftCollateral = leftCollateral;
        return this;
    }

     /**
     * Left Collateral Amount
     * @return leftCollateral
    **/
    @javax.annotation.Nullable
    public String getLeftCollateral() {
        return leftCollateral;
    }


    public void setLeftCollateral(String leftCollateral) {
        this.leftCollateral = leftCollateral;
    }

    public CollateralCurrencyInfo leftCollateralUsdt(String leftCollateralUsdt) {
        
        this.leftCollateralUsdt = leftCollateralUsdt;
        return this;
    }

     /**
     * Value of left collateral amount in USDT
     * @return leftCollateralUsdt
    **/
    @javax.annotation.Nullable
    public String getLeftCollateralUsdt() {
        return leftCollateralUsdt;
    }


    public void setLeftCollateralUsdt(String leftCollateralUsdt) {
        this.leftCollateralUsdt = leftCollateralUsdt;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollateralCurrencyInfo collateralCurrencyInfo = (CollateralCurrencyInfo) o;
        return Objects.equals(this.currency, collateralCurrencyInfo.currency) &&
                Objects.equals(this.indexPrice, collateralCurrencyInfo.indexPrice) &&
                Objects.equals(this.leftCollateral, collateralCurrencyInfo.leftCollateral) &&
                Objects.equals(this.leftCollateralUsdt, collateralCurrencyInfo.leftCollateralUsdt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, indexPrice, leftCollateral, leftCollateralUsdt);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollateralCurrencyInfo {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      indexPrice: ").append(toIndentedString(indexPrice)).append("\n");
        sb.append("      leftCollateral: ").append(toIndentedString(leftCollateral)).append("\n");
        sb.append("      leftCollateralUsdt: ").append(toIndentedString(leftCollateralUsdt)).append("\n");
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

