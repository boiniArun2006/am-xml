package com.firebase.ui.auth.ui.email;

import android.app.Application;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Nullable;
import com.firebase.ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.firebase.ui.auth.viewmodel.AuthViewModelBase;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class CheckEmailHandler extends AuthViewModelBase<User> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchCredential$1(Exception exc) {
        Log.e("CheckEmailHandler", "beginSignIn failed", exc);
        setResult(Resource.forFailure(exc));
    }

    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (i2 == 101 && i3 == -1) {
            setResult(Resource.forLoading());
            try {
                final SignInCredential signInCredentialFromIntent = Identity.getSignInClient(getApplication()).getSignInCredentialFromIntent(intent);
                final String id = signInCredentialFromIntent.getId();
                ProviderUtils.fetchTopProvider(getAuth(), getArguments(), id).addOnCompleteListener(new OnCompleteListener() { // from class: Rd.n
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        this.f8719n.lambda$onActivityResult$3(id, signInCredentialFromIntent, task);
                    }
                });
            } catch (ApiException e2) {
                Log.e("CheckEmailHandler", "getSignInCredentialFromIntent failed", e2);
                setResult(Resource.forFailure(e2));
            }
        }
    }

    public CheckEmailHandler(Application application) {
        super(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchCredential$0(BeginSignInResult beginSignInResult) {
        setResult(Resource.forFailure(new PendingIntentRequiredException(beginSignInResult.getPendingIntent(), 101)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityResult$3(String str, SignInCredential signInCredential, Task task) {
        if (task.isSuccessful()) {
            setResult(Resource.forSuccess(new User.Builder((String) task.getResult(), str).setName(signInCredential.getDisplayName()).setPhotoUri(signInCredential.getProfilePictureUri()).build()));
        } else {
            setResult(Resource.forFailure(task.getException()));
        }
    }

    public void fetchCredential() {
        Identity.getSignInClient(getApplication()).beginSignIn(BeginSignInRequest.builder().setPasswordRequestOptions(BeginSignInRequest.PasswordRequestOptions.builder().setSupported(true).build()).build()).addOnSuccessListener(new OnSuccessListener() { // from class: Rd.w6
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f8721n.lambda$fetchCredential$0((BeginSignInResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: Rd.Ml
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f8717n.lambda$fetchCredential$1(exc);
            }
        });
    }
}
