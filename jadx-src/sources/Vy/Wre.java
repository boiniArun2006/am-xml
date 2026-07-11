package Vy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public enum Wre {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11393n;

    @Override // java.lang.Enum
    public String toString() {
        return this.f11393n;
    }

    Wre(String str) {
        this.f11393n = str;
    }
}
