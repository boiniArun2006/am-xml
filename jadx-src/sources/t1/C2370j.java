package t1;

/* JADX INFO: renamed from: t1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class C2370j extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final C2370j f73418n = new C2370j();

    @Override // t1.o
    public boolean t() {
        return false;
    }

    static o O() {
        return f73418n;
    }

    private Object readResolve() {
        return f73418n;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // t1.o
    public Object rl() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public String toString() {
        return "Optional.absent()";
    }

    private C2370j() {
    }

    public int hashCode() {
        return 2040732332;
    }
}
