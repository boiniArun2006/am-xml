package com.firebase.ui.auth.ui.email;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.ui.AppCompatBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.util.FirebaseAuthError;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.util.ui.ImeHelper;
import com.firebase.ui.auth.util.ui.TextHelper;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.email.WelcomeBackPasswordHandler;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class WelcomeBackPasswordPrompt extends AppCompatBase implements View.OnClickListener, ImeHelper.DonePressedListener {
    private Button mDoneButton;
    private WelcomeBackPasswordHandler mHandler;
    private IdpResponse mIdpResponse;
    private EditText mPasswordField;
    private TextInputLayout mPasswordLayout;
    private ProgressBar mProgressBar;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    private void validateAndSignIn() {
        validateAndSignIn(this.mPasswordField.getText().toString());
    }

    public static Intent createIntent(Context context, FlowParameters flowParameters, IdpResponse idpResponse) {
        return HelperActivityBase.createBaseIntent(context, WelcomeBackPasswordPrompt.class, flowParameters).putExtra("extra_idp_response", idpResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @StringRes
    public int getErrorMessage(Exception exc) {
        return exc instanceof FirebaseAuthInvalidCredentialsException ? R$string.fui_error_invalid_password : R$string.fui_error_unknown;
    }

    private void validateAndSignIn(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mPasswordLayout.setError(getString(R$string.fui_error_invalid_password));
            return;
        }
        this.mPasswordLayout.setError(null);
        this.mHandler.startSignIn(this.mIdpResponse.getEmail(), str, this.mIdpResponse, ProviderUtils.getAuthCredential(this.mIdpResponse));
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mDoneButton.setEnabled(true);
        this.mProgressBar.setVisibility(4);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mDoneButton.setEnabled(false);
        this.mProgressBar.setVisibility(0);
    }

    private void onForgotPasswordClicked() {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, RecoverPasswordActivity.createIntent(this, getFlowParams(), this.mIdpResponse.getEmail()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.button_done) {
            validateAndSignIn();
        } else if (id == R$id.trouble_signing_in) {
            onForgotPasswordClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.AppCompatBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_welcome_back_password_prompt_layout);
        getWindow().setSoftInputMode(4);
        IdpResponse idpResponseFromResultIntent = IdpResponse.fromResultIntent(getIntent());
        this.mIdpResponse = idpResponseFromResultIntent;
        String email = idpResponseFromResultIntent.getEmail();
        this.mDoneButton = (Button) findViewById(R$id.button_done);
        this.mProgressBar = (ProgressBar) findViewById(R$id.top_progress_bar);
        this.mPasswordLayout = (TextInputLayout) findViewById(R$id.password_layout);
        EditText editText = (EditText) findViewById(R$id.password);
        this.mPasswordField = editText;
        ImeHelper.setImeOnDoneListener(editText, this);
        String string = getString(R$string.fui_welcome_back_password_prompt_body, email);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        TextHelper.boldAllOccurencesOfText(spannableStringBuilder, string, email);
        ((TextView) findViewById(R$id.welcome_back_password_body)).setText(spannableStringBuilder);
        this.mDoneButton.setOnClickListener(this);
        findViewById(R$id.trouble_signing_in).setOnClickListener(this);
        WelcomeBackPasswordHandler welcomeBackPasswordHandler = (WelcomeBackPasswordHandler) new ViewModelProvider(this).n(WelcomeBackPasswordHandler.class);
        this.mHandler = welcomeBackPasswordHandler;
        welcomeBackPasswordHandler.init(getFlowParams());
        this.mHandler.getOperation().mUb(this, new ResourceObserver<IdpResponse>(this, R$string.fui_progress_dialog_signing_in) { // from class: com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    WelcomeBackPasswordPrompt.this.finish(5, ((FirebaseAuthAnonymousUpgradeException) exc).getResponse().toIntent());
                } else if ((exc instanceof FirebaseAuthException) && FirebaseAuthError.fromException((FirebaseAuthException) exc) == FirebaseAuthError.ERROR_USER_DISABLED) {
                    WelcomeBackPasswordPrompt.this.finish(0, IdpResponse.from(new FirebaseUiException(12)).toIntent());
                } else {
                    TextInputLayout textInputLayout = WelcomeBackPasswordPrompt.this.mPasswordLayout;
                    WelcomeBackPasswordPrompt welcomeBackPasswordPrompt = WelcomeBackPasswordPrompt.this;
                    textInputLayout.setError(welcomeBackPasswordPrompt.getString(welcomeBackPasswordPrompt.getErrorMessage(exc)));
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                WelcomeBackPasswordPrompt welcomeBackPasswordPrompt = WelcomeBackPasswordPrompt.this;
                welcomeBackPasswordPrompt.startSaveCredentials(welcomeBackPasswordPrompt.mHandler.getCurrentUser(), idpResponse, WelcomeBackPasswordPrompt.this.mHandler.getPendingPassword());
            }
        });
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(this, getFlowParams(), (TextView) findViewById(R$id.email_footer_tos_and_pp_text));
    }

    @Override // com.firebase.ui.auth.util.ui.ImeHelper.DonePressedListener
    public void onDonePressed() {
        validateAndSignIn();
    }
}
