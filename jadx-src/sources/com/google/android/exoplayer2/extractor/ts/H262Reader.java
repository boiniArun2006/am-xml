package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final j csdBuffer;
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
    private final Ml userData;

    @Nullable
    private final ParsableByteArray userDataParsable;

    @Nullable
    private final C userDataReader;

    private static final class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final byte[] f57877O = {0, 0, 1};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f57878n;
        public byte[] nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f57879t;

        public void t() {
            this.f57878n = false;
            this.rl = 0;
            this.f57879t = 0;
        }

        public void n(byte[] bArr, int i2, int i3) {
            if (this.f57878n) {
                int i5 = i3 - i2;
                byte[] bArr2 = this.nr;
                int length = bArr2.length;
                int i7 = this.rl;
                if (length < i7 + i5) {
                    this.nr = Arrays.copyOf(bArr2, (i7 + i5) * 2);
                }
                System.arraycopy(bArr, i2, this.nr, this.rl, i5);
                this.rl += i5;
            }
        }

        public boolean rl(int i2, int i3) {
            if (this.f57878n) {
                int i5 = this.rl - i3;
                this.rl = i5;
                if (this.f57879t != 0 || i2 != H262Reader.START_EXTENSION) {
                    this.f57878n = false;
                    return true;
                }
                this.f57879t = i5;
            } else if (i2 == H262Reader.START_SEQUENCE_HEADER) {
                this.f57878n = true;
            }
            byte[] bArr = f57877O;
            n(bArr, 0, bArr.length);
            return false;
        }

        public j(int i2) {
            this.nr = new byte[i2];
        }
    }

    public H262Reader() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    H262Reader(@Nullable C c2) {
        this.userDataReader = c2;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new j(128);
        if (c2 != null) {
            this.userData = new Ml(START_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair<Format, Long> parseCsdBuffer(j jVar, String str) {
        float f3;
        int i2;
        float f4;
        int i3;
        long j2;
        byte[] bArrCopyOf = Arrays.copyOf(jVar.nr, jVar.rl);
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
                Format formatBuild = new Format.Builder().setId(str).setSampleMimeType("video/mpeg2").setWidth(i7).setHeight(i8).setPixelWidthHeightRatio(f4).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                i3 = (bArrCopyOf[7] & 15) - 1;
                if (i3 < 0) {
                    double[] dArr = FRAME_RATE_VALUES;
                    if (i3 < dArr.length) {
                        double d2 = dArr[i3];
                        byte b4 = bArrCopyOf[jVar.f57879t + 9];
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
        Format formatBuild2 = new Format.Builder().setId(str).setSampleMimeType("video/mpeg2").setWidth(i7).setHeight(i8).setPixelWidthHeightRatio(f4).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        i3 = (bArrCopyOf[7] & 15) - 1;
        if (i3 < 0) {
        }
        return Pair.create(formatBuild2, Long.valueOf(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
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
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
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
                    this.csdBuffer.n(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.rl(i7, i8 < 0 ? -i8 : 0)) {
                    Pair<Format, Long> csdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId));
                    this.output.format((Format) csdBuffer.first);
                    this.frameDurationUs = ((Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            Ml ml = this.userData;
            if (ml != null) {
                if (i8 > 0) {
                    ml.n(data, position, iFindNalUnit);
                    i3 = 0;
                } else {
                    i3 = -i8;
                }
                if (this.userData.rl(i3)) {
                    Ml ml2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nr, NalUnitUtil.unescapeStream(ml2.nr, ml2.f57897O));
                    ((C) Util.castNonNull(this.userDataReader)).n(this.sampleTimeUs, this.userDataParsable);
                }
                if (i7 == START_USER_DATA && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.O(i7);
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
            this.csdBuffer.n(data, position, iLimit);
        }
        Ml ml3 = this.userData;
        if (ml3 != null) {
            ml3.n(data, position, iLimit);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        this.pesTimeUs = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.t();
        Ml ml = this.userData;
        if (ml != null) {
            ml.nr();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        C c2 = this.userDataReader;
        if (c2 != null) {
            c2.rl(extractorOutput, trackIdGenerator);
        }
    }
}
