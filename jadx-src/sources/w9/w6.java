package w9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f74807n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f74806t = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f74805O = J2(0);
    private static final int J2 = J2(Integer.MAX_VALUE);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final int n() {
            return w6.f74805O;
        }
    }

    public static final int az(int i2, int i3) {
        return J2(i2 * i3);
    }

    public static final int gh(int i2, int i3) {
        return J2(i2 - i3);
    }

    public static final int qie(int i2, int i3) {
        return J2(i2 + i3);
    }

    public static int J2(int i2) {
        LRC.j.rl(i2, "byte count");
        return i2;
    }

    public static boolean KN(int i2, Object obj) {
        return (obj instanceof w6) && i2 == ((w6) obj).HI();
    }

    public static final int Uo(int i2, int i3) {
        if (i2 % i3 == 0) {
            return J2(i2 / i3);
        }
        throw new IllegalArgumentException(("Byte count " + ((Object) ty(i2)) + " not divisible by divisor " + i3 + " without remainder").toString());
    }

    public static final boolean mUb(int i2) {
        return i2 == 0;
    }

    public static final /* synthetic */ w6 rl(int i2) {
        return new w6(i2);
    }

    public static String ty(int i2) {
        return "ByteCount(value=" + i2 + ')';
    }

    public final /* synthetic */ int HI() {
        return this.f74807n;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return t(((w6) obj).HI());
    }

    public boolean equals(Object obj) {
        return KN(this.f74807n, obj);
    }

    public int hashCode() {
        return xMQ(this.f74807n);
    }

    public int t(int i2) {
        return nr(this.f74807n, i2);
    }

    public String toString() {
        return ty(this.f74807n);
    }

    private /* synthetic */ w6(int i2) {
        this.f74807n = i2;
    }

    public static int nr(int i2, int i3) {
        return Intrinsics.compare(i2, i3);
    }

    public static int xMQ(int i2) {
        return Integer.hashCode(i2);
    }
}
