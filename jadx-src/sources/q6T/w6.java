package q6T;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class w6 extends I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f72124n;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I28) {
            return this.f72124n.equals(((I28) obj).rl());
        }
        return false;
    }

    public int hashCode() {
        return this.f72124n.hashCode() ^ 1000003;
    }

    @Override // q6T.I28
    public Set rl() {
        return this.f72124n;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f72124n + "}";
    }

    w6(Set set) {
        if (set != null) {
            this.f72124n = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }
}
