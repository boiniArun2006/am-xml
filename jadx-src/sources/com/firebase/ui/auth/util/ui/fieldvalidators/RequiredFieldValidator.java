package com.firebase.ui.auth.util.ui.fieldvalidators;

import androidx.annotation.RestrictTo;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class RequiredFieldValidator extends BaseValidator {
    @Override // com.firebase.ui.auth.util.ui.fieldvalidators.BaseValidator
    protected boolean isValid(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }

    public RequiredFieldValidator(TextInputLayout textInputLayout, String str) {
        super(textInputLayout);
        this.mErrorMessage = str;
    }
}
