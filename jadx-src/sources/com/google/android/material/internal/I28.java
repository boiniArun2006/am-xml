package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class I28 extends LinearLayoutCompat {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f58998E;
    private final Rect M7;
    private final Rect P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Drawable f58999U;
    protected boolean eF;
    private int p5;

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f58999U;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.p5;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f58999U;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f58999U);
            }
            this.f58999U = drawable;
            this.f58998E = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.p5 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.p5 != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.p5 = i2;
            if (i2 == 119 && this.f58999U != null) {
                this.f58999U.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public I28(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.P5 = new Rect();
        this.M7 = new Rect();
        this.p5 = Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        this.eF = true;
        this.f58998E = false;
        TypedArray typedArrayXMQ = eO.xMQ(context, attributeSet, Rxk.o.f8812A, i2, 0, new int[0]);
        this.p5 = typedArrayXMQ.getInt(Rxk.o.oz, this.p5);
        Drawable drawable = typedArrayXMQ.getDrawable(Rxk.o.WH);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.eF = typedArrayXMQ.getBoolean(Rxk.o.qva, true);
        typedArrayXMQ.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f58999U;
        if (drawable != null) {
            if (this.f58998E) {
                this.f58998E = false;
                Rect rect = this.P5;
                Rect rect2 = this.M7;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.eF) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.p5, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f58999U;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f58999U;
        if (drawable != null && drawable.isStateful()) {
            this.f58999U.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f58999U;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        this.f58998E = z2 | this.f58998E;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i5, int i7) {
        super.onSizeChanged(i2, i3, i5, i7);
        this.f58998E = true;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f58999U) {
            return false;
        }
        return true;
    }
}
