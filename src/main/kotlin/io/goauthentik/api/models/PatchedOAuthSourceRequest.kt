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

import io.goauthentik.api.models.PolicyEngineMode
import io.goauthentik.api.models.ProviderTypeEnum
import io.goauthentik.api.models.UserMatchingModeEnum

import com.squareup.moshi.Json

/**
 * OAuth Source Serializer
 *
 * @param name Source's display Name.
 * @param slug Internal source name, used in URLs.
 * @param enabled 
 * @param authenticationFlow Flow to use when authenticating existing users.
 * @param enrollmentFlow Flow to use when enrolling new users.
 * @param policyEngineMode 
 * @param userMatchingMode How the source determines if an existing user should be authenticated or a new user enrolled.  * `identifier` - Use the source-specific identifier * `email_link` - Link to a user with identical email address. Can have security implications when a source doesn't validate email addresses. * `email_deny` - Use the user's email address, but deny enrollment when the email address already exists. * `username_link` - Link to a user with identical username. Can have security implications when a username is used with another source. * `username_deny` - Use the user's username, but deny enrollment when the username already exists.
 * @param userPathTemplate 
 * @param providerType 
 * @param requestTokenUrl URL used to request the initial token. This URL is only required for OAuth 1.
 * @param authorizationUrl URL the user is redirect to to conest the flow.
 * @param accessTokenUrl URL used by authentik to retrieve tokens.
 * @param profileUrl URL used by authentik to get user information.
 * @param consumerKey 
 * @param consumerSecret 
 * @param additionalScopes 
 * @param oidcWellKnownUrl 
 * @param oidcJwksUrl 
 * @param oidcJwks 
 */

data class PatchedOAuthSourceRequest (

    /* Source's display Name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Internal source name, used in URLs. */
    @Json(name = "slug")
    val slug: kotlin.String? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    /* Flow to use when authenticating existing users. */
    @Json(name = "authentication_flow")
    val authenticationFlow: java.util.UUID? = null,

    /* Flow to use when enrolling new users. */
    @Json(name = "enrollment_flow")
    val enrollmentFlow: java.util.UUID? = null,

    @Json(name = "policy_engine_mode")
    val policyEngineMode: PolicyEngineMode? = null,

    /* How the source determines if an existing user should be authenticated or a new user enrolled.  * `identifier` - Use the source-specific identifier * `email_link` - Link to a user with identical email address. Can have security implications when a source doesn't validate email addresses. * `email_deny` - Use the user's email address, but deny enrollment when the email address already exists. * `username_link` - Link to a user with identical username. Can have security implications when a username is used with another source. * `username_deny` - Use the user's username, but deny enrollment when the username already exists. */
    @Json(name = "user_matching_mode")
    val userMatchingMode: UserMatchingModeEnum? = null,

    @Json(name = "user_path_template")
    val userPathTemplate: kotlin.String? = null,

    @Json(name = "provider_type")
    val providerType: ProviderTypeEnum? = null,

    /* URL used to request the initial token. This URL is only required for OAuth 1. */
    @Json(name = "request_token_url")
    val requestTokenUrl: kotlin.String? = null,

    /* URL the user is redirect to to conest the flow. */
    @Json(name = "authorization_url")
    val authorizationUrl: kotlin.String? = null,

    /* URL used by authentik to retrieve tokens. */
    @Json(name = "access_token_url")
    val accessTokenUrl: kotlin.String? = null,

    /* URL used by authentik to get user information. */
    @Json(name = "profile_url")
    val profileUrl: kotlin.String? = null,

    @Json(name = "consumer_key")
    val consumerKey: kotlin.String? = null,

    @Json(name = "consumer_secret")
    val consumerSecret: kotlin.String? = null,

    @Json(name = "additional_scopes")
    val additionalScopes: kotlin.String? = null,

    @Json(name = "oidc_well_known_url")
    val oidcWellKnownUrl: kotlin.String? = null,

    @Json(name = "oidc_jwks_url")
    val oidcJwksUrl: kotlin.String? = null,

    @Json(name = "oidc_jwks")
    val oidcJwks: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

)

