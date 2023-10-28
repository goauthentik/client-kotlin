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

import io.goauthentik.api.models.BindingTypeEnum
import io.goauthentik.api.models.DigestAlgorithmEnum
import io.goauthentik.api.models.NameIdPolicyEnum
import io.goauthentik.api.models.PolicyEngineMode
import io.goauthentik.api.models.SignatureAlgorithmEnum
import io.goauthentik.api.models.UserMatchingModeEnum

import com.squareup.moshi.Json

/**
 * SAMLSource Serializer
 *
 * @param name Source's display Name.
 * @param slug Internal source name, used in URLs.
 * @param enabled 
 * @param authenticationFlow Flow to use when authenticating existing users.
 * @param enrollmentFlow Flow to use when enrolling new users.
 * @param policyEngineMode 
 * @param userMatchingMode How the source determines if an existing user should be authenticated or a new user enrolled.  * `identifier` - Use the source-specific identifier * `email_link` - Link to a user with identical email address. Can have security implications when a source doesn't validate email addresses. * `email_deny` - Use the user's email address, but deny enrollment when the email address already exists. * `username_link` - Link to a user with identical username. Can have security implications when a username is used with another source. * `username_deny` - Use the user's username, but deny enrollment when the username already exists.
 * @param userPathTemplate 
 * @param preAuthenticationFlow Flow used before authentication.
 * @param issuer Also known as Entity ID. Defaults the Metadata URL.
 * @param ssoUrl URL that the initial Login request is sent to.
 * @param sloUrl Optional URL if your IDP supports Single-Logout.
 * @param allowIdpInitiated Allows authentication flows initiated by the IdP. This can be a security risk, as no validation of the request ID is done.
 * @param nameIdPolicy NameID Policy sent to the IdP. Can be unset, in which case no Policy is sent.  * `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` - Email * `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` - Persistent * `urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName` - X509 * `urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName` - Windows * `urn:oasis:names:tc:SAML:2.0:nameid-format:transient` - Transient
 * @param bindingType 
 * @param verificationKp When selected, incoming assertion's Signatures will be validated against this certificate. To allow unsigned Requests, leave on default.
 * @param signingKp Keypair used to sign outgoing Responses going to the Identity Provider.
 * @param digestAlgorithm 
 * @param signatureAlgorithm 
 * @param temporaryUserDeleteAfter Time offset when temporary users should be deleted. This only applies if your IDP uses the NameID Format 'transient', and the user doesn't log out manually. (Format: hours=1;minutes=2;seconds=3).
 */

data class PatchedSAMLSourceRequest (

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

    /* Flow used before authentication. */
    @Json(name = "pre_authentication_flow")
    val preAuthenticationFlow: java.util.UUID? = null,

    /* Also known as Entity ID. Defaults the Metadata URL. */
    @Json(name = "issuer")
    val issuer: kotlin.String? = null,

    /* URL that the initial Login request is sent to. */
    @Json(name = "sso_url")
    val ssoUrl: java.net.URI? = null,

    /* Optional URL if your IDP supports Single-Logout. */
    @Json(name = "slo_url")
    val sloUrl: java.net.URI? = null,

    /* Allows authentication flows initiated by the IdP. This can be a security risk, as no validation of the request ID is done. */
    @Json(name = "allow_idp_initiated")
    val allowIdpInitiated: kotlin.Boolean? = null,

    /* NameID Policy sent to the IdP. Can be unset, in which case no Policy is sent.  * `urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress` - Email * `urn:oasis:names:tc:SAML:2.0:nameid-format:persistent` - Persistent * `urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName` - X509 * `urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName` - Windows * `urn:oasis:names:tc:SAML:2.0:nameid-format:transient` - Transient */
    @Json(name = "name_id_policy")
    val nameIdPolicy: NameIdPolicyEnum? = null,

    @Json(name = "binding_type")
    val bindingType: BindingTypeEnum? = null,

    /* When selected, incoming assertion's Signatures will be validated against this certificate. To allow unsigned Requests, leave on default. */
    @Json(name = "verification_kp")
    val verificationKp: java.util.UUID? = null,

    /* Keypair used to sign outgoing Responses going to the Identity Provider. */
    @Json(name = "signing_kp")
    val signingKp: java.util.UUID? = null,

    @Json(name = "digest_algorithm")
    val digestAlgorithm: DigestAlgorithmEnum? = null,

    @Json(name = "signature_algorithm")
    val signatureAlgorithm: SignatureAlgorithmEnum? = null,

    /* Time offset when temporary users should be deleted. This only applies if your IDP uses the NameID Format 'transient', and the user doesn't log out manually. (Format: hours=1;minutes=2;seconds=3). */
    @Json(name = "temporary_user_delete_after")
    val temporaryUserDeleteAfter: kotlin.String? = null

)

