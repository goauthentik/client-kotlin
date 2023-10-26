/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.0
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

