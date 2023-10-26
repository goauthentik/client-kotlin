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
 * Validation Error
 *
 * @param nonFieldErrors 
 * @param code 
 */

data class ValidationError (

    @Json(name = "non_field_errors")
    val nonFieldErrors: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "code")
    val code: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

