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


import com.squareup.moshi.Json

/**
 * * `none` - None * `require_authenticated` - Require Authenticated * `require_unauthenticated` - Require Unauthenticated * `require_superuser` - Require Superuser
 *
 * Values: none,requireAuthenticated,requireUnauthenticated,requireSuperuser,unknownDefaultOpenApi
 */

enum class AuthenticationEnum(val value: kotlin.String) {

    @Json(name = "none")
    none("none"),

    @Json(name = "require_authenticated")
    requireAuthenticated("require_authenticated"),

    @Json(name = "require_unauthenticated")
    requireUnauthenticated("require_unauthenticated"),

    @Json(name = "require_superuser")
    requireSuperuser("require_superuser"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AuthenticationEnum) "$data" else null

        /**
         * Returns a valid [AuthenticationEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AuthenticationEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

