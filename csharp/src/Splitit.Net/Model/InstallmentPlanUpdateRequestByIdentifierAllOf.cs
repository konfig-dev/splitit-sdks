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
    /// InstallmentPlanUpdateRequestByIdentifierAllOf
    /// </summary>
    [DataContract]
    public partial class InstallmentPlanUpdateRequestByIdentifierAllOf :  IEquatable<InstallmentPlanUpdateRequestByIdentifierAllOf>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InstallmentPlanUpdateRequestByIdentifierAllOf" /> class.
        /// </summary>
        /// <param name="identifier">identifier.</param>
        public InstallmentPlanUpdateRequestByIdentifierAllOf(IdentifierContract identifier = default(IdentifierContract))
        {
            this.Identifier = identifier;
        }

        /// <summary>
        /// Gets or Sets Identifier
        /// </summary>
        [DataMember(Name="Identifier", EmitDefaultValue=false)]
        public IdentifierContract Identifier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InstallmentPlanUpdateRequestByIdentifierAllOf {\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
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
            return this.Equals(input as InstallmentPlanUpdateRequestByIdentifierAllOf);
        }

        /// <summary>
        /// Returns true if InstallmentPlanUpdateRequestByIdentifierAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of InstallmentPlanUpdateRequestByIdentifierAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstallmentPlanUpdateRequestByIdentifierAllOf input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Identifier == input.Identifier ||
                    (this.Identifier != null &&
                    this.Identifier.Equals(input.Identifier))
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
                if (this.Identifier != null)
                    hashCode = hashCode * 59 + this.Identifier.GetHashCode();
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
