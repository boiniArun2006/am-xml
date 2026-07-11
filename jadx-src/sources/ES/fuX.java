package ES;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2310n;
    public final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f2311t;

    public boolean n(String str) {
        if (this.f2310n.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f2310n.endsWith("\r")) {
            String str2 = this.f2310n;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public fuX(String str, float f3, float f4) {
        this.f2310n = str;
        this.f2311t = f4;
        this.rl = f3;
    }
}
