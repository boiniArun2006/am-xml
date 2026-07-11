package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class IAsmoothProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f56947c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f56948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f56949b;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i2) {
        try {
            ValueAnimator valueAnimator = this.f56948a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f56948a;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i2);
                this.f56948a = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(f56947c);
                this.f56948a.addUpdateListener(new g(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i2);
            }
            this.f56948a.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i2) {
        try {
            ValueAnimator valueAnimator = this.f56949b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f56949b;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i2);
                this.f56949b = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(f56947c);
                this.f56949b.addUpdateListener(new h(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i2);
            }
            this.f56949b.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f56948a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f56949b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
