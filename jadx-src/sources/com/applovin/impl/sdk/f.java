package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.g7;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g7 f50147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f50148b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f50149c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f50150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1802k f50151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WeakReference f50152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f50153g;

    public interface a {
        void onAdRefresh();
    }

    public void a(long j2) {
        synchronized (this.f50148b) {
            try {
                a();
                this.f50153g = j2;
                this.f50147a = g7.a(j2, this.f50151e, new Runnable() { // from class: com.applovin.impl.sdk.l3D
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50291n.i();
                    }
                });
                if (!((Boolean) this.f50151e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f50151e.a(r3.D7)).booleanValue() && (this.f50151e.H().d() || this.f50151e.m0().isApplicationPaused())) {
                    this.f50147a.d();
                }
                if (this.f50149c.compareAndSet(true, false) && ((Boolean) this.f50151e.a(r3.f49866F7)).booleanValue()) {
                    this.f50151e.O();
                    if (C1804o.a()) {
                        this.f50151e.O().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f50147a.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void e() {
        if (((Boolean) this.f50151e.a(r3.D7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f50151e.a(r3.D7)).booleanValue()) {
            synchronized (this.f50148b) {
                try {
                    if (this.f50150d) {
                        this.f50151e.O();
                        if (C1804o.a()) {
                            this.f50151e.O().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f50151e.m0().isApplicationPaused()) {
                        this.f50151e.O();
                        if (C1804o.a()) {
                            this.f50151e.O().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        g7 g7Var = this.f50147a;
                        if (g7Var != null) {
                            g7Var.e();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void k() {
        synchronized (this.f50148b) {
            try {
                g7 g7Var = this.f50147a;
                if (g7Var != null) {
                    g7Var.d();
                } else {
                    this.f50151e.O();
                    if (C1804o.a()) {
                        this.f50151e.O().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f50149c.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        synchronized (this.f50148b) {
            try {
                this.f50147a = null;
                if (!((Boolean) this.f50151e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        synchronized (this.f50148b) {
            try {
                g7 g7Var = this.f50147a;
                if (g7Var != null) {
                    g7Var.e();
                } else {
                    this.f50149c.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f50148b) {
            try {
                g7 g7Var = this.f50147a;
                jC = g7Var != null ? g7Var.c() : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f50151e.a(r3.C7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z2;
        a aVar;
        if (((Boolean) this.f50151e.a(r3.C7)).booleanValue()) {
            synchronized (this.f50148b) {
                try {
                    if (this.f50150d) {
                        this.f50151e.O();
                        if (C1804o.a()) {
                            this.f50151e.O().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f50151e.H().d()) {
                        this.f50151e.O();
                        if (C1804o.a()) {
                            this.f50151e.O().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f50147a != null) {
                        long jB = this.f50153g - b();
                        long jLongValue = ((Long) this.f50151e.a(r3.f49865B7)).longValue();
                        if (jLongValue < 0 || jB <= jLongValue) {
                            this.f50147a.e();
                            z2 = false;
                        } else {
                            a();
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                    if (!z2 || (aVar = (a) this.f50152f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean g() {
        return this.f50150d;
    }

    public boolean h() {
        boolean z2;
        synchronized (this.f50148b) {
            z2 = this.f50147a != null;
        }
        return z2;
    }

    public void j() {
        synchronized (this.f50148b) {
            k();
            this.f50150d = true;
        }
    }

    public void m() {
        synchronized (this.f50148b) {
            n();
            this.f50150d = false;
        }
    }

    public f(C1802k c1802k, a aVar) {
        this.f50152f = new WeakReference(aVar);
        this.f50151e = c1802k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f50152f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a() {
        synchronized (this.f50148b) {
            try {
                g7 g7Var = this.f50147a;
                if (g7Var != null) {
                    g7Var.a();
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
