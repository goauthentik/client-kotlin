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


import com.squareup.moshi.Json

/**
 * Group Membership Policy Serializer
 *
 * @param name 
 * @param expression 
 * @param executionLogging When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged.
 */

data class ExpressionPolicyRequest (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "expression")
    val expression: kotlin.String,

    /* When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged. */
    @Json(name = "execution_logging")
    val executionLogging: kotlin.Boolean? = null

)

