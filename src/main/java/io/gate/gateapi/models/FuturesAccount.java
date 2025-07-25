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
import io.gate.gateapi.models.FuturesAccountHistory;
import java.io.IOException;

/**
 * FuturesAccount
 */
public class FuturesAccount {
    public static final String SERIALIZED_NAME_TOTAL = "total";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private String total;

    public static final String SERIALIZED_NAME_UNREALISED_PNL = "unrealised_pnl";
    @SerializedName(SERIALIZED_NAME_UNREALISED_PNL)
    private String unrealisedPnl;

    public static final String SERIALIZED_NAME_POSITION_MARGIN = "position_margin";
    @SerializedName(SERIALIZED_NAME_POSITION_MARGIN)
    private String positionMargin;

    public static final String SERIALIZED_NAME_ORDER_MARGIN = "order_margin";
    @SerializedName(SERIALIZED_NAME_ORDER_MARGIN)
    private String orderMargin;

    public static final String SERIALIZED_NAME_AVAILABLE = "available";
    @SerializedName(SERIALIZED_NAME_AVAILABLE)
    private String available;

    public static final String SERIALIZED_NAME_POINT = "point";
    @SerializedName(SERIALIZED_NAME_POINT)
    private String point;

    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_IN_DUAL_MODE = "in_dual_mode";
    @SerializedName(SERIALIZED_NAME_IN_DUAL_MODE)
    private Boolean inDualMode;

    public static final String SERIALIZED_NAME_ENABLE_CREDIT = "enable_credit";
    @SerializedName(SERIALIZED_NAME_ENABLE_CREDIT)
    private Boolean enableCredit;

    public static final String SERIALIZED_NAME_POSITION_INITIAL_MARGIN = "position_initial_margin";
    @SerializedName(SERIALIZED_NAME_POSITION_INITIAL_MARGIN)
    private String positionInitialMargin;

    public static final String SERIALIZED_NAME_MAINTENANCE_MARGIN = "maintenance_margin";
    @SerializedName(SERIALIZED_NAME_MAINTENANCE_MARGIN)
    private String maintenanceMargin;

    public static final String SERIALIZED_NAME_BONUS = "bonus";
    @SerializedName(SERIALIZED_NAME_BONUS)
    private String bonus;

    public static final String SERIALIZED_NAME_ENABLE_EVOLVED_CLASSIC = "enable_evolved_classic";
    @SerializedName(SERIALIZED_NAME_ENABLE_EVOLVED_CLASSIC)
    private Boolean enableEvolvedClassic;

    public static final String SERIALIZED_NAME_CROSS_ORDER_MARGIN = "cross_order_margin";
    @SerializedName(SERIALIZED_NAME_CROSS_ORDER_MARGIN)
    private String crossOrderMargin;

    public static final String SERIALIZED_NAME_CROSS_INITIAL_MARGIN = "cross_initial_margin";
    @SerializedName(SERIALIZED_NAME_CROSS_INITIAL_MARGIN)
    private String crossInitialMargin;

    public static final String SERIALIZED_NAME_CROSS_MAINTENANCE_MARGIN = "cross_maintenance_margin";
    @SerializedName(SERIALIZED_NAME_CROSS_MAINTENANCE_MARGIN)
    private String crossMaintenanceMargin;

    public static final String SERIALIZED_NAME_CROSS_UNREALISED_PNL = "cross_unrealised_pnl";
    @SerializedName(SERIALIZED_NAME_CROSS_UNREALISED_PNL)
    private String crossUnrealisedPnl;

    public static final String SERIALIZED_NAME_CROSS_AVAILABLE = "cross_available";
    @SerializedName(SERIALIZED_NAME_CROSS_AVAILABLE)
    private String crossAvailable;

    public static final String SERIALIZED_NAME_CROSS_MARGIN_BALANCE = "cross_margin_balance";
    @SerializedName(SERIALIZED_NAME_CROSS_MARGIN_BALANCE)
    private String crossMarginBalance;

    public static final String SERIALIZED_NAME_CROSS_MMR = "cross_mmr";
    @SerializedName(SERIALIZED_NAME_CROSS_MMR)
    private String crossMmr;

    public static final String SERIALIZED_NAME_CROSS_IMR = "cross_imr";
    @SerializedName(SERIALIZED_NAME_CROSS_IMR)
    private String crossImr;

    public static final String SERIALIZED_NAME_ISOLATED_POSITION_MARGIN = "isolated_position_margin";
    @SerializedName(SERIALIZED_NAME_ISOLATED_POSITION_MARGIN)
    private String isolatedPositionMargin;

