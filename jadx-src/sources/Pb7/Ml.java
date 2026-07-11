package Pb7;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f7705n;

    public static boolean rl(boolean z2) {
        return z2;
    }

    public static String O(boolean z2) {
        return "CrisperBoolean(value=" + z2 + ")";
    }

    public static final /* synthetic */ Ml n(boolean z2) {
        return new Ml(z2);
    }

    public static boolean t(boolean z2, Object obj) {
        return (obj instanceof Ml) && z2 == ((Ml) obj).J2();
    }

    public final /* synthetic */ boolean J2() {
        return this.f7705n;
    }

    public boolean equals(Object obj) {
        return t(this.f7705n, obj);
    }

    public int hashCode() {
        return nr(this.f7705n);
    }

    public String toString() {
        return O(this.f7705n);
    }

    private /* synthetic */ Ml(boolean z2) {
        this.f7705n = z2;
    }

    public static int nr(boolean z2) {
        return Boolean.hashCode(z2);
    }
}
