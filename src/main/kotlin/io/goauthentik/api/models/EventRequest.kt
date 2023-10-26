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

import io.goauthentik.api.models.EventActions

import com.squareup.moshi.Json

/**
 * Event Serializer
 *
 * @param action 
 * @param app 
 * @param user 
 * @param context 
 * @param clientIp 
 * @param expires 
 * @param tenant 
 */

data class EventRequest (

    @Json(name = "action")
    val action: EventActions,

    @Json(name = "app")
    val app: kotlin.String,

    @Json(name = "user")
    val user: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @Json(name = "context")
    val context: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @Json(name = "client_ip")
    val clientIp: kotlin.String? = null,

    @Json(name = "expires")
    val expires: java.time.OffsetDateTime? = null,

    @Json(name = "tenant")
    val tenant: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

)

