
# AuthenticatorSMSStage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**component** | **kotlin.String** | Get object type so that we know how to edit the object |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**provider** | [**ProviderEnum**](ProviderEnum.md) |  | 
**fromNumber** | **kotlin.String** |  | 
**accountSid** | **kotlin.String** |  | 
**auth** | **kotlin.String** |  | 
**flowSet** | [**kotlin.collections.List&lt;FlowSet&gt;**](FlowSet.md) |  |  [optional]
**configureFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional]
**friendlyName** | **kotlin.String** |  |  [optional]
**authPassword** | **kotlin.String** |  |  [optional]
**authType** | [**AuthTypeEnum**](AuthTypeEnum.md) |  |  [optional]
**verifyOnly** | **kotlin.Boolean** | When enabled, the Phone number is only used during enrollment to verify the users authenticity. Only a hash of the phone number is saved to ensure it is not re-used in the future. |  [optional]
**mapping** | [**java.util.UUID**](java.util.UUID.md) | Optionally modify the payload being sent to custom providers. |  [optional]



