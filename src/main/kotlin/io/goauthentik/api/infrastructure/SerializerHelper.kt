package io.goauthentik.api.infrastructure

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapters.EnumJsonAdapter

object SerializerHelper {
    fun addEnumUnknownDefaultCase(moshiBuilder: Moshi.Builder): Moshi.Builder {
        return moshiBuilder
            .add(io.goauthentik.api.models.AppEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.AppEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.AppEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.AuthTypeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.AuthTypeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.AuthTypeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.AuthenticationEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.AuthenticationEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.AuthenticationEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.AuthenticatorAttachmentEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.AuthenticatorAttachmentEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.AuthenticatorAttachmentEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.BackendsEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.BackendsEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.BackendsEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.BindingTypeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.BindingTypeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.BindingTypeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.BlueprintInstanceStatusEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.BlueprintInstanceStatusEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.BlueprintInstanceStatusEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.CapabilitiesEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.CapabilitiesEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.CapabilitiesEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.ChallengeChoices::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.ChallengeChoices::class.java)
                .withUnknownFallback(io.goauthentik.api.models.ChallengeChoices.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.ClientTypeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.ClientTypeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.ClientTypeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.ConsentStageModeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.ConsentStageModeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.ConsentStageModeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.DeniedActionEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.DeniedActionEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.DeniedActionEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.DeviceClassesEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.DeviceClassesEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.DeviceClassesEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.DigestAlgorithmEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.DigestAlgorithmEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.DigestAlgorithmEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.DigitsEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.DigitsEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.DigitsEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.DuoResponseEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.DuoResponseEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.DuoResponseEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.EventActions::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.EventActions::class.java)
                .withUnknownFallback(io.goauthentik.api.models.EventActions.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.FlowDesignationEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.FlowDesignationEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.FlowDesignationEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.IntentEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.IntentEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.IntentEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.InvalidResponseActionEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.InvalidResponseActionEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.InvalidResponseActionEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.IssuerModeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.IssuerModeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.IssuerModeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.LDAPAPIAccessMode::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.LDAPAPIAccessMode::class.java)
                .withUnknownFallback(io.goauthentik.api.models.LDAPAPIAccessMode.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.LayoutEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.LayoutEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.LayoutEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.ModelEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.ModelEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.ModelEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.NameIdPolicyEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.NameIdPolicyEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.NameIdPolicyEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.NotConfiguredActionEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.NotConfiguredActionEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.NotConfiguredActionEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.NotificationTransportModeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.NotificationTransportModeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.NotificationTransportModeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.OutpostTypeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.OutpostTypeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.OutpostTypeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.PolicyEngineMode::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.PolicyEngineMode::class.java)
                .withUnknownFallback(io.goauthentik.api.models.PolicyEngineMode.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.PromptTypeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.PromptTypeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.PromptTypeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.ProviderEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.ProviderEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.ProviderEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.ProviderModelEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.ProviderModelEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.ProviderModelEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.ProviderTypeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.ProviderTypeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.ProviderTypeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.ProxyMode::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.ProxyMode::class.java)
                .withUnknownFallback(io.goauthentik.api.models.ProxyMode.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.ResidentKeyRequirementEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.ResidentKeyRequirementEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.ResidentKeyRequirementEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.SeverityEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.SeverityEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.SeverityEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.SignatureAlgorithmEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.SignatureAlgorithmEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.SignatureAlgorithmEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.SpBindingEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.SpBindingEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.SpBindingEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.SubModeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.SubModeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.SubModeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.TaskStatusEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.TaskStatusEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.TaskStatusEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.UiThemeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.UiThemeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.UiThemeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.UsedByActionEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.UsedByActionEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.UsedByActionEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.UserCreationModeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.UserCreationModeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.UserCreationModeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.UserFieldsEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.UserFieldsEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.UserFieldsEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.UserMatchingModeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.UserMatchingModeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.UserMatchingModeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.UserTypeEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.UserTypeEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.UserTypeEnum.unknownDefaultOpenApi))
            .add(io.goauthentik.api.models.UserVerificationEnum::class.java, EnumJsonAdapter.create(io.goauthentik.api.models.UserVerificationEnum::class.java)
                .withUnknownFallback(io.goauthentik.api.models.UserVerificationEnum.unknownDefaultOpenApi))
    }
}
