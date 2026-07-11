package com.google.android.exoplayer2.extractor.mp3;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n implements Seeker {
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final LongArray f57803O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f57804n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final LongArray f57805t;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.f57804n;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.J2;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.f57805t, j2, true, true);
        SeekPoint seekPoint = new SeekPoint(this.f57805t.get(iBinarySearchFloor), this.f57803O.get(iBinarySearchFloor));
        if (seekPoint.timeUs == j2 || iBinarySearchFloor == this.f57805t.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i2 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.f57805t.get(i2), this.f57803O.get(i2)));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        return this.f57805t.get(Util.binarySearchFloor(this.f57803O, j2, true, true));
    }

    void nr(long j2) {
        this.J2 = j2;
    }

    public boolean rl(long j2) {
        LongArray longArray = this.f57805t;
        return j2 - longArray.get(longArray.size() - 1) < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    public n(long j2, long j3, long j4) {
        this.J2 = j2;
        this.f57804n = j4;
        LongArray longArray = new LongArray();
        this.f57805t = longArray;
        LongArray longArray2 = new LongArray();
        this.f57803O = longArray2;
        longArray.add(0L);
        longArray2.add(j3);
    }

    public void t(long j2, long j3) {
        if (rl(j2)) {
            return;
        }
        this.f57805t.add(j2);
        this.f57803O.add(j3);
    }
}
