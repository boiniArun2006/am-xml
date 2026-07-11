package BGJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml implements j9J.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final I28 f410O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f411n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f412t = new Object();

    @Override // j9J.n
    public Object Z() {
        if (this.f411n == null) {
            synchronized (this.f412t) {
                try {
                    if (this.f411n == null) {
                        this.f411n = this.f410O.get();
                    }
                } finally {
                }
            }
        }
        return this.f411n;
    }

    public Ml(I28 i28) {
        this.f410O = i28;
    }
}
