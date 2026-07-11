package Cwp;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public enum j {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final j[] f1045o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f1048n;

    static {
        j jVar = L;
        j jVar2 = M;
        j jVar3 = Q;
        f1045o = new j[]{jVar2, jVar, H, jVar3};
    }

    public int n() {
        return this.f1048n;
    }

    j(int i2) {
        this.f1048n = i2;
    }
}
