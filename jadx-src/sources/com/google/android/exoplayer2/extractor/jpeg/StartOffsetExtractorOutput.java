package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput extractorOutput;
    private final long startOffset;

    class j implements SeekMap {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SeekMap f57782n;

        j(SeekMap seekMap) {
            this.f57782n = seekMap;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.f57782n.getDurationUs();
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2) {
            SeekMap.SeekPoints seekPoints = this.f57782n.getSeekPoints(j2);
            SeekPoint seekPoint = seekPoints.first;
            SeekPoint seekPoint2 = new SeekPoint(seekPoint.timeUs, seekPoint.position + StartOffsetExtractorOutput.this.startOffset);
            SeekPoint seekPoint3 = seekPoints.second;
            return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + StartOffsetExtractorOutput.this.startOffset));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return this.f57782n.isSeekable();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        this.extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.extractorOutput.seekMap(new j(seekMap));
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i2, int i3) {
        return this.extractorOutput.track(i2, i3);
    }

    public StartOffsetExtractorOutput(long j2, ExtractorOutput extractorOutput) {
        this.startOffset = j2;
        this.extractorOutput = extractorOutput;
    }
}
