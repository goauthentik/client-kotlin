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
 * * `authentik_crypto.certificatekeypair` - Certificate-Key Pair * `authentik_events.event` - Event * `authentik_events.notificationtransport` - Notification Transport * `authentik_events.notification` - Notification * `authentik_events.notificationrule` - Notification Rule * `authentik_events.notificationwebhookmapping` - Webhook Mapping * `authentik_flows.flow` - Flow * `authentik_flows.flowstagebinding` - Flow Stage Binding * `authentik_outposts.dockerserviceconnection` - Docker Service-Connection * `authentik_outposts.kubernetesserviceconnection` - Kubernetes Service-Connection * `authentik_outposts.outpost` - Outpost * `authentik_policies_dummy.dummypolicy` - Dummy Policy * `authentik_policies_event_matcher.eventmatcherpolicy` - Event Matcher Policy * `authentik_policies_expiry.passwordexpirypolicy` - Password Expiry Policy * `authentik_policies_expression.expressionpolicy` - Expression Policy * `authentik_policies_password.passwordpolicy` - Password Policy * `authentik_policies_reputation.reputationpolicy` - Reputation Policy * `authentik_policies_reputation.reputation` - Reputation Score * `authentik_policies.policybinding` - Policy Binding * `authentik_providers_ldap.ldapprovider` - LDAP Provider * `authentik_providers_oauth2.scopemapping` - Scope Mapping * `authentik_providers_oauth2.oauth2provider` - OAuth2/OpenID Provider * `authentik_providers_oauth2.authorizationcode` - Authorization Code * `authentik_providers_oauth2.accesstoken` - OAuth2 Access Token * `authentik_providers_oauth2.refreshtoken` - OAuth2 Refresh Token * `authentik_providers_proxy.proxyprovider` - Proxy Provider * `authentik_providers_radius.radiusprovider` - Radius Provider * `authentik_providers_saml.samlprovider` - SAML Provider * `authentik_providers_saml.samlpropertymapping` - SAML Property Mapping * `authentik_providers_scim.scimprovider` - SCIM Provider * `authentik_providers_scim.scimmapping` - SCIM Mapping * `authentik_rbac.role` - Role * `authentik_sources_ldap.ldapsource` - LDAP Source * `authentik_sources_ldap.ldappropertymapping` - LDAP Property Mapping * `authentik_sources_oauth.oauthsource` - OAuth Source * `authentik_sources_oauth.useroauthsourceconnection` - User OAuth Source Connection * `authentik_sources_plex.plexsource` - Plex Source * `authentik_sources_plex.plexsourceconnection` - User Plex Source Connection * `authentik_sources_saml.samlsource` - SAML Source * `authentik_sources_saml.usersamlsourceconnection` - User SAML Source Connection * `authentik_stages_authenticator_duo.authenticatorduostage` - Duo Authenticator Setup Stage * `authentik_stages_authenticator_duo.duodevice` - Duo Device * `authentik_stages_authenticator_sms.authenticatorsmsstage` - SMS Authenticator Setup Stage * `authentik_stages_authenticator_sms.smsdevice` - SMS Device * `authentik_stages_authenticator_static.authenticatorstaticstage` - Static Authenticator Stage * `authentik_stages_authenticator_static.staticdevice` - Static Device * `authentik_stages_authenticator_totp.authenticatortotpstage` - TOTP Authenticator Setup Stage * `authentik_stages_authenticator_totp.totpdevice` - TOTP Device * `authentik_stages_authenticator_validate.authenticatorvalidatestage` - Authenticator Validation Stage * `authentik_stages_authenticator_webauthn.authenticatewebauthnstage` - WebAuthn Authenticator Setup Stage * `authentik_stages_authenticator_webauthn.webauthndevice` - WebAuthn Device * `authentik_stages_captcha.captchastage` - Captcha Stage * `authentik_stages_consent.consentstage` - Consent Stage * `authentik_stages_consent.userconsent` - User Consent * `authentik_stages_deny.denystage` - Deny Stage * `authentik_stages_dummy.dummystage` - Dummy Stage * `authentik_stages_email.emailstage` - Email Stage * `authentik_stages_identification.identificationstage` - Identification Stage * `authentik_stages_invitation.invitationstage` - Invitation Stage * `authentik_stages_invitation.invitation` - Invitation * `authentik_stages_password.passwordstage` - Password Stage * `authentik_stages_prompt.prompt` - Prompt * `authentik_stages_prompt.promptstage` - Prompt Stage * `authentik_stages_user_delete.userdeletestage` - User Delete Stage * `authentik_stages_user_login.userloginstage` - User Login Stage * `authentik_stages_user_logout.userlogoutstage` - User Logout Stage * `authentik_stages_user_write.userwritestage` - User Write Stage * `authentik_tenants.tenant` - Tenant * `authentik_blueprints.blueprintinstance` - Blueprint Instance * `authentik_core.group` - Group * `authentik_core.user` - User * `authentik_core.application` - Application * `authentik_core.token` - Token * `authentik_enterprise.license` - License
 *
 * Values: cryptoPeriodCertificatekeypair,eventsPeriodEvent,eventsPeriodNotificationtransport,eventsPeriodNotification,eventsPeriodNotificationrule,eventsPeriodNotificationwebhookmapping,flowsPeriodFlow,flowsPeriodFlowstagebinding,outpostsPeriodDockerserviceconnection,outpostsPeriodKubernetesserviceconnection,outpostsPeriodOutpost,policiesDummyPeriodDummypolicy,policiesEventMatcherPeriodEventmatcherpolicy,policiesExpiryPeriodPasswordexpirypolicy,policiesExpressionPeriodExpressionpolicy,policiesPasswordPeriodPasswordpolicy,policiesReputationPeriodReputationpolicy,policiesReputationPeriodReputation,policiesPeriodPolicybinding,providersLdapPeriodLdapprovider,providersOauth2PeriodScopemapping,providersOauth2PeriodOauth2provider,providersOauth2PeriodAuthorizationcode,providersOauth2PeriodAccesstoken,providersOauth2PeriodRefreshtoken,providersProxyPeriodProxyprovider,providersRadiusPeriodRadiusprovider,providersSamlPeriodSamlprovider,providersSamlPeriodSamlpropertymapping,providersScimPeriodScimprovider,providersScimPeriodScimmapping,rbacPeriodRole,sourcesLdapPeriodLdapsource,sourcesLdapPeriodLdappropertymapping,sourcesOauthPeriodOauthsource,sourcesOauthPeriodUseroauthsourceconnection,sourcesPlexPeriodPlexsource,sourcesPlexPeriodPlexsourceconnection,sourcesSamlPeriodSamlsource,sourcesSamlPeriodUsersamlsourceconnection,stagesAuthenticatorDuoPeriodAuthenticatorduostage,stagesAuthenticatorDuoPeriodDuodevice,stagesAuthenticatorSmsPeriodAuthenticatorsmsstage,stagesAuthenticatorSmsPeriodSmsdevice,stagesAuthenticatorStaticPeriodAuthenticatorstaticstage,stagesAuthenticatorStaticPeriodStaticdevice,stagesAuthenticatorTotpPeriodAuthenticatortotpstage,stagesAuthenticatorTotpPeriodTotpdevice,stagesAuthenticatorValidatePeriodAuthenticatorvalidatestage,stagesAuthenticatorWebauthnPeriodAuthenticatewebauthnstage,stagesAuthenticatorWebauthnPeriodWebauthndevice,stagesCaptchaPeriodCaptchastage,stagesConsentPeriodConsentstage,stagesConsentPeriodUserconsent,stagesDenyPeriodDenystage,stagesDummyPeriodDummystage,stagesEmailPeriodEmailstage,stagesIdentificationPeriodIdentificationstage,stagesInvitationPeriodInvitationstage,stagesInvitationPeriodInvitation,stagesPasswordPeriodPasswordstage,stagesPromptPeriodPrompt,stagesPromptPeriodPromptstage,stagesUserDeletePeriodUserdeletestage,stagesUserLoginPeriodUserloginstage,stagesUserLogoutPeriodUserlogoutstage,stagesUserWritePeriodUserwritestage,tenantsPeriodTenant,blueprintsPeriodBlueprintinstance,corePeriodGroup,corePeriodUser,corePeriodApplication,corePeriodToken,enterprisePeriodLicense,unknownDefaultOpenApi
 */

