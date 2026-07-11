package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class e extends RelativeLayout implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f56425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0 f56427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UnitDisplayType f56428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f56430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f56431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f56433i;

    public e(Context context) {
        super(context, null, 0);
        this.f56425a = new g1();
        this.f56426b = 0;
        this.f56429e = false;
        this.f56430f = false;
        this.f56432h = false;
        this.f56426b = Math.min(com.fyber.inneractive.sdk.util.o.e(), com.fyber.inneractive.sdk.util.o.d());
    }

    public abstract void a(h1 h1Var, int i2, int i3);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean b() {
        return false;
    }

    public void d() {
        this.f56432h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void e() {
        this.f56432h = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public View getWatermarkView() {
        return this.f56433i;
    }

    public void setListener(n nVar) {
        this.f56431g = nVar;
    }

    public void setUnitConfig(s0 s0Var) {
        this.f56427c = s0Var;
        r0 r0Var = (r0) s0Var;
        this.f56428d = r0Var.f53419e == null ? r0Var.f53420f.f53480j : UnitDisplayType.DEFAULT;
    }

    public void setWatermarkView(View view) {
        this.f56433i = view;
    }

    public final void f() {
        boolean globalVisibleRect;
        if (isShown() && hasWindowFocus() && this.f56430f && !this.f56432h) {
            globalVisibleRect = true;
        } else {
            globalVisibleRect = false;
        }
        if (globalVisibleRect) {
            globalVisibleRect = getGlobalVisibleRect(new Rect());
        }
        if (globalVisibleRect != this.f56429e && this.f56431g != null) {
            IAlog.a("%supdateVisibility changing to %s", IAlog.a(this), Boolean.valueOf(globalVisibleRect));
            this.f56429e = globalVisibleRect;
            this.f56431g.a(globalVisibleRect);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f56430f));
        this.f56430f = true;
        n nVar = this.f56431g;
        if (nVar != null) {
            nVar.a();
        }
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f56430f));
        this.f56430f = false;
        n nVar = this.f56431g;
        if (nVar != null) {
            nVar.c();
        }
        f();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (equals(view)) {
            IAlog.a("%sgot onVisibilityChanged with %d", IAlog.a(this), Integer.valueOf(i2));
            f();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        IAlog.a("%sgot onWindowFocusChanged with: %s", IAlog.a(this), Boolean.valueOf(z2));
        com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(new d(this, z2), 500L);
    }
}
