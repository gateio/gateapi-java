/*
 * Gate API v4
 * Welcome to Gate.io API  APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * The version of the OpenAPI document: 4.86.0
 * Contact: support@mail.gate.io
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
import io.gate.gateapi.models.CrossMarginBalance1;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SubCrossMarginAccount
 */

public class SubCrossMarginAccount {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private Map<String, CrossMarginBalance1> balances = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private String total;

  public static final String SERIALIZED_NAME_BORROWED = "borrowed";
  @SerializedName(SERIALIZED_NAME_BORROWED)
  private String borrowed;

  public static final String SERIALIZED_NAME_BORROWED_NET = "borrowed_net";
  @SerializedName(SERIALIZED_NAME_BORROWED_NET)
  private String borrowedNet;

  public static final String SERIALIZED_NAME_NET = "net";
  @SerializedName(SERIALIZED_NAME_NET)
  private String net;

  public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
  @SerializedName(SERIALIZED_NAME_LEVERAGE)
  private String leverage;

  public static final String SERIALIZED_NAME_INTEREST = "interest";
  @SerializedName(SERIALIZED_NAME_INTEREST)
  private String interest;

  public static final String SERIALIZED_NAME_RISK = "risk";
  @SerializedName(SERIALIZED_NAME_RISK)
  private String risk;

  public static final String SERIALIZED_NAME_TOTAL_INITIAL_MARGIN = "total_initial_margin";
  @SerializedName(SERIALIZED_NAME_TOTAL_INITIAL_MARGIN)
  private String totalInitialMargin;

  public static final String SERIALIZED_NAME_TOTAL_MARGIN_BALANCE = "total_margin_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_MARGIN_BALANCE)
  private String totalMarginBalance;

  public static final String SERIALIZED_NAME_TOTAL_MAINTENANCE_MARGIN = "total_maintenance_margin";
  @SerializedName(SERIALIZED_NAME_TOTAL_MAINTENANCE_MARGIN)
  private String totalMaintenanceMargin;

  public static final String SERIALIZED_NAME_TOTAL_INITIAL_MARGIN_RATE = "total_initial_margin_rate";
  @SerializedName(SERIALIZED_NAME_TOTAL_INITIAL_MARGIN_RATE)
  private String totalInitialMarginRate;

  public static final String SERIALIZED_NAME_TOTAL_MAINTENANCE_MARGIN_RATE = "total_maintenance_margin_rate";
  @SerializedName(SERIALIZED_NAME_TOTAL_MAINTENANCE_MARGIN_RATE)
  private String totalMaintenanceMarginRate;

  public static final String SERIALIZED_NAME_TOTAL_AVAILABLE_MARGIN = "total_available_margin";
  @SerializedName(SERIALIZED_NAME_TOTAL_AVAILABLE_MARGIN)
  private String totalAvailableMargin;


  public SubCrossMarginAccount userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * User ID of the cross margin account. 0 means that the subaccount has not yet opened a cross margin account
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User ID of the cross margin account. 0 means that the subaccount has not yet opened a cross margin account")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public SubCrossMarginAccount locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Whether account is locked
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether account is locked")

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public SubCrossMarginAccount balances(Map<String, CrossMarginBalance1> balances) {
    
    this.balances = balances;
    return this;
  }

