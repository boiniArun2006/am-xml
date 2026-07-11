package androidx.media3.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final String containerMimeType;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;

    @Nullable
    private final NalUnitTargetBuffer userData;

    @Nullable
    private final ParsableByteArray userDataParsable;

    @Nullable
    private final UserDataReader userDataReader;

    private static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }

        public void onData(byte[] bArr, int i2, int i3) {
            if (this.isFilling) {
                int i5 = i3 - i2;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i7 = this.length;
                if (length < i7 + i5) {
                    this.data = Arrays.copyOf(bArr2, (i7 + i5) * 2);
                }
                System.arraycopy(bArr, i2, this.data, this.length, i5);
                this.length += i5;
            }
        }

        public boolean onStartCode(int i2, int i3) {
            if (this.isFilling) {
                int i5 = this.length - i3;
                this.length = i5;
                if (this.sequenceExtensionPosition != 0 || i2 != H262Reader.START_EXTENSION) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i5;
            } else if (i2 == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public CsdBuffer(int i2) {
            this.data = new byte[i2];
        }
    }

    public H262Reader(String str) {
        this(null, str);
    }

    H262Reader(@Nullable UserDataReader userDataReader, String str) {
        this.userDataReader = userDataReader;
        this.containerMimeType = str;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(START_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str, String str2) {
        float f3;
        int i2;
        float f4;
        int i3;
        long j2;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i5 = bArrCopyOf[4] & UByte.MAX_VALUE;
        byte b2 = bArrCopyOf[5];
        int i7 = (i5 << 4) | ((b2 & UByte.MAX_VALUE) >> 4);
        int i8 = ((b2 & 15) << 8) | (bArrCopyOf[6] & UByte.MAX_VALUE);
        int i9 = (bArrCopyOf[7] & 240) >> 4;
        if (i9 == 2) {
            f3 = i8 * 4;
            i2 = i7 * 3;
        } else if (i9 == 3) {
            f3 = i8 * 16;
            i2 = i7 * 9;
        } else {
            if (i9 != 4) {
                f4 = 1.0f;
                Format formatBuild = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType("video/mpeg2").setWidth(i7).setHeight(i8).setPixelWidthHeightRatio(f4).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                i3 = (bArrCopyOf[7] & 15) - 1;
                if (i3 < 0) {
                    double[] dArr = FRAME_RATE_VALUES;
                    if (i3 < dArr.length) {
                        double d2 = dArr[i3];
                        byte b4 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        int i10 = (b4 & 96) >> 5;
                        int i11 = b4 & 31;
                        if (i10 != i11) {
                            d2 *= (((double) i10) + 1.0d) / ((double) (i11 + 1));
                        }
                        j2 = (long) (1000000.0d / d2);
                    } else {
                        j2 = 0;
                    }
                }
                return Pair.create(formatBuild, Long.valueOf(j2));
            }
            f3 = i8 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            i2 = i7 * 100;
        }
        f4 = f3 / i2;
        Format formatBuild2 = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType("video/mpeg2").setWidth(i7).setHeight(i8).setPixelWidthHeightRatio(f4).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        i3 = (bArrCopyOf[7] & 15) - 1;
        if (i3 < 0) {
        }
        return Pair.create(formatBuild2, Long.valueOf(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
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
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void consume(ParsableByteArray parsableByteArray) {
        int i2;
        long j2;
        boolean z2;
        int i3;
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i5 = iFindNalUnit + 3;
            int i7 = parsableByteArray.getData()[i5] & UByte.MAX_VALUE;
            int i8 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i8 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i7, i8 < 0 ? -i8 : 0)) {
                    Pair<Format, Long> csdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId), this.containerMimeType);
                    this.output.format((Format) csdBuffer.first);
                    this.frameDurationUs = ((Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i8 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                    i3 = 0;
                } else {
                    i3 = -i8;
                }
                if (this.userData.endNalUnit(i3)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i7 == START_USER_DATA && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i7);
                }
            }
            if (i7 == 0 || i7 == START_SEQUENCE_HEADER) {
                int i9 = iLimit - iFindNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j3 = this.sampleTimeUs;
                    if (j3 != -9223372036854775807L) {
                        i2 = iLimit;
                        this.output.sampleMetadata(j3, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i9, i9, null);
                    }
                    if (this.startedFirstSample) {
                        this.samplePosition = this.totalBytesWritten - ((long) i9);
                        j2 = this.pesTimeUs;
                        if (j2 == -9223372036854775807L) {
                        }
                        this.sampleTimeUs = j2;
                        this.sampleIsKeyframe = false;
                        this.pesTimeUs = -9223372036854775807L;
                        z2 = true;
                        this.startedFirstSample = true;
                        this.sampleHasPicture = i7 == 0 ? z2 : false;
                    }
                } else {
                    i2 = iLimit;
                    if (this.startedFirstSample || this.sampleHasPicture) {
                        this.samplePosition = this.totalBytesWritten - ((long) i9);
                        j2 = this.pesTimeUs;
                        if (j2 == -9223372036854775807L) {
                            long j4 = this.sampleTimeUs;
                            j2 = j4 != -9223372036854775807L ? j4 + this.frameDurationUs : -9223372036854775807L;
                        }
                        this.sampleTimeUs = j2;
                        this.sampleIsKeyframe = false;
                        this.pesTimeUs = -9223372036854775807L;
                        z2 = true;
                        this.startedFirstSample = true;
                    } else {
                        z2 = true;
                    }
                    this.sampleHasPicture = i7 == 0 ? z2 : false;
                }
            } else {
                if (i7 == START_GROUP) {
                    this.sampleIsKeyframe = true;
                }
                i2 = iLimit;
            }
            iLimit = i2;
            position = i5;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, iLimit);
        }
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
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z2) {
        Assertions.checkStateNotNull(this.output);
        if (z2) {
            boolean z3 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z3 ? 1 : 0, (int) (this.totalBytesWritten - this.samplePosition), 0, null);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        this.pesTimeUs = j2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }
}
