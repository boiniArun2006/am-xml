package com.firebase.ui.auth.ui.email;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.ui.AppCompatBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.ui.email.EmailLinkCrossDeviceLinkingFragment;
import com.firebase.ui.auth.ui.email.EmailLinkPromptEmailFragment;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class EmailLinkErrorRecoveryActivity extends AppCompatBase implements EmailLinkPromptEmailFragment.EmailLinkPromptEmailListener, EmailLinkCrossDeviceLinkingFragment.FinishEmailLinkSignInListener {
    @Override // com.firebase.ui.auth.ui.email.EmailLinkPromptEmailFragment.EmailLinkPromptEmailListener
    public void onEmailPromptSuccess(IdpResponse idpResponse) {
        finish(-1, idpResponse.toIntent());
    }

    public static Intent createIntent(Context context, FlowParameters flowParameters, int i2) {
        return HelperActivityBase.createBaseIntent(context, EmailLinkErrorRecoveryActivity.class, flowParameters).putExtra("com.firebase.ui.auth.ui.email.recoveryTypeKey", i2);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        throw new UnsupportedOperationException("Fragments must handle progress updates.");
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(@StringRes int i2) {
        throw new UnsupportedOperationException("Fragments must handle progress updates.");
    }

    @Override // com.firebase.ui.auth.ui.email.EmailLinkCrossDeviceLinkingFragment.FinishEmailLinkSignInListener
    public void completeCrossDeviceEmailLinkFlow() {
        switchFragment(EmailLinkPromptEmailFragment.newInstance(), R$id.fragment_register_email, "CrossDeviceFragment", true, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.AppCompatBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Fragment fragmentNewInstance;
        super.onCreate(bundle);
        setContentView(R$layout.fui_activity_register_email);
        if (bundle != null) {
            return;
        }
        if (getIntent().getIntExtra("com.firebase.ui.auth.ui.email.recoveryTypeKey", -1) == 116) {
            fragmentNewInstance = EmailLinkCrossDeviceLinkingFragment.newInstance();
        } else {
            fragmentNewInstance = EmailLinkPromptEmailFragment.newInstance();
        }
        switchFragment(fragmentNewInstance, R$id.fragment_register_email, "EmailLinkPromptEmailFragment");
    }
}
