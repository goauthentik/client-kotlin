/**
 * authentik
 *
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2023.10.0
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
 * Password Policy Serializer
 *
 * @param name 
 * @param executionLogging When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged.
 * @param passwordField Field key to check, field keys defined in Prompt stages are available.
 * @param amountDigits 
 * @param amountUppercase 
 * @param amountLowercase 
 * @param amountSymbols 
 * @param lengthMin 
 * @param symbolCharset 
 * @param errorMessage 
 * @param checkStaticRules 
 * @param checkHaveIBeenPwned 
 * @param checkZxcvbn 
 * @param hibpAllowedCount How many times the password hash is allowed to be on haveibeenpwned
 * @param zxcvbnScoreThreshold If the zxcvbn score is equal or less than this value, the policy will fail.
 */

data class PatchedPasswordPolicyRequest (

    @Json(name = "name")
    val name: kotlin.String? = null,

    /* When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged. */
    @Json(name = "execution_logging")
    val executionLogging: kotlin.Boolean? = null,

    /* Field key to check, field keys defined in Prompt stages are available. */
    @Json(name = "password_field")
    val passwordField: kotlin.String? = null,

    @Json(name = "amount_digits")
    val amountDigits: kotlin.Int? = null,

    @Json(name = "amount_uppercase")
    val amountUppercase: kotlin.Int? = null,

    @Json(name = "amount_lowercase")
    val amountLowercase: kotlin.Int? = null,

    @Json(name = "amount_symbols")
    val amountSymbols: kotlin.Int? = null,

    @Json(name = "length_min")
    val lengthMin: kotlin.Int? = null,

    @Json(name = "symbol_charset")
    val symbolCharset: kotlin.String? = null,

    @Json(name = "error_message")
    val errorMessage: kotlin.String? = null,

    @Json(name = "check_static_rules")
    val checkStaticRules: kotlin.Boolean? = null,

    @Json(name = "check_have_i_been_pwned")
    val checkHaveIBeenPwned: kotlin.Boolean? = null,

    @Json(name = "check_zxcvbn")
    val checkZxcvbn: kotlin.Boolean? = null,

    /* How many times the password hash is allowed to be on haveibeenpwned */
    @Json(name = "hibp_allowed_count")
    val hibpAllowedCount: kotlin.Int? = null,

    /* If the zxcvbn score is equal or less than this value, the policy will fail. */
    @Json(name = "zxcvbn_score_threshold")
    val zxcvbnScoreThreshold: kotlin.Int? = null

)

