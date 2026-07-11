package t1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class QJ extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f73410n;

    @Override // t1.o
    public boolean t() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof QJ) {
            return this.f73410n.equals(((QJ) obj).f73410n);
        }
        return false;
    }

    public int hashCode() {
        return this.f73410n.hashCode() + 1502476572;
    }

    @Override // t1.o
    public Object rl() {
        return this.f73410n;
    }

    public String toString() {
        return "Optional.of(" + this.f73410n + ")";
    }

    QJ(Object obj) {
        this.f73410n = obj;
    }
}
