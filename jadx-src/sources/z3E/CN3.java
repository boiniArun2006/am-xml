package z3E;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class CN3 {
    static final CN3 rl = new I28(null, 0, 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f76346n;

    abstract void t(x4x.j jVar, byte[] bArr);

    final CN3 n(int i2, int i3) {
        return new I28(this, i2, i3);
    }

    final CN3 nr() {
        return this.f76346n;
    }

    final CN3 rl(int i2, int i3) {
        return new n(this, i2, i3);
    }

    CN3(CN3 cn3) {
        this.f76346n = cn3;
    }
}
