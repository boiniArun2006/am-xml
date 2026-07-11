package com.google.android.material.appbar;

import Rxk.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.j {

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private WeakReference f58594N;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private SavedState f58595T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private int f58596X;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f58597e;

        class j extends AccessibilityDelegateCompat {
            final /* synthetic */ CoordinatorLayout nr;

            j(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.nr = coordinatorLayout;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean mUb(View view, int i2, Bundle bundle) {
                if (i2 == 4096) {
                    throw null;
                }
                if (i2 != 8192) {
                    return super.mUb(view, i2, bundle);
                }
                if (BaseBehavior.this.Xw() == 0) {
                    return false;
                }
                if (BaseBehavior.this.FX(this.nr).canScrollVertically(-1)) {
                    throw null;
                }
                throw null;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.Uo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.ofS(ScrollView.class.getName());
                throw null;
            }
        }

        public BaseBehavior() {
        }

        private void eTf(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            throw null;
        }

        int B(AppBarLayout appBarLayout) {
            throw null;
        }

        public void GR(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i5) {
            if (i3 != 0 && i3 >= 0) {
                throw null;
            }
            throw null;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, int i5, int i7) {
            throw null;
        }

        int J(AppBarLayout appBarLayout) {
            throw null;
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new j();
            boolean J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            boolean f58598O;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            boolean f58599Z;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            float f58600o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f58601r;

            class j implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i2) {
                    return new SavedState[i2];
                }

                j() {
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                boolean z2;
                boolean z3;
                super(parcel, classLoader);
                if (parcel.readByte() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f58598O = z2;
                if (parcel.readByte() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.J2 = z3;
                this.f58601r = parcel.readInt();
                this.f58600o = parcel.readFloat();
                this.f58599Z = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeByte(this.f58598O ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.J2 ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f58601r);
                parcel.writeFloat(this.f58600o);
                parcel.writeByte(this.f58599Z ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        boolean M(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f58594N;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public void Nxk(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
            if (i7 < 0) {
                throw null;
            }
            if (i7 == 0) {
                E(coordinatorLayout, appBarLayout);
            }
        }

        public void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                piY((SavedState) parcelable, true);
                super.te(coordinatorLayout, appBarLayout, this.f58595T.n());
            } else {
                super.te(coordinatorLayout, appBarLayout, parcelable);
                this.f58595T = null;
            }
        }

        public boolean dR0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i2, int i3) {
            if ((i2 & 2) != 0) {
                throw null;
            }
            this.f58594N = null;
            this.f58596X = i3;
            return false;
        }

        void piY(SavedState savedState, boolean z2) {
            if (this.f58595T == null || z2) {
                this.f58595T = savedState;
            }
        }

        public void z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
            if (this.f58596X == 0 || i2 == 1) {
                eTf(coordinatorLayout, appBarLayout);
                throw null;
            }
            this.f58594N = new WeakReference(view);
        }

        private void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (!ViewCompat.rV9(coordinatorLayout)) {
                ViewCompat.eTf(coordinatorLayout, new j(appBarLayout, coordinatorLayout));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View FX(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).O() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            eTf(coordinatorLayout, appBarLayout);
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean E2(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            android.support.v4.media.j.n(view);
            return dR0(coordinatorLayout, null, view2, view3, i2, i3);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean Ik(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i5, int i7) {
            android.support.v4.media.j.n(view);
            return I(coordinatorLayout, null, i2, i3, i5, i7);
        }

        @Override // com.google.android.material.appbar.j
        /* bridge */ /* synthetic */ int M7(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i5) {
            android.support.v4.media.j.n(view);
            return m(coordinatorLayout, null, i2, i3, i5);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void X(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            android.support.v4.media.j.n(view);
            z(coordinatorLayout, null, view2, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void XQ(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i5) {
            android.support.v4.media.j.n(view);
            GR(coordinatorLayout, null, view2, i2, i3, iArr, i5);
        }

        @Override // com.google.android.material.appbar.j
        int Xw() {
            return N() + this.f58597e;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
            super.ck(coordinatorLayout, appBarLayout, i2);
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void aYN(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
            android.support.v4.media.j.n(view);
            Nxk(coordinatorLayout, null, view2, i2, i3, i5, i7, i8, iArr);
        }

        @Override // com.google.android.material.appbar.j
        /* bridge */ /* synthetic */ int bzg(View view) {
            android.support.v4.media.j.n(view);
            return J(null);
        }

        @Override // com.google.android.material.appbar.w6, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
            android.support.v4.media.j.n(view);
            return a(coordinatorLayout, null, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ Parcelable iF(CoordinatorLayout coordinatorLayout, View view) {
            android.support.v4.media.j.n(view);
            return k(coordinatorLayout, null);
        }

        SavedState ijL(Parcelable parcelable, AppBarLayout appBarLayout) {
            N();
            throw null;
        }

        @Override // com.google.android.material.appbar.j
        /* bridge */ /* synthetic */ void jB(CoordinatorLayout coordinatorLayout, View view) {
            android.support.v4.media.j.n(view);
            D(coordinatorLayout, null);
        }

        public Parcelable k(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableIF = super.iF(coordinatorLayout, appBarLayout);
            SavedState savedStateIjL = ijL(parcelableIF, appBarLayout);
            if (savedStateIjL == null) {
                return parcelableIF;
            }
            return savedStateIjL;
        }

        int m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, int i5) {
            int iXw = Xw();
            if (i3 != 0 && iXw >= i3 && iXw <= i5) {
                if (iXw != MathUtils.rl(i2, i3, i5)) {
                    throw null;
                }
            } else {
                this.f58597e = 0;
            }
            E(coordinatorLayout, appBarLayout);
            return 0;
        }

        @Override // com.google.android.material.appbar.j
        /* bridge */ /* synthetic */ int rV9(View view) {
            android.support.v4.media.j.n(view);
            return B(null);
        }

        @Override // com.google.android.material.appbar.j
        /* bridge */ /* synthetic */ boolean s7N(View view) {
            android.support.v4.media.j.n(view);
            return M(null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void te(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            android.support.v4.media.j.n(view);
            Y(coordinatorLayout, null, parcelable);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void GR(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i5) {
            super.GR(coordinatorLayout, appBarLayout, view, i2, i3, iArr, i5);
        }

        @Override // com.google.android.material.appbar.j, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean HI(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.HI(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, int i5, int i7) {
            return super.I(coordinatorLayout, appBarLayout, i2, i3, i5, i7);
        }

        @Override // com.google.android.material.appbar.w6
        public /* bridge */ /* synthetic */ int N() {
            return super.N();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void Nxk(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
            super.Nxk(coordinatorLayout, appBarLayout, view, i2, i3, i5, i7, i8, iArr);
        }

        @Override // com.google.android.material.appbar.j, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean T(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.T(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.Y(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
            return super.a(coordinatorLayout, appBarLayout, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean dR0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i2, int i3) {
            return super.dR0(coordinatorLayout, appBarLayout, view, view2, i2, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable k(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.k(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
            super.z(coordinatorLayout, appBarLayout, view, i2);
        }
    }

    public static class ScrollingViewBehavior extends n {
        public ScrollingViewBehavior() {
        }

        private void p5(View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void az(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // com.google.android.material.appbar.n
        float v(View view) {
            return 0.0f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean xMQ(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.Kqf);
            jB(typedArrayObtainStyledAttributes.getDimensionPixelSize(o.gv0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private void M7(View view, View view2) {
            CoordinatorLayout.Behavior behaviorO = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).O();
            if (behaviorO instanceof BaseBehavior) {
                ViewCompat.FX(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behaviorO).f58597e) + bzg()) - wTp(view2));
            }
        }

        @Override // com.google.android.material.appbar.n, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean Ik(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i5, int i7) {
            return super.Ik(coordinatorLayout, view, i2, i3, i5, i7);
        }

        AppBarLayout P5(List list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
            }
            return null;
        }

        @Override // com.google.android.material.appbar.w6, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
            return super.ck(coordinatorLayout, view, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean g(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
            P5(coordinatorLayout.Ik(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean qie(CoordinatorLayout coordinatorLayout, View view, View view2) {
            M7(view, view2);
            p5(view, view2);
            return false;
        }

        @Override // com.google.android.material.appbar.n
        int rV9(View view) {
            return super.rV9(view);
        }

        @Override // com.google.android.material.appbar.n
        /* bridge */ /* synthetic */ View s7N(List list) {
            P5(list);
            return null;
        }
    }
}
