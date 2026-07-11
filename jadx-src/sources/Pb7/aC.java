package Pb7;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class aC implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f7706n;

    public static int rl(int i2) {
        return i2;
    }

    public static String O(int i2) {
        return "CrisperInt(value=" + i2 + ")";
    }

    public static final /* synthetic */ aC n(int i2) {
        return new aC(i2);
    }

    public static boolean t(int i2, Object obj) {
        return (obj instanceof aC) && i2 == ((aC) obj).J2();
    }

    public final /* synthetic */ int J2() {
        return this.f7706n;
    }

    public boolean equals(Object obj) {
        return t(this.f7706n, obj);
    }

    public int hashCode() {
        return nr(this.f7706n);
    }

    public String toString() {
        return O(this.f7706n);
    }

    private /* synthetic */ aC(int i2) {
        this.f7706n = i2;
    }

    public static int nr(int i2) {
        return Integer.hashCode(i2);
    }
}
