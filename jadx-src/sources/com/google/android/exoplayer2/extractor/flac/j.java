package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j extends BinarySearchSeeker {

    private static final class n implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FlacStreamMetadata f57773n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final FlacFrameReader.SampleNumberHolder f57774t;

        private n(FlacStreamMetadata flacStreamMetadata, int i2) {
            this.f57773n = flacStreamMetadata;
            this.rl = i2;
            this.f57774t = new FlacFrameReader.SampleNumberHolder();
        }

        private long n(ExtractorInput extractorInput) throws IOException {
            while (extractorInput.getPeekPosition() < extractorInput.getLength() - 6 && !FlacFrameReader.checkFrameHeaderFromPeek(extractorInput, this.f57773n, this.rl, this.f57774t)) {
                extractorInput.advancePeekPosition(1);
            }
            if (extractorInput.getPeekPosition() >= extractorInput.getLength() - 6) {
                extractorInput.advancePeekPosition((int) (extractorInput.getLength() - extractorInput.getPeekPosition()));
                return this.f57773n.totalSamples;
            }
            return this.f57774t.sampleNumber;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j2) throws IOException {
            long position = extractorInput.getPosition();
            long jN = n(extractorInput);
            long peekPosition = extractorInput.getPeekPosition();
            extractorInput.advancePeekPosition(Math.max(6, this.f57773n.minFrameSize));
            long jN2 = n(extractorInput);
            long peekPosition2 = extractorInput.getPeekPosition();
            if (jN <= j2 && jN2 > j2) {
                return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
            }
            if (jN2 <= j2) {
                return BinarySearchSeeker.TimestampSearchResult.underestimatedResult(jN2, peekPosition2);
            }
            return BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jN, position);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(final FlacStreamMetadata flacStreamMetadata, int i2, long j2, long j3) {
        super(new BinarySearchSeeker.SeekTimestampConverter() { // from class: xEq.j
            @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
            public final long timeUsToTargetTime(long j4) {
                return flacStreamMetadata.getSampleNumber(j4);
            }
        }, new n(flacStreamMetadata, i2), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j2, j3, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
