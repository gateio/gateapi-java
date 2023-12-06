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
 * ApiV4KeyPerm
 */
public class ApiV4KeyPerm {
    /**
     * Permission name (all permissions will be removed if no value is passed)  - wallet: wallet - spot: spot/margin - futures: perpetual contract - delivery: delivery - earn: earn - options: options\\m- account: Account - unified: unified - loan: Loan
     */
    @JsonAdapter(NameEnum.Adapter.class)
    public enum NameEnum {
        WALLET("wallet"),
        
        SPOT("spot"),
        
        FUTURES("futures"),
        
        DELIVERY("delivery"),
        
        EARN("earn"),
        
        OPTIONS("options"),
        
        ACCOUNT("account"),
        
        UNIFIED("unified"),
        
        LOAN("loan");

        private String value;

        NameEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static NameEnum fromValue(String value) {
            for (NameEnum b : NameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<NameEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public NameEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return NameEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private NameEnum name;

    public static final String SERIALIZED_NAME_READ_ONLY = "read_only";
    @SerializedName(SERIALIZED_NAME_READ_ONLY)
    private Boolean readOnly;


    public ApiV4KeyPerm name(NameEnum name) {
        
        this.name = name;
        return this;
    }

     /**
     * Permission name (all permissions will be removed if no value is passed)  - wallet: wallet - spot: spot/margin - futures: perpetual contract - delivery: delivery - earn: earn - options: options\\m- account: Account - unified: unified - loan: Loan
     * @return name
    **/
    @javax.annotation.Nullable
    public NameEnum getName() {
        return name;
    }


    public void setName(NameEnum name) {
        this.name = name;
    }

    public ApiV4KeyPerm readOnly(Boolean readOnly) {
        
        this.readOnly = readOnly;
        return this;
    }

     /**
     * read only
     * @return readOnly
    **/
    @javax.annotation.Nullable
    public Boolean getReadOnly() {
        return readOnly;
    }


    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiV4KeyPerm apiV4KeyPerm = (ApiV4KeyPerm) o;
        return Objects.equals(this.name, apiV4KeyPerm.name) &&
                Objects.equals(this.readOnly, apiV4KeyPerm.readOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, readOnly);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiV4KeyPerm {\n");
        sb.append("      name: ").append(toIndentedString(name)).append("\n");
        sb.append("      readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

