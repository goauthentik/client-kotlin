# TenantsApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tenantsDomainsCreate**](TenantsApi.md#tenantsDomainsCreate) | **POST** /tenants/domains/ | 
[**tenantsDomainsDestroy**](TenantsApi.md#tenantsDomainsDestroy) | **DELETE** /tenants/domains/{id}/ | 
[**tenantsDomainsList**](TenantsApi.md#tenantsDomainsList) | **GET** /tenants/domains/ | 
[**tenantsDomainsPartialUpdate**](TenantsApi.md#tenantsDomainsPartialUpdate) | **PATCH** /tenants/domains/{id}/ | 
[**tenantsDomainsRetrieve**](TenantsApi.md#tenantsDomainsRetrieve) | **GET** /tenants/domains/{id}/ | 
[**tenantsDomainsUpdate**](TenantsApi.md#tenantsDomainsUpdate) | **PUT** /tenants/domains/{id}/ | 
[**tenantsTenantsCreate**](TenantsApi.md#tenantsTenantsCreate) | **POST** /tenants/tenants/ | 
[**tenantsTenantsCreateAdminGroupCreate**](TenantsApi.md#tenantsTenantsCreateAdminGroupCreate) | **POST** /tenants/tenants/{tenant_uuid}/create_admin_group/ | 
[**tenantsTenantsCreateRecoveryKeyCreate**](TenantsApi.md#tenantsTenantsCreateRecoveryKeyCreate) | **POST** /tenants/tenants/{tenant_uuid}/create_recovery_key/ | 
[**tenantsTenantsDestroy**](TenantsApi.md#tenantsTenantsDestroy) | **DELETE** /tenants/tenants/{tenant_uuid}/ | 
[**tenantsTenantsList**](TenantsApi.md#tenantsTenantsList) | **GET** /tenants/tenants/ | 
[**tenantsTenantsPartialUpdate**](TenantsApi.md#tenantsTenantsPartialUpdate) | **PATCH** /tenants/tenants/{tenant_uuid}/ | 
[**tenantsTenantsRetrieve**](TenantsApi.md#tenantsTenantsRetrieve) | **GET** /tenants/tenants/{tenant_uuid}/ | 
[**tenantsTenantsUpdate**](TenantsApi.md#tenantsTenantsUpdate) | **PUT** /tenants/tenants/{tenant_uuid}/ | 


<a id="tenantsDomainsCreate"></a>
# **tenantsDomainsCreate**
> Domain tenantsDomainsCreate(domainRequest)



Domain ViewSet

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val domainRequest : DomainRequest =  // DomainRequest | 
try {
    val result : Domain = apiInstance.tenantsDomainsCreate(domainRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsDomainsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsDomainsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainRequest** | [**DomainRequest**](DomainRequest.md)|  |

### Return type

[**Domain**](Domain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tenantsDomainsDestroy"></a>
# **tenantsDomainsDestroy**
> tenantsDomainsDestroy(id)



Domain ViewSet

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Domain.
try {
    apiInstance.tenantsDomainsDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsDomainsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsDomainsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Domain. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tenantsDomainsList"></a>
# **tenantsDomainsList**
> PaginatedDomainList tenantsDomainsList(ordering, page, pageSize, search)



Domain ViewSet

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedDomainList = apiInstance.tenantsDomainsList(ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsDomainsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsDomainsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedDomainList**](PaginatedDomainList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tenantsDomainsPartialUpdate"></a>
# **tenantsDomainsPartialUpdate**
> Domain tenantsDomainsPartialUpdate(id, patchedDomainRequest)



Domain ViewSet

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Domain.
val patchedDomainRequest : PatchedDomainRequest =  // PatchedDomainRequest | 
try {
    val result : Domain = apiInstance.tenantsDomainsPartialUpdate(id, patchedDomainRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsDomainsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsDomainsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Domain. |
 **patchedDomainRequest** | [**PatchedDomainRequest**](PatchedDomainRequest.md)|  | [optional]

### Return type

[**Domain**](Domain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tenantsDomainsRetrieve"></a>
# **tenantsDomainsRetrieve**
> Domain tenantsDomainsRetrieve(id)



Domain ViewSet

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Domain.
try {
    val result : Domain = apiInstance.tenantsDomainsRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsDomainsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsDomainsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Domain. |

### Return type

[**Domain**](Domain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tenantsDomainsUpdate"></a>
# **tenantsDomainsUpdate**
> Domain tenantsDomainsUpdate(id, domainRequest)



Domain ViewSet

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Domain.
val domainRequest : DomainRequest =  // DomainRequest | 
try {
    val result : Domain = apiInstance.tenantsDomainsUpdate(id, domainRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsDomainsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsDomainsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| A unique integer value identifying this Domain. |
 **domainRequest** | [**DomainRequest**](DomainRequest.md)|  |

### Return type

[**Domain**](Domain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tenantsTenantsCreate"></a>
# **tenantsTenantsCreate**
> Tenant tenantsTenantsCreate(tenantRequest)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val tenantRequest : TenantRequest =  // TenantRequest | 
try {
    val result : Tenant = apiInstance.tenantsTenantsCreate(tenantRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsTenantsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsTenantsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantRequest** | [**TenantRequest**](TenantRequest.md)|  |

### Return type

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tenantsTenantsCreateAdminGroupCreate"></a>
# **tenantsTenantsCreateAdminGroupCreate**
> tenantsTenantsCreateAdminGroupCreate(tenantUuid, tenantAdminGroupRequestRequest)



Create admin group and add user to it.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
val tenantAdminGroupRequestRequest : TenantAdminGroupRequestRequest =  // TenantAdminGroupRequestRequest | 
try {
    apiInstance.tenantsTenantsCreateAdminGroupCreate(tenantUuid, tenantAdminGroupRequestRequest)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsTenantsCreateAdminGroupCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsTenantsCreateAdminGroupCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |
 **tenantAdminGroupRequestRequest** | [**TenantAdminGroupRequestRequest**](TenantAdminGroupRequestRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tenantsTenantsCreateRecoveryKeyCreate"></a>
# **tenantsTenantsCreateRecoveryKeyCreate**
> TenantRecoveryKeyResponse tenantsTenantsCreateRecoveryKeyCreate(tenantUuid, tenantRecoveryKeyRequestRequest)



Create recovery key for user.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
val tenantRecoveryKeyRequestRequest : TenantRecoveryKeyRequestRequest =  // TenantRecoveryKeyRequestRequest | 
try {
    val result : TenantRecoveryKeyResponse = apiInstance.tenantsTenantsCreateRecoveryKeyCreate(tenantUuid, tenantRecoveryKeyRequestRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsTenantsCreateRecoveryKeyCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsTenantsCreateRecoveryKeyCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |
 **tenantRecoveryKeyRequestRequest** | [**TenantRecoveryKeyRequestRequest**](TenantRecoveryKeyRequestRequest.md)|  |

### Return type

[**TenantRecoveryKeyResponse**](TenantRecoveryKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tenantsTenantsDestroy"></a>
# **tenantsTenantsDestroy**
> tenantsTenantsDestroy(tenantUuid)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
try {
    apiInstance.tenantsTenantsDestroy(tenantUuid)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsTenantsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsTenantsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tenantsTenantsList"></a>
# **tenantsTenantsList**
> PaginatedTenantList tenantsTenantsList(ordering, page, pageSize, search)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
try {
    val result : PaginatedTenantList = apiInstance.tenantsTenantsList(ordering, page, pageSize, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsTenantsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsTenantsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]

### Return type

[**PaginatedTenantList**](PaginatedTenantList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tenantsTenantsPartialUpdate"></a>
# **tenantsTenantsPartialUpdate**
> Tenant tenantsTenantsPartialUpdate(tenantUuid, patchedTenantRequest)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
val patchedTenantRequest : PatchedTenantRequest =  // PatchedTenantRequest | 
try {
    val result : Tenant = apiInstance.tenantsTenantsPartialUpdate(tenantUuid, patchedTenantRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsTenantsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsTenantsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |
 **patchedTenantRequest** | [**PatchedTenantRequest**](PatchedTenantRequest.md)|  | [optional]

### Return type

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tenantsTenantsRetrieve"></a>
# **tenantsTenantsRetrieve**
> Tenant tenantsTenantsRetrieve(tenantUuid)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
try {
    val result : Tenant = apiInstance.tenantsTenantsRetrieve(tenantUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsTenantsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsTenantsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |

### Return type

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tenantsTenantsUpdate"></a>
# **tenantsTenantsUpdate**
> Tenant tenantsTenantsUpdate(tenantUuid, tenantRequest)



Tenant Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = TenantsApi()
val tenantUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Tenant.
val tenantRequest : TenantRequest =  // TenantRequest | 
try {
    val result : Tenant = apiInstance.tenantsTenantsUpdate(tenantUuid, tenantRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#tenantsTenantsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#tenantsTenantsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantUuid** | **java.util.UUID**| A UUID string identifying this Tenant. |
 **tenantRequest** | [**TenantRequest**](TenantRequest.md)|  |

### Return type

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

