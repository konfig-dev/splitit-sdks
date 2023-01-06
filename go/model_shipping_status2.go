/*
splitit-web-api-v3

Splitit's API

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package splitit

import (
	"encoding/json"
	"fmt"
)

// ShippingStatus2 
type ShippingStatus2 string

// List of ShippingStatus2
const (
	SHIPPINGSTATUS2_SHIPPED ShippingStatus2 = "Shipped"
	SHIPPINGSTATUS2_DELIVERED ShippingStatus2 = "Delivered"
)

// All allowed values of ShippingStatus2 enum
var AllowedShippingStatus2EnumValues = []ShippingStatus2{
	"Shipped",
	"Delivered",
}

func (v *ShippingStatus2) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := ShippingStatus2(value)
	for _, existing := range AllowedShippingStatus2EnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid ShippingStatus2", value)
}

// NewShippingStatus2FromValue returns a pointer to a valid ShippingStatus2
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewShippingStatus2FromValue(v string) (*ShippingStatus2, error) {
	ev := ShippingStatus2(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for ShippingStatus2: valid values are %v", v, AllowedShippingStatus2EnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v ShippingStatus2) IsValid() bool {
	for _, existing := range AllowedShippingStatus2EnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to ShippingStatus2 value
func (v ShippingStatus2) Ptr() *ShippingStatus2 {
	return &v
}

type NullableShippingStatus2 struct {
	value *ShippingStatus2
	isSet bool
}

func (v NullableShippingStatus2) Get() *ShippingStatus2 {
	return v.value
}

func (v *NullableShippingStatus2) Set(val *ShippingStatus2) {
	v.value = val
	v.isSet = true
}

func (v NullableShippingStatus2) IsSet() bool {
	return v.isSet
}

func (v *NullableShippingStatus2) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableShippingStatus2(val *ShippingStatus2) *NullableShippingStatus2 {
	return &NullableShippingStatus2{value: val, isSet: true}
}

func (v NullableShippingStatus2) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableShippingStatus2) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

