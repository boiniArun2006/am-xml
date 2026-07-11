package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1804o f48604a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f48608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f48609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f48610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f48611h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f48614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f48615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f48616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f48617n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f48605b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f48606c = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference f48612i = new WeakReference(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f48613j = new WeakReference(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f48618o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f48607d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f48610g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f48613j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (C1804o.a()) {
            this.f48604a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f48605b) {
            this.f48607d.removeMessages(0);
            b((View) this.f48610g.get());
            this.f48618o = Long.MIN_VALUE;
            this.f48613j.clear();
        }
    }

    private void c(View view) {
        View viewB = e8.b((View) this.f48610g.get());
        if (viewB == null) {
            viewB = e8.b(view);
        }
        if (viewB == null) {
            if (C1804o.a()) {
                this.f48604a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f48612i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f48609f);
        } else if (C1804o.a()) {
            this.f48604a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    public g8(final View view, C1802k c1802k, a aVar) {
        this.f48604a = c1802k.O();
        this.f48611h = ((Long) c1802k.a(x4.y1)).longValue();
        this.f48610g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f48608e = new Runnable() { // from class: com.applovin.impl.FKk
            @Override // java.lang.Runnable
            public final void run() {
                this.f47718n.a(weakReference);
            }
        };
        this.f48609f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.Fl
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f47723n.a(view);
            }
        };
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f48606c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f48606c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f48606c.height());
        if (jPxToDp < this.f48614k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.f48615l) {
            return false;
        }
        return (((float) ((long) (this.f48606c.width() * this.f48606c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.f48616m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(h3 h3Var) {
        View viewS0;
        if (h3Var instanceof b3) {
            viewS0 = h3Var.y();
        } else if (!(h3Var instanceof d3)) {
            return;
        } else {
            viewS0 = ((d3) h3Var).s0();
        }
        a(h3Var.k0(), h3Var.m0(), h3Var.n0(), h3Var.o0(), viewS0);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f48612i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f48609f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f48609f);
            } else if (C1804o.a()) {
                this.f48604a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (C1804o.a()) {
            this.f48604a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f48612i.clear();
    }

    public void a(int i2, float f3, float f4, long j2, View view) {
        synchronized (this.f48605b) {
            try {
                if (C1804o.a()) {
                    this.f48604a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.f48613j = weakReference;
                this.f48614k = i2;
                this.f48615l = f3;
                this.f48616m = f4;
                this.f48617n = j2;
                c((View) weakReference.get());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        this.f48607d.postDelayed(this.f48608e, this.f48611h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.f48618o == Long.MIN_VALUE) {
                this.f48618o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f48618o >= this.f48617n) {
                return true;
            }
        }
        return false;
    }
}
