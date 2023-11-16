# FlowsApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**flowsBindingsCreate**](FlowsApi.md#flowsBindingsCreate) | **POST** /flows/bindings/ | 
[**flowsBindingsDestroy**](FlowsApi.md#flowsBindingsDestroy) | **DELETE** /flows/bindings/{fsb_uuid}/ | 
[**flowsBindingsList**](FlowsApi.md#flowsBindingsList) | **GET** /flows/bindings/ | 
[**flowsBindingsPartialUpdate**](FlowsApi.md#flowsBindingsPartialUpdate) | **PATCH** /flows/bindings/{fsb_uuid}/ | 
[**flowsBindingsRetrieve**](FlowsApi.md#flowsBindingsRetrieve) | **GET** /flows/bindings/{fsb_uuid}/ | 
[**flowsBindingsUpdate**](FlowsApi.md#flowsBindingsUpdate) | **PUT** /flows/bindings/{fsb_uuid}/ | 
[**flowsBindingsUsedByList**](FlowsApi.md#flowsBindingsUsedByList) | **GET** /flows/bindings/{fsb_uuid}/used_by/ | 
[**flowsExecutorGet**](FlowsApi.md#flowsExecutorGet) | **GET** /flows/executor/{flow_slug}/ | 
[**flowsExecutorSolve**](FlowsApi.md#flowsExecutorSolve) | **POST** /flows/executor/{flow_slug}/ | 
[**flowsInspectorGet**](FlowsApi.md#flowsInspectorGet) | **GET** /flows/inspector/{flow_slug}/ | 
[**flowsInstancesCacheClearCreate**](FlowsApi.md#flowsInstancesCacheClearCreate) | **POST** /flows/instances/cache_clear/ | 
[**flowsInstancesCacheInfoRetrieve**](FlowsApi.md#flowsInstancesCacheInfoRetrieve) | **GET** /flows/instances/cache_info/ | 
[**flowsInstancesCreate**](FlowsApi.md#flowsInstancesCreate) | **POST** /flows/instances/ | 
[**flowsInstancesDestroy**](FlowsApi.md#flowsInstancesDestroy) | **DELETE** /flows/instances/{slug}/ | 
[**flowsInstancesDiagramRetrieve**](FlowsApi.md#flowsInstancesDiagramRetrieve) | **GET** /flows/instances/{slug}/diagram/ | 
[**flowsInstancesExecuteRetrieve**](FlowsApi.md#flowsInstancesExecuteRetrieve) | **GET** /flows/instances/{slug}/execute/ | 
[**flowsInstancesExportRetrieve**](FlowsApi.md#flowsInstancesExportRetrieve) | **GET** /flows/instances/{slug}/export/ | 
[**flowsInstancesImportCreate**](FlowsApi.md#flowsInstancesImportCreate) | **POST** /flows/instances/import/ | 
[**flowsInstancesList**](FlowsApi.md#flowsInstancesList) | **GET** /flows/instances/ | 
[**flowsInstancesPartialUpdate**](FlowsApi.md#flowsInstancesPartialUpdate) | **PATCH** /flows/instances/{slug}/ | 
[**flowsInstancesRetrieve**](FlowsApi.md#flowsInstancesRetrieve) | **GET** /flows/instances/{slug}/ | 
[**flowsInstancesSetBackgroundCreate**](FlowsApi.md#flowsInstancesSetBackgroundCreate) | **POST** /flows/instances/{slug}/set_background/ | 
[**flowsInstancesSetBackgroundUrlCreate**](FlowsApi.md#flowsInstancesSetBackgroundUrlCreate) | **POST** /flows/instances/{slug}/set_background_url/ | 
[**flowsInstancesUpdate**](FlowsApi.md#flowsInstancesUpdate) | **PUT** /flows/instances/{slug}/ | 
[**flowsInstancesUsedByList**](FlowsApi.md#flowsInstancesUsedByList) | **GET** /flows/instances/{slug}/used_by/ | 


<a id="flowsBindingsCreate"></a>
# **flowsBindingsCreate**
> FlowStageBinding flowsBindingsCreate(flowStageBindingRequest)



FlowStageBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val flowStageBindingRequest : FlowStageBindingRequest =  // FlowStageBindingRequest | 
try {
    val result : FlowStageBinding = apiInstance.flowsBindingsCreate(flowStageBindingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsBindingsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsBindingsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowStageBindingRequest** | [**FlowStageBindingRequest**](FlowStageBindingRequest.md)|  |

### Return type

[**FlowStageBinding**](FlowStageBinding.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="flowsBindingsDestroy"></a>
# **flowsBindingsDestroy**
> flowsBindingsDestroy(fsbUuid)



FlowStageBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val fsbUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Flow Stage Binding.
try {
    apiInstance.flowsBindingsDestroy(fsbUuid)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsBindingsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsBindingsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsbUuid** | **java.util.UUID**| A UUID string identifying this Flow Stage Binding. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsBindingsList"></a>
# **flowsBindingsList**
> PaginatedFlowStageBindingList flowsBindingsList(evaluateOnPlan, fsbUuid, invalidResponseAction, order, ordering, page, pageSize, pbmUuid, policies, policyEngineMode, reEvaluatePolicies, search, stage, target)



FlowStageBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val evaluateOnPlan : kotlin.Boolean = true // kotlin.Boolean | 
val fsbUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invalidResponseAction : kotlin.String = invalidResponseAction_example // kotlin.String | Configure how the flow executor should handle an invalid response to a challenge. RETRY returns the error message and a similar challenge to the executor. RESTART restarts the flow from the beginning, and RESTART_WITH_CONTEXT restarts the flow while keeping the current context.  * `retry` - Retry * `restart` - Restart * `restart_with_context` - Restart With Context
val order : kotlin.Int = 56 // kotlin.Int | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val policies : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val policyEngineMode : kotlin.String = policyEngineMode_example // kotlin.String | * `all` - all, all policies must pass * `any` - any, any policy must pass
val reEvaluatePolicies : kotlin.Boolean = true // kotlin.Boolean | 
val search : kotlin.String = search_example // kotlin.String | A search term.
val stage : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val target : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaginatedFlowStageBindingList = apiInstance.flowsBindingsList(evaluateOnPlan, fsbUuid, invalidResponseAction, order, ordering, page, pageSize, pbmUuid, policies, policyEngineMode, reEvaluatePolicies, search, stage, target)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsBindingsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsBindingsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **evaluateOnPlan** | **kotlin.Boolean**|  | [optional]
 **fsbUuid** | **java.util.UUID**|  | [optional]
 **invalidResponseAction** | **kotlin.String**| Configure how the flow executor should handle an invalid response to a challenge. RETRY returns the error message and a similar challenge to the executor. RESTART restarts the flow from the beginning, and RESTART_WITH_CONTEXT restarts the flow while keeping the current context.  * &#x60;retry&#x60; - Retry * &#x60;restart&#x60; - Restart * &#x60;restart_with_context&#x60; - Restart With Context | [optional] [enum: restart, restart_with_context, retry]
 **order** | **kotlin.Int**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **pbmUuid** | **java.util.UUID**|  | [optional]
 **policies** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional]
 **policyEngineMode** | **kotlin.String**| * &#x60;all&#x60; - all, all policies must pass * &#x60;any&#x60; - any, any policy must pass | [optional] [enum: all, any]
 **reEvaluatePolicies** | **kotlin.Boolean**|  | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **stage** | **java.util.UUID**|  | [optional]
 **target** | **java.util.UUID**|  | [optional]

### Return type

[**PaginatedFlowStageBindingList**](PaginatedFlowStageBindingList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsBindingsPartialUpdate"></a>
# **flowsBindingsPartialUpdate**
> FlowStageBinding flowsBindingsPartialUpdate(fsbUuid, patchedFlowStageBindingRequest)



FlowStageBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val fsbUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Flow Stage Binding.
val patchedFlowStageBindingRequest : PatchedFlowStageBindingRequest =  // PatchedFlowStageBindingRequest | 
try {
    val result : FlowStageBinding = apiInstance.flowsBindingsPartialUpdate(fsbUuid, patchedFlowStageBindingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsBindingsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsBindingsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsbUuid** | **java.util.UUID**| A UUID string identifying this Flow Stage Binding. |
 **patchedFlowStageBindingRequest** | [**PatchedFlowStageBindingRequest**](PatchedFlowStageBindingRequest.md)|  | [optional]

### Return type

[**FlowStageBinding**](FlowStageBinding.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="flowsBindingsRetrieve"></a>
# **flowsBindingsRetrieve**
> FlowStageBinding flowsBindingsRetrieve(fsbUuid)



FlowStageBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val fsbUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Flow Stage Binding.
try {
    val result : FlowStageBinding = apiInstance.flowsBindingsRetrieve(fsbUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsBindingsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsBindingsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsbUuid** | **java.util.UUID**| A UUID string identifying this Flow Stage Binding. |

### Return type

[**FlowStageBinding**](FlowStageBinding.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsBindingsUpdate"></a>
# **flowsBindingsUpdate**
> FlowStageBinding flowsBindingsUpdate(fsbUuid, flowStageBindingRequest)



FlowStageBinding Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val fsbUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Flow Stage Binding.
val flowStageBindingRequest : FlowStageBindingRequest =  // FlowStageBindingRequest | 
try {
    val result : FlowStageBinding = apiInstance.flowsBindingsUpdate(fsbUuid, flowStageBindingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsBindingsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsBindingsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsbUuid** | **java.util.UUID**| A UUID string identifying this Flow Stage Binding. |
 **flowStageBindingRequest** | [**FlowStageBindingRequest**](FlowStageBindingRequest.md)|  |

### Return type

[**FlowStageBinding**](FlowStageBinding.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="flowsBindingsUsedByList"></a>
# **flowsBindingsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; flowsBindingsUsedByList(fsbUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val fsbUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Flow Stage Binding.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.flowsBindingsUsedByList(fsbUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsBindingsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsBindingsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsbUuid** | **java.util.UUID**| A UUID string identifying this Flow Stage Binding. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsExecutorGet"></a>
# **flowsExecutorGet**
> ChallengeTypes flowsExecutorGet(flowSlug, query)



Get the next pending challenge from the currently active flow.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val flowSlug : kotlin.String = flowSlug_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | Querystring as received
try {
    val result : ChallengeTypes = apiInstance.flowsExecutorGet(flowSlug, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsExecutorGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsExecutorGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowSlug** | **kotlin.String**|  |
 **query** | **kotlin.String**| Querystring as received |

### Return type

[**ChallengeTypes**](ChallengeTypes.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsExecutorSolve"></a>
# **flowsExecutorSolve**
> ChallengeTypes flowsExecutorSolve(flowSlug, query, flowChallengeResponseRequest)



Solve the previously retrieved challenge and advanced to the next stage.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val flowSlug : kotlin.String = flowSlug_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | Querystring as received
val flowChallengeResponseRequest : FlowChallengeResponseRequest =  // FlowChallengeResponseRequest | 
try {
    val result : ChallengeTypes = apiInstance.flowsExecutorSolve(flowSlug, query, flowChallengeResponseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsExecutorSolve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsExecutorSolve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowSlug** | **kotlin.String**|  |
 **query** | **kotlin.String**| Querystring as received |
 **flowChallengeResponseRequest** | [**FlowChallengeResponseRequest**](FlowChallengeResponseRequest.md)|  | [optional]

### Return type

[**ChallengeTypes**](ChallengeTypes.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="flowsInspectorGet"></a>
# **flowsInspectorGet**
> FlowInspection flowsInspectorGet(flowSlug)



Get current flow state and record it

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val flowSlug : kotlin.String = flowSlug_example // kotlin.String | 
try {
    val result : FlowInspection = apiInstance.flowsInspectorGet(flowSlug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInspectorGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInspectorGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowSlug** | **kotlin.String**|  |

### Return type

[**FlowInspection**](FlowInspection.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsInstancesCacheClearCreate"></a>
# **flowsInstancesCacheClearCreate**
> flowsInstancesCacheClearCreate()



Clear flow cache

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
try {
    apiInstance.flowsInstancesCacheClearCreate()
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesCacheClearCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesCacheClearCreate")
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

<a id="flowsInstancesCacheInfoRetrieve"></a>
# **flowsInstancesCacheInfoRetrieve**
> Cache flowsInstancesCacheInfoRetrieve()



Info about cached flows

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
try {
    val result : Cache = apiInstance.flowsInstancesCacheInfoRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesCacheInfoRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesCacheInfoRetrieve")
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

<a id="flowsInstancesCreate"></a>
# **flowsInstancesCreate**
> Flow flowsInstancesCreate(flowRequest)



Flow Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val flowRequest : FlowRequest =  // FlowRequest | 
try {
    val result : Flow = apiInstance.flowsInstancesCreate(flowRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowRequest** | [**FlowRequest**](FlowRequest.md)|  |

### Return type

[**Flow**](Flow.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="flowsInstancesDestroy"></a>
# **flowsInstancesDestroy**
> flowsInstancesDestroy(slug)



Flow Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    apiInstance.flowsInstancesDestroy(slug)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsInstancesDiagramRetrieve"></a>
# **flowsInstancesDiagramRetrieve**
> FlowDiagram flowsInstancesDiagramRetrieve(slug)



Return diagram for flow with slug &#x60;slug&#x60;, in the format used by flowchart.js

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : FlowDiagram = apiInstance.flowsInstancesDiagramRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesDiagramRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesDiagramRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**FlowDiagram**](FlowDiagram.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsInstancesExecuteRetrieve"></a>
# **flowsInstancesExecuteRetrieve**
> Link flowsInstancesExecuteRetrieve(slug)



Execute flow for current user

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : Link = apiInstance.flowsInstancesExecuteRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesExecuteRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesExecuteRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**Link**](Link.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsInstancesExportRetrieve"></a>
# **flowsInstancesExportRetrieve**
> java.io.File flowsInstancesExportRetrieve(slug)



Export flow to .yaml file

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.flowsInstancesExportRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesExportRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesExportRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsInstancesImportCreate"></a>
# **flowsInstancesImportCreate**
> FlowImportResult flowsInstancesImportCreate(file, clear)



Import flow from .yaml file

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
val clear : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FlowImportResult = apiInstance.flowsInstancesImportCreate(file, clear)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesImportCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesImportCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**|  | [optional]
 **clear** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**FlowImportResult**](FlowImportResult.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="flowsInstancesList"></a>
# **flowsInstancesList**
> PaginatedFlowList flowsInstancesList(deniedAction, designation, flowUuid, name, ordering, page, pageSize, search, slug)



Flow Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val deniedAction : kotlin.String = deniedAction_example // kotlin.String | Configure what should happen when a flow denies access to a user.  * `message_continue` - Message Continue * `message` - Message * `continue` - Continue
val designation : kotlin.String = designation_example // kotlin.String | Decides what this Flow is used for. For example, the Authentication flow is redirect to when an un-authenticated user visits authentik.  * `authentication` - Authentication * `authorization` - Authorization * `invalidation` - Invalidation * `enrollment` - Enrollment * `unenrollment` - Unrenollment * `recovery` - Recovery * `stage_configuration` - Stage Configuration
val flowUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : PaginatedFlowList = apiInstance.flowsInstancesList(deniedAction, designation, flowUuid, name, ordering, page, pageSize, search, slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deniedAction** | **kotlin.String**| Configure what should happen when a flow denies access to a user.  * &#x60;message_continue&#x60; - Message Continue * &#x60;message&#x60; - Message * &#x60;continue&#x60; - Continue | [optional] [enum: continue, message, message_continue]
 **designation** | **kotlin.String**| Decides what this Flow is used for. For example, the Authentication flow is redirect to when an un-authenticated user visits authentik.  * &#x60;authentication&#x60; - Authentication * &#x60;authorization&#x60; - Authorization * &#x60;invalidation&#x60; - Invalidation * &#x60;enrollment&#x60; - Enrollment * &#x60;unenrollment&#x60; - Unrenollment * &#x60;recovery&#x60; - Recovery * &#x60;stage_configuration&#x60; - Stage Configuration | [optional] [enum: authentication, authorization, enrollment, invalidation, recovery, stage_configuration, unenrollment]
 **flowUuid** | **java.util.UUID**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **slug** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedFlowList**](PaginatedFlowList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsInstancesPartialUpdate"></a>
# **flowsInstancesPartialUpdate**
> Flow flowsInstancesPartialUpdate(slug, patchedFlowRequest)



Flow Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val patchedFlowRequest : PatchedFlowRequest =  // PatchedFlowRequest | 
try {
    val result : Flow = apiInstance.flowsInstancesPartialUpdate(slug, patchedFlowRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **patchedFlowRequest** | [**PatchedFlowRequest**](PatchedFlowRequest.md)|  | [optional]

### Return type

[**Flow**](Flow.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="flowsInstancesRetrieve"></a>
# **flowsInstancesRetrieve**
> Flow flowsInstancesRetrieve(slug)



Flow Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : Flow = apiInstance.flowsInstancesRetrieve(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**Flow**](Flow.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="flowsInstancesSetBackgroundCreate"></a>
# **flowsInstancesSetBackgroundCreate**
> flowsInstancesSetBackgroundCreate(slug, file, clear)



Set Flow background

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
val clear : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.flowsInstancesSetBackgroundCreate(slug, file, clear)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesSetBackgroundCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesSetBackgroundCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **file** | **java.io.File**|  | [optional]
 **clear** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="flowsInstancesSetBackgroundUrlCreate"></a>
# **flowsInstancesSetBackgroundUrlCreate**
> flowsInstancesSetBackgroundUrlCreate(slug, filePathRequest)



Set Flow background (as URL)

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val filePathRequest : FilePathRequest =  // FilePathRequest | 
try {
    apiInstance.flowsInstancesSetBackgroundUrlCreate(slug, filePathRequest)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesSetBackgroundUrlCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesSetBackgroundUrlCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **filePathRequest** | [**FilePathRequest**](FilePathRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="flowsInstancesUpdate"></a>
# **flowsInstancesUpdate**
> Flow flowsInstancesUpdate(slug, flowRequest)



Flow Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val flowRequest : FlowRequest =  // FlowRequest | 
try {
    val result : Flow = apiInstance.flowsInstancesUpdate(slug, flowRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **flowRequest** | [**FlowRequest**](FlowRequest.md)|  |

### Return type

[**Flow**](Flow.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="flowsInstancesUsedByList"></a>
# **flowsInstancesUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; flowsInstancesUsedByList(slug)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = FlowsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.flowsInstancesUsedByList(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#flowsInstancesUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#flowsInstancesUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

