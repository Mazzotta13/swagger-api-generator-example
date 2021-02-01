
# EvaluateAuthenticationWebResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationMethod** | [**AuthenticationMethodEnum**](#AuthenticationMethodEnum) |  |  [optional]
**authenticationName** | **String** |  |  [optional]
**authenticationResult** | [**AuthenticationResultEnum**](#AuthenticationResultEnum) |  |  [optional]
**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) |  |  [optional]
**cardEnrolled** | **Boolean** |  |  [optional]
**cardholderInfo** | **String** |  |  [optional]
**challengeMandatory** | **Boolean** |  |  [optional]
**transactionStatusReason** | [**TransactionStatusReasonEnum**](#TransactionStatusReasonEnum) |  |  [optional]


<a name="AuthenticationMethodEnum"></a>
## Enum: AuthenticationMethodEnum
Name | Value
---- | -----
PASSCODE | &quot;PASSCODE&quot;
SMS_OTP | &quot;SMS_OTP&quot;
KEY_FOB_OR_EMV_CARD_READER_OTP | &quot;KEY_FOB_OR_EMV_CARD_READER_OTP&quot;
APP_OTP | &quot;APP_OTP&quot;
APP_OTHER | &quot;APP_OTHER&quot;
KBA | &quot;KBA&quot;
OOB_BIOMETRICS | &quot;OOB_BIOMETRICS&quot;
OOB_LOGIN | &quot;OOB_LOGIN&quot;
OOB_OTHER | &quot;OOB_OTHER&quot;
OTHER | &quot;OTHER&quot;


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
STATIC | &quot;STATIC&quot;
DYNAMIC | &quot;DYNAMIC&quot;
OOB | &quot;OOB&quot;
DECOUPLED | &quot;DECOUPLED&quot;


<a name="TransactionStatusReasonEnum"></a>
## Enum: TransactionStatusReasonEnum
Name | Value
---- | -----
CARD_AUTHENTICATION_FAILED | &quot;CARD_AUTHENTICATION_FAILED&quot;
UNKNOWN_DEVICE | &quot;UNKNOWN_DEVICE&quot;
UNSUPPORTED_DEVICE | &quot;UNSUPPORTED_DEVICE&quot;
EXCEEDS_AUTHENTICATION_LIMIT | &quot;EXCEEDS_AUTHENTICATION_LIMIT&quot;
EXPIRED_CARD | &quot;EXPIRED_CARD&quot;
INVALID_CARD_NUMBER | &quot;INVALID_CARD_NUMBER&quot;
INVALID_TRANSACTION | &quot;INVALID_TRANSACTION&quot;
NO_CARD_RECORD | &quot;NO_CARD_RECORD&quot;
SECURITY_FAILURE | &quot;SECURITY_FAILURE&quot;
STOLEN_CARD | &quot;STOLEN_CARD&quot;
SUSPECTED_FRAUD | &quot;SUSPECTED_FRAUD&quot;
TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER | &quot;TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER&quot;
CARDHOLDER_NOT_ENROLLED_IN_SERVICE | &quot;CARDHOLDER_NOT_ENROLLED_IN_SERVICE&quot;
TRANSACTION_TIMED_OUT_AT_THE_ACS | &quot;TRANSACTION_TIMED_OUT_AT_THE_ACS&quot;
LOW_CONFIDENCE | &quot;LOW_CONFIDENCE&quot;
MEDIUM_CONFIDENCE | &quot;MEDIUM_CONFIDENCE&quot;
HIGH_CONFIDENCE | &quot;HIGH_CONFIDENCE&quot;
VERY_HIGH_CONFIDENCE | &quot;VERY_HIGH_CONFIDENCE&quot;
EXCEEDS_ACS_MAXIMUM_CHALLENGES | &quot;EXCEEDS_ACS_MAXIMUM_CHALLENGES&quot;
NON_PAYMENT_TRANSACTION_NOT_SUPPORTED | &quot;NON_PAYMENT_TRANSACTION_NOT_SUPPORTED&quot;
THREE_RI_TRANSACTION_NOT_SUPPORTED | &quot;THREE_RI_TRANSACTION_NOT_SUPPORTED&quot;



