package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.x4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f50182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f50183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f50184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f50185e = new AtomicLong(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f50186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f50187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f50188h;

    private enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (h.this.f50182b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.f50185e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= h.this.f50186f) {
                h.this.f50184d.postDelayed(this, h.this.f50188h);
                return;
            }
            h.this.f50182b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - C1802k.n());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", h.this.f50181a.z0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            h.this.f50181a.D().d(d2.F0, map);
        }
    }

    private class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f50182b.get() != b.MONITORING) {
                return;
            }
            h.this.f50185e.set(System.currentTimeMillis());
            h.this.f50183c.postDelayed(this, h.this.f50187g);
        }
    }

    private void b() {
        if (androidx.compose.animation.core.fuX.n(this.f50182b, b.MONITORING, b.IDLE)) {
            this.f50183c.removeCallbacksAndMessages(null);
            this.f50184d.removeCallbacksAndMessages(null);
        }
    }

    private void c() {
        if (!(((Boolean) this.f50181a.a(x4.f6)).booleanValue() && this.f50181a.m0().getCurrentApplicationState() == SessionTracker.e.PAUSED) && androidx.compose.animation.core.fuX.n(this.f50182b, b.IDLE, b.MONITORING)) {
            this.f50183c.post(new d());
            this.f50184d.postDelayed(new c(), this.f50188h / 2);
        }
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f50186f = ((Long) this.f50181a.a(x4.c6)).longValue();
        this.f50187g = ((Long) this.f50181a.a(x4.d6)).longValue();
        this.f50188h = ((Long) this.f50181a.a(x4.e6)).longValue();
        if (((Boolean) this.f50181a.a(x4.f6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f50182b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f50181a.a(x4.b6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }

    public h(C1802k c1802k) {
        b bVar;
        this.f50181a = c1802k;
        if (!n7.c(c1802k)) {
            bVar = b.IDLE;
        } else {
            bVar = b.INELIGIBLE;
        }
        this.f50182b = new AtomicReference(bVar);
        this.f50183c = new Handler(C1802k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f50184d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }
}
