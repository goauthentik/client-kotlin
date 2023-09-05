
# ExpiringBaseGrantModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | **kotlin.Int** |  |  [readonly]
**provider** | [**OAuth2Provider**](OAuth2Provider.md) |  | 
**user** | [**User**](User.md) |  | 
**isExpired** | **kotlin.Boolean** | Check if token is expired yet. |  [readonly]
**scope** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**expires** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]



