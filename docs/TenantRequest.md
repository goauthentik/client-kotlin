
# TenantRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **kotlin.String** | Domain that activates this tenant. Can be a superset, i.e. &#x60;a.b&#x60; for &#x60;aa.b&#x60; and &#x60;ba.b&#x60; | 
**default** | **kotlin.Boolean** |  |  [optional]
**brandingTitle** | **kotlin.String** |  |  [optional]
**brandingLogo** | **kotlin.String** |  |  [optional]
**brandingFavicon** | **kotlin.String** |  |  [optional]
**flowAuthentication** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**flowInvalidation** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**flowRecovery** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**flowUnenrollment** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**flowUserSettings** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**flowDeviceCode** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**eventRetention** | **kotlin.String** | Events will be deleted after this duration.(Format: weeks&#x3D;3;days&#x3D;2;hours&#x3D;3,seconds&#x3D;2). |  [optional]
**webCertificate** | [**java.util.UUID**](java.util.UUID.md) | Web Certificate used by the authentik Core webserver. |  [optional]
**attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



