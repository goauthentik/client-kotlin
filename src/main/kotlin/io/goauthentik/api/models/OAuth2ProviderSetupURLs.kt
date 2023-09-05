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
 * OAuth2 Provider Metadata serializer
 *
 * @param issuer 
 * @param authorize 
 * @param token 
 * @param userInfo 
 * @param providerInfo 
 * @param logout 
 * @param jwks 
 */

data class OAuth2ProviderSetupURLs (

    @Json(name = "issuer")
    val issuer: kotlin.String,

    @Json(name = "authorize")
    val authorize: kotlin.String,

    @Json(name = "token")
    val token: kotlin.String,

    @Json(name = "user_info")
    val userInfo: kotlin.String,

    @Json(name = "provider_info")
    val providerInfo: kotlin.String,

    @Json(name = "logout")
    val logout: kotlin.String,

    @Json(name = "jwks")
    val jwks: kotlin.String

)

