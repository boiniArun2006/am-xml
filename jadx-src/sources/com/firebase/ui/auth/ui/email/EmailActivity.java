package com.firebase.ui.auth.ui.email;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.view.ComponentActivity;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$anim;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.ui.AppCompatBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.ui.email.CheckEmailFragment;
import com.firebase.ui.auth.ui.email.EmailLinkFragment;
import com.firebase.ui.auth.ui.email.RegisterEmailFragment;
import com.firebase.ui.auth.ui.email.TroubleSigningInFragment;
import com.firebase.ui.auth.util.data.EmailLinkPersistenceManager;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.ActionCodeSettings;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class EmailActivity extends AppCompatBase implements CheckEmailFragment.CheckEmailListener, RegisterEmailFragment.AnonymousUpgradeListener, EmailLinkFragment.TroubleSigningInListener, TroubleSigningInFragment.ResendEmailListener {
    public static Intent createIntent(Context context, FlowParameters flowParameters) {
        return HelperActivityBase.createBaseIntent(context, EmailActivity.class, flowParameters);
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // com.firebase.ui.auth.ui.email.RegisterEmailFragment.AnonymousUpgradeListener
    public void onMergeFailure(IdpResponse idpResponse) {
        finish(5, idpResponse.toIntent());
    }

    public static Intent createIntent(Context context, FlowParameters flowParameters, String str) {
        return HelperActivityBase.createBaseIntent(context, EmailActivity.class, flowParameters).putExtra("extra_email", str);
    }

    private void finishOnDeveloperError(Exception exc) {
        finish(0, IdpResponse.getErrorIntent(new FirebaseUiException(3, exc.getMessage())));
    }

    private void setSlideAnimation() {
        overridePendingTransition(R$anim.fui_slide_in_right, R$anim.fui_slide_out_left);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        throw new UnsupportedOperationException("Email fragments must handle progress updates.");
    }

    @Override // com.firebase.ui.auth.ui.email.CheckEmailFragment.CheckEmailListener
    public void onNewUser(User user) {
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R$id.email_layout);
        AuthUI.IdpConfig configFromIdps = ProviderUtils.getConfigFromIdps(getFlowParams().providers, "password");
        if (configFromIdps == null) {
            configFromIdps = ProviderUtils.getConfigFromIdps(getFlowParams().providers, "emailLink");
        }
        if (!configFromIdps.getParams().getBoolean("extra_allow_new_emails", true)) {
            textInputLayout.setError(getString(R$string.fui_error_email_does_not_exist));
            return;
        }
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        if (configFromIdps.getProviderId().equals("emailLink")) {
            showRegisterEmailLinkFragment(configFromIdps, user.getEmail());
            return;
        }
        fragmentTransactionO.Z(R$id.fragment_register_email, RegisterEmailFragment.newInstance(user), "RegisterEmailFragment");
        if (textInputLayout != null) {
            String string = getString(R$string.fui_email_field_name);
            ViewCompat.UhV(textInputLayout, string);
            fragmentTransactionO.Uo(textInputLayout, string);
        }
        fragmentTransactionO.HI().mUb();
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(@StringRes int i2) {
        throw new UnsupportedOperationException("Email fragments must handle progress updates.");
    }

    public static Intent createIntentForLinking(Context context, FlowParameters flowParameters, IdpResponse idpResponse) {
        return createIntent(context, flowParameters, idpResponse.getEmail()).putExtra("extra_idp_response", idpResponse);
    }

    private void showRegisterEmailLinkFragment(AuthUI.IdpConfig idpConfig, String str) {
        switchFragment(EmailLinkFragment.newInstance(str, (ActionCodeSettings) idpConfig.getParams().getParcelable("action_code_settings")), R$id.fragment_register_email, "EmailLinkFragment");
    }

    @Override // com.firebase.ui.auth.ui.HelperActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 104 && i2 != 103) {
            return;
        }
        finish(i3, intent);
    }

    @Override // com.firebase.ui.auth.ui.email.TroubleSigningInFragment.ResendEmailListener
    public void onClickResendEmail(String str) {
        if (getSupportFragmentManager().Jk() > 0) {
            getSupportFragmentManager().Zmq();
        }
        showRegisterEmailLinkFragment(ProviderUtils.getConfigFromIdpsOrThrow(getFlowParams().providers, "emailLink"), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.AppCompatBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_activity_register_email);
        if (bundle != null) {
            return;
        }
        String string = getIntent().getExtras().getString("extra_email");
        IdpResponse idpResponse = (IdpResponse) getIntent().getExtras().getParcelable("extra_idp_response");
        if (string != null && idpResponse != null) {
            AuthUI.IdpConfig configFromIdpsOrThrow = ProviderUtils.getConfigFromIdpsOrThrow(getFlowParams().providers, "emailLink");
            ActionCodeSettings actionCodeSettings = (ActionCodeSettings) configFromIdpsOrThrow.getParams().getParcelable("action_code_settings");
            EmailLinkPersistenceManager.getInstance().saveIdpResponseForLinking(getApplication(), idpResponse);
            switchFragment(EmailLinkFragment.newInstance(string, actionCodeSettings, idpResponse, configFromIdpsOrThrow.getParams().getBoolean("force_same_device")), R$id.fragment_register_email, "EmailLinkFragment");
            return;
        }
        AuthUI.IdpConfig configFromIdps = ProviderUtils.getConfigFromIdps(getFlowParams().providers, "password");
        if (configFromIdps != null) {
            string = configFromIdps.getParams().getString("extra_default_email");
        }
        switchFragment(CheckEmailFragment.newInstance(string), R$id.fragment_register_email, "CheckEmailFragment");
    }

    @Override // com.firebase.ui.auth.ui.email.CheckEmailFragment.CheckEmailListener
    public void onExistingEmailUser(User user) {
        if (user.getProviderId().equals("emailLink")) {
            showRegisterEmailLinkFragment(ProviderUtils.getConfigFromIdpsOrThrow(getFlowParams().providers, "emailLink"), user.getEmail());
        } else {
            safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, WelcomeBackPasswordPrompt.createIntent(this, getFlowParams(), new IdpResponse.Builder(user).build()), 104);
            setSlideAnimation();
        }
    }

    @Override // com.firebase.ui.auth.ui.email.EmailLinkFragment.TroubleSigningInListener
    public void onSendEmailFailure(Exception exc) {
        finishOnDeveloperError(exc);
    }

    @Override // com.firebase.ui.auth.ui.email.EmailLinkFragment.TroubleSigningInListener
    public void onTroubleSigningIn(String str) {
        switchFragment(TroubleSigningInFragment.newInstance(str), R$id.fragment_register_email, "TroubleSigningInFragment", true, true);
    }
}
