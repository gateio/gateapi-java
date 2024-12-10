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
 * FuturesOrderAmendment
 */
public class FuturesOrderAmendment {
    public static final String SERIALIZED_NAME_SIZE = "size";
    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_PRICE = "price";
    @SerializedName(SERIALIZED_NAME_PRICE)
    private String price;

    public static final String SERIALIZED_NAME_AMEND_TEXT = "amend_text";
    @SerializedName(SERIALIZED_NAME_AMEND_TEXT)
    private String amendText;

    public static final String SERIALIZED_NAME_BIZ_INFO = "biz_info";
    @SerializedName(SERIALIZED_NAME_BIZ_INFO)
    private String bizInfo;

    public static final String SERIALIZED_NAME_BBO = "bbo";
    @SerializedName(SERIALIZED_NAME_BBO)
    private String bbo;


    public FuturesOrderAmendment size(Long size) {
        
        this.size = size;
        return this;
    }

     /**
     * New order size, including filled part.  - If new size is less than or equal to filled size, the order will be cancelled. - Order side must be identical to the original one. - Close order size cannot be changed. - For reduce only orders, increasing size may leads to other reduce only orders being cancelled. - If price is not changed, decreasing size will not change its precedence in order book, while increasing will move it to the last at current price.
     * @return size
    **/
    @javax.annotation.Nullable
    public Long getSize() {
        return size;
    }


    public void setSize(Long size) {
        this.size = size;
    }

    public FuturesOrderAmendment price(String price) {
        
        this.price = price;
        return this;
    }

     /**
     * New order price.
     * @return price
    **/
    @javax.annotation.Nullable
    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public FuturesOrderAmendment amendText(String amendText) {
        
        this.amendText = amendText;
        return this;
    }

     /**
     * Custom info during amending order
     * @return amendText
    **/
    @javax.annotation.Nullable
    public String getAmendText() {
        return amendText;
    }


    public void setAmendText(String amendText) {
        this.amendText = amendText;
    }

    public FuturesOrderAmendment bizInfo(String bizInfo) {
        
        this.bizInfo = bizInfo;
        return this;
    }

     /**
     * Users can annotate this modification with information.
     * @return bizInfo
    **/
    @javax.annotation.Nullable
    public String getBizInfo() {
        return bizInfo;
    }


    public void setBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
    }

    public FuturesOrderAmendment bbo(String bbo) {
        
        this.bbo = bbo;
        return this;
    }

     /**
     * Users are able to modify the offer price manually.
     * @return bbo
    **/
    @javax.annotation.Nullable
    public String getBbo() {
        return bbo;
    }


    public void setBbo(String bbo) {
        this.bbo = bbo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuturesOrderAmendment futuresOrderAmendment = (FuturesOrderAmendment) o;
        return Objects.equals(this.size, futuresOrderAmendment.size) &&
                Objects.equals(this.price, futuresOrderAmendment.price) &&
                Objects.equals(this.amendText, futuresOrderAmendment.amendText) &&
                Objects.equals(this.bizInfo, futuresOrderAmendment.bizInfo) &&
                Objects.equals(this.bbo, futuresOrderAmendment.bbo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, price, amendText, bizInfo, bbo);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuturesOrderAmendment {\n");
        sb.append("      size: ").append(toIndentedString(size)).append("\n");
        sb.append("      price: ").append(toIndentedString(price)).append("\n");
        sb.append("      amendText: ").append(toIndentedString(amendText)).append("\n");
        sb.append("      bizInfo: ").append(toIndentedString(bizInfo)).append("\n");
        sb.append("      bbo: ").append(toIndentedString(bbo)).append("\n");
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

