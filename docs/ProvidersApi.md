# ProvidersApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**providersAllDestroy**](ProvidersApi.md#providersAllDestroy) | **DELETE** /providers/all/{id}/ | 
[**providersAllList**](ProvidersApi.md#providersAllList) | **GET** /providers/all/ | 
[**providersAllRetrieve**](ProvidersApi.md#providersAllRetrieve) | **GET** /providers/all/{id}/ | 
[**providersAllTypesList**](ProvidersApi.md#providersAllTypesList) | **GET** /providers/all/types/ | 
[**providersAllUsedByList**](ProvidersApi.md#providersAllUsedByList) | **GET** /providers/all/{id}/used_by/ | 
[**providersLdapCreate**](ProvidersApi.md#providersLdapCreate) | **POST** /providers/ldap/ | 
[**providersLdapDestroy**](ProvidersApi.md#providersLdapDestroy) | **DELETE** /providers/ldap/{id}/ | 
[**providersLdapList**](ProvidersApi.md#providersLdapList) | **GET** /providers/ldap/ | 
[**providersLdapPartialUpdate**](ProvidersApi.md#providersLdapPartialUpdate) | **PATCH** /providers/ldap/{id}/ | 
[**providersLdapRetrieve**](ProvidersApi.md#providersLdapRetrieve) | **GET** /providers/ldap/{id}/ | 
[**providersLdapUpdate**](ProvidersApi.md#providersLdapUpdate) | **PUT** /providers/ldap/{id}/ | 
[**providersLdapUsedByList**](ProvidersApi.md#providersLdapUsedByList) | **GET** /providers/ldap/{id}/used_by/ | 
[**providersOauth2Create**](ProvidersApi.md#providersOauth2Create) | **POST** /providers/oauth2/ | 
[**providersOauth2Destroy**](ProvidersApi.md#providersOauth2Destroy) | **DELETE** /providers/oauth2/{id}/ | 
[**providersOauth2List**](ProvidersApi.md#providersOauth2List) | **GET** /providers/oauth2/ | 
[**providersOauth2PartialUpdate**](ProvidersApi.md#providersOauth2PartialUpdate) | **PATCH** /providers/oauth2/{id}/ | 
[**providersOauth2PreviewUserRetrieve**](ProvidersApi.md#providersOauth2PreviewUserRetrieve) | **GET** /providers/oauth2/{id}/preview_user/ | 
[**providersOauth2Retrieve**](ProvidersApi.md#providersOauth2Retrieve) | **GET** /providers/oauth2/{id}/ | 
[**providersOauth2SetupUrlsRetrieve**](ProvidersApi.md#providersOauth2SetupUrlsRetrieve) | **GET** /providers/oauth2/{id}/setup_urls/ | 
[**providersOauth2Update**](ProvidersApi.md#providersOauth2Update) | **PUT** /providers/oauth2/{id}/ | 
[**providersOauth2UsedByList**](ProvidersApi.md#providersOauth2UsedByList) | **GET** /providers/oauth2/{id}/used_by/ | 
[**providersProxyCreate**](ProvidersApi.md#providersProxyCreate) | **POST** /providers/proxy/ | 
[**providersProxyDestroy**](ProvidersApi.md#providersProxyDestroy) | **DELETE** /providers/proxy/{id}/ | 
[**providersProxyList**](ProvidersApi.md#providersProxyList) | **GET** /providers/proxy/ | 
[**providersProxyPartialUpdate**](ProvidersApi.md#providersProxyPartialUpdate) | **PATCH** /providers/proxy/{id}/ | 
[**providersProxyRetrieve**](ProvidersApi.md#providersProxyRetrieve) | **GET** /providers/proxy/{id}/ | 
[**providersProxyUpdate**](ProvidersApi.md#providersProxyUpdate) | **PUT** /providers/proxy/{id}/ | 
[**providersProxyUsedByList**](ProvidersApi.md#providersProxyUsedByList) | **GET** /providers/proxy/{id}/used_by/ | 
[**providersRadiusCreate**](ProvidersApi.md#providersRadiusCreate) | **POST** /providers/radius/ | 
[**providersRadiusDestroy**](ProvidersApi.md#providersRadiusDestroy) | **DELETE** /providers/radius/{id}/ | 
[**providersRadiusList**](ProvidersApi.md#providersRadiusList) | **GET** /providers/radius/ | 
[**providersRadiusPartialUpdate**](ProvidersApi.md#providersRadiusPartialUpdate) | **PATCH** /providers/radius/{id}/ | 
[**providersRadiusRetrieve**](ProvidersApi.md#providersRadiusRetrieve) | **GET** /providers/radius/{id}/ | 
[**providersRadiusUpdate**](ProvidersApi.md#providersRadiusUpdate) | **PUT** /providers/radius/{id}/ | 
[**providersRadiusUsedByList**](ProvidersApi.md#providersRadiusUsedByList) | **GET** /providers/radius/{id}/used_by/ | 
[**providersSamlCreate**](ProvidersApi.md#providersSamlCreate) | **POST** /providers/saml/ | 
[**providersSamlDestroy**](ProvidersApi.md#providersSamlDestroy) | **DELETE** /providers/saml/{id}/ | 
[**providersSamlImportMetadataCreate**](ProvidersApi.md#providersSamlImportMetadataCreate) | **POST** /providers/saml/import_metadata/ | 
[**providersSamlList**](ProvidersApi.md#providersSamlList) | **GET** /providers/saml/ | 
[**providersSamlMetadataRetrieve**](ProvidersApi.md#providersSamlMetadataRetrieve) | **GET** /providers/saml/{id}/metadata/ | 
[**providersSamlPartialUpdate**](ProvidersApi.md#providersSamlPartialUpdate) | **PATCH** /providers/saml/{id}/ | 
[**providersSamlPreviewUserRetrieve**](ProvidersApi.md#providersSamlPreviewUserRetrieve) | **GET** /providers/saml/{id}/preview_user/ | 
[**providersSamlRetrieve**](ProvidersApi.md#providersSamlRetrieve) | **GET** /providers/saml/{id}/ | 
[**providersSamlUpdate**](ProvidersApi.md#providersSamlUpdate) | **PUT** /providers/saml/{id}/ | 
[**providersSamlUsedByList**](ProvidersApi.md#providersSamlUsedByList) | **GET** /providers/saml/{id}/used_by/ | 
[**providersScimCreate**](ProvidersApi.md#providersScimCreate) | **POST** /providers/scim/ | 
[**providersScimDestroy**](ProvidersApi.md#providersScimDestroy) | **DELETE** /providers/scim/{id}/ | 
[**providersScimList**](ProvidersApi.md#providersScimList) | **GET** /providers/scim/ | 
[**providersScimPartialUpdate**](ProvidersApi.md#providersScimPartialUpdate) | **PATCH** /providers/scim/{id}/ | 
[**providersScimRetrieve**](ProvidersApi.md#providersScimRetrieve) | **GET** /providers/scim/{id}/ | 
[**providersScimSyncStatusRetrieve**](ProvidersApi.md#providersScimSyncStatusRetrieve) | **GET** /providers/scim/{id}/sync_status/ | 
[**providersScimUpdate**](ProvidersApi.md#providersScimUpdate) | **PUT** /providers/scim/{id}/ | 
[**providersScimUsedByList**](ProvidersApi.md#providersScimUsedByList) | **GET** /providers/scim/{id}/used_by/ | 


<a id="providersAllDestroy"></a>
# **providersAllDestroy**
> providersAllDestroy(id)



Provider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this provider.
try {
    apiInstance.providersAllDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersAllDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersAllDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this provider. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersAllList"></a>
# **providersAllList**
> PaginatedProviderList providersAllList(applicationIsnull, backchannelOnly, ordering, page, pageSize, search)



Provider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val applicationIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val backchannelOnly : kotlin.Boolean = true // kotlin.Boolean | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedProviderList = apiInstance.providersAllList(applicationIsnull, backchannelOnly, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersAllList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersAllList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationIsnull** | **kotlin.Boolean**|  | [optional]
 **backchannelOnly** | **kotlin.Boolean**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedProviderList**](PaginatedProviderList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersAllRetrieve"></a>
# **providersAllRetrieve**
> Provider providersAllRetrieve(id)



Provider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this provider.
try {
    val result : Provider = apiInstance.providersAllRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersAllRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersAllRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this provider. |

### Return type

[**Provider**](Provider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersAllTypesList"></a>
# **providersAllTypesList**
> kotlin.collections.List&lt;TypeCreate&gt; providersAllTypesList()



Get all creatable provider types

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
try {
    val result : kotlin.collections.List<TypeCreate> = apiInstance.providersAllTypesList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersAllTypesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersAllTypesList")
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

<a id="providersAllUsedByList"></a>
# **providersAllUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; providersAllUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this provider.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.providersAllUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersAllUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersAllUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this provider. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersLdapCreate"></a>
# **providersLdapCreate**
> LDAPProvider providersLdapCreate(ldAPProviderRequest)



LDAPProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val ldAPProviderRequest : LDAPProviderRequest =  // LDAPProviderRequest | 
try {
    val result : LDAPProvider = apiInstance.providersLdapCreate(ldAPProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersLdapCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersLdapCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ldAPProviderRequest** | [**LDAPProviderRequest**](LDAPProviderRequest.md)|  |

### Return type

[**LDAPProvider**](LDAPProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersLdapDestroy"></a>
# **providersLdapDestroy**
> providersLdapDestroy(id)



LDAPProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this LDAP Provider.
try {
    apiInstance.providersLdapDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersLdapDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersLdapDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this LDAP Provider. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersLdapList"></a>
# **providersLdapList**
> PaginatedLDAPProviderList providersLdapList(applicationIsnull, authorizationFlowSlugIexact, baseDnIexact, certificateKpUuidIexact, certificateNameIexact, gidStartNumberIexact, nameIexact, ordering, page, pageSize, search, searchGroupGroupUuidIexact, searchGroupNameIexact, tlsServerNameIexact, uidStartNumberIexact)



LDAPProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val applicationIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val authorizationFlowSlugIexact : kotlin.String = authorizationFlowSlugIexact_example // kotlin.String | 
val baseDnIexact : kotlin.String = baseDnIexact_example // kotlin.String | 
val certificateKpUuidIexact : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificateNameIexact : kotlin.String = certificateNameIexact_example // kotlin.String | 
val gidStartNumberIexact : kotlin.Int = 56 // kotlin.Int | 
val nameIexact : kotlin.String = nameIexact_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val searchGroupGroupUuidIexact : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val searchGroupNameIexact : kotlin.String = searchGroupNameIexact_example // kotlin.String | 
val tlsServerNameIexact : kotlin.String = tlsServerNameIexact_example // kotlin.String | 
val uidStartNumberIexact : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedLDAPProviderList = apiInstance.providersLdapList(applicationIsnull, authorizationFlowSlugIexact, baseDnIexact, certificateKpUuidIexact, certificateNameIexact, gidStartNumberIexact, nameIexact, ordering, page, pageSize, search, searchGroupGroupUuidIexact, searchGroupNameIexact, tlsServerNameIexact, uidStartNumberIexact)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersLdapList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersLdapList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationIsnull** | **kotlin.Boolean**|  | [optional]
 **authorizationFlowSlugIexact** | **kotlin.String**|  | [optional]
 **baseDnIexact** | **kotlin.String**|  | [optional]
 **certificateKpUuidIexact** | **java.util.UUID**|  | [optional]
 **certificateNameIexact** | **kotlin.String**|  | [optional]
 **gidStartNumberIexact** | **kotlin.Int**|  | [optional]
 **nameIexact** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **searchGroupGroupUuidIexact** | **java.util.UUID**|  | [optional]
 **searchGroupNameIexact** | **kotlin.String**|  | [optional]
 **tlsServerNameIexact** | **kotlin.String**|  | [optional]
 **uidStartNumberIexact** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedLDAPProviderList**](PaginatedLDAPProviderList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersLdapPartialUpdate"></a>
# **providersLdapPartialUpdate**
> LDAPProvider providersLdapPartialUpdate(id, patchedLDAPProviderRequest)



LDAPProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this LDAP Provider.
val patchedLDAPProviderRequest : PatchedLDAPProviderRequest =  // PatchedLDAPProviderRequest | 
try {
    val result : LDAPProvider = apiInstance.providersLdapPartialUpdate(id, patchedLDAPProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersLdapPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersLdapPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this LDAP Provider. |
 **patchedLDAPProviderRequest** | [**PatchedLDAPProviderRequest**](PatchedLDAPProviderRequest.md)|  | [optional]

### Return type

[**LDAPProvider**](LDAPProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersLdapRetrieve"></a>
# **providersLdapRetrieve**
> LDAPProvider providersLdapRetrieve(id)



LDAPProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this LDAP Provider.
try {
    val result : LDAPProvider = apiInstance.providersLdapRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersLdapRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersLdapRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this LDAP Provider. |

### Return type

[**LDAPProvider**](LDAPProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersLdapUpdate"></a>
# **providersLdapUpdate**
> LDAPProvider providersLdapUpdate(id, ldAPProviderRequest)



LDAPProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this LDAP Provider.
val ldAPProviderRequest : LDAPProviderRequest =  // LDAPProviderRequest | 
try {
    val result : LDAPProvider = apiInstance.providersLdapUpdate(id, ldAPProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersLdapUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersLdapUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this LDAP Provider. |
 **ldAPProviderRequest** | [**LDAPProviderRequest**](LDAPProviderRequest.md)|  |

### Return type

[**LDAPProvider**](LDAPProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersLdapUsedByList"></a>
# **providersLdapUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; providersLdapUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this LDAP Provider.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.providersLdapUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersLdapUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersLdapUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this LDAP Provider. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersOauth2Create"></a>
# **providersOauth2Create**
> OAuth2Provider providersOauth2Create(oauth2ProviderRequest)



OAuth2Provider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val oauth2ProviderRequest : OAuth2ProviderRequest =  // OAuth2ProviderRequest | 
try {
    val result : OAuth2Provider = apiInstance.providersOauth2Create(oauth2ProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersOauth2Create")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersOauth2Create")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauth2ProviderRequest** | [**OAuth2ProviderRequest**](OAuth2ProviderRequest.md)|  |

### Return type

[**OAuth2Provider**](OAuth2Provider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersOauth2Destroy"></a>
# **providersOauth2Destroy**
> providersOauth2Destroy(id)



OAuth2Provider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2/OpenID Provider.
try {
    apiInstance.providersOauth2Destroy(id)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersOauth2Destroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersOauth2Destroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2/OpenID Provider. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersOauth2List"></a>
# **providersOauth2List**
> PaginatedOAuth2ProviderList providersOauth2List(accessCodeValidity, accessTokenValidity, application, authorizationFlow, clientId, clientType, includeClaimsInIdToken, issuerMode, name, ordering, page, pageSize, propertyMappings, redirectUris, refreshTokenValidity, search, signingKey, subMode)



OAuth2Provider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val accessCodeValidity : kotlin.String = accessCodeValidity_example // kotlin.String | 
val accessTokenValidity : kotlin.String = accessTokenValidity_example // kotlin.String | 
val application : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val authorizationFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val clientId : kotlin.String = clientId_example // kotlin.String | 
val clientType : kotlin.String = clientType_example // kotlin.String | Confidential clients are capable of maintaining the confidentiality of their credentials. Public clients are incapable  * `confidential` - Confidential * `public` - Public
val includeClaimsInIdToken : kotlin.Boolean = true // kotlin.Boolean | 
val issuerMode : kotlin.String = issuerMode_example // kotlin.String | Configure how the issuer field of the ID Token should be filled.  * `global` - Same identifier is used for all providers * `per_provider` - Each provider has a different issuer, based on the application slug.
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val propertyMappings : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val redirectUris : kotlin.String = redirectUris_example // kotlin.String | 
val refreshTokenValidity : kotlin.String = refreshTokenValidity_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val signingKey : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val subMode : kotlin.String = subMode_example // kotlin.String | Configure what data should be used as unique User Identifier. For most cases, the default should be fine.  * `hashed_user_id` - Based on the Hashed User ID * `user_id` - Based on user ID * `user_uuid` - Based on user UUID * `user_username` - Based on the username * `user_email` - Based on the User's Email. This is recommended over the UPN method. * `user_upn` - Based on the User's UPN, only works if user has a 'upn' attribute set. Use this method only if you have different UPN and Mail domains.
try {
    val result : PaginatedOAuth2ProviderList = apiInstance.providersOauth2List(accessCodeValidity, accessTokenValidity, application, authorizationFlow, clientId, clientType, includeClaimsInIdToken, issuerMode, name, ordering, page, pageSize, propertyMappings, redirectUris, refreshTokenValidity, search, signingKey, subMode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersOauth2List")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersOauth2List")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessCodeValidity** | **kotlin.String**|  | [optional]
 **accessTokenValidity** | **kotlin.String**|  | [optional]
 **application** | **java.util.UUID**|  | [optional]
 **authorizationFlow** | **java.util.UUID**|  | [optional]
 **clientId** | **kotlin.String**|  | [optional]
 **clientType** | **kotlin.String**| Confidential clients are capable of maintaining the confidentiality of their credentials. Public clients are incapable  * &#x60;confidential&#x60; - Confidential * &#x60;public&#x60; - Public | [optional] [enum: confidential, public]
 **includeClaimsInIdToken** | **kotlin.Boolean**|  | [optional]
 **issuerMode** | **kotlin.String**| Configure how the issuer field of the ID Token should be filled.  * &#x60;global&#x60; - Same identifier is used for all providers * &#x60;per_provider&#x60; - Each provider has a different issuer, based on the application slug. | [optional] [enum: global, per_provider]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **redirectUris** | **kotlin.String**|  | [optional]
 **refreshTokenValidity** | **kotlin.String**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **signingKey** | **java.util.UUID**|  | [optional]
 **subMode** | **kotlin.String**| Configure what data should be used as unique User Identifier. For most cases, the default should be fine.  * &#x60;hashed_user_id&#x60; - Based on the Hashed User ID * &#x60;user_id&#x60; - Based on user ID * &#x60;user_uuid&#x60; - Based on user UUID * &#x60;user_username&#x60; - Based on the username * &#x60;user_email&#x60; - Based on the User&#39;s Email. This is recommended over the UPN method. * &#x60;user_upn&#x60; - Based on the User&#39;s UPN, only works if user has a &#39;upn&#39; attribute set. Use this method only if you have different UPN and Mail domains. | [optional] [enum: hashed_user_id, user_email, user_id, user_upn, user_username, user_uuid]

### Return type

[**PaginatedOAuth2ProviderList**](PaginatedOAuth2ProviderList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersOauth2PartialUpdate"></a>
# **providersOauth2PartialUpdate**
> OAuth2Provider providersOauth2PartialUpdate(id, patchedOAuth2ProviderRequest)



OAuth2Provider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2/OpenID Provider.
val patchedOAuth2ProviderRequest : PatchedOAuth2ProviderRequest =  // PatchedOAuth2ProviderRequest | 
try {
    val result : OAuth2Provider = apiInstance.providersOauth2PartialUpdate(id, patchedOAuth2ProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersOauth2PartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersOauth2PartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2/OpenID Provider. |
 **patchedOAuth2ProviderRequest** | [**PatchedOAuth2ProviderRequest**](PatchedOAuth2ProviderRequest.md)|  | [optional]

### Return type

[**OAuth2Provider**](OAuth2Provider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersOauth2PreviewUserRetrieve"></a>
# **providersOauth2PreviewUserRetrieve**
> PropertyMappingPreview providersOauth2PreviewUserRetrieve(id)



Preview user data for provider

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2/OpenID Provider.
try {
    val result : PropertyMappingPreview = apiInstance.providersOauth2PreviewUserRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersOauth2PreviewUserRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersOauth2PreviewUserRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2/OpenID Provider. |

### Return type

[**PropertyMappingPreview**](PropertyMappingPreview.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersOauth2Retrieve"></a>
# **providersOauth2Retrieve**
> OAuth2Provider providersOauth2Retrieve(id)



OAuth2Provider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2/OpenID Provider.
try {
    val result : OAuth2Provider = apiInstance.providersOauth2Retrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersOauth2Retrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersOauth2Retrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2/OpenID Provider. |

### Return type

[**OAuth2Provider**](OAuth2Provider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersOauth2SetupUrlsRetrieve"></a>
# **providersOauth2SetupUrlsRetrieve**
> OAuth2ProviderSetupURLs providersOauth2SetupUrlsRetrieve(id)



Get Providers setup URLs

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2/OpenID Provider.
try {
    val result : OAuth2ProviderSetupURLs = apiInstance.providersOauth2SetupUrlsRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersOauth2SetupUrlsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersOauth2SetupUrlsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2/OpenID Provider. |

### Return type

[**OAuth2ProviderSetupURLs**](OAuth2ProviderSetupURLs.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersOauth2Update"></a>
# **providersOauth2Update**
> OAuth2Provider providersOauth2Update(id, oauth2ProviderRequest)



OAuth2Provider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2/OpenID Provider.
val oauth2ProviderRequest : OAuth2ProviderRequest =  // OAuth2ProviderRequest | 
try {
    val result : OAuth2Provider = apiInstance.providersOauth2Update(id, oauth2ProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersOauth2Update")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersOauth2Update")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2/OpenID Provider. |
 **oauth2ProviderRequest** | [**OAuth2ProviderRequest**](OAuth2ProviderRequest.md)|  |

### Return type

[**OAuth2Provider**](OAuth2Provider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersOauth2UsedByList"></a>
# **providersOauth2UsedByList**
> kotlin.collections.List&lt;UsedBy&gt; providersOauth2UsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2/OpenID Provider.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.providersOauth2UsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersOauth2UsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersOauth2UsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2/OpenID Provider. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersProxyCreate"></a>
# **providersProxyCreate**
> ProxyProvider providersProxyCreate(proxyProviderRequest)



ProxyProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val proxyProviderRequest : ProxyProviderRequest =  // ProxyProviderRequest | 
try {
    val result : ProxyProvider = apiInstance.providersProxyCreate(proxyProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersProxyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersProxyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyProviderRequest** | [**ProxyProviderRequest**](ProxyProviderRequest.md)|  |

### Return type

[**ProxyProvider**](ProxyProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersProxyDestroy"></a>
# **providersProxyDestroy**
> providersProxyDestroy(id)



ProxyProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Proxy Provider.
try {
    apiInstance.providersProxyDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersProxyDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersProxyDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Proxy Provider. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersProxyList"></a>
# **providersProxyList**
> PaginatedProxyProviderList providersProxyList(applicationIsnull, authorizationFlowSlugIexact, basicAuthEnabledIexact, basicAuthPasswordAttributeIexact, basicAuthUserAttributeIexact, certificateKpUuidIexact, certificateNameIexact, cookieDomainIexact, externalHostIexact, internalHostIexact, internalHostSslValidationIexact, modeIexact, nameIexact, ordering, page, pageSize, propertyMappingsIexact, redirectUrisIexact, search, skipPathRegexIexact)



ProxyProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val applicationIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val authorizationFlowSlugIexact : kotlin.String = authorizationFlowSlugIexact_example // kotlin.String | 
val basicAuthEnabledIexact : kotlin.Boolean = true // kotlin.Boolean | 
val basicAuthPasswordAttributeIexact : kotlin.String = basicAuthPasswordAttributeIexact_example // kotlin.String | 
val basicAuthUserAttributeIexact : kotlin.String = basicAuthUserAttributeIexact_example // kotlin.String | 
val certificateKpUuidIexact : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val certificateNameIexact : kotlin.String = certificateNameIexact_example // kotlin.String | 
val cookieDomainIexact : kotlin.String = cookieDomainIexact_example // kotlin.String | 
val externalHostIexact : kotlin.String = externalHostIexact_example // kotlin.String | 
val internalHostIexact : kotlin.String = internalHostIexact_example // kotlin.String | 
val internalHostSslValidationIexact : kotlin.Boolean = true // kotlin.Boolean | 
val modeIexact : kotlin.String = modeIexact_example // kotlin.String | 
val nameIexact : kotlin.String = nameIexact_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val propertyMappingsIexact : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val redirectUrisIexact : kotlin.String = redirectUrisIexact_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val skipPathRegexIexact : kotlin.String = skipPathRegexIexact_example // kotlin.String | 
try {
    val result : PaginatedProxyProviderList = apiInstance.providersProxyList(applicationIsnull, authorizationFlowSlugIexact, basicAuthEnabledIexact, basicAuthPasswordAttributeIexact, basicAuthUserAttributeIexact, certificateKpUuidIexact, certificateNameIexact, cookieDomainIexact, externalHostIexact, internalHostIexact, internalHostSslValidationIexact, modeIexact, nameIexact, ordering, page, pageSize, propertyMappingsIexact, redirectUrisIexact, search, skipPathRegexIexact)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersProxyList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersProxyList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationIsnull** | **kotlin.Boolean**|  | [optional]
 **authorizationFlowSlugIexact** | **kotlin.String**|  | [optional]
 **basicAuthEnabledIexact** | **kotlin.Boolean**|  | [optional]
 **basicAuthPasswordAttributeIexact** | **kotlin.String**|  | [optional]
 **basicAuthUserAttributeIexact** | **kotlin.String**|  | [optional]
 **certificateKpUuidIexact** | **java.util.UUID**|  | [optional]
 **certificateNameIexact** | **kotlin.String**|  | [optional]
 **cookieDomainIexact** | **kotlin.String**|  | [optional]
 **externalHostIexact** | **kotlin.String**|  | [optional]
 **internalHostIexact** | **kotlin.String**|  | [optional]
 **internalHostSslValidationIexact** | **kotlin.Boolean**|  | [optional]
 **modeIexact** | **kotlin.String**|  | [optional]
 **nameIexact** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **propertyMappingsIexact** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **redirectUrisIexact** | **kotlin.String**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **skipPathRegexIexact** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedProxyProviderList**](PaginatedProxyProviderList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersProxyPartialUpdate"></a>
# **providersProxyPartialUpdate**
> ProxyProvider providersProxyPartialUpdate(id, patchedProxyProviderRequest)



ProxyProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Proxy Provider.
val patchedProxyProviderRequest : PatchedProxyProviderRequest =  // PatchedProxyProviderRequest | 
try {
    val result : ProxyProvider = apiInstance.providersProxyPartialUpdate(id, patchedProxyProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersProxyPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersProxyPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Proxy Provider. |
 **patchedProxyProviderRequest** | [**PatchedProxyProviderRequest**](PatchedProxyProviderRequest.md)|  | [optional]

### Return type

[**ProxyProvider**](ProxyProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersProxyRetrieve"></a>
# **providersProxyRetrieve**
> ProxyProvider providersProxyRetrieve(id)



ProxyProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Proxy Provider.
try {
    val result : ProxyProvider = apiInstance.providersProxyRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersProxyRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersProxyRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Proxy Provider. |

### Return type

[**ProxyProvider**](ProxyProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersProxyUpdate"></a>
# **providersProxyUpdate**
> ProxyProvider providersProxyUpdate(id, proxyProviderRequest)



ProxyProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Proxy Provider.
val proxyProviderRequest : ProxyProviderRequest =  // ProxyProviderRequest | 
try {
    val result : ProxyProvider = apiInstance.providersProxyUpdate(id, proxyProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersProxyUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersProxyUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Proxy Provider. |
 **proxyProviderRequest** | [**ProxyProviderRequest**](ProxyProviderRequest.md)|  |

### Return type

[**ProxyProvider**](ProxyProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersProxyUsedByList"></a>
# **providersProxyUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; providersProxyUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Proxy Provider.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.providersProxyUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersProxyUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersProxyUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Proxy Provider. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersRadiusCreate"></a>
# **providersRadiusCreate**
> RadiusProvider providersRadiusCreate(radiusProviderRequest)



RadiusProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val radiusProviderRequest : RadiusProviderRequest =  // RadiusProviderRequest | 
try {
    val result : RadiusProvider = apiInstance.providersRadiusCreate(radiusProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersRadiusCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersRadiusCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **radiusProviderRequest** | [**RadiusProviderRequest**](RadiusProviderRequest.md)|  |

### Return type

[**RadiusProvider**](RadiusProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersRadiusDestroy"></a>
# **providersRadiusDestroy**
> providersRadiusDestroy(id)



RadiusProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Radius Provider.
try {
    apiInstance.providersRadiusDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersRadiusDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersRadiusDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Radius Provider. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersRadiusList"></a>
# **providersRadiusList**
> PaginatedRadiusProviderList providersRadiusList(applicationIsnull, authorizationFlowSlugIexact, clientNetworksIexact, nameIexact, ordering, page, pageSize, search)



RadiusProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val applicationIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val authorizationFlowSlugIexact : kotlin.String = authorizationFlowSlugIexact_example // kotlin.String | 
val clientNetworksIexact : kotlin.String = clientNetworksIexact_example // kotlin.String | 
val nameIexact : kotlin.String = nameIexact_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedRadiusProviderList = apiInstance.providersRadiusList(applicationIsnull, authorizationFlowSlugIexact, clientNetworksIexact, nameIexact, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersRadiusList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersRadiusList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationIsnull** | **kotlin.Boolean**|  | [optional]
 **authorizationFlowSlugIexact** | **kotlin.String**|  | [optional]
 **clientNetworksIexact** | **kotlin.String**|  | [optional]
 **nameIexact** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedRadiusProviderList**](PaginatedRadiusProviderList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersRadiusPartialUpdate"></a>
# **providersRadiusPartialUpdate**
> RadiusProvider providersRadiusPartialUpdate(id, patchedRadiusProviderRequest)



RadiusProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Radius Provider.
val patchedRadiusProviderRequest : PatchedRadiusProviderRequest =  // PatchedRadiusProviderRequest | 
try {
    val result : RadiusProvider = apiInstance.providersRadiusPartialUpdate(id, patchedRadiusProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersRadiusPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersRadiusPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Radius Provider. |
 **patchedRadiusProviderRequest** | [**PatchedRadiusProviderRequest**](PatchedRadiusProviderRequest.md)|  | [optional]

### Return type

[**RadiusProvider**](RadiusProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersRadiusRetrieve"></a>
# **providersRadiusRetrieve**
> RadiusProvider providersRadiusRetrieve(id)



RadiusProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Radius Provider.
try {
    val result : RadiusProvider = apiInstance.providersRadiusRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersRadiusRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersRadiusRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Radius Provider. |

### Return type

[**RadiusProvider**](RadiusProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersRadiusUpdate"></a>
# **providersRadiusUpdate**
> RadiusProvider providersRadiusUpdate(id, radiusProviderRequest)



RadiusProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Radius Provider.
val radiusProviderRequest : RadiusProviderRequest =  // RadiusProviderRequest | 
try {
    val result : RadiusProvider = apiInstance.providersRadiusUpdate(id, radiusProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersRadiusUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersRadiusUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Radius Provider. |
 **radiusProviderRequest** | [**RadiusProviderRequest**](RadiusProviderRequest.md)|  |

### Return type

[**RadiusProvider**](RadiusProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersRadiusUsedByList"></a>
# **providersRadiusUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; providersRadiusUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Radius Provider.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.providersRadiusUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersRadiusUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersRadiusUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Radius Provider. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersSamlCreate"></a>
# **providersSamlCreate**
> SAMLProvider providersSamlCreate(saMLProviderRequest)



SAMLProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val saMLProviderRequest : SAMLProviderRequest =  // SAMLProviderRequest | 
try {
    val result : SAMLProvider = apiInstance.providersSamlCreate(saMLProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saMLProviderRequest** | [**SAMLProviderRequest**](SAMLProviderRequest.md)|  |

### Return type

[**SAMLProvider**](SAMLProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersSamlDestroy"></a>
# **providersSamlDestroy**
> providersSamlDestroy(id)



SAMLProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SAML Provider.
try {
    apiInstance.providersSamlDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SAML Provider. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersSamlImportMetadataCreate"></a>
# **providersSamlImportMetadataCreate**
> providersSamlImportMetadataCreate(name, authorizationFlow, file)



Create provider from SAML Metadata

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val name : kotlin.String = name_example // kotlin.String | 
val authorizationFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.providersSamlImportMetadataCreate(name, authorizationFlow, file)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlImportMetadataCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlImportMetadataCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **authorizationFlow** | **java.util.UUID**|  |
 **file** | **java.io.File**|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="providersSamlList"></a>
# **providersSamlList**
> PaginatedSAMLProviderList providersSamlList(acsUrl, assertionValidNotBefore, assertionValidNotOnOrAfter, audience, authenticationFlow, authorizationFlow, backchannelApplication, defaultRelayState, digestAlgorithm, isBackchannel, issuer, name, nameIdMapping, ordering, page, pageSize, propertyMappings, search, sessionValidNotOnOrAfter, signatureAlgorithm, signingKp, spBinding, verificationKp)



SAMLProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val acsUrl : kotlin.String = acsUrl_example // kotlin.String | 
val assertionValidNotBefore : kotlin.String = assertionValidNotBefore_example // kotlin.String | 
val assertionValidNotOnOrAfter : kotlin.String = assertionValidNotOnOrAfter_example // kotlin.String | 
val audience : kotlin.String = audience_example // kotlin.String | 
val authenticationFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val authorizationFlow : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val backchannelApplication : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val defaultRelayState : kotlin.String = defaultRelayState_example // kotlin.String | 
val digestAlgorithm : kotlin.String = digestAlgorithm_example // kotlin.String | * `http://www.w3.org/2000/09/xmldsig#sha1` - SHA1 * `http://www.w3.org/2001/04/xmlenc#sha256` - SHA256 * `http://www.w3.org/2001/04/xmldsig-more#sha384` - SHA384 * `http://www.w3.org/2001/04/xmlenc#sha512` - SHA512
val isBackchannel : kotlin.Boolean = true // kotlin.Boolean | 
val issuer : kotlin.String = issuer_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val nameIdMapping : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val propertyMappings : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val sessionValidNotOnOrAfter : kotlin.String = sessionValidNotOnOrAfter_example // kotlin.String | 
val signatureAlgorithm : kotlin.String = signatureAlgorithm_example // kotlin.String | * `http://www.w3.org/2000/09/xmldsig#rsa-sha1` - RSA-SHA1 * `http://www.w3.org/2001/04/xmldsig-more#rsa-sha256` - RSA-SHA256 * `http://www.w3.org/2001/04/xmldsig-more#rsa-sha384` - RSA-SHA384 * `http://www.w3.org/2001/04/xmldsig-more#rsa-sha512` - RSA-SHA512 * `http://www.w3.org/2000/09/xmldsig#dsa-sha1` - DSA-SHA1
val signingKp : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val spBinding : kotlin.String = spBinding_example // kotlin.String | This determines how authentik sends the response back to the Service Provider.  * `redirect` - Redirect * `post` - Post
val verificationKp : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedSAMLProviderList = apiInstance.providersSamlList(acsUrl, assertionValidNotBefore, assertionValidNotOnOrAfter, audience, authenticationFlow, authorizationFlow, backchannelApplication, defaultRelayState, digestAlgorithm, isBackchannel, issuer, name, nameIdMapping, ordering, page, pageSize, propertyMappings, search, sessionValidNotOnOrAfter, signatureAlgorithm, signingKp, spBinding, verificationKp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acsUrl** | **kotlin.String**|  | [optional]
 **assertionValidNotBefore** | **kotlin.String**|  | [optional]
 **assertionValidNotOnOrAfter** | **kotlin.String**|  | [optional]
 **audience** | **kotlin.String**|  | [optional]
 **authenticationFlow** | **java.util.UUID**|  | [optional]
 **authorizationFlow** | **java.util.UUID**|  | [optional]
 **backchannelApplication** | **java.util.UUID**|  | [optional]
 **defaultRelayState** | **kotlin.String**|  | [optional]
 **digestAlgorithm** | **kotlin.String**| * &#x60;http://www.w3.org/2000/09/xmldsig#sha1&#x60; - SHA1 * &#x60;http://www.w3.org/2001/04/xmlenc#sha256&#x60; - SHA256 * &#x60;http://www.w3.org/2001/04/xmldsig-more#sha384&#x60; - SHA384 * &#x60;http://www.w3.org/2001/04/xmlenc#sha512&#x60; - SHA512 | [optional] [enum: http://www.w3.org/2000/09/xmldsig#sha1, http://www.w3.org/2001/04/xmldsig-more#sha384, http://www.w3.org/2001/04/xmlenc#sha256, http://www.w3.org/2001/04/xmlenc#sha512]
 **isBackchannel** | **kotlin.Boolean**|  | [optional]
 **issuer** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **nameIdMapping** | **java.util.UUID**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **propertyMappings** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **sessionValidNotOnOrAfter** | **kotlin.String**|  | [optional]
 **signatureAlgorithm** | **kotlin.String**| * &#x60;http://www.w3.org/2000/09/xmldsig#rsa-sha1&#x60; - RSA-SHA1 * &#x60;http://www.w3.org/2001/04/xmldsig-more#rsa-sha256&#x60; - RSA-SHA256 * &#x60;http://www.w3.org/2001/04/xmldsig-more#rsa-sha384&#x60; - RSA-SHA384 * &#x60;http://www.w3.org/2001/04/xmldsig-more#rsa-sha512&#x60; - RSA-SHA512 * &#x60;http://www.w3.org/2000/09/xmldsig#dsa-sha1&#x60; - DSA-SHA1 | [optional] [enum: http://www.w3.org/2000/09/xmldsig#dsa-sha1, http://www.w3.org/2000/09/xmldsig#rsa-sha1, http://www.w3.org/2001/04/xmldsig-more#rsa-sha256, http://www.w3.org/2001/04/xmldsig-more#rsa-sha384, http://www.w3.org/2001/04/xmldsig-more#rsa-sha512]
 **signingKp** | **java.util.UUID**|  | [optional]
 **spBinding** | **kotlin.String**| This determines how authentik sends the response back to the Service Provider.  * &#x60;redirect&#x60; - Redirect * &#x60;post&#x60; - Post | [optional] [enum: post, redirect]
 **verificationKp** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedSAMLProviderList**](PaginatedSAMLProviderList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersSamlMetadataRetrieve"></a>
# **providersSamlMetadataRetrieve**
> SAMLMetadata providersSamlMetadataRetrieve(id, download, forceBinding)



Return metadata as XML string

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SAML Provider.
val download : kotlin.Boolean = true // kotlin.Boolean | 
val forceBinding : kotlin.String = forceBinding_example // kotlin.String | Optionally force the metadata to only include one binding.
try {
    val result : SAMLMetadata = apiInstance.providersSamlMetadataRetrieve(id, download, forceBinding)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlMetadataRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlMetadataRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SAML Provider. |
 **download** | **kotlin.Boolean**|  | [optional]
 **forceBinding** | **kotlin.String**| Optionally force the metadata to only include one binding. | [optional] [enum: urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST, urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect]

### Return type

[**SAMLMetadata**](SAMLMetadata.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersSamlPartialUpdate"></a>
# **providersSamlPartialUpdate**
> SAMLProvider providersSamlPartialUpdate(id, patchedSAMLProviderRequest)



SAMLProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SAML Provider.
val patchedSAMLProviderRequest : PatchedSAMLProviderRequest =  // PatchedSAMLProviderRequest | 
try {
    val result : SAMLProvider = apiInstance.providersSamlPartialUpdate(id, patchedSAMLProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SAML Provider. |
 **patchedSAMLProviderRequest** | [**PatchedSAMLProviderRequest**](PatchedSAMLProviderRequest.md)|  | [optional]

### Return type

[**SAMLProvider**](SAMLProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersSamlPreviewUserRetrieve"></a>
# **providersSamlPreviewUserRetrieve**
> PropertyMappingPreview providersSamlPreviewUserRetrieve(id)



Preview user data for provider

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SAML Provider.
try {
    val result : PropertyMappingPreview = apiInstance.providersSamlPreviewUserRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlPreviewUserRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlPreviewUserRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SAML Provider. |

### Return type

[**PropertyMappingPreview**](PropertyMappingPreview.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersSamlRetrieve"></a>
# **providersSamlRetrieve**
> SAMLProvider providersSamlRetrieve(id)



SAMLProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SAML Provider.
try {
    val result : SAMLProvider = apiInstance.providersSamlRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SAML Provider. |

### Return type

[**SAMLProvider**](SAMLProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersSamlUpdate"></a>
# **providersSamlUpdate**
> SAMLProvider providersSamlUpdate(id, saMLProviderRequest)



SAMLProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SAML Provider.
val saMLProviderRequest : SAMLProviderRequest =  // SAMLProviderRequest | 
try {
    val result : SAMLProvider = apiInstance.providersSamlUpdate(id, saMLProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SAML Provider. |
 **saMLProviderRequest** | [**SAMLProviderRequest**](SAMLProviderRequest.md)|  |

### Return type

[**SAMLProvider**](SAMLProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersSamlUsedByList"></a>
# **providersSamlUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; providersSamlUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SAML Provider.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.providersSamlUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersSamlUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersSamlUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SAML Provider. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersScimCreate"></a>
# **providersScimCreate**
> SCIMProvider providersScimCreate(scIMProviderRequest)



SCIMProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val scIMProviderRequest : SCIMProviderRequest =  // SCIMProviderRequest | 
try {
    val result : SCIMProvider = apiInstance.providersScimCreate(scIMProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersScimCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersScimCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scIMProviderRequest** | [**SCIMProviderRequest**](SCIMProviderRequest.md)|  |

### Return type

[**SCIMProvider**](SCIMProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersScimDestroy"></a>
# **providersScimDestroy**
> providersScimDestroy(id)



SCIMProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SCIM Provider.
try {
    apiInstance.providersScimDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersScimDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersScimDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SCIM Provider. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersScimList"></a>
# **providersScimList**
> PaginatedSCIMProviderList providersScimList(excludeUsersServiceAccount, filterGroup, name, ordering, page, pageSize, search, url)



SCIMProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val excludeUsersServiceAccount : kotlin.Boolean = true // kotlin.Boolean | 
val filterGroup : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val url : kotlin.String = url_example // kotlin.String | 
try {
    val result : PaginatedSCIMProviderList = apiInstance.providersScimList(excludeUsersServiceAccount, filterGroup, name, ordering, page, pageSize, search, url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersScimList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersScimList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **excludeUsersServiceAccount** | **kotlin.Boolean**|  | [optional]
 **filterGroup** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **url** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedSCIMProviderList**](PaginatedSCIMProviderList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersScimPartialUpdate"></a>
# **providersScimPartialUpdate**
> SCIMProvider providersScimPartialUpdate(id, patchedSCIMProviderRequest)



SCIMProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SCIM Provider.
val patchedSCIMProviderRequest : PatchedSCIMProviderRequest =  // PatchedSCIMProviderRequest | 
try {
    val result : SCIMProvider = apiInstance.providersScimPartialUpdate(id, patchedSCIMProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersScimPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersScimPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SCIM Provider. |
 **patchedSCIMProviderRequest** | [**PatchedSCIMProviderRequest**](PatchedSCIMProviderRequest.md)|  | [optional]

### Return type

[**SCIMProvider**](SCIMProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersScimRetrieve"></a>
# **providersScimRetrieve**
> SCIMProvider providersScimRetrieve(id)



SCIMProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SCIM Provider.
try {
    val result : SCIMProvider = apiInstance.providersScimRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersScimRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersScimRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SCIM Provider. |

### Return type

[**SCIMProvider**](SCIMProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersScimSyncStatusRetrieve"></a>
# **providersScimSyncStatusRetrieve**
> SCIMSyncStatus providersScimSyncStatusRetrieve(id)



Get provider&#39;s sync status

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SCIM Provider.
try {
    val result : SCIMSyncStatus = apiInstance.providersScimSyncStatusRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersScimSyncStatusRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersScimSyncStatusRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SCIM Provider. |

### Return type

[**SCIMSyncStatus**](SCIMSyncStatus.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="providersScimUpdate"></a>
# **providersScimUpdate**
> SCIMProvider providersScimUpdate(id, scIMProviderRequest)



SCIMProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SCIM Provider.
val scIMProviderRequest : SCIMProviderRequest =  // SCIMProviderRequest | 
try {
    val result : SCIMProvider = apiInstance.providersScimUpdate(id, scIMProviderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersScimUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersScimUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SCIM Provider. |
 **scIMProviderRequest** | [**SCIMProviderRequest**](SCIMProviderRequest.md)|  |

### Return type

[**SCIMProvider**](SCIMProvider.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="providersScimUsedByList"></a>
# **providersScimUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; providersScimUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ProvidersApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this SCIM Provider.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.providersScimUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProvidersApi#providersScimUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProvidersApi#providersScimUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this SCIM Provider. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

