# RootApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rootConfigRetrieve**](RootApi.md#rootConfigRetrieve) | **GET** /root/config/ | 


<a id="rootConfigRetrieve"></a>
# **rootConfigRetrieve**
> Config rootConfigRetrieve()



Retrieve public configuration options

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = RootApi()
try {
    val result : Config = apiInstance.rootConfigRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RootApi#rootConfigRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RootApi#rootConfigRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Config**](Config.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

