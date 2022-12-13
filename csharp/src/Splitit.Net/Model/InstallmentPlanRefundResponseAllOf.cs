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
    /// InstallmentPlanRefundResponseAllOf
    /// </summary>
    [DataContract]
    public partial class InstallmentPlanRefundResponseAllOf :  IEquatable<InstallmentPlanRefundResponseAllOf>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InstallmentPlanRefundResponseAllOf" /> class.
        /// </summary>
        /// <param name="refundId">refundId.</param>
        /// <param name="installmentPlanNumber">installmentPlanNumber.</param>
        /// <param name="currency">currency.</param>
        /// <param name="nonCreditRefundAmount">nonCreditRefundAmount.</param>
        /// <param name="creditRefundAmount">creditRefundAmount.</param>
        /// <param name="summary">summary.</param>
        public InstallmentPlanRefundResponseAllOf(string refundId = default(string), string installmentPlanNumber = default(string), string currency = default(string), decimal nonCreditRefundAmount = default(decimal), decimal creditRefundAmount = default(decimal), RefundSummary summary = default(RefundSummary))
        {
            this.RefundId = refundId;
            this.InstallmentPlanNumber = installmentPlanNumber;
            this.Currency = currency;
            this.NonCreditRefundAmount = nonCreditRefundAmount;
            this.CreditRefundAmount = creditRefundAmount;
            this.Summary = summary;
        }

        /// <summary>
        /// Gets or Sets RefundId
        /// </summary>
        [DataMember(Name="RefundId", EmitDefaultValue=false)]
        public string RefundId { get; set; }

        /// <summary>
        /// Gets or Sets InstallmentPlanNumber
        /// </summary>
        [DataMember(Name="InstallmentPlanNumber", EmitDefaultValue=false)]
        public string InstallmentPlanNumber { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name="Currency", EmitDefaultValue=false)]
        public string Currency { get; set; }

        /// <summary>
        /// Gets or Sets NonCreditRefundAmount
        /// </summary>
        [DataMember(Name="NonCreditRefundAmount", EmitDefaultValue=false)]
        public decimal NonCreditRefundAmount { get; set; }

        /// <summary>
        /// Gets or Sets CreditRefundAmount
        /// </summary>
        [DataMember(Name="CreditRefundAmount", EmitDefaultValue=false)]
        public decimal CreditRefundAmount { get; set; }

        /// <summary>
        /// Gets or Sets Summary
        /// </summary>
        [DataMember(Name="Summary", EmitDefaultValue=false)]
        public RefundSummary Summary { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InstallmentPlanRefundResponseAllOf {\n");
            sb.Append("  RefundId: ").Append(RefundId).Append("\n");
            sb.Append("  InstallmentPlanNumber: ").Append(InstallmentPlanNumber).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  NonCreditRefundAmount: ").Append(NonCreditRefundAmount).Append("\n");
            sb.Append("  CreditRefundAmount: ").Append(CreditRefundAmount).Append("\n");
            sb.Append("  Summary: ").Append(Summary).Append("\n");
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
            return this.Equals(input as InstallmentPlanRefundResponseAllOf);
        }

        /// <summary>
        /// Returns true if InstallmentPlanRefundResponseAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of InstallmentPlanRefundResponseAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstallmentPlanRefundResponseAllOf input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RefundId == input.RefundId ||
                    (this.RefundId != null &&
                    this.RefundId.Equals(input.RefundId))
                ) && 
                (
                    this.InstallmentPlanNumber == input.InstallmentPlanNumber ||
                    (this.InstallmentPlanNumber != null &&
                    this.InstallmentPlanNumber.Equals(input.InstallmentPlanNumber))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.NonCreditRefundAmount == input.NonCreditRefundAmount ||
                    (this.NonCreditRefundAmount != null &&
                    this.NonCreditRefundAmount.Equals(input.NonCreditRefundAmount))
                ) && 
                (
                    this.CreditRefundAmount == input.CreditRefundAmount ||
                    (this.CreditRefundAmount != null &&
                    this.CreditRefundAmount.Equals(input.CreditRefundAmount))
                ) && 
                (
                    this.Summary == input.Summary ||
                    (this.Summary != null &&
                    this.Summary.Equals(input.Summary))
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
                if (this.RefundId != null)
                    hashCode = hashCode * 59 + this.RefundId.GetHashCode();
                if (this.InstallmentPlanNumber != null)
                    hashCode = hashCode * 59 + this.InstallmentPlanNumber.GetHashCode();
                if (this.Currency != null)
                    hashCode = hashCode * 59 + this.Currency.GetHashCode();
                if (this.NonCreditRefundAmount != null)
                    hashCode = hashCode * 59 + this.NonCreditRefundAmount.GetHashCode();
                if (this.CreditRefundAmount != null)
                    hashCode = hashCode * 59 + this.CreditRefundAmount.GetHashCode();
                if (this.Summary != null)
                    hashCode = hashCode * 59 + this.Summary.GetHashCode();
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
