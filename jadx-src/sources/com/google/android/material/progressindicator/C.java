package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.progressindicator.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C extends fuX {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Drawable f59078U;
    private Dsr Xw;
    private aC jB;

    static C XQ(Context context, Xo xo, o oVar) {
        return new C(context, xo, oVar, xo.KN == 0 ? new qz(xo) : new Pl(context, xo));
    }

    static C Z(Context context, Wre wre, w6 w6Var) {
        C c2 = new C(context, wre, w6Var, new Ml(wre));
        c2.g(VectorDrawableCompat.rl(context.getResources(), Rxk.I28.rl, null));
        return c2;
    }

    private boolean aYN() {
        Dc4.j jVar = this.f59096O;
        return jVar != null && jVar.n(this.f59103n.getContentResolver()) == 0.0f;
    }

    aC S() {
        return this.jB;
    }

    void ViF(aC aCVar) {
        this.jB = aCVar;
        aCVar.O(this);
    }

    Dsr WPU() {
        return this.Xw;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i2;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (aYN() && (drawable = this.f59078U) != null) {
                drawable.setBounds(getBounds());
                DrawableCompat.ty(this.f59078U, this.f59106t.f59124t[0]);
                this.f59078U.draw(canvas);
                return;
            }
            canvas.save();
            this.Xw.Uo(canvas, getBounds(), KN(), gh(), mUb());
            int i3 = this.f59106t.Uo;
            int alpha = getAlpha();
            if (i3 == 0) {
                this.Xw.nr(canvas, this.f59098T, 0.0f, 1.0f, this.f59106t.nr, alpha, 0);
                i2 = i3;
            } else {
                Dsr.j jVar = (Dsr.j) this.jB.rl.get(0);
                Dsr.j jVar2 = (Dsr.j) this.jB.rl.get(r1.size() - 1);
                Dsr dsr = this.Xw;
                if (dsr instanceof o) {
                    i2 = i3;
                    dsr.nr(canvas, this.f59098T, 0.0f, jVar.f59081n, this.f59106t.nr, alpha, i2);
                    this.Xw.nr(canvas, this.f59098T, jVar2.rl, 1.0f, this.f59106t.nr, alpha, i2);
                } else {
                    i2 = i3;
                    alpha = 0;
                    dsr.nr(canvas, this.f59098T, jVar2.rl, 1.0f + jVar.f59081n, this.f59106t.nr, 0, i2);
                }
            }
            for (int i5 = 0; i5 < this.jB.rl.size(); i5++) {
                Dsr.j jVar3 = (Dsr.j) this.jB.rl.get(i5);
                this.Xw.t(canvas, this.f59098T, jVar3, getAlpha());
                if (i5 > 0 && i2 > 0) {
                    this.Xw.nr(canvas, this.f59098T, ((Dsr.j) this.jB.rl.get(i5 - 1)).rl, jVar3.f59081n, this.f59106t.nr, alpha, i2);
                }
            }
            canvas.restore();
        }
    }

    public void g(Drawable drawable) {
        this.f59078U = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.Xw.O();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.Xw.J2();
    }

    void nY(Dsr dsr) {
        this.Xw = dsr;
    }

    C(Context context, n nVar, Dsr dsr, aC aCVar) {
        super(context, nVar);
        nY(dsr);
        ViF(aCVar);
    }

    @Override // com.google.android.material.progressindicator.fuX
    public /* bridge */ /* synthetic */ boolean Ik(boolean z2, boolean z3, boolean z4) {
        return super.Ik(z2, z3, z4);
    }

    @Override // com.google.android.material.progressindicator.fuX
    public /* bridge */ /* synthetic */ void az(Animatable2Compat.AnimationCallback animationCallback) {
        super.az(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.fuX, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.google.android.material.progressindicator.fuX, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.fuX
    public /* bridge */ /* synthetic */ boolean gh() {
        return super.gh();
    }

    @Override // com.google.android.material.progressindicator.fuX, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.fuX
    public /* bridge */ /* synthetic */ boolean mUb() {
        return super.mUb();
    }

    @Override // com.google.android.material.progressindicator.fuX
    public /* bridge */ /* synthetic */ boolean o(Animatable2Compat.AnimationCallback animationCallback) {
        return super.o(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.fuX
    boolean r(boolean z2, boolean z3, boolean z4) {
        Drawable drawable;
        boolean zR = super.r(z2, z3, z4);
        if (aYN() && (drawable = this.f59078U) != null) {
            return drawable.setVisible(z2, z3);
        }
        if (!isRunning()) {
            this.jB.n();
        }
        if (!z2 || !z4) {
            return zR;
        }
        this.jB.Uo();
        return zR;
    }

    @Override // com.google.android.material.progressindicator.fuX, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // com.google.android.material.progressindicator.fuX, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.fuX, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3);
    }

    @Override // com.google.android.material.progressindicator.fuX, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.fuX, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.fuX
    public /* bridge */ /* synthetic */ boolean xMQ() {
        return super.xMQ();
    }
}
