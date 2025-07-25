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
import io.gate.gateapi.models.SubAccountKeyPerms;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SubAccountKey
 */
public class SubAccountKey {
    public static final String SERIALIZED_NAME_USER_ID = "user_id";
    @SerializedName(SERIALIZED_NAME_USER_ID)
    private Long userId;

    public static final String SERIALIZED_NAME_MODE = "mode";
    @SerializedName(SERIALIZED_NAME_MODE)
    private Integer mode;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PERMS = "perms";
    @SerializedName(SERIALIZED_NAME_PERMS)
    private List<SubAccountKeyPerms> perms = null;

    public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";
    @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
    private List<String> ipWhitelist = null;

    public static final String SERIALIZED_NAME_KEY = "key";
    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private Integer state;

    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private Long createdAt;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private Long updatedAt;

    public static final String SERIALIZED_NAME_LAST_ACCESS = "last_access";
    @SerializedName(SERIALIZED_NAME_LAST_ACCESS)
    private Long lastAccess;


     /**
     * User ID.
     * @return userId
    **/
    @javax.annotation.Nullable
    public Long getUserId() {
        return userId;
    }


    public SubAccountKey mode(Integer mode) {
        
        this.mode = mode;
        return this;
    }

     /**
     * Mode: 1 - classic 2 - portfolio account.
     * @return mode
    **/
    @javax.annotation.Nullable
    public Integer getMode() {
        return mode;
    }


    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public SubAccountKey name(String name) {
        
        this.name = name;
        return this;
    }

     /**
     * API key name.
     * @return name
    **/
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public SubAccountKey perms(List<SubAccountKeyPerms> perms) {
        
        this.perms = perms;
        return this;
    }

    public SubAccountKey addPermsItem(SubAccountKeyPerms permsItem) {
        if (this.perms == null) {
            this.perms = new ArrayList<>();
        }
        this.perms.add(permsItem);
        return this;
    }

     /**
     * Get perms
     * @return perms
    **/
    @javax.annotation.Nullable
    public List<SubAccountKeyPerms> getPerms() {
        return perms;
    }


    public void setPerms(List<SubAccountKeyPerms> perms) {
        this.perms = perms;
    }

    public SubAccountKey ipWhitelist(List<String> ipWhitelist) {
        
        this.ipWhitelist = ipWhitelist;
        return this;
    }

    public SubAccountKey addIpWhitelistItem(String ipWhitelistItem) {
        if (this.ipWhitelist == null) {
            this.ipWhitelist = new ArrayList<>();
        }
        this.ipWhitelist.add(ipWhitelistItem);
        return this;
    }

     /**
     * ip white list (list will be removed if no value is passed).
     * @return ipWhitelist
    **/
    @javax.annotation.Nullable
    public List<String> getIpWhitelist() {
        return ipWhitelist;
    }


    public void setIpWhitelist(List<String> ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

     /**
     * API Key.
     * @return key
    **/
    @javax.annotation.Nullable
    public String getKey() {
        return key;
    }


     /**
     * State 1 - normal 2 - locked 3 - frozen.
     * @return state
    **/
    @javax.annotation.Nullable
    public Integer getState() {
        return state;
    }


     /**
     * Creation time.
     * @return createdAt
    **/
    @javax.annotation.Nullable
    public Long getCreatedAt() {
        return createdAt;
    }


     /**
     * Last update time.
     * @return updatedAt
    **/
    @javax.annotation.Nullable
    public Long getUpdatedAt() {
        return updatedAt;
    }


     /**
     * Last access time.
     * @return lastAccess
    **/
    @javax.annotation.Nullable
    public Long getLastAccess() {
        return lastAccess;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubAccountKey subAccountKey = (SubAccountKey) o;
        return Objects.equals(this.userId, subAccountKey.userId) &&
                Objects.equals(this.mode, subAccountKey.mode) &&
                Objects.equals(this.name, subAccountKey.name) &&
                Objects.equals(this.perms, subAccountKey.perms) &&
                Objects.equals(this.ipWhitelist, subAccountKey.ipWhitelist) &&
                Objects.equals(this.key, subAccountKey.key) &&
                Objects.equals(this.state, subAccountKey.state) &&
                Objects.equals(this.createdAt, subAccountKey.createdAt) &&
                Objects.equals(this.updatedAt, subAccountKey.updatedAt) &&
                Objects.equals(this.lastAccess, subAccountKey.lastAccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, mode, name, perms, ipWhitelist, key, state, createdAt, updatedAt, lastAccess);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubAccountKey {\n");
        sb.append("      userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("      mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("      name: ").append(toIndentedString(name)).append("\n");
        sb.append("      perms: ").append(toIndentedString(perms)).append("\n");
        sb.append("      ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
        sb.append("      key: ").append(toIndentedString(key)).append("\n");
        sb.append("      state: ").append(toIndentedString(state)).append("\n");
        sb.append("      createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("      updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("      lastAccess: ").append(toIndentedString(lastAccess)).append("\n");
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

