package com.alessio.exampleApiClient.api;

import com.alessio.exampleApiClient.ApiClient;

import com.alessio.exampleApiClient.model.ModelAndView;

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


public abstract class BasicErrorControllerApi {

    private ApiClient apiClient;

    protected ApiClient getApiClient() {
        return apiClient;
    }

    protected void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public static final String errorHtmlUsingDELETE ="/error";
    public static final String errorHtmlUsingGET ="/error";
    public static final String errorHtmlUsingHEAD ="/error";
    public static final String errorHtmlUsingOPTIONS ="/error";
    public static final String errorHtmlUsingPATCH ="/error";
    public static final String errorHtmlUsingPOST ="/error";
    public static final String errorHtmlUsingPUT ="/error";

    public abstract ModelAndView errorHtmlUsingDELETE() throws RestClientException;
    public abstract ModelAndView errorHtmlUsingGET() throws RestClientException;
    public abstract ModelAndView errorHtmlUsingHEAD() throws RestClientException;
    public abstract ModelAndView errorHtmlUsingOPTIONS() throws RestClientException;
    public abstract ModelAndView errorHtmlUsingPATCH() throws RestClientException;
    public abstract ModelAndView errorHtmlUsingPOST() throws RestClientException;
    public abstract ModelAndView errorHtmlUsingPUT() throws RestClientException;

    /**
     * errorHtml
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @return ModelAndView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected ModelAndView errorHtmlUsingDELETEinternal() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/error").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "text/html"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ModelAndView> returnType = new ParameterizedTypeReference<ModelAndView>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * errorHtml
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return ModelAndView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected ModelAndView errorHtmlUsingGETinternal() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/error").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "text/html"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ModelAndView> returnType = new ParameterizedTypeReference<ModelAndView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * errorHtml
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @return ModelAndView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected ModelAndView errorHtmlUsingHEADinternal() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/error").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "text/html"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ModelAndView> returnType = new ParameterizedTypeReference<ModelAndView>() {};
        return apiClient.invokeAPI(path, HttpMethod.HEAD, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * errorHtml
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @return ModelAndView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected ModelAndView errorHtmlUsingOPTIONSinternal() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/error").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "text/html"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ModelAndView> returnType = new ParameterizedTypeReference<ModelAndView>() {};
        return apiClient.invokeAPI(path, HttpMethod.OPTIONS, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * errorHtml
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * @return ModelAndView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected ModelAndView errorHtmlUsingPATCHinternal() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/error").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "text/html"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ModelAndView> returnType = new ParameterizedTypeReference<ModelAndView>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * errorHtml
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return ModelAndView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected ModelAndView errorHtmlUsingPOSTinternal() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/error").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "text/html"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ModelAndView> returnType = new ParameterizedTypeReference<ModelAndView>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * errorHtml
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return ModelAndView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    protected ModelAndView errorHtmlUsingPUTinternal() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/error").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "text/html"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ModelAndView> returnType = new ParameterizedTypeReference<ModelAndView>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
