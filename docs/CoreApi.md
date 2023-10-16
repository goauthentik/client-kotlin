# CoreApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**coreApplicationsCheckAccessRetrieve**](CoreApi.md#coreApplicationsCheckAccessRetrieve) | **GET** /core/applications/{slug}/check_access/ | 
[**coreApplicationsCreate**](CoreApi.md#coreApplicationsCreate) | **POST** /core/applications/ | 
[**coreApplicationsDestroy**](CoreApi.md#coreApplicationsDestroy) | **DELETE** /core/applications/{slug}/ | 
[**coreApplicationsList**](CoreApi.md#coreApplicationsList) | **GET** /core/applications/ | 
[**coreApplicationsMetricsList**](CoreApi.md#coreApplicationsMetricsList) | **GET** /core/applications/{slug}/metrics/ | 
[**coreApplicationsPartialUpdate**](CoreApi.md#coreApplicationsPartialUpdate) | **PATCH** /core/applications/{slug}/ | 
[**coreApplicationsRetrieve**](CoreApi.md#coreApplicationsRetrieve) | **GET** /core/applications/{slug}/ | 
[**coreApplicationsSetIconCreate**](CoreApi.md#coreApplicationsSetIconCreate) | **POST** /core/applications/{slug}/set_icon/ | 
[**coreApplicationsSetIconUrlCreate**](CoreApi.md#coreApplicationsSetIconUrlCreate) | **POST** /core/applications/{slug}/set_icon_url/ | 
[**coreApplicationsUpdate**](CoreApi.md#coreApplicationsUpdate) | **PUT** /core/applications/{slug}/ | 
[**coreApplicationsUsedByList**](CoreApi.md#coreApplicationsUsedByList) | **GET** /core/applications/{slug}/used_by/ | 
[**coreAuthenticatedSessionsDestroy**](CoreApi.md#coreAuthenticatedSessionsDestroy) | **DELETE** /core/authenticated_sessions/{uuid}/ | 
[**coreAuthenticatedSessionsList**](CoreApi.md#coreAuthenticatedSessionsList) | **GET** /core/authenticated_sessions/ | 
[**coreAuthenticatedSessionsRetrieve**](CoreApi.md#coreAuthenticatedSessionsRetrieve) | **GET** /core/authenticated_sessions/{uuid}/ | 
[**coreAuthenticatedSessionsUsedByList**](CoreApi.md#coreAuthenticatedSessionsUsedByList) | **GET** /core/authenticated_sessions/{uuid}/used_by/ | 
[**coreGroupsAddUserCreate**](CoreApi.md#coreGroupsAddUserCreate) | **POST** /core/groups/{group_uuid}/add_user/ | 
[**coreGroupsCreate**](CoreApi.md#coreGroupsCreate) | **POST** /core/groups/ | 
[**coreGroupsDestroy**](CoreApi.md#coreGroupsDestroy) | **DELETE** /core/groups/{group_uuid}/ | 
[**coreGroupsList**](CoreApi.md#coreGroupsList) | **GET** /core/groups/ | 
[**coreGroupsPartialUpdate**](CoreApi.md#coreGroupsPartialUpdate) | **PATCH** /core/groups/{group_uuid}/ | 
[**coreGroupsRemoveUserCreate**](CoreApi.md#coreGroupsRemoveUserCreate) | **POST** /core/groups/{group_uuid}/remove_user/ | 
[**coreGroupsRetrieve**](CoreApi.md#coreGroupsRetrieve) | **GET** /core/groups/{group_uuid}/ | 
[**coreGroupsUpdate**](CoreApi.md#coreGroupsUpdate) | **PUT** /core/groups/{group_uuid}/ | 
[**coreGroupsUsedByList**](CoreApi.md#coreGroupsUsedByList) | **GET** /core/groups/{group_uuid}/used_by/ | 
[**coreTenantsCreate**](CoreApi.md#coreTenantsCreate) | **POST** /core/tenants/ | 
[**coreTenantsCurrentRetrieve**](CoreApi.md#coreTenantsCurrentRetrieve) | **GET** /core/tenants/current/ | 
[**coreTenantsDestroy**](CoreApi.md#coreTenantsDestroy) | **DELETE** /core/tenants/{tenant_uuid}/ | 
[**coreTenantsList**](CoreApi.md#coreTenantsList) | **GET** /core/tenants/ | 
[**coreTenantsPartialUpdate**](CoreApi.md#coreTenantsPartialUpdate) | **PATCH** /core/tenants/{tenant_uuid}/ | 
[**coreTenantsRetrieve**](CoreApi.md#coreTenantsRetrieve) | **GET** /core/tenants/{tenant_uuid}/ | 
[**coreTenantsUpdate**](CoreApi.md#coreTenantsUpdate) | **PUT** /core/tenants/{tenant_uuid}/ | 
[**coreTenantsUsedByList**](CoreApi.md#coreTenantsUsedByList) | **GET** /core/tenants/{tenant_uuid}/used_by/ | 
[**coreTokensCreate**](CoreApi.md#coreTokensCreate) | **POST** /core/tokens/ | 
[**coreTokensDestroy**](CoreApi.md#coreTokensDestroy) | **DELETE** /core/tokens/{identifier}/ | 
[**coreTokensList**](CoreApi.md#coreTokensList) | **GET** /core/tokens/ | 
[**coreTokensPartialUpdate**](CoreApi.md#coreTokensPartialUpdate) | **PATCH** /core/tokens/{identifier}/ | 
[**coreTokensRetrieve**](CoreApi.md#coreTokensRetrieve) | **GET** /core/tokens/{identifier}/ | 
[**coreTokensSetKeyCreate**](CoreApi.md#coreTokensSetKeyCreate) | **POST** /core/tokens/{identifier}/set_key/ | 
[**coreTokensUpdate**](CoreApi.md#coreTokensUpdate) | **PUT** /core/tokens/{identifier}/ | 
[**coreTokensUsedByList**](CoreApi.md#coreTokensUsedByList) | **GET** /core/tokens/{identifier}/used_by/ | 
[**coreTokensViewKeyRetrieve**](CoreApi.md#coreTokensViewKeyRetrieve) | **GET** /core/tokens/{identifier}/view_key/ | 
[**coreTransactionalApplicationsUpdate**](CoreApi.md#coreTransactionalApplicationsUpdate) | **PUT** /core/transactional/applications/ | 
[**coreUserConsentDestroy**](CoreApi.md#coreUserConsentDestroy) | **DELETE** /core/user_consent/{id}/ | 
[**coreUserConsentList**](CoreApi.md#coreUserConsentList) | **GET** /core/user_consent/ | 
[**coreUserConsentRetrieve**](CoreApi.md#coreUserConsentRetrieve) | **GET** /core/user_consent/{id}/ | 
[**coreUserConsentUsedByList**](CoreApi.md#coreUserConsentUsedByList) | **GET** /core/user_consent/{id}/used_by/ | 
[**coreUsersCreate**](CoreApi.md#coreUsersCreate) | **POST** /core/users/ | 
[**coreUsersDestroy**](CoreApi.md#coreUsersDestroy) | **DELETE** /core/users/{id}/ | 
[**coreUsersImpersonateCreate**](CoreApi.md#coreUsersImpersonateCreate) | **POST** /core/users/{id}/impersonate/ | 
[**coreUsersImpersonateEndRetrieve**](CoreApi.md#coreUsersImpersonateEndRetrieve) | **GET** /core/users/impersonate_end/ | 
[**coreUsersList**](CoreApi.md#coreUsersList) | **GET** /core/users/ | 
[**coreUsersMeRetrieve**](CoreApi.md#coreUsersMeRetrieve) | **GET** /core/users/me/ | 
[**coreUsersMetricsRetrieve**](CoreApi.md#coreUsersMetricsRetrieve) | **GET** /core/users/{id}/metrics/ | 
[**coreUsersPartialUpdate**](CoreApi.md#coreUsersPartialUpdate) | **PATCH** /core/users/{id}/ | 
[**coreUsersPathsRetrieve**](CoreApi.md#coreUsersPathsRetrieve) | **GET** /core/users/paths/ | 
[**coreUsersRecoveryEmailRetrieve**](CoreApi.md#coreUsersRecoveryEmailRetrieve) | **GET** /core/users/{id}/recovery_email/ | 
[**coreUsersRecoveryRetrieve**](CoreApi.md#coreUsersRecoveryRetrieve) | **GET** /core/users/{id}/recovery/ | 
[**coreUsersRetrieve**](CoreApi.md#coreUsersRetrieve) | **GET** /core/users/{id}/ | 
[**coreUsersServiceAccountCreate**](CoreApi.md#coreUsersServiceAccountCreate) | **POST** /core/users/service_account/ | 
[**coreUsersSetPasswordCreate**](CoreApi.md#coreUsersSetPasswordCreate) | **POST** /core/users/{id}/set_password/ | 
[**coreUsersUpdate**](CoreApi.md#coreUsersUpdate) | **PUT** /core/users/{id}/ | 
[**coreUsersUsedByList**](CoreApi.md#coreUsersUsedByList) | **GET** /core/users/{id}/used_by/ | 


<a name="coreApplicationsCheckAccessRetrieve"></a>
# **coreApplicationsCheckAccessRetrieve**
> PolicyTestResult coreApplicationsCheckAccessRetrieve(slug, forUser)



Check access to a single application by slug

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val forUser : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PolicyTestResult = apiInstance.coreApplicationsCheckAccessRetrieve(slug, forUser)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsCheckAccessRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsCheckAccessRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **forUser** | **kotlin.Int**|  | [optional]

### Return type

[**PolicyTestResult**](PolicyTestResult.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreApplicationsCreate"></a>
# **coreApplicationsCreate**
> Application coreApplicationsCreate(applicationRequest)



Application Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val applicationRequest : ApplicationRequest =  // ApplicationRequest | 
try {
    val result : Application = apiInstance.coreApplicationsCreate(applicationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationRequest** | [**ApplicationRequest**](ApplicationRequest.md)|  |

### Return type

[**Application**](Application.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreApplicationsDestroy"></a>
# **coreApplicationsDestroy**
> coreApplicationsDestroy(slug)



Application Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    apiInstance.coreApplicationsDestroy(slug)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreApplicationsList"></a>
# **coreApplicationsList**
> PaginatedApplicationList coreApplicationsList(group, metaDescription, metaLaunchUrl, metaPublisher, name, ordering, page, pageSize, search, slug, superuserFullList)



Custom list method that checks Policy based access instead of guardian

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val group : kotlin.String = group_example // kotlin.String | 
val metaDescription : kotlin.String = metaDescription_example // kotlin.String | 
val metaLaunchUrl : kotlin.String = metaLaunchUrl_example // kotlin.String | 
val metaPublisher : kotlin.String = metaPublisher_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val slug : kotlin.String = slug_example // kotlin.String | 
val superuserFullList : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : PaginatedApplicationList = apiInstance.coreApplicationsList(group, metaDescription, metaLaunchUrl, metaPublisher, name, ordering, page, pageSize, search, slug, superuserFullList)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **kotlin.String**|  | [optional]
 **metaDescription** | **kotlin.String**|  | [optional]
 **metaLaunchUrl** | **kotlin.String**|  | [optional]
 **metaPublisher** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **superuserFullList** | **kotlin.Boolean**|  | [optional]

### Return type

[**PaginatedApplicationList**](PaginatedApplicationList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreApplicationsMetricsList"></a>
# **coreApplicationsMetricsList**
> kotlin.collections.List&lt;Coordinate&gt; coreApplicationsMetricsList(slug)



Metrics for application logins

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Coordinate> = apiInstance.coreApplicationsMetricsList(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsMetricsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsMetricsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;Coordinate&gt;**](Coordinate.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreApplicationsPartialUpdate"></a>
# **coreApplicationsPartialUpdate**
> Application coreApplicationsPartialUpdate(slug, patchedApplicationRequest)



Application Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val patchedApplicationRequest : PatchedApplicationRequest =  // PatchedApplicationRequest | 
try {
    val result : Application = apiInstance.coreApplicationsPartialUpdate(slug, patchedApplicationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **patchedApplicationRequest** | [**PatchedApplicationRequest**](PatchedApplicationRequest.md)|  | [optional]

### Return type

[**Application**](Application.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreApplicationsRetrieve"></a>
# **coreApplicationsRetrieve**
> Application coreApplicationsRetrieve(slug)



Application Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : Application = apiInstance.coreApplicationsRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**Application**](Application.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreApplicationsSetIconCreate"></a>
# **coreApplicationsSetIconCreate**
> coreApplicationsSetIconCreate(slug, file, clear)



Set application icon

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
val clear : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.coreApplicationsSetIconCreate(slug, file, clear)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsSetIconCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsSetIconCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **file** | **java.io.File**|  | [optional]
 **clear** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="coreApplicationsSetIconUrlCreate"></a>
# **coreApplicationsSetIconUrlCreate**
> coreApplicationsSetIconUrlCreate(slug, filePathRequest)



Set application icon (as URL)

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val filePathRequest : FilePathRequest =  // FilePathRequest | 
try {
    apiInstance.coreApplicationsSetIconUrlCreate(slug, filePathRequest)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsSetIconUrlCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsSetIconUrlCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **filePathRequest** | [**FilePathRequest**](FilePathRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreApplicationsUpdate"></a>
# **coreApplicationsUpdate**
> Application coreApplicationsUpdate(slug, applicationRequest)



Application Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val applicationRequest : ApplicationRequest =  // ApplicationRequest | 
try {
    val result : Application = apiInstance.coreApplicationsUpdate(slug, applicationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **applicationRequest** | [**ApplicationRequest**](ApplicationRequest.md)|  |

### Return type

[**Application**](Application.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreApplicationsUsedByList"></a>
# **coreApplicationsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; coreApplicationsUsedByList(slug)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.coreApplicationsUsedByList(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreApplicationsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreApplicationsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreAuthenticatedSessionsDestroy"></a>
# **coreAuthenticatedSessionsDestroy**
> coreAuthenticatedSessionsDestroy(uuid)



AuthenticatedSession Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Authenticated Session.
try {
    apiInstance.coreAuthenticatedSessionsDestroy(uuid)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreAuthenticatedSessionsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreAuthenticatedSessionsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Authenticated Session. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreAuthenticatedSessionsList"></a>
# **coreAuthenticatedSessionsList**
> PaginatedAuthenticatedSessionList coreAuthenticatedSessionsList(lastIp, lastUserAgent, ordering, page, pageSize, search, userUsername)



AuthenticatedSession Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val lastIp : kotlin.String = lastIp_example // kotlin.String | 
val lastUserAgent : kotlin.String = lastUserAgent_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val userUsername : kotlin.String = userUsername_example // kotlin.String | 
try {
    val result : PaginatedAuthenticatedSessionList = apiInstance.coreAuthenticatedSessionsList(lastIp, lastUserAgent, ordering, page, pageSize, search, userUsername)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreAuthenticatedSessionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreAuthenticatedSessionsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastIp** | **kotlin.String**|  | [optional]
 **lastUserAgent** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **userUsername** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedAuthenticatedSessionList**](PaginatedAuthenticatedSessionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreAuthenticatedSessionsRetrieve"></a>
# **coreAuthenticatedSessionsRetrieve**
> AuthenticatedSession coreAuthenticatedSessionsRetrieve(uuid)



AuthenticatedSession Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Authenticated Session.
try {
    val result : AuthenticatedSession = apiInstance.coreAuthenticatedSessionsRetrieve(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreAuthenticatedSessionsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreAuthenticatedSessionsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Authenticated Session. |

### Return type

[**AuthenticatedSession**](AuthenticatedSession.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreAuthenticatedSessionsUsedByList"></a>
# **coreAuthenticatedSessionsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; coreAuthenticatedSessionsUsedByList(uuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Authenticated Session.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.coreAuthenticatedSessionsUsedByList(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreAuthenticatedSessionsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreAuthenticatedSessionsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Authenticated Session. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreGroupsAddUserCreate"></a>
# **coreGroupsAddUserCreate**
> coreGroupsAddUserCreate(groupUuid, userAccountRequest)



Add user to group

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val groupUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Group.
val userAccountRequest : UserAccountRequest =  // UserAccountRequest | 
try {
    apiInstance.coreGroupsAddUserCreate(groupUuid, userAccountRequest)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreGroupsAddUserCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreGroupsAddUserCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupUuid** | **java.util.UUID**| A UUID string identifying this Group. |
 **userAccountRequest** | [**UserAccountRequest**](UserAccountRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreGroupsCreate"></a>
# **coreGroupsCreate**
> Group coreGroupsCreate(groupRequest)



Group Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val groupRequest : GroupRequest =  // GroupRequest | 
try {
    val result : Group = apiInstance.coreGroupsCreate(groupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreGroupsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreGroupsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupRequest** | [**GroupRequest**](GroupRequest.md)|  |

### Return type

[**Group**](Group.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreGroupsDestroy"></a>
# **coreGroupsDestroy**
> coreGroupsDestroy(groupUuid)



Group Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val groupUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Group.
try {
    apiInstance.coreGroupsDestroy(groupUuid)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreGroupsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreGroupsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupUuid** | **java.util.UUID**| A UUID string identifying this Group. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreGroupsList"></a>
# **coreGroupsList**
> PaginatedGroupList coreGroupsList(attributes, isSuperuser, membersByPk, membersByUsername, name, ordering, page, pageSize, search)



Group Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val attributes : kotlin.String = attributes_example // kotlin.String | Attributes
val isSuperuser : kotlin.Boolean = true // kotlin.Boolean | 
val membersByPk : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | 
val membersByUsername : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedGroupList = apiInstance.coreGroupsList(attributes, isSuperuser, membersByPk, membersByUsername, name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreGroupsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreGroupsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **kotlin.String**| Attributes | [optional]
 **isSuperuser** | **kotlin.Boolean**|  | [optional]
 **membersByPk** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]
 **membersByUsername** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedGroupList**](PaginatedGroupList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreGroupsPartialUpdate"></a>
# **coreGroupsPartialUpdate**
> Group coreGroupsPartialUpdate(groupUuid, patchedGroupRequest)



Group Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val groupUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Group.
val patchedGroupRequest : PatchedGroupRequest =  // PatchedGroupRequest | 
try {
    val result : Group = apiInstance.coreGroupsPartialUpdate(groupUuid, patchedGroupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreGroupsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreGroupsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupUuid** | **java.util.UUID**| A UUID string identifying this Group. |
 **patchedGroupRequest** | [**PatchedGroupRequest**](PatchedGroupRequest.md)|  | [optional]

### Return type

[**Group**](Group.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreGroupsRemoveUserCreate"></a>
# **coreGroupsRemoveUserCreate**
> coreGroupsRemoveUserCreate(groupUuid, userAccountRequest)



Add user to group

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val groupUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Group.
val userAccountRequest : UserAccountRequest =  // UserAccountRequest | 
try {
    apiInstance.coreGroupsRemoveUserCreate(groupUuid, userAccountRequest)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreGroupsRemoveUserCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreGroupsRemoveUserCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupUuid** | **java.util.UUID**| A UUID string identifying this Group. |
 **userAccountRequest** | [**UserAccountRequest**](UserAccountRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreGroupsRetrieve"></a>
# **coreGroupsRetrieve**
> Group coreGroupsRetrieve(groupUuid)



Group Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val groupUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Group.
try {
    val result : Group = apiInstance.coreGroupsRetrieve(groupUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreGroupsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreGroupsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupUuid** | **java.util.UUID**| A UUID string identifying this Group. |

### Return type

[**Group**](Group.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreGroupsUpdate"></a>
# **coreGroupsUpdate**
> Group coreGroupsUpdate(groupUuid, groupRequest)



Group Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val groupUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Group.
val groupRequest : GroupRequest =  // GroupRequest | 
try {
    val result : Group = apiInstance.coreGroupsUpdate(groupUuid, groupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreGroupsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreGroupsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupUuid** | **java.util.UUID**| A UUID string identifying this Group. |
 **groupRequest** | [**GroupRequest**](GroupRequest.md)|  |

### Return type

[**Group**](Group.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreGroupsUsedByList"></a>
# **coreGroupsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; coreGroupsUsedByList(groupUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val groupUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Group.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.coreGroupsUsedByList(groupUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreGroupsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreGroupsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupUuid** | **java.util.UUID**| A UUID string identifying this Group. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTenantsCreate"></a>
# **coreTenantsCreate**
> Tenant coreTenantsCreate(tenantRequest)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val tenantRequest : TenantRequest =  // TenantRequest | 
try {
    val result : Tenant = apiInstance.coreTenantsCreate(tenantRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTenantsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTenantsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantRequest** | [**TenantRequest**](TenantRequest.md)|  |

### Return type

[**Tenant**](Tenant.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreTenantsCurrentRetrieve"></a>
# **coreTenantsCurrentRetrieve**
> CurrentTenant coreTenantsCurrentRetrieve()



Get current tenant

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
try {
    val result : CurrentTenant = apiInstance.coreTenantsCurrentRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTenantsCurrentRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTenantsCurrentRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentTenant**](CurrentTenant.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTenantsDestroy"></a>
# **coreTenantsDestroy**
> coreTenantsDestroy(tenantUuid)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
try {
    apiInstance.coreTenantsDestroy(tenantUuid)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTenantsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTenantsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTenantsList"></a>
# **coreTenantsList**
> PaginatedTenantList coreTenantsList(brandingFavicon, brandingLogo, brandingTitle, default, domain, eventRetention, flowAuthentication, flowDeviceCode, flowInvalidation, flowRecovery, flowUnenrollment, flowUserSettings, ordering, page, pageSize, search, tenantUuid, webCertificate)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val brandingFavicon : kotlin.String = brandingFavicon_example // kotlin.String | 
val brandingLogo : kotlin.String = brandingLogo_example // kotlin.String | 
val brandingTitle : kotlin.String = brandingTitle_example // kotlin.String | 
val default : kotlin.Boolean = true // kotlin.Boolean | 
val domain : kotlin.String = domain_example // kotlin.String | 
val eventRetention : kotlin.String = eventRetention_example // kotlin.String | 
val flowAuthentication : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val flowDeviceCode : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val flowInvalidation : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val flowRecovery : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val flowUnenrollment : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val flowUserSettings : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val webCertificate : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedTenantList = apiInstance.coreTenantsList(brandingFavicon, brandingLogo, brandingTitle, default, domain, eventRetention, flowAuthentication, flowDeviceCode, flowInvalidation, flowRecovery, flowUnenrollment, flowUserSettings, ordering, page, pageSize, search, tenantUuid, webCertificate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTenantsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTenantsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandingFavicon** | **kotlin.String**|  | [optional]
 **brandingLogo** | **kotlin.String**|  | [optional]
 **brandingTitle** | **kotlin.String**|  | [optional]
 **default** | **kotlin.Boolean**|  | [optional]
 **domain** | **kotlin.String**|  | [optional]
 **eventRetention** | **kotlin.String**|  | [optional]
 **flowAuthentication** | **java.util.UUID**|  | [optional]
 **flowDeviceCode** | **java.util.UUID**|  | [optional]
 **flowInvalidation** | **java.util.UUID**|  | [optional]
 **flowRecovery** | **java.util.UUID**|  | [optional]
 **flowUnenrollment** | **java.util.UUID**|  | [optional]
 **flowUserSettings** | **java.util.UUID**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **tenantUuid** | **java.util.UUID**|  | [optional]
 **webCertificate** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedTenantList**](PaginatedTenantList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTenantsPartialUpdate"></a>
# **coreTenantsPartialUpdate**
> Tenant coreTenantsPartialUpdate(tenantUuid, patchedTenantRequest)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
val patchedTenantRequest : PatchedTenantRequest =  // PatchedTenantRequest | 
try {
    val result : Tenant = apiInstance.coreTenantsPartialUpdate(tenantUuid, patchedTenantRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTenantsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTenantsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |
 **patchedTenantRequest** | [**PatchedTenantRequest**](PatchedTenantRequest.md)|  | [optional]

### Return type

[**Tenant**](Tenant.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreTenantsRetrieve"></a>
# **coreTenantsRetrieve**
> Tenant coreTenantsRetrieve(tenantUuid)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
try {
    val result : Tenant = apiInstance.coreTenantsRetrieve(tenantUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTenantsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTenantsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |

### Return type

[**Tenant**](Tenant.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTenantsUpdate"></a>
# **coreTenantsUpdate**
> Tenant coreTenantsUpdate(tenantUuid, tenantRequest)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
val tenantRequest : TenantRequest =  // TenantRequest | 
try {
    val result : Tenant = apiInstance.coreTenantsUpdate(tenantUuid, tenantRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTenantsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTenantsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |
 **tenantRequest** | [**TenantRequest**](TenantRequest.md)|  |

### Return type

[**Tenant**](Tenant.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreTenantsUsedByList"></a>
# **coreTenantsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; coreTenantsUsedByList(tenantUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.coreTenantsUsedByList(tenantUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTenantsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTenantsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTokensCreate"></a>
# **coreTokensCreate**
> Token coreTokensCreate(tokenRequest)



Token Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val tokenRequest : TokenRequest =  // TokenRequest | 
try {
    val result : Token = apiInstance.coreTokensCreate(tokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTokensCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTokensCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenRequest** | [**TokenRequest**](TokenRequest.md)|  |

### Return type

[**Token**](Token.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreTokensDestroy"></a>
# **coreTokensDestroy**
> coreTokensDestroy(identifier)



Token Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
try {
    apiInstance.coreTokensDestroy(identifier)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTokensDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTokensDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTokensList"></a>
# **coreTokensList**
> PaginatedTokenList coreTokensList(description, expires, expiring, identifier, intent, managed, ordering, page, pageSize, search, userUsername)



Token Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val description : kotlin.String = description_example // kotlin.String | 
val expires : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val expiring : kotlin.Boolean = true // kotlin.Boolean | 
val identifier : kotlin.String = identifier_example // kotlin.String | 
val intent : kotlin.String = intent_example // kotlin.String | * `verification` - Intent Verification * `api` - Intent Api * `recovery` - Intent Recovery * `app_password` - Intent App Password
val managed : kotlin.String = managed_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val userUsername : kotlin.String = userUsername_example // kotlin.String | 
try {
    val result : PaginatedTokenList = apiInstance.coreTokensList(description, expires, expiring, identifier, intent, managed, ordering, page, pageSize, search, userUsername)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTokensList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTokensList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **description** | **kotlin.String**|  | [optional]
 **expires** | **java.time.OffsetDateTime**|  | [optional]
 **expiring** | **kotlin.Boolean**|  | [optional]
 **identifier** | **kotlin.String**|  | [optional]
 **intent** | **kotlin.String**| * &#x60;verification&#x60; - Intent Verification * &#x60;api&#x60; - Intent Api * &#x60;recovery&#x60; - Intent Recovery * &#x60;app_password&#x60; - Intent App Password | [optional] [enum: api, app_password, recovery, verification]
 **managed** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **userUsername** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedTokenList**](PaginatedTokenList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTokensPartialUpdate"></a>
# **coreTokensPartialUpdate**
> Token coreTokensPartialUpdate(identifier, patchedTokenRequest)



Token Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
val patchedTokenRequest : PatchedTokenRequest =  // PatchedTokenRequest | 
try {
    val result : Token = apiInstance.coreTokensPartialUpdate(identifier, patchedTokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTokensPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTokensPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**|  |
 **patchedTokenRequest** | [**PatchedTokenRequest**](PatchedTokenRequest.md)|  | [optional]

### Return type

[**Token**](Token.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreTokensRetrieve"></a>
# **coreTokensRetrieve**
> Token coreTokensRetrieve(identifier)



Token Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
try {
    val result : Token = apiInstance.coreTokensRetrieve(identifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTokensRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTokensRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**|  |

### Return type

[**Token**](Token.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTokensSetKeyCreate"></a>
# **coreTokensSetKeyCreate**
> coreTokensSetKeyCreate(identifier, tokenSetKeyRequest)



Set token key. Action is logged as event. &#x60;authentik_core.set_token_key&#x60; permission is required.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
val tokenSetKeyRequest : TokenSetKeyRequest =  // TokenSetKeyRequest | 
try {
    apiInstance.coreTokensSetKeyCreate(identifier, tokenSetKeyRequest)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTokensSetKeyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTokensSetKeyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**|  |
 **tokenSetKeyRequest** | [**TokenSetKeyRequest**](TokenSetKeyRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreTokensUpdate"></a>
# **coreTokensUpdate**
> Token coreTokensUpdate(identifier, tokenRequest)



Token Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
val tokenRequest : TokenRequest =  // TokenRequest | 
try {
    val result : Token = apiInstance.coreTokensUpdate(identifier, tokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTokensUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTokensUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**|  |
 **tokenRequest** | [**TokenRequest**](TokenRequest.md)|  |

### Return type

[**Token**](Token.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreTokensUsedByList"></a>
# **coreTokensUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; coreTokensUsedByList(identifier)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.coreTokensUsedByList(identifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTokensUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTokensUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTokensViewKeyRetrieve"></a>
# **coreTokensViewKeyRetrieve**
> TokenView coreTokensViewKeyRetrieve(identifier)



Return token key and log access

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
try {
    val result : TokenView = apiInstance.coreTokensViewKeyRetrieve(identifier)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTokensViewKeyRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTokensViewKeyRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**|  |

### Return type

[**TokenView**](TokenView.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreTransactionalApplicationsUpdate"></a>
# **coreTransactionalApplicationsUpdate**
> TransactionApplicationResponse coreTransactionalApplicationsUpdate(transactionApplicationRequest)



Convert data into a blueprint, validate it and apply it

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val transactionApplicationRequest : TransactionApplicationRequest =  // TransactionApplicationRequest | 
try {
    val result : TransactionApplicationResponse = apiInstance.coreTransactionalApplicationsUpdate(transactionApplicationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreTransactionalApplicationsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreTransactionalApplicationsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionApplicationRequest** | [**TransactionApplicationRequest**](TransactionApplicationRequest.md)|  |

### Return type

[**TransactionApplicationResponse**](TransactionApplicationResponse.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreUserConsentDestroy"></a>
# **coreUserConsentDestroy**
> coreUserConsentDestroy(id)



UserConsent Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User Consent.
try {
    apiInstance.coreUserConsentDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUserConsentDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUserConsentDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User Consent. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUserConsentList"></a>
# **coreUserConsentList**
> PaginatedUserConsentList coreUserConsentList(application, ordering, page, pageSize, search, user)



UserConsent Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val application : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val user : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedUserConsentList = apiInstance.coreUserConsentList(application, ordering, page, pageSize, search, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUserConsentList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUserConsentList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **java.util.UUID**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **user** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedUserConsentList**](PaginatedUserConsentList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUserConsentRetrieve"></a>
# **coreUserConsentRetrieve**
> UserConsent coreUserConsentRetrieve(id)



UserConsent Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User Consent.
try {
    val result : UserConsent = apiInstance.coreUserConsentRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUserConsentRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUserConsentRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User Consent. |

### Return type

[**UserConsent**](UserConsent.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUserConsentUsedByList"></a>
# **coreUserConsentUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; coreUserConsentUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User Consent.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.coreUserConsentUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUserConsentUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUserConsentUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User Consent. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersCreate"></a>
# **coreUsersCreate**
> User coreUsersCreate(userRequest)



User Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val userRequest : UserRequest =  // UserRequest | 
try {
    val result : User = apiInstance.coreUsersCreate(userRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userRequest** | [**UserRequest**](UserRequest.md)|  |

### Return type

[**User**](User.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreUsersDestroy"></a>
# **coreUsersDestroy**
> coreUsersDestroy(id)



User Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
try {
    apiInstance.coreUsersDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersImpersonateCreate"></a>
# **coreUsersImpersonateCreate**
> coreUsersImpersonateCreate(id)



Impersonate a user

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
try {
    apiInstance.coreUsersImpersonateCreate(id)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersImpersonateCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersImpersonateCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersImpersonateEndRetrieve"></a>
# **coreUsersImpersonateEndRetrieve**
> coreUsersImpersonateEndRetrieve()



End Impersonation a user

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
try {
    apiInstance.coreUsersImpersonateEndRetrieve()
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersImpersonateEndRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersImpersonateEndRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersList"></a>
# **coreUsersList**
> PaginatedUserList coreUsersList(attributes, email, groupsByName, groupsByPk, isActive, isSuperuser, name, ordering, page, pageSize, path, pathStartswith, search, type, username, uuid)



User Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val attributes : kotlin.String = attributes_example // kotlin.String | Attributes
val email : kotlin.String = email_example // kotlin.String | 
val groupsByName : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val groupsByPk : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val isActive : kotlin.Boolean = true // kotlin.Boolean | 
val isSuperuser : kotlin.Boolean = true // kotlin.Boolean | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val path : kotlin.String = path_example // kotlin.String | 
val pathStartswith : kotlin.String = pathStartswith_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val type : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | * `internal` - Internal * `external` - External * `service_account` - Service Account * `internal_service_account` - Internal Service Account
val username : kotlin.String = username_example // kotlin.String | 
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedUserList = apiInstance.coreUsersList(attributes, email, groupsByName, groupsByPk, isActive, isSuperuser, name, ordering, page, pageSize, path, pathStartswith, search, type, username, uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **kotlin.String**| Attributes | [optional]
 **email** | **kotlin.String**|  | [optional]
 **groupsByName** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **groupsByPk** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **isActive** | **kotlin.Boolean**|  | [optional]
 **isSuperuser** | **kotlin.Boolean**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **path** | **kotlin.String**|  | [optional]
 **pathStartswith** | **kotlin.String**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **type** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| * &#x60;internal&#x60; - Internal * &#x60;external&#x60; - External * &#x60;service_account&#x60; - Service Account * &#x60;internal_service_account&#x60; - Internal Service Account | [optional] [enum: external, internal, internal_service_account, service_account]
 **username** | **kotlin.String**|  | [optional]
 **uuid** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedUserList**](PaginatedUserList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersMeRetrieve"></a>
# **coreUsersMeRetrieve**
> SessionUser coreUsersMeRetrieve()



Get information about current user

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
try {
    val result : SessionUser = apiInstance.coreUsersMeRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersMeRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersMeRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SessionUser**](SessionUser.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersMetricsRetrieve"></a>
# **coreUsersMetricsRetrieve**
> UserMetrics coreUsersMetricsRetrieve(id)



User metrics per 1h

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
try {
    val result : UserMetrics = apiInstance.coreUsersMetricsRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersMetricsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersMetricsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |

### Return type

[**UserMetrics**](UserMetrics.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersPartialUpdate"></a>
# **coreUsersPartialUpdate**
> User coreUsersPartialUpdate(id, patchedUserRequest)



User Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
val patchedUserRequest : PatchedUserRequest =  // PatchedUserRequest | 
try {
    val result : User = apiInstance.coreUsersPartialUpdate(id, patchedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |
 **patchedUserRequest** | [**PatchedUserRequest**](PatchedUserRequest.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreUsersPathsRetrieve"></a>
# **coreUsersPathsRetrieve**
> UserPath coreUsersPathsRetrieve(search)



Get all user paths

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val search : kotlin.String = search_example // kotlin.String | 
try {
    val result : UserPath = apiInstance.coreUsersPathsRetrieve(search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersPathsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersPathsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **kotlin.String**|  | [optional]

### Return type

[**UserPath**](UserPath.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersRecoveryEmailRetrieve"></a>
# **coreUsersRecoveryEmailRetrieve**
> coreUsersRecoveryEmailRetrieve(id, emailStage)



Create a temporary link that a user can use to recover their accounts

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
val emailStage : kotlin.String = emailStage_example // kotlin.String | 
try {
    apiInstance.coreUsersRecoveryEmailRetrieve(id, emailStage)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersRecoveryEmailRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersRecoveryEmailRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |
 **emailStage** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersRecoveryRetrieve"></a>
# **coreUsersRecoveryRetrieve**
> Link coreUsersRecoveryRetrieve(id)



Create a temporary link that a user can use to recover their accounts

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
try {
    val result : Link = apiInstance.coreUsersRecoveryRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersRecoveryRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersRecoveryRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |

### Return type

[**Link**](Link.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersRetrieve"></a>
# **coreUsersRetrieve**
> User coreUsersRetrieve(id)



User Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
try {
    val result : User = apiInstance.coreUsersRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |

### Return type

[**User**](User.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coreUsersServiceAccountCreate"></a>
# **coreUsersServiceAccountCreate**
> UserServiceAccountResponse coreUsersServiceAccountCreate(userServiceAccountRequest)



Create a new user account that is marked as a service account

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val userServiceAccountRequest : UserServiceAccountRequest =  // UserServiceAccountRequest | 
try {
    val result : UserServiceAccountResponse = apiInstance.coreUsersServiceAccountCreate(userServiceAccountRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersServiceAccountCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersServiceAccountCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userServiceAccountRequest** | [**UserServiceAccountRequest**](UserServiceAccountRequest.md)|  |

### Return type

[**UserServiceAccountResponse**](UserServiceAccountResponse.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreUsersSetPasswordCreate"></a>
# **coreUsersSetPasswordCreate**
> coreUsersSetPasswordCreate(id, userPasswordSetRequest)



Set password for user

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
val userPasswordSetRequest : UserPasswordSetRequest =  // UserPasswordSetRequest | 
try {
    apiInstance.coreUsersSetPasswordCreate(id, userPasswordSetRequest)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersSetPasswordCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersSetPasswordCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |
 **userPasswordSetRequest** | [**UserPasswordSetRequest**](UserPasswordSetRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreUsersUpdate"></a>
# **coreUsersUpdate**
> User coreUsersUpdate(id, userRequest)



User Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
val userRequest : UserRequest =  // UserRequest | 
try {
    val result : User = apiInstance.coreUsersUpdate(id, userRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |
 **userRequest** | [**UserRequest**](UserRequest.md)|  |

### Return type

[**User**](User.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="coreUsersUsedByList"></a>
# **coreUsersUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; coreUsersUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CoreApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.coreUsersUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoreApi#coreUsersUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoreApi#coreUsersUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

