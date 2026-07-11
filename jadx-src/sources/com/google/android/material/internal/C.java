package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class C extends FrameLayout {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Rect f58957O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f58958S;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Drawable f58959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f58960o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f58961r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Rect f58962t;

    class j implements OnApplyWindowInsetsListener {
        j() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
            C c2 = C.this;
            if (c2.f58962t == null) {
                c2.f58962t = new Rect();
            }
            C.this.f58962t.set(windowInsetsCompat.gh(), windowInsetsCompat.az(), windowInsetsCompat.qie(), windowInsetsCompat.mUb());
            C.this.n(windowInsetsCompat);
            C.this.setWillNotDraw(!windowInsetsCompat.HI() || C.this.f58959n == null);
            ViewCompat.GR(C.this);
            return windowInsetsCompat.t();
        }
    }

    protected abstract void n(WindowInsetsCompat windowInsetsCompat);

    public void setDrawBottomInsetForeground(boolean z2) {
        this.f58961r = z2;
    }

    public void setDrawLeftInsetForeground(boolean z2) {
        this.f58960o = z2;
    }

    public void setDrawRightInsetForeground(boolean z2) {
        this.f58958S = z2;
    }

    public void setDrawTopInsetForeground(boolean z2) {
        this.J2 = z2;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f58959n = drawable;
    }

    public C(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f58957O = new Rect();
        this.J2 = true;
        this.f58961r = true;
        this.f58960o = true;
        this.f58958S = true;
        TypedArray typedArrayXMQ = eO.xMQ(context, attributeSet, Rxk.o.oKr, i2, Rxk.C.gh, new int[0]);
        this.f58959n = typedArrayXMQ.getDrawable(Rxk.o.hmG);
        typedArrayXMQ.recycle();
        setWillNotDraw(true);
        ViewCompat.Org(this, new j());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f58962t != null && this.f58959n != null) {
            int iSave = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.J2) {
                this.f58957O.set(0, 0, width, this.f58962t.top);
                this.f58959n.setBounds(this.f58957O);
                this.f58959n.draw(canvas);
            }
            if (this.f58961r) {
                this.f58957O.set(0, height - this.f58962t.bottom, width, height);
                this.f58959n.setBounds(this.f58957O);
                this.f58959n.draw(canvas);
            }
            if (this.f58960o) {
                Rect rect = this.f58957O;
                Rect rect2 = this.f58962t;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f58959n.setBounds(this.f58957O);
                this.f58959n.draw(canvas);
            }
            if (this.f58958S) {
                Rect rect3 = this.f58957O;
                Rect rect4 = this.f58962t;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.f58959n.setBounds(this.f58957O);
                this.f58959n.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f58959n;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f58959n;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
