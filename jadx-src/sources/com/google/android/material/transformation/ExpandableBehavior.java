package com.google.android.material.transformation;

import android.content.Context;
import android.support.v4.media.j;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import er.InterfaceC1970j;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f59423n;

    public ExpandableBehavior() {
        this.f59423n = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean xMQ(CoordinatorLayout coordinatorLayout, View view, View view2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59423n = 0;
    }

    protected InterfaceC1970j N(CoordinatorLayout coordinatorLayout, View view) {
        List listIk = coordinatorLayout.Ik(view);
        int size = listIk.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listIk.get(i2);
            if (xMQ(coordinatorLayout, view, view2)) {
                j.n(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
        if (!ViewCompat.P5(view)) {
            N(coordinatorLayout, view);
            return false;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean qie(CoordinatorLayout coordinatorLayout, View view, View view2) {
        j.n(view2);
        throw null;
    }
}