  public SubCrossMarginAccount putBalancesItem(String key, CrossMarginBalance1 balancesItem) {
    if (this.balances == null) {
      this.balances = new HashMap<>();
    }
    this.balances.put(key, balancesItem);
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, CrossMarginBalance1> getBalances() {
    return balances;
  }


  public void setBalances(Map<String, CrossMarginBalance1> balances) {
    this.balances = balances;
  }


  public SubCrossMarginAccount total(String total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total account value in USDT, i.e., the sum of all currencies&#39; &#x60;(available+freeze)*price*discount&#x60;
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total account value in USDT, i.e., the sum of all currencies' `(available+freeze)*price*discount`")

  public String getTotal() {
    return total;
  }


  public void setTotal(String total) {
    this.total = total;
  }


  public SubCrossMarginAccount borrowed(String borrowed) {
    
    this.borrowed = borrowed;
    return this;
  }

   /**
   * Total borrowed value in USDT, i.e., the sum of all currencies&#39; &#x60;borrowed*price*discount&#x60;
   * @return borrowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total borrowed value in USDT, i.e., the sum of all currencies' `borrowed*price*discount`")

  public String getBorrowed() {
    return borrowed;
  }


  public void setBorrowed(String borrowed) {
    this.borrowed = borrowed;
  }


  public SubCrossMarginAccount borrowedNet(String borrowedNet) {
    
    this.borrowedNet = borrowedNet;
    return this;
  }

   /**
   * Total borrowed value in USDT * borrowed factor
   * @return borrowedNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total borrowed value in USDT * borrowed factor")

  public String getBorrowedNet() {
    return borrowedNet;
  }


  public void setBorrowedNet(String borrowedNet) {
    this.borrowedNet = borrowedNet;
  }


  public SubCrossMarginAccount net(String net) {
    
    this.net = net;
    return this;
  }

   /**
   * Total net assets in USDT
   * @return net
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total net assets in USDT")

  public String getNet() {
    return net;
  }


  public void setNet(String net) {
    this.net = net;
  }


  public SubCrossMarginAccount leverage(String leverage) {
    
    this.leverage = leverage;
    return this;
  }

   /**
   * Position leverage
   * @return leverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Position leverage")

  public String getLeverage() {
    return leverage;
  }


  public void setLeverage(String leverage) {
    this.leverage = leverage;
  }


  public SubCrossMarginAccount interest(String interest) {
    
    this.interest = interest;
    return this;
  }

   /**
   * Total unpaid interests in USDT, i.e., the sum of all currencies&#39; &#x60;interest*price*discount&#x60;
   * @return interest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total unpaid interests in USDT, i.e., the sum of all currencies' `interest*price*discount`")

  public String getInterest() {
    return interest;
  }


  public void setInterest(String interest) {
    this.interest = interest;
  }


  public SubCrossMarginAccount risk(String risk) {
    
    this.risk = risk;
    return this;
  }

   /**
   * Risk rate. When it belows 110%, liquidation will be triggered. Calculation formula: &#x60;total / (borrowed+interest)&#x60;
   * @return risk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Risk rate. When it belows 110%, liquidation will be triggered. Calculation formula: `total / (borrowed+interest)`")

  public String getRisk() {
    return risk;
  }


  public void setRisk(String risk) {
    this.risk = risk;
  }


  public SubCrossMarginAccount totalInitialMargin(String totalInitialMargin) {
    
    this.totalInitialMargin = totalInitialMargin;
    return this;
  }

   /**
   * Total initial margin
   * @return totalInitialMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total initial margin")

  public String getTotalInitialMargin() {
    return totalInitialMargin;
  }


  public void setTotalInitialMargin(String totalInitialMargin) {
    this.totalInitialMargin = totalInitialMargin;
  }


  public SubCrossMarginAccount totalMarginBalance(String totalMarginBalance) {
    
    this.totalMarginBalance = totalMarginBalance;
    return this;
  }

   /**
   * Total margin balance
   * @return totalMarginBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total margin balance")

  public String getTotalMarginBalance() {
    return totalMarginBalance;
  }


  public void setTotalMarginBalance(String totalMarginBalance) {
    this.totalMarginBalance = totalMarginBalance;
  }


  public SubCrossMarginAccount totalMaintenanceMargin(String totalMaintenanceMargin) {
    
    this.totalMaintenanceMargin = totalMaintenanceMargin;
    return this;
  }

   /**
   * Total maintenance margin
   * @return totalMaintenanceMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total maintenance margin")

  public String getTotalMaintenanceMargin() {
    return totalMaintenanceMargin;
  }


  public void setTotalMaintenanceMargin(String totalMaintenanceMargin) {
    this.totalMaintenanceMargin = totalMaintenanceMargin;
  }


  public SubCrossMarginAccount totalInitialMarginRate(String totalInitialMarginRate) {
    
    this.totalInitialMarginRate = totalInitialMarginRate;
    return this;
  }

   /**
   * Total initial margin rate
   * @return totalInitialMarginRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total initial margin rate")

  public String getTotalInitialMarginRate() {
    return totalInitialMarginRate;
  }


  public void setTotalInitialMarginRate(String totalInitialMarginRate) {
    this.totalInitialMarginRate = totalInitialMarginRate;
  }


  public SubCrossMarginAccount totalMaintenanceMarginRate(String totalMaintenanceMarginRate) {
    
    this.totalMaintenanceMarginRate = totalMaintenanceMarginRate;
    return this;
  }

   /**
   * Total maintenance margin rate
   * @return totalMaintenanceMarginRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total maintenance margin rate")

  public String getTotalMaintenanceMarginRate() {
    return totalMaintenanceMarginRate;
  }


  public void setTotalMaintenanceMarginRate(String totalMaintenanceMarginRate) {
    this.totalMaintenanceMarginRate = totalMaintenanceMarginRate;
  }


  public SubCrossMarginAccount totalAvailableMargin(String totalAvailableMargin) {
    
    this.totalAvailableMargin = totalAvailableMargin;
    return this;
  }

   /**
   * Total available margin
   * @return totalAvailableMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total available margin")

  public String getTotalAvailableMargin() {
    return totalAvailableMargin;
  }


  public void setTotalAvailableMargin(String totalAvailableMargin) {
    this.totalAvailableMargin = totalAvailableMargin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubCrossMarginAccount subCrossMarginAccount = (SubCrossMarginAccount) o;
    return Objects.equals(this.userId, subCrossMarginAccount.userId) &&
        Objects.equals(this.locked, subCrossMarginAccount.locked) &&
        Objects.equals(this.balances, subCrossMarginAccount.balances) &&
        Objects.equals(this.total, subCrossMarginAccount.total) &&
        Objects.equals(this.borrowed, subCrossMarginAccount.borrowed) &&
        Objects.equals(this.borrowedNet, subCrossMarginAccount.borrowedNet) &&
        Objects.equals(this.net, subCrossMarginAccount.net) &&
        Objects.equals(this.leverage, subCrossMarginAccount.leverage) &&
        Objects.equals(this.interest, subCrossMarginAccount.interest) &&
        Objects.equals(this.risk, subCrossMarginAccount.risk) &&
        Objects.equals(this.totalInitialMargin, subCrossMarginAccount.totalInitialMargin) &&
        Objects.equals(this.totalMarginBalance, subCrossMarginAccount.totalMarginBalance) &&
        Objects.equals(this.totalMaintenanceMargin, subCrossMarginAccount.totalMaintenanceMargin) &&
        Objects.equals(this.totalInitialMarginRate, subCrossMarginAccount.totalInitialMarginRate) &&
        Objects.equals(this.totalMaintenanceMarginRate, subCrossMarginAccount.totalMaintenanceMarginRate) &&
        Objects.equals(this.totalAvailableMargin, subCrossMarginAccount.totalAvailableMargin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, locked, balances, total, borrowed, borrowedNet, net, leverage, interest, risk, totalInitialMargin, totalMarginBalance, totalMaintenanceMargin, totalInitialMarginRate, totalMaintenanceMarginRate, totalAvailableMargin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubCrossMarginAccount {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    borrowed: ").append(toIndentedString(borrowed)).append("\n");
    sb.append("    borrowedNet: ").append(toIndentedString(borrowedNet)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    totalInitialMargin: ").append(toIndentedString(totalInitialMargin)).append("\n");
    sb.append("    totalMarginBalance: ").append(toIndentedString(totalMarginBalance)).append("\n");
    sb.append("    totalMaintenanceMargin: ").append(toIndentedString(totalMaintenanceMargin)).append("\n");
    sb.append("    totalInitialMarginRate: ").append(toIndentedString(totalInitialMarginRate)).append("\n");
    sb.append("    totalMaintenanceMarginRate: ").append(toIndentedString(totalMaintenanceMarginRate)).append("\n");
    sb.append("    totalAvailableMargin: ").append(toIndentedString(totalAvailableMargin)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}