    public static final String SERIALIZED_NAME_ENABLE_NEW_DUAL_MODE = "enable_new_dual_mode";
    @SerializedName(SERIALIZED_NAME_ENABLE_NEW_DUAL_MODE)
    private Boolean enableNewDualMode;

    public static final String SERIALIZED_NAME_MARGIN_MODE = "margin_mode";
    @SerializedName(SERIALIZED_NAME_MARGIN_MODE)
    private Integer marginMode;

    public static final String SERIALIZED_NAME_ENABLE_TIERED_MM = "enable_tiered_mm";
    @SerializedName(SERIALIZED_NAME_ENABLE_TIERED_MM)
    private Boolean enableTieredMm;

    public static final String SERIALIZED_NAME_HISTORY = "history";
    @SerializedName(SERIALIZED_NAME_HISTORY)
    private FuturesAccountHistory history;


    public FuturesAccount total(String total) {
        
        this.total = total;
        return this;
    }

     /**
     * total is the balance after the user&#39;s accumulated deposit, withdraw, profit and loss (including realized profit and loss, fund, fee and referral rebate), excluding unrealized profit and loss.  total &#x3D; SUM(history_dnw, history_pnl, history_fee, history_refr, history_fund)
     * @return total
    **/
    @javax.annotation.Nullable
    public String getTotal() {
        return total;
    }


    public void setTotal(String total) {
        this.total = total;
    }

    public FuturesAccount unrealisedPnl(String unrealisedPnl) {
        
        this.unrealisedPnl = unrealisedPnl;
        return this;
    }

     /**
     * Unrealized PNL.
     * @return unrealisedPnl
    **/
    @javax.annotation.Nullable
    public String getUnrealisedPnl() {
        return unrealisedPnl;
    }


    public void setUnrealisedPnl(String unrealisedPnl) {
        this.unrealisedPnl = unrealisedPnl;
    }

    public FuturesAccount positionMargin(String positionMargin) {
        
        this.positionMargin = positionMargin;
        return this;
    }

     /**
     * Position margin.
     * @return positionMargin
    **/
    @javax.annotation.Nullable
    public String getPositionMargin() {
        return positionMargin;
    }


    public void setPositionMargin(String positionMargin) {
        this.positionMargin = positionMargin;
    }

    public FuturesAccount orderMargin(String orderMargin) {
        
        this.orderMargin = orderMargin;
        return this;
    }

     /**
     * Order margin of unfinished orders.
     * @return orderMargin
    **/
    @javax.annotation.Nullable
    public String getOrderMargin() {
        return orderMargin;
    }


    public void setOrderMargin(String orderMargin) {
        this.orderMargin = orderMargin;
    }

    public FuturesAccount available(String available) {
        
        this.available = available;
        return this;
    }

     /**
     * The available balance for transferring or trading(including bonus. Bonus can&#39;t be withdrawn. The transfer amount needs to deduct the bonus)
     * @return available
    **/
    @javax.annotation.Nullable
    public String getAvailable() {
        return available;
    }


    public void setAvailable(String available) {
        this.available = available;
    }

    public FuturesAccount point(String point) {
        
        this.point = point;
        return this;
    }

     /**
     * POINT amount.
     * @return point
    **/
    @javax.annotation.Nullable
    public String getPoint() {
        return point;
    }


    public void setPoint(String point) {
        this.point = point;
    }

    public FuturesAccount currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Settle currency.
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public FuturesAccount inDualMode(Boolean inDualMode) {
        
        this.inDualMode = inDualMode;
        return this;
    }

     /**
     * Whether dual mode is enabled.
     * @return inDualMode
    **/
    @javax.annotation.Nullable
    public Boolean getInDualMode() {
        return inDualMode;
    }


    public void setInDualMode(Boolean inDualMode) {
        this.inDualMode = inDualMode;
    }

    public FuturesAccount enableCredit(Boolean enableCredit) {
        
        this.enableCredit = enableCredit;
        return this;
    }

     /**
     * Whether portfolio margin account mode is enabled.
     * @return enableCredit
    **/
    @javax.annotation.Nullable
    public Boolean getEnableCredit() {
        return enableCredit;
    }


    public void setEnableCredit(Boolean enableCredit) {
        this.enableCredit = enableCredit;
    }

    public FuturesAccount positionInitialMargin(String positionInitialMargin) {
        
        this.positionInitialMargin = positionInitialMargin;
        return this;
    }

