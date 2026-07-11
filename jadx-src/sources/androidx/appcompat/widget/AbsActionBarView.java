package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class AbsActionBarView extends ViewGroup {
    protected ActionMenuPresenter J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected ActionMenuView f13920O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f13921S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13922g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final VisibilityAnimListener f13923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ViewPropertyAnimatorCompat f13924o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f13925r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final Context f13926t;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AbsActionBarView$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AbsActionBarView f13927n;

        @Override // java.lang.Runnable
        public void run() {
            this.f13927n.Uo();
        }
    }

    protected class VisibilityAnimListener implements ViewPropertyAnimatorListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f13928n = false;
        int rl;

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void n(View view) {
            this.f13928n = true;
        }

        protected VisibilityAnimListener() {
        }

        public VisibilityAnimListener nr(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i2) {
            AbsActionBarView.this.f13924o = viewPropertyAnimatorCompat;
            this.rl = i2;
            return this;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void rl(View view) {
            if (this.f13928n) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f13924o = null;
            AbsActionBarView.super.setVisibility(this.rl);
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void t(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f13928n = false;
        }
    }

    protected static int nr(int i2, int i3, boolean z2) {
        return z2 ? i2 - i3 : i2 + i3;
    }

    public ViewPropertyAnimatorCompat J2(int i2, long j2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f13924o;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.t();
        }
        if (i2 != 0) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatRl = ViewCompat.O(this).rl(0.0f);
            viewPropertyAnimatorCompatRl.O(j2);
            viewPropertyAnimatorCompatRl.Uo(this.f13923n.nr(viewPropertyAnimatorCompatRl, i2));
            return viewPropertyAnimatorCompatRl;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatRl2 = ViewCompat.O(this).rl(1.0f);
        viewPropertyAnimatorCompatRl2.O(j2);
        viewPropertyAnimatorCompatRl2.Uo(this.f13923n.nr(viewPropertyAnimatorCompatRl2, i2));
        return viewPropertyAnimatorCompatRl2;
    }

    public boolean Uo() {
        ActionMenuPresenter actionMenuPresenter = this.J2;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.rV9();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f13924o != null ? this.f13923n.rl : getVisibility();
    }

    public int getContentHeight() {
        return this.f13925r;
    }

    public void setContentHeight(int i2) {
        this.f13925r = i2;
        requestLayout();
    }

    protected int t(View view, int i2, int i3, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i5);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f13923n = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.f13439n, typedValue, true) && typedValue.resourceId != 0) {
            this.f13926t = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f13926t = context;
        }
    }

    protected int O(View view, int i2, int i3, int i5, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i3 + ((i5 - measuredHeight) / 2);
        if (z2) {
            view.layout(i2 - measuredWidth, i7, i2, measuredHeight + i7);
        } else {
            view.layout(i2, i7, i2 + measuredWidth, measuredHeight + i7);
        }
        if (z2) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.f13531n, R.attr.f13442t, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.mUb, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.J2;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.N(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f13922g = false;
        }
        if (!this.f13922g) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f13922g = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f13922g = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13921S = false;
        }
        if (!this.f13921S) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f13921S = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f13921S = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f13924o;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.t();
            }
            super.setVisibility(i2);
        }
    }
}