enum class ModelEnum(val value: kotlin.String) {

    @Json(name = "authentik_crypto.certificatekeypair")
    cryptoPeriodCertificatekeypair("authentik_crypto.certificatekeypair"),

    @Json(name = "authentik_events.event")
    eventsPeriodEvent("authentik_events.event"),

    @Json(name = "authentik_events.notificationtransport")
    eventsPeriodNotificationtransport("authentik_events.notificationtransport"),

    @Json(name = "authentik_events.notification")
    eventsPeriodNotification("authentik_events.notification"),

    @Json(name = "authentik_events.notificationrule")
    eventsPeriodNotificationrule("authentik_events.notificationrule"),

    @Json(name = "authentik_events.notificationwebhookmapping")
    eventsPeriodNotificationwebhookmapping("authentik_events.notificationwebhookmapping"),

    @Json(name = "authentik_flows.flow")
    flowsPeriodFlow("authentik_flows.flow"),

    @Json(name = "authentik_flows.flowstagebinding")
    flowsPeriodFlowstagebinding("authentik_flows.flowstagebinding"),

    @Json(name = "authentik_outposts.dockerserviceconnection")
    outpostsPeriodDockerserviceconnection("authentik_outposts.dockerserviceconnection"),

    @Json(name = "authentik_outposts.kubernetesserviceconnection")
    outpostsPeriodKubernetesserviceconnection("authentik_outposts.kubernetesserviceconnection"),

