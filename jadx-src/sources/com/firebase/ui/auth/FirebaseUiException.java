package com.firebase.ui.auth;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class FirebaseUiException extends Exception {
    private final int mErrorCode;

    @RestrictTo
    public FirebaseUiException(int i2) {
        this(i2, ErrorCodes.toFriendlyMessage(i2));
    }

    @RestrictTo
    public FirebaseUiException(int i2, @NonNull String str) {
        super(str);
        this.mErrorCode = i2;
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    @RestrictTo
    public FirebaseUiException(int i2, @NonNull Throwable th) {
        this(i2, ErrorCodes.toFriendlyMessage(i2), th);
    }

    @RestrictTo
    public FirebaseUiException(int i2, @NonNull String str, @NonNull Throwable th) {
        super(str, th);
        this.mErrorCode = i2;
    }
}
