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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param username 
 * @param token 
 * @param userUid 
 * @param userPk 
 * @param groupPk 
 */

data class UserServiceAccountResponse (

    @Json(name = "username")
    val username: kotlin.String,

    @Json(name = "token")
    val token: kotlin.String,

    @Json(name = "user_uid")
    val userUid: kotlin.String,

    @Json(name = "user_pk")
    val userPk: kotlin.Int,

    @Json(name = "group_pk")
    val groupPk: kotlin.String? = null

)

