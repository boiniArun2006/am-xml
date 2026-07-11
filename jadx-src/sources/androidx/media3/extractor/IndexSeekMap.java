package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public final class IndexSeekMap implements SeekMap {
    private long durationUs;
    private final LongArray positions;
    private final LongArray timesUs;

    public void addSeekPoint(long j2, long j3) {
        if (this.timesUs.size() == 0 && j2 > 0) {
            this.positions.add(0L);
            this.timesUs.add(0L);
        }
        this.positions.add(j3);
        this.timesUs.add(j2);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        if (this.timesUs.size() == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j2, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs.get(iBinarySearchFloor), this.positions.get(iBinarySearchFloor));
        if (seekPoint.timeUs == j2 || iBinarySearchFloor == this.timesUs.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i2 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs.get(i2), this.positions.get(i2)));
    }

    public long getTimeUs(long j2) {
        if (this.timesUs.size() == 0) {
            return -9223372036854775807L;
        }
        return this.timesUs.get(Util.binarySearchFloor(this.positions, j2, true, true));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.timesUs.size() > 0;
    }

    public boolean isTimeUsInIndex(long j2, long j3) {
        if (this.timesUs.size() == 0) {
            return false;
        }
        LongArray longArray = this.timesUs;
        return j2 - longArray.get(longArray.size() - 1) < j3;
    }

    public void setDurationUs(long j2) {
        this.durationUs = j2;
    }

    public IndexSeekMap(long[] jArr, long[] jArr2, long j2) {
        boolean z2;
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i2 = length + 1;
            LongArray longArray = new LongArray(i2);
            this.positions = longArray;
            LongArray longArray2 = new LongArray(i2);
            this.timesUs = longArray2;
            longArray.add(0L);
            longArray2.add(0L);
        } else {
            this.positions = new LongArray(length);
            this.timesUs = new LongArray(length);
        }
        this.positions.addAll(jArr);
        this.timesUs.addAll(jArr2);
        this.durationUs = j2;
    }
}
