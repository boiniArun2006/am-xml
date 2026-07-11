package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;

    @GuardedBy
    private long firstSampleTimestampUs;

    @GuardedBy
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();

    @GuardedBy
    private long timestampOffsetUs;

    public synchronized long adjustSampleTimestamp(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.timestampOffsetUs == -9223372036854775807L) {
                long jLongValue = this.firstSampleTimestampUs;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = jLongValue - j2;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j2;
            return j2 + this.timestampOffsetUs;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long adjustTsTimestamp(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.lastUnadjustedTimestampUs;
            if (j3 != -9223372036854775807L) {
                long jUsToNonWrappedPts = usToNonWrappedPts(j3);
                long j4 = (4294967296L + jUsToNonWrappedPts) / MAX_PTS_PLUS_ONE;
                long j5 = ((j4 - 1) * MAX_PTS_PLUS_ONE) + j2;
                j2 += j4 * MAX_PTS_PLUS_ONE;
                if (Math.abs(j5 - jUsToNonWrappedPts) < Math.abs(j2 - jUsToNonWrappedPts)) {
                    j2 = j5;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j2;
        j2 = this.firstSampleTimestampUs;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            j2 = -9223372036854775807L;
        }
        return j2;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j2;
        try {
            j2 = this.lastUnadjustedTimestampUs;
        } catch (Throwable th) {
            throw th;
        }
        return j2 != -9223372036854775807L ? j2 + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized void reset(long j2) {
        this.firstSampleTimestampUs = j2;
        this.timestampOffsetUs = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = -9223372036854775807L;
    }

    public synchronized void sharedInitializeOrWait(boolean z2, long j2) throws InterruptedException {
        try {
            Assertions.checkState(this.firstSampleTimestampUs == 9223372036854775806L);
            if (this.timestampOffsetUs != -9223372036854775807L) {
                return;
            }
            if (z2) {
                this.nextSampleTimestampUs.set(Long.valueOf(j2));
            } else {
                while (this.timestampOffsetUs == -9223372036854775807L) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public TimestampAdjuster(long j2) {
        reset(j2);
    }

    public static long ptsToUs(long j2) {
        return (j2 * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j2) {
        return (j2 * 90000) / 1000000;
    }

    public static long usToWrappedPts(long j2) {
        return usToNonWrappedPts(j2) % MAX_PTS_PLUS_ONE;
    }
}
