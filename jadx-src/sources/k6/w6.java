package k6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public enum w6 {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f69658n;

    public String rl() {
        return ".temp" + this.f69658n;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f69658n;
    }

    w6(String str) {
        this.f69658n = str;
    }
}
