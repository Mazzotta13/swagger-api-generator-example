# ChallengeManagerControllerApi

All URIs are relative to *https://localhost:8080/acsemv3dsproxy*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detectTransactionLanguageUsingPOST**](ChallengeManagerControllerApi.md#detectTransactionLanguageUsingPOST) | **POST** /3ds/challenge/{issuer-code}/detectTransactionLanguage | detectTransactionLanguage
[**evaluateChallengeStepUsingPOST1**](ChallengeManagerControllerApi.md#evaluateChallengeStepUsingPOST1) | **POST** /3ds/challenge/{issuer-code}/evaluateChallengeStep | evaluateChallengeStep
[**initChallengeUsingPOST1**](ChallengeManagerControllerApi.md#initChallengeUsingPOST1) | **POST** /3ds/challenge/{issuer-code}/initChallenge | initChallenge
[**isChallengeSupportedUsingPOST**](ChallengeManagerControllerApi.md#isChallengeSupportedUsingPOST) | **POST** /3ds/challenge/{issuer-code}/isChallengeSupported | isChallengeSupported


<a name="detectTransactionLanguageUsingPOST"></a>
# **detectTransactionLanguageUsingPOST**
> DetectTransactionLanguageWebResponse detectTransactionLanguageUsingPOST(detectTransactionLanguageWebRequest, issuerCode)

detectTransactionLanguage

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.ChallengeManagerControllerApi;


ChallengeManagerControllerApi apiInstance = new ChallengeManagerControllerApi();
DetectTransactionLanguageWebRequest detectTransactionLanguageWebRequest = new DetectTransactionLanguageWebRequest(); // DetectTransactionLanguageWebRequest | detectTransactionLanguageWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    DetectTransactionLanguageWebResponse result = apiInstance.detectTransactionLanguageUsingPOST(detectTransactionLanguageWebRequest, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeManagerControllerApi#detectTransactionLanguageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **detectTransactionLanguageWebRequest** | [**DetectTransactionLanguageWebRequest**](DetectTransactionLanguageWebRequest.md)| detectTransactionLanguageWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**DetectTransactionLanguageWebResponse**](DetectTransactionLanguageWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="evaluateChallengeStepUsingPOST1"></a>
# **evaluateChallengeStepUsingPOST1**
> EvaluateChallengeStepCMWebResponse evaluateChallengeStepUsingPOST1(evaluateChallengeStepCMWebRequest, issuerCode)

evaluateChallengeStep

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.ChallengeManagerControllerApi;


ChallengeManagerControllerApi apiInstance = new ChallengeManagerControllerApi();
EvaluateChallengeStepCMWebRequest evaluateChallengeStepCMWebRequest = new EvaluateChallengeStepCMWebRequest(); // EvaluateChallengeStepCMWebRequest | evaluateChallengeStepCMWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    EvaluateChallengeStepCMWebResponse result = apiInstance.evaluateChallengeStepUsingPOST1(evaluateChallengeStepCMWebRequest, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeManagerControllerApi#evaluateChallengeStepUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **evaluateChallengeStepCMWebRequest** | [**EvaluateChallengeStepCMWebRequest**](EvaluateChallengeStepCMWebRequest.md)| evaluateChallengeStepCMWebRequest |
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
> InitChallengeCMWebResponse initChallengeUsingPOST1(initChallengeCMWebRequest, issuerCode)

initChallenge

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.ChallengeManagerControllerApi;


ChallengeManagerControllerApi apiInstance = new ChallengeManagerControllerApi();
InitChallengeCMWebRequest initChallengeCMWebRequest = new InitChallengeCMWebRequest(); // InitChallengeCMWebRequest | initChallengeCMWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    InitChallengeCMWebResponse result = apiInstance.initChallengeUsingPOST1(initChallengeCMWebRequest, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeManagerControllerApi#initChallengeUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **initChallengeCMWebRequest** | [**InitChallengeCMWebRequest**](InitChallengeCMWebRequest.md)| initChallengeCMWebRequest |
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
> IsChallengeSupportedWebResponse isChallengeSupportedUsingPOST(isChallengeSupportedWebRequest, issuerCode)

isChallengeSupported

### Example
```java
// Import classes:
//import com.opentech.acsemv3dsProxyApiClient.ApiException;
//import com.opentech.acsemv3dsProxyApiClient.api.ChallengeManagerControllerApi;


ChallengeManagerControllerApi apiInstance = new ChallengeManagerControllerApi();
IsChallengeSupportedWebRequest isChallengeSupportedWebRequest = new IsChallengeSupportedWebRequest(); // IsChallengeSupportedWebRequest | isChallengeSupportedWebRequest
String issuerCode = "issuerCode_example"; // String | issuer-code
try {
    IsChallengeSupportedWebResponse result = apiInstance.isChallengeSupportedUsingPOST(isChallengeSupportedWebRequest, issuerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChallengeManagerControllerApi#isChallengeSupportedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isChallengeSupportedWebRequest** | [**IsChallengeSupportedWebRequest**](IsChallengeSupportedWebRequest.md)| isChallengeSupportedWebRequest |
 **issuerCode** | **String**| issuer-code |

### Return type

[**IsChallengeSupportedWebResponse**](IsChallengeSupportedWebResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

