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
import io.gate.gateapi.models.MockMarginResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Risk unit
 */
public class MockRiskUnit {
    public static final String SERIALIZED_NAME_SYMBOL = "symbol";
    @SerializedName(SERIALIZED_NAME_SYMBOL)
    private String symbol;

    public static final String SERIALIZED_NAME_SPOT_IN_USE = "spot_in_use";
    @SerializedName(SERIALIZED_NAME_SPOT_IN_USE)
    private String spotInUse;

    public static final String SERIALIZED_NAME_MAINTAIN_MARGIN = "maintain_margin";
    @SerializedName(SERIALIZED_NAME_MAINTAIN_MARGIN)
    private String maintainMargin;

    public static final String SERIALIZED_NAME_INITIAL_MARGIN = "initial_margin";
    @SerializedName(SERIALIZED_NAME_INITIAL_MARGIN)
    private String initialMargin;

    public static final String SERIALIZED_NAME_MARGIN_RESULT = "margin_result";
    @SerializedName(SERIALIZED_NAME_MARGIN_RESULT)
    private List<MockMarginResult> marginResult = null;

    public static final String SERIALIZED_NAME_DELTA = "delta";
    @SerializedName(SERIALIZED_NAME_DELTA)
    private String delta;

    public static final String SERIALIZED_NAME_GAMMA = "gamma";
    @SerializedName(SERIALIZED_NAME_GAMMA)
    private String gamma;

    public static final String SERIALIZED_NAME_THETA = "theta";
    @SerializedName(SERIALIZED_NAME_THETA)
    private String theta;

    public static final String SERIALIZED_NAME_VEGA = "vega";
    @SerializedName(SERIALIZED_NAME_VEGA)
    private String vega;


    public MockRiskUnit symbol(String symbol) {
        
        this.symbol = symbol;
        return this;
    }

     /**
     * Risk unit name
     * @return symbol
    **/
    @javax.annotation.Nullable
    public String getSymbol() {
        return symbol;
    }


    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public MockRiskUnit spotInUse(String spotInUse) {
        
        this.spotInUse = spotInUse;
        return this;
    }

     /**
     * Spot usage
     * @return spotInUse
    **/
    @javax.annotation.Nullable
    public String getSpotInUse() {
        return spotInUse;
    }


    public void setSpotInUse(String spotInUse) {
        this.spotInUse = spotInUse;
    }

    public MockRiskUnit maintainMargin(String maintainMargin) {
        
        this.maintainMargin = maintainMargin;
        return this;
    }

     /**
     * Maintenance margin
     * @return maintainMargin
    **/
    @javax.annotation.Nullable
    public String getMaintainMargin() {
        return maintainMargin;
    }


    public void setMaintainMargin(String maintainMargin) {
        this.maintainMargin = maintainMargin;
    }

    public MockRiskUnit initialMargin(String initialMargin) {
        
        this.initialMargin = initialMargin;
        return this;
    }

     /**
     * Initial margin
     * @return initialMargin
    **/
    @javax.annotation.Nullable
    public String getInitialMargin() {
        return initialMargin;
    }


    public void setInitialMargin(String initialMargin) {
        this.initialMargin = initialMargin;
    }

    public MockRiskUnit marginResult(List<MockMarginResult> marginResult) {
        
        this.marginResult = marginResult;
        return this;
    }

    public MockRiskUnit addMarginResultItem(MockMarginResult marginResultItem) {
        if (this.marginResult == null) {
            this.marginResult = new ArrayList<>();
        }
        this.marginResult.add(marginResultItem);
        return this;
    }

     /**
     * Margin result
     * @return marginResult
    **/
    @javax.annotation.Nullable
    public List<MockMarginResult> getMarginResult() {
        return marginResult;
    }


    public void setMarginResult(List<MockMarginResult> marginResult) {
        this.marginResult = marginResult;
    }

    public MockRiskUnit delta(String delta) {
        
        this.delta = delta;
        return this;
    }

     /**
     * Total Delta of risk unit
     * @return delta
    **/
    @javax.annotation.Nullable
    public String getDelta() {
        return delta;
    }


    public void setDelta(String delta) {
        this.delta = delta;
    }

    public MockRiskUnit gamma(String gamma) {
        
        this.gamma = gamma;
        return this;
    }

     /**
     * Total Gamma of risk unit
     * @return gamma
    **/
    @javax.annotation.Nullable
    public String getGamma() {
        return gamma;
    }


    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public MockRiskUnit theta(String theta) {
        
        this.theta = theta;
        return this;
    }

     /**
     * Total Theta of risk unit
     * @return theta
    **/
    @javax.annotation.Nullable
    public String getTheta() {
        return theta;
    }


    public void setTheta(String theta) {
        this.theta = theta;
    }

    public MockRiskUnit vega(String vega) {
        
        this.vega = vega;
        return this;
    }

     /**
     * Total Vega of risk unit
     * @return vega
    **/
    @javax.annotation.Nullable
    public String getVega() {
        return vega;
    }


    public void setVega(String vega) {
        this.vega = vega;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MockRiskUnit mockRiskUnit = (MockRiskUnit) o;
        return Objects.equals(this.symbol, mockRiskUnit.symbol) &&
                Objects.equals(this.spotInUse, mockRiskUnit.spotInUse) &&
                Objects.equals(this.maintainMargin, mockRiskUnit.maintainMargin) &&
                Objects.equals(this.initialMargin, mockRiskUnit.initialMargin) &&
                Objects.equals(this.marginResult, mockRiskUnit.marginResult) &&
                Objects.equals(this.delta, mockRiskUnit.delta) &&
                Objects.equals(this.gamma, mockRiskUnit.gamma) &&
                Objects.equals(this.theta, mockRiskUnit.theta) &&
                Objects.equals(this.vega, mockRiskUnit.vega);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, spotInUse, maintainMargin, initialMargin, marginResult, delta, gamma, theta, vega);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MockRiskUnit {\n");
        sb.append("      symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("      spotInUse: ").append(toIndentedString(spotInUse)).append("\n");
        sb.append("      maintainMargin: ").append(toIndentedString(maintainMargin)).append("\n");
        sb.append("      initialMargin: ").append(toIndentedString(initialMargin)).append("\n");
        sb.append("      marginResult: ").append(toIndentedString(marginResult)).append("\n");
        sb.append("      delta: ").append(toIndentedString(delta)).append("\n");
        sb.append("      gamma: ").append(toIndentedString(gamma)).append("\n");
        sb.append("      theta: ").append(toIndentedString(theta)).append("\n");
        sb.append("      vega: ").append(toIndentedString(vega)).append("\n");
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

