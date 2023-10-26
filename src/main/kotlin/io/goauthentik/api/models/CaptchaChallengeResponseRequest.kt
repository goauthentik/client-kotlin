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
 * Validate captcha token
 *
 * @param token 
 * @param component 
 */

data class CaptchaChallengeResponseRequest (

    @Json(name = "token")
    val token: kotlin.String,

    @Json(name = "component")
    val component: kotlin.String? = "ak-stage-captcha"

)

