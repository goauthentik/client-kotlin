
# PatchedTokenRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**managed** | **kotlin.String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [optional]
**identifier** | **kotlin.String** |  |  [optional]
**intent** | [**IntentEnum**](IntentEnum.md) |  |  [optional]
**user** | **kotlin.Int** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**expires** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**expiring** | **kotlin.Boolean** |  |  [optional]



