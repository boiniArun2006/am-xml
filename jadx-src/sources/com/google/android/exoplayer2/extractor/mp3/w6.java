package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class w6 implements Seeker {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f57806O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long[] f57807n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long[] f57808t;

    private static Pair t(long j2, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, j2, true, true);
        long j3 = jArr[iBinarySearchFloor];
        long j4 = jArr2[iBinarySearchFloor];
        int i2 = iBinarySearchFloor + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((jArr[i2] == j3 ? 0.0d : (j2 - j3) / (r6 - j3)) * (jArr2[i2] - j4))) + j4));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public static w6 rl(long j2, MlltFrame mlltFrame, long j3) {
        int length = mlltFrame.bytesDeviations.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i5 = i3 - 1;
            j2 += (long) (mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i5]);
            j4 += (long) (mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i5]);
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new w6(jArr, jArr2, j3);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f57806O;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        Pair pairT = t(Util.usToMs(Util.constrainValue(j2, 0L, this.f57806O)), this.f57808t, this.f57807n);
        return new SeekMap.SeekPoints(new SeekPoint(Util.msToUs(((Long) pairT.first).longValue()), ((Long) pairT.second).longValue()));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        return Util.msToUs(((Long) t(j2, this.f57807n, this.f57808t).second).longValue());
    }

    private w6(long[] jArr, long[] jArr2, long j2) {
        this.f57807n = jArr;
        this.f57808t = jArr2;
        this.f57806O = j2 == -9223372036854775807L ? Util.msToUs(jArr2[jArr2.length - 1]) : j2;
    }
}
