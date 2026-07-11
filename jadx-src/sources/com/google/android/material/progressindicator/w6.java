package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class w6 extends Dsr {
    private float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f59130O;
    private float nr;
    private float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f59131t;

    @Override // com.google.android.material.progressindicator.Dsr
    void rl(Canvas canvas, Paint paint, int i2, int i3) {
    }

    private void KN(Canvas canvas, Paint paint, float f3, float f4, int i2, int i3, int i5) {
        float f5 = f4 >= f3 ? f4 - f3 : (f4 + 1.0f) - f3;
        float f6 = f3 % 1.0f;
        if (this.J2 < 1.0f) {
            float f7 = f6 + f5;
            if (f7 > 1.0f) {
                KN(canvas, paint, f6, 1.0f, i2, i3, 0);
                KN(canvas, paint, 1.0f, f7, i2, 0, i5);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f59131t / this.nr);
        if (f6 == 0.0f && f5 >= 0.99f) {
            f5 += ((f5 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fRl = ZB.j.rl(1.0f - this.J2, 1.0f, f6);
        float fRl2 = ZB.j.rl(0.0f, this.J2, f5);
        float degrees2 = (float) Math.toDegrees(i3 / this.nr);
        float degrees3 = ((fRl2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i5 / this.nr));
        float f8 = (fRl * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i2);
        paint.setStrokeWidth(this.rl);
        float f9 = degrees * 2.0f;
        if (degrees3 < f9) {
            float f10 = degrees3 / f9;
            paint.setStyle(Paint.Style.FILL);
            mUb(canvas, paint, f8 + (degrees * f10), this.f59131t * 2.0f, this.rl, f10);
            return;
        }
        float f11 = this.nr;
        RectF rectF = new RectF(-f11, -f11, f11, f11);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f59130O ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f12 = f8 + degrees;
        canvas.drawArc(rectF, f12, degrees3 - f9, false, paint);
        if (this.f59130O || this.f59131t <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        xMQ(canvas, paint, f12, this.f59131t * 2.0f, this.rl);
        xMQ(canvas, paint, (f8 + degrees3) - degrees, this.f59131t * 2.0f, this.rl);
    }

    private int gh() {
        n nVar = this.f59080n;
        return ((Wre) nVar).KN + (((Wre) nVar).xMQ * 2);
    }

    private void mUb(Canvas canvas, Paint paint, float f3, float f4, float f5, float f6) {
        float fMin = (int) Math.min(f5, this.rl);
        float f7 = f4 / 2.0f;
        float fMin2 = Math.min(f7, (this.f59131t * fMin) / this.rl);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f4) / 2.0f, fMin / 2.0f, f7);
        canvas.save();
        double d2 = f3;
        canvas.translate((float) (((double) this.nr) * Math.cos(Math.toRadians(d2))), (float) (((double) this.nr) * Math.sin(Math.toRadians(d2))));
        canvas.rotate(f3);
        canvas.scale(f6, f6);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private void xMQ(Canvas canvas, Paint paint, float f3, float f4, float f5) {
        mUb(canvas, paint, f3, f4, f5, 1.0f);
    }

    @Override // com.google.android.material.progressindicator.Dsr
    void t(Canvas canvas, Paint paint, Dsr.j jVar, int i2) {
        int iN = W3.j.n(jVar.f59082t, i2);
        float f3 = jVar.f59081n;
        float f4 = jVar.rl;
        int i3 = jVar.nr;
        KN(canvas, paint, f3, f4, iN, i3, i3);
    }

    w6(Wre wre) {
        super(wre);
    }

    @Override // com.google.android.material.progressindicator.Dsr
    int J2() {
        return gh();
    }

    @Override // com.google.android.material.progressindicator.Dsr
    int O() {
        return gh();
    }

    @Override // com.google.android.material.progressindicator.Dsr
    void n(Canvas canvas, Rect rect, float f3, boolean z2, boolean z3) {
        boolean z4;
        float fWidth = rect.width() / J2();
        float fHeight = rect.height() / O();
        n nVar = this.f59080n;
        float f4 = (((Wre) nVar).KN / 2.0f) + ((Wre) nVar).xMQ;
        canvas.translate((f4 * fWidth) + rect.left, (f4 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((Wre) this.f59080n).mUb != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f5 = -f4;
        canvas.clipRect(f5, f5, f4, f4);
        n nVar2 = this.f59080n;
        if (((Wre) nVar2).f59123n / 2 <= ((Wre) nVar2).rl) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f59130O = z4;
        this.rl = ((Wre) nVar2).f59123n * f3;
        this.f59131t = Math.min(((Wre) nVar2).f59123n / 2, ((Wre) nVar2).rl) * f3;
        n nVar3 = this.f59080n;
        float f6 = (((Wre) nVar3).KN - ((Wre) nVar3).f59123n) / 2.0f;
        this.nr = f6;
        if (z2 || z3) {
            if ((z2 && ((Wre) nVar3).f59122O == 2) || (z3 && ((Wre) nVar3).J2 == 1)) {
                this.nr = f6 + (((1.0f - f3) * ((Wre) nVar3).f59123n) / 2.0f);
            } else if ((z2 && ((Wre) nVar3).f59122O == 1) || (z3 && ((Wre) nVar3).J2 == 2)) {
                this.nr = f6 - (((1.0f - f3) * ((Wre) nVar3).f59123n) / 2.0f);
            }
        }
        if (z3 && ((Wre) nVar3).J2 == 3) {
            this.J2 = f3;
        } else {
            this.J2 = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.Dsr
    void nr(Canvas canvas, Paint paint, float f3, float f4, int i2, int i3, int i5) {
        KN(canvas, paint, f3, f4, W3.j.n(i2, i3), i5, i5);
    }
}
