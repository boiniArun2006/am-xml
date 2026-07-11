package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class w6 extends CoordinatorLayout.Behavior {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f58617O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Ml f58618n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f58619t;

    public w6() {
        this.f58619t = 0;
        this.f58617O = 0;
    }

    public int N() {
        Ml ml = this.f58618n;
        if (ml != null) {
            return ml.rl();
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
        nHg(coordinatorLayout, view, i2);
        if (this.f58618n == null) {
            this.f58618n = new Ml(view);
        }
        this.f58618n.t();
        this.f58618n.n();
        int i3 = this.f58619t;
        if (i3 != 0) {
            this.f58618n.O(i3);
            this.f58619t = 0;
        }
        int i5 = this.f58617O;
        if (i5 != 0) {
            this.f58618n.nr(i5);
            this.f58617O = 0;
            return true;
        }
        return true;
    }

    protected void nHg(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.X(view, i2);
    }

    public w6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58619t = 0;
        this.f58617O = 0;
    }
}
