package com.google.android.material.floatingactionbutton;

import Rxk.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.j;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f58953n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f58954t;

        public ExtendedFloatingActionButtonBehavior() {
            this.f58953n = false;
            this.f58954t = true;
        }

        private boolean v(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void gh(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.KN == 0) {
                layoutParams.KN = 80;
            }
        }

        private static boolean nHg(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).O() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean rV9(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!v(view, extendedFloatingActionButton)) {
                return false;
            }
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean J2(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            j.n(view);
            return N(coordinatorLayout, null, rect);
        }

        public boolean N(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.J2(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
            j.n(view);
            return wTp(coordinatorLayout, null, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean qie(CoordinatorLayout coordinatorLayout, View view, View view2) {
            j.n(view);
            return s7N(coordinatorLayout, null, view2);
        }

        public boolean s7N(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (nHg(view)) {
                rV9(view, extendedFloatingActionButton);
                return false;
            }
            return false;
        }

        public boolean wTp(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
            List listIk = coordinatorLayout.Ik(extendedFloatingActionButton);
            int size = listIk.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) listIk.get(i3);
                if (nHg(view) && rV9(view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.X(extendedFloatingActionButton, i2);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.uQ);
            this.f58953n = typedArrayObtainStyledAttributes.getBoolean(o.wKY, false);
            this.f58954t = typedArrayObtainStyledAttributes.getBoolean(o.mx, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
