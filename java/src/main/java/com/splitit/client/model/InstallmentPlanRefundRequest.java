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
import com.splitit.client.model.RefundStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

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
 * InstallmentPlanRefundRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T15:01:38.286696-08:00[America/Los_Angeles]")
public class InstallmentPlanRefundRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_REFUND_STRATEGY = "RefundStrategy";
  @SerializedName(SERIALIZED_NAME_REFUND_STRATEGY)
  private RefundStrategy refundStrategy;

  public InstallmentPlanRefundRequest() {
  }

  public InstallmentPlanRefundRequest amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public InstallmentPlanRefundRequest refundStrategy(RefundStrategy refundStrategy) {
    
    this.refundStrategy = refundStrategy;
    return this;
  }

   /**
   * Get refundStrategy
   * @return refundStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RefundStrategy getRefundStrategy() {
    return refundStrategy;
  }


  public void setRefundStrategy(RefundStrategy refundStrategy) {
    this.refundStrategy = refundStrategy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanRefundRequest installmentPlanRefundRequest = (InstallmentPlanRefundRequest) o;
    return Objects.equals(this.amount, installmentPlanRefundRequest.amount) &&
        Objects.equals(this.refundStrategy, installmentPlanRefundRequest.refundStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, refundStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanRefundRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    refundStrategy: ").append(toIndentedString(refundStrategy)).append("\n");
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
    openapiFields.add("Amount");
    openapiFields.add("RefundStrategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallmentPlanRefundRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstallmentPlanRefundRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentPlanRefundRequest is not found in the empty JSON string", InstallmentPlanRefundRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallmentPlanRefundRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallmentPlanRefundRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InstallmentPlanRefundRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstallmentPlanRefundRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentPlanRefundRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentPlanRefundRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentPlanRefundRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentPlanRefundRequest>() {
           @Override
           public void write(JsonWriter out, InstallmentPlanRefundRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentPlanRefundRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentPlanRefundRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentPlanRefundRequest
  * @throws IOException if the JSON string is invalid with respect to InstallmentPlanRefundRequest
  */
  public static InstallmentPlanRefundRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentPlanRefundRequest.class);
  }

 /**
  * Convert an instance of InstallmentPlanRefundRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

