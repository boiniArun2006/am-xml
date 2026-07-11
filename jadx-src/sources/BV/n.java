package BV;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class n implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static n f488n;

    public static n n() {
        if (f488n == null) {
            f488n = new n();
        }
        return f488n;
    }

    private n() {
    }

    @Override // BV.j
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
