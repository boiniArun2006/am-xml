package com.firebase.ui.auth.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.credentials.CredentialManager;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public abstract class GoogleApiUtils {
    @NonNull
    public static CredentialManager getCredentialManager(@NonNull Context context) {
        return CredentialManager.create(context);
    }

    @NonNull
    public static SignInClient getSignInClient(@NonNull Context context) {
        return Identity.getSignInClient(context);
    }
}
