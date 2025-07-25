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
 * StpGroup
 */
public class StpGroup {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Long id;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
    @SerializedName(SERIALIZED_NAME_CREATOR_ID)
    private Long creatorId;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private Long createTime;


    public StpGroup id(Long id) {
        
        this.id = id;
        return this;
    }

     /**
     * STP Group ID.
     * @return id
    **/
    @javax.annotation.Nullable
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public StpGroup name(String name) {
        
        this.name = name;
        return this;
    }

     /**
     * STP Group name.
     * @return name
    **/
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public StpGroup creatorId(Long creatorId) {
        
        this.creatorId = creatorId;
        return this;
    }

     /**
     * Creator ID.
     * @return creatorId
    **/
    @javax.annotation.Nullable
    public Long getCreatorId() {
        return creatorId;
    }


    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public StpGroup createTime(Long createTime) {
        
        this.createTime = createTime;
        return this;
    }

     /**
     * Creation time.
     * @return createTime
    **/
    @javax.annotation.Nullable
    public Long getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StpGroup stpGroup = (StpGroup) o;
        return Objects.equals(this.id, stpGroup.id) &&
                Objects.equals(this.name, stpGroup.name) &&
                Objects.equals(this.creatorId, stpGroup.creatorId) &&
                Objects.equals(this.createTime, stpGroup.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, creatorId, createTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StpGroup {\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      name: ").append(toIndentedString(name)).append("\n");
        sb.append("      creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("      createTime: ").append(toIndentedString(createTime)).append("\n");
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

