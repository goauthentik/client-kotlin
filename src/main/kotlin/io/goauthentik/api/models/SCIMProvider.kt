/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.2
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
 * SCIMProvider Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object component so that we know how to edit the object
 * @param assignedBackchannelApplicationSlug Internal application name, used in URLs.
 * @param assignedBackchannelApplicationName Application's display Name.
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param url Base URL to SCIM requests, usually ends in /v2
 * @param token Authentication token
 * @param propertyMappings 
 * @param propertyMappingsGroup Property mappings used for group creation/updating.
 * @param excludeUsersServiceAccount 
 * @param filterGroup 
 */

data class SCIMProvider (

    @Json(name = "pk")
    val pk: kotlin.Int,

    @Json(name = "name")
    val name: kotlin.String,

    /* Get object component so that we know how to edit the object */
    @Json(name = "component")
    val component: kotlin.String,

    /* Internal application name, used in URLs. */
    @Json(name = "assigned_backchannel_application_slug")
    val assignedBackchannelApplicationSlug: kotlin.String,

    /* Application's display Name. */
    @Json(name = "assigned_backchannel_application_name")
    val assignedBackchannelApplicationName: kotlin.String,

    /* Return object's verbose_name */
    @Json(name = "verbose_name")
    val verboseName: kotlin.String,

    /* Return object's plural verbose_name */
    @Json(name = "verbose_name_plural")
    val verboseNamePlural: kotlin.String,

    /* Return internal model name */
    @Json(name = "meta_model_name")
    val metaModelName: kotlin.String,

    /* Base URL to SCIM requests, usually ends in /v2 */
    @Json(name = "url")
    val url: kotlin.String,

    /* Authentication token */
    @Json(name = "token")
    val token: kotlin.String,

    @Json(name = "property_mappings")
    val propertyMappings: kotlin.collections.List<java.util.UUID>? = null,

    /* Property mappings used for group creation/updating. */
    @Json(name = "property_mappings_group")
    val propertyMappingsGroup: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "exclude_users_service_account")
    val excludeUsersServiceAccount: kotlin.Boolean? = null,

    @Json(name = "filter_group")
    val filterGroup: java.util.UUID? = null

)

