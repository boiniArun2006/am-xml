package com.firebase.ui.auth.util.ui.fieldvalidators;

import androidx.annotation.RestrictTo;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public abstract class BaseValidator {
    protected String mEmptyMessage;
    protected TextInputLayout mErrorContainer;
    protected String mErrorMessage = "";

    protected abstract boolean isValid(CharSequence charSequence);

    public boolean validate(CharSequence charSequence) {
        if (this.mEmptyMessage != null && (charSequence == null || charSequence.length() == 0)) {
            this.mErrorContainer.setError(this.mEmptyMessage);
            return false;
        }
        if (isValid(charSequence)) {
            this.mErrorContainer.setError("");
            return true;
        }
        this.mErrorContainer.setError(this.mErrorMessage);
        return false;
    }

    public BaseValidator(TextInputLayout textInputLayout) {
        this.mErrorContainer = textInputLayout;
    }
}
