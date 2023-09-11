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

import io.goauthentik.api.models.SeverityEnum

import com.squareup.moshi.Json

/**
 * NotificationRule Serializer
 *
 * @param name 
 * @param transports Select which transports should be used to notify the user. If none are selected, the notification will only be shown in the authentik UI.
 * @param severity Controls which severity level the created notifications will have.  * `notice` - Notice * `warning` - Warning * `alert` - Alert
 * @param group Define which group of users this notification should be sent and shown to. If left empty, Notification won't ben sent.
 */

data class PatchedNotificationRuleRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Select which transports should be used to notify the user. If none are selected, the notification will only be shown in the authentik UI. */
    @Json(name = "transports")
    val transports: kotlin.collections.List<java.util.UUID>? = null,

    /* Controls which severity level the created notifications will have.  * `notice` - Notice * `warning` - Warning * `alert` - Alert */
    @Json(name = "severity")
    val severity: SeverityEnum? = null,

    /* Define which group of users this notification should be sent and shown to. If left empty, Notification won't ben sent. */
    @Json(name = "group")
    val group: java.util.UUID? = null

)

