package com.google.android.material.floatingactionbutton;

import Rxk.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.j;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.AbstractC1891c;
import er.InterfaceC1970j;
import java.util.List;
import mfo.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class FloatingActionButton extends AbstractC1891c implements TintableBackgroundView, TintableImageSourceView, InterfaceC1970j, Pl, CoordinatorLayout.AttachedBehavior {

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f58955n;

        public BaseBehavior() {
            this.f58955n = true;
        }

        private boolean rV9(View view, FloatingActionButton floatingActionButton) {
            throw null;
        }

        private void s7N(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            throw null;
        }

        public boolean N(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void gh(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.KN == 0) {
                layoutParams.KN = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.iV);
            this.f58955n = typedArrayObtainStyledAttributes.getBoolean(o.I4p, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private boolean bzg(View view, FloatingActionButton floatingActionButton) {
            if (!rV9(view, floatingActionButton)) {
                return false;
            }
            throw null;
        }

        private static boolean nHg(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).O() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean J2(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            j.n(view);
            return N(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
            j.n(view);
            return v(coordinatorLayout, null, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean qie(CoordinatorLayout coordinatorLayout, View view, View view2) {
            j.n(view);
            return wTp(coordinatorLayout, null, view2);
        }

        public boolean v(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            List listIk = coordinatorLayout.Ik(floatingActionButton);
            int size = listIk.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) listIk.get(i3);
                if (nHg(view) && bzg(view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.X(floatingActionButton, i2);
            s7N(coordinatorLayout, floatingActionButton);
            return true;
        }

        public boolean wTp(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (nHg(view)) {
                bzg(view, floatingActionButton);
                return false;
            }
            return false;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean N(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.N(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void gh(CoordinatorLayout.LayoutParams layoutParams) {
            super.gh(layoutParams);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean v(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            return super.v(coordinatorLayout, floatingActionButton, i2);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean wTp(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.wTp(coordinatorLayout, floatingActionButton, view);
        }
    }
}
