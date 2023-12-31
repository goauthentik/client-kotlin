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

import io.goauthentik.api.models.FlowSetRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * CaptchaStage Serializer
 *
 * @param name 
 * @param flowSet 
 * @param publicKey Public key, acquired your captcha Provider.
 * @param privateKey Private key, acquired your captcha Provider.
 * @param jsUrl 
 * @param apiUrl 
 */


data class PatchedCaptchaStageRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    /* Public key, acquired your captcha Provider. */
    @Json(name = "public_key")
    val publicKey: kotlin.String? = null,

    /* Private key, acquired your captcha Provider. */
    @Json(name = "private_key")
    val privateKey: kotlin.String? = null,

    @Json(name = "js_url")
    val jsUrl: kotlin.String? = null,

    @Json(name = "api_url")
    val apiUrl: kotlin.String? = null

)

