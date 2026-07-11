package tq6;

import WJ.phkN.HFAkacKHsU;
import java.util.List;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class SPz extends DAz.I28.Ml.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f73715n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class n extends DAz.I28.Ml.Wre.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f73716n;

        @Override // tq6.DAz.I28.Ml.Wre.j
        public DAz.I28.Ml.Wre n() {
            List list = this.f73716n;
            if (list != null) {
                return new SPz(list);
            }
            throw new IllegalStateException("Missing required properties:" + HFAkacKHsU.TYFxJLGLjuxZ);
        }

        @Override // tq6.DAz.I28.Ml.Wre.j
        public DAz.I28.Ml.Wre.j rl(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f73716n = list;
            return this;
        }

        n() {
        }
    }

    private SPz(List list) {
        this.f73715n = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.I28.Ml.Wre) {
            return this.f73715n.equals(((DAz.I28.Ml.Wre) obj).rl());
        }
        return false;
    }

    public int hashCode() {
        return this.f73715n.hashCode() ^ 1000003;
    }

    @Override // tq6.DAz.I28.Ml.Wre
    public List rl() {
        return this.f73715n;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f73715n + "}";
    }
}
