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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PolicyBinding Serializer
 *
 * @param target 
 * @param order 
 * @param policy 
 * @param group 
 * @param user 
 * @param negate Negates the outcome of the policy. Messages are unaffected.
 * @param enabled 
 * @param timeout Timeout after which Policy execution is terminated.
 * @param failureResult Result if the Policy execution fails.
 */


data class PolicyBindingRequest (

    @Json(name = "target")
    val target: java.util.UUID,

    @Json(name = "order")
    val order: kotlin.Int,

    @Json(name = "policy")
    val policy: java.util.UUID? = null,

    @Json(name = "group")
    val group: java.util.UUID? = null,

    @Json(name = "user")
    val user: kotlin.Int? = null,

    /* Negates the outcome of the policy. Messages are unaffected. */
    @Json(name = "negate")
    val negate: kotlin.Boolean? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    /* Timeout after which Policy execution is terminated. */
    @Json(name = "timeout")
    val timeout: kotlin.Int? = null,

    /* Result if the Policy execution fails. */
    @Json(name = "failure_result")
    val failureResult: kotlin.Boolean? = null

)

