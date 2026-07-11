package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.caoccao.javet.utils.Float16;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: Vxa.j
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
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
    private n outputWriter;
    private TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    private static final class j implements n {
        private static final int[] az = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] ty = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, Float16.EXPONENT_SIGNIFICAND_MASK};
        private final ParsableByteArray J2;
        private final Format KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final byte[] f57912O;
        private final int Uo;
        private int gh;
        private long mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ExtractorOutput f57913n;
        private final int nr;
        private long qie;
        private final TrackOutput rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.wav.j f57914t;
        private int xMQ;

        private static int J2(int i2, int i3) {
            return i2 * 2 * i3;
        }

        private void rl(byte[] bArr, int i2, ParsableByteArray parsableByteArray) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i5 = 0; i5 < this.f57914t.rl; i5++) {
                    t(bArr, i3, i5, parsableByteArray.getData());
                }
            }
            int iO = O(this.nr * i2);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(iO);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.n
        public void reset(long j2) {
            this.xMQ = 0;
            this.mUb = j2;
            this.gh = 0;
            this.qie = 0L;
        }

        private int O(int i2) {
            return J2(i2, this.f57914t.rl);
        }

        private void Uo(int i2) {
            long jScaleLargeTimestamp = this.mUb + Util.scaleLargeTimestamp(this.qie, 1000000L, this.f57914t.f57920t);
            int iO = O(i2);
            this.rl.sampleMetadata(jScaleLargeTimestamp, 1, iO, this.gh - iO, null);
            this.qie += (long) i2;
            this.gh -= iO;
        }

        private int nr(int i2) {
            return i2 / (this.f57914t.rl * 2);
        }

        private void t(byte[] bArr, int i2, int i3, byte[] bArr2) {
            com.google.android.exoplayer2.extractor.wav.j jVar = this.f57914t;
            int i5 = jVar.f57918O;
            int i7 = jVar.rl;
            int i8 = (i2 * i5) + (i3 * 4);
            int i9 = (i7 * 4) + i8;
            int i10 = (i5 / i7) - 4;
            int iConstrainValue = (short) (((bArr[i8 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i8] & UByte.MAX_VALUE));
            int iMin = Math.min(bArr[i8 + 2] & UByte.MAX_VALUE, 88);
            int i11 = ty[iMin];
            int i12 = ((i2 * this.nr * i7) + i3) * 2;
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
                int i16 = iMin + az[i14];
                int[] iArr = ty;
                iMin = Util.constrainValue(i16, 0, iArr.length - 1);
                i11 = iArr[iMin];
            }
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.n
        public void init(int i2, long j2) {
            this.f57913n.seekMap(new com.google.android.exoplayer2.extractor.wav.w6(this.f57914t, this.nr, i2, j2));
            this.rl.format(this.KN);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean n(ExtractorInput extractorInput, long j2) throws IOException {
            int iNr;
            int iCeilDivide = Util.ceilDivide(this.Uo - nr(this.gh), this.nr) * this.f57914t.f57918O;
            boolean z2 = j2 == 0;
            while (!z2) {
                if (this.xMQ >= iCeilDivide) {
                    break;
                }
                int i2 = extractorInput.read(this.f57912O, this.xMQ, (int) Math.min(iCeilDivide - r3, j2));
                if (i2 == -1) {
                    while (!z2) {
                    }
                } else {
                    this.xMQ += i2;
                }
            }
            int i3 = this.xMQ / this.f57914t.f57918O;
            if (i3 > 0) {
                rl(this.f57912O, i3, this.J2);
                this.xMQ -= i3 * this.f57914t.f57918O;
                int iLimit = this.J2.limit();
                this.rl.sampleData(this.J2, iLimit);
                int i5 = this.gh + iLimit;
                this.gh = i5;
                int iNr2 = nr(i5);
                int i7 = this.Uo;
                if (iNr2 >= i7) {
                    Uo(i7);
                }
            }
            if (z2 && (iNr = nr(this.gh)) > 0) {
                Uo(iNr);
            }
            return z2;
        }

        public j(ExtractorOutput extractorOutput, TrackOutput trackOutput, com.google.android.exoplayer2.extractor.wav.j jVar) throws ParserException {
            this.f57913n = extractorOutput;
            this.rl = trackOutput;
            this.f57914t = jVar;
            int iMax = Math.max(1, jVar.f57920t / 10);
            this.Uo = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(jVar.Uo);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.nr = littleEndianUnsignedShort;
            int i2 = jVar.rl;
            int i3 = (((jVar.f57918O - (i2 * 4)) * 8) / (jVar.J2 * i2)) + 1;
            if (littleEndianUnsignedShort == i3) {
                int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
                this.f57912O = new byte[jVar.f57918O * iCeilDivide];
                this.J2 = new ParsableByteArray(iCeilDivide * J2(littleEndianUnsignedShort, i2));
                int i5 = ((jVar.f57920t * jVar.f57918O) * 8) / littleEndianUnsignedShort;
                this.KN = new Format.Builder().setSampleMimeType("audio/raw").setAverageBitrate(i5).setPeakBitrate(i5).setMaxInputSize(J2(iMax, i2)).setChannelCount(jVar.rl).setSampleRate(jVar.f57920t).setPcmEncoding(2).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected frames per block: " + i3 + "; got: " + littleEndianUnsignedShort, null);
        }
    }

    private interface n {
        void init(int i2, long j2);

        boolean n(ExtractorInput extractorInput, long j2);

        void reset(long j2);
    }

    private static final class w6 implements n {
        private long J2;
        private long KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f57915O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ExtractorOutput f57916n;
        private final Format nr;
        private final TrackOutput rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.wav.j f57917t;

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.n
        public void init(int i2, long j2) {
            this.f57916n.seekMap(new com.google.android.exoplayer2.extractor.wav.w6(this.f57917t, 1, i2, j2));
            this.rl.format(this.nr);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.n
        public boolean n(ExtractorInput extractorInput, long j2) throws IOException {
            int i2;
            int i3;
            long j3 = j2;
            while (j3 > 0 && (i2 = this.Uo) < (i3 = this.f57915O)) {
                int iSampleData = this.rl.sampleData((DataReader) extractorInput, (int) Math.min(i3 - i2, j3), true);
                if (iSampleData == -1) {
                    j3 = 0;
                } else {
                    this.Uo += iSampleData;
                    j3 -= (long) iSampleData;
                }
            }
            int i5 = this.f57917t.f57918O;
            int i7 = this.Uo / i5;
            if (i7 > 0) {
                long jScaleLargeTimestamp = this.J2 + Util.scaleLargeTimestamp(this.KN, 1000000L, r1.f57920t);
                int i8 = i7 * i5;
                int i9 = this.Uo - i8;
                this.rl.sampleMetadata(jScaleLargeTimestamp, 1, i8, i9, null);
                this.KN += (long) i7;
                this.Uo = i9;
            }
            return j3 <= 0;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.n
        public void reset(long j2) {
            this.J2 = j2;
            this.Uo = 0;
            this.KN = 0L;
        }

        public w6(ExtractorOutput extractorOutput, TrackOutput trackOutput, com.google.android.exoplayer2.extractor.wav.j jVar, String str, int i2) throws ParserException {
            this.f57916n = extractorOutput;
            this.rl = trackOutput;
            this.f57917t = jVar;
            int i3 = (jVar.rl * jVar.J2) / 8;
            if (jVar.f57918O == i3) {
                int i5 = jVar.f57920t;
                int i7 = i5 * i3 * 8;
                int iMax = Math.max(i3, (i5 * i3) / 10);
                this.f57915O = iMax;
                this.nr = new Format.Builder().setSampleMimeType(str).setAverageBitrate(i7).setPeakBitrate(i7).setMaxInputSize(iMax).setChannelCount(jVar.rl).setSampleRate(jVar.f57920t).setPcmEncoding(i2).build();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected block size: " + i3 + "; got: " + jVar.f57918O, null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
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
        return ((n) Assertions.checkNotNull(this.outputWriter)).n(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j2, long j3) {
        this.state = j2 == 0 ? 0 : 4;
        n nVar = this.outputWriter;
        if (nVar != null) {
            nVar.reset(j3);
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
            if (com.google.android.exoplayer2.extractor.wav.n.n(extractorInput)) {
                extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
                this.state = 1;
                return;
            }
            throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
        }
    }

    private void readFormat(ExtractorInput extractorInput) throws IOException {
        com.google.android.exoplayer2.extractor.wav.j jVarRl = com.google.android.exoplayer2.extractor.wav.n.rl(extractorInput);
        int i2 = jVarRl.f57919n;
        if (i2 == 17) {
            this.outputWriter = new j(this.extractorOutput, this.trackOutput, jVarRl);
        } else if (i2 == 6) {
            this.outputWriter = new w6(this.extractorOutput, this.trackOutput, jVarRl, "audio/g711-alaw", -1);
        } else if (i2 == 7) {
            this.outputWriter = new w6(this.extractorOutput, this.trackOutput, jVarRl, "audio/g711-mlaw", -1);
        } else {
            int pcmEncodingForType = WavUtil.getPcmEncodingForType(i2, jVarRl.J2);
            if (pcmEncodingForType != 0) {
                this.outputWriter = new w6(this.extractorOutput, this.trackOutput, jVarRl, "audio/raw", pcmEncodingForType);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + jVarRl.f57919n);
            }
        }
        this.state = 3;
    }

    private void readRf64SampleDataSize(ExtractorInput extractorInput) throws IOException {
        this.rf64SampleDataSize = com.google.android.exoplayer2.extractor.wav.n.t(extractorInput);
        this.state = 2;
    }

    private void skipToSampleData(ExtractorInput extractorInput) throws IOException {
        Pair pairO = com.google.android.exoplayer2.extractor.wav.n.O(extractorInput);
        this.dataStartPosition = ((Long) pairO.first).intValue();
        long jLongValue = ((Long) pairO.second).longValue();
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
        ((n) Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
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

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return com.google.android.exoplayer2.extractor.wav.n.n(extractorInput);
    }
}
