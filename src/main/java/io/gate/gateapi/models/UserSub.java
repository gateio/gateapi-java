/*
 * Gate API
 * Welcome to Gate API  APIv4 provides operations related to spot, margin, and contract trading, including public interfaces for querying market data and authenticated private interfaces for implementing API-based automated trading.
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
 * UserSub
 */
public class UserSub {
    public static final String SERIALIZED_NAME_UID = "uid";
    @SerializedName(SERIALIZED_NAME_UID)
    private Long uid;

    public static final String SERIALIZED_NAME_BELONG = "belong";
    @SerializedName(SERIALIZED_NAME_BELONG)
    private String belong;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private Long type;

    public static final String SERIALIZED_NAME_REF_UID = "ref_uid";
    @SerializedName(SERIALIZED_NAME_REF_UID)
    private Long refUid;


    public UserSub uid(Long uid) {
        
        this.uid = uid;
        return this;
    }

     /**
     * User ID.
     * @return uid
    **/
    @javax.annotation.Nullable
    public Long getUid() {
        return uid;
    }


    public void setUid(Long uid) {
        this.uid = uid;
    }

    public UserSub belong(String belong) {
        
        this.belong = belong;
        return this;
    }

     /**
     * The system to which the user belongs (partner referral). If empty, it means not belonging to any system.
     * @return belong
    **/
    @javax.annotation.Nullable
    public String getBelong() {
        return belong;
    }


    public void setBelong(String belong) {
        this.belong = belong;
    }

    public UserSub type(Long type) {
        
        this.type = type;
        return this;
    }

     /**
     * Type (0-not in the system 1-direct subordinate agent 2-indirect subordinate agent 3-direct customer 4-indirect direct customer 5-ordinary user)
     * @return type
    **/
    @javax.annotation.Nullable
    public Long getType() {
        return type;
    }


    public void setType(Long type) {
        this.type = type;
    }

    public UserSub refUid(Long refUid) {
        
        this.refUid = refUid;
        return this;
    }

     /**
     * Inviter user ID.
     * @return refUid
    **/
    @javax.annotation.Nullable
    public Long getRefUid() {
        return refUid;
    }


    public void setRefUid(Long refUid) {
        this.refUid = refUid;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserSub userSub = (UserSub) o;
        return Objects.equals(this.uid, userSub.uid) &&
                Objects.equals(this.belong, userSub.belong) &&
                Objects.equals(this.type, userSub.type) &&
                Objects.equals(this.refUid, userSub.refUid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, belong, type, refUid);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSub {\n");
        sb.append("      uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("      belong: ").append(toIndentedString(belong)).append("\n");
        sb.append("      type: ").append(toIndentedString(type)).append("\n");
        sb.append("      refUid: ").append(toIndentedString(refUid)).append("\n");
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

