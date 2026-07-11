package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f58603O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f58604n;
    private int nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f58605t;
    private boolean J2 = true;
    private boolean Uo = true;

    public boolean O(int i2) {
        if (!this.J2 || this.nr == i2) {
            return false;
        }
        this.nr = i2;
        n();
        return true;
    }

    void n() {
        View view = this.f58604n;
        ViewCompat.FX(view, this.nr - (view.getTop() - this.rl));
        View view2 = this.f58604n;
        ViewCompat.M(view2, this.f58603O - (view2.getLeft() - this.f58605t));
    }

    public boolean nr(int i2) {
        if (!this.Uo || this.f58603O == i2) {
            return false;
        }
        this.f58603O = i2;
        n();
        return true;
    }

    public int rl() {
        return this.nr;
    }

    void t() {
        this.rl = this.f58604n.getTop();
        this.f58605t = this.f58604n.getLeft();
    }

    public Ml(View view) {
        this.f58604n = view;
    }
}
