# RbacApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rbacPermissionsAssignedByRolesAssignCreate**](RbacApi.md#rbacPermissionsAssignedByRolesAssignCreate) | **POST** /rbac/permissions/assigned_by_roles/{uuid}/assign/ | 
[**rbacPermissionsAssignedByRolesList**](RbacApi.md#rbacPermissionsAssignedByRolesList) | **GET** /rbac/permissions/assigned_by_roles/ | 
[**rbacPermissionsAssignedByRolesUnassignPartialUpdate**](RbacApi.md#rbacPermissionsAssignedByRolesUnassignPartialUpdate) | **PATCH** /rbac/permissions/assigned_by_roles/{uuid}/unassign/ | 
[**rbacPermissionsAssignedByUsersAssignCreate**](RbacApi.md#rbacPermissionsAssignedByUsersAssignCreate) | **POST** /rbac/permissions/assigned_by_users/{id}/assign/ | 
[**rbacPermissionsAssignedByUsersList**](RbacApi.md#rbacPermissionsAssignedByUsersList) | **GET** /rbac/permissions/assigned_by_users/ | 
[**rbacPermissionsAssignedByUsersUnassignPartialUpdate**](RbacApi.md#rbacPermissionsAssignedByUsersUnassignPartialUpdate) | **PATCH** /rbac/permissions/assigned_by_users/{id}/unassign/ | 
[**rbacPermissionsList**](RbacApi.md#rbacPermissionsList) | **GET** /rbac/permissions/ | 
[**rbacPermissionsRetrieve**](RbacApi.md#rbacPermissionsRetrieve) | **GET** /rbac/permissions/{id}/ | 
[**rbacPermissionsRolesList**](RbacApi.md#rbacPermissionsRolesList) | **GET** /rbac/permissions/roles/ | 
[**rbacPermissionsUsersList**](RbacApi.md#rbacPermissionsUsersList) | **GET** /rbac/permissions/users/ | 
[**rbacRolesCreate**](RbacApi.md#rbacRolesCreate) | **POST** /rbac/roles/ | 
[**rbacRolesDestroy**](RbacApi.md#rbacRolesDestroy) | **DELETE** /rbac/roles/{uuid}/ | 
[**rbacRolesList**](RbacApi.md#rbacRolesList) | **GET** /rbac/roles/ | 
[**rbacRolesPartialUpdate**](RbacApi.md#rbacRolesPartialUpdate) | **PATCH** /rbac/roles/{uuid}/ | 
[**rbacRolesRetrieve**](RbacApi.md#rbacRolesRetrieve) | **GET** /rbac/roles/{uuid}/ | 
[**rbacRolesUpdate**](RbacApi.md#rbacRolesUpdate) | **PUT** /rbac/roles/{uuid}/ | 
[**rbacRolesUsedByList**](RbacApi.md#rbacRolesUsedByList) | **GET** /rbac/roles/{uuid}/used_by/ | 


<a id="rbacPermissionsAssignedByRolesAssignCreate"></a>
# **rbacPermissionsAssignedByRolesAssignCreate**
> rbacPermissionsAssignedByRolesAssignCreate(uuid, permissionAssignRequest)



Assign permission(s) to role. When &#x60;object_pk&#x60; is set, the permissions are only assigned to the specific object, otherwise they are assigned globally.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Role.
val permissionAssignRequest : PermissionAssignRequest =  // PermissionAssignRequest | 
try {
    apiInstance.rbacPermissionsAssignedByRolesAssignCreate(uuid, permissionAssignRequest)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsAssignedByRolesAssignCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsAssignedByRolesAssignCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Role. |
 **permissionAssignRequest** | [**PermissionAssignRequest**](PermissionAssignRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rbacPermissionsAssignedByRolesList"></a>
# **rbacPermissionsAssignedByRolesList**
> PaginatedRoleAssignedObjectPermissionList rbacPermissionsAssignedByRolesList(model, objectPk, ordering, page, pageSize, search)



Get assigned object permissions for a single object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val model : kotlin.String = model_example // kotlin.String | * `authentik_tenants.domain` - Domain * `authentik_crypto.certificatekeypair` - Certificate-Key Pair * `authentik_events.event` - Event * `authentik_events.notificationtransport` - Notification Transport * `authentik_events.notification` - Notification * `authentik_events.notificationrule` - Notification Rule * `authentik_events.notificationwebhookmapping` - Webhook Mapping * `authentik_flows.flow` - Flow * `authentik_flows.flowstagebinding` - Flow Stage Binding * `authentik_outposts.dockerserviceconnection` - Docker Service-Connection * `authentik_outposts.kubernetesserviceconnection` - Kubernetes Service-Connection * `authentik_outposts.outpost` - Outpost * `authentik_policies_dummy.dummypolicy` - Dummy Policy * `authentik_policies_event_matcher.eventmatcherpolicy` - Event Matcher Policy * `authentik_policies_expiry.passwordexpirypolicy` - Password Expiry Policy * `authentik_policies_expression.expressionpolicy` - Expression Policy * `authentik_policies_password.passwordpolicy` - Password Policy * `authentik_policies_reputation.reputationpolicy` - Reputation Policy * `authentik_policies_reputation.reputation` - Reputation Score * `authentik_policies.policybinding` - Policy Binding * `authentik_providers_ldap.ldapprovider` - LDAP Provider * `authentik_providers_oauth2.scopemapping` - Scope Mapping * `authentik_providers_oauth2.oauth2provider` - OAuth2/OpenID Provider * `authentik_providers_oauth2.authorizationcode` - Authorization Code * `authentik_providers_oauth2.accesstoken` - OAuth2 Access Token * `authentik_providers_oauth2.refreshtoken` - OAuth2 Refresh Token * `authentik_providers_proxy.proxyprovider` - Proxy Provider * `authentik_providers_radius.radiusprovider` - Radius Provider * `authentik_providers_saml.samlprovider` - SAML Provider * `authentik_providers_saml.samlpropertymapping` - SAML Property Mapping * `authentik_providers_scim.scimprovider` - SCIM Provider * `authentik_providers_scim.scimmapping` - SCIM Mapping * `authentik_rbac.role` - Role * `authentik_sources_ldap.ldapsource` - LDAP Source * `authentik_sources_ldap.ldappropertymapping` - LDAP Property Mapping * `authentik_sources_oauth.oauthsource` - OAuth Source * `authentik_sources_oauth.useroauthsourceconnection` - User OAuth Source Connection * `authentik_sources_plex.plexsource` - Plex Source * `authentik_sources_plex.plexsourceconnection` - User Plex Source Connection * `authentik_sources_saml.samlsource` - SAML Source * `authentik_sources_saml.usersamlsourceconnection` - User SAML Source Connection * `authentik_stages_authenticator_duo.authenticatorduostage` - Duo Authenticator Setup Stage * `authentik_stages_authenticator_duo.duodevice` - Duo Device * `authentik_stages_authenticator_sms.authenticatorsmsstage` - SMS Authenticator Setup Stage * `authentik_stages_authenticator_sms.smsdevice` - SMS Device * `authentik_stages_authenticator_static.authenticatorstaticstage` - Static Authenticator Stage * `authentik_stages_authenticator_static.staticdevice` - Static Device * `authentik_stages_authenticator_totp.authenticatortotpstage` - TOTP Authenticator Setup Stage * `authentik_stages_authenticator_totp.totpdevice` - TOTP Device * `authentik_stages_authenticator_validate.authenticatorvalidatestage` - Authenticator Validation Stage * `authentik_stages_authenticator_webauthn.authenticatewebauthnstage` - WebAuthn Authenticator Setup Stage * `authentik_stages_authenticator_webauthn.webauthndevice` - WebAuthn Device * `authentik_stages_captcha.captchastage` - Captcha Stage * `authentik_stages_consent.consentstage` - Consent Stage * `authentik_stages_consent.userconsent` - User Consent * `authentik_stages_deny.denystage` - Deny Stage * `authentik_stages_dummy.dummystage` - Dummy Stage * `authentik_stages_email.emailstage` - Email Stage * `authentik_stages_identification.identificationstage` - Identification Stage * `authentik_stages_invitation.invitationstage` - Invitation Stage * `authentik_stages_invitation.invitation` - Invitation * `authentik_stages_password.passwordstage` - Password Stage * `authentik_stages_prompt.prompt` - Prompt * `authentik_stages_prompt.promptstage` - Prompt Stage * `authentik_stages_user_delete.userdeletestage` - User Delete Stage * `authentik_stages_user_login.userloginstage` - User Login Stage * `authentik_stages_user_logout.userlogoutstage` - User Logout Stage * `authentik_stages_user_write.userwritestage` - User Write Stage * `authentik_brands.brand` - Brand * `authentik_blueprints.blueprintinstance` - Blueprint Instance * `authentik_core.group` - Group * `authentik_core.user` - User * `authentik_core.application` - Application * `authentik_core.token` - Token * `authentik_enterprise.license` - License * `authentik_providers_rac.racprovider` - RAC Provider * `authentik_providers_rac.endpoint` - RAC Endpoint * `authentik_providers_rac.racpropertymapping` - RAC Property Mapping
val objectPk : kotlin.String = objectPk_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedRoleAssignedObjectPermissionList = apiInstance.rbacPermissionsAssignedByRolesList(model, objectPk, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsAssignedByRolesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsAssignedByRolesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| * &#x60;authentik_tenants.domain&#x60; - Domain * &#x60;authentik_crypto.certificatekeypair&#x60; - Certificate-Key Pair * &#x60;authentik_events.event&#x60; - Event * &#x60;authentik_events.notificationtransport&#x60; - Notification Transport * &#x60;authentik_events.notification&#x60; - Notification * &#x60;authentik_events.notificationrule&#x60; - Notification Rule * &#x60;authentik_events.notificationwebhookmapping&#x60; - Webhook Mapping * &#x60;authentik_flows.flow&#x60; - Flow * &#x60;authentik_flows.flowstagebinding&#x60; - Flow Stage Binding * &#x60;authentik_outposts.dockerserviceconnection&#x60; - Docker Service-Connection * &#x60;authentik_outposts.kubernetesserviceconnection&#x60; - Kubernetes Service-Connection * &#x60;authentik_outposts.outpost&#x60; - Outpost * &#x60;authentik_policies_dummy.dummypolicy&#x60; - Dummy Policy * &#x60;authentik_policies_event_matcher.eventmatcherpolicy&#x60; - Event Matcher Policy * &#x60;authentik_policies_expiry.passwordexpirypolicy&#x60; - Password Expiry Policy * &#x60;authentik_policies_expression.expressionpolicy&#x60; - Expression Policy * &#x60;authentik_policies_password.passwordpolicy&#x60; - Password Policy * &#x60;authentik_policies_reputation.reputationpolicy&#x60; - Reputation Policy * &#x60;authentik_policies_reputation.reputation&#x60; - Reputation Score * &#x60;authentik_policies.policybinding&#x60; - Policy Binding * &#x60;authentik_providers_ldap.ldapprovider&#x60; - LDAP Provider * &#x60;authentik_providers_oauth2.scopemapping&#x60; - Scope Mapping * &#x60;authentik_providers_oauth2.oauth2provider&#x60; - OAuth2/OpenID Provider * &#x60;authentik_providers_oauth2.authorizationcode&#x60; - Authorization Code * &#x60;authentik_providers_oauth2.accesstoken&#x60; - OAuth2 Access Token * &#x60;authentik_providers_oauth2.refreshtoken&#x60; - OAuth2 Refresh Token * &#x60;authentik_providers_proxy.proxyprovider&#x60; - Proxy Provider * &#x60;authentik_providers_radius.radiusprovider&#x60; - Radius Provider * &#x60;authentik_providers_saml.samlprovider&#x60; - SAML Provider * &#x60;authentik_providers_saml.samlpropertymapping&#x60; - SAML Property Mapping * &#x60;authentik_providers_scim.scimprovider&#x60; - SCIM Provider * &#x60;authentik_providers_scim.scimmapping&#x60; - SCIM Mapping * &#x60;authentik_rbac.role&#x60; - Role * &#x60;authentik_sources_ldap.ldapsource&#x60; - LDAP Source * &#x60;authentik_sources_ldap.ldappropertymapping&#x60; - LDAP Property Mapping * &#x60;authentik_sources_oauth.oauthsource&#x60; - OAuth Source * &#x60;authentik_sources_oauth.useroauthsourceconnection&#x60; - User OAuth Source Connection * &#x60;authentik_sources_plex.plexsource&#x60; - Plex Source * &#x60;authentik_sources_plex.plexsourceconnection&#x60; - User Plex Source Connection * &#x60;authentik_sources_saml.samlsource&#x60; - SAML Source * &#x60;authentik_sources_saml.usersamlsourceconnection&#x60; - User SAML Source Connection * &#x60;authentik_stages_authenticator_duo.authenticatorduostage&#x60; - Duo Authenticator Setup Stage * &#x60;authentik_stages_authenticator_duo.duodevice&#x60; - Duo Device * &#x60;authentik_stages_authenticator_sms.authenticatorsmsstage&#x60; - SMS Authenticator Setup Stage * &#x60;authentik_stages_authenticator_sms.smsdevice&#x60; - SMS Device * &#x60;authentik_stages_authenticator_static.authenticatorstaticstage&#x60; - Static Authenticator Stage * &#x60;authentik_stages_authenticator_static.staticdevice&#x60; - Static Device * &#x60;authentik_stages_authenticator_totp.authenticatortotpstage&#x60; - TOTP Authenticator Setup Stage * &#x60;authentik_stages_authenticator_totp.totpdevice&#x60; - TOTP Device * &#x60;authentik_stages_authenticator_validate.authenticatorvalidatestage&#x60; - Authenticator Validation Stage * &#x60;authentik_stages_authenticator_webauthn.authenticatewebauthnstage&#x60; - WebAuthn Authenticator Setup Stage * &#x60;authentik_stages_authenticator_webauthn.webauthndevice&#x60; - WebAuthn Device * &#x60;authentik_stages_captcha.captchastage&#x60; - Captcha Stage * &#x60;authentik_stages_consent.consentstage&#x60; - Consent Stage * &#x60;authentik_stages_consent.userconsent&#x60; - User Consent * &#x60;authentik_stages_deny.denystage&#x60; - Deny Stage * &#x60;authentik_stages_dummy.dummystage&#x60; - Dummy Stage * &#x60;authentik_stages_email.emailstage&#x60; - Email Stage * &#x60;authentik_stages_identification.identificationstage&#x60; - Identification Stage * &#x60;authentik_stages_invitation.invitationstage&#x60; - Invitation Stage * &#x60;authentik_stages_invitation.invitation&#x60; - Invitation * &#x60;authentik_stages_password.passwordstage&#x60; - Password Stage * &#x60;authentik_stages_prompt.prompt&#x60; - Prompt * &#x60;authentik_stages_prompt.promptstage&#x60; - Prompt Stage * &#x60;authentik_stages_user_delete.userdeletestage&#x60; - User Delete Stage * &#x60;authentik_stages_user_login.userloginstage&#x60; - User Login Stage * &#x60;authentik_stages_user_logout.userlogoutstage&#x60; - User Logout Stage * &#x60;authentik_stages_user_write.userwritestage&#x60; - User Write Stage * &#x60;authentik_brands.brand&#x60; - Brand * &#x60;authentik_blueprints.blueprintinstance&#x60; - Blueprint Instance * &#x60;authentik_core.group&#x60; - Group * &#x60;authentik_core.user&#x60; - User * &#x60;authentik_core.application&#x60; - Application * &#x60;authentik_core.token&#x60; - Token * &#x60;authentik_enterprise.license&#x60; - License * &#x60;authentik_providers_rac.racprovider&#x60; - RAC Provider * &#x60;authentik_providers_rac.endpoint&#x60; - RAC Endpoint * &#x60;authentik_providers_rac.racpropertymapping&#x60; - RAC Property Mapping | [enum: authentik_blueprints.blueprintinstance, authentik_brands.brand, authentik_core.application, authentik_core.group, authentik_core.token, authentik_core.user, authentik_crypto.certificatekeypair, authentik_enterprise.license, authentik_events.event, authentik_events.notification, authentik_events.notificationrule, authentik_events.notificationtransport, authentik_events.notificationwebhookmapping, authentik_flows.flow, authentik_flows.flowstagebinding, authentik_outposts.dockerserviceconnection, authentik_outposts.kubernetesserviceconnection, authentik_outposts.outpost, authentik_policies.policybinding, authentik_policies_dummy.dummypolicy, authentik_policies_event_matcher.eventmatcherpolicy, authentik_policies_expiry.passwordexpirypolicy, authentik_policies_expression.expressionpolicy, authentik_policies_password.passwordpolicy, authentik_policies_reputation.reputation, authentik_policies_reputation.reputationpolicy, authentik_providers_ldap.ldapprovider, authentik_providers_oauth2.accesstoken, authentik_providers_oauth2.authorizationcode, authentik_providers_oauth2.oauth2provider, authentik_providers_oauth2.refreshtoken, authentik_providers_oauth2.scopemapping, authentik_providers_proxy.proxyprovider, authentik_providers_rac.endpoint, authentik_providers_rac.racpropertymapping, authentik_providers_rac.racprovider, authentik_providers_radius.radiusprovider, authentik_providers_saml.samlpropertymapping, authentik_providers_saml.samlprovider, authentik_providers_scim.scimmapping, authentik_providers_scim.scimprovider, authentik_rbac.role, authentik_sources_ldap.ldappropertymapping, authentik_sources_ldap.ldapsource, authentik_sources_oauth.oauthsource, authentik_sources_oauth.useroauthsourceconnection, authentik_sources_plex.plexsource, authentik_sources_plex.plexsourceconnection, authentik_sources_saml.samlsource, authentik_sources_saml.usersamlsourceconnection, authentik_stages_authenticator_duo.authenticatorduostage, authentik_stages_authenticator_duo.duodevice, authentik_stages_authenticator_sms.authenticatorsmsstage, authentik_stages_authenticator_sms.smsdevice, authentik_stages_authenticator_static.authenticatorstaticstage, authentik_stages_authenticator_static.staticdevice, authentik_stages_authenticator_totp.authenticatortotpstage, authentik_stages_authenticator_totp.totpdevice, authentik_stages_authenticator_validate.authenticatorvalidatestage, authentik_stages_authenticator_webauthn.authenticatewebauthnstage, authentik_stages_authenticator_webauthn.webauthndevice, authentik_stages_captcha.captchastage, authentik_stages_consent.consentstage, authentik_stages_consent.userconsent, authentik_stages_deny.denystage, authentik_stages_dummy.dummystage, authentik_stages_email.emailstage, authentik_stages_identification.identificationstage, authentik_stages_invitation.invitation, authentik_stages_invitation.invitationstage, authentik_stages_password.passwordstage, authentik_stages_prompt.prompt, authentik_stages_prompt.promptstage, authentik_stages_user_delete.userdeletestage, authentik_stages_user_login.userloginstage, authentik_stages_user_logout.userlogoutstage, authentik_stages_user_write.userwritestage, authentik_tenants.domain]
 **objectPk** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedRoleAssignedObjectPermissionList**](PaginatedRoleAssignedObjectPermissionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rbacPermissionsAssignedByRolesUnassignPartialUpdate"></a>
# **rbacPermissionsAssignedByRolesUnassignPartialUpdate**
> rbacPermissionsAssignedByRolesUnassignPartialUpdate(uuid, patchedPermissionAssignRequest)



Unassign permission(s) to role. When &#x60;object_pk&#x60; is set, the permissions are only assigned to the specific object, otherwise they are assigned globally.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Role.
val patchedPermissionAssignRequest : PatchedPermissionAssignRequest =  // PatchedPermissionAssignRequest | 
try {
    apiInstance.rbacPermissionsAssignedByRolesUnassignPartialUpdate(uuid, patchedPermissionAssignRequest)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsAssignedByRolesUnassignPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsAssignedByRolesUnassignPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Role. |
 **patchedPermissionAssignRequest** | [**PatchedPermissionAssignRequest**](PatchedPermissionAssignRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rbacPermissionsAssignedByUsersAssignCreate"></a>
# **rbacPermissionsAssignedByUsersAssignCreate**
> rbacPermissionsAssignedByUsersAssignCreate(id, permissionAssignRequest)



Assign permission(s) to user

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
val permissionAssignRequest : PermissionAssignRequest =  // PermissionAssignRequest | 
try {
    apiInstance.rbacPermissionsAssignedByUsersAssignCreate(id, permissionAssignRequest)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsAssignedByUsersAssignCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsAssignedByUsersAssignCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |
 **permissionAssignRequest** | [**PermissionAssignRequest**](PermissionAssignRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rbacPermissionsAssignedByUsersList"></a>
# **rbacPermissionsAssignedByUsersList**
> PaginatedUserAssignedObjectPermissionList rbacPermissionsAssignedByUsersList(model, objectPk, ordering, page, pageSize, search)



Get assigned object permissions for a single object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val model : kotlin.String = model_example // kotlin.String | * `authentik_tenants.domain` - Domain * `authentik_crypto.certificatekeypair` - Certificate-Key Pair * `authentik_events.event` - Event * `authentik_events.notificationtransport` - Notification Transport * `authentik_events.notification` - Notification * `authentik_events.notificationrule` - Notification Rule * `authentik_events.notificationwebhookmapping` - Webhook Mapping * `authentik_flows.flow` - Flow * `authentik_flows.flowstagebinding` - Flow Stage Binding * `authentik_outposts.dockerserviceconnection` - Docker Service-Connection * `authentik_outposts.kubernetesserviceconnection` - Kubernetes Service-Connection * `authentik_outposts.outpost` - Outpost * `authentik_policies_dummy.dummypolicy` - Dummy Policy * `authentik_policies_event_matcher.eventmatcherpolicy` - Event Matcher Policy * `authentik_policies_expiry.passwordexpirypolicy` - Password Expiry Policy * `authentik_policies_expression.expressionpolicy` - Expression Policy * `authentik_policies_password.passwordpolicy` - Password Policy * `authentik_policies_reputation.reputationpolicy` - Reputation Policy * `authentik_policies_reputation.reputation` - Reputation Score * `authentik_policies.policybinding` - Policy Binding * `authentik_providers_ldap.ldapprovider` - LDAP Provider * `authentik_providers_oauth2.scopemapping` - Scope Mapping * `authentik_providers_oauth2.oauth2provider` - OAuth2/OpenID Provider * `authentik_providers_oauth2.authorizationcode` - Authorization Code * `authentik_providers_oauth2.accesstoken` - OAuth2 Access Token * `authentik_providers_oauth2.refreshtoken` - OAuth2 Refresh Token * `authentik_providers_proxy.proxyprovider` - Proxy Provider * `authentik_providers_radius.radiusprovider` - Radius Provider * `authentik_providers_saml.samlprovider` - SAML Provider * `authentik_providers_saml.samlpropertymapping` - SAML Property Mapping * `authentik_providers_scim.scimprovider` - SCIM Provider * `authentik_providers_scim.scimmapping` - SCIM Mapping * `authentik_rbac.role` - Role * `authentik_sources_ldap.ldapsource` - LDAP Source * `authentik_sources_ldap.ldappropertymapping` - LDAP Property Mapping * `authentik_sources_oauth.oauthsource` - OAuth Source * `authentik_sources_oauth.useroauthsourceconnection` - User OAuth Source Connection * `authentik_sources_plex.plexsource` - Plex Source * `authentik_sources_plex.plexsourceconnection` - User Plex Source Connection * `authentik_sources_saml.samlsource` - SAML Source * `authentik_sources_saml.usersamlsourceconnection` - User SAML Source Connection * `authentik_stages_authenticator_duo.authenticatorduostage` - Duo Authenticator Setup Stage * `authentik_stages_authenticator_duo.duodevice` - Duo Device * `authentik_stages_authenticator_sms.authenticatorsmsstage` - SMS Authenticator Setup Stage * `authentik_stages_authenticator_sms.smsdevice` - SMS Device * `authentik_stages_authenticator_static.authenticatorstaticstage` - Static Authenticator Stage * `authentik_stages_authenticator_static.staticdevice` - Static Device * `authentik_stages_authenticator_totp.authenticatortotpstage` - TOTP Authenticator Setup Stage * `authentik_stages_authenticator_totp.totpdevice` - TOTP Device * `authentik_stages_authenticator_validate.authenticatorvalidatestage` - Authenticator Validation Stage * `authentik_stages_authenticator_webauthn.authenticatewebauthnstage` - WebAuthn Authenticator Setup Stage * `authentik_stages_authenticator_webauthn.webauthndevice` - WebAuthn Device * `authentik_stages_captcha.captchastage` - Captcha Stage * `authentik_stages_consent.consentstage` - Consent Stage * `authentik_stages_consent.userconsent` - User Consent * `authentik_stages_deny.denystage` - Deny Stage * `authentik_stages_dummy.dummystage` - Dummy Stage * `authentik_stages_email.emailstage` - Email Stage * `authentik_stages_identification.identificationstage` - Identification Stage * `authentik_stages_invitation.invitationstage` - Invitation Stage * `authentik_stages_invitation.invitation` - Invitation * `authentik_stages_password.passwordstage` - Password Stage * `authentik_stages_prompt.prompt` - Prompt * `authentik_stages_prompt.promptstage` - Prompt Stage * `authentik_stages_user_delete.userdeletestage` - User Delete Stage * `authentik_stages_user_login.userloginstage` - User Login Stage * `authentik_stages_user_logout.userlogoutstage` - User Logout Stage * `authentik_stages_user_write.userwritestage` - User Write Stage * `authentik_brands.brand` - Brand * `authentik_blueprints.blueprintinstance` - Blueprint Instance * `authentik_core.group` - Group * `authentik_core.user` - User * `authentik_core.application` - Application * `authentik_core.token` - Token * `authentik_enterprise.license` - License * `authentik_providers_rac.racprovider` - RAC Provider * `authentik_providers_rac.endpoint` - RAC Endpoint * `authentik_providers_rac.racpropertymapping` - RAC Property Mapping
val objectPk : kotlin.String = objectPk_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedUserAssignedObjectPermissionList = apiInstance.rbacPermissionsAssignedByUsersList(model, objectPk, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsAssignedByUsersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsAssignedByUsersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| * &#x60;authentik_tenants.domain&#x60; - Domain * &#x60;authentik_crypto.certificatekeypair&#x60; - Certificate-Key Pair * &#x60;authentik_events.event&#x60; - Event * &#x60;authentik_events.notificationtransport&#x60; - Notification Transport * &#x60;authentik_events.notification&#x60; - Notification * &#x60;authentik_events.notificationrule&#x60; - Notification Rule * &#x60;authentik_events.notificationwebhookmapping&#x60; - Webhook Mapping * &#x60;authentik_flows.flow&#x60; - Flow * &#x60;authentik_flows.flowstagebinding&#x60; - Flow Stage Binding * &#x60;authentik_outposts.dockerserviceconnection&#x60; - Docker Service-Connection * &#x60;authentik_outposts.kubernetesserviceconnection&#x60; - Kubernetes Service-Connection * &#x60;authentik_outposts.outpost&#x60; - Outpost * &#x60;authentik_policies_dummy.dummypolicy&#x60; - Dummy Policy * &#x60;authentik_policies_event_matcher.eventmatcherpolicy&#x60; - Event Matcher Policy * &#x60;authentik_policies_expiry.passwordexpirypolicy&#x60; - Password Expiry Policy * &#x60;authentik_policies_expression.expressionpolicy&#x60; - Expression Policy * &#x60;authentik_policies_password.passwordpolicy&#x60; - Password Policy * &#x60;authentik_policies_reputation.reputationpolicy&#x60; - Reputation Policy * &#x60;authentik_policies_reputation.reputation&#x60; - Reputation Score * &#x60;authentik_policies.policybinding&#x60; - Policy Binding * &#x60;authentik_providers_ldap.ldapprovider&#x60; - LDAP Provider * &#x60;authentik_providers_oauth2.scopemapping&#x60; - Scope Mapping * &#x60;authentik_providers_oauth2.oauth2provider&#x60; - OAuth2/OpenID Provider * &#x60;authentik_providers_oauth2.authorizationcode&#x60; - Authorization Code * &#x60;authentik_providers_oauth2.accesstoken&#x60; - OAuth2 Access Token * &#x60;authentik_providers_oauth2.refreshtoken&#x60; - OAuth2 Refresh Token * &#x60;authentik_providers_proxy.proxyprovider&#x60; - Proxy Provider * &#x60;authentik_providers_radius.radiusprovider&#x60; - Radius Provider * &#x60;authentik_providers_saml.samlprovider&#x60; - SAML Provider * &#x60;authentik_providers_saml.samlpropertymapping&#x60; - SAML Property Mapping * &#x60;authentik_providers_scim.scimprovider&#x60; - SCIM Provider * &#x60;authentik_providers_scim.scimmapping&#x60; - SCIM Mapping * &#x60;authentik_rbac.role&#x60; - Role * &#x60;authentik_sources_ldap.ldapsource&#x60; - LDAP Source * &#x60;authentik_sources_ldap.ldappropertymapping&#x60; - LDAP Property Mapping * &#x60;authentik_sources_oauth.oauthsource&#x60; - OAuth Source * &#x60;authentik_sources_oauth.useroauthsourceconnection&#x60; - User OAuth Source Connection * &#x60;authentik_sources_plex.plexsource&#x60; - Plex Source * &#x60;authentik_sources_plex.plexsourceconnection&#x60; - User Plex Source Connection * &#x60;authentik_sources_saml.samlsource&#x60; - SAML Source * &#x60;authentik_sources_saml.usersamlsourceconnection&#x60; - User SAML Source Connection * &#x60;authentik_stages_authenticator_duo.authenticatorduostage&#x60; - Duo Authenticator Setup Stage * &#x60;authentik_stages_authenticator_duo.duodevice&#x60; - Duo Device * &#x60;authentik_stages_authenticator_sms.authenticatorsmsstage&#x60; - SMS Authenticator Setup Stage * &#x60;authentik_stages_authenticator_sms.smsdevice&#x60; - SMS Device * &#x60;authentik_stages_authenticator_static.authenticatorstaticstage&#x60; - Static Authenticator Stage * &#x60;authentik_stages_authenticator_static.staticdevice&#x60; - Static Device * &#x60;authentik_stages_authenticator_totp.authenticatortotpstage&#x60; - TOTP Authenticator Setup Stage * &#x60;authentik_stages_authenticator_totp.totpdevice&#x60; - TOTP Device * &#x60;authentik_stages_authenticator_validate.authenticatorvalidatestage&#x60; - Authenticator Validation Stage * &#x60;authentik_stages_authenticator_webauthn.authenticatewebauthnstage&#x60; - WebAuthn Authenticator Setup Stage * &#x60;authentik_stages_authenticator_webauthn.webauthndevice&#x60; - WebAuthn Device * &#x60;authentik_stages_captcha.captchastage&#x60; - Captcha Stage * &#x60;authentik_stages_consent.consentstage&#x60; - Consent Stage * &#x60;authentik_stages_consent.userconsent&#x60; - User Consent * &#x60;authentik_stages_deny.denystage&#x60; - Deny Stage * &#x60;authentik_stages_dummy.dummystage&#x60; - Dummy Stage * &#x60;authentik_stages_email.emailstage&#x60; - Email Stage * &#x60;authentik_stages_identification.identificationstage&#x60; - Identification Stage * &#x60;authentik_stages_invitation.invitationstage&#x60; - Invitation Stage * &#x60;authentik_stages_invitation.invitation&#x60; - Invitation * &#x60;authentik_stages_password.passwordstage&#x60; - Password Stage * &#x60;authentik_stages_prompt.prompt&#x60; - Prompt * &#x60;authentik_stages_prompt.promptstage&#x60; - Prompt Stage * &#x60;authentik_stages_user_delete.userdeletestage&#x60; - User Delete Stage * &#x60;authentik_stages_user_login.userloginstage&#x60; - User Login Stage * &#x60;authentik_stages_user_logout.userlogoutstage&#x60; - User Logout Stage * &#x60;authentik_stages_user_write.userwritestage&#x60; - User Write Stage * &#x60;authentik_brands.brand&#x60; - Brand * &#x60;authentik_blueprints.blueprintinstance&#x60; - Blueprint Instance * &#x60;authentik_core.group&#x60; - Group * &#x60;authentik_core.user&#x60; - User * &#x60;authentik_core.application&#x60; - Application * &#x60;authentik_core.token&#x60; - Token * &#x60;authentik_enterprise.license&#x60; - License * &#x60;authentik_providers_rac.racprovider&#x60; - RAC Provider * &#x60;authentik_providers_rac.endpoint&#x60; - RAC Endpoint * &#x60;authentik_providers_rac.racpropertymapping&#x60; - RAC Property Mapping | [enum: authentik_blueprints.blueprintinstance, authentik_brands.brand, authentik_core.application, authentik_core.group, authentik_core.token, authentik_core.user, authentik_crypto.certificatekeypair, authentik_enterprise.license, authentik_events.event, authentik_events.notification, authentik_events.notificationrule, authentik_events.notificationtransport, authentik_events.notificationwebhookmapping, authentik_flows.flow, authentik_flows.flowstagebinding, authentik_outposts.dockerserviceconnection, authentik_outposts.kubernetesserviceconnection, authentik_outposts.outpost, authentik_policies.policybinding, authentik_policies_dummy.dummypolicy, authentik_policies_event_matcher.eventmatcherpolicy, authentik_policies_expiry.passwordexpirypolicy, authentik_policies_expression.expressionpolicy, authentik_policies_password.passwordpolicy, authentik_policies_reputation.reputation, authentik_policies_reputation.reputationpolicy, authentik_providers_ldap.ldapprovider, authentik_providers_oauth2.accesstoken, authentik_providers_oauth2.authorizationcode, authentik_providers_oauth2.oauth2provider, authentik_providers_oauth2.refreshtoken, authentik_providers_oauth2.scopemapping, authentik_providers_proxy.proxyprovider, authentik_providers_rac.endpoint, authentik_providers_rac.racpropertymapping, authentik_providers_rac.racprovider, authentik_providers_radius.radiusprovider, authentik_providers_saml.samlpropertymapping, authentik_providers_saml.samlprovider, authentik_providers_scim.scimmapping, authentik_providers_scim.scimprovider, authentik_rbac.role, authentik_sources_ldap.ldappropertymapping, authentik_sources_ldap.ldapsource, authentik_sources_oauth.oauthsource, authentik_sources_oauth.useroauthsourceconnection, authentik_sources_plex.plexsource, authentik_sources_plex.plexsourceconnection, authentik_sources_saml.samlsource, authentik_sources_saml.usersamlsourceconnection, authentik_stages_authenticator_duo.authenticatorduostage, authentik_stages_authenticator_duo.duodevice, authentik_stages_authenticator_sms.authenticatorsmsstage, authentik_stages_authenticator_sms.smsdevice, authentik_stages_authenticator_static.authenticatorstaticstage, authentik_stages_authenticator_static.staticdevice, authentik_stages_authenticator_totp.authenticatortotpstage, authentik_stages_authenticator_totp.totpdevice, authentik_stages_authenticator_validate.authenticatorvalidatestage, authentik_stages_authenticator_webauthn.authenticatewebauthnstage, authentik_stages_authenticator_webauthn.webauthndevice, authentik_stages_captcha.captchastage, authentik_stages_consent.consentstage, authentik_stages_consent.userconsent, authentik_stages_deny.denystage, authentik_stages_dummy.dummystage, authentik_stages_email.emailstage, authentik_stages_identification.identificationstage, authentik_stages_invitation.invitation, authentik_stages_invitation.invitationstage, authentik_stages_password.passwordstage, authentik_stages_prompt.prompt, authentik_stages_prompt.promptstage, authentik_stages_user_delete.userdeletestage, authentik_stages_user_login.userloginstage, authentik_stages_user_logout.userlogoutstage, authentik_stages_user_write.userwritestage, authentik_tenants.domain]
 **objectPk** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedUserAssignedObjectPermissionList**](PaginatedUserAssignedObjectPermissionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rbacPermissionsAssignedByUsersUnassignPartialUpdate"></a>
# **rbacPermissionsAssignedByUsersUnassignPartialUpdate**
> rbacPermissionsAssignedByUsersUnassignPartialUpdate(id, patchedPermissionAssignRequest)



Unassign permission(s) to user. When &#x60;object_pk&#x60; is set, the permissions are only assigned to the specific object, otherwise they are assigned globally.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
val patchedPermissionAssignRequest : PatchedPermissionAssignRequest =  // PatchedPermissionAssignRequest | 
try {
    apiInstance.rbacPermissionsAssignedByUsersUnassignPartialUpdate(id, patchedPermissionAssignRequest)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsAssignedByUsersUnassignPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsAssignedByUsersUnassignPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |
 **patchedPermissionAssignRequest** | [**PatchedPermissionAssignRequest**](PatchedPermissionAssignRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rbacPermissionsList"></a>
# **rbacPermissionsList**
> PaginatedPermissionList rbacPermissionsList(codename, contentTypeAppLabel, contentTypeModel, ordering, page, pageSize, role, search, user)



Read-only list of all permissions, filterable by model and app

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val codename : kotlin.String = codename_example // kotlin.String | 
val contentTypeAppLabel : kotlin.String = contentTypeAppLabel_example // kotlin.String | 
val contentTypeModel : kotlin.String = contentTypeModel_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val role : kotlin.String = role_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val user : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedPermissionList = apiInstance.rbacPermissionsList(codename, contentTypeAppLabel, contentTypeModel, ordering, page, pageSize, role, search, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codename** | **kotlin.String**|  | [optional]
 **contentTypeAppLabel** | **kotlin.String**|  | [optional]
 **contentTypeModel** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **role** | **kotlin.String**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **user** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedPermissionList**](PaginatedPermissionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rbacPermissionsRetrieve"></a>
# **rbacPermissionsRetrieve**
> Permission rbacPermissionsRetrieve(id)



Read-only list of all permissions, filterable by model and app

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this permission.
try {
    val result : Permission = apiInstance.rbacPermissionsRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this permission. |

### Return type

[**Permission**](Permission.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rbacPermissionsRolesList"></a>
# **rbacPermissionsRolesList**
> PaginatedExtraRoleObjectPermissionList rbacPermissionsRolesList(uuid, ordering, page, pageSize, search)



Get a role&#39;s assigned object permissions

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedExtraRoleObjectPermissionList = apiInstance.rbacPermissionsRolesList(uuid, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsRolesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsRolesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**|  |
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedExtraRoleObjectPermissionList**](PaginatedExtraRoleObjectPermissionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rbacPermissionsUsersList"></a>
# **rbacPermissionsUsersList**
> PaginatedExtraUserObjectPermissionList rbacPermissionsUsersList(userId, ordering, page, pageSize, search)



Get a users&#39;s assigned object permissions

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val userId : kotlin.Int = 56 // kotlin.Int | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedExtraUserObjectPermissionList = apiInstance.rbacPermissionsUsersList(userId, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacPermissionsUsersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacPermissionsUsersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**|  |
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedExtraUserObjectPermissionList**](PaginatedExtraUserObjectPermissionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rbacRolesCreate"></a>
# **rbacRolesCreate**
> Role rbacRolesCreate(roleRequest)



Role viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val roleRequest : RoleRequest =  // RoleRequest | 
try {
    val result : Role = apiInstance.rbacRolesCreate(roleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacRolesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacRolesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleRequest** | [**RoleRequest**](RoleRequest.md)|  |

### Return type

[**Role**](Role.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rbacRolesDestroy"></a>
# **rbacRolesDestroy**
> rbacRolesDestroy(uuid)



Role viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Role.
try {
    apiInstance.rbacRolesDestroy(uuid)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacRolesDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacRolesDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Role. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rbacRolesList"></a>
# **rbacRolesList**
> PaginatedRoleList rbacRolesList(groupName, ordering, page, pageSize, search)



Role viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val groupName : kotlin.String = groupName_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedRoleList = apiInstance.rbacRolesList(groupName, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacRolesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacRolesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedRoleList**](PaginatedRoleList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rbacRolesPartialUpdate"></a>
# **rbacRolesPartialUpdate**
> Role rbacRolesPartialUpdate(uuid, patchedRoleRequest)



Role viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Role.
val patchedRoleRequest : PatchedRoleRequest =  // PatchedRoleRequest | 
try {
    val result : Role = apiInstance.rbacRolesPartialUpdate(uuid, patchedRoleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacRolesPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacRolesPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Role. |
 **patchedRoleRequest** | [**PatchedRoleRequest**](PatchedRoleRequest.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rbacRolesRetrieve"></a>
# **rbacRolesRetrieve**
> Role rbacRolesRetrieve(uuid)



Role viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Role.
try {
    val result : Role = apiInstance.rbacRolesRetrieve(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacRolesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacRolesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Role. |

### Return type

[**Role**](Role.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rbacRolesUpdate"></a>
# **rbacRolesUpdate**
> Role rbacRolesUpdate(uuid, roleRequest)



Role viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Role.
val roleRequest : RoleRequest =  // RoleRequest | 
try {
    val result : Role = apiInstance.rbacRolesUpdate(uuid, roleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacRolesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacRolesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Role. |
 **roleRequest** | [**RoleRequest**](RoleRequest.md)|  |

### Return type

[**Role**](Role.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rbacRolesUsedByList"></a>
# **rbacRolesUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; rbacRolesUsedByList(uuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RbacApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Role.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.rbacRolesUsedByList(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RbacApi#rbacRolesUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RbacApi#rbacRolesUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Role. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

