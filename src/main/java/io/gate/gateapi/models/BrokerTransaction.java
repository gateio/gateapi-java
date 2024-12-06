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
import io.gate.gateapi.models.BrokerTransaction1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BrokerTransaction
 */

public class BrokerTransaction {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<BrokerTransaction1> list = null;


  public BrokerTransaction total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total")

  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }


  public BrokerTransaction list(List<BrokerTransaction1> list) {
    
    this.list = list;
    return this;
  }

  public BrokerTransaction addListItem(BrokerTransaction1 listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * List of transaction history
   * @return list
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of transaction history")

  public List<BrokerTransaction1> getList() {
    return list;
  }


  public void setList(List<BrokerTransaction1> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrokerTransaction brokerTransaction = (BrokerTransaction) o;
    return Objects.equals(this.total, brokerTransaction.total) &&
        Objects.equals(this.list, brokerTransaction.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokerTransaction {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

