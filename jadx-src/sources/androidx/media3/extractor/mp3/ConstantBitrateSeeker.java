package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataEndPosition;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j2, long j3, MpegAudioUtil.Header header, boolean z2) {
        this(j2, j3, header.bitrate, header.frameSize, z2);
    }

    public ConstantBitrateSeeker(long j2, long j3, int i2, int i3, boolean z2) {
        super(j2, j3, i2, i3, z2);
        long j4 = j2;
        this.firstFramePosition = j3;
        this.bitrate = i2;
        this.frameSize = i3;
        this.allowSeeksIfLengthUnknown = z2;
        this.dataEndPosition = j4 == -1 ? -1L : j4;
    }

    public ConstantBitrateSeeker copyWithNewDataEndPosition(long j2) {
        return new ConstantBitrateSeeker(j2, this.firstFramePosition, this.bitrate, this.frameSize, this.allowSeeksIfLengthUnknown);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        return getTimeUsAtPosition(j2);
    }
}
