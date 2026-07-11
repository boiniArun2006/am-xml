package com.alightcreative.widget;

import GK.j;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001:\u0004123\u0019B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001fR\u0016\u0010)\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u0016\u0010/\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\"R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u00064"}, d2 = {"Lcom/alightcreative/widget/RecyclerViewEx;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "rl", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "onDrawForeground", "Landroid/view/MotionEvent;", "e", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "LGK/j;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "LGK/j;", "getScaleGestureDetector", "()LGK/j;", "scaleGestureDetector", "t", "I", "INVALID_POINTER", "O", "Z", "inMultiTouchGesture", "J2", "mInitialTouchX", "r", "mInitialTouchY", "o", "mInScroll", "S", "mScrollPointerId", "g", "mTouchSlop", "E2", "layoutManagerInterceptingTouch", "longPressTime", "j", "w6", "Ml", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecyclerViewEx extends RecyclerView {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean layoutManagerInterceptingTouch;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int mInitialTouchX;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean inMultiTouchGesture;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int mScrollPointerId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int longPressTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int mTouchSlop;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final GK.j scaleGestureDetector;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean mInScroll;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int mInitialTouchY;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int INVALID_POINTER;

    public static final class I28 implements j.n {
        @Override // GK.j.n
        public boolean J2(GK.j jVar) {
            return true;
        }

        I28() {
        }

        @Override // GK.j.n
        public boolean O(GK.j detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Object layoutManager = RecyclerViewEx.this.getLayoutManager();
            w6 w6Var = layoutManager instanceof w6 ? (w6) layoutManager : null;
            if (w6Var != null) {
                return w6Var.O(detector);
            }
            return false;
        }

        @Override // GK.j.n
        public void nr(GK.j detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Object layoutManager = RecyclerViewEx.this.getLayoutManager();
            w6 w6Var = layoutManager instanceof w6 ? (w6) layoutManager : null;
            if (w6Var != null) {
                w6Var.nr(detector);
            }
        }

        @Override // GK.j.n
        public boolean rl(GK.j detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Object layoutManager = RecyclerViewEx.this.getLayoutManager();
            w6 w6Var = layoutManager instanceof w6 ? (w6) layoutManager : null;
            boolean zRl = w6Var != null ? w6Var.rl(detector) : false;
            if (zRl) {
                RecyclerViewEx.this.requestLayout();
            }
            return zRl;
        }
    }

    public interface Ml {
        void HI();

        void qie();
    }

    public interface j {
        void az(RecyclerView recyclerView, Canvas canvas);

        void ty(RecyclerView recyclerView, Canvas canvas);
    }

    public interface n {
        void xMQ(MotionEvent motionEvent, boolean z2);
    }

    public interface w6 {
        boolean O(GK.j jVar);

        void nr(GK.j jVar);

        boolean rl(GK.j jVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewEx(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scaleGestureDetector = new GK.j(context, new I28());
        this.INVALID_POINTER = -1;
        this.mScrollPointerId = -1;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.longPressTime = ViewConfiguration.getLongPressTimeout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (isInEditMode()) {
            super.dispatchDraw(canvas);
            return;
        }
        Object layoutManager = getLayoutManager();
        j jVar = layoutManager instanceof j ? (j) layoutManager : null;
        if (jVar != null) {
            jVar.ty(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final GK.j getScaleGestureDetector() {
        return this.scaleGestureDetector;
    }

    @Override // android.view.View
    public void onDrawForeground(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        rl(canvas);
        super.onDrawForeground(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        int actionMasked = e2.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                Object[] objArr = (this.inMultiTouchGesture || this.mInScroll || (System.nanoTime() / 1000000) - e2.getDownTime() >= ((long) this.longPressTime)) ? false : true;
                this.mInScroll = false;
                if (objArr != false) {
                    RecyclerView.LayoutManager layoutManager = getLayoutManager();
                    n nVar = layoutManager instanceof n ? (n) layoutManager : null;
                    if (nVar != null) {
                        nVar.xMQ(e2, true);
                    }
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex = e2.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    Log.d(RecyclerViewEx.class.getSimpleName(), "ACTION_MOVE bad pointer index");
                } else {
                    int x2 = (int) (e2.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (e2.getY(iFindPointerIndex) + 0.5f);
                    if (!this.mInScroll) {
                        int iAbs = Math.abs(x2 - this.mInitialTouchX);
                        int iAbs2 = Math.abs(y2 - this.mInitialTouchY);
                        int i2 = this.mTouchSlop;
                        if (iAbs > i2 && iAbs >= iAbs2) {
                            this.mInScroll = true;
                            RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
                            Ml ml = layoutManager2 instanceof Ml ? (Ml) layoutManager2 : null;
                            if (ml != null) {
                                ml.qie();
                            }
                        } else if (iAbs2 > i2) {
                            this.mInScroll = true;
                            RecyclerView.LayoutManager layoutManager3 = getLayoutManager();
                            Ml ml2 = layoutManager3 instanceof Ml ? (Ml) layoutManager3 : null;
                            if (ml2 != null) {
                                ml2.HI();
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                this.mInScroll = false;
            } else if (actionMasked == 5) {
                this.mInitialTouchX = (int) (e2.getX() + 0.5f);
                this.mInitialTouchY = (int) (e2.getY() + 0.5f);
                this.mScrollPointerId = e2.getPointerId(0);
            }
        } else {
            this.inMultiTouchGesture = false;
            this.mInitialTouchX = (int) (e2.getX() + 0.5f);
            this.mInitialTouchY = (int) (e2.getY() + 0.5f);
            this.mScrollPointerId = e2.getPointerId(0);
            this.mInScroll = false;
            getLayoutManager();
            this.layoutManagerInterceptingTouch = false;
        }
        return super.onInterceptTouchEvent(e2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        if (this.layoutManagerInterceptingTouch) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.alightcreative.widget.RecyclerViewEx.LayoutManagerTouchExtensions");
            android.support.v4.media.j.n(layoutManager);
            throw null;
        }
        int actionMasked = e2.getActionMasked();
        if (actionMasked == 0) {
            this.inMultiTouchGesture = false;
            this.mInitialTouchX = (int) (e2.getX() + 0.5f);
            this.mInitialTouchY = (int) (e2.getY() + 0.5f);
            this.mScrollPointerId = e2.getPointerId(0);
            this.mInScroll = false;
        } else if (actionMasked == 1) {
            Object[] objArr = (this.inMultiTouchGesture || this.mInScroll || (System.nanoTime() / 1000000) - e2.getDownTime() >= ((long) this.longPressTime)) ? false : true;
            this.inMultiTouchGesture = false;
            this.mInScroll = false;
            if (objArr != false) {
                RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
                n nVar = layoutManager2 instanceof n ? (n) layoutManager2 : null;
                if (nVar != null) {
                    nVar.xMQ(e2, false);
                }
            }
        } else if (actionMasked == 2) {
            int iFindPointerIndex = e2.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.d(RecyclerViewEx.class.getSimpleName(), "ACTION_MOVE bad pointer index");
            } else {
                int x2 = (int) (e2.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (e2.getY(iFindPointerIndex) + 0.5f);
                if (!this.mInScroll) {
                    int iAbs = Math.abs(x2 - this.mInitialTouchX);
                    int iAbs2 = Math.abs(y2 - this.mInitialTouchY);
                    int i2 = this.mTouchSlop;
                    if (iAbs > i2 && iAbs >= iAbs2) {
                        this.mInScroll = true;
                        RecyclerView.LayoutManager layoutManager3 = getLayoutManager();
                        Ml ml = layoutManager3 instanceof Ml ? (Ml) layoutManager3 : null;
                        if (ml != null) {
                            ml.qie();
                        }
                    } else if (iAbs2 > i2) {
                        this.mInScroll = true;
                        RecyclerView.LayoutManager layoutManager4 = getLayoutManager();
                        Ml ml2 = layoutManager4 instanceof Ml ? (Ml) layoutManager4 : null;
                        if (ml2 != null) {
                            ml2.HI();
                        }
                    }
                }
            }
        } else if (actionMasked == 3) {
            this.inMultiTouchGesture = false;
            this.mInScroll = false;
        } else if (actionMasked == 5) {
            this.mInitialTouchX = (int) (e2.getX() + 0.5f);
            this.mInitialTouchY = (int) (e2.getY() + 0.5f);
            this.mScrollPointerId = e2.getPointerId(0);
            if (!this.inMultiTouchGesture) {
                MotionEvent motionEventObtain = MotionEvent.obtain(e2);
                motionEventObtain.setAction(3);
                super.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                this.inMultiTouchGesture = true;
            }
        }
        return (!this.inMultiTouchGesture ? super.onTouchEvent(e2) : false) || (getLayoutManager() instanceof w6 ? this.scaleGestureDetector.KN(e2) : false);
    }

    private final void rl(Canvas canvas) {
        j jVar;
        if (isInEditMode()) {
            super.dispatchDraw(canvas);
            return;
        }
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof j) {
            jVar = (j) layoutManager;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            jVar.az(this, canvas);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecyclerViewEx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
