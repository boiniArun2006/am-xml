package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class H264Reader implements ElementaryStreamReader {
    private final boolean allowNonIdrKeyframes;
    private final boolean detectAccessUnits;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private boolean randomAccessIndicator;
    private n sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final Ml sps = new Ml(7, 128);
    private final Ml pps = new Ml(8, 128);
    private final Ml sei = new Ml(6, 128);
    private long pesTimeUs = -9223372036854775807L;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    private static final class n {
        private boolean HI;
        private long Ik;
        private final ParsableNalUnitBitArray J2;
        private int KN;
        private byte[] Uo;
        private j az;
        private long ck;
        private boolean gh;
        private long mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TrackOutput f57887n;
        private long qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f57888r;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f57889t;
        private j ty;
        private int xMQ;
        private final SparseArray nr = new SparseArray();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final SparseArray f57886O = new SparseArray();

        private static final class j {
            private int HI;
            private int J2;
            private boolean KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private int f57890O;
            private int Uo;
            private int az;
            private int ck;
            private boolean gh;
            private boolean mUb;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private boolean f57891n;
            private int nr;
            private int qie;
            private boolean rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private NalUnitUtil.SpsData f57892t;
            private int ty;
            private boolean xMQ;

            private j() {
            }

            public void rl() {
                this.rl = false;
                this.f57891n = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean t(j jVar) {
                int i2;
                int i3;
                int i5;
                boolean z2;
                if (!this.f57891n) {
                    return false;
                }
                if (!jVar.f57891n) {
                    return true;
                }
                NalUnitUtil.SpsData spsData = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(this.f57892t);
                NalUnitUtil.SpsData spsData2 = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(jVar.f57892t);
                return (this.J2 == jVar.J2 && this.Uo == jVar.Uo && this.KN == jVar.KN && (!this.xMQ || !jVar.xMQ || this.mUb == jVar.mUb) && (((i2 = this.nr) == (i3 = jVar.nr) || (i2 != 0 && i3 != 0)) && (((i5 = spsData.picOrderCountType) != 0 || spsData2.picOrderCountType != 0 || (this.az == jVar.az && this.ty == jVar.ty)) && ((i5 != 1 || spsData2.picOrderCountType != 1 || (this.HI == jVar.HI && this.ck == jVar.ck)) && (z2 = this.gh) == jVar.gh && (!z2 || this.qie == jVar.qie))))) ? false : true;
            }

            public void J2(int i2) {
                this.f57890O = i2;
                this.rl = true;
            }

            public void O(NalUnitUtil.SpsData spsData, int i2, int i3, int i5, int i7, boolean z2, boolean z3, boolean z4, boolean z5, int i8, int i9, int i10, int i11, int i12) {
                this.f57892t = spsData;
                this.nr = i2;
                this.f57890O = i3;
                this.J2 = i5;
                this.Uo = i7;
                this.KN = z2;
                this.xMQ = z3;
                this.mUb = z4;
                this.gh = z5;
                this.qie = i8;
                this.az = i9;
                this.ty = i10;
                this.HI = i11;
                this.ck = i12;
                this.f57891n = true;
                this.rl = true;
            }

            public boolean nr() {
                if (!this.rl) {
                    return false;
                }
                int i2 = this.f57890O;
                return i2 == 7 || i2 == 2;
            }
        }

        public void Uo() {
            this.gh = false;
            this.HI = false;
            this.ty.rl();
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
            long j2 = this.Ik;
            if (j2 == -9223372036854775807L) {
                return;
            }
            boolean z2 = this.f57888r;
            this.f57887n.sampleMetadata(j2, z2 ? 1 : 0, (int) (this.mUb - this.ck), i2, null);
        }

        public void J2(NalUnitUtil.SpsData spsData) {
            this.nr.append(spsData.seqParameterSetId, spsData);
        }

        public void KN(long j2, int i2, long j3) {
            this.xMQ = i2;
            this.qie = j3;
            this.mUb = j2;
            if (!this.rl || i2 != 1) {
                if (!this.f57889t) {
                    return;
                }
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            j jVar = this.az;
            this.az = this.ty;
            this.ty = jVar;
            jVar.rl();
            this.KN = 0;
            this.gh = true;
        }

        public void O(NalUnitUtil.PpsData ppsData) {
            this.f57886O.append(ppsData.picParameterSetId, ppsData);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void n(byte[] bArr, int i2, int i3) {
            boolean z2;
            boolean z3;
            boolean bit;
            boolean z4;
            int unsignedExpGolombCodedInt;
            int i5;
            int i7;
            int signedExpGolombCodedInt;
            int i8;
            int signedExpGolombCodedInt2;
            if (this.gh) {
                int i9 = i3 - i2;
                byte[] bArr2 = this.Uo;
                int length = bArr2.length;
                int i10 = this.KN;
                if (length < i10 + i9) {
                    this.Uo = Arrays.copyOf(bArr2, (i10 + i9) * 2);
                }
                System.arraycopy(bArr, i2, this.Uo, this.KN, i9);
                int i11 = this.KN + i9;
                this.KN = i11;
                this.J2.reset(this.Uo, 0, i11);
                if (this.J2.canReadBits(8)) {
                    this.J2.skipBit();
                    int bits = this.J2.readBits(2);
                    this.J2.skipBits(5);
                    if (this.J2.canReadExpGolombCodedNum()) {
                        this.J2.readUnsignedExpGolombCodedInt();
                        if (this.J2.canReadExpGolombCodedNum()) {
                            int unsignedExpGolombCodedInt2 = this.J2.readUnsignedExpGolombCodedInt();
                            if (!this.f57889t) {
                                this.gh = false;
                                this.ty.J2(unsignedExpGolombCodedInt2);
                                return;
                            }
                            if (this.J2.canReadExpGolombCodedNum()) {
                                int unsignedExpGolombCodedInt3 = this.J2.readUnsignedExpGolombCodedInt();
                                if (this.f57886O.indexOfKey(unsignedExpGolombCodedInt3) < 0) {
                                    this.gh = false;
                                    return;
                                }
                                NalUnitUtil.PpsData ppsData = (NalUnitUtil.PpsData) this.f57886O.get(unsignedExpGolombCodedInt3);
                                NalUnitUtil.SpsData spsData = (NalUnitUtil.SpsData) this.nr.get(ppsData.seqParameterSetId);
                                if (spsData.separateColorPlaneFlag) {
                                    if (!this.J2.canReadBits(2)) {
                                        return;
                                    } else {
                                        this.J2.skipBits(2);
                                    }
                                }
                                if (this.J2.canReadBits(spsData.frameNumLength)) {
                                    int bits2 = this.J2.readBits(spsData.frameNumLength);
                                    if (spsData.frameMbsOnlyFlag) {
                                        z2 = false;
                                        z3 = false;
                                    } else {
                                        if (!this.J2.canReadBits(1)) {
                                            return;
                                        }
                                        boolean bit2 = this.J2.readBit();
                                        if (bit2) {
                                            if (this.J2.canReadBits(1)) {
                                                z2 = bit2;
                                                z3 = true;
                                                bit = this.J2.readBit();
                                                z4 = this.xMQ != 5;
                                                if (z4) {
                                                    unsignedExpGolombCodedInt = 0;
                                                } else if (!this.J2.canReadExpGolombCodedNum()) {
                                                    return;
                                                } else {
                                                    unsignedExpGolombCodedInt = this.J2.readUnsignedExpGolombCodedInt();
                                                }
                                                i5 = spsData.picOrderCountType;
                                                if (i5 != 0) {
                                                    if (!this.J2.canReadBits(spsData.picOrderCntLsbLength)) {
                                                        return;
                                                    }
                                                    int bits3 = this.J2.readBits(spsData.picOrderCntLsbLength);
                                                    if (ppsData.bottomFieldPicOrderInFramePresentFlag && !z2) {
                                                        if (this.J2.canReadExpGolombCodedNum()) {
                                                            signedExpGolombCodedInt = this.J2.readSignedExpGolombCodedInt();
                                                            i7 = bits3;
                                                            i8 = 0;
                                                            signedExpGolombCodedInt2 = i8;
                                                            this.ty.O(spsData, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z2, z3, bit, z4, unsignedExpGolombCodedInt, i7, signedExpGolombCodedInt, i8, signedExpGolombCodedInt2);
                                                            this.gh = false;
                                                        }
                                                        return;
                                                    }
                                                    i7 = bits3;
                                                    signedExpGolombCodedInt = 0;
                                                } else {
                                                    if (i5 == 1 && !spsData.deltaPicOrderAlwaysZeroFlag) {
                                                        if (this.J2.canReadExpGolombCodedNum()) {
                                                            int signedExpGolombCodedInt3 = this.J2.readSignedExpGolombCodedInt();
                                                            if (!ppsData.bottomFieldPicOrderInFramePresentFlag || z2) {
                                                                i8 = signedExpGolombCodedInt3;
                                                                i7 = 0;
                                                                signedExpGolombCodedInt = 0;
                                                                signedExpGolombCodedInt2 = 0;
                                                            } else {
                                                                if (!this.J2.canReadExpGolombCodedNum()) {
                                                                    return;
                                                                }
                                                                signedExpGolombCodedInt2 = this.J2.readSignedExpGolombCodedInt();
                                                                i8 = signedExpGolombCodedInt3;
                                                                i7 = 0;
                                                                signedExpGolombCodedInt = 0;
                                                            }
                                                            this.ty.O(spsData, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z2, z3, bit, z4, unsignedExpGolombCodedInt, i7, signedExpGolombCodedInt, i8, signedExpGolombCodedInt2);
                                                            this.gh = false;
                                                        }
                                                        return;
                                                    }
                                                    i7 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                }
                                                i8 = signedExpGolombCodedInt;
                                                signedExpGolombCodedInt2 = i8;
                                                this.ty.O(spsData, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z2, z3, bit, z4, unsignedExpGolombCodedInt, i7, signedExpGolombCodedInt, i8, signedExpGolombCodedInt2);
                                                this.gh = false;
                                            }
                                            return;
                                        }
                                        z2 = bit2;
                                        z3 = false;
                                    }
                                    bit = z3;
                                    if (this.xMQ != 5) {
                                    }
                                    if (z4) {
                                    }
                                    i5 = spsData.picOrderCountType;
                                    if (i5 != 0) {
                                    }
                                    i8 = signedExpGolombCodedInt;
                                    signedExpGolombCodedInt2 = i8;
                                    this.ty.O(spsData, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z2, z3, bit, z4, unsignedExpGolombCodedInt, i7, signedExpGolombCodedInt, i8, signedExpGolombCodedInt2);
                                    this.gh = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean rl(long j2, int i2, boolean z2, boolean z3) {
            boolean z4 = false;
            if (this.xMQ == 9 || (this.f57889t && this.ty.t(this.az))) {
                if (z2 && this.HI) {
                    nr(i2 + ((int) (j2 - this.mUb)));
                }
                this.ck = this.mUb;
                this.Ik = this.qie;
                this.f57888r = false;
                this.HI = true;
            }
            if (this.rl) {
                z3 = this.ty.nr();
            }
            boolean z5 = this.f57888r;
            int i3 = this.xMQ;
            if (i3 == 5 || (z3 && i3 == 1)) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            this.f57888r = z6;
            return z6;
        }

        public boolean t() {
            return this.f57889t;
        }

        public n(TrackOutput trackOutput, boolean z2, boolean z3) {
            this.f57887n = trackOutput;
            this.rl = z2;
            this.f57889t = z3;
            this.az = new j();
            this.ty = new j();
            byte[] bArr = new byte[128];
            this.Uo = bArr;
            this.J2 = new ParsableNalUnitBitArray(bArr, 0, 0);
            Uo();
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
        if (!this.hasOutputFormat || this.sampleReader.t()) {
            this.sps.rl(i3);
            this.pps.rl(i3);
            if (this.hasOutputFormat) {
                if (this.sps.t()) {
                    Ml ml = this.sps;
                    this.sampleReader.J2(NalUnitUtil.parseSpsNalUnit(ml.nr, 3, ml.f57897O));
                    this.sps.nr();
                } else if (this.pps.t()) {
                    Ml ml2 = this.pps;
                    this.sampleReader.O(NalUnitUtil.parsePpsNalUnit(ml2.nr, 3, ml2.f57897O));
                    this.pps.nr();
                }
            } else if (this.sps.t() && this.pps.t()) {
                ArrayList arrayList = new ArrayList();
                Ml ml3 = this.sps;
                arrayList.add(Arrays.copyOf(ml3.nr, ml3.f57897O));
                Ml ml4 = this.pps;
                arrayList.add(Arrays.copyOf(ml4.nr, ml4.f57897O));
                Ml ml5 = this.sps;
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(ml5.nr, 3, ml5.f57897O);
                Ml ml6 = this.pps;
                NalUnitUtil.PpsData ppsNalUnit = NalUnitUtil.parsePpsNalUnit(ml6.nr, 3, ml6.f57897O);
                this.output.format(new Format.Builder().setId(this.formatId).setSampleMimeType("video/avc").setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc)).setWidth(spsNalUnit.width).setHeight(spsNalUnit.height).setPixelWidthHeightRatio(spsNalUnit.pixelWidthHeightRatio).setInitializationData(arrayList).build());
                this.hasOutputFormat = true;
                this.sampleReader.J2(spsNalUnit);
                this.sampleReader.O(ppsNalUnit);
                this.sps.nr();
                this.pps.nr();
            }
        }
        if (this.sei.rl(i3)) {
            Ml ml7 = this.sei;
            this.seiWrapper.reset(this.sei.nr, NalUnitUtil.unescapeStream(ml7.nr, ml7.f57897O));
            this.seiWrapper.setPosition(4);
            this.seiReader.consume(j3, this.seiWrapper);
        }
        if (this.sampleReader.rl(j2, i2, this.hasOutputFormat, this.randomAccessIndicator)) {
            this.randomAccessIndicator = false;
        }
    }

    private void nalUnitData(byte[] bArr, int i2, int i3) {
        if (!this.hasOutputFormat || this.sampleReader.t()) {
            this.sps.n(bArr, i2, i3);
            this.pps.n(bArr, i2, i3);
        }
        this.sei.n(bArr, i2, i3);
        this.sampleReader.n(bArr, i2, i3);
    }

    private void startNalUnit(long j2, int i2, long j3) {
        if (!this.hasOutputFormat || this.sampleReader.t()) {
            this.sps.O(i2);
            this.pps.O(i2);
        }
        this.sei.O(i2);
        this.sampleReader.KN(j2, i2, j3);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.randomAccessIndicator = false;
        this.pesTimeUs = -9223372036854775807L;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.sps.nr();
        this.pps.nr();
        this.sei.nr();
        n nVar = this.sampleReader;
        if (nVar != null) {
            nVar.Uo();
        }
    }

    public H264Reader(SeiReader seiReader, boolean z2, boolean z3) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z2;
        this.detectAccessUnits = z3;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i2;
        assertTracksCreated();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                nalUnitData(data, position, iLimit);
                return;
            }
            int nalUnitType = NalUnitUtil.getNalUnitType(data, iFindNalUnit);
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
            startNalUnit(j2, nalUnitType, this.pesTimeUs);
            position = iFindNalUnit + 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = trackOutputTrack;
        this.sampleReader = new n(trackOutputTrack, this.allowNonIdrKeyframes, this.detectAccessUnits);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        boolean z2;
        if (j2 != -9223372036854775807L) {
            this.pesTimeUs = j2;
        }
        boolean z3 = this.randomAccessIndicator;
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.randomAccessIndicator = z3 | z2;
    }
}
