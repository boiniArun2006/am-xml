package com.google.android.material.chip;

import G7.Ml;
import Rxk.o;
import X4.w6;
import ZOk.n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.text.BidiFormatter;
import com.google.android.material.internal.Pl;
import com.google.android.material.internal.eO;
import com.google.android.material.internal.l3D;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import mfo.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class j extends CN3 implements TintAwareDrawable, Drawable.Callback, Pl.n {
    private static final int[] JVN = {R.attr.state_enabled};
    private static final ShapeDrawable xVH = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ColorStateList f58834B;
    private ColorStateList Bu;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private CharSequence f58835C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f58836D;
    private final Pl ER;
    private final Context EWS;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f58837F;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private boolean f58838G7;
    private float GD;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private float f58839GR;
    private TextUtils.TruncateAt HBN;
    private float HV;
    private final PointF How;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ColorStateList f58840I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private ColorStateList f58841J;
    private float Jk;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final RectF f58842K;
    private boolean Mx;
    private ColorStateList Nxk;
    private float Org;
    private float Po6;
    private boolean QZ6;
    private WeakReference Qu;
    private int RQ;
    private float Rl;
    private PorterDuffColorFilter T3L;
    private boolean UF;
    private int[] Uf;
    private final Paint UhV;
    private int VwL;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f58843W;
    private int X4T;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private CharSequence f58844Y;
    private boolean Zmq;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f58845a;
    private int a63;
    private Drawable dR0;
    private Drawable eTf;
    private ColorStateList eWT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f58846f;
    private Drawable fcU;
    private final Paint hRu;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint.FontMetrics f58847i;
    private boolean ijL;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f58848k;
    private int kSg;
    private int lLA;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f58849m;
    private ColorFilter mI;
    private float mYa;
    private Ml n1;
    private float ofS;
    private PorterDuff.Mode p0N;
    private ColorStateList pJg;
    private float piY;
    private float qm;
    private int tFV;
    private final Path tUK;
    private ColorStateList ub;
    private Ml ul;
    private Drawable xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f58850z;

    /* JADX INFO: renamed from: com.google.android.material.chip.j$j, reason: collision with other inner class name */
    public interface InterfaceC0784j {
        void n();
    }

    private static boolean Zmq(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public void QgZ(ColorStateList colorStateList) {
        this.ijL = true;
        if (this.f58850z != colorStateList) {
            this.f58850z = colorStateList;
            if (gxH()) {
                DrawableCompat.HI(this.dR0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    Paint.Align xg(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f58844Y != null) {
            float fK = this.Jk + k() + this.mYa;
            if (DrawableCompat.J2(this) == 0) {
                pointF.x = rect.left + fK;
            } else {
                pointF.x = rect.right - fK;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - eTf();
        }
        return align;
    }

    private void Jk(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.UhV;
        if (paint != null) {
            paint.setColor(ColorUtils.ck(-16777216, 127));
            canvas.drawRect(rect, this.UhV);
            if (gxH() || yA()) {
                Y(rect, this.f58842K);
                canvas.drawRect(this.f58842K, this.UhV);
            }
            if (this.f58844Y != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.UhV);
            } else {
                canvas2 = canvas;
            }
            if (YiW()) {
                z(rect, this.f58842K);
                canvas2.drawRect(this.f58842K, this.UhV);
            }
            this.UhV.setColor(ColorUtils.ck(-65536, 127));
            dR0(rect, this.f58842K);
            canvas2.drawRect(this.f58842K, this.UhV);
            this.UhV.setColor(ColorUtils.ck(-16711936, 127));
            piY(rect, this.f58842K);
            canvas2.drawRect(this.f58842K, this.UhV);
        }
    }

    private void Mx(Canvas canvas, Rect rect) {
        if (this.Zmq) {
            return;
        }
        this.hRu.setColor(this.kSg);
        this.hRu.setStyle(Paint.Style.FILL);
        this.hRu.setColorFilter(UF());
        this.f58842K.set(rect);
        canvas.drawRoundRect(this.f58842K, HV(), HV(), this.hRu);
    }

    private void Nxk(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.az(drawable, DrawableCompat.J2(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.eTf) {
            if (drawable.isStateful()) {
                drawable.setState(RQ());
            }
            DrawableCompat.HI(drawable, this.pJg);
            return;
        }
        Drawable drawable2 = this.dR0;
        if (drawable == drawable2 && this.ijL) {
            DrawableCompat.HI(drawable2, this.f58850z);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private float QZ6() {
        Drawable drawable = this.QZ6 ? this.fcU : this.dR0;
        float fCeil = this.piY;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(l3D.t(this.EWS, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private void Rl(Canvas canvas, Rect rect) {
        if (this.f58844Y != null) {
            Paint.Align alignXg = xg(rect, this.How);
            m(rect, this.f58842K);
            if (this.ER.O() != null) {
                this.ER.Uo().drawableState = getState();
                this.ER.ty(this.EWS);
            }
            this.ER.Uo().setTextAlign(alignXg);
            int iSave = 0;
            boolean z2 = Math.round(this.ER.KN(f().toString())) > Math.round(this.f58842K.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(this.f58842K);
            }
            CharSequence charSequenceEllipsize = this.f58844Y;
            if (z2 && this.HBN != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.ER.Uo(), this.f58842K.width(), this.HBN);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.How;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.ER.Uo());
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private void Sax() {
        this.ub = this.f58846f ? n.nr(this.Nxk) : null;
    }

    private ColorFilter UF() {
        ColorFilter colorFilter = this.mI;
        return colorFilter != null ? colorFilter : this.T3L;
    }

    private static boolean Vvq(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private boolean YiW() {
        return this.f58849m && this.eTf != null;
    }

    private void Zn(AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayXMQ = eO.xMQ(this.EWS, attributeSet, o.How, i2, i3, new int[0]);
        this.Zmq = typedArrayXMQ.hasValue(o.f8881s);
        yAc(w6.n(this.EWS, typedArrayXMQ, o.JVN));
        jO(w6.n(this.EWS, typedArrayXMQ, o.VwL));
        LPV(typedArrayXMQ.getDimension(o.Qu, 0.0f));
        int i5 = o.mI;
        if (typedArrayXMQ.hasValue(i5)) {
            wKp(typedArrayXMQ.getDimension(i5, 0.0f));
        }
        SR(w6.n(this.EWS, typedArrayXMQ, o.X4T));
        pS(typedArrayXMQ.getDimension(o.Zmq, 0.0f));
        c32(w6.n(this.EWS, typedArrayXMQ, o.Aum));
        w(typedArrayXMQ.getText(o.f8847W));
        X4.Ml mlUo = w6.Uo(this.EWS, typedArrayXMQ, o.tUK);
        mlUo.qie(typedArrayXMQ.getDimension(o.ER, mlUo.mUb()));
        HFS(mlUo);
        int i7 = typedArrayXMQ.getInt(o.lLA, 0);
        if (i7 == 1) {
            oz(TextUtils.TruncateAt.START);
        } else if (i7 == 2) {
            oz(TextUtils.TruncateAt.MIDDLE);
        } else if (i7 == 3) {
            oz(TextUtils.TruncateAt.END);
        }
        waP(typedArrayXMQ.getBoolean(o.ub, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            waP(typedArrayXMQ.getBoolean(o.p0N, false));
        }
        lNy(w6.nr(this.EWS, typedArrayXMQ, o.Bu));
        int i8 = o.f8865f;
        if (typedArrayXMQ.hasValue(i8)) {
            QgZ(w6.n(this.EWS, typedArrayXMQ, i8));
        }
        D76(typedArrayXMQ.getDimension(o.Uf, -1.0f));
        A(typedArrayXMQ.getBoolean(o.nO, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            A(typedArrayXMQ.getBoolean(o.EF, false));
        }
        h(w6.nr(this.EWS, typedArrayXMQ, o.xVH));
        Co(w6.n(this.EWS, typedArrayXMQ, o.Zn));
        mx(typedArrayXMQ.getDimension(o.Vvq, 0.0f));
        v0j(typedArrayXMQ.getBoolean(o.RQ, false));
        Mh(typedArrayXMQ.getBoolean(o.tFV, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            Mh(typedArrayXMQ.getBoolean(o.f8818F, false));
        }
        n7b(w6.nr(this.EWS, typedArrayXMQ, o.a63));
        int i9 = o.QZ6;
        if (typedArrayXMQ.hasValue(i9)) {
            s(w6.n(this.EWS, typedArrayXMQ, i9));
        }
        t1J(Ml.rl(this.EWS, typedArrayXMQ, o.Lp6));
        qva(Ml.rl(this.EWS, typedArrayXMQ, o.v0j));
        Fp(typedArrayXMQ.getDimension(o.UF, 0.0f));
        Lu(typedArrayXMQ.getDimension(o.n7b, 0.0f));
        rT(typedArrayXMQ.getDimension(o.o9, 0.0f));
        wYi(typedArrayXMQ.getDimension(o.Mh, 0.0f));
        Xli(typedArrayXMQ.getDimension(o.g6, 0.0f));
        iV(typedArrayXMQ.getDimension(o.f8888y, 0.0f));
        eo(typedArrayXMQ.getDimension(o.uG, 0.0f));
        xzo(typedArrayXMQ.getDimension(o.T3L, 0.0f));
        fW(typedArrayXMQ.getDimensionPixelSize(o.kSg, Integer.MAX_VALUE));
        typedArrayXMQ.recycle();
    }

    private void c(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private float eTf() {
        this.ER.Uo().getFontMetrics(this.f58847i);
        Paint.FontMetrics fontMetrics = this.f58847i;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private void eWT(Canvas canvas, Rect rect) {
        if (this.Zmq) {
            return;
        }
        this.hRu.setColor(this.lLA);
        this.hRu.setStyle(Paint.Style.FILL);
        this.f58842K.set(rect);
        canvas.drawRoundRect(this.f58842K, HV(), HV(), this.hRu);
    }

    private void fcU(Canvas canvas, Rect rect) {
        if (this.f58839GR <= 0.0f || this.Zmq) {
            return;
        }
        this.hRu.setColor(this.RQ);
        this.hRu.setStyle(Paint.Style.STROKE);
        if (!this.Zmq) {
            this.hRu.setColorFilter(UF());
        }
        RectF rectF = this.f58842K;
        float f3 = rect.left;
        float f4 = this.f58839GR;
        rectF.set(f3 + (f4 / 2.0f), rect.top + (f4 / 2.0f), rect.right - (f4 / 2.0f), rect.bottom - (f4 / 2.0f));
        float f5 = this.f58845a - (this.f58839GR / 2.0f);
        canvas.drawRoundRect(this.f58842K, f5, f5, this.hRu);
    }

    private boolean gxH() {
        return this.f58848k && this.dR0 != null;
    }

    private void kQ() {
        this.xg = new RippleDrawable(n.nr(p0N()), this.eTf, xVH);
    }

    private void n1(Canvas canvas, Rect rect) {
        this.hRu.setColor(this.a63);
        this.hRu.setStyle(Paint.Style.FILL);
        this.f58842K.set(rect);
        if (!this.Zmq) {
            canvas.drawRoundRect(this.f58842K, HV(), HV(), this.hRu);
        } else {
            KN(new RectF(rect), this.tUK);
            super.ck(canvas, this.hRu, this.tUK, o());
        }
    }

    public static j ofS(Context context, AttributeSet attributeSet, int i2, int i3) {
        j jVar = new j(context, attributeSet, i2, i3);
        jVar.Zn(attributeSet, i2, i3);
        return jVar;
    }

    private boolean pJg() {
        return this.f58838G7 && this.fcU != null && this.Mx;
    }

    private float tFV() {
        Drawable drawable = this.QZ6 ? this.fcU : this.dR0;
        float f3 = this.piY;
        return (f3 > 0.0f || drawable == null) ? f3 : drawable.getIntrinsicWidth();
    }

    private static boolean uG(X4.Ml ml) {
        return (ml == null || ml.xMQ() == null || !ml.xMQ().isStateful()) ? false : true;
    }

    private static boolean y(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean yA() {
        return this.f58838G7 && this.fcU != null && this.QZ6;
    }

    private void yAc(ColorStateList colorStateList) {
        if (this.f58834B != colorStateList) {
            this.f58834B = colorStateList;
            onStateChange(getState());
        }
    }

    public void A(boolean z2) {
        if (this.f58849m != z2) {
            boolean zYiW = YiW();
            this.f58849m = z2;
            boolean zYiW2 = YiW();
            if (zYiW != zYiW2) {
                if (zYiW2) {
                    Nxk(this.eTf);
                } else {
                    c(this.eTf);
                }
                invalidateSelf();
                nO();
            }
        }
    }

    public void Aum(int i2) {
        n7b(AppCompatResources.rl(this.EWS, i2));
    }

    public float Bu() {
        return this.Rl;
    }

    public void Co(ColorStateList colorStateList) {
        if (this.pJg != colorStateList) {
            this.pJg = colorStateList;
            if (YiW()) {
                DrawableCompat.HI(this.eTf, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void D76(float f3) {
        if (this.piY != f3) {
            float fK = k();
            this.piY = f3;
            float fK2 = k();
            invalidateSelf();
            if (fK != fK2) {
                nO();
            }
        }
    }

    public boolean EF() {
        return this.f58849m;
    }

    public void EN(int i2) {
        SR(AppCompatResources.n(this.EWS, i2));
    }

    public CharSequence ER() {
        return this.f58835C;
    }

    public float EWS() {
        return this.piY;
    }

    public void Fp(float f3) {
        if (this.Jk != f3) {
            this.Jk = f3;
            invalidateSelf();
            nO();
        }
    }

    public float GD() {
        return this.Po6;
    }

    public void GH3(int i2) {
        t1J(Ml.t(this.EWS, i2));
    }

    public void H(int i2) {
        waP(this.EWS.getResources().getBoolean(i2));
    }

    public float HBN() {
        return this.mYa;
    }

    public void HE(int i2) {
        Lu(this.EWS.getResources().getDimension(i2));
    }

    public void HFS(X4.Ml ml) {
        this.ER.gh(ml, this.EWS);
    }

    public float HV() {
        return this.Zmq ? iF() : this.f58845a;
    }

    public float How() {
        return this.f58839GR;
    }

    public void I4p(int i2) {
        iV(this.EWS.getResources().getDimension(i2));
    }

    public void I9f(int i2) {
        lNy(AppCompatResources.rl(this.EWS, i2));
    }

    public boolean JVN() {
        return this.Mx;
    }

    public ColorStateList K() {
        return this.f58840I;
    }

    public void L(int i2) {
        rT(this.EWS.getResources().getDimension(i2));
    }

    public void LPV(float f3) {
        if (this.f58836D != f3) {
            this.f58836D = f3;
            invalidateSelf();
            nO();
        }
    }

    public void Lp6(int i2) {
        s(AppCompatResources.n(this.EWS, i2));
    }

    public void Lu(float f3) {
        if (this.Rl != f3) {
            float fK = k();
            this.Rl = f3;
            float fK2 = k();
            invalidateSelf();
            if (fK != fK2) {
                nO();
            }
        }
    }

    public void Mh(boolean z2) {
        if (this.f58838G7 != z2) {
            boolean zYA = yA();
            this.f58838G7 = z2;
            boolean zYA2 = yA();
            if (zYA != zYA2) {
                if (zYA2) {
                    Nxk(this.fcU);
                } else {
                    c(this.fcU);
                }
                invalidateSelf();
                nO();
            }
        }
    }

    public void NP(int i2) {
        D76(this.EWS.getResources().getDimension(i2));
    }

    void Om(boolean z2) {
        this.UF = z2;
    }

    public ColorStateList Org() {
        return this.f58841J;
    }

    public Drawable Po6() {
        Drawable drawable = this.dR0;
        if (drawable != null) {
            return DrawableCompat.Ik(drawable);
        }
        return null;
    }

    public float Qu() {
        return this.Org;
    }

    public int[] RQ() {
        return this.Uf;
    }

    public void Ro(int i2) {
        Fp(this.EWS.getResources().getDimension(i2));
    }

    public void SR(ColorStateList colorStateList) {
        if (this.f58840I != colorStateList) {
            this.f58840I = colorStateList;
            if (this.Zmq) {
                J(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float T3L() {
        return this.qm;
    }

    public void TVk(int i2) {
        wYi(this.EWS.getResources().getDimension(i2));
    }

    public void Th(int i2) {
        wKp(this.EWS.getResources().getDimension(i2));
    }

    public void Toy(int i2) {
        jO(AppCompatResources.n(this.EWS, i2));
    }

    public Ml Uf() {
        return this.ul;
    }

    public float UhV() {
        return this.f58836D;
    }

    public TextUtils.TruncateAt VwL() {
        return this.HBN;
    }

    public float W() {
        return this.HV;
    }

    public void WH(InterfaceC0784j interfaceC0784j) {
        this.Qu = new WeakReference(interfaceC0784j);
    }

    public boolean X4T() {
        return this.f58846f;
    }

    public void XNZ(int i2) {
        xzo(this.EWS.getResources().getDimension(i2));
    }

    public void Xli(float f3) {
        if (this.Org != f3) {
            this.Org = f3;
            invalidateSelf();
            nO();
        }
    }

    public ColorStateList a63() {
        return this.pJg;
    }

    public boolean bZm(int[] iArr) {
        if (Arrays.equals(this.Uf, iArr)) {
            return false;
        }
        this.Uf = iArr;
        if (YiW()) {
            return vl(getState(), iArr);
        }
        return false;
    }

    public void c32(ColorStateList colorStateList) {
        if (this.Nxk != colorStateList) {
            this.Nxk = colorStateList;
            Sax();
            onStateChange(getState());
        }
    }

    public void d(int i2) {
        qva(Ml.t(this.EWS, i2));
    }

    public void eb(int i2) {
        HFS(new X4.Ml(this.EWS, i2));
    }

    public void eo(float f3) {
        if (this.GD != f3) {
            this.GD = f3;
            invalidateSelf();
            if (YiW()) {
                nO();
            }
        }
    }

    public CharSequence f() {
        return this.f58844Y;
    }

    public void fW(int i2) {
        this.X4T = i2;
    }

    public void fq(int i2) {
        Xli(this.EWS.getResources().getDimension(i2));
    }

    public void g6(int i2) {
        Mh(this.EWS.getResources().getBoolean(i2));
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.VwL;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mI;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f58836D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Jk + k() + this.mYa + this.ER.KN(f().toString()) + this.Org + ijL() + this.Po6), this.X4T);
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.Zmq) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f58845a);
        } else {
            outline.setRoundRect(bounds, this.f58845a);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public ColorStateList hRu() {
        return this.f58850z;
    }

    public float i() {
        return this.Jk;
    }

    public void iV(float f3) {
        if (this.HV != f3) {
            this.HV = f3;
            invalidateSelf();
            if (YiW()) {
                nO();
            }
        }
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (Vvq(this.f58834B) || Vvq(this.f58841J) || Vvq(this.f58840I)) {
            return true;
        }
        return (this.f58846f && Vvq(this.ub)) || uG(this.ER.O()) || pJg() || y(this.dR0) || y(this.fcU) || Vvq(this.Bu);
    }

    public void j(int i2) {
        QgZ(AppCompatResources.n(this.EWS, i2));
    }

    public void jO(ColorStateList colorStateList) {
        if (this.f58841J != colorStateList) {
            this.f58841J = colorStateList;
            onStateChange(getState());
        }
    }

    public float kSg() {
        return this.ofS;
    }

    public void l(CharSequence charSequence) {
        if (this.f58835C != charSequence) {
            this.f58835C = BidiFormatter.t().KN(charSequence);
            invalidateSelf();
        }
    }

    public void l2(int i2) {
        c32(AppCompatResources.n(this.EWS, i2));
    }

    public float lLA() {
        return this.GD;
    }

    public void lRt(boolean z2) {
        if (this.f58846f != z2) {
            this.f58846f = z2;
            Sax();
            onStateChange(getState());
        }
    }

    public void lS(int i2) {
        mx(this.EWS.getResources().getDimension(i2));
    }

    public Ml mI() {
        return this.n1;
    }

    public ColorStateList mYa() {
        return this.eWT;
    }

    public void mx(float f3) {
        if (this.ofS != f3) {
            this.ofS = f3;
            invalidateSelf();
            if (YiW()) {
                nO();
            }
        }
    }

    public void n7b(Drawable drawable) {
        if (this.fcU != drawable) {
            float fK = k();
            this.fcU = drawable;
            float fK2 = k();
            c(this.fcU);
            Nxk(this.fcU);
            invalidateSelf();
            if (fK != fK2) {
                nO();
            }
        }
    }

    boolean n7u() {
        return this.UF;
    }

    protected void nO() {
        InterfaceC0784j interfaceC0784j = (InterfaceC0784j) this.Qu.get();
        if (interfaceC0784j != null) {
            interfaceC0784j.n();
        }
    }

    public void o9(int i2) {
        v0j(this.EWS.getResources().getBoolean(i2));
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable, com.google.android.material.internal.Pl.n
    public boolean onStateChange(int[] iArr) {
        if (this.Zmq) {
            super.onStateChange(iArr);
        }
        return vl(iArr, RQ());
    }

    public void oz(TextUtils.TruncateAt truncateAt) {
        this.HBN = truncateAt;
    }

    public ColorStateList p0N() {
        return this.Nxk;
    }

    public void pS(float f3) {
        if (this.f58839GR != f3) {
            this.f58839GR = f3;
            this.hRu.setStrokeWidth(f3);
            if (this.Zmq) {
                super.D(f3);
            }
            invalidateSelf();
        }
    }

    public void q9(int i2) {
        Co(AppCompatResources.n(this.EWS, i2));
    }

    public Drawable qm() {
        return this.fcU;
    }

    public void qva(Ml ml) {
        this.n1 = ml;
    }

    public void rT(float f3) {
        if (this.qm != f3) {
            float fK = k();
            this.qm = f3;
            float fK2 = k();
            invalidateSelf();
            if (fK != fK2) {
                nO();
            }
        }
    }

    public void rxp(int i2) {
        LPV(this.EWS.getResources().getDimension(i2));
    }

    public void s(ColorStateList colorStateList) {
        if (this.eWT != colorStateList) {
            this.eWT = colorStateList;
            if (pJg()) {
                DrawableCompat.HI(this.fcU, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.VwL != i2) {
            this.VwL = i2;
            invalidateSelf();
        }
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.mI != colorFilter) {
            this.mI = colorFilter;
            invalidateSelf();
        }
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.Bu != colorStateList) {
            this.Bu = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.p0N != mode) {
            this.p0N = mode;
            this.T3L = com.google.android.material.drawable.Ml.qie(this, this.Bu, mode);
            invalidateSelf();
        }
    }

    public void t1J(Ml ml) {
        this.ul = ml;
    }

    public void tEO(int i2) {
        pS(this.EWS.getResources().getDimension(i2));
    }

    public Drawable tUK() {
        Drawable drawable = this.eTf;
        if (drawable != null) {
            return DrawableCompat.Ik(drawable);
        }
        return null;
    }

    public void uQ(int i2) {
        eo(this.EWS.getResources().getDimension(i2));
    }

    public X4.Ml ub() {
        return this.ER.O();
    }

    public void v0j(boolean z2) {
        if (this.Mx != z2) {
            this.Mx = z2;
            float fK = k();
            if (!z2 && this.QZ6) {
                this.QZ6 = false;
            }
            float fK2 = k();
            invalidateSelf();
            if (fK != fK2) {
                nO();
            }
        }
    }

    public void w(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f58844Y, charSequence)) {
            return;
        }
        this.f58844Y = charSequence;
        this.ER.az(true);
        invalidateSelf();
        nO();
    }

    public void wKY(int i2) {
        h(AppCompatResources.rl(this.EWS, i2));
    }

    public void wKp(float f3) {
        if (this.f58845a != f3) {
            this.f58845a = f3;
            setShapeAppearanceModel(g().WPU(f3));
        }
    }

    public void wYi(float f3) {
        if (this.mYa != f3) {
            this.mYa = f3;
            invalidateSelf();
            nO();
        }
    }

    public void waP(boolean z2) {
        if (this.f58848k != z2) {
            boolean zGxH = gxH();
            this.f58848k = z2;
            boolean zGxH2 = gxH();
            if (zGxH != zGxH2) {
                if (zGxH2) {
                    Nxk(this.dR0);
                } else {
                    c(this.dR0);
                }
                invalidateSelf();
                nO();
            }
        }
    }

    public boolean xVH() {
        return y(this.eTf);
    }

    public void xzo(float f3) {
        if (this.Po6 != f3) {
            this.Po6 = f3;
            invalidateSelf();
            nO();
        }
    }

    private j(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f58845a = -1.0f;
        this.hRu = new Paint(1);
        this.f58847i = new Paint.FontMetrics();
        this.f58842K = new RectF();
        this.How = new PointF();
        this.tUK = new Path();
        this.VwL = 255;
        this.p0N = PorterDuff.Mode.SRC_IN;
        this.Qu = new WeakReference(null);
        nHg(context);
        this.EWS = context;
        Pl pl = new Pl(this);
        this.ER = pl;
        this.f58844Y = "";
        pl.Uo().density = context.getResources().getDisplayMetrics().density;
        this.UhV = null;
        int[] iArr = JVN;
        setState(iArr);
        bZm(iArr);
        this.UF = true;
        if (n.f12388n) {
            xVH.setTint(-1);
        }
    }

    private void C(Canvas canvas, Rect rect) {
        if (yA()) {
            Y(rect, this.f58842K);
            RectF rectF = this.f58842K;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.fcU.setBounds(0, 0, (int) this.f58842K.width(), (int) this.f58842K.height());
            this.fcU.draw(canvas);
            canvas.translate(-f3, -f4);
        }
    }

    private void G7(Canvas canvas, Rect rect) {
        if (gxH()) {
            Y(rect, this.f58842K);
            RectF rectF = this.f58842K;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.dR0.setBounds(0, 0, (int) this.f58842K.width(), (int) this.f58842K.height());
            this.dR0.draw(canvas);
            canvas.translate(-f3, -f4);
        }
    }

    private void Y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (!gxH() && !yA()) {
            return;
        }
        float f3 = this.Jk + this.Rl;
        float fTFV = tFV();
        if (DrawableCompat.J2(this) == 0) {
            float f4 = rect.left + f3;
            rectF.left = f4;
            rectF.right = f4 + fTFV;
        } else {
            float f5 = rect.right - f3;
            rectF.right = f5;
            rectF.left = f5 - fTFV;
        }
        float fQZ6 = QZ6();
        float fExactCenterY = rect.exactCenterY() - (fQZ6 / 2.0f);
        rectF.top = fExactCenterY;
        rectF.bottom = fExactCenterY + fQZ6;
    }

    private void dR0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (YiW()) {
            float f3 = this.Po6 + this.GD + this.ofS + this.HV + this.Org;
            if (DrawableCompat.J2(this) == 0) {
                rectF.right = rect.right - f3;
            } else {
                rectF.left = rect.left + f3;
            }
        }
    }

    private void m(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f58844Y != null) {
            float fK = this.Jk + k() + this.mYa;
            float fIjL = this.Po6 + ijL() + this.Org;
            if (DrawableCompat.J2(this) == 0) {
                rectF.left = rect.left + fK;
                rectF.right = rect.right - fIjL;
            } else {
                rectF.left = rect.left + fIjL;
                rectF.right = rect.right - fK;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void piY(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (YiW()) {
            float f3 = this.Po6 + this.GD + this.ofS + this.HV + this.Org;
            if (DrawableCompat.J2(this) == 0) {
                float f4 = rect.right;
                rectF.right = f4;
                rectF.left = f4 - f3;
            } else {
                int i2 = rect.left;
                rectF.left = i2;
                rectF.right = i2 + f3;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void ul(Canvas canvas, Rect rect) {
        if (YiW()) {
            z(rect, this.f58842K);
            RectF rectF = this.f58842K;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.eTf.setBounds(0, 0, (int) this.f58842K.width(), (int) this.f58842K.height());
            if (n.f12388n) {
                this.xg.setBounds(this.eTf.getBounds());
                this.xg.jumpToCurrentState();
                this.xg.draw(canvas);
            } else {
                this.eTf.draw(canvas);
            }
            canvas.translate(-f3, -f4);
        }
    }

    private boolean vl(int[] iArr, int[] iArr2) {
        int colorForState;
        int colorForState2;
        boolean z2;
        boolean z3;
        int colorForState3;
        int colorForState4;
        int colorForState5;
        boolean z4;
        boolean z5;
        int colorForState6;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f58834B;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(iArr, this.lLA);
        } else {
            colorForState = 0;
        }
        int iQie = qie(colorForState);
        boolean state = true;
        if (this.lLA != iQie) {
            this.lLA = iQie;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f58841J;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(iArr, this.kSg);
        } else {
            colorForState2 = 0;
        }
        int iQie2 = qie(colorForState2);
        if (this.kSg != iQie2) {
            this.kSg = iQie2;
            zOnStateChange = true;
        }
        int iXMQ = W3.j.xMQ(iQie, iQie2);
        if (this.f58843W != iXMQ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (S() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 | z3) {
            this.f58843W = iXMQ;
            p5(ColorStateList.valueOf(iXMQ));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f58840I;
        if (colorStateList3 != null) {
            colorForState3 = colorStateList3.getColorForState(iArr, this.RQ);
        } else {
            colorForState3 = 0;
        }
        if (this.RQ != colorForState3) {
            this.RQ = colorForState3;
            zOnStateChange = true;
        }
        if (this.ub != null && n.O(iArr)) {
            colorForState4 = this.ub.getColorForState(iArr, this.a63);
        } else {
            colorForState4 = 0;
        }
        if (this.a63 != colorForState4) {
            this.a63 = colorForState4;
            if (this.f58846f) {
                zOnStateChange = true;
            }
        }
        if (this.ER.O() != null && this.ER.O().xMQ() != null) {
            colorForState5 = this.ER.O().xMQ().getColorForState(iArr, this.f58837F);
        } else {
            colorForState5 = 0;
        }
        if (this.f58837F != colorForState5) {
            this.f58837F = colorForState5;
            zOnStateChange = true;
        }
        if (Zmq(getState(), R.attr.state_checked) && this.Mx) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.QZ6 != z4 && this.fcU != null) {
            float fK = k();
            this.QZ6 = z4;
            if (fK != k()) {
                zOnStateChange = true;
                z5 = true;
            } else {
                z5 = false;
                zOnStateChange = true;
            }
        } else {
            z5 = false;
        }
        ColorStateList colorStateList4 = this.Bu;
        if (colorStateList4 != null) {
            colorForState6 = colorStateList4.getColorForState(iArr, this.tFV);
        } else {
            colorForState6 = 0;
        }
        if (this.tFV != colorForState6) {
            this.tFV = colorForState6;
            this.T3L = com.google.android.material.drawable.Ml.qie(this, this.Bu, this.p0N);
        } else {
            state = zOnStateChange;
        }
        if (y(this.dR0)) {
            state |= this.dR0.setState(iArr);
        }
        if (y(this.fcU)) {
            state |= this.fcU.setState(iArr);
        }
        if (y(this.eTf)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.eTf.setState(iArr3);
        }
        if (n.f12388n && y(this.xg)) {
            state |= this.xg.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z5) {
            nO();
        }
        return state;
    }

    private void z(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (YiW()) {
            float f3 = this.Po6 + this.GD;
            if (DrawableCompat.J2(this) == 0) {
                float f4 = rect.right - f3;
                rectF.right = f4;
                rectF.left = f4 - this.ofS;
            } else {
                float f5 = rect.left + f3;
                rectF.left = f5;
                rectF.right = f5 + this.ofS;
            }
            float fExactCenterY = rect.exactCenterY();
            float f6 = this.ofS;
            float f7 = fExactCenterY - (f6 / 2.0f);
            rectF.top = f7;
            rectF.bottom = f7 + f6;
        }
    }

    public void C7B(float f3) {
        X4.Ml mlUb = ub();
        if (mlUb != null) {
            mlUb.qie(f3);
            this.ER.Uo().setTextSize(f3);
            n();
        }
    }

    public void F(RectF rectF) {
        piY(getBounds(), rectF);
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iN;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.VwL;
            if (i2 < 255) {
                canvas2 = canvas;
                iN = i7B.j.n(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            } else {
                canvas2 = canvas;
                iN = 0;
            }
            eWT(canvas2, bounds);
            Mx(canvas2, bounds);
            if (this.Zmq) {
                super.draw(canvas2);
            }
            fcU(canvas2, bounds);
            n1(canvas2, bounds);
            G7(canvas2, bounds);
            C(canvas2, bounds);
            if (this.UF) {
                Rl(canvas2, bounds);
            }
            ul(canvas2, bounds);
            Jk(canvas2, bounds);
            if (this.VwL < 255) {
                canvas2.restoreToCount(iN);
            }
        }
    }

    public void h(Drawable drawable) {
        Drawable drawableMutate;
        Drawable drawableTUK = tUK();
        if (drawableTUK != drawable) {
            float fIjL = ijL();
            if (drawable != null) {
                drawableMutate = DrawableCompat.r(drawable).mutate();
            } else {
                drawableMutate = null;
            }
            this.eTf = drawableMutate;
            if (n.f12388n) {
                kQ();
            }
            float fIjL2 = ijL();
            c(drawableTUK);
            if (YiW()) {
                Nxk(this.eTf);
            }
            invalidateSelf();
            if (fIjL != fIjL2) {
                nO();
            }
        }
    }

    float ijL() {
        if (YiW()) {
            return this.HV + this.ofS + this.GD;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    float k() {
        if (!gxH() && !yA()) {
            return 0.0f;
        }
        return this.Rl + tFV() + this.qm;
    }

    public void lNy(Drawable drawable) {
        Drawable drawableMutate;
        Drawable drawablePo6 = Po6();
        if (drawablePo6 != drawable) {
            float fK = k();
            if (drawable != null) {
                drawableMutate = DrawableCompat.r(drawable).mutate();
            } else {
                drawableMutate = null;
            }
            this.dR0 = drawableMutate;
            float fK2 = k();
            c(drawablePo6);
            if (gxH()) {
                Nxk(this.dR0);
            }
            invalidateSelf();
            if (fK != fK2) {
                nO();
            }
        }
    }

    @Override // com.google.android.material.internal.Pl.n
    public void n() {
        nO();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (gxH()) {
            zOnLayoutDirectionChanged |= DrawableCompat.az(this.dR0, i2);
        }
        if (yA()) {
            zOnLayoutDirectionChanged |= DrawableCompat.az(this.fcU, i2);
        }
        if (YiW()) {
            zOnLayoutDirectionChanged |= DrawableCompat.az(this.eTf, i2);
        }
        if (zOnLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (gxH()) {
            zOnLevelChange |= this.dR0.setLevel(i2);
        }
        if (yA()) {
            zOnLevelChange |= this.fcU.setLevel(i2);
        }
        if (YiW()) {
            zOnLevelChange |= this.eTf.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (gxH()) {
            visible |= this.dR0.setVisible(z2, z3);
        }
        if (yA()) {
            visible |= this.fcU.setVisible(z2, z3);
        }
        if (YiW()) {
            visible |= this.eTf.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
