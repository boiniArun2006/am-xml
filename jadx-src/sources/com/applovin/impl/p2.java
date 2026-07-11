package com.applovin.impl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49654d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f49655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f49656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f49658d;

        public p2 a() {
            return new p2(this.f49655a, this.f49656b, this.f49657c, this.f49658d);
        }

        public a b(int i2) {
            this.f49657c = i2;
            return this;
        }

        public a a(int i2) {
            this.f49658d = i2;
            return this;
        }

        public a b(String str) {
            this.f49655a = str;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.f49655a + ", signature=" + this.f49656b + ", responseCode=" + this.f49657c + ", nonce=" + this.f49658d + ")";
        }

        a() {
        }

        public a a(String str) {
            this.f49656b = str;
            return this;
        }
    }

    protected boolean a(Object obj) {
        return obj instanceof p2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!p2Var.a(this) || c() != p2Var.c() || b() != p2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = p2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = p2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public static a a() {
        return new a();
    }

    public int b() {
        return this.f49654d;
    }

    public int c() {
        return this.f49653c;
    }

    public String d() {
        return this.f49652b;
    }

    public String e() {
        return this.f49651a;
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    p2(String str, String str2, int i2, int i3) {
        this.f49651a = str;
        this.f49652b = str2;
        this.f49653c = i2;
        this.f49654d = i3;
    }

    public int hashCode() {
        int iHashCode;
        int iC = ((c() + 59) * 59) + b();
        String strE = e();
        int i2 = iC * 59;
        int iHashCode2 = 43;
        if (strE == null) {
            iHashCode = 43;
        } else {
            iHashCode = strE.hashCode();
        }
        int i3 = i2 + iHashCode;
        String strD = d();
        int i5 = i3 * 59;
        if (strD != null) {
            iHashCode2 = strD.hashCode();
        }
        return i5 + iHashCode2;
    }
}
