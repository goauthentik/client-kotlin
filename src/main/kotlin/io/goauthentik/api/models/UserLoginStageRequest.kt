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

import io.goauthentik.api.models.FlowSetRequest

import com.squareup.moshi.Json

/**
 * UserLoginStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param sessionDuration Determines how long a session lasts. Default of 0 means that the sessions lasts until the browser is closed. (Format: hours=-1;minutes=-2;seconds=-3)
 * @param terminateOtherSessions Terminate all other sessions of the user logging in.
 * @param rememberMeOffset Offset the session will be extended by when the user picks the remember me option. Default of 0 means that the remember me option will not be shown. (Format: hours=-1;minutes=-2;seconds=-3)
 */

data class UserLoginStageRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    /* Determines how long a session lasts. Default of 0 means that the sessions lasts until the browser is closed. (Format: hours=-1;minutes=-2;seconds=-3) */
    @Json(name = "session_duration")
    val sessionDuration: kotlin.String? = null,

    /* Terminate all other sessions of the user logging in. */
    @Json(name = "terminate_other_sessions")
    val terminateOtherSessions: kotlin.Boolean? = null,

    /* Offset the session will be extended by when the user picks the remember me option. Default of 0 means that the remember me option will not be shown. (Format: hours=-1;minutes=-2;seconds=-3) */
    @Json(name = "remember_me_offset")
    val rememberMeOffset: kotlin.String? = null

)

