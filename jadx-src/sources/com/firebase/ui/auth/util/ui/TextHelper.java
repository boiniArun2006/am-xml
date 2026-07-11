package com.firebase.ui.auth.util.ui;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public abstract class TextHelper {
    public static void boldAllOccurencesOfText(@NonNull SpannableStringBuilder spannableStringBuilder, @NonNull String str, @NonNull String str2) {
        int i2 = 0;
        while (i2 < str.length()) {
            int iIndexOf = str.indexOf(str2, i2);
            int length = str2.length() + iIndexOf;
            if (iIndexOf == -1 || length > str.length()) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, length, 17);
            i2 = length + 1;
        }
    }
}
