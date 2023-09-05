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
 * User login challenge
 *
 * @param rememberMe 
 * @param component 
 */

data class UserLoginChallengeResponseRequest (

    @Json(name = "remember_me")
    val rememberMe: kotlin.Boolean,

    @Json(name = "component")
    val component: kotlin.String? = "ak-stage-user-login"

)

