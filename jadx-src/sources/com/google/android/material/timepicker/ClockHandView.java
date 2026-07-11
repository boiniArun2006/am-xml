package com.google.android.material.timepicker;

import IzQ.fuX;
import Rxk.C;
import Rxk.o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.l3D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class ClockHandView extends View {
    private boolean E2;
    private boolean J2;
    private double M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final float f59389N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ValueAnimator f59390O;
    private boolean P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f59391S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final int f59392T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f59393U;
    private final RectF Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f59394e;
    private int eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f59395g;
    private final int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f59396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f59397o;
    private int p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f59398r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TimeInterpolator f59399t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Paint f59400v;

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface n {
        void n(float f3, boolean z2);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.nY);
    }

    private int KN(int i2) {
        return i2 == 2 ? Math.round(this.p5 * 0.66f) : this.p5;
    }

    public void az(float f3) {
        ty(f3, false);
    }

    public void ty(float f3, boolean z2) {
        ValueAnimator valueAnimator = this.f59390O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            HI(f3, false);
            return;
        }
        Pair pairMUb = mUb(f3);
        this.f59390O.setFloatValues(((Float) pairMUb.first).floatValue(), ((Float) pairMUb.second).floatValue());
        this.f59390O.setDuration(this.f59396n);
        this.f59390O.setInterpolator(this.f59399t);
        this.f59390O.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.n(this.f59420n, valueAnimator2);
            }
        });
        this.f59390O.addListener(new j());
        this.f59390O.start();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f59390O = new ValueAnimator();
        this.f59394e = new ArrayList();
        Paint paint = new Paint();
        this.f59400v = paint;
        this.Xw = new RectF();
        this.eF = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.D76, i2, C.f8725g);
        this.f59396n = fuX.J2(context, Rxk.n.te, 200);
        this.f59399t = fuX.Uo(context, Rxk.n.nHg, G7.j.rl);
        this.p5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.QgZ, 0);
        this.f59392T = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.f8869j, 0);
        this.jB = getResources().getDimensionPixelSize(Rxk.Ml.ViF);
        this.f59389N = r7.getDimensionPixelSize(Rxk.Ml.WPU);
        int color = typedArrayObtainStyledAttributes.getColor(o.f8833NP, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        az(0.0f);
        this.f59395g = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.ul(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void HI(float f3, boolean z2) {
        float f4 = f3 % 360.0f;
        this.f59393U = f4;
        this.M7 = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fKN = KN(this.eF);
        float fCos = width + (((float) Math.cos(this.M7)) * fKN);
        float fSin = height + (fKN * ((float) Math.sin(this.M7)));
        RectF rectF = this.Xw;
        int i2 = this.f59392T;
        rectF.set(fCos - i2, fSin - i2, fCos + i2, fSin + i2);
        Iterator it = this.f59394e.iterator();
        while (it.hasNext()) {
            ((n) it.next()).n(f4, z2);
        }
        invalidate();
    }

    public RectF O() {
        return this.Xw;
    }

    public float Uo() {
        return this.f59393U;
    }

    void ck(boolean z2) {
        if (this.E2 && !z2) {
            this.eF = 1;
        }
        this.E2 = z2;
        invalidate();
    }

    public void qie(int i2) {
        this.p5 = i2;
        invalidate();
    }

    public void rl(n nVar) {
        this.f59394e.add(nVar);
    }

    public int xMQ() {
        return this.f59392T;
    }

    private int J2(float f3, float f4) {
        int degrees = (int) Math.toDegrees(Math.atan2(f4 - (getHeight() / 2), f3 - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            return degrees + 450;
        }
        return i2;
    }

    private boolean gh(float f3, float f4, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        float fJ2 = J2(f3, f4);
        boolean z6 = false;
        if (Uo() != fJ2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z3 && z5) {
            return true;
        }
        if (!z5 && !z2) {
            return false;
        }
        if (z4 && this.J2) {
            z6 = true;
        }
        ty(fJ2, z6);
        return true;
    }

    private Pair mUb(float f3) {
        float fUo = Uo();
        if (Math.abs(fUo - f3) > 180.0f) {
            if (fUo > 180.0f && f3 < 180.0f) {
                f3 += 360.0f;
            }
            if (fUo < 180.0f && f3 > 180.0f) {
                fUo += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fUo), Float.valueOf(f3));
    }

    public static /* synthetic */ void n(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.HI(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void nr(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f3 = width;
        float fKN = KN(this.eF);
        float fCos = (((float) Math.cos(this.M7)) * fKN) + f3;
        float f4 = height;
        float fSin = (fKN * ((float) Math.sin(this.M7))) + f4;
        this.f59400v.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f59392T, this.f59400v);
        double dSin = Math.sin(this.M7);
        double dCos = Math.cos(this.M7);
        this.f59400v.setStrokeWidth(this.jB);
        canvas.drawLine(f3, f4, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f59400v);
        canvas.drawCircle(f3, f4, this.f59389N, this.f59400v);
    }

    private void t(float f3, float f4) {
        int i2 = 2;
        if (ZB.j.n(getWidth() / 2, getHeight() / 2, f3, f4) > KN(2) + l3D.t(getContext(), 12)) {
            i2 = 1;
        }
        this.eF = i2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nr(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        if (!this.f59390O.isRunning()) {
            az(Uo());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z3 = false;
                z2 = false;
                z4 = false;
            } else {
                int i2 = (int) (x2 - this.f59398r);
                int i3 = (int) (y2 - this.f59397o);
                if ((i2 * i2) + (i3 * i3) > this.f59395g) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f59391S = z5;
                z3 = this.P5;
                if (actionMasked == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.E2) {
                    t(x2, y2);
                }
                z4 = z6;
                z2 = false;
            }
        } else {
            this.f59398r = x2;
            this.f59397o = y2;
            this.f59391S = true;
            this.P5 = false;
            z2 = true;
            z3 = false;
            z4 = false;
        }
        this.P5 |= gh(x2, y2, z3, z2, z4);
        return true;
    }
}
