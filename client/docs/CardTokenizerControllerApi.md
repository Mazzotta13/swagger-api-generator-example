# CardTokenizerControllerApi

All URIs are relative to *//localhost:8080/acsemv3dsproxy*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detokenizeUsingPOST**](CardTokenizerControllerApi.md#detokenizeUsingPOST) | **POST** /3ds/{issuer-code}/detokenize | detokenize
[**tokenizeUsingPOST**](CardTokenizerControllerApi.md#tokenizeUsingPOST) | **POST** /3ds/{issuer-code}/tokenize | tokenize

<a name="detokenizeUsingPOST"></a>
# **detokenizeUsingPOST**
> DetokenizeWebResponse detokenizeUsingPOST(body, issuerCode)

detokenize

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.CardTokenizerControllerApi;


CardTokenizerControllerApi apiInstance = new CardTokenizerControllerApi();
DetokenizeWebRequest body = new DetokenizeWebRequest(); // DetokenizeWebRequest | detokenizeWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    DetokenizeWebResponse result = apiInstance.detokenizeUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardTokenizerControllerApi#detokenizeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DetokenizeWebRequest**](DetokenizeWebRequest.md)| detokenizeWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**DetokenizeWebResponse**](DetokenizeWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tokenizeUsingPOST"></a>
# **tokenizeUsingPOST**
> TokenizeWebResponse tokenizeUsingPOST(body, issuerCode)

tokenize

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.CardTokenizerControllerApi;


CardTokenizerControllerApi apiInstance = new CardTokenizerControllerApi();
TokenizeWebRequest body = new TokenizeWebRequest(); // TokenizeWebRequest | tokenizeWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    TokenizeWebResponse result = apiInstance.tokenizeUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardTokenizerControllerApi#tokenizeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TokenizeWebRequest**](TokenizeWebRequest.md)| tokenizeWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**TokenizeWebResponse**](TokenizeWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

