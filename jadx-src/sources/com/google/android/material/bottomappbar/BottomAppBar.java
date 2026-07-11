package com.google.android.material.bottomappbar;

import Rxk.C;
import Rxk.n;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    private static final int n1 = C.Ik;
    private static final int Jk = n.te;
    private static final int Rl = n.nHg;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private WeakReference f58688N;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private final Rect f58689T;
        private final View.OnLayoutChangeListener Xw;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f58690v;

        class j implements View.OnLayoutChangeListener {
            j() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
                android.support.v4.media.j.n(Behavior.this.f58688N.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.Xw = new j();
            this.f58689T = new Rect();
        }

        public boolean M7(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i2, int i3) {
            throw null;
        }

        public boolean P5(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i2) {
            this.f58688N = new WeakReference(bottomAppBar);
            View viewP5 = BottomAppBar.p5(bottomAppBar);
            if (viewP5 != null && !ViewCompat.P5(viewP5)) {
                BottomAppBar.E(bottomAppBar, viewP5);
                this.f58690v = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) viewP5.getLayoutParams())).bottomMargin;
                viewP5.addOnLayoutChangeListener(this.Xw);
                BottomAppBar.M7(bottomAppBar);
            }
            coordinatorLayout.X(bottomAppBar, i2);
            return super.ck(coordinatorLayout, bottomAppBar, i2);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean E2(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            android.support.v4.media.j.n(view);
            return M7(coordinatorLayout, null, view2, view3, i2, i3);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
            android.support.v4.media.j.n(view);
            return P5(coordinatorLayout, null, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.Xw = new j();
            this.f58689T = new Rect();
        }
    }

    static /* synthetic */ void M7(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View p5(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void E(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.LayoutParams) view.getLayoutParams()).nr = 17;
        throw null;
    }
}
