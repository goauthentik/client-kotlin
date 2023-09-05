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
 * * `hashed_user_id` - Based on the Hashed User ID * `user_id` - Based on user ID * `user_uuid` - Based on user UUID * `user_username` - Based on the username * `user_email` - Based on the User's Email. This is recommended over the UPN method. * `user_upn` - Based on the User's UPN, only works if user has a 'upn' attribute set. Use this method only if you have different UPN and Mail domains.
 *
 * Values: hashedUserId,userId,userUuid,userUsername,userEmail,userUpn,unknownDefaultOpenApi
 */

enum class SubModeEnum(val value: kotlin.String) {

    @Json(name = "hashed_user_id")
    hashedUserId("hashed_user_id"),

    @Json(name = "user_id")
    userId("user_id"),

    @Json(name = "user_uuid")
    userUuid("user_uuid"),

    @Json(name = "user_username")
    userUsername("user_username"),

    @Json(name = "user_email")
    userEmail("user_email"),

    @Json(name = "user_upn")
    userUpn("user_upn"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SubModeEnum) "$data" else null

        /**
         * Returns a valid [SubModeEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SubModeEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

