package com.fyber.inneractive.sdk.web;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class m extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f57174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f57176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f57177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f57178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57180g;

    public final void a(String str) {
        IAlog.a("injecting JS: %s", str);
        if (str != null) {
            try {
                DTExchangeNetworkBridge.webviewLoadUrl(this, "javascript:".concat(str));
            } catch (Throwable th) {
                IAlog.a("Failed to inject JS", th, new Object[0]);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public m() {
        super(IAConfigManager.f53260M.f53295u.a());
        this.f57174a = false;
        this.f57178e = new com.fyber.inneractive.sdk.util.g1();
    }

    public int getHeightDp() {
        return this.f57180g;
    }

    public boolean getIsVisible() {
        return this.f57175b;
    }

    public com.fyber.inneractive.sdk.util.g1 getLastClickedLocation() {
        return this.f57178e;
    }

    public int getWidthDp() {
        return this.f57179f;
    }

    public void setHeightDp(int i2) {
        this.f57180g = i2;
    }

    public void setListener(l lVar) {
        this.f57176c = lVar;
    }

    public void setTapListener(x0 x0Var) {
        this.f57177d = new y0(x0Var, IAConfigManager.f53260M.f53295u.a());
    }

    public void setWidthDp(int i2) {
        this.f57179f = i2;
    }

    public final void b() {
        boolean z2;
        IAlog.e("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f57174a), getWindowToken(), getApplicationWindowToken());
        boolean z3 = true;
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() == 8 || !isShown() || !this.f57174a) {
                z3 = false;
            }
            a(z3);
            return;
        }
        if (isShown() && this.f57174a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!IAConfigManager.f53260M.f53294t.f53466b.a(false, "ignore_w_f")) {
            if (!z2 || !hasWindowFocus()) {
                z3 = false;
            }
        } else {
            z3 = z2;
        }
        a(z3);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f57176c = null;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f57174a) {
            this.f57174a = true;
            l lVar = this.f57176c;
            if (lVar != null) {
                lVar.b();
            }
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57175b = false;
        if (this.f57174a) {
            this.f57174a = false;
            l lVar = this.f57176c;
            if (lVar != null) {
                lVar.c();
            }
            a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, x2, y2, 0));
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, x2, y2, 0));
        }
        y0 y0Var = this.f57177d;
        if (y0Var != null) {
            y0Var.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            com.fyber.inneractive.sdk.util.g1 g1Var = this.f57178e;
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            g1Var.f56998a = x3;
            g1Var.f56999b = y3;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        IAlog.e("onWindowFocusChanged with: %s", Boolean.valueOf(z2));
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (i2 == 8) {
            a(false);
        } else {
            a();
        }
    }

    public final void a(boolean z2) {
        if (z2) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.e("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z2 = false;
                }
            } else {
                IAlog.e("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f57175b != z2) {
            this.f57175b = z2;
            l lVar = this.f57176c;
            if (lVar != null) {
                lVar.a(z2);
            }
        }
    }

    public final void a() {
        if (IAConfigManager.f53260M.f53294t.f53466b.a(false, "update_v_mth")) {
            com.fyber.inneractive.sdk.util.r.f57026b.post(new k(this));
        } else {
            b();
        }
    }
}
