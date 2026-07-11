package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class g0 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f48568c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f48569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1802k f48570b;

    public static g0 a(long j2, C1802k c1802k, Runnable runnable) {
        return a(j2, false, c1802k, runnable);
    }

    public static g0 a(long j2, boolean z2, C1802k c1802k, Runnable runnable) {
        return new g0(j2, z2, c1802k, runnable);
    }

    public long b() {
        return this.f48569a.c();
    }

    private g0(long j2, final boolean z2, C1802k c1802k, final Runnable runnable) {
        this.f48569a = g7.a(j2, z2, c1802k, new Runnable() { // from class: com.applovin.impl.QaP
            @Override // java.lang.Runnable
            public final void run() {
                this.f47815n.a(z2, runnable);
            }
        });
        this.f48570b = c1802k;
        f48568c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, Runnable runnable) {
        if (!z2) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f48569a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f48569a.e();
        }
    }

    public void a() {
        this.f48569a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f48568c.remove(this);
    }
}
