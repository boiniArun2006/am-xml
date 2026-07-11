package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class H265Reader implements ElementaryStreamReader {
    private static final int AUD_NUT = 35;
    private static final int BLA_W_LP = 16;
    private static final int CRA_NUT = 21;
    private static final int PPS_NUT = 34;
    private static final int PREFIX_SEI_NUT = 39;
    private static final int RASL_R = 9;
    private static final int SPS_NUT = 33;
    private static final int SUFFIX_SEI_NUT = 40;
    private static final String TAG = "H265Reader";
    private static final int VPS_NUT = 32;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private j sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final Ml vps = new Ml(32, 128);
    private final Ml sps = new Ml(33, 128);
    private final Ml pps = new Ml(34, 128);
    private final Ml prefixSei = new Ml(39, 128);
    private final Ml suffixSei = new Ml(40, 128);
    private long pesTimeUs = -9223372036854775807L;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    private static final class j {
        private boolean J2;
        private boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f57893O;
        private boolean Uo;
        private boolean az;
        private long gh;
        private boolean mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TrackOutput f57894n;
        private int nr;
        private long qie;
        private long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f57895t;
        private boolean xMQ;

        private static boolean rl(int i2) {
            return (32 <= i2 && i2 <= 35) || i2 == 39;
        }

        private static boolean t(int i2) {
            return i2 < 32 || i2 == 40;
        }

        public void J2() {
            this.J2 = false;
            this.Uo = false;
            this.KN = false;
            this.xMQ = false;
            this.mUb = false;
        }

        public void Uo(long j2, int i2, int i3, long j3, boolean z2) {
            this.Uo = false;
            this.KN = false;
            this.f57893O = j3;
            this.nr = 0;
            this.rl = j2;
            if (!t(i3)) {
                if (this.xMQ && !this.mUb) {
                    if (z2) {
                        nr(i2);
                    }
                    this.xMQ = false;
                }
                if (rl(i3)) {
                    this.KN = !this.mUb;
                    this.mUb = true;
                }
            }
            boolean z3 = i3 >= 16 && i3 <= 21;
            this.f57895t = z3;
            this.J2 = z3 || i3 <= 9;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void nr(int i2) {
            long j2 = this.qie;
            if (j2 == -9223372036854775807L) {
                return;
            }
            boolean z2 = this.az;
            this.f57894n.sampleMetadata(j2, z2 ? 1 : 0, (int) (this.rl - this.gh), i2, null);
        }

        public void O(byte[] bArr, int i2, int i3) {
            if (this.J2) {
                int i5 = this.nr;
                int i7 = (i2 + 2) - i5;
                if (i7 >= i3) {
                    this.nr = i5 + (i3 - i2);
                } else {
                    this.Uo = (bArr[i7] & ByteCompanionObject.MIN_VALUE) != 0;
                    this.J2 = false;
                }
            }
        }

        public void n(long j2, int i2, boolean z2) {
            if (this.mUb && this.Uo) {
                this.az = this.f57895t;
                this.mUb = false;
            } else if (this.KN || this.Uo) {
                if (z2 && this.xMQ) {
                    nr(i2 + ((int) (j2 - this.rl)));
                }
                this.gh = this.rl;
                this.qie = this.f57893O;
                this.az = this.f57895t;
                this.xMQ = true;
            }
        }

        public j(TrackOutput trackOutput) {
            this.f57894n = trackOutput;
        }
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i5 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i7 = 0; i7 < iMin; i7++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i2 == 3) {
                    i5 = 3;
                }
                i3 += i5;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    private void assertTracksCreated() {
        Assertions.checkStateNotNull(this.output);
        Util.castNonNull(this.sampleReader);
    }

    private void endNalUnit(long j2, int i2, int i3, long j3) {
        this.sampleReader.n(j2, i2, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.rl(i3);
            this.sps.rl(i3);
            this.pps.rl(i3);
            if (this.vps.t() && this.sps.t() && this.pps.t()) {
                this.output.format(parseMediaFormat(this.formatId, this.vps, this.sps, this.pps));
                this.hasOutputFormat = true;
            }
        }
        if (this.prefixSei.rl(i3)) {
            Ml ml = this.prefixSei;
            this.seiWrapper.reset(this.prefixSei.nr, NalUnitUtil.unescapeStream(ml.nr, ml.f57897O));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j3, this.seiWrapper);
        }
        if (this.suffixSei.rl(i3)) {
            Ml ml2 = this.suffixSei;
            this.seiWrapper.reset(this.suffixSei.nr, NalUnitUtil.unescapeStream(ml2.nr, ml2.f57897O));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j3, this.seiWrapper);
        }
    }

    private void nalUnitData(byte[] bArr, int i2, int i3) {
        this.sampleReader.O(bArr, i2, i3);
        if (!this.hasOutputFormat) {
            this.vps.n(bArr, i2, i3);
            this.sps.n(bArr, i2, i3);
            this.pps.n(bArr, i2, i3);
        }
        this.prefixSei.n(bArr, i2, i3);
        this.suffixSei.n(bArr, i2, i3);
    }

    private static Format parseMediaFormat(@Nullable String str, Ml ml, Ml ml2, Ml ml3) {
        int i2 = ml.f57897O;
        byte[] bArr = new byte[ml2.f57897O + i2 + ml3.f57897O];
        System.arraycopy(ml.nr, 0, bArr, 0, i2);
        System.arraycopy(ml2.nr, 0, bArr, ml.f57897O, ml2.f57897O);
        System.arraycopy(ml3.nr, 0, bArr, ml.f57897O + ml2.f57897O, ml3.f57897O);
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(ml2.nr, 0, ml2.f57897O);
        parsableNalUnitBitArray.skipBits(44);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        int bits2 = parsableNalUnitBitArray.readBits(2);
        boolean bit = parsableNalUnitBitArray.readBit();
        int bits3 = parsableNalUnitBitArray.readBits(5);
        int i3 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i5 |= 1 << i3;
            }
            i3++;
        }
        int i7 = i5;
        int[] iArr = new int[6];
        for (int i8 = 0; i8 < 6; i8++) {
            iArr[i8] = parsableNalUnitBitArray.readBits(8);
        }
        int bits4 = parsableNalUnitBitArray.readBits(8);
        int i9 = 0;
        for (int i10 = 0; i10 < bits; i10++) {
            if (parsableNalUnitBitArray.readBit()) {
                i9 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i9 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i9);
        if (bits > 0) {
            parsableNalUnitBitArray.skipBits((8 - bits) * 2);
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt2 -= ((unsignedExpGolombCodedInt == 1 || unsignedExpGolombCodedInt == 2) ? 2 : 1) * (unsignedExpGolombCodedInt4 + unsignedExpGolombCodedInt5);
            unsignedExpGolombCodedInt3 -= (unsignedExpGolombCodedInt == 1 ? 2 : 1) * (unsignedExpGolombCodedInt6 + unsignedExpGolombCodedInt7);
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i11 = parsableNalUnitBitArray.readBit() ? 0 : bits; i11 <= bits; i11++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            skipScalingList(parsableNalUnitBitArray);
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipShortTermRefPicSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            for (int i12 = 0; i12 < parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(); i12++) {
                parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt8 + 5);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f3 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits5 = parsableNalUnitBitArray.readBits(8);
                if (bits5 == 255) {
                    int bits6 = parsableNalUnitBitArray.readBits(16);
                    int bits7 = parsableNalUnitBitArray.readBits(16);
                    if (bits6 != 0 && bits7 != 0) {
                        f3 = bits6 / bits7;
                    }
                } else {
                    float[] fArr = NalUnitUtil.ASPECT_RATIO_IDC_VALUES;
                    if (bits5 < fArr.length) {
                        f3 = fArr[bits5];
                    } else {
                        Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits5);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(4);
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(24);
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                unsignedExpGolombCodedInt3 *= 2;
            }
        }
        return new Format.Builder().setId(str).setSampleMimeType("video/hevc").setCodecs(CodecSpecificDataUtil.buildHevcCodecString(bits2, bit, bits3, i7, iArr, bits4)).setWidth(unsignedExpGolombCodedInt2).setHeight(unsignedExpGolombCodedInt3).setPixelWidthHeightRatio(f3).setInitializationData(Collections.singletonList(bArr)).build();
    }

    private void startNalUnit(long j2, int i2, int i3, long j3) {
        this.sampleReader.Uo(j2, i2, i3, j3, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.O(i3);
            this.sps.O(i3);
            this.pps.O(i3);
        }
        this.prefixSei.O(i3);
        this.suffixSei.O(i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.pesTimeUs = -9223372036854775807L;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.vps.nr();
        this.sps.nr();
        this.pps.nr();
        this.prefixSei.nr();
        this.suffixSei.nr();
        j jVar = this.sampleReader;
        if (jVar != null) {
            jVar.J2();
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.seiReader = seiReader;
    }

    private static void skipShortTermRefPicSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        boolean bit = false;
        int i2 = 0;
        for (int i3 = 0; i3 < unsignedExpGolombCodedInt; i3++) {
            if (i3 != 0) {
                bit = parsableNalUnitBitArray.readBit();
            }
            if (bit) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i5 = 0; i5 <= i2; i5++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                    }
                }
            } else {
                int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int i7 = unsignedExpGolombCodedInt2 + unsignedExpGolombCodedInt3;
                for (int i8 = 0; i8 < unsignedExpGolombCodedInt2; i8++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                for (int i9 = 0; i9 < unsignedExpGolombCodedInt3; i9++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                i2 = i7;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i2;
        assertTracksCreated();
        while (parsableByteArray.bytesLeft() > 0) {
            int position = parsableByteArray.getPosition();
            int iLimit = parsableByteArray.limit();
            byte[] data = parsableByteArray.getData();
            this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
            while (position < iLimit) {
                int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
                if (iFindNalUnit == iLimit) {
                    nalUnitData(data, position, iLimit);
                    return;
                }
                int h265NalUnitType = NalUnitUtil.getH265NalUnitType(data, iFindNalUnit);
                int i3 = iFindNalUnit - position;
                if (i3 > 0) {
                    nalUnitData(data, position, iFindNalUnit);
                }
                int i5 = iLimit - iFindNalUnit;
                long j2 = this.totalBytesWritten - ((long) i5);
                if (i3 < 0) {
                    i2 = -i3;
                } else {
                    i2 = 0;
                }
                endNalUnit(j2, i5, i2, this.pesTimeUs);
                startNalUnit(j2, i5, h265NalUnitType, this.pesTimeUs);
                position = iFindNalUnit + 3;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = trackOutputTrack;
        this.sampleReader = new j(trackOutputTrack);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.pesTimeUs = j2;
        }
    }
}
