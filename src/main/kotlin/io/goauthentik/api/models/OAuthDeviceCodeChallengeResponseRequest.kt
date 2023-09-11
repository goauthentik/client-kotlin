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
 * Response that includes the user-entered device code
 *
 * @param code 
 * @param component 
 */

data class OAuthDeviceCodeChallengeResponseRequest (

    @Json(name = "code")
    val code: kotlin.Int,

    @Json(name = "component")
    val component: kotlin.String? = "ak-provider-oauth2-device-code"

)

