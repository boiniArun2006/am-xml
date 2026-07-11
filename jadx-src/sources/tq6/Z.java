package tq6;

import tq6.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Z extends u.j {
    private final h1M.Wre J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f73726O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f73727n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73728t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u.j) {
            u.j jVar = (u.j) obj;
            if (this.f73727n.equals(jVar.n()) && this.rl.equals(jVar.J2()) && this.f73728t.equals(jVar.Uo()) && this.nr.equals(jVar.O()) && this.f73726O == jVar.t() && this.J2.equals(jVar.nr())) {
                return true;
            }
        }
        return false;
    }

    @Override // tq6.u.j
    public String J2() {
        return this.rl;
    }

    @Override // tq6.u.j
    public String O() {
        return this.nr;
    }

    @Override // tq6.u.j
    public String Uo() {
        return this.f73728t;
    }

    public int hashCode() {
        return ((((((((((this.f73727n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f73728t.hashCode()) * 1000003) ^ this.nr.hashCode()) * 1000003) ^ this.f73726O) * 1000003) ^ this.J2.hashCode();
    }

    @Override // tq6.u.j
    public String n() {
        return this.f73727n;
    }

    @Override // tq6.u.j
    public h1M.Wre nr() {
        return this.J2;
    }

    @Override // tq6.u.j
    public int t() {
        return this.f73726O;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f73727n + ", versionCode=" + this.rl + ", versionName=" + this.f73728t + ", installUuid=" + this.nr + ", deliveryMechanism=" + this.f73726O + ", developmentPlatformProvider=" + this.J2 + "}";
    }

    Z(String str, String str2, String str3, String str4, int i2, h1M.Wre wre) {
        if (str != null) {
            this.f73727n = str;
            if (str2 != null) {
                this.rl = str2;
                if (str3 != null) {
                    this.f73728t = str3;
                    if (str4 != null) {
                        this.nr = str4;
                        this.f73726O = i2;
                        if (wre != null) {
                            this.J2 = wre;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }
}
