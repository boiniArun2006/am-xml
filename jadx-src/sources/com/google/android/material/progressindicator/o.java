package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.math.MathUtils;
import com.google.android.material.progressindicator.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class o extends Dsr {
    private float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f59125O;
    private float nr;
    private float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f59126t;

    private void KN(Canvas canvas, Paint paint, float f3, float f4, int i2, int i3, int i5) {
        float f5;
        float fN = MathUtils.n(f3, 0.0f, 1.0f);
        float fN2 = MathUtils.n(f4, 0.0f, 1.0f);
        float fRl = ZB.j.rl(1.0f - this.J2, 1.0f, fN);
        float fRl2 = ZB.j.rl(1.0f - this.J2, 1.0f, fN2);
        int iN = (int) ((i3 * MathUtils.n(fRl, 0.0f, 0.01f)) / 0.01f);
        int iN2 = (int) ((i5 * (1.0f - MathUtils.n(fRl2, 0.99f, 1.0f))) / 0.01f);
        float f6 = this.rl;
        int i7 = (int) ((fRl * f6) + iN);
        int i8 = (int) ((fRl2 * f6) - iN2);
        float f7 = (-f6) / 2.0f;
        if (i7 <= i8) {
            float f8 = this.nr;
            float f9 = i7 + f8;
            float f10 = i8 - f8;
            float f11 = f8 * 2.0f;
            paint.setColor(i2);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f59126t);
            if (f9 >= f10) {
                mUb(canvas, paint, new PointF(f9 + f7, 0.0f), new PointF(f10 + f7, 0.0f), f11, this.f59126t);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f59125O ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f12 = f9 + f7;
            float f13 = f10 + f7;
            canvas.drawLine(f12, 0.0f, f13, 0.0f, paint);
            if (this.f59125O || this.nr <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f9 > 0.0f) {
                f5 = f11;
                xMQ(canvas, paint, new PointF(f12, 0.0f), f5, this.f59126t);
            } else {
                f5 = f11;
            }
            if (f10 < this.rl) {
                xMQ(canvas, paint, new PointF(f13, 0.0f), f5, this.f59126t);
            }
        }
    }

    private void xMQ(Canvas canvas, Paint paint, PointF pointF, float f3, float f4) {
        mUb(canvas, paint, pointF, null, f3, f4);
    }

    @Override // com.google.android.material.progressindicator.Dsr
    int J2() {
        return -1;
    }

    private void mUb(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f3, float f4) {
        float fMin = Math.min(f4, this.f59126t);
        float f5 = f3 / 2.0f;
        float fMin2 = Math.min(f5, (this.nr * fMin) / this.f59126t);
        RectF rectF = new RectF((-f3) / 2.0f, (-fMin) / 2.0f, f5, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.Dsr
    int O() {
        return ((Xo) this.f59080n).f59123n;
    }

    @Override // com.google.android.material.progressindicator.Dsr
    void t(Canvas canvas, Paint paint, Dsr.j jVar, int i2) {
        int iN = W3.j.n(jVar.f59082t, i2);
        float f3 = jVar.f59081n;
        float f4 = jVar.rl;
        int i3 = jVar.nr;
        KN(canvas, paint, f3, f4, iN, i3, i3);
    }

    o(Xo xo) {
        super(xo);
        this.rl = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.Dsr
    void n(Canvas canvas, Rect rect, float f3, boolean z2, boolean z3) {
        boolean z4;
        this.rl = rect.width();
        float f4 = ((Xo) this.f59080n).f59123n;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - f4) / 2.0f));
        if (((Xo) this.f59080n).mUb) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f5 = this.rl / 2.0f;
        float f6 = f4 / 2.0f;
        canvas.clipRect(-f5, -f6, f5, f6);
        n nVar = this.f59080n;
        if (((Xo) nVar).f59123n / 2 == ((Xo) nVar).rl) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f59125O = z4;
        this.f59126t = ((Xo) nVar).f59123n * f3;
        this.nr = Math.min(((Xo) nVar).f59123n / 2, ((Xo) nVar).rl) * f3;
        if (z2 || z3) {
            if ((z2 && ((Xo) this.f59080n).f59122O == 2) || (z3 && ((Xo) this.f59080n).J2 == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z2 || (z3 && ((Xo) this.f59080n).J2 != 3)) {
                canvas.translate(0.0f, (((Xo) this.f59080n).f59123n * (1.0f - f3)) / 2.0f);
            }
        }
        if (z3 && ((Xo) this.f59080n).J2 == 3) {
            this.J2 = f3;
        } else {
            this.J2 = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.Dsr
    void nr(Canvas canvas, Paint paint, float f3, float f4, int i2, int i3, int i5) {
        KN(canvas, paint, f3, f4, W3.j.n(i2, i3), i5, i5);
    }

    @Override // com.google.android.material.progressindicator.Dsr
    void rl(Canvas canvas, Paint paint, int i2, int i3) {
        int iN = W3.j.n(i2, i3);
        if (((Xo) this.f59080n).gh > 0 && iN != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(iN);
            PointF pointF = new PointF((this.rl / 2.0f) - (this.f59126t / 2.0f), 0.0f);
            n nVar = this.f59080n;
            xMQ(canvas, paint, pointF, ((Xo) nVar).gh, ((Xo) nVar).gh);
        }
    }
}
