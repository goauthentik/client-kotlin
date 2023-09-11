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

import io.goauthentik.api.models.AppleLoginChallenge
import io.goauthentik.api.models.ChallengeChoices
import io.goauthentik.api.models.ContextualFlowInfo
import io.goauthentik.api.models.ErrorDetail
import io.goauthentik.api.models.PlexAuthenticationChallenge
import io.goauthentik.api.models.RedirectChallenge

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type 
 * @param to 
 * @param clientId 
 * @param slug 
 * @param scope 
 * @param redirectUri 
 * @param state 
 * @param flowInfo 
 * @param component 
 * @param responseErrors 
 */

interface LoginChallengeTypes {

    @Json(name = "type")
    val type: ChallengeChoices
    @Json(name = "to")
    val to: kotlin.String
    @Json(name = "client_id")
    val clientId: kotlin.String
    @Json(name = "slug")
    val slug: kotlin.String
    @Json(name = "scope")
    val scope: kotlin.String
    @Json(name = "redirect_uri")
    val redirectUri: kotlin.String
    @Json(name = "state")
    val state: kotlin.String
    @Json(name = "flow_info")
    val flowInfo: ContextualFlowInfo?
    @Json(name = "component")
    val component: kotlin.String?
    @Json(name = "response_errors")
    val responseErrors: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ErrorDetail>>?
}

