package t1;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: t1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2369c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ci f73413n = ci.rl();
    private long nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f73414t;

    /* JADX INFO: renamed from: t1.c$j */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f73415n;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f73415n = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73415n[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73415n[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73415n[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f73415n[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f73415n[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f73415n[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private long O() {
        return this.rl ? (this.f73413n.n() - this.nr) + this.f73414t : this.f73414t;
    }

    private static String n(TimeUnit timeUnit) {
        switch (j.f73415n[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return CmcdData.STREAMING_FORMAT_SS;
            case 5:
                return "min";
            case 6:
                return CmcdData.STREAMING_FORMAT_HLS;
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit rl(long j2) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j2, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j2, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j2, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j2, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j2, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j2, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static C2369c t() {
        return new C2369c();
    }

    public C2369c J2() {
        this.f73414t = 0L;
        this.rl = false;
        return this;
    }

    public C2369c Uo() {
        Xo.S(!this.rl, "This stopwatch is already running.");
        this.rl = true;
        this.nr = this.f73413n.n();
        return this;
    }

    C2369c() {
    }

    public long nr(TimeUnit timeUnit) {
        return timeUnit.convert(O(), TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jO = O();
        TimeUnit timeUnitRl = rl(jO);
        return Pl.rl(jO / TimeUnit.NANOSECONDS.convert(1L, timeUnitRl)) + " " + n(timeUnitRl);
    }
}