     /**
     * Initial margin position, applicable to the portfolio margin account model.
     * @return positionInitialMargin
    **/
    @javax.annotation.Nullable
    public String getPositionInitialMargin() {
        return positionInitialMargin;
    }


    public void setPositionInitialMargin(String positionInitialMargin) {
        this.positionInitialMargin = positionInitialMargin;
    }

    public FuturesAccount maintenanceMargin(String maintenanceMargin) {
        
        this.maintenanceMargin = maintenanceMargin;
        return this;
    }

     /**
     * The maintenance deposit occupied by the position is suitable for the new classic account margin model and unified account model
     * @return maintenanceMargin
    **/
    @javax.annotation.Nullable
    public String getMaintenanceMargin() {
        return maintenanceMargin;
    }


    public void setMaintenanceMargin(String maintenanceMargin) {
        this.maintenanceMargin = maintenanceMargin;
    }

    public FuturesAccount bonus(String bonus) {
        
        this.bonus = bonus;
        return this;
    }

     /**
     * Perpetual Contract Bonus.
     * @return bonus
    **/
    @javax.annotation.Nullable
    public String getBonus() {
        return bonus;
    }


    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public FuturesAccount enableEvolvedClassic(Boolean enableEvolvedClassic) {
        
        this.enableEvolvedClassic = enableEvolvedClassic;
        return this;
    }

     /**
     * Classic account margin mode, true-new mode, false-old mode.
     * @return enableEvolvedClassic
    **/
    @javax.annotation.Nullable
    public Boolean getEnableEvolvedClassic() {
        return enableEvolvedClassic;
    }


    public void setEnableEvolvedClassic(Boolean enableEvolvedClassic) {
        this.enableEvolvedClassic = enableEvolvedClassic;
    }

    public FuturesAccount crossOrderMargin(String crossOrderMargin) {
        
        this.crossOrderMargin = crossOrderMargin;
        return this;
    }

     /**
     * Full -warehouse hanging order deposit, suitable for the new classic account margin model
     * @return crossOrderMargin
    **/
    @javax.annotation.Nullable
    public String getCrossOrderMargin() {
        return crossOrderMargin;
    }


    public void setCrossOrderMargin(String crossOrderMargin) {
        this.crossOrderMargin = crossOrderMargin;
    }

    public FuturesAccount crossInitialMargin(String crossInitialMargin) {
        
        this.crossInitialMargin = crossInitialMargin;
        return this;
    }

     /**
     * The initial security deposit of the full warehouse is suitable for the new classic account margin model
     * @return crossInitialMargin
    **/
    @javax.annotation.Nullable
    public String getCrossInitialMargin() {
        return crossInitialMargin;
    }


    public void setCrossInitialMargin(String crossInitialMargin) {
        this.crossInitialMargin = crossInitialMargin;
    }

    public FuturesAccount crossMaintenanceMargin(String crossMaintenanceMargin) {
        
        this.crossMaintenanceMargin = crossMaintenanceMargin;
        return this;
    }

     /**
     * Maintain deposit in full warehouse, suitable for new classic account margin models
     * @return crossMaintenanceMargin
    **/
    @javax.annotation.Nullable
    public String getCrossMaintenanceMargin() {
        return crossMaintenanceMargin;
    }


    public void setCrossMaintenanceMargin(String crossMaintenanceMargin) {
        this.crossMaintenanceMargin = crossMaintenanceMargin;
    }

    public FuturesAccount crossUnrealisedPnl(String crossUnrealisedPnl) {
        
        this.crossUnrealisedPnl = crossUnrealisedPnl;
        return this;
    }

     /**
     * The full warehouse does not achieve profit and loss, suitable for the new classic account margin model
     * @return crossUnrealisedPnl
    **/
    @javax.annotation.Nullable
    public String getCrossUnrealisedPnl() {
        return crossUnrealisedPnl;
    }


    public void setCrossUnrealisedPnl(String crossUnrealisedPnl) {
        this.crossUnrealisedPnl = crossUnrealisedPnl;
    }

    public FuturesAccount crossAvailable(String crossAvailable) {
        
        this.crossAvailable = crossAvailable;
        return this;
    }

     /**
     * Full warehouse available amount, suitable for the new classic account margin model
     * @return crossAvailable
    **/
    @javax.annotation.Nullable
    public String getCrossAvailable() {
        return crossAvailable;
    }


    public void setCrossAvailable(String crossAvailable) {
        this.crossAvailable = crossAvailable;
    }

