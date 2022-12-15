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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Splitit.Net.Client;
using Splitit.Net.Api;
using Splitit.Net.Model;

namespace Splitit.Net.Test
{
    /// <summary>
    ///  Class for testing InstallmentPlanApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class InstallmentPlanApiTests
    {
        private InstallmentPlanApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new InstallmentPlanApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of InstallmentPlanApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' InstallmentPlanApi
            //Assert.IsInstanceOf(typeof(InstallmentPlanApi), instance);
        }

        
        /// <summary>
        /// Test Cancel
        /// </summary>
        [Test]
        public void CancelTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string installmentPlanNumber = null;
            //var response = instance.Cancel(installmentPlanNumber);
            //Assert.IsInstanceOf(typeof(InstallmentPlanCancelResponse), response, "response is InstallmentPlanCancelResponse");
        }
        
        /// <summary>
        /// Test Get
        /// </summary>
        [Test]
        public void GetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string installmentPlanNumber = null;
            //var response = instance.Get(installmentPlanNumber);
            //Assert.IsInstanceOf(typeof(InstallmentPlanModel), response, "response is InstallmentPlanModel");
        }
        
        /// <summary>
        /// Test Post
        /// </summary>
        [Test]
        public void PostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //InstallmentPlanCreateRequest installmentPlanCreateRequest = null;
            //string xSplititTestMode = null;
            //var response = instance.Post(installmentPlanCreateRequest, xSplititTestMode);
            //Assert.IsInstanceOf(typeof(InstallmentPlanModel), response, "response is InstallmentPlanModel");
        }
        
        /// <summary>
        /// Test Refund
        /// </summary>
        [Test]
        public void RefundTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string installmentPlanNumber = null;
            //InstallmentPlanRefundRequest installmentPlanRefundRequest = null;
            //var response = instance.Refund(installmentPlanNumber, installmentPlanRefundRequest);
            //Assert.IsInstanceOf(typeof(InstallmentPlanRefundResponse), response, "response is InstallmentPlanRefundResponse");
        }
        
        /// <summary>
        /// Test Search
        /// </summary>
        [Test]
        public void SearchTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string installmentPlanNumber = null;
            //string refOrderNumber = null;
            //string extendedParams = null;
            //var response = instance.Search(installmentPlanNumber, refOrderNumber, extendedParams);
            //Assert.IsInstanceOf(typeof(InstallmentPlanGetResponse), response, "response is InstallmentPlanGetResponse");
        }
        
        /// <summary>
        /// Test UpdateOrder
        /// </summary>
        [Test]
        public void UpdateOrderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string installmentPlanNumber = null;
            //UpdateOrderRequest updateOrderRequest = null;
            //var response = instance.UpdateOrder(installmentPlanNumber, updateOrderRequest);
            //Assert.IsInstanceOf(typeof(InstallmentPlanUpdateResponse), response, "response is InstallmentPlanUpdateResponse");
        }
        
        /// <summary>
        /// Test UpdateOrder2
        /// </summary>
        [Test]
        public void UpdateOrder2Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier = null;
            //var response = instance.UpdateOrder2(installmentPlanUpdateRequestByIdentifier);
            //Assert.IsInstanceOf(typeof(InstallmentPlanUpdateResponse), response, "response is InstallmentPlanUpdateResponse");
        }
        
        /// <summary>
        /// Test VerifyAuthorization
        /// </summary>
        [Test]
        public void VerifyAuthorizationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string installmentPlanNumber = null;
            //var response = instance.VerifyAuthorization(installmentPlanNumber);
            //Assert.IsInstanceOf(typeof(VerifyAuthorizationResponse), response, "response is VerifyAuthorizationResponse");
        }
        
    }

}