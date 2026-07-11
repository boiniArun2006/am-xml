package tq6;

import tq6.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Ew extends u.n {
    private final boolean J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f73691O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f73692n;
    private final long nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f73693t;
    private final String xMQ;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u.n) {
            u.n nVar = (u.n) obj;
            if (this.f73692n == nVar.n() && this.rl.equals(nVar.Uo()) && this.f73693t == nVar.rl() && this.nr == nVar.mUb() && this.f73691O == nVar.nr() && this.J2 == nVar.O() && this.Uo == nVar.xMQ() && this.KN.equals(nVar.J2()) && this.xMQ.equals(nVar.KN())) {
                return true;
            }
        }
        return false;
    }

    @Override // tq6.u.n
    public String J2() {
        return this.KN;
    }

    @Override // tq6.u.n
    public String KN() {
        return this.xMQ;
    }

    @Override // tq6.u.n
    public boolean O() {
        return this.J2;
    }

    @Override // tq6.u.n
    public String Uo() {
        return this.rl;
    }

    public int hashCode() {
        int iHashCode = (((((this.f73692n ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f73693t) * 1000003;
        long j2 = this.nr;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f73691O;
        return ((((((((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.J2 ? 1231 : 1237)) * 1000003) ^ this.Uo) * 1000003) ^ this.KN.hashCode()) * 1000003) ^ this.xMQ.hashCode();
    }

    @Override // tq6.u.n
    public long mUb() {
        return this.nr;
    }

    @Override // tq6.u.n
    public int n() {
        return this.f73692n;
    }

    @Override // tq6.u.n
    public long nr() {
        return this.f73691O;
    }

    @Override // tq6.u.n
    public int rl() {
        return this.f73693t;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f73692n + ", model=" + this.rl + ", availableProcessors=" + this.f73693t + ", totalRam=" + this.nr + ", diskSpace=" + this.f73691O + ", isEmulator=" + this.J2 + ", state=" + this.Uo + ", manufacturer=" + this.KN + ", modelClass=" + this.xMQ + "}";
    }

    @Override // tq6.u.n
    public int xMQ() {
        return this.Uo;
    }

    Ew(int i2, String str, int i3, long j2, long j3, boolean z2, int i5, String str2, String str3) {
        this.f73692n = i2;
        if (str != null) {
            this.rl = str;
            this.f73693t = i3;
            this.nr = j2;
            this.f73691O = j3;
            this.J2 = z2;
            this.Uo = i5;
            if (str2 != null) {
                this.KN = str2;
                if (str3 != null) {
                    this.xMQ = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }
}
