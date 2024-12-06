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
 * SpotPriceTrigger
 */

public class SpotPriceTrigger {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  /**
   * Price trigger condition  - &gt;&#x3D;: triggered when market price larger than or equal to &#x60;price&#x60; field - &lt;&#x3D;: triggered when market price less than or equal to &#x60;price&#x60; field 
   */
  @JsonAdapter(RuleEnum.Adapter.class)
  public enum RuleEnum {
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    LESS_THAN_OR_EQUAL_TO("<=");

    private String value;

    RuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RuleEnum fromValue(String value) {
      for (RuleEnum b : RuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private RuleEnum rule;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private Integer expiration;


  public SpotPriceTrigger price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Trigger price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "Trigger price")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public SpotPriceTrigger rule(RuleEnum rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * Price trigger condition  - &gt;&#x3D;: triggered when market price larger than or equal to &#x60;price&#x60; field - &lt;&#x3D;: triggered when market price less than or equal to &#x60;price&#x60; field 
   * @return rule
  **/
  @ApiModelProperty(required = true, value = "Price trigger condition  - >=: triggered when market price larger than or equal to `price` field - <=: triggered when market price less than or equal to `price` field ")

  public RuleEnum getRule() {
    return rule;
  }


  public void setRule(RuleEnum rule) {
    this.rule = rule;
  }


  public SpotPriceTrigger expiration(Integer expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * How long (in seconds) to wait for the condition to be triggered before cancelling the order.
   * @return expiration
  **/
  @ApiModelProperty(required = true, value = "How long (in seconds) to wait for the condition to be triggered before cancelling the order.")

  public Integer getExpiration() {
    return expiration;
  }


  public void setExpiration(Integer expiration) {
    this.expiration = expiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpotPriceTrigger spotPriceTrigger = (SpotPriceTrigger) o;
    return Objects.equals(this.price, spotPriceTrigger.price) &&
        Objects.equals(this.rule, spotPriceTrigger.rule) &&
        Objects.equals(this.expiration, spotPriceTrigger.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, rule, expiration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpotPriceTrigger {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

