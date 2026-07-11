package com.applovin.impl.sdk;

import com.applovin.impl.y2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.sdk.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C1805p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1804o f50449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f50450b = new HashMap(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f50451c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f50452d = Collections.synchronizedMap(new HashMap(5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f50453e = Collections.synchronizedMap(new HashMap(5));

    /* JADX INFO: renamed from: com.applovin.impl.sdk.p$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f50454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f50455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f50456c;

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
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            return strC != null ? strC.equals(strC2) : strC2 == null;
        }

        public String a() {
            return this.f50455b;
        }

        public String b() {
            return this.f50454a;
        }

        public String c() {
            return this.f50456c;
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public a(String str, String str2, String str3) {
            this.f50454a = str;
            this.f50455b = str2;
            this.f50456c = str3;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            String strB = b();
            int iHashCode3 = 43;
            if (strB == null) {
                iHashCode = 43;
            } else {
                iHashCode = strB.hashCode();
            }
            String strA = a();
            int i2 = (iHashCode + 59) * 59;
            if (strA == null) {
                iHashCode2 = 43;
            } else {
                iHashCode2 = strA.hashCode();
            }
            int i3 = i2 + iHashCode2;
            String strC = c();
            int i5 = i3 * 59;
            if (strC != null) {
                iHashCode3 = strC.hashCode();
            }
            return i5 + iHashCode3;
        }
    }

    public String a(String str) {
        return (String) this.f50453e.get(str);
    }

    public void b(y2 y2Var) {
        this.f50452d.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void c(y2 y2Var) {
        synchronized (this.f50451c) {
            try {
                if (C1804o.a()) {
                    this.f50449a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + y2Var);
                }
                this.f50450b.put(y2Var.getAdUnitId(), new a(y2Var.B(), y2Var.c(), y2Var.getNetworkName()));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f50453e.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void a(y2 y2Var) {
        synchronized (this.f50451c) {
            try {
                String adUnitId = y2Var.getAdUnitId();
                a aVar = (a) this.f50450b.get(adUnitId);
                if (aVar == null) {
                    if (C1804o.a()) {
                        this.f50449a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (y2Var.B().equals(aVar.b())) {
                    if (C1804o.a()) {
                        this.f50449a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.f50450b.remove(adUnitId);
                } else if (C1804o.a()) {
                    this.f50449a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + y2Var + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String b(String str) {
        return (String) this.f50452d.get(str);
    }

    C1805p(C1802k c1802k) {
        this.f50449a = c1802k.O();
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f50451c) {
            aVar = (a) this.f50450b.get(str);
        }
        return aVar;
    }
}
