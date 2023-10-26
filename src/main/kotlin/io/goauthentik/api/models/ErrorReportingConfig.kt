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


import com.squareup.moshi.Json

/**
 * Config for error reporting
 *
 * @param enabled 
 * @param sentryDsn 
 * @param environment 
 * @param sendPii 
 * @param tracesSampleRate 
 */

data class ErrorReportingConfig (

    @Json(name = "enabled")
    val enabled: kotlin.Boolean,

    @Json(name = "sentry_dsn")
    val sentryDsn: kotlin.String,

    @Json(name = "environment")
    val environment: kotlin.String,

    @Json(name = "send_pii")
    val sendPii: kotlin.Boolean,

    @Json(name = "traces_sample_rate")
    val tracesSampleRate: kotlin.Double

)

