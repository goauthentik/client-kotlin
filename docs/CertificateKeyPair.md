
# CertificateKeyPair

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**fingerprintSha256** | **kotlin.String** | Get certificate Hash (SHA256) |  [readonly]
**fingerprintSha1** | **kotlin.String** | Get certificate Hash (SHA1) |  [readonly]
**certExpiry** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Get certificate expiry |  [readonly]
**certSubject** | **kotlin.String** | Get certificate subject as full rfc4514 |  [readonly]
**privateKeyAvailable** | **kotlin.Boolean** | Show if this keypair has a private key configured or not |  [readonly]
**privateKeyType** | **kotlin.String** | Get the private key&#39;s type, if set |  [readonly]
**certificateDownloadUrl** | **kotlin.String** | Get URL to download certificate |  [readonly]
**privateKeyDownloadUrl** | **kotlin.String** | Get URL to download private key |  [readonly]
**managed** | **kotlin.String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [readonly]



