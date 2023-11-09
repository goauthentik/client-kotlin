/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.3
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

import io.goauthentik.api.models.ProxyMode

import com.squareup.moshi.Json

/**
 * ProxyProvider Serializer
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
 * @param clientId 
 * @param externalHost 
 * @param redirectUris 
 * @param outpostSet 
 * @param authenticationFlow Flow used for authentication when the associated application is accessed by an un-authenticated user.
 * @param propertyMappings 
 * @param internalHost 
 * @param internalHostSslValidation Validate SSL Certificates of upstream servers
 * @param certificate 
 * @param skipPathRegex Regular expressions for which authentication is not required. Each new line is interpreted as a new Regular Expression.
 * @param basicAuthEnabled Set a custom HTTP-Basic Authentication header based on values from authentik.
 * @param basicAuthPasswordAttribute User/Group Attribute used for the password part of the HTTP-Basic Header.
 * @param basicAuthUserAttribute User/Group Attribute used for the user part of the HTTP-Basic Header. If not set, the user's Email address is used.
 * @param mode Enable support for forwardAuth in traefik and nginx auth_request. Exclusive with internal_host.  * `proxy` - Proxy * `forward_single` - Forward Single * `forward_domain` - Forward Domain
 * @param interceptHeaderAuth When enabled, this provider will intercept the authorization header and authenticate requests based on its value.
 * @param cookieDomain 
 * @param jwksSources 
 * @param accessTokenValidity Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 * @param refreshTokenValidity Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 */

data class ProxyProvider (

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

    @Json(name = "client_id")
    val clientId: kotlin.String,

    @Json(name = "external_host")
    val externalHost: java.net.URI,

    @Json(name = "redirect_uris")
    val redirectUris: kotlin.String,

    @Json(name = "outpost_set")
    val outpostSet: kotlin.collections.List<kotlin.String>,

    /* Flow used for authentication when the associated application is accessed by an un-authenticated user. */
    @Json(name = "authentication_flow")
    val authenticationFlow: java.util.UUID? = null,

    @Json(name = "property_mappings")
    val propertyMappings: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "internal_host")
    val internalHost: java.net.URI? = null,

    /* Validate SSL Certificates of upstream servers */
    @Json(name = "internal_host_ssl_validation")
    val internalHostSslValidation: kotlin.Boolean? = null,

    @Json(name = "certificate")
    val certificate: java.util.UUID? = null,

    /* Regular expressions for which authentication is not required. Each new line is interpreted as a new Regular Expression. */
    @Json(name = "skip_path_regex")
    val skipPathRegex: kotlin.String? = null,

    /* Set a custom HTTP-Basic Authentication header based on values from authentik. */
    @Json(name = "basic_auth_enabled")
    val basicAuthEnabled: kotlin.Boolean? = null,

    /* User/Group Attribute used for the password part of the HTTP-Basic Header. */
    @Json(name = "basic_auth_password_attribute")
    val basicAuthPasswordAttribute: kotlin.String? = null,

    /* User/Group Attribute used for the user part of the HTTP-Basic Header. If not set, the user's Email address is used. */
    @Json(name = "basic_auth_user_attribute")
    val basicAuthUserAttribute: kotlin.String? = null,

    /* Enable support for forwardAuth in traefik and nginx auth_request. Exclusive with internal_host.  * `proxy` - Proxy * `forward_single` - Forward Single * `forward_domain` - Forward Domain */
    @Json(name = "mode")
    val mode: ProxyMode? = null,

    /* When enabled, this provider will intercept the authorization header and authenticate requests based on its value. */
    @Json(name = "intercept_header_auth")
    val interceptHeaderAuth: kotlin.Boolean? = null,

    @Json(name = "cookie_domain")
    val cookieDomain: kotlin.String? = null,

    @Json(name = "jwks_sources")
    val jwksSources: kotlin.collections.List<java.util.UUID>? = null,

    /* Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "access_token_validity")
    val accessTokenValidity: kotlin.String? = null,

    /* Tokens not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "refresh_token_validity")
    val refreshTokenValidity: kotlin.String? = null

)