    @Json(name = "authentik_outposts.outpost")
    outpostsPeriodOutpost("authentik_outposts.outpost"),

    @Json(name = "authentik_policies_dummy.dummypolicy")
    policiesDummyPeriodDummypolicy("authentik_policies_dummy.dummypolicy"),

    @Json(name = "authentik_policies_event_matcher.eventmatcherpolicy")
    policiesEventMatcherPeriodEventmatcherpolicy("authentik_policies_event_matcher.eventmatcherpolicy"),

    @Json(name = "authentik_policies_expiry.passwordexpirypolicy")
    policiesExpiryPeriodPasswordexpirypolicy("authentik_policies_expiry.passwordexpirypolicy"),

    @Json(name = "authentik_policies_expression.expressionpolicy")
    policiesExpressionPeriodExpressionpolicy("authentik_policies_expression.expressionpolicy"),

    @Json(name = "authentik_policies_password.passwordpolicy")
    policiesPasswordPeriodPasswordpolicy("authentik_policies_password.passwordpolicy"),

    @Json(name = "authentik_policies_reputation.reputationpolicy")
    policiesReputationPeriodReputationpolicy("authentik_policies_reputation.reputationpolicy"),

    @Json(name = "authentik_policies_reputation.reputation")
    policiesReputationPeriodReputation("authentik_policies_reputation.reputation"),

    @Json(name = "authentik_policies.policybinding")
    policiesPeriodPolicybinding("authentik_policies.policybinding"),

    @Json(name = "authentik_providers_ldap.ldapprovider")
    providersLdapPeriodLdapprovider("authentik_providers_ldap.ldapprovider"),

    @Json(name = "authentik_providers_oauth2.scopemapping")
    providersOauth2PeriodScopemapping("authentik_providers_oauth2.scopemapping"),

    @Json(name = "authentik_providers_oauth2.oauth2provider")
    providersOauth2PeriodOauth2provider("authentik_providers_oauth2.oauth2provider"),

    @Json(name = "authentik_providers_oauth2.authorizationcode")
    providersOauth2PeriodAuthorizationcode("authentik_providers_oauth2.authorizationcode"),

    @Json(name = "authentik_providers_oauth2.accesstoken")
    providersOauth2PeriodAccesstoken("authentik_providers_oauth2.accesstoken"),

    @Json(name = "authentik_providers_oauth2.refreshtoken")
    providersOauth2PeriodRefreshtoken("authentik_providers_oauth2.refreshtoken"),

