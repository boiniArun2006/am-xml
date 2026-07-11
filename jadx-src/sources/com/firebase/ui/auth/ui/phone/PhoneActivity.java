package com.firebase.ui.auth.ui.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentManager;
import androidx.view.ViewModelProvider;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$id;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.PhoneNumberVerificationRequiredException;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.ui.AppCompatBase;
import com.firebase.ui.auth.ui.FragmentBase;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.util.FirebaseAuthError;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.phone.PhoneProviderResponseHandler;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuthException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class PhoneActivity extends AppCompatBase {
    private PhoneNumberVerificationHandler mPhoneVerifier;

    /* JADX INFO: renamed from: com.firebase.ui.auth.ui.phone.PhoneActivity$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$firebase$ui$auth$util$FirebaseAuthError;

        static {
            int[] iArr = new int[FirebaseAuthError.values().length];
            $SwitchMap$com$firebase$ui$auth$util$FirebaseAuthError = iArr;
            try {
                iArr[FirebaseAuthError.ERROR_INVALID_PHONE_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$firebase$ui$auth$util$FirebaseAuthError[FirebaseAuthError.ERROR_TOO_MANY_REQUESTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$firebase$ui$auth$util$FirebaseAuthError[FirebaseAuthError.ERROR_QUOTA_EXCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$firebase$ui$auth$util$FirebaseAuthError[FirebaseAuthError.ERROR_INVALID_VERIFICATION_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$firebase$ui$auth$util$FirebaseAuthError[FirebaseAuthError.ERROR_SESSION_EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Intent createIntent(Context context, FlowParameters flowParameters, Bundle bundle) {
        return HelperActivityBase.createBaseIntent(context, PhoneActivity.class, flowParameters).putExtra("extra_params", bundle);
    }

    private String getErrorMessage(FirebaseAuthError firebaseAuthError) {
        int i2 = AnonymousClass3.$SwitchMap$com$firebase$ui$auth$util$FirebaseAuthError[firebaseAuthError.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? firebaseAuthError.getDescription() : getString(R$string.fui_error_session_expired) : getString(R$string.fui_incorrect_code_dialog_body) : getString(R$string.fui_error_quota_exceeded) : getString(R$string.fui_error_too_many_attempts) : getString(R$string.fui_invalid_phone_number);
    }

    @NonNull
    private FragmentBase getActiveFragment() {
        FragmentBase fragmentBase = (CheckPhoneNumberFragment) getSupportFragmentManager().pJg("VerifyPhoneFragment");
        if (fragmentBase == null || fragmentBase.getView() == null) {
            fragmentBase = (SubmitConfirmationCodeFragment) getSupportFragmentManager().pJg("SubmitConfirmationCodeFragment");
        }
        if (fragmentBase != null && fragmentBase.getView() != null) {
            return fragmentBase;
        }
        throw new IllegalStateException("No fragments added");
    }

    @Nullable
    private TextInputLayout getErrorView() {
        CheckPhoneNumberFragment checkPhoneNumberFragment = (CheckPhoneNumberFragment) getSupportFragmentManager().pJg("VerifyPhoneFragment");
        SubmitConfirmationCodeFragment submitConfirmationCodeFragment = (SubmitConfirmationCodeFragment) getSupportFragmentManager().pJg("SubmitConfirmationCodeFragment");
        if (checkPhoneNumberFragment != null && checkPhoneNumberFragment.getView() != null) {
            return (TextInputLayout) checkPhoneNumberFragment.getView().findViewById(R$id.phone_layout);
        }
        if (submitConfirmationCodeFragment != null && submitConfirmationCodeFragment.getView() != null) {
            return (TextInputLayout) submitConfirmationCodeFragment.getView().findViewById(R$id.confirmation_code_layout);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleError(@Nullable Exception exc) {
        TextInputLayout errorView = getErrorView();
        if (errorView == null) {
            return;
        }
        if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
            finish(5, ((FirebaseAuthAnonymousUpgradeException) exc).getResponse().toIntent());
            return;
        }
        if (exc instanceof FirebaseAuthException) {
            FirebaseAuthError firebaseAuthErrorFromException = FirebaseAuthError.fromException((FirebaseAuthException) exc);
            if (firebaseAuthErrorFromException == FirebaseAuthError.ERROR_USER_DISABLED) {
                finish(0, IdpResponse.from(new FirebaseUiException(12)).toIntent());
                return;
            } else {
                errorView.setError(getErrorMessage(firebaseAuthErrorFromException));
                return;
            }
        }
        if (exc != null) {
            errorView.setError(getErrorMessage(FirebaseAuthError.ERROR_UNKNOWN));
        } else {
            errorView.setError(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSubmitCodeFragment(String str) {
        getSupportFragmentManager().o().Z(R$id.fragment_phone, SubmitConfirmationCodeFragment.newInstance(str), "SubmitConfirmationCodeFragment").KN(null).mUb();
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void hideProgress() {
        getActiveFragment().hideProgress();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().Jk() > 0) {
            getSupportFragmentManager().Zmq();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.firebase.ui.auth.ui.AppCompatBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_activity_register_phone);
        final PhoneProviderResponseHandler phoneProviderResponseHandler = (PhoneProviderResponseHandler) new ViewModelProvider(this).n(PhoneProviderResponseHandler.class);
        phoneProviderResponseHandler.init(getFlowParams());
        phoneProviderResponseHandler.getOperation().mUb(this, new ResourceObserver<IdpResponse>(this, R$string.fui_progress_dialog_signing_in) { // from class: com.firebase.ui.auth.ui.phone.PhoneActivity.1
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                PhoneActivity.this.handleError(exc);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull IdpResponse idpResponse) {
                PhoneActivity.this.startSaveCredentials(phoneProviderResponseHandler.getCurrentUser(), idpResponse, null);
            }
        });
        PhoneNumberVerificationHandler phoneNumberVerificationHandler = (PhoneNumberVerificationHandler) new ViewModelProvider(this).n(PhoneNumberVerificationHandler.class);
        this.mPhoneVerifier = phoneNumberVerificationHandler;
        phoneNumberVerificationHandler.init(getFlowParams());
        this.mPhoneVerifier.onRestoreInstanceState(bundle);
        this.mPhoneVerifier.getOperation().mUb(this, new ResourceObserver<PhoneVerification>(this, R$string.fui_verifying) { // from class: com.firebase.ui.auth.ui.phone.PhoneActivity.2
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(@NonNull Exception exc) {
                if (!(exc instanceof PhoneNumberVerificationRequiredException)) {
                    PhoneActivity.this.handleError(exc);
                    return;
                }
                if (PhoneActivity.this.getSupportFragmentManager().pJg("SubmitConfirmationCodeFragment") == null) {
                    PhoneActivity.this.showSubmitCodeFragment(((PhoneNumberVerificationRequiredException) exc).getPhoneNumber());
                }
                PhoneActivity.this.handleError(null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(@NonNull PhoneVerification phoneVerification) {
                if (phoneVerification.isAutoVerified()) {
                    Toast.makeText(PhoneActivity.this, R$string.fui_auto_verified, 1).show();
                    FragmentManager supportFragmentManager = PhoneActivity.this.getSupportFragmentManager();
                    if (supportFragmentManager.pJg("SubmitConfirmationCodeFragment") != null) {
                        supportFragmentManager.Zmq();
                    }
                }
                phoneProviderResponseHandler.startSignIn(phoneVerification.getCredential(), new IdpResponse.Builder(new User.Builder("phone", null).setPhoneNumber(phoneVerification.getNumber()).build()).build());
            }
        });
        if (bundle != null) {
            return;
        }
        getSupportFragmentManager().o().Z(R$id.fragment_phone, CheckPhoneNumberFragment.newInstance(getIntent().getExtras().getBundle("extra_params")), "VerifyPhoneFragment").HI().mUb();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mPhoneVerifier.onSaveInstanceState(bundle);
    }

    @Override // com.firebase.ui.auth.ui.ProgressView
    public void showProgress(int i2) {
        getActiveFragment().showProgress(i2);
    }
}
