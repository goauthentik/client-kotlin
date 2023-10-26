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
 * Result of a Property-mapping test
 *
 * @param result 
 * @param successful 
 */

data class PropertyMappingTestResult (

    @Json(name = "result")
    val result: kotlin.String,

    @Json(name = "successful")
    val successful: kotlin.Boolean

)

