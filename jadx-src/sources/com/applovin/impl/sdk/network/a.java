package com.applovin.impl.sdk.network;

import ScC.FuwU.XIvb;
import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.x4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f50365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f50366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f50367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f50369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f50370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f50372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f50373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f50374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f50375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f50376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f50377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC1810u4.a f50378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f50379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f50380r;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class C0712a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f50381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f50382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f50383c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map f50385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        JSONObject f50386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f50387g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f50389i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f50390j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f50391k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f50393m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f50394n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f50395o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f50396p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        AbstractC1810u4.a f50397q;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f50388h = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f50392l = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Map f50384d = new HashMap();

        public C0712a a(Map map) {
            this.f50385e = map;
            return this;
        }

        public C0712a b(String str) {
            this.f50382b = str;
            return this;
        }

        public C0712a c(String str) {
            this.f50381a = str;
            return this;
        }

        public C0712a a(JSONObject jSONObject) {
            this.f50386f = jSONObject;
            return this;
        }

        public C0712a b(Map map) {
            this.f50384d = map;
            return this;
        }

        public C0712a c(int i2) {
            this.f50389i = i2;
            return this;
        }

        public C0712a d(boolean z2) {
            this.f50392l = z2;
            return this;
        }

        public C0712a e(boolean z2) {
            this.f50393m = z2;
            return this;
        }

        public C0712a f(boolean z2) {
            this.f50395o = z2;
            return this;
        }

        public C0712a(C1802k c1802k) {
            this.f50389i = ((Integer) c1802k.a(x4.T2)).intValue();
            this.f50390j = ((Integer) c1802k.a(x4.f50791S2)).intValue();
            this.f50393m = ((Boolean) c1802k.a(x4.p3)).booleanValue();
            this.f50394n = ((Boolean) c1802k.a(x4.k5)).booleanValue();
            this.f50397q = AbstractC1810u4.a.a(((Integer) c1802k.a(x4.l5)).intValue());
            this.f50396p = ((Boolean) c1802k.a(x4.K5)).booleanValue();
        }

        public C0712a a(String str) {
            this.f50383c = str;
            return this;
        }

        public C0712a b(int i2) {
            this.f50390j = i2;
            return this;
        }

        public C0712a c(boolean z2) {
            this.f50391k = z2;
            return this;
        }

        public C0712a a(Object obj) {
            this.f50387g = obj;
            return this;
        }

        public C0712a b(boolean z2) {
            this.f50396p = z2;
            return this;
        }

        public C0712a a(int i2) {
            this.f50388h = i2;
            return this;
        }

        public C0712a a(boolean z2) {
            this.f50394n = z2;
            return this;
        }

        public C0712a a(AbstractC1810u4.a aVar) {
            this.f50397q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public void a(String str) {
        this.f50363a = str;
    }

    public void b(String str) {
        this.f50364b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f50363a;
        if (str == null ? aVar.f50363a != null : !str.equals(aVar.f50363a)) {
            return false;
        }
        Map map = this.f50365c;
        if (map == null ? aVar.f50365c != null : !map.equals(aVar.f50365c)) {
            return false;
        }
        Map map2 = this.f50366d;
        if (map2 == null ? aVar.f50366d != null : !map2.equals(aVar.f50366d)) {
            return false;
        }
        String str2 = this.f50368f;
        if (str2 == null ? aVar.f50368f != null : !str2.equals(aVar.f50368f)) {
            return false;
        }
        String str3 = this.f50364b;
        if (str3 == null ? aVar.f50364b != null : !str3.equals(aVar.f50364b)) {
            return false;
        }
        JSONObject jSONObject = this.f50367e;
        if (jSONObject == null ? aVar.f50367e != null : !jSONObject.equals(aVar.f50367e)) {
            return false;
        }
        Object obj2 = this.f50369g;
        if (obj2 == null ? aVar.f50369g == null : obj2.equals(aVar.f50369g)) {
            return this.f50370h == aVar.f50370h && this.f50371i == aVar.f50371i && this.f50372j == aVar.f50372j && this.f50373k == aVar.f50373k && this.f50374l == aVar.f50374l && this.f50375m == aVar.f50375m && this.f50376n == aVar.f50376n && this.f50377o == aVar.f50377o && this.f50378p == aVar.f50378p && this.f50379q == aVar.f50379q && this.f50380r == aVar.f50380r;
        }
        return false;
    }

    public String a() {
        return this.f50368f;
    }

    public JSONObject b() {
        return this.f50367e;
    }

    public int c() {
        return this.f50370h - this.f50371i;
    }

    public Object d() {
        return this.f50369g;
    }

    public AbstractC1810u4.a e() {
        return this.f50378p;
    }

    public String f() {
        return this.f50363a;
    }

    public Map g() {
        return this.f50366d;
    }

    public String h() {
        return this.f50364b;
    }

    public Map i() {
        return this.f50365c;
    }

    public int j() {
        return this.f50371i;
    }

    public int k() {
        return this.f50373k;
    }

    public int l() {
        return this.f50372j;
    }

    public boolean m() {
        return this.f50377o;
    }

    public boolean n() {
        return this.f50374l;
    }

    public boolean o() {
        return this.f50380r;
    }

    public boolean p() {
        return this.f50375m;
    }

    public boolean q() {
        return this.f50376n;
    }

    public boolean r() {
        return this.f50379q;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f50363a + ", backupEndpoint=" + this.f50368f + ", httpMethod=" + this.f50364b + ", httpHeaders=" + this.f50366d + ", body=" + this.f50367e + ", emptyResponse=" + this.f50369g + XIvb.TnnrL + this.f50370h + ", retryAttemptsLeft=" + this.f50371i + ", timeoutMillis=" + this.f50372j + ", retryDelayMillis=" + this.f50373k + ", exponentialRetries=" + this.f50374l + ", retryOnAllErrors=" + this.f50375m + ", retryOnNoConnection=" + this.f50376n + ", encodingEnabled=" + this.f50377o + ", encodingType=" + this.f50378p + ", trackConnectionSpeed=" + this.f50379q + ", gzipBodyEncoding=" + this.f50380r + '}';
    }

    protected a(C0712a c0712a) {
        this.f50363a = c0712a.f50382b;
        this.f50364b = c0712a.f50381a;
        this.f50365c = c0712a.f50384d;
        this.f50366d = c0712a.f50385e;
        this.f50367e = c0712a.f50386f;
        this.f50368f = c0712a.f50383c;
        this.f50369g = c0712a.f50387g;
        int i2 = c0712a.f50388h;
        this.f50370h = i2;
        this.f50371i = i2;
        this.f50372j = c0712a.f50389i;
        this.f50373k = c0712a.f50390j;
        this.f50374l = c0712a.f50391k;
        this.f50375m = c0712a.f50392l;
        this.f50376n = c0712a.f50393m;
        this.f50377o = c0712a.f50394n;
        this.f50378p = c0712a.f50397q;
        this.f50379q = c0712a.f50395o;
        this.f50380r = c0712a.f50396p;
    }

    public void a(int i2) {
        this.f50371i = i2;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4 = super.hashCode() * 31;
        String str = this.f50363a;
        int iHashCode5 = 0;
        if (str != null) {
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        int i2 = (iHashCode4 + iHashCode) * 31;
        String str2 = this.f50368f;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i3 = (i2 + iHashCode2) * 31;
        String str3 = this.f50364b;
        if (str3 != null) {
            iHashCode3 = str3.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i5 = (i3 + iHashCode3) * 31;
        Object obj = this.f50369g;
        if (obj != null) {
            iHashCode5 = obj.hashCode();
        }
        int iB = ((((((((((((((((((((((i5 + iHashCode5) * 31) + this.f50370h) * 31) + this.f50371i) * 31) + this.f50372j) * 31) + this.f50373k) * 31) + (this.f50374l ? 1 : 0)) * 31) + (this.f50375m ? 1 : 0)) * 31) + (this.f50376n ? 1 : 0)) * 31) + (this.f50377o ? 1 : 0)) * 31) + this.f50378p.b()) * 31) + (this.f50379q ? 1 : 0)) * 31) + (this.f50380r ? 1 : 0);
        Map map = this.f50365c;
        if (map != null) {
            iB = (iB * 31) + map.hashCode();
        }
        Map map2 = this.f50366d;
        if (map2 != null) {
            iB = (iB * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f50367e;
        if (jSONObject != null) {
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            return (iB * 31) + new String(charArray).hashCode();
        }
        return iB;
    }

    public static C0712a a(C1802k c1802k) {
        return new C0712a(c1802k);
    }
}
