
# Endpoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**provider** | **kotlin.Int** |  | 
**providerObj** | [**RACProvider**](RACProvider.md) |  |  [readonly]
**protocol** | [**ProtocolEnum**](ProtocolEnum.md) |  | 
**host** | **kotlin.String** |  | 
**authMode** | [**AuthModeEnum**](AuthModeEnum.md) |  | 
**launchUrl** | **kotlin.String** | Build actual launch URL (the provider itself does not have one, just individual endpoints) |  [readonly]
**settings** | [**kotlin.Any**](.md) |  |  [optional]
**propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional]



