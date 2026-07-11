package com.firebase.ui.auth.ui.email;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.ui.AppCompatBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.util.data.PrivacyDisclosureUtils;
import com.firebase.ui.auth.util.ui.ImeHelper;
import com.firebase.ui.auth.util.ui.fieldvalidators.EmailFieldValidator;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.email.RecoverPasswordHandler;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import nv.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class RecoverPasswordActivity extends AppCompatBase implements View.OnClickListener, ImeHelper.DonePressedListener {
    private EditText mEmailEditText;
    private EmailFieldValidator mEmailFieldValidator;
    private TextInputLayout mEmailInputLayout;
    private RecoverPasswordHandler mHandler;
    private ProgressBar mProgressBar;
    private Button mSubmitButton;

    public static Intent createIntent(Context context, FlowParameters flowParameters, String str) {
        return HelperActivityBase.createBaseIntent(context, RecoverPasswordActivity.class, flowParameters).putExtra("extra_email", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showEmailSentDialog$0(DialogInterface dialogInterface) {
        finish(-1, new Intent());
    }

    private void resetPassword(String str, @Nullable ActionCodeSettings actionCodeSettings) {
        this.mHandler.startReset(str, actionCodeSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEmailSentDialog(String str) {
        new n(this).o(R$string.fui_title_confirm_recover_password).KN(getString(R$string.fui_confirm_recovery_body, str)).ty(new DialogInterface.OnDismissListener() { // from class: Rd.fuX
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f8718n.lambda$showEmailSentDialog$0(dialogInterface);
            }
        }).setPositiveButton(R.string.ok, null).XQ();
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        this.mSubmitButton.setEnabled(true);
        this.mProgressBar.setVisibility(4);
    }

    @Override // com.firebase.ui.auth.util.ui.ImeHelper.DonePressedListener
    public void onDonePressed() {
        if (this.mEmailFieldValidator.validate(this.mEmailEditText.getText())) {
            if (getFlowParams().passwordResetSettings != null) {
                resetPassword(this.mEmailEditText.getText().toString(), getFlowParams().passwordResetSettings);
            } else {
                resetPassword(this.mEmailEditText.getText().toString(), null);
            }
        }
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        this.mSubmitButton.setEnabled(false);
        this.mProgressBar.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.button_done) {
            onDonePressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.AppCompatBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_forgot_password_layout);
        RecoverPasswordHandler recoverPasswordHandler = (RecoverPasswordHandler) new ViewModelProvider(this).n(RecoverPasswordHandler.class);
        this.mHandler = recoverPasswordHandler;
        recoverPasswordHandler.init(getFlowParams());
        this.mHandler.getOperation().mUb(this, new ResourceObserver<String>(this, R$string.fui_progress_dialog_sending) { // from class: com.firebase.ui.auth.ui.email.RecoverPasswordActivity.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                if ((exc instanceof FirebaseAuthInvalidUserException) || (exc instanceof FirebaseAuthInvalidCredentialsException)) {
                    RecoverPasswordActivity.this.mEmailInputLayout.setError(RecoverPasswordActivity.this.getString(R$string.fui_error_email_does_not_exist));
                } else {
                    RecoverPasswordActivity.this.mEmailInputLayout.setError(RecoverPasswordActivity.this.getString(R$string.fui_error_unknown));
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull String str) {
                RecoverPasswordActivity.this.mEmailInputLayout.setError(null);
                RecoverPasswordActivity.this.showEmailSentDialog(str);
            }
        });
        this.mProgressBar = (ProgressBar) findViewById(R$id.top_progress_bar);
        this.mSubmitButton = (Button) findViewById(R$id.button_done);
        this.mEmailInputLayout = (TextInputLayout) findViewById(R$id.email_layout);
        this.mEmailEditText = (EditText) findViewById(R$id.email);
        this.mEmailFieldValidator = new EmailFieldValidator(this.mEmailInputLayout);
        String stringExtra = getIntent().getStringExtra("extra_email");
        if (stringExtra != null) {
            this.mEmailEditText.setText(stringExtra);
        }
        ImeHelper.setImeOnDoneListener(this.mEmailEditText, this);
        this.mSubmitButton.setOnClickListener(this);
        PrivacyDisclosureUtils.setupTermsOfServiceFooter(this, getFlowParams(), (TextView) findViewById(R$id.email_footer_tos_and_pp_text));
    }
}
