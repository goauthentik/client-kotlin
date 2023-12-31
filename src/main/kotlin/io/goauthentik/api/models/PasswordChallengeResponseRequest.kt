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
 * Password challenge response
 *
 * @param password 
 * @param component 
 */


data class PasswordChallengeResponseRequest (

    @Json(name = "password")
    val password: kotlin.String,

    @Json(name = "component")
    val component: kotlin.String? = "ak-stage-password"

)

