package io.grpc.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class rv6 extends JP.nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.nKK f68723n;

    @Override // JP.n
    public JP.I28 KN(JP.DAz dAz, io.grpc.n nVar) {
        return this.f68723n.KN(dAz, nVar);
    }

    @Override // JP.nKK
    public JP.nKK az() {
        return this.f68723n.az();
    }

    @Override // JP.nKK
    public JP.qz gh(boolean z2) {
        return this.f68723n.gh(z2);
    }

    @Override // JP.nKK
    public void mUb() {
        this.f68723n.mUb();
    }

    @Override // JP.n
    public String n() {
        return this.f68723n.n();
    }

    @Override // JP.nKK
    public void qie(JP.qz qzVar, Runnable runnable) {
        this.f68723n.qie(qzVar, runnable);
    }

    rv6(JP.nKK nkk) {
        this.f68723n = nkk;
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", this.f68723n).toString();
    }
}
