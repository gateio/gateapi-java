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
 * UnifiedSettings
 */
public class UnifiedSettings {
    public static final String SERIALIZED_NAME_USDT_FUTURES = "usdt_futures";
    @SerializedName(SERIALIZED_NAME_USDT_FUTURES)
    private Boolean usdtFutures;

    public static final String SERIALIZED_NAME_SPOT_HEDGE = "spot_hedge";
    @SerializedName(SERIALIZED_NAME_SPOT_HEDGE)
    private Boolean spotHedge;

    public static final String SERIALIZED_NAME_USE_FUNDING = "use_funding";
    @SerializedName(SERIALIZED_NAME_USE_FUNDING)
    private Boolean useFunding;

    public static final String SERIALIZED_NAME_OPTIONS = "options";
    @SerializedName(SERIALIZED_NAME_OPTIONS)
    private Boolean options;


    public UnifiedSettings usdtFutures(Boolean usdtFutures) {
        
        this.usdtFutures = usdtFutures;
        return this;
    }

     /**
     * USDT contract switch. In cross-currency margin mode, it can only be turned on and not off
     * @return usdtFutures
    **/
    @javax.annotation.Nullable
    public Boolean getUsdtFutures() {
        return usdtFutures;
    }


    public void setUsdtFutures(Boolean usdtFutures) {
        this.usdtFutures = usdtFutures;
    }

    public UnifiedSettings spotHedge(Boolean spotHedge) {
        
        this.spotHedge = spotHedge;
        return this;
    }

     /**
     * Spot hedging switch.
     * @return spotHedge
    **/
    @javax.annotation.Nullable
    public Boolean getSpotHedge() {
        return spotHedge;
    }


    public void setSpotHedge(Boolean spotHedge) {
        this.spotHedge = spotHedge;
    }

    public UnifiedSettings useFunding(Boolean useFunding) {
        
        this.useFunding = useFunding;
        return this;
    }

     /**
     * switch, when the mode is cross-currency margin mode, whether to use Uniloan financial funds as margin
     * @return useFunding
    **/
    @javax.annotation.Nullable
    public Boolean getUseFunding() {
        return useFunding;
    }


    public void setUseFunding(Boolean useFunding) {
        this.useFunding = useFunding;
    }

    public UnifiedSettings options(Boolean options) {
        
        this.options = options;
        return this;
    }

     /**
     * Option switch. In cross-currency margin mode, it can only be turned on and not off
     * @return options
    **/
    @javax.annotation.Nullable
    public Boolean getOptions() {
        return options;
    }


    public void setOptions(Boolean options) {
        this.options = options;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnifiedSettings unifiedSettings = (UnifiedSettings) o;
        return Objects.equals(this.usdtFutures, unifiedSettings.usdtFutures) &&
                Objects.equals(this.spotHedge, unifiedSettings.spotHedge) &&
                Objects.equals(this.useFunding, unifiedSettings.useFunding) &&
                Objects.equals(this.options, unifiedSettings.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usdtFutures, spotHedge, useFunding, options);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnifiedSettings {\n");
        sb.append("      usdtFutures: ").append(toIndentedString(usdtFutures)).append("\n");
        sb.append("      spotHedge: ").append(toIndentedString(spotHedge)).append("\n");
        sb.append("      useFunding: ").append(toIndentedString(useFunding)).append("\n");
        sb.append("      options: ").append(toIndentedString(options)).append("\n");
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

