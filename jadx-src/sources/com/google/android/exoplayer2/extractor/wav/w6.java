package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class w6 implements SeekMap {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f57922O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f57923n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f57924r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f57925t;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    private long rl(long j2) {
        return Util.scaleLargeTimestamp(j2 * ((long) this.f57925t), 1000000L, this.f57923n.f57920t);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f57924r;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        long jConstrainValue = Util.constrainValue((((long) this.f57923n.f57920t) * j2) / (((long) this.f57925t) * 1000000), 0L, this.J2 - 1);
        long j3 = this.f57922O + (((long) this.f57923n.f57918O) * jConstrainValue);
        long jRl = rl(jConstrainValue);
        SeekPoint seekPoint = new SeekPoint(jRl, j3);
        if (jRl >= j2 || jConstrainValue == this.J2 - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        long j4 = jConstrainValue + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(rl(j4), this.f57922O + (((long) this.f57923n.f57918O) * j4)));
    }

    public w6(j jVar, int i2, long j2, long j3) {
        this.f57923n = jVar;
        this.f57925t = i2;
        this.f57922O = j2;
        long j4 = (j3 - j2) / ((long) jVar.f57918O);
        this.J2 = j4;
        this.f57924r = rl(j4);
    }
}
