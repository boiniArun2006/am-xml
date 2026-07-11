package as;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class eO implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f43096n;

    public static boolean J2(int i2, Object obj) {
        return (obj instanceof eO) && i2 == ((eO) obj).mUb();
    }

    public static final boolean Uo(int i2, int i3) {
        return i2 == i3;
    }

    public static final /* synthetic */ eO n(int i2) {
        return new eO(i2);
    }

    public static int nr(int i2) {
        LRC.n.t(i2, "hertz");
        return i2;
    }

    public static String xMQ(int i2) {
        return "Hertz(value=" + i2 + ')';
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return rl(((eO) obj).mUb());
    }

    public boolean equals(Object obj) {
        return J2(this.f43096n, obj);
    }

    public int hashCode() {
        return KN(this.f43096n);
    }

    public final /* synthetic */ int mUb() {
        return this.f43096n;
    }

    public int rl(int i2) {
        return t(this.f43096n, i2);
    }

    public String toString() {
        return xMQ(this.f43096n);
    }

    private /* synthetic */ eO(int i2) {
        this.f43096n = i2;
    }

    public static int KN(int i2) {
        return Integer.hashCode(i2);
    }

    public static int t(int i2, int i3) {
        return Intrinsics.compare(i2, i3);
    }
}
