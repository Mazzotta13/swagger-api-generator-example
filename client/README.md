# acsemv3ds-ProxyApi-Client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.opentech</groupId>
    <artifactId>acsemv3ds-ProxyApi-Client</artifactId>
    <version>1.17-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.opentech:acsemv3ds-ProxyApi-Client:1.17-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/acsemv3ds-ProxyApi-Client-1.17-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.opentech.acsemv3dsProxyApiClient.*;
import com.opentech.acsemv3dsProxyApiClient.auth.*;
import com.opentech.acsemv3dsProxyApiClient.model.*;
import com.opentech.acsemv3dsProxyApiClient.api.AuthenticatorControllerApi;

import java.io.File;
import java.util.*;

public class AuthenticatorControllerApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080/acsemv3dsproxy*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticatorControllerApi* | [**checkAuthResultUsingPOST**](docs/AuthenticatorControllerApi.md#checkAuthResultUsingPOST) | **POST** /3ds/auth/{issuer-code}/checkAuthResult | checkAuthResult
*AuthenticatorControllerApi* | [**confirmWhitelistingResultsUsingPOST**](docs/AuthenticatorControllerApi.md#confirmWhitelistingResultsUsingPOST) | **POST** /3ds/auth/{issuer-code}/confirmWhitelistingResults | confirmWhitelistingResults
*AuthenticatorControllerApi* | [**evaluateAuthenticationUsingPOST**](docs/AuthenticatorControllerApi.md#evaluateAuthenticationUsingPOST) | **POST** /3ds/auth/{issuer-code}/evaluateAuthentication | evaluateAuthentication
*AuthenticatorControllerApi* | [**evaluateChallengeStepUsingPOST**](docs/AuthenticatorControllerApi.md#evaluateChallengeStepUsingPOST) | **POST** /3ds/auth/{issuer-code}/evaluateChallengeStep | evaluateChallengeStep
*AuthenticatorControllerApi* | [**initChallengeUsingPOST**](docs/AuthenticatorControllerApi.md#initChallengeUsingPOST) | **POST** /3ds/auth/{issuer-code}/initChallenge | initChallenge
*AuthenticatorControllerApi* | [**performDecoupledAuthenticationUsingPOST**](docs/AuthenticatorControllerApi.md#performDecoupledAuthenticationUsingPOST) | **POST** /3ds/auth/{issuer-code}/performDecoupledAuthentication | performDecoupledAuthentication
*AuthenticatorControllerApi* | [**resendChallengeUsingPOST**](docs/AuthenticatorControllerApi.md#resendChallengeUsingPOST) | **POST** /3ds/auth/{issuer-code}/resendChallenge | resendChallenge
*CardTokenizerControllerApi* | [**detokenizeUsingPOST**](docs/CardTokenizerControllerApi.md#detokenizeUsingPOST) | **POST** /3ds/{issuer-code}/detokenize | detokenize
*CardTokenizerControllerApi* | [**tokenizeUsingPOST**](docs/CardTokenizerControllerApi.md#tokenizeUsingPOST) | **POST** /3ds/{issuer-code}/tokenize | tokenize
*ChallengeManagerControllerApi* | [**evaluateChallengeStepUsingPOST1**](docs/ChallengeManagerControllerApi.md#evaluateChallengeStepUsingPOST1) | **POST** /3ds/challenge/{issuer-code}/evaluateChallengeStep | evaluateChallengeStep
*ChallengeManagerControllerApi* | [**initChallengeUsingPOST1**](docs/ChallengeManagerControllerApi.md#initChallengeUsingPOST1) | **POST** /3ds/challenge/{issuer-code}/initChallenge | initChallenge
*ChallengeManagerControllerApi* | [**isChallengeSupportedUsingPOST**](docs/ChallengeManagerControllerApi.md#isChallengeSupportedUsingPOST) | **POST** /3ds/challenge/{issuer-code}/isChallengeSupported | isChallengeSupported


## Documentation for Models

 - [AReq](docs/AReq.md)
 - [AppChallengeInfo](docs/AppChallengeInfo.md)
 - [BrowserChallengeInfo](docs/BrowserChallengeInfo.md)
 - [BrowserInfo](docs/BrowserInfo.md)
 - [CReq](docs/CReq.md)
 - [CResInfo](docs/CResInfo.md)
 - [CheckAuthResultWebRequest](docs/CheckAuthResultWebRequest.md)
 - [CheckAuthResultWebResponse](docs/CheckAuthResultWebResponse.md)
 - [ConfirmWhitelistingResultsWebRequest](docs/ConfirmWhitelistingResultsWebRequest.md)
 - [DetokenizeWebRequest](docs/DetokenizeWebRequest.md)
 - [DetokenizeWebResponse](docs/DetokenizeWebResponse.md)
 - [EvaluateAuthenticationWebRequest](docs/EvaluateAuthenticationWebRequest.md)
 - [EvaluateAuthenticationWebResponse](docs/EvaluateAuthenticationWebResponse.md)
 - [EvaluateChallengeStepAuthenticatorWebRequest](docs/EvaluateChallengeStepAuthenticatorWebRequest.md)
 - [EvaluateChallengeStepAuthenticatorWebResponse](docs/EvaluateChallengeStepAuthenticatorWebResponse.md)
 - [EvaluateChallengeStepCMWebRequest](docs/EvaluateChallengeStepCMWebRequest.md)
 - [EvaluateChallengeStepCMWebResponse](docs/EvaluateChallengeStepCMWebResponse.md)
 - [ExpectedChallengeType](docs/ExpectedChallengeType.md)
 - [Extension](docs/Extension.md)
 - [InitChallengeAuthenticatorWebRequest](docs/InitChallengeAuthenticatorWebRequest.md)
 - [InitChallengeAuthenticatorWebResponse](docs/InitChallengeAuthenticatorWebResponse.md)
 - [InitChallengeCMWebRequest](docs/InitChallengeCMWebRequest.md)
 - [InitChallengeCMWebResponse](docs/InitChallengeCMWebResponse.md)
 - [IsChallengeSupportedWebRequest](docs/IsChallengeSupportedWebRequest.md)
 - [IsChallengeSupportedWebResponse](docs/IsChallengeSupportedWebResponse.md)
 - [Mapstringstring](docs/Mapstringstring.md)
 - [PerformDecoupledAuthWebRequest](docs/PerformDecoupledAuthWebRequest.md)
 - [PerformDecoupledAuthWebResponse](docs/PerformDecoupledAuthWebResponse.md)
 - [Phone](docs/Phone.md)
 - [ResendChallengeWebRequest](docs/ResendChallengeWebRequest.md)
 - [ResendChallengeWebResponse](docs/ResendChallengeWebResponse.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [SdkEphemPubKey](docs/SdkEphemPubKey.md)
 - [ThreeDSAcsRenderingType](docs/ThreeDSAcsRenderingType.md)
 - [ThreeDSCardholderAccountInfo](docs/ThreeDSCardholderAccountInfo.md)
 - [ThreeDSImage](docs/ThreeDSImage.md)
 - [ThreeDSMerchantRiskIndicator](docs/ThreeDSMerchantRiskIndicator.md)
 - [ThreeDSRequestorAuthInfo](docs/ThreeDSRequestorAuthInfo.md)
 - [ThreeDSRequestorPriorAuthInfo](docs/ThreeDSRequestorPriorAuthInfo.md)
 - [ThreeDSSdkRenderingOptions](docs/ThreeDSSdkRenderingOptions.md)
 - [ThreeRIInfo](docs/ThreeRIInfo.md)
 - [TokenizeWebRequest](docs/TokenizeWebRequest.md)
 - [TokenizeWebResponse](docs/TokenizeWebResponse.md)
 - [TransactionInfo](docs/TransactionInfo.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