    @Json(name = "authentik_providers_proxy.proxyprovider")
    providersProxyPeriodProxyprovider("authentik_providers_proxy.proxyprovider"),

    @Json(name = "authentik_providers_radius.radiusprovider")
    providersRadiusPeriodRadiusprovider("authentik_providers_radius.radiusprovider"),

    @Json(name = "authentik_providers_saml.samlprovider")
    providersSamlPeriodSamlprovider("authentik_providers_saml.samlprovider"),

    @Json(name = "authentik_providers_saml.samlpropertymapping")
    providersSamlPeriodSamlpropertymapping("authentik_providers_saml.samlpropertymapping"),

    @Json(name = "authentik_providers_scim.scimprovider")
    providersScimPeriodScimprovider("authentik_providers_scim.scimprovider"),

    @Json(name = "authentik_providers_scim.scimmapping")
    providersScimPeriodScimmapping("authentik_providers_scim.scimmapping"),

    @Json(name = "authentik_rbac.role")
    rbacPeriodRole("authentik_rbac.role"),

    @Json(name = "authentik_sources_ldap.ldapsource")
    sourcesLdapPeriodLdapsource("authentik_sources_ldap.ldapsource"),

    @Json(name = "authentik_sources_ldap.ldappropertymapping")
    sourcesLdapPeriodLdappropertymapping("authentik_sources_ldap.ldappropertymapping"),

    @Json(name = "authentik_sources_oauth.oauthsource")
    sourcesOauthPeriodOauthsource("authentik_sources_oauth.oauthsource"),

    @Json(name = "authentik_sources_oauth.useroauthsourceconnection")
    sourcesOauthPeriodUseroauthsourceconnection("authentik_sources_oauth.useroauthsourceconnection"),

    @Json(name = "authentik_sources_plex.plexsource")
    sourcesPlexPeriodPlexsource("authentik_sources_plex.plexsource"),

    @Json(name = "authentik_sources_plex.plexsourceconnection")
    sourcesPlexPeriodPlexsourceconnection("authentik_sources_plex.plexsourceconnection"),

    @Json(name = "authentik_sources_saml.samlsource")
    sourcesSamlPeriodSamlsource("authentik_sources_saml.samlsource"),

    @Json(name = "authentik_sources_saml.usersamlsourceconnection")
    sourcesSamlPeriodUsersamlsourceconnection("authentik_sources_saml.usersamlsourceconnection"),

    @Json(name = "authentik_stages_authenticator_duo.authenticatorduostage")
    stagesAuthenticatorDuoPeriodAuthenticatorduostage("authentik_stages_authenticator_duo.authenticatorduostage"),

    @Json(name = "authentik_stages_authenticator_duo.duodevice")
    stagesAuthenticatorDuoPeriodDuodevice("authentik_stages_authenticator_duo.duodevice"),

    @Json(name = "authentik_stages_authenticator_sms.authenticatorsmsstage")
    stagesAuthenticatorSmsPeriodAuthenticatorsmsstage("authentik_stages_authenticator_sms.authenticatorsmsstage"),

    @Json(name = "authentik_stages_authenticator_sms.smsdevice")
    stagesAuthenticatorSmsPeriodSmsdevice("authentik_stages_authenticator_sms.smsdevice"),

    @Json(name = "authentik_stages_authenticator_static.authenticatorstaticstage")
    stagesAuthenticatorStaticPeriodAuthenticatorstaticstage("authentik_stages_authenticator_static.authenticatorstaticstage"),

    @Json(name = "authentik_stages_authenticator_static.staticdevice")
    stagesAuthenticatorStaticPeriodStaticdevice("authentik_stages_authenticator_static.staticdevice"),

    @Json(name = "authentik_stages_authenticator_totp.authenticatortotpstage")
    stagesAuthenticatorTotpPeriodAuthenticatortotpstage("authentik_stages_authenticator_totp.authenticatortotpstage"),

    @Json(name = "authentik_stages_authenticator_totp.totpdevice")
    stagesAuthenticatorTotpPeriodTotpdevice("authentik_stages_authenticator_totp.totpdevice"),

