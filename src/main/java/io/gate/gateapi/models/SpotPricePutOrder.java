/*
 * Gate API v4
 * Welcome to Gate.io API  APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
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
 * SpotPricePutOrder
 */
public class SpotPricePutOrder {
    /**
     * Order type，default to &#x60;limit&#x60;  - limit : Limit Order - market : Market Order
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        LIMIT("limit"),
        
        MARKET("market");

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
    private TypeEnum type = TypeEnum.LIMIT;

    /**
     * Order side  - buy: buy side - sell: sell side
     */
    @JsonAdapter(SideEnum.Adapter.class)
    public enum SideEnum {
        BUY("buy"),
        
        SELL("sell");

        private String value;

        SideEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SideEnum fromValue(String value) {
            for (SideEnum b : SideEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<SideEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SideEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return SideEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_SIDE = "side";
    @SerializedName(SERIALIZED_NAME_SIDE)
    private SideEnum side;

    public static final String SERIALIZED_NAME_PRICE = "price";
    @SerializedName(SERIALIZED_NAME_PRICE)
    private String price;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private String amount;

    /**
     * Trading account type.  Portfolio margin account must set to &#x60;cross_margin&#x60;  - normal: spot trading - margin: margin trading - cross_margin: cross_margin trading 
     */
    @JsonAdapter(AccountEnum.Adapter.class)
    public enum AccountEnum {
        NORMAL("normal"),
        
        MARGIN("margin"),
        
        CROSS_MARGIN("cross_margin");

        private String value;

        AccountEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AccountEnum fromValue(String value) {
            for (AccountEnum b : AccountEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AccountEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AccountEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AccountEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return AccountEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ACCOUNT = "account";
    @SerializedName(SERIALIZED_NAME_ACCOUNT)
    private AccountEnum account = AccountEnum.NORMAL;

    /**
     * time_in_force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only 
     */
    @JsonAdapter(TimeInForceEnum.Adapter.class)
    public enum TimeInForceEnum {
        GTC("gtc"),
        
        IOC("ioc");

        private String value;

        TimeInForceEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TimeInForceEnum fromValue(String value) {
            for (TimeInForceEnum b : TimeInForceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TimeInForceEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TimeInForceEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TimeInForceEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return TimeInForceEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TIME_IN_FORCE = "time_in_force";
    @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
    private TimeInForceEnum timeInForce = TimeInForceEnum.GTC;

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;


    public SpotPricePutOrder type(TypeEnum type) {
        
        this.type = type;
        return this;
    }

     /**
     * Order type，default to &#x60;limit&#x60;  - limit : Limit Order - market : Market Order
     * @return type
    **/
    @javax.annotation.Nullable
    public TypeEnum getType() {
        return type;
    }


    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SpotPricePutOrder side(SideEnum side) {
        
        this.side = side;
        return this;
    }

     /**
     * Order side  - buy: buy side - sell: sell side
     * @return side
    **/
    public SideEnum getSide() {
        return side;
    }


    public void setSide(SideEnum side) {
        this.side = side;
    }

    public SpotPricePutOrder price(String price) {
        
        this.price = price;
        return this;
    }

     /**
     * Order price
     * @return price
    **/
    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public SpotPricePutOrder amount(String amount) {
        
        this.amount = amount;
        return this;
    }

     /**
     * When &#x60;type&#x60; is limit, it refers to base currency.  For instance, &#x60;BTC_USDT&#x60; means &#x60;BTC&#x60;  When &#x60;type&#x60; is &#x60;market&#x60;, it refers to different currency according to &#x60;side&#x60;  - &#x60;side&#x60; : &#x60;buy&#x60; means quote currency, &#x60;BTC_USDT&#x60; means &#x60;USDT&#x60; - &#x60;side&#x60; : &#x60;sell&#x60; means base currency，&#x60;BTC_USDT&#x60; means &#x60;BTC&#x60; 
     * @return amount
    **/
    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }

    public SpotPricePutOrder account(AccountEnum account) {
        
        this.account = account;
        return this;
    }

     /**
     * Trading account type.  Portfolio margin account must set to &#x60;cross_margin&#x60;  - normal: spot trading - margin: margin trading - cross_margin: cross_margin trading 
     * @return account
    **/
    public AccountEnum getAccount() {
        return account;
    }


    public void setAccount(AccountEnum account) {
        this.account = account;
    }

    public SpotPricePutOrder timeInForce(TimeInForceEnum timeInForce) {
        
        this.timeInForce = timeInForce;
        return this;
    }

     /**
     * time_in_force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only 
     * @return timeInForce
    **/
    @javax.annotation.Nullable
    public TimeInForceEnum getTimeInForce() {
        return timeInForce;
    }


    public void setTimeInForce(TimeInForceEnum timeInForce) {
        this.timeInForce = timeInForce;
    }

    public SpotPricePutOrder text(String text) {
        
        this.text = text;
        return this;
    }

     /**
     * The source of the order, including: - web: web - api: api - app: app
     * @return text
    **/
    @javax.annotation.Nullable
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
        SpotPricePutOrder spotPricePutOrder = (SpotPricePutOrder) o;
        return Objects.equals(this.type, spotPricePutOrder.type) &&
                Objects.equals(this.side, spotPricePutOrder.side) &&
                Objects.equals(this.price, spotPricePutOrder.price) &&
                Objects.equals(this.amount, spotPricePutOrder.amount) &&
                Objects.equals(this.account, spotPricePutOrder.account) &&
                Objects.equals(this.timeInForce, spotPricePutOrder.timeInForce) &&
                Objects.equals(this.text, spotPricePutOrder.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, side, price, amount, account, timeInForce, text);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpotPricePutOrder {\n");
        sb.append("      type: ").append(toIndentedString(type)).append("\n");
        sb.append("      side: ").append(toIndentedString(side)).append("\n");
        sb.append("      price: ").append(toIndentedString(price)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("      account: ").append(toIndentedString(account)).append("\n");
        sb.append("      timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
        sb.append("      text: ").append(toIndentedString(text)).append("\n");
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

