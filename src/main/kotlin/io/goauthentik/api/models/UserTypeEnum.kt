/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.8.2
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
 * * `internal` - Internal * `external` - External * `service_account` - Service Account * `internal_service_account` - Internal Service Account
 *
 * Values: `internal`,`external`,serviceAccount,internalServiceAccount,unknownDefaultOpenApi
 */

enum class UserTypeEnum(val value: kotlin.String) {

    @Json(name = "internal")
    `internal`("internal"),

    @Json(name = "external")
    `external`("external"),

    @Json(name = "service_account")
    serviceAccount("service_account"),

    @Json(name = "internal_service_account")
    internalServiceAccount("internal_service_account"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is UserTypeEnum) "$data" else null

        /**
         * Returns a valid [UserTypeEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): UserTypeEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

