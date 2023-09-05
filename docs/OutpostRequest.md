
# OutpostRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**type** | [**OutpostTypeEnum**](OutpostTypeEnum.md) |  | 
**providers** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  | 
**config** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  | 
**serviceConnection** | [**java.util.UUID**](java.util.UUID.md) | Select Service-Connection authentik should use to manage this outpost. Leave empty if authentik should not handle the deployment. |  [optional]
**managed** | **kotlin.String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [optional]



