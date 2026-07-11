package com.firebase.ui.auth;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class FirebaseAuthAnonymousUpgradeException extends Exception {
    private IdpResponse mResponse;

    public IdpResponse getResponse() {
        return this.mResponse;
    }

    @RestrictTo
    public FirebaseAuthAnonymousUpgradeException(int i2, @NonNull IdpResponse idpResponse) {
        super(ErrorCodes.toFriendlyMessage(i2));
        this.mResponse = idpResponse;
    }
}
