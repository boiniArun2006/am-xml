package com.google.android.material.transformation;

import G7.I28;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final I28 f59427O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28 f59428t;

    public FabTransformationScrimBehavior() {
        this.f59428t = new I28(75L, 150L);
        this.f59427O = new I28(0L, 150L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean xMQ(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean T(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.T(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59428t = new I28(75L, 150L);
        this.f59427O = new I28(0L, 150L);
    }
}
