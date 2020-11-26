package com.opentech.acsemv3dsProxyApiClient.api;

import com.opentech.acsemv3dsProxyApiClient.ApiClient;

import com.opentech.acsemv3dsProxyApiClient.model.EvaluateAuthenticationWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.EvaluateAuthenticationWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.EvaluateChallengeStepAuthenticatorWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.EvaluateChallengeStepAuthenticatorWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.InitChallengeAuthenticatorWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.InitChallengeAuthenticatorWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.PerformDecoupledAuthWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.ResendChallengeWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.ResendChallengeWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.ResponseEntity;

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


@Component("com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi")
public class AuthenticatorControllerApi {
    private ApiClient apiClient;

    public AuthenticatorControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public AuthenticatorControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
    public EvaluateAuthenticationWebResponse evaluateAuthenticationUsingPOST(EvaluateAuthenticationWebRequest evaluateAuthenticationWebRequest, String issuerCode) throws RestClientException {
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
    public EvaluateChallengeStepAuthenticatorWebResponse evaluateChallengeStepUsingPOST(EvaluateChallengeStepAuthenticatorWebRequest evaluateChallengeStepAuthenticatorWebRequest, String issuerCode) throws RestClientException {
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
    public InitChallengeAuthenticatorWebResponse initChallengeUsingPOST(InitChallengeAuthenticatorWebRequest initChallengeAuthenticatorWebRequest, String issuerCode) throws RestClientException {
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
     * @return ResponseEntity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity performDecoupledAuthenticationUsingPOST(String issuerCode, PerformDecoupledAuthWebRequest performDecoupledAuthWebRequest) throws RestClientException {
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

        ParameterizedTypeReference<ResponseEntity> returnType = new ParameterizedTypeReference<ResponseEntity>() {};
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
    public ResendChallengeWebResponse resendChallengeUsingPOST(String issuerCode, ResendChallengeWebRequest resendChallengeWebRequest) throws RestClientException {
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
