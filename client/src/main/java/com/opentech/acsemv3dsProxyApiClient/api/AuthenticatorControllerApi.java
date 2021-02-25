package com.opentech.acsemv3dsProxyApiClient.api;

import com.opentech.acsemv3dsProxyApiClient.ApiClient;

import com.opentech.acsemv3dsProxyApiClient.model.CheckAuthResultWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.CheckAuthResultWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.EvaluateAuthenticationWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.EvaluateAuthenticationWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.EvaluateChallengeStepAuthenticatorWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.EvaluateChallengeStepAuthenticatorWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.InitChallengeAuthenticatorWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.InitChallengeAuthenticatorWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.PerformDecoupledAuthWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.PerformDecoupledAuthWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.PrepareAuthenticationCompletionWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.PrepareAuthenticationCompletionWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.ResendChallengeWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.ResendChallengeWebResponse;

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


public abstract class AuthenticatorControllerApi {

    private ApiClient apiClient;

    protected ApiClient getApiClient() {
        return apiClient;
    }

    protected void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public static final String checkAuthResultUsingPOST ="/3ds/auth/{issuer-code}/checkAuthResult";
    public static final String evaluateAuthenticationUsingPOST ="/3ds/auth/{issuer-code}/evaluateAuthentication";
    public static final String evaluateChallengeStepUsingPOST ="/3ds/auth/{issuer-code}/evaluateChallengeStep";
    public static final String initChallengeUsingPOST ="/3ds/auth/{issuer-code}/initChallenge";
    public static final String performDecoupledAuthenticationUsingPOST ="/3ds/auth/{issuer-code}/performDecoupledAuthentication";
    public static final String prepareAuthenticationCompletionUsingPOST ="/3ds/auth/{issuer-code}/prepareAuthenticationCompletion";
    public static final String resendChallengeUsingPOST ="/3ds/auth/{issuer-code}/resendChallenge";

    public abstract CheckAuthResultWebResponse checkAuthResultUsingPOST(CheckAuthResultWebRequest checkAuthResultWebRequest, String issuerCode) throws RestClientException;
    public abstract EvaluateAuthenticationWebResponse evaluateAuthenticationUsingPOST(EvaluateAuthenticationWebRequest evaluateAuthenticationWebRequest, String issuerCode) throws RestClientException;
    public abstract EvaluateChallengeStepAuthenticatorWebResponse evaluateChallengeStepUsingPOST(EvaluateChallengeStepAuthenticatorWebRequest evaluateChallengeStepAuthenticatorWebRequest, String issuerCode) throws RestClientException;
    public abstract InitChallengeAuthenticatorWebResponse initChallengeUsingPOST(InitChallengeAuthenticatorWebRequest initChallengeAuthenticatorWebRequest, String issuerCode) throws RestClientException;
    public abstract PerformDecoupledAuthWebResponse performDecoupledAuthenticationUsingPOST(String issuerCode, PerformDecoupledAuthWebRequest performDecoupledAuthWebRequest) throws RestClientException;
    public abstract PrepareAuthenticationCompletionWebResponse prepareAuthenticationCompletionUsingPOST(String issuerCode, PrepareAuthenticationCompletionWebRequest prepareAuthenticationCompletionWebRequest) throws RestClientException;
    public abstract ResendChallengeWebResponse resendChallengeUsingPOST(String issuerCode, ResendChallengeWebRequest resendChallengeWebRequest) throws RestClientException;

