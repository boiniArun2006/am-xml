package TiW;

import GJW.lej;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 extends Wre {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final w6 f10581S = new w6();

    private w6() {
        super(aC.f10550t, aC.nr, aC.f10548O, aC.f10549n);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // GJW.lej
    public String toString() {
        return "Dispatchers.Default";
    }

    @Override // GJW.lej
    public lej K(int i2, String str) {
        dzu.o.n(i2);
        if (i2 >= aC.f10550t) {
            return dzu.o.rl(this, str);
        }
        return super.K(i2, str);
    }
}
