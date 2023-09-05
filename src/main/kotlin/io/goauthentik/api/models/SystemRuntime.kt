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
 * Get versions
 *
 * @param pythonVersion 
 * @param gunicornVersion 
 * @param environment 
 * @param architecture 
 * @param platform 
 * @param uname 
 */

data class SystemRuntime (

    @Json(name = "python_version")
    val pythonVersion: kotlin.String,

    @Json(name = "gunicorn_version")
    val gunicornVersion: kotlin.String,

    @Json(name = "environment")
    val environment: kotlin.String,

    @Json(name = "architecture")
    val architecture: kotlin.String,

    @Json(name = "platform")
    val platform: kotlin.String,

    @Json(name = "uname")
    val uname: kotlin.String

)

