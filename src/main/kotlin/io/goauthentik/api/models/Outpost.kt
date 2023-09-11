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
import io.goauthentik.api.models.Provider
import io.goauthentik.api.models.ServiceConnection

import com.squareup.moshi.Json

/**
 * Outpost Serializer
 *
 * @param pk 
 * @param name 
 * @param type 
 * @param providers 
 * @param providersObj 
 * @param serviceConnectionObj 
 * @param tokenIdentifier Get Token identifier
 * @param config 
 * @param serviceConnection Select Service-Connection authentik should use to manage this outpost. Leave empty if authentik should not handle the deployment.
 * @param managed Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update.
 */

data class Outpost (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "type")
    val type: OutpostTypeEnum,

    @Json(name = "providers")
    val providers: kotlin.collections.List<kotlin.Int>,

    @Json(name = "providers_obj")
    val providersObj: kotlin.collections.List<Provider>,

    @Json(name = "service_connection_obj")
    val serviceConnectionObj: ServiceConnection,

    /* Get Token identifier */
    @Json(name = "token_identifier")
    val tokenIdentifier: kotlin.String,

    @Json(name = "config")
    val config: kotlin.collections.Map<kotlin.String, kotlin.Any>,

    /* Select Service-Connection authentik should use to manage this outpost. Leave empty if authentik should not handle the deployment. */
    @Json(name = "service_connection")
    val serviceConnection: java.util.UUID? = null,

    /* Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. */
    @Json(name = "managed")
    val managed: kotlin.String? = null

)

