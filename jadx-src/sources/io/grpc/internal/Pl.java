package io.grpc.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Pl {
    static final n J2 = new j();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile long f68355O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pmq f68356n;
    private final O rl = LEl.n();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final O f68357t = LEl.n();
    private final O nr = LEl.n();

    class j implements n {
        @Override // io.grpc.internal.Pl.n
        public Pl n() {
            return new Pl(Pmq.f68358n);
        }

        j() {
        }
    }

    public interface n {
        Pl n();
    }

    public void n(boolean z2) {
        if (z2) {
            this.f68357t.n(1L);
        } else {
            this.nr.n(1L);
        }
    }

    public void rl() {
        this.rl.n(1L);
        this.f68355O = this.f68356n.n();
    }

    Pl(Pmq pmq) {
        this.f68356n = pmq;
    }
}
