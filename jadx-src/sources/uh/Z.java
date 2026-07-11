package uh;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f74488n;
    private final pUk.C rl;

    public enum j {
        ADDED,
        REMOVED
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return this.f74488n.equals(z2.rl()) && this.rl.equals(z2.n());
    }

    public int hashCode() {
        return ((2077 + this.f74488n.hashCode()) * 31) + this.rl.hashCode();
    }

    public pUk.C n() {
        return this.rl;
    }

    public j rl() {
        return this.f74488n;
    }

    public Z(j jVar, pUk.C c2) {
        this.f74488n = jVar;
        this.rl = c2;
    }
}
