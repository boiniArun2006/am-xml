package com.google.android.exoplayer2.extractor.ts;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class fuX extends BinarySearchSeeker {

    private static final class j implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TimestampAdjuster f57910n;
        private final int nr;
        private final ParsableByteArray rl = new ParsableByteArray();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f57911t;

        private BinarySearchSeeker.TimestampSearchResult n(ParsableByteArray parsableByteArray, long j2, long j3) {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            int iLimit = parsableByteArray.limit();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = TsUtil.findSyncBytePosition(parsableByteArray.getData(), parsableByteArray.getPosition(), iLimit)) + 188) <= iLimit) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, iFindSyncBytePosition, this.f57911t);
                if (pcrFromPacket != -9223372036854775807L) {
                    long jAdjustTsTimestamp = this.f57910n.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > j2) {
                        return j6 == -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, j3) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j3 + j5);
                    }
                    if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jAdjustTsTimestamp > j2) {
                        return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j3 + ((long) iFindSyncBytePosition));
                    }
                    j5 = iFindSyncBytePosition;
                    j6 = jAdjustTsTimestamp;
                }
                parsableByteArray.setPosition(iFindSyncBytePosition2);
                j4 = iFindSyncBytePosition2;
            }
            return j6 != -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j6, j3 + j4) : BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.rl.reset(Util.EMPTY_BYTE_ARRAY);
        }

        public j(int i2, TimestampAdjuster timestampAdjuster, int i3) {
            this.f57911t = i2;
            this.f57910n = timestampAdjuster;
            this.nr = i3;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j2) throws IOException {
            long position = extractorInput.getPosition();
            int iMin = (int) Math.min(this.nr, extractorInput.getLength() - position);
            this.rl.reset(iMin);
            extractorInput.peekFully(this.rl.getData(), 0, iMin);
            return n(this.rl, j2, position);
        }
    }

    public fuX(TimestampAdjuster timestampAdjuster, long j2, long j3, int i2, int i3) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new j(i2, timestampAdjuster, i3), j2, 0L, j2 + 1, 0L, j3, 188L, 940);
    }
}
