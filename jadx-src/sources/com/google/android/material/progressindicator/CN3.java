package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class CN3 extends fuX {
    private static final FloatPropertyCompat p5 = new j("indicatorLevel");
    private boolean M7;
    private final Dsr.j P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final SpringAnimation f59079U;
    private Dsr Xw;
    private final SpringForce jB;

    class j extends FloatPropertyCompat {
        j(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void rl(CN3 cn3, float f3) {
            cn3.g(f3 / 10000.0f);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float n(CN3 cn3) {
            return cn3.ViF() * 10000.0f;
        }
    }

    static CN3 S(Context context, Wre wre, w6 w6Var) {
        return new CN3(context, wre, w6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float ViF() {
        return this.P5.rl;
    }

    static CN3 WPU(Context context, Xo xo, o oVar) {
        return new CN3(context, xo, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(float f3) {
        this.P5.rl = f3;
        invalidateSelf();
    }

    Dsr aYN() {
        return this.Xw;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.Xw.Uo(canvas, getBounds(), KN(), gh(), mUb());
            this.f59098T.setStyle(Paint.Style.FILL);
            this.f59098T.setAntiAlias(true);
            Dsr.j jVar = this.P5;
            n nVar = this.f59106t;
            jVar.f59082t = nVar.f59124t[0];
            int iN = nVar.Uo;
            if (iN > 0) {
                if (!(this.Xw instanceof o)) {
                    iN = (int) ((iN * MathUtils.n(ViF(), 0.0f, 0.01f)) / 0.01f);
                }
                this.Xw.nr(canvas, this.f59098T, ViF(), 1.0f, this.f59106t.nr, getAlpha(), iN);
            } else {
                this.Xw.nr(canvas, this.f59098T, 0.0f, 1.0f, nVar.nr, getAlpha(), 0);
            }
            this.Xw.t(canvas, this.f59098T, this.P5, getAlpha());
            this.Xw.rl(canvas, this.f59098T, this.f59106t.f59124t[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.Xw.O();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.Xw.J2();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f59079U.aYN();
        g(getLevel() / 10000.0f);
    }

    void nY(Dsr dsr) {
        this.Xw = dsr;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        if (this.M7) {
            this.f59079U.aYN();
            g(i2 / 10000.0f);
            return true;
        }
        this.f59079U.az(ViF() * 10000.0f);
        this.f59079U.o(i2);
        return true;
    }

    CN3(Context context, n nVar, Dsr dsr) {
        super(context, nVar);
        this.M7 = false;
        nY(dsr);
        this.P5 = new Dsr.j();
        SpringForce springForce = new SpringForce();
        this.jB = springForce;
        springForce.nr(1.0f);
        springForce.J2(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, p5);
        this.f59079U = springAnimation;
        springAnimation.WPU(springForce);
        ty(1.0f);
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
        boolean zR = super.r(z2, z3, z4);
        float fN = this.f59096O.n(this.f59103n.getContentResolver());
        if (fN == 0.0f) {
            this.M7 = true;
            return zR;
        }
        this.M7 = false;
        this.jB.J2(50.0f / fN);
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

    void te(float f3) {
        setLevel((int) (f3 * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.fuX
    public /* bridge */ /* synthetic */ boolean xMQ() {
        return super.xMQ();
    }
}
