package Szt;

import X1.I28;
import X1.n;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j implements X1.j {
    private final int[] J2;
    private final X1.n[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int[] f10117O;
    private final int Uo;
    private Bitmap az;
    private final boolean gh;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i4.j f10118n;
    private final Rect nr;
    private final Paint qie;
    private final I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final X1.w6 f10119t;
    private final Rect xMQ = new Rect();
    private final Rect mUb = new Rect();

    private synchronized Bitmap HI(int i2, int i3) {
        try {
            Bitmap bitmap = this.az;
            if (bitmap != null && (bitmap.getWidth() < i2 || this.az.getHeight() < i3)) {
                qie();
            }
            if (this.az == null) {
                this.az = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            }
            this.az.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.az;
    }

    private static Rect az(X1.w6 w6Var, Rect rect) {
        return rect == null ? new Rect(0, 0, w6Var.getWidth(), w6Var.getHeight()) : new Rect(0, 0, Math.min(rect.width(), w6Var.getWidth()), Math.min(rect.height(), w6Var.getHeight()));
    }

    private synchronized void qie() {
        Bitmap bitmap = this.az;
        if (bitmap != null) {
            bitmap.recycle();
            this.az = null;
        }
    }

    private void Ik(Canvas canvas, X1.Ml ml) {
        double dWidth = ((double) this.nr.width()) / ((double) this.f10119t.getWidth());
        double dHeight = ((double) this.nr.height()) / ((double) this.f10119t.getHeight());
        int iRound = (int) Math.round(((double) ml.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) ml.getHeight()) * dHeight);
        int iT = (int) (((double) ml.t()) * dWidth);
        int iNr = (int) (((double) ml.nr()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.nr.width();
                int iHeight = this.nr.height();
                HI(iWidth, iHeight);
                Bitmap bitmap = this.az;
                if (bitmap != null) {
                    ml.rl(iRound, iRound2, bitmap);
                }
                this.xMQ.set(0, 0, iWidth, iHeight);
                this.mUb.set(iT, iNr, iWidth + iT, iHeight + iNr);
                Bitmap bitmap2 = this.az;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.xMQ, this.mUb, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void ck(Canvas canvas, X1.Ml ml) {
        int width;
        int height;
        int iT;
        int iNr;
        if (this.gh) {
            float fMax = Math.max(ml.getWidth() / Math.min(ml.getWidth(), canvas.getWidth()), ml.getHeight() / Math.min(ml.getHeight(), canvas.getHeight()));
            width = (int) (ml.getWidth() / fMax);
            height = (int) (ml.getHeight() / fMax);
            iT = (int) (ml.t() / fMax);
            iNr = (int) (ml.nr() / fMax);
        } else {
            width = ml.getWidth();
            height = ml.getHeight();
            iT = ml.t();
            iNr = ml.nr();
        }
        synchronized (this) {
            Bitmap bitmapHI = HI(width, height);
            this.az = bitmapHI;
            ml.rl(width, height, bitmapHI);
            canvas.save();
            canvas.translate(iT, iNr);
            canvas.drawBitmap(this.az, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    private void o(Canvas canvas, X1.Ml ml, X1.n nVar, X1.n nVar2) {
        float f3;
        float f4;
        float f5;
        float f6;
        int width = this.f10119t.getWidth();
        int height = this.f10119t.getHeight();
        float f7 = width;
        float f8 = height;
        int width2 = ml.getWidth();
        int height2 = ml.getHeight();
        int iT = ml.t();
        int iNr = ml.nr();
        if (f7 > canvas.getWidth() || f8 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f9 = f7 / f8;
            if (iMin > iMin2) {
                f4 = iMin;
                f3 = f4 / f9;
            } else {
                f3 = iMin2;
                f4 = f3 * f9;
            }
            f5 = f4 / f7;
            f6 = f3 / f8;
            width2 = (int) Math.ceil(ml.getWidth() * f5);
            height2 = (int) Math.ceil(ml.getHeight() * f6);
            iT = (int) Math.ceil(ml.t() * f5);
            iNr = (int) Math.ceil(ml.nr() * f6);
        } else {
            f5 = 1.0f;
            f6 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(iT, iNr, iT + width2, iNr + height2);
        if (nVar2 != null) {
            ty(canvas, f5, f6, nVar2);
        }
        if (nVar.J2 == n.j.NO_BLEND) {
            canvas.drawRect(rect2, this.qie);
        }
        synchronized (this) {
            Bitmap bitmapHI = HI(width2, height2);
            ml.rl(width2, height2, bitmapHI);
            canvas.drawBitmap(bitmapHI, rect, rect2, (Paint) null);
        }
    }

    private void r(Canvas canvas, X1.Ml ml, X1.n nVar, X1.n nVar2) {
        Rect rect = this.nr;
        if (rect == null || rect.width() <= 0 || this.nr.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.nr.width();
        if (nVar2 != null) {
            ty(canvas, width, width, nVar2);
        }
        int width2 = ml.getWidth();
        int height = ml.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i2 = (int) (width2 * width);
        int i3 = (int) (height * width);
        int iT = (int) (ml.t() * width);
        int iNr = (int) (ml.nr() * width);
        Rect rect3 = new Rect(iT, iNr, i2 + iT, i3 + iNr);
        if (nVar.J2 == n.j.NO_BLEND) {
            canvas.drawRect(rect3, this.qie);
        }
        synchronized (this) {
            Bitmap bitmapHI = HI(width2, height);
            ml.rl(width2, height, bitmapHI);
            canvas.drawBitmap(bitmapHI, rect2, rect3, (Paint) null);
        }
    }

    private void ty(Canvas canvas, float f3, float f4, X1.n nVar) {
        if (nVar.Uo == n.EnumC0422n.DISPOSE_TO_BACKGROUND) {
            int iCeil = (int) Math.ceil(nVar.nr * f3);
            int iCeil2 = (int) Math.ceil(nVar.f11729O * f4);
            int iCeil3 = (int) Math.ceil(nVar.rl * f3);
            int iCeil4 = (int) Math.ceil(nVar.f11731t * f4);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.qie);
        }
    }

    @Override // X1.j
    public X1.j J2(Rect rect) {
        return az(this.f10119t, rect).equals(this.nr) ? this : new j(this.f10118n, this.rl, rect, this.gh);
    }

    @Override // X1.j
    public int KN() {
        return this.nr.height();
    }

    @Override // X1.j
    public void O(int i2, Canvas canvas) {
        X1.Ml mlUo = this.f10119t.Uo(i2);
        try {
            if (mlUo.getWidth() > 0 && mlUo.getHeight() > 0) {
                if (this.f10119t.t()) {
                    Ik(canvas, mlUo);
                } else {
                    ck(canvas, mlUo);
                }
                mlUo.n();
            }
        } finally {
            mlUo.n();
        }
    }

    @Override // X1.j
    public int Uo(int i2) {
        return this.f10117O[i2];
    }

    @Override // X1.j
    public int getHeight() {
        return this.f10119t.getHeight();
    }

    @Override // X1.j
    public int getWidth() {
        return this.f10119t.getWidth();
    }

    @Override // X1.j
    public I28 gh() {
        return this.rl;
    }

    @Override // X1.j
    public int mUb() {
        return this.nr.width();
    }

    @Override // X1.j
    public int n() {
        return this.f10119t.n();
    }

    @Override // X1.j
    public X1.n nr(int i2) {
        return this.KN[i2];
    }

    @Override // X1.j
    public int rl() {
        return this.f10119t.rl();
    }

    @Override // X1.j
    public int t() {
        return this.Uo;
    }

    @Override // X1.j
    public void xMQ(int i2, Canvas canvas) {
        X1.Ml mlUo = this.f10119t.Uo(i2);
        X1.n nVarNr = this.f10119t.nr(i2);
        X1.n nVarNr2 = i2 == 0 ? null : this.f10119t.nr(i2 - 1);
        try {
            if (mlUo.getWidth() > 0 && mlUo.getHeight() > 0) {
                if (this.f10119t.t()) {
                    o(canvas, mlUo, nVarNr, nVarNr2);
                } else {
                    r(canvas, mlUo, nVarNr, nVarNr2);
                }
                mlUo.n();
            }
        } finally {
            mlUo.n();
        }
    }

    public j(i4.j jVar, I28 i28, Rect rect, boolean z2) {
        this.f10118n = jVar;
        this.rl = i28;
        X1.w6 w6VarNr = i28.nr();
        this.f10119t = w6VarNr;
        int[] iArrXMQ = w6VarNr.xMQ();
        this.f10117O = iArrXMQ;
        jVar.n(iArrXMQ);
        this.Uo = jVar.t(iArrXMQ);
        this.J2 = jVar.rl(iArrXMQ);
        this.nr = az(w6VarNr, rect);
        this.gh = z2;
        this.KN = new X1.n[w6VarNr.n()];
        for (int i2 = 0; i2 < this.f10119t.n(); i2++) {
            this.KN[i2] = this.f10119t.nr(i2);
        }
        Paint paint = new Paint();
        this.qie = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
