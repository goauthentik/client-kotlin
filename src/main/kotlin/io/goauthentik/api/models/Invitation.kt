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

import io.goauthentik.api.models.Flow
import io.goauthentik.api.models.GroupMember

import com.squareup.moshi.Json

/**
 * Invitation Serializer
 *
 * @param pk 
 * @param name 
 * @param createdBy 
 * @param flowObj 
 * @param expires 
 * @param fixedData 
 * @param singleUse When enabled, the invitation will be deleted after usage.
 * @param flow When set, only the configured flow can use this invitation.
 */

data class Invitation (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "created_by")
    val createdBy: GroupMember,

    @Json(name = "flow_obj")
    val flowObj: Flow,

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

