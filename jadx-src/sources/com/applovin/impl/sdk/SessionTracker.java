package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.AbstractC1772b;
import com.applovin.impl.n7;
import com.applovin.impl.x4;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C1802k f50029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50030b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f50031c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f50032d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicInteger f50033e = new AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f50034f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicLong f50035g = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicLong f50036h = new AtomicLong();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Date f50037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Date f50038j;

    class a extends AbstractC1772b {
        a() {
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    class b implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        b() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i2) {
            SessionTracker.this.f50033e.set(i2);
            if (i2 == 20) {
                SessionTracker.this.a();
            }
        }
    }

    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (n7.h()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    public enum e {
        STARTED("started"),
        PAUSED(SafeDKWebAppInterface.f62918d),
        RESUMED("resumed");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f50047a;

        public String b() {
            return this.f50047a;
        }

        e(String str) {
            this.f50047a = str;
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50042a;

        static {
            int[] iArr = new int[e.values().length];
            f50042a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50042a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50042a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f50032d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f50032d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f50029a.O();
        if (C1804o.a()) {
            this.f50029a.O().a("SessionTracker", "Application Paused");
        }
        this.f50034f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f50031c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f50029a.a(x4.u3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f50029a.a(x4.w3)).longValue());
        if (this.f50037i == null || System.currentTimeMillis() - this.f50037i.getTime() >= millis) {
            this.f50029a.F().trackEvent(SafeDKWebAppInterface.f62918d);
            if (zBooleanValue) {
                this.f50037i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f50037i = new Date();
    }

    private void d() {
        this.f50029a.O();
        if (C1804o.a()) {
            this.f50029a.O().a("SessionTracker", "Application Resumed");
        }
        this.f50035g.set(System.currentTimeMillis());
        this.f50036h.addAndGet(this.f50035g.get() - this.f50034f.get());
        boolean zBooleanValue = ((Boolean) this.f50029a.a(x4.u3)).booleanValue();
        long jLongValue = ((Long) this.f50029a.a(x4.v3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f50031c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f50038j == null || System.currentTimeMillis() - this.f50038j.getTime() >= millis) {
            this.f50029a.F().trackEvent("resumed");
            if (zBooleanValue) {
                this.f50038j = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f50038j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f50034f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f50035g.get();
    }

    public e getCurrentApplicationState() {
        return this.f50032d.get() ? e.PAUSED : this.f50034f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public int getLastTrimMemoryLevel() {
        return this.f50033e.get();
    }

    public String getSessionId() {
        return this.f50030b;
    }

    public boolean isApplicationPaused() {
        return this.f50032d.get();
    }

    public void pauseForClick() {
        this.f50031c.set(true);
    }

    public void resumeForClick() {
        this.f50031c.set(false);
    }

    SessionTracker(C1802k c1802k) {
        this.f50029a = c1802k;
        Application application = (Application) C1802k.o();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = d.f50042a[getCurrentApplicationState().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return -1L;
                }
                jN = this.f50035g.get();
            } else {
                jN = this.f50034f.get();
            }
        } else {
            jN = C1802k.n();
        }
        return jCurrentTimeMillis - jN;
    }

    public long getTotalBackgroundDurationMillis() {
        if (getCurrentApplicationState() == e.PAUSED) {
            return this.f50036h.get() + getCurrentApplicationStateDurationMillis();
        }
        return this.f50036h.get();
    }
}
