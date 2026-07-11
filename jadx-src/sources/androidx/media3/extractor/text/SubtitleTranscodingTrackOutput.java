package androidx.media3.extractor.text;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class SubtitleTranscodingTrackOutput implements TrackOutput {
    private static final String TAG = "SubtitleTranscodingTO";
    private Format currentFormat;

    @Nullable
    private SubtitleParser currentSubtitleParser;
    private final TrackOutput delegate;
    private boolean shouldSuppressParsingErrors;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final CueEncoder cueEncoder = new CueEncoder();
    private int sampleDataStart = 0;
    private int sampleDataEnd = 0;
    private byte[] sampleData = Util.EMPTY_BYTE_ARRAY;
    private final ParsableByteArray parsableScratch = new ParsableByteArray();

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i2, boolean z2, int i3) throws IOException {
        if (this.currentSubtitleParser == null) {
            return this.delegate.sampleData(dataReader, i2, z2, i3);
        }
        ensureSampleDataCapacity(i2);
        int i5 = dataReader.read(this.sampleData, this.sampleDataEnd, i2);
        if (i5 != -1) {
            this.sampleDataEnd += i5;
            return i5;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    private void ensureSampleDataCapacity(int i2) {
        int length = this.sampleData.length;
        int i3 = this.sampleDataEnd;
        if (length - i3 >= i2) {
            return;
        }
        int i5 = i3 - this.sampleDataStart;
        int iMax = Math.max(i5 * 2, i2 + i5);
        byte[] bArr = this.sampleData;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.sampleDataStart, bArr2, 0, i5);
        this.sampleDataStart = 0;
        this.sampleDataEnd = i5;
        this.sampleData = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void outputSample(CuesWithTiming cuesWithTiming, long j2, int i2) {
        Assertions.checkStateNotNull(this.currentFormat);
        byte[] bArrEncode = this.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs);
        this.parsableScratch.reset(bArrEncode);
        this.delegate.sampleData(this.parsableScratch, bArrEncode.length);
        long j3 = cuesWithTiming.startTimeUs;
        if (j3 == -9223372036854775807L) {
            Assertions.checkState(this.currentFormat.subsampleOffsetUs == Long.MAX_VALUE);
        } else {
            long j4 = this.currentFormat.subsampleOffsetUs;
            j2 = j4 == Long.MAX_VALUE ? j2 + j3 : j3 + j4;
        }
        this.delegate.sampleMetadata(j2, i2 | 1, bArrEncode.length, 0, null);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        Assertions.checkNotNull(format.sampleMimeType);
        Assertions.checkArgument(MimeTypes.getTrackType(format.sampleMimeType) == 3);
        if (!format.equals(this.currentFormat)) {
            this.currentFormat = format;
            this.currentSubtitleParser = this.subtitleParserFactory.supportsFormat(format) ? this.subtitleParserFactory.create(format) : null;
        }
        if (this.currentSubtitleParser == null) {
            this.delegate.format(format);
        } else {
            this.delegate.format(format.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(format.sampleMimeType).setSubsampleOffsetUs(Long.MAX_VALUE).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format)).build());
        }
    }

    public void resetSubtitleParser() {
        SubtitleParser subtitleParser = this.currentSubtitleParser;
        if (subtitleParser != null) {
            subtitleParser.reset();
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(final long j2, final int i2, int i3, int i5, @Nullable TrackOutput.CryptoData cryptoData) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleMetadata(j2, i2, i3, i5, cryptoData);
            return;
        }
        Assertions.checkArgument(cryptoData == null, "DRM on subtitles is not supported");
        int i7 = (this.sampleDataEnd - i5) - i3;
        try {
            this.currentSubtitleParser.parse(this.sampleData, i7, i3, SubtitleParser.OutputOptions.allCues(), new Consumer() { // from class: androidx.media3.extractor.text.I28
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.f39900n.outputSample((CuesWithTiming) obj, j2, i2);
                }
            });
        } catch (RuntimeException e2) {
            if (!this.shouldSuppressParsingErrors) {
                throw e2;
            }
            Log.w(TAG, "Parsing subtitles failed, ignoring sample.", e2);
        }
        int i8 = i7 + i3;
        this.sampleDataStart = i8;
        if (i8 == this.sampleDataEnd) {
            this.sampleDataStart = 0;
            this.sampleDataEnd = 0;
        }
    }

    public void shouldSuppressParsingErrors(boolean z2) {
        this.shouldSuppressParsingErrors = z2;
    }

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput, SubtitleParser.Factory factory) {
        this.delegate = trackOutput;
        this.subtitleParserFactory = factory;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i2, int i3) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleData(parsableByteArray, i2, i3);
            return;
        }
        ensureSampleDataCapacity(i2);
        parsableByteArray.readBytes(this.sampleData, this.sampleDataEnd, i2);
        this.sampleDataEnd += i2;
    }
}
