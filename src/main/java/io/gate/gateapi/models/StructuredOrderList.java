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
import java.io.IOException;

/**
 * Structured order
 */
@ApiModel(description = "Structured order")

public class StructuredOrderList {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_LOCK_COIN = "lock_coin";
  @SerializedName(SERIALIZED_NAME_LOCK_COIN)
  private String lockCoin;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_INCOME = "income";
  @SerializedName(SERIALIZED_NAME_INCOME)
  private String income;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Integer createTime;


  public StructuredOrderList id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Order ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public StructuredOrderList pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * Plan ID
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plan ID")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public StructuredOrderList lockCoin(String lockCoin) {
    
    this.lockCoin = lockCoin;
    return this;
  }

   /**
   * Locked coin
   * @return lockCoin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Locked coin")

  public String getLockCoin() {
    return lockCoin;
  }


  public void setLockCoin(String lockCoin) {
    this.lockCoin = lockCoin;
  }


  public StructuredOrderList amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Locked amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Locked amount")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public StructuredOrderList status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status:   SUCCESS - SUCCESS  FAILED - FAILED DONE - DONE
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status:   SUCCESS - SUCCESS  FAILED - FAILED DONE - DONE")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public StructuredOrderList income(String income) {
    
    this.income = income;
    return this;
  }

   /**
   * Income
   * @return income
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Income")

  public String getIncome() {
    return income;
  }


  public void setIncome(String income) {
    this.income = income;
  }


  public StructuredOrderList createTime(Integer createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Created time
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Created time")

  public Integer getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredOrderList structuredOrderList = (StructuredOrderList) o;
    return Objects.equals(this.id, structuredOrderList.id) &&
        Objects.equals(this.pid, structuredOrderList.pid) &&
        Objects.equals(this.lockCoin, structuredOrderList.lockCoin) &&
        Objects.equals(this.amount, structuredOrderList.amount) &&
        Objects.equals(this.status, structuredOrderList.status) &&
        Objects.equals(this.income, structuredOrderList.income) &&
        Objects.equals(this.createTime, structuredOrderList.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pid, lockCoin, amount, status, income, createTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredOrderList {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    lockCoin: ").append(toIndentedString(lockCoin)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
