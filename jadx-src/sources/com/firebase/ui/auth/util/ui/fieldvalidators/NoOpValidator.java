package com.firebase.ui.auth.util.ui.fieldvalidators;

import androidx.annotation.RestrictTo;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class NoOpValidator extends BaseValidator {
    @Override // com.firebase.ui.auth.util.ui.fieldvalidators.BaseValidator
    protected boolean isValid(CharSequence charSequence) {
        return true;
    }

    public NoOpValidator(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }
}
