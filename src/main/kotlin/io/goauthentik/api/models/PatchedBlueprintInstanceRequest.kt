/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.3
 * Contact: hello@goauthentik.io
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.goauthentik.api.models


import com.squareup.moshi.Json

/**
 * Info about a single blueprint instance file
 *
 * @param name 
 * @param path 
 * @param context 
 * @param enabled 
 * @param content 
 */

data class PatchedBlueprintInstanceRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "path")
    val path: kotlin.String? = "",

    @Json(name = "context")
    val context: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "content")
    val content: kotlin.String? = null

)

