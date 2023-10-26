/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.0
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
 * InvitationStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param continueFlowWithoutInvitation If this flag is set, this Stage will jump to the next Stage when no Invitation is given. By default this Stage will cancel the Flow when no invitation is given.
 */

data class InvitationStageRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    /* If this flag is set, this Stage will jump to the next Stage when no Invitation is given. By default this Stage will cancel the Flow when no invitation is given. */
    @Json(name = "continue_flow_without_invitation")
    val continueFlowWithoutInvitation: kotlin.Boolean? = null

)

