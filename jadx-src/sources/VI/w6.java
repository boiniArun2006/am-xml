package VI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum w6 {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10867n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f10867n;
    }

    w6(String str) {
        this.f10867n = str;
    }
}
