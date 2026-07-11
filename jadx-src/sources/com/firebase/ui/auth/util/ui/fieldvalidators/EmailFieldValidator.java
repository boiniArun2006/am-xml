package com.firebase.ui.auth.util.ui.fieldvalidators;

import android.util.Patterns;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.R$string;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class EmailFieldValidator extends BaseValidator {
    @Override // com.firebase.ui.auth.util.ui.fieldvalidators.BaseValidator
    protected boolean isValid(CharSequence charSequence) {
        return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    public EmailFieldValidator(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.mErrorMessage = this.mErrorContainer.getResources().getString(R$string.fui_invalid_email_address);
        this.mEmptyMessage = this.mErrorContainer.getResources().getString(R$string.fui_missing_email_address);
    }
}
