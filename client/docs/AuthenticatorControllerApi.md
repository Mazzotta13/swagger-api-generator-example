# AuthenticatorControllerApi

All URIs are relative to *//localhost:8080/acsemv3dsproxy*

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
> CheckAuthResultWebResponse checkAuthResultUsingPOST(body, issuerCode)

checkAuthResult

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
CheckAuthResultWebRequest body = new CheckAuthResultWebRequest(); // CheckAuthResultWebRequest | checkAuthResultWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    CheckAuthResultWebResponse result = apiInstance.checkAuthResultUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#checkAuthResultUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CheckAuthResultWebRequest**](CheckAuthResultWebRequest.md)| checkAuthResultWebRequest |
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
> EvaluateAuthenticationWebResponse evaluateAuthenticationUsingPOST(body, issuerCode)

evaluateAuthentication

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
EvaluateAuthenticationWebRequest body = new EvaluateAuthenticationWebRequest(); // EvaluateAuthenticationWebRequest | evaluateAuthenticationWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    EvaluateAuthenticationWebResponse result = apiInstance.evaluateAuthenticationUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#evaluateAuthenticationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EvaluateAuthenticationWebRequest**](EvaluateAuthenticationWebRequest.md)| evaluateAuthenticationWebRequest |
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
> EvaluateChallengeStepAuthenticatorWebResponse evaluateChallengeStepUsingPOST(body, issuerCode)

evaluateChallengeStep

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
EvaluateChallengeStepAuthenticatorWebRequest body = new EvaluateChallengeStepAuthenticatorWebRequest(); // EvaluateChallengeStepAuthenticatorWebRequest | evaluateChallengeStepAuthenticatorWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    EvaluateChallengeStepAuthenticatorWebResponse result = apiInstance.evaluateChallengeStepUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#evaluateChallengeStepUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EvaluateChallengeStepAuthenticatorWebRequest**](EvaluateChallengeStepAuthenticatorWebRequest.md)| evaluateChallengeStepAuthenticatorWebRequest |
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
> InitChallengeAuthenticatorWebResponse initChallengeUsingPOST(body, issuerCode)

initChallenge

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
InitChallengeAuthenticatorWebRequest body = new InitChallengeAuthenticatorWebRequest(); // InitChallengeAuthenticatorWebRequest | initChallengeAuthenticatorWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    InitChallengeAuthenticatorWebResponse result = apiInstance.initChallengeUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#initChallengeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InitChallengeAuthenticatorWebRequest**](InitChallengeAuthenticatorWebRequest.md)| initChallengeAuthenticatorWebRequest |
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
> PerformDecoupledAuthWebResponse performDecoupledAuthenticationUsingPOST(body, issuerCode)

performDecoupledAuthentication

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
PerformDecoupledAuthWebRequest body = new PerformDecoupledAuthWebRequest(); // PerformDecoupledAuthWebRequest | performDecoupledAuthWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    PerformDecoupledAuthWebResponse result = apiInstance.performDecoupledAuthenticationUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#performDecoupledAuthenticationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PerformDecoupledAuthWebRequest**](PerformDecoupledAuthWebRequest.md)| performDecoupledAuthWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**PerformDecoupledAuthWebResponse**](PerformDecoupledAuthWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="prepareAuthenticationCompletionUsingPOST"></a>
# **prepareAuthenticationCompletionUsingPOST**
> PrepareAuthenticationCompletionWebResponse prepareAuthenticationCompletionUsingPOST(body, issuerCode)

prepareAuthenticationCompletion

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
PrepareAuthenticationCompletionWebRequest body = new PrepareAuthenticationCompletionWebRequest(); // PrepareAuthenticationCompletionWebRequest | prepareAuthenticationCompletionWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    PrepareAuthenticationCompletionWebResponse result = apiInstance.prepareAuthenticationCompletionUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#prepareAuthenticationCompletionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrepareAuthenticationCompletionWebRequest**](PrepareAuthenticationCompletionWebRequest.md)| prepareAuthenticationCompletionWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**PrepareAuthenticationCompletionWebResponse**](PrepareAuthenticationCompletionWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendChallengeUsingPOST"></a>
# **resendChallengeUsingPOST**
> ResendChallengeWebResponse resendChallengeUsingPOST(body, issuerCode)

resendChallenge

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;


AuthenticatorControllerApi apiInstance = new AuthenticatorControllerApi();
ResendChallengeWebRequest body = new ResendChallengeWebRequest(); // ResendChallengeWebRequest | resendChallengeWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    ResendChallengeWebResponse result = apiInstance.resendChallengeUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticatorControllerApi#resendChallengeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResendChallengeWebRequest**](ResendChallengeWebRequest.md)| resendChallengeWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**ResendChallengeWebResponse**](ResendChallengeWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

