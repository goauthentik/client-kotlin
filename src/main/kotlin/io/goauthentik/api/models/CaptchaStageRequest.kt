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

import io.goauthentik.api.models.FlowSetRequest

import com.squareup.moshi.Json

/**
 * CaptchaStage Serializer
 *
 * @param name 
 * @param publicKey Public key, acquired your captcha Provider.
 * @param privateKey Private key, acquired your captcha Provider.
 * @param flowSet 
 * @param jsUrl 
 * @param apiUrl 
 */

data class CaptchaStageRequest (

    @Json(name = "name")
    val name: kotlin.String,

    /* Public key, acquired your captcha Provider. */
    @Json(name = "public_key")
    val publicKey: kotlin.String,

    /* Private key, acquired your captcha Provider. */
    @Json(name = "private_key")
    val privateKey: kotlin.String,

    @Json(name = "flow_set")
    val flowSet: kotlin.collections.List<FlowSetRequest>? = null,

    @Json(name = "js_url")
    val jsUrl: kotlin.String? = null,

    @Json(name = "api_url")
    val apiUrl: kotlin.String? = null

)

