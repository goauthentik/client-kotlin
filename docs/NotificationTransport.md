
# NotificationTransport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pk** | [**java.util.UUID**](java.util.UUID.md) |  |  [readonly]
**name** | **kotlin.String** |  | 
**modeVerbose** | **kotlin.String** | Return selected mode with a UI Label |  [readonly]
**mode** | [**NotificationTransportModeEnum**](NotificationTransportModeEnum.md) |  |  [optional]
**webhookUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**webhookMapping** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**sendOnce** | **kotlin.Boolean** | Only send notification once, for example when sending a webhook into a chat channel. |  [optional]



