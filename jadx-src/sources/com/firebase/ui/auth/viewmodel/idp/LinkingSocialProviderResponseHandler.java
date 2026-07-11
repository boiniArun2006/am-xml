package com.firebase.ui.auth.viewmodel.idp;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.firebase.ui.auth.viewmodel.idp.LinkingSocialProviderResponseHandler;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class LinkingSocialProviderResponseHandler extends SignInViewModelBase {
    private String mEmail;
    private AuthCredential mRequestedSignInCredential;

    private boolean isGenericIdpLinkingFlow(@NonNull String str) {
        return (!AuthUI.SUPPORTED_OAUTH_PROVIDERS.contains(str) || this.mRequestedSignInCredential == null || getAuth().xMQ() == null || getAuth().xMQ().ub()) ? false : true;
    }

    private boolean isInvalidProvider(@NonNull String str) {
        return TextUtils.equals(str, "password") || TextUtils.equals(str, "phone");
    }

    public boolean hasCredentialForLinking() {
        return this.mRequestedSignInCredential != null;
    }

    public void setRequestedSignInCredentialForEmail(@Nullable AuthCredential authCredential, @Nullable String str) {
        this.mRequestedSignInCredential = authCredential;
        this.mEmail = str;
    }

    public LinkingSocialProviderResponseHandler(Application application) {
        super(application);
    }

    public static /* synthetic */ AuthResult O(AuthResult authResult, Task task) {
        if (task.isSuccessful()) {
            return (AuthResult) task.getResult();
        }
        return authResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$0(IdpResponse idpResponse, AuthResult authResult) {
        handleSuccess(idpResponse, authResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$2(AuthCredential authCredential, AuthResult authResult) {
        handleMergeFailure(authCredential);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$3(Exception exc) {
        setResult(Resource.forFailure(exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$startSignIn$5(Task task) throws Exception {
        final AuthResult authResult = (AuthResult) task.getResult();
        if (this.mRequestedSignInCredential == null) {
            return Tasks.forResult(authResult);
        }
        return authResult.U().Qu(this.mRequestedSignInCredential).continueWith(new Continuation() { // from class: xzr.CN3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return LinkingSocialProviderResponseHandler.O(authResult, task2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$6(IdpResponse idpResponse, Task task) {
        if (task.isSuccessful()) {
            handleSuccess(idpResponse, (AuthResult) task.getResult());
        } else {
            setResult(Resource.forFailure(task.getException()));
        }
    }

    public void startSignIn(@NonNull final IdpResponse idpResponse) {
        if (!idpResponse.isSuccessful()) {
            setResult(Resource.forFailure(idpResponse.getError()));
            return;
        }
        if (!isInvalidProvider(idpResponse.getProviderType())) {
            String str = this.mEmail;
            if (str != null && !str.equals(idpResponse.getEmail())) {
                setResult(Resource.forFailure(new FirebaseUiException(6)));
                return;
            }
            setResult(Resource.forLoading());
            if (isGenericIdpLinkingFlow(idpResponse.getProviderType())) {
                getAuth().xMQ().Qu(this.mRequestedSignInCredential).addOnSuccessListener(new OnSuccessListener() { // from class: xzr.j
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        this.f75519n.lambda$startSignIn$0(idpResponse, (AuthResult) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: xzr.n
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        Resource.forFailure(exc);
                    }
                });
                return;
            }
            AuthOperationManager authOperationManager = AuthOperationManager.getInstance();
            final AuthCredential authCredential = ProviderUtils.getAuthCredential(idpResponse);
            if (authOperationManager.canUpgradeAnonymous(getAuth(), getArguments())) {
                AuthCredential authCredential2 = this.mRequestedSignInCredential;
                if (authCredential2 == null) {
                    handleMergeFailure(authCredential);
                    return;
                } else {
                    authOperationManager.safeLink(authCredential, authCredential2, getArguments()).addOnSuccessListener(new OnSuccessListener() { // from class: xzr.w6
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            this.f75522n.lambda$startSignIn$2(authCredential, (AuthResult) obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: xzr.Ml
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception exc) {
                            this.f75514n.lambda$startSignIn$3(exc);
                        }
                    });
                    return;
                }
            }
            getAuth().WPU(authCredential).continueWithTask(new Continuation() { // from class: xzr.I28
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return this.f75513n.lambda$startSignIn$5(task);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: xzr.Wre
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.f75515n.lambda$startSignIn$6(idpResponse, task);
                }
            });
            return;
        }
        throw new IllegalStateException("This handler cannot be used to link email or phone providers.");
    }
}
