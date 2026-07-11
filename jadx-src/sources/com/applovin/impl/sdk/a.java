package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.t1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f50056e = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f50058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f50059c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f50060d = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0708a {
        void onAdExpired(t1 t1Var);
    }

    private C1800b b(t1 t1Var) {
        synchronized (this.f50060d) {
            try {
                if (t1Var == null) {
                    return null;
                }
                for (C1800b c1800b : this.f50059c) {
                    if (t1Var == c1800b.b()) {
                        return c1800b;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(t1 t1Var, InterfaceC0708a interfaceC0708a) {
        synchronized (this.f50060d) {
            try {
                if (b(t1Var) != null) {
                    if (C1804o.a()) {
                        this.f50058b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + t1Var);
                    }
                    return true;
                }
                if (t1Var.getTimeToLiveMillis() <= f50056e) {
                    if (C1804o.a()) {
                        this.f50058b.a("AdExpirationManager", "Ad has already expired: " + t1Var);
                    }
                    t1Var.setExpired();
                    return false;
                }
                if (C1804o.a()) {
                    this.f50058b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(t1Var.getTimeToLiveMillis()) + " seconds from now for " + t1Var + "...");
                }
                if (this.f50059c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f50059c.add(C1800b.a(t1Var, interfaceC0708a, this.f50057a));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a(C1802k c1802k) {
        this.f50057a = c1802k;
        this.f50058b = c1802k.O();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet<C1800b> hashSet = new HashSet();
        synchronized (this.f50060d) {
            try {
                for (C1800b c1800b : this.f50059c) {
                    t1 t1VarB = c1800b.b();
                    if (t1VarB == null) {
                        hashSet.add(c1800b);
                    } else {
                        long timeToLiveMillis = t1VarB.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (C1804o.a()) {
                                this.f50058b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + t1VarB);
                            }
                            hashSet.add(c1800b);
                        } else {
                            if (C1804o.a()) {
                                this.f50058b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + t1VarB);
                            }
                            c1800b.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (C1800b c1800b2 : hashSet) {
            a(c1800b2);
            c1800b2.d();
        }
    }

    public void a(t1 t1Var) {
        synchronized (this.f50060d) {
            try {
                C1800b c1800bB = b(t1Var);
                if (c1800bB != null) {
                    if (C1804o.a()) {
                        this.f50058b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + t1Var);
                    }
                    c1800bB.a();
                    a(c1800bB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(C1800b c1800b) {
        synchronized (this.f50060d) {
            try {
                this.f50059c.remove(c1800b);
                if (this.f50059c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        synchronized (this.f50060d) {
            try {
                Iterator it = this.f50059c.iterator();
                while (it.hasNext()) {
                    ((C1800b) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
