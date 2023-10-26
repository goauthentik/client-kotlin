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

import io.goauthentik.api.models.ClientTypeEnum
import io.goauthentik.api.models.IssuerModeEnum
import io.goauthentik.api.models.SubModeEnum

import com.squareup.moshi.Json

/**
 * OAuth2Provider Serializer
 *
 * @param name 
 * @param authorizationFlow Flow used when authorizing this provider.
 * @param authenticationFlow Flow used for authentication when the associated application is accessed by an un-authenticated user.
 * @param propertyMappings 
 * @param clientType Confidential clients are capable of maintaining the confidentiality of their credentials. Public clients are incapable  * `confidential` - Confidential * `public` - Public
 * @param clientId 
 * @param clientSecret 
 * @param accessCodeValidity Access codes not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 * @param accessTokenValidity Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 * @param refreshTokenValidity Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 * @param includeClaimsInIdToken Include User claims from scopes in the id_token, for applications that don't access the userinfo endpoint.
 * @param signingKey Key used to sign the tokens. Only required when JWT Algorithm is set to RS256.
 * @param redirectUris Enter each URI on a new line.
 * @param subMode Configure what data should be used as unique User Identifier. For most cases, the default should be fine.  * `hashed_user_id` - Based on the Hashed User ID * `user_id` - Based on user ID * `user_uuid` - Based on user UUID * `user_username` - Based on the username * `user_email` - Based on the User's Email. This is recommended over the UPN method. * `user_upn` - Based on the User's UPN, only works if user has a 'upn' attribute set. Use this method only if you have different UPN and Mail domains.
 * @param issuerMode Configure how the issuer field of the ID Token should be filled.  * `global` - Same identifier is used for all providers * `per_provider` - Each provider has a different issuer, based on the application slug.
 * @param jwksSources 
 */

data class OAuth2ProviderRequest (

    @Json(name = "name")
    val name: kotlin.String,

    /* Flow used when authorizing this provider. */
    @Json(name = "authorization_flow")
    val authorizationFlow: java.util.UUID,

    /* Flow used for authentication when the associated application is accessed by an un-authenticated user. */
    @Json(name = "authentication_flow")
    val authenticationFlow: java.util.UUID? = null,

    @Json(name = "property_mappings")
    val propertyMappings: kotlin.collections.List<java.util.UUID>? = null,

    /* Confidential clients are capable of maintaining the confidentiality of their credentials. Public clients are incapable  * `confidential` - Confidential * `public` - Public */
    @Json(name = "client_type")
    val clientType: ClientTypeEnum? = null,

    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    @Json(name = "client_secret")
    val clientSecret: kotlin.String? = null,

    /* Access codes not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "access_code_validity")
    val accessCodeValidity: kotlin.String? = null,

    /* Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "access_token_validity")
    val accessTokenValidity: kotlin.String? = null,

    /* Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "refresh_token_validity")
    val refreshTokenValidity: kotlin.String? = null,

    /* Include User claims from scopes in the id_token, for applications that don't access the userinfo endpoint. */
    @Json(name = "include_claims_in_id_token")
    val includeClaimsInIdToken: kotlin.Boolean? = null,

    /* Key used to sign the tokens. Only required when JWT Algorithm is set to RS256. */
    @Json(name = "signing_key")
    val signingKey: java.util.UUID? = null,

    /* Enter each URI on a new line. */
    @Json(name = "redirect_uris")
    val redirectUris: kotlin.String? = null,

    /* Configure what data should be used as unique User Identifier. For most cases, the default should be fine.  * `hashed_user_id` - Based on the Hashed User ID * `user_id` - Based on user ID * `user_uuid` - Based on user UUID * `user_username` - Based on the username * `user_email` - Based on the User's Email. This is recommended over the UPN method. * `user_upn` - Based on the User's UPN, only works if user has a 'upn' attribute set. Use this method only if you have different UPN and Mail domains. */
    @Json(name = "sub_mode")
    val subMode: SubModeEnum? = null,

    /* Configure how the issuer field of the ID Token should be filled.  * `global` - Same identifier is used for all providers * `per_provider` - Each provider has a different issuer, based on the application slug. */
    @Json(name = "issuer_mode")
    val issuerMode: IssuerModeEnum? = null,

    @Json(name = "jwks_sources")
    val jwksSources: kotlin.collections.List<java.util.UUID>? = null

)

