package as;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f43102n;

    public static String J2(int i2) {
        return "ChannelCount(value=" + i2 + ')';
    }

    public static final /* synthetic */ qz n(int i2) {
        return new qz(i2);
    }

    public static final boolean nr(int i2, int i3) {
        return i2 == i3;
    }

    public static int rl(int i2) {
        LRC.n.t(i2, "channel count");
        return i2;
    }

    public static boolean t(int i2, Object obj) {
        return (obj instanceof qz) && i2 == ((qz) obj).Uo();
    }

    public final /* synthetic */ int Uo() {
        return this.f43102n;
    }

    public boolean equals(Object obj) {
        return t(this.f43102n, obj);
    }

    public int hashCode() {
        return O(this.f43102n);
    }

    public String toString() {
        return J2(this.f43102n);
    }

    private /* synthetic */ qz(int i2) {
        this.f43102n = i2;
    }

    public static int O(int i2) {
        return Integer.hashCode(i2);
    }
}
