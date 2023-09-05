
# PatchedInvitationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**expires** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**fixedData** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**singleUse** | **kotlin.Boolean** | When enabled, the invitation will be deleted after usage. |  [optional]
**flow** | [**java.util.UUID**](java.util.UUID.md) | When set, only the configured flow can use this invitation. |  [optional]



