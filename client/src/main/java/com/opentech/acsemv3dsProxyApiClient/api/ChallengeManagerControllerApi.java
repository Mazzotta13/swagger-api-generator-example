package com.opentech.acsemv3dsProxyApiClient.api;

import com.opentech.acsemv3dsProxyApiClient.ApiClient;

import com.opentech.acsemv3dsProxyApiClient.model.EvaluateChallengeStepCMWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.EvaluateChallengeStepCMWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.InitChallengeCMWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.InitChallengeCMWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.IsChallengeSupportedWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.IsChallengeSupportedWebResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@Component("com.opentech.acsemv3dsProxyApiClient.api.ChallengeManagerControllerApi")
public class ChallengeManagerControllerApi {
    private ApiClient apiClient;

    public ChallengeManagerControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public ChallengeManagerControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * evaluateChallengeStep
     * 
     * <p><b>200</b> - OK
     * @param body evaluateChallengeStepCMWebRequest
     * @param issuerCode issuer-code
     * @return EvaluateChallengeStepCMWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EvaluateChallengeStepCMWebResponse evaluateChallengeStepUsingPOST1(EvaluateChallengeStepCMWebRequest body, String issuerCode) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling evaluateChallengeStepUsingPOST1");
        }
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling evaluateChallengeStepUsingPOST1");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/challenge/{issuer-code}/evaluateChallengeStep").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EvaluateChallengeStepCMWebResponse> returnType = new ParameterizedTypeReference<EvaluateChallengeStepCMWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * initChallenge
     * 
     * <p><b>200</b> - OK
     * @param body initChallengeCMWebRequest
     * @param issuerCode issuer-code
     * @return InitChallengeCMWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InitChallengeCMWebResponse initChallengeUsingPOST1(InitChallengeCMWebRequest body, String issuerCode) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling initChallengeUsingPOST1");
        }
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling initChallengeUsingPOST1");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/challenge/{issuer-code}/initChallenge").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<InitChallengeCMWebResponse> returnType = new ParameterizedTypeReference<InitChallengeCMWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * isChallengeSupported
     * 
     * <p><b>200</b> - OK
     * @param body isChallengeSupportedWebRequest
     * @param issuerCode issuer-code
     * @return IsChallengeSupportedWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IsChallengeSupportedWebResponse isChallengeSupportedUsingPOST(IsChallengeSupportedWebRequest body, String issuerCode) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling isChallengeSupportedUsingPOST");
        }
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling isChallengeSupportedUsingPOST");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/challenge/{issuer-code}/isChallengeSupported").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<IsChallengeSupportedWebResponse> returnType = new ParameterizedTypeReference<IsChallengeSupportedWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
