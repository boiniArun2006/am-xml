package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class H263Reader implements ElementaryStreamReader {
    private static final float[] PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private static final int START_CODE_VALUE_GROUP_OF_VOP = 179;
    private static final int START_CODE_VALUE_MAX_VIDEO_OBJECT = 31;
    private static final int START_CODE_VALUE_UNSET = -1;
    private static final int START_CODE_VALUE_USER_DATA = 178;
    private static final int START_CODE_VALUE_VISUAL_OBJECT = 181;
    private static final int START_CODE_VALUE_VISUAL_OBJECT_SEQUENCE = 176;
    private static final int START_CODE_VALUE_VOP = 182;
    private static final String TAG = "H263Reader";
    private static final int VIDEO_OBJECT_LAYER_SHAPE_RECTANGULAR = 0;
    private final j csdBuffer;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private n sampleReader;
    private long totalBytesWritten;

    @Nullable
    private final Ml userData;

    @Nullable
    private final ParsableByteArray userDataParsable;

    @Nullable
    private final C userDataReader;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    private static final class j {
        private static final byte[] J2 = {0, 0, 1};

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public byte[] f57880O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f57881n;
        public int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f57882t;

        public void t() {
            this.f57881n = false;
            this.f57882t = 0;
            this.rl = 0;
        }

        public void n(byte[] bArr, int i2, int i3) {
            if (this.f57881n) {
                int i5 = i3 - i2;
                byte[] bArr2 = this.f57880O;
                int length = bArr2.length;
                int i7 = this.f57882t;
                if (length < i7 + i5) {
                    this.f57880O = Arrays.copyOf(bArr2, (i7 + i5) * 2);
                }
                System.arraycopy(bArr, i2, this.f57880O, this.f57882t, i5);
                this.f57882t += i5;
            }
        }

        public boolean rl(int i2, int i3) {
            int i5 = this.rl;
            if (i5 != 0) {
                String str = inFlMLxL.ZAfLhosIdkUK;
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i2 == H263Reader.START_CODE_VALUE_GROUP_OF_VOP || i2 == H263Reader.START_CODE_VALUE_VISUAL_OBJECT) {
                                this.f57882t -= i3;
                                this.f57881n = false;
                                return true;
                            }
                        } else if ((i2 & 240) != 32) {
                            Log.w(str, "Unexpected start code value");
                            t();
                        } else {
                            this.nr = this.f57882t;
                            this.rl = 4;
                        }
                    } else if (i2 > 31) {
                        Log.w(str, "Unexpected start code value");
                        t();
                    } else {
                        this.rl = 3;
                    }
                } else if (i2 != H263Reader.START_CODE_VALUE_VISUAL_OBJECT) {
                    Log.w(str, "Unexpected start code value");
                    t();
                } else {
                    this.rl = 2;
                }
            } else if (i2 == H263Reader.START_CODE_VALUE_VISUAL_OBJECT_SEQUENCE) {
                this.rl = 1;
                this.f57881n = true;
            }
            byte[] bArr = J2;
            n(bArr, 0, bArr.length);
            return false;
        }

        public j(int i2) {
            this.f57880O = new byte[i2];
        }
    }

    private static final class n {
        private int J2;
        private long KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f57883O;
        private long Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TrackOutput f57884n;
        private boolean nr;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f57885t;

        public void nr() {
            this.rl = false;
            this.f57885t = false;
            this.nr = false;
            this.f57883O = -1;
        }

        public void n(byte[] bArr, int i2, int i3) {
            if (this.f57885t) {
                int i5 = this.J2;
                int i7 = (i2 + 1) - i5;
                if (i7 >= i3) {
                    this.J2 = i5 + (i3 - i2);
                } else {
                    this.nr = ((bArr[i7] & 192) >> 6) == 0;
                    this.f57885t = false;
                }
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
        public void rl(long j2, int i2, boolean z2) {
            if (this.f57883O == H263Reader.START_CODE_VALUE_VOP && z2 && this.rl) {
                long j3 = this.KN;
                if (j3 != -9223372036854775807L) {
                    this.f57884n.sampleMetadata(j3, this.nr ? 1 : 0, (int) (j2 - this.Uo), i2, null);
                }
            }
            if (this.f57883O != H263Reader.START_CODE_VALUE_GROUP_OF_VOP) {
                this.Uo = j2;
            }
        }

        public void t(int i2, long j2) {
            this.f57883O = i2;
            this.nr = false;
            this.rl = i2 == H263Reader.START_CODE_VALUE_VOP || i2 == H263Reader.START_CODE_VALUE_GROUP_OF_VOP;
            this.f57885t = i2 == H263Reader.START_CODE_VALUE_VOP;
            this.J2 = 0;
            this.KN = j2;
        }

        public n(TrackOutput trackOutput) {
            this.f57884n = trackOutput;
        }
    }

    public H263Reader() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    H263Reader(@Nullable C c2) {
        this.userDataReader = c2;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new j(128);
        this.pesTimeUs = -9223372036854775807L;
        if (c2 != null) {
            this.userData = new Ml(START_CODE_VALUE_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
    }

    private static Format parseCsdBuffer(j jVar, int i2, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(jVar.f57880O, jVar.f57882t);
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        parsableBitArray.skipBytes(i2);
        parsableBitArray.skipBytes(4);
        parsableBitArray.skipBit();
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        int bits = parsableBitArray.readBits(4);
        float f3 = 1.0f;
        if (bits == 15) {
            int bits2 = parsableBitArray.readBits(8);
            int bits3 = parsableBitArray.readBits(8);
            if (bits3 == 0) {
                Log.w(TAG, "Invalid aspect ratio");
            } else {
                f3 = bits2 / bits3;
            }
        } else {
            float[] fArr = PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO;
            if (bits < fArr.length) {
                f3 = fArr[bits];
            } else {
                Log.w(TAG, "Invalid aspect ratio");
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(3);
                parsableBitArray.skipBits(11);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
            }
        }
        if (parsableBitArray.readBits(2) != 0) {
            Log.w(TAG, "Unhandled video object layer shape");
        }
        parsableBitArray.skipBit();
        int bits4 = parsableBitArray.readBits(16);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            if (bits4 == 0) {
                Log.w(TAG, "Invalid vop_increment_time_resolution");
            } else {
                int i3 = 0;
                for (int i5 = bits4 - 1; i5 > 0; i5 >>= 1) {
                    i3++;
                }
                parsableBitArray.skipBits(i3);
            }
        }
        parsableBitArray.skipBit();
        int bits5 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        int bits6 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        parsableBitArray.skipBit();
        return new Format.Builder().setId(str).setSampleMimeType("video/mp4v-es").setWidth(bits5).setHeight(bits6).setPixelWidthHeightRatio(f3).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.sampleReader);
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
            int i2 = iFindNalUnit + 3;
            int i3 = parsableByteArray.getData()[i2] & UByte.MAX_VALUE;
            int i5 = iFindNalUnit - position;
            int i7 = 0;
            if (!this.hasOutputFormat) {
                if (i5 > 0) {
                    this.csdBuffer.n(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.rl(i3, i5 < 0 ? -i5 : 0)) {
                    TrackOutput trackOutput = this.output;
                    j jVar = this.csdBuffer;
                    trackOutput.format(parseCsdBuffer(jVar, jVar.nr, (String) Assertions.checkNotNull(this.formatId)));
                    this.hasOutputFormat = true;
                }
            }
            this.sampleReader.n(data, position, iFindNalUnit);
            Ml ml = this.userData;
            if (ml != null) {
                if (i5 > 0) {
                    ml.n(data, position, iFindNalUnit);
                } else {
                    i7 = -i5;
                }
                if (this.userData.rl(i7)) {
                    Ml ml2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nr, NalUnitUtil.unescapeStream(ml2.nr, ml2.f57897O));
                    ((C) Util.castNonNull(this.userDataReader)).n(this.pesTimeUs, this.userDataParsable);
                }
                if (i3 == START_CODE_VALUE_USER_DATA && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.O(i3);
                }
            }
            int i8 = iLimit - iFindNalUnit;
            this.sampleReader.rl(this.totalBytesWritten - ((long) i8), i8, this.hasOutputFormat);
            this.sampleReader.t(i3, this.pesTimeUs);
            position = i2;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.n(data, position, iLimit);
        }
        this.sampleReader.n(data, position, iLimit);
        Ml ml3 = this.userData;
        if (ml3 != null) {
            ml3.n(data, position, iLimit);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.t();
        n nVar = this.sampleReader;
        if (nVar != null) {
            nVar.nr();
        }
        Ml ml = this.userData;
        if (ml != null) {
            ml.nr();
        }
        this.totalBytesWritten = 0L;
        this.pesTimeUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = trackOutputTrack;
        this.sampleReader = new n(trackOutputTrack);
        C c2 = this.userDataReader;
        if (c2 != null) {
            c2.rl(extractorOutput, trackIdGenerator);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.pesTimeUs = j2;
        }
    }
}
