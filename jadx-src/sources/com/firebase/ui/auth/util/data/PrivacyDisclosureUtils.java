package com.firebase.ui.auth.util.data;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.util.ui.PreambleHandler;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public abstract class PrivacyDisclosureUtils {
    public static void setupTermsOfServiceAndPrivacyPolicySmsText(Context context, FlowParameters flowParameters, TextView textView) {
        PreambleHandler.setup(context, flowParameters, R$string.fui_verify_phone_number, getTermsSmsStringResource(flowParameters), textView);
    }

    @StringRes
    private static int getGlobalTermsFooterStringResource(FlowParameters flowParameters) {
        boolean zIsTermsOfServiceUrlProvided = flowParameters.isTermsOfServiceUrlProvided();
        boolean zIsPrivacyPolicyUrlProvided = flowParameters.isPrivacyPolicyUrlProvided();
        if (zIsTermsOfServiceUrlProvided && zIsPrivacyPolicyUrlProvided) {
            return R$string.fui_tos_and_pp_footer;
        }
        return -1;
    }

    @StringRes
    private static int getGlobalTermsStringResource(FlowParameters flowParameters) {
        boolean zIsTermsOfServiceUrlProvided = flowParameters.isTermsOfServiceUrlProvided();
        boolean zIsPrivacyPolicyUrlProvided = flowParameters.isPrivacyPolicyUrlProvided();
        if (zIsTermsOfServiceUrlProvided && zIsPrivacyPolicyUrlProvided) {
            return R$string.fui_tos_and_pp;
        }
        return -1;
    }

    @StringRes
    private static int getTermsSmsStringResource(FlowParameters flowParameters) {
        boolean zIsTermsOfServiceUrlProvided = flowParameters.isTermsOfServiceUrlProvided();
        boolean zIsPrivacyPolicyUrlProvided = flowParameters.isPrivacyPolicyUrlProvided();
        if (zIsTermsOfServiceUrlProvided && zIsPrivacyPolicyUrlProvided) {
            return R$string.fui_sms_terms_of_service_and_privacy_policy_extended;
        }
        return -1;
    }

    public static void setupTermsOfServiceAndPrivacyPolicyText(Context context, FlowParameters flowParameters, TextView textView) {
        PreambleHandler.setup(context, flowParameters, getGlobalTermsStringResource(flowParameters), textView);
    }

    public static void setupTermsOfServiceFooter(Context context, FlowParameters flowParameters, TextView textView) {
        PreambleHandler.setup(context, flowParameters, getGlobalTermsFooterStringResource(flowParameters), textView);
    }
}
