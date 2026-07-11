package JP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class u extends I28 {
    protected abstract I28 J2();

    u() {
    }

    @Override // JP.I28
    public void n(String str, Throwable th) {
        J2().n(str, th);
    }

    @Override // JP.I28
    public void rl() {
        J2().rl();
    }

    @Override // JP.I28
    public void t(int i2) {
        J2().t(i2);
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", J2()).toString();
    }
}
