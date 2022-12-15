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
import com.splitit.client.model.AddressData;
import com.splitit.client.model.AuthorizationModel;
import com.splitit.client.model.Installment;
import com.splitit.client.model.LinksData;
import com.splitit.client.model.PaymentMethodModel;
import com.splitit.client.model.PlanStatus;
import com.splitit.client.model.PurchaseMethod;
import com.splitit.client.model.ShopperData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * InstallmentPlanModelAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T15:01:38.286696-08:00[America/Los_Angeles]")
public class InstallmentPlanModelAllOf {
  public static final String SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER = "InstallmentPlanNumber";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PLAN_NUMBER)
  private String installmentPlanNumber;

  public static final String SERIALIZED_NAME_REF_ORDER_NUMBER = "RefOrderNumber";
  @SerializedName(SERIALIZED_NAME_REF_ORDER_NUMBER)
  private String refOrderNumber;

  public static final String SERIALIZED_NAME_PURCHASE_METHOD = "PurchaseMethod";
  @SerializedName(SERIALIZED_NAME_PURCHASE_METHOD)
  private PurchaseMethod purchaseMethod;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PlanStatus status;

  public static final String SERIALIZED_NAME_CURRENCY = "Currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ORIGINAL_AMOUNT = "OriginalAmount";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_AMOUNT)
  private BigDecimal originalAmount;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_EXTENDED_PARAMS = "ExtendedParams";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PARAMS)
  private Map<String, String> extendedParams = null;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "Authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private AuthorizationModel authorization;

  public static final String SERIALIZED_NAME_SHOPPER = "Shopper";
  @SerializedName(SERIALIZED_NAME_SHOPPER)
  private ShopperData shopper;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "BillingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private AddressData billingAddress;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "PaymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethodModel paymentMethod;

  public static final String SERIALIZED_NAME_INSTALLMENTS = "Installments";
  @SerializedName(SERIALIZED_NAME_INSTALLMENTS)
  private List<Installment> installments = null;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private LinksData links;

  public InstallmentPlanModelAllOf() {
  }

  public InstallmentPlanModelAllOf installmentPlanNumber(String installmentPlanNumber) {
    
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


  public InstallmentPlanModelAllOf refOrderNumber(String refOrderNumber) {
    
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


  public InstallmentPlanModelAllOf purchaseMethod(PurchaseMethod purchaseMethod) {
    
    this.purchaseMethod = purchaseMethod;
    return this;
  }

   /**
   * Get purchaseMethod
   * @return purchaseMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PurchaseMethod getPurchaseMethod() {
    return purchaseMethod;
  }


  public void setPurchaseMethod(PurchaseMethod purchaseMethod) {
    this.purchaseMethod = purchaseMethod;
  }


  public InstallmentPlanModelAllOf status(PlanStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlanStatus getStatus() {
    return status;
  }


  public void setStatus(PlanStatus status) {
    this.status = status;
  }


  public InstallmentPlanModelAllOf currency(String currency) {
    
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


  public InstallmentPlanModelAllOf originalAmount(BigDecimal originalAmount) {
    
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Get originalAmount
   * @return originalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOriginalAmount() {
    return originalAmount;
  }


  public void setOriginalAmount(BigDecimal originalAmount) {
    this.originalAmount = originalAmount;
  }


  public InstallmentPlanModelAllOf amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public InstallmentPlanModelAllOf extendedParams(Map<String, String> extendedParams) {
    
    this.extendedParams = extendedParams;
    return this;
  }

  public InstallmentPlanModelAllOf putExtendedParamsItem(String key, String extendedParamsItem) {
    if (this.extendedParams == null) {
      this.extendedParams = new HashMap<>();
    }
    this.extendedParams.put(key, extendedParamsItem);
    return this;
  }

   /**
   * Get extendedParams
   * @return extendedParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getExtendedParams() {
    return extendedParams;
  }


  public void setExtendedParams(Map<String, String> extendedParams) {
    this.extendedParams = extendedParams;
  }


  public InstallmentPlanModelAllOf authorization(AuthorizationModel authorization) {
    
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


  public InstallmentPlanModelAllOf shopper(ShopperData shopper) {
    
    this.shopper = shopper;
    return this;
  }

   /**
   * Get shopper
   * @return shopper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShopperData getShopper() {
    return shopper;
  }


  public void setShopper(ShopperData shopper) {
    this.shopper = shopper;
  }


  public InstallmentPlanModelAllOf billingAddress(AddressData billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressData getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(AddressData billingAddress) {
    this.billingAddress = billingAddress;
  }


  public InstallmentPlanModelAllOf paymentMethod(PaymentMethodModel paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentMethodModel getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethodModel paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public InstallmentPlanModelAllOf installments(List<Installment> installments) {
    
    this.installments = installments;
    return this;
  }

  public InstallmentPlanModelAllOf addInstallmentsItem(Installment installmentsItem) {
    if (this.installments == null) {
      this.installments = new ArrayList<>();
    }
    this.installments.add(installmentsItem);
    return this;
  }

   /**
   * Get installments
   * @return installments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Installment> getInstallments() {
    return installments;
  }


  public void setInstallments(List<Installment> installments) {
    this.installments = installments;
  }


  public InstallmentPlanModelAllOf links(LinksData links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksData getLinks() {
    return links;
  }


  public void setLinks(LinksData links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanModelAllOf installmentPlanModelAllOf = (InstallmentPlanModelAllOf) o;
    return Objects.equals(this.installmentPlanNumber, installmentPlanModelAllOf.installmentPlanNumber) &&
        Objects.equals(this.refOrderNumber, installmentPlanModelAllOf.refOrderNumber) &&
        Objects.equals(this.purchaseMethod, installmentPlanModelAllOf.purchaseMethod) &&
        Objects.equals(this.status, installmentPlanModelAllOf.status) &&
        Objects.equals(this.currency, installmentPlanModelAllOf.currency) &&
        Objects.equals(this.originalAmount, installmentPlanModelAllOf.originalAmount) &&
        Objects.equals(this.amount, installmentPlanModelAllOf.amount) &&
        Objects.equals(this.extendedParams, installmentPlanModelAllOf.extendedParams) &&
        Objects.equals(this.authorization, installmentPlanModelAllOf.authorization) &&
        Objects.equals(this.shopper, installmentPlanModelAllOf.shopper) &&
        Objects.equals(this.billingAddress, installmentPlanModelAllOf.billingAddress) &&
        Objects.equals(this.paymentMethod, installmentPlanModelAllOf.paymentMethod) &&
        Objects.equals(this.installments, installmentPlanModelAllOf.installments) &&
        Objects.equals(this.links, installmentPlanModelAllOf.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, refOrderNumber, purchaseMethod, status, currency, originalAmount, amount, extendedParams, authorization, shopper, billingAddress, paymentMethod, installments, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanModelAllOf {\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    purchaseMethod: ").append(toIndentedString(purchaseMethod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    extendedParams: ").append(toIndentedString(extendedParams)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    shopper: ").append(toIndentedString(shopper)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("InstallmentPlanNumber");
    openapiFields.add("RefOrderNumber");
    openapiFields.add("PurchaseMethod");
    openapiFields.add("Status");
    openapiFields.add("Currency");
    openapiFields.add("OriginalAmount");
    openapiFields.add("Amount");
    openapiFields.add("ExtendedParams");
    openapiFields.add("Authorization");
    openapiFields.add("Shopper");
    openapiFields.add("BillingAddress");
    openapiFields.add("PaymentMethod");
    openapiFields.add("Installments");
    openapiFields.add("Links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallmentPlanModelAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstallmentPlanModelAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentPlanModelAllOf is not found in the empty JSON string", InstallmentPlanModelAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallmentPlanModelAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallmentPlanModelAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InstallmentPlanModelAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("InstallmentPlanNumber") != null && !jsonObj.get("InstallmentPlanNumber").isJsonNull()) && !jsonObj.get("InstallmentPlanNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InstallmentPlanNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InstallmentPlanNumber").toString()));
      }
      if ((jsonObj.get("RefOrderNumber") != null && !jsonObj.get("RefOrderNumber").isJsonNull()) && !jsonObj.get("RefOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RefOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RefOrderNumber").toString()));
      }
      if ((jsonObj.get("Currency") != null && !jsonObj.get("Currency").isJsonNull()) && !jsonObj.get("Currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Currency").toString()));
      }
      // validate the optional field `Authorization`
      if (jsonObj.get("Authorization") != null && !jsonObj.get("Authorization").isJsonNull()) {
        AuthorizationModel.validateJsonObject(jsonObj.getAsJsonObject("Authorization"));
      }
      // validate the optional field `Shopper`
      if (jsonObj.get("Shopper") != null && !jsonObj.get("Shopper").isJsonNull()) {
        ShopperData.validateJsonObject(jsonObj.getAsJsonObject("Shopper"));
      }
      // validate the optional field `BillingAddress`
      if (jsonObj.get("BillingAddress") != null && !jsonObj.get("BillingAddress").isJsonNull()) {
        AddressData.validateJsonObject(jsonObj.getAsJsonObject("BillingAddress"));
      }
      // validate the optional field `PaymentMethod`
      if (jsonObj.get("PaymentMethod") != null && !jsonObj.get("PaymentMethod").isJsonNull()) {
        PaymentMethodModel.validateJsonObject(jsonObj.getAsJsonObject("PaymentMethod"));
      }
      if (jsonObj.get("Installments") != null && !jsonObj.get("Installments").isJsonNull()) {
        JsonArray jsonArrayinstallments = jsonObj.getAsJsonArray("Installments");
        if (jsonArrayinstallments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Installments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Installments` to be an array in the JSON string but got `%s`", jsonObj.get("Installments").toString()));
          }

          // validate the optional field `Installments` (array)
          for (int i = 0; i < jsonArrayinstallments.size(); i++) {
            Installment.validateJsonObject(jsonArrayinstallments.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `Links`
      if (jsonObj.get("Links") != null && !jsonObj.get("Links").isJsonNull()) {
        LinksData.validateJsonObject(jsonObj.getAsJsonObject("Links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstallmentPlanModelAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentPlanModelAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentPlanModelAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentPlanModelAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentPlanModelAllOf>() {
           @Override
           public void write(JsonWriter out, InstallmentPlanModelAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentPlanModelAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentPlanModelAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentPlanModelAllOf
  * @throws IOException if the JSON string is invalid with respect to InstallmentPlanModelAllOf
  */
  public static InstallmentPlanModelAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentPlanModelAllOf.class);
  }

 /**
  * Convert an instance of InstallmentPlanModelAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

