package com.firebase.ui.auth.viewmodel;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public abstract class ProviderSignInBase<T> extends OperableViewModel<T, Resource<IdpResponse>> {
    public abstract void onActivityResult(int i2, int i3, @Nullable Intent intent);

    public abstract void startSignIn(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str);

    protected ProviderSignInBase(Application application) {
        super(application);
    }

    public ProviderSignInBase<T> initWith(T t3) {
        super.init(t3);
        return this;
    }
}
