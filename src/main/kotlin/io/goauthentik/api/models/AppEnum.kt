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
 * * `authentik.admin` - authentik Admin * `authentik.api` - authentik API * `authentik.crypto` - authentik Crypto * `authentik.events` - authentik Events * `authentik.flows` - authentik Flows * `authentik.outposts` - authentik Outpost * `authentik.policies.dummy` - authentik Policies.Dummy * `authentik.policies.event_matcher` - authentik Policies.Event Matcher * `authentik.policies.expiry` - authentik Policies.Expiry * `authentik.policies.expression` - authentik Policies.Expression * `authentik.policies.password` - authentik Policies.Password * `authentik.policies.reputation` - authentik Policies.Reputation * `authentik.policies` - authentik Policies * `authentik.providers.ldap` - authentik Providers.LDAP * `authentik.providers.oauth2` - authentik Providers.OAuth2 * `authentik.providers.proxy` - authentik Providers.Proxy * `authentik.providers.radius` - authentik Providers.Radius * `authentik.providers.saml` - authentik Providers.SAML * `authentik.providers.scim` - authentik Providers.SCIM * `authentik.rbac` - authentik RBAC * `authentik.recovery` - authentik Recovery * `authentik.sources.ldap` - authentik Sources.LDAP * `authentik.sources.oauth` - authentik Sources.OAuth * `authentik.sources.plex` - authentik Sources.Plex * `authentik.sources.saml` - authentik Sources.SAML * `authentik.stages.authenticator` - authentik Stages.Authenticator * `authentik.stages.authenticator_duo` - authentik Stages.Authenticator.Duo * `authentik.stages.authenticator_sms` - authentik Stages.Authenticator.SMS * `authentik.stages.authenticator_static` - authentik Stages.Authenticator.Static * `authentik.stages.authenticator_totp` - authentik Stages.Authenticator.TOTP * `authentik.stages.authenticator_validate` - authentik Stages.Authenticator.Validate * `authentik.stages.authenticator_webauthn` - authentik Stages.Authenticator.WebAuthn * `authentik.stages.captcha` - authentik Stages.Captcha * `authentik.stages.consent` - authentik Stages.Consent * `authentik.stages.deny` - authentik Stages.Deny * `authentik.stages.dummy` - authentik Stages.Dummy * `authentik.stages.email` - authentik Stages.Email * `authentik.stages.identification` - authentik Stages.Identification * `authentik.stages.invitation` - authentik Stages.User Invitation * `authentik.stages.password` - authentik Stages.Password * `authentik.stages.prompt` - authentik Stages.Prompt * `authentik.stages.user_delete` - authentik Stages.User Delete * `authentik.stages.user_login` - authentik Stages.User Login * `authentik.stages.user_logout` - authentik Stages.User Logout * `authentik.stages.user_write` - authentik Stages.User Write * `authentik.tenants` - authentik Tenants * `authentik.blueprints` - authentik Blueprints * `authentik.core` - authentik Core * `authentik.enterprise` - authentik Enterprise
 *
 * Values: admin,api,crypto,events,flows,outposts,policiesPeriodDummy,policiesPeriodEventMatcher,policiesPeriodExpiry,policiesPeriodExpression,policiesPeriodPassword,policiesPeriodReputation,policies,providersPeriodLdap,providersPeriodOauth2,providersPeriodProxy,providersPeriodRadius,providersPeriodSaml,providersPeriodScim,rbac,recovery,sourcesPeriodLdap,sourcesPeriodOauth,sourcesPeriodPlex,sourcesPeriodSaml,stagesPeriodAuthenticator,stagesPeriodAuthenticatorDuo,stagesPeriodAuthenticatorSms,stagesPeriodAuthenticatorStatic,stagesPeriodAuthenticatorTotp,stagesPeriodAuthenticatorValidate,stagesPeriodAuthenticatorWebauthn,stagesPeriodCaptcha,stagesPeriodConsent,stagesPeriodDeny,stagesPeriodDummy,stagesPeriodEmail,stagesPeriodIdentification,stagesPeriodInvitation,stagesPeriodPassword,stagesPeriodPrompt,stagesPeriodUserDelete,stagesPeriodUserLogin,stagesPeriodUserLogout,stagesPeriodUserWrite,tenants,blueprints,core,enterprise,unknownDefaultOpenApi
 */

enum class AppEnum(val value: kotlin.String) {

    @Json(name = "authentik.admin")
    admin("authentik.admin"),

    @Json(name = "authentik.api")
    api("authentik.api"),

    @Json(name = "authentik.crypto")
    crypto("authentik.crypto"),

    @Json(name = "authentik.events")
    events("authentik.events"),

    @Json(name = "authentik.flows")
    flows("authentik.flows"),

    @Json(name = "authentik.outposts")
    outposts("authentik.outposts"),

    @Json(name = "authentik.policies.dummy")
    policiesPeriodDummy("authentik.policies.dummy"),

