package com.firebase.ui.auth.util.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public final class BucketedTextChangeListener implements TextWatcher {
    private final ContentChangeCallback mCallback;
    private final EditText mEditText;
    private final int mExpectedContentLength;
    private final String mPlaceHolder;
    private final String[] mPostFixes;

    @RestrictTo
    public interface ContentChangeCallback {
        void whenComplete();

        void whileIncomplete();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
    }

    private static String[] generatePostfixArray(CharSequence charSequence, int i2) {
        String[] strArr = new String[i2 + 1];
        for (int i3 = 0; i3 <= i2; i3++) {
            strArr[i3] = TextUtils.join("", Collections.nCopies(i3, charSequence));
        }
        return strArr;
    }

    public BucketedTextChangeListener(EditText editText, int i2, String str, ContentChangeCallback contentChangeCallback) {
        this.mEditText = editText;
        this.mExpectedContentLength = i2;
        this.mPostFixes = generatePostfixArray(str, i2);
        this.mCallback = contentChangeCallback;
        this.mPlaceHolder = str;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        ContentChangeCallback contentChangeCallback;
        String strReplaceAll = charSequence.toString().replaceAll(" ", "").replaceAll(this.mPlaceHolder, "");
        int iMin = Math.min(strReplaceAll.length(), this.mExpectedContentLength);
        String strSubstring = strReplaceAll.substring(0, iMin);
        this.mEditText.removeTextChangedListener(this);
        this.mEditText.setText(strSubstring + this.mPostFixes[this.mExpectedContentLength - iMin]);
        this.mEditText.setSelection(iMin);
        this.mEditText.addTextChangedListener(this);
        if (iMin == this.mExpectedContentLength && (contentChangeCallback = this.mCallback) != null) {
            contentChangeCallback.whenComplete();
            return;
        }
        ContentChangeCallback contentChangeCallback2 = this.mCallback;
        if (contentChangeCallback2 != null) {
            contentChangeCallback2.whileIncomplete();
        }
    }
}
