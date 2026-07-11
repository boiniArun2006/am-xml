package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ParsableNalUnitBitArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public final class H264Reader implements ElementaryStreamReader {
    private final boolean allowNonIdrKeyframes;
    private final String containerMimeType;
    private final boolean detectAccessUnits;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private boolean randomAccessIndicator;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8, 128);
    private final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6, 128);
    private long pesTimeUs = -9223372036854775807L;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    private static final class SampleReader {
        private static final int DEFAULT_BUFFER_SIZE = 128;
        private final boolean allowNonIdrKeyframes;
        private final ParsableNalUnitBitArray bitArray;
        private byte[] buffer;
        private int bufferLength;
        private final boolean detectAccessUnits;
        private boolean isFilling;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private int nalUnitType;
        private final TrackOutput output;
        private SliceHeaderData previousSliceHeader;
        private boolean randomAccessIndicator;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private SliceHeaderData sliceHeader;
        private final SparseArray<NalUnitUtil.SpsData> sps = new SparseArray<>();
        private final SparseArray<NalUnitUtil.PpsData> pps = new SparseArray<>();

        private static final class SliceHeaderData {
            private static final int SLICE_TYPE_ALL_I = 7;
            private static final int SLICE_TYPE_I = 2;
            private boolean bottomFieldFlag;
            private boolean bottomFieldFlagPresent;
            private int deltaPicOrderCnt0;
            private int deltaPicOrderCnt1;
            private int deltaPicOrderCntBottom;
            private boolean fieldPicFlag;
            private int frameNum;
            private boolean hasSliceType;
            private boolean idrPicFlag;
            private int idrPicId;
            private boolean isComplete;
            private int nalRefIdc;
            private int picOrderCntLsb;
            private int picParameterSetId;
            private int sliceType;

            @Nullable
            private NalUnitUtil.SpsData spsData;

            private SliceHeaderData() {
            }

            public void clear() {
                this.hasSliceType = false;
                this.isComplete = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(SliceHeaderData sliceHeaderData) {
                int i2;
                int i3;
                int i5;
                boolean z2;
                if (!this.isComplete) {
                    return false;
                }
                if (!sliceHeaderData.isComplete) {
                    return true;
                }
                NalUnitUtil.SpsData spsData = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(this.spsData);
                NalUnitUtil.SpsData spsData2 = (NalUnitUtil.SpsData) Assertions.checkStateNotNull(sliceHeaderData.spsData);
                return (this.frameNum == sliceHeaderData.frameNum && this.picParameterSetId == sliceHeaderData.picParameterSetId && this.fieldPicFlag == sliceHeaderData.fieldPicFlag && (!this.bottomFieldFlagPresent || !sliceHeaderData.bottomFieldFlagPresent || this.bottomFieldFlag == sliceHeaderData.bottomFieldFlag) && (((i2 = this.nalRefIdc) == (i3 = sliceHeaderData.nalRefIdc) || (i2 != 0 && i3 != 0)) && (((i5 = spsData.picOrderCountType) != 0 || spsData2.picOrderCountType != 0 || (this.picOrderCntLsb == sliceHeaderData.picOrderCntLsb && this.deltaPicOrderCntBottom == sliceHeaderData.deltaPicOrderCntBottom)) && ((i5 != 1 || spsData2.picOrderCountType != 1 || (this.deltaPicOrderCnt0 == sliceHeaderData.deltaPicOrderCnt0 && this.deltaPicOrderCnt1 == sliceHeaderData.deltaPicOrderCnt1)) && (z2 = this.idrPicFlag) == sliceHeaderData.idrPicFlag && (!z2 || this.idrPicId == sliceHeaderData.idrPicId))))) ? false : true;
            }

            public boolean isISlice() {
                if (!this.hasSliceType) {
                    return false;
                }
                int i2 = this.sliceType;
                return i2 == 7 || i2 == 2;
            }

            public void setAll(NalUnitUtil.SpsData spsData, int i2, int i3, int i5, int i7, boolean z2, boolean z3, boolean z4, boolean z5, int i8, int i9, int i10, int i11, int i12) {
                this.spsData = spsData;
                this.nalRefIdc = i2;
                this.sliceType = i3;
                this.frameNum = i5;
                this.picParameterSetId = i7;
                this.fieldPicFlag = z2;
                this.bottomFieldFlagPresent = z3;
                this.bottomFieldFlag = z4;
                this.idrPicFlag = z5;
                this.idrPicId = i8;
                this.picOrderCntLsb = i9;
                this.deltaPicOrderCntBottom = i10;
                this.deltaPicOrderCnt0 = i11;
                this.deltaPicOrderCnt1 = i12;
                this.isComplete = true;
                this.hasSliceType = true;
            }

            public void setSliceType(int i2) {
                this.sliceType = i2;
                this.hasSliceType = true;
            }
        }

        public void reset() {
            this.isFilling = false;
            this.readingSample = false;
            this.sliceHeader.clear();
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
        private void outputSample(int i2) {
            long j2 = this.sampleTimeUs;
            if (j2 != -9223372036854775807L) {
                long j3 = this.nalUnitStartPosition;
                long j4 = this.samplePosition;
                if (j3 == j4) {
                    return;
                }
                int i3 = (int) (j3 - j4);
                this.output.sampleMetadata(j2, this.sampleIsKeyframe ? 1 : 0, i3, i2, null);
            }
        }

        private void setSampleIsKeyframe() {
            boolean zIsISlice = this.allowNonIdrKeyframes ? this.sliceHeader.isISlice() : this.randomAccessIndicator;
            boolean z2 = this.sampleIsKeyframe;
            int i2 = this.nalUnitType;
            boolean z3 = true;
            if (i2 != 5 && (!zIsISlice || i2 != 1)) {
                z3 = false;
            }
            this.sampleIsKeyframe = z2 | z3;
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
        public void appendToNalUnit(byte[] bArr, int i2, int i3) {
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
            if (this.isFilling) {
                int i9 = i3 - i2;
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i10 = this.bufferLength;
                if (length < i10 + i9) {
                    this.buffer = Arrays.copyOf(bArr2, (i10 + i9) * 2);
                }
                System.arraycopy(bArr, i2, this.buffer, this.bufferLength, i9);
                int i11 = this.bufferLength + i9;
                this.bufferLength = i11;
                this.bitArray.reset(this.buffer, 0, i11);
                if (this.bitArray.canReadBits(8)) {
                    this.bitArray.skipBit();
                    int bits = this.bitArray.readBits(2);
                    this.bitArray.skipBits(5);
                    if (this.bitArray.canReadExpGolombCodedNum()) {
                        this.bitArray.readUnsignedExpGolombCodedInt();
                        if (this.bitArray.canReadExpGolombCodedNum()) {
                            int unsignedExpGolombCodedInt2 = this.bitArray.readUnsignedExpGolombCodedInt();
                            if (!this.detectAccessUnits) {
                                this.isFilling = false;
                                this.sliceHeader.setSliceType(unsignedExpGolombCodedInt2);
                                return;
                            }
                            if (this.bitArray.canReadExpGolombCodedNum()) {
                                int unsignedExpGolombCodedInt3 = this.bitArray.readUnsignedExpGolombCodedInt();
                                if (this.pps.indexOfKey(unsignedExpGolombCodedInt3) < 0) {
                                    this.isFilling = false;
                                    return;
                                }
                                NalUnitUtil.PpsData ppsData = this.pps.get(unsignedExpGolombCodedInt3);
                                NalUnitUtil.SpsData spsData = this.sps.get(ppsData.seqParameterSetId);
                                if (spsData.separateColorPlaneFlag) {
                                    if (!this.bitArray.canReadBits(2)) {
                                        return;
                                    } else {
                                        this.bitArray.skipBits(2);
                                    }
                                }
                                if (this.bitArray.canReadBits(spsData.frameNumLength)) {
                                    int bits2 = this.bitArray.readBits(spsData.frameNumLength);
                                    if (spsData.frameMbsOnlyFlag) {
                                        z2 = false;
                                        z3 = false;
                                    } else {
                                        if (!this.bitArray.canReadBits(1)) {
                                            return;
                                        }
                                        boolean bit2 = this.bitArray.readBit();
                                        if (bit2) {
                                            if (this.bitArray.canReadBits(1)) {
                                                z2 = bit2;
                                                z3 = true;
                                                bit = this.bitArray.readBit();
                                                z4 = this.nalUnitType != 5;
                                                if (z4) {
                                                    unsignedExpGolombCodedInt = 0;
                                                } else if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                    return;
                                                } else {
                                                    unsignedExpGolombCodedInt = this.bitArray.readUnsignedExpGolombCodedInt();
                                                }
                                                i5 = spsData.picOrderCountType;
                                                if (i5 != 0) {
                                                    if (!this.bitArray.canReadBits(spsData.picOrderCntLsbLength)) {
                                                        return;
                                                    }
                                                    int bits3 = this.bitArray.readBits(spsData.picOrderCntLsbLength);
                                                    if (ppsData.bottomFieldPicOrderInFramePresentFlag && !z2) {
                                                        if (this.bitArray.canReadExpGolombCodedNum()) {
                                                            signedExpGolombCodedInt = this.bitArray.readSignedExpGolombCodedInt();
                                                            i7 = bits3;
                                                            i8 = 0;
                                                            signedExpGolombCodedInt2 = i8;
                                                            this.sliceHeader.setAll(spsData, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z2, z3, bit, z4, unsignedExpGolombCodedInt, i7, signedExpGolombCodedInt, i8, signedExpGolombCodedInt2);
                                                            this.isFilling = false;
                                                        }
                                                        return;
                                                    }
                                                    i7 = bits3;
                                                    signedExpGolombCodedInt = 0;
                                                } else {
                                                    if (i5 == 1 && !spsData.deltaPicOrderAlwaysZeroFlag) {
                                                        if (this.bitArray.canReadExpGolombCodedNum()) {
                                                            int signedExpGolombCodedInt3 = this.bitArray.readSignedExpGolombCodedInt();
                                                            if (!ppsData.bottomFieldPicOrderInFramePresentFlag || z2) {
                                                                i8 = signedExpGolombCodedInt3;
                                                                i7 = 0;
                                                                signedExpGolombCodedInt = 0;
                                                                signedExpGolombCodedInt2 = 0;
                                                            } else {
                                                                if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                                    return;
                                                                }
                                                                signedExpGolombCodedInt2 = this.bitArray.readSignedExpGolombCodedInt();
                                                                i8 = signedExpGolombCodedInt3;
                                                                i7 = 0;
                                                                signedExpGolombCodedInt = 0;
                                                            }
                                                            this.sliceHeader.setAll(spsData, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z2, z3, bit, z4, unsignedExpGolombCodedInt, i7, signedExpGolombCodedInt, i8, signedExpGolombCodedInt2);
                                                            this.isFilling = false;
                                                        }
                                                        return;
                                                    }
                                                    i7 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                }
                                                i8 = signedExpGolombCodedInt;
                                                signedExpGolombCodedInt2 = i8;
                                                this.sliceHeader.setAll(spsData, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z2, z3, bit, z4, unsignedExpGolombCodedInt, i7, signedExpGolombCodedInt, i8, signedExpGolombCodedInt2);
                                                this.isFilling = false;
                                            }
                                            return;
                                        }
                                        z2 = bit2;
                                        z3 = false;
                                    }
                                    bit = z3;
                                    if (this.nalUnitType != 5) {
                                    }
                                    if (z4) {
                                    }
                                    i5 = spsData.picOrderCountType;
                                    if (i5 != 0) {
                                    }
                                    i8 = signedExpGolombCodedInt;
                                    signedExpGolombCodedInt2 = i8;
                                    this.sliceHeader.setAll(spsData, bits, unsignedExpGolombCodedInt2, bits2, unsignedExpGolombCodedInt3, z2, z3, bit, z4, unsignedExpGolombCodedInt, i7, signedExpGolombCodedInt, i8, signedExpGolombCodedInt2);
                                    this.isFilling = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean endNalUnit(long j2, int i2, boolean z2) {
            if (this.nalUnitType == 9 || (this.detectAccessUnits && this.sliceHeader.isFirstVclNalUnitOfPicture(this.previousSliceHeader))) {
                if (z2 && this.readingSample) {
                    outputSample(i2 + ((int) (j2 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = false;
                this.readingSample = true;
            }
            setSampleIsKeyframe();
            this.nalUnitType = 24;
            return this.sampleIsKeyframe;
        }

        public boolean needsSpsPps() {
            return this.detectAccessUnits;
        }

        public void putPps(NalUnitUtil.PpsData ppsData) {
            this.pps.append(ppsData.picParameterSetId, ppsData);
        }

        public void putSps(NalUnitUtil.SpsData spsData) {
            this.sps.append(spsData.seqParameterSetId, spsData);
        }

        public void startNalUnit(long j2, int i2, long j3, boolean z2) {
            this.nalUnitType = i2;
            this.nalUnitTimeUs = j3;
            this.nalUnitStartPosition = j2;
            this.randomAccessIndicator = z2;
            if (!this.allowNonIdrKeyframes || i2 != 1) {
                if (!this.detectAccessUnits) {
                    return;
                }
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            SliceHeaderData sliceHeaderData = this.previousSliceHeader;
            this.previousSliceHeader = this.sliceHeader;
            this.sliceHeader = sliceHeaderData;
            sliceHeaderData.clear();
            this.bufferLength = 0;
            this.isFilling = true;
        }

        public SampleReader(TrackOutput trackOutput, boolean z2, boolean z3) {
            this.output = trackOutput;
            this.allowNonIdrKeyframes = z2;
            this.detectAccessUnits = z3;
            this.previousSliceHeader = new SliceHeaderData();
            this.sliceHeader = new SliceHeaderData();
            byte[] bArr = new byte[128];
            this.buffer = bArr;
            this.bitArray = new ParsableNalUnitBitArray(bArr, 0, 0);
            reset();
        }
    }

    private void assertTracksCreated() {
        Assertions.checkStateNotNull(this.output);
        Util.castNonNull(this.sampleReader);
    }

    private void endNalUnit(long j2, int i2, int i3, long j3) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.endNalUnit(i3);
            this.pps.endNalUnit(i3);
            if (this.hasOutputFormat) {
                if (this.sps.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer = this.sps;
                    NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer.nalData, 3, nalUnitTargetBuffer.nalLength);
                    this.seiReader.setReorderingQueueSize(spsNalUnit.maxNumReorderFrames);
                    this.sampleReader.putSps(spsNalUnit);
                    this.sps.reset();
                } else if (this.pps.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.pps;
                    this.sampleReader.putPps(NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength));
                    this.pps.reset();
                }
            } else if (this.sps.isCompleted() && this.pps.isCompleted()) {
                ArrayList arrayList = new ArrayList();
                NalUnitTargetBuffer nalUnitTargetBuffer3 = this.sps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer3.nalData, nalUnitTargetBuffer3.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer4 = this.pps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer4.nalData, nalUnitTargetBuffer4.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer5 = this.sps;
                NalUnitUtil.SpsData spsNalUnit2 = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer5.nalData, 3, nalUnitTargetBuffer5.nalLength);
                NalUnitTargetBuffer nalUnitTargetBuffer6 = this.pps;
                NalUnitUtil.PpsData ppsNalUnit = NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer6.nalData, 3, nalUnitTargetBuffer6.nalLength);
                this.output.format(new Format.Builder().setId(this.formatId).setContainerMimeType(this.containerMimeType).setSampleMimeType("video/avc").setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit2.profileIdc, spsNalUnit2.constraintsFlagsAndReservedZero2Bits, spsNalUnit2.levelIdc)).setWidth(spsNalUnit2.width).setHeight(spsNalUnit2.height).setColorInfo(new ColorInfo.Builder().setColorSpace(spsNalUnit2.colorSpace).setColorRange(spsNalUnit2.colorRange).setColorTransfer(spsNalUnit2.colorTransfer).setLumaBitdepth(spsNalUnit2.bitDepthLumaMinus8 + 8).setChromaBitdepth(spsNalUnit2.bitDepthChromaMinus8 + 8).build()).setPixelWidthHeightRatio(spsNalUnit2.pixelWidthHeightRatio).setInitializationData(arrayList).setMaxNumReorderSamples(spsNalUnit2.maxNumReorderFrames).build());
                this.hasOutputFormat = true;
                this.seiReader.setReorderingQueueSize(spsNalUnit2.maxNumReorderFrames);
                this.sampleReader.putSps(spsNalUnit2);
                this.sampleReader.putPps(ppsNalUnit);
                this.sps.reset();
                this.pps.reset();
            }
        }
        if (this.sei.endNalUnit(i3)) {
            NalUnitTargetBuffer nalUnitTargetBuffer7 = this.sei;
            this.seiWrapper.reset(this.sei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer7.nalData, nalUnitTargetBuffer7.nalLength));
            this.seiWrapper.setPosition(4);
            this.seiReader.consume(j3, this.seiWrapper);
        }
        if (this.sampleReader.endNalUnit(j2, i2, this.hasOutputFormat)) {
            this.randomAccessIndicator = false;
        }
    }

    private void nalUnitData(byte[] bArr, int i2, int i3) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.appendToNalUnit(bArr, i2, i3);
            this.pps.appendToNalUnit(bArr, i2, i3);
        }
        this.sei.appendToNalUnit(bArr, i2, i3);
        this.sampleReader.appendToNalUnit(bArr, i2, i3);
    }

    private void startNalUnit(long j2, int i2, long j3) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.startNalUnit(i2);
            this.pps.startNalUnit(i2);
        }
        this.sei.startNalUnit(i2);
        this.sampleReader.startNalUnit(j2, i2, j3, this.randomAccessIndicator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        this.pesTimeUs = j2;
        this.randomAccessIndicator |= (i2 & 2) != 0;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.randomAccessIndicator = false;
        this.pesTimeUs = -9223372036854775807L;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.sps.reset();
        this.pps.reset();
        this.sei.reset();
        this.seiReader.clear();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }

    public H264Reader(SeiReader seiReader, boolean z2, boolean z3, String str) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z2;
        this.detectAccessUnits = z3;
        this.containerMimeType = str;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i2;
        int i3;
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
            if (iFindNalUnit > 0 && data[iFindNalUnit - 1] == 0) {
                iFindNalUnit--;
                i2 = 4;
            } else {
                i2 = 3;
            }
            int i5 = iFindNalUnit;
            int i7 = i2;
            int i8 = i5 - position;
            if (i8 > 0) {
                nalUnitData(data, position, i5);
            }
            int i9 = iLimit - i5;
            long j2 = this.totalBytesWritten - ((long) i9);
            if (i8 < 0) {
                i3 = -i8;
            } else {
                i3 = 0;
            }
            endNalUnit(j2, i9, i3, this.pesTimeUs);
            startNalUnit(j2, nalUnitType, this.pesTimeUs);
            position = i5 + i7;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = trackOutputTrack;
        this.sampleReader = new SampleReader(trackOutputTrack, this.allowNonIdrKeyframes, this.detectAccessUnits);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z2) {
        assertTracksCreated();
        if (z2) {
            this.seiReader.flush();
            endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
            startNalUnit(this.totalBytesWritten, 9, this.pesTimeUs);
            endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
        }
    }
}
