package io.grpc.internal;

import io.grpc.internal.aC;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class DAz implements aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Random f68244n = new Random();
    private long rl = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f68245t = TimeUnit.MINUTES.toNanos(2);
    private double nr = 1.6d;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private double f68243O = 0.2d;
    private long J2 = this.rl;

    public static final class j implements aC.j {
        @Override // io.grpc.internal.aC.j
        public aC get() {
            return new DAz();
        }
    }

    private long rl(double d2, double d4) {
        t1.Xo.nr(d4 >= d2);
        return (long) ((this.f68244n.nextDouble() * (d4 - d2)) + d2);
    }

    @Override // io.grpc.internal.aC
    public long n() {
        long j2 = this.J2;
        double d2 = j2;
        this.J2 = Math.min((long) (this.nr * d2), this.f68245t);
        double d4 = this.f68243O;
        return j2 + rl((-d4) * d2, d4 * d2);
    }
}
