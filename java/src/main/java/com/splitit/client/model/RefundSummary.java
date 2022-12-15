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
 * RefundSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-12T17:45:38.348478-08:00[America/Los_Angeles]")
public class RefundSummary {
  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "TotalAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private BigDecimal totalAmount;

  public static final String SERIALIZED_NAME_FAILED_AMOUNT = "FailedAmount";
  @SerializedName(SERIALIZED_NAME_FAILED_AMOUNT)
  private BigDecimal failedAmount;

  public static final String SERIALIZED_NAME_SUCCEEDED_AMOUNT = "SucceededAmount";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED_AMOUNT)
  private BigDecimal succeededAmount;

  public static final String SERIALIZED_NAME_PENDING_AMOUNT = "PendingAmount";
  @SerializedName(SERIALIZED_NAME_PENDING_AMOUNT)
  private BigDecimal pendingAmount;

  public RefundSummary() {
  }

  public RefundSummary totalAmount(BigDecimal totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }


  public RefundSummary failedAmount(BigDecimal failedAmount) {
    
    this.failedAmount = failedAmount;
    return this;
  }

   /**
   * Get failedAmount
   * @return failedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getFailedAmount() {
    return failedAmount;
  }


  public void setFailedAmount(BigDecimal failedAmount) {
    this.failedAmount = failedAmount;
  }


  public RefundSummary succeededAmount(BigDecimal succeededAmount) {
    
    this.succeededAmount = succeededAmount;
    return this;
  }

   /**
   * Get succeededAmount
   * @return succeededAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSucceededAmount() {
    return succeededAmount;
  }


  public void setSucceededAmount(BigDecimal succeededAmount) {
    this.succeededAmount = succeededAmount;
  }


  public RefundSummary pendingAmount(BigDecimal pendingAmount) {
    
    this.pendingAmount = pendingAmount;
    return this;
  }

   /**
   * Get pendingAmount
   * @return pendingAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPendingAmount() {
    return pendingAmount;
  }


  public void setPendingAmount(BigDecimal pendingAmount) {
    this.pendingAmount = pendingAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundSummary refundSummary = (RefundSummary) o;
    return Objects.equals(this.totalAmount, refundSummary.totalAmount) &&
        Objects.equals(this.failedAmount, refundSummary.failedAmount) &&
        Objects.equals(this.succeededAmount, refundSummary.succeededAmount) &&
        Objects.equals(this.pendingAmount, refundSummary.pendingAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, failedAmount, succeededAmount, pendingAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundSummary {\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    failedAmount: ").append(toIndentedString(failedAmount)).append("\n");
    sb.append("    succeededAmount: ").append(toIndentedString(succeededAmount)).append("\n");
    sb.append("    pendingAmount: ").append(toIndentedString(pendingAmount)).append("\n");
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
    openapiFields.add("TotalAmount");
    openapiFields.add("FailedAmount");
    openapiFields.add("SucceededAmount");
    openapiFields.add("PendingAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RefundSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RefundSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefundSummary is not found in the empty JSON string", RefundSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RefundSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RefundSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefundSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefundSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefundSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefundSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<RefundSummary>() {
           @Override
           public void write(JsonWriter out, RefundSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RefundSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RefundSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RefundSummary
  * @throws IOException if the JSON string is invalid with respect to RefundSummary
  */
  public static RefundSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefundSummary.class);
  }

 /**
  * Convert an instance of RefundSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
