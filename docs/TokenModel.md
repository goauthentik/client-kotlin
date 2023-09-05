
# TokenModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | **kotlin.Int** |  |  [readonly]
**provider** | [**OAuth2Provider**](OAuth2Provider.md) |  | 
**user** | [**User**](User.md) |  | 
**isExpired** | **kotlin.Boolean** | Check if token is expired yet. |  [readonly]
**scope** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**idToken** | **kotlin.String** | Get the token&#39;s id_token as JSON String |  [readonly]
**expires** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**revoked** | **kotlin.Boolean** |  |  [optional]



