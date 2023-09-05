# Oauth2Api

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth2AccessTokensDestroy**](Oauth2Api.md#oauth2AccessTokensDestroy) | **DELETE** /oauth2/access_tokens/{id}/ | 
[**oauth2AccessTokensList**](Oauth2Api.md#oauth2AccessTokensList) | **GET** /oauth2/access_tokens/ | 
[**oauth2AccessTokensRetrieve**](Oauth2Api.md#oauth2AccessTokensRetrieve) | **GET** /oauth2/access_tokens/{id}/ | 
[**oauth2AccessTokensUsedByList**](Oauth2Api.md#oauth2AccessTokensUsedByList) | **GET** /oauth2/access_tokens/{id}/used_by/ | 
[**oauth2AuthorizationCodesDestroy**](Oauth2Api.md#oauth2AuthorizationCodesDestroy) | **DELETE** /oauth2/authorization_codes/{id}/ | 
[**oauth2AuthorizationCodesList**](Oauth2Api.md#oauth2AuthorizationCodesList) | **GET** /oauth2/authorization_codes/ | 
[**oauth2AuthorizationCodesRetrieve**](Oauth2Api.md#oauth2AuthorizationCodesRetrieve) | **GET** /oauth2/authorization_codes/{id}/ | 
[**oauth2AuthorizationCodesUsedByList**](Oauth2Api.md#oauth2AuthorizationCodesUsedByList) | **GET** /oauth2/authorization_codes/{id}/used_by/ | 
[**oauth2RefreshTokensDestroy**](Oauth2Api.md#oauth2RefreshTokensDestroy) | **DELETE** /oauth2/refresh_tokens/{id}/ | 
[**oauth2RefreshTokensList**](Oauth2Api.md#oauth2RefreshTokensList) | **GET** /oauth2/refresh_tokens/ | 
[**oauth2RefreshTokensRetrieve**](Oauth2Api.md#oauth2RefreshTokensRetrieve) | **GET** /oauth2/refresh_tokens/{id}/ | 
[**oauth2RefreshTokensUsedByList**](Oauth2Api.md#oauth2RefreshTokensUsedByList) | **GET** /oauth2/refresh_tokens/{id}/used_by/ | 


<a name="oauth2AccessTokensDestroy"></a>
# **oauth2AccessTokensDestroy**
> oauth2AccessTokensDestroy(id)



AccessToken Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2 Access Token.
try {
    apiInstance.oauth2AccessTokensDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AccessTokensDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AccessTokensDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2 Access Token. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2AccessTokensList"></a>
# **oauth2AccessTokensList**
> PaginatedTokenModelList oauth2AccessTokensList(ordering, page, pageSize, provider, search, user)



AccessToken Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val provider : kotlin.Int = 56 // kotlin.Int | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val user : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedTokenModelList = apiInstance.oauth2AccessTokensList(ordering, page, pageSize, provider, search, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AccessTokensList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AccessTokensList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **provider** | **kotlin.Int**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **user** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedTokenModelList**](PaginatedTokenModelList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2AccessTokensRetrieve"></a>
# **oauth2AccessTokensRetrieve**
> TokenModel oauth2AccessTokensRetrieve(id)



AccessToken Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2 Access Token.
try {
    val result : TokenModel = apiInstance.oauth2AccessTokensRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AccessTokensRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AccessTokensRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2 Access Token. |

### Return type

[**TokenModel**](TokenModel.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2AccessTokensUsedByList"></a>
# **oauth2AccessTokensUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; oauth2AccessTokensUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2 Access Token.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.oauth2AccessTokensUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AccessTokensUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AccessTokensUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2 Access Token. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2AuthorizationCodesDestroy"></a>
# **oauth2AuthorizationCodesDestroy**
> oauth2AuthorizationCodesDestroy(id)



AuthorizationCode Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Authorization Code.
try {
    apiInstance.oauth2AuthorizationCodesDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AuthorizationCodesDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AuthorizationCodesDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Authorization Code. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2AuthorizationCodesList"></a>
# **oauth2AuthorizationCodesList**
> PaginatedExpiringBaseGrantModelList oauth2AuthorizationCodesList(ordering, page, pageSize, provider, search, user)



AuthorizationCode Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val provider : kotlin.Int = 56 // kotlin.Int | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val user : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedExpiringBaseGrantModelList = apiInstance.oauth2AuthorizationCodesList(ordering, page, pageSize, provider, search, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AuthorizationCodesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AuthorizationCodesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **provider** | **kotlin.Int**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **user** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedExpiringBaseGrantModelList**](PaginatedExpiringBaseGrantModelList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2AuthorizationCodesRetrieve"></a>
# **oauth2AuthorizationCodesRetrieve**
> ExpiringBaseGrantModel oauth2AuthorizationCodesRetrieve(id)



AuthorizationCode Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Authorization Code.
try {
    val result : ExpiringBaseGrantModel = apiInstance.oauth2AuthorizationCodesRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AuthorizationCodesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AuthorizationCodesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Authorization Code. |

### Return type

[**ExpiringBaseGrantModel**](ExpiringBaseGrantModel.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2AuthorizationCodesUsedByList"></a>
# **oauth2AuthorizationCodesUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; oauth2AuthorizationCodesUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Authorization Code.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.oauth2AuthorizationCodesUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AuthorizationCodesUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AuthorizationCodesUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Authorization Code. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2RefreshTokensDestroy"></a>
# **oauth2RefreshTokensDestroy**
> oauth2RefreshTokensDestroy(id)



RefreshToken Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2 Refresh Token.
try {
    apiInstance.oauth2RefreshTokensDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2RefreshTokensDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2RefreshTokensDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2 Refresh Token. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2RefreshTokensList"></a>
# **oauth2RefreshTokensList**
> PaginatedTokenModelList oauth2RefreshTokensList(ordering, page, pageSize, provider, search, user)



RefreshToken Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val provider : kotlin.Int = 56 // kotlin.Int | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val user : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedTokenModelList = apiInstance.oauth2RefreshTokensList(ordering, page, pageSize, provider, search, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2RefreshTokensList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2RefreshTokensList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **provider** | **kotlin.Int**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **user** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedTokenModelList**](PaginatedTokenModelList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2RefreshTokensRetrieve"></a>
# **oauth2RefreshTokensRetrieve**
> TokenModel oauth2RefreshTokensRetrieve(id)



RefreshToken Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2 Refresh Token.
try {
    val result : TokenModel = apiInstance.oauth2RefreshTokensRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2RefreshTokensRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2RefreshTokensRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2 Refresh Token. |

### Return type

[**TokenModel**](TokenModel.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2RefreshTokensUsedByList"></a>
# **oauth2RefreshTokensUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; oauth2RefreshTokensUsedByList(id)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this OAuth2 Refresh Token.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.oauth2RefreshTokensUsedByList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2RefreshTokensUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2RefreshTokensUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this OAuth2 Refresh Token. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

