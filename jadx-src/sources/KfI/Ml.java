package KfI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum Ml implements nS.Wre {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f5655n;

    @Override // nS.Wre
    public int getNumber() {
        return this.f5655n;
    }

    Ml(int i2) {
        this.f5655n = i2;
    }
}
