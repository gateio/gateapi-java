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
 * MMP Reset
 */
public class OptionsMMPReset {
    public static final String SERIALIZED_NAME_UNDERLYING = "underlying";
    @SerializedName(SERIALIZED_NAME_UNDERLYING)
    private String underlying;

    public static final String SERIALIZED_NAME_WINDOW = "window";
    @SerializedName(SERIALIZED_NAME_WINDOW)
    private Integer window;

    public static final String SERIALIZED_NAME_FROZEN_PERIOD = "frozen_period";
    @SerializedName(SERIALIZED_NAME_FROZEN_PERIOD)
    private Integer frozenPeriod;

    public static final String SERIALIZED_NAME_QTY_LIMIT = "qty_limit";
    @SerializedName(SERIALIZED_NAME_QTY_LIMIT)
    private String qtyLimit;

    public static final String SERIALIZED_NAME_DELTA_LIMIT = "delta_limit";
    @SerializedName(SERIALIZED_NAME_DELTA_LIMIT)
    private String deltaLimit;

    public static final String SERIALIZED_NAME_TRIGGER_TIME_MS = "trigger_time_ms";
    @SerializedName(SERIALIZED_NAME_TRIGGER_TIME_MS)
    private Long triggerTimeMs;

    public static final String SERIALIZED_NAME_FROZEN_UNTIL_MS = "frozen_until_ms";
    @SerializedName(SERIALIZED_NAME_FROZEN_UNTIL_MS)
    private Long frozenUntilMs;


    public OptionsMMPReset underlying(String underlying) {
        
        this.underlying = underlying;
        return this;
    }

     /**
     * Underlying
     * @return underlying
    **/
    public String getUnderlying() {
        return underlying;
    }


    public void setUnderlying(String underlying) {
        this.underlying = underlying;
    }

     /**
     * Time window (milliseconds), between 1-5000, 0 means disabling MMP
     * @return window
    **/
    @javax.annotation.Nullable
    public Integer getWindow() {
        return window;
    }


     /**
     * Freeze duration (milliseconds), 0 means always frozen, need to call reset API to unfreeze
     * @return frozenPeriod
    **/
    @javax.annotation.Nullable
    public Integer getFrozenPeriod() {
        return frozenPeriod;
    }


     /**
     * Trading volume upper limit (positive number, up to 2 decimal places)
     * @return qtyLimit
    **/
    @javax.annotation.Nullable
    public String getQtyLimit() {
        return qtyLimit;
    }


     /**
     * Upper limit of net delta value (positive number, up to 2 decimal places)
     * @return deltaLimit
    **/
    @javax.annotation.Nullable
    public String getDeltaLimit() {
        return deltaLimit;
    }


     /**
     * Trigger freeze time (milliseconds), 0 means no freeze is triggered
     * @return triggerTimeMs
    **/
    @javax.annotation.Nullable
    public Long getTriggerTimeMs() {
        return triggerTimeMs;
    }


     /**
     * Unfreeze time (milliseconds). If the freeze duration is not configured, there will be no unfreeze time after the freeze is triggered.
     * @return frozenUntilMs
    **/
    @javax.annotation.Nullable
    public Long getFrozenUntilMs() {
        return frozenUntilMs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OptionsMMPReset optionsMMPReset = (OptionsMMPReset) o;
        return Objects.equals(this.underlying, optionsMMPReset.underlying) &&
                Objects.equals(this.window, optionsMMPReset.window) &&
                Objects.equals(this.frozenPeriod, optionsMMPReset.frozenPeriod) &&
                Objects.equals(this.qtyLimit, optionsMMPReset.qtyLimit) &&
                Objects.equals(this.deltaLimit, optionsMMPReset.deltaLimit) &&
                Objects.equals(this.triggerTimeMs, optionsMMPReset.triggerTimeMs) &&
                Objects.equals(this.frozenUntilMs, optionsMMPReset.frozenUntilMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(underlying, window, frozenPeriod, qtyLimit, deltaLimit, triggerTimeMs, frozenUntilMs);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptionsMMPReset {\n");
        sb.append("      underlying: ").append(toIndentedString(underlying)).append("\n");
        sb.append("      window: ").append(toIndentedString(window)).append("\n");
        sb.append("      frozenPeriod: ").append(toIndentedString(frozenPeriod)).append("\n");
        sb.append("      qtyLimit: ").append(toIndentedString(qtyLimit)).append("\n");
        sb.append("      deltaLimit: ").append(toIndentedString(deltaLimit)).append("\n");
        sb.append("      triggerTimeMs: ").append(toIndentedString(triggerTimeMs)).append("\n");
        sb.append("      frozenUntilMs: ").append(toIndentedString(frozenUntilMs)).append("\n");
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

