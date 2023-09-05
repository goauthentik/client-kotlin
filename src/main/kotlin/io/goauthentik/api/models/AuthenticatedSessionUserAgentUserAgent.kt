/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.2
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
 * User agent browser
 *
 * @param family 
 * @param major 
 * @param minor 
 * @param patch 
 */

data class AuthenticatedSessionUserAgentUserAgent (

    @Json(name = "family")
    val family: kotlin.String,

    @Json(name = "major")
    val major: kotlin.String,

    @Json(name = "minor")
    val minor: kotlin.String,

    @Json(name = "patch")
    val patch: kotlin.String

)

