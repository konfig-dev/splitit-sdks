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


package com.konfigthis.splitit.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.splitit.client.model.AddressData;
import com.konfigthis.splitit.client.model.AuthorizationModel;
import com.konfigthis.splitit.client.model.Installment;
import com.konfigthis.splitit.client.model.LinksData;
import com.konfigthis.splitit.client.model.PaymentMethodModel;
import com.konfigthis.splitit.client.model.PlanStatus;
import com.konfigthis.splitit.client.model.PurchaseMethod;
import com.konfigthis.splitit.client.model.ShopperData;
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

import com.konfigthis.splitit.client.JSON;

/**
 * InstallmentPlanModel
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InstallmentPlanModel {
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

  public InstallmentPlanModel() {
  }

  public InstallmentPlanModel installmentPlanNumber(String installmentPlanNumber) {
    
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


  public InstallmentPlanModel refOrderNumber(String refOrderNumber) {
    
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


  public InstallmentPlanModel purchaseMethod(PurchaseMethod purchaseMethod) {
    
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


  public InstallmentPlanModel status(PlanStatus status) {
    
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


  public InstallmentPlanModel currency(String currency) {
    
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


  public InstallmentPlanModel originalAmount(BigDecimal originalAmount) {
    
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


  public InstallmentPlanModel amount(BigDecimal amount) {
    
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


  public InstallmentPlanModel extendedParams(Map<String, String> extendedParams) {
    
    this.extendedParams = extendedParams;
    return this;
  }

  public InstallmentPlanModel putExtendedParamsItem(String key, String extendedParamsItem) {
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


  public InstallmentPlanModel authorization(AuthorizationModel authorization) {
    
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


  public InstallmentPlanModel shopper(ShopperData shopper) {
    
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


  public InstallmentPlanModel billingAddress(AddressData billingAddress) {
    
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


  public InstallmentPlanModel paymentMethod(PaymentMethodModel paymentMethod) {
    
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


  public InstallmentPlanModel installments(List<Installment> installments) {
    
    this.installments = installments;
    return this;
  }

  public InstallmentPlanModel addInstallmentsItem(Installment installmentsItem) {
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


  public InstallmentPlanModel links(LinksData links) {
    
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
    InstallmentPlanModel installmentPlanModel = (InstallmentPlanModel) o;
    return Objects.equals(this.installmentPlanNumber, installmentPlanModel.installmentPlanNumber) &&
        Objects.equals(this.refOrderNumber, installmentPlanModel.refOrderNumber) &&
        Objects.equals(this.purchaseMethod, installmentPlanModel.purchaseMethod) &&
        Objects.equals(this.status, installmentPlanModel.status) &&
        Objects.equals(this.currency, installmentPlanModel.currency) &&
        Objects.equals(this.originalAmount, installmentPlanModel.originalAmount) &&
        Objects.equals(this.amount, installmentPlanModel.amount) &&
        Objects.equals(this.extendedParams, installmentPlanModel.extendedParams) &&
        Objects.equals(this.authorization, installmentPlanModel.authorization) &&
        Objects.equals(this.shopper, installmentPlanModel.shopper) &&
        Objects.equals(this.billingAddress, installmentPlanModel.billingAddress) &&
        Objects.equals(this.paymentMethod, installmentPlanModel.paymentMethod) &&
        Objects.equals(this.installments, installmentPlanModel.installments) &&
        Objects.equals(this.links, installmentPlanModel.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, refOrderNumber, purchaseMethod, status, currency, originalAmount, amount, extendedParams, authorization, shopper, billingAddress, paymentMethod, installments, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanModel {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to InstallmentPlanModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstallmentPlanModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentPlanModel is not found in the empty JSON string", InstallmentPlanModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallmentPlanModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallmentPlanModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InstallmentPlanModel.openapiRequiredFields) {
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
       if (!InstallmentPlanModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentPlanModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentPlanModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentPlanModel.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentPlanModel>() {
           @Override
           public void write(JsonWriter out, InstallmentPlanModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentPlanModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentPlanModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentPlanModel
  * @throws IOException if the JSON string is invalid with respect to InstallmentPlanModel
  */
  public static InstallmentPlanModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentPlanModel.class);
  }

 /**
  * Convert an instance of InstallmentPlanModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
