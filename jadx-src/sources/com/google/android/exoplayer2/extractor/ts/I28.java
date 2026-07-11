package com.google.android.exoplayer2.extractor.ts;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class I28 extends BinarySearchSeeker {

    private static final class n implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TimestampAdjuster f57896n;
        private final ParsableByteArray rl;

        private BinarySearchSeeker.TimestampSearchResult n(ParsableByteArray parsableByteArray, long j2, long j3) {
            int position = -1;
            int position2 = -1;
            long j4 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 4) {
                if (I28.rl(parsableByteArray.getData(), parsableByteArray.getPosition()) != 442) {
                    parsableByteArray.skipBytes(1);
                } else {
                    parsableByteArray.skipBytes(4);
                    long jQie = Wre.qie(parsableByteArray);
                    if (jQie != -9223372036854775807L) {
                        long jAdjustTsTimestamp = this.f57896n.adjustTsTimestamp(jQie);
                        if (jAdjustTsTimestamp > j2) {
                            return j4 == -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, j3) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j3 + ((long) position2));
                        }
                        if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jAdjustTsTimestamp > j2) {
                            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j3 + ((long) parsableByteArray.getPosition()));
                        }
                        position2 = parsableByteArray.getPosition();
                        j4 = jAdjustTsTimestamp;
                    }
                    rl(parsableByteArray);
                    position = parsableByteArray.getPosition();
                }
            }
            return j4 != -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j4, j3 + ((long) position)) : BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        private n(TimestampAdjuster timestampAdjuster) {
            this.f57896n = timestampAdjuster;
            this.rl = new ParsableByteArray();
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.rl.reset(Util.EMPTY_BYTE_ARRAY);
        }

        private static void rl(ParsableByteArray parsableByteArray) {
            int iRl;
            int iLimit = parsableByteArray.limit();
            if (parsableByteArray.bytesLeft() < 10) {
                parsableByteArray.setPosition(iLimit);
                return;
            }
            parsableByteArray.skipBytes(9);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 7;
            if (parsableByteArray.bytesLeft() < unsignedByte) {
                parsableByteArray.setPosition(iLimit);
                return;
            }
            parsableByteArray.skipBytes(unsignedByte);
            if (parsableByteArray.bytesLeft() < 4) {
                parsableByteArray.setPosition(iLimit);
                return;
            }
            if (I28.rl(parsableByteArray.getData(), parsableByteArray.getPosition()) == 443) {
                parsableByteArray.skipBytes(4);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                if (parsableByteArray.bytesLeft() < unsignedShort) {
                    parsableByteArray.setPosition(iLimit);
                    return;
                }
                parsableByteArray.skipBytes(unsignedShort);
            }
            while (parsableByteArray.bytesLeft() >= 4 && (iRl = I28.rl(parsableByteArray.getData(), parsableByteArray.getPosition())) != 442 && iRl != 441 && (iRl >>> 8) == 1) {
                parsableByteArray.skipBytes(4);
                if (parsableByteArray.bytesLeft() < 2) {
                    parsableByteArray.setPosition(iLimit);
                    return;
                }
                parsableByteArray.setPosition(Math.min(parsableByteArray.limit(), parsableByteArray.getPosition() + parsableByteArray.readUnsignedShort()));
            }
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j2) throws IOException {
            long position = extractorInput.getPosition();
            int iMin = (int) Math.min(20000L, extractorInput.getLength() - position);
            this.rl.reset(iMin);
            extractorInput.peekFully(this.rl.getData(), 0, iMin);
            return n(this.rl, j2, position);
        }
    }

    public I28(TimestampAdjuster timestampAdjuster, long j2, long j3) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new n(timestampAdjuster), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int rl(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & UByte.MAX_VALUE) | ((bArr[i2] & UByte.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 8);
    }
}
