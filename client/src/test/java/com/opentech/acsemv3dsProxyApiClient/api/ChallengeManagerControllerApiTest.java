/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.opentech.acsemv3dsProxyApiClient.api;

import com.opentech.acsemv3dsProxyApiClient.model.EvaluateChallengeStepCMWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.EvaluateChallengeStepCMWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.InitChallengeCMWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.InitChallengeCMWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.IsChallengeSupportedWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.IsChallengeSupportedWebResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChallengeManagerControllerApi
 */
@Ignore
public class ChallengeManagerControllerApiTest {

    private final ChallengeManagerControllerApi api = new ChallengeManagerControllerApi();

    
    /**
     * evaluateChallengeStep
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evaluateChallengeStepUsingPOST1Test() {
        EvaluateChallengeStepCMWebRequest evaluateChallengeStepCMWebRequest = null;
        String issuerCode = null;
        EvaluateChallengeStepCMWebResponse response = api.evaluateChallengeStepUsingPOST1(evaluateChallengeStepCMWebRequest, issuerCode);

        // TODO: test validations
    }
    
    /**
     * initChallenge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initChallengeUsingPOST1Test() {
        InitChallengeCMWebRequest initChallengeCMWebRequest = null;
        String issuerCode = null;
        InitChallengeCMWebResponse response = api.initChallengeUsingPOST1(initChallengeCMWebRequest, issuerCode);

        // TODO: test validations
    }
    
    /**
     * isChallengeSupported
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isChallengeSupportedUsingPOSTTest() {
        IsChallengeSupportedWebRequest isChallengeSupportedWebRequest = null;
        String issuerCode = null;
        IsChallengeSupportedWebResponse response = api.isChallengeSupportedUsingPOST(isChallengeSupportedWebRequest, issuerCode);

        // TODO: test validations
    }
    
}
