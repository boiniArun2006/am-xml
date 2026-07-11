package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final RectF J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final RectF f59424O;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int[] f59425r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f59426t;

    public FabTransformationBehavior() {
        this.f59426t = new Rect();
        this.f59424O = new RectF();
        this.J2 = new RectF();
        this.f59425r = new int[2];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void gh(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.KN == 0) {
            layoutParams.KN = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean xMQ(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59426t = new Rect();
        this.f59424O = new RectF();
        this.J2 = new RectF();
        this.f59425r = new int[2];
    }
}
