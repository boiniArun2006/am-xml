package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f48129b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f48130c = new Object();

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c5 f48136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f48138c;

        /* synthetic */ c(c5 c5Var, long j2, a aVar) {
            this(c5Var, j2);
        }

        protected boolean a(Object obj) {
            return obj instanceof c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            c5 c5VarC = c();
            c5 c5VarC2 = cVar.c();
            return c5VarC != null ? c5VarC.equals(c5VarC2) : c5VarC2 == null;
        }

        private c(c5 c5Var, long j2) {
            this.f48136a = c5Var;
            this.f48137b = j2;
            this.f48138c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f48137b;
        }

        public c5 c() {
            return this.f48136a;
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            if (SystemClock.elapsedRealtime() - this.f48138c > this.f48137b) {
                return true;
            }
            return false;
        }

        public long a() {
            return this.f48138c;
        }

        public int hashCode() {
            int iHashCode;
            long jB = b();
            long jA = a();
            c5 c5VarC = c();
            int i2 = (((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59;
            if (c5VarC == null) {
                iHashCode = 43;
            } else {
                iHashCode = c5VarC.hashCode();
            }
            return i2 + iHashCode;
        }
    }

    public void a(c5 c5Var, d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        if (c5Var == null) {
            return;
        }
        long jV = d5Var.v();
        if (jV <= 0) {
            return;
        }
        this.f48128a.O();
        if (C1804o.a()) {
            this.f48128a.O().a("SignalCacheManager", "Caching signal for: " + d5Var);
        }
        String strA = a(d5Var, str, maxAdFormat);
        c cVar = new c(c5Var, jV, null);
        synchronized (this.f48130c) {
            this.f48129b.put(strA, cVar);
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48131a;

        static {
            int[] iArr = new int[b.values().length];
            f48131a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48131a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48131a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b5(C1802k c1802k) {
        this.f48128a = c1802k;
    }

    public c5 b(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String strA = a(d5Var, str, maxAdFormat);
        synchronized (this.f48130c) {
            try {
                c cVar = (c) this.f48129b.get(strA);
                if (cVar == null) {
                    return null;
                }
                if (cVar.d()) {
                    this.f48129b.remove(strA);
                    return null;
                }
                this.f48128a.O();
                if (C1804o.a()) {
                    this.f48128a.O().a("SignalCacheManager", "Returning cached signal for: " + d5Var);
                }
                return cVar.f48136a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String strC = d5Var.c();
        int i2 = a.f48131a[d5Var.t().ordinal()];
        if (i2 == 1) {
            return strC + "_" + maxAdFormat.getLabel();
        }
        if (i2 != 2) {
            return strC;
        }
        return strC + "_" + str;
    }
}
