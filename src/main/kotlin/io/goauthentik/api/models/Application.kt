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

import io.goauthentik.api.models.PolicyEngineMode
import io.goauthentik.api.models.Provider

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Application Serializer
 *
 * @param pk 
 * @param name Application's display Name.
 * @param slug Internal application name, used in URLs.
 * @param providerObj 
 * @param backchannelProvidersObj 
 * @param launchUrl Allow formatting of launch URL
 * @param metaIcon Get the URL to the App Icon image. If the name is /static or starts with http it is returned as-is
 * @param provider 
 * @param backchannelProviders 
 * @param openInNewTab Open launch URL in a new browser tab or window.
 * @param metaLaunchUrl 
 * @param metaDescription 
 * @param metaPublisher 
 * @param policyEngineMode 
 * @param group 
 */


data class Application (

    @Json(name = "pk")
    val pk: java.util.UUID,

    /* Application's display Name. */
    @Json(name = "name")
    val name: kotlin.String,

    /* Internal application name, used in URLs. */
    @Json(name = "slug")
    val slug: kotlin.String,

    @Json(name = "provider_obj")
    val providerObj: Provider,

    @Json(name = "backchannel_providers_obj")
    val backchannelProvidersObj: kotlin.collections.List<Provider>,

    /* Allow formatting of launch URL */
    @Json(name = "launch_url")
    val launchUrl: kotlin.String?,

    /* Get the URL to the App Icon image. If the name is /static or starts with http it is returned as-is */
    @Json(name = "meta_icon")
    val metaIcon: kotlin.String?,

    @Json(name = "provider")
    val provider: kotlin.Int? = null,

    @Json(name = "backchannel_providers")
    val backchannelProviders: kotlin.collections.List<kotlin.Int>? = null,

    /* Open launch URL in a new browser tab or window. */
    @Json(name = "open_in_new_tab")
    val openInNewTab: kotlin.Boolean? = null,

    @Json(name = "meta_launch_url")
    val metaLaunchUrl: java.net.URI? = null,

    @Json(name = "meta_description")
    val metaDescription: kotlin.String? = null,

    @Json(name = "meta_publisher")
    val metaPublisher: kotlin.String? = null,

    @Json(name = "policy_engine_mode")
    val policyEngineMode: PolicyEngineMode? = null,

    @Json(name = "group")
    val group: kotlin.String? = null

)

