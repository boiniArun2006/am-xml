package pUk;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class UGc implements Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final UGc f72007t = new UGc(new Timestamp(0, 0));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Timestamp f72008n;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UGc) && compareTo((UGc) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(UGc uGc) {
        return this.f72008n.compareTo(uGc.f72008n);
    }

    public Timestamp rl() {
        return this.f72008n;
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f72008n.getSeconds() + ", nanos=" + this.f72008n.getNanoseconds() + ")";
    }

    public UGc(Timestamp timestamp) {
        this.f72008n = timestamp;
    }

    public int hashCode() {
        return rl().hashCode();
    }
}