    public FuturesAccount crossMarginBalance(String crossMarginBalance) {
        
        this.crossMarginBalance = crossMarginBalance;
        return this;
    }

     /**
     * Full margin balance, suitable for the new classic account margin model.
     * @return crossMarginBalance
    **/
    @javax.annotation.Nullable
    public String getCrossMarginBalance() {
        return crossMarginBalance;
    }


    public void setCrossMarginBalance(String crossMarginBalance) {
        this.crossMarginBalance = crossMarginBalance;
    }

    public FuturesAccount crossMmr(String crossMmr) {
        
        this.crossMmr = crossMmr;
        return this;
    }

     /**
     * Maintain margin ratio for the full position, suitable for the new classic account margin model
     * @return crossMmr
    **/
    @javax.annotation.Nullable
    public String getCrossMmr() {
        return crossMmr;
    }


    public void setCrossMmr(String crossMmr) {
        this.crossMmr = crossMmr;
    }

    public FuturesAccount crossImr(String crossImr) {
        
        this.crossImr = crossImr;
        return this;
    }

     /**
     * The initial margin rate of the full position is suitable for the new classic account margin model
     * @return crossImr
    **/
    @javax.annotation.Nullable
    public String getCrossImr() {
        return crossImr;
    }


    public void setCrossImr(String crossImr) {
        this.crossImr = crossImr;
    }

    public FuturesAccount isolatedPositionMargin(String isolatedPositionMargin) {
        
        this.isolatedPositionMargin = isolatedPositionMargin;
        return this;
    }

     /**
     * Ware -position margin, suitable for the new classic account margin model.
     * @return isolatedPositionMargin
    **/
    @javax.annotation.Nullable
    public String getIsolatedPositionMargin() {
        return isolatedPositionMargin;
    }


    public void setIsolatedPositionMargin(String isolatedPositionMargin) {
        this.isolatedPositionMargin = isolatedPositionMargin;
    }

    public FuturesAccount enableNewDualMode(Boolean enableNewDualMode) {
        
        this.enableNewDualMode = enableNewDualMode;
        return this;
    }

     /**
     * Whether to open a new two-way position mode.
     * @return enableNewDualMode
    **/
    @javax.annotation.Nullable
    public Boolean getEnableNewDualMode() {
        return enableNewDualMode;
    }


    public void setEnableNewDualMode(Boolean enableNewDualMode) {
        this.enableNewDualMode = enableNewDualMode;
    }

    public FuturesAccount marginMode(Integer marginMode) {
        
        this.marginMode = marginMode;
        return this;
    }

     /**
     * Margin mode, 0-classic margin mode, 1-cross-currency margin mode, 2-combined margin mode
     * @return marginMode
    **/
    @javax.annotation.Nullable
    public Integer getMarginMode() {
        return marginMode;
    }


    public void setMarginMode(Integer marginMode) {
        this.marginMode = marginMode;
    }

    public FuturesAccount enableTieredMm(Boolean enableTieredMm) {
        
        this.enableTieredMm = enableTieredMm;
        return this;
    }

     /**
     * Whether to enable tiered maintenance margin calculation.
     * @return enableTieredMm
    **/
    @javax.annotation.Nullable
    public Boolean getEnableTieredMm() {
        return enableTieredMm;
    }


    public void setEnableTieredMm(Boolean enableTieredMm) {
        this.enableTieredMm = enableTieredMm;
    }

    public FuturesAccount history(FuturesAccountHistory history) {
        
        this.history = history;
        return this;
    }

     /**
     * Get history
     * @return history
    **/
    @javax.annotation.Nullable
    public FuturesAccountHistory getHistory() {
        return history;
    }


