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

import io.goauthentik.api.models.PolicyEngineMode
import io.goauthentik.api.models.UserMatchingModeEnum

import com.squareup.moshi.Json

/**
 * LDAP Source Serializer
 *
 * @param name Source's display Name.
 * @param slug Internal source name, used in URLs.
 * @param enabled 
 * @param authenticationFlow Flow to use when authenticating existing users.
 * @param enrollmentFlow Flow to use when enrolling new users.
 * @param policyEngineMode 
 * @param userMatchingMode How the source determines if an existing user should be authenticated or a new user enrolled.  * `identifier` - Use the source-specific identifier * `email_link` - Link to a user with identical email address. Can have security implications when a source doesn't validate email addresses. * `email_deny` - Use the user's email address, but deny enrollment when the email address already exists. * `username_link` - Link to a user with identical username. Can have security implications when a username is used with another source. * `username_deny` - Use the user's username, but deny enrollment when the username already exists.
 * @param userPathTemplate 
 * @param serverUri 
 * @param peerCertificate Optionally verify the LDAP Server's Certificate against the CA Chain in this keypair.
 * @param clientCertificate Client certificate to authenticate against the LDAP Server's Certificate.
 * @param bindCn 
 * @param bindPassword 
 * @param startTls 
 * @param sni 
 * @param baseDn 
 * @param additionalUserDn Prepended to Base DN for User-queries.
 * @param additionalGroupDn Prepended to Base DN for Group-queries.
 * @param userObjectFilter Consider Objects matching this filter to be Users.
 * @param groupObjectFilter Consider Objects matching this filter to be Groups.
 * @param groupMembershipField Field which contains members of a group.
 * @param objectUniquenessField Field which contains a unique Identifier.
 * @param syncUsers 
 * @param syncUsersPassword When a user changes their password, sync it back to LDAP. This can only be enabled on a single LDAP source.
 * @param syncGroups 
 * @param syncParentGroup 
 * @param propertyMappings 
 * @param propertyMappingsGroup Property mappings used for group creation/updating.
 */

data class PatchedLDAPSourceRequest (

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

    @Json(name = "server_uri")
    val serverUri: java.net.URI? = null,

    /* Optionally verify the LDAP Server's Certificate against the CA Chain in this keypair. */
    @Json(name = "peer_certificate")
    val peerCertificate: java.util.UUID? = null,

    /* Client certificate to authenticate against the LDAP Server's Certificate. */
    @Json(name = "client_certificate")
    val clientCertificate: java.util.UUID? = null,

    @Json(name = "bind_cn")
    val bindCn: kotlin.String? = null,

    @Json(name = "bind_password")
    val bindPassword: kotlin.String? = null,

    @Json(name = "start_tls")
    val startTls: kotlin.Boolean? = null,

    @Json(name = "sni")
    val sni: kotlin.Boolean? = null,

    @Json(name = "base_dn")
    val baseDn: kotlin.String? = null,

    /* Prepended to Base DN for User-queries. */
    @Json(name = "additional_user_dn")
    val additionalUserDn: kotlin.String? = null,

    /* Prepended to Base DN for Group-queries. */
    @Json(name = "additional_group_dn")
    val additionalGroupDn: kotlin.String? = null,

    /* Consider Objects matching this filter to be Users. */
    @Json(name = "user_object_filter")
    val userObjectFilter: kotlin.String? = null,

    /* Consider Objects matching this filter to be Groups. */
    @Json(name = "group_object_filter")
    val groupObjectFilter: kotlin.String? = null,

    /* Field which contains members of a group. */
    @Json(name = "group_membership_field")
    val groupMembershipField: kotlin.String? = null,

    /* Field which contains a unique Identifier. */
    @Json(name = "object_uniqueness_field")
    val objectUniquenessField: kotlin.String? = null,

    @Json(name = "sync_users")
    val syncUsers: kotlin.Boolean? = null,

    /* When a user changes their password, sync it back to LDAP. This can only be enabled on a single LDAP source. */
    @Json(name = "sync_users_password")
    val syncUsersPassword: kotlin.Boolean? = null,

    @Json(name = "sync_groups")
    val syncGroups: kotlin.Boolean? = null,

    @Json(name = "sync_parent_group")
    val syncParentGroup: java.util.UUID? = null,

    @Json(name = "property_mappings")
    val propertyMappings: kotlin.collections.List<java.util.UUID>? = null,

    /* Property mappings used for group creation/updating. */
    @Json(name = "property_mappings_group")
    val propertyMappingsGroup: kotlin.collections.List<java.util.UUID>? = null

)

