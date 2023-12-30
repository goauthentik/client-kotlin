# RacApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**racEndpointsCreate**](RacApi.md#racEndpointsCreate) | **POST** /rac/endpoints/ | 
[**racEndpointsDestroy**](RacApi.md#racEndpointsDestroy) | **DELETE** /rac/endpoints/{pbm_uuid}/ | 
[**racEndpointsList**](RacApi.md#racEndpointsList) | **GET** /rac/endpoints/ | 
[**racEndpointsPartialUpdate**](RacApi.md#racEndpointsPartialUpdate) | **PATCH** /rac/endpoints/{pbm_uuid}/ | 
[**racEndpointsRetrieve**](RacApi.md#racEndpointsRetrieve) | **GET** /rac/endpoints/{pbm_uuid}/ | 
[**racEndpointsUpdate**](RacApi.md#racEndpointsUpdate) | **PUT** /rac/endpoints/{pbm_uuid}/ | 
[**racEndpointsUsedByList**](RacApi.md#racEndpointsUsedByList) | **GET** /rac/endpoints/{pbm_uuid}/used_by/ | 


<a id="racEndpointsCreate"></a>
# **racEndpointsCreate**
> Endpoint racEndpointsCreate(endpointRequest)



Endpoint Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RacApi()
val endpointRequest : EndpointRequest =  // EndpointRequest | 
try {
    val result : Endpoint = apiInstance.racEndpointsCreate(endpointRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RacApi#racEndpointsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RacApi#racEndpointsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointRequest** | [**EndpointRequest**](EndpointRequest.md)|  |

### Return type

[**Endpoint**](Endpoint.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="racEndpointsDestroy"></a>
# **racEndpointsDestroy**
> racEndpointsDestroy(pbmUuid)



Endpoint Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RacApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this RAC Endpoint.
try {
    apiInstance.racEndpointsDestroy(pbmUuid)
} catch (e: ClientException) {
    println("4xx response calling RacApi#racEndpointsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RacApi#racEndpointsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this RAC Endpoint. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="racEndpointsList"></a>
# **racEndpointsList**
> PaginatedEndpointList racEndpointsList(name, ordering, page, pageSize, provider, search, superuserFullList)



List accessible endpoints

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RacApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val provider : kotlin.Int = 56 // kotlin.Int | 
val search : kotlin.String = search_example // kotlin.String | 
val superuserFullList : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : PaginatedEndpointList = apiInstance.racEndpointsList(name, ordering, page, pageSize, provider, search, superuserFullList)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RacApi#racEndpointsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RacApi#racEndpointsList")
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
 **provider** | **kotlin.Int**|  | [optional]
 **search** | **kotlin.String**|  | [optional]
 **superuserFullList** | **kotlin.Boolean**|  | [optional]

### Return type

[**PaginatedEndpointList**](PaginatedEndpointList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="racEndpointsPartialUpdate"></a>
# **racEndpointsPartialUpdate**
> Endpoint racEndpointsPartialUpdate(pbmUuid, patchedEndpointRequest)



Endpoint Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RacApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this RAC Endpoint.
val patchedEndpointRequest : PatchedEndpointRequest =  // PatchedEndpointRequest | 
try {
    val result : Endpoint = apiInstance.racEndpointsPartialUpdate(pbmUuid, patchedEndpointRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RacApi#racEndpointsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RacApi#racEndpointsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this RAC Endpoint. |
 **patchedEndpointRequest** | [**PatchedEndpointRequest**](PatchedEndpointRequest.md)|  | [optional]

### Return type

[**Endpoint**](Endpoint.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="racEndpointsRetrieve"></a>
# **racEndpointsRetrieve**
> Endpoint racEndpointsRetrieve(pbmUuid)



Endpoint Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RacApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this RAC Endpoint.
try {
    val result : Endpoint = apiInstance.racEndpointsRetrieve(pbmUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RacApi#racEndpointsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RacApi#racEndpointsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this RAC Endpoint. |

### Return type

[**Endpoint**](Endpoint.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="racEndpointsUpdate"></a>
# **racEndpointsUpdate**
> Endpoint racEndpointsUpdate(pbmUuid, endpointRequest)



Endpoint Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RacApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this RAC Endpoint.
val endpointRequest : EndpointRequest =  // EndpointRequest | 
try {
    val result : Endpoint = apiInstance.racEndpointsUpdate(pbmUuid, endpointRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RacApi#racEndpointsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RacApi#racEndpointsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this RAC Endpoint. |
 **endpointRequest** | [**EndpointRequest**](EndpointRequest.md)|  |

### Return type

[**Endpoint**](Endpoint.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="racEndpointsUsedByList"></a>
# **racEndpointsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; racEndpointsUsedByList(pbmUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RacApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this RAC Endpoint.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.racEndpointsUsedByList(pbmUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RacApi#racEndpointsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RacApi#racEndpointsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this RAC Endpoint. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

