# EvaluateChallengeStepCMWebResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appNextChallengeInfo** | [**AppChallengeInfo**](AppChallengeInfo.md) |  |  [optional]
**browserNextChallengeInfo** | [**BrowserChallengeInfo**](BrowserChallengeInfo.md) |  |  [optional]
**cResInfo** | [**CResInfo**](CResInfo.md) |  |  [optional]
**challengeStatus** | [**ChallengeStatusEnum**](#ChallengeStatusEnum) |  |  [optional]
**nextStepId** | **String** |  |  [optional]
**requestingWhitelist** | **Boolean** |  |  [optional]

<a name="ChallengeStatusEnum"></a>
## Enum: ChallengeStatusEnum
Name | Value
---- | -----
ONGOING | &quot;ONGOING&quot;
TERMINATED_WITH_SUCCESS | &quot;TERMINATED_WITH_SUCCESS&quot;
TERMINATED_WITH_FAILURE | &quot;TERMINATED_WITH_FAILURE&quot;
