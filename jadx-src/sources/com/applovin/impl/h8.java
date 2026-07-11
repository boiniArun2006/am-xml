package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class h8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f48666f = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1802k f48668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f48669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f48670d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Timer f48671e;

    class a extends TimerTask {

        /* JADX INFO: renamed from: com.applovin.impl.h8$a$a, reason: collision with other inner class name */
        class C0701a implements AppLovinBroadcastManager.Receiver {
            C0701a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                h8.this.c();
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!h8.this.f48668b.m0().isApplicationPaused() || h8.this.f48667a) {
                h8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0701a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    public static h8 a(long j2, boolean z2, C1802k c1802k, Runnable runnable) {
        return new h8(j2, z2, c1802k, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f48669c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    private h8(long j2, boolean z2, C1802k c1802k, Runnable runnable) {
        Timer timer = new Timer();
        this.f48671e = timer;
        if (j2 >= 0) {
            if (c1802k != null) {
                if (runnable != null) {
                    this.f48667a = z2;
                    this.f48668b = c1802k;
                    this.f48669c = runnable;
                    f48666f.add(this);
                    timer.schedule(b(), j2);
                    return;
                }
                throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
            }
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j2);
    }

    public void a() {
        synchronized (this.f48670d) {
            this.f48671e.cancel();
            this.f48669c = null;
            f48666f.remove(this);
        }
    }
}
