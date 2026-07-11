package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class n implements InputFilter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f59421n;

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i5, int i7) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i5, i7, charSequence.subSequence(i2, i3).toString());
            if (Integer.parseInt(sb.toString()) <= this.f59421n) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public n(int i2) {
        this.f59421n = i2;
    }
}
