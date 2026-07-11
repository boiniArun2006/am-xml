package io.grpc.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class SPz implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.Xo f68376n;

    public abstract void n();

    @Override // java.lang.Runnable
    public final void run() {
        JP.Xo xoRl = this.f68376n.rl();
        try {
            n();
        } finally {
            this.f68376n.J2(xoRl);
        }
    }

    protected SPz(JP.Xo xo) {
        this.f68376n = xo;
    }
}
