package com.splitit.client.api;

import com.splitit.client.ApiClient;
import com.splitit.client.ApiException;
import com.splitit.client.Configuration;
import com.splitit.client.auth.ApiKeyAuth;
import com.splitit.client.auth.OAuth;
import com.splitit.client.model.InstallmentPlanCreateRequest;
import com.splitit.client.model.InstallmentPlanModel;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SimpleInstallmentPlanApiTest {

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInstallmentPlanTest() throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:4010");
        OAuth oauthKey = (OAuth) defaultClient.getAuthentication("bearer");
        oauthKey.setAccessToken("YOUR API KEY");
        InstallmentPlanApi api = new InstallmentPlanApi(defaultClient);
        InstallmentPlanCreateRequest installmentPlanCreateRequest = new InstallmentPlanCreateRequest();
        installmentPlanCreateRequest.setAutoCapture(true);
        installmentPlanCreateRequest.setAttempt3dSecure(true);
        installmentPlanCreateRequest.setAttemptAuthorize(true);
        installmentPlanCreateRequest.setTermsAndConditionsAccepted(true);
        InstallmentPlanModel model = api.post("YOUR IDEMPOTENCY KEY", installmentPlanCreateRequest, null);
        assertNotNull("Received null response", model);
    }
}
