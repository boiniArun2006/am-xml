package com.applovin.impl.sdk;

import com.applovin.impl.C1809u;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.C1799c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f50142b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f50144d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f50145e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f50143c = new Object();

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f50143c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (C1804o.a()) {
                    this.f50142b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f50143c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    private C1806q c(C1809u c1809u) {
        synchronized (this.f50143c) {
            try {
                C1806q c1806qB = b(c1809u);
                if (c1806qB.b() > 0) {
                    return c1806qB;
                }
                return d(c1809u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private C1806q d(C1809u c1809u) {
        C1806q c1806q;
        synchronized (this.f50143c) {
            try {
                c1806q = (C1806q) this.f50144d.get(c1809u);
                if (c1806q == null) {
                    c1806q = new C1806q();
                    this.f50144d.put(c1809u, c1806q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1806q;
    }

    public AppLovinAdImpl e(C1809u c1809u) {
        C1799c c1799c;
        synchronized (this.f50143c) {
            try {
                C1806q c1806qD = d(c1809u);
                if (c1806qD.b() > 0) {
                    b(c1809u).a(c1806qD.a());
                    c1799c = new C1799c(c1809u, this.f50141a);
                } else {
                    c1799c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1799c != null) {
            if (C1804o.a()) {
                this.f50142b.a("AdPreloadManager", "Retrieved ad of zone " + c1809u + "...");
                return c1799c;
            }
        } else if (C1804o.a()) {
            this.f50142b.a("AdPreloadManager", "Unable to retrieve ad of zone " + c1809u + "...");
        }
        return c1799c;
    }

    public AppLovinAdBase f(C1809u c1809u) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f50143c) {
            appLovinAdImplD = c(c1809u).d();
        }
        return appLovinAdImplD;
    }

    e(C1802k c1802k) {
        this.f50141a = c1802k;
        this.f50142b = c1802k.O();
        for (C1809u c1809u : C1809u.a()) {
            this.f50144d.put(c1809u, new C1806q());
            this.f50145e.put(c1809u, new C1806q());
        }
    }

    private C1806q b(C1809u c1809u) {
        C1806q c1806q;
        synchronized (this.f50143c) {
            try {
                c1806q = (C1806q) this.f50145e.get(c1809u);
                if (c1806q == null) {
                    c1806q = new C1806q();
                    this.f50145e.put(c1809u, c1806q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1806q;
    }

    public AppLovinAdImpl a(C1809u c1809u) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f50143c) {
            appLovinAdImplA = c(c1809u).a();
        }
        return appLovinAdImplA;
    }
}
