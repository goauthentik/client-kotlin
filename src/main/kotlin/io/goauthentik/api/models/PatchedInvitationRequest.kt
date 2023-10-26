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


import com.squareup.moshi.Json

/**
 * Invitation Serializer
 *
 * @param name 
 * @param expires 
 * @param fixedData 
 * @param singleUse When enabled, the invitation will be deleted after usage.
 * @param flow When set, only the configured flow can use this invitation.
 */

data class PatchedInvitationRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "expires")
    val expires: java.time.OffsetDateTime? = null,

    @Json(name = "fixed_data")
    val fixedData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* When enabled, the invitation will be deleted after usage. */
    @Json(name = "single_use")
    val singleUse: kotlin.Boolean? = null,

    /* When set, only the configured flow can use this invitation. */
    @Json(name = "flow")
    val flow: java.util.UUID? = null

)

