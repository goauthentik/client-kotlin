/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.goauthentik.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Serializer for blueprint metadata
 *
 * @param name 
 * @param labels 
 */


data class Metadata (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "labels")
    val labels: kotlin.collections.Map<kotlin.String, kotlin.Any>

)

