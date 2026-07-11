package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f58673O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ViewDragHelper f58678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f58679o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    w6 f58681t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f58680r = 0.0f;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f58675Z = 2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    float f58674S = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f58677g = 0.0f;
    float E2 = 0.5f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewDragHelper.Callback f58676e = new j();

    private class Ml implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f58683n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f58684t;

        Ml(View view, boolean z2) {
            this.f58683n = view;
            this.f58684t = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            w6 w6Var;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f58678n;
            if (viewDragHelper != null && viewDragHelper.ty(true)) {
                ViewCompat.Nxk(this.f58683n, this);
            } else {
                if (!this.f58684t || (w6Var = SwipeDismissBehavior.this.f58681t) == null) {
                    return;
                }
                w6Var.n(this.f58683n);
            }
        }
    }

    class j extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f58685n;
        private int rl = -1;

        private boolean ty(View view, float f3) {
            if (f3 == 0.0f) {
                return Math.abs(view.getLeft() - this.f58685n) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f58674S);
            }
            boolean z2 = ViewCompat.nY(view) == 1;
            int i2 = SwipeDismissBehavior.this.f58675Z;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                return z2 ? f3 < 0.0f : f3 > 0.0f;
            }
            if (i2 == 1) {
                if (z2) {
                    return f3 > 0.0f;
                }
                if (f3 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void qie(View view, float f3, float f4) {
            int i2;
            boolean z2;
            w6 w6Var;
            this.rl = -1;
            int width = view.getWidth();
            if (!ty(view, f3)) {
                i2 = this.f58685n;
                z2 = false;
            } else if (f3 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f58685n;
                i2 = left < i3 ? this.f58685n - width : i3 + width;
                z2 = true;
            }
            if (SwipeDismissBehavior.this.f58678n.Xw(i2, view.getTop())) {
                ViewCompat.Nxk(view, new Ml(view, z2));
            } else {
                if (!z2 || (w6Var = SwipeDismissBehavior.this.f58681t) == null) {
                    return;
                }
                w6Var.n(view);
            }
        }

        j() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean az(View view, int i2) {
            int i3 = this.rl;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.nHg(view);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void mUb(int i2) {
            w6 w6Var = SwipeDismissBehavior.this.f58681t;
            if (w6Var != null) {
                w6Var.rl(i2);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void xMQ(View view, int i2) {
            this.rl = i2;
            this.f58685n = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.J2 = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.J2 = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void gh(View view, int i2, int i3, int i5, int i7) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f58677g;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.E2;
            float fAbs = Math.abs(i2 - this.f58685n);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.s7N(0.0f, 1.0f - SwipeDismissBehavior.rV9(width, width2, fAbs), 1.0f));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int n(View view, int i2, int i3) {
            boolean z2;
            int width;
            int width2;
            int width3;
            if (ViewCompat.nY(view) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i5 = SwipeDismissBehavior.this.f58675Z;
            if (i5 == 0) {
                if (z2) {
                    width = this.f58685n - view.getWidth();
                    width2 = this.f58685n;
                } else {
                    width = this.f58685n;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i5 == 1) {
                if (z2) {
                    width = this.f58685n;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f58685n - view.getWidth();
                    width2 = this.f58685n;
                }
            } else {
                width = this.f58685n - view.getWidth();
                width2 = view.getWidth() + this.f58685n;
            }
            return SwipeDismissBehavior.wTp(width, i2, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int nr(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int rl(View view, int i2, int i3) {
            return view.getTop();
        }
    }

    class n implements AccessibilityViewCommand {
        n() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean n(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
            if (!SwipeDismissBehavior.this.nHg(view)) {
                return false;
            }
            boolean z2 = ViewCompat.nY(view) == 1;
            int i2 = SwipeDismissBehavior.this.f58675Z;
            ViewCompat.M(view, (!(i2 == 0 && z2) && (i2 != 1 || z2)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            w6 w6Var = SwipeDismissBehavior.this.f58681t;
            if (w6Var != null) {
                w6Var.n(view);
            }
            return true;
        }
    }

    public interface w6 {
        void n(View view);

        void rl(int i2);
    }

    static float rV9(float f3, float f4, float f5) {
        return (f5 - f3) / (f4 - f3);
    }

    public void bzg(float f3) {
        this.E2 = s7N(0.0f, f3, 1.0f);
    }

    public void jB(float f3) {
        this.f58677g = s7N(0.0f, f3, 1.0f);
    }

    public boolean nHg(View view) {
        return true;
    }

    private void P5(View view) {
        ViewCompat.k(view, 1048576);
        if (nHg(view)) {
            ViewCompat.z(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ViF, null, new n());
        }
    }

    private void v(ViewGroup viewGroup) {
        if (this.f58678n == null) {
            this.f58678n = this.f58679o ? ViewDragHelper.HI(viewGroup, this.f58680r, this.f58676e) : ViewDragHelper.ck(viewGroup, this.f58676e);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean HI(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zNY = this.f58673O;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zNY = coordinatorLayout.nY(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f58673O = zNY;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f58673O = false;
        }
        if (zNY) {
            v(coordinatorLayout);
            if (!this.J2 && this.f58678n.jB(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean T(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f58678n == null) {
            return false;
        }
        if (this.J2 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f58678n.X(motionEvent);
        return true;
    }

    public void U(int i2) {
        this.f58675Z = i2;
    }

    public void Xw(w6 w6Var) {
        this.f58681t = w6Var;
    }

    static float s7N(float f3, float f4, float f5) {
        return Math.min(Math.max(f3, f4), f5);
    }

    static int wTp(int i2, int i3, int i5) {
        return Math.min(Math.max(i2, i3), i5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
        boolean zCk = super.ck(coordinatorLayout, view, i2);
        if (ViewCompat.aYN(view) == 0) {
            ViewCompat.ul(view, 1);
            P5(view);
        }
        return zCk;
    }
}
