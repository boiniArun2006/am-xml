package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class j extends w6 {
    private VelocityTracker E2;
    private Runnable J2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f58606S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f58607Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58608g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f58609o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    OverScroller f58610r;

    /* JADX INFO: renamed from: com.google.android.material.appbar.j$j, reason: collision with other inner class name */
    private class RunnableC0782j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CoordinatorLayout f58612n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final View f58613t;

        RunnableC0782j(CoordinatorLayout coordinatorLayout, View view) {
            this.f58612n = coordinatorLayout;
            this.f58613t = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f58613t == null || (overScroller = j.this.f58610r) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                j.this.jB(this.f58612n, this.f58613t);
                return;
            }
            j jVar = j.this;
            jVar.P5(this.f58612n, this.f58613t, jVar.f58610r.getCurrY());
            ViewCompat.Nxk(this.f58613t, this);
        }
    }

    public j() {
        this.f58607Z = -1;
        this.f58608g = -1;
    }

    abstract int M7(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i5);

    abstract int Xw();

    abstract int bzg(View view);

    abstract void jB(CoordinatorLayout coordinatorLayout, View view);

    abstract int rV9(View view);

    abstract boolean s7N(View view);

    private void wTp() {
        if (this.E2 == null) {
            this.E2 = VelocityTracker.obtain();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean HI(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f58608g < 0) {
            this.f58608g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f58609o) {
            int i2 = this.f58607Z;
            if (i2 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y2 - this.f58606S) > this.f58608g) {
                this.f58606S = y2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f58607Z = -1;
            int x2 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            boolean z2 = s7N(view) && coordinatorLayout.nY(view, x2, y3);
            this.f58609o = z2;
            if (z2) {
                this.f58606S = y3;
                this.f58607Z = motionEvent.getPointerId(0);
                wTp();
                OverScroller overScroller = this.f58610r;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f58610r.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.E2;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    int P5(CoordinatorLayout coordinatorLayout, View view, int i2) {
        return M7(coordinatorLayout, view, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    final boolean v(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, float f3) {
        Runnable runnable = this.J2;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.J2 = null;
        }
        if (this.f58610r == null) {
            this.f58610r = new OverScroller(view.getContext());
        }
        this.f58610r.fling(0, N(), 0, Math.round(f3), 0, 0, i2, i3);
        if (!this.f58610r.computeScrollOffset()) {
            jB(coordinatorLayout, view);
            return false;
        }
        RunnableC0782j runnableC0782j = new RunnableC0782j(coordinatorLayout, view);
        this.J2 = runnableC0782j;
        ViewCompat.Nxk(view, runnableC0782j);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean T(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        this.f58607Z = motionEvent.getPointerId(i2);
                        this.f58606S = (int) (motionEvent.getY(i2) + 0.5f);
                    }
                }
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f58607Z);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                int i3 = this.f58606S - y2;
                this.f58606S = y2;
                U(coordinatorLayout, view, i3, rV9(view), 0);
            }
            z2 = false;
            velocityTracker2 = this.E2;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (!this.f58609o || z2) {
                return true;
            }
            return false;
        }
        VelocityTracker velocityTracker3 = this.E2;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.E2.computeCurrentVelocity(1000);
            v(coordinatorLayout, view, -bzg(view), 0, this.E2.getYVelocity(this.f58607Z));
            z2 = true;
        }
        this.f58609o = false;
        this.f58607Z = -1;
        velocityTracker = this.E2;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.E2 = null;
        }
        velocityTracker2 = this.E2;
        if (velocityTracker2 != null) {
        }
        if (!this.f58609o) {
        }
        return true;
        z2 = false;
        this.f58609o = false;
        this.f58607Z = -1;
        velocityTracker = this.E2;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.E2;
        if (velocityTracker2 != null) {
        }
        if (!this.f58609o) {
        }
        return true;
    }

    final int U(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i5) {
        return M7(coordinatorLayout, view, Xw() - i2, i3, i5);
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58607Z = -1;
        this.f58608g = -1;
    }
}
