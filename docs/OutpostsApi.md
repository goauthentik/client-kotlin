# OutpostsApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outpostsInstancesCreate**](OutpostsApi.md#outpostsInstancesCreate) | **POST** /outposts/instances/ | 
[**outpostsInstancesDefaultSettingsRetrieve**](OutpostsApi.md#outpostsInstancesDefaultSettingsRetrieve) | **GET** /outposts/instances/default_settings/ | 
[**outpostsInstancesDestroy**](OutpostsApi.md#outpostsInstancesDestroy) | **DELETE** /outposts/instances/{uuid}/ | 
[**outpostsInstancesHealthList**](OutpostsApi.md#outpostsInstancesHealthList) | **GET** /outposts/instances/{uuid}/health/ | 
[**outpostsInstancesList**](OutpostsApi.md#outpostsInstancesList) | **GET** /outposts/instances/ | 
[**outpostsInstancesPartialUpdate**](OutpostsApi.md#outpostsInstancesPartialUpdate) | **PATCH** /outposts/instances/{uuid}/ | 
[**outpostsInstancesRetrieve**](OutpostsApi.md#outpostsInstancesRetrieve) | **GET** /outposts/instances/{uuid}/ | 
[**outpostsInstancesUpdate**](OutpostsApi.md#outpostsInstancesUpdate) | **PUT** /outposts/instances/{uuid}/ | 
[**outpostsInstancesUsedByList**](OutpostsApi.md#outpostsInstancesUsedByList) | **GET** /outposts/instances/{uuid}/used_by/ | 
[**outpostsLdapList**](OutpostsApi.md#outpostsLdapList) | **GET** /outposts/ldap/ | 
[**outpostsLdapRetrieve**](OutpostsApi.md#outpostsLdapRetrieve) | **GET** /outposts/ldap/{id}/ | 
[**outpostsProxyList**](OutpostsApi.md#outpostsProxyList) | **GET** /outposts/proxy/ | 
[**outpostsProxyRetrieve**](OutpostsApi.md#outpostsProxyRetrieve) | **GET** /outposts/proxy/{id}/ | 
[**outpostsRadiusList**](OutpostsApi.md#outpostsRadiusList) | **GET** /outposts/radius/ | 
[**outpostsRadiusRetrieve**](OutpostsApi.md#outpostsRadiusRetrieve) | **GET** /outposts/radius/{id}/ | 
[**outpostsServiceConnectionsAllDestroy**](OutpostsApi.md#outpostsServiceConnectionsAllDestroy) | **DELETE** /outposts/service_connections/all/{uuid}/ | 
[**outpostsServiceConnectionsAllList**](OutpostsApi.md#outpostsServiceConnectionsAllList) | **GET** /outposts/service_connections/all/ | 
[**outpostsServiceConnectionsAllRetrieve**](OutpostsApi.md#outpostsServiceConnectionsAllRetrieve) | **GET** /outposts/service_connections/all/{uuid}/ | 
[**outpostsServiceConnectionsAllStateRetrieve**](OutpostsApi.md#outpostsServiceConnectionsAllStateRetrieve) | **GET** /outposts/service_connections/all/{uuid}/state/ | 
[**outpostsServiceConnectionsAllTypesList**](OutpostsApi.md#outpostsServiceConnectionsAllTypesList) | **GET** /outposts/service_connections/all/types/ | 
[**outpostsServiceConnectionsAllUsedByList**](OutpostsApi.md#outpostsServiceConnectionsAllUsedByList) | **GET** /outposts/service_connections/all/{uuid}/used_by/ | 
[**outpostsServiceConnectionsDockerCreate**](OutpostsApi.md#outpostsServiceConnectionsDockerCreate) | **POST** /outposts/service_connections/docker/ | 
[**outpostsServiceConnectionsDockerDestroy**](OutpostsApi.md#outpostsServiceConnectionsDockerDestroy) | **DELETE** /outposts/service_connections/docker/{uuid}/ | 
[**outpostsServiceConnectionsDockerList**](OutpostsApi.md#outpostsServiceConnectionsDockerList) | **GET** /outposts/service_connections/docker/ | 
[**outpostsServiceConnectionsDockerPartialUpdate**](OutpostsApi.md#outpostsServiceConnectionsDockerPartialUpdate) | **PATCH** /outposts/service_connections/docker/{uuid}/ | 
[**outpostsServiceConnectionsDockerRetrieve**](OutpostsApi.md#outpostsServiceConnectionsDockerRetrieve) | **GET** /outposts/service_connections/docker/{uuid}/ | 
[**outpostsServiceConnectionsDockerUpdate**](OutpostsApi.md#outpostsServiceConnectionsDockerUpdate) | **PUT** /outposts/service_connections/docker/{uuid}/ | 
[**outpostsServiceConnectionsDockerUsedByList**](OutpostsApi.md#outpostsServiceConnectionsDockerUsedByList) | **GET** /outposts/service_connections/docker/{uuid}/used_by/ | 
[**outpostsServiceConnectionsKubernetesCreate**](OutpostsApi.md#outpostsServiceConnectionsKubernetesCreate) | **POST** /outposts/service_connections/kubernetes/ | 
[**outpostsServiceConnectionsKubernetesDestroy**](OutpostsApi.md#outpostsServiceConnectionsKubernetesDestroy) | **DELETE** /outposts/service_connections/kubernetes/{uuid}/ | 
[**outpostsServiceConnectionsKubernetesList**](OutpostsApi.md#outpostsServiceConnectionsKubernetesList) | **GET** /outposts/service_connections/kubernetes/ | 
[**outpostsServiceConnectionsKubernetesPartialUpdate**](OutpostsApi.md#outpostsServiceConnectionsKubernetesPartialUpdate) | **PATCH** /outposts/service_connections/kubernetes/{uuid}/ | 
[**outpostsServiceConnectionsKubernetesRetrieve**](OutpostsApi.md#outpostsServiceConnectionsKubernetesRetrieve) | **GET** /outposts/service_connections/kubernetes/{uuid}/ | 
[**outpostsServiceConnectionsKubernetesUpdate**](OutpostsApi.md#outpostsServiceConnectionsKubernetesUpdate) | **PUT** /outposts/service_connections/kubernetes/{uuid}/ | 
[**outpostsServiceConnectionsKubernetesUsedByList**](OutpostsApi.md#outpostsServiceConnectionsKubernetesUsedByList) | **GET** /outposts/service_connections/kubernetes/{uuid}/used_by/ | 


<a name="outpostsInstancesCreate"></a>
# **outpostsInstancesCreate**
> Outpost outpostsInstancesCreate(outpostRequest)



Outpost Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val outpostRequest : OutpostRequest =  // OutpostRequest | 
try {
    val result : Outpost = apiInstance.outpostsInstancesCreate(outpostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsInstancesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsInstancesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outpostRequest** | [**OutpostRequest**](OutpostRequest.md)|  |

### Return type

[**Outpost**](Outpost.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outpostsInstancesDefaultSettingsRetrieve"></a>
# **outpostsInstancesDefaultSettingsRetrieve**
> OutpostDefaultConfig outpostsInstancesDefaultSettingsRetrieve()



Global default outpost config

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
try {
    val result : OutpostDefaultConfig = apiInstance.outpostsInstancesDefaultSettingsRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsInstancesDefaultSettingsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsInstancesDefaultSettingsRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OutpostDefaultConfig**](OutpostDefaultConfig.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsInstancesDestroy"></a>
# **outpostsInstancesDestroy**
> outpostsInstancesDestroy(uuid)



Outpost Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost.
try {
    apiInstance.outpostsInstancesDestroy(uuid)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsInstancesDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsInstancesDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsInstancesHealthList"></a>
# **outpostsInstancesHealthList**
> kotlin.collections.List&lt;OutpostHealth&gt; outpostsInstancesHealthList(uuid, managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact)



Get outposts current health

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost.
val managedIcontains : kotlin.String = managedIcontains_example // kotlin.String | 
val managedIexact : kotlin.String = managedIexact_example // kotlin.String | 
val nameIcontains : kotlin.String = nameIcontains_example // kotlin.String | 
val nameIexact : kotlin.String = nameIexact_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val providersIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val providersByPk : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val serviceConnectionNameIcontains : kotlin.String = serviceConnectionNameIcontains_example // kotlin.String | 
val serviceConnectionNameIexact : kotlin.String = serviceConnectionNameIexact_example // kotlin.String | 
try {
    val result : kotlin.collections.List<OutpostHealth> = apiInstance.outpostsInstancesHealthList(uuid, managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsInstancesHealthList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsInstancesHealthList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost. |
 **managedIcontains** | **kotlin.String**|  | [optional]
 **managedIexact** | **kotlin.String**|  | [optional]
 **nameIcontains** | **kotlin.String**|  | [optional]
 **nameIexact** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **providersIsnull** | **kotlin.Boolean**|  | [optional]
 **providersByPk** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **serviceConnectionNameIcontains** | **kotlin.String**|  | [optional]
 **serviceConnectionNameIexact** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;OutpostHealth&gt;**](OutpostHealth.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsInstancesList"></a>
# **outpostsInstancesList**
> PaginatedOutpostList outpostsInstancesList(managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, page, pageSize, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact)



Outpost Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val managedIcontains : kotlin.String = managedIcontains_example // kotlin.String | 
val managedIexact : kotlin.String = managedIexact_example // kotlin.String | 
val nameIcontains : kotlin.String = nameIcontains_example // kotlin.String | 
val nameIexact : kotlin.String = nameIexact_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val providersIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val providersByPk : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val serviceConnectionNameIcontains : kotlin.String = serviceConnectionNameIcontains_example // kotlin.String | 
val serviceConnectionNameIexact : kotlin.String = serviceConnectionNameIexact_example // kotlin.String | 
try {
    val result : PaginatedOutpostList = apiInstance.outpostsInstancesList(managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, page, pageSize, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsInstancesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsInstancesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managedIcontains** | **kotlin.String**|  | [optional]
 **managedIexact** | **kotlin.String**|  | [optional]
 **nameIcontains** | **kotlin.String**|  | [optional]
 **nameIexact** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **providersIsnull** | **kotlin.Boolean**|  | [optional]
 **providersByPk** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **serviceConnectionNameIcontains** | **kotlin.String**|  | [optional]
 **serviceConnectionNameIexact** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedOutpostList**](PaginatedOutpostList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsInstancesPartialUpdate"></a>
# **outpostsInstancesPartialUpdate**
> Outpost outpostsInstancesPartialUpdate(uuid, patchedOutpostRequest)



Outpost Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost.
val patchedOutpostRequest : PatchedOutpostRequest =  // PatchedOutpostRequest | 
try {
    val result : Outpost = apiInstance.outpostsInstancesPartialUpdate(uuid, patchedOutpostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsInstancesPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsInstancesPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost. |
 **patchedOutpostRequest** | [**PatchedOutpostRequest**](PatchedOutpostRequest.md)|  | [optional]

### Return type

[**Outpost**](Outpost.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outpostsInstancesRetrieve"></a>
# **outpostsInstancesRetrieve**
> Outpost outpostsInstancesRetrieve(uuid)



Outpost Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost.
try {
    val result : Outpost = apiInstance.outpostsInstancesRetrieve(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsInstancesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsInstancesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost. |

### Return type

[**Outpost**](Outpost.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsInstancesUpdate"></a>
# **outpostsInstancesUpdate**
> Outpost outpostsInstancesUpdate(uuid, outpostRequest)



Outpost Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost.
val outpostRequest : OutpostRequest =  // OutpostRequest | 
try {
    val result : Outpost = apiInstance.outpostsInstancesUpdate(uuid, outpostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsInstancesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsInstancesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost. |
 **outpostRequest** | [**OutpostRequest**](OutpostRequest.md)|  |

### Return type

[**Outpost**](Outpost.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outpostsInstancesUsedByList"></a>
# **outpostsInstancesUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; outpostsInstancesUsedByList(uuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.outpostsInstancesUsedByList(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsInstancesUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsInstancesUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsLdapList"></a>
# **outpostsLdapList**
> PaginatedLDAPOutpostConfigList outpostsLdapList(name, ordering, page, pageSize, search)



LDAPProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedLDAPOutpostConfigList = apiInstance.outpostsLdapList(name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsLdapList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsLdapList")
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

[**PaginatedLDAPOutpostConfigList**](PaginatedLDAPOutpostConfigList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsLdapRetrieve"></a>
# **outpostsLdapRetrieve**
> LDAPOutpostConfig outpostsLdapRetrieve(id)



LDAPProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this LDAP Provider.
try {
    val result : LDAPOutpostConfig = apiInstance.outpostsLdapRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsLdapRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsLdapRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this LDAP Provider. |

### Return type

[**LDAPOutpostConfig**](LDAPOutpostConfig.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsProxyList"></a>
# **outpostsProxyList**
> PaginatedProxyOutpostConfigList outpostsProxyList(name, ordering, page, pageSize, search)



ProxyProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedProxyOutpostConfigList = apiInstance.outpostsProxyList(name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsProxyList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsProxyList")
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

[**PaginatedProxyOutpostConfigList**](PaginatedProxyOutpostConfigList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsProxyRetrieve"></a>
# **outpostsProxyRetrieve**
> ProxyOutpostConfig outpostsProxyRetrieve(id)



ProxyProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Proxy Provider.
try {
    val result : ProxyOutpostConfig = apiInstance.outpostsProxyRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsProxyRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsProxyRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Proxy Provider. |

### Return type

[**ProxyOutpostConfig**](ProxyOutpostConfig.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsRadiusList"></a>
# **outpostsRadiusList**
> PaginatedRadiusOutpostConfigList outpostsRadiusList(name, ordering, page, pageSize, search)



RadiusProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedRadiusOutpostConfigList = apiInstance.outpostsRadiusList(name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsRadiusList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsRadiusList")
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

[**PaginatedRadiusOutpostConfigList**](PaginatedRadiusOutpostConfigList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsRadiusRetrieve"></a>
# **outpostsRadiusRetrieve**
> RadiusOutpostConfig outpostsRadiusRetrieve(id)



RadiusProvider Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Radius Provider.
try {
    val result : RadiusOutpostConfig = apiInstance.outpostsRadiusRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsRadiusRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsRadiusRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Radius Provider. |

### Return type

[**RadiusOutpostConfig**](RadiusOutpostConfig.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsAllDestroy"></a>
# **outpostsServiceConnectionsAllDestroy**
> outpostsServiceConnectionsAllDestroy(uuid)



ServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost Service-Connection.
try {
    apiInstance.outpostsServiceConnectionsAllDestroy(uuid)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsAllDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsAllDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost Service-Connection. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsAllList"></a>
# **outpostsServiceConnectionsAllList**
> PaginatedServiceConnectionList outpostsServiceConnectionsAllList(name, ordering, page, pageSize, search)



ServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedServiceConnectionList = apiInstance.outpostsServiceConnectionsAllList(name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsAllList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsAllList")
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

[**PaginatedServiceConnectionList**](PaginatedServiceConnectionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsAllRetrieve"></a>
# **outpostsServiceConnectionsAllRetrieve**
> ServiceConnection outpostsServiceConnectionsAllRetrieve(uuid)



ServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost Service-Connection.
try {
    val result : ServiceConnection = apiInstance.outpostsServiceConnectionsAllRetrieve(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsAllRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsAllRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost Service-Connection. |

### Return type

[**ServiceConnection**](ServiceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsAllStateRetrieve"></a>
# **outpostsServiceConnectionsAllStateRetrieve**
> ServiceConnectionState outpostsServiceConnectionsAllStateRetrieve(uuid)



Get the service connection&#39;s state

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost Service-Connection.
try {
    val result : ServiceConnectionState = apiInstance.outpostsServiceConnectionsAllStateRetrieve(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsAllStateRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsAllStateRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost Service-Connection. |

### Return type

[**ServiceConnectionState**](ServiceConnectionState.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsAllTypesList"></a>
# **outpostsServiceConnectionsAllTypesList**
> kotlin.collections.List&lt;TypeCreate&gt; outpostsServiceConnectionsAllTypesList()



Get all creatable service connection types

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
try {
    val result : kotlin.collections.List<TypeCreate> = apiInstance.outpostsServiceConnectionsAllTypesList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsAllTypesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsAllTypesList")
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

<a name="outpostsServiceConnectionsAllUsedByList"></a>
# **outpostsServiceConnectionsAllUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; outpostsServiceConnectionsAllUsedByList(uuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Outpost Service-Connection.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.outpostsServiceConnectionsAllUsedByList(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsAllUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsAllUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Outpost Service-Connection. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsDockerCreate"></a>
# **outpostsServiceConnectionsDockerCreate**
> DockerServiceConnection outpostsServiceConnectionsDockerCreate(dockerServiceConnectionRequest)



DockerServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val dockerServiceConnectionRequest : DockerServiceConnectionRequest =  // DockerServiceConnectionRequest | 
try {
    val result : DockerServiceConnection = apiInstance.outpostsServiceConnectionsDockerCreate(dockerServiceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsDockerCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsDockerCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dockerServiceConnectionRequest** | [**DockerServiceConnectionRequest**](DockerServiceConnectionRequest.md)|  |

### Return type

[**DockerServiceConnection**](DockerServiceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outpostsServiceConnectionsDockerDestroy"></a>
# **outpostsServiceConnectionsDockerDestroy**
> outpostsServiceConnectionsDockerDestroy(uuid)



DockerServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Docker Service-Connection.
try {
    apiInstance.outpostsServiceConnectionsDockerDestroy(uuid)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsDockerDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsDockerDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Docker Service-Connection. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsDockerList"></a>
# **outpostsServiceConnectionsDockerList**
> PaginatedDockerServiceConnectionList outpostsServiceConnectionsDockerList(local, name, ordering, page, pageSize, search, tlsAuthentication, tlsVerification, url)



DockerServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val local : kotlin.Boolean = true // kotlin.Boolean | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val tlsAuthentication : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tlsVerification : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val url : kotlin.String = url_example // kotlin.String | 
try {
    val result : PaginatedDockerServiceConnectionList = apiInstance.outpostsServiceConnectionsDockerList(local, name, ordering, page, pageSize, search, tlsAuthentication, tlsVerification, url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsDockerList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsDockerList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local** | **kotlin.Boolean**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **tlsAuthentication** | **java.util.UUID**|  | [optional]
 **tlsVerification** | **java.util.UUID**|  | [optional]
 **url** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedDockerServiceConnectionList**](PaginatedDockerServiceConnectionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsDockerPartialUpdate"></a>
# **outpostsServiceConnectionsDockerPartialUpdate**
> DockerServiceConnection outpostsServiceConnectionsDockerPartialUpdate(uuid, patchedDockerServiceConnectionRequest)



DockerServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Docker Service-Connection.
val patchedDockerServiceConnectionRequest : PatchedDockerServiceConnectionRequest =  // PatchedDockerServiceConnectionRequest | 
try {
    val result : DockerServiceConnection = apiInstance.outpostsServiceConnectionsDockerPartialUpdate(uuid, patchedDockerServiceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsDockerPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsDockerPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Docker Service-Connection. |
 **patchedDockerServiceConnectionRequest** | [**PatchedDockerServiceConnectionRequest**](PatchedDockerServiceConnectionRequest.md)|  | [optional]

### Return type

[**DockerServiceConnection**](DockerServiceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outpostsServiceConnectionsDockerRetrieve"></a>
# **outpostsServiceConnectionsDockerRetrieve**
> DockerServiceConnection outpostsServiceConnectionsDockerRetrieve(uuid)



DockerServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Docker Service-Connection.
try {
    val result : DockerServiceConnection = apiInstance.outpostsServiceConnectionsDockerRetrieve(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsDockerRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsDockerRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Docker Service-Connection. |

### Return type

[**DockerServiceConnection**](DockerServiceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsDockerUpdate"></a>
# **outpostsServiceConnectionsDockerUpdate**
> DockerServiceConnection outpostsServiceConnectionsDockerUpdate(uuid, dockerServiceConnectionRequest)



DockerServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Docker Service-Connection.
val dockerServiceConnectionRequest : DockerServiceConnectionRequest =  // DockerServiceConnectionRequest | 
try {
    val result : DockerServiceConnection = apiInstance.outpostsServiceConnectionsDockerUpdate(uuid, dockerServiceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsDockerUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsDockerUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Docker Service-Connection. |
 **dockerServiceConnectionRequest** | [**DockerServiceConnectionRequest**](DockerServiceConnectionRequest.md)|  |

### Return type

[**DockerServiceConnection**](DockerServiceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outpostsServiceConnectionsDockerUsedByList"></a>
# **outpostsServiceConnectionsDockerUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; outpostsServiceConnectionsDockerUsedByList(uuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Docker Service-Connection.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.outpostsServiceConnectionsDockerUsedByList(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsDockerUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsDockerUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Docker Service-Connection. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsKubernetesCreate"></a>
# **outpostsServiceConnectionsKubernetesCreate**
> KubernetesServiceConnection outpostsServiceConnectionsKubernetesCreate(kubernetesServiceConnectionRequest)



KubernetesServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val kubernetesServiceConnectionRequest : KubernetesServiceConnectionRequest =  // KubernetesServiceConnectionRequest | 
try {
    val result : KubernetesServiceConnection = apiInstance.outpostsServiceConnectionsKubernetesCreate(kubernetesServiceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kubernetesServiceConnectionRequest** | [**KubernetesServiceConnectionRequest**](KubernetesServiceConnectionRequest.md)|  |

### Return type

[**KubernetesServiceConnection**](KubernetesServiceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outpostsServiceConnectionsKubernetesDestroy"></a>
# **outpostsServiceConnectionsKubernetesDestroy**
> outpostsServiceConnectionsKubernetesDestroy(uuid)



KubernetesServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Kubernetes Service-Connection.
try {
    apiInstance.outpostsServiceConnectionsKubernetesDestroy(uuid)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Kubernetes Service-Connection. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsKubernetesList"></a>
# **outpostsServiceConnectionsKubernetesList**
> PaginatedKubernetesServiceConnectionList outpostsServiceConnectionsKubernetesList(local, name, ordering, page, pageSize, search)



KubernetesServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val local : kotlin.Boolean = true // kotlin.Boolean | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedKubernetesServiceConnectionList = apiInstance.outpostsServiceConnectionsKubernetesList(local, name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **local** | **kotlin.Boolean**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedKubernetesServiceConnectionList**](PaginatedKubernetesServiceConnectionList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsKubernetesPartialUpdate"></a>
# **outpostsServiceConnectionsKubernetesPartialUpdate**
> KubernetesServiceConnection outpostsServiceConnectionsKubernetesPartialUpdate(uuid, patchedKubernetesServiceConnectionRequest)



KubernetesServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Kubernetes Service-Connection.
val patchedKubernetesServiceConnectionRequest : PatchedKubernetesServiceConnectionRequest =  // PatchedKubernetesServiceConnectionRequest | 
try {
    val result : KubernetesServiceConnection = apiInstance.outpostsServiceConnectionsKubernetesPartialUpdate(uuid, patchedKubernetesServiceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Kubernetes Service-Connection. |
 **patchedKubernetesServiceConnectionRequest** | [**PatchedKubernetesServiceConnectionRequest**](PatchedKubernetesServiceConnectionRequest.md)|  | [optional]

### Return type

[**KubernetesServiceConnection**](KubernetesServiceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outpostsServiceConnectionsKubernetesRetrieve"></a>
# **outpostsServiceConnectionsKubernetesRetrieve**
> KubernetesServiceConnection outpostsServiceConnectionsKubernetesRetrieve(uuid)



KubernetesServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Kubernetes Service-Connection.
try {
    val result : KubernetesServiceConnection = apiInstance.outpostsServiceConnectionsKubernetesRetrieve(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Kubernetes Service-Connection. |

### Return type

[**KubernetesServiceConnection**](KubernetesServiceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outpostsServiceConnectionsKubernetesUpdate"></a>
# **outpostsServiceConnectionsKubernetesUpdate**
> KubernetesServiceConnection outpostsServiceConnectionsKubernetesUpdate(uuid, kubernetesServiceConnectionRequest)



KubernetesServiceConnection Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Kubernetes Service-Connection.
val kubernetesServiceConnectionRequest : KubernetesServiceConnectionRequest =  // KubernetesServiceConnectionRequest | 
try {
    val result : KubernetesServiceConnection = apiInstance.outpostsServiceConnectionsKubernetesUpdate(uuid, kubernetesServiceConnectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Kubernetes Service-Connection. |
 **kubernetesServiceConnectionRequest** | [**KubernetesServiceConnectionRequest**](KubernetesServiceConnectionRequest.md)|  |

### Return type

[**KubernetesServiceConnection**](KubernetesServiceConnection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outpostsServiceConnectionsKubernetesUsedByList"></a>
# **outpostsServiceConnectionsKubernetesUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; outpostsServiceConnectionsKubernetesUsedByList(uuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = OutpostsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Kubernetes Service-Connection.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.outpostsServiceConnectionsKubernetesUsedByList(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutpostsApi#outpostsServiceConnectionsKubernetesUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Kubernetes Service-Connection. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

