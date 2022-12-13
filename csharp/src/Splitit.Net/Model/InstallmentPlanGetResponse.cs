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
    /// InstallmentPlanGetResponse
    /// </summary>
    [DataContract]
    public partial class InstallmentPlanGetResponse :  IEquatable<InstallmentPlanGetResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InstallmentPlanGetResponse" /> class.
        /// </summary>
        /// <param name="planList">planList.</param>
        public InstallmentPlanGetResponse(List<InstallmentPlanModel> planList = default(List<InstallmentPlanModel>))
        {
            this.PlanList = planList;
        }

        /// <summary>
        /// Gets or Sets PlanList
        /// </summary>
        [DataMember(Name="PlanList", EmitDefaultValue=false)]
        public List<InstallmentPlanModel> PlanList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InstallmentPlanGetResponse {\n");
            sb.Append("  PlanList: ").Append(PlanList).Append("\n");
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
            return this.Equals(input as InstallmentPlanGetResponse);
        }

        /// <summary>
        /// Returns true if InstallmentPlanGetResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of InstallmentPlanGetResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstallmentPlanGetResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PlanList == input.PlanList ||
                    this.PlanList != null &&
                    input.PlanList != null &&
                    this.PlanList.SequenceEqual(input.PlanList)
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
                if (this.PlanList != null)
                    hashCode = hashCode * 59 + this.PlanList.GetHashCode();
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
