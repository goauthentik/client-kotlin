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
 * * `authentik_providers_ldap.ldapprovider` - authentik_providers_ldap.ldapprovider * `authentik_providers_oauth2.oauth2provider` - authentik_providers_oauth2.oauth2provider * `authentik_providers_proxy.proxyprovider` - authentik_providers_proxy.proxyprovider * `authentik_providers_rac.racprovider` - authentik_providers_rac.racprovider * `authentik_providers_radius.radiusprovider` - authentik_providers_radius.radiusprovider * `authentik_providers_saml.samlprovider` - authentik_providers_saml.samlprovider * `authentik_providers_scim.scimprovider` - authentik_providers_scim.scimprovider
 *
 * Values: ldapPeriodLdapprovider,oauth2PeriodOauth2provider,proxyPeriodProxyprovider,racPeriodRacprovider,radiusPeriodRadiusprovider,samlPeriodSamlprovider,scimPeriodScimprovider,unknownDefaultOpenApi
 */

@JsonClass(generateAdapter = false)
enum class ProviderModelEnum(val value: kotlin.String) {

    @Json(name = "authentik_providers_ldap.ldapprovider")
    ldapPeriodLdapprovider("authentik_providers_ldap.ldapprovider"),

    @Json(name = "authentik_providers_oauth2.oauth2provider")
    oauth2PeriodOauth2provider("authentik_providers_oauth2.oauth2provider"),

    @Json(name = "authentik_providers_proxy.proxyprovider")
    proxyPeriodProxyprovider("authentik_providers_proxy.proxyprovider"),

    @Json(name = "authentik_providers_rac.racprovider")
    racPeriodRacprovider("authentik_providers_rac.racprovider"),

    @Json(name = "authentik_providers_radius.radiusprovider")
    radiusPeriodRadiusprovider("authentik_providers_radius.radiusprovider"),

    @Json(name = "authentik_providers_saml.samlprovider")
    samlPeriodSamlprovider("authentik_providers_saml.samlprovider"),

    @Json(name = "authentik_providers_scim.scimprovider")
    scimPeriodScimprovider("authentik_providers_scim.scimprovider"),

    @Json(name = "unknown_default_open_api")
    unknownDefaultOpenApi("unknown_default_open_api");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ProviderModelEnum) "$data" else null

        /**
         * Returns a valid [ProviderModelEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ProviderModelEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

