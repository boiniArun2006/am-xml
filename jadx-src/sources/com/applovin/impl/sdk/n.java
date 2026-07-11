package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.n7;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f50299l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50300a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f50303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f50304e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f50307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f50308i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f50301b = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f50305f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f50306g = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f50309j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f50310k = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f50311a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50312b;

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public long b() {
            return this.f50311a;
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        static /* synthetic */ int a(a aVar) {
            int i2 = aVar.f50312b;
            aVar.f50312b = i2 + 1;
            return i2;
        }

        public int hashCode() {
            long jB = b();
            return ((((int) (jB ^ (jB >>> 32))) + 59) * 59) + a();
        }

        public int a() {
            return this.f50312b;
        }
    }

    public void a(boolean z2) {
        synchronized (this.f50305f) {
            try {
                this.f50306g.set(z2);
                if (z2) {
                    this.f50307h = System.currentTimeMillis();
                    this.f50300a.O();
                    if (C1804o.a()) {
                        this.f50300a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f50307h);
                    }
                    ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) C1802k.o().getSystemService("activity"));
                    if (memoryInfoA != null) {
                        this.f50304e = memoryInfoA.availMem;
                    }
                    final Long l2 = (Long) this.f50300a.a(x4.J1);
                    if (l2.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.xuv
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f50486n.a(l2);
                            }
                        }, l2.longValue());
                    }
                } else {
                    this.f50307h = 0L;
                    this.f50300a.O();
                    if (C1804o.a()) {
                        this.f50300a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        return this.f50302c;
    }

    public Long c() {
        return this.f50303d;
    }

    public void b(Object obj) {
        if (!w3.a(obj) && this.f50301b.compareAndSet(true, false)) {
            this.f50308i = null;
            this.f50300a.O();
            if (C1804o.a()) {
                this.f50300a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void c(String str) {
        synchronized (this.f50310k) {
            try {
                a aVar = (a) this.f50309j.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f50309j.put(str, aVar);
                }
                aVar.f50311a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d() {
        return this.f50301b.get();
    }

    public boolean e() {
        return this.f50306g.get();
    }

    n(C1802k c1802k) {
        this.f50300a = c1802k;
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f50310k) {
            aVar = (a) this.f50309j.get(str);
            if (aVar == null) {
                aVar = f50299l;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l2) {
        if (e() && System.currentTimeMillis() - this.f50307h >= l2.longValue()) {
            this.f50300a.O();
            if (C1804o.a()) {
                this.f50300a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f50306g.set(false);
        }
    }

    public Object a() {
        return this.f50308i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(final Object obj) {
        if (!w3.a(obj) && this.f50301b.compareAndSet(false, true)) {
            this.f50308i = obj;
            this.f50302c = System.currentTimeMillis();
            this.f50300a.O();
            if (C1804o.a()) {
                this.f50300a.O().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f50302c);
            }
            ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) C1802k.o().getSystemService("activity"));
            if (memoryInfoA != null) {
                long j2 = this.f50304e;
                if (j2 > 0) {
                    this.f50303d = Long.valueOf(j2 - memoryInfoA.availMem);
                    this.f50304e = 0L;
                } else {
                    this.f50303d = null;
                }
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final Long l2 = (Long) this.f50300a.a(x4.f50770K1);
            if (l2.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.c7r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50135n.a(l2, obj);
                    }
                }, l2.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l2, Object obj) {
        if (this.f50301b.get() && System.currentTimeMillis() - this.f50302c >= l2.longValue()) {
            this.f50300a.O();
            if (C1804o.a()) {
                this.f50300a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f50310k) {
            this.f50309j.remove(str);
        }
    }
}
