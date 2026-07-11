package com.firebase.ui.auth.ui.phone;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.auth.PhoneAuthCredential;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public final class PhoneVerification {
    private final PhoneAuthCredential mCredential;
    private final boolean mIsAutoVerified;
    private final String mNumber;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PhoneVerification.class == obj.getClass()) {
            PhoneVerification phoneVerification = (PhoneVerification) obj;
            if (this.mIsAutoVerified == phoneVerification.mIsAutoVerified && this.mNumber.equals(phoneVerification.mNumber) && this.mCredential.equals(phoneVerification.mCredential)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public PhoneAuthCredential getCredential() {
        return this.mCredential;
    }

    @NonNull
    public String getNumber() {
        return this.mNumber;
    }

    public int hashCode() {
        return (((this.mNumber.hashCode() * 31) + this.mCredential.hashCode()) * 31) + (this.mIsAutoVerified ? 1 : 0);
    }

    public boolean isAutoVerified() {
        return this.mIsAutoVerified;
    }

    public String toString() {
        return "PhoneVerification{mNumber='" + this.mNumber + "', mCredential=" + this.mCredential + ", mIsAutoVerified=" + this.mIsAutoVerified + '}';
    }

    public PhoneVerification(@NonNull String str, @NonNull PhoneAuthCredential phoneAuthCredential, boolean z2) {
        this.mNumber = str;
        this.mCredential = phoneAuthCredential;
        this.mIsAutoVerified = z2;
    }
}
