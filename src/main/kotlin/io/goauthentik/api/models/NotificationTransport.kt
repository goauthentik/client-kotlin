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

import io.goauthentik.api.models.NotificationTransportModeEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * NotificationTransport Serializer
 *
 * @param pk 
 * @param name 
 * @param modeVerbose Return selected mode with a UI Label
 * @param mode 
 * @param webhookUrl 
 * @param webhookMapping 
 * @param sendOnce Only send notification once, for example when sending a webhook into a chat channel.
 */


data class NotificationTransport (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    /* Return selected mode with a UI Label */
    @Json(name = "mode_verbose")
    val modeVerbose: kotlin.String,

    @Json(name = "mode")
    val mode: NotificationTransportModeEnum? = null,

    @Json(name = "webhook_url")
    val webhookUrl: java.net.URI? = null,

    @Json(name = "webhook_mapping")
    val webhookMapping: java.util.UUID? = null,

    /* Only send notification once, for example when sending a webhook into a chat channel. */
    @Json(name = "send_once")
    val sendOnce: kotlin.Boolean? = null

)

