package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.internal.eO;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j extends ProgressBar {
    static final int jB = Rxk.C.nY;
    private boolean E2;
    private boolean J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Runnable f59109N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f59110O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f59111S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Runnable f59112T;
    private final Animatable2Compat.AnimationCallback Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f59113e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Dc4.j f59114g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    com.google.android.material.progressindicator.n f59115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f59116o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f59117r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f59118t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Animatable2Compat.AnimationCallback f59119v;

    class Ml extends Animatable2Compat.AnimationCallback {
        Ml() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void rl(Drawable drawable) {
            super.rl(drawable);
            if (!j.this.E2) {
                j jVar = j.this;
                jVar.setVisibility(jVar.f59113e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.j$j, reason: collision with other inner class name */
    class RunnableC0789j implements Runnable {
        RunnableC0789j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.gh();
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.mUb();
            j.this.f59111S = -1L;
        }
    }

    class w6 extends Animatable2Compat.AnimationCallback {
        w6() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void rl(Drawable drawable) {
            j.this.setIndeterminate(false);
            j jVar = j.this;
            jVar.HI(jVar.f59118t, j.this.f59110O);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        try {
            Dsr currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.J2() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i2) : currentDrawingDelegate.J2() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.O() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i3) : currentDrawingDelegate.O() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    boolean qie() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z2) {
        try {
            if (z2 == isIndeterminate()) {
                return;
            }
            fuX fux = (fuX) getCurrentDrawable();
            if (fux != null) {
                fux.xMQ();
            }
            super.setIndeterminate(z2);
            fuX fux2 = (fuX) getCurrentDrawable();
            if (fux2 != null) {
                fux2.Ik(Ik(), false, false);
            }
            if ((fux2 instanceof C) && Ik()) {
                ((C) fux2).S().Uo();
            }
            this.E2 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{W3.j.rl(getContext(), Rxk.n.qie, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f59115n.f59124t = iArr;
        getIndeterminateDrawable().S().t();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i2) {
        if (isIndeterminate()) {
            return;
        }
        HI(i2, false);
    }

    abstract com.google.android.material.progressindicator.n xMQ(Context context, AttributeSet attributeSet);

    protected j(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(scw.j.t(context, attributeSet, i2, jB), attributeSet, i2);
        this.f59111S = -1L;
        this.E2 = false;
        this.f59113e = 4;
        this.f59112T = new RunnableC0789j();
        this.f59109N = new n();
        this.f59119v = new w6();
        this.Xw = new Ml();
        Context context2 = getContext();
        this.f59115n = xMQ(context2, attributeSet);
        TypedArray typedArrayXMQ = eO.xMQ(context2, attributeSet, Rxk.o.eF, i2, i3, new int[0]);
        this.f59117r = typedArrayXMQ.getInt(Rxk.o.f8816D, -1);
        this.f59116o = Math.min(typedArrayXMQ.getInt(Rxk.o.f8813B, -1), 1000);
        typedArrayXMQ.recycle();
        this.f59114g = new Dc4.j();
        this.J2 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gh() {
        if (this.f59116o > 0) {
            this.f59111S = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    protected void KN(boolean z2) {
        if (this.J2) {
            ((fuX) getCurrentDrawable()).Ik(Ik(), false, z2);
        }
    }

    public int getHideAnimationBehavior() {
        return this.f59115n.J2;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public C getIndeterminateDrawable() {
        return (C) super.getIndeterminateDrawable();
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f59115n.f59124t;
    }

    @Px
    public int getIndicatorTrackGapSize() {
        return this.f59115n.Uo;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public CN3 getProgressDrawable() {
        return (CN3) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f59115n.f59122O;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f59115n.nr;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.f59115n.rl;
    }

    @Px
    public int getTrackThickness() {
        return this.f59115n.f59123n;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f59109N);
        removeCallbacks(this.f59112T);
        ((fuX) getCurrentDrawable()).xMQ();
        ck();
        super.onDetachedFromWindow();
    }

    @RestrictTo
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull Dc4.j jVar) {
        this.f59114g = jVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f59096O = jVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f59096O = jVar;
        }
    }

    public void setHideAnimationBehavior(int i2) {
        this.f59115n.J2 = i2;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof C)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((fuX) drawable).xMQ();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorTrackGapSize(@Px int i2) {
        com.google.android.material.progressindicator.n nVar = this.f59115n;
        if (nVar.Uo != i2) {
            nVar.Uo = i2;
            nVar.O();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof CN3)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            CN3 cn3 = (CN3) drawable;
            cn3.xMQ();
            super.setProgressDrawable(cn3);
            cn3.te(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i2) {
        this.f59115n.f59122O = i2;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i2) {
        com.google.android.material.progressindicator.n nVar = this.f59115n;
        if (nVar.nr != i2) {
            nVar.nr = i2;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i2) {
        com.google.android.material.progressindicator.n nVar = this.f59115n;
        if (nVar.rl != i2) {
            nVar.rl = Math.min(i2, nVar.f59123n / 2);
            invalidate();
        }
    }

    public void setTrackThickness(@Px int i2) {
        com.google.android.material.progressindicator.n nVar = this.f59115n;
        if (nVar.f59123n != i2) {
            nVar.f59123n = i2;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i2) {
        if (i2 != 0 && i2 != 4 && i2 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f59113e = i2;
    }

    private boolean az() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            if (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible()) {
                return false;
            }
            return true;
        }
        return false;
    }

    private void ck() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o(this.Xw);
            getIndeterminateDrawable().S().KN();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().o(this.Xw);
        }
    }

    @Nullable
    private Dsr getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().WPU();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().aYN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mUb() {
        ((fuX) getCurrentDrawable()).Ik(false, false, true);
        if (az()) {
            setVisibility(4);
        }
    }

    private void ty() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().S().nr(this.f59119v);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().az(this.Xw);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().az(this.Xw);
        }
    }

    public void HI(int i2, boolean z2) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f59118t = i2;
                this.f59110O = z2;
                this.E2 = true;
                if (getIndeterminateDrawable().isVisible() && this.f59114g.n(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().S().J2();
                    return;
                } else {
                    this.f59119v.rl(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i2);
        if (getProgressDrawable() != null && !z2) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    boolean Ik() {
        if (ViewCompat.U(this) && getWindowVisibility() == 0 && qie()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ty();
        if (Ik()) {
            gh();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i2) {
        boolean z2;
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        KN(z2);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        KN(false);
    }
}