    @Json(name = "authentik.policies.event_matcher")
    policiesPeriodEventMatcher("authentik.policies.event_matcher"),

    @Json(name = "authentik.policies.expiry")
    policiesPeriodExpiry("authentik.policies.expiry"),

    @Json(name = "authentik.policies.expression")
    policiesPeriodExpression("authentik.policies.expression"),

    @Json(name = "authentik.policies.password")
    policiesPeriodPassword("authentik.policies.password"),

    @Json(name = "authentik.policies.reputation")
    policiesPeriodReputation("authentik.policies.reputation"),

    @Json(name = "authentik.policies")
    policies("authentik.policies"),

    @Json(name = "authentik.providers.ldap")
    providersPeriodLdap("authentik.providers.ldap"),

    @Json(name = "authentik.providers.oauth2")
    providersPeriodOauth2("authentik.providers.oauth2"),

    @Json(name = "authentik.providers.proxy")
    providersPeriodProxy("authentik.providers.proxy"),

    @Json(name = "authentik.providers.radius")
    providersPeriodRadius("authentik.providers.radius"),

    @Json(name = "authentik.providers.saml")
    providersPeriodSaml("authentik.providers.saml"),

    @Json(name = "authentik.providers.scim")
    providersPeriodScim("authentik.providers.scim"),

    @Json(name = "authentik.rbac")
    rbac("authentik.rbac"),

    @Json(name = "authentik.recovery")
    recovery("authentik.recovery"),

    @Json(name = "authentik.sources.ldap")
    sourcesPeriodLdap("authentik.sources.ldap"),

    @Json(name = "authentik.sources.oauth")
    sourcesPeriodOauth("authentik.sources.oauth"),

    @Json(name = "authentik.sources.plex")
    sourcesPeriodPlex("authentik.sources.plex"),

    @Json(name = "authentik.sources.saml")
    sourcesPeriodSaml("authentik.sources.saml"),

    @Json(name = "authentik.stages.authenticator")
    stagesPeriodAuthenticator("authentik.stages.authenticator"),

    @Json(name = "authentik.stages.authenticator_duo")
    stagesPeriodAuthenticatorDuo("authentik.stages.authenticator_duo"),

    @Json(name = "authentik.stages.authenticator_sms")
    stagesPeriodAuthenticatorSms("authentik.stages.authenticator_sms"),

    @Json(name = "authentik.stages.authenticator_static")
    stagesPeriodAuthenticatorStatic("authentik.stages.authenticator_static"),

    @Json(name = "authentik.stages.authenticator_totp")
    stagesPeriodAuthenticatorTotp("authentik.stages.authenticator_totp"),

    @Json(name = "authentik.stages.authenticator_validate")
    stagesPeriodAuthenticatorValidate("authentik.stages.authenticator_validate"),

    @Json(name = "authentik.stages.authenticator_webauthn")
    stagesPeriodAuthenticatorWebauthn("authentik.stages.authenticator_webauthn"),

    @Json(name = "authentik.stages.captcha")
    stagesPeriodCaptcha("authentik.stages.captcha"),

    @Json(name = "authentik.stages.consent")
    stagesPeriodConsent("authentik.stages.consent"),

    @Json(name = "authentik.stages.deny")
    stagesPeriodDeny("authentik.stages.deny"),

    @Json(name = "authentik.stages.dummy")
    stagesPeriodDummy("authentik.stages.dummy"),

    @Json(name = "authentik.stages.email")
    stagesPeriodEmail("authentik.stages.email"),

    @Json(name = "authentik.stages.identification")
    stagesPeriodIdentification("authentik.stages.identification"),

    @Json(name = "authentik.stages.invitation")
    stagesPeriodInvitation("authentik.stages.invitation"),

    @Json(name = "authentik.stages.password")
    stagesPeriodPassword("authentik.stages.password"),

    @Json(name = "authentik.stages.prompt")
    stagesPeriodPrompt("authentik.stages.prompt"),

    @Json(name = "authentik.stages.user_delete")
    stagesPeriodUserDelete("authentik.stages.user_delete"),

    @Json(name = "authentik.stages.user_login")
    stagesPeriodUserLogin("authentik.stages.user_login"),

    @Json(name = "authentik.stages.user_logout")
    stagesPeriodUserLogout("authentik.stages.user_logout"),

    @Json(name = "authentik.stages.user_write")
    stagesPeriodUserWrite("authentik.stages.user_write"),

    @Json(name = "authentik.tenants")
    tenants("authentik.tenants"),

    @Json(name = "authentik.blueprints")
    blueprints("authentik.blueprints"),

    @Json(name = "authentik.core")
    core("authentik.core"),

    @Json(name = "authentik.enterprise")
    enterprise("authentik.enterprise"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AppEnum) "$data" else null

        /**
         * Returns a valid [AppEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AppEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

