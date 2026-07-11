package zdu;

import aB.AbstractC1501Ml;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wVf.j;
import y8.Ml;
import y8.j;
import y8.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements y8.j, w6.n {
    private final Matrix HI;
    private j.InterfaceC1280j Ik;
    private final wVf.j J2;
    private final float[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f76714O;
    private final wVf.n Uo;
    private int az;
    private int ck;
    private Rect gh;
    private final Paint mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC1501Ml f76715n;
    private final w6 nr;
    private int qie;
    private final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f76716t;
    private final Path ty;
    private final Bitmap.Config xMQ;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1304j f76713r = new C1304j(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Class f76712o = j.class;

    /* JADX INFO: renamed from: zdu.j$j, reason: collision with other inner class name */
    public static final class C1304j {
        public /* synthetic */ C1304j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1304j() {
        }
    }

    private final boolean Ik(Canvas canvas, int i2, int i3) throws Throwable {
        Pj0.j jVarJ2;
        boolean zCk;
        Pj0.j jVar = null;
        try {
            boolean z2 = false;
            int i5 = 1;
            if (this.f76714O) {
                wVf.j jVar2 = this.J2;
                Pj0.j jVarRl = jVar2 != null ? jVar2.rl(i2, canvas.getWidth(), canvas.getHeight()) : null;
                if (jVarRl != null) {
                    try {
                        if (jVarRl.isValid()) {
                            Object objEF = jVarRl.eF();
                            Intrinsics.checkNotNullExpressionValue(objEF, "get(...)");
                            HI(i2, (Bitmap) objEF, canvas);
                            Pj0.j.M7(jVarRl);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        jVar = jVarRl;
                        Pj0.j.M7(jVar);
                        throw th;
                    }
                }
                wVf.j jVar3 = this.J2;
                if (jVar3 != null) {
                    jVar3.n(canvas.getWidth(), canvas.getHeight(), null);
                }
                Pj0.j.M7(jVarRl);
                return false;
            }
            if (i3 == 0) {
                jVarJ2 = this.rl.J2(i2);
                zCk = ck(i2, jVarJ2, canvas, 0);
            } else if (i3 == 1) {
                jVarJ2 = this.rl.t(i2, this.qie, this.az);
                if (r(i2, jVarJ2) && ck(i2, jVarJ2, canvas, 1)) {
                    z2 = true;
                }
                zCk = z2;
                i5 = 2;
            } else if (i3 == 2) {
                try {
                    jVarJ2 = this.f76715n.rl(this.qie, this.az, this.xMQ);
                    if (r(i2, jVarJ2) && ck(i2, jVarJ2, canvas, 2)) {
                        z2 = true;
                    }
                    zCk = z2;
                    i5 = 3;
                } catch (RuntimeException e2) {
                    Dzy.j.S(f76712o, "Failed to create frame bitmap", e2);
                    Pj0.j.M7(null);
                    return false;
                }
            } else {
                if (i3 != 3) {
                    Pj0.j.M7(null);
                    return false;
                }
                jVarJ2 = this.rl.rl(i2);
                zCk = ck(i2, jVarJ2, canvas, 3);
                i5 = -1;
            }
            Pj0.j.M7(jVarJ2);
            return (zCk || i5 == -1) ? zCk : Ik(canvas, i2, i5);
        } catch (Throwable th2) {
            th = th2;
            Pj0.j.M7(jVar);
            throw th;
        }
    }

    public j(AbstractC1501Ml platformBitmapFactory, n bitmapFrameCache, Ml animationInformation, w6 bitmapFrameRenderer, boolean z2, wVf.j jVar, wVf.n nVar, ra.Ml ml) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        this.f76715n = platformBitmapFactory;
        this.rl = bitmapFrameCache;
        this.f76716t = animationInformation;
        this.nr = bitmapFrameRenderer;
        this.f76714O = z2;
        this.J2 = jVar;
        this.Uo = nVar;
        this.KN = null;
        this.xMQ = Bitmap.Config.ARGB_8888;
        this.mUb = new Paint(6);
        this.ty = new Path();
        this.HI = new Matrix();
        this.ck = -1;
        o();
    }

    private final void HI(int i2, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.gh;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.mUb);
        } else if (Z(i2, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.ty, this.mUb);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.mUb);
        }
    }

    private final boolean Z(int i2, Bitmap bitmap, float f3, float f4) {
        if (this.KN == null) {
            return false;
        }
        if (i2 == this.ck) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.HI.setRectToRect(new RectF(0.0f, 0.0f, this.qie, this.az), new RectF(0.0f, 0.0f, f3, f4), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.HI);
        this.mUb.setShader(bitmapShader);
        this.ty.addRoundRect(new RectF(0.0f, 0.0f, f3, f4), this.KN, Path.Direction.CW);
        this.ck = i2;
        return true;
    }

    private final boolean ck(int i2, Pj0.j jVar, Canvas canvas, int i3) {
        if (jVar == null || !Pj0.j.FX(jVar)) {
            return false;
        }
        Object objEF = jVar.eF();
        Intrinsics.checkNotNullExpressionValue(objEF, "get(...)");
        HI(i2, (Bitmap) objEF, canvas);
        if (i3 == 3 || this.f76714O) {
            return true;
        }
        this.rl.n(i2, jVar, i3);
        return true;
    }

    private final void o() {
        int iO = this.nr.O();
        this.qie = iO;
        if (iO == -1) {
            Rect rect = this.gh;
            this.qie = rect != null ? rect.width() : -1;
        }
        int iT = this.nr.t();
        this.az = iT;
        if (iT == -1) {
            Rect rect2 = this.gh;
            this.az = rect2 != null ? rect2.height() : -1;
        }
    }

    private final boolean r(int i2, Pj0.j jVar) {
        if (jVar == null || !jVar.isValid()) {
            return false;
        }
        w6 w6Var = this.nr;
        Object objEF = jVar.eF();
        Intrinsics.checkNotNullExpressionValue(objEF, "get(...)");
        boolean zN = w6Var.n(i2, (Bitmap) objEF);
        if (!zN) {
            Pj0.j.M7(jVar);
        }
        return zN;
    }

    @Override // y8.j
    public void J2(ColorFilter colorFilter) {
        this.mUb.setColorFilter(colorFilter);
    }

    @Override // y8.j
    public boolean KN(Drawable parent, Canvas canvas, int i2) throws Throwable {
        wVf.n nVar;
        wVf.j jVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean zIk = Ik(canvas, i2, 0);
        if (!this.f76714O && (nVar = this.Uo) != null && (jVar = this.J2) != null) {
            j.C1259j.J2(jVar, nVar, this.rl, this, i2, null, 16, null);
        }
        return zIk;
    }

    @Override // y8.j
    public int O() {
        return this.qie;
    }

    @Override // y8.Ml
    public int Uo() {
        return this.f76716t.Uo();
    }

    @Override // y8.Ml
    public int az() {
        return this.f76716t.az();
    }

    @Override // y8.j
    public void clear() {
        if (!this.f76714O) {
            this.rl.clear();
            return;
        }
        wVf.j jVar = this.J2;
        if (jVar != null) {
            jVar.t();
        }
    }

    @Override // y8.Ml
    public int gh(int i2) {
        return this.f76716t.gh(i2);
    }

    @Override // y8.Ml
    public int mUb() {
        return this.f76716t.mUb();
    }

    @Override // y8.Ml
    public int n() {
        return this.f76716t.n();
    }

    @Override // y8.j
    public void nr(Rect rect) {
        this.gh = rect;
        this.nr.nr(rect);
        o();
    }

    @Override // y8.j
    public void qie(int i2) {
        this.mUb.setAlpha(i2);
    }

    @Override // y8.Ml
    public int rl() {
        return this.f76716t.rl();
    }

    @Override // y8.j
    public int t() {
        return this.az;
    }

    @Override // y8.j
    public void ty(j.InterfaceC1280j interfaceC1280j) {
        this.Ik = interfaceC1280j;
    }

    @Override // y8.w6.n
    public void xMQ() {
        if (!this.f76714O) {
            clear();
            return;
        }
        wVf.j jVar = this.J2;
        if (jVar != null) {
            jVar.onStop();
        }
    }
}
