package pUk;

import androidx.core.net.Toe.GDEJgAYrPQHfw;
import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Ml extends eO.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z f71992n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eO.w6.j f71993t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eO.w6) {
            eO.w6 w6Var = (eO.w6) obj;
            if (this.f71992n.equals(w6Var.t()) && this.f71993t.equals(w6Var.nr())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f71992n.hashCode() ^ 1000003) * 1000003) ^ this.f71993t.hashCode();
    }

    @Override // pUk.eO.w6
    public eO.w6.j nr() {
        return this.f71993t;
    }

    @Override // pUk.eO.w6
    public z t() {
        return this.f71992n;
    }

    public String toString() {
        return "Segment{fieldPath=" + this.f71992n + ", kind=" + this.f71993t + "}";
    }

    Ml(z zVar, eO.w6.j jVar) {
        if (zVar != null) {
            this.f71992n = zVar;
            if (jVar != null) {
                this.f71993t = jVar;
                return;
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException(GDEJgAYrPQHfw.FHrSXk);
    }
}
