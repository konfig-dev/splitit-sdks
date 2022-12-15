/*
 * splitit-web-api-v3
 * Splitit's API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.splitit.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.splitit.client.model.InstallmentPlanModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.splitit.client.JSON;

/**
 * InstallmentPlanGetResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T15:01:38.286696-08:00[America/Los_Angeles]")
public class InstallmentPlanGetResponse {
  public static final String SERIALIZED_NAME_PLAN_LIST = "PlanList";
  @SerializedName(SERIALIZED_NAME_PLAN_LIST)
  private List<InstallmentPlanModel> planList = null;

  public InstallmentPlanGetResponse() {
  }

  public InstallmentPlanGetResponse planList(List<InstallmentPlanModel> planList) {
    
    this.planList = planList;
    return this;
  }

  public InstallmentPlanGetResponse addPlanListItem(InstallmentPlanModel planListItem) {
    if (this.planList == null) {
      this.planList = new ArrayList<>();
    }
    this.planList.add(planListItem);
    return this;
  }

   /**
   * Get planList
   * @return planList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InstallmentPlanModel> getPlanList() {
    return planList;
  }


  public void setPlanList(List<InstallmentPlanModel> planList) {
    this.planList = planList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanGetResponse installmentPlanGetResponse = (InstallmentPlanGetResponse) o;
    return Objects.equals(this.planList, installmentPlanGetResponse.planList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanGetResponse {\n");
    sb.append("    planList: ").append(toIndentedString(planList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("PlanList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallmentPlanGetResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstallmentPlanGetResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentPlanGetResponse is not found in the empty JSON string", InstallmentPlanGetResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallmentPlanGetResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallmentPlanGetResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("PlanList") != null && !jsonObj.get("PlanList").isJsonNull()) {
        JsonArray jsonArrayplanList = jsonObj.getAsJsonArray("PlanList");
        if (jsonArrayplanList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PlanList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PlanList` to be an array in the JSON string but got `%s`", jsonObj.get("PlanList").toString()));
          }

          // validate the optional field `PlanList` (array)
          for (int i = 0; i < jsonArrayplanList.size(); i++) {
            InstallmentPlanModel.validateJsonObject(jsonArrayplanList.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstallmentPlanGetResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentPlanGetResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentPlanGetResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentPlanGetResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentPlanGetResponse>() {
           @Override
           public void write(JsonWriter out, InstallmentPlanGetResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentPlanGetResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentPlanGetResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentPlanGetResponse
  * @throws IOException if the JSON string is invalid with respect to InstallmentPlanGetResponse
  */
  public static InstallmentPlanGetResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentPlanGetResponse.class);
  }

 /**
  * Convert an instance of InstallmentPlanGetResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

