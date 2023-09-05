
# AuthenticatorValidateStage

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
**notConfiguredAction** | [**NotConfiguredActionEnum**](NotConfiguredActionEnum.md) |  |  [optional]
**deviceClasses** | [**kotlin.collections.List&lt;DeviceClassesEnum&gt;**](DeviceClassesEnum.md) | Device classes which can be used to authenticate |  [optional]
**configurationStages** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Stages used to configure Authenticator when user doesn&#39;t have any compatible devices. After this configuration Stage passes, the user is not prompted again. |  [optional]
**lastAuthThreshold** | **kotlin.String** | If any of the user&#39;s device has been used within this threshold, this stage will be skipped |  [optional]
**webauthnUserVerification** | [**UserVerificationEnum**](UserVerificationEnum.md) | Enforce user verification for WebAuthn devices.  * &#x60;required&#x60; - Required * &#x60;preferred&#x60; - Preferred * &#x60;discouraged&#x60; - Discouraged |  [optional]



