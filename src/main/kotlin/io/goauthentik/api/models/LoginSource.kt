/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.1
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

import io.goauthentik.api.models.LoginChallengeTypes

import com.squareup.moshi.Json

/**
 * Serializer for Login buttons of sources
 *
 * @param name 
 * @param challenge 
 * @param iconUrl 
 */

data class LoginSource (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "challenge")
    val challenge: LoginChallengeTypes,

    @Json(name = "icon_url")
    val iconUrl: kotlin.String? = null

)

