# PoliciesApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**policiesAllCacheClearCreate**](PoliciesApi.md#policiesAllCacheClearCreate) | **POST** /policies/all/cache_clear/ | 
[**policiesAllCacheInfoRetrieve**](PoliciesApi.md#policiesAllCacheInfoRetrieve) | **GET** /policies/all/cache_info/ | 
[**policiesAllDestroy**](PoliciesApi.md#policiesAllDestroy) | **DELETE** /policies/all/{policy_uuid}/ | 
[**policiesAllList**](PoliciesApi.md#policiesAllList) | **GET** /policies/all/ | 
[**policiesAllRetrieve**](PoliciesApi.md#policiesAllRetrieve) | **GET** /policies/all/{policy_uuid}/ | 
[**policiesAllTestCreate**](PoliciesApi.md#policiesAllTestCreate) | **POST** /policies/all/{policy_uuid}/test/ | 
[**policiesAllTypesList**](PoliciesApi.md#policiesAllTypesList) | **GET** /policies/all/types/ | 
[**policiesAllUsedByList**](PoliciesApi.md#policiesAllUsedByList) | **GET** /policies/all/{policy_uuid}/used_by/ | 
[**policiesBindingsCreate**](PoliciesApi.md#policiesBindingsCreate) | **POST** /policies/bindings/ | 
[**policiesBindingsDestroy**](PoliciesApi.md#policiesBindingsDestroy) | **DELETE** /policies/bindings/{policy_binding_uuid}/ | 
[**policiesBindingsList**](PoliciesApi.md#policiesBindingsList) | **GET** /policies/bindings/ | 
[**policiesBindingsPartialUpdate**](PoliciesApi.md#policiesBindingsPartialUpdate) | **PATCH** /policies/bindings/{policy_binding_uuid}/ | 
[**policiesBindingsRetrieve**](PoliciesApi.md#policiesBindingsRetrieve) | **GET** /policies/bindings/{policy_binding_uuid}/ | 
[**policiesBindingsUpdate**](PoliciesApi.md#policiesBindingsUpdate) | **PUT** /policies/bindings/{policy_binding_uuid}/ | 
[**policiesBindingsUsedByList**](PoliciesApi.md#policiesBindingsUsedByList) | **GET** /policies/bindings/{policy_binding_uuid}/used_by/ | 
[**policiesDummyCreate**](PoliciesApi.md#policiesDummyCreate) | **POST** /policies/dummy/ | 
[**policiesDummyDestroy**](PoliciesApi.md#policiesDummyDestroy) | **DELETE** /policies/dummy/{policy_uuid}/ | 
[**policiesDummyList**](PoliciesApi.md#policiesDummyList) | **GET** /policies/dummy/ | 
[**policiesDummyPartialUpdate**](PoliciesApi.md#policiesDummyPartialUpdate) | **PATCH** /policies/dummy/{policy_uuid}/ | 
[**policiesDummyRetrieve**](PoliciesApi.md#policiesDummyRetrieve) | **GET** /policies/dummy/{policy_uuid}/ | 
[**policiesDummyUpdate**](PoliciesApi.md#policiesDummyUpdate) | **PUT** /policies/dummy/{policy_uuid}/ | 
[**policiesDummyUsedByList**](PoliciesApi.md#policiesDummyUsedByList) | **GET** /policies/dummy/{policy_uuid}/used_by/ | 
[**policiesEventMatcherCreate**](PoliciesApi.md#policiesEventMatcherCreate) | **POST** /policies/event_matcher/ | 
[**policiesEventMatcherDestroy**](PoliciesApi.md#policiesEventMatcherDestroy) | **DELETE** /policies/event_matcher/{policy_uuid}/ | 
[**policiesEventMatcherList**](PoliciesApi.md#policiesEventMatcherList) | **GET** /policies/event_matcher/ | 
[**policiesEventMatcherPartialUpdate**](PoliciesApi.md#policiesEventMatcherPartialUpdate) | **PATCH** /policies/event_matcher/{policy_uuid}/ | 
[**policiesEventMatcherRetrieve**](PoliciesApi.md#policiesEventMatcherRetrieve) | **GET** /policies/event_matcher/{policy_uuid}/ | 
[**policiesEventMatcherUpdate**](PoliciesApi.md#policiesEventMatcherUpdate) | **PUT** /policies/event_matcher/{policy_uuid}/ | 
[**policiesEventMatcherUsedByList**](PoliciesApi.md#policiesEventMatcherUsedByList) | **GET** /policies/event_matcher/{policy_uuid}/used_by/ | 
[**policiesExpressionCreate**](PoliciesApi.md#policiesExpressionCreate) | **POST** /policies/expression/ | 
[**policiesExpressionDestroy**](PoliciesApi.md#policiesExpressionDestroy) | **DELETE** /policies/expression/{policy_uuid}/ | 
[**policiesExpressionList**](PoliciesApi.md#policiesExpressionList) | **GET** /policies/expression/ | 
[**policiesExpressionPartialUpdate**](PoliciesApi.md#policiesExpressionPartialUpdate) | **PATCH** /policies/expression/{policy_uuid}/ | 
[**policiesExpressionRetrieve**](PoliciesApi.md#policiesExpressionRetrieve) | **GET** /policies/expression/{policy_uuid}/ | 
[**policiesExpressionUpdate**](PoliciesApi.md#policiesExpressionUpdate) | **PUT** /policies/expression/{policy_uuid}/ | 
[**policiesExpressionUsedByList**](PoliciesApi.md#policiesExpressionUsedByList) | **GET** /policies/expression/{policy_uuid}/used_by/ | 
[**policiesPasswordCreate**](PoliciesApi.md#policiesPasswordCreate) | **POST** /policies/password/ | 
[**policiesPasswordDestroy**](PoliciesApi.md#policiesPasswordDestroy) | **DELETE** /policies/password/{policy_uuid}/ | 
[**policiesPasswordExpiryCreate**](PoliciesApi.md#policiesPasswordExpiryCreate) | **POST** /policies/password_expiry/ | 
[**policiesPasswordExpiryDestroy**](PoliciesApi.md#policiesPasswordExpiryDestroy) | **DELETE** /policies/password_expiry/{policy_uuid}/ | 
[**policiesPasswordExpiryList**](PoliciesApi.md#policiesPasswordExpiryList) | **GET** /policies/password_expiry/ | 
[**policiesPasswordExpiryPartialUpdate**](PoliciesApi.md#policiesPasswordExpiryPartialUpdate) | **PATCH** /policies/password_expiry/{policy_uuid}/ | 
[**policiesPasswordExpiryRetrieve**](PoliciesApi.md#policiesPasswordExpiryRetrieve) | **GET** /policies/password_expiry/{policy_uuid}/ | 
[**policiesPasswordExpiryUpdate**](PoliciesApi.md#policiesPasswordExpiryUpdate) | **PUT** /policies/password_expiry/{policy_uuid}/ | 
[**policiesPasswordExpiryUsedByList**](PoliciesApi.md#policiesPasswordExpiryUsedByList) | **GET** /policies/password_expiry/{policy_uuid}/used_by/ | 
[**policiesPasswordList**](PoliciesApi.md#policiesPasswordList) | **GET** /policies/password/ | 
[**policiesPasswordPartialUpdate**](PoliciesApi.md#policiesPasswordPartialUpdate) | **PATCH** /policies/password/{policy_uuid}/ | 
[**policiesPasswordRetrieve**](PoliciesApi.md#policiesPasswordRetrieve) | **GET** /policies/password/{policy_uuid}/ | 
[**policiesPasswordUpdate**](PoliciesApi.md#policiesPasswordUpdate) | **PUT** /policies/password/{policy_uuid}/ | 
[**policiesPasswordUsedByList**](PoliciesApi.md#policiesPasswordUsedByList) | **GET** /policies/password/{policy_uuid}/used_by/ | 
[**policiesReputationCreate**](PoliciesApi.md#policiesReputationCreate) | **POST** /policies/reputation/ | 
[**policiesReputationDestroy**](PoliciesApi.md#policiesReputationDestroy) | **DELETE** /policies/reputation/{policy_uuid}/ | 
[**policiesReputationList**](PoliciesApi.md#policiesReputationList) | **GET** /policies/reputation/ | 
[**policiesReputationPartialUpdate**](PoliciesApi.md#policiesReputationPartialUpdate) | **PATCH** /policies/reputation/{policy_uuid}/ | 
[**policiesReputationRetrieve**](PoliciesApi.md#policiesReputationRetrieve) | **GET** /policies/reputation/{policy_uuid}/ | 
[**policiesReputationScoresDestroy**](PoliciesApi.md#policiesReputationScoresDestroy) | **DELETE** /policies/reputation/scores/{reputation_uuid}/ | 
[**policiesReputationScoresList**](PoliciesApi.md#policiesReputationScoresList) | **GET** /policies/reputation/scores/ | 
[**policiesReputationScoresRetrieve**](PoliciesApi.md#policiesReputationScoresRetrieve) | **GET** /policies/reputation/scores/{reputation_uuid}/ | 
[**policiesReputationScoresUsedByList**](PoliciesApi.md#policiesReputationScoresUsedByList) | **GET** /policies/reputation/scores/{reputation_uuid}/used_by/ | 
[**policiesReputationUpdate**](PoliciesApi.md#policiesReputationUpdate) | **PUT** /policies/reputation/{policy_uuid}/ | 
[**policiesReputationUsedByList**](PoliciesApi.md#policiesReputationUsedByList) | **GET** /policies/reputation/{policy_uuid}/used_by/ | 


<a id="policiesAllCacheClearCreate"></a>
# **policiesAllCacheClearCreate**
> policiesAllCacheClearCreate()



Clear policy cache

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
try {
    apiInstance.policiesAllCacheClearCreate()
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesAllCacheClearCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesAllCacheClearCreate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesAllCacheInfoRetrieve"></a>
# **policiesAllCacheInfoRetrieve**
> Cache policiesAllCacheInfoRetrieve()



Info about cached policies

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
try {
    val result : Cache = apiInstance.policiesAllCacheInfoRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesAllCacheInfoRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesAllCacheInfoRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Cache**](Cache.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesAllDestroy"></a>
# **policiesAllDestroy**
> policiesAllDestroy(policyUuid)



Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Policy.
try {
    apiInstance.policiesAllDestroy(policyUuid)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesAllDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesAllDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Policy. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesAllList"></a>
# **policiesAllList**
> PaginatedPolicyList policiesAllList(bindingsIsnull, ordering, page, pageSize, promptstageIsnull, search)



Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val bindingsIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val promptstageIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedPolicyList = apiInstance.policiesAllList(bindingsIsnull, ordering, page, pageSize, promptstageIsnull, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesAllList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesAllList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bindingsIsnull** | **kotlin.Boolean**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **promptstageIsnull** | **kotlin.Boolean**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedPolicyList**](PaginatedPolicyList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesAllRetrieve"></a>
# **policiesAllRetrieve**
> Policy policiesAllRetrieve(policyUuid)



Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Policy.
try {
    val result : Policy = apiInstance.policiesAllRetrieve(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesAllRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesAllRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Policy. |

### Return type

[**Policy**](Policy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesAllTestCreate"></a>
# **policiesAllTestCreate**
> PolicyTestResult policiesAllTestCreate(policyUuid, policyTestRequest)



Test policy

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Policy.
val policyTestRequest : PolicyTestRequest =  // PolicyTestRequest | 
try {
    val result : PolicyTestResult = apiInstance.policiesAllTestCreate(policyUuid, policyTestRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesAllTestCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesAllTestCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Policy. |
 **policyTestRequest** | [**PolicyTestRequest**](PolicyTestRequest.md)|  |

### Return type

[**PolicyTestResult**](PolicyTestResult.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesAllTypesList"></a>
# **policiesAllTypesList**
> kotlin.collections.List&lt;TypeCreate&gt; policiesAllTypesList()



Get all creatable policy types

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
try {
    val result : kotlin.collections.List<TypeCreate> = apiInstance.policiesAllTypesList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesAllTypesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesAllTypesList")
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

<a id="policiesAllUsedByList"></a>
# **policiesAllUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; policiesAllUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Policy.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.policiesAllUsedByList(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesAllUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesAllUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Policy. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesBindingsCreate"></a>
# **policiesBindingsCreate**
> PolicyBinding policiesBindingsCreate(policyBindingRequest)



PolicyBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyBindingRequest : PolicyBindingRequest =  // PolicyBindingRequest | 
try {
    val result : PolicyBinding = apiInstance.policiesBindingsCreate(policyBindingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesBindingsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesBindingsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyBindingRequest** | [**PolicyBindingRequest**](PolicyBindingRequest.md)|  |

### Return type

[**PolicyBinding**](PolicyBinding.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesBindingsDestroy"></a>
# **policiesBindingsDestroy**
> policiesBindingsDestroy(policyBindingUuid)



PolicyBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyBindingUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Policy Binding.
try {
    apiInstance.policiesBindingsDestroy(policyBindingUuid)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesBindingsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesBindingsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyBindingUuid** | **java.util.UUID**| A UUID string identifying this Policy Binding. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesBindingsList"></a>
# **policiesBindingsList**
> PaginatedPolicyBindingList policiesBindingsList(enabled, order, ordering, page, pageSize, policy, policyIsnull, search, target, targetIn, timeout)



PolicyBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val enabled : kotlin.Boolean = true // kotlin.Boolean | 
val order : kotlin.Int = 56 // kotlin.Int | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policy : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val policyIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val target : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val targetIn : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val timeout : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedPolicyBindingList = apiInstance.policiesBindingsList(enabled, order, ordering, page, pageSize, policy, policyIsnull, search, target, targetIn, timeout)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesBindingsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesBindingsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enabled** | **kotlin.Boolean**|  | [optional]
 **order** | **kotlin.Int**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policy** | **java.util.UUID**|  | [optional]
 **policyIsnull** | **kotlin.Boolean**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **target** | **java.util.UUID**|  | [optional]
 **targetIn** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **timeout** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedPolicyBindingList**](PaginatedPolicyBindingList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesBindingsPartialUpdate"></a>
# **policiesBindingsPartialUpdate**
> PolicyBinding policiesBindingsPartialUpdate(policyBindingUuid, patchedPolicyBindingRequest)



PolicyBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyBindingUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Policy Binding.
val patchedPolicyBindingRequest : PatchedPolicyBindingRequest =  // PatchedPolicyBindingRequest | 
try {
    val result : PolicyBinding = apiInstance.policiesBindingsPartialUpdate(policyBindingUuid, patchedPolicyBindingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesBindingsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesBindingsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyBindingUuid** | **java.util.UUID**| A UUID string identifying this Policy Binding. |
 **patchedPolicyBindingRequest** | [**PatchedPolicyBindingRequest**](PatchedPolicyBindingRequest.md)|  | [optional]

### Return type

[**PolicyBinding**](PolicyBinding.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesBindingsRetrieve"></a>
# **policiesBindingsRetrieve**
> PolicyBinding policiesBindingsRetrieve(policyBindingUuid)



PolicyBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyBindingUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Policy Binding.
try {
    val result : PolicyBinding = apiInstance.policiesBindingsRetrieve(policyBindingUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesBindingsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesBindingsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyBindingUuid** | **java.util.UUID**| A UUID string identifying this Policy Binding. |

### Return type

[**PolicyBinding**](PolicyBinding.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesBindingsUpdate"></a>
# **policiesBindingsUpdate**
> PolicyBinding policiesBindingsUpdate(policyBindingUuid, policyBindingRequest)



PolicyBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyBindingUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Policy Binding.
val policyBindingRequest : PolicyBindingRequest =  // PolicyBindingRequest | 
try {
    val result : PolicyBinding = apiInstance.policiesBindingsUpdate(policyBindingUuid, policyBindingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesBindingsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesBindingsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyBindingUuid** | **java.util.UUID**| A UUID string identifying this Policy Binding. |
 **policyBindingRequest** | [**PolicyBindingRequest**](PolicyBindingRequest.md)|  |

### Return type

[**PolicyBinding**](PolicyBinding.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesBindingsUsedByList"></a>
# **policiesBindingsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; policiesBindingsUsedByList(policyBindingUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyBindingUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Policy Binding.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.policiesBindingsUsedByList(policyBindingUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesBindingsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesBindingsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyBindingUuid** | **java.util.UUID**| A UUID string identifying this Policy Binding. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesDummyCreate"></a>
# **policiesDummyCreate**
> DummyPolicy policiesDummyCreate(dummyPolicyRequest)



Dummy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val dummyPolicyRequest : DummyPolicyRequest =  // DummyPolicyRequest | 
try {
    val result : DummyPolicy = apiInstance.policiesDummyCreate(dummyPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesDummyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesDummyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dummyPolicyRequest** | [**DummyPolicyRequest**](DummyPolicyRequest.md)|  |

### Return type

[**DummyPolicy**](DummyPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesDummyDestroy"></a>
# **policiesDummyDestroy**
> policiesDummyDestroy(policyUuid)



Dummy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Policy.
try {
    apiInstance.policiesDummyDestroy(policyUuid)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesDummyDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesDummyDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Dummy Policy. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesDummyList"></a>
# **policiesDummyList**
> PaginatedDummyPolicyList policiesDummyList(created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, result, search, waitMax, waitMin)



Dummy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val executionLogging : kotlin.Boolean = true // kotlin.Boolean | 
val lastUpdated : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val result : kotlin.Boolean = true // kotlin.Boolean | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val waitMax : kotlin.Int = 56 // kotlin.Int | 
val waitMin : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedDummyPolicyList = apiInstance.policiesDummyList(created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, result, search, waitMax, waitMin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesDummyList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesDummyList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **executionLogging** | **kotlin.Boolean**|  | [optional]
 **lastUpdated** | **java.time.OffsetDateTime**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policyUuid** | **java.util.UUID**|  | [optional]
 **result** | **kotlin.Boolean**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **waitMax** | **kotlin.Int**|  | [optional]
 **waitMin** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedDummyPolicyList**](PaginatedDummyPolicyList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesDummyPartialUpdate"></a>
# **policiesDummyPartialUpdate**
> DummyPolicy policiesDummyPartialUpdate(policyUuid, patchedDummyPolicyRequest)



Dummy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Policy.
val patchedDummyPolicyRequest : PatchedDummyPolicyRequest =  // PatchedDummyPolicyRequest | 
try {
    val result : DummyPolicy = apiInstance.policiesDummyPartialUpdate(policyUuid, patchedDummyPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesDummyPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesDummyPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Dummy Policy. |
 **patchedDummyPolicyRequest** | [**PatchedDummyPolicyRequest**](PatchedDummyPolicyRequest.md)|  | [optional]

### Return type

[**DummyPolicy**](DummyPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesDummyRetrieve"></a>
# **policiesDummyRetrieve**
> DummyPolicy policiesDummyRetrieve(policyUuid)



Dummy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Policy.
try {
    val result : DummyPolicy = apiInstance.policiesDummyRetrieve(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesDummyRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesDummyRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Dummy Policy. |

### Return type

[**DummyPolicy**](DummyPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesDummyUpdate"></a>
# **policiesDummyUpdate**
> DummyPolicy policiesDummyUpdate(policyUuid, dummyPolicyRequest)



Dummy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Policy.
val dummyPolicyRequest : DummyPolicyRequest =  // DummyPolicyRequest | 
try {
    val result : DummyPolicy = apiInstance.policiesDummyUpdate(policyUuid, dummyPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesDummyUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesDummyUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Dummy Policy. |
 **dummyPolicyRequest** | [**DummyPolicyRequest**](DummyPolicyRequest.md)|  |

### Return type

[**DummyPolicy**](DummyPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesDummyUsedByList"></a>
# **policiesDummyUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; policiesDummyUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Dummy Policy.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.policiesDummyUsedByList(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesDummyUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesDummyUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Dummy Policy. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesEventMatcherCreate"></a>
# **policiesEventMatcherCreate**
> EventMatcherPolicy policiesEventMatcherCreate(eventMatcherPolicyRequest)



Event Matcher Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val eventMatcherPolicyRequest : EventMatcherPolicyRequest =  // EventMatcherPolicyRequest | 
try {
    val result : EventMatcherPolicy = apiInstance.policiesEventMatcherCreate(eventMatcherPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesEventMatcherCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesEventMatcherCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventMatcherPolicyRequest** | [**EventMatcherPolicyRequest**](EventMatcherPolicyRequest.md)|  |

### Return type

[**EventMatcherPolicy**](EventMatcherPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesEventMatcherDestroy"></a>
# **policiesEventMatcherDestroy**
> policiesEventMatcherDestroy(policyUuid)



Event Matcher Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Event Matcher Policy.
try {
    apiInstance.policiesEventMatcherDestroy(policyUuid)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesEventMatcherDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesEventMatcherDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Event Matcher Policy. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesEventMatcherList"></a>
# **policiesEventMatcherList**
> PaginatedEventMatcherPolicyList policiesEventMatcherList(action, app, clientIp, created, executionLogging, lastUpdated, model, name, ordering, page, pageSize, policyUuid, search)



Event Matcher Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val action : kotlin.String = action_example // kotlin.String | Match created events with this action type. When left empty, all action types will be matched.  * `login` - Login * `login_failed` - Login Failed * `logout` - Logout * `user_write` - User Write * `suspicious_request` - Suspicious Request * `password_set` - Password Set * `secret_view` - Secret View * `secret_rotate` - Secret Rotate * `invitation_used` - Invite Used * `authorize_application` - Authorize Application * `source_linked` - Source Linked * `impersonation_started` - Impersonation Started * `impersonation_ended` - Impersonation Ended * `flow_execution` - Flow Execution * `policy_execution` - Policy Execution * `policy_exception` - Policy Exception * `property_mapping_exception` - Property Mapping Exception * `system_task_execution` - System Task Execution * `system_task_exception` - System Task Exception * `system_exception` - System Exception * `configuration_error` - Configuration Error * `model_created` - Model Created * `model_updated` - Model Updated * `model_deleted` - Model Deleted * `email_sent` - Email Sent * `update_available` - Update Available * `custom_` - Custom Prefix
val app : kotlin.String = app_example // kotlin.String | 
val clientIp : kotlin.String = clientIp_example // kotlin.String | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val executionLogging : kotlin.Boolean = true // kotlin.Boolean | 
val lastUpdated : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val model : kotlin.String = model_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedEventMatcherPolicyList = apiInstance.policiesEventMatcherList(action, app, clientIp, created, executionLogging, lastUpdated, model, name, ordering, page, pageSize, policyUuid, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesEventMatcherList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesEventMatcherList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **kotlin.String**| Match created events with this action type. When left empty, all action types will be matched.  * &#x60;login&#x60; - Login * &#x60;login_failed&#x60; - Login Failed * &#x60;logout&#x60; - Logout * &#x60;user_write&#x60; - User Write * &#x60;suspicious_request&#x60; - Suspicious Request * &#x60;password_set&#x60; - Password Set * &#x60;secret_view&#x60; - Secret View * &#x60;secret_rotate&#x60; - Secret Rotate * &#x60;invitation_used&#x60; - Invite Used * &#x60;authorize_application&#x60; - Authorize Application * &#x60;source_linked&#x60; - Source Linked * &#x60;impersonation_started&#x60; - Impersonation Started * &#x60;impersonation_ended&#x60; - Impersonation Ended * &#x60;flow_execution&#x60; - Flow Execution * &#x60;policy_execution&#x60; - Policy Execution * &#x60;policy_exception&#x60; - Policy Exception * &#x60;property_mapping_exception&#x60; - Property Mapping Exception * &#x60;system_task_execution&#x60; - System Task Execution * &#x60;system_task_exception&#x60; - System Task Exception * &#x60;system_exception&#x60; - System Exception * &#x60;configuration_error&#x60; - Configuration Error * &#x60;model_created&#x60; - Model Created * &#x60;model_updated&#x60; - Model Updated * &#x60;model_deleted&#x60; - Model Deleted * &#x60;email_sent&#x60; - Email Sent * &#x60;update_available&#x60; - Update Available * &#x60;custom_&#x60; - Custom Prefix | [optional] [enum: authorize_application, configuration_error, custom_, email_sent, flow_execution, impersonation_ended, impersonation_started, invitation_used, login, login_failed, logout, model_created, model_deleted, model_updated, password_set, policy_exception, policy_execution, property_mapping_exception, secret_rotate, secret_view, source_linked, suspicious_request, system_exception, system_task_exception, system_task_execution, update_available, user_write]
 **app** | **kotlin.String**|  | [optional]
 **clientIp** | **kotlin.String**|  | [optional]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **executionLogging** | **kotlin.Boolean**|  | [optional]
 **lastUpdated** | **java.time.OffsetDateTime**|  | [optional]
 **model** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policyUuid** | **java.util.UUID**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedEventMatcherPolicyList**](PaginatedEventMatcherPolicyList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesEventMatcherPartialUpdate"></a>
# **policiesEventMatcherPartialUpdate**
> EventMatcherPolicy policiesEventMatcherPartialUpdate(policyUuid, patchedEventMatcherPolicyRequest)



Event Matcher Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Event Matcher Policy.
val patchedEventMatcherPolicyRequest : PatchedEventMatcherPolicyRequest =  // PatchedEventMatcherPolicyRequest | 
try {
    val result : EventMatcherPolicy = apiInstance.policiesEventMatcherPartialUpdate(policyUuid, patchedEventMatcherPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesEventMatcherPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesEventMatcherPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Event Matcher Policy. |
 **patchedEventMatcherPolicyRequest** | [**PatchedEventMatcherPolicyRequest**](PatchedEventMatcherPolicyRequest.md)|  | [optional]

### Return type

[**EventMatcherPolicy**](EventMatcherPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesEventMatcherRetrieve"></a>
# **policiesEventMatcherRetrieve**
> EventMatcherPolicy policiesEventMatcherRetrieve(policyUuid)



Event Matcher Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Event Matcher Policy.
try {
    val result : EventMatcherPolicy = apiInstance.policiesEventMatcherRetrieve(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesEventMatcherRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesEventMatcherRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Event Matcher Policy. |

### Return type

[**EventMatcherPolicy**](EventMatcherPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesEventMatcherUpdate"></a>
# **policiesEventMatcherUpdate**
> EventMatcherPolicy policiesEventMatcherUpdate(policyUuid, eventMatcherPolicyRequest)



Event Matcher Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Event Matcher Policy.
val eventMatcherPolicyRequest : EventMatcherPolicyRequest =  // EventMatcherPolicyRequest | 
try {
    val result : EventMatcherPolicy = apiInstance.policiesEventMatcherUpdate(policyUuid, eventMatcherPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesEventMatcherUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesEventMatcherUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Event Matcher Policy. |
 **eventMatcherPolicyRequest** | [**EventMatcherPolicyRequest**](EventMatcherPolicyRequest.md)|  |

### Return type

[**EventMatcherPolicy**](EventMatcherPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesEventMatcherUsedByList"></a>
# **policiesEventMatcherUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; policiesEventMatcherUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Event Matcher Policy.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.policiesEventMatcherUsedByList(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesEventMatcherUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesEventMatcherUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Event Matcher Policy. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesExpressionCreate"></a>
# **policiesExpressionCreate**
> ExpressionPolicy policiesExpressionCreate(expressionPolicyRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val expressionPolicyRequest : ExpressionPolicyRequest =  // ExpressionPolicyRequest | 
try {
    val result : ExpressionPolicy = apiInstance.policiesExpressionCreate(expressionPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesExpressionCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesExpressionCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expressionPolicyRequest** | [**ExpressionPolicyRequest**](ExpressionPolicyRequest.md)|  |

### Return type

[**ExpressionPolicy**](ExpressionPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesExpressionDestroy"></a>
# **policiesExpressionDestroy**
> policiesExpressionDestroy(policyUuid)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Expression Policy.
try {
    apiInstance.policiesExpressionDestroy(policyUuid)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesExpressionDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesExpressionDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Expression Policy. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesExpressionList"></a>
# **policiesExpressionList**
> PaginatedExpressionPolicyList policiesExpressionList(created, executionLogging, expression, lastUpdated, name, ordering, page, pageSize, policyUuid, search)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val executionLogging : kotlin.Boolean = true // kotlin.Boolean | 
val expression : kotlin.String = expression_example // kotlin.String | 
val lastUpdated : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedExpressionPolicyList = apiInstance.policiesExpressionList(created, executionLogging, expression, lastUpdated, name, ordering, page, pageSize, policyUuid, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesExpressionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesExpressionList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **executionLogging** | **kotlin.Boolean**|  | [optional]
 **expression** | **kotlin.String**|  | [optional]
 **lastUpdated** | **java.time.OffsetDateTime**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policyUuid** | **java.util.UUID**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedExpressionPolicyList**](PaginatedExpressionPolicyList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesExpressionPartialUpdate"></a>
# **policiesExpressionPartialUpdate**
> ExpressionPolicy policiesExpressionPartialUpdate(policyUuid, patchedExpressionPolicyRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Expression Policy.
val patchedExpressionPolicyRequest : PatchedExpressionPolicyRequest =  // PatchedExpressionPolicyRequest | 
try {
    val result : ExpressionPolicy = apiInstance.policiesExpressionPartialUpdate(policyUuid, patchedExpressionPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesExpressionPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesExpressionPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Expression Policy. |
 **patchedExpressionPolicyRequest** | [**PatchedExpressionPolicyRequest**](PatchedExpressionPolicyRequest.md)|  | [optional]

### Return type

[**ExpressionPolicy**](ExpressionPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesExpressionRetrieve"></a>
# **policiesExpressionRetrieve**
> ExpressionPolicy policiesExpressionRetrieve(policyUuid)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Expression Policy.
try {
    val result : ExpressionPolicy = apiInstance.policiesExpressionRetrieve(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesExpressionRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesExpressionRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Expression Policy. |

### Return type

[**ExpressionPolicy**](ExpressionPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesExpressionUpdate"></a>
# **policiesExpressionUpdate**
> ExpressionPolicy policiesExpressionUpdate(policyUuid, expressionPolicyRequest)



Source Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Expression Policy.
val expressionPolicyRequest : ExpressionPolicyRequest =  // ExpressionPolicyRequest | 
try {
    val result : ExpressionPolicy = apiInstance.policiesExpressionUpdate(policyUuid, expressionPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesExpressionUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesExpressionUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Expression Policy. |
 **expressionPolicyRequest** | [**ExpressionPolicyRequest**](ExpressionPolicyRequest.md)|  |

### Return type

[**ExpressionPolicy**](ExpressionPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesExpressionUsedByList"></a>
# **policiesExpressionUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; policiesExpressionUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Expression Policy.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.policiesExpressionUsedByList(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesExpressionUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesExpressionUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Expression Policy. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesPasswordCreate"></a>
# **policiesPasswordCreate**
> PasswordPolicy policiesPasswordCreate(passwordPolicyRequest)



Password Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val passwordPolicyRequest : PasswordPolicyRequest =  // PasswordPolicyRequest | 
try {
    val result : PasswordPolicy = apiInstance.policiesPasswordCreate(passwordPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordPolicyRequest** | [**PasswordPolicyRequest**](PasswordPolicyRequest.md)|  |

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesPasswordDestroy"></a>
# **policiesPasswordDestroy**
> policiesPasswordDestroy(policyUuid)



Password Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Policy.
try {
    apiInstance.policiesPasswordDestroy(policyUuid)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Policy. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesPasswordExpiryCreate"></a>
# **policiesPasswordExpiryCreate**
> PasswordExpiryPolicy policiesPasswordExpiryCreate(passwordExpiryPolicyRequest)



Password Expiry Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val passwordExpiryPolicyRequest : PasswordExpiryPolicyRequest =  // PasswordExpiryPolicyRequest | 
try {
    val result : PasswordExpiryPolicy = apiInstance.policiesPasswordExpiryCreate(passwordExpiryPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordExpiryCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordExpiryCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordExpiryPolicyRequest** | [**PasswordExpiryPolicyRequest**](PasswordExpiryPolicyRequest.md)|  |

### Return type

[**PasswordExpiryPolicy**](PasswordExpiryPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesPasswordExpiryDestroy"></a>
# **policiesPasswordExpiryDestroy**
> policiesPasswordExpiryDestroy(policyUuid)



Password Expiry Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Expiry Policy.
try {
    apiInstance.policiesPasswordExpiryDestroy(policyUuid)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordExpiryDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordExpiryDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Expiry Policy. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesPasswordExpiryList"></a>
# **policiesPasswordExpiryList**
> PaginatedPasswordExpiryPolicyList policiesPasswordExpiryList(created, days, denyOnly, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search)



Password Expiry Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val days : kotlin.Int = 56 // kotlin.Int | 
val denyOnly : kotlin.Boolean = true // kotlin.Boolean | 
val executionLogging : kotlin.Boolean = true // kotlin.Boolean | 
val lastUpdated : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedPasswordExpiryPolicyList = apiInstance.policiesPasswordExpiryList(created, days, denyOnly, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordExpiryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordExpiryList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **days** | **kotlin.Int**|  | [optional]
 **denyOnly** | **kotlin.Boolean**|  | [optional]
 **executionLogging** | **kotlin.Boolean**|  | [optional]
 **lastUpdated** | **java.time.OffsetDateTime**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policyUuid** | **java.util.UUID**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedPasswordExpiryPolicyList**](PaginatedPasswordExpiryPolicyList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesPasswordExpiryPartialUpdate"></a>
# **policiesPasswordExpiryPartialUpdate**
> PasswordExpiryPolicy policiesPasswordExpiryPartialUpdate(policyUuid, patchedPasswordExpiryPolicyRequest)



Password Expiry Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Expiry Policy.
val patchedPasswordExpiryPolicyRequest : PatchedPasswordExpiryPolicyRequest =  // PatchedPasswordExpiryPolicyRequest | 
try {
    val result : PasswordExpiryPolicy = apiInstance.policiesPasswordExpiryPartialUpdate(policyUuid, patchedPasswordExpiryPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordExpiryPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordExpiryPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Expiry Policy. |
 **patchedPasswordExpiryPolicyRequest** | [**PatchedPasswordExpiryPolicyRequest**](PatchedPasswordExpiryPolicyRequest.md)|  | [optional]

### Return type

[**PasswordExpiryPolicy**](PasswordExpiryPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesPasswordExpiryRetrieve"></a>
# **policiesPasswordExpiryRetrieve**
> PasswordExpiryPolicy policiesPasswordExpiryRetrieve(policyUuid)



Password Expiry Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Expiry Policy.
try {
    val result : PasswordExpiryPolicy = apiInstance.policiesPasswordExpiryRetrieve(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordExpiryRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordExpiryRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Expiry Policy. |

### Return type

[**PasswordExpiryPolicy**](PasswordExpiryPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesPasswordExpiryUpdate"></a>
# **policiesPasswordExpiryUpdate**
> PasswordExpiryPolicy policiesPasswordExpiryUpdate(policyUuid, passwordExpiryPolicyRequest)



Password Expiry Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Expiry Policy.
val passwordExpiryPolicyRequest : PasswordExpiryPolicyRequest =  // PasswordExpiryPolicyRequest | 
try {
    val result : PasswordExpiryPolicy = apiInstance.policiesPasswordExpiryUpdate(policyUuid, passwordExpiryPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordExpiryUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordExpiryUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Expiry Policy. |
 **passwordExpiryPolicyRequest** | [**PasswordExpiryPolicyRequest**](PasswordExpiryPolicyRequest.md)|  |

### Return type

[**PasswordExpiryPolicy**](PasswordExpiryPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesPasswordExpiryUsedByList"></a>
# **policiesPasswordExpiryUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; policiesPasswordExpiryUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Expiry Policy.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.policiesPasswordExpiryUsedByList(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordExpiryUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordExpiryUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Expiry Policy. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesPasswordList"></a>
# **policiesPasswordList**
> PaginatedPasswordPolicyList policiesPasswordList(amountDigits, amountLowercase, amountSymbols, amountUppercase, checkHaveIBeenPwned, checkStaticRules, checkZxcvbn, created, errorMessage, executionLogging, hibpAllowedCount, lastUpdated, lengthMin, name, ordering, page, pageSize, passwordField, policyUuid, search, symbolCharset, zxcvbnScoreThreshold)



Password Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val amountDigits : kotlin.Int = 56 // kotlin.Int | 
val amountLowercase : kotlin.Int = 56 // kotlin.Int | 
val amountSymbols : kotlin.Int = 56 // kotlin.Int | 
val amountUppercase : kotlin.Int = 56 // kotlin.Int | 
val checkHaveIBeenPwned : kotlin.Boolean = true // kotlin.Boolean | 
val checkStaticRules : kotlin.Boolean = true // kotlin.Boolean | 
val checkZxcvbn : kotlin.Boolean = true // kotlin.Boolean | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val errorMessage : kotlin.String = errorMessage_example // kotlin.String | 
val executionLogging : kotlin.Boolean = true // kotlin.Boolean | 
val hibpAllowedCount : kotlin.Int = 56 // kotlin.Int | 
val lastUpdated : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val lengthMin : kotlin.Int = 56 // kotlin.Int | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val passwordField : kotlin.String = passwordField_example // kotlin.String | 
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val symbolCharset : kotlin.String = symbolCharset_example // kotlin.String | 
val zxcvbnScoreThreshold : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedPasswordPolicyList = apiInstance.policiesPasswordList(amountDigits, amountLowercase, amountSymbols, amountUppercase, checkHaveIBeenPwned, checkStaticRules, checkZxcvbn, created, errorMessage, executionLogging, hibpAllowedCount, lastUpdated, lengthMin, name, ordering, page, pageSize, passwordField, policyUuid, search, symbolCharset, zxcvbnScoreThreshold)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amountDigits** | **kotlin.Int**|  | [optional]
 **amountLowercase** | **kotlin.Int**|  | [optional]
 **amountSymbols** | **kotlin.Int**|  | [optional]
 **amountUppercase** | **kotlin.Int**|  | [optional]
 **checkHaveIBeenPwned** | **kotlin.Boolean**|  | [optional]
 **checkStaticRules** | **kotlin.Boolean**|  | [optional]
 **checkZxcvbn** | **kotlin.Boolean**|  | [optional]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **errorMessage** | **kotlin.String**|  | [optional]
 **executionLogging** | **kotlin.Boolean**|  | [optional]
 **hibpAllowedCount** | **kotlin.Int**|  | [optional]
 **lastUpdated** | **java.time.OffsetDateTime**|  | [optional]
 **lengthMin** | **kotlin.Int**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **passwordField** | **kotlin.String**|  | [optional]
 **policyUuid** | **java.util.UUID**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **symbolCharset** | **kotlin.String**|  | [optional]
 **zxcvbnScoreThreshold** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedPasswordPolicyList**](PaginatedPasswordPolicyList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesPasswordPartialUpdate"></a>
# **policiesPasswordPartialUpdate**
> PasswordPolicy policiesPasswordPartialUpdate(policyUuid, patchedPasswordPolicyRequest)



Password Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Policy.
val patchedPasswordPolicyRequest : PatchedPasswordPolicyRequest =  // PatchedPasswordPolicyRequest | 
try {
    val result : PasswordPolicy = apiInstance.policiesPasswordPartialUpdate(policyUuid, patchedPasswordPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Policy. |
 **patchedPasswordPolicyRequest** | [**PatchedPasswordPolicyRequest**](PatchedPasswordPolicyRequest.md)|  | [optional]

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesPasswordRetrieve"></a>
# **policiesPasswordRetrieve**
> PasswordPolicy policiesPasswordRetrieve(policyUuid)



Password Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Policy.
try {
    val result : PasswordPolicy = apiInstance.policiesPasswordRetrieve(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Policy. |

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesPasswordUpdate"></a>
# **policiesPasswordUpdate**
> PasswordPolicy policiesPasswordUpdate(policyUuid, passwordPolicyRequest)



Password Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Policy.
val passwordPolicyRequest : PasswordPolicyRequest =  // PasswordPolicyRequest | 
try {
    val result : PasswordPolicy = apiInstance.policiesPasswordUpdate(policyUuid, passwordPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Policy. |
 **passwordPolicyRequest** | [**PasswordPolicyRequest**](PasswordPolicyRequest.md)|  |

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesPasswordUsedByList"></a>
# **policiesPasswordUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; policiesPasswordUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Password Policy.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.policiesPasswordUsedByList(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesPasswordUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesPasswordUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Password Policy. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesReputationCreate"></a>
# **policiesReputationCreate**
> ReputationPolicy policiesReputationCreate(reputationPolicyRequest)



Reputation Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val reputationPolicyRequest : ReputationPolicyRequest =  // ReputationPolicyRequest | 
try {
    val result : ReputationPolicy = apiInstance.policiesReputationCreate(reputationPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reputationPolicyRequest** | [**ReputationPolicyRequest**](ReputationPolicyRequest.md)|  |

### Return type

[**ReputationPolicy**](ReputationPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesReputationDestroy"></a>
# **policiesReputationDestroy**
> policiesReputationDestroy(policyUuid)



Reputation Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Reputation Policy.
try {
    apiInstance.policiesReputationDestroy(policyUuid)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Reputation Policy. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesReputationList"></a>
# **policiesReputationList**
> PaginatedReputationPolicyList policiesReputationList(checkIp, checkUsername, created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search, threshold)



Reputation Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val checkIp : kotlin.Boolean = true // kotlin.Boolean | 
val checkUsername : kotlin.Boolean = true // kotlin.Boolean | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val executionLogging : kotlin.Boolean = true // kotlin.Boolean | 
val lastUpdated : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val threshold : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedReputationPolicyList = apiInstance.policiesReputationList(checkIp, checkUsername, created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search, threshold)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkIp** | **kotlin.Boolean**|  | [optional]
 **checkUsername** | **kotlin.Boolean**|  | [optional]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **executionLogging** | **kotlin.Boolean**|  | [optional]
 **lastUpdated** | **java.time.OffsetDateTime**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **policyUuid** | **java.util.UUID**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **threshold** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedReputationPolicyList**](PaginatedReputationPolicyList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesReputationPartialUpdate"></a>
# **policiesReputationPartialUpdate**
> ReputationPolicy policiesReputationPartialUpdate(policyUuid, patchedReputationPolicyRequest)



Reputation Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Reputation Policy.
val patchedReputationPolicyRequest : PatchedReputationPolicyRequest =  // PatchedReputationPolicyRequest | 
try {
    val result : ReputationPolicy = apiInstance.policiesReputationPartialUpdate(policyUuid, patchedReputationPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Reputation Policy. |
 **patchedReputationPolicyRequest** | [**PatchedReputationPolicyRequest**](PatchedReputationPolicyRequest.md)|  | [optional]

### Return type

[**ReputationPolicy**](ReputationPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesReputationRetrieve"></a>
# **policiesReputationRetrieve**
> ReputationPolicy policiesReputationRetrieve(policyUuid)



Reputation Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Reputation Policy.
try {
    val result : ReputationPolicy = apiInstance.policiesReputationRetrieve(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Reputation Policy. |

### Return type

[**ReputationPolicy**](ReputationPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesReputationScoresDestroy"></a>
# **policiesReputationScoresDestroy**
> policiesReputationScoresDestroy(reputationUuid)



Reputation Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val reputationUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Reputation Score.
try {
    apiInstance.policiesReputationScoresDestroy(reputationUuid)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationScoresDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationScoresDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reputationUuid** | **java.util.UUID**| A UUID string identifying this Reputation Score. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesReputationScoresList"></a>
# **policiesReputationScoresList**
> PaginatedReputationList policiesReputationScoresList(identifier, ip, ordering, page, pageSize, score, search)



Reputation Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val identifier : kotlin.String = identifier_example // kotlin.String | 
val ip : kotlin.String = ip_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val score : kotlin.Int = 56 // kotlin.Int | 
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedReputationList = apiInstance.policiesReputationScoresList(identifier, ip, ordering, page, pageSize, score, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationScoresList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationScoresList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**|  | [optional]
 **ip** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **score** | **kotlin.Int**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedReputationList**](PaginatedReputationList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesReputationScoresRetrieve"></a>
# **policiesReputationScoresRetrieve**
> Reputation policiesReputationScoresRetrieve(reputationUuid)



Reputation Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val reputationUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Reputation Score.
try {
    val result : Reputation = apiInstance.policiesReputationScoresRetrieve(reputationUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationScoresRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationScoresRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reputationUuid** | **java.util.UUID**| A UUID string identifying this Reputation Score. |

### Return type

[**Reputation**](Reputation.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesReputationScoresUsedByList"></a>
# **policiesReputationScoresUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; policiesReputationScoresUsedByList(reputationUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val reputationUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Reputation Score.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.policiesReputationScoresUsedByList(reputationUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationScoresUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationScoresUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reputationUuid** | **java.util.UUID**| A UUID string identifying this Reputation Score. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="policiesReputationUpdate"></a>
# **policiesReputationUpdate**
> ReputationPolicy policiesReputationUpdate(policyUuid, reputationPolicyRequest)



Reputation Policy Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Reputation Policy.
val reputationPolicyRequest : ReputationPolicyRequest =  // ReputationPolicyRequest | 
try {
    val result : ReputationPolicy = apiInstance.policiesReputationUpdate(policyUuid, reputationPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Reputation Policy. |
 **reputationPolicyRequest** | [**ReputationPolicyRequest**](ReputationPolicyRequest.md)|  |

### Return type

[**ReputationPolicy**](ReputationPolicy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="policiesReputationUsedByList"></a>
# **policiesReputationUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; policiesReputationUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = PoliciesApi()
val policyUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Reputation Policy.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.policiesReputationUsedByList(policyUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PoliciesApi#policiesReputationUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PoliciesApi#policiesReputationUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **java.util.UUID**| A UUID string identifying this Reputation Policy. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

