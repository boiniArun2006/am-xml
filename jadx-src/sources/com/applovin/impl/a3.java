package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f47917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f47918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f47919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f47920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1780h f47921f;

    protected boolean a(Object obj) {
        return obj instanceof a3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        if (!a3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = a3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = a3Var.a();
        if (maxAdFormatA != null ? !maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 != null) {
            return false;
        }
        Map mapE = e();
        Map mapE2 = a3Var.e();
        if (mapE != null ? !mapE.equals(mapE2) : mapE2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = a3Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = a3Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        C1780h c1780hF = f();
        C1780h c1780hF2 = a3Var.f();
        return c1780hF != null ? c1780hF.equals(c1780hF2) : c1780hF2 == null;
    }

    public MaxAdFormat a() {
        return this.f47917b;
    }

    public String b() {
        return this.f47916a;
    }

    public Map c() {
        return this.f47920e;
    }

    public Map d() {
        return this.f47919d;
    }

    public Map e() {
        return this.f47918c;
    }

    public C1780h f() {
        return this.f47921f;
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + b() + ", adFormat=" + a() + ")";
    }

    public a3(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, C1780h c1780h) {
        this.f47916a = str;
        this.f47917b = maxAdFormat;
        this.f47918c = map;
        this.f47919d = map2;
        this.f47920e = map3;
        this.f47921f = c1780h;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        String strB = b();
        int iHashCode6 = 43;
        if (strB == null) {
            iHashCode = 43;
        } else {
            iHashCode = strB.hashCode();
        }
        MaxAdFormat maxAdFormatA = a();
        int i2 = (iHashCode + 59) * 59;
        if (maxAdFormatA == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = maxAdFormatA.hashCode();
        }
        int i3 = i2 + iHashCode2;
        Map mapE = e();
        int i5 = i3 * 59;
        if (mapE == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = mapE.hashCode();
        }
        int i7 = i5 + iHashCode3;
        Map mapD = d();
        int i8 = i7 * 59;
        if (mapD == null) {
            iHashCode4 = 43;
        } else {
            iHashCode4 = mapD.hashCode();
        }
        int i9 = i8 + iHashCode4;
        Map mapC = c();
        int i10 = i9 * 59;
        if (mapC == null) {
            iHashCode5 = 43;
        } else {
            iHashCode5 = mapC.hashCode();
        }
        int i11 = i10 + iHashCode5;
        C1780h c1780hF = f();
        int i12 = i11 * 59;
        if (c1780hF != null) {
            iHashCode6 = c1780hF.hashCode();
        }
        return i12 + iHashCode6;
    }
}
