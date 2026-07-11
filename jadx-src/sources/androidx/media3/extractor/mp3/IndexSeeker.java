package androidx.media3.extractor.mp3;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.SeekMap;
import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class IndexSeeker implements Seeker {

    @VisibleForTesting
    static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final int averageBitrate;
    private final long dataEndPosition;
    private final IndexSeekMap indexSeekMap;

    public IndexSeeker(long j2, long j3, long j4) {
        this.indexSeekMap = new IndexSeekMap(new long[]{j3}, new long[]{0}, j2);
        this.dataEndPosition = j4;
        int i2 = -2147483647;
        if (j2 == -9223372036854775807L) {
            this.averageBitrate = -2147483647;
            return;
        }
        long jScaleLargeValue = Util.scaleLargeValue(j3 - j4, 8L, j2, RoundingMode.HALF_UP);
        if (jScaleLargeValue > 0 && jScaleLargeValue <= 2147483647L) {
            i2 = (int) jScaleLargeValue;
        }
        this.averageBitrate = i2;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.averageBitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.indexSeekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        return this.indexSeekMap.getSeekPoints(j2);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        return this.indexSeekMap.getTimeUs(j2);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.indexSeekMap.isSeekable();
    }

    public boolean isTimeUsInIndex(long j2) {
        return this.indexSeekMap.isTimeUsInIndex(j2, 100000L);
    }

    void setDurationUs(long j2) {
        this.indexSeekMap.setDurationUs(j2);
    }

    public void maybeAddSeekPoint(long j2, long j3) {
        if (isTimeUsInIndex(j2)) {
            return;
        }
        this.indexSeekMap.addSeekPoint(j2, j3);
    }
}
