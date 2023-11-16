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
 * Response that device has been authenticated and tab can be closed
 *
 * @param component 
 */


data class OAuthDeviceCodeFinishChallengeResponseRequest (

    @Json(name = "component")
    val component: kotlin.String? = "ak-provider-oauth2-device-code-finish"

)

