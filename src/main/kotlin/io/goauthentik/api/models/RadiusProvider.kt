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
 * RadiusProvider Serializer
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
 * @param outpostSet 
 * @param authenticationFlow Flow used for authentication when the associated application is accessed by an un-authenticated user.
 * @param propertyMappings 
 * @param clientNetworks List of CIDRs (comma-separated) that clients can connect from. A more specific CIDR will match before a looser one. Clients connecting from a non-specified CIDR will be dropped.
 * @param sharedSecret Shared secret between clients and server to hash packets.
 * @param mfaSupport When enabled, code-based multi-factor authentication can be used by appending a semicolon and the TOTP code to the password. This should only be enabled if all users that will bind to this provider have a TOTP device configured, as otherwise a password may incorrectly be rejected if it contains a semicolon.
 */


data class RadiusProvider (

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

    @Json(name = "outpost_set")
    val outpostSet: kotlin.collections.List<kotlin.String>,

    /* Flow used for authentication when the associated application is accessed by an un-authenticated user. */
    @Json(name = "authentication_flow")
    val authenticationFlow: java.util.UUID? = null,

    @Json(name = "property_mappings")
    val propertyMappings: kotlin.collections.List<java.util.UUID>? = null,

    /* List of CIDRs (comma-separated) that clients can connect from. A more specific CIDR will match before a looser one. Clients connecting from a non-specified CIDR will be dropped. */
    @Json(name = "client_networks")
    val clientNetworks: kotlin.String? = null,

    /* Shared secret between clients and server to hash packets. */
    @Json(name = "shared_secret")
    val sharedSecret: kotlin.String? = null,

    /* When enabled, code-based multi-factor authentication can be used by appending a semicolon and the TOTP code to the password. This should only be enabled if all users that will bind to this provider have a TOTP device configured, as otherwise a password may incorrectly be rejected if it contains a semicolon. */
    @Json(name = "mfa_support")
    val mfaSupport: kotlin.Boolean? = null

)

