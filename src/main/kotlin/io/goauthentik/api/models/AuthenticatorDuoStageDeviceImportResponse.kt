/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.2
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
 * 
 *
 * @param count 
 * @param error 
 */

data class AuthenticatorDuoStageDeviceImportResponse (

    @Json(name = "count")
    val count: kotlin.Int,

    @Json(name = "error")
    val error: kotlin.String

)

