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

import io.goauthentik.api.models.OAuth2Provider
import io.goauthentik.api.models.User

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Serializer for BaseGrantModel and ExpiringBaseGrant
 *
 * @param pk 
 * @param provider 
 * @param user 
 * @param isExpired Check if token is expired yet.
 * @param scope 
 * @param expires 
 */


data class ExpiringBaseGrantModel (

    @Json(name = "pk")
    val pk: kotlin.Int,

    @Json(name = "provider")
    val provider: OAuth2Provider,

    @Json(name = "user")
    val user: User,

    /* Check if token is expired yet. */
    @Json(name = "is_expired")
    val isExpired: kotlin.Boolean,

    @Json(name = "scope")
    val scope: kotlin.collections.List<kotlin.String>,

    @Json(name = "expires")
    val expires: java.time.OffsetDateTime? = null

)

