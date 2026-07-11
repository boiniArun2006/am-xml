package Gg;

import Gg.Wre;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class w6 extends Wre.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f3728n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f3729t;

    static final class n extends Wre.n.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Long f3730n;
        private Long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Set f3731t;

        @Override // Gg.Wre.n.j
        public Wre.n n() {
            String str = "";
            if (this.f3730n == null) {
                str = " delta";
            }
            if (this.rl == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f3731t == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new w6(this.f3730n.longValue(), this.rl.longValue(), this.f3731t);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Gg.Wre.n.j
        public Wre.n.j t(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f3731t = set;
            return this;
        }

        n() {
        }

        @Override // Gg.Wre.n.j
        public Wre.n.j nr(long j2) {
            this.rl = Long.valueOf(j2);
            return this;
        }

        @Override // Gg.Wre.n.j
        public Wre.n.j rl(long j2) {
            this.f3730n = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wre.n) {
            Wre.n nVar = (Wre.n) obj;
            if (this.f3728n == nVar.rl() && this.rl == nVar.nr() && this.f3729t.equals(nVar.t())) {
                return true;
            }
        }
        return false;
    }

    private w6(long j2, long j3, Set set) {
        this.f3728n = j2;
        this.rl = j3;
        this.f3729t = set;
    }

    public int hashCode() {
        long j2 = this.f3728n;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.rl;
        return ((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f3729t.hashCode();
    }

    @Override // Gg.Wre.n
    long nr() {
        return this.rl;
    }

    @Override // Gg.Wre.n
    long rl() {
        return this.f3728n;
    }

    @Override // Gg.Wre.n
    Set t() {
        return this.f3729t;
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f3728n + ", maxAllowedDelay=" + this.rl + ", flags=" + this.f3729t + "}";
    }
}
