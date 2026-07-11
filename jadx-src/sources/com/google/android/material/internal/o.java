package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class o {
    static final int ty = 1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f59052O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f59053n;
    private boolean qie;
    private final TextPaint rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f59054t;
    private int nr = 0;
    private Layout.Alignment J2 = Layout.Alignment.ALIGN_NORMAL;
    private int Uo = Integer.MAX_VALUE;
    private float KN = 0.0f;
    private float xMQ = 1.0f;
    private int mUb = ty;
    private boolean gh = true;
    private TextUtils.TruncateAt az = null;

    static class j extends Exception {
    }

    public o mUb(qz qzVar) {
        return this;
    }

    public static o rl(CharSequence charSequence, TextPaint textPaint, int i2) {
        return new o(charSequence, textPaint, i2);
    }

    public o J2(boolean z2) {
        this.gh = z2;
        return this;
    }

    public o KN(float f3, float f4) {
        this.KN = f3;
        this.xMQ = f4;
        return this;
    }

    public o O(int i2) {
        this.mUb = i2;
        return this;
    }

    public o Uo(boolean z2) {
        this.qie = z2;
        return this;
    }

    public StaticLayout n() {
        if (this.f59053n == null) {
            this.f59053n = "";
        }
        int iMax = Math.max(0, this.f59054t);
        CharSequence charSequenceEllipsize = this.f59053n;
        if (this.Uo == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.rl, iMax, this.az);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f59052O);
        this.f59052O = iMin;
        if (this.qie && this.Uo == 1) {
            this.J2 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.nr, iMin, this.rl, iMax);
        builderObtain.setAlignment(this.J2);
        builderObtain.setIncludePad(this.gh);
        builderObtain.setTextDirection(this.qie ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.az;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.Uo);
        float f3 = this.KN;
        if (f3 != 0.0f || this.xMQ != 1.0f) {
            builderObtain.setLineSpacing(f3, this.xMQ);
        }
        if (this.Uo > 1) {
            builderObtain.setHyphenationFrequency(this.mUb);
        }
        return builderObtain.build();
    }

    public o nr(TextUtils.TruncateAt truncateAt) {
        this.az = truncateAt;
        return this;
    }

    public o t(Layout.Alignment alignment) {
        this.J2 = alignment;
        return this;
    }

    public o xMQ(int i2) {
        this.Uo = i2;
        return this;
    }

    private o(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f59053n = charSequence;
        this.rl = textPaint;
        this.f59054t = i2;
        this.f59052O = charSequence.length();
    }
}
