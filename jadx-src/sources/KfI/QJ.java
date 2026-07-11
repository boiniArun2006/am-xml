package KfI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum QJ implements nS.Wre {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f5661n;

    @Override // nS.Wre
    public int getNumber() {
        return this.f5661n;
    }

    QJ(int i2) {
        this.f5661n = i2;
    }
}
