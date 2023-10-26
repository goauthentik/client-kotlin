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

import io.goauthentik.api.models.SystemRuntime

import com.squareup.moshi.Json

/**
 * Get system information.
 *
 * @param httpHeaders Get HTTP Request headers
 * @param httpHost Get HTTP host
 * @param httpIsSecure Get HTTP Secure flag
 * @param runtime 
 * @param tenant Currently active tenant
 * @param serverTime Current server time
 * @param embeddedOutpostHost Get the FQDN configured on the embedded outpost
 */

data class System (

    /* Get HTTP Request headers */
    @Json(name = "http_headers")
    val httpHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>,

    /* Get HTTP host */
    @Json(name = "http_host")
    val httpHost: kotlin.String,

    /* Get HTTP Secure flag */
    @Json(name = "http_is_secure")
    val httpIsSecure: kotlin.Boolean,

    @Json(name = "runtime")
    val runtime: SystemRuntime,

    /* Currently active tenant */
    @Json(name = "tenant")
    val tenant: kotlin.String,

    /* Current server time */
    @Json(name = "server_time")
    val serverTime: java.time.OffsetDateTime,

    /* Get the FQDN configured on the embedded outpost */
    @Json(name = "embedded_outpost_host")
    val embeddedOutpostHost: kotlin.String

)

