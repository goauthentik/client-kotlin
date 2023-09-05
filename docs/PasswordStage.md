
# PasswordStage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**component** | **kotlin.String** | Get object type so that we know how to edit the object |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**backends** | [**kotlin.collections.List&lt;BackendsEnum&gt;**](BackendsEnum.md) | Selection of backends to test the password against. | 
**flowSet** | [**kotlin.collections.List&lt;FlowSet&gt;**](FlowSet.md) |  |  [optional]
**configureFlow** | [**java.util.UUID**](java.util.UUID.md) | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional]
**failedAttemptsBeforeCancel** | **kotlin.Int** | How many attempts a user has before the flow is canceled. To lock the user out, use a reputation policy and a user_write stage. |  [optional]



