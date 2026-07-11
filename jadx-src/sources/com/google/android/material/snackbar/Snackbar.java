package com.google.android.material.snackbar;

import Rxk.fuX;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Snackbar extends BaseTransientBottomBar {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final int[] f59196N;
    private static final int[] nHg;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f59197T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final AccessibilityManager f59198X;

    private static ViewGroup I(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static Snackbar k(View view, CharSequence charSequence, int i2) {
        return dR0(null, view, charSequence, i2);
    }

    @RestrictTo
    public static final class SnackbarLayout extends BaseTransientBottomBar.QJ {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.QJ, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.QJ, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.QJ, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.QJ, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.QJ, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.QJ, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.QJ, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i2 = Rxk.n.Xw;
        f59196N = new int[]{i2};
        nHg = new int[]{i2, Rxk.n.f8802U};
    }

    private SnackbarContentLayout GR() {
        return (SnackbarContentLayout) this.xMQ.getChildAt(0);
    }

    private static boolean Y(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(nHg);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, j jVar) {
        super(context, viewGroup, view, jVar);
        this.f59198X = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private TextView Nxk() {
        return GR().getMessageView();
    }

    private static Snackbar dR0(Context context, View view, CharSequence charSequence, int i2) {
        int i3;
        ViewGroup viewGroupI = I(view);
        if (viewGroupI != null) {
            if (context == null) {
                context = viewGroupI.getContext();
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            if (Y(context)) {
                i3 = fuX.f8786g;
            } else {
                i3 = fuX.rl;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate(i3, viewGroupI, false);
            Snackbar snackbar = new Snackbar(context, viewGroupI, snackbarContentLayout, snackbarContentLayout);
            snackbar.z(charSequence);
            snackbar.U(i2);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void aYN() {
        super.aYN();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void eF() {
        super.eF();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int te() {
        int i2;
        int iTe = super.te();
        if (iTe == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f59197T) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            return this.f59198X.getRecommendedTimeoutMillis(iTe, i2 | 3);
        }
        if (this.f59197T && this.f59198X.isTouchExplorationEnabled()) {
            return -2;
        }
        return iTe;
    }

    public Snackbar z(CharSequence charSequence) {
        Nxk().setText(charSequence);
        return this;
    }
}
