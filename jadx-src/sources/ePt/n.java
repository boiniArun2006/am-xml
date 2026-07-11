package ePt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class n extends C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f63662n;
    private final veW.eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final veW.Dsr f63663t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c2 = (C) obj;
            if (this.f63662n == c2.t() && this.rl.equals(c2.nr()) && this.f63663t.equals(c2.rl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f63662n;
        return ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.rl.hashCode()) * 1000003) ^ this.f63663t.hashCode();
    }

    @Override // ePt.C
    public veW.eO nr() {
        return this.rl;
    }

    @Override // ePt.C
    public veW.Dsr rl() {
        return this.f63663t;
    }

    @Override // ePt.C
    public long t() {
        return this.f63662n;
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f63662n + ", transportContext=" + this.rl + ", event=" + this.f63663t + "}";
    }

    n(long j2, veW.eO eOVar, veW.Dsr dsr) {
        this.f63662n = j2;
        if (eOVar != null) {
            this.rl = eOVar;
            if (dsr != null) {
                this.f63663t = dsr;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }
}
