package com.firebase.ui.auth.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public abstract class SignInViewModelBase extends AuthViewModelBase<IdpResponse> {
    protected void handleMergeFailure(@NonNull AuthCredential authCredential) {
        handleMergeFailure(new IdpResponse.Builder().setPendingCredential(authCredential).build());
    }

    protected SignInViewModelBase(Application application) {
        super(application);
    }

    public void handleSuccess(@NonNull IdpResponse idpResponse, @NonNull AuthResult authResult) {
        setResult(Resource.forSuccess(idpResponse.withResult(authResult)));
    }

    public void setResult(Resource<IdpResponse> resource) {
        super.setResult(resource);
    }

    protected void handleMergeFailure(@NonNull IdpResponse idpResponse) {
        setResult(Resource.forFailure(new FirebaseAuthAnonymousUpgradeException(5, idpResponse)));
    }
}
