package gL;

import B.z;
import FQq.SPz;
import FQq.UGc;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import x0.Xo;
import x0.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Ml extends n {
    private final Paint E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final UGc f67496N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final RectF f67497T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Rect f67498X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f67499e;
    private B.j nHg;
    private Xo.j rV9;
    private B.j s7N;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Xo f67500v;
    private B.w6 wTp;

    private Bitmap Xw() {
        Bitmap bitmap;
        B.j jVar = this.s7N;
        if (jVar != null && (bitmap = (Bitmap) jVar.KN()) != null) {
            return bitmap;
        }
        Bitmap bitmapX = this.ck.X(this.Ik.ty());
        if (bitmapX != null) {
            return bitmapX;
        }
        UGc uGc = this.f67496N;
        if (uGc != null) {
            return uGc.rl();
        }
        return null;
    }

    Ml(com.airbnb.lottie.Xo xo, I28 i28) {
        super(xo, i28);
        this.E2 = new H.j(3);
        this.f67499e = new Rect();
        this.f67498X = new Rect();
        this.f67497T = new RectF();
        this.f67496N = xo.Xw(i28.ty());
        if (nY() != null) {
            this.wTp = new B.w6(this, this, nY());
        }
    }

    @Override // gL.n, ES.Wre
    public void J2(Object obj, Ect.w6 w6Var) {
        B.w6 w6Var2;
        B.w6 w6Var3;
        B.w6 w6Var4;
        B.w6 w6Var5;
        B.w6 w6Var6;
        super.J2(obj, w6Var);
        if (obj == SPz.s7N) {
            if (w6Var == null) {
                this.nHg = null;
                return;
            } else {
                this.nHg = new z(w6Var);
                return;
            }
        }
        if (obj == SPz.rV9) {
            if (w6Var == null) {
                this.s7N = null;
                return;
            } else {
                this.s7N = new z(w6Var);
                return;
            }
        }
        if (obj == SPz.f2544O && (w6Var6 = this.wTp) != null) {
            w6Var6.t(w6Var);
            return;
        }
        if (obj == SPz.f2547X && (w6Var5 = this.wTp) != null) {
            w6Var5.J2(w6Var);
            return;
        }
        if (obj == SPz.f2546T && (w6Var4 = this.wTp) != null) {
            w6Var4.nr(w6Var);
            return;
        }
        if (obj == SPz.f2543N && (w6Var3 = this.wTp) != null) {
            w6Var3.O(w6Var);
        } else if (obj == SPz.nHg && (w6Var2 = this.wTp) != null) {
            w6Var2.Uo(w6Var);
        }
    }

    @Override // gL.n, ef.I28
    public void KN(RectF rectF, Matrix matrix, boolean z2) {
        super.KN(rectF, matrix, z2);
        if (this.f67496N != null) {
            float fO = eO.O();
            if (this.ck.jB()) {
                rectF.set(0.0f, 0.0f, this.f67496N.J2() * fO, this.f67496N.nr() * fO);
            } else {
                rectF.set(0.0f, 0.0f, Xw().getWidth() * fO, Xw().getHeight() * fO);
            }
            this.HI.mapRect(rectF);
        }
    }

    @Override // gL.n
    public void XQ(Canvas canvas, Matrix matrix, int i2, x0.Ml ml) {
        Bitmap bitmapXw = Xw();
        if (bitmapXw != null && !bitmapXw.isRecycled() && this.f67496N != null) {
            float fO = eO.O();
            this.E2.setAlpha(i2);
            B.j jVar = this.nHg;
            if (jVar != null) {
                this.E2.setColorFilter((ColorFilter) jVar.KN());
            }
            B.w6 w6Var = this.wTp;
            if (w6Var != null) {
                ml = w6Var.rl(matrix, i2);
            }
            boolean z2 = false;
            this.f67499e.set(0, 0, bitmapXw.getWidth(), bitmapXw.getHeight());
            if (this.ck.jB()) {
                this.f67498X.set(0, 0, (int) (this.f67496N.J2() * fO), (int) (this.f67496N.nr() * fO));
            } else {
                this.f67498X.set(0, 0, (int) (bitmapXw.getWidth() * fO), (int) (bitmapXw.getHeight() * fO));
            }
            if (ml != null) {
                z2 = true;
            }
            if (z2) {
                if (this.f67500v == null) {
                    this.f67500v = new Xo();
                }
                if (this.rV9 == null) {
                    this.rV9 = new Xo.j();
                }
                this.rV9.J2();
                ml.nr(i2, this.rV9);
                RectF rectF = this.f67497T;
                Rect rect = this.f67498X;
                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                matrix.mapRect(this.f67497T);
                canvas = this.f67500v.xMQ(canvas, this.f67497T, this.rV9);
            }
            canvas.save();
            canvas.concat(matrix);
            canvas.drawBitmap(bitmapXw, this.f67499e, this.f67498X, this.E2);
            if (z2) {
                this.f67500v.O();
            }
            canvas.restore();
        }
    }
}
