# EnterpriseApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseLicenseCreate**](EnterpriseApi.md#enterpriseLicenseCreate) | **POST** /enterprise/license/ | 
[**enterpriseLicenseDestroy**](EnterpriseApi.md#enterpriseLicenseDestroy) | **DELETE** /enterprise/license/{license_uuid}/ | 
[**enterpriseLicenseForecastRetrieve**](EnterpriseApi.md#enterpriseLicenseForecastRetrieve) | **GET** /enterprise/license/forecast/ | 
[**enterpriseLicenseGetInstallIdRetrieve**](EnterpriseApi.md#enterpriseLicenseGetInstallIdRetrieve) | **GET** /enterprise/license/get_install_id/ | 
[**enterpriseLicenseList**](EnterpriseApi.md#enterpriseLicenseList) | **GET** /enterprise/license/ | 
[**enterpriseLicensePartialUpdate**](EnterpriseApi.md#enterpriseLicensePartialUpdate) | **PATCH** /enterprise/license/{license_uuid}/ | 
[**enterpriseLicenseRetrieve**](EnterpriseApi.md#enterpriseLicenseRetrieve) | **GET** /enterprise/license/{license_uuid}/ | 
[**enterpriseLicenseSummaryRetrieve**](EnterpriseApi.md#enterpriseLicenseSummaryRetrieve) | **GET** /enterprise/license/summary/ | 
[**enterpriseLicenseUpdate**](EnterpriseApi.md#enterpriseLicenseUpdate) | **PUT** /enterprise/license/{license_uuid}/ | 
[**enterpriseLicenseUsedByList**](EnterpriseApi.md#enterpriseLicenseUsedByList) | **GET** /enterprise/license/{license_uuid}/used_by/ | 


<a name="enterpriseLicenseCreate"></a>
# **enterpriseLicenseCreate**
> License enterpriseLicenseCreate(licenseRequest)



License Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
val licenseRequest : LicenseRequest =  // LicenseRequest | 
try {
    val result : License = apiInstance.enterpriseLicenseCreate(licenseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicenseCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicenseCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseRequest** | [**LicenseRequest**](LicenseRequest.md)|  |

### Return type

[**License**](License.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enterpriseLicenseDestroy"></a>
# **enterpriseLicenseDestroy**
> enterpriseLicenseDestroy(licenseUuid)



License Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
val licenseUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this license.
try {
    apiInstance.enterpriseLicenseDestroy(licenseUuid)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicenseDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicenseDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseUuid** | **java.util.UUID**| A UUID string identifying this license. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLicenseForecastRetrieve"></a>
# **enterpriseLicenseForecastRetrieve**
> LicenseForecast enterpriseLicenseForecastRetrieve()



Forecast how many users will be required in a year

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
try {
    val result : LicenseForecast = apiInstance.enterpriseLicenseForecastRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicenseForecastRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicenseForecastRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicenseForecast**](LicenseForecast.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLicenseGetInstallIdRetrieve"></a>
# **enterpriseLicenseGetInstallIdRetrieve**
> InstallID enterpriseLicenseGetInstallIdRetrieve()



Get install_id

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
try {
    val result : InstallID = apiInstance.enterpriseLicenseGetInstallIdRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicenseGetInstallIdRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicenseGetInstallIdRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstallID**](InstallID.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLicenseList"></a>
# **enterpriseLicenseList**
> PaginatedLicenseList enterpriseLicenseList(name, ordering, page, pageSize, search)



License Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedLicenseList = apiInstance.enterpriseLicenseList(name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicenseList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicenseList")
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

[**PaginatedLicenseList**](PaginatedLicenseList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLicensePartialUpdate"></a>
# **enterpriseLicensePartialUpdate**
> License enterpriseLicensePartialUpdate(licenseUuid, patchedLicenseRequest)



License Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
val licenseUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this license.
val patchedLicenseRequest : PatchedLicenseRequest =  // PatchedLicenseRequest | 
try {
    val result : License = apiInstance.enterpriseLicensePartialUpdate(licenseUuid, patchedLicenseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicensePartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicensePartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseUuid** | **java.util.UUID**| A UUID string identifying this license. |
 **patchedLicenseRequest** | [**PatchedLicenseRequest**](PatchedLicenseRequest.md)|  | [optional]

### Return type

[**License**](License.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enterpriseLicenseRetrieve"></a>
# **enterpriseLicenseRetrieve**
> License enterpriseLicenseRetrieve(licenseUuid)



License Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
val licenseUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this license.
try {
    val result : License = apiInstance.enterpriseLicenseRetrieve(licenseUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicenseRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicenseRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseUuid** | **java.util.UUID**| A UUID string identifying this license. |

### Return type

[**License**](License.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLicenseSummaryRetrieve"></a>
# **enterpriseLicenseSummaryRetrieve**
> LicenseSummary enterpriseLicenseSummaryRetrieve()



Get the total license status

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
try {
    val result : LicenseSummary = apiInstance.enterpriseLicenseSummaryRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicenseSummaryRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicenseSummaryRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicenseSummary**](LicenseSummary.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLicenseUpdate"></a>
# **enterpriseLicenseUpdate**
> License enterpriseLicenseUpdate(licenseUuid, licenseRequest)



License Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
val licenseUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this license.
val licenseRequest : LicenseRequest =  // LicenseRequest | 
try {
    val result : License = apiInstance.enterpriseLicenseUpdate(licenseUuid, licenseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicenseUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicenseUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseUuid** | **java.util.UUID**| A UUID string identifying this license. |
 **licenseRequest** | [**LicenseRequest**](LicenseRequest.md)|  |

### Return type

[**License**](License.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enterpriseLicenseUsedByList"></a>
# **enterpriseLicenseUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; enterpriseLicenseUsedByList(licenseUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EnterpriseApi()
val licenseUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this license.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.enterpriseLicenseUsedByList(licenseUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnterpriseApi#enterpriseLicenseUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnterpriseApi#enterpriseLicenseUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseUuid** | **java.util.UUID**| A UUID string identifying this license. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

