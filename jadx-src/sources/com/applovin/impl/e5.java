package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f48475a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f48476b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f48477c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f48478d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f48479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f48480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f48481g;

    public interface a {
        void a(int i2, int i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f48481g = null;
        View view = (View) this.f48479e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f48480f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f48479e.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f48476b) {
            try {
                this.f48478d = false;
                int iMin = -1;
                int iMax = -1;
                for (Map.Entry entry : this.f48475a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (iMin == -1 && iMax == -1) {
                            iMin = num.intValue();
                            iMax = num.intValue();
                        } else {
                            iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                            iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f48481g;
                if (aVar != null) {
                    aVar.a(iMin, iMax);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        if (this.f48478d) {
            return;
        }
        this.f48478d = true;
        this.f48477c.postDelayed(new Runnable() { // from class: com.applovin.impl.iF
            @Override // java.lang.Runnable
            public final void run() {
                this.f48759n.c();
            }
        }, 100L);
    }

    public void b(View view) {
        synchronized (this.f48476b) {
            this.f48475a.remove(view);
        }
    }

    public e5(View view) {
        this.f48479e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.P
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return this.f47802n.b();
                }
            };
            this.f48480f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f48480f = null;
    }

    public void a(a aVar) {
        this.f48481g = aVar;
    }

    public void a(View view, int i2) {
        synchronized (this.f48476b) {
            this.f48475a.put(view, Integer.valueOf(i2));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
