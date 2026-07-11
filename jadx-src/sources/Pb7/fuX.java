package Pb7;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double f7707n;

    public static double rl(double d2) {
        return d2;
    }

    public static String O(double d2) {
        return "CrisperDouble(value=" + d2 + ")";
    }

    public static final /* synthetic */ fuX n(double d2) {
        return new fuX(d2);
    }

    public static boolean t(double d2, Object obj) {
        return (obj instanceof fuX) && Double.compare(d2, ((fuX) obj).J2()) == 0;
    }

    public final /* synthetic */ double J2() {
        return this.f7707n;
    }

    public boolean equals(Object obj) {
        return t(this.f7707n, obj);
    }

    public int hashCode() {
        return nr(this.f7707n);
    }

    public String toString() {
        return O(this.f7707n);
    }

    private /* synthetic */ fuX(double d2) {
        this.f7707n = d2;
    }

    public static int nr(double d2) {
        return Double.hashCode(d2);
    }
}
