# StagesApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stagesAllDestroy**](StagesApi.md#stagesAllDestroy) | **DELETE** /stages/all/{stage_uuid}/ | 
[**stagesAllList**](StagesApi.md#stagesAllList) | **GET** /stages/all/ | 
[**stagesAllRetrieve**](StagesApi.md#stagesAllRetrieve) | **GET** /stages/all/{stage_uuid}/ | 
[**stagesAllTypesList**](StagesApi.md#stagesAllTypesList) | **GET** /stages/all/types/ | 
[**stagesAllUsedByList**](StagesApi.md#stagesAllUsedByList) | **GET** /stages/all/{stage_uuid}/used_by/ | 
[**stagesAllUserSettingsList**](StagesApi.md#stagesAllUserSettingsList) | **GET** /stages/all/user_settings/ | 
[**stagesAuthenticatorDuoCreate**](StagesApi.md#stagesAuthenticatorDuoCreate) | **POST** /stages/authenticator/duo/ | 
[**stagesAuthenticatorDuoDestroy**](StagesApi.md#stagesAuthenticatorDuoDestroy) | **DELETE** /stages/authenticator/duo/{stage_uuid}/ | 
[**stagesAuthenticatorDuoEnrollmentStatusCreate**](StagesApi.md#stagesAuthenticatorDuoEnrollmentStatusCreate) | **POST** /stages/authenticator/duo/{stage_uuid}/enrollment_status/ | 
[**stagesAuthenticatorDuoImportDeviceManualCreate**](StagesApi.md#stagesAuthenticatorDuoImportDeviceManualCreate) | **POST** /stages/authenticator/duo/{stage_uuid}/import_device_manual/ | 
[**stagesAuthenticatorDuoImportDevicesAutomaticCreate**](StagesApi.md#stagesAuthenticatorDuoImportDevicesAutomaticCreate) | **POST** /stages/authenticator/duo/{stage_uuid}/import_devices_automatic/ | 
[**stagesAuthenticatorDuoList**](StagesApi.md#stagesAuthenticatorDuoList) | **GET** /stages/authenticator/duo/ | 
[**stagesAuthenticatorDuoPartialUpdate**](StagesApi.md#stagesAuthenticatorDuoPartialUpdate) | **PATCH** /stages/authenticator/duo/{stage_uuid}/ | 
[**stagesAuthenticatorDuoRetrieve**](StagesApi.md#stagesAuthenticatorDuoRetrieve) | **GET** /stages/authenticator/duo/{stage_uuid}/ | 
[**stagesAuthenticatorDuoUpdate**](StagesApi.md#stagesAuthenticatorDuoUpdate) | **PUT** /stages/authenticator/duo/{stage_uuid}/ | 
[**stagesAuthenticatorDuoUsedByList**](StagesApi.md#stagesAuthenticatorDuoUsedByList) | **GET** /stages/authenticator/duo/{stage_uuid}/used_by/ | 
[**stagesAuthenticatorSmsCreate**](StagesApi.md#stagesAuthenticatorSmsCreate) | **POST** /stages/authenticator/sms/ | 
[**stagesAuthenticatorSmsDestroy**](StagesApi.md#stagesAuthenticatorSmsDestroy) | **DELETE** /stages/authenticator/sms/{stage_uuid}/ | 
[**stagesAuthenticatorSmsList**](StagesApi.md#stagesAuthenticatorSmsList) | **GET** /stages/authenticator/sms/ | 
[**stagesAuthenticatorSmsPartialUpdate**](StagesApi.md#stagesAuthenticatorSmsPartialUpdate) | **PATCH** /stages/authenticator/sms/{stage_uuid}/ | 
[**stagesAuthenticatorSmsRetrieve**](StagesApi.md#stagesAuthenticatorSmsRetrieve) | **GET** /stages/authenticator/sms/{stage_uuid}/ | 
[**stagesAuthenticatorSmsUpdate**](StagesApi.md#stagesAuthenticatorSmsUpdate) | **PUT** /stages/authenticator/sms/{stage_uuid}/ | 
[**stagesAuthenticatorSmsUsedByList**](StagesApi.md#stagesAuthenticatorSmsUsedByList) | **GET** /stages/authenticator/sms/{stage_uuid}/used_by/ | 
[**stagesAuthenticatorStaticCreate**](StagesApi.md#stagesAuthenticatorStaticCreate) | **POST** /stages/authenticator/static/ | 
[**stagesAuthenticatorStaticDestroy**](StagesApi.md#stagesAuthenticatorStaticDestroy) | **DELETE** /stages/authenticator/static/{stage_uuid}/ | 
[**stagesAuthenticatorStaticList**](StagesApi.md#stagesAuthenticatorStaticList) | **GET** /stages/authenticator/static/ | 
[**stagesAuthenticatorStaticPartialUpdate**](StagesApi.md#stagesAuthenticatorStaticPartialUpdate) | **PATCH** /stages/authenticator/static/{stage_uuid}/ | 
[**stagesAuthenticatorStaticRetrieve**](StagesApi.md#stagesAuthenticatorStaticRetrieve) | **GET** /stages/authenticator/static/{stage_uuid}/ | 
[**stagesAuthenticatorStaticUpdate**](StagesApi.md#stagesAuthenticatorStaticUpdate) | **PUT** /stages/authenticator/static/{stage_uuid}/ | 
[**stagesAuthenticatorStaticUsedByList**](StagesApi.md#stagesAuthenticatorStaticUsedByList) | **GET** /stages/authenticator/static/{stage_uuid}/used_by/ | 
[**stagesAuthenticatorTotpCreate**](StagesApi.md#stagesAuthenticatorTotpCreate) | **POST** /stages/authenticator/totp/ | 
[**stagesAuthenticatorTotpDestroy**](StagesApi.md#stagesAuthenticatorTotpDestroy) | **DELETE** /stages/authenticator/totp/{stage_uuid}/ | 
[**stagesAuthenticatorTotpList**](StagesApi.md#stagesAuthenticatorTotpList) | **GET** /stages/authenticator/totp/ | 
[**stagesAuthenticatorTotpPartialUpdate**](StagesApi.md#stagesAuthenticatorTotpPartialUpdate) | **PATCH** /stages/authenticator/totp/{stage_uuid}/ | 
[**stagesAuthenticatorTotpRetrieve**](StagesApi.md#stagesAuthenticatorTotpRetrieve) | **GET** /stages/authenticator/totp/{stage_uuid}/ | 
[**stagesAuthenticatorTotpUpdate**](StagesApi.md#stagesAuthenticatorTotpUpdate) | **PUT** /stages/authenticator/totp/{stage_uuid}/ | 
[**stagesAuthenticatorTotpUsedByList**](StagesApi.md#stagesAuthenticatorTotpUsedByList) | **GET** /stages/authenticator/totp/{stage_uuid}/used_by/ | 
[**stagesAuthenticatorValidateCreate**](StagesApi.md#stagesAuthenticatorValidateCreate) | **POST** /stages/authenticator/validate/ | 
[**stagesAuthenticatorValidateDestroy**](StagesApi.md#stagesAuthenticatorValidateDestroy) | **DELETE** /stages/authenticator/validate/{stage_uuid}/ | 
[**stagesAuthenticatorValidateList**](StagesApi.md#stagesAuthenticatorValidateList) | **GET** /stages/authenticator/validate/ | 
[**stagesAuthenticatorValidatePartialUpdate**](StagesApi.md#stagesAuthenticatorValidatePartialUpdate) | **PATCH** /stages/authenticator/validate/{stage_uuid}/ | 
[**stagesAuthenticatorValidateRetrieve**](StagesApi.md#stagesAuthenticatorValidateRetrieve) | **GET** /stages/authenticator/validate/{stage_uuid}/ | 
[**stagesAuthenticatorValidateUpdate**](StagesApi.md#stagesAuthenticatorValidateUpdate) | **PUT** /stages/authenticator/validate/{stage_uuid}/ | 
[**stagesAuthenticatorValidateUsedByList**](StagesApi.md#stagesAuthenticatorValidateUsedByList) | **GET** /stages/authenticator/validate/{stage_uuid}/used_by/ | 
[**stagesAuthenticatorWebauthnCreate**](StagesApi.md#stagesAuthenticatorWebauthnCreate) | **POST** /stages/authenticator/webauthn/ | 
[**stagesAuthenticatorWebauthnDestroy**](StagesApi.md#stagesAuthenticatorWebauthnDestroy) | **DELETE** /stages/authenticator/webauthn/{stage_uuid}/ | 
[**stagesAuthenticatorWebauthnList**](StagesApi.md#stagesAuthenticatorWebauthnList) | **GET** /stages/authenticator/webauthn/ | 
[**stagesAuthenticatorWebauthnPartialUpdate**](StagesApi.md#stagesAuthenticatorWebauthnPartialUpdate) | **PATCH** /stages/authenticator/webauthn/{stage_uuid}/ | 
[**stagesAuthenticatorWebauthnRetrieve**](StagesApi.md#stagesAuthenticatorWebauthnRetrieve) | **GET** /stages/authenticator/webauthn/{stage_uuid}/ | 
[**stagesAuthenticatorWebauthnUpdate**](StagesApi.md#stagesAuthenticatorWebauthnUpdate) | **PUT** /stages/authenticator/webauthn/{stage_uuid}/ | 
[**stagesAuthenticatorWebauthnUsedByList**](StagesApi.md#stagesAuthenticatorWebauthnUsedByList) | **GET** /stages/authenticator/webauthn/{stage_uuid}/used_by/ | 
[**stagesCaptchaCreate**](StagesApi.md#stagesCaptchaCreate) | **POST** /stages/captcha/ | 
[**stagesCaptchaDestroy**](StagesApi.md#stagesCaptchaDestroy) | **DELETE** /stages/captcha/{stage_uuid}/ | 
[**stagesCaptchaList**](StagesApi.md#stagesCaptchaList) | **GET** /stages/captcha/ | 
[**stagesCaptchaPartialUpdate**](StagesApi.md#stagesCaptchaPartialUpdate) | **PATCH** /stages/captcha/{stage_uuid}/ | 
[**stagesCaptchaRetrieve**](StagesApi.md#stagesCaptchaRetrieve) | **GET** /stages/captcha/{stage_uuid}/ | 
[**stagesCaptchaUpdate**](StagesApi.md#stagesCaptchaUpdate) | **PUT** /stages/captcha/{stage_uuid}/ | 
[**stagesCaptchaUsedByList**](StagesApi.md#stagesCaptchaUsedByList) | **GET** /stages/captcha/{stage_uuid}/used_by/ | 
[**stagesConsentCreate**](StagesApi.md#stagesConsentCreate) | **POST** /stages/consent/ | 
[**stagesConsentDestroy**](StagesApi.md#stagesConsentDestroy) | **DELETE** /stages/consent/{stage_uuid}/ | 
[**stagesConsentList**](StagesApi.md#stagesConsentList) | **GET** /stages/consent/ | 
[**stagesConsentPartialUpdate**](StagesApi.md#stagesConsentPartialUpdate) | **PATCH** /stages/consent/{stage_uuid}/ | 
[**stagesConsentRetrieve**](StagesApi.md#stagesConsentRetrieve) | **GET** /stages/consent/{stage_uuid}/ | 
[**stagesConsentUpdate**](StagesApi.md#stagesConsentUpdate) | **PUT** /stages/consent/{stage_uuid}/ | 
[**stagesConsentUsedByList**](StagesApi.md#stagesConsentUsedByList) | **GET** /stages/consent/{stage_uuid}/used_by/ | 
[**stagesDenyCreate**](StagesApi.md#stagesDenyCreate) | **POST** /stages/deny/ | 
[**stagesDenyDestroy**](StagesApi.md#stagesDenyDestroy) | **DELETE** /stages/deny/{stage_uuid}/ | 
[**stagesDenyList**](StagesApi.md#stagesDenyList) | **GET** /stages/deny/ | 
[**stagesDenyPartialUpdate**](StagesApi.md#stagesDenyPartialUpdate) | **PATCH** /stages/deny/{stage_uuid}/ | 
[**stagesDenyRetrieve**](StagesApi.md#stagesDenyRetrieve) | **GET** /stages/deny/{stage_uuid}/ | 
[**stagesDenyUpdate**](StagesApi.md#stagesDenyUpdate) | **PUT** /stages/deny/{stage_uuid}/ | 
[**stagesDenyUsedByList**](StagesApi.md#stagesDenyUsedByList) | **GET** /stages/deny/{stage_uuid}/used_by/ | 
[**stagesDummyCreate**](StagesApi.md#stagesDummyCreate) | **POST** /stages/dummy/ | 
[**stagesDummyDestroy**](StagesApi.md#stagesDummyDestroy) | **DELETE** /stages/dummy/{stage_uuid}/ | 
[**stagesDummyList**](StagesApi.md#stagesDummyList) | **GET** /stages/dummy/ | 
[**stagesDummyPartialUpdate**](StagesApi.md#stagesDummyPartialUpdate) | **PATCH** /stages/dummy/{stage_uuid}/ | 
[**stagesDummyRetrieve**](StagesApi.md#stagesDummyRetrieve) | **GET** /stages/dummy/{stage_uuid}/ | 
[**stagesDummyUpdate**](StagesApi.md#stagesDummyUpdate) | **PUT** /stages/dummy/{stage_uuid}/ | 
[**stagesDummyUsedByList**](StagesApi.md#stagesDummyUsedByList) | **GET** /stages/dummy/{stage_uuid}/used_by/ | 
[**stagesEmailCreate**](StagesApi.md#stagesEmailCreate) | **POST** /stages/email/ | 
[**stagesEmailDestroy**](StagesApi.md#stagesEmailDestroy) | **DELETE** /stages/email/{stage_uuid}/ | 
[**stagesEmailList**](StagesApi.md#stagesEmailList) | **GET** /stages/email/ | 
[**stagesEmailPartialUpdate**](StagesApi.md#stagesEmailPartialUpdate) | **PATCH** /stages/email/{stage_uuid}/ | 
[**stagesEmailRetrieve**](StagesApi.md#stagesEmailRetrieve) | **GET** /stages/email/{stage_uuid}/ | 
[**stagesEmailTemplatesList**](StagesApi.md#stagesEmailTemplatesList) | **GET** /stages/email/templates/ | 
[**stagesEmailUpdate**](StagesApi.md#stagesEmailUpdate) | **PUT** /stages/email/{stage_uuid}/ | 
[**stagesEmailUsedByList**](StagesApi.md#stagesEmailUsedByList) | **GET** /stages/email/{stage_uuid}/used_by/ | 
[**stagesIdentificationCreate**](StagesApi.md#stagesIdentificationCreate) | **POST** /stages/identification/ | 
[**stagesIdentificationDestroy**](StagesApi.md#stagesIdentificationDestroy) | **DELETE** /stages/identification/{stage_uuid}/ | 
[**stagesIdentificationList**](StagesApi.md#stagesIdentificationList) | **GET** /stages/identification/ | 
[**stagesIdentificationPartialUpdate**](StagesApi.md#stagesIdentificationPartialUpdate) | **PATCH** /stages/identification/{stage_uuid}/ | 
[**stagesIdentificationRetrieve**](StagesApi.md#stagesIdentificationRetrieve) | **GET** /stages/identification/{stage_uuid}/ | 
[**stagesIdentificationUpdate**](StagesApi.md#stagesIdentificationUpdate) | **PUT** /stages/identification/{stage_uuid}/ | 
[**stagesIdentificationUsedByList**](StagesApi.md#stagesIdentificationUsedByList) | **GET** /stages/identification/{stage_uuid}/used_by/ | 
[**stagesInvitationInvitationsCreate**](StagesApi.md#stagesInvitationInvitationsCreate) | **POST** /stages/invitation/invitations/ | 
[**stagesInvitationInvitationsDestroy**](StagesApi.md#stagesInvitationInvitationsDestroy) | **DELETE** /stages/invitation/invitations/{invite_uuid}/ | 
[**stagesInvitationInvitationsList**](StagesApi.md#stagesInvitationInvitationsList) | **GET** /stages/invitation/invitations/ | 
[**stagesInvitationInvitationsPartialUpdate**](StagesApi.md#stagesInvitationInvitationsPartialUpdate) | **PATCH** /stages/invitation/invitations/{invite_uuid}/ | 
[**stagesInvitationInvitationsRetrieve**](StagesApi.md#stagesInvitationInvitationsRetrieve) | **GET** /stages/invitation/invitations/{invite_uuid}/ | 
[**stagesInvitationInvitationsUpdate**](StagesApi.md#stagesInvitationInvitationsUpdate) | **PUT** /stages/invitation/invitations/{invite_uuid}/ | 
[**stagesInvitationInvitationsUsedByList**](StagesApi.md#stagesInvitationInvitationsUsedByList) | **GET** /stages/invitation/invitations/{invite_uuid}/used_by/ | 
[**stagesInvitationStagesCreate**](StagesApi.md#stagesInvitationStagesCreate) | **POST** /stages/invitation/stages/ | 
[**stagesInvitationStagesDestroy**](StagesApi.md#stagesInvitationStagesDestroy) | **DELETE** /stages/invitation/stages/{stage_uuid}/ | 
[**stagesInvitationStagesList**](StagesApi.md#stagesInvitationStagesList) | **GET** /stages/invitation/stages/ | 
[**stagesInvitationStagesPartialUpdate**](StagesApi.md#stagesInvitationStagesPartialUpdate) | **PATCH** /stages/invitation/stages/{stage_uuid}/ | 
[**stagesInvitationStagesRetrieve**](StagesApi.md#stagesInvitationStagesRetrieve) | **GET** /stages/invitation/stages/{stage_uuid}/ | 
[**stagesInvitationStagesUpdate**](StagesApi.md#stagesInvitationStagesUpdate) | **PUT** /stages/invitation/stages/{stage_uuid}/ | 
[**stagesInvitationStagesUsedByList**](StagesApi.md#stagesInvitationStagesUsedByList) | **GET** /stages/invitation/stages/{stage_uuid}/used_by/ | 
[**stagesPasswordCreate**](StagesApi.md#stagesPasswordCreate) | **POST** /stages/password/ | 
[**stagesPasswordDestroy**](StagesApi.md#stagesPasswordDestroy) | **DELETE** /stages/password/{stage_uuid}/ | 
[**stagesPasswordList**](StagesApi.md#stagesPasswordList) | **GET** /stages/password/ | 
[**stagesPasswordPartialUpdate**](StagesApi.md#stagesPasswordPartialUpdate) | **PATCH** /stages/password/{stage_uuid}/ | 
[**stagesPasswordRetrieve**](StagesApi.md#stagesPasswordRetrieve) | **GET** /stages/password/{stage_uuid}/ | 
[**stagesPasswordUpdate**](StagesApi.md#stagesPasswordUpdate) | **PUT** /stages/password/{stage_uuid}/ | 
[**stagesPasswordUsedByList**](StagesApi.md#stagesPasswordUsedByList) | **GET** /stages/password/{stage_uuid}/used_by/ | 
[**stagesPromptPromptsCreate**](StagesApi.md#stagesPromptPromptsCreate) | **POST** /stages/prompt/prompts/ | 
[**stagesPromptPromptsDestroy**](StagesApi.md#stagesPromptPromptsDestroy) | **DELETE** /stages/prompt/prompts/{prompt_uuid}/ | 
[**stagesPromptPromptsList**](StagesApi.md#stagesPromptPromptsList) | **GET** /stages/prompt/prompts/ | 
[**stagesPromptPromptsPartialUpdate**](StagesApi.md#stagesPromptPromptsPartialUpdate) | **PATCH** /stages/prompt/prompts/{prompt_uuid}/ | 
[**stagesPromptPromptsPreviewCreate**](StagesApi.md#stagesPromptPromptsPreviewCreate) | **POST** /stages/prompt/prompts/preview/ | 
[**stagesPromptPromptsRetrieve**](StagesApi.md#stagesPromptPromptsRetrieve) | **GET** /stages/prompt/prompts/{prompt_uuid}/ | 
[**stagesPromptPromptsUpdate**](StagesApi.md#stagesPromptPromptsUpdate) | **PUT** /stages/prompt/prompts/{prompt_uuid}/ | 
[**stagesPromptPromptsUsedByList**](StagesApi.md#stagesPromptPromptsUsedByList) | **GET** /stages/prompt/prompts/{prompt_uuid}/used_by/ | 
[**stagesPromptStagesCreate**](StagesApi.md#stagesPromptStagesCreate) | **POST** /stages/prompt/stages/ | 
[**stagesPromptStagesDestroy**](StagesApi.md#stagesPromptStagesDestroy) | **DELETE** /stages/prompt/stages/{stage_uuid}/ | 
[**stagesPromptStagesList**](StagesApi.md#stagesPromptStagesList) | **GET** /stages/prompt/stages/ | 
[**stagesPromptStagesPartialUpdate**](StagesApi.md#stagesPromptStagesPartialUpdate) | **PATCH** /stages/prompt/stages/{stage_uuid}/ | 
[**stagesPromptStagesRetrieve**](StagesApi.md#stagesPromptStagesRetrieve) | **GET** /stages/prompt/stages/{stage_uuid}/ | 
[**stagesPromptStagesUpdate**](StagesApi.md#stagesPromptStagesUpdate) | **PUT** /stages/prompt/stages/{stage_uuid}/ | 
[**stagesPromptStagesUsedByList**](StagesApi.md#stagesPromptStagesUsedByList) | **GET** /stages/prompt/stages/{stage_uuid}/used_by/ | 
[**stagesUserDeleteCreate**](StagesApi.md#stagesUserDeleteCreate) | **POST** /stages/user_delete/ | 
[**stagesUserDeleteDestroy**](StagesApi.md#stagesUserDeleteDestroy) | **DELETE** /stages/user_delete/{stage_uuid}/ | 
[**stagesUserDeleteList**](StagesApi.md#stagesUserDeleteList) | **GET** /stages/user_delete/ | 
[**stagesUserDeletePartialUpdate**](StagesApi.md#stagesUserDeletePartialUpdate) | **PATCH** /stages/user_delete/{stage_uuid}/ | 
[**stagesUserDeleteRetrieve**](StagesApi.md#stagesUserDeleteRetrieve) | **GET** /stages/user_delete/{stage_uuid}/ | 
[**stagesUserDeleteUpdate**](StagesApi.md#stagesUserDeleteUpdate) | **PUT** /stages/user_delete/{stage_uuid}/ | 
[**stagesUserDeleteUsedByList**](StagesApi.md#stagesUserDeleteUsedByList) | **GET** /stages/user_delete/{stage_uuid}/used_by/ | 
[**stagesUserLoginCreate**](StagesApi.md#stagesUserLoginCreate) | **POST** /stages/user_login/ | 
[**stagesUserLoginDestroy**](StagesApi.md#stagesUserLoginDestroy) | **DELETE** /stages/user_login/{stage_uuid}/ | 
[**stagesUserLoginList**](StagesApi.md#stagesUserLoginList) | **GET** /stages/user_login/ | 
[**stagesUserLoginPartialUpdate**](StagesApi.md#stagesUserLoginPartialUpdate) | **PATCH** /stages/user_login/{stage_uuid}/ | 
[**stagesUserLoginRetrieve**](StagesApi.md#stagesUserLoginRetrieve) | **GET** /stages/user_login/{stage_uuid}/ | 
[**stagesUserLoginUpdate**](StagesApi.md#stagesUserLoginUpdate) | **PUT** /stages/user_login/{stage_uuid}/ | 
[**stagesUserLoginUsedByList**](StagesApi.md#stagesUserLoginUsedByList) | **GET** /stages/user_login/{stage_uuid}/used_by/ | 
[**stagesUserLogoutCreate**](StagesApi.md#stagesUserLogoutCreate) | **POST** /stages/user_logout/ | 
[**stagesUserLogoutDestroy**](StagesApi.md#stagesUserLogoutDestroy) | **DELETE** /stages/user_logout/{stage_uuid}/ | 
[**stagesUserLogoutList**](StagesApi.md#stagesUserLogoutList) | **GET** /stages/user_logout/ | 
[**stagesUserLogoutPartialUpdate**](StagesApi.md#stagesUserLogoutPartialUpdate) | **PATCH** /stages/user_logout/{stage_uuid}/ | 
[**stagesUserLogoutRetrieve**](StagesApi.md#stagesUserLogoutRetrieve) | **GET** /stages/user_logout/{stage_uuid}/ | 
[**stagesUserLogoutUpdate**](StagesApi.md#stagesUserLogoutUpdate) | **PUT** /stages/user_logout/{stage_uuid}/ | 
[**stagesUserLogoutUsedByList**](StagesApi.md#stagesUserLogoutUsedByList) | **GET** /stages/user_logout/{stage_uuid}/used_by/ | 
[**stagesUserWriteCreate**](StagesApi.md#stagesUserWriteCreate) | **POST** /stages/user_write/ | 
[**stagesUserWriteDestroy**](StagesApi.md#stagesUserWriteDestroy) | **DELETE** /stages/user_write/{stage_uuid}/ | 
[**stagesUserWriteList**](StagesApi.md#stagesUserWriteList) | **GET** /stages/user_write/ | 
[**stagesUserWritePartialUpdate**](StagesApi.md#stagesUserWritePartialUpdate) | **PATCH** /stages/user_write/{stage_uuid}/ | 
[**stagesUserWriteRetrieve**](StagesApi.md#stagesUserWriteRetrieve) | **GET** /stages/user_write/{stage_uuid}/ | 
[**stagesUserWriteUpdate**](StagesApi.md#stagesUserWriteUpdate) | **PUT** /stages/user_write/{stage_uuid}/ | 
[**stagesUserWriteUsedByList**](StagesApi.md#stagesUserWriteUsedByList) | **GET** /stages/user_write/{stage_uuid}/used_by/ | 


<a name="stagesAllDestroy"></a>
# **stagesAllDestroy**
> stagesAllDestroy(stageUuid)



Stage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this stage.
try {
    apiInstance.stagesAllDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAllDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAllDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAllList"></a>
# **stagesAllList**
> PaginatedStageList stagesAllList(name, ordering, page, pageSize, search)



Stage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedStageList = apiInstance.stagesAllList(name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAllList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAllList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedStageList**](PaginatedStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAllRetrieve"></a>
# **stagesAllRetrieve**
> Stage stagesAllRetrieve(stageUuid)



Stage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this stage.
try {
    val result : Stage = apiInstance.stagesAllRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAllRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAllRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this stage. |

### Return type

[**Stage**](Stage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAllTypesList"></a>
# **stagesAllTypesList**
> kotlin.collections.List&lt;TypeCreate&gt; stagesAllTypesList()



Get all creatable stage types

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
try {
    val result : kotlin.collections.List<TypeCreate> = apiInstance.stagesAllTypesList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAllTypesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAllTypesList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;TypeCreate&gt;**](TypeCreate.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAllUsedByList"></a>
# **stagesAllUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesAllUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesAllUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAllUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAllUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAllUserSettingsList"></a>
# **stagesAllUserSettingsList**
> kotlin.collections.List&lt;UserSetting&gt; stagesAllUserSettingsList()



Get all stages the user can configure

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
try {
    val result : kotlin.collections.List<UserSetting> = apiInstance.stagesAllUserSettingsList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAllUserSettingsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAllUserSettingsList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;UserSetting&gt;**](UserSetting.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoCreate"></a>
# **stagesAuthenticatorDuoCreate**
> AuthenticatorDuoStage stagesAuthenticatorDuoCreate(authenticatorDuoStageRequest)



AuthenticatorDuoStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val authenticatorDuoStageRequest : AuthenticatorDuoStageRequest =  // AuthenticatorDuoStageRequest | 
try {
    val result : AuthenticatorDuoStage = apiInstance.stagesAuthenticatorDuoCreate(authenticatorDuoStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticatorDuoStageRequest** | [**AuthenticatorDuoStageRequest**](AuthenticatorDuoStageRequest.md)|  |

### Return type

[**AuthenticatorDuoStage**](AuthenticatorDuoStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoDestroy"></a>
# **stagesAuthenticatorDuoDestroy**
> stagesAuthenticatorDuoDestroy(stageUuid)



AuthenticatorDuoStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Duo Authenticator Setup Stage.
try {
    apiInstance.stagesAuthenticatorDuoDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Duo Authenticator Setup Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoEnrollmentStatusCreate"></a>
# **stagesAuthenticatorDuoEnrollmentStatusCreate**
> DuoDeviceEnrollmentStatus stagesAuthenticatorDuoEnrollmentStatusCreate(stageUuid)



Check enrollment status of user details in current session

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Duo Authenticator Setup Stage.
try {
    val result : DuoDeviceEnrollmentStatus = apiInstance.stagesAuthenticatorDuoEnrollmentStatusCreate(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoEnrollmentStatusCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoEnrollmentStatusCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Duo Authenticator Setup Stage. |

### Return type

[**DuoDeviceEnrollmentStatus**](DuoDeviceEnrollmentStatus.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoImportDeviceManualCreate"></a>
# **stagesAuthenticatorDuoImportDeviceManualCreate**
> stagesAuthenticatorDuoImportDeviceManualCreate(stageUuid, authenticatorDuoStageManualDeviceImportRequest)



Import duo devices into authentik

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Duo Authenticator Setup Stage.
val authenticatorDuoStageManualDeviceImportRequest : AuthenticatorDuoStageManualDeviceImportRequest =  // AuthenticatorDuoStageManualDeviceImportRequest | 
try {
    apiInstance.stagesAuthenticatorDuoImportDeviceManualCreate(stageUuid, authenticatorDuoStageManualDeviceImportRequest)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoImportDeviceManualCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoImportDeviceManualCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Duo Authenticator Setup Stage. |
 **authenticatorDuoStageManualDeviceImportRequest** | [**AuthenticatorDuoStageManualDeviceImportRequest**](AuthenticatorDuoStageManualDeviceImportRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoImportDevicesAutomaticCreate"></a>
# **stagesAuthenticatorDuoImportDevicesAutomaticCreate**
> AuthenticatorDuoStageDeviceImportResponse stagesAuthenticatorDuoImportDevicesAutomaticCreate(stageUuid)



Import duo devices into authentik

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Duo Authenticator Setup Stage.
try {
    val result : AuthenticatorDuoStageDeviceImportResponse = apiInstance.stagesAuthenticatorDuoImportDevicesAutomaticCreate(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoImportDevicesAutomaticCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoImportDevicesAutomaticCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Duo Authenticator Setup Stage. |

### Return type

[**AuthenticatorDuoStageDeviceImportResponse**](AuthenticatorDuoStageDeviceImportResponse.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoList"></a>
# **stagesAuthenticatorDuoList**
> PaginatedAuthenticatorDuoStageList stagesAuthenticatorDuoList(apiHostname, clientId, configureFlow, name, ordering, page, pageSize, search)



AuthenticatorDuoStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val apiHostname : kotlin.String = apiHostname_example // kotlin.String | 
val clientId : kotlin.String = clientId_example // kotlin.String | 
val configureFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedAuthenticatorDuoStageList = apiInstance.stagesAuthenticatorDuoList(apiHostname, clientId, configureFlow, name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiHostname** | **kotlin.String**|  | [optional]
 **clientId** | **kotlin.String**|  | [optional]
 **configureFlow** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedAuthenticatorDuoStageList**](PaginatedAuthenticatorDuoStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoPartialUpdate"></a>
# **stagesAuthenticatorDuoPartialUpdate**
> AuthenticatorDuoStage stagesAuthenticatorDuoPartialUpdate(stageUuid, patchedAuthenticatorDuoStageRequest)



AuthenticatorDuoStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Duo Authenticator Setup Stage.
val patchedAuthenticatorDuoStageRequest : PatchedAuthenticatorDuoStageRequest =  // PatchedAuthenticatorDuoStageRequest | 
try {
    val result : AuthenticatorDuoStage = apiInstance.stagesAuthenticatorDuoPartialUpdate(stageUuid, patchedAuthenticatorDuoStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Duo Authenticator Setup Stage. |
 **patchedAuthenticatorDuoStageRequest** | [**PatchedAuthenticatorDuoStageRequest**](PatchedAuthenticatorDuoStageRequest.md)|  | [optional]

### Return type

[**AuthenticatorDuoStage**](AuthenticatorDuoStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoRetrieve"></a>
# **stagesAuthenticatorDuoRetrieve**
> AuthenticatorDuoStage stagesAuthenticatorDuoRetrieve(stageUuid)



AuthenticatorDuoStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Duo Authenticator Setup Stage.
try {
    val result : AuthenticatorDuoStage = apiInstance.stagesAuthenticatorDuoRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Duo Authenticator Setup Stage. |

### Return type

[**AuthenticatorDuoStage**](AuthenticatorDuoStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoUpdate"></a>
# **stagesAuthenticatorDuoUpdate**
> AuthenticatorDuoStage stagesAuthenticatorDuoUpdate(stageUuid, authenticatorDuoStageRequest)



AuthenticatorDuoStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Duo Authenticator Setup Stage.
val authenticatorDuoStageRequest : AuthenticatorDuoStageRequest =  // AuthenticatorDuoStageRequest | 
try {
    val result : AuthenticatorDuoStage = apiInstance.stagesAuthenticatorDuoUpdate(stageUuid, authenticatorDuoStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Duo Authenticator Setup Stage. |
 **authenticatorDuoStageRequest** | [**AuthenticatorDuoStageRequest**](AuthenticatorDuoStageRequest.md)|  |

### Return type

[**AuthenticatorDuoStage**](AuthenticatorDuoStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorDuoUsedByList"></a>
# **stagesAuthenticatorDuoUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesAuthenticatorDuoUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Duo Authenticator Setup Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesAuthenticatorDuoUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorDuoUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorDuoUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Duo Authenticator Setup Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorSmsCreate"></a>
# **stagesAuthenticatorSmsCreate**
> AuthenticatorSMSStage stagesAuthenticatorSmsCreate(authenticatorSMSStageRequest)



AuthenticatorSMSStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val authenticatorSMSStageRequest : AuthenticatorSMSStageRequest =  // AuthenticatorSMSStageRequest | 
try {
    val result : AuthenticatorSMSStage = apiInstance.stagesAuthenticatorSmsCreate(authenticatorSMSStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorSmsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorSmsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticatorSMSStageRequest** | [**AuthenticatorSMSStageRequest**](AuthenticatorSMSStageRequest.md)|  |

### Return type

[**AuthenticatorSMSStage**](AuthenticatorSMSStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorSmsDestroy"></a>
# **stagesAuthenticatorSmsDestroy**
> stagesAuthenticatorSmsDestroy(stageUuid)



AuthenticatorSMSStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this SMS Authenticator Setup Stage.
try {
    apiInstance.stagesAuthenticatorSmsDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorSmsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorSmsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this SMS Authenticator Setup Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorSmsList"></a>
# **stagesAuthenticatorSmsList**
> PaginatedAuthenticatorSMSStageList stagesAuthenticatorSmsList(accountSid, auth, authPassword, authType, configureFlow, friendlyName, fromNumber, mapping, name, ordering, page, pageSize, provider, search, stageUuid, verifyOnly)



AuthenticatorSMSStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val accountSid : kotlin.String = accountSid_example // kotlin.String | 
val auth : kotlin.String = auth_example // kotlin.String | 
val authPassword : kotlin.String = authPassword_example // kotlin.String | 
val authType : kotlin.String = authType_example // kotlin.String | * `basic` - Basic * `bearer` - Bearer
val configureFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | 
val fromNumber : kotlin.String = fromNumber_example // kotlin.String | 
val mapping : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val provider : kotlin.String = provider_example // kotlin.String | * `twilio` - Twilio * `generic` - Generic
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val verifyOnly : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : PaginatedAuthenticatorSMSStageList = apiInstance.stagesAuthenticatorSmsList(accountSid, auth, authPassword, authType, configureFlow, friendlyName, fromNumber, mapping, name, ordering, page, pageSize, provider, search, stageUuid, verifyOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorSmsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorSmsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountSid** | **kotlin.String**|  | [optional]
 **auth** | **kotlin.String**|  | [optional]
 **authPassword** | **kotlin.String**|  | [optional]
 **authType** | **kotlin.String**| * &#x60;basic&#x60; - Basic * &#x60;bearer&#x60; - Bearer | [optional] [enum: basic, bearer]
 **configureFlow** | **java.util.UUID**|  | [optional]
 **friendlyName** | **kotlin.String**|  | [optional]
 **fromNumber** | **kotlin.String**|  | [optional]
 **mapping** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **provider** | **kotlin.String**| * &#x60;twilio&#x60; - Twilio * &#x60;generic&#x60; - Generic | [optional] [enum: generic, twilio]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]
 **verifyOnly** | **kotlin.Boolean**|  | [optional]

### Return type

[**PaginatedAuthenticatorSMSStageList**](PaginatedAuthenticatorSMSStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorSmsPartialUpdate"></a>
# **stagesAuthenticatorSmsPartialUpdate**
> AuthenticatorSMSStage stagesAuthenticatorSmsPartialUpdate(stageUuid, patchedAuthenticatorSMSStageRequest)



AuthenticatorSMSStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this SMS Authenticator Setup Stage.
val patchedAuthenticatorSMSStageRequest : PatchedAuthenticatorSMSStageRequest =  // PatchedAuthenticatorSMSStageRequest | 
try {
    val result : AuthenticatorSMSStage = apiInstance.stagesAuthenticatorSmsPartialUpdate(stageUuid, patchedAuthenticatorSMSStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorSmsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorSmsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this SMS Authenticator Setup Stage. |
 **patchedAuthenticatorSMSStageRequest** | [**PatchedAuthenticatorSMSStageRequest**](PatchedAuthenticatorSMSStageRequest.md)|  | [optional]

### Return type

[**AuthenticatorSMSStage**](AuthenticatorSMSStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorSmsRetrieve"></a>
# **stagesAuthenticatorSmsRetrieve**
> AuthenticatorSMSStage stagesAuthenticatorSmsRetrieve(stageUuid)



AuthenticatorSMSStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this SMS Authenticator Setup Stage.
try {
    val result : AuthenticatorSMSStage = apiInstance.stagesAuthenticatorSmsRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorSmsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorSmsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this SMS Authenticator Setup Stage. |

### Return type

[**AuthenticatorSMSStage**](AuthenticatorSMSStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorSmsUpdate"></a>
# **stagesAuthenticatorSmsUpdate**
> AuthenticatorSMSStage stagesAuthenticatorSmsUpdate(stageUuid, authenticatorSMSStageRequest)



AuthenticatorSMSStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this SMS Authenticator Setup Stage.
val authenticatorSMSStageRequest : AuthenticatorSMSStageRequest =  // AuthenticatorSMSStageRequest | 
try {
    val result : AuthenticatorSMSStage = apiInstance.stagesAuthenticatorSmsUpdate(stageUuid, authenticatorSMSStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorSmsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorSmsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this SMS Authenticator Setup Stage. |
 **authenticatorSMSStageRequest** | [**AuthenticatorSMSStageRequest**](AuthenticatorSMSStageRequest.md)|  |

### Return type

[**AuthenticatorSMSStage**](AuthenticatorSMSStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorSmsUsedByList"></a>
# **stagesAuthenticatorSmsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesAuthenticatorSmsUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this SMS Authenticator Setup Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesAuthenticatorSmsUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorSmsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorSmsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this SMS Authenticator Setup Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorStaticCreate"></a>
# **stagesAuthenticatorStaticCreate**
> AuthenticatorStaticStage stagesAuthenticatorStaticCreate(authenticatorStaticStageRequest)



AuthenticatorStaticStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val authenticatorStaticStageRequest : AuthenticatorStaticStageRequest =  // AuthenticatorStaticStageRequest | 
try {
    val result : AuthenticatorStaticStage = apiInstance.stagesAuthenticatorStaticCreate(authenticatorStaticStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorStaticCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorStaticCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticatorStaticStageRequest** | [**AuthenticatorStaticStageRequest**](AuthenticatorStaticStageRequest.md)|  |

### Return type

[**AuthenticatorStaticStage**](AuthenticatorStaticStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorStaticDestroy"></a>
# **stagesAuthenticatorStaticDestroy**
> stagesAuthenticatorStaticDestroy(stageUuid)



AuthenticatorStaticStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Static Authenticator Stage.
try {
    apiInstance.stagesAuthenticatorStaticDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorStaticDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorStaticDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Static Authenticator Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorStaticList"></a>
# **stagesAuthenticatorStaticList**
> PaginatedAuthenticatorStaticStageList stagesAuthenticatorStaticList(configureFlow, friendlyName, name, ordering, page, pageSize, search, stageUuid, tokenCount, tokenLength)



AuthenticatorStaticStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val configureFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tokenCount : kotlin.Int = 56 // kotlin.Int | 
val tokenLength : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedAuthenticatorStaticStageList = apiInstance.stagesAuthenticatorStaticList(configureFlow, friendlyName, name, ordering, page, pageSize, search, stageUuid, tokenCount, tokenLength)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorStaticList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorStaticList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configureFlow** | **java.util.UUID**|  | [optional]
 **friendlyName** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]
 **tokenCount** | **kotlin.Int**|  | [optional]
 **tokenLength** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedAuthenticatorStaticStageList**](PaginatedAuthenticatorStaticStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorStaticPartialUpdate"></a>
# **stagesAuthenticatorStaticPartialUpdate**
> AuthenticatorStaticStage stagesAuthenticatorStaticPartialUpdate(stageUuid, patchedAuthenticatorStaticStageRequest)



AuthenticatorStaticStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Static Authenticator Stage.
val patchedAuthenticatorStaticStageRequest : PatchedAuthenticatorStaticStageRequest =  // PatchedAuthenticatorStaticStageRequest | 
try {
    val result : AuthenticatorStaticStage = apiInstance.stagesAuthenticatorStaticPartialUpdate(stageUuid, patchedAuthenticatorStaticStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorStaticPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorStaticPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Static Authenticator Stage. |
 **patchedAuthenticatorStaticStageRequest** | [**PatchedAuthenticatorStaticStageRequest**](PatchedAuthenticatorStaticStageRequest.md)|  | [optional]

### Return type

[**AuthenticatorStaticStage**](AuthenticatorStaticStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorStaticRetrieve"></a>
# **stagesAuthenticatorStaticRetrieve**
> AuthenticatorStaticStage stagesAuthenticatorStaticRetrieve(stageUuid)



AuthenticatorStaticStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Static Authenticator Stage.
try {
    val result : AuthenticatorStaticStage = apiInstance.stagesAuthenticatorStaticRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorStaticRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorStaticRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Static Authenticator Stage. |

### Return type

[**AuthenticatorStaticStage**](AuthenticatorStaticStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorStaticUpdate"></a>
# **stagesAuthenticatorStaticUpdate**
> AuthenticatorStaticStage stagesAuthenticatorStaticUpdate(stageUuid, authenticatorStaticStageRequest)



AuthenticatorStaticStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Static Authenticator Stage.
val authenticatorStaticStageRequest : AuthenticatorStaticStageRequest =  // AuthenticatorStaticStageRequest | 
try {
    val result : AuthenticatorStaticStage = apiInstance.stagesAuthenticatorStaticUpdate(stageUuid, authenticatorStaticStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorStaticUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorStaticUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Static Authenticator Stage. |
 **authenticatorStaticStageRequest** | [**AuthenticatorStaticStageRequest**](AuthenticatorStaticStageRequest.md)|  |

### Return type

[**AuthenticatorStaticStage**](AuthenticatorStaticStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorStaticUsedByList"></a>
# **stagesAuthenticatorStaticUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesAuthenticatorStaticUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Static Authenticator Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesAuthenticatorStaticUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorStaticUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorStaticUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Static Authenticator Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorTotpCreate"></a>
# **stagesAuthenticatorTotpCreate**
> AuthenticatorTOTPStage stagesAuthenticatorTotpCreate(authenticatorTOTPStageRequest)



AuthenticatorTOTPStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val authenticatorTOTPStageRequest : AuthenticatorTOTPStageRequest =  // AuthenticatorTOTPStageRequest | 
try {
    val result : AuthenticatorTOTPStage = apiInstance.stagesAuthenticatorTotpCreate(authenticatorTOTPStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorTotpCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorTotpCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticatorTOTPStageRequest** | [**AuthenticatorTOTPStageRequest**](AuthenticatorTOTPStageRequest.md)|  |

### Return type

[**AuthenticatorTOTPStage**](AuthenticatorTOTPStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorTotpDestroy"></a>
# **stagesAuthenticatorTotpDestroy**
> stagesAuthenticatorTotpDestroy(stageUuid)



AuthenticatorTOTPStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
try {
    apiInstance.stagesAuthenticatorTotpDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorTotpDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorTotpDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorTotpList"></a>
# **stagesAuthenticatorTotpList**
> PaginatedAuthenticatorTOTPStageList stagesAuthenticatorTotpList(configureFlow, digits, friendlyName, name, ordering, page, pageSize, search, stageUuid)



AuthenticatorTOTPStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val configureFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val digits : kotlin.Int = 56 // kotlin.Int | * `6` - 6 digits, widely compatible * `8` - 8 digits, not compatible with apps like Google Authenticator
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedAuthenticatorTOTPStageList = apiInstance.stagesAuthenticatorTotpList(configureFlow, digits, friendlyName, name, ordering, page, pageSize, search, stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorTotpList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorTotpList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configureFlow** | **java.util.UUID**|  | [optional]
 **digits** | **kotlin.Int**| * &#x60;6&#x60; - 6 digits, widely compatible * &#x60;8&#x60; - 8 digits, not compatible with apps like Google Authenticator | [optional] [enum: 6, 8]
 **friendlyName** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedAuthenticatorTOTPStageList**](PaginatedAuthenticatorTOTPStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorTotpPartialUpdate"></a>
# **stagesAuthenticatorTotpPartialUpdate**
> AuthenticatorTOTPStage stagesAuthenticatorTotpPartialUpdate(stageUuid, patchedAuthenticatorTOTPStageRequest)



AuthenticatorTOTPStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
val patchedAuthenticatorTOTPStageRequest : PatchedAuthenticatorTOTPStageRequest =  // PatchedAuthenticatorTOTPStageRequest | 
try {
    val result : AuthenticatorTOTPStage = apiInstance.stagesAuthenticatorTotpPartialUpdate(stageUuid, patchedAuthenticatorTOTPStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorTotpPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorTotpPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. |
 **patchedAuthenticatorTOTPStageRequest** | [**PatchedAuthenticatorTOTPStageRequest**](PatchedAuthenticatorTOTPStageRequest.md)|  | [optional]

### Return type

[**AuthenticatorTOTPStage**](AuthenticatorTOTPStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorTotpRetrieve"></a>
# **stagesAuthenticatorTotpRetrieve**
> AuthenticatorTOTPStage stagesAuthenticatorTotpRetrieve(stageUuid)



AuthenticatorTOTPStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
try {
    val result : AuthenticatorTOTPStage = apiInstance.stagesAuthenticatorTotpRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorTotpRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorTotpRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. |

### Return type

[**AuthenticatorTOTPStage**](AuthenticatorTOTPStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorTotpUpdate"></a>
# **stagesAuthenticatorTotpUpdate**
> AuthenticatorTOTPStage stagesAuthenticatorTotpUpdate(stageUuid, authenticatorTOTPStageRequest)



AuthenticatorTOTPStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
val authenticatorTOTPStageRequest : AuthenticatorTOTPStageRequest =  // AuthenticatorTOTPStageRequest | 
try {
    val result : AuthenticatorTOTPStage = apiInstance.stagesAuthenticatorTotpUpdate(stageUuid, authenticatorTOTPStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorTotpUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorTotpUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. |
 **authenticatorTOTPStageRequest** | [**AuthenticatorTOTPStageRequest**](AuthenticatorTOTPStageRequest.md)|  |

### Return type

[**AuthenticatorTOTPStage**](AuthenticatorTOTPStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorTotpUsedByList"></a>
# **stagesAuthenticatorTotpUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesAuthenticatorTotpUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesAuthenticatorTotpUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorTotpUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorTotpUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorValidateCreate"></a>
# **stagesAuthenticatorValidateCreate**
> AuthenticatorValidateStage stagesAuthenticatorValidateCreate(authenticatorValidateStageRequest)



AuthenticatorValidateStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val authenticatorValidateStageRequest : AuthenticatorValidateStageRequest =  // AuthenticatorValidateStageRequest | 
try {
    val result : AuthenticatorValidateStage = apiInstance.stagesAuthenticatorValidateCreate(authenticatorValidateStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorValidateCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorValidateCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticatorValidateStageRequest** | [**AuthenticatorValidateStageRequest**](AuthenticatorValidateStageRequest.md)|  |

### Return type

[**AuthenticatorValidateStage**](AuthenticatorValidateStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorValidateDestroy"></a>
# **stagesAuthenticatorValidateDestroy**
> stagesAuthenticatorValidateDestroy(stageUuid)



AuthenticatorValidateStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Authenticator Validation Stage.
try {
    apiInstance.stagesAuthenticatorValidateDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorValidateDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorValidateDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Authenticator Validation Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorValidateList"></a>
# **stagesAuthenticatorValidateList**
> PaginatedAuthenticatorValidateStageList stagesAuthenticatorValidateList(configurationStages, name, notConfiguredAction, ordering, page, pageSize, search)



AuthenticatorValidateStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val configurationStages : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val name : kotlin.String = name_example // kotlin.String | 
val notConfiguredAction : kotlin.String = notConfiguredAction_example // kotlin.String | * `skip` - Skip * `deny` - Deny * `configure` - Configure
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedAuthenticatorValidateStageList = apiInstance.stagesAuthenticatorValidateList(configurationStages, name, notConfiguredAction, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorValidateList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorValidateList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configurationStages** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **notConfiguredAction** | **kotlin.String**| * &#x60;skip&#x60; - Skip * &#x60;deny&#x60; - Deny * &#x60;configure&#x60; - Configure | [optional] [enum: configure, deny, skip]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedAuthenticatorValidateStageList**](PaginatedAuthenticatorValidateStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorValidatePartialUpdate"></a>
# **stagesAuthenticatorValidatePartialUpdate**
> AuthenticatorValidateStage stagesAuthenticatorValidatePartialUpdate(stageUuid, patchedAuthenticatorValidateStageRequest)



AuthenticatorValidateStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Authenticator Validation Stage.
val patchedAuthenticatorValidateStageRequest : PatchedAuthenticatorValidateStageRequest =  // PatchedAuthenticatorValidateStageRequest | 
try {
    val result : AuthenticatorValidateStage = apiInstance.stagesAuthenticatorValidatePartialUpdate(stageUuid, patchedAuthenticatorValidateStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorValidatePartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorValidatePartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Authenticator Validation Stage. |
 **patchedAuthenticatorValidateStageRequest** | [**PatchedAuthenticatorValidateStageRequest**](PatchedAuthenticatorValidateStageRequest.md)|  | [optional]

### Return type

[**AuthenticatorValidateStage**](AuthenticatorValidateStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorValidateRetrieve"></a>
# **stagesAuthenticatorValidateRetrieve**
> AuthenticatorValidateStage stagesAuthenticatorValidateRetrieve(stageUuid)



AuthenticatorValidateStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Authenticator Validation Stage.
try {
    val result : AuthenticatorValidateStage = apiInstance.stagesAuthenticatorValidateRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorValidateRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorValidateRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Authenticator Validation Stage. |

### Return type

[**AuthenticatorValidateStage**](AuthenticatorValidateStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorValidateUpdate"></a>
# **stagesAuthenticatorValidateUpdate**
> AuthenticatorValidateStage stagesAuthenticatorValidateUpdate(stageUuid, authenticatorValidateStageRequest)



AuthenticatorValidateStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Authenticator Validation Stage.
val authenticatorValidateStageRequest : AuthenticatorValidateStageRequest =  // AuthenticatorValidateStageRequest | 
try {
    val result : AuthenticatorValidateStage = apiInstance.stagesAuthenticatorValidateUpdate(stageUuid, authenticatorValidateStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorValidateUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorValidateUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Authenticator Validation Stage. |
 **authenticatorValidateStageRequest** | [**AuthenticatorValidateStageRequest**](AuthenticatorValidateStageRequest.md)|  |

### Return type

[**AuthenticatorValidateStage**](AuthenticatorValidateStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorValidateUsedByList"></a>
# **stagesAuthenticatorValidateUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesAuthenticatorValidateUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Authenticator Validation Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesAuthenticatorValidateUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorValidateUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorValidateUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Authenticator Validation Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorWebauthnCreate"></a>
# **stagesAuthenticatorWebauthnCreate**
> AuthenticateWebAuthnStage stagesAuthenticatorWebauthnCreate(authenticateWebAuthnStageRequest)



AuthenticateWebAuthnStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val authenticateWebAuthnStageRequest : AuthenticateWebAuthnStageRequest =  // AuthenticateWebAuthnStageRequest | 
try {
    val result : AuthenticateWebAuthnStage = apiInstance.stagesAuthenticatorWebauthnCreate(authenticateWebAuthnStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorWebauthnCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorWebauthnCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticateWebAuthnStageRequest** | [**AuthenticateWebAuthnStageRequest**](AuthenticateWebAuthnStageRequest.md)|  |

### Return type

[**AuthenticateWebAuthnStage**](AuthenticateWebAuthnStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorWebauthnDestroy"></a>
# **stagesAuthenticatorWebauthnDestroy**
> stagesAuthenticatorWebauthnDestroy(stageUuid)



AuthenticateWebAuthnStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
try {
    apiInstance.stagesAuthenticatorWebauthnDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorWebauthnDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorWebauthnDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorWebauthnList"></a>
# **stagesAuthenticatorWebauthnList**
> PaginatedAuthenticateWebAuthnStageList stagesAuthenticatorWebauthnList(authenticatorAttachment, configureFlow, friendlyName, name, ordering, page, pageSize, residentKeyRequirement, search, stageUuid, userVerification)



AuthenticateWebAuthnStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val authenticatorAttachment : kotlin.String = authenticatorAttachment_example // kotlin.String | * `platform` - Platform * `cross-platform` - Cross Platform
val configureFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val residentKeyRequirement : kotlin.String = residentKeyRequirement_example // kotlin.String | * `discouraged` - Discouraged * `preferred` - Preferred * `required` - Required
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val userVerification : kotlin.String = userVerification_example // kotlin.String | * `required` - Required * `preferred` - Preferred * `discouraged` - Discouraged
try {
    val result : PaginatedAuthenticateWebAuthnStageList = apiInstance.stagesAuthenticatorWebauthnList(authenticatorAttachment, configureFlow, friendlyName, name, ordering, page, pageSize, residentKeyRequirement, search, stageUuid, userVerification)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorWebauthnList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorWebauthnList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticatorAttachment** | **kotlin.String**| * &#x60;platform&#x60; - Platform * &#x60;cross-platform&#x60; - Cross Platform | [optional] [enum: cross-platform, platform]
 **configureFlow** | **java.util.UUID**|  | [optional]
 **friendlyName** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **residentKeyRequirement** | **kotlin.String**| * &#x60;discouraged&#x60; - Discouraged * &#x60;preferred&#x60; - Preferred * &#x60;required&#x60; - Required | [optional] [enum: discouraged, preferred, required]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]
 **userVerification** | **kotlin.String**| * &#x60;required&#x60; - Required * &#x60;preferred&#x60; - Preferred * &#x60;discouraged&#x60; - Discouraged | [optional] [enum: discouraged, preferred, required]

### Return type

[**PaginatedAuthenticateWebAuthnStageList**](PaginatedAuthenticateWebAuthnStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorWebauthnPartialUpdate"></a>
# **stagesAuthenticatorWebauthnPartialUpdate**
> AuthenticateWebAuthnStage stagesAuthenticatorWebauthnPartialUpdate(stageUuid, patchedAuthenticateWebAuthnStageRequest)



AuthenticateWebAuthnStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
val patchedAuthenticateWebAuthnStageRequest : PatchedAuthenticateWebAuthnStageRequest =  // PatchedAuthenticateWebAuthnStageRequest | 
try {
    val result : AuthenticateWebAuthnStage = apiInstance.stagesAuthenticatorWebauthnPartialUpdate(stageUuid, patchedAuthenticateWebAuthnStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorWebauthnPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorWebauthnPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. |
 **patchedAuthenticateWebAuthnStageRequest** | [**PatchedAuthenticateWebAuthnStageRequest**](PatchedAuthenticateWebAuthnStageRequest.md)|  | [optional]

### Return type

[**AuthenticateWebAuthnStage**](AuthenticateWebAuthnStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorWebauthnRetrieve"></a>
# **stagesAuthenticatorWebauthnRetrieve**
> AuthenticateWebAuthnStage stagesAuthenticatorWebauthnRetrieve(stageUuid)



AuthenticateWebAuthnStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
try {
    val result : AuthenticateWebAuthnStage = apiInstance.stagesAuthenticatorWebauthnRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorWebauthnRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorWebauthnRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. |

### Return type

[**AuthenticateWebAuthnStage**](AuthenticateWebAuthnStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesAuthenticatorWebauthnUpdate"></a>
# **stagesAuthenticatorWebauthnUpdate**
> AuthenticateWebAuthnStage stagesAuthenticatorWebauthnUpdate(stageUuid, authenticateWebAuthnStageRequest)



AuthenticateWebAuthnStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
val authenticateWebAuthnStageRequest : AuthenticateWebAuthnStageRequest =  // AuthenticateWebAuthnStageRequest | 
try {
    val result : AuthenticateWebAuthnStage = apiInstance.stagesAuthenticatorWebauthnUpdate(stageUuid, authenticateWebAuthnStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorWebauthnUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorWebauthnUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. |
 **authenticateWebAuthnStageRequest** | [**AuthenticateWebAuthnStageRequest**](AuthenticateWebAuthnStageRequest.md)|  |

### Return type

[**AuthenticateWebAuthnStage**](AuthenticateWebAuthnStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesAuthenticatorWebauthnUsedByList"></a>
# **stagesAuthenticatorWebauthnUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesAuthenticatorWebauthnUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesAuthenticatorWebauthnUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesAuthenticatorWebauthnUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesAuthenticatorWebauthnUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesCaptchaCreate"></a>
# **stagesCaptchaCreate**
> CaptchaStage stagesCaptchaCreate(captchaStageRequest)



CaptchaStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val captchaStageRequest : CaptchaStageRequest =  // CaptchaStageRequest | 
try {
    val result : CaptchaStage = apiInstance.stagesCaptchaCreate(captchaStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesCaptchaCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesCaptchaCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **captchaStageRequest** | [**CaptchaStageRequest**](CaptchaStageRequest.md)|  |

### Return type

[**CaptchaStage**](CaptchaStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesCaptchaDestroy"></a>
# **stagesCaptchaDestroy**
> stagesCaptchaDestroy(stageUuid)



CaptchaStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Captcha Stage.
try {
    apiInstance.stagesCaptchaDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesCaptchaDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesCaptchaDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Captcha Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesCaptchaList"></a>
# **stagesCaptchaList**
> PaginatedCaptchaStageList stagesCaptchaList(name, ordering, page, pageSize, publicKey, search)



CaptchaStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val publicKey : kotlin.String = publicKey_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedCaptchaStageList = apiInstance.stagesCaptchaList(name, ordering, page, pageSize, publicKey, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesCaptchaList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesCaptchaList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **publicKey** | **kotlin.String**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedCaptchaStageList**](PaginatedCaptchaStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesCaptchaPartialUpdate"></a>
# **stagesCaptchaPartialUpdate**
> CaptchaStage stagesCaptchaPartialUpdate(stageUuid, patchedCaptchaStageRequest)



CaptchaStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Captcha Stage.
val patchedCaptchaStageRequest : PatchedCaptchaStageRequest =  // PatchedCaptchaStageRequest | 
try {
    val result : CaptchaStage = apiInstance.stagesCaptchaPartialUpdate(stageUuid, patchedCaptchaStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesCaptchaPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesCaptchaPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Captcha Stage. |
 **patchedCaptchaStageRequest** | [**PatchedCaptchaStageRequest**](PatchedCaptchaStageRequest.md)|  | [optional]

### Return type

[**CaptchaStage**](CaptchaStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesCaptchaRetrieve"></a>
# **stagesCaptchaRetrieve**
> CaptchaStage stagesCaptchaRetrieve(stageUuid)



CaptchaStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Captcha Stage.
try {
    val result : CaptchaStage = apiInstance.stagesCaptchaRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesCaptchaRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesCaptchaRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Captcha Stage. |

### Return type

[**CaptchaStage**](CaptchaStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesCaptchaUpdate"></a>
# **stagesCaptchaUpdate**
> CaptchaStage stagesCaptchaUpdate(stageUuid, captchaStageRequest)



CaptchaStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Captcha Stage.
val captchaStageRequest : CaptchaStageRequest =  // CaptchaStageRequest | 
try {
    val result : CaptchaStage = apiInstance.stagesCaptchaUpdate(stageUuid, captchaStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesCaptchaUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesCaptchaUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Captcha Stage. |
 **captchaStageRequest** | [**CaptchaStageRequest**](CaptchaStageRequest.md)|  |

### Return type

[**CaptchaStage**](CaptchaStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesCaptchaUsedByList"></a>
# **stagesCaptchaUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesCaptchaUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Captcha Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesCaptchaUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesCaptchaUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesCaptchaUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Captcha Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesConsentCreate"></a>
# **stagesConsentCreate**
> ConsentStage stagesConsentCreate(consentStageRequest)



ConsentStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val consentStageRequest : ConsentStageRequest =  // ConsentStageRequest | 
try {
    val result : ConsentStage = apiInstance.stagesConsentCreate(consentStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesConsentCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesConsentCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentStageRequest** | [**ConsentStageRequest**](ConsentStageRequest.md)|  |

### Return type

[**ConsentStage**](ConsentStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesConsentDestroy"></a>
# **stagesConsentDestroy**
> stagesConsentDestroy(stageUuid)



ConsentStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Consent Stage.
try {
    apiInstance.stagesConsentDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesConsentDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesConsentDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Consent Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesConsentList"></a>
# **stagesConsentList**
> PaginatedConsentStageList stagesConsentList(consentExpireIn, mode, name, ordering, page, pageSize, search, stageUuid)



ConsentStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val consentExpireIn : kotlin.String = consentExpireIn_example // kotlin.String | 
val mode : kotlin.String = mode_example // kotlin.String | * `always_require` - Always Require * `permanent` - Permanent * `expiring` - Expiring
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedConsentStageList = apiInstance.stagesConsentList(consentExpireIn, mode, name, ordering, page, pageSize, search, stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesConsentList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesConsentList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentExpireIn** | **kotlin.String**|  | [optional]
 **mode** | **kotlin.String**| * &#x60;always_require&#x60; - Always Require * &#x60;permanent&#x60; - Permanent * &#x60;expiring&#x60; - Expiring | [optional] [enum: always_require, expiring, permanent]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedConsentStageList**](PaginatedConsentStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesConsentPartialUpdate"></a>
# **stagesConsentPartialUpdate**
> ConsentStage stagesConsentPartialUpdate(stageUuid, patchedConsentStageRequest)



ConsentStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Consent Stage.
val patchedConsentStageRequest : PatchedConsentStageRequest =  // PatchedConsentStageRequest | 
try {
    val result : ConsentStage = apiInstance.stagesConsentPartialUpdate(stageUuid, patchedConsentStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesConsentPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesConsentPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Consent Stage. |
 **patchedConsentStageRequest** | [**PatchedConsentStageRequest**](PatchedConsentStageRequest.md)|  | [optional]

### Return type

[**ConsentStage**](ConsentStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesConsentRetrieve"></a>
# **stagesConsentRetrieve**
> ConsentStage stagesConsentRetrieve(stageUuid)



ConsentStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Consent Stage.
try {
    val result : ConsentStage = apiInstance.stagesConsentRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesConsentRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesConsentRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Consent Stage. |

### Return type

[**ConsentStage**](ConsentStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesConsentUpdate"></a>
# **stagesConsentUpdate**
> ConsentStage stagesConsentUpdate(stageUuid, consentStageRequest)



ConsentStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Consent Stage.
val consentStageRequest : ConsentStageRequest =  // ConsentStageRequest | 
try {
    val result : ConsentStage = apiInstance.stagesConsentUpdate(stageUuid, consentStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesConsentUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesConsentUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Consent Stage. |
 **consentStageRequest** | [**ConsentStageRequest**](ConsentStageRequest.md)|  |

### Return type

[**ConsentStage**](ConsentStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesConsentUsedByList"></a>
# **stagesConsentUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesConsentUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Consent Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesConsentUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesConsentUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesConsentUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Consent Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesDenyCreate"></a>
# **stagesDenyCreate**
> DenyStage stagesDenyCreate(denyStageRequest)



DenyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val denyStageRequest : DenyStageRequest =  // DenyStageRequest | 
try {
    val result : DenyStage = apiInstance.stagesDenyCreate(denyStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDenyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDenyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **denyStageRequest** | [**DenyStageRequest**](DenyStageRequest.md)|  |

### Return type

[**DenyStage**](DenyStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesDenyDestroy"></a>
# **stagesDenyDestroy**
> stagesDenyDestroy(stageUuid)



DenyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Deny Stage.
try {
    apiInstance.stagesDenyDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDenyDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDenyDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Deny Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesDenyList"></a>
# **stagesDenyList**
> PaginatedDenyStageList stagesDenyList(denyMessage, name, ordering, page, pageSize, search, stageUuid)



DenyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val denyMessage : kotlin.String = denyMessage_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedDenyStageList = apiInstance.stagesDenyList(denyMessage, name, ordering, page, pageSize, search, stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDenyList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDenyList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **denyMessage** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedDenyStageList**](PaginatedDenyStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesDenyPartialUpdate"></a>
# **stagesDenyPartialUpdate**
> DenyStage stagesDenyPartialUpdate(stageUuid, patchedDenyStageRequest)



DenyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Deny Stage.
val patchedDenyStageRequest : PatchedDenyStageRequest =  // PatchedDenyStageRequest | 
try {
    val result : DenyStage = apiInstance.stagesDenyPartialUpdate(stageUuid, patchedDenyStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDenyPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDenyPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Deny Stage. |
 **patchedDenyStageRequest** | [**PatchedDenyStageRequest**](PatchedDenyStageRequest.md)|  | [optional]

### Return type

[**DenyStage**](DenyStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesDenyRetrieve"></a>
# **stagesDenyRetrieve**
> DenyStage stagesDenyRetrieve(stageUuid)



DenyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Deny Stage.
try {
    val result : DenyStage = apiInstance.stagesDenyRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDenyRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDenyRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Deny Stage. |

### Return type

[**DenyStage**](DenyStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesDenyUpdate"></a>
# **stagesDenyUpdate**
> DenyStage stagesDenyUpdate(stageUuid, denyStageRequest)



DenyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Deny Stage.
val denyStageRequest : DenyStageRequest =  // DenyStageRequest | 
try {
    val result : DenyStage = apiInstance.stagesDenyUpdate(stageUuid, denyStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDenyUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDenyUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Deny Stage. |
 **denyStageRequest** | [**DenyStageRequest**](DenyStageRequest.md)|  |

### Return type

[**DenyStage**](DenyStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesDenyUsedByList"></a>
# **stagesDenyUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesDenyUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Deny Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesDenyUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDenyUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDenyUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Deny Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesDummyCreate"></a>
# **stagesDummyCreate**
> DummyStage stagesDummyCreate(dummyStageRequest)



DummyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val dummyStageRequest : DummyStageRequest =  // DummyStageRequest | 
try {
    val result : DummyStage = apiInstance.stagesDummyCreate(dummyStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDummyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDummyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dummyStageRequest** | [**DummyStageRequest**](DummyStageRequest.md)|  |

### Return type

[**DummyStage**](DummyStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesDummyDestroy"></a>
# **stagesDummyDestroy**
> stagesDummyDestroy(stageUuid)



DummyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Stage.
try {
    apiInstance.stagesDummyDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDummyDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDummyDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Dummy Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesDummyList"></a>
# **stagesDummyList**
> PaginatedDummyStageList stagesDummyList(name, ordering, page, pageSize, search, stageUuid, throwError)



DummyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val throwError : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : PaginatedDummyStageList = apiInstance.stagesDummyList(name, ordering, page, pageSize, search, stageUuid, throwError)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDummyList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDummyList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]
 **throwError** | **kotlin.Boolean**|  | [optional]

### Return type

[**PaginatedDummyStageList**](PaginatedDummyStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesDummyPartialUpdate"></a>
# **stagesDummyPartialUpdate**
> DummyStage stagesDummyPartialUpdate(stageUuid, patchedDummyStageRequest)



DummyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Stage.
val patchedDummyStageRequest : PatchedDummyStageRequest =  // PatchedDummyStageRequest | 
try {
    val result : DummyStage = apiInstance.stagesDummyPartialUpdate(stageUuid, patchedDummyStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDummyPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDummyPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Dummy Stage. |
 **patchedDummyStageRequest** | [**PatchedDummyStageRequest**](PatchedDummyStageRequest.md)|  | [optional]

### Return type

[**DummyStage**](DummyStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesDummyRetrieve"></a>
# **stagesDummyRetrieve**
> DummyStage stagesDummyRetrieve(stageUuid)



DummyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Stage.
try {
    val result : DummyStage = apiInstance.stagesDummyRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDummyRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDummyRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Dummy Stage. |

### Return type

[**DummyStage**](DummyStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesDummyUpdate"></a>
# **stagesDummyUpdate**
> DummyStage stagesDummyUpdate(stageUuid, dummyStageRequest)



DummyStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Stage.
val dummyStageRequest : DummyStageRequest =  // DummyStageRequest | 
try {
    val result : DummyStage = apiInstance.stagesDummyUpdate(stageUuid, dummyStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDummyUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDummyUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Dummy Stage. |
 **dummyStageRequest** | [**DummyStageRequest**](DummyStageRequest.md)|  |

### Return type

[**DummyStage**](DummyStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesDummyUsedByList"></a>
# **stagesDummyUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesDummyUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesDummyUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesDummyUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesDummyUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Dummy Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesEmailCreate"></a>
# **stagesEmailCreate**
> EmailStage stagesEmailCreate(emailStageRequest)



EmailStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val emailStageRequest : EmailStageRequest =  // EmailStageRequest | 
try {
    val result : EmailStage = apiInstance.stagesEmailCreate(emailStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesEmailCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesEmailCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailStageRequest** | [**EmailStageRequest**](EmailStageRequest.md)|  |

### Return type

[**EmailStage**](EmailStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesEmailDestroy"></a>
# **stagesEmailDestroy**
> stagesEmailDestroy(stageUuid)



EmailStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Email Stage.
try {
    apiInstance.stagesEmailDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesEmailDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesEmailDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Email Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesEmailList"></a>
# **stagesEmailList**
> PaginatedEmailStageList stagesEmailList(activateUserOnSuccess, fromAddress, host, name, ordering, page, pageSize, port, search, subject, template, timeout, tokenExpiry, useGlobalSettings, useSsl, useTls, username)



EmailStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val activateUserOnSuccess : kotlin.Boolean = true // kotlin.Boolean | 
val fromAddress : kotlin.String = fromAddress_example // kotlin.String | 
val host : kotlin.String = host_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val port : kotlin.Int = 56 // kotlin.Int | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val subject : kotlin.String = subject_example // kotlin.String | 
val template : kotlin.String = template_example // kotlin.String | 
val timeout : kotlin.Int = 56 // kotlin.Int | 
val tokenExpiry : kotlin.Int = 56 // kotlin.Int | 
val useGlobalSettings : kotlin.Boolean = true // kotlin.Boolean | 
val useSsl : kotlin.Boolean = true // kotlin.Boolean | 
val useTls : kotlin.Boolean = true // kotlin.Boolean | 
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : PaginatedEmailStageList = apiInstance.stagesEmailList(activateUserOnSuccess, fromAddress, host, name, ordering, page, pageSize, port, search, subject, template, timeout, tokenExpiry, useGlobalSettings, useSsl, useTls, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesEmailList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesEmailList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activateUserOnSuccess** | **kotlin.Boolean**|  | [optional]
 **fromAddress** | **kotlin.String**|  | [optional]
 **host** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **port** | **kotlin.Int**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **subject** | **kotlin.String**|  | [optional]
 **template** | **kotlin.String**|  | [optional]
 **timeout** | **kotlin.Int**|  | [optional]
 **tokenExpiry** | **kotlin.Int**|  | [optional]
 **useGlobalSettings** | **kotlin.Boolean**|  | [optional]
 **useSsl** | **kotlin.Boolean**|  | [optional]
 **useTls** | **kotlin.Boolean**|  | [optional]
 **username** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedEmailStageList**](PaginatedEmailStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesEmailPartialUpdate"></a>
# **stagesEmailPartialUpdate**
> EmailStage stagesEmailPartialUpdate(stageUuid, patchedEmailStageRequest)



EmailStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Email Stage.
val patchedEmailStageRequest : PatchedEmailStageRequest =  // PatchedEmailStageRequest | 
try {
    val result : EmailStage = apiInstance.stagesEmailPartialUpdate(stageUuid, patchedEmailStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesEmailPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesEmailPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Email Stage. |
 **patchedEmailStageRequest** | [**PatchedEmailStageRequest**](PatchedEmailStageRequest.md)|  | [optional]

### Return type

[**EmailStage**](EmailStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesEmailRetrieve"></a>
# **stagesEmailRetrieve**
> EmailStage stagesEmailRetrieve(stageUuid)



EmailStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Email Stage.
try {
    val result : EmailStage = apiInstance.stagesEmailRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesEmailRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesEmailRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Email Stage. |

### Return type

[**EmailStage**](EmailStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesEmailTemplatesList"></a>
# **stagesEmailTemplatesList**
> kotlin.collections.List&lt;TypeCreate&gt; stagesEmailTemplatesList()



Get all available templates, including custom templates

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
try {
    val result : kotlin.collections.List<TypeCreate> = apiInstance.stagesEmailTemplatesList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesEmailTemplatesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesEmailTemplatesList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;TypeCreate&gt;**](TypeCreate.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesEmailUpdate"></a>
# **stagesEmailUpdate**
> EmailStage stagesEmailUpdate(stageUuid, emailStageRequest)



EmailStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Email Stage.
val emailStageRequest : EmailStageRequest =  // EmailStageRequest | 
try {
    val result : EmailStage = apiInstance.stagesEmailUpdate(stageUuid, emailStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesEmailUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesEmailUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Email Stage. |
 **emailStageRequest** | [**EmailStageRequest**](EmailStageRequest.md)|  |

### Return type

[**EmailStage**](EmailStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesEmailUsedByList"></a>
# **stagesEmailUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesEmailUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Email Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesEmailUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesEmailUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesEmailUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Email Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesIdentificationCreate"></a>
# **stagesIdentificationCreate**
> IdentificationStage stagesIdentificationCreate(identificationStageRequest)



IdentificationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val identificationStageRequest : IdentificationStageRequest =  // IdentificationStageRequest | 
try {
    val result : IdentificationStage = apiInstance.stagesIdentificationCreate(identificationStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesIdentificationCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesIdentificationCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identificationStageRequest** | [**IdentificationStageRequest**](IdentificationStageRequest.md)|  |

### Return type

[**IdentificationStage**](IdentificationStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesIdentificationDestroy"></a>
# **stagesIdentificationDestroy**
> stagesIdentificationDestroy(stageUuid)



IdentificationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Identification Stage.
try {
    apiInstance.stagesIdentificationDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesIdentificationDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesIdentificationDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Identification Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesIdentificationList"></a>
# **stagesIdentificationList**
> PaginatedIdentificationStageList stagesIdentificationList(caseInsensitiveMatching, enrollmentFlow, name, ordering, page, pageSize, passwordStage, passwordlessFlow, recoveryFlow, search, showMatchedUser, showSourceLabels)



IdentificationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val caseInsensitiveMatching : kotlin.Boolean = true // kotlin.Boolean | 
val enrollmentFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val passwordStage : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val passwordlessFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val recoveryFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val showMatchedUser : kotlin.Boolean = true // kotlin.Boolean | 
val showSourceLabels : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : PaginatedIdentificationStageList = apiInstance.stagesIdentificationList(caseInsensitiveMatching, enrollmentFlow, name, ordering, page, pageSize, passwordStage, passwordlessFlow, recoveryFlow, search, showMatchedUser, showSourceLabels)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesIdentificationList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesIdentificationList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseInsensitiveMatching** | **kotlin.Boolean**|  | [optional]
 **enrollmentFlow** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **passwordStage** | **java.util.UUID**|  | [optional]
 **passwordlessFlow** | **java.util.UUID**|  | [optional]
 **recoveryFlow** | **java.util.UUID**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **showMatchedUser** | **kotlin.Boolean**|  | [optional]
 **showSourceLabels** | **kotlin.Boolean**|  | [optional]

### Return type

[**PaginatedIdentificationStageList**](PaginatedIdentificationStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesIdentificationPartialUpdate"></a>
# **stagesIdentificationPartialUpdate**
> IdentificationStage stagesIdentificationPartialUpdate(stageUuid, patchedIdentificationStageRequest)



IdentificationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Identification Stage.
val patchedIdentificationStageRequest : PatchedIdentificationStageRequest =  // PatchedIdentificationStageRequest | 
try {
    val result : IdentificationStage = apiInstance.stagesIdentificationPartialUpdate(stageUuid, patchedIdentificationStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesIdentificationPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesIdentificationPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Identification Stage. |
 **patchedIdentificationStageRequest** | [**PatchedIdentificationStageRequest**](PatchedIdentificationStageRequest.md)|  | [optional]

### Return type

[**IdentificationStage**](IdentificationStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesIdentificationRetrieve"></a>
# **stagesIdentificationRetrieve**
> IdentificationStage stagesIdentificationRetrieve(stageUuid)



IdentificationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Identification Stage.
try {
    val result : IdentificationStage = apiInstance.stagesIdentificationRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesIdentificationRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesIdentificationRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Identification Stage. |

### Return type

[**IdentificationStage**](IdentificationStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesIdentificationUpdate"></a>
# **stagesIdentificationUpdate**
> IdentificationStage stagesIdentificationUpdate(stageUuid, identificationStageRequest)



IdentificationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Identification Stage.
val identificationStageRequest : IdentificationStageRequest =  // IdentificationStageRequest | 
try {
    val result : IdentificationStage = apiInstance.stagesIdentificationUpdate(stageUuid, identificationStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesIdentificationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesIdentificationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Identification Stage. |
 **identificationStageRequest** | [**IdentificationStageRequest**](IdentificationStageRequest.md)|  |

### Return type

[**IdentificationStage**](IdentificationStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesIdentificationUsedByList"></a>
# **stagesIdentificationUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesIdentificationUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Identification Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesIdentificationUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesIdentificationUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesIdentificationUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Identification Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesInvitationInvitationsCreate"></a>
# **stagesInvitationInvitationsCreate**
> Invitation stagesInvitationInvitationsCreate(invitationRequest)



Invitation Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val invitationRequest : InvitationRequest =  // InvitationRequest | 
try {
    val result : Invitation = apiInstance.stagesInvitationInvitationsCreate(invitationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationInvitationsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationInvitationsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationRequest** | [**InvitationRequest**](InvitationRequest.md)|  |

### Return type

[**Invitation**](Invitation.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesInvitationInvitationsDestroy"></a>
# **stagesInvitationInvitationsDestroy**
> stagesInvitationInvitationsDestroy(inviteUuid)



Invitation Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val inviteUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation.
try {
    apiInstance.stagesInvitationInvitationsDestroy(inviteUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationInvitationsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationInvitationsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteUuid** | **java.util.UUID**| A UUID string identifying this Invitation. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesInvitationInvitationsList"></a>
# **stagesInvitationInvitationsList**
> PaginatedInvitationList stagesInvitationInvitationsList(createdByUsername, expires, flowSlug, name, ordering, page, pageSize, search)



Invitation Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val createdByUsername : kotlin.String = createdByUsername_example // kotlin.String | 
val expires : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val flowSlug : kotlin.String = flowSlug_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedInvitationList = apiInstance.stagesInvitationInvitationsList(createdByUsername, expires, flowSlug, name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationInvitationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationInvitationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdByUsername** | **kotlin.String**|  | [optional]
 **expires** | **java.time.OffsetDateTime**|  | [optional]
 **flowSlug** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedInvitationList**](PaginatedInvitationList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesInvitationInvitationsPartialUpdate"></a>
# **stagesInvitationInvitationsPartialUpdate**
> Invitation stagesInvitationInvitationsPartialUpdate(inviteUuid, patchedInvitationRequest)



Invitation Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val inviteUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation.
val patchedInvitationRequest : PatchedInvitationRequest =  // PatchedInvitationRequest | 
try {
    val result : Invitation = apiInstance.stagesInvitationInvitationsPartialUpdate(inviteUuid, patchedInvitationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationInvitationsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationInvitationsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteUuid** | **java.util.UUID**| A UUID string identifying this Invitation. |
 **patchedInvitationRequest** | [**PatchedInvitationRequest**](PatchedInvitationRequest.md)|  | [optional]

### Return type

[**Invitation**](Invitation.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesInvitationInvitationsRetrieve"></a>
# **stagesInvitationInvitationsRetrieve**
> Invitation stagesInvitationInvitationsRetrieve(inviteUuid)



Invitation Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val inviteUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation.
try {
    val result : Invitation = apiInstance.stagesInvitationInvitationsRetrieve(inviteUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationInvitationsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationInvitationsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteUuid** | **java.util.UUID**| A UUID string identifying this Invitation. |

### Return type

[**Invitation**](Invitation.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesInvitationInvitationsUpdate"></a>
# **stagesInvitationInvitationsUpdate**
> Invitation stagesInvitationInvitationsUpdate(inviteUuid, invitationRequest)



Invitation Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val inviteUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation.
val invitationRequest : InvitationRequest =  // InvitationRequest | 
try {
    val result : Invitation = apiInstance.stagesInvitationInvitationsUpdate(inviteUuid, invitationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationInvitationsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationInvitationsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteUuid** | **java.util.UUID**| A UUID string identifying this Invitation. |
 **invitationRequest** | [**InvitationRequest**](InvitationRequest.md)|  |

### Return type

[**Invitation**](Invitation.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesInvitationInvitationsUsedByList"></a>
# **stagesInvitationInvitationsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesInvitationInvitationsUsedByList(inviteUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val inviteUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesInvitationInvitationsUsedByList(inviteUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationInvitationsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationInvitationsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteUuid** | **java.util.UUID**| A UUID string identifying this Invitation. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesInvitationStagesCreate"></a>
# **stagesInvitationStagesCreate**
> InvitationStage stagesInvitationStagesCreate(invitationStageRequest)



InvitationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val invitationStageRequest : InvitationStageRequest =  // InvitationStageRequest | 
try {
    val result : InvitationStage = apiInstance.stagesInvitationStagesCreate(invitationStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationStagesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationStagesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationStageRequest** | [**InvitationStageRequest**](InvitationStageRequest.md)|  |

### Return type

[**InvitationStage**](InvitationStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesInvitationStagesDestroy"></a>
# **stagesInvitationStagesDestroy**
> stagesInvitationStagesDestroy(stageUuid)



InvitationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation Stage.
try {
    apiInstance.stagesInvitationStagesDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationStagesDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationStagesDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Invitation Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesInvitationStagesList"></a>
# **stagesInvitationStagesList**
> PaginatedInvitationStageList stagesInvitationStagesList(continueFlowWithoutInvitation, name, noFlows, ordering, page, pageSize, search, stageUuid)



InvitationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val continueFlowWithoutInvitation : kotlin.Boolean = true // kotlin.Boolean | 
val name : kotlin.String = name_example // kotlin.String | 
val noFlows : kotlin.Boolean = true // kotlin.Boolean | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedInvitationStageList = apiInstance.stagesInvitationStagesList(continueFlowWithoutInvitation, name, noFlows, ordering, page, pageSize, search, stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationStagesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationStagesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **continueFlowWithoutInvitation** | **kotlin.Boolean**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **noFlows** | **kotlin.Boolean**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedInvitationStageList**](PaginatedInvitationStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesInvitationStagesPartialUpdate"></a>
# **stagesInvitationStagesPartialUpdate**
> InvitationStage stagesInvitationStagesPartialUpdate(stageUuid, patchedInvitationStageRequest)



InvitationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation Stage.
val patchedInvitationStageRequest : PatchedInvitationStageRequest =  // PatchedInvitationStageRequest | 
try {
    val result : InvitationStage = apiInstance.stagesInvitationStagesPartialUpdate(stageUuid, patchedInvitationStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationStagesPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationStagesPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Invitation Stage. |
 **patchedInvitationStageRequest** | [**PatchedInvitationStageRequest**](PatchedInvitationStageRequest.md)|  | [optional]

### Return type

[**InvitationStage**](InvitationStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesInvitationStagesRetrieve"></a>
# **stagesInvitationStagesRetrieve**
> InvitationStage stagesInvitationStagesRetrieve(stageUuid)



InvitationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation Stage.
try {
    val result : InvitationStage = apiInstance.stagesInvitationStagesRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationStagesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationStagesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Invitation Stage. |

### Return type

[**InvitationStage**](InvitationStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesInvitationStagesUpdate"></a>
# **stagesInvitationStagesUpdate**
> InvitationStage stagesInvitationStagesUpdate(stageUuid, invitationStageRequest)



InvitationStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation Stage.
val invitationStageRequest : InvitationStageRequest =  // InvitationStageRequest | 
try {
    val result : InvitationStage = apiInstance.stagesInvitationStagesUpdate(stageUuid, invitationStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationStagesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationStagesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Invitation Stage. |
 **invitationStageRequest** | [**InvitationStageRequest**](InvitationStageRequest.md)|  |

### Return type

[**InvitationStage**](InvitationStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesInvitationStagesUsedByList"></a>
# **stagesInvitationStagesUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesInvitationStagesUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Invitation Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesInvitationStagesUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesInvitationStagesUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesInvitationStagesUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Invitation Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPasswordCreate"></a>
# **stagesPasswordCreate**
> PasswordStage stagesPasswordCreate(passwordStageRequest)



PasswordStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val passwordStageRequest : PasswordStageRequest =  // PasswordStageRequest | 
try {
    val result : PasswordStage = apiInstance.stagesPasswordCreate(passwordStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPasswordCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPasswordCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordStageRequest** | [**PasswordStageRequest**](PasswordStageRequest.md)|  |

### Return type

[**PasswordStage**](PasswordStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPasswordDestroy"></a>
# **stagesPasswordDestroy**
> stagesPasswordDestroy(stageUuid)



PasswordStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Stage.
try {
    apiInstance.stagesPasswordDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPasswordDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPasswordDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Password Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPasswordList"></a>
# **stagesPasswordList**
> PaginatedPasswordStageList stagesPasswordList(configureFlow, failedAttemptsBeforeCancel, name, ordering, page, pageSize, search)



PasswordStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val configureFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val failedAttemptsBeforeCancel : kotlin.Int = 56 // kotlin.Int | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedPasswordStageList = apiInstance.stagesPasswordList(configureFlow, failedAttemptsBeforeCancel, name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPasswordList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPasswordList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configureFlow** | **java.util.UUID**|  | [optional]
 **failedAttemptsBeforeCancel** | **kotlin.Int**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedPasswordStageList**](PaginatedPasswordStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPasswordPartialUpdate"></a>
# **stagesPasswordPartialUpdate**
> PasswordStage stagesPasswordPartialUpdate(stageUuid, patchedPasswordStageRequest)



PasswordStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Stage.
val patchedPasswordStageRequest : PatchedPasswordStageRequest =  // PatchedPasswordStageRequest | 
try {
    val result : PasswordStage = apiInstance.stagesPasswordPartialUpdate(stageUuid, patchedPasswordStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPasswordPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPasswordPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Password Stage. |
 **patchedPasswordStageRequest** | [**PatchedPasswordStageRequest**](PatchedPasswordStageRequest.md)|  | [optional]

### Return type

[**PasswordStage**](PasswordStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPasswordRetrieve"></a>
# **stagesPasswordRetrieve**
> PasswordStage stagesPasswordRetrieve(stageUuid)



PasswordStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Stage.
try {
    val result : PasswordStage = apiInstance.stagesPasswordRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPasswordRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPasswordRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Password Stage. |

### Return type

[**PasswordStage**](PasswordStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPasswordUpdate"></a>
# **stagesPasswordUpdate**
> PasswordStage stagesPasswordUpdate(stageUuid, passwordStageRequest)



PasswordStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Stage.
val passwordStageRequest : PasswordStageRequest =  // PasswordStageRequest | 
try {
    val result : PasswordStage = apiInstance.stagesPasswordUpdate(stageUuid, passwordStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPasswordUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPasswordUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Password Stage. |
 **passwordStageRequest** | [**PasswordStageRequest**](PasswordStageRequest.md)|  |

### Return type

[**PasswordStage**](PasswordStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPasswordUsedByList"></a>
# **stagesPasswordUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesPasswordUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesPasswordUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPasswordUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPasswordUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Password Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPromptPromptsCreate"></a>
# **stagesPromptPromptsCreate**
> Prompt stagesPromptPromptsCreate(promptRequest)



Prompt Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val promptRequest : PromptRequest =  // PromptRequest | 
try {
    val result : Prompt = apiInstance.stagesPromptPromptsCreate(promptRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptPromptsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptPromptsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promptRequest** | [**PromptRequest**](PromptRequest.md)|  |

### Return type

[**Prompt**](Prompt.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPromptPromptsDestroy"></a>
# **stagesPromptPromptsDestroy**
> stagesPromptPromptsDestroy(promptUuid)



Prompt Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val promptUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt.
try {
    apiInstance.stagesPromptPromptsDestroy(promptUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptPromptsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptPromptsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promptUuid** | **java.util.UUID**| A UUID string identifying this Prompt. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPromptPromptsList"></a>
# **stagesPromptPromptsList**
> PaginatedPromptList stagesPromptPromptsList(fieldKey, label, name, ordering, page, pageSize, placeholder, search, type)



Prompt Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val fieldKey : kotlin.String = fieldKey_example // kotlin.String | 
val label : kotlin.String = label_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val placeholder : kotlin.String = placeholder_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val type : kotlin.String = type_example // kotlin.String | * `text` - Text: Simple Text input * `text_area` - Text area: Multiline Text Input. * `text_read_only` - Text (read-only): Simple Text input, but cannot be edited. * `text_area_read_only` - Text area (read-only): Multiline Text input, but cannot be edited. * `username` - Username: Same as Text input, but checks for and prevents duplicate usernames. * `email` - Email: Text field with Email type. * `password` - Password: Masked input, multiple inputs of this type on the same prompt need to be identical. * `number` - Number * `checkbox` - Checkbox * `radio-button-group` - Fixed choice field rendered as a group of radio buttons. * `dropdown` - Fixed choice field rendered as a dropdown. * `date` - Date * `date-time` - Date Time * `file` - File: File upload for arbitrary files. File content will be available in flow context as data-URI * `separator` - Separator: Static Separator Line * `hidden` - Hidden: Hidden field, can be used to insert data into form. * `static` - Static: Static value, displayed as-is. * `ak-locale` - authentik: Selection of locales authentik supports
try {
    val result : PaginatedPromptList = apiInstance.stagesPromptPromptsList(fieldKey, label, name, ordering, page, pageSize, placeholder, search, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptPromptsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptPromptsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldKey** | **kotlin.String**|  | [optional]
 **label** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **placeholder** | **kotlin.String**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **type** | **kotlin.String**| * &#x60;text&#x60; - Text: Simple Text input * &#x60;text_area&#x60; - Text area: Multiline Text Input. * &#x60;text_read_only&#x60; - Text (read-only): Simple Text input, but cannot be edited. * &#x60;text_area_read_only&#x60; - Text area (read-only): Multiline Text input, but cannot be edited. * &#x60;username&#x60; - Username: Same as Text input, but checks for and prevents duplicate usernames. * &#x60;email&#x60; - Email: Text field with Email type. * &#x60;password&#x60; - Password: Masked input, multiple inputs of this type on the same prompt need to be identical. * &#x60;number&#x60; - Number * &#x60;checkbox&#x60; - Checkbox * &#x60;radio-button-group&#x60; - Fixed choice field rendered as a group of radio buttons. * &#x60;dropdown&#x60; - Fixed choice field rendered as a dropdown. * &#x60;date&#x60; - Date * &#x60;date-time&#x60; - Date Time * &#x60;file&#x60; - File: File upload for arbitrary files. File content will be available in flow context as data-URI * &#x60;separator&#x60; - Separator: Static Separator Line * &#x60;hidden&#x60; - Hidden: Hidden field, can be used to insert data into form. * &#x60;static&#x60; - Static: Static value, displayed as-is. * &#x60;ak-locale&#x60; - authentik: Selection of locales authentik supports | [optional] [enum: ak-locale, checkbox, date, date-time, dropdown, email, file, hidden, number, password, radio-button-group, separator, static, text, text_area, text_area_read_only, text_read_only, username]

### Return type

[**PaginatedPromptList**](PaginatedPromptList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPromptPromptsPartialUpdate"></a>
# **stagesPromptPromptsPartialUpdate**
> Prompt stagesPromptPromptsPartialUpdate(promptUuid, patchedPromptRequest)



Prompt Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val promptUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt.
val patchedPromptRequest : PatchedPromptRequest =  // PatchedPromptRequest | 
try {
    val result : Prompt = apiInstance.stagesPromptPromptsPartialUpdate(promptUuid, patchedPromptRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptPromptsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptPromptsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promptUuid** | **java.util.UUID**| A UUID string identifying this Prompt. |
 **patchedPromptRequest** | [**PatchedPromptRequest**](PatchedPromptRequest.md)|  | [optional]

### Return type

[**Prompt**](Prompt.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPromptPromptsPreviewCreate"></a>
# **stagesPromptPromptsPreviewCreate**
> PromptChallenge stagesPromptPromptsPreviewCreate(promptRequest)



Preview a prompt as a challenge, just like a flow would receive

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val promptRequest : PromptRequest =  // PromptRequest | 
try {
    val result : PromptChallenge = apiInstance.stagesPromptPromptsPreviewCreate(promptRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptPromptsPreviewCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptPromptsPreviewCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promptRequest** | [**PromptRequest**](PromptRequest.md)|  |

### Return type

[**PromptChallenge**](PromptChallenge.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPromptPromptsRetrieve"></a>
# **stagesPromptPromptsRetrieve**
> Prompt stagesPromptPromptsRetrieve(promptUuid)



Prompt Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val promptUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt.
try {
    val result : Prompt = apiInstance.stagesPromptPromptsRetrieve(promptUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptPromptsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptPromptsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promptUuid** | **java.util.UUID**| A UUID string identifying this Prompt. |

### Return type

[**Prompt**](Prompt.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPromptPromptsUpdate"></a>
# **stagesPromptPromptsUpdate**
> Prompt stagesPromptPromptsUpdate(promptUuid, promptRequest)



Prompt Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val promptUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt.
val promptRequest : PromptRequest =  // PromptRequest | 
try {
    val result : Prompt = apiInstance.stagesPromptPromptsUpdate(promptUuid, promptRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptPromptsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptPromptsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promptUuid** | **java.util.UUID**| A UUID string identifying this Prompt. |
 **promptRequest** | [**PromptRequest**](PromptRequest.md)|  |

### Return type

[**Prompt**](Prompt.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPromptPromptsUsedByList"></a>
# **stagesPromptPromptsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesPromptPromptsUsedByList(promptUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val promptUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesPromptPromptsUsedByList(promptUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptPromptsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptPromptsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promptUuid** | **java.util.UUID**| A UUID string identifying this Prompt. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPromptStagesCreate"></a>
# **stagesPromptStagesCreate**
> PromptStage stagesPromptStagesCreate(promptStageRequest)



PromptStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val promptStageRequest : PromptStageRequest =  // PromptStageRequest | 
try {
    val result : PromptStage = apiInstance.stagesPromptStagesCreate(promptStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptStagesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptStagesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promptStageRequest** | [**PromptStageRequest**](PromptStageRequest.md)|  |

### Return type

[**PromptStage**](PromptStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPromptStagesDestroy"></a>
# **stagesPromptStagesDestroy**
> stagesPromptStagesDestroy(stageUuid)



PromptStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt Stage.
try {
    apiInstance.stagesPromptStagesDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptStagesDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptStagesDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Prompt Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPromptStagesList"></a>
# **stagesPromptStagesList**
> PaginatedPromptStageList stagesPromptStagesList(fields, name, ordering, page, pageSize, search, stageUuid, validationPolicies)



PromptStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val fields : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val validationPolicies : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
try {
    val result : PaginatedPromptStageList = apiInstance.stagesPromptStagesList(fields, name, ordering, page, pageSize, search, stageUuid, validationPolicies)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptStagesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptStagesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]
 **validationPolicies** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]

### Return type

[**PaginatedPromptStageList**](PaginatedPromptStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPromptStagesPartialUpdate"></a>
# **stagesPromptStagesPartialUpdate**
> PromptStage stagesPromptStagesPartialUpdate(stageUuid, patchedPromptStageRequest)



PromptStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt Stage.
val patchedPromptStageRequest : PatchedPromptStageRequest =  // PatchedPromptStageRequest | 
try {
    val result : PromptStage = apiInstance.stagesPromptStagesPartialUpdate(stageUuid, patchedPromptStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptStagesPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptStagesPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Prompt Stage. |
 **patchedPromptStageRequest** | [**PatchedPromptStageRequest**](PatchedPromptStageRequest.md)|  | [optional]

### Return type

[**PromptStage**](PromptStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPromptStagesRetrieve"></a>
# **stagesPromptStagesRetrieve**
> PromptStage stagesPromptStagesRetrieve(stageUuid)



PromptStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt Stage.
try {
    val result : PromptStage = apiInstance.stagesPromptStagesRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptStagesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptStagesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Prompt Stage. |

### Return type

[**PromptStage**](PromptStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesPromptStagesUpdate"></a>
# **stagesPromptStagesUpdate**
> PromptStage stagesPromptStagesUpdate(stageUuid, promptStageRequest)



PromptStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt Stage.
val promptStageRequest : PromptStageRequest =  // PromptStageRequest | 
try {
    val result : PromptStage = apiInstance.stagesPromptStagesUpdate(stageUuid, promptStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptStagesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptStagesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Prompt Stage. |
 **promptStageRequest** | [**PromptStageRequest**](PromptStageRequest.md)|  |

### Return type

[**PromptStage**](PromptStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesPromptStagesUsedByList"></a>
# **stagesPromptStagesUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesPromptStagesUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Prompt Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesPromptStagesUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesPromptStagesUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesPromptStagesUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this Prompt Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserDeleteCreate"></a>
# **stagesUserDeleteCreate**
> UserDeleteStage stagesUserDeleteCreate(userDeleteStageRequest)



UserDeleteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val userDeleteStageRequest : UserDeleteStageRequest =  // UserDeleteStageRequest | 
try {
    val result : UserDeleteStage = apiInstance.stagesUserDeleteCreate(userDeleteStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserDeleteCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserDeleteCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userDeleteStageRequest** | [**UserDeleteStageRequest**](UserDeleteStageRequest.md)|  |

### Return type

[**UserDeleteStage**](UserDeleteStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserDeleteDestroy"></a>
# **stagesUserDeleteDestroy**
> stagesUserDeleteDestroy(stageUuid)



UserDeleteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Delete Stage.
try {
    apiInstance.stagesUserDeleteDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserDeleteDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserDeleteDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Delete Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserDeleteList"></a>
# **stagesUserDeleteList**
> PaginatedUserDeleteStageList stagesUserDeleteList(name, ordering, page, pageSize, search, stageUuid)



UserDeleteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedUserDeleteStageList = apiInstance.stagesUserDeleteList(name, ordering, page, pageSize, search, stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserDeleteList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserDeleteList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedUserDeleteStageList**](PaginatedUserDeleteStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserDeletePartialUpdate"></a>
# **stagesUserDeletePartialUpdate**
> UserDeleteStage stagesUserDeletePartialUpdate(stageUuid, patchedUserDeleteStageRequest)



UserDeleteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Delete Stage.
val patchedUserDeleteStageRequest : PatchedUserDeleteStageRequest =  // PatchedUserDeleteStageRequest | 
try {
    val result : UserDeleteStage = apiInstance.stagesUserDeletePartialUpdate(stageUuid, patchedUserDeleteStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserDeletePartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserDeletePartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Delete Stage. |
 **patchedUserDeleteStageRequest** | [**PatchedUserDeleteStageRequest**](PatchedUserDeleteStageRequest.md)|  | [optional]

### Return type

[**UserDeleteStage**](UserDeleteStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserDeleteRetrieve"></a>
# **stagesUserDeleteRetrieve**
> UserDeleteStage stagesUserDeleteRetrieve(stageUuid)



UserDeleteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Delete Stage.
try {
    val result : UserDeleteStage = apiInstance.stagesUserDeleteRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserDeleteRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserDeleteRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Delete Stage. |

### Return type

[**UserDeleteStage**](UserDeleteStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserDeleteUpdate"></a>
# **stagesUserDeleteUpdate**
> UserDeleteStage stagesUserDeleteUpdate(stageUuid, userDeleteStageRequest)



UserDeleteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Delete Stage.
val userDeleteStageRequest : UserDeleteStageRequest =  // UserDeleteStageRequest | 
try {
    val result : UserDeleteStage = apiInstance.stagesUserDeleteUpdate(stageUuid, userDeleteStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserDeleteUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserDeleteUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Delete Stage. |
 **userDeleteStageRequest** | [**UserDeleteStageRequest**](UserDeleteStageRequest.md)|  |

### Return type

[**UserDeleteStage**](UserDeleteStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserDeleteUsedByList"></a>
# **stagesUserDeleteUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesUserDeleteUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Delete Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesUserDeleteUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserDeleteUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserDeleteUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Delete Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserLoginCreate"></a>
# **stagesUserLoginCreate**
> UserLoginStage stagesUserLoginCreate(userLoginStageRequest)



UserLoginStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val userLoginStageRequest : UserLoginStageRequest =  // UserLoginStageRequest | 
try {
    val result : UserLoginStage = apiInstance.stagesUserLoginCreate(userLoginStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLoginCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLoginCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLoginStageRequest** | [**UserLoginStageRequest**](UserLoginStageRequest.md)|  |

### Return type

[**UserLoginStage**](UserLoginStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserLoginDestroy"></a>
# **stagesUserLoginDestroy**
> stagesUserLoginDestroy(stageUuid)



UserLoginStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Login Stage.
try {
    apiInstance.stagesUserLoginDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLoginDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLoginDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Login Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserLoginList"></a>
# **stagesUserLoginList**
> PaginatedUserLoginStageList stagesUserLoginList(name, ordering, page, pageSize, rememberMeOffset, search, sessionDuration, stageUuid, terminateOtherSessions)



UserLoginStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val rememberMeOffset : kotlin.String = rememberMeOffset_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val sessionDuration : kotlin.String = sessionDuration_example // kotlin.String | 
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val terminateOtherSessions : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : PaginatedUserLoginStageList = apiInstance.stagesUserLoginList(name, ordering, page, pageSize, rememberMeOffset, search, sessionDuration, stageUuid, terminateOtherSessions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLoginList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLoginList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **rememberMeOffset** | **kotlin.String**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **sessionDuration** | **kotlin.String**|  | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]
 **terminateOtherSessions** | **kotlin.Boolean**|  | [optional]

### Return type

[**PaginatedUserLoginStageList**](PaginatedUserLoginStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserLoginPartialUpdate"></a>
# **stagesUserLoginPartialUpdate**
> UserLoginStage stagesUserLoginPartialUpdate(stageUuid, patchedUserLoginStageRequest)



UserLoginStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Login Stage.
val patchedUserLoginStageRequest : PatchedUserLoginStageRequest =  // PatchedUserLoginStageRequest | 
try {
    val result : UserLoginStage = apiInstance.stagesUserLoginPartialUpdate(stageUuid, patchedUserLoginStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLoginPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLoginPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Login Stage. |
 **patchedUserLoginStageRequest** | [**PatchedUserLoginStageRequest**](PatchedUserLoginStageRequest.md)|  | [optional]

### Return type

[**UserLoginStage**](UserLoginStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserLoginRetrieve"></a>
# **stagesUserLoginRetrieve**
> UserLoginStage stagesUserLoginRetrieve(stageUuid)



UserLoginStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Login Stage.
try {
    val result : UserLoginStage = apiInstance.stagesUserLoginRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLoginRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLoginRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Login Stage. |

### Return type

[**UserLoginStage**](UserLoginStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserLoginUpdate"></a>
# **stagesUserLoginUpdate**
> UserLoginStage stagesUserLoginUpdate(stageUuid, userLoginStageRequest)



UserLoginStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Login Stage.
val userLoginStageRequest : UserLoginStageRequest =  // UserLoginStageRequest | 
try {
    val result : UserLoginStage = apiInstance.stagesUserLoginUpdate(stageUuid, userLoginStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLoginUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLoginUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Login Stage. |
 **userLoginStageRequest** | [**UserLoginStageRequest**](UserLoginStageRequest.md)|  |

### Return type

[**UserLoginStage**](UserLoginStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserLoginUsedByList"></a>
# **stagesUserLoginUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesUserLoginUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Login Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesUserLoginUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLoginUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLoginUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Login Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserLogoutCreate"></a>
# **stagesUserLogoutCreate**
> UserLogoutStage stagesUserLogoutCreate(userLogoutStageRequest)



UserLogoutStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val userLogoutStageRequest : UserLogoutStageRequest =  // UserLogoutStageRequest | 
try {
    val result : UserLogoutStage = apiInstance.stagesUserLogoutCreate(userLogoutStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLogoutCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLogoutCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLogoutStageRequest** | [**UserLogoutStageRequest**](UserLogoutStageRequest.md)|  |

### Return type

[**UserLogoutStage**](UserLogoutStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserLogoutDestroy"></a>
# **stagesUserLogoutDestroy**
> stagesUserLogoutDestroy(stageUuid)



UserLogoutStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Logout Stage.
try {
    apiInstance.stagesUserLogoutDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLogoutDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLogoutDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Logout Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserLogoutList"></a>
# **stagesUserLogoutList**
> PaginatedUserLogoutStageList stagesUserLogoutList(name, ordering, page, pageSize, search, stageUuid)



UserLogoutStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedUserLogoutStageList = apiInstance.stagesUserLogoutList(name, ordering, page, pageSize, search, stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLogoutList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLogoutList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedUserLogoutStageList**](PaginatedUserLogoutStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserLogoutPartialUpdate"></a>
# **stagesUserLogoutPartialUpdate**
> UserLogoutStage stagesUserLogoutPartialUpdate(stageUuid, patchedUserLogoutStageRequest)



UserLogoutStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Logout Stage.
val patchedUserLogoutStageRequest : PatchedUserLogoutStageRequest =  // PatchedUserLogoutStageRequest | 
try {
    val result : UserLogoutStage = apiInstance.stagesUserLogoutPartialUpdate(stageUuid, patchedUserLogoutStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLogoutPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLogoutPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Logout Stage. |
 **patchedUserLogoutStageRequest** | [**PatchedUserLogoutStageRequest**](PatchedUserLogoutStageRequest.md)|  | [optional]

### Return type

[**UserLogoutStage**](UserLogoutStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserLogoutRetrieve"></a>
# **stagesUserLogoutRetrieve**
> UserLogoutStage stagesUserLogoutRetrieve(stageUuid)



UserLogoutStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Logout Stage.
try {
    val result : UserLogoutStage = apiInstance.stagesUserLogoutRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLogoutRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLogoutRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Logout Stage. |

### Return type

[**UserLogoutStage**](UserLogoutStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserLogoutUpdate"></a>
# **stagesUserLogoutUpdate**
> UserLogoutStage stagesUserLogoutUpdate(stageUuid, userLogoutStageRequest)



UserLogoutStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Logout Stage.
val userLogoutStageRequest : UserLogoutStageRequest =  // UserLogoutStageRequest | 
try {
    val result : UserLogoutStage = apiInstance.stagesUserLogoutUpdate(stageUuid, userLogoutStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLogoutUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLogoutUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Logout Stage. |
 **userLogoutStageRequest** | [**UserLogoutStageRequest**](UserLogoutStageRequest.md)|  |

### Return type

[**UserLogoutStage**](UserLogoutStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserLogoutUsedByList"></a>
# **stagesUserLogoutUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesUserLogoutUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Logout Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesUserLogoutUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserLogoutUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserLogoutUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Logout Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserWriteCreate"></a>
# **stagesUserWriteCreate**
> UserWriteStage stagesUserWriteCreate(userWriteStageRequest)



UserWriteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val userWriteStageRequest : UserWriteStageRequest =  // UserWriteStageRequest | 
try {
    val result : UserWriteStage = apiInstance.stagesUserWriteCreate(userWriteStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserWriteCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserWriteCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userWriteStageRequest** | [**UserWriteStageRequest**](UserWriteStageRequest.md)|  |

### Return type

[**UserWriteStage**](UserWriteStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserWriteDestroy"></a>
# **stagesUserWriteDestroy**
> stagesUserWriteDestroy(stageUuid)



UserWriteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Write Stage.
try {
    apiInstance.stagesUserWriteDestroy(stageUuid)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserWriteDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserWriteDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Write Stage. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserWriteList"></a>
# **stagesUserWriteList**
> PaginatedUserWriteStageList stagesUserWriteList(createUsersAsInactive, createUsersGroup, name, ordering, page, pageSize, search, stageUuid, userCreationMode, userPathTemplate)



UserWriteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val createUsersAsInactive : kotlin.Boolean = true // kotlin.Boolean | 
val createUsersGroup : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val userCreationMode : kotlin.String = userCreationMode_example // kotlin.String | * `never_create` - Never Create * `create_when_required` - Create When Required * `always_create` - Always Create
val userPathTemplate : kotlin.String = userPathTemplate_example // kotlin.String | 
try {
    val result : PaginatedUserWriteStageList = apiInstance.stagesUserWriteList(createUsersAsInactive, createUsersGroup, name, ordering, page, pageSize, search, stageUuid, userCreationMode, userPathTemplate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserWriteList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserWriteList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUsersAsInactive** | **kotlin.Boolean**|  | [optional]
 **createUsersGroup** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stageUuid** | **java.util.UUID**|  | [optional]
 **userCreationMode** | **kotlin.String**| * &#x60;never_create&#x60; - Never Create * &#x60;create_when_required&#x60; - Create When Required * &#x60;always_create&#x60; - Always Create | [optional] [enum: always_create, create_when_required, never_create]
 **userPathTemplate** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedUserWriteStageList**](PaginatedUserWriteStageList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserWritePartialUpdate"></a>
# **stagesUserWritePartialUpdate**
> UserWriteStage stagesUserWritePartialUpdate(stageUuid, patchedUserWriteStageRequest)



UserWriteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Write Stage.
val patchedUserWriteStageRequest : PatchedUserWriteStageRequest =  // PatchedUserWriteStageRequest | 
try {
    val result : UserWriteStage = apiInstance.stagesUserWritePartialUpdate(stageUuid, patchedUserWriteStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserWritePartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserWritePartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Write Stage. |
 **patchedUserWriteStageRequest** | [**PatchedUserWriteStageRequest**](PatchedUserWriteStageRequest.md)|  | [optional]

### Return type

[**UserWriteStage**](UserWriteStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserWriteRetrieve"></a>
# **stagesUserWriteRetrieve**
> UserWriteStage stagesUserWriteRetrieve(stageUuid)



UserWriteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Write Stage.
try {
    val result : UserWriteStage = apiInstance.stagesUserWriteRetrieve(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserWriteRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserWriteRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Write Stage. |

### Return type

[**UserWriteStage**](UserWriteStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stagesUserWriteUpdate"></a>
# **stagesUserWriteUpdate**
> UserWriteStage stagesUserWriteUpdate(stageUuid, userWriteStageRequest)



UserWriteStage Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Write Stage.
val userWriteStageRequest : UserWriteStageRequest =  // UserWriteStageRequest | 
try {
    val result : UserWriteStage = apiInstance.stagesUserWriteUpdate(stageUuid, userWriteStageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserWriteUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserWriteUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Write Stage. |
 **userWriteStageRequest** | [**UserWriteStageRequest**](UserWriteStageRequest.md)|  |

### Return type

[**UserWriteStage**](UserWriteStage.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stagesUserWriteUsedByList"></a>
# **stagesUserWriteUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; stagesUserWriteUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = StagesApi()
val stageUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this User Write Stage.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.stagesUserWriteUsedByList(stageUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StagesApi#stagesUserWriteUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StagesApi#stagesUserWriteUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageUuid** | **java.util.UUID**| A UUID string identifying this User Write Stage. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

