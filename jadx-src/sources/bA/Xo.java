package bA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Xo implements eO {
    public static final eO nr = nr(Integer.MAX_VALUE, true, true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f43194n;
    boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f43195t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Xo)) {
            return false;
        }
        Xo xo = (Xo) obj;
        return this.f43194n == xo.f43194n && this.rl == xo.rl && this.f43195t == xo.f43195t;
    }

    public static eO nr(int i2, boolean z2, boolean z3) {
        return new Xo(i2, z2, z3);
    }

    public int hashCode() {
        return (this.f43194n ^ (this.rl ? 4194304 : 0)) ^ (this.f43195t ? 8388608 : 0);
    }

    @Override // bA.eO
    public boolean n() {
        return this.f43195t;
    }

    @Override // bA.eO
    public boolean rl() {
        return this.rl;
    }

    @Override // bA.eO
    public int t() {
        return this.f43194n;
    }

    private Xo(int i2, boolean z2, boolean z3) {
        this.f43194n = i2;
        this.rl = z2;
        this.f43195t = z3;
    }
}