    @Json(name = "authentik_stages_authenticator_validate.authenticatorvalidatestage")
    stagesAuthenticatorValidatePeriodAuthenticatorvalidatestage("authentik_stages_authenticator_validate.authenticatorvalidatestage"),

    @Json(name = "authentik_stages_authenticator_webauthn.authenticatewebauthnstage")
    stagesAuthenticatorWebauthnPeriodAuthenticatewebauthnstage("authentik_stages_authenticator_webauthn.authenticatewebauthnstage"),

    @Json(name = "authentik_stages_authenticator_webauthn.webauthndevice")
    stagesAuthenticatorWebauthnPeriodWebauthndevice("authentik_stages_authenticator_webauthn.webauthndevice"),

    @Json(name = "authentik_stages_captcha.captchastage")
    stagesCaptchaPeriodCaptchastage("authentik_stages_captcha.captchastage"),

    @Json(name = "authentik_stages_consent.consentstage")
    stagesConsentPeriodConsentstage("authentik_stages_consent.consentstage"),

    @Json(name = "authentik_stages_consent.userconsent")
    stagesConsentPeriodUserconsent("authentik_stages_consent.userconsent"),

    @Json(name = "authentik_stages_deny.denystage")
    stagesDenyPeriodDenystage("authentik_stages_deny.denystage"),

    @Json(name = "authentik_stages_dummy.dummystage")
    stagesDummyPeriodDummystage("authentik_stages_dummy.dummystage"),

    @Json(name = "authentik_stages_email.emailstage")
    stagesEmailPeriodEmailstage("authentik_stages_email.emailstage"),

    @Json(name = "authentik_stages_identification.identificationstage")
    stagesIdentificationPeriodIdentificationstage("authentik_stages_identification.identificationstage"),

    @Json(name = "authentik_stages_invitation.invitationstage")
    stagesInvitationPeriodInvitationstage("authentik_stages_invitation.invitationstage"),

    @Json(name = "authentik_stages_invitation.invitation")
    stagesInvitationPeriodInvitation("authentik_stages_invitation.invitation"),

    @Json(name = "authentik_stages_password.passwordstage")
    stagesPasswordPeriodPasswordstage("authentik_stages_password.passwordstage"),

    @Json(name = "authentik_stages_prompt.prompt")
    stagesPromptPeriodPrompt("authentik_stages_prompt.prompt"),

    @Json(name = "authentik_stages_prompt.promptstage")
    stagesPromptPeriodPromptstage("authentik_stages_prompt.promptstage"),

    @Json(name = "authentik_stages_user_delete.userdeletestage")
    stagesUserDeletePeriodUserdeletestage("authentik_stages_user_delete.userdeletestage"),

    @Json(name = "authentik_stages_user_login.userloginstage")
    stagesUserLoginPeriodUserloginstage("authentik_stages_user_login.userloginstage"),

    @Json(name = "authentik_stages_user_logout.userlogoutstage")
    stagesUserLogoutPeriodUserlogoutstage("authentik_stages_user_logout.userlogoutstage"),

    @Json(name = "authentik_stages_user_write.userwritestage")
    stagesUserWritePeriodUserwritestage("authentik_stages_user_write.userwritestage"),

    @Json(name = "authentik_tenants.tenant")
    tenantsPeriodTenant("authentik_tenants.tenant"),

    @Json(name = "authentik_blueprints.blueprintinstance")
    blueprintsPeriodBlueprintinstance("authentik_blueprints.blueprintinstance"),

    @Json(name = "authentik_core.group")
    corePeriodGroup("authentik_core.group"),

    @Json(name = "authentik_core.user")
    corePeriodUser("authentik_core.user"),

    @Json(name = "authentik_core.application")
    corePeriodApplication("authentik_core.application"),

    @Json(name = "authentik_core.token")
    corePeriodToken("authentik_core.token"),

    @Json(name = "authentik_enterprise.license")
    enterprisePeriodLicense("authentik_enterprise.license"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ModelEnum) "$data" else null

        /**
         * Returns a valid [ModelEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ModelEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

