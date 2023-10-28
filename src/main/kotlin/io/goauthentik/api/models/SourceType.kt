/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.2
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
 * Serializer for SourceType
 *
 * @param name 
 * @param slug 
 * @param urlsCustomizable 
 * @param requestTokenUrl 
 * @param authorizationUrl 
 * @param accessTokenUrl 
 * @param profileUrl 
 * @param oidcWellKnownUrl 
 * @param oidcJwksUrl 
 */

data class SourceType (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "slug")
    val slug: kotlin.String,

    @Json(name = "urls_customizable")
    val urlsCustomizable: kotlin.Boolean,

    @Json(name = "request_token_url")
    val requestTokenUrl: kotlin.String?,

    @Json(name = "authorization_url")
    val authorizationUrl: kotlin.String?,

    @Json(name = "access_token_url")
    val accessTokenUrl: kotlin.String?,

    @Json(name = "profile_url")
    val profileUrl: kotlin.String?,

    @Json(name = "oidc_well_known_url")
    val oidcWellKnownUrl: kotlin.String?,

    @Json(name = "oidc_jwks_url")
    val oidcJwksUrl: kotlin.String?

)

