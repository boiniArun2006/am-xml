package com.firebase.ui.auth.data.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.FirebaseUiException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class PhoneNumberVerificationRequiredException extends FirebaseUiException {
    private final String mPhoneNumber;

    public PhoneNumberVerificationRequiredException(@NonNull String str) {
        super(4, "Phone number requires verification.");
        this.mPhoneNumber = str;
    }

    @NonNull
    public String getPhoneNumber() {
        return this.mPhoneNumber;
    }
}
