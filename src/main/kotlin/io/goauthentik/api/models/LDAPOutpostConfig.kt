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

import io.goauthentik.api.models.LDAPAPIAccessMode

import com.squareup.moshi.Json

/**
 * LDAPProvider Serializer
 *
 * @param pk 
 * @param name 
 * @param bindFlowSlug 
 * @param applicationSlug Prioritise backchannel slug over direct application slug
 * @param baseDn DN under which objects are accessible.
 * @param searchGroup Users in this group can do search queries. If not set, every user can execute search queries.
 * @param certificate 
 * @param tlsServerName 
 * @param uidStartNumber The start for uidNumbers, this number is added to the user.pk to make sure that the numbers aren't too low for POSIX users. Default is 2000 to ensure that we don't collide with local users uidNumber
 * @param gidStartNumber The start for gidNumbers, this number is added to a number generated from the group.pk to make sure that the numbers aren't too low for POSIX groups. Default is 4000 to ensure that we don't collide with local groups or users primary groups gidNumber
 * @param searchMode 
 * @param bindMode 
 * @param mfaSupport When enabled, code-based multi-factor authentication can be used by appending a semicolon and the TOTP code to the password. This should only be enabled if all users that will bind to this provider have a TOTP device configured, as otherwise a password may incorrectly be rejected if it contains a semicolon.
 */

data class LDAPOutpostConfig (

    @Json(name = "pk")
    val pk: kotlin.Int,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "bind_flow_slug")
    val bindFlowSlug: kotlin.String,

    /* Prioritise backchannel slug over direct application slug */
    @Json(name = "application_slug")
    val applicationSlug: kotlin.String,

    /* DN under which objects are accessible. */
    @Json(name = "base_dn")
    val baseDn: kotlin.String? = null,

    /* Users in this group can do search queries. If not set, every user can execute search queries. */
    @Json(name = "search_group")
    val searchGroup: java.util.UUID? = null,

    @Json(name = "certificate")
    val certificate: java.util.UUID? = null,

    @Json(name = "tls_server_name")
    val tlsServerName: kotlin.String? = null,

    /* The start for uidNumbers, this number is added to the user.pk to make sure that the numbers aren't too low for POSIX users. Default is 2000 to ensure that we don't collide with local users uidNumber */
    @Json(name = "uid_start_number")
    val uidStartNumber: kotlin.Int? = null,

    /* The start for gidNumbers, this number is added to a number generated from the group.pk to make sure that the numbers aren't too low for POSIX groups. Default is 4000 to ensure that we don't collide with local groups or users primary groups gidNumber */
    @Json(name = "gid_start_number")
    val gidStartNumber: kotlin.Int? = null,

    @Json(name = "search_mode")
    val searchMode: LDAPAPIAccessMode? = null,

    @Json(name = "bind_mode")
    val bindMode: LDAPAPIAccessMode? = null,

    /* When enabled, code-based multi-factor authentication can be used by appending a semicolon and the TOTP code to the password. This should only be enabled if all users that will bind to this provider have a TOTP device configured, as otherwise a password may incorrectly be rejected if it contains a semicolon. */
    @Json(name = "mfa_support")
    val mfaSupport: kotlin.Boolean? = null

)

