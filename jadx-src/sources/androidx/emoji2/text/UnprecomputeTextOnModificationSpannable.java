package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class UnprecomputeTextOnModificationSpannable implements Spannable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38365n = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Spannable f38366t;

    static class PrecomputedTextDetector {
        boolean n(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }

        PrecomputedTextDetector() {
        }
    }

    UnprecomputeTextOnModificationSpannable(Spannable spannable) {
        this.f38366t = spannable;
    }

    @RequiresApi
    private static class CharSequenceHelper_API24 {
        static IntStream n(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream rl(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    @RequiresApi
    static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        PrecomputedTextDetector_28() {
        }

        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        boolean n(CharSequence charSequence) {
            if (!androidx.core.text.n.n(charSequence) && !(charSequence instanceof PrecomputedTextCompat)) {
                return false;
            }
            return true;
        }
    }

    private void n() {
        Spannable spannable = this.f38366t;
        if (!this.f38365n && t().n(spannable)) {
            this.f38366t = new SpannableString(spannable);
        }
        this.f38365n = true;
    }

    static PrecomputedTextDetector t() {
        return Build.VERSION.SDK_INT < 28 ? new PrecomputedTextDetector() : new PrecomputedTextDetector_28();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f38366t.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return CharSequenceHelper_API24.n(this.f38366t);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return CharSequenceHelper_API24.rl(this.f38366t);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f38366t.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f38366t.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f38366t.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i2, int i3, Class cls) {
        return this.f38366t.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f38366t.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f38366t.nextSpanTransition(i2, i3, cls);
    }

    Spannable rl() {
        return this.f38366t;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f38366t.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f38366t.toString();
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        n();
        this.f38366t.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i5) {
        n();
        this.f38366t.setSpan(obj, i2, i3, i5);
    }

    UnprecomputeTextOnModificationSpannable(CharSequence charSequence) {
        this.f38366t = new SpannableString(charSequence);
    }
}
