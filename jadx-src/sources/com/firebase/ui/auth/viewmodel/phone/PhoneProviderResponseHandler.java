package com.firebase.ui.auth.viewmodel.phone;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.util.data.AuthOperationManager;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.PhoneAuthCredential;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class PhoneProviderResponseHandler extends SignInViewModelBase {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$1(Exception exc) {
        if (exc instanceof FirebaseAuthUserCollisionException) {
            handleMergeFailure(((FirebaseAuthUserCollisionException) exc).t());
        } else {
            setResult(Resource.forFailure(exc));
        }
    }

    public PhoneProviderResponseHandler(Application application) {
        super(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSignIn$0(IdpResponse idpResponse, AuthResult authResult) {
        handleSuccess(idpResponse, authResult);
    }

    public void startSignIn(@NonNull PhoneAuthCredential phoneAuthCredential, @NonNull final IdpResponse idpResponse) {
        if (!idpResponse.isSuccessful()) {
            setResult(Resource.forFailure(idpResponse.getError()));
        } else {
            if (idpResponse.getProviderType().equals("phone")) {
                setResult(Resource.forLoading());
                AuthOperationManager.getInstance().signInAndLinkWithCredential(getAuth(), getArguments(), phoneAuthCredential).addOnSuccessListener(new OnSuccessListener() { // from class: beB.j
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        this.f43372n.lambda$startSignIn$0(idpResponse, (AuthResult) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: beB.n
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        this.f43373n.lambda$startSignIn$1(exc);
                    }
                });
                return;
            }
            throw new IllegalStateException("This handler cannot be used without a phone response.");
        }
    }
}
