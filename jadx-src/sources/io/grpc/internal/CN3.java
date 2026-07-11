package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Logger f68240t = Logger.getLogger(CN3.class.getName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f68241n;
    private final AtomicLong rl;

    public final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f68242n;

        private n(long j2) {
            this.f68242n = j2;
        }

        public void n() {
            long j2 = this.f68242n;
            long jMax = Math.max(2 * j2, j2);
            if (CN3.this.rl.compareAndSet(this.f68242n, jMax)) {
                CN3.f68240t.log(Level.WARNING, "Increased {0} to {1}", new Object[]{CN3.this.f68241n, Long.valueOf(jMax)});
            }
        }

        public long rl() {
            return this.f68242n;
        }
    }

    public n nr() {
        return new n(this.rl.get());
    }

    public CN3(String str, long j2) {
        boolean z2;
        AtomicLong atomicLong = new AtomicLong();
        this.rl = atomicLong;
        if (j2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        t1.Xo.O(z2, "value must be positive");
        this.f68241n = str;
        atomicLong.set(j2);
    }
}
