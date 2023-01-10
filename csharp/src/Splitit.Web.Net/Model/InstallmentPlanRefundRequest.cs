/*
 * splitit-web-api-v3
 *
 * Splitit's API
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Splitit.Web.Net.Client.OpenAPIDateConverter;

namespace Splitit.Web.Net.Model
{
    /// <summary>
    /// InstallmentPlanRefundRequest
    /// </summary>
    [DataContract(Name = "InstallmentPlanRefundRequest")]
    public partial class InstallmentPlanRefundRequest : IEquatable<InstallmentPlanRefundRequest>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets RefundStrategy
        /// </summary>
        [DataMember(Name = "RefundStrategy", EmitDefaultValue = false)]
        public RefundStrategy? RefundStrategy { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InstallmentPlanRefundRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected InstallmentPlanRefundRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="InstallmentPlanRefundRequest" /> class.
        /// </summary>
        /// <param name="amount">amount (required).</param>
        /// <param name="refundStrategy">refundStrategy.</param>
        public InstallmentPlanRefundRequest(decimal amount = default(decimal), RefundStrategy? refundStrategy = default(RefundStrategy?))
        {
            this.Amount = amount;
            this.RefundStrategy = refundStrategy;
        }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name = "Amount", IsRequired = true, EmitDefaultValue = true)]
        public decimal Amount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InstallmentPlanRefundRequest {\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  RefundStrategy: ").Append(RefundStrategy).Append("\n");
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
            return this.Equals(input as InstallmentPlanRefundRequest);
        }

        /// <summary>
        /// Returns true if InstallmentPlanRefundRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of InstallmentPlanRefundRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstallmentPlanRefundRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Amount == input.Amount ||
                    this.Amount.Equals(input.Amount)
                ) && 
                (
                    this.RefundStrategy == input.RefundStrategy ||
                    this.RefundStrategy.Equals(input.RefundStrategy)
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
                hashCode = (hashCode * 59) + this.Amount.GetHashCode();
                hashCode = (hashCode * 59) + this.RefundStrategy.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}