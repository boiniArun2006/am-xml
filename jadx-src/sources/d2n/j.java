package d2n;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0832j f63374t = new C0832j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f63375n;

    /* JADX INFO: renamed from: d2n.j$j, reason: collision with other inner class name */
    public static final class C0832j {
        public /* synthetic */ C0832j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0832j() {
        }

        public final long J2() {
            return j.J2(0L);
        }

        public final long rl(long j2) {
            return j.J2(j2 * 1000);
        }

        public final long O(double d2) {
            return j.J2((long) (d2 * 1000000000));
        }

        public final long nr(long j2) {
            return j.J2(j2);
        }

        public final long t(long j2) {
            return j.J2(j2 * 1000000);
        }

        public final long n() {
            return j.J2(Long.MAX_VALUE);
        }
    }

    public static final double HI(long j2) {
        return j2 / 1.0E9d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long J2(long j2) {
        return j2;
    }

    public static final long KN(long j2, double d2) {
        return J2((long) (j2 / d2));
    }

    public static final long XQ(long j2, float f3) {
        return Z(j2, f3);
    }

    public static final long Z(long j2, double d2) {
        return J2((long) (j2 * d2));
    }

    public static final long o(long j2, long j3) {
        return J2(j2 - j3);
    }

    public static final long xMQ(long j2, int i2) {
        return KN(j2, i2);
    }

    public static String S(long j2) {
        return "Duration(nanos=" + j2 + ')';
    }

    public static final long az(long j2) {
        return j2 / 1000;
    }

    public static final boolean gh(long j2, long j3) {
        return j2 == j3;
    }

    public static boolean mUb(long j2, Object obj) {
        return (obj instanceof j) && j2 == ((j) obj).WPU();
    }

    public static final boolean r(long j2) {
        return j2 == 0;
    }

    public static final /* synthetic */ j rl(long j2) {
        return new j(j2);
    }

    public final /* synthetic */ long WPU() {
        return this.f63375n;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return t(((j) obj).WPU());
    }

    public boolean equals(Object obj) {
        return mUb(this.f63375n, obj);
    }

    public int hashCode() {
        return ck(this.f63375n);
    }

    public int t(long j2) {
        return nr(this.f63375n, j2);
    }

    public String toString() {
        return S(this.f63375n);
    }

    private /* synthetic */ j(long j2) {
        this.f63375n = j2;
    }

    public static final float Uo(long j2, long j3) {
        return (float) (HI(j2) / HI(j3));
    }

    public static int ck(long j2) {
        return Long.hashCode(j2);
    }

    public static int nr(long j2, long j3) {
        return Intrinsics.compare(j2, j3);
    }

    public static final long qie(long j2) {
        return J2(Math.abs(j2));
    }

    public static final long ty(long j2) {
        return j2 / 1000000;
    }

    public static final boolean Ik(long j2) {
        if (j2 == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }
}
