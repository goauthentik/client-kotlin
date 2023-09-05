
# EmailStage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**component** | **kotlin.String** | Get object type so that we know how to edit the object |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**flowSet** | [**kotlin.collections.List&lt;FlowSet&gt;**](FlowSet.md) |  |  [optional]
**useGlobalSettings** | **kotlin.Boolean** | When enabled, global Email connection settings will be used and connection settings below will be ignored. |  [optional]
**host** | **kotlin.String** |  |  [optional]
**port** | **kotlin.Int** |  |  [optional]
**username** | **kotlin.String** |  |  [optional]
**useTls** | **kotlin.Boolean** |  |  [optional]
**useSsl** | **kotlin.Boolean** |  |  [optional]
**timeout** | **kotlin.Int** |  |  [optional]
**fromAddress** | **kotlin.String** |  |  [optional]
**tokenExpiry** | **kotlin.Int** | Time in minutes the token sent is valid. |  [optional]
**subject** | **kotlin.String** |  |  [optional]
**template** | **kotlin.String** |  |  [optional]
**activateUserOnSuccess** | **kotlin.Boolean** | Activate users upon completion of stage. |  [optional]



