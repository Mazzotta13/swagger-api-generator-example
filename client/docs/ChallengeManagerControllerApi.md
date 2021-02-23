# ChallengeManagerControllerApi

All URIs are relative to *//localhost:8080/acsemv3dsproxy*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evaluateChallengeStepUsingPOST1**](ChallengeManagerControllerApi.md#evaluateChallengeStepUsingPOST1) | **POST** /3ds/challenge/{issuer-code}/evaluateChallengeStep | evaluateChallengeStep
[**initChallengeUsingPOST1**](ChallengeManagerControllerApi.md#initChallengeUsingPOST1) | **POST** /3ds/challenge/{issuer-code}/initChallenge | initChallenge
[**isChallengeSupportedUsingPOST**](ChallengeManagerControllerApi.md#isChallengeSupportedUsingPOST) | **POST** /3ds/challenge/{issuer-code}/isChallengeSupported | isChallengeSupported

<a name="evaluateChallengeStepUsingPOST1"></a>
# **evaluateChallengeStepUsingPOST1**
> EvaluateChallengeStepCMWebResponse evaluateChallengeStepUsingPOST1(body, issuerCode)

evaluateChallengeStep

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.ChallengeManagerControllerApi;


ChallengeManagerControllerApi apiInstance = new ChallengeManagerControllerApi();
EvaluateChallengeStepCMWebRequest body = new EvaluateChallengeStepCMWebRequest(); // EvaluateChallengeStepCMWebRequest | evaluateChallengeStepCMWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    EvaluateChallengeStepCMWebResponse result = apiInstance.evaluateChallengeStepUsingPOST1(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeManagerControllerApi#evaluateChallengeStepUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EvaluateChallengeStepCMWebRequest**](EvaluateChallengeStepCMWebRequest.md)| evaluateChallengeStepCMWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**EvaluateChallengeStepCMWebResponse**](EvaluateChallengeStepCMWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="initChallengeUsingPOST1"></a>
# **initChallengeUsingPOST1**
> InitChallengeCMWebResponse initChallengeUsingPOST1(body, issuerCode)

initChallenge

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.ChallengeManagerControllerApi;


ChallengeManagerControllerApi apiInstance = new ChallengeManagerControllerApi();
InitChallengeCMWebRequest body = new InitChallengeCMWebRequest(); // InitChallengeCMWebRequest | initChallengeCMWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    InitChallengeCMWebResponse result = apiInstance.initChallengeUsingPOST1(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeManagerControllerApi#initChallengeUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InitChallengeCMWebRequest**](InitChallengeCMWebRequest.md)| initChallengeCMWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**InitChallengeCMWebResponse**](InitChallengeCMWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="isChallengeSupportedUsingPOST"></a>
# **isChallengeSupportedUsingPOST**
> IsChallengeSupportedWebResponse isChallengeSupportedUsingPOST(body, issuerCode)

isChallengeSupported

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.ChallengeManagerControllerApi;


ChallengeManagerControllerApi apiInstance = new ChallengeManagerControllerApi();
IsChallengeSupportedWebRequest body = new IsChallengeSupportedWebRequest(); // IsChallengeSupportedWebRequest | isChallengeSupportedWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    IsChallengeSupportedWebResponse result = apiInstance.isChallengeSupportedUsingPOST(body, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeManagerControllerApi#isChallengeSupportedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IsChallengeSupportedWebRequest**](IsChallengeSupportedWebRequest.md)| isChallengeSupportedWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**IsChallengeSupportedWebResponse**](IsChallengeSupportedWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

