
# DockerServiceConnection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**component** | **kotlin.String** |  |  [readonly]
**verboseName** | **kotlin.String** | Return object&#39;s verbose_name |  [readonly]
**verboseNamePlural** | **kotlin.String** | Return object&#39;s plural verbose_name |  [readonly]
**metaModelName** | **kotlin.String** | Return internal model name |  [readonly]
**url** | **kotlin.String** | Can be in the format of &#39;unix://&lt;path&gt;&#39; when connecting to a local docker daemon, or &#39;https://&lt;hostname&gt;:2376&#39; when connecting to a remote system. | 
**local** | **kotlin.Boolean** | If enabled, use the local connection. Required Docker socket/Kubernetes Integration |  [optional]
**tlsVerification** | [**java.util.UUID**](java.util.UUID.md) | CA which the endpoint&#39;s Certificate is verified against. Can be left empty for no validation. |  [optional]
**tlsAuthentication** | [**java.util.UUID**](java.util.UUID.md) | Certificate/Key used for authentication. Can be left empty for no authentication. |  [optional]



