
# EvaluateAuthenticationWebResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationName** | **String** |  |  [optional]
**authenticationResult** | [**AuthenticationResultEnum**](#AuthenticationResultEnum) |  |  [optional]
**cardEnrolled** | **Boolean** |  |  [optional]
**challengeMandatory** | **Boolean** |  |  [optional]


<a name="AuthenticationResultEnum"></a>
## Enum: AuthenticationResultEnum
Name | Value
---- | -----
CHALLENGE_NEEDED | &quot;CHALLENGE_NEEDED&quot;
AUTHENTICATED | &quot;AUTHENTICATED&quot;
UNABLE_TO_AUTHENTICATE | &quot;UNABLE_TO_AUTHENTICATE&quot;
NOT_AUTHENTICATED | &quot;NOT_AUTHENTICATED&quot;
AUTHENTICATION_ATTEMPT | &quot;AUTHENTICATION_ATTEMPT&quot;
REJECTED | &quot;REJECTED&quot;
INFORMATIONAL_OK | &quot;INFORMATIONAL_OK&quot;
INFORMATIONAL_DENIED | &quot;INFORMATIONAL_DENIED&quot;
DECOUPLED_AUTHENTICATION | &quot;DECOUPLED_AUTHENTICATION&quot;



