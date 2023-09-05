# SourcesApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sourcesAllDestroy**](SourcesApi.md#sourcesAllDestroy) | **DELETE** /sources/all/{slug}/ | 
[**sourcesAllList**](SourcesApi.md#sourcesAllList) | **GET** /sources/all/ | 
[**sourcesAllRetrieve**](SourcesApi.md#sourcesAllRetrieve) | **GET** /sources/all/{slug}/ | 
[**sourcesAllSetIconCreate**](SourcesApi.md#sourcesAllSetIconCreate) | **POST** /sources/all/{slug}/set_icon/ | 
[**sourcesAllSetIconUrlCreate**](SourcesApi.md#sourcesAllSetIconUrlCreate) | **POST** /sources/all/{slug}/set_icon_url/ | 
[**sourcesAllTypesList**](SourcesApi.md#sourcesAllTypesList) | **GET** /sources/all/types/ | 
[**sourcesAllUsedByList**](SourcesApi.md#sourcesAllUsedByList) | **GET** /sources/all/{slug}/used_by/ | 
[**sourcesAllUserSettingsList**](SourcesApi.md#sourcesAllUserSettingsList) | **GET** /sources/all/user_settings/ | 
[**sourcesLdapCreate**](SourcesApi.md#sourcesLdapCreate) | **POST** /sources/ldap/ | 
[**sourcesLdapDebugRetrieve**](SourcesApi.md#sourcesLdapDebugRetrieve) | **GET** /sources/ldap/{slug}/debug/ | 
[**sourcesLdapDestroy**](SourcesApi.md#sourcesLdapDestroy) | **DELETE** /sources/ldap/{slug}/ | 
[**sourcesLdapList**](SourcesApi.md#sourcesLdapList) | **GET** /sources/ldap/ | 
[**sourcesLdapPartialUpdate**](SourcesApi.md#sourcesLdapPartialUpdate) | **PATCH** /sources/ldap/{slug}/ | 
[**sourcesLdapRetrieve**](SourcesApi.md#sourcesLdapRetrieve) | **GET** /sources/ldap/{slug}/ | 
[**sourcesLdapSyncStatusList**](SourcesApi.md#sourcesLdapSyncStatusList) | **GET** /sources/ldap/{slug}/sync_status/ | 
[**sourcesLdapUpdate**](SourcesApi.md#sourcesLdapUpdate) | **PUT** /sources/ldap/{slug}/ | 
[**sourcesLdapUsedByList**](SourcesApi.md#sourcesLdapUsedByList) | **GET** /sources/ldap/{slug}/used_by/ | 
[**sourcesOauthCreate**](SourcesApi.md#sourcesOauthCreate) | **POST** /sources/oauth/ | 
[**sourcesOauthDestroy**](SourcesApi.md#sourcesOauthDestroy) | **DELETE** /sources/oauth/{slug}/ | 
[**sourcesOauthList**](SourcesApi.md#sourcesOauthList) | **GET** /sources/oauth/ | 
[**sourcesOauthPartialUpdate**](SourcesApi.md#sourcesOauthPartialUpdate) | **PATCH** /sources/oauth/{slug}/ | 
[**sourcesOauthRetrieve**](SourcesApi.md#sourcesOauthRetrieve) | **GET** /sources/oauth/{slug}/ | 
[**sourcesOauthSourceTypesList**](SourcesApi.md#sourcesOauthSourceTypesList) | **GET** /sources/oauth/source_types/ | 
[**sourcesOauthUpdate**](SourcesApi.md#sourcesOauthUpdate) | **PUT** /sources/oauth/{slug}/ | 
[**sourcesOauthUsedByList**](SourcesApi.md#sourcesOauthUsedByList) | **GET** /sources/oauth/{slug}/used_by/ | 
[**sourcesPlexCreate**](SourcesApi.md#sourcesPlexCreate) | **POST** /sources/plex/ | 
[**sourcesPlexDestroy**](SourcesApi.md#sourcesPlexDestroy) | **DELETE** /sources/plex/{slug}/ | 
[**sourcesPlexList**](SourcesApi.md#sourcesPlexList) | **GET** /sources/plex/ | 
[**sourcesPlexPartialUpdate**](SourcesApi.md#sourcesPlexPartialUpdate) | **PATCH** /sources/plex/{slug}/ | 
[**sourcesPlexRedeemTokenAuthenticatedCreate**](SourcesApi.md#sourcesPlexRedeemTokenAuthenticatedCreate) | **POST** /sources/plex/redeem_token_authenticated/ | 
[**sourcesPlexRedeemTokenCreate**](SourcesApi.md#sourcesPlexRedeemTokenCreate) | **POST** /sources/plex/redeem_token/ | 
[**sourcesPlexRetrieve**](SourcesApi.md#sourcesPlexRetrieve) | **GET** /sources/plex/{slug}/ | 
[**sourcesPlexUpdate**](SourcesApi.md#sourcesPlexUpdate) | **PUT** /sources/plex/{slug}/ | 
[**sourcesPlexUsedByList**](SourcesApi.md#sourcesPlexUsedByList) | **GET** /sources/plex/{slug}/used_by/ | 
[**sourcesSamlCreate**](SourcesApi.md#sourcesSamlCreate) | **POST** /sources/saml/ | 
[**sourcesSamlDestroy**](SourcesApi.md#sourcesSamlDestroy) | **DELETE** /sources/saml/{slug}/ | 
[**sourcesSamlList**](SourcesApi.md#sourcesSamlList) | **GET** /sources/saml/ | 
[**sourcesSamlMetadataRetrieve**](SourcesApi.md#sourcesSamlMetadataRetrieve) | **GET** /sources/saml/{slug}/metadata/ | 
[**sourcesSamlPartialUpdate**](SourcesApi.md#sourcesSamlPartialUpdate) | **PATCH** /sources/saml/{slug}/ | 
[**sourcesSamlRetrieve**](SourcesApi.md#sourcesSamlRetrieve) | **GET** /sources/saml/{slug}/ | 
[**sourcesSamlUpdate**](SourcesApi.md#sourcesSamlUpdate) | **PUT** /sources/saml/{slug}/ | 
[**sourcesSamlUsedByList**](SourcesApi.md#sourcesSamlUsedByList) | **GET** /sources/saml/{slug}/used_by/ | 
[**sourcesUserConnectionsAllDestroy**](SourcesApi.md#sourcesUserConnectionsAllDestroy) | **DELETE** /sources/user_connections/all/{id}/ | 
[**sourcesUserConnectionsAllList**](SourcesApi.md#sourcesUserConnectionsAllList) | **GET** /sources/user_connections/all/ | 
[**sourcesUserConnectionsAllPartialUpdate**](SourcesApi.md#sourcesUserConnectionsAllPartialUpdate) | **PATCH** /sources/user_connections/all/{id}/ | 
[**sourcesUserConnectionsAllRetrieve**](SourcesApi.md#sourcesUserConnectionsAllRetrieve) | **GET** /sources/user_connections/all/{id}/ | 
[**sourcesUserConnectionsAllUpdate**](SourcesApi.md#sourcesUserConnectionsAllUpdate) | **PUT** /sources/user_connections/all/{id}/ | 
[**sourcesUserConnectionsAllUsedByList**](SourcesApi.md#sourcesUserConnectionsAllUsedByList) | **GET** /sources/user_connections/all/{id}/used_by/ | 
[**sourcesUserConnectionsOauthCreate**](SourcesApi.md#sourcesUserConnectionsOauthCreate) | **POST** /sources/user_connections/oauth/ | 
[**sourcesUserConnectionsOauthDestroy**](SourcesApi.md#sourcesUserConnectionsOauthDestroy) | **DELETE** /sources/user_connections/oauth/{id}/ | 
[**sourcesUserConnectionsOauthList**](SourcesApi.md#sourcesUserConnectionsOauthList) | **GET** /sources/user_connections/oauth/ | 
[**sourcesUserConnectionsOauthPartialUpdate**](SourcesApi.md#sourcesUserConnectionsOauthPartialUpdate) | **PATCH** /sources/user_connections/oauth/{id}/ | 
[**sourcesUserConnectionsOauthRetrieve**](SourcesApi.md#sourcesUserConnectionsOauthRetrieve) | **GET** /sources/user_connections/oauth/{id}/ | 
[**sourcesUserConnectionsOauthUpdate**](SourcesApi.md#sourcesUserConnectionsOauthUpdate) | **PUT** /sources/user_connections/oauth/{id}/ | 
[**sourcesUserConnectionsOauthUsedByList**](SourcesApi.md#sourcesUserConnectionsOauthUsedByList) | **GET** /sources/user_connections/oauth/{id}/used_by/ | 
[**sourcesUserConnectionsPlexCreate**](SourcesApi.md#sourcesUserConnectionsPlexCreate) | **POST** /sources/user_connections/plex/ | 
[**sourcesUserConnectionsPlexDestroy**](SourcesApi.md#sourcesUserConnectionsPlexDestroy) | **DELETE** /sources/user_connections/plex/{id}/ | 
[**sourcesUserConnectionsPlexList**](SourcesApi.md#sourcesUserConnectionsPlexList) | **GET** /sources/user_connections/plex/ | 
[**sourcesUserConnectionsPlexPartialUpdate**](SourcesApi.md#sourcesUserConnectionsPlexPartialUpdate) | **PATCH** /sources/user_connections/plex/{id}/ | 
[**sourcesUserConnectionsPlexRetrieve**](SourcesApi.md#sourcesUserConnectionsPlexRetrieve) | **GET** /sources/user_connections/plex/{id}/ | 
[**sourcesUserConnectionsPlexUpdate**](SourcesApi.md#sourcesUserConnectionsPlexUpdate) | **PUT** /sources/user_connections/plex/{id}/ | 
[**sourcesUserConnectionsPlexUsedByList**](SourcesApi.md#sourcesUserConnectionsPlexUsedByList) | **GET** /sources/user_connections/plex/{id}/used_by/ | 
[**sourcesUserConnectionsSamlCreate**](SourcesApi.md#sourcesUserConnectionsSamlCreate) | **POST** /sources/user_connections/saml/ | 
[**sourcesUserConnectionsSamlDestroy**](SourcesApi.md#sourcesUserConnectionsSamlDestroy) | **DELETE** /sources/user_connections/saml/{id}/ | 
[**sourcesUserConnectionsSamlList**](SourcesApi.md#sourcesUserConnectionsSamlList) | **GET** /sources/user_connections/saml/ | 
[**sourcesUserConnectionsSamlPartialUpdate**](SourcesApi.md#sourcesUserConnectionsSamlPartialUpdate) | **PATCH** /sources/user_connections/saml/{id}/ | 
[**sourcesUserConnectionsSamlRetrieve**](SourcesApi.md#sourcesUserConnectionsSamlRetrieve) | **GET** /sources/user_connections/saml/{id}/ | 
[**sourcesUserConnectionsSamlUpdate**](SourcesApi.md#sourcesUserConnectionsSamlUpdate) | **PUT** /sources/user_connections/saml/{id}/ | 
[**sourcesUserConnectionsSamlUsedByList**](SourcesApi.md#sourcesUserConnectionsSamlUsedByList) | **GET** /sources/user_connections/saml/{id}/used_by/ | 


<a name="sourcesAllDestroy"></a>
# **sourcesAllDestroy**
> sourcesAllDestroy(slug)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    apiInstance.sourcesAllDestroy(slug)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesAllDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesAllDestroy")
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

<a name="sourcesAllList"></a>
# **sourcesAllList**
> PaginatedSourceList sourcesAllList(managed, name, ordering, page, pageSize, search, slug)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val managed : kotlin.String = managed_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : PaginatedSourceList = apiInstance.sourcesAllList(managed, name, ordering, page, pageSize, search, slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesAllList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesAllList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managed** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **slug** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedSourceList**](PaginatedSourceList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesAllRetrieve"></a>
# **sourcesAllRetrieve**
> Source sourcesAllRetrieve(slug)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : Source = apiInstance.sourcesAllRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesAllRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesAllRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**Source**](Source.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesAllSetIconCreate"></a>
# **sourcesAllSetIconCreate**
> sourcesAllSetIconCreate(slug, file, clear)



Set source icon

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
val clear : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.sourcesAllSetIconCreate(slug, file, clear)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesAllSetIconCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesAllSetIconCreate")
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

<a name="sourcesAllSetIconUrlCreate"></a>
# **sourcesAllSetIconUrlCreate**
> sourcesAllSetIconUrlCreate(slug, filePathRequest)



Set source icon (as URL)

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val filePathRequest : FilePathRequest =  // FilePathRequest | 
try {
    apiInstance.sourcesAllSetIconUrlCreate(slug, filePathRequest)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesAllSetIconUrlCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesAllSetIconUrlCreate")
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

<a name="sourcesAllTypesList"></a>
# **sourcesAllTypesList**
> kotlin.collections.List&lt;TypeCreate&gt; sourcesAllTypesList()



Get all creatable source types

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
try {
    val result : kotlin.collections.List<TypeCreate> = apiInstance.sourcesAllTypesList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesAllTypesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesAllTypesList")
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

<a name="sourcesAllUsedByList"></a>
# **sourcesAllUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; sourcesAllUsedByList(slug)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.sourcesAllUsedByList(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesAllUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesAllUsedByList")
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

<a name="sourcesAllUserSettingsList"></a>
# **sourcesAllUserSettingsList**
> kotlin.collections.List&lt;UserSetting&gt; sourcesAllUserSettingsList()



Get all sources the user can configure

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
try {
    val result : kotlin.collections.List<UserSetting> = apiInstance.sourcesAllUserSettingsList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesAllUserSettingsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesAllUserSettingsList")
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

<a name="sourcesLdapCreate"></a>
# **sourcesLdapCreate**
> LDAPSource sourcesLdapCreate(ldAPSourceRequest)



LDAP Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val ldAPSourceRequest : LDAPSourceRequest =  // LDAPSourceRequest | 
try {
    val result : LDAPSource = apiInstance.sourcesLdapCreate(ldAPSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesLdapCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesLdapCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ldAPSourceRequest** | [**LDAPSourceRequest**](LDAPSourceRequest.md)|  |

### Return type

[**LDAPSource**](LDAPSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesLdapDebugRetrieve"></a>
# **sourcesLdapDebugRetrieve**
> LDAPDebug sourcesLdapDebugRetrieve(slug)



Get raw LDAP data to debug

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : LDAPDebug = apiInstance.sourcesLdapDebugRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesLdapDebugRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesLdapDebugRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**LDAPDebug**](LDAPDebug.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesLdapDestroy"></a>
# **sourcesLdapDestroy**
> sourcesLdapDestroy(slug)



LDAP Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    apiInstance.sourcesLdapDestroy(slug)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesLdapDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesLdapDestroy")
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

<a name="sourcesLdapList"></a>
# **sourcesLdapList**
> PaginatedLDAPSourceList sourcesLdapList(additionalGroupDn, additionalUserDn, baseDn, bindCn, clientCertificate, enabled, groupMembershipField, groupObjectFilter, name, objectUniquenessField, ordering, page, pageSize, peerCertificate, propertyMappings, propertyMappingsGroup, search, serverUri, slug, sni, startTls, syncGroups, syncParentGroup, syncUsers, syncUsersPassword, userObjectFilter)



LDAP Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val additionalGroupDn : kotlin.String = additionalGroupDn_example // kotlin.String | 
val additionalUserDn : kotlin.String = additionalUserDn_example // kotlin.String | 
val baseDn : kotlin.String = baseDn_example // kotlin.String | 
val bindCn : kotlin.String = bindCn_example // kotlin.String | 
val clientCertificate : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enabled : kotlin.Boolean = true // kotlin.Boolean | 
val groupMembershipField : kotlin.String = groupMembershipField_example // kotlin.String | 
val groupObjectFilter : kotlin.String = groupObjectFilter_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val objectUniquenessField : kotlin.String = objectUniquenessField_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val peerCertificate : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val propertyMappings : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val propertyMappingsGroup : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val serverUri : kotlin.String = serverUri_example // kotlin.String | 
val slug : kotlin.String = slug_example // kotlin.String | 
val sni : kotlin.Boolean = true // kotlin.Boolean | 
val startTls : kotlin.Boolean = true // kotlin.Boolean | 
val syncGroups : kotlin.Boolean = true // kotlin.Boolean | 
val syncParentGroup : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val syncUsers : kotlin.Boolean = true // kotlin.Boolean | 
val syncUsersPassword : kotlin.Boolean = true // kotlin.Boolean | 
val userObjectFilter : kotlin.String = userObjectFilter_example // kotlin.String | 
try {
    val result : PaginatedLDAPSourceList = apiInstance.sourcesLdapList(additionalGroupDn, additionalUserDn, baseDn, bindCn, clientCertificate, enabled, groupMembershipField, groupObjectFilter, name, objectUniquenessField, ordering, page, pageSize, peerCertificate, propertyMappings, propertyMappingsGroup, search, serverUri, slug, sni, startTls, syncGroups, syncParentGroup, syncUsers, syncUsersPassword, userObjectFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesLdapList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesLdapList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **additionalGroupDn** | **kotlin.String**|  | [optional]
 **additionalUserDn** | **kotlin.String**|  | [optional]
 **baseDn** | **kotlin.String**|  | [optional]
 **bindCn** | **kotlin.String**|  | [optional]
 **clientCertificate** | **java.util.UUID**|  | [optional]
 **enabled** | **kotlin.Boolean**|  | [optional]
 **groupMembershipField** | **kotlin.String**|  | [optional]
 **groupObjectFilter** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **objectUniquenessField** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **peerCertificate** | **java.util.UUID**|  | [optional]
 **propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **propertyMappingsGroup** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **serverUri** | **kotlin.String**|  | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **sni** | **kotlin.Boolean**|  | [optional]
 **startTls** | **kotlin.Boolean**|  | [optional]
 **syncGroups** | **kotlin.Boolean**|  | [optional]
 **syncParentGroup** | **java.util.UUID**|  | [optional]
 **syncUsers** | **kotlin.Boolean**|  | [optional]
 **syncUsersPassword** | **kotlin.Boolean**|  | [optional]
 **userObjectFilter** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedLDAPSourceList**](PaginatedLDAPSourceList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesLdapPartialUpdate"></a>
# **sourcesLdapPartialUpdate**
> LDAPSource sourcesLdapPartialUpdate(slug, patchedLDAPSourceRequest)



LDAP Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val patchedLDAPSourceRequest : PatchedLDAPSourceRequest =  // PatchedLDAPSourceRequest | 
try {
    val result : LDAPSource = apiInstance.sourcesLdapPartialUpdate(slug, patchedLDAPSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesLdapPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesLdapPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **patchedLDAPSourceRequest** | [**PatchedLDAPSourceRequest**](PatchedLDAPSourceRequest.md)|  | [optional]

### Return type

[**LDAPSource**](LDAPSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesLdapRetrieve"></a>
# **sourcesLdapRetrieve**
> LDAPSource sourcesLdapRetrieve(slug)



LDAP Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : LDAPSource = apiInstance.sourcesLdapRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesLdapRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesLdapRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**LDAPSource**](LDAPSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesLdapSyncStatusList"></a>
# **sourcesLdapSyncStatusList**
> kotlin.collections.List&lt;Task&gt; sourcesLdapSyncStatusList(slug)



Get source&#39;s sync status

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Task> = apiInstance.sourcesLdapSyncStatusList(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesLdapSyncStatusList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesLdapSyncStatusList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;Task&gt;**](Task.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesLdapUpdate"></a>
# **sourcesLdapUpdate**
> LDAPSource sourcesLdapUpdate(slug, ldAPSourceRequest)



LDAP Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val ldAPSourceRequest : LDAPSourceRequest =  // LDAPSourceRequest | 
try {
    val result : LDAPSource = apiInstance.sourcesLdapUpdate(slug, ldAPSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesLdapUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesLdapUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **ldAPSourceRequest** | [**LDAPSourceRequest**](LDAPSourceRequest.md)|  |

### Return type

[**LDAPSource**](LDAPSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesLdapUsedByList"></a>
# **sourcesLdapUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; sourcesLdapUsedByList(slug)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.sourcesLdapUsedByList(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesLdapUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesLdapUsedByList")
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

<a name="sourcesOauthCreate"></a>
# **sourcesOauthCreate**
> OAuthSource sourcesOauthCreate(oauthSourceRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val oauthSourceRequest : OAuthSourceRequest =  // OAuthSourceRequest | 
try {
    val result : OAuthSource = apiInstance.sourcesOauthCreate(oauthSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesOauthCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesOauthCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthSourceRequest** | [**OAuthSourceRequest**](OAuthSourceRequest.md)|  |

### Return type

[**OAuthSource**](OAuthSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesOauthDestroy"></a>
# **sourcesOauthDestroy**
> sourcesOauthDestroy(slug)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    apiInstance.sourcesOauthDestroy(slug)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesOauthDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesOauthDestroy")
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

<a name="sourcesOauthList"></a>
# **sourcesOauthList**
> PaginatedOAuthSourceList sourcesOauthList(accessTokenUrl, additionalScopes, authenticationFlow, authorizationUrl, consumerKey, enabled, enrollmentFlow, hasJwks, name, ordering, page, pageSize, policyEngineMode, profileUrl, providerType, requestTokenUrl, search, slug, userMatchingMode)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val accessTokenUrl : kotlin.String = accessTokenUrl_example // kotlin.String | 
val additionalScopes : kotlin.String = additionalScopes_example // kotlin.String | 
val authenticationFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val authorizationUrl : kotlin.String = authorizationUrl_example // kotlin.String | 
val consumerKey : kotlin.String = consumerKey_example // kotlin.String | 
val enabled : kotlin.Boolean = true // kotlin.Boolean | 
val enrollmentFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val hasJwks : kotlin.Boolean = true // kotlin.Boolean | Only return sources with JWKS data
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policyEngineMode : kotlin.String = policyEngineMode_example // kotlin.String | * `all` - all, all policies must pass * `any` - any, any policy must pass
val profileUrl : kotlin.String = profileUrl_example // kotlin.String | 
val providerType : kotlin.String = providerType_example // kotlin.String | 
val requestTokenUrl : kotlin.String = requestTokenUrl_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val slug : kotlin.String = slug_example // kotlin.String | 
val userMatchingMode : kotlin.String = userMatchingMode_example // kotlin.String | How the source determines if an existing user should be authenticated or a new user enrolled.  * `identifier` - Use the source-specific identifier * `email_link` - Link to a user with identical email address. Can have security implications when a source doesn't validate email addresses. * `email_deny` - Use the user's email address, but deny enrollment when the email address already exists. * `username_link` - Link to a user with identical username. Can have security implications when a username is used with another source. * `username_deny` - Use the user's username, but deny enrollment when the username already exists.
try {
    val result : PaginatedOAuthSourceList = apiInstance.sourcesOauthList(accessTokenUrl, additionalScopes, authenticationFlow, authorizationUrl, consumerKey, enabled, enrollmentFlow, hasJwks, name, ordering, page, pageSize, policyEngineMode, profileUrl, providerType, requestTokenUrl, search, slug, userMatchingMode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesOauthList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesOauthList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessTokenUrl** | **kotlin.String**|  | [optional]
 **additionalScopes** | **kotlin.String**|  | [optional]
 **authenticationFlow** | **java.util.UUID**|  | [optional]
 **authorizationUrl** | **kotlin.String**|  | [optional]
 **consumerKey** | **kotlin.String**|  | [optional]
 **enabled** | **kotlin.Boolean**|  | [optional]
 **enrollmentFlow** | **java.util.UUID**|  | [optional]
 **hasJwks** | **kotlin.Boolean**| Only return sources with JWKS data | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policyEngineMode** | **kotlin.String**| * &#x60;all&#x60; - all, all policies must pass * &#x60;any&#x60; - any, any policy must pass | [optional] [enum: all, any]
 **profileUrl** | **kotlin.String**|  | [optional]
 **providerType** | **kotlin.String**|  | [optional]
 **requestTokenUrl** | **kotlin.String**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **userMatchingMode** | **kotlin.String**| How the source determines if an existing user should be authenticated or a new user enrolled.  * &#x60;identifier&#x60; - Use the source-specific identifier * &#x60;email_link&#x60; - Link to a user with identical email address. Can have security implications when a source doesn&#39;t validate email addresses. * &#x60;email_deny&#x60; - Use the user&#39;s email address, but deny enrollment when the email address already exists. * &#x60;username_link&#x60; - Link to a user with identical username. Can have security implications when a username is used with another source. * &#x60;username_deny&#x60; - Use the user&#39;s username, but deny enrollment when the username already exists. | [optional] [enum: email_deny, email_link, identifier, username_deny, username_link]

### Return type

[**PaginatedOAuthSourceList**](PaginatedOAuthSourceList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesOauthPartialUpdate"></a>
# **sourcesOauthPartialUpdate**
> OAuthSource sourcesOauthPartialUpdate(slug, patchedOAuthSourceRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val patchedOAuthSourceRequest : PatchedOAuthSourceRequest =  // PatchedOAuthSourceRequest | 
try {
    val result : OAuthSource = apiInstance.sourcesOauthPartialUpdate(slug, patchedOAuthSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesOauthPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesOauthPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **patchedOAuthSourceRequest** | [**PatchedOAuthSourceRequest**](PatchedOAuthSourceRequest.md)|  | [optional]

### Return type

[**OAuthSource**](OAuthSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesOauthRetrieve"></a>
# **sourcesOauthRetrieve**
> OAuthSource sourcesOauthRetrieve(slug)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : OAuthSource = apiInstance.sourcesOauthRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesOauthRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesOauthRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**OAuthSource**](OAuthSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesOauthSourceTypesList"></a>
# **sourcesOauthSourceTypesList**
> kotlin.collections.List&lt;SourceType&gt; sourcesOauthSourceTypesList(name)



Get all creatable source types. If ?name is set, only returns the type for &lt;name&gt;. If &lt;name&gt; isn&#39;t found, returns the default type.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : kotlin.collections.List<SourceType> = apiInstance.sourcesOauthSourceTypesList(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesOauthSourceTypesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesOauthSourceTypesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;SourceType&gt;**](SourceType.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesOauthUpdate"></a>
# **sourcesOauthUpdate**
> OAuthSource sourcesOauthUpdate(slug, oauthSourceRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val oauthSourceRequest : OAuthSourceRequest =  // OAuthSourceRequest | 
try {
    val result : OAuthSource = apiInstance.sourcesOauthUpdate(slug, oauthSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesOauthUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesOauthUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **oauthSourceRequest** | [**OAuthSourceRequest**](OAuthSourceRequest.md)|  |

### Return type

[**OAuthSource**](OAuthSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesOauthUsedByList"></a>
# **sourcesOauthUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; sourcesOauthUsedByList(slug)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.sourcesOauthUsedByList(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesOauthUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesOauthUsedByList")
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

<a name="sourcesPlexCreate"></a>
# **sourcesPlexCreate**
> PlexSource sourcesPlexCreate(plexSourceRequest)



Plex source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val plexSourceRequest : PlexSourceRequest =  // PlexSourceRequest | 
try {
    val result : PlexSource = apiInstance.sourcesPlexCreate(plexSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesPlexCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesPlexCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plexSourceRequest** | [**PlexSourceRequest**](PlexSourceRequest.md)|  |

### Return type

[**PlexSource**](PlexSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesPlexDestroy"></a>
# **sourcesPlexDestroy**
> sourcesPlexDestroy(slug)



Plex source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    apiInstance.sourcesPlexDestroy(slug)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesPlexDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesPlexDestroy")
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

<a name="sourcesPlexList"></a>
# **sourcesPlexList**
> PaginatedPlexSourceList sourcesPlexList(allowFriends, authenticationFlow, clientId, enabled, enrollmentFlow, name, ordering, page, pageSize, policyEngineMode, search, slug, userMatchingMode)



Plex source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val allowFriends : kotlin.Boolean = true // kotlin.Boolean | 
val authenticationFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val clientId : kotlin.String = clientId_example // kotlin.String | 
val enabled : kotlin.Boolean = true // kotlin.Boolean | 
val enrollmentFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policyEngineMode : kotlin.String = policyEngineMode_example // kotlin.String | * `all` - all, all policies must pass * `any` - any, any policy must pass
val search : kotlin.String = search_example // kotlin.String | A search term.
val slug : kotlin.String = slug_example // kotlin.String | 
val userMatchingMode : kotlin.String = userMatchingMode_example // kotlin.String | How the source determines if an existing user should be authenticated or a new user enrolled.  * `identifier` - Use the source-specific identifier * `email_link` - Link to a user with identical email address. Can have security implications when a source doesn't validate email addresses. * `email_deny` - Use the user's email address, but deny enrollment when the email address already exists. * `username_link` - Link to a user with identical username. Can have security implications when a username is used with another source. * `username_deny` - Use the user's username, but deny enrollment when the username already exists.
try {
    val result : PaginatedPlexSourceList = apiInstance.sourcesPlexList(allowFriends, authenticationFlow, clientId, enabled, enrollmentFlow, name, ordering, page, pageSize, policyEngineMode, search, slug, userMatchingMode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesPlexList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesPlexList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowFriends** | **kotlin.Boolean**|  | [optional]
 **authenticationFlow** | **java.util.UUID**|  | [optional]
 **clientId** | **kotlin.String**|  | [optional]
 **enabled** | **kotlin.Boolean**|  | [optional]
 **enrollmentFlow** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policyEngineMode** | **kotlin.String**| * &#x60;all&#x60; - all, all policies must pass * &#x60;any&#x60; - any, any policy must pass | [optional] [enum: all, any]
 **search** | **kotlin.String**| A search term. | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **userMatchingMode** | **kotlin.String**| How the source determines if an existing user should be authenticated or a new user enrolled.  * &#x60;identifier&#x60; - Use the source-specific identifier * &#x60;email_link&#x60; - Link to a user with identical email address. Can have security implications when a source doesn&#39;t validate email addresses. * &#x60;email_deny&#x60; - Use the user&#39;s email address, but deny enrollment when the email address already exists. * &#x60;username_link&#x60; - Link to a user with identical username. Can have security implications when a username is used with another source. * &#x60;username_deny&#x60; - Use the user&#39;s username, but deny enrollment when the username already exists. | [optional] [enum: email_deny, email_link, identifier, username_deny, username_link]

### Return type

[**PaginatedPlexSourceList**](PaginatedPlexSourceList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesPlexPartialUpdate"></a>
# **sourcesPlexPartialUpdate**
> PlexSource sourcesPlexPartialUpdate(slug, patchedPlexSourceRequest)



Plex source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val patchedPlexSourceRequest : PatchedPlexSourceRequest =  // PatchedPlexSourceRequest | 
try {
    val result : PlexSource = apiInstance.sourcesPlexPartialUpdate(slug, patchedPlexSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesPlexPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesPlexPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **patchedPlexSourceRequest** | [**PatchedPlexSourceRequest**](PatchedPlexSourceRequest.md)|  | [optional]

### Return type

[**PlexSource**](PlexSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesPlexRedeemTokenAuthenticatedCreate"></a>
# **sourcesPlexRedeemTokenAuthenticatedCreate**
> sourcesPlexRedeemTokenAuthenticatedCreate(plexTokenRedeemRequest, slug)



Redeem a plex token for an authenticated user, creating a connection

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val plexTokenRedeemRequest : PlexTokenRedeemRequest =  // PlexTokenRedeemRequest | 
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    apiInstance.sourcesPlexRedeemTokenAuthenticatedCreate(plexTokenRedeemRequest, slug)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesPlexRedeemTokenAuthenticatedCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesPlexRedeemTokenAuthenticatedCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plexTokenRedeemRequest** | [**PlexTokenRedeemRequest**](PlexTokenRedeemRequest.md)|  |
 **slug** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sourcesPlexRedeemTokenCreate"></a>
# **sourcesPlexRedeemTokenCreate**
> RedirectChallenge sourcesPlexRedeemTokenCreate(plexTokenRedeemRequest, slug)



Redeem a plex token, check it&#39;s access to resources against what&#39;s allowed for the source, and redirect to an authentication/enrollment flow.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val plexTokenRedeemRequest : PlexTokenRedeemRequest =  // PlexTokenRedeemRequest | 
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : RedirectChallenge = apiInstance.sourcesPlexRedeemTokenCreate(plexTokenRedeemRequest, slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesPlexRedeemTokenCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesPlexRedeemTokenCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plexTokenRedeemRequest** | [**PlexTokenRedeemRequest**](PlexTokenRedeemRequest.md)|  |
 **slug** | **kotlin.String**|  | [optional]

### Return type

[**RedirectChallenge**](RedirectChallenge.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesPlexRetrieve"></a>
# **sourcesPlexRetrieve**
> PlexSource sourcesPlexRetrieve(slug)



Plex source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : PlexSource = apiInstance.sourcesPlexRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesPlexRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesPlexRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**PlexSource**](PlexSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesPlexUpdate"></a>
# **sourcesPlexUpdate**
> PlexSource sourcesPlexUpdate(slug, plexSourceRequest)



Plex source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val plexSourceRequest : PlexSourceRequest =  // PlexSourceRequest | 
try {
    val result : PlexSource = apiInstance.sourcesPlexUpdate(slug, plexSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesPlexUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesPlexUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **plexSourceRequest** | [**PlexSourceRequest**](PlexSourceRequest.md)|  |

### Return type

[**PlexSource**](PlexSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesPlexUsedByList"></a>
# **sourcesPlexUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; sourcesPlexUsedByList(slug)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.sourcesPlexUsedByList(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesPlexUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesPlexUsedByList")
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

<a name="sourcesSamlCreate"></a>
# **sourcesSamlCreate**
> SAMLSource sourcesSamlCreate(saMLSourceRequest)



SAMLSource Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val saMLSourceRequest : SAMLSourceRequest =  // SAMLSourceRequest | 
try {
    val result : SAMLSource = apiInstance.sourcesSamlCreate(saMLSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesSamlCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesSamlCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saMLSourceRequest** | [**SAMLSourceRequest**](SAMLSourceRequest.md)|  |

### Return type

[**SAMLSource**](SAMLSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesSamlDestroy"></a>
# **sourcesSamlDestroy**
> sourcesSamlDestroy(slug)



SAMLSource Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    apiInstance.sourcesSamlDestroy(slug)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesSamlDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesSamlDestroy")
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

<a name="sourcesSamlList"></a>
# **sourcesSamlList**
> PaginatedSAMLSourceList sourcesSamlList(allowIdpInitiated, authenticationFlow, bindingType, digestAlgorithm, enabled, enrollmentFlow, issuer, managed, name, nameIdPolicy, ordering, page, pageSize, policyEngineMode, preAuthenticationFlow, search, signatureAlgorithm, signingKp, sloUrl, slug, ssoUrl, temporaryUserDeleteAfter, userMatchingMode, verificationKp)



SAMLSource Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val allowIdpInitiated : kotlin.Boolean = true // kotlin.Boolean | 
val authenticationFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val bindingType : kotlin.String = bindingType_example // kotlin.String | * `REDIRECT` - Redirect Binding * `POST` - POST Binding * `POST_AUTO` - POST Binding with auto-confirmation
val digestAlgorithm : kotlin.String = digestAlgorithm_example // kotlin.String | * `http://www.w3.org/2000/09/xmldsig#sha1` - SHA1 * `http://www.w3.org/2001/04/xmlenc#sha256` - SHA256 * `http://www.w3.org/2001/04/xmldsig-more#sha384` - SHA384 * `http://www.w3.org/2001/04/xmlenc#sha512` - SHA512
val enabled : kotlin.Boolean = true // kotlin.Boolean | 
val enrollmentFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val issuer : kotlin.String = issuer_example // kotlin.String | 
val managed : kotlin.String = managed_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val nameIdPolicy : kotlin.String = nameIdPolicy_example // kotlin.String | NameID Policy sent to the IdP. Can be unset, in which case no Policy is sent.  * `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` - Email * `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` - Persistent * `urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName` - X509 * `urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName` - Windows * `urn:oasis:names:tc:SAML:2.0:nameid-format:transient` - Transient
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policyEngineMode : kotlin.String = policyEngineMode_example // kotlin.String | * `all` - all, all policies must pass * `any` - any, any policy must pass
val preAuthenticationFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val signatureAlgorithm : kotlin.String = signatureAlgorithm_example // kotlin.String | * `http://www.w3.org/2000/09/xmldsig#rsa-sha1` - RSA-SHA1 * `http://www.w3.org/2001/04/xmldsig-more#rsa-sha256` - RSA-SHA256 * `http://www.w3.org/2001/04/xmldsig-more#rsa-sha384` - RSA-SHA384 * `http://www.w3.org/2001/04/xmldsig-more#rsa-sha512` - RSA-SHA512 * `http://www.w3.org/2000/09/xmldsig#dsa-sha1` - DSA-SHA1
val signingKp : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val sloUrl : kotlin.String = sloUrl_example // kotlin.String | 
val slug : kotlin.String = slug_example // kotlin.String | 
val ssoUrl : kotlin.String = ssoUrl_example // kotlin.String | 
val temporaryUserDeleteAfter : kotlin.String = temporaryUserDeleteAfter_example // kotlin.String | 
val userMatchingMode : kotlin.String = userMatchingMode_example // kotlin.String | How the source determines if an existing user should be authenticated or a new user enrolled.  * `identifier` - Use the source-specific identifier * `email_link` - Link to a user with identical email address. Can have security implications when a source doesn't validate email addresses. * `email_deny` - Use the user's email address, but deny enrollment when the email address already exists. * `username_link` - Link to a user with identical username. Can have security implications when a username is used with another source. * `username_deny` - Use the user's username, but deny enrollment when the username already exists.
val verificationKp : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedSAMLSourceList = apiInstance.sourcesSamlList(allowIdpInitiated, authenticationFlow, bindingType, digestAlgorithm, enabled, enrollmentFlow, issuer, managed, name, nameIdPolicy, ordering, page, pageSize, policyEngineMode, preAuthenticationFlow, search, signatureAlgorithm, signingKp, sloUrl, slug, ssoUrl, temporaryUserDeleteAfter, userMatchingMode, verificationKp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesSamlList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesSamlList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowIdpInitiated** | **kotlin.Boolean**|  | [optional]
 **authenticationFlow** | **java.util.UUID**|  | [optional]
 **bindingType** | **kotlin.String**| * &#x60;REDIRECT&#x60; - Redirect Binding * &#x60;POST&#x60; - POST Binding * &#x60;POST_AUTO&#x60; - POST Binding with auto-confirmation | [optional] [enum: POST, POST_AUTO, REDIRECT]
 **digestAlgorithm** | **kotlin.String**| * &#x60;http://www.w3.org/2000/09/xmldsig#sha1&#x60; - SHA1 * &#x60;http://www.w3.org/2001/04/xmlenc#sha256&#x60; - SHA256 * &#x60;http://www.w3.org/2001/04/xmldsig-more#sha384&#x60; - SHA384 * &#x60;http://www.w3.org/2001/04/xmlenc#sha512&#x60; - SHA512 | [optional] [enum: http://www.w3.org/2000/09/xmldsig#sha1, http://www.w3.org/2001/04/xmldsig-more#sha384, http://www.w3.org/2001/04/xmlenc#sha256, http://www.w3.org/2001/04/xmlenc#sha512]
 **enabled** | **kotlin.Boolean**|  | [optional]
 **enrollmentFlow** | **java.util.UUID**|  | [optional]
 **issuer** | **kotlin.String**|  | [optional]
 **managed** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **nameIdPolicy** | **kotlin.String**| NameID Policy sent to the IdP. Can be unset, in which case no Policy is sent.  * &#x60;urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress&#x60; - Email * &#x60;urn:oasis:names:tc:SAML:2.0:nameid-format:persistent&#x60; - Persistent * &#x60;urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName&#x60; - X509 * &#x60;urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName&#x60; - Windows * &#x60;urn:oasis:names:tc:SAML:2.0:nameid-format:transient&#x60; - Transient | [optional] [enum: urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress, urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName, urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName, urn:oasis:names:tc:SAML:2.0:nameid-format:persistent, urn:oasis:names:tc:SAML:2.0:nameid-format:transient]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policyEngineMode** | **kotlin.String**| * &#x60;all&#x60; - all, all policies must pass * &#x60;any&#x60; - any, any policy must pass | [optional] [enum: all, any]
 **preAuthenticationFlow** | **java.util.UUID**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **signatureAlgorithm** | **kotlin.String**| * &#x60;http://www.w3.org/2000/09/xmldsig#rsa-sha1&#x60; - RSA-SHA1 * &#x60;http://www.w3.org/2001/04/xmldsig-more#rsa-sha256&#x60; - RSA-SHA256 * &#x60;http://www.w3.org/2001/04/xmldsig-more#rsa-sha384&#x60; - RSA-SHA384 * &#x60;http://www.w3.org/2001/04/xmldsig-more#rsa-sha512&#x60; - RSA-SHA512 * &#x60;http://www.w3.org/2000/09/xmldsig#dsa-sha1&#x60; - DSA-SHA1 | [optional] [enum: http://www.w3.org/2000/09/xmldsig#dsa-sha1, http://www.w3.org/2000/09/xmldsig#rsa-sha1, http://www.w3.org/2001/04/xmldsig-more#rsa-sha256, http://www.w3.org/2001/04/xmldsig-more#rsa-sha384, http://www.w3.org/2001/04/xmldsig-more#rsa-sha512]
 **signingKp** | **java.util.UUID**|  | [optional]
 **sloUrl** | **kotlin.String**|  | [optional]
 **slug** | **kotlin.String**|  | [optional]
 **ssoUrl** | **kotlin.String**|  | [optional]
 **temporaryUserDeleteAfter** | **kotlin.String**|  | [optional]
 **userMatchingMode** | **kotlin.String**| How the source determines if an existing user should be authenticated or a new user enrolled.  * &#x60;identifier&#x60; - Use the source-specific identifier * &#x60;email_link&#x60; - Link to a user with identical email address. Can have security implications when a source doesn&#39;t validate email addresses. * &#x60;email_deny&#x60; - Use the user&#39;s email address, but deny enrollment when the email address already exists. * &#x60;username_link&#x60; - Link to a user with identical username. Can have security implications when a username is used with another source. * &#x60;username_deny&#x60; - Use the user&#39;s username, but deny enrollment when the username already exists. | [optional] [enum: email_deny, email_link, identifier, username_deny, username_link]
 **verificationKp** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedSAMLSourceList**](PaginatedSAMLSourceList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesSamlMetadataRetrieve"></a>
# **sourcesSamlMetadataRetrieve**
> SAMLMetadata sourcesSamlMetadataRetrieve(slug)



Return metadata as XML string

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : SAMLMetadata = apiInstance.sourcesSamlMetadataRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesSamlMetadataRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesSamlMetadataRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**SAMLMetadata**](SAMLMetadata.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesSamlPartialUpdate"></a>
# **sourcesSamlPartialUpdate**
> SAMLSource sourcesSamlPartialUpdate(slug, patchedSAMLSourceRequest)



SAMLSource Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val patchedSAMLSourceRequest : PatchedSAMLSourceRequest =  // PatchedSAMLSourceRequest | 
try {
    val result : SAMLSource = apiInstance.sourcesSamlPartialUpdate(slug, patchedSAMLSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesSamlPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesSamlPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **patchedSAMLSourceRequest** | [**PatchedSAMLSourceRequest**](PatchedSAMLSourceRequest.md)|  | [optional]

### Return type

[**SAMLSource**](SAMLSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesSamlRetrieve"></a>
# **sourcesSamlRetrieve**
> SAMLSource sourcesSamlRetrieve(slug)



SAMLSource Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : SAMLSource = apiInstance.sourcesSamlRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesSamlRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesSamlRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**SAMLSource**](SAMLSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesSamlUpdate"></a>
# **sourcesSamlUpdate**
> SAMLSource sourcesSamlUpdate(slug, saMLSourceRequest)



SAMLSource Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val saMLSourceRequest : SAMLSourceRequest =  // SAMLSourceRequest | 
try {
    val result : SAMLSource = apiInstance.sourcesSamlUpdate(slug, saMLSourceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesSamlUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesSamlUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **saMLSourceRequest** | [**SAMLSourceRequest**](SAMLSourceRequest.md)|  |

### Return type

[**SAMLSource**](SAMLSource.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesSamlUsedByList"></a>
# **sourcesSamlUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; sourcesSamlUsedByList(slug)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.sourcesSamlUsedByList(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesSamlUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesSamlUsedByList")
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

<a name="sourcesUserConnectionsAllDestroy"></a>
# **sourcesUserConnectionsAllDestroy**
> sourcesUserConnectionsAllDestroy(id)



User-source connection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this user source connection.
try {
    apiInstance.sourcesUserConnectionsAllDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsAllDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsAllDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this user source connection. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsAllList"></a>
# **sourcesUserConnectionsAllList**
> PaginatedUserSourceConnectionList sourcesUserConnectionsAllList(ordering, page, pageSize, search, user)



User-source connection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val user : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedUserSourceConnectionList = apiInstance.sourcesUserConnectionsAllList(ordering, page, pageSize, search, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsAllList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsAllList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **user** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedUserSourceConnectionList**](PaginatedUserSourceConnectionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsAllPartialUpdate"></a>
# **sourcesUserConnectionsAllPartialUpdate**
> UserSourceConnection sourcesUserConnectionsAllPartialUpdate(id)



User-source connection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this user source connection.
try {
    val result : UserSourceConnection = apiInstance.sourcesUserConnectionsAllPartialUpdate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsAllPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsAllPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this user source connection. |

### Return type

[**UserSourceConnection**](UserSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsAllRetrieve"></a>
# **sourcesUserConnectionsAllRetrieve**
> UserSourceConnection sourcesUserConnectionsAllRetrieve(id)



User-source connection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this user source connection.
try {
    val result : UserSourceConnection = apiInstance.sourcesUserConnectionsAllRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsAllRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsAllRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this user source connection. |

### Return type

[**UserSourceConnection**](UserSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsAllUpdate"></a>
# **sourcesUserConnectionsAllUpdate**
> UserSourceConnection sourcesUserConnectionsAllUpdate(id)



User-source connection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this user source connection.
try {
    val result : UserSourceConnection = apiInstance.sourcesUserConnectionsAllUpdate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsAllUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsAllUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this user source connection. |

### Return type

[**UserSourceConnection**](UserSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsAllUsedByList"></a>
# **sourcesUserConnectionsAllUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; sourcesUserConnectionsAllUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this user source connection.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.sourcesUserConnectionsAllUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsAllUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsAllUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this user source connection. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsOauthCreate"></a>
# **sourcesUserConnectionsOauthCreate**
> UserOAuthSourceConnection sourcesUserConnectionsOauthCreate(userOAuthSourceConnectionRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val userOAuthSourceConnectionRequest : UserOAuthSourceConnectionRequest =  // UserOAuthSourceConnectionRequest | 
try {
    val result : UserOAuthSourceConnection = apiInstance.sourcesUserConnectionsOauthCreate(userOAuthSourceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsOauthCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsOauthCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userOAuthSourceConnectionRequest** | [**UserOAuthSourceConnectionRequest**](UserOAuthSourceConnectionRequest.md)|  |

### Return type

[**UserOAuthSourceConnection**](UserOAuthSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesUserConnectionsOauthDestroy"></a>
# **sourcesUserConnectionsOauthDestroy**
> sourcesUserConnectionsOauthDestroy(id)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User OAuth Source Connection.
try {
    apiInstance.sourcesUserConnectionsOauthDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsOauthDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsOauthDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User OAuth Source Connection. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsOauthList"></a>
# **sourcesUserConnectionsOauthList**
> PaginatedUserOAuthSourceConnectionList sourcesUserConnectionsOauthList(ordering, page, pageSize, search, sourceSlug)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val sourceSlug : kotlin.String = sourceSlug_example // kotlin.String | 
try {
    val result : PaginatedUserOAuthSourceConnectionList = apiInstance.sourcesUserConnectionsOauthList(ordering, page, pageSize, search, sourceSlug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsOauthList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsOauthList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **sourceSlug** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedUserOAuthSourceConnectionList**](PaginatedUserOAuthSourceConnectionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsOauthPartialUpdate"></a>
# **sourcesUserConnectionsOauthPartialUpdate**
> UserOAuthSourceConnection sourcesUserConnectionsOauthPartialUpdate(id, patchedUserOAuthSourceConnectionRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User OAuth Source Connection.
val patchedUserOAuthSourceConnectionRequest : PatchedUserOAuthSourceConnectionRequest =  // PatchedUserOAuthSourceConnectionRequest | 
try {
    val result : UserOAuthSourceConnection = apiInstance.sourcesUserConnectionsOauthPartialUpdate(id, patchedUserOAuthSourceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsOauthPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsOauthPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User OAuth Source Connection. |
 **patchedUserOAuthSourceConnectionRequest** | [**PatchedUserOAuthSourceConnectionRequest**](PatchedUserOAuthSourceConnectionRequest.md)|  | [optional]

### Return type

[**UserOAuthSourceConnection**](UserOAuthSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesUserConnectionsOauthRetrieve"></a>
# **sourcesUserConnectionsOauthRetrieve**
> UserOAuthSourceConnection sourcesUserConnectionsOauthRetrieve(id)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User OAuth Source Connection.
try {
    val result : UserOAuthSourceConnection = apiInstance.sourcesUserConnectionsOauthRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsOauthRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsOauthRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User OAuth Source Connection. |

### Return type

[**UserOAuthSourceConnection**](UserOAuthSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsOauthUpdate"></a>
# **sourcesUserConnectionsOauthUpdate**
> UserOAuthSourceConnection sourcesUserConnectionsOauthUpdate(id, userOAuthSourceConnectionRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User OAuth Source Connection.
val userOAuthSourceConnectionRequest : UserOAuthSourceConnectionRequest =  // UserOAuthSourceConnectionRequest | 
try {
    val result : UserOAuthSourceConnection = apiInstance.sourcesUserConnectionsOauthUpdate(id, userOAuthSourceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsOauthUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsOauthUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User OAuth Source Connection. |
 **userOAuthSourceConnectionRequest** | [**UserOAuthSourceConnectionRequest**](UserOAuthSourceConnectionRequest.md)|  |

### Return type

[**UserOAuthSourceConnection**](UserOAuthSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesUserConnectionsOauthUsedByList"></a>
# **sourcesUserConnectionsOauthUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; sourcesUserConnectionsOauthUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User OAuth Source Connection.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.sourcesUserConnectionsOauthUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsOauthUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsOauthUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User OAuth Source Connection. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsPlexCreate"></a>
# **sourcesUserConnectionsPlexCreate**
> PlexSourceConnection sourcesUserConnectionsPlexCreate(plexSourceConnectionRequest)



Plex Source connection Serializer

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val plexSourceConnectionRequest : PlexSourceConnectionRequest =  // PlexSourceConnectionRequest | 
try {
    val result : PlexSourceConnection = apiInstance.sourcesUserConnectionsPlexCreate(plexSourceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsPlexCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsPlexCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plexSourceConnectionRequest** | [**PlexSourceConnectionRequest**](PlexSourceConnectionRequest.md)|  |

### Return type

[**PlexSourceConnection**](PlexSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesUserConnectionsPlexDestroy"></a>
# **sourcesUserConnectionsPlexDestroy**
> sourcesUserConnectionsPlexDestroy(id)



Plex Source connection Serializer

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User Plex Source Connection.
try {
    apiInstance.sourcesUserConnectionsPlexDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsPlexDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsPlexDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User Plex Source Connection. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsPlexList"></a>
# **sourcesUserConnectionsPlexList**
> PaginatedPlexSourceConnectionList sourcesUserConnectionsPlexList(ordering, page, pageSize, search, sourceSlug)



Plex Source connection Serializer

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val sourceSlug : kotlin.String = sourceSlug_example // kotlin.String | 
try {
    val result : PaginatedPlexSourceConnectionList = apiInstance.sourcesUserConnectionsPlexList(ordering, page, pageSize, search, sourceSlug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsPlexList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsPlexList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **sourceSlug** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedPlexSourceConnectionList**](PaginatedPlexSourceConnectionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsPlexPartialUpdate"></a>
# **sourcesUserConnectionsPlexPartialUpdate**
> PlexSourceConnection sourcesUserConnectionsPlexPartialUpdate(id, patchedPlexSourceConnectionRequest)



Plex Source connection Serializer

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User Plex Source Connection.
val patchedPlexSourceConnectionRequest : PatchedPlexSourceConnectionRequest =  // PatchedPlexSourceConnectionRequest | 
try {
    val result : PlexSourceConnection = apiInstance.sourcesUserConnectionsPlexPartialUpdate(id, patchedPlexSourceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsPlexPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsPlexPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User Plex Source Connection. |
 **patchedPlexSourceConnectionRequest** | [**PatchedPlexSourceConnectionRequest**](PatchedPlexSourceConnectionRequest.md)|  | [optional]

### Return type

[**PlexSourceConnection**](PlexSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesUserConnectionsPlexRetrieve"></a>
# **sourcesUserConnectionsPlexRetrieve**
> PlexSourceConnection sourcesUserConnectionsPlexRetrieve(id)



Plex Source connection Serializer

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User Plex Source Connection.
try {
    val result : PlexSourceConnection = apiInstance.sourcesUserConnectionsPlexRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsPlexRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsPlexRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User Plex Source Connection. |

### Return type

[**PlexSourceConnection**](PlexSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsPlexUpdate"></a>
# **sourcesUserConnectionsPlexUpdate**
> PlexSourceConnection sourcesUserConnectionsPlexUpdate(id, plexSourceConnectionRequest)



Plex Source connection Serializer

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User Plex Source Connection.
val plexSourceConnectionRequest : PlexSourceConnectionRequest =  // PlexSourceConnectionRequest | 
try {
    val result : PlexSourceConnection = apiInstance.sourcesUserConnectionsPlexUpdate(id, plexSourceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsPlexUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsPlexUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User Plex Source Connection. |
 **plexSourceConnectionRequest** | [**PlexSourceConnectionRequest**](PlexSourceConnectionRequest.md)|  |

### Return type

[**PlexSourceConnection**](PlexSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesUserConnectionsPlexUsedByList"></a>
# **sourcesUserConnectionsPlexUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; sourcesUserConnectionsPlexUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User Plex Source Connection.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.sourcesUserConnectionsPlexUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsPlexUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsPlexUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User Plex Source Connection. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsSamlCreate"></a>
# **sourcesUserConnectionsSamlCreate**
> UserSAMLSourceConnection sourcesUserConnectionsSamlCreate(userSAMLSourceConnectionRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val userSAMLSourceConnectionRequest : UserSAMLSourceConnectionRequest =  // UserSAMLSourceConnectionRequest | 
try {
    val result : UserSAMLSourceConnection = apiInstance.sourcesUserConnectionsSamlCreate(userSAMLSourceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsSamlCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsSamlCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userSAMLSourceConnectionRequest** | [**UserSAMLSourceConnectionRequest**](UserSAMLSourceConnectionRequest.md)|  |

### Return type

[**UserSAMLSourceConnection**](UserSAMLSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesUserConnectionsSamlDestroy"></a>
# **sourcesUserConnectionsSamlDestroy**
> sourcesUserConnectionsSamlDestroy(id)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User SAML Source Connection.
try {
    apiInstance.sourcesUserConnectionsSamlDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsSamlDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsSamlDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User SAML Source Connection. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsSamlList"></a>
# **sourcesUserConnectionsSamlList**
> PaginatedUserSAMLSourceConnectionList sourcesUserConnectionsSamlList(ordering, page, pageSize, search, sourceSlug)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val sourceSlug : kotlin.String = sourceSlug_example // kotlin.String | 
try {
    val result : PaginatedUserSAMLSourceConnectionList = apiInstance.sourcesUserConnectionsSamlList(ordering, page, pageSize, search, sourceSlug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsSamlList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsSamlList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **sourceSlug** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedUserSAMLSourceConnectionList**](PaginatedUserSAMLSourceConnectionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsSamlPartialUpdate"></a>
# **sourcesUserConnectionsSamlPartialUpdate**
> UserSAMLSourceConnection sourcesUserConnectionsSamlPartialUpdate(id, patchedUserSAMLSourceConnectionRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User SAML Source Connection.
val patchedUserSAMLSourceConnectionRequest : PatchedUserSAMLSourceConnectionRequest =  // PatchedUserSAMLSourceConnectionRequest | 
try {
    val result : UserSAMLSourceConnection = apiInstance.sourcesUserConnectionsSamlPartialUpdate(id, patchedUserSAMLSourceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsSamlPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsSamlPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User SAML Source Connection. |
 **patchedUserSAMLSourceConnectionRequest** | [**PatchedUserSAMLSourceConnectionRequest**](PatchedUserSAMLSourceConnectionRequest.md)|  | [optional]

### Return type

[**UserSAMLSourceConnection**](UserSAMLSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesUserConnectionsSamlRetrieve"></a>
# **sourcesUserConnectionsSamlRetrieve**
> UserSAMLSourceConnection sourcesUserConnectionsSamlRetrieve(id)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User SAML Source Connection.
try {
    val result : UserSAMLSourceConnection = apiInstance.sourcesUserConnectionsSamlRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsSamlRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsSamlRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User SAML Source Connection. |

### Return type

[**UserSAMLSourceConnection**](UserSAMLSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sourcesUserConnectionsSamlUpdate"></a>
# **sourcesUserConnectionsSamlUpdate**
> UserSAMLSourceConnection sourcesUserConnectionsSamlUpdate(id, userSAMLSourceConnectionRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User SAML Source Connection.
val userSAMLSourceConnectionRequest : UserSAMLSourceConnectionRequest =  // UserSAMLSourceConnectionRequest | 
try {
    val result : UserSAMLSourceConnection = apiInstance.sourcesUserConnectionsSamlUpdate(id, userSAMLSourceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsSamlUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsSamlUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User SAML Source Connection. |
 **userSAMLSourceConnectionRequest** | [**UserSAMLSourceConnectionRequest**](UserSAMLSourceConnectionRequest.md)|  |

### Return type

[**UserSAMLSourceConnection**](UserSAMLSourceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sourcesUserConnectionsSamlUsedByList"></a>
# **sourcesUserConnectionsSamlUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; sourcesUserConnectionsSamlUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SourcesApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this User SAML Source Connection.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.sourcesUserConnectionsSamlUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcesApi#sourcesUserConnectionsSamlUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcesApi#sourcesUserConnectionsSamlUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this User SAML Source Connection. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

