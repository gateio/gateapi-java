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

public class UnifiedLoan {
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

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;


  public UnifiedLoan currency(String currency) {
    
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


  public UnifiedLoan type(TypeEnum type) {
    
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


  public UnifiedLoan amount(String amount) {
    
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


  public UnifiedLoan repaidAll(Boolean repaidAll) {
    
    this.repaidAll = repaidAll;
    return this;
  }

   /**
   * Full repayment is solely for repayment operations. When set to &#39;true,&#39; it overrides the &#39;amount,&#39; allowing for direct full repayment.
   * @return repaidAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Full repayment is solely for repayment operations. When set to 'true,' it overrides the 'amount,' allowing for direct full repayment.")

  public Boolean getRepaidAll() {
    return repaidAll;
  }


  public void setRepaidAll(Boolean repaidAll) {
    this.repaidAll = repaidAll;
  }


  public UnifiedLoan text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * User defined custom ID
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User defined custom ID")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnifiedLoan unifiedLoan = (UnifiedLoan) o;
    return Objects.equals(this.currency, unifiedLoan.currency) &&
        Objects.equals(this.type, unifiedLoan.type) &&
        Objects.equals(this.amount, unifiedLoan.amount) &&
        Objects.equals(this.repaidAll, unifiedLoan.repaidAll) &&
        Objects.equals(this.text, unifiedLoan.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, type, amount, repaidAll, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnifiedLoan {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    repaidAll: ").append(toIndentedString(repaidAll)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
