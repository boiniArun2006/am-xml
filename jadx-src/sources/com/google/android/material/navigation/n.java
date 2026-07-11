package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f59075n = Color.alpha(-1728053248);

    class j extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ DrawerLayout f59076n;
        final /* synthetic */ View rl;

        j(DrawerLayout drawerLayout, View view) {
            this.f59076n = drawerLayout;
            this.rl = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f59076n.Uo(this.rl, false);
            this.f59076n.setScrimColor(-1728053248);
        }
    }

    public static Animator.AnimatorListener rl(DrawerLayout drawerLayout, View view) {
        return new j(drawerLayout, view);
    }

    public static ValueAnimator.AnimatorUpdateListener t(final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(ColorUtils.ck(-1728053248, G7.j.t(n.f59075n, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }
}
