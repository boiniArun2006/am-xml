package O2;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f7242n;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TimeUnit f7243t;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f7244n;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f7244n = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7244n[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7244n[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public double n() {
        int i2 = j.f7244n[this.f7243t.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? this.f7242n / this.f7243t.toSeconds(this.rl) : (this.f7242n / this.rl) * TimeUnit.SECONDS.toMillis(1L) : (this.f7242n / this.rl) * TimeUnit.SECONDS.toMicros(1L) : (this.f7242n / this.rl) * TimeUnit.SECONDS.toNanos(1L);
    }

    public Dsr(long j2, long j3, TimeUnit timeUnit) {
        this.f7242n = j2;
        this.rl = j3;
        this.f7243t = timeUnit;
    }
}
