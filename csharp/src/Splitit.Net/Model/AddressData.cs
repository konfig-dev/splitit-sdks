/*
    * splitit-web-api-v3
    *
    * Splitit's API
    *
* The version of the OpenAPI document: 1.0.0
* 
* Generated by: https://konfigthis.com
*/

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Splitit.Net.Client.OpenAPIDateConverter;

namespace Splitit.Net.Model
{
    /// <summary>
    /// AddressData
    /// </summary>
    [DataContract]
    public partial class AddressData :  IEquatable<AddressData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AddressData" /> class.
        /// </summary>
        /// <param name="addressLine">addressLine.</param>
        /// <param name="addressLine2">addressLine2.</param>
        /// <param name="city">city.</param>
        /// <param name="country">country.</param>
        /// <param name="state">state.</param>
        /// <param name="zip">zip.</param>
        public AddressData(string addressLine = default(string), string addressLine2 = default(string), string city = default(string), string country = default(string), string state = default(string), string zip = default(string))
        {
            this.AddressLine = addressLine;
            this.AddressLine2 = addressLine2;
            this.City = city;
            this.Country = country;
            this.State = state;
            this.Zip = zip;
        }

        /// <summary>
        /// Gets or Sets AddressLine
        /// </summary>
        [DataMember(Name="AddressLine", EmitDefaultValue=false)]
        public string AddressLine { get; set; }

        /// <summary>
        /// Gets or Sets AddressLine2
        /// </summary>
        [DataMember(Name="AddressLine2", EmitDefaultValue=false)]
        public string AddressLine2 { get; set; }

        /// <summary>
        /// Gets or Sets City
        /// </summary>
        [DataMember(Name="City", EmitDefaultValue=false)]
        public string City { get; set; }

        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name="Country", EmitDefaultValue=false)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="State", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Gets or Sets Zip
        /// </summary>
        [DataMember(Name="Zip", EmitDefaultValue=false)]
        public string Zip { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AddressData {\n");
            sb.Append("  AddressLine: ").Append(AddressLine).Append("\n");
            sb.Append("  AddressLine2: ").Append(AddressLine2).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Zip: ").Append(Zip).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AddressData);
        }

        /// <summary>
        /// Returns true if AddressData instances are equal
        /// </summary>
        /// <param name="input">Instance of AddressData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AddressData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AddressLine == input.AddressLine ||
                    (this.AddressLine != null &&
                    this.AddressLine.Equals(input.AddressLine))
                ) && 
                (
                    this.AddressLine2 == input.AddressLine2 ||
                    (this.AddressLine2 != null &&
                    this.AddressLine2.Equals(input.AddressLine2))
                ) && 
                (
                    this.City == input.City ||
                    (this.City != null &&
                    this.City.Equals(input.City))
                ) && 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.Zip == input.Zip ||
                    (this.Zip != null &&
                    this.Zip.Equals(input.Zip))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AddressLine != null)
                    hashCode = hashCode * 59 + this.AddressLine.GetHashCode();
                if (this.AddressLine2 != null)
                    hashCode = hashCode * 59 + this.AddressLine2.GetHashCode();
                if (this.City != null)
                    hashCode = hashCode * 59 + this.City.GetHashCode();
                if (this.Country != null)
                    hashCode = hashCode * 59 + this.Country.GetHashCode();
                if (this.State != null)
                    hashCode = hashCode * 59 + this.State.GetHashCode();
                if (this.Zip != null)
                    hashCode = hashCode * 59 + this.Zip.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}