
# PatchedIdentificationStageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  |  [optional]
**flowSet** | [**kotlin.collections.List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional]
**userFields** | [**kotlin.collections.List&lt;UserFieldsEnum&gt;**](UserFieldsEnum.md) | Fields of the user object to match against. (Hold shift to select multiple options) |  [optional]
**passwordStage** | [**java.util.UUID**](java.util.UUID.md) | When set, shows a password field, instead of showing the password field as seaprate step. |  [optional]
**caseInsensitiveMatching** | **kotlin.Boolean** | When enabled, user fields are matched regardless of their casing. |  [optional]
**showMatchedUser** | **kotlin.Boolean** | When a valid username/email has been entered, and this option is enabled, the user&#39;s username and avatar will be shown. Otherwise, the text that the user entered will be shown |  [optional]
**enrollmentFlow** | [**java.util.UUID**](java.util.UUID.md) | Optional enrollment flow, which is linked at the bottom of the page. |  [optional]
**recoveryFlow** | [**java.util.UUID**](java.util.UUID.md) | Optional recovery flow, which is linked at the bottom of the page. |  [optional]
**passwordlessFlow** | [**java.util.UUID**](java.util.UUID.md) | Optional passwordless flow, which is linked at the bottom of the page. |  [optional]
**sources** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specify which sources should be shown. |  [optional]
**showSourceLabels** | **kotlin.Boolean** |  |  [optional]
**pretendUserExists** | **kotlin.Boolean** | When enabled, the stage will succeed and continue even when incorrect user info is entered. |  [optional]



