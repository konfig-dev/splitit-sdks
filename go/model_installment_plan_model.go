/*
splitit-web-api-v3

Splitit's API

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package splitit

import (
	"encoding/json"
)

// InstallmentPlanModel struct for InstallmentPlanModel
type InstallmentPlanModel struct {
	InstallmentPlanNumber *string `json:"InstallmentPlanNumber,omitempty"`
	RefOrderNumber *string `json:"RefOrderNumber,omitempty"`
	PurchaseMethod *PurchaseMethod `json:"PurchaseMethod,omitempty"`
	Status PlanStatus `json:"Status"`
	Currency *string `json:"Currency,omitempty"`
	OriginalAmount *float32 `json:"OriginalAmount,omitempty"`
	Amount *float32 `json:"Amount,omitempty"`
	ExtendedParams *map[string]string `json:"ExtendedParams,omitempty"`
	Authorization *AuthorizationModel `json:"Authorization,omitempty"`
	Shopper *ShopperData `json:"Shopper,omitempty"`
	BillingAddress *AddressData `json:"BillingAddress,omitempty"`
	PaymentMethod *PaymentMethodModel `json:"PaymentMethod,omitempty"`
	Installments []Installment `json:"Installments,omitempty"`
	Links *LinksData `json:"Links,omitempty"`
}

// NewInstallmentPlanModel instantiates a new InstallmentPlanModel object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInstallmentPlanModel(status PlanStatus) *InstallmentPlanModel {
	this := InstallmentPlanModel{}
	this.Status = status
	return &this
}

// NewInstallmentPlanModelWithDefaults instantiates a new InstallmentPlanModel object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInstallmentPlanModelWithDefaults() *InstallmentPlanModel {
	this := InstallmentPlanModel{}
	return &this
}

// GetInstallmentPlanNumber returns the InstallmentPlanNumber field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetInstallmentPlanNumber() string {
	if o == nil || isNil(o.InstallmentPlanNumber) {
		var ret string
		return ret
	}
	return *o.InstallmentPlanNumber
}

// GetInstallmentPlanNumberOk returns a tuple with the InstallmentPlanNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetInstallmentPlanNumberOk() (*string, bool) {
	if o == nil || isNil(o.InstallmentPlanNumber) {
    return nil, false
	}
	return o.InstallmentPlanNumber, true
}

// HasInstallmentPlanNumber returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasInstallmentPlanNumber() bool {
	if o != nil && !isNil(o.InstallmentPlanNumber) {
		return true
	}

	return false
}

// SetInstallmentPlanNumber gets a reference to the given string and assigns it to the InstallmentPlanNumber field.
func (o *InstallmentPlanModel) SetInstallmentPlanNumber(v string) {
	o.InstallmentPlanNumber = &v
}

// GetRefOrderNumber returns the RefOrderNumber field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetRefOrderNumber() string {
	if o == nil || isNil(o.RefOrderNumber) {
		var ret string
		return ret
	}
	return *o.RefOrderNumber
}

// GetRefOrderNumberOk returns a tuple with the RefOrderNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetRefOrderNumberOk() (*string, bool) {
	if o == nil || isNil(o.RefOrderNumber) {
    return nil, false
	}
	return o.RefOrderNumber, true
}

// HasRefOrderNumber returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasRefOrderNumber() bool {
	if o != nil && !isNil(o.RefOrderNumber) {
		return true
	}

	return false
}

// SetRefOrderNumber gets a reference to the given string and assigns it to the RefOrderNumber field.
func (o *InstallmentPlanModel) SetRefOrderNumber(v string) {
	o.RefOrderNumber = &v
}

// GetPurchaseMethod returns the PurchaseMethod field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetPurchaseMethod() PurchaseMethod {
	if o == nil || isNil(o.PurchaseMethod) {
		var ret PurchaseMethod
		return ret
	}
	return *o.PurchaseMethod
}

// GetPurchaseMethodOk returns a tuple with the PurchaseMethod field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetPurchaseMethodOk() (*PurchaseMethod, bool) {
	if o == nil || isNil(o.PurchaseMethod) {
    return nil, false
	}
	return o.PurchaseMethod, true
}

// HasPurchaseMethod returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasPurchaseMethod() bool {
	if o != nil && !isNil(o.PurchaseMethod) {
		return true
	}

	return false
}

// SetPurchaseMethod gets a reference to the given PurchaseMethod and assigns it to the PurchaseMethod field.
func (o *InstallmentPlanModel) SetPurchaseMethod(v PurchaseMethod) {
	o.PurchaseMethod = &v
}

// GetStatus returns the Status field value
func (o *InstallmentPlanModel) GetStatus() PlanStatus {
	if o == nil {
		var ret PlanStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetStatusOk() (*PlanStatus, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *InstallmentPlanModel) SetStatus(v PlanStatus) {
	o.Status = v
}

// GetCurrency returns the Currency field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetCurrency() string {
	if o == nil || isNil(o.Currency) {
		var ret string
		return ret
	}
	return *o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetCurrencyOk() (*string, bool) {
	if o == nil || isNil(o.Currency) {
    return nil, false
	}
	return o.Currency, true
}

// HasCurrency returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasCurrency() bool {
	if o != nil && !isNil(o.Currency) {
		return true
	}

	return false
}

// SetCurrency gets a reference to the given string and assigns it to the Currency field.
func (o *InstallmentPlanModel) SetCurrency(v string) {
	o.Currency = &v
}

// GetOriginalAmount returns the OriginalAmount field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetOriginalAmount() float32 {
	if o == nil || isNil(o.OriginalAmount) {
		var ret float32
		return ret
	}
	return *o.OriginalAmount
}

// GetOriginalAmountOk returns a tuple with the OriginalAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetOriginalAmountOk() (*float32, bool) {
	if o == nil || isNil(o.OriginalAmount) {
    return nil, false
	}
	return o.OriginalAmount, true
}

// HasOriginalAmount returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasOriginalAmount() bool {
	if o != nil && !isNil(o.OriginalAmount) {
		return true
	}

	return false
}

// SetOriginalAmount gets a reference to the given float32 and assigns it to the OriginalAmount field.
func (o *InstallmentPlanModel) SetOriginalAmount(v float32) {
	o.OriginalAmount = &v
}

// GetAmount returns the Amount field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetAmount() float32 {
	if o == nil || isNil(o.Amount) {
		var ret float32
		return ret
	}
	return *o.Amount
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetAmountOk() (*float32, bool) {
	if o == nil || isNil(o.Amount) {
    return nil, false
	}
	return o.Amount, true
}

// HasAmount returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasAmount() bool {
	if o != nil && !isNil(o.Amount) {
		return true
	}

	return false
}

// SetAmount gets a reference to the given float32 and assigns it to the Amount field.
func (o *InstallmentPlanModel) SetAmount(v float32) {
	o.Amount = &v
}

// GetExtendedParams returns the ExtendedParams field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetExtendedParams() map[string]string {
	if o == nil || isNil(o.ExtendedParams) {
		var ret map[string]string
		return ret
	}
	return *o.ExtendedParams
}

// GetExtendedParamsOk returns a tuple with the ExtendedParams field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetExtendedParamsOk() (*map[string]string, bool) {
	if o == nil || isNil(o.ExtendedParams) {
    return nil, false
	}
	return o.ExtendedParams, true
}

// HasExtendedParams returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasExtendedParams() bool {
	if o != nil && !isNil(o.ExtendedParams) {
		return true
	}

	return false
}

// SetExtendedParams gets a reference to the given map[string]string and assigns it to the ExtendedParams field.
func (o *InstallmentPlanModel) SetExtendedParams(v map[string]string) {
	o.ExtendedParams = &v
}

// GetAuthorization returns the Authorization field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetAuthorization() AuthorizationModel {
	if o == nil || isNil(o.Authorization) {
		var ret AuthorizationModel
		return ret
	}
	return *o.Authorization
}

// GetAuthorizationOk returns a tuple with the Authorization field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetAuthorizationOk() (*AuthorizationModel, bool) {
	if o == nil || isNil(o.Authorization) {
    return nil, false
	}
	return o.Authorization, true
}

// HasAuthorization returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasAuthorization() bool {
	if o != nil && !isNil(o.Authorization) {
		return true
	}

	return false
}

// SetAuthorization gets a reference to the given AuthorizationModel and assigns it to the Authorization field.
func (o *InstallmentPlanModel) SetAuthorization(v AuthorizationModel) {
	o.Authorization = &v
}

// GetShopper returns the Shopper field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetShopper() ShopperData {
	if o == nil || isNil(o.Shopper) {
		var ret ShopperData
		return ret
	}
	return *o.Shopper
}

// GetShopperOk returns a tuple with the Shopper field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetShopperOk() (*ShopperData, bool) {
	if o == nil || isNil(o.Shopper) {
    return nil, false
	}
	return o.Shopper, true
}

// HasShopper returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasShopper() bool {
	if o != nil && !isNil(o.Shopper) {
		return true
	}

	return false
}

// SetShopper gets a reference to the given ShopperData and assigns it to the Shopper field.
func (o *InstallmentPlanModel) SetShopper(v ShopperData) {
	o.Shopper = &v
}

// GetBillingAddress returns the BillingAddress field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetBillingAddress() AddressData {
	if o == nil || isNil(o.BillingAddress) {
		var ret AddressData
		return ret
	}
	return *o.BillingAddress
}

// GetBillingAddressOk returns a tuple with the BillingAddress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetBillingAddressOk() (*AddressData, bool) {
	if o == nil || isNil(o.BillingAddress) {
    return nil, false
	}
	return o.BillingAddress, true
}

// HasBillingAddress returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasBillingAddress() bool {
	if o != nil && !isNil(o.BillingAddress) {
		return true
	}

	return false
}

// SetBillingAddress gets a reference to the given AddressData and assigns it to the BillingAddress field.
func (o *InstallmentPlanModel) SetBillingAddress(v AddressData) {
	o.BillingAddress = &v
}

// GetPaymentMethod returns the PaymentMethod field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetPaymentMethod() PaymentMethodModel {
	if o == nil || isNil(o.PaymentMethod) {
		var ret PaymentMethodModel
		return ret
	}
	return *o.PaymentMethod
}

// GetPaymentMethodOk returns a tuple with the PaymentMethod field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetPaymentMethodOk() (*PaymentMethodModel, bool) {
	if o == nil || isNil(o.PaymentMethod) {
    return nil, false
	}
	return o.PaymentMethod, true
}

// HasPaymentMethod returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasPaymentMethod() bool {
	if o != nil && !isNil(o.PaymentMethod) {
		return true
	}

	return false
}

// SetPaymentMethod gets a reference to the given PaymentMethodModel and assigns it to the PaymentMethod field.
func (o *InstallmentPlanModel) SetPaymentMethod(v PaymentMethodModel) {
	o.PaymentMethod = &v
}

// GetInstallments returns the Installments field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetInstallments() []Installment {
	if o == nil || isNil(o.Installments) {
		var ret []Installment
		return ret
	}
	return o.Installments
}

// GetInstallmentsOk returns a tuple with the Installments field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetInstallmentsOk() ([]Installment, bool) {
	if o == nil || isNil(o.Installments) {
    return nil, false
	}
	return o.Installments, true
}

// HasInstallments returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasInstallments() bool {
	if o != nil && !isNil(o.Installments) {
		return true
	}

	return false
}

// SetInstallments gets a reference to the given []Installment and assigns it to the Installments field.
func (o *InstallmentPlanModel) SetInstallments(v []Installment) {
	o.Installments = v
}

// GetLinks returns the Links field value if set, zero value otherwise.
func (o *InstallmentPlanModel) GetLinks() LinksData {
	if o == nil || isNil(o.Links) {
		var ret LinksData
		return ret
	}
	return *o.Links
}

// GetLinksOk returns a tuple with the Links field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InstallmentPlanModel) GetLinksOk() (*LinksData, bool) {
	if o == nil || isNil(o.Links) {
    return nil, false
	}
	return o.Links, true
}

// HasLinks returns a boolean if a field has been set.
func (o *InstallmentPlanModel) HasLinks() bool {
	if o != nil && !isNil(o.Links) {
		return true
	}

	return false
}

// SetLinks gets a reference to the given LinksData and assigns it to the Links field.
func (o *InstallmentPlanModel) SetLinks(v LinksData) {
	o.Links = &v
}

func (o InstallmentPlanModel) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.InstallmentPlanNumber) {
		toSerialize["InstallmentPlanNumber"] = o.InstallmentPlanNumber
	}
	if !isNil(o.RefOrderNumber) {
		toSerialize["RefOrderNumber"] = o.RefOrderNumber
	}
	if !isNil(o.PurchaseMethod) {
		toSerialize["PurchaseMethod"] = o.PurchaseMethod
	}
	if true {
		toSerialize["Status"] = o.Status
	}
	if !isNil(o.Currency) {
		toSerialize["Currency"] = o.Currency
	}
	if !isNil(o.OriginalAmount) {
		toSerialize["OriginalAmount"] = o.OriginalAmount
	}
	if !isNil(o.Amount) {
		toSerialize["Amount"] = o.Amount
	}
	if !isNil(o.ExtendedParams) {
		toSerialize["ExtendedParams"] = o.ExtendedParams
	}
	if !isNil(o.Authorization) {
		toSerialize["Authorization"] = o.Authorization
	}
	if !isNil(o.Shopper) {
		toSerialize["Shopper"] = o.Shopper
	}
	if !isNil(o.BillingAddress) {
		toSerialize["BillingAddress"] = o.BillingAddress
	}
	if !isNil(o.PaymentMethod) {
		toSerialize["PaymentMethod"] = o.PaymentMethod
	}
	if !isNil(o.Installments) {
		toSerialize["Installments"] = o.Installments
	}
	if !isNil(o.Links) {
		toSerialize["Links"] = o.Links
	}
	return json.Marshal(toSerialize)
}

type NullableInstallmentPlanModel struct {
	value *InstallmentPlanModel
	isSet bool
}

func (v NullableInstallmentPlanModel) Get() *InstallmentPlanModel {
	return v.value
}

func (v *NullableInstallmentPlanModel) Set(val *InstallmentPlanModel) {
	v.value = val
	v.isSet = true
}

func (v NullableInstallmentPlanModel) IsSet() bool {
	return v.isSet
}

func (v *NullableInstallmentPlanModel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInstallmentPlanModel(val *InstallmentPlanModel) *NullableInstallmentPlanModel {
	return &NullableInstallmentPlanModel{value: val, isSet: true}
}

func (v NullableInstallmentPlanModel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInstallmentPlanModel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

