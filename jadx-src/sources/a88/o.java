package a88;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12726n;
    private final String rl;

    public static o n(String str, String str2) {
        K7m.CN3.J2(str, "Name is null or empty");
        K7m.CN3.J2(str2, "Version is null or empty");
        return new o(str, str2);
    }

    public String rl() {
        return this.f12726n;
    }

    public String t() {
        return this.rl;
    }

    private o(String str, String str2) {
        this.f12726n = str;
        this.rl = str2;
    }
}
