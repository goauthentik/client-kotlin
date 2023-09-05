
# Invitation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**createdBy** | [**GroupMember**](GroupMember.md) |  |  [readonly]
**flowObj** | [**Flow**](Flow.md) |  |  [readonly]
**expires** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**fixedData** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**singleUse** | **kotlin.Boolean** | When enabled, the invitation will be deleted after usage. |  [optional]
**flow** | [**java.util.UUID**](java.util.UUID.md) | When set, only the configured flow can use this invitation. |  [optional]



