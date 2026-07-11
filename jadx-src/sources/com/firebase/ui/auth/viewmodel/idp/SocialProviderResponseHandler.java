package com.firebase.ui.auth.viewmodel.idp;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.remote.ProfileMerger;
import com.firebase.ui.auth.ui.email.WelcomeBackEmailLinkPrompt;
import com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import com.firebase.ui.auth.util.FirebaseAuthError;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class SocialProviderResponseHandler extends SignInViewModelBase {
    private boolean isEmailOrPhoneProvider(@NonNull String str) {
        return TextUtils.equals(str, "password") || TextUtils.equals(str, "phone");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$3(final IdpResponse idpResponse, final AuthCredential authCredential, Exception exc) {
        boolean z2 = exc instanceof FirebaseAuthInvalidUserException;
        if ((exc instanceof FirebaseAuthException) && FirebaseAuthError.fromException((FirebaseAuthException) exc) == FirebaseAuthError.ERROR_USER_DISABLED) {
            z2 = true;
        }
        if (z2) {
            setResult(Resource.forFailure(new FirebaseUiException(12)));
            return;
        }
        if (exc instanceof FirebaseAuthUserCollisionException) {
            String email = idpResponse.getEmail();
            if (email == null) {
                setResult(Resource.forFailure(exc));
            } else {
                ProviderUtils.fetchSortedProviders(getAuth(), getArguments(), email).addOnSuccessListener(new OnSuccessListener() { // from class: xzr.aC
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        this.f75516n.lambda$startSignIn$1(idpResponse, authCredential, (List) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: xzr.C
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc2) {
                        this.f75509n.lambda$startSignIn$2(exc2);
                    }
                });
            }
        }
    }

    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (i2 == 108) {
            IdpResponse idpResponseFromResultIntent = IdpResponse.fromResultIntent(intent);
            if (i3 == -1) {
                setResult(Resource.forSuccess(idpResponseFromResultIntent));
            } else {
                setResult(Resource.forFailure(idpResponseFromResultIntent == null ? new FirebaseUiException(0, "Link canceled by user.") : idpResponseFromResultIntent.getError()));
            }
        }
    }

    public void startWelcomeBackFlowForLinking(String str, IdpResponse idpResponse) {
        if (str == null) {
            throw new IllegalStateException("No provider even though we received a FirebaseAuthUserCollisionException");
        }
        if (str.equals("password")) {
            setResult(Resource.forFailure(new IntentRequiredException(WelcomeBackPasswordPrompt.createIntent(getApplication(), getArguments(), idpResponse), 108)));
        } else if (str.equals("emailLink")) {
            setResult(Resource.forFailure(new IntentRequiredException(WelcomeBackEmailLinkPrompt.createIntent(getApplication(), getArguments(), idpResponse), 112)));
        } else {
            setResult(Resource.forFailure(new IntentRequiredException(WelcomeBackIdpPrompt.createIntent(getApplication(), getArguments(), new User.Builder(str, idpResponse.getEmail()).build(), idpResponse), 108)));
        }
    }

    public SocialProviderResponseHandler(Application application) {
        super(application);
    }

    private void handleGenericIdpLinkingFlow(@NonNull final IdpResponse idpResponse) {
        ProviderUtils.fetchSortedProviders(getAuth(), getArguments(), idpResponse.getEmail()).addOnSuccessListener(new OnSuccessListener() { // from class: xzr.o
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f75520n.lambda$handleGenericIdpLinkingFlow$4(idpResponse, (List) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: xzr.qz
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f75521n.lambda$handleGenericIdpLinkingFlow$5(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleGenericIdpLinkingFlow$4(IdpResponse idpResponse, List list) {
        if (list.isEmpty()) {
            setResult(Resource.forFailure(new FirebaseUiException(3, "No supported providers.")));
        } else {
            startWelcomeBackFlowForLinking((String) list.get(0), idpResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleGenericIdpLinkingFlow$5(Exception exc) {
        setResult(Resource.forFailure(exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$0(IdpResponse idpResponse, AuthResult authResult) {
        handleSuccess(idpResponse, authResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$1(IdpResponse idpResponse, AuthCredential authCredential, List list) {
        if (list.contains(idpResponse.getProviderType())) {
            handleMergeFailure(authCredential);
        } else if (list.isEmpty()) {
            setResult(Resource.forFailure(new FirebaseUiException(3, "No supported providers.")));
        } else {
            startWelcomeBackFlowForLinking((String) list.get(0), idpResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$2(Exception exc) {
        setResult(Resource.forFailure(exc));
    }

    public void startSignIn(@NonNull final IdpResponse idpResponse) {
        if (!idpResponse.isSuccessful() && !idpResponse.isRecoverableErrorResponse()) {
            setResult(Resource.forFailure(idpResponse.getError()));
            return;
        }
        if (!isEmailOrPhoneProvider(idpResponse.getProviderType())) {
            setResult(Resource.forLoading());
            if (idpResponse.hasCredentialForLinking()) {
                handleGenericIdpLinkingFlow(idpResponse);
                return;
            } else {
                final AuthCredential authCredential = ProviderUtils.getAuthCredential(idpResponse);
                AuthOperationManager.getInstance().signInAndLinkWithCredential(getAuth(), getArguments(), authCredential).continueWithTask(new ProfileMerger(idpResponse)).addOnSuccessListener(new OnSuccessListener() { // from class: xzr.fuX
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        this.f75518n.lambda$startSignIn$0(idpResponse, (AuthResult) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: xzr.Dsr
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        this.f75511n.lambda$startSignIn$3(idpResponse, authCredential, exc);
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("This handler cannot be used with email or phone providers");
    }
}
