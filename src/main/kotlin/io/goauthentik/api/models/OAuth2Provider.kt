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

import io.goauthentik.api.models.ClientTypeEnum
import io.goauthentik.api.models.IssuerModeEnum
import io.goauthentik.api.models.SubModeEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * OAuth2Provider Serializer
 *
 * @param pk 
 * @param name 
 * @param authorizationFlow Flow used when authorizing this provider.
 * @param component Get object component so that we know how to edit the object
 * @param assignedApplicationSlug Internal application name, used in URLs.
 * @param assignedApplicationName Application's display Name.
 * @param assignedBackchannelApplicationSlug Internal application name, used in URLs.
 * @param assignedBackchannelApplicationName Application's display Name.
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param authenticationFlow Flow used for authentication when the associated application is accessed by an un-authenticated user.
 * @param propertyMappings 
 * @param clientType 
 * @param clientId 
 * @param clientSecret 
 * @param accessCodeValidity Access codes not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 * @param accessTokenValidity Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 * @param refreshTokenValidity Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 * @param includeClaimsInIdToken Include User claims from scopes in the id_token, for applications that don't access the userinfo endpoint.
 * @param signingKey Key used to sign the tokens. Only required when JWT Algorithm is set to RS256.
 * @param redirectUris Enter each URI on a new line.
 * @param subMode 
 * @param issuerMode 
 * @param jwksSources 
 */


data class OAuth2Provider (

    @Json(name = "pk")
    val pk: kotlin.Int,

    @Json(name = "name")
    val name: kotlin.String,

    /* Flow used when authorizing this provider. */
    @Json(name = "authorization_flow")
    val authorizationFlow: java.util.UUID,

    /* Get object component so that we know how to edit the object */
    @Json(name = "component")
    val component: kotlin.String,

    /* Internal application name, used in URLs. */
    @Json(name = "assigned_application_slug")
    val assignedApplicationSlug: kotlin.String,

    /* Application's display Name. */
    @Json(name = "assigned_application_name")
    val assignedApplicationName: kotlin.String,

    /* Internal application name, used in URLs. */
    @Json(name = "assigned_backchannel_application_slug")
    val assignedBackchannelApplicationSlug: kotlin.String,

    /* Application's display Name. */
    @Json(name = "assigned_backchannel_application_name")
    val assignedBackchannelApplicationName: kotlin.String,

    /* Return object's verbose_name */
    @Json(name = "verbose_name")
    val verboseName: kotlin.String,

    /* Return object's plural verbose_name */
    @Json(name = "verbose_name_plural")
    val verboseNamePlural: kotlin.String,

    /* Return internal model name */
    @Json(name = "meta_model_name")
    val metaModelName: kotlin.String,

    /* Flow used for authentication when the associated application is accessed by an un-authenticated user. */
    @Json(name = "authentication_flow")
    val authenticationFlow: java.util.UUID? = null,

    @Json(name = "property_mappings")
    val propertyMappings: kotlin.collections.List<java.util.UUID>? = null,

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

    @Json(name = "sub_mode")
    val subMode: SubModeEnum? = null,

    @Json(name = "issuer_mode")
    val issuerMode: IssuerModeEnum? = null,

    @Json(name = "jwks_sources")
    val jwksSources: kotlin.collections.List<java.util.UUID>? = null

)

