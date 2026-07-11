package IRN;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n extends aC {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f4235O;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f4236t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aC) {
            aC aCVar = (aC) obj;
            if (this.rl.equals(aCVar.O()) && this.f4236t.equals(aCVar.t()) && this.nr.equals(aCVar.nr()) && this.f4235O.equals(aCVar.Uo()) && this.J2 == aCVar.J2()) {
                return true;
            }
        }
        return false;
    }

    @Override // IRN.aC
    public long J2() {
        return this.J2;
    }

    @Override // IRN.aC
    public String O() {
        return this.rl;
    }

    @Override // IRN.aC
    public String Uo() {
        return this.f4235O;
    }

    public int hashCode() {
        int iHashCode = (((((((this.rl.hashCode() ^ 1000003) * 1000003) ^ this.f4236t.hashCode()) * 1000003) ^ this.nr.hashCode()) * 1000003) ^ this.f4235O.hashCode()) * 1000003;
        long j2 = this.J2;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // IRN.aC
    public String nr() {
        return this.nr;
    }

    @Override // IRN.aC
    public String t() {
        return this.f4236t;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.rl + ", parameterKey=" + this.f4236t + ", parameterValue=" + this.nr + ", variantId=" + this.f4235O + ", templateVersion=" + this.J2 + "}";
    }

    n(String str, String str2, String str3, String str4, long j2) {
        if (str != null) {
            this.rl = str;
            if (str2 != null) {
                this.f4236t = str2;
                if (str3 != null) {
                    this.nr = str3;
                    if (str4 != null) {
                        this.f4235O = str4;
                        this.J2 = j2;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }
}
