package QNA;

import XE.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class qz implements XE.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DAz f8144n;
    private final o rl;

    public void O(String str) {
        this.rl.Uo(str);
    }

    @Override // XE.n
    public boolean n() {
        return this.f8144n.nr();
    }

    public String nr(String str) {
        return this.rl.t(str);
    }

    @Override // XE.n
    public n.j rl() {
        return n.j.CRASHLYTICS;
    }

    public qz(DAz dAz, E8K.CN3 cn3) {
        this.f8144n = dAz;
        this.rl = new o(cn3);
    }

    @Override // XE.n
    public void t(n.C0427n c0427n) {
        h1M.CN3.J2().rl("App Quality Sessions session changed: " + c0427n);
        this.rl.J2(c0427n.n());
    }
}
