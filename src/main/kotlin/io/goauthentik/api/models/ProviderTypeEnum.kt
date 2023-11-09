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
 * * `apple` - Apple * `azuread` - Azure AD * `discord` - Discord * `facebook` - Facebook * `github` - GitHub * `google` - Google * `mailcow` - Mailcow * `openidconnect` - OpenID Connect * `okta` - Okta * `patreon` - Patreon * `reddit` - Reddit * `twitch` - Twitch * `twitter` - Twitter
 *
 * Values: apple,azuread,discord,facebook,github,google,mailcow,openidconnect,okta,patreon,reddit,twitch,twitter,unknownDefaultOpenApi
 */

enum class ProviderTypeEnum(val value: kotlin.String) {

    @Json(name = "apple")
    apple("apple"),

    @Json(name = "azuread")
    azuread("azuread"),

    @Json(name = "discord")
    discord("discord"),

    @Json(name = "facebook")
    facebook("facebook"),

    @Json(name = "github")
    github("github"),

    @Json(name = "google")
    google("google"),

    @Json(name = "mailcow")
    mailcow("mailcow"),

    @Json(name = "openidconnect")
    openidconnect("openidconnect"),

    @Json(name = "okta")
    okta("okta"),

    @Json(name = "patreon")
    patreon("patreon"),

    @Json(name = "reddit")
    reddit("reddit"),

    @Json(name = "twitch")
    twitch("twitch"),

    @Json(name = "twitter")
    twitter("twitter"),

    @Json(name = "unknown_default_open_api")
    unknownDefaultOpenApi("unknown_default_open_api");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ProviderTypeEnum) "$data" else null

        /**
         * Returns a valid [ProviderTypeEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ProviderTypeEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

