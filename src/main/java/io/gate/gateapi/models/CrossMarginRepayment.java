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
 * CrossMarginRepayment
 */

public class CrossMarginRepayment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime;

  public static final String SERIALIZED_NAME_LOAN_ID = "loan_id";
  @SerializedName(SERIALIZED_NAME_LOAN_ID)
  private String loanId;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private String principal;

  public static final String SERIALIZED_NAME_INTEREST = "interest";
  @SerializedName(SERIALIZED_NAME_INTEREST)
  private String interest;

  public static final String SERIALIZED_NAME_REPAYMENT_TYPE = "repayment_type";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_TYPE)
  private String repaymentType;


  public CrossMarginRepayment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Loan record ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Loan record ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CrossMarginRepayment createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Repayment time
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Repayment time")

  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public CrossMarginRepayment loanId(String loanId) {
    
    this.loanId = loanId;
    return this;
  }

   /**
   * Loan record ID
   * @return loanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Loan record ID")

  public String getLoanId() {
    return loanId;
  }


  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }


  public CrossMarginRepayment currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency name
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency name")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CrossMarginRepayment principal(String principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Repaid principal
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Repaid principal")

  public String getPrincipal() {
    return principal;
  }


  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public CrossMarginRepayment interest(String interest) {
    
    this.interest = interest;
    return this;
  }

   /**
   * Repaid interest
   * @return interest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Repaid interest")

  public String getInterest() {
    return interest;
  }


  public void setInterest(String interest) {
    this.interest = interest;
  }


   /**
   * Repayment type: none - no repayment type, manual_repay - manual repayment, auto_repay - automatic repayment, cancel_auto_repay - automatic repayment after cancellation
   * @return repaymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Repayment type: none - no repayment type, manual_repay - manual repayment, auto_repay - automatic repayment, cancel_auto_repay - automatic repayment after cancellation")

  public String getRepaymentType() {
    return repaymentType;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossMarginRepayment crossMarginRepayment = (CrossMarginRepayment) o;
    return Objects.equals(this.id, crossMarginRepayment.id) &&
        Objects.equals(this.createTime, crossMarginRepayment.createTime) &&
        Objects.equals(this.loanId, crossMarginRepayment.loanId) &&
        Objects.equals(this.currency, crossMarginRepayment.currency) &&
        Objects.equals(this.principal, crossMarginRepayment.principal) &&
        Objects.equals(this.interest, crossMarginRepayment.interest) &&
        Objects.equals(this.repaymentType, crossMarginRepayment.repaymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createTime, loanId, currency, principal, interest, repaymentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossMarginRepayment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
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

