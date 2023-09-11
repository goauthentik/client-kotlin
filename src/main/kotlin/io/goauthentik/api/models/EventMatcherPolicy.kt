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

import io.goauthentik.api.models.AppEnum
import io.goauthentik.api.models.EventActions
import io.goauthentik.api.models.ModelEnum

import com.squareup.moshi.Json

/**
 * Event Matcher Policy Serializer
 *
 * @param pk 
 * @param name 
 * @param component Get object component so that we know how to edit the object
 * @param verboseName Return object's verbose_name
 * @param verboseNamePlural Return object's plural verbose_name
 * @param metaModelName Return internal model name
 * @param boundTo Return objects policy is bound to
 * @param executionLogging When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged.
 * @param action Match created events with this action type. When left empty, all action types will be matched.  * `login` - Login * `login_failed` - Login Failed * `logout` - Logout * `user_write` - User Write * `suspicious_request` - Suspicious Request * `password_set` - Password Set * `secret_view` - Secret View * `secret_rotate` - Secret Rotate * `invitation_used` - Invite Used * `authorize_application` - Authorize Application * `source_linked` - Source Linked * `impersonation_started` - Impersonation Started * `impersonation_ended` - Impersonation Ended * `flow_execution` - Flow Execution * `policy_execution` - Policy Execution * `policy_exception` - Policy Exception * `property_mapping_exception` - Property Mapping Exception * `system_task_execution` - System Task Execution * `system_task_exception` - System Task Exception * `system_exception` - System Exception * `configuration_error` - Configuration Error * `model_created` - Model Created * `model_updated` - Model Updated * `model_deleted` - Model Deleted * `email_sent` - Email Sent * `update_available` - Update Available * `custom_` - Custom Prefix
 * @param clientIp Matches Event's Client IP (strict matching, for network matching use an Expression Policy)
 * @param app Match events created by selected application. When left empty, all applications are matched.  * `authentik.admin` - authentik Admin * `authentik.api` - authentik API * `authentik.crypto` - authentik Crypto * `authentik.events` - authentik Events * `authentik.flows` - authentik Flows * `authentik.outposts` - authentik Outpost * `authentik.policies.dummy` - authentik Policies.Dummy * `authentik.policies.event_matcher` - authentik Policies.Event Matcher * `authentik.policies.expiry` - authentik Policies.Expiry * `authentik.policies.expression` - authentik Policies.Expression * `authentik.policies.password` - authentik Policies.Password * `authentik.policies.reputation` - authentik Policies.Reputation * `authentik.policies` - authentik Policies * `authentik.providers.ldap` - authentik Providers.LDAP * `authentik.providers.oauth2` - authentik Providers.OAuth2 * `authentik.providers.proxy` - authentik Providers.Proxy * `authentik.providers.radius` - authentik Providers.Radius * `authentik.providers.saml` - authentik Providers.SAML * `authentik.providers.scim` - authentik Providers.SCIM * `authentik.recovery` - authentik Recovery * `authentik.sources.ldap` - authentik Sources.LDAP * `authentik.sources.oauth` - authentik Sources.OAuth * `authentik.sources.plex` - authentik Sources.Plex * `authentik.sources.saml` - authentik Sources.SAML * `authentik.stages.authenticator` - authentik Stages.Authenticator * `authentik.stages.authenticator_duo` - authentik Stages.Authenticator.Duo * `authentik.stages.authenticator_sms` - authentik Stages.Authenticator.SMS * `authentik.stages.authenticator_static` - authentik Stages.Authenticator.Static * `authentik.stages.authenticator_totp` - authentik Stages.Authenticator.TOTP * `authentik.stages.authenticator_validate` - authentik Stages.Authenticator.Validate * `authentik.stages.authenticator_webauthn` - authentik Stages.Authenticator.WebAuthn * `authentik.stages.captcha` - authentik Stages.Captcha * `authentik.stages.consent` - authentik Stages.Consent * `authentik.stages.deny` - authentik Stages.Deny * `authentik.stages.dummy` - authentik Stages.Dummy * `authentik.stages.email` - authentik Stages.Email * `authentik.stages.identification` - authentik Stages.Identification * `authentik.stages.invitation` - authentik Stages.User Invitation * `authentik.stages.password` - authentik Stages.Password * `authentik.stages.prompt` - authentik Stages.Prompt * `authentik.stages.user_delete` - authentik Stages.User Delete * `authentik.stages.user_login` - authentik Stages.User Login * `authentik.stages.user_logout` - authentik Stages.User Logout * `authentik.stages.user_write` - authentik Stages.User Write * `authentik.tenants` - authentik Tenants * `authentik.blueprints` - authentik Blueprints * `authentik.core` - authentik Core * `authentik.enterprise` - authentik Enterprise
 * @param model Match events created by selected model. When left empty, all models are matched. When an app is selected, all the application's models are matched.  * `authentik_crypto.certificatekeypair` - Certificate-Key Pair * `authentik_events.event` - Event * `authentik_events.notificationtransport` - Notification Transport * `authentik_events.notification` - Notification * `authentik_events.notificationrule` - Notification Rule * `authentik_events.notificationwebhookmapping` - Webhook Mapping * `authentik_flows.flow` - Flow * `authentik_flows.flowstagebinding` - Flow Stage Binding * `authentik_outposts.dockerserviceconnection` - Docker Service-Connection * `authentik_outposts.kubernetesserviceconnection` - Kubernetes Service-Connection * `authentik_outposts.outpost` - outpost * `authentik_policies_dummy.dummypolicy` - Dummy Policy * `authentik_policies_event_matcher.eventmatcherpolicy` - Event Matcher Policy * `authentik_policies_expiry.passwordexpirypolicy` - Password Expiry Policy * `authentik_policies_expression.expressionpolicy` - Expression Policy * `authentik_policies_password.passwordpolicy` - Password Policy * `authentik_policies_reputation.reputationpolicy` - Reputation Policy * `authentik_policies_reputation.reputation` - Reputation Score * `authentik_policies.policybinding` - Policy Binding * `authentik_providers_ldap.ldapprovider` - LDAP Provider * `authentik_providers_oauth2.scopemapping` - Scope Mapping * `authentik_providers_oauth2.oauth2provider` - OAuth2/OpenID Provider * `authentik_providers_oauth2.authorizationcode` - Authorization Code * `authentik_providers_oauth2.accesstoken` - OAuth2 Access Token * `authentik_providers_oauth2.refreshtoken` - OAuth2 Refresh Token * `authentik_providers_proxy.proxyprovider` - Proxy Provider * `authentik_providers_radius.radiusprovider` - Radius Provider * `authentik_providers_saml.samlprovider` - SAML Provider * `authentik_providers_saml.samlpropertymapping` - SAML Property Mapping * `authentik_providers_scim.scimprovider` - SCIM Provider * `authentik_providers_scim.scimmapping` - SCIM Mapping * `authentik_sources_ldap.ldapsource` - LDAP Source * `authentik_sources_ldap.ldappropertymapping` - LDAP Property Mapping * `authentik_sources_oauth.oauthsource` - OAuth Source * `authentik_sources_oauth.useroauthsourceconnection` - User OAuth Source Connection * `authentik_sources_plex.plexsource` - Plex Source * `authentik_sources_plex.plexsourceconnection` - User Plex Source Connection * `authentik_sources_saml.samlsource` - SAML Source * `authentik_sources_saml.usersamlsourceconnection` - User SAML Source Connection * `authentik_stages_authenticator_duo.authenticatorduostage` - Duo Authenticator Setup Stage * `authentik_stages_authenticator_duo.duodevice` - Duo Device * `authentik_stages_authenticator_sms.authenticatorsmsstage` - SMS Authenticator Setup Stage * `authentik_stages_authenticator_sms.smsdevice` - SMS Device * `authentik_stages_authenticator_static.authenticatorstaticstage` - Static Authenticator Stage * `authentik_stages_authenticator_static.staticdevice` - Static device * `authentik_stages_authenticator_totp.authenticatortotpstage` - TOTP Authenticator Setup Stage * `authentik_stages_authenticator_totp.totpdevice` - TOTP device * `authentik_stages_authenticator_validate.authenticatorvalidatestage` - Authenticator Validation Stage * `authentik_stages_authenticator_webauthn.authenticatewebauthnstage` - WebAuthn Authenticator Setup Stage * `authentik_stages_authenticator_webauthn.webauthndevice` - WebAuthn Device * `authentik_stages_captcha.captchastage` - Captcha Stage * `authentik_stages_consent.consentstage` - Consent Stage * `authentik_stages_consent.userconsent` - User Consent * `authentik_stages_deny.denystage` - Deny Stage * `authentik_stages_dummy.dummystage` - Dummy Stage * `authentik_stages_email.emailstage` - Email Stage * `authentik_stages_identification.identificationstage` - Identification Stage * `authentik_stages_invitation.invitationstage` - Invitation Stage * `authentik_stages_invitation.invitation` - Invitation * `authentik_stages_password.passwordstage` - Password Stage * `authentik_stages_prompt.prompt` - Prompt * `authentik_stages_prompt.promptstage` - Prompt Stage * `authentik_stages_user_delete.userdeletestage` - User Delete Stage * `authentik_stages_user_login.userloginstage` - User Login Stage * `authentik_stages_user_logout.userlogoutstage` - User Logout Stage * `authentik_stages_user_write.userwritestage` - User Write Stage * `authentik_tenants.tenant` - Tenant * `authentik_blueprints.blueprintinstance` - Blueprint Instance * `authentik_core.group` - group * `authentik_core.user` - User * `authentik_core.application` - Application * `authentik_core.token` - Token
 */

