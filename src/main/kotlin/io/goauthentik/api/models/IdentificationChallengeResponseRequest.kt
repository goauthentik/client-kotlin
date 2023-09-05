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
 * Identification challenge
 *
 * @param uidField 
 * @param component 
 * @param password 
 */

data class IdentificationChallengeResponseRequest (

    @Json(name = "uid_field")
    val uidField: kotlin.String,

    @Json(name = "component")
    val component: kotlin.String? = "ak-stage-identification",

    @Json(name = "password")
    val password: kotlin.String? = null

)

