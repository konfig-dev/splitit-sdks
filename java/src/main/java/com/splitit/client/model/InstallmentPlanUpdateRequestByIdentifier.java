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
import com.splitit.client.model.IdentifierContract;
import com.splitit.client.model.ShippingStatus2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * InstallmentPlanUpdateRequestByIdentifier
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:13:12.630167Z[Etc/UTC]")
public class InstallmentPlanUpdateRequestByIdentifier {
  public static final String SERIALIZED_NAME_REF_ORDER_NUMBER = "RefOrderNumber";
  @SerializedName(SERIALIZED_NAME_REF_ORDER_NUMBER)
  private String refOrderNumber;

  public static final String SERIALIZED_NAME_TRACKING_NUMBER = "TrackingNumber";
  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBER)
  private String trackingNumber;

  public static final String SERIALIZED_NAME_CAPTURE = "Capture";
  @SerializedName(SERIALIZED_NAME_CAPTURE)
  private Boolean capture;

  public static final String SERIALIZED_NAME_SHIPPING_STATUS = "ShippingStatus";
  @SerializedName(SERIALIZED_NAME_SHIPPING_STATUS)
  private ShippingStatus2 shippingStatus;

  public static final String SERIALIZED_NAME_IDENTIFIER = "Identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private IdentifierContract identifier;

  public InstallmentPlanUpdateRequestByIdentifier() {
  }

  public InstallmentPlanUpdateRequestByIdentifier refOrderNumber(String refOrderNumber) {
    
    this.refOrderNumber = refOrderNumber;
    return this;
  }

   /**
   * Get refOrderNumber
   * @return refOrderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefOrderNumber() {
    return refOrderNumber;
  }


  public void setRefOrderNumber(String refOrderNumber) {
    this.refOrderNumber = refOrderNumber;
  }


  public InstallmentPlanUpdateRequestByIdentifier trackingNumber(String trackingNumber) {
    
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Get trackingNumber
   * @return trackingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrackingNumber() {
    return trackingNumber;
  }


  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }


  public InstallmentPlanUpdateRequestByIdentifier capture(Boolean capture) {
    
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCapture() {
    return capture;
  }


  public void setCapture(Boolean capture) {
    this.capture = capture;
  }


  public InstallmentPlanUpdateRequestByIdentifier shippingStatus(ShippingStatus2 shippingStatus) {
    
    this.shippingStatus = shippingStatus;
    return this;
  }

   /**
   * Get shippingStatus
   * @return shippingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingStatus2 getShippingStatus() {
    return shippingStatus;
  }


  public void setShippingStatus(ShippingStatus2 shippingStatus) {
    this.shippingStatus = shippingStatus;
  }


  public InstallmentPlanUpdateRequestByIdentifier identifier(IdentifierContract identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentifierContract getIdentifier() {
    return identifier;
  }


  public void setIdentifier(IdentifierContract identifier) {
    this.identifier = identifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier = (InstallmentPlanUpdateRequestByIdentifier) o;
    return Objects.equals(this.refOrderNumber, installmentPlanUpdateRequestByIdentifier.refOrderNumber) &&
        Objects.equals(this.trackingNumber, installmentPlanUpdateRequestByIdentifier.trackingNumber) &&
        Objects.equals(this.capture, installmentPlanUpdateRequestByIdentifier.capture) &&
        Objects.equals(this.shippingStatus, installmentPlanUpdateRequestByIdentifier.shippingStatus) &&
        Objects.equals(this.identifier, installmentPlanUpdateRequestByIdentifier.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refOrderNumber, trackingNumber, capture, shippingStatus, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanUpdateRequestByIdentifier {\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    shippingStatus: ").append(toIndentedString(shippingStatus)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
    openapiFields.add("RefOrderNumber");
    openapiFields.add("TrackingNumber");
    openapiFields.add("Capture");
    openapiFields.add("ShippingStatus");
    openapiFields.add("Identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallmentPlanUpdateRequestByIdentifier
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstallmentPlanUpdateRequestByIdentifier.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentPlanUpdateRequestByIdentifier is not found in the empty JSON string", InstallmentPlanUpdateRequestByIdentifier.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallmentPlanUpdateRequestByIdentifier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallmentPlanUpdateRequestByIdentifier` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("RefOrderNumber") != null && !jsonObj.get("RefOrderNumber").isJsonNull()) && !jsonObj.get("RefOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RefOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RefOrderNumber").toString()));
      }
      if ((jsonObj.get("TrackingNumber") != null && !jsonObj.get("TrackingNumber").isJsonNull()) && !jsonObj.get("TrackingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TrackingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TrackingNumber").toString()));
      }
      // validate the optional field `Identifier`
      if (jsonObj.get("Identifier") != null && !jsonObj.get("Identifier").isJsonNull()) {
        IdentifierContract.validateJsonObject(jsonObj.getAsJsonObject("Identifier"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstallmentPlanUpdateRequestByIdentifier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentPlanUpdateRequestByIdentifier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentPlanUpdateRequestByIdentifier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentPlanUpdateRequestByIdentifier.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentPlanUpdateRequestByIdentifier>() {
           @Override
           public void write(JsonWriter out, InstallmentPlanUpdateRequestByIdentifier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentPlanUpdateRequestByIdentifier read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentPlanUpdateRequestByIdentifier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentPlanUpdateRequestByIdentifier
  * @throws IOException if the JSON string is invalid with respect to InstallmentPlanUpdateRequestByIdentifier
  */
  public static InstallmentPlanUpdateRequestByIdentifier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentPlanUpdateRequestByIdentifier.class);
  }

 /**
  * Convert an instance of InstallmentPlanUpdateRequestByIdentifier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

