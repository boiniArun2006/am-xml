package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class TtmlStyle {
    private Layout.Alignment HI;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f58344O;
    private Layout.Alignment ck;
    private float gh;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f58345n;
    private int nr;
    private String qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextEmphasis f58347r;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f58348t;
    private int J2 = -1;
    private int Uo = -1;
    private int KN = -1;
    private int xMQ = -1;
    private int mUb = -1;
    private int az = -1;
    private int ty = -1;
    private int Ik = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f58346o = Float.MAX_VALUE;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public TtmlStyle n(TtmlStyle ttmlStyle) {
        return r(ttmlStyle, true);
    }

    private TtmlStyle r(TtmlStyle ttmlStyle, boolean z2) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.f58348t && ttmlStyle.f58348t) {
                WPU(ttmlStyle.rl);
            }
            if (this.KN == -1) {
                this.KN = ttmlStyle.KN;
            }
            if (this.xMQ == -1) {
                this.xMQ = ttmlStyle.xMQ;
            }
            if (this.f58345n == null && (str = ttmlStyle.f58345n) != null) {
                this.f58345n = str;
            }
            if (this.J2 == -1) {
                this.J2 = ttmlStyle.J2;
            }
            if (this.Uo == -1) {
                this.Uo = ttmlStyle.Uo;
            }
            if (this.ty == -1) {
                this.ty = ttmlStyle.ty;
            }
            if (this.HI == null && (alignment2 = ttmlStyle.HI) != null) {
                this.HI = alignment2;
            }
            if (this.ck == null && (alignment = ttmlStyle.ck) != null) {
                this.ck = alignment;
            }
            if (this.Ik == -1) {
                this.Ik = ttmlStyle.Ik;
            }
            if (this.mUb == -1) {
                this.mUb = ttmlStyle.mUb;
                this.gh = ttmlStyle.gh;
            }
            if (this.f58347r == null) {
                this.f58347r = ttmlStyle.f58347r;
            }
            if (this.f58346o == Float.MAX_VALUE) {
                this.f58346o = ttmlStyle.f58346o;
            }
            if (z2 && !this.f58344O && ttmlStyle.f58344O) {
                XQ(ttmlStyle.nr);
            }
            if (z2 && this.az == -1 && (i2 = ttmlStyle.az) != -1) {
                this.az = i2;
            }
        }
        return this;
    }

    public TtmlStyle E2(int i2) {
        this.ty = i2;
        return this;
    }

    public TextEmphasis HI() {
        return this.f58347r;
    }

    public boolean Ik() {
        return this.f58348t;
    }

    public int J2() {
        return this.mUb;
    }

    public Layout.Alignment KN() {
        return this.ck;
    }

    public TtmlStyle N(boolean z2) {
        this.Ik = z2 ? 1 : 0;
        return this;
    }

    public float O() {
        return this.gh;
    }

    public TtmlStyle S(boolean z2) {
        this.KN = z2 ? 1 : 0;
        return this;
    }

    public TtmlStyle T(Layout.Alignment alignment) {
        this.HI = alignment;
        return this;
    }

    public String Uo() {
        return this.qie;
    }

    public TtmlStyle ViF(float f3) {
        this.gh = f3;
        return this;
    }

    public TtmlStyle WPU(int i2) {
        this.rl = i2;
        this.f58348t = true;
        return this;
    }

    public TtmlStyle X(float f3) {
        this.f58346o = f3;
        return this;
    }

    public TtmlStyle XQ(int i2) {
        this.nr = i2;
        this.f58344O = true;
        return this;
    }

    public boolean Z() {
        return this.Uo == 1;
    }

    public TtmlStyle aYN(String str) {
        this.f58345n = str;
        return this;
    }

    public Layout.Alignment az() {
        return this.HI;
    }

    public boolean ck() {
        return this.f58344O;
    }

    public TtmlStyle e(int i2) {
        this.az = i2;
        return this;
    }

    public TtmlStyle fD(Layout.Alignment alignment) {
        this.ck = alignment;
        return this;
    }

    public TtmlStyle g(String str) {
        this.qie = str;
        return this;
    }

    public float gh() {
        return this.f58346o;
    }

    public TtmlStyle iF(boolean z2) {
        this.J2 = z2 ? 1 : 0;
        return this;
    }

    public int mUb() {
        return this.az;
    }

    public TtmlStyle nHg(TextEmphasis textEmphasis) {
        this.f58347r = textEmphasis;
        return this;
    }

    public TtmlStyle nY(int i2) {
        this.mUb = i2;
        return this;
    }

    public String nr() {
        return this.f58345n;
    }

    public boolean o() {
        return this.J2 == 1;
    }

    public int qie() {
        int i2 = this.KN;
        if (i2 == -1 && this.xMQ == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.xMQ == 1 ? 2 : 0);
    }

    public int rl() {
        if (this.f58344O) {
            return this.nr;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public TtmlStyle s7N(boolean z2) {
        this.Uo = z2 ? 1 : 0;
        return this;
    }

    public int t() {
        if (this.f58348t) {
            return this.rl;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public TtmlStyle te(boolean z2) {
        this.xMQ = z2 ? 1 : 0;
        return this;
    }

    public boolean ty() {
        return this.Ik == 1;
    }

    public int xMQ() {
        return this.ty;
    }
}
