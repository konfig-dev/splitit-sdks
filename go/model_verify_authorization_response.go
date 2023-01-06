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

// VerifyAuthorizationResponse struct for VerifyAuthorizationResponse
type VerifyAuthorizationResponse struct {
	IsAuthorized bool `json:"IsAuthorized"`
	AuthorizationAmount *float32 `json:"AuthorizationAmount,omitempty"`
	Authorization *AuthorizationModel `json:"Authorization,omitempty"`
}

// NewVerifyAuthorizationResponse instantiates a new VerifyAuthorizationResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVerifyAuthorizationResponse(isAuthorized bool) *VerifyAuthorizationResponse {
	this := VerifyAuthorizationResponse{}
	this.IsAuthorized = isAuthorized
	return &this
}

// NewVerifyAuthorizationResponseWithDefaults instantiates a new VerifyAuthorizationResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVerifyAuthorizationResponseWithDefaults() *VerifyAuthorizationResponse {
	this := VerifyAuthorizationResponse{}
	return &this
}

// GetIsAuthorized returns the IsAuthorized field value
func (o *VerifyAuthorizationResponse) GetIsAuthorized() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.IsAuthorized
}

// GetIsAuthorizedOk returns a tuple with the IsAuthorized field value
// and a boolean to check if the value has been set.
func (o *VerifyAuthorizationResponse) GetIsAuthorizedOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.IsAuthorized, true
}

// SetIsAuthorized sets field value
func (o *VerifyAuthorizationResponse) SetIsAuthorized(v bool) {
	o.IsAuthorized = v
}

// GetAuthorizationAmount returns the AuthorizationAmount field value if set, zero value otherwise.
func (o *VerifyAuthorizationResponse) GetAuthorizationAmount() float32 {
	if o == nil || isNil(o.AuthorizationAmount) {
		var ret float32
		return ret
	}
	return *o.AuthorizationAmount
}

// GetAuthorizationAmountOk returns a tuple with the AuthorizationAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifyAuthorizationResponse) GetAuthorizationAmountOk() (*float32, bool) {
	if o == nil || isNil(o.AuthorizationAmount) {
    return nil, false
	}
	return o.AuthorizationAmount, true
}

// HasAuthorizationAmount returns a boolean if a field has been set.
func (o *VerifyAuthorizationResponse) HasAuthorizationAmount() bool {
	if o != nil && !isNil(o.AuthorizationAmount) {
		return true
	}

	return false
}

// SetAuthorizationAmount gets a reference to the given float32 and assigns it to the AuthorizationAmount field.
func (o *VerifyAuthorizationResponse) SetAuthorizationAmount(v float32) {
	o.AuthorizationAmount = &v
}

// GetAuthorization returns the Authorization field value if set, zero value otherwise.
func (o *VerifyAuthorizationResponse) GetAuthorization() AuthorizationModel {
	if o == nil || isNil(o.Authorization) {
		var ret AuthorizationModel
		return ret
	}
	return *o.Authorization
}

// GetAuthorizationOk returns a tuple with the Authorization field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VerifyAuthorizationResponse) GetAuthorizationOk() (*AuthorizationModel, bool) {
	if o == nil || isNil(o.Authorization) {
    return nil, false
	}
	return o.Authorization, true
}

// HasAuthorization returns a boolean if a field has been set.
func (o *VerifyAuthorizationResponse) HasAuthorization() bool {
	if o != nil && !isNil(o.Authorization) {
		return true
	}

	return false
}

// SetAuthorization gets a reference to the given AuthorizationModel and assigns it to the Authorization field.
func (o *VerifyAuthorizationResponse) SetAuthorization(v AuthorizationModel) {
	o.Authorization = &v
}

func (o VerifyAuthorizationResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["IsAuthorized"] = o.IsAuthorized
	}
	if !isNil(o.AuthorizationAmount) {
		toSerialize["AuthorizationAmount"] = o.AuthorizationAmount
	}
	if !isNil(o.Authorization) {
		toSerialize["Authorization"] = o.Authorization
	}
	return json.Marshal(toSerialize)
}

type NullableVerifyAuthorizationResponse struct {
	value *VerifyAuthorizationResponse
	isSet bool
}

func (v NullableVerifyAuthorizationResponse) Get() *VerifyAuthorizationResponse {
	return v.value
}

func (v *NullableVerifyAuthorizationResponse) Set(val *VerifyAuthorizationResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableVerifyAuthorizationResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableVerifyAuthorizationResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVerifyAuthorizationResponse(val *VerifyAuthorizationResponse) *NullableVerifyAuthorizationResponse {
	return &NullableVerifyAuthorizationResponse{value: val, isSet: true}
}

func (v NullableVerifyAuthorizationResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVerifyAuthorizationResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