    public void setHistory(FuturesAccountHistory history) {
        this.history = history;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuturesAccount futuresAccount = (FuturesAccount) o;
        return Objects.equals(this.total, futuresAccount.total) &&
                Objects.equals(this.unrealisedPnl, futuresAccount.unrealisedPnl) &&
                Objects.equals(this.positionMargin, futuresAccount.positionMargin) &&
                Objects.equals(this.orderMargin, futuresAccount.orderMargin) &&
                Objects.equals(this.available, futuresAccount.available) &&
                Objects.equals(this.point, futuresAccount.point) &&
                Objects.equals(this.currency, futuresAccount.currency) &&
                Objects.equals(this.inDualMode, futuresAccount.inDualMode) &&
                Objects.equals(this.enableCredit, futuresAccount.enableCredit) &&
                Objects.equals(this.positionInitialMargin, futuresAccount.positionInitialMargin) &&
                Objects.equals(this.maintenanceMargin, futuresAccount.maintenanceMargin) &&
                Objects.equals(this.bonus, futuresAccount.bonus) &&
                Objects.equals(this.enableEvolvedClassic, futuresAccount.enableEvolvedClassic) &&
                Objects.equals(this.crossOrderMargin, futuresAccount.crossOrderMargin) &&
                Objects.equals(this.crossInitialMargin, futuresAccount.crossInitialMargin) &&
                Objects.equals(this.crossMaintenanceMargin, futuresAccount.crossMaintenanceMargin) &&
                Objects.equals(this.crossUnrealisedPnl, futuresAccount.crossUnrealisedPnl) &&
                Objects.equals(this.crossAvailable, futuresAccount.crossAvailable) &&
                Objects.equals(this.crossMarginBalance, futuresAccount.crossMarginBalance) &&
                Objects.equals(this.crossMmr, futuresAccount.crossMmr) &&
                Objects.equals(this.crossImr, futuresAccount.crossImr) &&
                Objects.equals(this.isolatedPositionMargin, futuresAccount.isolatedPositionMargin) &&
                Objects.equals(this.enableNewDualMode, futuresAccount.enableNewDualMode) &&
                Objects.equals(this.marginMode, futuresAccount.marginMode) &&
                Objects.equals(this.enableTieredMm, futuresAccount.enableTieredMm) &&
                Objects.equals(this.history, futuresAccount.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, unrealisedPnl, positionMargin, orderMargin, available, point, currency, inDualMode, enableCredit, positionInitialMargin, maintenanceMargin, bonus, enableEvolvedClassic, crossOrderMargin, crossInitialMargin, crossMaintenanceMargin, crossUnrealisedPnl, crossAvailable, crossMarginBalance, crossMmr, crossImr, isolatedPositionMargin, enableNewDualMode, marginMode, enableTieredMm, history);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuturesAccount {\n");
        sb.append("      total: ").append(toIndentedString(total)).append("\n");
        sb.append("      unrealisedPnl: ").append(toIndentedString(unrealisedPnl)).append("\n");
        sb.append("      positionMargin: ").append(toIndentedString(positionMargin)).append("\n");
        sb.append("      orderMargin: ").append(toIndentedString(orderMargin)).append("\n");
        sb.append("      available: ").append(toIndentedString(available)).append("\n");
        sb.append("      point: ").append(toIndentedString(point)).append("\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      inDualMode: ").append(toIndentedString(inDualMode)).append("\n");
        sb.append("      enableCredit: ").append(toIndentedString(enableCredit)).append("\n");
        sb.append("      positionInitialMargin: ").append(toIndentedString(positionInitialMargin)).append("\n");
        sb.append("      maintenanceMargin: ").append(toIndentedString(maintenanceMargin)).append("\n");
        sb.append("      bonus: ").append(toIndentedString(bonus)).append("\n");
        sb.append("      enableEvolvedClassic: ").append(toIndentedString(enableEvolvedClassic)).append("\n");
        sb.append("      crossOrderMargin: ").append(toIndentedString(crossOrderMargin)).append("\n");
        sb.append("      crossInitialMargin: ").append(toIndentedString(crossInitialMargin)).append("\n");
        sb.append("      crossMaintenanceMargin: ").append(toIndentedString(crossMaintenanceMargin)).append("\n");
        sb.append("      crossUnrealisedPnl: ").append(toIndentedString(crossUnrealisedPnl)).append("\n");
        sb.append("      crossAvailable: ").append(toIndentedString(crossAvailable)).append("\n");
        sb.append("      crossMarginBalance: ").append(toIndentedString(crossMarginBalance)).append("\n");
        sb.append("      crossMmr: ").append(toIndentedString(crossMmr)).append("\n");
        sb.append("      crossImr: ").append(toIndentedString(crossImr)).append("\n");
        sb.append("      isolatedPositionMargin: ").append(toIndentedString(isolatedPositionMargin)).append("\n");
        sb.append("      enableNewDualMode: ").append(toIndentedString(enableNewDualMode)).append("\n");
        sb.append("      marginMode: ").append(toIndentedString(marginMode)).append("\n");
        sb.append("      enableTieredMm: ").append(toIndentedString(enableTieredMm)).append("\n");
        sb.append("      history: ").append(toIndentedString(history)).append("\n");
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

