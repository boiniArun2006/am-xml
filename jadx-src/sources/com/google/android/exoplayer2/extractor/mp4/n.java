package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.media3.container.Mp4Box;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker;
import com.google.android.exoplayer2.extractor.mp4.j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.collect.nKK;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f57833n = Util.getUtf8Bytes("OpusHead");

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    private static final class CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f57834n;
        private final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f57835t;

        public CN3(int i2, long j2, int i3) {
            this.f57834n = i2;
            this.rl = j2;
            this.f57835t = i3;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static final class I28 implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f57836n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ParsableByteArray f57837t;

        @Override // com.google.android.exoplayer2.extractor.mp4.n.w6
        public int getFixedSampleSize() {
            return this.f57836n;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.n.w6
        public int getSampleCount() {
            return this.rl;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.n.w6
        public int readNextSampleSize() {
            int i2 = this.f57836n;
            return i2 == -1 ? this.f57837t.readUnsignedIntToInt() : i2;
        }

        public I28(j.n nVar, Format format) {
            ParsableByteArray parsableByteArray = nVar.rl;
            this.f57837t = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.f57836n = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.rl = parsableByteArray.readUnsignedIntToInt();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static final class Wre implements w6 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f57840O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ParsableByteArray f57841n;
        private int nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f57842t;

        @Override // com.google.android.exoplayer2.extractor.mp4.n.w6
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.n.w6
        public int getSampleCount() {
            return this.rl;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.n.w6
        public int readNextSampleSize() {
            int i2 = this.f57842t;
            if (i2 == 8) {
                return this.f57841n.readUnsignedByte();
            }
            if (i2 == 16) {
                return this.f57841n.readUnsignedShort();
            }
            int i3 = this.nr;
            this.nr = i3 + 1;
            if (i3 % 2 != 0) {
                return this.f57840O & 15;
            }
            int unsignedByte = this.f57841n.readUnsignedByte();
            this.f57840O = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }

        public Wre(j.n nVar) {
            ParsableByteArray parsableByteArray = nVar.rl;
            this.f57841n = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.f57842t = parsableByteArray.readUnsignedIntToInt() & 255;
            this.rl = parsableByteArray.readUnsignedIntToInt();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    private static final class j {
        private final ParsableByteArray J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f57843O;
        private final ParsableByteArray Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f57844n;
        public long nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f57845t;
        private int xMQ;

        public boolean n() {
            int i2 = this.rl + 1;
            this.rl = i2;
            if (i2 == this.f57844n) {
                return false;
            }
            this.nr = this.f57843O ? this.J2.readUnsignedLongToLong() : this.J2.readUnsignedInt();
            if (this.rl == this.KN) {
                this.f57845t = this.Uo.readUnsignedIntToInt();
                this.Uo.skipBytes(4);
                int i3 = this.xMQ - 1;
                this.xMQ = i3;
                this.KN = i3 > 0 ? this.Uo.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }

        public j(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z2) throws ParserException {
            this.Uo = parsableByteArray;
            this.J2 = parsableByteArray2;
            this.f57843O = z2;
            parsableByteArray2.setPosition(12);
            this.f57844n = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.xMQ = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.rl = -1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.n$n, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    private static final class C0768n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f57846n;
        private final int nr;
        private final byte[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f57847t;

        public C0768n(String str, byte[] bArr, int i2, int i3) {
            this.f57846n = str;
            this.rl = bArr;
            this.f57847t = i2;
            this.nr = i3;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    private interface w6 {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027d  */
    /* JADX WARN: Type inference failed for: r11v15, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static o S(Track track, j.C0767j c0767j, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        w6 wre;
        boolean z2;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        boolean z3;
        long j2;
        long[] jArrCopyOf;
        int i2;
        int i3;
        long j3;
        boolean z4;
        int[] iArr;
        long[] jArr;
        ?? r42;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i5;
        boolean z5;
        int i7;
        int i8;
        j.n nVarUo = c0767j.Uo(Mp4Box.TYPE_stsz);
        if (nVarUo != null) {
            wre = new I28(nVarUo, track.format);
        } else {
            j.n nVarUo2 = c0767j.Uo(Mp4Box.TYPE_stz2);
            if (nVarUo2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            wre = new Wre(nVarUo2);
        }
        int sampleCount = wre.getSampleCount();
        if (sampleCount == 0) {
            return new o(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        j.n nVarUo3 = c0767j.Uo(Mp4Box.TYPE_stco);
        if (nVarUo3 == null) {
            nVarUo3 = (j.n) Assertions.checkNotNull(c0767j.Uo(Mp4Box.TYPE_co64));
            z2 = true;
        } else {
            z2 = false;
        }
        ParsableByteArray parsableByteArray = nVarUo3.rl;
        ParsableByteArray parsableByteArray2 = ((j.n) Assertions.checkNotNull(c0767j.Uo(Mp4Box.TYPE_stsc))).rl;
        ParsableByteArray parsableByteArray3 = ((j.n) Assertions.checkNotNull(c0767j.Uo(Mp4Box.TYPE_stts))).rl;
        j.n nVarUo4 = c0767j.Uo(Mp4Box.TYPE_stss);
        ParsableByteArray parsableByteArray4 = nVarUo4 != null ? nVarUo4.rl : null;
        j.n nVarUo5 = c0767j.Uo(Mp4Box.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = nVarUo5 != null ? nVarUo5.rl : null;
        j jVar = new j(parsableByteArray2, parsableByteArray, z2);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt3 > 0) {
                unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt() - 1;
                z3 = false;
            } else {
                unsignedIntToInt2 = -1;
                z3 = false;
                parsableByteArray4 = null;
            }
        } else {
            unsignedIntToInt2 = -1;
            unsignedIntToInt3 = 0;
            z3 = false;
        }
        int fixedSampleSize = wre.getFixedSampleSize();
        String str = track.format.sampleMimeType;
        boolean z6 = (fixedSampleSize == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && unsignedIntToInt4 == 0 && unsignedIntToInt == 0 && unsignedIntToInt3 == 0)) ? z3 ? 1 : 0 : true;
        w6 w6Var = wre;
        if (z6) {
            int i9 = jVar.f57844n;
            long[] jArr2 = new long[i9];
            int[] iArr5 = new int[i9];
            while (jVar.n()) {
                int i10 = jVar.rl;
                jArr2[i10] = jVar.nr;
                iArr5[i10] = jVar.f57845t;
            }
            FixedSampleSizeRechunker.Results resultsN = FixedSampleSizeRechunker.n(fixedSampleSize, jArr2, iArr5, unsignedIntToInt6);
            long[] jArr3 = resultsN.offsets;
            iArr = resultsN.sizes;
            int i11 = resultsN.maximumSize;
            long[] jArr4 = resultsN.timestamps;
            int[] iArr6 = resultsN.flags;
            j3 = resultsN.duration;
            jArr = jArr3;
            r42 = i11;
            jArrCopyOf = jArr4;
            iArr2 = iArr6;
            j2 = 0;
        } else {
            long[] jArr5 = new long[sampleCount];
            j2 = 0;
            int[] iArrCopyOf = new int[sampleCount];
            jArrCopyOf = new long[sampleCount];
            ParsableByteArray parsableByteArray6 = parsableByteArray5;
            int[] iArrCopyOf2 = new int[sampleCount];
            ParsableByteArray parsableByteArray7 = parsableByteArray4;
            int unsignedIntToInt7 = unsignedIntToInt2;
            int i12 = z3 ? 1 : 0;
            int i13 = i12;
            int i14 = i13 == true ? 1 : 0;
            int i15 = i14;
            long j4 = 0;
            long j5 = 0;
            int i16 = unsignedIntToInt;
            int i17 = unsignedIntToInt6;
            int i18 = unsignedIntToInt5;
            int i19 = unsignedIntToInt4;
            int i20 = i15 == true ? 1 : 0;
            while (true) {
                if (i12 >= sampleCount) {
                    boolean z7 = sampleCount == true ? 1 : 0;
                    i2 = i18;
                    i3 = i14;
                    break;
                }
                long j6 = j5;
                int i21 = i14;
                boolean zN = true;
                while (i21 == 0) {
                    zN = jVar.n();
                    if (!zN) {
                        break;
                    }
                    int i22 = i18;
                    long j7 = jVar.nr;
                    i21 = jVar.f57845t;
                    j6 = j7;
                    i18 = i22;
                    i17 = i17;
                    sampleCount = sampleCount == true ? 1 : 0;
                }
                int i23 = sampleCount;
                i2 = i18;
                int i24 = i17;
                if (!zN) {
                    Log.w("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i12);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i12);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i12);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i12);
                    jArr5 = jArrCopyOf2;
                    sampleCount = i12;
                    i3 = i21;
                    break;
                }
                if (parsableByteArray6 != null) {
                    int unsignedIntToInt8 = i15 == true ? 1 : 0;
                    while (unsignedIntToInt8 == 0 && i16 > 0) {
                        unsignedIntToInt8 = parsableByteArray6.readUnsignedIntToInt();
                        i13 = parsableByteArray6.readInt();
                        i16--;
                    }
                    i15 = unsignedIntToInt8 - 1;
                }
                jArr5[i12] = j6;
                int nextSampleSize = w6Var.readNextSampleSize();
                iArrCopyOf[i12] = nextSampleSize;
                if (nextSampleSize > i20) {
                    i20 = nextSampleSize;
                }
                jArrCopyOf[i12] = j4 + ((long) i13);
                iArrCopyOf2[i12] = parsableByteArray7 == null ? 1 : z3 ? 1 : 0;
                if (i12 == unsignedIntToInt7) {
                    iArrCopyOf2[i12] = 1;
                    unsignedIntToInt3--;
                    if (unsignedIntToInt3 > 0) {
                        unsignedIntToInt7 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray7)).readUnsignedIntToInt() - 1;
                    }
                }
                j4 += (long) i24;
                int unsignedIntToInt9 = i2 - 1;
                if (unsignedIntToInt9 != 0 || i19 <= 0) {
                    i17 = i24;
                } else {
                    unsignedIntToInt9 = parsableByteArray3.readUnsignedIntToInt();
                    i19--;
                    i17 = parsableByteArray3.readInt();
                }
                i18 = unsignedIntToInt9;
                long j9 = j6 + ((long) iArrCopyOf[i12]);
                i14 = i21 - 1;
                i12++;
                j5 = j9;
                sampleCount = i23 == true ? 1 : 0;
            }
            j3 = j4 + ((long) i13);
            if (parsableByteArray6 != null) {
                while (i16 > 0) {
                    if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                        z4 = z3 ? 1 : 0;
                        break;
                    }
                    parsableByteArray6.readInt();
                    i16--;
                }
                z4 = true;
                if (unsignedIntToInt3 == 0 || i2 != 0 || i3 != 0 || i19 != 0 || i15 != 0 || !z4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistent stbl box for track ");
                    sb.append(track.id);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(unsignedIntToInt3);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i2);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i3);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i19);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i15 == true ? 1 : 0 ? 1 : 0);
                    sb.append(z4 ? ", ctts invalid" : "");
                    Log.w("AtomParsers", sb.toString());
                }
                iArr = iArrCopyOf;
                jArr = jArr5;
                r42 = i20 == true ? 1 : 0;
                iArr2 = iArrCopyOf2;
            } else {
                z4 = true;
                if (unsignedIntToInt3 == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Inconsistent stbl box for track ");
                    sb2.append(track.id);
                    sb2.append(": remainingSynchronizationSamples ");
                    sb2.append(unsignedIntToInt3);
                    sb2.append(", remainingSamplesAtTimestampDelta ");
                    sb2.append(i2);
                    sb2.append(", remainingSamplesInChunk ");
                    sb2.append(i3);
                    sb2.append(", remainingTimestampDeltaChanges ");
                    sb2.append(i19);
                    sb2.append(", remainingSamplesAtTimestampOffset ");
                    sb2.append(i15 == true ? 1 : 0 ? 1 : 0);
                    sb2.append(z4 ? ", ctts invalid" : "");
                    Log.w("AtomParsers", sb2.toString());
                    iArr = iArrCopyOf;
                    jArr = jArr5;
                    r42 = i20 == true ? 1 : 0;
                    iArr2 = iArrCopyOf2;
                }
            }
        }
        long j10 = j3;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j10, 1000000L, track.timescale);
        long[] jArr6 = track.editListDurations;
        if (jArr6 == null) {
            Util.scaleLargeTimestampsInPlace(jArrCopyOf, 1000000L, track.timescale);
            return new o(track, jArr, iArr, r42 == true ? 1 : 0, jArrCopyOf, iArr2, jScaleLargeTimestamp);
        }
        int[] iArr7 = iArr;
        int i25 = sampleCount;
        int[] iArr8 = iArr7;
        int[] iArr9 = iArr8;
        if (jArr6.length == 1) {
            iArr9 = iArr8;
            if (track.type == 1) {
                iArr9 = iArr8;
                if (jArrCopyOf.length >= 2) {
                    long j11 = ((long[]) Assertions.checkNotNull(track.editListMediaTimes))[z3 ? 1 : 0];
                    long jScaleLargeTimestamp2 = j11 + Util.scaleLargeTimestamp(track.editListDurations[z3 ? 1 : 0], track.timescale, track.movieTimescale);
                    long[] jArr7 = jArr;
                    long[] jArr8 = jArrCopyOf;
                    boolean zRl = rl(jArr8, j10, j11, jScaleLargeTimestamp2);
                    jArrCopyOf = jArr8;
                    j10 = j10;
                    if (zRl) {
                        long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j11 - jArrCopyOf[z3 ? 1 : 0], track.format.sampleRate, track.timescale);
                        long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j10 - jScaleLargeTimestamp2, track.format.sampleRate, track.timescale);
                        if ((jScaleLargeTimestamp3 != j2 || jScaleLargeTimestamp4 != j2) && jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                            gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                            gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                            Util.scaleLargeTimestampsInPlace(jArrCopyOf, 1000000L, track.timescale);
                            return new o(track, jArr7, iArr8, r42 == true ? 1 : 0, jArrCopyOf, iArr2, Util.scaleLargeTimestamp(track.editListDurations[z3 ? 1 : 0], 1000000L, track.movieTimescale));
                        }
                    }
                    jArr = jArr7;
                    iArr9 = iArr8;
                }
            }
        }
        long[] jArr9 = track.editListDurations;
        if (jArr9.length == 1 && jArr9[z3 ? 1 : 0] == j2) {
            long j12 = ((long[]) Assertions.checkNotNull(track.editListMediaTimes))[z3 ? 1 : 0];
            for (int i26 = z3 ? 1 : 0; i26 < jArrCopyOf.length; i26++) {
                jArrCopyOf[i26] = Util.scaleLargeTimestamp(jArrCopyOf[i26] - j12, 1000000L, track.timescale);
            }
            return new o(track, jArr, iArr9, r42 == true ? 1 : 0, jArrCopyOf, iArr2, Util.scaleLargeTimestamp(j10 - j12, 1000000L, track.timescale));
        }
        boolean z9 = track.type == 1 ? true : z3 ? 1 : 0;
        int[] iArr10 = new int[jArr9.length];
        int[] iArr11 = new int[jArr9.length];
        long[] jArr10 = (long[]) Assertions.checkNotNull(track.editListMediaTimes);
        int i27 = z3 ? 1 : 0;
        boolean z10 = i27 == true ? 1 : 0;
        int i28 = z10 ? 1 : 0;
        int i29 = i28;
        boolean z11 = z10;
        while (true) {
            long[] jArr11 = track.editListDurations;
            iArr3 = iArr11;
            if (i27 >= jArr11.length) {
                break;
            }
            int[] iArr12 = iArr10;
            long[] jArr12 = jArr10;
            long j13 = jArr12[i27];
            if (j13 != -1) {
                long j14 = jArr11[i27];
                i5 = i27;
                boolean z12 = z11 ? 1 : 0;
                long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(j14, track.timescale, track.movieTimescale);
                iArr4 = iArr12;
                iArr4[i5 == true ? 1 : 0] = Util.binarySearchFloor(jArrCopyOf, j13, true, true);
                long j15 = j13 + jScaleLargeTimestamp5;
                z5 = z3;
                iArr3[i5 == true ? 1 : 0] = Util.binarySearchCeil(jArrCopyOf, j15, z9, z5);
                while (true) {
                    i7 = iArr4[i5 == true ? 1 : 0];
                    i8 = iArr3[i5 == true ? 1 : 0];
                    if (i7 >= i8 || (iArr2[i7] & 1) != 0) {
                        break;
                    }
                    iArr4[i5 == true ? 1 : 0] = i7 + 1;
                }
                i28 += i8 - i7;
                z11 = (z12 ? 1 : 0) | (i29 != i7 ? true : z5 ? 1 : 0);
                i29 = i8;
            } else {
                iArr4 = iArr12;
                i5 = i27;
                boolean z13 = z11 ? 1 : 0;
                z5 = z3;
            }
            jArr10 = jArr12;
            z3 = z5;
            iArr11 = iArr3;
            i27 = i5 + 1;
            iArr10 = iArr4;
            z11 = z11;
        }
        int[] iArr13 = iArr10;
        boolean z14 = z3;
        boolean z15 = (z11 ? 1 : 0 ? 1 : 0) | (i28 != i25 ? true : z14);
        long[] jArr13 = z15 != 0 ? new long[i28] : jArr;
        int[] iArr14 = z15 != 0 ? new int[i28] : iArr9;
        if (z15 != 0) {
            r42 = z14;
        }
        int[] iArr15 = z15 != 0 ? new int[i28] : iArr2;
        long[] jArr14 = new long[i28];
        ?? r12 = z14;
        long j16 = j2;
        boolean z16 = z15;
        int[] iArr16 = iArr9;
        ?? r43 = r42;
        ?? r11 = z14;
        while (r11 < track.editListDurations.length) {
            long j17 = track.editListMediaTimes[r11];
            int i30 = iArr13[r11];
            boolean z17 = z16;
            int i31 = iArr3[r11];
            ?? r38 = r43;
            if (z17 != 0) {
                int i32 = i31 - i30;
                System.arraycopy(jArr, i30, jArr13, r12, i32);
                System.arraycopy(iArr16, i30, iArr14, r12, i32);
                System.arraycopy(iArr2, i30, iArr15, r12, i32);
            }
            int i33 = r38 == true ? 1 : 0;
            int[] iArr17 = iArr16;
            ?? r122 = r12;
            while (i30 < i31) {
                long[] jArr15 = jArr;
                int[] iArr18 = iArr17;
                long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(j16, 1000000L, track.movieTimescale);
                long j18 = jArrCopyOf[i30] - j17;
                long[] jArr16 = jArrCopyOf;
                int[] iArr19 = iArr2;
                long j19 = j2;
                jArr14[r122] = jScaleLargeTimestamp6 + Util.scaleLargeTimestamp(Math.max(j19, j18), 1000000L, track.timescale);
                if (z17 != 0 && iArr14[r122] > i33) {
                    i33 = iArr18[i30];
                }
                i30++;
                j2 = j19;
                jArr = jArr15;
                iArr17 = iArr18;
                iArr2 = iArr19;
                jArrCopyOf = jArr16;
                i33 = i33;
                r122++;
            }
            j16 += track.editListDurations[r11];
            z16 = z17;
            jArr = jArr;
            iArr16 = iArr17;
            iArr2 = iArr2;
            jArrCopyOf = jArrCopyOf;
            r43 = i33;
            r11++;
            r12 = r122;
        }
        return new o(track, jArr13, iArr14, r43, jArr14, iArr15, Util.scaleLargeTimestamp(j16, 1000000L, track.movieTimescale));
    }

    private static Metadata XQ(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i2) {
            int position = parsableByteArray.getPosition();
            int i3 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (i3 < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                if (unsignedByte != 12 && unsignedByte != 13) {
                    return null;
                }
                float f3 = unsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f3, parsableByteArray.readUnsignedByte()));
            }
            parsableByteArray.setPosition(position + i3);
        }
        return null;
    }

    private static void fD(ParsableByteArray parsableByteArray, int i2, int i3, int i5, int i7, int i8, DrmInitData drmInitData, Ml ml, int i9) throws ParserException {
        int i10;
        DrmInitData drmInitData2;
        int i11;
        String str;
        byte[] bArr;
        float f3;
        List<byte[]> list;
        String str2;
        int i12 = i3;
        int i13 = i5;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        Ml ml2 = ml;
        parsableByteArray.setPosition(i12 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i2;
        if (iIntValue == 1701733238) {
            Pair pairO = o(parsableByteArray, i12, i13);
            if (pairO != null) {
                iIntValue = ((Integer) pairO.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) pairO.second).schemeType);
                ml2.f57838n[i9] = (TrackEncryptionBox) pairO.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fIk = 1.0f;
        byte[] bArrR = null;
        String str5 = null;
        List<byte[]> listO = null;
        int i14 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i15 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBufferN = null;
        C0768n c0768nXMQ = null;
        boolean z2 = false;
        while (position - i12 < i13) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i16 = parsableByteArray.readInt();
            if (i16 == 0) {
                i10 = position;
                if (parsableByteArray.getPosition() - i3 == i13) {
                    break;
                }
            } else {
                i10 = position;
            }
            ExtractorUtil.checkContainerInput(i16 > 0, "childAtomSize must be positive");
            int i17 = parsableByteArray.readInt();
            if (i17 == 1635148611) {
                ExtractorUtil.checkContainerInput(str4 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                listO = avcConfig.initializationData;
                ml2.f57839t = avcConfig.nalUnitLengthFieldLength;
                if (!z2) {
                    fIk = avcConfig.pixelWidthHeightRatio;
                }
                str5 = avcConfig.codecs;
                str2 = "video/avc";
            } else if (i17 == 1752589123) {
                ExtractorUtil.checkContainerInput(str4 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                listO = hevcConfig.initializationData;
                ml2.f57839t = hevcConfig.nalUnitLengthFieldLength;
                if (!z2) {
                    fIk = hevcConfig.pixelWidthHeightRatio;
                }
                str5 = hevcConfig.codecs;
                str2 = "video/hevc";
            } else {
                if (i17 == 1685480259 || i17 == 1685485123) {
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i11 = iIntValue;
                    str = str3;
                    bArr = bArrR;
                    f3 = fIk;
                    list = listO;
                    DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                    if (dolbyVisionConfig != null) {
                        str5 = dolbyVisionConfig.codecs;
                        str4 = "video/dolby-vision";
                    }
                } else if (i17 == 1987076931) {
                    ExtractorUtil.checkContainerInput(str4 == null, null);
                    str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (i17 == 1635135811) {
                    ExtractorUtil.checkContainerInput(str4 == null, null);
                    str2 = "video/av01";
                } else if (i17 == 1668050025) {
                    if (byteBufferN == null) {
                        byteBufferN = n();
                    }
                    ByteBuffer byteBuffer = byteBufferN;
                    byteBuffer.position(21);
                    byteBuffer.putShort(parsableByteArray.readShort());
                    byteBuffer.putShort(parsableByteArray.readShort());
                    byteBufferN = byteBuffer;
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i11 = iIntValue;
                    str = str3;
                    position = i10 + i16;
                    i12 = i3;
                    i13 = i5;
                    ml2 = ml;
                    iIntValue = i11;
                    str3 = str;
                    drmInitDataCopyWithSchemeType = drmInitData2;
                } else if (i17 == 1835295606) {
                    if (byteBufferN == null) {
                        byteBufferN = n();
                    }
                    ByteBuffer byteBuffer2 = byteBufferN;
                    short s2 = parsableByteArray.readShort();
                    short s3 = parsableByteArray.readShort();
                    i11 = iIntValue;
                    short s4 = parsableByteArray.readShort();
                    str = str3;
                    short s5 = parsableByteArray.readShort();
                    short s6 = parsableByteArray.readShort();
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    short s7 = parsableByteArray.readShort();
                    List<byte[]> list2 = listO;
                    short s8 = parsableByteArray.readShort();
                    byte[] bArr2 = bArrR;
                    short s9 = parsableByteArray.readShort();
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    long unsignedInt2 = parsableByteArray.readUnsignedInt();
                    byteBuffer2.position(1);
                    byteBuffer2.putShort(s6);
                    byteBuffer2.putShort(s7);
                    byteBuffer2.putShort(s2);
                    byteBuffer2.putShort(s3);
                    byteBuffer2.putShort(s4);
                    byteBuffer2.putShort(s5);
                    byteBuffer2.putShort(s8);
                    byteBuffer2.putShort(s9);
                    byteBuffer2.putShort((short) (unsignedInt / 10000));
                    byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                    byteBufferN = byteBuffer2;
                    listO = list2;
                    bArrR = bArr2;
                    fIk = fIk;
                    position = i10 + i16;
                    i12 = i3;
                    i13 = i5;
                    ml2 = ml;
                    iIntValue = i11;
                    str3 = str;
                    drmInitDataCopyWithSchemeType = drmInitData2;
                } else {
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i11 = iIntValue;
                    str = str3;
                    bArr = bArrR;
                    f3 = fIk;
                    list = listO;
                    if (i17 == 1681012275) {
                        ExtractorUtil.checkContainerInput(str4 == null, null);
                        str4 = str;
                    } else if (i17 == 1702061171) {
                        ExtractorUtil.checkContainerInput(str4 == null, null);
                        c0768nXMQ = xMQ(parsableByteArray, position2);
                        String str6 = c0768nXMQ.f57846n;
                        byte[] bArr3 = c0768nXMQ.rl;
                        listO = bArr3 != null ? nKK.o(bArr3) : list;
                        str4 = str6;
                        bArrR = bArr;
                        fIk = f3;
                        position = i10 + i16;
                        i12 = i3;
                        i13 = i5;
                        ml2 = ml;
                        iIntValue = i11;
                        str3 = str;
                        drmInitDataCopyWithSchemeType = drmInitData2;
                    } else if (i17 == 1885434736) {
                        fIk = Ik(parsableByteArray, position2);
                        listO = list;
                        bArrR = bArr;
                        z2 = true;
                        position = i10 + i16;
                        i12 = i3;
                        i13 = i5;
                        ml2 = ml;
                        iIntValue = i11;
                        str3 = str;
                        drmInitDataCopyWithSchemeType = drmInitData2;
                    } else if (i17 == 1937126244) {
                        bArrR = r(parsableByteArray, position2, i16);
                        listO = list;
                        fIk = f3;
                        position = i10 + i16;
                        i12 = i3;
                        i13 = i5;
                        ml2 = ml;
                        iIntValue = i11;
                        str3 = str;
                        drmInitDataCopyWithSchemeType = drmInitData2;
                    } else if (i17 == 1936995172) {
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        parsableByteArray.skipBytes(3);
                        if (unsignedByte == 0) {
                            int unsignedByte2 = parsableByteArray.readUnsignedByte();
                            if (unsignedByte2 == 0) {
                                i14 = 0;
                            } else if (unsignedByte2 == 1) {
                                i14 = 1;
                            } else if (unsignedByte2 == 2) {
                                i14 = 2;
                            } else if (unsignedByte2 == 3) {
                                i14 = 3;
                            }
                        }
                    } else if (i17 == 1668246642) {
                        int i18 = parsableByteArray.readInt();
                        if (i18 == 1852009592 || i18 == 1852009571) {
                            int unsignedShort3 = parsableByteArray.readUnsignedShort();
                            int unsignedShort4 = parsableByteArray.readUnsignedShort();
                            parsableByteArray.skipBytes(2);
                            boolean z3 = i16 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                            iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                            i15 = z3 ? 1 : 2;
                            iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                        } else {
                            Log.w("AtomParsers", "Unsupported color type: " + com.google.android.exoplayer2.extractor.mp4.j.n(i18));
                        }
                    }
                }
                listO = list;
                bArrR = bArr;
                fIk = f3;
                position = i10 + i16;
                i12 = i3;
                i13 = i5;
                ml2 = ml;
                iIntValue = i11;
                str3 = str;
                drmInitDataCopyWithSchemeType = drmInitData2;
            }
            str4 = str2;
            drmInitData2 = drmInitDataCopyWithSchemeType;
            i11 = iIntValue;
            str = str3;
            position = i10 + i16;
            i12 = i3;
            i13 = i5;
            ml2 = ml;
            iIntValue = i11;
            str3 = str;
            drmInitDataCopyWithSchemeType = drmInitData2;
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        byte[] bArr4 = bArrR;
        float f4 = fIk;
        List<byte[]> list3 = listO;
        if (str4 == null) {
            return;
        }
        Format.Builder drmInitData4 = new Format.Builder().setId(i7).setSampleMimeType(str4).setCodecs(str5).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(f4).setRotationDegrees(i8).setProjectionData(bArr4).setStereoMode(i14).setInitializationData(list3).setDrmInitData(drmInitData3);
        int i19 = iIsoColorPrimariesToColorSpace;
        int i20 = i15;
        int i21 = iIsoTransferCharacteristicsToColorTransfer;
        if (i19 != -1 || i20 != -1 || i21 != -1 || byteBufferN != null) {
            drmInitData4.setColorInfo(new ColorInfo(i19, i20, i21, byteBufferN != null ? byteBufferN.array() : null));
        }
        if (c0768nXMQ != null) {
            drmInitData4.setAverageBitrate(c0768nXMQ.f57847t).setPeakBitrate(c0768nXMQ.nr);
        }
        ml.rl = drmInitData4.build();
    }

    private static int nr(int i2) {
        if (i2 == 1936684398) {
            return 1;
        }
        if (i2 == 1986618469) {
            return 2;
        }
        if (i2 == 1952807028 || i2 == 1935832172 || i2 == 1937072756 || i2 == 1668047728) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    private static boolean rl(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length - 1;
        return jArr[0] <= j3 && j3 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j4 && j4 <= j2;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    private static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final TrackEncryptionBox[] f57838n;
        public int nr = 0;
        public Format rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f57839t;

        public Ml(int i2) {
            this.f57838n = new TrackEncryptionBox[i2];
        }
    }

    private static void HI(ParsableByteArray parsableByteArray, int i2, int i3, int i5, Ml ml) {
        parsableByteArray.setPosition(i3 + 16);
        if (i2 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                ml.rl = new Format.Builder().setId(i5).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    private static float Ik(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void J2(ParsableByteArray parsableByteArray, int i2, int i3, int i5, int i7, String str, boolean z2, DrmInitData drmInitData, Ml ml, int i8) throws ParserException {
        int unsignedShort;
        int unsignedFixedPoint1616;
        int i9;
        int unsignedIntToInt;
        String str2;
        String str3;
        int i10;
        boolean z3;
        int i11 = i3;
        int i12 = i5;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i11 + 16);
        if (z2) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            int unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i9 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            unsignedIntToInt = unsignedShort2;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
            i9 = 0;
        }
        int position = parsableByteArray.getPosition();
        int iIntValue = i2;
        if (iIntValue == 1701733217) {
            Pair pairO = o(parsableByteArray, i11, i12);
            if (pairO != null) {
                iIntValue = ((Integer) pairO.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) pairO.second).schemeType);
                ml.f57838n[i8] = (TrackEncryptionBox) pairO.second;
            }
            parsableByteArray.setPosition(position);
        }
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (iIntValue != 1935767394) {
                str3 = "audio/raw";
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    i10 = 2;
                } else if (iIntValue == 1953984371) {
                    i10 = 268435456;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = "audio/mpeg";
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    str2 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str2 = "audio/alac";
                } else if (iIntValue == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (iIntValue == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (iIntValue == 1332770163) {
                    str2 = "audio/opus";
                } else if (iIntValue == 1716281667) {
                    str2 = "audio/flac";
                } else if (iIntValue == 1835823201) {
                    str2 = "audio/true-hd";
                } else {
                    i10 = -1;
                    str3 = null;
                }
                String str4 = str3;
                C0768n c0768nXMQ = null;
                String str5 = null;
                List<byte[]> listO = null;
                while (position - i11 < i12) {
                    parsableByteArray.setPosition(position);
                    int i13 = parsableByteArray.readInt();
                    ExtractorUtil.checkContainerInput(i13 > 0, "childAtomSize must be positive");
                    int i14 = parsableByteArray.readInt();
                    if (i14 == 1835557187) {
                        int i15 = i13 - 13;
                        byte[] bArr = new byte[i15];
                        parsableByteArray.setPosition(position + 13);
                        parsableByteArray.readBytes(bArr, 0, i15);
                        listO = nKK.o(bArr);
                    } else {
                        if (i14 == 1702061171 || (z2 && i14 == 2002876005)) {
                            int iT = i14 == 1702061171 ? position : t(parsableByteArray, Mp4Box.TYPE_esds, position, i13);
                            if (iT != -1) {
                                c0768nXMQ = xMQ(parsableByteArray, iT);
                                str4 = c0768nXMQ.f57846n;
                                byte[] bArr2 = c0768nXMQ.rl;
                                if (bArr2 != null) {
                                    if ("audio/mp4a-latm".equals(str4)) {
                                        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr2);
                                        unsignedFixedPoint1616 = audioSpecificConfig.sampleRateHz;
                                        unsignedIntToInt = audioSpecificConfig.channelCount;
                                        str5 = audioSpecificConfig.codecs;
                                    }
                                    listO = nKK.o(bArr2);
                                }
                            }
                        } else {
                            if (i14 == 1684103987) {
                                parsableByteArray.setPosition(position + 8);
                                ml.rl = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i7), str, drmInitDataCopyWithSchemeType);
                            } else if (i14 == 1684366131) {
                                parsableByteArray.setPosition(position + 8);
                                ml.rl = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i7), str, drmInitDataCopyWithSchemeType);
                            } else if (i14 == 1684103988) {
                                parsableByteArray.setPosition(position + 8);
                                ml.rl = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i7), str, drmInitDataCopyWithSchemeType);
                            } else if (i14 == 1684892784) {
                                if (i9 <= 0) {
                                    throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i9, null);
                                }
                                unsignedFixedPoint1616 = i9;
                                unsignedIntToInt = 2;
                            } else if (i14 == 1684305011) {
                                ml.rl = new Format.Builder().setId(i7).setSampleMimeType(str4).setChannelCount(unsignedIntToInt).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                            } else if (i14 == 1682927731) {
                                int i16 = i13 - 8;
                                byte[] bArr3 = f57833n;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i16);
                                parsableByteArray.setPosition(position + 8);
                                parsableByteArray.readBytes(bArrCopyOf, bArr3.length, i16);
                                listO = OpusUtil.buildInitializationData(bArrCopyOf);
                            } else if (i14 == 1684425825) {
                                byte[] bArr4 = new byte[i13 - 8];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr4, 4, i13 - 12);
                                listO = nKK.o(bArr4);
                            } else if (i14 == 1634492771) {
                                int i17 = i13 - 12;
                                byte[] bArr5 = new byte[i17];
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr5, 0, i17);
                                Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr5);
                                int iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                int iIntValue3 = ((Integer) alacAudioSpecificConfig.second).intValue();
                                listO = nKK.o(bArr5);
                                unsignedFixedPoint1616 = iIntValue2;
                                unsignedIntToInt = iIntValue3;
                            } else {
                                z3 = false;
                            }
                            z3 = false;
                        }
                        position += i13;
                        i11 = i3;
                        i12 = i5;
                    }
                    position += i13;
                    i11 = i3;
                    i12 = i5;
                }
                if (ml.rl == null || str4 == null) {
                }
                Format.Builder language = new Format.Builder().setId(i7).setSampleMimeType(str4).setCodecs(str5).setChannelCount(unsignedIntToInt).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(i10).setInitializationData(listO).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
                if (c0768nXMQ != null) {
                    language.setAverageBitrate(c0768nXMQ.f57847t).setPeakBitrate(c0768nXMQ.nr);
                }
                ml.rl = language.build();
                return;
            }
            str2 = "audio/amr-wb";
        }
        str3 = str2;
        i10 = -1;
        String str42 = str3;
        C0768n c0768nXMQ2 = null;
        String str52 = null;
        List<byte[]> listO2 = null;
        while (position - i11 < i12) {
        }
        if (ml.rl == null) {
        }
    }

    static Pair Uo(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        int i5 = i2 + 8;
        int i7 = -1;
        int i8 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i5 - i2 < i3) {
            parsableByteArray.setPosition(i5);
            int i9 = parsableByteArray.readInt();
            int i10 = parsableByteArray.readInt();
            if (i10 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i10 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i10 == 1935894633) {
                i7 = i5;
                i8 = i9;
            }
            i5 += i9;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !Apsps.wyynHYaZ.equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i7 != -1, "schi atom is mandatory");
        TrackEncryptionBox trackEncryptionBoxZ = Z(parsableByteArray, i7, i8, string);
        ExtractorUtil.checkContainerInput(trackEncryptionBoxZ != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(trackEncryptionBoxZ));
    }

    private static CN3 ViF(ParsableByteArray parsableByteArray) {
        long j2;
        parsableByteArray.setPosition(8);
        int iT = com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt());
        parsableByteArray.skipBytes(iT == 0 ? 8 : 16);
        int i2 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i3 = iT == 0 ? 4 : 8;
        int i5 = 0;
        int i7 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i7 >= i3) {
                parsableByteArray.skipBytes(i3);
                break;
            }
            if (parsableByteArray.getData()[position + i7] != -1) {
                long unsignedInt = iT == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt != 0) {
                    j2 = unsignedInt;
                }
            } else {
                i7++;
            }
        }
        parsableByteArray.skipBytes(16);
        int i8 = parsableByteArray.readInt();
        int i9 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i10 = parsableByteArray.readInt();
        int i11 = parsableByteArray.readInt();
        if (i8 == 0 && i9 == 65536 && i10 == -65536 && i11 == 0) {
            i5 = 90;
        } else if (i8 == 0 && i9 == -65536 && i10 == 65536 && i11 == 0) {
            i5 = 270;
        } else if (i8 == -65536 && i9 == 0 && i10 == 0 && i11 == -65536) {
            i5 = 180;
        }
        return new CN3(i2, j2, i5);
    }

    private static Ml WPU(ParsableByteArray parsableByteArray, int i2, int i3, String str, DrmInitData drmInitData, boolean z2) throws ParserException {
        parsableByteArray.setPosition(12);
        int i5 = parsableByteArray.readInt();
        Ml ml = new Ml(i5);
        int i7 = 0;
        while (i7 < i5) {
            int position = parsableByteArray.getPosition();
            int i8 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i8 > 0, "childAtomSize must be positive");
            int i9 = parsableByteArray.readInt();
            if (i9 == 1635148593 || i9 == 1635148595 || i9 == 1701733238 || i9 == 1831958048 || i9 == 1836070006 || i9 == 1752589105 || i9 == 1751479857 || i9 == 1932670515 || i9 == 1211250227 || i9 == 1987063864 || i9 == 1987063865 || i9 == 1635135537 || i9 == 1685479798 || i9 == 1685479729 || i9 == 1685481573 || i9 == 1685481521) {
                Ml ml2 = ml;
                int i10 = i7;
                fD(parsableByteArray, i9, position, i8, i2, i3, drmInitData, ml2, i10);
                ml = ml2;
                i7 = i10;
            } else if (i9 == 1836069985 || i9 == 1701733217 || i9 == 1633889587 || i9 == 1700998451 || i9 == 1633889588 || i9 == 1835823201 || i9 == 1685353315 || i9 == 1685353317 || i9 == 1685353320 || i9 == 1685353324 || i9 == 1685353336 || i9 == 1935764850 || i9 == 1935767394 || i9 == 1819304813 || i9 == 1936684916 || i9 == 1953984371 || i9 == 778924082 || i9 == 778924083 || i9 == 1835557169 || i9 == 1835560241 || i9 == 1634492771 || i9 == 1634492791 || i9 == 1970037111 || i9 == 1332770163 || i9 == 1716281667) {
                Ml ml3 = ml;
                J2(parsableByteArray, i9, position, i8, i2, str, z2, drmInitData, ml3, i7);
                ml = ml3;
            } else if (i9 == 1414810956 || i9 == 1954034535 || i9 == 2004251764 || i9 == 1937010800 || i9 == 1664495672) {
                aYN(parsableByteArray, i9, position, i8, i2, str, ml);
            } else if (i9 == 1835365492) {
                HI(parsableByteArray, i9, position, i2, ml);
            } else if (i9 == 1667329389) {
                ml.rl = new Format.Builder().setId(i2).setSampleMimeType("application/x-camera-motion").build();
            }
            parsableByteArray.setPosition(position + i8);
            i7++;
        }
        return ml;
    }

    private static TrackEncryptionBox Z(ParsableByteArray parsableByteArray, int i2, int i3, String str) {
        int i5;
        int i7;
        int i8 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i8 - i2 >= i3) {
                return null;
            }
            parsableByteArray.setPosition(i8);
            int i9 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int iT = com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (iT == 0) {
                    parsableByteArray.skipBytes(1);
                    i7 = 0;
                    i5 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i5 = unsignedByte & 15;
                    i7 = (unsignedByte & 240) >> 4;
                }
                boolean z2 = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z2 && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z2, str, unsignedByte2, bArr2, i7, i5, bArr);
            }
            i8 += i9;
        }
    }

    private static void aYN(ParsableByteArray parsableByteArray, int i2, int i3, int i5, int i7, String str, Ml ml) {
        parsableByteArray.setPosition(i3 + 16);
        String str2 = "application/ttml+xml";
        nKK nkkO = null;
        long j2 = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i8 = i5 - 16;
                byte[] bArr = new byte[i8];
                parsableByteArray.readBytes(bArr, 0, i8);
                nkkO = nKK.o(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i2 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == 1937010800) {
                j2 = 0;
            } else {
                if (i2 != 1664495672) {
                    throw new IllegalStateException();
                }
                ml.nr = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        ml.rl = new Format.Builder().setId(i7).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j2).setInitializationData(nkkO).build();
    }

    private static Pair az(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int iT = com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt());
        parsableByteArray.skipBytes(iT == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(iT == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    private static long ck(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    public static List g(j.C0767j c0767j, GaplessInfoHolder gaplessInfoHolder, long j2, DrmInitData drmInitData, boolean z2, boolean z3, t1.CN3 cn3) {
        Track track;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c0767j.nr.size(); i2++) {
            j.C0767j c0767j2 = (j.C0767j) c0767j.nr.get(i2);
            if (c0767j2.f57831n == 1953653099 && (track = (Track) cn3.apply(nY(c0767j2, (j.n) Assertions.checkNotNull(c0767j.Uo(Mp4Box.TYPE_mvhd)), j2, drmInitData, z2, z3))) != null) {
                arrayList.add(S(track, (j.C0767j) Assertions.checkNotNull(((j.C0767j) Assertions.checkNotNull(((j.C0767j) Assertions.checkNotNull(c0767j2.J2(Mp4Box.TYPE_mdia))).J2(Mp4Box.TYPE_minf))).J2(Mp4Box.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    private static int gh(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Metadata iF(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.skipBytes(8);
        O(parsableByteArray);
        while (parsableByteArray.getPosition() < i2) {
            int position = parsableByteArray.getPosition();
            int i3 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return qie(parsableByteArray, position + i3);
            }
            parsableByteArray.setPosition(position + i3);
        }
        return null;
    }

    private static ByteBuffer n() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Track nY(j.C0767j c0767j, j.n nVar, long j2, DrmInitData drmInitData, boolean z2, boolean z3) throws ParserException {
        long[] jArr;
        long[] jArr2;
        j.C0767j c0767jJ2;
        Pair pairKN;
        j.C0767j c0767j2 = (j.C0767j) Assertions.checkNotNull(c0767j.J2(Mp4Box.TYPE_mdia));
        int iNr = nr(gh(((j.n) Assertions.checkNotNull(c0767j2.Uo(Mp4Box.TYPE_hdlr))).rl));
        if (iNr == -1) {
            return null;
        }
        CN3 cn3ViF = ViF(((j.n) Assertions.checkNotNull(c0767j.Uo(Mp4Box.TYPE_tkhd))).rl);
        long j3 = j2 == -9223372036854775807L ? cn3ViF.rl : j2;
        long jCk = ck(nVar.rl);
        long jScaleLargeTimestamp = j3 != -9223372036854775807L ? Util.scaleLargeTimestamp(j3, 1000000L, jCk) : -9223372036854775807L;
        j.C0767j c0767j3 = (j.C0767j) Assertions.checkNotNull(((j.C0767j) Assertions.checkNotNull(c0767j2.J2(Mp4Box.TYPE_minf))).J2(Mp4Box.TYPE_stbl));
        Pair pairAz = az(((j.n) Assertions.checkNotNull(c0767j2.Uo(Mp4Box.TYPE_mdhd))).rl);
        Ml mlWPU = WPU(((j.n) Assertions.checkNotNull(c0767j3.Uo(Mp4Box.TYPE_stsd))).rl, cn3ViF.f57834n, cn3ViF.f57835t, (String) pairAz.second, drmInitData, z3);
        if (z2 || (c0767jJ2 = c0767j.J2(Mp4Box.TYPE_edts)) == null || (pairKN = KN(c0767jJ2)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairKN.first;
            jArr2 = (long[]) pairKN.second;
            jArr = jArr3;
        }
        if (mlWPU.rl == null) {
            return null;
        }
        return new Track(cn3ViF.f57834n, iNr, ((Long) pairAz.first).longValue(), jCk, jScaleLargeTimestamp, mlWPU.rl, mlWPU.nr, mlWPU.f57838n, mlWPU.f57839t, jArr, jArr2);
    }

    private static Metadata qie(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i2) {
            Metadata.Entry entryT = com.google.android.exoplayer2.extractor.mp4.Wre.t(parsableByteArray);
            if (entryT != null) {
                arrayList.add(entryT);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static byte[] r(ParsableByteArray parsableByteArray, int i2, int i3) {
        int i5 = i2 + 8;
        while (i5 - i2 < i3) {
            parsableByteArray.setPosition(i5);
            int i7 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i5, i7 + i5);
            }
            i5 += i7;
        }
        return null;
    }

    public static Pair te(j.n nVar) {
        ParsableByteArray parsableByteArray = nVar.rl;
        parsableByteArray.setPosition(8);
        Metadata metadataIF = null;
        Metadata metadataXQ = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            int i3 = parsableByteArray.readInt();
            if (i3 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadataIF = iF(parsableByteArray, position + i2);
            } else if (i3 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadataXQ = XQ(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return Pair.create(metadataIF, metadataXQ);
    }

    private static C0768n xMQ(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 12);
        parsableByteArray.skipBytes(1);
        mUb(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        mUb(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new C0768n(mimeTypeFromMp4ObjectType, null, -1, -1);
        }
        parsableByteArray.skipBytes(4);
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
        parsableByteArray.skipBytes(1);
        int iMUb = mUb(parsableByteArray);
        byte[] bArr = new byte[iMUb];
        parsableByteArray.readBytes(bArr, 0, iMUb);
        if (unsignedIntToInt2 <= 0) {
            unsignedIntToInt2 = -1;
        }
        return new C0768n(mimeTypeFromMp4ObjectType, bArr, unsignedIntToInt2, unsignedIntToInt > 0 ? unsignedIntToInt : -1);
    }

    private static Pair KN(j.C0767j c0767j) {
        long unsignedInt;
        long j2;
        j.n nVarUo = c0767j.Uo(Mp4Box.TYPE_elst);
        if (nVarUo == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = nVarUo.rl;
        parsableByteArray.setPosition(8);
        int iT = com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
            if (iT == 1) {
                unsignedInt = parsableByteArray.readUnsignedLongToLong();
            } else {
                unsignedInt = parsableByteArray.readUnsignedInt();
            }
            jArr[i2] = unsignedInt;
            if (iT == 1) {
                j2 = parsableByteArray.readLong();
            } else {
                j2 = parsableByteArray.readInt();
            }
            jArr2[i2] = j2;
            if (parsableByteArray.readShort() == 1) {
                parsableByteArray.skipBytes(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    public static void O(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static int mUb(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i2 = (i2 << 7) | (unsignedByte & 127);
        }
        return i2;
    }

    private static Pair o(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        boolean z2;
        Pair pairUo;
        int position = parsableByteArray.getPosition();
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i5 = parsableByteArray.readInt();
            if (i5 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ExtractorUtil.checkContainerInput(z2, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (pairUo = Uo(parsableByteArray, position, i5)) != null) {
                return pairUo;
            }
            position += i5;
        }
        return null;
    }

    private static int t(ParsableByteArray parsableByteArray, int i2, int i3, int i5) throws ParserException {
        boolean z2;
        boolean z3;
        int position = parsableByteArray.getPosition();
        if (position >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        ExtractorUtil.checkContainerInput(z2, null);
        while (position - i3 < i5) {
            parsableByteArray.setPosition(position);
            int i7 = parsableByteArray.readInt();
            if (i7 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ExtractorUtil.checkContainerInput(z3, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i2) {
                return position;
            }
            position += i7;
        }
        return -1;
    }

    public static Metadata ty(j.C0767j c0767j) {
        j.n nVarUo = c0767j.Uo(Mp4Box.TYPE_hdlr);
        j.n nVarUo2 = c0767j.Uo(Mp4Box.TYPE_keys);
        j.n nVarUo3 = c0767j.Uo(Mp4Box.TYPE_ilst);
        if (nVarUo == null || nVarUo2 == null || nVarUo3 == null || gh(nVarUo.rl) != 1835299937) {
            return null;
        }
        ParsableByteArray parsableByteArray = nVarUo2.rl;
        parsableByteArray.setPosition(12);
        int i2 = parsableByteArray.readInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i3] = parsableByteArray.readString(i5 - 8);
        }
        ParsableByteArray parsableByteArray2 = nVarUo3.rl;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i7 = parsableByteArray2.readInt();
            int i8 = parsableByteArray2.readInt() - 1;
            if (i8 >= 0 && i8 < i2) {
                MdtaMetadataEntry mdtaMetadataEntryJ2 = com.google.android.exoplayer2.extractor.mp4.Wre.J2(parsableByteArray2, position + i7, strArr[i8]);
                if (mdtaMetadataEntryJ2 != null) {
                    arrayList.add(mdtaMetadataEntryJ2);
                }
            } else {
                Log.w("AtomParsers", "Skipped metadata with unknown key index: " + i8);
            }
            parsableByteArray2.setPosition(position + i7);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