    /**
     * checkAuthResult
     * 
     * <p><b>200</b> - OK
     * @param checkAuthResultWebRequest checkAuthResultWebRequest
     * @param issuerCode issuer-code
     * @return CheckAuthResultWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected CheckAuthResultWebResponse checkAuthResultUsingPOSTinternal(CheckAuthResultWebRequest checkAuthResultWebRequest, String issuerCode) throws RestClientException {
        Object postBody = checkAuthResultWebRequest;
        
        // verify the required parameter 'checkAuthResultWebRequest' is set
        if (checkAuthResultWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkAuthResultWebRequest' when calling checkAuthResultUsingPOST");
        }
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling checkAuthResultUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/auth/{issuer-code}/checkAuthResult").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CheckAuthResultWebResponse> returnType = new ParameterizedTypeReference<CheckAuthResultWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * evaluateAuthentication
     * 
     * <p><b>200</b> - OK
     * @param evaluateAuthenticationWebRequest evaluateAuthenticationWebRequest
     * @param issuerCode issuer-code
     * @return EvaluateAuthenticationWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected EvaluateAuthenticationWebResponse evaluateAuthenticationUsingPOSTinternal(EvaluateAuthenticationWebRequest evaluateAuthenticationWebRequest, String issuerCode) throws RestClientException {
        Object postBody = evaluateAuthenticationWebRequest;
        
        // verify the required parameter 'evaluateAuthenticationWebRequest' is set
        if (evaluateAuthenticationWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evaluateAuthenticationWebRequest' when calling evaluateAuthenticationUsingPOST");
        }
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling evaluateAuthenticationUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/auth/{issuer-code}/evaluateAuthentication").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<EvaluateAuthenticationWebResponse> returnType = new ParameterizedTypeReference<EvaluateAuthenticationWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * evaluateChallengeStep
     * 
     * <p><b>200</b> - OK
     * @param evaluateChallengeStepAuthenticatorWebRequest evaluateChallengeStepAuthenticatorWebRequest
     * @param issuerCode issuer-code
     * @return EvaluateChallengeStepAuthenticatorWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected EvaluateChallengeStepAuthenticatorWebResponse evaluateChallengeStepUsingPOSTinternal(EvaluateChallengeStepAuthenticatorWebRequest evaluateChallengeStepAuthenticatorWebRequest, String issuerCode) throws RestClientException {
        Object postBody = evaluateChallengeStepAuthenticatorWebRequest;
        
        // verify the required parameter 'evaluateChallengeStepAuthenticatorWebRequest' is set
        if (evaluateChallengeStepAuthenticatorWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evaluateChallengeStepAuthenticatorWebRequest' when calling evaluateChallengeStepUsingPOST");
        }
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling evaluateChallengeStepUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/auth/{issuer-code}/evaluateChallengeStep").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<EvaluateChallengeStepAuthenticatorWebResponse> returnType = new ParameterizedTypeReference<EvaluateChallengeStepAuthenticatorWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * initChallenge
     * 
     * <p><b>200</b> - OK
     * @param initChallengeAuthenticatorWebRequest initChallengeAuthenticatorWebRequest
     * @param issuerCode issuer-code
     * @return InitChallengeAuthenticatorWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected InitChallengeAuthenticatorWebResponse initChallengeUsingPOSTinternal(InitChallengeAuthenticatorWebRequest initChallengeAuthenticatorWebRequest, String issuerCode) throws RestClientException {
        Object postBody = initChallengeAuthenticatorWebRequest;
        
        // verify the required parameter 'initChallengeAuthenticatorWebRequest' is set
        if (initChallengeAuthenticatorWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'initChallengeAuthenticatorWebRequest' when calling initChallengeUsingPOST");
        }
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling initChallengeUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/auth/{issuer-code}/initChallenge").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InitChallengeAuthenticatorWebResponse> returnType = new ParameterizedTypeReference<InitChallengeAuthenticatorWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * performDecoupledAuthentication
     * 
     * <p><b>200</b> - OK
     * @param issuerCode issuer-code
     * @param performDecoupledAuthWebRequest performDecoupledAuthWebRequest
     * @return PerformDecoupledAuthWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected PerformDecoupledAuthWebResponse performDecoupledAuthenticationUsingPOSTinternal(String issuerCode, PerformDecoupledAuthWebRequest performDecoupledAuthWebRequest) throws RestClientException {
        Object postBody = performDecoupledAuthWebRequest;
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling performDecoupledAuthenticationUsingPOST");
        }
        
        // verify the required parameter 'performDecoupledAuthWebRequest' is set
        if (performDecoupledAuthWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'performDecoupledAuthWebRequest' when calling performDecoupledAuthenticationUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/auth/{issuer-code}/performDecoupledAuthentication").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PerformDecoupledAuthWebResponse> returnType = new ParameterizedTypeReference<PerformDecoupledAuthWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * prepareAuthenticationCompletion
     * 
     * <p><b>200</b> - OK
     * @param issuerCode issuer-code
     * @param prepareAuthenticationCompletionWebRequest prepareAuthenticationCompletionWebRequest
     * @return PrepareAuthenticationCompletionWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected PrepareAuthenticationCompletionWebResponse prepareAuthenticationCompletionUsingPOSTinternal(String issuerCode, PrepareAuthenticationCompletionWebRequest prepareAuthenticationCompletionWebRequest) throws RestClientException {
        Object postBody = prepareAuthenticationCompletionWebRequest;
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling prepareAuthenticationCompletionUsingPOST");
        }
        
        // verify the required parameter 'prepareAuthenticationCompletionWebRequest' is set
        if (prepareAuthenticationCompletionWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'prepareAuthenticationCompletionWebRequest' when calling prepareAuthenticationCompletionUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/auth/{issuer-code}/prepareAuthenticationCompletion").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PrepareAuthenticationCompletionWebResponse> returnType = new ParameterizedTypeReference<PrepareAuthenticationCompletionWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * resendChallenge
     * 
     * <p><b>200</b> - OK
     * @param issuerCode issuer-code
     * @param resendChallengeWebRequest resendChallengeWebRequest
     * @return ResendChallengeWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected ResendChallengeWebResponse resendChallengeUsingPOSTinternal(String issuerCode, ResendChallengeWebRequest resendChallengeWebRequest) throws RestClientException {
        Object postBody = resendChallengeWebRequest;
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling resendChallengeUsingPOST");
        }
        
        // verify the required parameter 'resendChallengeWebRequest' is set
        if (resendChallengeWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resendChallengeWebRequest' when calling resendChallengeUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/auth/{issuer-code}/resendChallenge").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ResendChallengeWebResponse> returnType = new ParameterizedTypeReference<ResendChallengeWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
