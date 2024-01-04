# SchemaApi

All URIs are relative to *http://localhost/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaRetrieve**](SchemaApi.md#schemaRetrieve) | **GET** /schema/ | 


<a id="schemaRetrieve"></a>
# **schemaRetrieve**
> kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt; schemaRetrieve(format, lang)



OpenApi3 schema for this API. Format can be selected via content negotiation.  - YAML: application/vnd.oai.openapi - JSON: application/vnd.oai.openapi+json

### Example
```kotlin
// Import classes:
//import io.goauthentik.api.infrastructure.*
//import io.goauthentik.api.models.*

val apiInstance = SchemaApi()
val format : kotlin.String = format_example // kotlin.String | 
val lang : kotlin.String = lang_example // kotlin.String | 
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = apiInstance.schemaRetrieve(format, lang)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#schemaRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#schemaRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**|  | [optional] [enum: json, yaml]
 **lang** | **kotlin.String**|  | [optional] [enum: af, ar, ar-dz, ast, az, be, bg, bn, br, bs, ca, ckb, cs, cy, da, de, dsb, el, en, en-au, en-gb, eo, es, es-ar, es-co, es-mx, es-ni, es-ve, et, eu, fa, fi, fr, fy, ga, gd, gl, he, hi, hr, hsb, hu, hy, ia, id, ig, io, is, it, ja, ka, kab, kk, km, kn, ko, ky, lb, lt, lv, mk, ml, mn, mr, ms, my, nb, ne, nl, nn, os, pa, pl, pt, pt-br, ro, ru, sk, sl, sq, sr, sr-latn, sv, sw, ta, te, tg, th, tk, tr, tt, udm, ug, uk, ur, uz, vi, zh-hans, zh-hant]

### Return type

[**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure authentik:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.oai.openapi+json, application/json

