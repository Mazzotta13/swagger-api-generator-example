
# EvaluateAuthenticationWebResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationName** | **String** |  |  [optional]
**authenticationResult** | [**AuthenticationResultEnum**](#AuthenticationResultEnum) |  |  [optional]
**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) |  |  [optional]
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


<a name="AuthenticationTypeEnum"></a>
## Enum: AuthenticationTypeEnum
Name | Value
---- | -----
_01_NAME_STATIC_ORDINAL_0_ | &quot;AuthenticationType{code&#x3D;01, name&#x3D;STATIC, ordinal&#x3D;0}&quot;
_02_NAME_DYNAMIC_ORDINAL_1_ | &quot;AuthenticationType{code&#x3D;02, name&#x3D;DYNAMIC, ordinal&#x3D;1}&quot;
_03_NAME_OOB_ORDINAL_2_ | &quot;AuthenticationType{code&#x3D;03, name&#x3D;OOB, ordinal&#x3D;2}&quot;



