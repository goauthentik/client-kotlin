# AdminApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAppsList**](AdminApi.md#adminAppsList) | **GET** /admin/apps/ | 
[**adminMetricsRetrieve**](AdminApi.md#adminMetricsRetrieve) | **GET** /admin/metrics/ | 
[**adminModelsList**](AdminApi.md#adminModelsList) | **GET** /admin/models/ | 
[**adminSystemCreate**](AdminApi.md#adminSystemCreate) | **POST** /admin/system/ | 
[**adminSystemRetrieve**](AdminApi.md#adminSystemRetrieve) | **GET** /admin/system/ | 
[**adminSystemTasksList**](AdminApi.md#adminSystemTasksList) | **GET** /admin/system_tasks/ | 
[**adminSystemTasksRetrieve**](AdminApi.md#adminSystemTasksRetrieve) | **GET** /admin/system_tasks/{id}/ | 
[**adminSystemTasksRetryCreate**](AdminApi.md#adminSystemTasksRetryCreate) | **POST** /admin/system_tasks/{id}/retry/ | 
[**adminVersionRetrieve**](AdminApi.md#adminVersionRetrieve) | **GET** /admin/version/ | 
[**adminWorkersRetrieve**](AdminApi.md#adminWorkersRetrieve) | **GET** /admin/workers/ | 


<a id="adminAppsList"></a>
# **adminAppsList**
> kotlin.collections.List&lt;App&gt; adminAppsList()



Read-only view list all installed apps

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : kotlin.collections.List<App> = apiInstance.adminAppsList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminAppsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminAppsList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;App&gt;**](App.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminMetricsRetrieve"></a>
# **adminMetricsRetrieve**
> LoginMetrics adminMetricsRetrieve()



Login Metrics per 1h

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : LoginMetrics = apiInstance.adminMetricsRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminMetricsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminMetricsRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoginMetrics**](LoginMetrics.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminModelsList"></a>
# **adminModelsList**
> kotlin.collections.List&lt;App&gt; adminModelsList()



Read-only view list all installed models

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : kotlin.collections.List<App> = apiInstance.adminModelsList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminModelsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminModelsList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;App&gt;**](App.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminSystemCreate"></a>
# **adminSystemCreate**
> System adminSystemCreate()



Get system information.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : System = apiInstance.adminSystemCreate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminSystemCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminSystemCreate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**System**](System.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminSystemRetrieve"></a>
# **adminSystemRetrieve**
> System adminSystemRetrieve()



Get system information.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : System = apiInstance.adminSystemRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminSystemRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminSystemRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**System**](System.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminSystemTasksList"></a>
# **adminSystemTasksList**
> kotlin.collections.List&lt;Task&gt; adminSystemTasksList()



List system tasks

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : kotlin.collections.List<Task> = apiInstance.adminSystemTasksList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminSystemTasksList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminSystemTasksList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Task&gt;**](Task.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminSystemTasksRetrieve"></a>
# **adminSystemTasksRetrieve**
> Task adminSystemTasksRetrieve(id)



Get a single system task

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : Task = apiInstance.adminSystemTasksRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminSystemTasksRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminSystemTasksRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**Task**](Task.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminSystemTasksRetryCreate"></a>
# **adminSystemTasksRetryCreate**
> adminSystemTasksRetryCreate(id)



Retry task

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    apiInstance.adminSystemTasksRetryCreate(id)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminSystemTasksRetryCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminSystemTasksRetryCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminVersionRetrieve"></a>
# **adminVersionRetrieve**
> Version adminVersionRetrieve()



Get running and latest version.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : Version = apiInstance.adminVersionRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminVersionRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminVersionRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Version**](Version.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminWorkersRetrieve"></a>
# **adminWorkersRetrieve**
> Workers adminWorkersRetrieve()



Get currently connected worker count.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : Workers = apiInstance.adminWorkersRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminWorkersRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminWorkersRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Workers**](Workers.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

