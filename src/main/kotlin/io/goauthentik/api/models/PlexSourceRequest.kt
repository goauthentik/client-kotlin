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

import io.goauthentik.api.models.PolicyEngineMode
import io.goauthentik.api.models.UserMatchingModeEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Plex Source Serializer
 *
 * @param name Source's display Name.
 * @param slug Internal source name, used in URLs.
 * @param plexToken Plex token used to check friends
 * @param enabled 
 * @param authenticationFlow Flow to use when authenticating existing users.
 * @param enrollmentFlow Flow to use when enrolling new users.
 * @param policyEngineMode 
 * @param userMatchingMode 
 * @param userPathTemplate 
 * @param clientId Client identifier used to talk to Plex.
 * @param allowedServers Which servers a user has to be a member of to be granted access. Empty list allows every server.
 * @param allowFriends Allow friends to authenticate, even if you don't share a server.
 */


data class PlexSourceRequest (

    /* Source's display Name. */
    @Json(name = "name")
    val name: kotlin.String,

    /* Internal source name, used in URLs. */
    @Json(name = "slug")
    val slug: kotlin.String,

    /* Plex token used to check friends */
    @Json(name = "plex_token")
    val plexToken: kotlin.String,

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

    @Json(name = "user_matching_mode")
    val userMatchingMode: UserMatchingModeEnum? = null,

    @Json(name = "user_path_template")
    val userPathTemplate: kotlin.String? = null,

    /* Client identifier used to talk to Plex. */
    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    /* Which servers a user has to be a member of to be granted access. Empty list allows every server. */
    @Json(name = "allowed_servers")
    val allowedServers: kotlin.collections.List<kotlin.String>? = null,

    /* Allow friends to authenticate, even if you don't share a server. */
    @Json(name = "allow_friends")
    val allowFriends: kotlin.Boolean? = null

)

