package d2n;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f63370t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f63371n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final long J2() {
            return Ml.J2(0L);
        }

        public final long n(long j2) {
            return Ml.J2(j2 * 1000);
        }

        public final long O(double d2) {
            return Ml.J2((long) (d2 * 1000000000));
        }

        public final long rl(long j2) {
            return Ml.J2(j2 * 1000000);
        }

        public final long t(long j2) {
            return Ml.J2(j2);
        }

        public final long nr() {
            return Ml.J2(Long.MAX_VALUE);
        }
    }

    public static final long HI(long j2, long j3) {
        return J2(j2 + j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long J2(long j2) {
        return j2;
    }

    public static final double gh(long j2) {
        return j2 / 1.0E9d;
    }

    public static final long mUb(long j2) {
        return MathKt.roundToLong(j2 / 1000000.0d);
    }

    public static final long ty(long j2, long j3) {
        return J2(j2 - j3);
    }

    public static final long xMQ(long j2) {
        return MathKt.roundToLong(j2 / 1000.0d);
    }

    public static final boolean KN(long j2, long j3) {
        return j2 == j3;
    }

    public static boolean Uo(long j2, Object obj) {
        return (obj instanceof Ml) && j2 == ((Ml) obj).Ik();
    }

    public static final long az(long j2, long j3) {
        return d2n.j.f63374t.nr(j2 - j3);
    }

    public static String ck(long j2) {
        return "Time(nanos=" + j2 + ')';
    }

    public static final /* synthetic */ Ml rl(long j2) {
        return new Ml(j2);
    }

    public final /* synthetic */ long Ik() {
        return this.f63371n;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return t(((Ml) obj).Ik());
    }

    public boolean equals(Object obj) {
        return Uo(this.f63371n, obj);
    }

    public int hashCode() {
        return qie(this.f63371n);
    }

    public int t(long j2) {
        return nr(this.f63371n, j2);
    }

    public String toString() {
        return ck(this.f63371n);
    }

    private /* synthetic */ Ml(long j2) {
        this.f63371n = j2;
    }

    public static int nr(long j2, long j3) {
        return Intrinsics.compare(j2, j3);
    }

    public static int qie(long j2) {
        return Long.hashCode(j2);
    }
}
