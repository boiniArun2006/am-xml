package androidx.media3.common.util;

import androidx.media3.common.audio.SpeedProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public class SpeedProviderUtil {
    public static long getDurationAfterSpeedProviderApplied(SpeedProvider speedProvider, long j2) {
        long j3 = 0;
        double dMin = 0.0d;
        while (j3 < j2) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j3);
            if (nextSpeedChangeTimeUs == -9223372036854775807L) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            dMin += (Math.min(nextSpeedChangeTimeUs, j2) - j3) / ((double) speedProvider.getSpeed(j3));
            j3 = nextSpeedChangeTimeUs;
        }
        return (long) Math.floor(dMin);
    }

    public static long getNextSpeedChangeSamplePosition(SpeedProvider speedProvider, long j2, int i2) {
        Assertions.checkArgument(j2 >= 0);
        Assertions.checkArgument(i2 > 0);
        long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(Util.sampleCountToDurationUs(j2, i2));
        if (nextSpeedChangeTimeUs == -9223372036854775807L) {
            return -1L;
        }
        return Util.durationUsToSampleCount(nextSpeedChangeTimeUs, i2);
    }

    public static float getSampleAlignedSpeed(SpeedProvider speedProvider, long j2, int i2) {
        Assertions.checkArgument(j2 >= 0);
        Assertions.checkArgument(i2 > 0);
        return speedProvider.getSpeed(Util.sampleCountToDurationUs(j2, i2));
    }

    private SpeedProviderUtil() {
    }
}
