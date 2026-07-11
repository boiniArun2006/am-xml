package com.firebase.ui.auth.data.remote;

import android.app.Application;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public abstract class SingleProviderSignInHandler<T> extends ProviderSignInBase<T> {
    private final String mProviderId;

    protected SingleProviderSignInHandler(Application application, String str) {
        super(application);
        this.mProviderId = str;
    }
}
