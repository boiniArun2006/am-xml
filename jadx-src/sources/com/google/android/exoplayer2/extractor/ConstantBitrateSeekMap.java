package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class ConstantBitrateSeekMap implements SeekMap {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;

    public ConstantBitrateSeekMap(long j2, long j3, int i2, int i3) {
        this(j2, j3, i2, i3, false);
    }

    public long getTimeUsAtPosition(long j2) {
        return getTimeUsAtPosition(j2, this.firstFrameBytePosition, this.bitrate);
    }

    public ConstantBitrateSeekMap(long j2, long j3, int i2, int i3, boolean z2) {
        this.inputLength = j2;
        this.firstFrameBytePosition = j3;
        this.frameSize = i3 == -1 ? 1 : i3;
        this.bitrate = i2;
        this.allowSeeksIfLengthUnknown = z2;
        if (j2 == -1) {
            this.dataSize = -1L;
            this.durationUs = -9223372036854775807L;
        } else {
            this.dataSize = j2 - j3;
            this.durationUs = getTimeUsAtPosition(j2, j3, i2);
        }
    }

    private long getFramePositionForTimeUs(long j2) {
        long j3 = (j2 * ((long) this.bitrate)) / 8000000;
        int i2 = this.frameSize;
        long jMin = (j3 / ((long) i2)) * ((long) i2);
        long j4 = this.dataSize;
        if (j4 != -1) {
            jMin = Math.min(jMin, j4 - ((long) i2));
        }
        return this.firstFrameBytePosition + Math.max(jMin, 0L);
    }

    private static long getTimeUsAtPosition(long j2, long j3, int i2) {
        return (Math.max(0L, j2 - j3) * 8000000) / ((long) i2);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        if (this.dataSize == -1 && !this.allowSeeksIfLengthUnknown) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFrameBytePosition));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j2);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        SeekPoint seekPoint = new SeekPoint(timeUsAtPosition, framePositionForTimeUs);
        if (this.dataSize != -1 && timeUsAtPosition < j2) {
            int i2 = this.frameSize;
            if (((long) i2) + framePositionForTimeUs < this.inputLength) {
                long j3 = framePositionForTimeUs + ((long) i2);
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUsAtPosition(j3), j3));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1 || this.allowSeeksIfLengthUnknown;
    }
}
