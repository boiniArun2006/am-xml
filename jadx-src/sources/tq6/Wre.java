package tq6;

import java.util.List;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class Wre extends DAz.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f73719n;
    private final String rl;

    static final class n extends DAz.Ml.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f73720n;
        private String rl;

        @Override // tq6.DAz.Ml.j
        public DAz.Ml n() {
            List list = this.f73720n;
            if (list != null) {
                return new Wre(list, this.rl);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // tq6.DAz.Ml.j
        public DAz.Ml.j rl(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f73720n = list;
            return this;
        }

        @Override // tq6.DAz.Ml.j
        public DAz.Ml.j t(String str) {
            this.rl = str;
            return this;
        }

        n() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAz.Ml) {
            DAz.Ml ml = (DAz.Ml) obj;
            if (this.f73719n.equals(ml.rl()) && ((str = this.rl) != null ? str.equals(ml.t()) : ml.t() == null)) {
                return true;
            }
        }
        return false;
    }

    private Wre(List list, String str) {
        this.f73719n = list;
        this.rl = str;
    }

    public int hashCode() {
        int iHashCode = (this.f73719n.hashCode() ^ 1000003) * 1000003;
        String str = this.rl;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // tq6.DAz.Ml
    public List rl() {
        return this.f73719n;
    }

    @Override // tq6.DAz.Ml
    public String t() {
        return this.rl;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f73719n + ", orgId=" + this.rl + "}";
    }
}
