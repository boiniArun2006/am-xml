package com.firebase.ui.auth;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.auth.AuthCredential;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class FirebaseUiUserCollisionException extends Exception {
    private final AuthCredential mCredential;
    private final String mEmail;
    private final int mErrorCode;
    private final String mProviderId;

    @NonNull
    public AuthCredential getCredential() {
        return this.mCredential;
    }

    @NonNull
    public String getEmail() {
        return this.mEmail;
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    @NonNull
    public String getProviderId() {
        return this.mProviderId;
    }

    @RestrictTo
    public FirebaseUiUserCollisionException(int i2, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull AuthCredential authCredential) {
        super(str);
        this.mErrorCode = i2;
        this.mProviderId = str2;
        this.mEmail = str3;
        this.mCredential = authCredential;
    }
}
