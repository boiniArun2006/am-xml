package vv;

/* JADX INFO: renamed from: vv.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public enum EnumC2411w6 {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74770n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f74770n;
    }

    EnumC2411w6(String str) {
        this.f74770n = str;
    }
}
