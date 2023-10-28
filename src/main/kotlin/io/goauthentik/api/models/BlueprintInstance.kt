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

import io.goauthentik.api.models.BlueprintInstanceStatusEnum

import com.squareup.moshi.Json

/**
 * Info about a single blueprint instance file
 *
 * @param pk 
 * @param name 
 * @param lastApplied 
 * @param lastAppliedHash 
 * @param status 
 * @param managedModels 
 * @param metadata 
 * @param path 
 * @param context 
 * @param enabled 
 * @param content 
 */

data class BlueprintInstance (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "last_applied")
    val lastApplied: java.time.OffsetDateTime,

    @Json(name = "last_applied_hash")
    val lastAppliedHash: kotlin.String,

    @Json(name = "status")
    val status: BlueprintInstanceStatusEnum,

    @Json(name = "managed_models")
    val managedModels: kotlin.collections.List<kotlin.String>,

    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.Any>,

    @Json(name = "path")
    val path: kotlin.String? = "",

    @Json(name = "context")
    val context: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "content")
    val content: kotlin.String? = null

)

