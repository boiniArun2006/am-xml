package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.WavUtil;
import com.caoccao.javet.utils.Float16;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.wav.j
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return WavExtractor.n();
        }
    };
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private ExtractorOutput extractorOutput;
    private OutputWriter outputWriter;
    private TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    private static final class ImaAdPcmOutputWriter implements OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, Float16.EXPONENT_SIGNIFICAND_MASK};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        private void decode(byte[] bArr, int i2, ParsableByteArray parsableByteArray) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i5 = 0; i5 < this.wavFormat.numChannels; i5++) {
                    decodeBlockForChannel(bArr, i3, i5, parsableByteArray.getData());
                }
            }
            int iNumOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i2);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(iNumOutputFramesToBytes);
        }

        private static int numOutputFramesToBytes(int i2, int i3) {
            return i2 * 2 * i3;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j2) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j2;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        private void decodeBlockForChannel(byte[] bArr, int i2, int i3, byte[] bArr2) {
            WavFormat wavFormat = this.wavFormat;
            int i5 = wavFormat.blockSize;
            int i7 = wavFormat.numChannels;
            int i8 = (i2 * i5) + (i3 * 4);
            int i9 = (i7 * 4) + i8;
            int i10 = (i5 / i7) - 4;
            int iConstrainValue = (short) (((bArr[i8 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i8] & UByte.MAX_VALUE));
            int iMin = Math.min(bArr[i8 + 2] & UByte.MAX_VALUE, 88);
            int i11 = STEP_TABLE[iMin];
            int i12 = ((i2 * this.framesPerBlock * i7) + i3) * 2;
            bArr2[i12] = (byte) (iConstrainValue & 255);
            bArr2[i12 + 1] = (byte) (iConstrainValue >> 8);
            for (int i13 = 0; i13 < i10 * 2; i13++) {
                byte b2 = bArr[((i13 / 8) * i7 * 4) + i9 + ((i13 / 2) % 4)];
                int i14 = i13 % 2 == 0 ? b2 & 15 : (b2 & UByte.MAX_VALUE) >> 4;
                int i15 = ((((i14 & 7) * 2) + 1) * i11) >> 3;
                if ((i14 & 8) != 0) {
                    i15 = -i15;
                }
                iConstrainValue = Util.constrainValue(iConstrainValue + i15, -32768, Float16.EXPONENT_SIGNIFICAND_MASK);
                i12 += i7 * 2;
                bArr2[i12] = (byte) (iConstrainValue & 255);
                bArr2[i12 + 1] = (byte) (iConstrainValue >> 8);
                int i16 = iMin + INDEX_TABLE[i14];
                int[] iArr = STEP_TABLE;
                iMin = Util.constrainValue(i16, 0, iArr.length - 1);
                i11 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i2) {
            return i2 / (this.wavFormat.numChannels * 2);
        }

        private int numOutputFramesToBytes(int i2) {
            return numOutputFramesToBytes(i2, this.wavFormat.numChannels);
        }

        private void writeSampleMetadata(int i2) {
            long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i2);
            this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.pendingOutputBytes - iNumOutputFramesToBytes, null);
            this.outputFrameCount += (long) i2;
            this.pendingOutputBytes -= iNumOutputFramesToBytes;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i2, long j2) {
            WavSeekMap wavSeekMap = new WavSeekMap(this.wavFormat, this.framesPerBlock, i2, j2);
            this.extractorOutput.seekMap(wavSeekMap);
            this.trackOutput.format(this.format);
            this.trackOutput.durationUs(wavSeekMap.getDurationUs());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean sampleData(ExtractorInput extractorInput, long j2) throws IOException {
            int iNumOutputBytesToFrames;
            int iCeilDivide = Util.ceilDivide(this.targetSampleSizeFrames - numOutputBytesToFrames(this.pendingOutputBytes), this.framesPerBlock) * this.wavFormat.blockSize;
            boolean z2 = j2 == 0;
            while (!z2) {
                if (this.pendingInputBytes >= iCeilDivide) {
                    break;
                }
                int i2 = extractorInput.read(this.inputData, this.pendingInputBytes, (int) Math.min(iCeilDivide - r3, j2));
                if (i2 == -1) {
                    while (!z2) {
                    }
                } else {
                    this.pendingInputBytes += i2;
                }
            }
            int i3 = this.pendingInputBytes / this.wavFormat.blockSize;
            if (i3 > 0) {
                decode(this.inputData, i3, this.decodedData);
                this.pendingInputBytes -= i3 * this.wavFormat.blockSize;
                int iLimit = this.decodedData.limit();
                this.trackOutput.sampleData(this.decodedData, iLimit);
                int i5 = this.pendingOutputBytes + iLimit;
                this.pendingOutputBytes = i5;
                int iNumOutputBytesToFrames2 = numOutputBytesToFrames(i5);
                int i7 = this.targetSampleSizeFrames;
                if (iNumOutputBytesToFrames2 >= i7) {
                    writeSampleMetadata(i7);
                }
            }
            if (z2 && (iNumOutputBytesToFrames = numOutputBytesToFrames(this.pendingOutputBytes)) > 0) {
                writeSampleMetadata(iNumOutputBytesToFrames);
            }
            return z2;
        }

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int iMax = Math.max(1, wavFormat.frameRateHz / 10);
            this.targetSampleSizeFrames = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = littleEndianUnsignedShort;
            int i2 = wavFormat.numChannels;
            int i3 = (((wavFormat.blockSize - (i2 * 4)) * 8) / (wavFormat.bitsPerSample * i2)) + 1;
            if (littleEndianUnsignedShort == i3) {
                int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
                this.inputData = new byte[wavFormat.blockSize * iCeilDivide];
                this.decodedData = new ParsableByteArray(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i2));
                int i5 = ((wavFormat.frameRateHz * wavFormat.blockSize) * 8) / littleEndianUnsignedShort;
                this.format = new Format.Builder().setSampleMimeType("audio/raw").setAverageBitrate(i5).setPeakBitrate(i5).setMaxInputSize(numOutputFramesToBytes(iMax, i2)).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(2).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected frames per block: " + i3 + "; got: " + littleEndianUnsignedShort, null);
        }
    }

    private interface OutputWriter {
        void init(int i2, long j2) throws ParserException;

        void reset(long j2);

        boolean sampleData(ExtractorInput extractorInput, long j2) throws IOException;
    }

    private static final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i2, long j2) {
            WavSeekMap wavSeekMap = new WavSeekMap(this.wavFormat, 1, i2, j2);
            this.extractorOutput.seekMap(wavSeekMap);
            this.trackOutput.format(this.format);
            this.trackOutput.durationUs(wavSeekMap.getDurationUs());
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j2) {
            this.startTimeUs = j2;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(ExtractorInput extractorInput, long j2) throws IOException {
            int i2;
            int i3;
            long j3 = j2;
            while (j3 > 0 && (i2 = this.pendingOutputBytes) < (i3 = this.targetSampleSizeBytes)) {
                int iSampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min(i3 - i2, j3), true);
                if (iSampleData == -1) {
                    j3 = 0;
                } else {
                    this.pendingOutputBytes += iSampleData;
                    j3 -= (long) iSampleData;
                }
            }
            int i5 = this.wavFormat.blockSize;
            int i7 = this.pendingOutputBytes / i5;
            if (i7 > 0) {
                long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, r1.frameRateHz);
                int i8 = i7 * i5;
                int i9 = this.pendingOutputBytes - i8;
                this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, i8, i9, null);
                this.outputFrameCount += (long) i7;
                this.pendingOutputBytes = i9;
            }
            return j3 <= 0;
        }

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i2) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i3 = (wavFormat.numChannels * wavFormat.bitsPerSample) / 8;
            if (wavFormat.blockSize == i3) {
                int i5 = wavFormat.frameRateHz;
                int i7 = i5 * i3 * 8;
                int iMax = Math.max(i3, (i5 * i3) / 10);
                this.targetSampleSizeBytes = iMax;
                this.format = new Format.Builder().setContainerMimeType("audio/wav").setSampleMimeType(str).setAverageBitrate(i7).setPeakBitrate(i7).setMaxInputSize(iMax).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(i2).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected block size: " + i3 + "; got: " + wavFormat.blockSize, null);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    public static /* synthetic */ Extractor[] n() {
        return new Extractor[]{new WavExtractor()};
    }

    private int readSampleData(ExtractorInput extractorInput) throws IOException {
        Assertions.checkState(this.dataEndPosition != -1);
        return ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        this.state = j2 == 0 ? 0 : 4;
        OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j3);
        }
    }

    private void readFileType(ExtractorInput extractorInput) throws IOException {
        boolean z2;
        if (extractorInput.getPosition() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        int i2 = this.dataStartPosition;
        if (i2 != -1) {
            extractorInput.skipFully(i2);
            this.state = 4;
        } else {
            if (WavHeaderReader.checkFileType(extractorInput)) {
                extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
                this.state = 1;
                return;
            }
            throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
        }
    }

    private void readFormat(ExtractorInput extractorInput) throws IOException {
        WavFormat format = WavHeaderReader.readFormat(extractorInput);
        int i2 = format.formatType;
        if (i2 == 17) {
            this.outputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, format);
        } else if (i2 == 6) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, "audio/g711-alaw", -1);
        } else if (i2 == 7) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, "audio/g711-mlaw", -1);
        } else {
            int pcmEncodingForType = WavUtil.getPcmEncodingForType(i2, format.bitsPerSample);
            if (pcmEncodingForType != 0) {
                this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, "audio/raw", pcmEncodingForType);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + format.formatType);
            }
        }
        this.state = 3;
    }

    private void readRf64SampleDataSize(ExtractorInput extractorInput) throws IOException {
        this.rf64SampleDataSize = WavHeaderReader.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    private void skipToSampleData(ExtractorInput extractorInput) throws IOException {
        Pair<Long, Long> pairSkipToSampleData = WavHeaderReader.skipToSampleData(extractorInput);
        this.dataStartPosition = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j2 = this.rf64SampleDataSize;
        if (j2 != -1 && jLongValue == 4294967295L) {
            jLongValue = j2;
        }
        this.dataEndPosition = ((long) this.dataStartPosition) + jLongValue;
        long length = extractorInput.getLength();
        if (length != -1 && this.dataEndPosition > length) {
            Log.w(TAG, "Data exceeds input length: " + this.dataEndPosition + ", " + length);
            this.dataEndPosition = length;
        }
        ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        int i2 = this.state;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return readSampleData(extractorInput);
                        }
                        throw new IllegalStateException();
                    }
                    skipToSampleData(extractorInput);
                    return 0;
                }
                readFormat(extractorInput);
                return 0;
            }
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        readFileType(extractorInput);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return WavHeaderReader.checkFileType(extractorInput);
    }
}
