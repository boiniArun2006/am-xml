package mfo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import java.util.BitSet;
import mfo.C;
import mfo.o;
import mfo.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CN3 extends Drawable implements TintAwareDrawable, Pl {

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static final Paint f70898FX;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String f70899M = "CN3";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f70900E;
    private final RectF E2;
    private final BitSet J2;
    private PorterDuffColorFilter M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Paint f70901N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final qz.CN3[] f70902O;
    private PorterDuffColorFilter P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Path f70903S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private C f70904T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final o f70905U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Region f70906X;
    private final rgg.j Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Path f70907Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Region f70908e;
    private final RectF eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RectF f70909g;
    private final o.n jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private w6 f70910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Matrix f70911o;
    private int p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f70912r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qz.CN3[] f70913t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Paint f70914v;

    class j implements o.n {
        j() {
        }

        @Override // mfo.o.n
        public void n(qz qzVar, Matrix matrix, int i2) {
            CN3.this.J2.set(i2 + 4, qzVar.O());
            CN3.this.f70902O[i2] = qzVar.J2(matrix);
        }

        @Override // mfo.o.n
        public void rl(qz qzVar, Matrix matrix, int i2) {
            CN3.this.J2.set(i2, qzVar.O());
            CN3.this.f70913t[i2] = qzVar.J2(matrix);
        }
    }

    class n implements C.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f70916n;

        n(float f3) {
            this.f70916n = f3;
        }

        @Override // mfo.C.w6
        public mfo.w6 n(mfo.w6 w6Var) {
            return w6Var instanceof Dsr ? w6Var : new mfo.n(this.f70916n, w6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class w6 extends Drawable.ConstantState {
        float HI;
        int Ik;
        ColorStateList J2;
        PorterDuff.Mode KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        ColorStateList f70917O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Paint.Style f70918S;
        ColorStateList Uo;
        boolean XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f70919Z;
        int az;
        float ck;
        float gh;
        float mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C f70920n;
        ColorStateList nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f70921o;
        float qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f70922r;
        TCZ.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        ColorFilter f70923t;
        float ty;
        Rect xMQ;

        public w6(C c2, TCZ.j jVar) {
            this.nr = null;
            this.f70917O = null;
            this.J2 = null;
            this.Uo = null;
            this.KN = PorterDuff.Mode.SRC_IN;
            this.xMQ = null;
            this.mUb = 1.0f;
            this.gh = 1.0f;
            this.az = 255;
            this.ty = 0.0f;
            this.HI = 0.0f;
            this.ck = 0.0f;
            this.Ik = 0;
            this.f70922r = 0;
            this.f70921o = 0;
            this.f70919Z = 0;
            this.XQ = false;
            this.f70918S = Paint.Style.FILL_AND_STROKE;
            this.f70920n = c2;
            this.rl = jVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            CN3 cn3 = new CN3(this);
            cn3.f70912r = true;
            return cn3;
        }

        public w6(w6 w6Var) {
            this.nr = null;
            this.f70917O = null;
            this.J2 = null;
            this.Uo = null;
            this.KN = PorterDuff.Mode.SRC_IN;
            this.xMQ = null;
            this.mUb = 1.0f;
            this.gh = 1.0f;
            this.az = 255;
            this.ty = 0.0f;
            this.HI = 0.0f;
            this.ck = 0.0f;
            this.Ik = 0;
            this.f70922r = 0;
            this.f70921o = 0;
            this.f70919Z = 0;
            this.XQ = false;
            this.f70918S = Paint.Style.FILL_AND_STROKE;
            this.f70920n = w6Var.f70920n;
            this.rl = w6Var.rl;
            this.qie = w6Var.qie;
            this.f70923t = w6Var.f70923t;
            this.nr = w6Var.nr;
            this.f70917O = w6Var.f70917O;
            this.KN = w6Var.KN;
            this.Uo = w6Var.Uo;
            this.az = w6Var.az;
            this.mUb = w6Var.mUb;
            this.f70921o = w6Var.f70921o;
            this.Ik = w6Var.Ik;
            this.XQ = w6Var.XQ;
            this.gh = w6Var.gh;
            this.ty = w6Var.ty;
            this.HI = w6Var.HI;
            this.ck = w6Var.ck;
            this.f70922r = w6Var.f70922r;
            this.f70919Z = w6Var.f70919Z;
            this.J2 = w6Var.J2;
            this.f70918S = w6Var.f70918S;
            if (w6Var.xMQ != null) {
                this.xMQ = new Rect(w6Var.xMQ);
            }
        }
    }

    public CN3() {
        this(new C());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f70912r = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f70912r = true;
        super.onBoundsChange(rect);
    }

    static {
        Paint paint = new Paint(1);
        f70898FX = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public CN3(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(C.O(context, attributeSet, i2, i3).az());
    }

    private void HI(Canvas canvas) {
        Ik(canvas, this.f70901N, this.f70907Z, this.f70910n.f70920n, o());
    }

    private boolean I() {
        PorterDuffColorFilter porterDuffColorFilter = this.P5;
        PorterDuffColorFilter porterDuffColorFilter2 = this.M7;
        w6 w6Var = this.f70910n;
        this.P5 = gh(w6Var.Uo, w6Var.KN, this.f70901N, true);
        w6 w6Var2 = this.f70910n;
        this.M7 = gh(w6Var2.J2, w6Var2.KN, this.f70914v, false);
        w6 w6Var3 = this.f70910n;
        if (w6Var3.XQ) {
            this.Xw.nr(w6Var3.Uo.getColorForState(getState(), 0));
        }
        return (ObjectsCompat.n(porterDuffColorFilter, this.P5) && ObjectsCompat.n(porterDuffColorFilter2, this.M7)) ? false : true;
    }

    private PorterDuffColorFilter J2(Paint paint, boolean z2) {
        if (!z2) {
            return null;
        }
        int color = paint.getColor();
        int iQie = qie(color);
        this.p5 = iQie;
        if (iQie != color) {
            return new PorterDuffColorFilter(iQie, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private boolean N() {
        Paint.Style style = this.f70910n.f70918S;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f70914v.getStrokeWidth() > 0.0f;
    }

    private boolean T() {
        Paint.Style style = this.f70910n.f70918S;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean X() {
        w6 w6Var = this.f70910n;
        int i2 = w6Var.Ik;
        if (i2 == 1 || w6Var.f70922r <= 0) {
            return false;
        }
        return i2 == 2 || jB();
    }

    private RectF Z() {
        this.E2.set(o());
        float fTe = te();
        this.E2.inset(fTe, fTe);
        return this.E2;
    }

    private boolean a(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f70910n.nr == null || color2 == (colorForState2 = this.f70910n.nr.getColorForState(iArr, (color2 = this.f70901N.getColor())))) {
            z2 = false;
        } else {
            this.f70901N.setColor(colorForState2);
            z2 = true;
        }
        if (this.f70910n.f70917O == null || color == (colorForState = this.f70910n.f70917O.getColorForState(iArr, (color = this.f70914v.getColor())))) {
            return z2;
        }
        this.f70914v.setColor(colorForState);
        return true;
    }

    public static CN3 az(Context context, float f3, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(W3.j.t(context, Rxk.n.ty, CN3.class.getSimpleName()));
        }
        CN3 cn3 = new CN3();
        cn3.nHg(context);
        cn3.p5(colorStateList);
        cn3.M7(f3);
        return cn3;
    }

    private static int bzg(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private PorterDuffColorFilter gh(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        return (colorStateList == null || mode == null) ? J2(paint, z2) : mUb(colorStateList, mode, z2);
    }

    private void ty(Canvas canvas) {
        if (this.J2.cardinality() > 0) {
            Log.w(f70899M, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f70910n.f70921o != 0) {
            canvas.drawPath(this.f70907Z, this.Xw.t());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f70913t[i2].rl(this.Xw, this.f70910n.f70922r, canvas);
            this.f70902O[i2].rl(this.Xw, this.f70910n.f70922r, canvas);
        }
        if (this.f70900E) {
            int iViF = ViF();
            int iNY = nY();
            canvas.translate(-iViF, -iNY);
            canvas.drawPath(this.f70907Z, f70898FX);
            canvas.translate(iViF, iNY);
        }
    }

    public void D(float f3) {
        this.f70910n.qie = f3;
        invalidateSelf();
    }

    public void E(int i2, int i3, int i5, int i7) {
        w6 w6Var = this.f70910n;
        if (w6Var.xMQ == null) {
            w6Var.xMQ = new Rect();
        }
        this.f70910n.xMQ.set(i2, i3, i5, i7);
        invalidateSelf();
    }

    public float E2() {
        return this.f70910n.ck;
    }

    public void J(ColorStateList colorStateList) {
        w6 w6Var = this.f70910n;
        if (w6Var.f70917O != colorStateList) {
            w6Var.f70917O = colorStateList;
            onStateChange(getState());
        }
    }

    protected final void KN(RectF rectF, Path path) {
        o oVar = this.f70905U;
        w6 w6Var = this.f70910n;
        oVar.O(w6Var.f70920n, w6Var.gh, rectF, this.jB, path);
    }

    public void M(float f3) {
        w6 w6Var = this.f70910n;
        if (w6Var.ty != f3) {
            w6Var.ty = f3;
            GR();
        }
    }

    public void M7(float f3) {
        w6 w6Var = this.f70910n;
        if (w6Var.HI != f3) {
            w6Var.HI = f3;
            GR();
        }
    }

    public void P5(mfo.w6 w6Var) {
        setShapeAppearanceModel(this.f70910n.f70920n.aYN(w6Var));
    }

    public ColorStateList S() {
        return this.f70910n.nr;
    }

    public void U(float f3) {
        setShapeAppearanceModel(this.f70910n.f70920n.WPU(f3));
    }

    public int ViF() {
        return (int) (((double) this.f70910n.f70921o) * Math.sin(Math.toRadians(r0.f70919Z)));
    }

    public float WPU() {
        return this.f70910n.gh;
    }

    public float XQ() {
        return this.f70910n.HI;
    }

    public float aYN() {
        return this.f70910n.ty;
    }

    protected void ck(Canvas canvas, Paint paint, Path path, RectF rectF) {
        Ik(canvas, paint, path, this.f70910n.f70920n, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f70901N.setColorFilter(this.P5);
        int alpha = this.f70901N.getAlpha();
        this.f70901N.setAlpha(bzg(alpha, this.f70910n.az));
        this.f70914v.setColorFilter(this.M7);
        this.f70914v.setStrokeWidth(this.f70910n.qie);
        int alpha2 = this.f70914v.getAlpha();
        this.f70914v.setAlpha(bzg(alpha2, this.f70910n.az));
        if (this.f70912r) {
            xMQ();
            Uo(o(), this.f70907Z);
            this.f70912r = false;
        }
        rV9(canvas);
        if (T()) {
            HI(canvas);
        }
        if (N()) {
            r(canvas);
        }
        this.f70901N.setAlpha(alpha);
        this.f70914v.setAlpha(alpha2);
    }

    public void eF(float f3) {
        w6 w6Var = this.f70910n;
        if (w6Var.gh != f3) {
            w6Var.gh = f3;
            this.f70912r = true;
            invalidateSelf();
        }
    }

    public float fD() {
        return this.f70910n.f70920n.Z().n(o());
    }

    public C g() {
        return this.f70910n.f70920n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f70910n.az;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f70910n;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f70910n.Ik == 2) {
            return;
        }
        if (v()) {
            outline.setRoundRect(getBounds(), iF() * this.f70910n.gh);
        } else {
            Uo(o(), this.f70907Z);
            com.google.android.material.drawable.Ml.mUb(outline, this.f70907Z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f70910n.xMQ;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public float iF() {
        return this.f70910n.f70920n.r().n(o());
    }

    public boolean jB() {
        return (v() || this.f70907Z.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f70910n = new w6(this.f70910n);
        return this;
    }

    public void nHg(Context context) {
        this.f70910n.rl = new TCZ.j(context);
        GR();
    }

    public int nY() {
        return (int) (((double) this.f70910n.f70921o) * Math.cos(Math.toRadians(r0.f70919Z)));
    }

    protected RectF o() {
        this.f70909g.set(getBounds());
        return this.f70909g;
    }

    public void p5(ColorStateList colorStateList) {
        w6 w6Var = this.f70910n;
        if (w6Var.nr != colorStateList) {
            w6Var.nr = colorStateList;
            onStateChange(getState());
        }
    }

    protected void r(Canvas canvas) {
        Ik(canvas, this.f70914v, this.f70903S, this.f70904T, Z());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        w6 w6Var = this.f70910n;
        if (w6Var.az != i2) {
            w6Var.az = i2;
            s7N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f70910n.f70923t = colorFilter;
        s7N();
    }

    @Override // mfo.Pl
    public void setShapeAppearanceModel(C c2) {
        this.f70910n.f70920n = c2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f70910n.Uo = colorStateList;
        I();
        s7N();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        w6 w6Var = this.f70910n;
        if (w6Var.KN != mode) {
            w6Var.KN = mode;
            I();
            s7N();
        }
    }

    public boolean v() {
        return this.f70910n.f70920n.XQ(o());
    }

    public boolean wTp() {
        TCZ.j jVar = this.f70910n.rl;
        return jVar != null && jVar.nr();
    }

    public CN3(C c2) {
        this(new w6(c2, null));
    }

    private void GR() {
        float fE2 = e();
        this.f70910n.f70922r = (int) Math.ceil(0.75f * fE2);
        this.f70910n.f70921o = (int) Math.ceil(fE2 * 0.25f);
        I();
        s7N();
    }

    private void Ik(Canvas canvas, Paint paint, Path path, C c2, RectF rectF) {
        if (c2.XQ(rectF)) {
            float fN = c2.Z().n(rectF) * this.f70910n.gh;
            canvas.drawRoundRect(rectF, fN, fN, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    private void Uo(RectF rectF, Path path) {
        KN(rectF, path);
        if (this.f70910n.mUb != 1.0f) {
            this.f70911o.reset();
            Matrix matrix = this.f70911o;
            float f3 = this.f70910n.mUb;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f70911o);
        }
        path.computeBounds(this.eF, true);
    }

    private void Xw(Canvas canvas) {
        canvas.translate(ViF(), nY());
    }

    private PorterDuffColorFilter mUb(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z2) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = qie(colorForState);
        }
        this.p5 = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private void rV9(Canvas canvas) {
        if (!X()) {
            return;
        }
        canvas.save();
        Xw(canvas);
        if (!this.f70900E) {
            ty(canvas);
            canvas.restore();
            return;
        }
        int iWidth = (int) (this.eF.width() - getBounds().width());
        int iHeight = (int) (this.eF.height() - getBounds().height());
        if (iWidth >= 0 && iHeight >= 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.eF.width()) + (this.f70910n.f70922r * 2) + iWidth, ((int) this.eF.height()) + (this.f70910n.f70922r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f3 = (getBounds().left - this.f70910n.f70922r) - iWidth;
            float f4 = (getBounds().top - this.f70910n.f70922r) - iHeight;
            canvas2.translate(-f3, -f4);
            ty(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    private void s7N() {
        super.invalidateSelf();
    }

    private float te() {
        if (N()) {
            return this.f70914v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void xMQ() {
        C cViF = g().ViF(new n(-te()));
        this.f70904T = cViF;
        this.f70905U.nr(cViF, this.f70910n.gh, Z(), this.f70903S);
    }

    public void B(float f3, ColorStateList colorStateList) {
        D(f3);
        J(colorStateList);
    }

    public void FX(float f3, int i2) {
        D(f3);
        J(ColorStateList.valueOf(i2));
    }

    public float e() {
        return XQ() + E2();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f70908e.set(getBounds());
        Uo(o(), this.f70907Z);
        this.f70906X.setPath(this.f70907Z, this.f70908e);
        this.f70908e.op(this.f70906X, Region.Op.DIFFERENCE);
        return this.f70908e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f70910n.Uo;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.f70910n.J2;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f70910n.f70917O;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.f70910n.nr;
                        if (colorStateList4 == null || !colorStateList4.isStateful()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.Pl.n
    protected boolean onStateChange(int[] iArr) {
        boolean z2;
        boolean zA = a(iArr);
        boolean zI = I();
        if (!zA && !zI) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    protected int qie(int i2) {
        float fE2 = e() + aYN();
        TCZ.j jVar = this.f70910n.rl;
        if (jVar != null) {
            return jVar.t(i2, fE2);
        }
        return i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    protected CN3(w6 w6Var) {
        o oVar;
        this.f70913t = new qz.CN3[4];
        this.f70902O = new qz.CN3[4];
        this.J2 = new BitSet(8);
        this.f70911o = new Matrix();
        this.f70907Z = new Path();
        this.f70903S = new Path();
        this.f70909g = new RectF();
        this.E2 = new RectF();
        this.f70908e = new Region();
        this.f70906X = new Region();
        Paint paint = new Paint(1);
        this.f70901N = paint;
        Paint paint2 = new Paint(1);
        this.f70914v = paint2;
        this.Xw = new rgg.j();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oVar = o.gh();
        } else {
            oVar = new o();
        }
        this.f70905U = oVar;
        this.eF = new RectF();
        this.f70900E = true;
        this.f70910n = w6Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        I();
        a(getState());
        this.jB = new j();
    }
}
