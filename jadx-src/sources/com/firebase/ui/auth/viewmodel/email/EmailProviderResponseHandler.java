package com.firebase.ui.auth.viewmodel.email;

import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.remote.ProfileMerger;
import com.firebase.ui.auth.ui.email.WelcomeBackEmailLinkPrompt;
import com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.util.data.TaskFailureLogger;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class EmailProviderResponseHandler extends SignInViewModelBase {

    private class StartWelcomeBackFlow implements OnSuccessListener<String> {
        private final String mEmail;

        public StartWelcomeBackFlow(String str) {
            this.mEmail = str;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(@Nullable String str) {
            if (str == null) {
                Log.w("EmailProviderResponseHa", "No providers known for user (" + this.mEmail + ") this email address may be reserved.");
                EmailProviderResponseHandler.this.setResult(Resource.forFailure(new FirebaseUiException(0)));
                return;
            }
            if ("password".equalsIgnoreCase(str)) {
                EmailProviderResponseHandler.this.setResult(Resource.forFailure(new IntentRequiredException(WelcomeBackPasswordPrompt.createIntent(EmailProviderResponseHandler.this.getApplication(), (FlowParameters) EmailProviderResponseHandler.this.getArguments(), new IdpResponse.Builder(new User.Builder("password", this.mEmail).build()).build()), 104)));
            } else if ("emailLink".equalsIgnoreCase(str)) {
                EmailProviderResponseHandler.this.setResult(Resource.forFailure(new IntentRequiredException(WelcomeBackEmailLinkPrompt.createIntent(EmailProviderResponseHandler.this.getApplication(), (FlowParameters) EmailProviderResponseHandler.this.getArguments(), new IdpResponse.Builder(new User.Builder("emailLink", this.mEmail).build()).build()), 112)));
            } else {
                EmailProviderResponseHandler.this.setResult(Resource.forFailure(new IntentRequiredException(WelcomeBackIdpPrompt.createIntent(EmailProviderResponseHandler.this.getApplication(), (FlowParameters) EmailProviderResponseHandler.this.getArguments(), new User.Builder(str, this.mEmail).build()), 103)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$2(AuthOperationManager authOperationManager, String str, String str2, Exception exc) {
        if (!(exc instanceof FirebaseAuthUserCollisionException)) {
            setResult(Resource.forFailure(exc));
        } else if (authOperationManager.canUpgradeAnonymous(getAuth(), getArguments())) {
            handleMergeFailure(I28.n(str, str2));
        } else {
            Log.w("EmailProviderResponseHa", "Got a collision error during a non-upgrade flow", exc);
            ProviderUtils.fetchTopProvider(getAuth(), getArguments(), str).addOnSuccessListener(new StartWelcomeBackFlow(str)).addOnFailureListener(new OnFailureListener() { // from class: CB.C
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc2) {
                    this.f801n.lambda$startSignIn$1(exc2);
                }
            });
        }
    }

    public EmailProviderResponseHandler(Application application) {
        super(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$0(IdpResponse idpResponse, AuthResult authResult) {
        handleSuccess(idpResponse, authResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$1(Exception exc) {
        setResult(Resource.forFailure(exc));
    }

    public void startSignIn(@NonNull final IdpResponse idpResponse, @NonNull final String str) {
        if (!idpResponse.isSuccessful()) {
            setResult(Resource.forFailure(idpResponse.getError()));
        } else {
            if (idpResponse.getProviderType().equals("password")) {
                setResult(Resource.forLoading());
                final AuthOperationManager authOperationManager = AuthOperationManager.getInstance();
                final String email = idpResponse.getEmail();
                authOperationManager.createOrLinkUserWithEmailAndPassword(getAuth(), getArguments(), email, str).continueWithTask(new ProfileMerger(idpResponse)).addOnFailureListener(new TaskFailureLogger("EmailProviderResponseHa", "Error creating user")).addOnSuccessListener(new OnSuccessListener() { // from class: CB.Dsr
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        this.f803n.lambda$startSignIn$0(idpResponse, (AuthResult) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: CB.aC
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        this.f813n.lambda$startSignIn$2(authOperationManager, email, str, exc);
                    }
                });
                return;
            }
            throw new IllegalStateException("This handler can only be used with the email provider");
        }
    }
}
