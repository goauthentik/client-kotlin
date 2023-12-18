
# Flow

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**policybindingmodelPtrId** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**slug** | **kotlin.String** | Visible in the URL. | 
**title** | **kotlin.String** | Shown as the Title in Flow pages. | 
**designation** | [**FlowDesignationEnum**](FlowDesignationEnum.md) |  | 
**background** | **kotlin.String** | Get the URL to the background image. If the name is /static or starts with http it is returned as-is |  [readonly]
**stages** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [readonly]
**policies** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [readonly]
**cacheCount** | **kotlin.Int** | Get count of cached flows |  [readonly]
**exportUrl** | **kotlin.String** | Get export URL for flow |  [readonly]
**policyEngineMode** | [**PolicyEngineMode**](PolicyEngineMode.md) |  |  [optional]
**compatibilityMode** | **kotlin.Boolean** | Enable compatibility mode, increases compatibility with password managers on mobile devices. |  [optional]
**layout** | [**FlowLayoutEnum**](FlowLayoutEnum.md) |  |  [optional]
**deniedAction** | [**DeniedActionEnum**](DeniedActionEnum.md) |  |  [optional]
**authentication** | [**AuthenticationEnum**](AuthenticationEnum.md) |  |  [optional]



