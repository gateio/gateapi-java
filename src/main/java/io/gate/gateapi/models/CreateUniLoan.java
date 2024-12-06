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
 * Borrow or repay
 */
@ApiModel(description = "Borrow or repay")

public class CreateUniLoan {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  /**
   * type: borrow - borrow, repay - repay
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BORROW("borrow"),
    
    REPAY("repay");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_REPAID_ALL = "repaid_all";
  @SerializedName(SERIALIZED_NAME_REPAID_ALL)
  private Boolean repaidAll;

  public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
  private String currencyPair;


  public CreateUniLoan currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Currency")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CreateUniLoan type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * type: borrow - borrow, repay - repay
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type: borrow - borrow, repay - repay")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateUniLoan amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of lending or repaying
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of lending or repaying")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public CreateUniLoan repaidAll(Boolean repaidAll) {
    
    this.repaidAll = repaidAll;
    return this;
  }

   /**
   * Full repayment.  Repay operation only.  If the value is &#x60;true&#x60;, the amount will be ignored and the loan will be repaid in full.
   * @return repaidAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Full repayment.  Repay operation only.  If the value is `true`, the amount will be ignored and the loan will be repaid in full.")

  public Boolean getRepaidAll() {
    return repaidAll;
  }


  public void setRepaidAll(Boolean repaidAll) {
    this.repaidAll = repaidAll;
  }


  public CreateUniLoan currencyPair(String currencyPair) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUniLoan createUniLoan = (CreateUniLoan) o;
    return Objects.equals(this.currency, createUniLoan.currency) &&
        Objects.equals(this.type, createUniLoan.type) &&
        Objects.equals(this.amount, createUniLoan.amount) &&
        Objects.equals(this.repaidAll, createUniLoan.repaidAll) &&
        Objects.equals(this.currencyPair, createUniLoan.currencyPair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, type, amount, repaidAll, currencyPair);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUniLoan {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    repaidAll: ").append(toIndentedString(repaidAll)).append("\n");
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
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

