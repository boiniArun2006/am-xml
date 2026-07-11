package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class l3D {

    class j implements OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6 f59050n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ml f59051t;

        j(w6 w6Var, Ml ml) {
            this.f59050n = w6Var;
            this.f59051t = ml;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f59050n.n(view, windowInsetsCompat, new Ml(this.f59051t));
        }
    }

    public interface w6 {
        WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat, Ml ml);
    }

    public static PorterDuff.Mode KN(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    class n implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        n() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.piY(view);
        }
    }

    public static void gh(View view, boolean z2) {
        WindowInsetsControllerCompat windowInsetsControllerCompatS7N;
        if (!z2 || (windowInsetsControllerCompatS7N = ViewCompat.s7N(view)) == null) {
            O(view).showSoftInput(view, 1);
        } else {
            windowInsetsControllerCompatS7N.O(WindowInsetsCompat.Type.nr());
        }
    }

    public static void rl(View view, w6 w6Var) {
        ViewCompat.Org(view, new j(w6Var, new Ml(ViewCompat.E2(view), view.getPaddingTop(), ViewCompat.fD(view), view.getPaddingBottom())));
        xMQ(view);
    }

    public static float J2(View view) {
        float fXQ = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fXQ += ViewCompat.XQ((View) parent);
        }
        return fXQ;
    }

    private static InputMethodManager O(View view) {
        return (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static boolean Uo(View view) {
        if (ViewCompat.nY(view) == 1) {
            return true;
        }
        return false;
    }

    public static void mUb(final View view, final boolean z2) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.QJ
            @Override // java.lang.Runnable
            public final void run() {
                l3D.gh(view, z2);
            }
        });
    }

    public static Integer nr(View view) {
        ColorStateList colorStateListJ2 = com.google.android.material.drawable.Ml.J2(view.getBackground());
        if (colorStateListJ2 != null) {
            return Integer.valueOf(colorStateListJ2.getDefaultColor());
        }
        return null;
    }

    public static float t(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static void xMQ(View view) {
        if (ViewCompat.U(view)) {
            ViewCompat.piY(view);
        } else {
            view.addOnAttachStateChangeListener(new n());
        }
    }

    public static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f59048n;
        public int nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f59049t;

        public Ml(int i2, int i3, int i5, int i7) {
            this.f59048n = i2;
            this.rl = i3;
            this.f59049t = i5;
            this.nr = i7;
        }

        public Ml(Ml ml) {
            this.f59048n = ml.f59048n;
            this.rl = ml.rl;
            this.f59049t = ml.f59049t;
            this.nr = ml.nr;
        }
    }
}
