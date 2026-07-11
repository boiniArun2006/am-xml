package Vy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11370n;
    private final String rl;

    public static C n(String str, String str2) {
        upM.CN3.J2(str, "Name is null or empty");
        upM.CN3.J2(str2, "Version is null or empty");
        return new C(str, str2);
    }

    public String rl() {
        return this.f11370n;
    }

    public String t() {
        return this.rl;
    }

    private C(String str, String str2) {
        this.f11370n = str;
        this.rl = str2;
    }
}
