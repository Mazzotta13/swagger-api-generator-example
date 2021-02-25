package com.opentech.acsemv3dsProxyApiClient.api;

import com.opentech.acsemv3dsProxyApiClient.ApiClient;

import com.opentech.acsemv3dsProxyApiClient.model.DetectTransactionLanguageWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.DetectTransactionLanguageWebResponse;
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


public abstract class ChallengeManagerControllerApi {

    private ApiClient apiClient;

    protected ApiClient getApiClient() {
        return apiClient;
    }

    protected void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public static final String detectTransactionLanguageUsingPOST ="/3ds/challenge/{issuer-code}/detectTransactionLanguage";
    public static final String evaluateChallengeStepUsingPOST1 ="/3ds/challenge/{issuer-code}/evaluateChallengeStep";
    public static final String initChallengeUsingPOST1 ="/3ds/challenge/{issuer-code}/initChallenge";
    public static final String isChallengeSupportedUsingPOST ="/3ds/challenge/{issuer-code}/isChallengeSupported";

    public abstract DetectTransactionLanguageWebResponse detectTransactionLanguageUsingPOST(DetectTransactionLanguageWebRequest detectTransactionLanguageWebRequest, String issuerCode) throws RestClientException;
    public abstract EvaluateChallengeStepCMWebResponse evaluateChallengeStepUsingPOST1(EvaluateChallengeStepCMWebRequest evaluateChallengeStepCMWebRequest, String issuerCode) throws RestClientException;
    public abstract InitChallengeCMWebResponse initChallengeUsingPOST1(InitChallengeCMWebRequest initChallengeCMWebRequest, String issuerCode) throws RestClientException;
    public abstract IsChallengeSupportedWebResponse isChallengeSupportedUsingPOST(IsChallengeSupportedWebRequest isChallengeSupportedWebRequest, String issuerCode) throws RestClientException;

    /**
     * detectTransactionLanguage
     * 
     * <p><b>200</b> - OK
     * @param detectTransactionLanguageWebRequest detectTransactionLanguageWebRequest
     * @param issuerCode issuer-code
     * @return DetectTransactionLanguageWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected DetectTransactionLanguageWebResponse detectTransactionLanguageUsingPOSTinternal(DetectTransactionLanguageWebRequest detectTransactionLanguageWebRequest, String issuerCode) throws RestClientException {
        Object postBody = detectTransactionLanguageWebRequest;
        
        // verify the required parameter 'detectTransactionLanguageWebRequest' is set
        if (detectTransactionLanguageWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'detectTransactionLanguageWebRequest' when calling detectTransactionLanguageUsingPOST");
        }
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling detectTransactionLanguageUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/challenge/{issuer-code}/detectTransactionLanguage").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DetectTransactionLanguageWebResponse> returnType = new ParameterizedTypeReference<DetectTransactionLanguageWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * evaluateChallengeStep
     * 
     * <p><b>200</b> - OK
     * @param evaluateChallengeStepCMWebRequest evaluateChallengeStepCMWebRequest
     * @param issuerCode issuer-code
     * @return EvaluateChallengeStepCMWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected EvaluateChallengeStepCMWebResponse evaluateChallengeStepUsingPOST1internal(EvaluateChallengeStepCMWebRequest evaluateChallengeStepCMWebRequest, String issuerCode) throws RestClientException {
        Object postBody = evaluateChallengeStepCMWebRequest;
        
        // verify the required parameter 'evaluateChallengeStepCMWebRequest' is set
        if (evaluateChallengeStepCMWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evaluateChallengeStepCMWebRequest' when calling evaluateChallengeStepUsingPOST1");
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
     * @param initChallengeCMWebRequest initChallengeCMWebRequest
     * @param issuerCode issuer-code
     * @return InitChallengeCMWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected InitChallengeCMWebResponse initChallengeUsingPOST1internal(InitChallengeCMWebRequest initChallengeCMWebRequest, String issuerCode) throws RestClientException {
        Object postBody = initChallengeCMWebRequest;
        
        // verify the required parameter 'initChallengeCMWebRequest' is set
        if (initChallengeCMWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'initChallengeCMWebRequest' when calling initChallengeUsingPOST1");
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
     * @param isChallengeSupportedWebRequest isChallengeSupportedWebRequest
     * @param issuerCode issuer-code
     * @return IsChallengeSupportedWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected IsChallengeSupportedWebResponse isChallengeSupportedUsingPOSTinternal(IsChallengeSupportedWebRequest isChallengeSupportedWebRequest, String issuerCode) throws RestClientException {
        Object postBody = isChallengeSupportedWebRequest;
        
        // verify the required parameter 'isChallengeSupportedWebRequest' is set
        if (isChallengeSupportedWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isChallengeSupportedWebRequest' when calling isChallengeSupportedUsingPOST");
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
