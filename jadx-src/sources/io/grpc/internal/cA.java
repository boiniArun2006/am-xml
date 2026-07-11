package io.grpc.internal;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class cA {
    final Set J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final Long f68464O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f68465n;
    final double nr;
    final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final long f68466t;

    public boolean equals(Object obj) {
        if (!(obj instanceof cA)) {
            return false;
        }
        cA cAVar = (cA) obj;
        return this.f68465n == cAVar.f68465n && this.rl == cAVar.rl && this.f68466t == cAVar.f68466t && Double.compare(this.nr, cAVar.nr) == 0 && t1.C.n(this.f68464O, cAVar.f68464O) && t1.C.n(this.J2, cAVar.J2);
    }

    public int hashCode() {
        return t1.C.rl(Integer.valueOf(this.f68465n), Long.valueOf(this.rl), Long.valueOf(this.f68466t), Double.valueOf(this.nr), this.f68464O, this.J2);
    }

    cA(int i2, long j2, long j3, double d2, Long l2, Set set) {
        this.f68465n = i2;
        this.rl = j2;
        this.f68466t = j3;
        this.nr = d2;
        this.f68464O = l2;
        this.J2 = com.google.common.collect.Ln.az(set);
    }

    public String toString() {
        return t1.Dsr.t(this).rl("maxAttempts", this.f68465n).t("initialBackoffNanos", this.rl).t("maxBackoffNanos", this.f68466t).n("backoffMultiplier", this.nr).nr("perAttemptRecvTimeoutNanos", this.f68464O).nr("retryableStatusCodes", this.J2).toString();
    }
}
