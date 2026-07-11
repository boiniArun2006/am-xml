package com.google.android.material.progressindicator;

import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.Dsr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected C f59093n;
    protected final List rl = new ArrayList();

    abstract void J2();

    public abstract void KN();

    abstract void Uo();

    abstract void n();

    public abstract void nr(Animatable2Compat.AnimationCallback animationCallback);

    protected float rl(int i2, int i3, int i5) {
        return (i2 - i3) / i5;
    }

    public abstract void t();

    protected void O(C c2) {
        this.f59093n = c2;
    }

    protected aC(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.rl.add(new Dsr.j());
        }
    }
}
