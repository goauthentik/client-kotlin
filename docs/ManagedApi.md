# ManagedApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**managedBlueprintsApplyCreate**](ManagedApi.md#managedBlueprintsApplyCreate) | **POST** /managed/blueprints/{instance_uuid}/apply/ | 
[**managedBlueprintsAvailableList**](ManagedApi.md#managedBlueprintsAvailableList) | **GET** /managed/blueprints/available/ | 
[**managedBlueprintsCreate**](ManagedApi.md#managedBlueprintsCreate) | **POST** /managed/blueprints/ | 
[**managedBlueprintsDestroy**](ManagedApi.md#managedBlueprintsDestroy) | **DELETE** /managed/blueprints/{instance_uuid}/ | 
[**managedBlueprintsList**](ManagedApi.md#managedBlueprintsList) | **GET** /managed/blueprints/ | 
[**managedBlueprintsPartialUpdate**](ManagedApi.md#managedBlueprintsPartialUpdate) | **PATCH** /managed/blueprints/{instance_uuid}/ | 
[**managedBlueprintsRetrieve**](ManagedApi.md#managedBlueprintsRetrieve) | **GET** /managed/blueprints/{instance_uuid}/ | 
[**managedBlueprintsUpdate**](ManagedApi.md#managedBlueprintsUpdate) | **PUT** /managed/blueprints/{instance_uuid}/ | 
[**managedBlueprintsUsedByList**](ManagedApi.md#managedBlueprintsUsedByList) | **GET** /managed/blueprints/{instance_uuid}/used_by/ | 


<a id="managedBlueprintsApplyCreate"></a>
# **managedBlueprintsApplyCreate**
> BlueprintInstance managedBlueprintsApplyCreate(instanceUuid)



Apply a blueprint

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ManagedApi()
val instanceUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Blueprint Instance.
try {
    val result : BlueprintInstance = apiInstance.managedBlueprintsApplyCreate(instanceUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#managedBlueprintsApplyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#managedBlueprintsApplyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceUuid** | **java.util.UUID**| A UUID string identifying this Blueprint Instance. |

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="managedBlueprintsAvailableList"></a>
# **managedBlueprintsAvailableList**
> kotlin.collections.List&lt;BlueprintFile&gt; managedBlueprintsAvailableList()



Get blueprints

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ManagedApi()
try {
    val result : kotlin.collections.List<BlueprintFile> = apiInstance.managedBlueprintsAvailableList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#managedBlueprintsAvailableList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#managedBlueprintsAvailableList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;BlueprintFile&gt;**](BlueprintFile.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="managedBlueprintsCreate"></a>
# **managedBlueprintsCreate**
> BlueprintInstance managedBlueprintsCreate(blueprintInstanceRequest)



Blueprint instances

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ManagedApi()
val blueprintInstanceRequest : BlueprintInstanceRequest =  // BlueprintInstanceRequest | 
try {
    val result : BlueprintInstance = apiInstance.managedBlueprintsCreate(blueprintInstanceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#managedBlueprintsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#managedBlueprintsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blueprintInstanceRequest** | [**BlueprintInstanceRequest**](BlueprintInstanceRequest.md)|  |

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="managedBlueprintsDestroy"></a>
# **managedBlueprintsDestroy**
> managedBlueprintsDestroy(instanceUuid)



Blueprint instances

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ManagedApi()
val instanceUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Blueprint Instance.
try {
    apiInstance.managedBlueprintsDestroy(instanceUuid)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#managedBlueprintsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#managedBlueprintsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceUuid** | **java.util.UUID**| A UUID string identifying this Blueprint Instance. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="managedBlueprintsList"></a>
# **managedBlueprintsList**
> PaginatedBlueprintInstanceList managedBlueprintsList(name, ordering, page, pageSize, path, search)



Blueprint instances

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ManagedApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val path : kotlin.String = path_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedBlueprintInstanceList = apiInstance.managedBlueprintsList(name, ordering, page, pageSize, path, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#managedBlueprintsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#managedBlueprintsList")
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
 **path** | **kotlin.String**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedBlueprintInstanceList**](PaginatedBlueprintInstanceList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="managedBlueprintsPartialUpdate"></a>
# **managedBlueprintsPartialUpdate**
> BlueprintInstance managedBlueprintsPartialUpdate(instanceUuid, patchedBlueprintInstanceRequest)



Blueprint instances

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ManagedApi()
val instanceUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Blueprint Instance.
val patchedBlueprintInstanceRequest : PatchedBlueprintInstanceRequest =  // PatchedBlueprintInstanceRequest | 
try {
    val result : BlueprintInstance = apiInstance.managedBlueprintsPartialUpdate(instanceUuid, patchedBlueprintInstanceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#managedBlueprintsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#managedBlueprintsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceUuid** | **java.util.UUID**| A UUID string identifying this Blueprint Instance. |
 **patchedBlueprintInstanceRequest** | [**PatchedBlueprintInstanceRequest**](PatchedBlueprintInstanceRequest.md)|  | [optional]

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="managedBlueprintsRetrieve"></a>
# **managedBlueprintsRetrieve**
> BlueprintInstance managedBlueprintsRetrieve(instanceUuid)



Blueprint instances

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ManagedApi()
val instanceUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Blueprint Instance.
try {
    val result : BlueprintInstance = apiInstance.managedBlueprintsRetrieve(instanceUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#managedBlueprintsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#managedBlueprintsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceUuid** | **java.util.UUID**| A UUID string identifying this Blueprint Instance. |

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="managedBlueprintsUpdate"></a>
# **managedBlueprintsUpdate**
> BlueprintInstance managedBlueprintsUpdate(instanceUuid, blueprintInstanceRequest)



Blueprint instances

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ManagedApi()
val instanceUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Blueprint Instance.
val blueprintInstanceRequest : BlueprintInstanceRequest =  // BlueprintInstanceRequest | 
try {
    val result : BlueprintInstance = apiInstance.managedBlueprintsUpdate(instanceUuid, blueprintInstanceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#managedBlueprintsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#managedBlueprintsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceUuid** | **java.util.UUID**| A UUID string identifying this Blueprint Instance. |
 **blueprintInstanceRequest** | [**BlueprintInstanceRequest**](BlueprintInstanceRequest.md)|  |

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="managedBlueprintsUsedByList"></a>
# **managedBlueprintsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; managedBlueprintsUsedByList(instanceUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = ManagedApi()
val instanceUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Blueprint Instance.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.managedBlueprintsUsedByList(instanceUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#managedBlueprintsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#managedBlueprintsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceUuid** | **java.util.UUID**| A UUID string identifying this Blueprint Instance. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

