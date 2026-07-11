package Z8;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Ml extends Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f12299n;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Pl) {
            return this.f12299n.equals(((Pl) obj).t());
        }
        return false;
    }

    public int hashCode() {
        return this.f12299n.hashCode() ^ 1000003;
    }

    @Override // Z8.Pl
    public List t() {
        return this.f12299n;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f12299n + "}";
    }

    Ml(List list) {
        if (list != null) {
            this.f12299n = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }
}
