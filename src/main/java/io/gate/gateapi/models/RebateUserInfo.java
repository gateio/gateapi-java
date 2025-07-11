/*
 * Gate API v4
 * Welcome to Gate API  APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf. 
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
 * Retrieve user rebate information
 */
public class RebateUserInfo {
    public static final String SERIALIZED_NAME_INVITE_UID = "invite_uid";
    @SerializedName(SERIALIZED_NAME_INVITE_UID)
    private Long inviteUid;


    public RebateUserInfo inviteUid(Long inviteUid) {
        
        this.inviteUid = inviteUid;
        return this;
    }

     /**
     * My inviter&#39;s UID
     * @return inviteUid
    **/
    @javax.annotation.Nullable
    public Long getInviteUid() {
        return inviteUid;
    }


    public void setInviteUid(Long inviteUid) {
        this.inviteUid = inviteUid;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RebateUserInfo rebateUserInfo = (RebateUserInfo) o;
        return Objects.equals(this.inviteUid, rebateUserInfo.inviteUid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteUid);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RebateUserInfo {\n");
        sb.append("      inviteUid: ").append(toIndentedString(inviteUid)).append("\n");
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

