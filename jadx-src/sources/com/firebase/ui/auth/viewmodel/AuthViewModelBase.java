package com.firebase.ui.auth.viewmodel;

import android.app.Application;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.util.GoogleApiUtils;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.firebase.Wre;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public abstract class AuthViewModelBase<T> extends OperableViewModel<FlowParameters, Resource<T>> {
    private FirebaseAuth mAuth;
    private SignInClient mSignInClient;

    protected FirebaseAuth getAuth() {
        return this.mAuth;
    }

    @Nullable
    public FirebaseUser getCurrentUser() {
        return this.mAuth.xMQ();
    }

    protected AuthViewModelBase(Application application) {
        super(application);
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase
    protected void onCreate() {
        this.mAuth = FirebaseAuth.getInstance(Wre.ty(((FlowParameters) getArguments()).appName));
        this.mSignInClient = GoogleApiUtils.getSignInClient(getApplication());
    }
}
