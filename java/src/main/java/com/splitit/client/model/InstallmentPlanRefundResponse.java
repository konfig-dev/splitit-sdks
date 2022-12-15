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
import com.splitit.client.model.RefundSummary;
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
 * InstallmentPlanRefundResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T14:27:55.699693-08:00[America/Los_Angeles]")
public class InstallmentPlanRefundResponse {
  public static final String SERIALIZED_NAME_REFUND_ID = "RefundId";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  public static final String SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER = "InstallmentPlanNumber";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER)
  private String installmentPlanNumber;

  public static final String SERIALIZED_NAME_CURRENCY = "Currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_NON_CREDIT_REFUND_AMOUNT = "NonCreditRefundAmount";
  @SerializedName(SERIALIZED_NAME_NON_CREDIT_REFUND_AMOUNT)
  private BigDecimal nonCreditRefundAmount;

  public static final String SERIALIZED_NAME_CREDIT_REFUND_AMOUNT = "CreditRefundAmount";
  @SerializedName(SERIALIZED_NAME_CREDIT_REFUND_AMOUNT)
  private BigDecimal creditRefundAmount;

  public static final String SERIALIZED_NAME_SUMMARY = "Summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private RefundSummary summary;

  public InstallmentPlanRefundResponse() {
  }

  public InstallmentPlanRefundResponse refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * Get refundId
   * @return refundId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public InstallmentPlanRefundResponse installmentPlanNumber(String installmentPlanNumber) {
    
    this.installmentPlanNumber = installmentPlanNumber;
    return this;
  }

   /**
   * Get installmentPlanNumber
   * @return installmentPlanNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstallmentPlanNumber() {
    return installmentPlanNumber;
  }


  public void setInstallmentPlanNumber(String installmentPlanNumber) {
    this.installmentPlanNumber = installmentPlanNumber;
  }


  public InstallmentPlanRefundResponse currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public InstallmentPlanRefundResponse nonCreditRefundAmount(BigDecimal nonCreditRefundAmount) {
    
    this.nonCreditRefundAmount = nonCreditRefundAmount;
    return this;
  }

   /**
   * Get nonCreditRefundAmount
   * @return nonCreditRefundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNonCreditRefundAmount() {
    return nonCreditRefundAmount;
  }


  public void setNonCreditRefundAmount(BigDecimal nonCreditRefundAmount) {
    this.nonCreditRefundAmount = nonCreditRefundAmount;
  }


  public InstallmentPlanRefundResponse creditRefundAmount(BigDecimal creditRefundAmount) {
    
    this.creditRefundAmount = creditRefundAmount;
    return this;
  }

   /**
   * Get creditRefundAmount
   * @return creditRefundAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCreditRefundAmount() {
    return creditRefundAmount;
  }


  public void setCreditRefundAmount(BigDecimal creditRefundAmount) {
    this.creditRefundAmount = creditRefundAmount;
  }


  public InstallmentPlanRefundResponse summary(RefundSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RefundSummary getSummary() {
    return summary;
  }


  public void setSummary(RefundSummary summary) {
    this.summary = summary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanRefundResponse installmentPlanRefundResponse = (InstallmentPlanRefundResponse) o;
    return Objects.equals(this.refundId, installmentPlanRefundResponse.refundId) &&
        Objects.equals(this.installmentPlanNumber, installmentPlanRefundResponse.installmentPlanNumber) &&
        Objects.equals(this.currency, installmentPlanRefundResponse.currency) &&
        Objects.equals(this.nonCreditRefundAmount, installmentPlanRefundResponse.nonCreditRefundAmount) &&
        Objects.equals(this.creditRefundAmount, installmentPlanRefundResponse.creditRefundAmount) &&
        Objects.equals(this.summary, installmentPlanRefundResponse.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundId, installmentPlanNumber, currency, nonCreditRefundAmount, creditRefundAmount, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanRefundResponse {\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nonCreditRefundAmount: ").append(toIndentedString(nonCreditRefundAmount)).append("\n");
    sb.append("    creditRefundAmount: ").append(toIndentedString(creditRefundAmount)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
    openapiFields.add("RefundId");
    openapiFields.add("InstallmentPlanNumber");
    openapiFields.add("Currency");
    openapiFields.add("NonCreditRefundAmount");
    openapiFields.add("CreditRefundAmount");
    openapiFields.add("Summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallmentPlanRefundResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstallmentPlanRefundResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentPlanRefundResponse is not found in the empty JSON string", InstallmentPlanRefundResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallmentPlanRefundResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallmentPlanRefundResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("RefundId") != null && !jsonObj.get("RefundId").isJsonNull()) && !jsonObj.get("RefundId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RefundId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RefundId").toString()));
      }
      if ((jsonObj.get("InstallmentPlanNumber") != null && !jsonObj.get("InstallmentPlanNumber").isJsonNull()) && !jsonObj.get("InstallmentPlanNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InstallmentPlanNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InstallmentPlanNumber").toString()));
      }
      if ((jsonObj.get("Currency") != null && !jsonObj.get("Currency").isJsonNull()) && !jsonObj.get("Currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Currency").toString()));
      }
      // validate the optional field `Summary`
      if (jsonObj.get("Summary") != null && !jsonObj.get("Summary").isJsonNull()) {
        RefundSummary.validateJsonObject(jsonObj.getAsJsonObject("Summary"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstallmentPlanRefundResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentPlanRefundResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentPlanRefundResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentPlanRefundResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentPlanRefundResponse>() {
           @Override
           public void write(JsonWriter out, InstallmentPlanRefundResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentPlanRefundResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentPlanRefundResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentPlanRefundResponse
  * @throws IOException if the JSON string is invalid with respect to InstallmentPlanRefundResponse
  */
  public static InstallmentPlanRefundResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentPlanRefundResponse.class);
  }

 /**
  * Convert an instance of InstallmentPlanRefundResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

