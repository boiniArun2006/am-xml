package XFr;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0428j f11812t = new C0428j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f11813n;

    /* JADX INFO: renamed from: XFr.j$j, reason: collision with other inner class name */
    public static final class C0428j {
        public /* synthetic */ C0428j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0428j() {
        }

        public final long rl(double d2) {
            return j.J2((long) (d2 * 1024));
        }

        public final long n(double d2) {
            return j.J2((long) (d2 * 1073741824));
        }

        public final long t(double d2) {
            return j.J2((long) (d2 * 1048576));
        }

        public final long nr(double d2) {
            return j.J2((long) (d2 * 1099511627776L));
        }
    }

    public static long J2(long j2) {
        return j2;
    }

    public static long nr(int i2) {
        return J2(i2);
    }

    public static final boolean KN(long j2, long j3) {
        return j2 == j3;
    }

    public static boolean Uo(long j2, Object obj) {
        return (obj instanceof j) && j2 == ((j) obj).HI();
    }

    public static final double gh(long j2) {
        return (j2 * 1.0d) / 1048576;
    }

    public static final double mUb(long j2) {
        return (j2 * 1.0d) / 1024;
    }

    public static final /* synthetic */ j n(long j2) {
        return new j(j2);
    }

    public static final double qie(long j2) {
        return (j2 * 1.0d) / 1099511627776L;
    }

    public static String ty(long j2) {
        return "ByteSize(bytes=" + j2 + ")";
    }

    public static final double xMQ(long j2) {
        return (j2 * 1.0d) / 1073741824;
    }

    public final /* synthetic */ long HI() {
        return this.f11813n;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return rl(((j) obj).HI());
    }

    public boolean equals(Object obj) {
        return Uo(this.f11813n, obj);
    }

    public int hashCode() {
        return az(this.f11813n);
    }

    public int rl(long j2) {
        return t(this.f11813n, j2);
    }

    public String toString() {
        return ty(this.f11813n);
    }

    private /* synthetic */ j(long j2) {
        this.f11813n = j2;
    }

    public static int az(long j2) {
        return Long.hashCode(j2);
    }

    public static int t(long j2, long j3) {
        return Intrinsics.compare(j2, j3);
    }
}
