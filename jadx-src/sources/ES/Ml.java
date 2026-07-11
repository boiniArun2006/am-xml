package ES;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Ml {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f2307O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f2308n;
    private final double nr;
    private final char rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double f2309t;

    public static int t(char c2, String str, String str2) {
        return (((c2 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public int hashCode() {
        return t(this.rl, this.J2, this.f2307O);
    }

    public List n() {
        return this.f2308n;
    }

    public double rl() {
        return this.nr;
    }

    public Ml(List list, char c2, double d2, double d4, String str, String str2) {
        this.f2308n = list;
        this.rl = c2;
        this.f2309t = d2;
        this.nr = d4;
        this.f2307O = str;
        this.J2 = str2;
    }
}
