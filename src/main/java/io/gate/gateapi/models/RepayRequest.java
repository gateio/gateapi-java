/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * OpenAPI spec version: 4.5.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RepayRequest
 */

public class RepayRequest {
  public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
  private String currencyPair;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  /**
   * Repay mode. all - repay all; partial - repay only some portion
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    ALL("all"),
    
    PARTIAL("partial");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public RepayRequest currencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
    return this;
  }

   /**
   * Currency pair
   * @return currencyPair
  **/
  @ApiModelProperty(required = true, value = "Currency pair")
  public String getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }

  public RepayRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Loan currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Loan currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public RepayRequest mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Repay mode. all - repay all; partial - repay only some portion
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "Repay mode. all - repay all; partial - repay only some portion")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public RepayRequest amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Repay amount. Required in &#x60;partial&#x60; mode
   * @return amount
  **/
  @ApiModelProperty(value = "Repay amount. Required in `partial` mode")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepayRequest repayRequest = (RepayRequest) o;
    return Objects.equals(this.currencyPair, repayRequest.currencyPair) &&
        Objects.equals(this.currency, repayRequest.currency) &&
        Objects.equals(this.mode, repayRequest.mode) &&
        Objects.equals(this.amount, repayRequest.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyPair, currency, mode, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepayRequest {\n");
    
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

