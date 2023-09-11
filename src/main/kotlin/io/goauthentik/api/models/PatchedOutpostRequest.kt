/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.3
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

import io.goauthentik.api.models.OutpostTypeEnum

import com.squareup.moshi.Json

/**
 * Outpost Serializer
 *
 * @param name 
 * @param type 
 * @param providers 
 * @param serviceConnection Select Service-Connection authentik should use to manage this outpost. Leave empty if authentik should not handle the deployment.
 * @param config 
 * @param managed Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update.
 */

data class PatchedOutpostRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "type")
    val type: OutpostTypeEnum? = null,

    @Json(name = "providers")
    val providers: kotlin.collections.List<kotlin.Int>? = null,

    /* Select Service-Connection authentik should use to manage this outpost. Leave empty if authentik should not handle the deployment. */
    @Json(name = "service_connection")
    val serviceConnection: java.util.UUID? = null,

    @Json(name = "config")
    val config: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. */
    @Json(name = "managed")
    val managed: kotlin.String? = null

)

