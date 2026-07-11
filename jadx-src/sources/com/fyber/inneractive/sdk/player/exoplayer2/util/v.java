package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f56230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f56232c = -9223372036854775807L;

    public final synchronized void c(long j2) {
        if (this.f56232c != -9223372036854775807L) {
            throw new IllegalStateException();
        }
        this.f56230a = j2;
    }

    public v(long j2) {
        c(j2);
    }

    public final long a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f56232c != -9223372036854775807L) {
            this.f56232c = j2;
        } else {
            long j3 = this.f56230a;
            if (j3 != Long.MAX_VALUE) {
                this.f56231b = j3 - j2;
            }
            synchronized (this) {
                this.f56232c = j2;
                notifyAll();
            }
        }
        return j2 + this.f56231b;
    }

    public final long b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f56232c != -9223372036854775807L) {
            long j3 = (this.f56232c * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j2;
            j2 += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j2 - j3)) {
                j2 = j5;
            }
        }
        return a((j2 * 1000000) / 90000);
    }
}
