package com.opentech.acsemv3dsProxyApiClient.api;

import com.opentech.acsemv3dsProxyApiClient.ApiClient;

import com.opentech.acsemv3dsProxyApiClient.model.DetokenizeWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.DetokenizeWebResponse;
import com.opentech.acsemv3dsProxyApiClient.model.TokenizeWebRequest;
import com.opentech.acsemv3dsProxyApiClient.model.TokenizeWebResponse;

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


public abstract class CardTokenizerControllerApi {

    private ApiClient apiClient;

    protected ApiClient getApiClient() {
        return apiClient;
    }

    protected void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public static final String detokenizeUsingPOST ="/3ds/{issuer-code}/detokenize";
    public static final String tokenizeUsingPOST ="/3ds/{issuer-code}/tokenize";

    public abstract DetokenizeWebResponse detokenizeUsingPOST(DetokenizeWebRequest detokenizeWebRequest, String issuerCode) throws RestClientException;
    public abstract TokenizeWebResponse tokenizeUsingPOST(String issuerCode, TokenizeWebRequest tokenizeWebRequest) throws RestClientException;

    /**
     * detokenize
     * 
     * <p><b>200</b> - OK
     * @param detokenizeWebRequest detokenizeWebRequest
     * @param issuerCode issuer-code
     * @return DetokenizeWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected DetokenizeWebResponse detokenizeUsingPOSTinternal(DetokenizeWebRequest detokenizeWebRequest, String issuerCode) throws RestClientException {
        Object postBody = detokenizeWebRequest;
        
        // verify the required parameter 'detokenizeWebRequest' is set
        if (detokenizeWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'detokenizeWebRequest' when calling detokenizeUsingPOST");
        }
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling detokenizeUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/{issuer-code}/detokenize").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DetokenizeWebResponse> returnType = new ParameterizedTypeReference<DetokenizeWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * tokenize
     * 
     * <p><b>200</b> - OK
     * @param issuerCode issuer-code
     * @param tokenizeWebRequest tokenizeWebRequest
     * @return TokenizeWebResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected TokenizeWebResponse tokenizeUsingPOSTinternal(String issuerCode, TokenizeWebRequest tokenizeWebRequest) throws RestClientException {
        Object postBody = tokenizeWebRequest;
        
        // verify the required parameter 'issuerCode' is set
        if (issuerCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issuerCode' when calling tokenizeUsingPOST");
        }
        
        // verify the required parameter 'tokenizeWebRequest' is set
        if (tokenizeWebRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenizeWebRequest' when calling tokenizeUsingPOST");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issuer-code", issuerCode);
        String path = UriComponentsBuilder.fromPath("/3ds/{issuer-code}/tokenize").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<TokenizeWebResponse> returnType = new ParameterizedTypeReference<TokenizeWebResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
