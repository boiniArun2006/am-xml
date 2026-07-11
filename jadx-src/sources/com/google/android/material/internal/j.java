package com.google.android.material.internal;

import X4.j;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final boolean f59018G7 = false;
    private static final Paint fcU = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f59019B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f59021D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final TextPaint f59022E;
    private X4.j E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private TimeInterpolator f59023FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private float f59024GR;
    private ColorStateList HI;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private float f59025I;
    private float Ik;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float f59026J;
    private int J2;
    private final Rect KN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private TimeInterpolator f59027M;
    private int[] M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f59028N;
    private float Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f59029O;
    private int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f59030S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private CharSequence f59031T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f59032U;
    private final Rect Uo;
    private Typeface ViF;
    private Typeface WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private CharSequence f59033X;
    private float XQ;
    private float Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private ColorStateList f59034Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f59035Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ColorStateList f59036a;
    private Typeface aYN;
    private float bzg;
    private int ck;
    private float dR0;
    private final TextPaint eF;
    private float eTf;
    private X4.j fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Typeface f59038g;
    private Typeface iF;
    private float ijL;
    private float jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f59039k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f59040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f59041n;
    private Typeface nY;
    private float nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f59042o;
    private boolean p5;
    private StaticLayout piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f59043r;
    private float rV9;
    private float rl;
    private boolean s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f59044t;
    private Typeface te;
    private ColorStateList ty;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Paint f59045v;
    private Bitmap wTp;
    private final RectF xMQ;
    private CharSequence xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f59046z;
    private int mUb = 16;
    private int gh = 16;
    private float qie = 15.0f;
    private float az = 15.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextUtils.TruncateAt f59037e = TextUtils.TruncateAt.END;
    private boolean nHg = true;
    private int pJg = 1;
    private float ofS = 0.0f;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private float f59020C = 1.0f;
    private int Mx = o.ty;

    /* JADX INFO: renamed from: com.google.android.material.internal.j$j, reason: collision with other inner class name */
    class C0787j implements j.InterfaceC0423j {
        C0787j() {
        }

        @Override // X4.j.InterfaceC0423j
        public void n(Typeface typeface) {
            j.this.M7(typeface);
        }
    }

    private void KN(float f3) {
        xMQ(f3, false);
    }

    private int XQ(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M7;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private StaticLayout gh(int i2, float f3, boolean z2) {
        return (StaticLayout) Preconditions.Uo(o.rl(this.f59033X, this.eF, (int) f3).nr(this.f59037e).Uo(z2).t(i2 == 1 ? Layout.Alignment.ALIGN_NORMAL : ViF()).J2(false).xMQ(i2).KN(this.ofS, this.f59020C).O(this.Mx).mUb(null).n());
    }

    private static boolean iF(float f3, float f4) {
        return Math.abs(f3 - f4) < 1.0E-5f;
    }

    public void a(float f3) {
        float fN = MathUtils.n(f3, 0.0f, 1.0f);
        if (fN != this.rl) {
            this.rl = fN;
            t();
        }
    }

    public void nHg() {
        s7N(false);
    }

    private boolean D(Typeface typeface) {
        X4.j jVar = this.fD;
        if (jVar != null) {
            jVar.t();
        }
        if (this.te == typeface) {
            return false;
        }
        this.te = typeface;
        Typeface typefaceRl = X4.fuX.rl(this.f59041n.getContext().getResources().getConfiguration(), typeface);
        this.f59038g = typefaceRl;
        if (typefaceRl == null) {
            typefaceRl = this.te;
        }
        this.nY = typefaceRl;
        return true;
    }

    private void FX(float f3) {
        this.eTf = f3;
        ViewCompat.GR(this.f59041n);
    }

    private float O() {
        float f3 = this.nr;
        return f3 + ((1.0f - f3) * 0.5f);
    }

    private int S() {
        return XQ(this.ty);
    }

    private Layout.Alignment ViF() {
        int iRl = GravityCompat.rl(this.mUb, this.f59028N ? 1 : 0) & 7;
        return iRl != 1 ? iRl != 5 ? this.f59028N ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f59028N ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private static float X(float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return G7.j.n(f3, f4, f5);
    }

    private void az(Canvas canvas, float f3, float f4) {
        int alpha = this.eF.getAlpha();
        canvas.translate(f3, f4);
        if (!this.f59044t) {
            this.eF.setAlpha((int) (this.eTf * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.eF;
                textPaint.setShadowLayer(this.Xw, this.jB, this.f59032U, W3.j.n(this.P5, textPaint.getAlpha()));
            }
            this.piY.draw(canvas);
        }
        if (!this.f59044t) {
            this.eF.setAlpha((int) (this.f59040m * alpha));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            TextPaint textPaint2 = this.eF;
            textPaint2.setShadowLayer(this.Xw, this.jB, this.f59032U, W3.j.n(this.P5, textPaint2.getAlpha()));
        }
        int lineBaseline = this.piY.getLineBaseline(0);
        CharSequence charSequence = this.xg;
        float f5 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.eF);
        if (i2 >= 31) {
            this.eF.setShadowLayer(this.Xw, this.jB, this.f59032U, this.P5);
        }
        if (this.f59044t) {
            return;
        }
        String strTrim = this.xg.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.eF.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.piY.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.eF);
    }

    private boolean e(CharSequence charSequence, boolean z2) {
        return (z2 ? TextDirectionHeuristicsCompat.nr : TextDirectionHeuristicsCompat.f36644t).n(charSequence, 0, charSequence.length());
    }

    private boolean fD() {
        return ViewCompat.nY(this.f59041n) == 1;
    }

    private void g(TextPaint textPaint) {
        textPaint.setTextSize(this.qie);
        textPaint.setTypeface(this.nY);
        textPaint.setLetterSpacing(this.dR0);
    }

    private void jB(float f3) {
        this.f59040m = f3;
        ViewCompat.GR(this.f59041n);
    }

    private void mUb() {
        Bitmap bitmap = this.wTp;
        if (bitmap != null) {
            bitmap.recycle();
            this.wTp = null;
        }
    }

    private static int n(int i2, int i3, float f3) {
        float f4 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i2) * f4) + (Color.alpha(i3) * f3)), Math.round((Color.red(i2) * f4) + (Color.red(i3) * f3)), Math.round((Color.green(i2) * f4) + (Color.green(i3) * f3)), Math.round((Color.blue(i2) * f4) + (Color.blue(i3) * f3)));
    }

    private void nY(TextPaint textPaint) {
        textPaint.setTextSize(this.az);
        textPaint.setTypeface(this.WPU);
        textPaint.setLetterSpacing(this.f59039k);
    }

    private float nr(float f3) {
        float f4 = this.f59029O;
        return f3 <= f4 ? G7.j.rl(1.0f, 0.0f, this.nr, f4, f3) : G7.j.rl(0.0f, 1.0f, f4, 1.0f, f3);
    }

    private float o(RectF rectF, int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) + (this.ijL / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.f59028N ? rectF.left + this.ijL : this.KN.right : this.f59028N ? this.KN.right : rectF.left + this.ijL;
    }

    private boolean p5(Typeface typeface) {
        X4.j jVar = this.E2;
        if (jVar != null) {
            jVar.t();
        }
        if (this.ViF == typeface) {
            return false;
        }
        this.ViF = typeface;
        Typeface typefaceRl = X4.fuX.rl(this.f59041n.getContext().getResources().getConfiguration(), typeface);
        this.aYN = typefaceRl;
        if (typefaceRl == null) {
            typefaceRl = this.ViF;
        }
        this.WPU = typefaceRl;
        return true;
    }

    private float r(int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) - (this.ijL / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.f59028N ? this.KN.left : this.KN.right - this.ijL : this.f59028N ? this.KN.right - this.ijL : this.KN.left;
    }

    private void rl(boolean z2) {
        StaticLayout staticLayout;
        xMQ(1.0f, z2);
        CharSequence charSequence = this.f59031T;
        if (charSequence != null && (staticLayout = this.piY) != null) {
            this.xg = TextUtils.ellipsize(charSequence, this.eF, staticLayout.getWidth(), this.f59037e);
        }
        CharSequence charSequence2 = this.xg;
        float fN = 0.0f;
        if (charSequence2 != null) {
            this.ijL = N(this.eF, charSequence2);
        } else {
            this.ijL = 0.0f;
        }
        int iRl = GravityCompat.rl(this.gh, this.f59028N ? 1 : 0);
        int i2 = iRl & 112;
        if (i2 == 48) {
            this.f59043r = this.KN.top;
        } else if (i2 != 80) {
            this.f59043r = this.KN.centerY() - ((this.eF.descent() - this.eF.ascent()) / 2.0f);
        } else {
            this.f59043r = this.KN.bottom + this.eF.ascent();
        }
        int i3 = iRl & 8388615;
        if (i3 == 1) {
            this.f59035Z = this.KN.centerX() - (this.ijL / 2.0f);
        } else if (i3 != 5) {
            this.f59035Z = this.KN.left;
        } else {
            this.f59035Z = this.KN.right - this.ijL;
        }
        xMQ(0.0f, z2);
        float height = this.piY != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.piY;
        if (staticLayout2 == null || this.pJg <= 1) {
            CharSequence charSequence3 = this.f59031T;
            if (charSequence3 != null) {
                fN = N(this.eF, charSequence3);
            }
        } else {
            fN = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.piY;
        this.ck = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iRl2 = GravityCompat.rl(this.mUb, this.f59028N ? 1 : 0);
        int i5 = iRl2 & 112;
        if (i5 == 48) {
            this.Ik = this.Uo.top;
        } else if (i5 != 80) {
            this.Ik = this.Uo.centerY() - (height / 2.0f);
        } else {
            this.Ik = (this.Uo.bottom - height) + this.eF.descent();
        }
        int i7 = iRl2 & 8388615;
        if (i7 == 1) {
            this.f59042o = this.Uo.centerX() - (fN / 2.0f);
        } else if (i7 != 5) {
            this.f59042o = this.Uo.left;
        } else {
            this.f59042o = this.Uo.right - fN;
        }
        mUb();
        I(this.rl);
    }

    private void t() {
        Uo(this.rl);
    }

    private void te(float f3) {
        if (this.f59044t) {
            this.xMQ.set(f3 < this.f59029O ? this.Uo : this.KN);
            return;
        }
        this.xMQ.left = X(this.Uo.left, this.KN.left, f3, this.f59027M);
        this.xMQ.top = X(this.Ik, this.f59043r, f3, this.f59027M);
        this.xMQ.right = X(this.Uo.right, this.KN.right, f3, this.f59027M);
        this.xMQ.bottom = X(this.Uo.bottom, this.KN.bottom, f3, this.f59027M);
    }

    private void ty() {
        if (this.wTp != null || this.Uo.isEmpty() || TextUtils.isEmpty(this.f59031T)) {
            return;
        }
        Uo(0.0f);
        int width = this.piY.getWidth();
        int height = this.piY.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.wTp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.piY.draw(new Canvas(this.wTp));
        if (this.f59045v == null) {
            this.f59045v = new Paint(3);
        }
    }

    private static boolean wTp(Rect rect, int i2, int i3, int i5, int i7) {
        return rect.left == i2 && rect.top == i3 && rect.right == i5 && rect.bottom == i7;
    }

    private void xMQ(float f3, boolean z2) {
        float f4;
        float f5;
        Typeface typeface;
        if (this.f59033X == null) {
            return;
        }
        float fWidth = this.KN.width();
        float fWidth2 = this.Uo.width();
        if (iF(f3, 1.0f)) {
            f4 = this.az;
            f5 = this.f59039k;
            this.rV9 = 1.0f;
            typeface = this.WPU;
        } else {
            float f6 = this.qie;
            float f7 = this.dR0;
            Typeface typeface2 = this.nY;
            if (iF(f3, 0.0f)) {
                this.rV9 = 1.0f;
            } else {
                this.rV9 = X(this.qie, this.az, f3, this.f59023FX) / this.qie;
            }
            float f8 = this.az / this.qie;
            fWidth = (z2 || this.f59044t || fWidth2 * f8 <= fWidth) ? fWidth2 : Math.min(fWidth / f8, fWidth2);
            f4 = f6;
            f5 = f7;
            typeface = typeface2;
        }
        if (fWidth > 0.0f) {
            boolean z3 = this.bzg != f4;
            boolean z4 = this.f59046z != f5;
            boolean z5 = this.iF != typeface;
            StaticLayout staticLayout = this.piY;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.p5;
            this.bzg = f4;
            this.f59046z = f5;
            this.iF = typeface;
            this.p5 = false;
            this.eF.setLinearText(this.rV9 != 1.0f);
            z = z6;
        }
        if (this.f59031T == null || z) {
            this.eF.setTextSize(this.bzg);
            this.eF.setTypeface(this.iF);
            this.eF.setLetterSpacing(this.f59046z);
            this.f59028N = J2(this.f59033X);
            StaticLayout staticLayoutGh = gh(z() ? this.pJg : 1, fWidth, this.f59028N);
            this.piY = staticLayoutGh;
            this.f59031T = staticLayoutGh.getText();
        }
    }

    private boolean z() {
        if (this.pJg > 1) {
            return (!this.f59028N || this.f59044t) && !this.s7N;
        }
        return false;
    }

    public void B(int i2) {
        if (this.mUb != i2) {
            this.mUb = i2;
            nHg();
        }
    }

    public void E(Rect rect) {
        eF(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final boolean E2() {
        ColorStateList colorStateList = this.HI;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.ty;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void GR(TimeInterpolator timeInterpolator) {
        this.f59027M = timeInterpolator;
        nHg();
    }

    public void HI(RectF rectF, int i2, int i3) {
        this.f59028N = J2(this.f59033X);
        rectF.left = Math.max(r(i2, i3), this.KN.left);
        rectF.top = this.KN.top;
        rectF.right = Math.min(o(rectF, i2, i3), this.KN.right);
        rectF.bottom = this.KN.top + Ik();
    }

    public float Ik() {
        nY(this.f59022E);
        return -this.f59022E.ascent();
    }

    public void J(float f3) {
        if (this.qie != f3) {
            this.qie = f3;
            nHg();
        }
    }

    public void M(float f3) {
        if (this.dR0 != f3) {
            this.dR0 = f3;
            nHg();
        }
    }

    public final boolean Nxk(int[] iArr) {
        this.M7 = iArr;
        if (!E2()) {
            return false;
        }
        nHg();
        return true;
    }

    public void P5(int i2) {
        if (this.gh != i2) {
            this.gh = i2;
            nHg();
        }
    }

    public void T(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.ViF;
            if (typeface != null) {
                this.aYN = X4.fuX.rl(configuration, typeface);
            }
            Typeface typeface2 = this.te;
            if (typeface2 != null) {
                this.f59038g = X4.fuX.rl(configuration, typeface2);
            }
            Typeface typeface3 = this.aYN;
            if (typeface3 == null) {
                typeface3 = this.ViF;
            }
            this.WPU = typeface3;
            Typeface typeface4 = this.f59038g;
            if (typeface4 == null) {
                typeface4 = this.te;
            }
            this.nY = typeface4;
            s7N(true);
        }
    }

    public void U(ColorStateList colorStateList) {
        if (this.HI != colorStateList) {
            this.HI = colorStateList;
            nHg();
        }
    }

    public float WPU() {
        g(this.f59022E);
        return -this.f59022E.ascent();
    }

    public void Xw(int i2) {
        X4.Ml ml = new X4.Ml(this.f59041n.getContext(), i2);
        if (ml.xMQ() != null) {
            this.HI = ml.xMQ();
        }
        if (ml.mUb() != 0.0f) {
            this.az = ml.mUb();
        }
        ColorStateList colorStateList = ml.f11744t;
        if (colorStateList != null) {
            this.f59036a = colorStateList;
        }
        this.f59026J = ml.KN;
        this.f59021D = ml.xMQ;
        this.f59019B = ml.mUb;
        this.f59039k = ml.qie;
        X4.j jVar = this.E2;
        if (jVar != null) {
            jVar.t();
        }
        this.E2 = new X4.j(new C0787j(), ml.O());
        ml.Uo(this.f59041n.getContext(), this.E2);
        nHg();
    }

    public void Y(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f59033X, charSequence)) {
            this.f59033X = charSequence;
            this.f59031T = null;
            mUb();
            nHg();
        }
    }

    public int Z() {
        return XQ(this.HI);
    }

    public float aYN() {
        return this.rl;
    }

    public void bzg(Rect rect) {
        rV9(rect.left, rect.top, rect.right, rect.bottom);
    }

    public ColorStateList ck() {
        return this.HI;
    }

    public void eF(int i2, int i3, int i5, int i7) {
        if (wTp(this.Uo, i2, i3, i5, i7)) {
            return;
        }
        this.Uo.set(i2, i3, i5, i7);
        this.p5 = true;
    }

    public void k(TimeInterpolator timeInterpolator) {
        this.f59023FX = timeInterpolator;
        nHg();
    }

    public void rV9(int i2, int i3, int i5, int i7) {
        if (wTp(this.KN, i2, i3, i5, i7)) {
            return;
        }
        this.KN.set(i2, i3, i5, i7);
        this.p5 = true;
    }

    public void s7N(boolean z2) {
        if ((this.f59041n.getHeight() <= 0 || this.f59041n.getWidth() <= 0) && !z2) {
            return;
        }
        rl(z2);
        t();
    }

    public void v(ColorStateList colorStateList) {
        if (this.HI == colorStateList && this.ty == colorStateList) {
            return;
        }
        this.HI = colorStateList;
        this.ty = colorStateList;
        nHg();
    }

    public j(View view) {
        this.f59041n = view;
        TextPaint textPaint = new TextPaint(129);
        this.eF = textPaint;
        this.f59022E = new TextPaint(textPaint);
        this.KN = new Rect();
        this.Uo = new Rect();
        this.xMQ = new RectF();
        this.f59029O = O();
        T(view.getContext().getResources().getConfiguration());
    }

    private void I(float f3) {
        boolean z2;
        KN(f3);
        if (f59018G7 && this.rV9 != 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.s7N = z2;
        if (z2) {
            ty();
        }
        ViewCompat.GR(this.f59041n);
    }

    private boolean J2(CharSequence charSequence) {
        boolean zFD = fD();
        if (this.nHg) {
            return e(charSequence, zFD);
        }
        return zFD;
    }

    private float N(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void Uo(float f3) {
        float f4;
        te(f3);
        if (this.f59044t) {
            if (f3 < this.f59029O) {
                this.XQ = this.f59042o;
                this.f59030S = this.Ik;
                I(0.0f);
                f4 = 0.0f;
            } else {
                this.XQ = this.f59035Z;
                this.f59030S = this.f59043r - Math.max(0, this.J2);
                I(1.0f);
                f4 = 1.0f;
            }
        } else {
            this.XQ = X(this.f59042o, this.f59035Z, f3, this.f59027M);
            this.f59030S = X(this.Ik, this.f59043r, f3, this.f59027M);
            I(f3);
            f4 = f3;
        }
        TimeInterpolator timeInterpolator = G7.j.rl;
        jB(1.0f - X(0.0f, 1.0f, 1.0f - f3, timeInterpolator));
        FX(X(1.0f, 0.0f, f3, timeInterpolator));
        if (this.HI != this.ty) {
            this.eF.setColor(n(S(), Z(), f4));
        } else {
            this.eF.setColor(Z());
        }
        int i2 = Build.VERSION.SDK_INT;
        float f5 = this.f59039k;
        float f6 = this.dR0;
        if (f5 != f6) {
            this.eF.setLetterSpacing(X(f6, f5, f3, timeInterpolator));
        } else {
            this.eF.setLetterSpacing(f5);
        }
        this.Xw = X(this.f59025I, this.f59019B, f3, null);
        this.jB = X(this.f59024GR, this.f59026J, f3, null);
        this.f59032U = X(this.Nxk, this.f59021D, f3, null);
        int iN = n(XQ(this.f59034Y), XQ(this.f59036a), f3);
        this.P5 = iN;
        this.eF.setShadowLayer(this.Xw, this.jB, this.f59032U, iN);
        if (this.f59044t) {
            this.eF.setAlpha((int) (nr(f3) * this.eF.getAlpha()));
            if (i2 >= 31) {
                TextPaint textPaint = this.eF;
                textPaint.setShadowLayer(this.Xw, this.jB, this.f59032U, W3.j.n(this.P5, textPaint.getAlpha()));
            }
        }
        ViewCompat.GR(this.f59041n);
    }

    public void M7(Typeface typeface) {
        if (p5(typeface)) {
            nHg();
        }
    }

    public void dR0(Typeface typeface) {
        boolean zP5 = p5(typeface);
        boolean zD2 = D(typeface);
        if (!zP5 && !zD2) {
            return;
        }
        nHg();
    }

    public void qie(Canvas canvas) {
        boolean z2;
        int iSave = canvas.save();
        if (this.f59031T != null && this.xMQ.width() > 0.0f && this.xMQ.height() > 0.0f) {
            this.eF.setTextSize(this.bzg);
            float f3 = this.XQ;
            float f4 = this.f59030S;
            if (this.s7N && this.wTp != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            float f5 = this.rV9;
            if (f5 != 1.0f && !this.f59044t) {
                canvas.scale(f5, f5, f3, f4);
            }
            if (z2) {
                canvas.drawBitmap(this.wTp, f3, f4, this.f59045v);
                canvas.restoreToCount(iSave);
                return;
            }
            if (z() && (!this.f59044t || this.rl > this.f59029O)) {
                az(canvas, this.XQ - this.piY.getLineStart(0), f4);
            } else {
                canvas.translate(f3, f4);
                this.piY.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }
}
