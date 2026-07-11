package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {
    final View J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f14201O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f14202S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f14203Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f14204g = new int[2];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f14205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Runnable f14206o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f14207r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f14208t;

    private class DisallowIntercept implements Runnable {
        DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = ForwardingListener.this.J2.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class TriggerLongPress implements Runnable {
        TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForwardingListener.this.O();
        }
    }

    private static boolean KN(View view, float f3, float f4, float f5) {
        float f6 = -f5;
        return f3 >= f6 && f4 >= f6 && f3 < ((float) (view.getRight() - view.getLeft())) + f5 && f4 < ((float) (view.getBottom() - view.getTop())) + f5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f14203Z = false;
        this.f14202S = -1;
        Runnable runnable = this.f14207r;
        if (runnable != null) {
            this.J2.removeCallbacks(runnable);
        }
    }

    public abstract ShowableListMenu rl();

    private boolean J2(MotionEvent motionEvent) {
        DropDownListView dropDownListView;
        View view = this.J2;
        ShowableListMenu showableListMenuRl = rl();
        if (showableListMenuRl != null && showableListMenuRl.n() && (dropDownListView = (DropDownListView) showableListMenuRl.ty()) != null && dropDownListView.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            xMQ(view, motionEventObtainNoHistory);
            mUb(dropDownListView, motionEventObtainNoHistory);
            boolean zO = dropDownListView.O(motionEventObtainNoHistory, this.f14202S);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z2 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zO && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean Uo(MotionEvent motionEvent) {
        View view = this.J2;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14202S = motionEvent.getPointerId(0);
            if (this.f14207r == null) {
                this.f14207r = new DisallowIntercept();
            }
            view.postDelayed(this.f14207r, this.f14208t);
            if (this.f14206o == null) {
                this.f14206o = new TriggerLongPress();
            }
            view.postDelayed(this.f14206o, this.f14201O);
        } else if (actionMasked == 1) {
            n();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f14202S);
            if (iFindPointerIndex >= 0 && !KN(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f14205n)) {
                n();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return false;
    }

    private boolean mUb(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f14204g);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    private void n() {
        Runnable runnable = this.f14206o;
        if (runnable != null) {
            this.J2.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f14207r;
        if (runnable2 != null) {
            this.J2.removeCallbacks(runnable2);
        }
    }

    private boolean xMQ(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f14204g);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = this.f14203Z;
        if (z3) {
            z2 = J2(motionEvent) || !nr();
        } else {
            z2 = Uo(motionEvent) && t();
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.J2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f14203Z = z2;
        return z2 || z3;
    }

    public ForwardingListener(View view) {
        this.J2 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f14205n = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f14208t = tapTimeout;
        this.f14201O = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    void O() {
        n();
        View view = this.J2;
        if (view.isEnabled() && !view.isLongClickable() && t()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f14203Z = true;
        }
    }

    protected boolean nr() {
        ShowableListMenu showableListMenuRl = rl();
        if (showableListMenuRl != null && showableListMenuRl.n()) {
            showableListMenuRl.dismiss();
            return true;
        }
        return true;
    }

    protected boolean t() {
        ShowableListMenu showableListMenuRl = rl();
        if (showableListMenuRl != null && !showableListMenuRl.n()) {
            showableListMenuRl.show();
            return true;
        }
        return true;
    }
}
