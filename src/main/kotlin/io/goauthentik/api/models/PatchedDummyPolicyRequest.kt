/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.2
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
 * Dummy Policy Serializer
 *
 * @param name 
 * @param executionLogging When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged.
 * @param result 
 * @param waitMin 
 * @param waitMax 
 */

data class PatchedDummyPolicyRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    /* When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged. */
    @Json(name = "execution_logging")
    val executionLogging: kotlin.Boolean? = null,

    @Json(name = "result")
    val result: kotlin.Boolean? = null,

    @Json(name = "wait_min")
    val waitMin: kotlin.Int? = null,

    @Json(name = "wait_max")
    val waitMax: kotlin.Int? = null

)

