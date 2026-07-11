package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class j extends WindowInsetsAnimationCompat.Callback {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final View f58736O;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int[] f58737o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f58738r;

    public j(View view) {
        super(0);
        this.f58737o = new int[2];
        this.f58736O = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsAnimationCompat.BoundsCompat J2(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.f58736O.getLocationOnScreen(this.f58737o);
        int i2 = this.J2 - this.f58737o[1];
        this.f58738r = i2;
        this.f58736O.setTranslationY(i2);
        return boundsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void nr(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f58736O.getLocationOnScreen(this.f58737o);
        this.J2 = this.f58737o[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void t(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f58736O.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat O(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((WindowInsetsAnimationCompat) it.next()).nr() & WindowInsetsCompat.Type.nr()) != 0) {
                this.f58736O.setTranslationY(G7.j.t(this.f58738r, 0, r0.t()));
                break;
            }
        }
        return windowInsetsCompat;
    }
}
