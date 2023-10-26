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

import io.goauthentik.api.models.Group
import io.goauthentik.api.models.Policy
import io.goauthentik.api.models.User

import com.squareup.moshi.Json

/**
 * PolicyBinding Serializer
 *
 * @param pk 
 * @param policyObj 
 * @param groupObj 
 * @param userObj 
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

data class PolicyBinding (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "policy_obj")
    val policyObj: Policy,

    @Json(name = "group_obj")
    val groupObj: Group,

    @Json(name = "user_obj")
    val userObj: User,

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

