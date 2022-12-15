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
import com.splitit.client.model.AuthorizationModel;
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
 * VerifyAuthorizationResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:13:12.630167Z[Etc/UTC]")
public class VerifyAuthorizationResponseAllOf {
  public static final String SERIALIZED_NAME_IS_AUTHORIZED = "IsAuthorized";
  @SerializedName(SERIALIZED_NAME_IS_AUTHORIZED)
  private Boolean isAuthorized;

  public static final String SERIALIZED_NAME_AUTHORIZATION_AMOUNT = "AuthorizationAmount";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_AMOUNT)
  private BigDecimal authorizationAmount;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "Authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private AuthorizationModel authorization;

  public VerifyAuthorizationResponseAllOf() {
  }

  public VerifyAuthorizationResponseAllOf isAuthorized(Boolean isAuthorized) {
    
    this.isAuthorized = isAuthorized;
    return this;
  }

   /**
   * Get isAuthorized
   * @return isAuthorized
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsAuthorized() {
    return isAuthorized;
  }


  public void setIsAuthorized(Boolean isAuthorized) {
    this.isAuthorized = isAuthorized;
  }


  public VerifyAuthorizationResponseAllOf authorizationAmount(BigDecimal authorizationAmount) {
    
    this.authorizationAmount = authorizationAmount;
    return this;
  }

   /**
   * Get authorizationAmount
   * @return authorizationAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAuthorizationAmount() {
    return authorizationAmount;
  }


  public void setAuthorizationAmount(BigDecimal authorizationAmount) {
    this.authorizationAmount = authorizationAmount;
  }


  public VerifyAuthorizationResponseAllOf authorization(AuthorizationModel authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizationModel getAuthorization() {
    return authorization;
  }


  public void setAuthorization(AuthorizationModel authorization) {
    this.authorization = authorization;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyAuthorizationResponseAllOf verifyAuthorizationResponseAllOf = (VerifyAuthorizationResponseAllOf) o;
    return Objects.equals(this.isAuthorized, verifyAuthorizationResponseAllOf.isAuthorized) &&
        Objects.equals(this.authorizationAmount, verifyAuthorizationResponseAllOf.authorizationAmount) &&
        Objects.equals(this.authorization, verifyAuthorizationResponseAllOf.authorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAuthorized, authorizationAmount, authorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyAuthorizationResponseAllOf {\n");
    sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
    openapiFields.add("IsAuthorized");
    openapiFields.add("AuthorizationAmount");
    openapiFields.add("Authorization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("IsAuthorized");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerifyAuthorizationResponseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerifyAuthorizationResponseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifyAuthorizationResponseAllOf is not found in the empty JSON string", VerifyAuthorizationResponseAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VerifyAuthorizationResponseAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerifyAuthorizationResponseAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerifyAuthorizationResponseAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `Authorization`
      if (jsonObj.get("Authorization") != null && !jsonObj.get("Authorization").isJsonNull()) {
        AuthorizationModel.validateJsonObject(jsonObj.getAsJsonObject("Authorization"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerifyAuthorizationResponseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyAuthorizationResponseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyAuthorizationResponseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyAuthorizationResponseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyAuthorizationResponseAllOf>() {
           @Override
           public void write(JsonWriter out, VerifyAuthorizationResponseAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerifyAuthorizationResponseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerifyAuthorizationResponseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifyAuthorizationResponseAllOf
  * @throws IOException if the JSON string is invalid with respect to VerifyAuthorizationResponseAllOf
  */
  public static VerifyAuthorizationResponseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyAuthorizationResponseAllOf.class);
  }

 /**
  * Convert an instance of VerifyAuthorizationResponseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

