package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f54315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f54316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f54317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p0 f54318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f54319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile i1 f54320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f54321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f54322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f54323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f54324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f54326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f54327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f54328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f54329o;

    public t0(f0 f0Var, h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f54315a = false;
        this.f54320f = i1.INITIAL;
        this.f54323i = 0L;
        this.f54324j = 0L;
        this.f54325k = 0;
        this.f54326l = false;
        this.f54327m = false;
        this.f54328n = new Object();
        this.f54329o = false;
        this.f54316b = f0Var;
        this.f54317c = hVar;
        this.f54321g = UUID.randomUUID().toString();
        this.f54322h = rVar;
    }

    public abstract o0 a(l lVar, Map map, int i2);

    public void a(o0 o0Var, String str, String str2) {
    }

    public void c() {
        this.f54315a = true;
    }

    public void d() {
        boolean z2;
        synchronized (this.f54328n) {
            z2 = this.f54326l;
        }
        if (z2) {
            a(System.currentTimeMillis());
        } else if (t()) {
            b(System.currentTimeMillis());
        }
    }

    public byte[] f() {
        return null;
    }

    public abstract int g();

    public String h() {
        return null;
    }

    public a i() {
        return null;
    }

    public Map l() {
        return null;
    }

    public abstract m0 m();

    public abstract g1 o();

    public abstract String r();

    public abstract boolean u();

    public l a(String str) throws Exception {
        try {
            p0 p0Var = this.f54318d;
            if (p0Var != null) {
                p0Var.a("sdkInitNetworkRequest");
            }
            this.f54319e = this.f54317c.a(this, com.fyber.inneractive.sdk.util.o.h(), str);
            p0 p0Var2 = this.f54318d;
            if (p0Var2 != null) {
                p0Var2.a("sdkGotServerResponse");
            }
            return this.f54319e;
        } catch (b e2) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e2.getMessage());
            throw e2;
        } catch (q1 e3) {
            IAlog.a("failed read network response for url: %s msg: %s", r(), e3.getMessage());
            throw e3;
        } catch (Exception e4) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e4.getMessage());
            throw e4;
        }
    }

    public void b(long j2) {
        synchronized (this.f54328n) {
            try {
                if (this.f54327m) {
                    this.f54325k = (int) ((j2 - this.f54323i) + ((long) this.f54325k));
                    this.f54327m = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(long j2) {
        synchronized (this.f54328n) {
            try {
                if (!this.f54326l) {
                    this.f54326l = true;
                    this.f54324j = j2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        try {
            l lVar = this.f54319e;
            if (lVar != null) {
                lVar.a();
            }
            this.f54317c.getClass();
        } catch (Exception unused) {
        }
    }

    public int j() {
        return this.f54325k;
    }

    public com.fyber.inneractive.sdk.config.global.r k() {
        return this.f54322h;
    }

    public String n() {
        return "application/json; charset=utf-8";
    }

    public l1 p() {
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        return new l1(iAConfigManager.f53294t.f53466b.a("connect_timeout", 5000, 1), iAConfigManager.f53294t.f53466b.a("read_timeout", 5000, 1));
    }

    public int q() {
        int i2;
        synchronized (this.f54328n) {
            i2 = this.f54325k;
        }
        return i2;
    }

    public int s() {
        Integer numA;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f54322h;
        if (rVar == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.l) rVar.a(com.fyber.inneractive.sdk.config.global.features.l.class)).a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return numA.intValue();
    }

    public final boolean t() {
        boolean z2;
        synchronized (this.f54328n) {
            z2 = this.f54327m;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v() {
        boolean z2;
        if (this.f54329o) {
            com.fyber.inneractive.sdk.config.global.features.l lVar = (com.fyber.inneractive.sdk.config.global.features.l) IAConfigManager.f53260M.f53273K.a(com.fyber.inneractive.sdk.config.global.features.l.class);
            Boolean boolC = lVar.c("should_add_request_watchdog");
            if (boolC != null ? boolC.booleanValue() : false) {
                z2 = true;
                if (!z2) {
                    return true;
                }
            } else {
                Boolean boolC2 = lVar.c("should_report_request_watchdog");
                if (!(boolC2 != null ? boolC2.booleanValue() : false)) {
                    z2 = false;
                }
                if (!z2) {
                }
            }
        }
        return false;
    }

    public void d(long j2) {
        synchronized (this.f54328n) {
            try {
                if (!this.f54327m) {
                    this.f54327m = true;
                    this.f54323i = j2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public t0(t0 t0Var) {
        this.f54315a = false;
        this.f54320f = i1.INITIAL;
        this.f54323i = 0L;
        this.f54324j = 0L;
        this.f54325k = 0;
        this.f54326l = false;
        this.f54327m = false;
        this.f54328n = new Object();
        this.f54329o = false;
        this.f54316b = t0Var.f54316b;
        this.f54317c = t0Var.f54317c;
        this.f54321g = UUID.randomUUID().toString();
        this.f54322h = t0Var.f54322h;
        this.f54325k = t0Var.f54325k;
        this.f54323i = t0Var.f54323i;
        this.f54324j = t0Var.f54324j;
    }

    public final void a(Object obj, Exception exc, boolean z2) {
        p0 p0Var;
        if (!z2) {
            i1 i1Var = i1.RESOLVED;
            this.f54320f = i1Var;
            if (i1Var == i1.QUEUED_FOR_RETRY && (p0Var = this.f54318d) != null) {
                p0Var.a("sdkRequestEndedButWillBeRetried");
            }
        }
        com.fyber.inneractive.sdk.util.r.f57026b.post(new s0(this, obj, exc, z2));
    }

    public final com.fyber.inneractive.sdk.response.e a(int i2, o oVar, com.fyber.inneractive.sdk.response.j jVar) throws n0 {
        try {
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(i2);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.f53553a;
            com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) fVar.f53554a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar != null ? eVar.b() : null;
            if (bVarB == null) {
                IAlog.f("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i2));
                if (fVar.f53554a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new n0("Could not find parser for ad type " + i2);
            }
            IAlog.a("Received ad type %s - Got parser! %s", Integer.valueOf(i2), bVarB);
            if (jVar != null) {
                bVarB.f56830c = jVar;
            }
            bVarB.f56828a = bVarB.a();
            if (oVar != null) {
                bVarB.f56830c = new com.fyber.inneractive.sdk.response.k(oVar);
            }
            com.fyber.inneractive.sdk.response.e eVarA = bVarB.a(null);
            eVarA.f56846H = j();
            p0 p0Var = this.f54318d;
            if (p0Var != null) {
                p0Var.a("sdkParsedResponse");
            }
            return eVarA;
        } catch (Exception e2) {
            IAlog.a("failed parse ad network request url: %s msg: %s", r(), e2.getMessage());
            throw new n0(e2);
        }
    }

    public static int a(Map map) {
        List list = map != null ? (List) map.get("Content-Length") : null;
        if (list != null) {
            return com.fyber.inneractive.sdk.util.v.a((String) list.get(0), -1);
        }
        return -1;
    }

    public void a(long j2) {
        synchronized (this.f54328n) {
            try {
                if (this.f54326l) {
                    this.f54325k = (int) ((j2 - this.f54324j) + ((long) this.f54325k));
                    this.f54326l = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
