package io.grpc.internal;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class Zs {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f68446n;
    final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Set f68447t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Zs.class == obj.getClass()) {
            Zs zs = (Zs) obj;
            if (this.f68446n == zs.f68446n && this.rl == zs.rl && t1.C.n(this.f68447t, zs.f68447t)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return t1.C.rl(Integer.valueOf(this.f68446n), Long.valueOf(this.rl), this.f68447t);
    }

    Zs(int i2, long j2, Set set) {
        this.f68446n = i2;
        this.rl = j2;
        this.f68447t = com.google.common.collect.Ln.az(set);
    }

    public String toString() {
        return t1.Dsr.t(this).rl("maxAttempts", this.f68446n).t("hedgingDelayNanos", this.rl).nr("nonFatalStatusCodes", this.f68447t).toString();
    }
}
