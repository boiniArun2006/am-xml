package JP;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class eO implements Comparable {
    private static final n J2 = new n();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final long f4537Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f4538o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f4539r;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile boolean f4540O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f4541n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f4542t;

    public static abstract class w6 {
        public abstract long n();
    }

    private eO(w6 w6Var, long j2, boolean z2) {
        this(w6Var, w6Var.n(), j2, z2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eO)) {
            return false;
        }
        eO eOVar = (eO) obj;
        w6 w6Var = this.f4541n;
        if (w6Var != null ? w6Var == eOVar.f4541n : eOVar.f4541n == null) {
            return this.f4542t == eOVar.f4542t;
        }
        return false;
    }

    private static class n extends w6 {
        private n() {
        }

        @Override // JP.eO.w6
        public long n() {
            return System.nanoTime();
        }
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f4539r = nanos;
        f4538o = -nanos;
        f4537Z = TimeUnit.SECONDS.toNanos(1L);
    }

    private eO(w6 w6Var, long j2, long j3, boolean z2) {
        this.f4541n = w6Var;
        long jMin = Math.min(f4539r, Math.max(f4538o, j3));
        this.f4542t = j2 + jMin;
        this.f4540O = z2 && jMin <= 0;
    }

    public static w6 Uo() {
        return J2;
    }

    public static eO n(long j2, TimeUnit timeUnit) {
        return rl(j2, timeUnit, J2);
    }

    private void nr(eO eOVar) {
        if (this.f4541n == eOVar.f4541n) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f4541n + " and " + eOVar.f4541n + ") don't match. Custom Ticker should only be used in tests!");
    }

    public static eO rl(long j2, TimeUnit timeUnit, w6 w6Var) {
        t(timeUnit, "units");
        return new eO(w6Var, timeUnit.toNanos(j2), true);
    }

    private static Object t(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public long gh(TimeUnit timeUnit) {
        long jN = this.f4541n.n();
        if (!this.f4540O && this.f4542t - jN <= 0) {
            this.f4540O = true;
        }
        return timeUnit.convert(this.f4542t - jN, TimeUnit.NANOSECONDS);
    }

    public int hashCode() {
        return Arrays.asList(this.f4541n, Long.valueOf(this.f4542t)).hashCode();
    }

    public String toString() {
        long jGh = gh(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jGh);
        long j2 = f4537Z;
        long j3 = jAbs / j2;
        long jAbs2 = Math.abs(jGh) % j2;
        StringBuilder sb = new StringBuilder();
        if (jGh < 0) {
            sb.append('-');
        }
        sb.append(j3);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        if (this.f4541n != J2) {
            sb.append(" (ticker=" + this.f4541n + ")");
        }
        return sb.toString();
    }

    public boolean xMQ() {
        if (!this.f4540O) {
            if (this.f4542t - this.f4541n.n() > 0) {
                return false;
            }
            this.f4540O = true;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public int compareTo(eO eOVar) {
        nr(eOVar);
        long j2 = this.f4542t - eOVar.f4542t;
        if (j2 < 0) {
            return -1;
        }
        if (j2 > 0) {
            return 1;
        }
        return 0;
    }

    public boolean KN(eO eOVar) {
        nr(eOVar);
        if (this.f4542t - eOVar.f4542t < 0) {
            return true;
        }
        return false;
    }

    public eO mUb(eO eOVar) {
        nr(eOVar);
        if (KN(eOVar)) {
            return this;
        }
        return eOVar;
    }
}
