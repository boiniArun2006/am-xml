package com.airbnb.lottie;

import FQq.SPz;
import FQq.afx;
import FQq.nKK;
import FQq.s4;
import FQq.u;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import c.UGc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Xo extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final boolean f43926G7;
    private static final Executor eWT;
    private static final List fcU;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Bitmap f43927B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Runnable f43928C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Rect f43929D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private nKK f43930E;
    private O.j E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private final Matrix f43931FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private Rect f43932GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Paint f43933I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Canvas f43934J;
    private boolean J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f43935M;
    private boolean M7;
    private float Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f43936N;
    private Rect Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f43937O;
    private boolean P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private O.n f43938S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final eO f43939T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f43940U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    String f43941X;
    private gL.w6 Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private RectF f43942Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final ArrayList f43943Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RectF f43944a;
    private Matrix dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f43945e;
    private boolean eF;
    private final ValueAnimator.AnimatorUpdateListener eTf;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f43946g;
    private boolean ijL;
    private int jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RectF f43947k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private FQq.j f43948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private FQq.Dsr f43949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n f43950o;
    private Runnable ofS;
    private boolean p5;
    private Handler pJg;
    private Matrix piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f43951r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final x0.aC f43952t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f43953v;
    private final Semaphore xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float[] f43954z;

    /* JADX INFO: Access modifiers changed from: private */
    interface j {
        void n(FQq.Dsr dsr);
    }

    private enum n {
        NONE,
        PLAY,
        RESUME
    }

    public u J() {
        return null;
    }

    public void a63(u uVar) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    static {
        f43926G7 = Build.VERSION.SDK_INT <= 25;
        fcU = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        eWT = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new x0.fuX());
    }

    private boolean QZ6() {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            return false;
        }
        float f3 = this.Mx;
        float fQie = this.f43952t.qie();
        this.Mx = fQie;
        return Math.abs(fQie - f3) * dsr.nr() >= 50.0f;
    }

    private void S(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void ViF(Canvas canvas, Matrix matrix, gL.w6 w6Var, int i2) {
        if (!this.f43935M) {
            w6Var.Uo(canvas, matrix, i2, null);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        piY(canvas, w6Var);
        canvas.restore();
    }

    private void WPU(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void XQ() {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            return;
        }
        this.f43935M = this.f43930E.rl(Build.VERSION.SDK_INT, dsr.Ik(), dsr.az());
    }

    private void eTf(RectF rectF, float f3, float f4) {
        rectF.set(rectF.left * f3, rectF.top * f4, rectF.right * f3, rectF.bottom * f4);
    }

    private void fD() {
        if (this.f43934J != null) {
            return;
        }
        this.f43934J = new Canvas();
        this.f43947k = new RectF();
        this.dR0 = new Matrix();
        this.piY = new Matrix();
        this.f43929D = new Rect();
        this.f43944a = new RectF();
        this.f43933I = new H.j();
        this.f43932GR = new Rect();
        this.Nxk = new Rect();
        this.f43942Y = new RectF();
    }

    public static /* synthetic */ void gh(final Xo xo) {
        gL.w6 w6Var = xo.Xw;
        if (w6Var == null) {
            return;
        }
        try {
            xo.xg.acquire();
            w6Var.v(xo.f43952t.qie());
            if (f43926G7 && xo.ijL) {
                if (xo.pJg == null) {
                    xo.pJg = new Handler(Looper.getMainLooper());
                    xo.ofS = new Runnable() { // from class: FQq.QJ
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.airbnb.lottie.Xo.ty(this.f2542n);
                        }
                    };
                }
                xo.pJg.post(xo.ofS);
            }
            xo.xg.release();
        } catch (InterruptedException unused) {
            xo.xg.release();
        } catch (Throwable th) {
            xo.xg.release();
            throw th;
        }
    }

    private void iF(int i2, int i3) {
        Bitmap bitmap = this.f43927B;
        if (bitmap == null || bitmap.getWidth() < i2 || this.f43927B.getHeight() < i3) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            this.f43927B = bitmapCreateBitmap;
            this.f43934J.setBitmap(bitmapCreateBitmap);
            this.ijL = true;
            return;
        }
        if (this.f43927B.getWidth() > i2 || this.f43927B.getHeight() > i3) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f43927B, 0, 0, i2, i3);
            this.f43927B = bitmapCreateBitmap2;
            this.f43934J.setBitmap(bitmapCreateBitmap2);
            this.ijL = true;
        }
    }

    private void nY(Canvas canvas) {
        gL.w6 w6Var = this.Xw;
        FQq.Dsr dsr = this.f43949n;
        if (w6Var == null || dsr == null) {
            return;
        }
        this.f43931FX.reset();
        if (!getBounds().isEmpty()) {
            this.f43931FX.preTranslate(r2.left, r2.top);
            this.f43931FX.preScale(r2.width() / dsr.rl().width(), r2.height() / dsr.rl().height());
        }
        w6Var.Uo(canvas, this.f43931FX, this.jB, null);
    }

    private void o() {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            return;
        }
        gL.w6 w6Var = new gL.w6(this, UGc.n(dsr), dsr.gh(), dsr);
        this.Xw = w6Var;
        if (this.P5) {
            w6Var.s7N(true);
        }
        this.Xw.jB(this.f43953v);
    }

    private void piY(Canvas canvas, gL.w6 w6Var) {
        if (this.f43949n == null || w6Var == null) {
            return;
        }
        fD();
        canvas.getMatrix(this.dR0);
        canvas.getClipBounds(this.f43929D);
        S(this.f43929D, this.f43944a);
        this.dR0.mapRect(this.f43944a);
        WPU(this.f43944a, this.f43929D);
        if (this.f43953v) {
            this.f43947k.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            w6Var.KN(this.f43947k, null, false);
        }
        this.dR0.mapRect(this.f43947k);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        eTf(this.f43947k, fWidth, fHeight);
        if (!a()) {
            RectF rectF = this.f43947k;
            Rect rect = this.f43929D;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f43947k.width());
        int iCeil2 = (int) Math.ceil(this.f43947k.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        iF(iCeil, iCeil2);
        if (this.ijL) {
            this.dR0.getValues(this.f43954z);
            float[] fArr = this.f43954z;
            float f3 = fArr[0];
            float f4 = fArr[4];
            this.f43931FX.set(this.dR0);
            this.f43931FX.preScale(fWidth, fHeight);
            Matrix matrix = this.f43931FX;
            RectF rectF2 = this.f43947k;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f43931FX.postScale(1.0f / f3, 1.0f / f4);
            this.f43927B.eraseColor(0);
            this.f43934J.setMatrix(x0.eO.f75176n);
            this.f43934J.scale(f3, f4);
            w6Var.Uo(this.f43934J, this.f43931FX, this.jB, null);
            this.dR0.invert(this.piY);
            this.piY.mapRect(this.f43942Y, this.f43947k);
            WPU(this.f43942Y, this.Nxk);
        }
        this.f43932GR.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f43927B, this.f43932GR, this.Nxk, this.f43933I);
    }

    private O.n rV9() {
        O.n nVar = this.f43938S;
        if (nVar != null && !nVar.rl(s7N())) {
            this.f43938S = null;
        }
        if (this.f43938S == null) {
            this.f43938S = new O.n(getCallback(), this.f43946g, null, this.f43949n.mUb());
        }
        return this.f43938S;
    }

    public float B() {
        return this.f43952t.Ik();
    }

    public void C(boolean z2) {
        if (z2 != this.eF) {
            this.eF = z2;
            invalidateSelf();
        }
    }

    public Typeface D(ES.w6 w6Var) {
        Map map = this.f43945e;
        if (map != null) {
            String strN = w6Var.n();
            if (map.containsKey(strN)) {
                return (Typeface) map.get(strN);
            }
            String strRl = w6Var.rl();
            if (map.containsKey(strRl)) {
                return (Typeface) map.get(strRl);
            }
            String str = w6Var.n() + "-" + w6Var.t();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        O.j jVarWTp = wTp();
        if (jVarWTp != null) {
            return jVarWTp.rl(w6Var);
        }
        return null;
    }

    public nKK E() {
        return this.f43935M ? nKK.SOFTWARE : nKK.HARDWARE;
    }

    public FQq.j E2() {
        FQq.j jVar = this.f43948m;
        return jVar != null ? jVar : FQq.I28.nr();
    }

    public void ER(nKK nkk) {
        this.f43930E = nkk;
        XQ();
    }

    public void EWS(final String str) {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr2) {
                    this.f43963n.EWS(str);
                }
            });
            return;
        }
        ES.fuX fuxQie = dsr.qie(str);
        if (fuxQie != null) {
            int i2 = (int) fuxQie.rl;
            Po6(i2, ((int) fuxQie.f2311t) + i2);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void F(boolean z2) {
        this.f43952t.e(z2);
    }

    public int FX() {
        return this.f43952t.getRepeatMode();
    }

    public boolean G7(FQq.Dsr dsr) {
        if (this.f43949n == dsr) {
            return false;
        }
        this.ijL = true;
        Z();
        this.f43949n = dsr;
        o();
        this.f43952t.nY(dsr);
        tUK(this.f43952t.getAnimatedFraction());
        Iterator it = new ArrayList(this.f43943Z).iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar != null) {
                jVar.n(dsr);
            }
            it.remove();
        }
        this.f43943Z.clear();
        dsr.WPU(this.f43940U);
        XQ();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void GD(final float f3) {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.Wre
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr2) {
                    this.f43925n.GD(f3);
                }
            });
        } else {
            this.f43952t.te(x0.o.xMQ(dsr.ck(), this.f43949n.J2(), f3));
        }
    }

    public void HV(final String str) {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.Dsr
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr2) {
                    this.f43897n.HV(str);
                }
            });
            return;
        }
        ES.fuX fuxQie = dsr.qie(str);
        if (fuxQie != null) {
            Org((int) (fuxQie.rl + fuxQie.f2311t));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void How(boolean z2) {
        this.f43940U = z2;
        FQq.Dsr dsr = this.f43949n;
        if (dsr != null) {
            dsr.WPU(z2);
        }
    }

    public boolean I() {
        x0.aC aCVar = this.f43952t;
        if (aCVar == null) {
            return false;
        }
        return aCVar.isRunning();
    }

    public void Ik(final ES.I28 i28, final Object obj, final Ect.w6 w6Var) {
        gL.w6 w6Var2 = this.Xw;
        if (w6Var2 == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.I28
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr) {
                    this.f43898n.Ik(i28, obj, w6Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (i28 == ES.I28.f2305t) {
            w6Var2.J2(obj, w6Var);
        } else if (i28.nr() != null) {
            i28.nr().J2(obj, w6Var);
        } else {
            List listIjL = ijL(i28);
            for (int i2 = 0; i2 < listIjL.size(); i2++) {
                ((ES.I28) listIjL.get(i2)).nr().J2(obj, w6Var);
            }
            zIsEmpty = true ^ listIjL.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == SPz.E2) {
                tUK(eF());
            }
        }
    }

    public void Jk(boolean z2) {
        this.J2 = z2;
    }

    public void K(boolean z2) {
        if (this.P5 == z2) {
            return;
        }
        this.P5 = z2;
        gL.w6 w6Var = this.Xw;
        if (w6Var != null) {
            w6Var.s7N(z2);
        }
    }

    public int M() {
        return this.f43952t.getRepeatCount();
    }

    public float M7() {
        return this.f43952t.ck();
    }

    public void Mx(boolean z2) {
        if (z2 != this.f43953v) {
            this.f43953v = z2;
            gL.w6 w6Var = this.Xw;
            if (w6Var != null) {
                w6Var.jB(z2);
            }
            invalidateSelf();
        }
    }

    public boolean N() {
        return this.f43953v;
    }

    public boolean Nxk() {
        return this.M7;
    }

    public void Org(final int i2) {
        if (this.f43949n == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.w6
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr) {
                    this.f43966n.Org(i2);
                }
            });
        } else {
            this.f43952t.te(i2 + 0.99f);
        }
    }

    public float P5() {
        return this.f43952t.HI();
    }

    public void Po6(final int i2, final int i3) {
        if (this.f43949n == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.CN3
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr) {
                    this.f43895n.Po6(i2, i3);
                }
            });
        } else {
            this.f43952t.iF(i2, i3 + 0.99f);
        }
    }

    public void RQ(float f3) {
        this.f43952t.E2(f3);
    }

    public void Rl(FQq.w6 w6Var) {
        O.n nVar = this.f43938S;
        if (nVar != null) {
            nVar.nr(w6Var);
        }
    }

    public boolean T() {
        return this.eF;
    }

    public ES.fuX U() {
        Iterator it = fcU.iterator();
        ES.fuX fuxQie = null;
        while (it.hasNext()) {
            fuxQie = this.f43949n.qie((String) it.next());
            if (fuxQie != null) {
                break;
            }
        }
        return fuxQie;
    }

    public void UhV(final String str) {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.aC
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr2) {
                    this.f43958n.UhV(str);
                }
            });
            return;
        }
        ES.fuX fuxQie = dsr.qie(str);
        if (fuxQie != null) {
            hRu((int) fuxQie.rl);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void W(boolean z2) {
        this.f43951r = z2;
    }

    public FQq.UGc Xw(String str) {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            return null;
        }
        return (FQq.UGc) dsr.mUb().get(str);
    }

    public boolean Y() {
        return this.p5;
    }

    public void Z() {
        if (this.f43952t.isRunning()) {
            this.f43952t.cancel();
            if (!isVisible()) {
                this.f43950o = n.NONE;
            }
        }
        this.f43949n = null;
        this.Xw = null;
        this.f43938S = null;
        this.Mx = -3.4028235E38f;
        this.f43952t.mUb();
        invalidateSelf();
    }

    public void aYN(Canvas canvas, Matrix matrix) {
        gL.w6 w6Var = this.Xw;
        FQq.Dsr dsr = this.f43949n;
        if (w6Var == null || dsr == null) {
            return;
        }
        boolean zE = e();
        if (zE) {
            try {
                this.xg.acquire();
                if (QZ6()) {
                    tUK(this.f43952t.qie());
                }
            } catch (InterruptedException unused) {
                if (!zE) {
                    return;
                }
                this.xg.release();
                if (w6Var.Xw() == this.f43952t.qie()) {
                    return;
                }
            } catch (Throwable th) {
                if (zE) {
                    this.xg.release();
                    if (w6Var.Xw() != this.f43952t.qie()) {
                        eWT.execute(this.f43928C);
                    }
                }
                throw th;
            }
        }
        if (this.f43951r) {
            try {
                ViF(canvas, matrix, w6Var, this.jB);
            } catch (Throwable th2) {
                x0.CN3.rl("Lottie crashed in draw!", th2);
            }
        } else {
            ViF(canvas, matrix, w6Var, this.jB);
        }
        this.ijL = false;
        if (zE) {
            this.xg.release();
            if (w6Var.Xw() == this.f43952t.qie()) {
                return;
            }
            eWT.execute(this.f43928C);
        }
    }

    public String bzg() {
        return this.f43946g;
    }

    public void dR0() {
        this.f43943Z.clear();
        this.f43952t.o();
        if (isVisible()) {
            return;
        }
        this.f43950o = n.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        gL.w6 w6Var = this.Xw;
        if (w6Var == null) {
            return;
        }
        boolean zE = e();
        if (zE) {
            try {
                this.xg.acquire();
            } catch (InterruptedException unused) {
                if (FQq.I28.KN()) {
                    FQq.I28.t("Drawable#draw");
                }
                if (!zE) {
                    return;
                }
                this.xg.release();
                if (w6Var.Xw() == this.f43952t.qie()) {
                    return;
                }
            } catch (Throwable th) {
                if (FQq.I28.KN()) {
                    FQq.I28.t("Drawable#draw");
                }
                if (zE) {
                    this.xg.release();
                    if (w6Var.Xw() != this.f43952t.qie()) {
                        eWT.execute(this.f43928C);
                    }
                }
                throw th;
            }
        }
        if (FQq.I28.KN()) {
            FQq.I28.rl("Drawable#draw");
        }
        if (zE && QZ6()) {
            tUK(this.f43952t.qie());
        }
        if (this.f43951r) {
            try {
                if (this.f43935M) {
                    piY(canvas, w6Var);
                } else {
                    nY(canvas);
                }
            } catch (Throwable th2) {
                x0.CN3.rl("Lottie crashed in draw!", th2);
            }
        } else if (this.f43935M) {
            piY(canvas, w6Var);
        } else {
            nY(canvas);
        }
        this.ijL = false;
        if (FQq.I28.KN()) {
            FQq.I28.t("Drawable#draw");
        }
        if (zE) {
            this.xg.release();
            if (w6Var.Xw() == this.f43952t.qie()) {
                return;
            }
            eWT.execute(this.f43928C);
        }
    }

    public float eF() {
        return this.f43952t.qie();
    }

    public void eWT(FQq.n nVar) {
        O.j jVar = this.E2;
        if (jVar != null) {
            jVar.nr(nVar);
        }
    }

    public void fcU(String str) {
        this.f43941X = str;
        O.j jVarWTp = wTp();
        if (jVarWTp != null) {
            jVarWTp.t(str);
        }
    }

    public void g(s4 s4Var, boolean z2) {
        boolean zN = this.f43939T.n(s4Var, z2);
        if (this.f43949n == null || !zN) {
            return;
        }
        o();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.jB;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            return -1;
        }
        return dsr.rl().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            return -1;
        }
        return dsr.rl().width();
    }

    public void hRu(final int i2) {
        if (this.f43949n == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.Ml
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr) {
                    this.f43923n.hRu(i2);
                }
            });
        } else {
            this.f43952t.fD(i2);
        }
    }

    public void i(final float f3) {
        FQq.Dsr dsr = this.f43949n;
        if (dsr == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.o
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr2) {
                    this.f43964n.i(f3);
                }
            });
        } else {
            hRu((int) x0.o.xMQ(dsr.ck(), this.f43949n.J2(), f3));
        }
    }

    public List ijL(ES.I28 i28) {
        if (this.Xw == null) {
            x0.CN3.t("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.Xw.O(i28, 0, arrayList, new ES.I28(new String[0]));
        return arrayList;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.ijL) {
            return;
        }
        this.ijL = true;
        if ((!f43926G7 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean jB() {
        return this.f43936N;
    }

    public boolean k(s4 s4Var) {
        return this.f43939T.rl(s4Var);
    }

    public void kSg(int i2) {
        this.f43952t.setRepeatMode(i2);
    }

    public void lLA(int i2) {
        this.f43952t.setRepeatCount(i2);
    }

    public void m() {
        if (this.Xw == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.fuX
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr) {
                    this.f43962n.m();
                }
            });
            return;
        }
        XQ();
        if (r(s7N()) || M() == 0) {
            if (isVisible()) {
                this.f43952t.aYN();
                this.f43950o = n.NONE;
            } else {
                this.f43950o = n.RESUME;
            }
        }
        if (r(s7N())) {
            return;
        }
        n1((int) (B() < 0.0f ? M7() : P5()));
        this.f43952t.gh();
        if (isVisible()) {
            return;
        }
        this.f43950o = n.NONE;
    }

    public void mYa(boolean z2) {
        this.f43936N = z2;
    }

    public void n1(final int i2) {
        if (this.f43949n == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.Pl
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr) {
                    this.f43924n.n1(i2);
                }
            });
        } else {
            this.f43952t.g(i2);
        }
    }

    public FQq.Dsr nHg() {
        return this.f43949n;
    }

    public void ofS(FQq.j jVar) {
        this.f43948m = jVar;
    }

    public afx p5() {
        FQq.Dsr dsr = this.f43949n;
        if (dsr != null) {
            return dsr.ty();
        }
        return null;
    }

    public void pJg(boolean z2) {
        this.p5 = z2;
    }

    public void qm(String str) {
        this.f43946g = str;
    }

    public boolean r(Context context) {
        if (this.J2) {
            return true;
        }
        return this.f43937O && FQq.I28.J2().n(context) == lr.j.f70571n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.jB = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        x0.CN3.t("Use addColorFilter instead.");
    }

    public boolean tFV() {
        return this.f43945e == null && this.f43949n.t().ck() > 0;
    }

    public void tUK(final float f3) {
        if (this.f43949n == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.qz
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr) {
                    this.f43965n.tUK(f3);
                }
            });
            return;
        }
        if (FQq.I28.KN()) {
            FQq.I28.rl("Drawable#setProgress");
        }
        this.f43952t.g(this.f43949n.KN(f3));
        if (FQq.I28.KN()) {
            FQq.I28.t("Drawable#setProgress");
        }
    }

    public void te() {
        this.f43943Z.clear();
        this.f43952t.gh();
        if (isVisible()) {
            return;
        }
        this.f43950o = n.NONE;
    }

    public void ul(Map map) {
        if (map == this.f43945e) {
            return;
        }
        this.f43945e = map;
        invalidateSelf();
    }

    public int v() {
        return (int) this.f43952t.az();
    }

    public void xg(boolean z2) {
        this.M7 = z2;
    }

    public void z() {
        if (this.Xw == null) {
            this.f43943Z.add(new j() { // from class: com.airbnb.lottie.C
                @Override // com.airbnb.lottie.Xo.j
                public final void n(FQq.Dsr dsr) {
                    this.f43894n.z();
                }
            });
            return;
        }
        XQ();
        if (r(s7N()) || M() == 0) {
            if (isVisible()) {
                this.f43952t.Z();
                this.f43950o = n.NONE;
            } else {
                this.f43950o = n.PLAY;
            }
        }
        if (r(s7N())) {
            return;
        }
        ES.fuX fuxU = U();
        if (fuxU != null) {
            n1((int) fuxU.rl);
        } else {
            n1((int) (B() < 0.0f ? M7() : P5()));
        }
        this.f43952t.gh();
        if (isVisible()) {
            return;
        }
        this.f43950o = n.NONE;
    }

    public Xo() {
        x0.aC aCVar = new x0.aC();
        this.f43952t = aCVar;
        this.f43937O = true;
        this.J2 = false;
        this.f43951r = false;
        this.f43950o = n.NONE;
        this.f43943Z = new ArrayList();
        this.f43939T = new eO();
        this.f43936N = false;
        this.f43953v = true;
        this.jB = 255;
        this.eF = false;
        this.f43930E = nKK.AUTOMATIC;
        this.f43935M = false;
        this.f43931FX = new Matrix();
        this.f43954z = new float[9];
        this.ijL = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: FQq.l3D
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.airbnb.lottie.Xo.Uo(this.f2576n, valueAnimator);
            }
        };
        this.eTf = animatorUpdateListener;
        this.xg = new Semaphore(1);
        this.f43928C = new Runnable() { // from class: FQq.c
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.Xo.gh(this.f2567n);
            }
        };
        this.Mx = -3.4028235E38f;
        aCVar.addUpdateListener(animatorUpdateListener);
    }

    public static /* synthetic */ void Uo(Xo xo, ValueAnimator valueAnimator) {
        if (xo.e()) {
            xo.invalidateSelf();
            return;
        }
        gL.w6 w6Var = xo.Xw;
        if (w6Var != null) {
            w6Var.v(xo.f43952t.qie());
        }
    }

    private boolean a() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (!(((View) callback).getParent() instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) r0).getClipChildren();
    }

    private Context s7N() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public static /* synthetic */ void ty(Xo xo) {
        Drawable.Callback callback = xo.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(xo);
        }
    }

    private O.j wTp() {
        if (getCallback() == null) {
            return null;
        }
        if (this.E2 == null) {
            O.j jVar = new O.j(getCallback(), null);
            this.E2 = jVar;
            String str = this.f43941X;
            if (str != null) {
                jVar.t(str);
            }
        }
        return this.E2;
    }

    boolean GR() {
        if (isVisible()) {
            return this.f43952t.isRunning();
        }
        n nVar = this.f43950o;
        if (nVar != n.PLAY && nVar != n.RESUME) {
            return false;
        }
        return true;
    }

    public Bitmap X(String str) {
        O.n nVarRV9 = rV9();
        if (nVarRV9 != null) {
            return nVarRV9.n(str);
        }
        return null;
    }

    public boolean e() {
        if (E2() == FQq.j.ENABLED) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return I();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z2, z3);
        if (z2) {
            n nVar = this.f43950o;
            if (nVar == n.PLAY) {
                z();
                return visible;
            }
            if (nVar == n.RESUME) {
                m();
                return visible;
            }
        } else {
            if (this.f43952t.isRunning()) {
                dR0();
                this.f43950o = n.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f43950o = n.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        z();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        te();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
