package com.applovin.impl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f47884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f47886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f47887g;

    public a0(String str, int i2) {
        this.f47885e = str;
        this.f47886f = i2;
        String[] strArrSplit = str.split(",");
        boolean z2 = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f47887g = z2;
        if (z2) {
            this.f47881a = a(strArrSplit[0]);
            this.f47882b = a(strArrSplit[1]);
            this.f47883c = a(strArrSplit[2]);
            this.f47884d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f47881a = "";
        this.f47882b = "";
        this.f47883c = "";
        this.f47884d = "";
    }

    protected boolean a(Object obj) {
        return obj instanceof a0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!a0Var.a((Object) this)) {
            return false;
        }
        String strB = b();
        String strB2 = a0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = a0Var.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = a0Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = a0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public String a() {
        return this.f47884d;
    }

    public String b() {
        return this.f47881a;
    }

    public String c() {
        return this.f47882b;
    }

    public String d() {
        return this.f47885e;
    }

    public String e() {
        return this.f47883c;
    }

    public int f() {
        return this.f47886f;
    }

    public boolean g() {
        return this.f47881a.equals("applovin.com");
    }

    public boolean h() {
        return this.f47887g;
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public boolean a(a0 a0Var) {
        if (!a0Var.b().equals(this.f47881a) || !a0Var.c().equals(this.f47882b) || !a0Var.e().equals(this.f47883c)) {
            return false;
        }
        if (a0Var.a().equals("")) {
            return true;
        }
        return a0Var.a().equals(this.f47884d);
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String strB = b();
        int iHashCode4 = 43;
        if (strB == null) {
            iHashCode = 43;
        } else {
            iHashCode = strB.hashCode();
        }
        String strC = c();
        int i2 = (iHashCode + 59) * 59;
        if (strC == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = strC.hashCode();
        }
        int i3 = i2 + iHashCode2;
        String strE = e();
        int i5 = i3 * 59;
        if (strE == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = strE.hashCode();
        }
        int i7 = i5 + iHashCode3;
        String strA = a();
        int i8 = i7 * 59;
        if (strA != null) {
            iHashCode4 = strA.hashCode();
        }
        return i8 + iHashCode4;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public a0(String str) {
        this(str, -1);
    }
}
