# EventsApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsEventsActionsList**](EventsApi.md#eventsEventsActionsList) | **GET** /events/events/actions/ | 
[**eventsEventsCreate**](EventsApi.md#eventsEventsCreate) | **POST** /events/events/ | 
[**eventsEventsDestroy**](EventsApi.md#eventsEventsDestroy) | **DELETE** /events/events/{event_uuid}/ | 
[**eventsEventsList**](EventsApi.md#eventsEventsList) | **GET** /events/events/ | 
[**eventsEventsPartialUpdate**](EventsApi.md#eventsEventsPartialUpdate) | **PATCH** /events/events/{event_uuid}/ | 
[**eventsEventsPerMonthList**](EventsApi.md#eventsEventsPerMonthList) | **GET** /events/events/per_month/ | 
[**eventsEventsRetrieve**](EventsApi.md#eventsEventsRetrieve) | **GET** /events/events/{event_uuid}/ | 
[**eventsEventsTopPerUserList**](EventsApi.md#eventsEventsTopPerUserList) | **GET** /events/events/top_per_user/ | 
[**eventsEventsUpdate**](EventsApi.md#eventsEventsUpdate) | **PUT** /events/events/{event_uuid}/ | 
[**eventsNotificationsDestroy**](EventsApi.md#eventsNotificationsDestroy) | **DELETE** /events/notifications/{uuid}/ | 
[**eventsNotificationsList**](EventsApi.md#eventsNotificationsList) | **GET** /events/notifications/ | 
[**eventsNotificationsMarkAllSeenCreate**](EventsApi.md#eventsNotificationsMarkAllSeenCreate) | **POST** /events/notifications/mark_all_seen/ | 
[**eventsNotificationsPartialUpdate**](EventsApi.md#eventsNotificationsPartialUpdate) | **PATCH** /events/notifications/{uuid}/ | 
[**eventsNotificationsRetrieve**](EventsApi.md#eventsNotificationsRetrieve) | **GET** /events/notifications/{uuid}/ | 
[**eventsNotificationsUpdate**](EventsApi.md#eventsNotificationsUpdate) | **PUT** /events/notifications/{uuid}/ | 
[**eventsNotificationsUsedByList**](EventsApi.md#eventsNotificationsUsedByList) | **GET** /events/notifications/{uuid}/used_by/ | 
[**eventsRulesCreate**](EventsApi.md#eventsRulesCreate) | **POST** /events/rules/ | 
[**eventsRulesDestroy**](EventsApi.md#eventsRulesDestroy) | **DELETE** /events/rules/{pbm_uuid}/ | 
[**eventsRulesList**](EventsApi.md#eventsRulesList) | **GET** /events/rules/ | 
[**eventsRulesPartialUpdate**](EventsApi.md#eventsRulesPartialUpdate) | **PATCH** /events/rules/{pbm_uuid}/ | 
[**eventsRulesRetrieve**](EventsApi.md#eventsRulesRetrieve) | **GET** /events/rules/{pbm_uuid}/ | 
[**eventsRulesUpdate**](EventsApi.md#eventsRulesUpdate) | **PUT** /events/rules/{pbm_uuid}/ | 
[**eventsRulesUsedByList**](EventsApi.md#eventsRulesUsedByList) | **GET** /events/rules/{pbm_uuid}/used_by/ | 
[**eventsTransportsCreate**](EventsApi.md#eventsTransportsCreate) | **POST** /events/transports/ | 
[**eventsTransportsDestroy**](EventsApi.md#eventsTransportsDestroy) | **DELETE** /events/transports/{uuid}/ | 
[**eventsTransportsList**](EventsApi.md#eventsTransportsList) | **GET** /events/transports/ | 
[**eventsTransportsPartialUpdate**](EventsApi.md#eventsTransportsPartialUpdate) | **PATCH** /events/transports/{uuid}/ | 
[**eventsTransportsRetrieve**](EventsApi.md#eventsTransportsRetrieve) | **GET** /events/transports/{uuid}/ | 
[**eventsTransportsTestCreate**](EventsApi.md#eventsTransportsTestCreate) | **POST** /events/transports/{uuid}/test/ | 
[**eventsTransportsUpdate**](EventsApi.md#eventsTransportsUpdate) | **PUT** /events/transports/{uuid}/ | 
[**eventsTransportsUsedByList**](EventsApi.md#eventsTransportsUsedByList) | **GET** /events/transports/{uuid}/used_by/ | 


<a id="eventsEventsActionsList"></a>
# **eventsEventsActionsList**
> kotlin.collections.List&lt;TypeCreate&gt; eventsEventsActionsList()



Get all actions

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
try {
    val result : kotlin.collections.List<TypeCreate> = apiInstance.eventsEventsActionsList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsEventsActionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsEventsActionsList")
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

<a id="eventsEventsCreate"></a>
# **eventsEventsCreate**
> Event eventsEventsCreate(eventRequest)



Event Read-Only Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val eventRequest : EventRequest =  // EventRequest | 
try {
    val result : Event = apiInstance.eventsEventsCreate(eventRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsEventsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsEventsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventRequest** | [**EventRequest**](EventRequest.md)|  |

### Return type

[**Event**](Event.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsEventsDestroy"></a>
# **eventsEventsDestroy**
> eventsEventsDestroy(eventUuid)



Event Read-Only Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val eventUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Event.
try {
    apiInstance.eventsEventsDestroy(eventUuid)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsEventsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsEventsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventUuid** | **java.util.UUID**| A UUID string identifying this Event. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsEventsList"></a>
# **eventsEventsList**
> PaginatedEventList eventsEventsList(action, clientIp, contextAuthorizedApp, contextModelApp, contextModelName, contextModelPk, ordering, page, pageSize, search, tenantName, username)



Event Read-Only Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val action : kotlin.String = action_example // kotlin.String | 
val clientIp : kotlin.String = clientIp_example // kotlin.String | 
val contextAuthorizedApp : kotlin.String = contextAuthorizedApp_example // kotlin.String | Context Authorized application
val contextModelApp : kotlin.String = contextModelApp_example // kotlin.String | Context Model App
val contextModelName : kotlin.String = contextModelName_example // kotlin.String | Context Model Name
val contextModelPk : kotlin.String = contextModelPk_example // kotlin.String | Context Model Primary Key
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val tenantName : kotlin.String = tenantName_example // kotlin.String | Tenant name
val username : kotlin.String = username_example // kotlin.String | Username
try {
    val result : PaginatedEventList = apiInstance.eventsEventsList(action, clientIp, contextAuthorizedApp, contextModelApp, contextModelName, contextModelPk, ordering, page, pageSize, search, tenantName, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsEventsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsEventsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **kotlin.String**|  | [optional]
 **clientIp** | **kotlin.String**|  | [optional]
 **contextAuthorizedApp** | **kotlin.String**| Context Authorized application | [optional]
 **contextModelApp** | **kotlin.String**| Context Model App | [optional]
 **contextModelName** | **kotlin.String**| Context Model Name | [optional]
 **contextModelPk** | **kotlin.String**| Context Model Primary Key | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **tenantName** | **kotlin.String**| Tenant name | [optional]
 **username** | **kotlin.String**| Username | [optional]

### Return type

[**PaginatedEventList**](PaginatedEventList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsEventsPartialUpdate"></a>
# **eventsEventsPartialUpdate**
> Event eventsEventsPartialUpdate(eventUuid, patchedEventRequest)



Event Read-Only Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val eventUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Event.
val patchedEventRequest : PatchedEventRequest =  // PatchedEventRequest | 
try {
    val result : Event = apiInstance.eventsEventsPartialUpdate(eventUuid, patchedEventRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsEventsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsEventsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventUuid** | **java.util.UUID**| A UUID string identifying this Event. |
 **patchedEventRequest** | [**PatchedEventRequest**](PatchedEventRequest.md)|  | [optional]

### Return type

[**Event**](Event.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsEventsPerMonthList"></a>
# **eventsEventsPerMonthList**
> kotlin.collections.List&lt;Coordinate&gt; eventsEventsPerMonthList(action, query)



Get the count of events per month

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val action : kotlin.String = action_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Coordinate> = apiInstance.eventsEventsPerMonthList(action, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsEventsPerMonthList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsEventsPerMonthList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **kotlin.String**|  | [optional]
 **query** | **kotlin.String**|  | [optional]

### Return type

[**kotlin.collections.List&lt;Coordinate&gt;**](Coordinate.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsEventsRetrieve"></a>
# **eventsEventsRetrieve**
> Event eventsEventsRetrieve(eventUuid)



Event Read-Only Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val eventUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Event.
try {
    val result : Event = apiInstance.eventsEventsRetrieve(eventUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsEventsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsEventsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventUuid** | **java.util.UUID**| A UUID string identifying this Event. |

### Return type

[**Event**](Event.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsEventsTopPerUserList"></a>
# **eventsEventsTopPerUserList**
> kotlin.collections.List&lt;EventTopPerUser&gt; eventsEventsTopPerUserList(action, topN)



Get the top_n events grouped by user count

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val action : kotlin.String = action_example // kotlin.String | 
val topN : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.collections.List<EventTopPerUser> = apiInstance.eventsEventsTopPerUserList(action, topN)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsEventsTopPerUserList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsEventsTopPerUserList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **kotlin.String**|  | [optional]
 **topN** | **kotlin.Int**|  | [optional]

### Return type

[**kotlin.collections.List&lt;EventTopPerUser&gt;**](EventTopPerUser.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsEventsUpdate"></a>
# **eventsEventsUpdate**
> Event eventsEventsUpdate(eventUuid, eventRequest)



Event Read-Only Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val eventUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Event.
val eventRequest : EventRequest =  // EventRequest | 
try {
    val result : Event = apiInstance.eventsEventsUpdate(eventUuid, eventRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsEventsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsEventsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventUuid** | **java.util.UUID**| A UUID string identifying this Event. |
 **eventRequest** | [**EventRequest**](EventRequest.md)|  |

### Return type

[**Event**](Event.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsNotificationsDestroy"></a>
# **eventsNotificationsDestroy**
> eventsNotificationsDestroy(uuid)



Notification Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification.
try {
    apiInstance.eventsNotificationsDestroy(uuid)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsNotificationsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsNotificationsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsNotificationsList"></a>
# **eventsNotificationsList**
> PaginatedNotificationList eventsNotificationsList(body, created, event, ordering, page, pageSize, search, seen, severity, user)



Notification Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val body : kotlin.String = body_example // kotlin.String | 
val created : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val event : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val seen : kotlin.Boolean = true // kotlin.Boolean | 
val severity : kotlin.String = severity_example // kotlin.String | * `notice` - Notice * `warning` - Warning * `alert` - Alert
val user : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedNotificationList = apiInstance.eventsNotificationsList(body, created, event, ordering, page, pageSize, search, seen, severity, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsNotificationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsNotificationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  | [optional]
 **created** | **java.time.OffsetDateTime**|  | [optional]
 **event** | **java.util.UUID**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **seen** | **kotlin.Boolean**|  | [optional]
 **severity** | **kotlin.String**| * &#x60;notice&#x60; - Notice * &#x60;warning&#x60; - Warning * &#x60;alert&#x60; - Alert | [optional] [enum: alert, notice, warning]
 **user** | **kotlin.Int**|  | [optional]

### Return type

[**PaginatedNotificationList**](PaginatedNotificationList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsNotificationsMarkAllSeenCreate"></a>
# **eventsNotificationsMarkAllSeenCreate**
> eventsNotificationsMarkAllSeenCreate()



Mark all the user&#39;s notifications as seen

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
try {
    apiInstance.eventsNotificationsMarkAllSeenCreate()
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsNotificationsMarkAllSeenCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsNotificationsMarkAllSeenCreate")
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

<a id="eventsNotificationsPartialUpdate"></a>
# **eventsNotificationsPartialUpdate**
> Notification eventsNotificationsPartialUpdate(uuid, patchedNotificationRequest)



Notification Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification.
val patchedNotificationRequest : PatchedNotificationRequest =  // PatchedNotificationRequest | 
try {
    val result : Notification = apiInstance.eventsNotificationsPartialUpdate(uuid, patchedNotificationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsNotificationsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsNotificationsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification. |
 **patchedNotificationRequest** | [**PatchedNotificationRequest**](PatchedNotificationRequest.md)|  | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsNotificationsRetrieve"></a>
# **eventsNotificationsRetrieve**
> Notification eventsNotificationsRetrieve(uuid)



Notification Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification.
try {
    val result : Notification = apiInstance.eventsNotificationsRetrieve(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsNotificationsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsNotificationsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification. |

### Return type

[**Notification**](Notification.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsNotificationsUpdate"></a>
# **eventsNotificationsUpdate**
> Notification eventsNotificationsUpdate(uuid, notificationRequest)



Notification Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification.
val notificationRequest : NotificationRequest =  // NotificationRequest | 
try {
    val result : Notification = apiInstance.eventsNotificationsUpdate(uuid, notificationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsNotificationsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsNotificationsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification. |
 **notificationRequest** | [**NotificationRequest**](NotificationRequest.md)|  | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsNotificationsUsedByList"></a>
# **eventsNotificationsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; eventsNotificationsUsedByList(uuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.eventsNotificationsUsedByList(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsNotificationsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsNotificationsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsRulesCreate"></a>
# **eventsRulesCreate**
> NotificationRule eventsRulesCreate(notificationRuleRequest)



NotificationRule Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val notificationRuleRequest : NotificationRuleRequest =  // NotificationRuleRequest | 
try {
    val result : NotificationRule = apiInstance.eventsRulesCreate(notificationRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsRulesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsRulesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationRuleRequest** | [**NotificationRuleRequest**](NotificationRuleRequest.md)|  |

### Return type

[**NotificationRule**](NotificationRule.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsRulesDestroy"></a>
# **eventsRulesDestroy**
> eventsRulesDestroy(pbmUuid)



NotificationRule Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Rule.
try {
    apiInstance.eventsRulesDestroy(pbmUuid)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsRulesDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsRulesDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this Notification Rule. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsRulesList"></a>
# **eventsRulesList**
> PaginatedNotificationRuleList eventsRulesList(groupName, name, ordering, page, pageSize, search, severity)



NotificationRule Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val groupName : kotlin.String = groupName_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val severity : kotlin.String = severity_example // kotlin.String | Controls which severity level the created notifications will have.  * `notice` - Notice * `warning` - Warning * `alert` - Alert
try {
    val result : PaginatedNotificationRuleList = apiInstance.eventsRulesList(groupName, name, ordering, page, pageSize, search, severity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsRulesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsRulesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **severity** | **kotlin.String**| Controls which severity level the created notifications will have.  * &#x60;notice&#x60; - Notice * &#x60;warning&#x60; - Warning * &#x60;alert&#x60; - Alert | [optional] [enum: alert, notice, warning]

### Return type

[**PaginatedNotificationRuleList**](PaginatedNotificationRuleList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsRulesPartialUpdate"></a>
# **eventsRulesPartialUpdate**
> NotificationRule eventsRulesPartialUpdate(pbmUuid, patchedNotificationRuleRequest)



NotificationRule Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Rule.
val patchedNotificationRuleRequest : PatchedNotificationRuleRequest =  // PatchedNotificationRuleRequest | 
try {
    val result : NotificationRule = apiInstance.eventsRulesPartialUpdate(pbmUuid, patchedNotificationRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsRulesPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsRulesPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this Notification Rule. |
 **patchedNotificationRuleRequest** | [**PatchedNotificationRuleRequest**](PatchedNotificationRuleRequest.md)|  | [optional]

### Return type

[**NotificationRule**](NotificationRule.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsRulesRetrieve"></a>
# **eventsRulesRetrieve**
> NotificationRule eventsRulesRetrieve(pbmUuid)



NotificationRule Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Rule.
try {
    val result : NotificationRule = apiInstance.eventsRulesRetrieve(pbmUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsRulesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsRulesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this Notification Rule. |

### Return type

[**NotificationRule**](NotificationRule.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsRulesUpdate"></a>
# **eventsRulesUpdate**
> NotificationRule eventsRulesUpdate(pbmUuid, notificationRuleRequest)



NotificationRule Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Rule.
val notificationRuleRequest : NotificationRuleRequest =  // NotificationRuleRequest | 
try {
    val result : NotificationRule = apiInstance.eventsRulesUpdate(pbmUuid, notificationRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsRulesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsRulesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this Notification Rule. |
 **notificationRuleRequest** | [**NotificationRuleRequest**](NotificationRuleRequest.md)|  |

### Return type

[**NotificationRule**](NotificationRule.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsRulesUsedByList"></a>
# **eventsRulesUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; eventsRulesUsedByList(pbmUuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val pbmUuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Rule.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.eventsRulesUsedByList(pbmUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsRulesUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsRulesUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbmUuid** | **java.util.UUID**| A UUID string identifying this Notification Rule. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsTransportsCreate"></a>
# **eventsTransportsCreate**
> NotificationTransport eventsTransportsCreate(notificationTransportRequest)



NotificationTransport Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val notificationTransportRequest : NotificationTransportRequest =  // NotificationTransportRequest | 
try {
    val result : NotificationTransport = apiInstance.eventsTransportsCreate(notificationTransportRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsTransportsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsTransportsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationTransportRequest** | [**NotificationTransportRequest**](NotificationTransportRequest.md)|  |

### Return type

[**NotificationTransport**](NotificationTransport.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsTransportsDestroy"></a>
# **eventsTransportsDestroy**
> eventsTransportsDestroy(uuid)



NotificationTransport Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Transport.
try {
    apiInstance.eventsTransportsDestroy(uuid)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsTransportsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsTransportsDestroy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification Transport. |

### Return type

null (empty response body)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsTransportsList"></a>
# **eventsTransportsList**
> PaginatedNotificationTransportList eventsTransportsList(mode, name, ordering, page, pageSize, search, sendOnce, webhookUrl)



NotificationTransport Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val mode : kotlin.String = mode_example // kotlin.String | * `local` - authentik inbuilt notifications * `webhook` - Generic Webhook * `webhook_slack` - Slack Webhook (Slack/Discord) * `email` - Email
val name : kotlin.String = name_example // kotlin.String | 
val ordering : kotlin.String = ordering_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val search : kotlin.String = search_example // kotlin.String | A search term.
val sendOnce : kotlin.Boolean = true // kotlin.Boolean | 
val webhookUrl : kotlin.String = webhookUrl_example // kotlin.String | 
try {
    val result : PaginatedNotificationTransportList = apiInstance.eventsTransportsList(mode, name, ordering, page, pageSize, search, sendOnce, webhookUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsTransportsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsTransportsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mode** | **kotlin.String**| * &#x60;local&#x60; - authentik inbuilt notifications * &#x60;webhook&#x60; - Generic Webhook * &#x60;webhook_slack&#x60; - Slack Webhook (Slack/Discord) * &#x60;email&#x60; - Email | [optional] [enum: email, local, webhook, webhook_slack]
 **name** | **kotlin.String**|  | [optional]
 **ordering** | **kotlin.String**| Which field to use when ordering the results. | [optional]
 **page** | **kotlin.Int**| A page number within the paginated result set. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **search** | **kotlin.String**| A search term. | [optional]
 **sendOnce** | **kotlin.Boolean**|  | [optional]
 **webhookUrl** | **kotlin.String**|  | [optional]

### Return type

[**PaginatedNotificationTransportList**](PaginatedNotificationTransportList.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsTransportsPartialUpdate"></a>
# **eventsTransportsPartialUpdate**
> NotificationTransport eventsTransportsPartialUpdate(uuid, patchedNotificationTransportRequest)



NotificationTransport Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Transport.
val patchedNotificationTransportRequest : PatchedNotificationTransportRequest =  // PatchedNotificationTransportRequest | 
try {
    val result : NotificationTransport = apiInstance.eventsTransportsPartialUpdate(uuid, patchedNotificationTransportRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsTransportsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsTransportsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification Transport. |
 **patchedNotificationTransportRequest** | [**PatchedNotificationTransportRequest**](PatchedNotificationTransportRequest.md)|  | [optional]

### Return type

[**NotificationTransport**](NotificationTransport.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsTransportsRetrieve"></a>
# **eventsTransportsRetrieve**
> NotificationTransport eventsTransportsRetrieve(uuid)



NotificationTransport Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Transport.
try {
    val result : NotificationTransport = apiInstance.eventsTransportsRetrieve(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsTransportsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsTransportsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification Transport. |

### Return type

[**NotificationTransport**](NotificationTransport.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsTransportsTestCreate"></a>
# **eventsTransportsTestCreate**
> NotificationTransportTest eventsTransportsTestCreate(uuid)



Send example notification using selected transport. Requires Modify permissions.

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Transport.
try {
    val result : NotificationTransportTest = apiInstance.eventsTransportsTestCreate(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsTransportsTestCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsTransportsTestCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification Transport. |

### Return type

[**NotificationTransportTest**](NotificationTransportTest.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="eventsTransportsUpdate"></a>
# **eventsTransportsUpdate**
> NotificationTransport eventsTransportsUpdate(uuid, notificationTransportRequest)



NotificationTransport Viewset

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Transport.
val notificationTransportRequest : NotificationTransportRequest =  // NotificationTransportRequest | 
try {
    val result : NotificationTransport = apiInstance.eventsTransportsUpdate(uuid, notificationTransportRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsTransportsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsTransportsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification Transport. |
 **notificationTransportRequest** | [**NotificationTransportRequest**](NotificationTransportRequest.md)|  |

### Return type

[**NotificationTransport**](NotificationTransport.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="eventsTransportsUsedByList"></a>
# **eventsTransportsUsedByList**
> kotlin.collections.List&lt;UsedBy&gt; eventsTransportsUsedByList(uuid)



Get a list of all objects that use this object

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = EventsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A UUID string identifying this Notification Transport.
try {
    val result : kotlin.collections.List<UsedBy> = apiInstance.eventsTransportsUsedByList(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#eventsTransportsUsedByList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#eventsTransportsUsedByList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **java.util.UUID**| A UUID string identifying this Notification Transport. |

### Return type

[**kotlin.collections.List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

