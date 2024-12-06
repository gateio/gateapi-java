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
 * Option orders
 */
@ApiModel(description = "Option orders")

public class MockOptionsOrder {
  public static final String SERIALIZED_NAME_OPTIONS_NAME = "options_name";
  @SerializedName(SERIALIZED_NAME_OPTIONS_NAME)
  private String optionsName;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private String left;


  public MockOptionsOrder optionsName(String optionsName) {
    
    this.optionsName = optionsName;
    return this;
  }

   /**
   * Option name, currently only supports options for BTC and ETH with USDT.
   * @return optionsName
  **/
  @ApiModelProperty(required = true, value = "Option name, currently only supports options for BTC and ETH with USDT.")

  public String getOptionsName() {
    return optionsName;
  }


  public void setOptionsName(String optionsName) {
    this.optionsName = optionsName;
  }


  public MockOptionsOrder size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Initial order quantity, not involved in actual calculation
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Initial order quantity, not involved in actual calculation")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public MockOptionsOrder left(String left) {
    
    this.left = left;
    return this;
  }

   /**
   * Unfilled contract quantity, involved in actual calculation
   * @return left
  **/
  @ApiModelProperty(required = true, value = "Unfilled contract quantity, involved in actual calculation")

  public String getLeft() {
    return left;
  }


  public void setLeft(String left) {
    this.left = left;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MockOptionsOrder mockOptionsOrder = (MockOptionsOrder) o;
    return Objects.equals(this.optionsName, mockOptionsOrder.optionsName) &&
        Objects.equals(this.size, mockOptionsOrder.size) &&
        Objects.equals(this.left, mockOptionsOrder.left);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionsName, size, left);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MockOptionsOrder {\n");
    sb.append("    optionsName: ").append(toIndentedString(optionsName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
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

