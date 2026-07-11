package androidx.media3.common.util;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private final long endPositionUs;
    private final float frameRate;
    private int framesAdded;
    private final double framesDurationUs;
    private final long startPositionUs;
    private final int totalNumberOfFramesToAdd;

    public ConstantRateTimestampIterator(@IntRange long j2, @FloatRange float f3) {
        this(0L, j2, f3);
    }

    public ConstantRateTimestampIterator(@IntRange long j2, @IntRange long j3, @FloatRange float f3) {
        boolean z2 = false;
        Assertions.checkArgument(j3 > 0);
        Assertions.checkArgument(f3 > 0.0f);
        if (0 <= j2 && j2 < j3) {
            z2 = true;
        }
        Assertions.checkArgument(z2);
        this.startPositionUs = j2;
        this.endPositionUs = j3;
        this.frameRate = f3;
        this.totalNumberOfFramesToAdd = Math.max(Math.round(((j3 - j2) / 1000000.0f) * f3), 1);
        this.framesDurationUs = 1000000.0f / f3;
    }

    private long getTimestampUsAfter(int i2) {
        long jRound = this.startPositionUs + Math.round(this.framesDurationUs * ((double) i2));
        Assertions.checkState(jRound >= 0);
        return jRound;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public ConstantRateTimestampIterator copyOf() {
        return new ConstantRateTimestampIterator(this.startPositionUs, this.endPositionUs, this.frameRate);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long getLastTimestampUs() {
        int i2 = this.totalNumberOfFramesToAdd;
        if (i2 == 0) {
            return -9223372036854775807L;
        }
        return getTimestampUsAfter(i2 - 1);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.framesAdded < this.totalNumberOfFramesToAdd;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        Assertions.checkState(hasNext());
        int i2 = this.framesAdded;
        this.framesAdded = i2 + 1;
        return getTimestampUsAfter(i2);
    }
}
