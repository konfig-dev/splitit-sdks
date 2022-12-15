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
import com.splitit.client.model.InstallmentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

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
 * Installment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:13:12.630167Z[Etc/UTC]")
public class Installment {
  public static final String SERIALIZED_NAME_INSTALLMENT_NUMBER = "InstallmentNumber";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_NUMBER)
  private Integer installmentNumber;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_PROCESS_DATE_TIME = "ProcessDateTime";
  @SerializedName(SERIALIZED_NAME_PROCESS_DATE_TIME)
  private OffsetDateTime processDateTime;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private InstallmentStatus status;

  public Installment() {
  }

  public Installment installmentNumber(Integer installmentNumber) {
    
    this.installmentNumber = installmentNumber;
    return this;
  }

   /**
   * Get installmentNumber
   * @return installmentNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getInstallmentNumber() {
    return installmentNumber;
  }


  public void setInstallmentNumber(Integer installmentNumber) {
    this.installmentNumber = installmentNumber;
  }


  public Installment amount(BigDecimal amount) {
    
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


  public Installment processDateTime(OffsetDateTime processDateTime) {
    
    this.processDateTime = processDateTime;
    return this;
  }

   /**
   * Get processDateTime
   * @return processDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getProcessDateTime() {
    return processDateTime;
  }


  public void setProcessDateTime(OffsetDateTime processDateTime) {
    this.processDateTime = processDateTime;
  }


  public Installment status(InstallmentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InstallmentStatus getStatus() {
    return status;
  }


  public void setStatus(InstallmentStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installment installment = (Installment) o;
    return Objects.equals(this.installmentNumber, installment.installmentNumber) &&
        Objects.equals(this.amount, installment.amount) &&
        Objects.equals(this.processDateTime, installment.processDateTime) &&
        Objects.equals(this.status, installment.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentNumber, amount, processDateTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installment {\n");
    sb.append("    installmentNumber: ").append(toIndentedString(installmentNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    processDateTime: ").append(toIndentedString(processDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("InstallmentNumber");
    openapiFields.add("Amount");
    openapiFields.add("ProcessDateTime");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("InstallmentNumber");
    openapiRequiredFields.add("Amount");
    openapiRequiredFields.add("Status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Installment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Installment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Installment is not found in the empty JSON string", Installment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Installment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Installment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Installment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Installment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Installment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Installment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Installment.class));

       return (TypeAdapter<T>) new TypeAdapter<Installment>() {
           @Override
           public void write(JsonWriter out, Installment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Installment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Installment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Installment
  * @throws IOException if the JSON string is invalid with respect to Installment
  */
  public static Installment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Installment.class);
  }

 /**
  * Convert an instance of Installment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

