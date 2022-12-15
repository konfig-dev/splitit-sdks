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
import com.splitit.client.model.ShippingStatus;
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
 * UpdateOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T15:01:38.286696-08:00[America/Los_Angeles]")
public class UpdateOrderRequest {
  public static final String SERIALIZED_NAME_TRACKING_NUMBER = "TrackingNumber";
  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBER)
  private String trackingNumber;

  public static final String SERIALIZED_NAME_REF_ORDER_NUMBER = "RefOrderNumber";
  @SerializedName(SERIALIZED_NAME_REF_ORDER_NUMBER)
  private String refOrderNumber;

  public static final String SERIALIZED_NAME_SHIPPING_STATUS = "ShippingStatus";
  @SerializedName(SERIALIZED_NAME_SHIPPING_STATUS)
  private ShippingStatus shippingStatus;

  public static final String SERIALIZED_NAME_CAPTURE = "Capture";
  @SerializedName(SERIALIZED_NAME_CAPTURE)
  private Boolean capture;

  public UpdateOrderRequest() {
  }

  public UpdateOrderRequest trackingNumber(String trackingNumber) {
    
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


  public UpdateOrderRequest refOrderNumber(String refOrderNumber) {
    
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


  public UpdateOrderRequest shippingStatus(ShippingStatus shippingStatus) {
    
    this.shippingStatus = shippingStatus;
    return this;
  }

   /**
   * Get shippingStatus
   * @return shippingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingStatus getShippingStatus() {
    return shippingStatus;
  }


  public void setShippingStatus(ShippingStatus shippingStatus) {
    this.shippingStatus = shippingStatus;
  }


  public UpdateOrderRequest capture(Boolean capture) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderRequest updateOrderRequest = (UpdateOrderRequest) o;
    return Objects.equals(this.trackingNumber, updateOrderRequest.trackingNumber) &&
        Objects.equals(this.refOrderNumber, updateOrderRequest.refOrderNumber) &&
        Objects.equals(this.shippingStatus, updateOrderRequest.shippingStatus) &&
        Objects.equals(this.capture, updateOrderRequest.capture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingNumber, refOrderNumber, shippingStatus, capture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderRequest {\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    shippingStatus: ").append(toIndentedString(shippingStatus)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
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
    openapiFields.add("TrackingNumber");
    openapiFields.add("RefOrderNumber");
    openapiFields.add("ShippingStatus");
    openapiFields.add("Capture");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateOrderRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateOrderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateOrderRequest is not found in the empty JSON string", UpdateOrderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateOrderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateOrderRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("TrackingNumber") != null && !jsonObj.get("TrackingNumber").isJsonNull()) && !jsonObj.get("TrackingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TrackingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TrackingNumber").toString()));
      }
      if ((jsonObj.get("RefOrderNumber") != null && !jsonObj.get("RefOrderNumber").isJsonNull()) && !jsonObj.get("RefOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RefOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RefOrderNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateOrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateOrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateOrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateOrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateOrderRequest>() {
           @Override
           public void write(JsonWriter out, UpdateOrderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateOrderRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateOrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateOrderRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateOrderRequest
  */
  public static UpdateOrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateOrderRequest.class);
  }

 /**
  * Convert an instance of UpdateOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

