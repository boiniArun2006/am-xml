package com.google.android.material.behavior;

import IzQ.fuX;
import Rxk.n;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private TimeInterpolator J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f58664O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f58665S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f58666Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ViewPropertyAnimator f58667g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedHashSet f58668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f58669o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TimeInterpolator f58670r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f58671t;
    private static final int E2 = n.te;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f58663e = n.E2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final int f58662X = n.nHg;

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f58667g = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f58668n = new LinkedHashSet();
        this.f58669o = 0;
        this.f58666Z = 2;
        this.f58665S = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean E2(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        return i2 == 2;
    }

    public void bzg(View view) {
        Xw(view, true);
    }

    public void v(View view) {
        rV9(view, true);
    }

    private void jB(View view, int i2) {
        this.f58666Z = i2;
        Iterator it = this.f58668n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.j.n(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void aYN(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
        if (i3 > 0) {
            v(view);
        } else if (i3 < 0) {
            bzg(view);
        }
    }

    public boolean s7N() {
        return this.f58666Z == 1;
    }

    public boolean wTp() {
        return this.f58666Z == 2;
    }

    private void nHg(View view, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f58667g = view.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new j());
    }

    public void Xw(View view, boolean z2) {
        if (wTp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f58667g;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        jB(view, 2);
        if (z2) {
            nHg(view, 0, this.f58671t, this.J2);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f58669o = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f58671t = fuX.J2(view.getContext(), E2, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f58664O = fuX.J2(view.getContext(), f58663e, 175);
        Context context = view.getContext();
        int i3 = f58662X;
        this.J2 = fuX.Uo(context, i3, G7.j.nr);
        this.f58670r = fuX.Uo(view.getContext(), i3, G7.j.f3386t);
        return super.ck(coordinatorLayout, view, i2);
    }

    public void rV9(View view, boolean z2) {
        if (s7N()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f58667g;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        jB(view, 1);
        int i2 = this.f58669o + this.f58665S;
        if (z2) {
            nHg(view, i2, this.f58664O, this.f58670r);
        } else {
            view.setTranslationY(i2);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58668n = new LinkedHashSet();
        this.f58669o = 0;
        this.f58666Z = 2;
        this.f58665S = 0;
    }
}
