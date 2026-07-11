package com.firebase.ui.auth.util.ui.fieldvalidators;

import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.R$plurals;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class PasswordFieldValidator extends BaseValidator {
    private int mMinLength;

    public PasswordFieldValidator(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout);
        this.mMinLength = i2;
        Resources resources = this.mErrorContainer.getResources();
        int i3 = R$plurals.fui_error_weak_password;
        int i5 = this.mMinLength;
        this.mErrorMessage = resources.getQuantityString(i3, i5, Integer.valueOf(i5));
    }

    @Override // com.firebase.ui.auth.util.ui.fieldvalidators.BaseValidator
    protected boolean isValid(CharSequence charSequence) {
        if (charSequence.length() >= this.mMinLength) {
            return true;
        }
        return false;
    }
}
