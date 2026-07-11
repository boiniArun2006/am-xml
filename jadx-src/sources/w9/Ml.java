package w9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f74803n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f74802t = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f74801O = J2(0);
    private static final int J2 = J2(Integer.MAX_VALUE);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final int n() {
            return Ml.f74801O;
        }
    }

    public static final int gh(int i2, int i3) {
        return J2(i2 - i3);
    }

    public static final int mUb(int i2, int i3) {
        return w6.J2(i2 - i3);
    }

    public static final int qie(int i2, int i3) {
        return J2(i2 + i3);
    }

    public static final I28 HI(int i2, int i3) {
        return new I28(i2, i3, null);
    }

    public static int J2(int i2) {
        LRC.j.rl(i2, "byte index");
        return i2;
    }

    public static final boolean KN(int i2, int i3) {
        return i2 == i3;
    }

    public static boolean Uo(int i2, Object obj) {
        return (obj instanceof Ml) && i2 == ((Ml) obj).ty();
    }

    public static String az(int i2) {
        return "ByteIndex(value=" + i2 + ')';
    }

    public static final /* synthetic */ Ml rl(int i2) {
        return new Ml(i2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return t(((Ml) obj).ty());
    }

    public boolean equals(Object obj) {
        return Uo(this.f74803n, obj);
    }

    public int hashCode() {
        return xMQ(this.f74803n);
    }

    public int t(int i2) {
        return nr(this.f74803n, i2);
    }

    public String toString() {
        return az(this.f74803n);
    }

    public final /* synthetic */ int ty() {
        return this.f74803n;
    }

    private /* synthetic */ Ml(int i2) {
        this.f74803n = i2;
    }

    public static int nr(int i2, int i3) {
        return Intrinsics.compare(i2, i3);
    }

    public static int xMQ(int i2) {
        return Integer.hashCode(i2);
    }
}
