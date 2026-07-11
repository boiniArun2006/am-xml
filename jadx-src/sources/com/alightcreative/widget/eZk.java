package com.alightcreative.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.alightcreative.widget.ValueSpinner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class eZk extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ValueSpinner f47394n;

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValueSpinner.n.values().length];
            try {
                iArr[ValueSpinner.n.f47351n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueSpinner.n.f47352t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    eZk(ValueSpinner valueSpinner) {
        this.f47394n = valueSpinner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(float f3, float f4) {
        return "onFling: velocityX=" + f3 + ", velocityY=" + f4;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        this.f47394n.scroller.forceFinished(true);
        this.f47394n.setFlingSettling(false);
        this.f47394n.postInvalidateOnAnimation();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent e2, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (!this.f47394n.getTrackingTouch()) {
            this.f47394n.setTrackingTouch(true);
            this.f47394n.getOnStartTrackingTouch().invoke();
        }
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.s6u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return eZk.t(f3, f4);
            }
        });
        this.f47394n.scroller.forceFinished(true);
        int i2 = j.$EnumSwitchMapping$0[this.f47394n.orientation.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (Math.abs(f4) > 300.0f) {
                final ValueSpinner valueSpinner = this.f47394n;
                XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.yr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return eZk.nr(valueSpinner, f4);
                    }
                });
                this.f47394n.scroller.fling(0, (int) this.f47394n.scrollY, 0, -((int) f4), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        } else if (Math.abs(f3) > 300.0f) {
            this.f47394n.scroller.fling((int) this.f47394n.scrollX, 0, -((int) f3), 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        }
        this.f47394n.setFlingSettling(true);
        this.f47394n.setPendingSnap(true);
        this.f47394n.scroller.getFinalX();
        this.f47394n.scroller.getFinalY();
        this.f47394n.postInvalidateOnAnimation();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (!this.f47394n.getTrackingTouch()) {
            this.f47394n.setTrackingTouch(true);
            this.f47394n.getParent().requestDisallowInterceptTouchEvent(true);
            this.f47394n.getOnStartTrackingTouch().invoke();
        }
        this.f47394n.scrollX += f3;
        this.f47394n.scrollY += f4;
        this.f47394n.Z();
        this.f47394n.postInvalidateOnAnimation();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nr(ValueSpinner valueSpinner, float f3) {
        return "onFling: vertical startY=" + ((int) valueSpinner.scrollY) + " velocityY=" + (-((int) f3));
    }
}
