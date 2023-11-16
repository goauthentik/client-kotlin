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
 * User agent os
 *
 * @param family 
 * @param major 
 * @param minor 
 * @param patch 
 * @param patchMinor 
 */


data class AuthenticatedSessionUserAgentOs (

    @Json(name = "family")
    val family: kotlin.String,

    @Json(name = "major")
    val major: kotlin.String,

    @Json(name = "minor")
    val minor: kotlin.String,

    @Json(name = "patch")
    val patch: kotlin.String,

    @Json(name = "patch_minor")
    val patchMinor: kotlin.String

)

