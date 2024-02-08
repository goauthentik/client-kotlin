# AdminApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAppsList**](AdminApi.md#adminAppsList) | **GET** /admin/apps/ | 
[**adminMetricsRetrieve**](AdminApi.md#adminMetricsRetrieve) | **GET** /admin/metrics/ | 
[**adminModelsList**](AdminApi.md#adminModelsList) | **GET** /admin/models/ | 
[**adminSettingsPartialUpdate**](AdminApi.md#adminSettingsPartialUpdate) | **PATCH** /admin/settings/ | 
[**adminSettingsRetrieve**](AdminApi.md#adminSettingsRetrieve) | **GET** /admin/settings/ | 
[**adminSettingsUpdate**](AdminApi.md#adminSettingsUpdate) | **PUT** /admin/settings/ | 
[**adminSystemCreate**](AdminApi.md#adminSystemCreate) | **POST** /admin/system/ | 
[**adminSystemRetrieve**](AdminApi.md#adminSystemRetrieve) | **GET** /admin/system/ | 
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

<a id="adminSettingsPartialUpdate"></a>
# **adminSettingsPartialUpdate**
> Settings adminSettingsPartialUpdate(patchedSettingsRequest)



Settings view

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
val patchedSettingsRequest : PatchedSettingsRequest =  // PatchedSettingsRequest | 
try {
    val result : Settings = apiInstance.adminSettingsPartialUpdate(patchedSettingsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminSettingsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminSettingsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patchedSettingsRequest** | [**PatchedSettingsRequest**](PatchedSettingsRequest.md)|  | [optional]

### Return type

[**Settings**](Settings.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="adminSettingsRetrieve"></a>
# **adminSettingsRetrieve**
> Settings adminSettingsRetrieve()



Settings view

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : Settings = apiInstance.adminSettingsRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminSettingsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminSettingsRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Settings**](Settings.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminSettingsUpdate"></a>
# **adminSettingsUpdate**
> Settings adminSettingsUpdate(settingsRequest)



Settings view

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
val settingsRequest : SettingsRequest =  // SettingsRequest | 
try {
    val result : Settings = apiInstance.adminSettingsUpdate(settingsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminApi#adminSettingsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminApi#adminSettingsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsRequest** | [**SettingsRequest**](SettingsRequest.md)|  | [optional]

### Return type

[**Settings**](Settings.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="adminSystemCreate"></a>
# **adminSystemCreate**
> SystemInfo adminSystemCreate()



Get system information.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : SystemInfo = apiInstance.adminSystemCreate()
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

[**SystemInfo**](SystemInfo.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminSystemRetrieve"></a>
# **adminSystemRetrieve**
> SystemInfo adminSystemRetrieve()



Get system information.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = AdminApi()
try {
    val result : SystemInfo = apiInstance.adminSystemRetrieve()
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

[**SystemInfo**](SystemInfo.md)

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

