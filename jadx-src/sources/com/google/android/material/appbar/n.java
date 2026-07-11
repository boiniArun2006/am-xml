package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class n extends w6 {
    final Rect J2;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f58614Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f58615o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Rect f58616r;

    public n() {
        this.J2 = new Rect();
        this.f58616r = new Rect();
        this.f58615o = 0;
    }

    private static int Xw(int i2) {
        if (i2 == 0) {
            return 8388659;
        }
        return i2;
    }

    protected boolean U() {
        return false;
    }

    abstract View s7N(List list);

    abstract float v(View view);

    final int bzg() {
        return this.f58615o;
    }

    public final void jB(int i2) {
        this.f58614Z = i2;
    }

    final int wTp(View view) {
        if (this.f58614Z == 0) {
            return 0;
        }
        float fV = v(view);
        int i2 = this.f58614Z;
        return MathUtils.rl((int) (fV * i2), 0, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean Ik(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i5, int i7) {
        View viewS7N;
        int i8;
        WindowInsetsCompat lastWindowInsets;
        int i9 = view.getLayoutParams().height;
        if ((i9 == -1 || i9 == -2) && (viewS7N = s7N(coordinatorLayout.Ik(view))) != null) {
            int size = View.MeasureSpec.getSize(i5);
            if (size > 0) {
                if (ViewCompat.WPU(viewS7N) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.az() + lastWindowInsets.mUb();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int iRV9 = size + rV9(viewS7N);
            int measuredHeight = viewS7N.getMeasuredHeight();
            if (U()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                iRV9 -= measuredHeight;
            }
            if (i9 == -1) {
                i8 = 1073741824;
            } else {
                i8 = Integer.MIN_VALUE;
            }
            coordinatorLayout.T(view, i2, i3, View.MeasureSpec.makeMeasureSpec(iRV9, i8), i7);
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.appbar.w6
    protected void nHg(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View viewS7N = s7N(coordinatorLayout.Ik(view));
        if (viewS7N != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.J2;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, viewS7N.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + viewS7N.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.WPU(coordinatorLayout) && !ViewCompat.WPU(view)) {
                rect.left += lastWindowInsets.gh();
                rect.right -= lastWindowInsets.qie();
            }
            Rect rect2 = this.f58616r;
            GravityCompat.n(Xw(layoutParams.f36134t), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int iWTp = wTp(viewS7N);
            view.layout(rect2.left, rect2.top - iWTp, rect2.right, rect2.bottom - iWTp);
            this.f58615o = rect2.top - viewS7N.getBottom();
            return;
        }
        super.nHg(coordinatorLayout, view, i2);
        this.f58615o = 0;
    }

    int rV9(View view) {
        return view.getMeasuredHeight();
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J2 = new Rect();
        this.f58616r = new Rect();
        this.f58615o = 0;
    }
}
