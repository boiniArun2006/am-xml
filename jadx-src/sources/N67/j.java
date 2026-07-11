package N67;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class j extends n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f6964n;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f6964n.equals(((n) obj).rl());
        }
        return false;
    }

    public int hashCode() {
        return this.f6964n.hashCode() ^ 1000003;
    }

    @Override // N67.n
    public Set rl() {
        return this.f6964n;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f6964n + "}";
    }

    j(Set set) {
        if (set != null) {
            this.f6964n = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }
}
