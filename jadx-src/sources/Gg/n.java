package Gg;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class n extends Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MR.j f3723n;
    private final Map rl;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wre) {
            Wre wre = (Wre) obj;
            if (this.f3723n.equals(wre.O()) && this.rl.equals(wre.KN())) {
                return true;
            }
        }
        return false;
    }

    @Override // Gg.Wre
    Map KN() {
        return this.rl;
    }

    @Override // Gg.Wre
    MR.j O() {
        return this.f3723n;
    }

    public int hashCode() {
        return ((this.f3723n.hashCode() ^ 1000003) * 1000003) ^ this.rl.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f3723n + ", values=" + this.rl + "}";
    }

    n(MR.j jVar, Map map) {
        if (jVar != null) {
            this.f3723n = jVar;
            if (map != null) {
                this.rl = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }
}
