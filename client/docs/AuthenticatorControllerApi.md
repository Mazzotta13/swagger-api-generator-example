# AuthenticatorControllerApi

All URIs are relative to *https://localhost:8080/acsemv3dsproxy*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkAuthResultUsingPOST**](AuthenticatorControllerApi.md#checkAuthResultUsingPOST) | **POST** /3ds/auth/{issuer-code}/checkAuthResult | checkAuthResult
[**evaluateAuthenticationUsingPOST**](AuthenticatorControllerApi.md#evaluateAuthenticationUsingPOST) | **POST** /3ds/auth/{issuer-code}/evaluateAuthentication | evaluateAuthentication
[**evaluateChallengeStepUsingPOST**](AuthenticatorControllerApi.md#evaluateChallengeStepUsingPOST) | **POST** /3ds/auth/{issuer-code}/evaluateChallengeStep | evaluateChallengeStep
[**initChallengeUsingPOST**](AuthenticatorControllerApi.md#initChallengeUsingPOST) | **POST** /3ds/auth/{issuer-code}/initChallenge | initChallenge
[**performDecoupledAuthenticationUsingPOST**](AuthenticatorControllerApi.md#performDecoupledAuthenticationUsingPOST) | **POST** /3ds/auth/{issuer-code}/performDecoupledAuthentication | performDecoupledAuthentication
[**prepareAuthenticationCompletionUsingPOST**](AuthenticatorControllerApi.md#prepareAuthenticationCompletionUsingPOST) | **POST** /3ds/auth/{issuer-code}/prepareAuthenticationCompletion | prepareAuthenticationCompletion
[**resendChallengeUsingPOST**](AuthenticatorControllerApi.md#resendChallengeUsingPOST) | **POST** /3ds/auth/{issuer-code}/resendChallenge | resendChallenge


<a name="checkAuthResultUsingPOST"></a>
# **checkAuthResultUsingPOST**
> CheckAuthResultWebResponse checkAuthResultUsingPOST(checkAuthResultWebRequest, issuerCode)

checkAuthResult

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
CheckAuthResultWebRequest checkAuthResultWebRequest = new CheckAuthResultWebRequest(); // CheckAuthResultWebRequest | checkAuthResultWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    CheckAuthResultWebResponse result = apiInstance.checkAuthResultUsingPOST(checkAuthResultWebRequest, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#checkAuthResultUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkAuthResultWebRequest** | [**CheckAuthResultWebRequest**](CheckAuthResultWebRequest.md)| checkAuthResultWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**CheckAuthResultWebResponse**](CheckAuthResultWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="evaluateAuthenticationUsingPOST"></a>
# **evaluateAuthenticationUsingPOST**
> EvaluateAuthenticationWebResponse evaluateAuthenticationUsingPOST(evaluateAuthenticationWebRequest, issuerCode)

evaluateAuthentication

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
EvaluateAuthenticationWebRequest evaluateAuthenticationWebRequest = new EvaluateAuthenticationWebRequest(); // EvaluateAuthenticationWebRequest | evaluateAuthenticationWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    EvaluateAuthenticationWebResponse result = apiInstance.evaluateAuthenticationUsingPOST(evaluateAuthenticationWebRequest, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#evaluateAuthenticationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **evaluateAuthenticationWebRequest** | [**EvaluateAuthenticationWebRequest**](EvaluateAuthenticationWebRequest.md)| evaluateAuthenticationWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**EvaluateAuthenticationWebResponse**](EvaluateAuthenticationWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="evaluateChallengeStepUsingPOST"></a>
# **evaluateChallengeStepUsingPOST**
> EvaluateChallengeStepAuthenticatorWebResponse evaluateChallengeStepUsingPOST(evaluateChallengeStepAuthenticatorWebRequest, issuerCode)

evaluateChallengeStep

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
EvaluateChallengeStepAuthenticatorWebRequest evaluateChallengeStepAuthenticatorWebRequest = new EvaluateChallengeStepAuthenticatorWebRequest(); // EvaluateChallengeStepAuthenticatorWebRequest | evaluateChallengeStepAuthenticatorWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    EvaluateChallengeStepAuthenticatorWebResponse result = apiInstance.evaluateChallengeStepUsingPOST(evaluateChallengeStepAuthenticatorWebRequest, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#evaluateChallengeStepUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **evaluateChallengeStepAuthenticatorWebRequest** | [**EvaluateChallengeStepAuthenticatorWebRequest**](EvaluateChallengeStepAuthenticatorWebRequest.md)| evaluateChallengeStepAuthenticatorWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**EvaluateChallengeStepAuthenticatorWebResponse**](EvaluateChallengeStepAuthenticatorWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="initChallengeUsingPOST"></a>
# **initChallengeUsingPOST**
> InitChallengeAuthenticatorWebResponse initChallengeUsingPOST(initChallengeAuthenticatorWebRequest, issuerCode)

initChallenge

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
InitChallengeAuthenticatorWebRequest initChallengeAuthenticatorWebRequest = new InitChallengeAuthenticatorWebRequest(); // InitChallengeAuthenticatorWebRequest | initChallengeAuthenticatorWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    InitChallengeAuthenticatorWebResponse result = apiInstance.initChallengeUsingPOST(initChallengeAuthenticatorWebRequest, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#initChallengeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **initChallengeAuthenticatorWebRequest** | [**InitChallengeAuthenticatorWebRequest**](InitChallengeAuthenticatorWebRequest.md)| initChallengeAuthenticatorWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**InitChallengeAuthenticatorWebResponse**](InitChallengeAuthenticatorWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="performDecoupledAuthenticationUsingPOST"></a>
# **performDecoupledAuthenticationUsingPOST**
> PerformDecoupledAuthWebResponse performDecoupledAuthenticationUsingPOST(issuerCode, performDecoupledAuthWebRequest)

performDecoupledAuthentication

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
String issuerCode = "issuerCode_example"; // String | issuer-code
PerformDecoupledAuthWebRequest performDecoupledAuthWebRequest = new PerformDecoupledAuthWebRequest(); // PerformDecoupledAuthWebRequest | performDecoupledAuthWebRequest
try {
    PerformDecoupledAuthWebResponse result = apiInstance.performDecoupledAuthenticationUsingPOST(issuerCode, performDecoupledAuthWebRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#performDecoupledAuthenticationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issuerCode** | **String**| issuer-code |
 **performDecoupledAuthWebRequest** | [**PerformDecoupledAuthWebRequest**](PerformDecoupledAuthWebRequest.md)| performDecoupledAuthWebRequest |

### Return type

[**PerformDecoupledAuthWebResponse**](PerformDecoupledAuthWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="prepareAuthenticationCompletionUsingPOST"></a>
# **prepareAuthenticationCompletionUsingPOST**
> PrepareAuthenticationCompletionWebResponse prepareAuthenticationCompletionUsingPOST(issuerCode, prepareAuthenticationCompletionWebRequest)

prepareAuthenticationCompletion

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
String issuerCode = "issuerCode_example"; // String | issuer-code
PrepareAuthenticationCompletionWebRequest prepareAuthenticationCompletionWebRequest = new PrepareAuthenticationCompletionWebRequest(); // PrepareAuthenticationCompletionWebRequest | prepareAuthenticationCompletionWebRequest
try {
    PrepareAuthenticationCompletionWebResponse result = apiInstance.prepareAuthenticationCompletionUsingPOST(issuerCode, prepareAuthenticationCompletionWebRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#prepareAuthenticationCompletionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issuerCode** | **String**| issuer-code |
 **prepareAuthenticationCompletionWebRequest** | [**PrepareAuthenticationCompletionWebRequest**](PrepareAuthenticationCompletionWebRequest.md)| prepareAuthenticationCompletionWebRequest |

### Return type

[**PrepareAuthenticationCompletionWebResponse**](PrepareAuthenticationCompletionWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendChallengeUsingPOST"></a>
# **resendChallengeUsingPOST**
> ResendChallengeWebResponse resendChallengeUsingPOST(issuerCode, resendChallengeWebRequest)

resendChallenge

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
String issuerCode = "issuerCode_example"; // String | issuer-code
ResendChallengeWebRequest resendChallengeWebRequest = new ResendChallengeWebRequest(); // ResendChallengeWebRequest | resendChallengeWebRequest
try {
    ResendChallengeWebResponse result = apiInstance.resendChallengeUsingPOST(issuerCode, resendChallengeWebRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#resendChallengeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issuerCode** | **String**| issuer-code |
 **resendChallengeWebRequest** | [**ResendChallengeWebRequest**](ResendChallengeWebRequest.md)| resendChallengeWebRequest |

### Return type

[**ResendChallengeWebResponse**](ResendChallengeWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

