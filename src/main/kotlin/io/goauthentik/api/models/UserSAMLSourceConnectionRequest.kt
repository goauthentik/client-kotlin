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
 * SAML Source Serializer
 *
 * @param user 
 * @param identifier 
 */

data class UserSAMLSourceConnectionRequest (

    @Json(name = "user")
    val user: kotlin.Int,

    @Json(name = "identifier")
    val identifier: kotlin.String

)

