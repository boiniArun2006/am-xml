package GJW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class UGc extends g9 implements s4 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Q f3454r;

    @Override // GJW.g9
    public boolean S() {
        return true;
    }

    @Override // GJW.g9
    public void WPU(Throwable th) {
        this.f3454r.Z(XQ());
    }

    public UGc(Q q2) {
        this.f3454r = q2;
    }

    @Override // GJW.s4
    public xuv getParent() {
        return XQ();
    }

    @Override // GJW.s4
    public boolean t(Throwable th) {
        return XQ().N(th);
    }
}
