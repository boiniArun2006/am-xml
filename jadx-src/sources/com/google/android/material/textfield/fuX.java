package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import mfo.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class fuX extends mfo.CN3 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    n f59356B;

    private static final class n extends CN3.w6 {
        private final RectF WPU;

        private n(mfo.C c2, RectF rectF) {
            super(c2, null);
            this.WPU = rectF;
        }

        @Override // mfo.CN3.w6, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            fuX fuxY = fuX.Y(this);
            fuxY.invalidateSelf();
            return fuxY;
        }

        private n(n nVar) {
            super(nVar);
            this.WPU = nVar.WPU;
        }
    }

    private static class w6 extends fuX {
        w6(n nVar) {
            super(nVar);
        }

        @Override // mfo.CN3
        protected void r(Canvas canvas) {
            if (this.f59356B.WPU.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f59356B.WPU);
            } else {
                canvas.clipRect(this.f59356B.WPU, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    void z() {
        piY(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private fuX(n nVar) {
        super(nVar);
        this.f59356B = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static fuX Y(n nVar) {
        return new w6(nVar);
    }

    static fuX k(mfo.C c2) {
        if (c2 == null) {
            c2 = new mfo.C();
        }
        return Y(new n(c2, new RectF()));
    }

    boolean dR0() {
        return !this.f59356B.WPU.isEmpty();
    }

    void ijL(RectF rectF) {
        piY(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // mfo.CN3, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f59356B = new n(this.f59356B);
        return this;
    }

    void piY(float f3, float f4, float f5, float f6) {
        if (f3 == this.f59356B.WPU.left && f4 == this.f59356B.WPU.top && f5 == this.f59356B.WPU.right && f6 == this.f59356B.WPU.bottom) {
            return;
        }
        this.f59356B.WPU.set(f3, f4, f5, f6);
        invalidateSelf();
    }
}
