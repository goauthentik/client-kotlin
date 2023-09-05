# CryptoApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cryptoCertificatekeypairsCreate**](CryptoApi.md#cryptoCertificatekeypairsCreate) | **POST** /crypto/certificatekeypairs/ | 
[**cryptoCertificatekeypairsDestroy**](CryptoApi.md#cryptoCertificatekeypairsDestroy) | **DELETE** /crypto/certificatekeypairs/{kp_uuid}/ | 
[**cryptoCertificatekeypairsGenerateCreate**](CryptoApi.md#cryptoCertificatekeypairsGenerateCreate) | **POST** /crypto/certificatekeypairs/generate/ | 
[**cryptoCertificatekeypairsList**](CryptoApi.md#cryptoCertificatekeypairsList) | **GET** /crypto/certificatekeypairs/ | 
[**cryptoCertificatekeypairsPartialUpdate**](CryptoApi.md#cryptoCertificatekeypairsPartialUpdate) | **PATCH** /crypto/certificatekeypairs/{kp_uuid}/ | 
[**cryptoCertificatekeypairsRetrieve**](CryptoApi.md#cryptoCertificatekeypairsRetrieve) | **GET** /crypto/certificatekeypairs/{kp_uuid}/ | 
[**cryptoCertificatekeypairsUpdate**](CryptoApi.md#cryptoCertificatekeypairsUpdate) | **PUT** /crypto/certificatekeypairs/{kp_uuid}/ | 
[**cryptoCertificatekeypairsUsedByList**](CryptoApi.md#cryptoCertificatekeypairsUsedByList) | **GET** /crypto/certificatekeypairs/{kp_uuid}/used_by/ | 
[**cryptoCertificatekeypairsViewCertificateRetrieve**](CryptoApi.md#cryptoCertificatekeypairsViewCertificateRetrieve) | **GET** /crypto/certificatekeypairs/{kp_uuid}/view_certificate/ | 
[**cryptoCertificatekeypairsViewPrivateKeyRetrieve**](CryptoApi.md#cryptoCertificatekeypairsViewPrivateKeyRetrieve) | **GET** /crypto/certificatekeypairs/{kp_uuid}/view_private_key/ | 


<a name="cryptoCertificatekeypairsCreate"></a>
# **cryptoCertificatekeypairsCreate**
> CertificateKeyPair cryptoCertificatekeypairsCreate(certificateKeyPairRequest)



CertificateKeyPair Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val certificateKeyPairRequest : CertificateKeyPairRequest =  // CertificateKeyPairRequest | 
try {
    val result : CertificateKeyPair = apiInstance.cryptoCertificatekeypairsCreate(certificateKeyPairRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateKeyPairRequest** | [**CertificateKeyPairRequest**](CertificateKeyPairRequest.md)|  |

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cryptoCertificatekeypairsDestroy"></a>
# **cryptoCertificatekeypairsDestroy**
> cryptoCertificatekeypairsDestroy(kpUuid)



CertificateKeyPair Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val kpUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Certificate-Key Pair.
try {
    apiInstance.cryptoCertificatekeypairsDestroy(kpUuid)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kpUuid** | **java.util.UUID**| A UUID string identifying this Certificate-Key Pair. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cryptoCertificatekeypairsGenerateCreate"></a>
# **cryptoCertificatekeypairsGenerateCreate**
> CertificateKeyPair cryptoCertificatekeypairsGenerateCreate(certificateGenerationRequest)



Generate a new, self-signed certificate-key pair

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val certificateGenerationRequest : CertificateGenerationRequest =  // CertificateGenerationRequest | 
try {
    val result : CertificateKeyPair = apiInstance.cryptoCertificatekeypairsGenerateCreate(certificateGenerationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsGenerateCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsGenerateCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateGenerationRequest** | [**CertificateGenerationRequest**](CertificateGenerationRequest.md)|  |

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cryptoCertificatekeypairsList"></a>
# **cryptoCertificatekeypairsList**
> PaginatedCertificateKeyPairList cryptoCertificatekeypairsList(hasKey, includeDetails, managed, name, ordering, page, pageSize, search)



CertificateKeyPair Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val hasKey : kotlin.Boolean = true // kotlin.Boolean | Only return certificate-key pairs with keys
val includeDetails : kotlin.Boolean = true // kotlin.Boolean | 
val managed : kotlin.String = managed_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedCertificateKeyPairList = apiInstance.cryptoCertificatekeypairsList(hasKey, includeDetails, managed, name, ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hasKey** | **kotlin.Boolean**| Only return certificate-key pairs with keys | [optional]
 **includeDetails** | **kotlin.Boolean**|  | [optional] [default to true]
 **managed** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedCertificateKeyPairList**](PaginatedCertificateKeyPairList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cryptoCertificatekeypairsPartialUpdate"></a>
# **cryptoCertificatekeypairsPartialUpdate**
> CertificateKeyPair cryptoCertificatekeypairsPartialUpdate(kpUuid, patchedCertificateKeyPairRequest)



CertificateKeyPair Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val kpUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Certificate-Key Pair.
val patchedCertificateKeyPairRequest : PatchedCertificateKeyPairRequest =  // PatchedCertificateKeyPairRequest | 
try {
    val result : CertificateKeyPair = apiInstance.cryptoCertificatekeypairsPartialUpdate(kpUuid, patchedCertificateKeyPairRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kpUuid** | **java.util.UUID**| A UUID string identifying this Certificate-Key Pair. |
 **patchedCertificateKeyPairRequest** | [**PatchedCertificateKeyPairRequest**](PatchedCertificateKeyPairRequest.md)|  | [optional]

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cryptoCertificatekeypairsRetrieve"></a>
# **cryptoCertificatekeypairsRetrieve**
> CertificateKeyPair cryptoCertificatekeypairsRetrieve(kpUuid)



CertificateKeyPair Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val kpUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Certificate-Key Pair.
try {
    val result : CertificateKeyPair = apiInstance.cryptoCertificatekeypairsRetrieve(kpUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kpUuid** | **java.util.UUID**| A UUID string identifying this Certificate-Key Pair. |

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cryptoCertificatekeypairsUpdate"></a>
# **cryptoCertificatekeypairsUpdate**
> CertificateKeyPair cryptoCertificatekeypairsUpdate(kpUuid, certificateKeyPairRequest)



CertificateKeyPair Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val kpUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Certificate-Key Pair.
val certificateKeyPairRequest : CertificateKeyPairRequest =  // CertificateKeyPairRequest | 
try {
    val result : CertificateKeyPair = apiInstance.cryptoCertificatekeypairsUpdate(kpUuid, certificateKeyPairRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kpUuid** | **java.util.UUID**| A UUID string identifying this Certificate-Key Pair. |
 **certificateKeyPairRequest** | [**CertificateKeyPairRequest**](CertificateKeyPairRequest.md)|  |

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cryptoCertificatekeypairsUsedByList"></a>
# **cryptoCertificatekeypairsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; cryptoCertificatekeypairsUsedByList(kpUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val kpUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Certificate-Key Pair.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.cryptoCertificatekeypairsUsedByList(kpUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kpUuid** | **java.util.UUID**| A UUID string identifying this Certificate-Key Pair. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cryptoCertificatekeypairsViewCertificateRetrieve"></a>
# **cryptoCertificatekeypairsViewCertificateRetrieve**
> CertificateData cryptoCertificatekeypairsViewCertificateRetrieve(kpUuid, download)



Return certificate-key pairs certificate and log access

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val kpUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Certificate-Key Pair.
val download : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : CertificateData = apiInstance.cryptoCertificatekeypairsViewCertificateRetrieve(kpUuid, download)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsViewCertificateRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsViewCertificateRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kpUuid** | **java.util.UUID**| A UUID string identifying this Certificate-Key Pair. |
 **download** | **kotlin.Boolean**|  | [optional]

### Return type

[**CertificateData**](CertificateData.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cryptoCertificatekeypairsViewPrivateKeyRetrieve"></a>
# **cryptoCertificatekeypairsViewPrivateKeyRetrieve**
> CertificateData cryptoCertificatekeypairsViewPrivateKeyRetrieve(kpUuid, download)



Return certificate-key pairs private key and log access

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = CryptoApi()
val kpUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Certificate-Key Pair.
val download : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : CertificateData = apiInstance.cryptoCertificatekeypairsViewPrivateKeyRetrieve(kpUuid, download)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CryptoApi#cryptoCertificatekeypairsViewPrivateKeyRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CryptoApi#cryptoCertificatekeypairsViewPrivateKeyRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kpUuid** | **java.util.UUID**| A UUID string identifying this Certificate-Key Pair. |
 **download** | **kotlin.Boolean**|  | [optional]

### Return type

[**CertificateData**](CertificateData.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

