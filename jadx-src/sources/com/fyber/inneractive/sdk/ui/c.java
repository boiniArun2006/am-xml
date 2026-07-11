package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f56964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f56965b;

    public c(FyberAdIdentifierLocal fyberAdIdentifierLocal, AnimatorSet animatorSet) {
        this.f56965b = fyberAdIdentifierLocal;
        this.f56964a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f56965b;
        if (fyberAdIdentifierLocal.f56940o) {
            fyberAdIdentifierLocal.f56938m.setImageResource(R.drawable.ia_fyber_info_button);
            FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f56965b;
            FyberAdIdentifierLocal.a(fyberAdIdentifierLocal2.f56938m, fyberAdIdentifierLocal2.f56956g);
        } else {
            Bitmap bitmap = fyberAdIdentifierLocal.f56943r;
            if (bitmap != null) {
                fyberAdIdentifierLocal.f56938m.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifierLocal.f56938m.setImageResource(R.drawable.ia_digital_turbine_logo);
            }
            FyberAdIdentifierLocal.a(this.f56965b.f56938m, null);
        }
        this.f56964a.start();
        this.f56965b.f56941p = this.f56964a;
    }
}
