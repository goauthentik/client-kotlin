
# EmailStageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**flowSet** | [**kotlin.collections.List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional]
**useGlobalSettings** | **kotlin.Boolean** | When enabled, global Email connection settings will be used and connection settings below will be ignored. |  [optional]
**host** | **kotlin.String** |  |  [optional]
**port** | **kotlin.Int** |  |  [optional]
**username** | **kotlin.String** |  |  [optional]
**password** | **kotlin.String** |  |  [optional]
**useTls** | **kotlin.Boolean** |  |  [optional]
**useSsl** | **kotlin.Boolean** |  |  [optional]
**timeout** | **kotlin.Int** |  |  [optional]
**fromAddress** | **kotlin.String** |  |  [optional]
**tokenExpiry** | **kotlin.Int** | Time in minutes the token sent is valid. |  [optional]
**subject** | **kotlin.String** |  |  [optional]
**template** | **kotlin.String** |  |  [optional]
**activateUserOnSuccess** | **kotlin.Boolean** | Activate users upon completion of stage. |  [optional]



