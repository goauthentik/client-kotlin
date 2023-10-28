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

import io.goauthentik.api.models.DigestAlgorithmEnum
import io.goauthentik.api.models.SignatureAlgorithmEnum
import io.goauthentik.api.models.SpBindingEnum

import com.squareup.moshi.Json

/**
 * SAMLProvider Serializer
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
 * @param acsUrl 
 * @param urlDownloadMetadata Get metadata download URL
 * @param urlSsoPost Get SSO Post URL
 * @param urlSsoRedirect Get SSO Redirect URL
 * @param urlSsoInit Get SSO IDP-Initiated URL
 * @param urlSloPost Get SLO POST URL
 * @param urlSloRedirect Get SLO redirect URL
 * @param authenticationFlow Flow used for authentication when the associated application is accessed by an un-authenticated user.
 * @param propertyMappings 
 * @param audience Value of the audience restriction field of the assertion. When left empty, no audience restriction will be added.
 * @param issuer Also known as EntityID
 * @param assertionValidNotBefore Assertion valid not before current time + this value (Format: hours=-1;minutes=-2;seconds=-3).
 * @param assertionValidNotOnOrAfter Assertion not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 * @param sessionValidNotOnOrAfter Session not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3).
 * @param nameIdMapping Configure how the NameID value will be created. When left empty, the NameIDPolicy of the incoming request will be considered
 * @param digestAlgorithm 
 * @param signatureAlgorithm 
 * @param signingKp Keypair used to sign outgoing Responses going to the Service Provider.
 * @param verificationKp When selected, incoming assertion's Signatures will be validated against this certificate. To allow unsigned Requests, leave on default.
 * @param spBinding This determines how authentik sends the response back to the Service Provider.  * `redirect` - Redirect * `post` - Post
 * @param defaultRelayState Default relay_state value for IDP-initiated logins
 */

data class SAMLProvider (

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

    @Json(name = "acs_url")
    val acsUrl: java.net.URI,

    /* Get metadata download URL */
    @Json(name = "url_download_metadata")
    val urlDownloadMetadata: kotlin.String,

    /* Get SSO Post URL */
    @Json(name = "url_sso_post")
    val urlSsoPost: kotlin.String,

    /* Get SSO Redirect URL */
    @Json(name = "url_sso_redirect")
    val urlSsoRedirect: kotlin.String,

    /* Get SSO IDP-Initiated URL */
    @Json(name = "url_sso_init")
    val urlSsoInit: kotlin.String,

    /* Get SLO POST URL */
    @Json(name = "url_slo_post")
    val urlSloPost: kotlin.String,

    /* Get SLO redirect URL */
    @Json(name = "url_slo_redirect")
    val urlSloRedirect: kotlin.String,

    /* Flow used for authentication when the associated application is accessed by an un-authenticated user. */
    @Json(name = "authentication_flow")
    val authenticationFlow: java.util.UUID? = null,

    @Json(name = "property_mappings")
    val propertyMappings: kotlin.collections.List<java.util.UUID>? = null,

    /* Value of the audience restriction field of the assertion. When left empty, no audience restriction will be added. */
    @Json(name = "audience")
    val audience: kotlin.String? = null,

    /* Also known as EntityID */
    @Json(name = "issuer")
    val issuer: kotlin.String? = null,

    /* Assertion valid not before current time + this value (Format: hours=-1;minutes=-2;seconds=-3). */
    @Json(name = "assertion_valid_not_before")
    val assertionValidNotBefore: kotlin.String? = null,

    /* Assertion not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "assertion_valid_not_on_or_after")
    val assertionValidNotOnOrAfter: kotlin.String? = null,

    /* Session not valid on or after current time + this value (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "session_valid_not_on_or_after")
    val sessionValidNotOnOrAfter: kotlin.String? = null,

    /* Configure how the NameID value will be created. When left empty, the NameIDPolicy of the incoming request will be considered */
    @Json(name = "name_id_mapping")
    val nameIdMapping: java.util.UUID? = null,

    @Json(name = "digest_algorithm")
    val digestAlgorithm: DigestAlgorithmEnum? = null,

    @Json(name = "signature_algorithm")
    val signatureAlgorithm: SignatureAlgorithmEnum? = null,

    /* Keypair used to sign outgoing Responses going to the Service Provider. */
    @Json(name = "signing_kp")
    val signingKp: java.util.UUID? = null,

    /* When selected, incoming assertion's Signatures will be validated against this certificate. To allow unsigned Requests, leave on default. */
    @Json(name = "verification_kp")
    val verificationKp: java.util.UUID? = null,

    /* This determines how authentik sends the response back to the Service Provider.  * `redirect` - Redirect * `post` - Post */
    @Json(name = "sp_binding")
    val spBinding: SpBindingEnum? = null,

    /* Default relay_state value for IDP-initiated logins */
    @Json(name = "default_relay_state")
    val defaultRelayState: kotlin.String? = null

)

