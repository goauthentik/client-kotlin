
# PatchedNotificationRuleRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**transports** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Select which transports should be used to notify the user. If none are selected, the notification will only be shown in the authentik UI. |  [optional]
**severity** | [**SeverityEnum**](SeverityEnum.md) |  |  [optional]
**group** | [**java.util.UUID**](java.util.UUID.md) | Define which group of users this notification should be sent and shown to. If left empty, Notification won&#39;t ben sent. |  [optional]



