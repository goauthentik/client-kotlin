
# RadiusOutpostConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | **kotlin.Int** |  |  [readonly]
**name** | **kotlin.String** |  | 
**applicationSlug** | **kotlin.String** |  | 
**authFlowSlug** | **kotlin.String** |  | 
**clientNetworks** | **kotlin.String** | List of CIDRs (comma-separated) that clients can connect from. A more specific CIDR will match before a looser one. Clients connecting from a non-specified CIDR will be dropped. |  [optional]
**sharedSecret** | **kotlin.String** | Shared secret between clients and server to hash packets. |  [optional]