data class EventMatcherPolicy (

    @Json(name = "pk")
    val pk: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    /* Get object component so that we know how to edit the object */
    @Json(name = "component")
    val component: kotlin.String,

    /* Return object's verbose_name */
    @Json(name = "verbose_name")
    val verboseName: kotlin.String,

    /* Return object's plural verbose_name */
    @Json(name = "verbose_name_plural")
    val verboseNamePlural: kotlin.String,

    /* Return internal model name */
    @Json(name = "meta_model_name")
    val metaModelName: kotlin.String,

    /* Return objects policy is bound to */
    @Json(name = "bound_to")
    val boundTo: kotlin.Int,

    /* When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged. */
    @Json(name = "execution_logging")
    val executionLogging: kotlin.Boolean? = null,

    /* Match created events with this action type. When left empty, all action types will be matched.  * `login` - Login * `login_failed` - Login Failed * `logout` - Logout * `user_write` - User Write * `suspicious_request` - Suspicious Request * `password_set` - Password Set * `secret_view` - Secret View * `secret_rotate` - Secret Rotate * `invitation_used` - Invite Used * `authorize_application` - Authorize Application * `source_linked` - Source Linked * `impersonation_started` - Impersonation Started * `impersonation_ended` - Impersonation Ended * `flow_execution` - Flow Execution * `policy_execution` - Policy Execution * `policy_exception` - Policy Exception * `property_mapping_exception` - Property Mapping Exception * `system_task_execution` - System Task Execution * `system_task_exception` - System Task Exception * `system_exception` - System Exception * `configuration_error` - Configuration Error * `model_created` - Model Created * `model_updated` - Model Updated * `model_deleted` - Model Deleted * `email_sent` - Email Sent * `update_available` - Update Available * `custom_` - Custom Prefix */
    @Json(name = "action")
    val action: EventActions? = null,

    /* Matches Event's Client IP (strict matching, for network matching use an Expression Policy) */
    @Json(name = "client_ip")
    val clientIp: kotlin.String? = null,

    /* Match events created by selected application. When left empty, all applications are matched.  * `authentik.admin` - authentik Admin * `authentik.api` - authentik API * `authentik.crypto` - authentik Crypto * `authentik.events` - authentik Events * `authentik.flows` - authentik Flows * `authentik.outposts` - authentik Outpost * `authentik.policies.dummy` - authentik Policies.Dummy * `authentik.policies.event_matcher` - authentik Policies.Event Matcher * `authentik.policies.expiry` - authentik Policies.Expiry * `authentik.policies.expression` - authentik Policies.Expression * `authentik.policies.password` - authentik Policies.Password * `authentik.policies.reputation` - authentik Policies.Reputation * `authentik.policies` - authentik Policies * `authentik.providers.ldap` - authentik Providers.LDAP * `authentik.providers.oauth2` - authentik Providers.OAuth2 * `authentik.providers.proxy` - authentik Providers.Proxy * `authentik.providers.radius` - authentik Providers.Radius * `authentik.providers.saml` - authentik Providers.SAML * `authentik.providers.scim` - authentik Providers.SCIM * `authentik.recovery` - authentik Recovery * `authentik.sources.ldap` - authentik Sources.LDAP * `authentik.sources.oauth` - authentik Sources.OAuth * `authentik.sources.plex` - authentik Sources.Plex * `authentik.sources.saml` - authentik Sources.SAML * `authentik.stages.authenticator` - authentik Stages.Authenticator * `authentik.stages.authenticator_duo` - authentik Stages.Authenticator.Duo * `authentik.stages.authenticator_sms` - authentik Stages.Authenticator.SMS * `authentik.stages.authenticator_static` - authentik Stages.Authenticator.Static * `authentik.stages.authenticator_totp` - authentik Stages.Authenticator.TOTP * `authentik.stages.authenticator_validate` - authentik Stages.Authenticator.Validate * `authentik.stages.authenticator_webauthn` - authentik Stages.Authenticator.WebAuthn * `authentik.stages.captcha` - authentik Stages.Captcha * `authentik.stages.consent` - authentik Stages.Consent * `authentik.stages.deny` - authentik Stages.Deny * `authentik.stages.dummy` - authentik Stages.Dummy * `authentik.stages.email` - authentik Stages.Email * `authentik.stages.identification` - authentik Stages.Identification * `authentik.stages.invitation` - authentik Stages.User Invitation * `authentik.stages.password` - authentik Stages.Password * `authentik.stages.prompt` - authentik Stages.Prompt * `authentik.stages.user_delete` - authentik Stages.User Delete * `authentik.stages.user_login` - authentik Stages.User Login * `authentik.stages.user_logout` - authentik Stages.User Logout * `authentik.stages.user_write` - authentik Stages.User Write * `authentik.tenants` - authentik Tenants * `authentik.blueprints` - authentik Blueprints * `authentik.core` - authentik Core * `authentik.enterprise` - authentik Enterprise */
    @Json(name = "app")
    val app: AppEnum? = null,

    /* Match events created by selected model. When left empty, all models are matched. When an app is selected, all the application's models are matched.  * `authentik_crypto.certificatekeypair` - Certificate-Key Pair * `authentik_events.event` - Event * `authentik_events.notificationtransport` - Notification Transport * `authentik_events.notification` - Notification * `authentik_events.notificationrule` - Notification Rule * `authentik_events.notificationwebhookmapping` - Webhook Mapping * `authentik_flows.flow` - Flow * `authentik_flows.flowstagebinding` - Flow Stage Binding * `authentik_outposts.dockerserviceconnection` - Docker Service-Connection * `authentik_outposts.kubernetesserviceconnection` - Kubernetes Service-Connection * `authentik_outposts.outpost` - outpost * `authentik_policies_dummy.dummypolicy` - Dummy Policy * `authentik_policies_event_matcher.eventmatcherpolicy` - Event Matcher Policy * `authentik_policies_expiry.passwordexpirypolicy` - Password Expiry Policy * `authentik_policies_expression.expressionpolicy` - Expression Policy * `authentik_policies_password.passwordpolicy` - Password Policy * `authentik_policies_reputation.reputationpolicy` - Reputation Policy * `authentik_policies_reputation.reputation` - Reputation Score * `authentik_policies.policybinding` - Policy Binding * `authentik_providers_ldap.ldapprovider` - LDAP Provider * `authentik_providers_oauth2.scopemapping` - Scope Mapping * `authentik_providers_oauth2.oauth2provider` - OAuth2/OpenID Provider * `authentik_providers_oauth2.authorizationcode` - Authorization Code * `authentik_providers_oauth2.accesstoken` - OAuth2 Access Token * `authentik_providers_oauth2.refreshtoken` - OAuth2 Refresh Token * `authentik_providers_proxy.proxyprovider` - Proxy Provider * `authentik_providers_radius.radiusprovider` - Radius Provider * `authentik_providers_saml.samlprovider` - SAML Provider * `authentik_providers_saml.samlpropertymapping` - SAML Property Mapping * `authentik_providers_scim.scimprovider` - SCIM Provider * `authentik_providers_scim.scimmapping` - SCIM Mapping * `authentik_sources_ldap.ldapsource` - LDAP Source * `authentik_sources_ldap.ldappropertymapping` - LDAP Property Mapping * `authentik_sources_oauth.oauthsource` - OAuth Source * `authentik_sources_oauth.useroauthsourceconnection` - User OAuth Source Connection * `authentik_sources_plex.plexsource` - Plex Source * `authentik_sources_plex.plexsourceconnection` - User Plex Source Connection * `authentik_sources_saml.samlsource` - SAML Source * `authentik_sources_saml.usersamlsourceconnection` - User SAML Source Connection * `authentik_stages_authenticator_duo.authenticatorduostage` - Duo Authenticator Setup Stage * `authentik_stages_authenticator_duo.duodevice` - Duo Device * `authentik_stages_authenticator_sms.authenticatorsmsstage` - SMS Authenticator Setup Stage * `authentik_stages_authenticator_sms.smsdevice` - SMS Device * `authentik_stages_authenticator_static.authenticatorstaticstage` - Static Authenticator Stage * `authentik_stages_authenticator_static.staticdevice` - Static device * `authentik_stages_authenticator_totp.authenticatortotpstage` - TOTP Authenticator Setup Stage * `authentik_stages_authenticator_totp.totpdevice` - TOTP device * `authentik_stages_authenticator_validate.authenticatorvalidatestage` - Authenticator Validation Stage * `authentik_stages_authenticator_webauthn.authenticatewebauthnstage` - WebAuthn Authenticator Setup Stage * `authentik_stages_authenticator_webauthn.webauthndevice` - WebAuthn Device * `authentik_stages_captcha.captchastage` - Captcha Stage * `authentik_stages_consent.consentstage` - Consent Stage * `authentik_stages_consent.userconsent` - User Consent * `authentik_stages_deny.denystage` - Deny Stage * `authentik_stages_dummy.dummystage` - Dummy Stage * `authentik_stages_email.emailstage` - Email Stage * `authentik_stages_identification.identificationstage` - Identification Stage * `authentik_stages_invitation.invitationstage` - Invitation Stage * `authentik_stages_invitation.invitation` - Invitation * `authentik_stages_password.passwordstage` - Password Stage * `authentik_stages_prompt.prompt` - Prompt * `authentik_stages_prompt.promptstage` - Prompt Stage * `authentik_stages_user_delete.userdeletestage` - User Delete Stage * `authentik_stages_user_login.userloginstage` - User Login Stage * `authentik_stages_user_logout.userlogoutstage` - User Logout Stage * `authentik_stages_user_write.userwritestage` - User Write Stage * `authentik_tenants.tenant` - Tenant * `authentik_blueprints.blueprintinstance` - Blueprint Instance * `authentik_core.group` - group * `authentik_core.user` - User * `authentik_core.application` - Application * `authentik_core.token` - Token */
    @Json(name = "model")
    val model: ModelEnum? = null

)

