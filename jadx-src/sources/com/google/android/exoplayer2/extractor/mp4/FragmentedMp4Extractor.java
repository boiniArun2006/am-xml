package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.container.Mp4Box;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.j;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class FragmentedMp4Extractor implements Extractor {
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";

    @Nullable
    private final TrackOutput additionalEmsgTrackOutput;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] ceaTrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<j.C0767j> containerAtoms;

    @Nullable
    private n currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final EventMessageEncoder eventMessageEncoder;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<j> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;

    @Nullable
    private final Track sideloadedTrack;

    @Nullable
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<n> trackBundles;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.mp4.Ml
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return FragmentedMp4Extractor.n();
        }
    };
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType("application/x-emsg").build();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static final class n {
        public int J2;
        public int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public w6 f57820O;
        public int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final TrackOutput f57821n;
        public o nr;
        private boolean qie;
        public int xMQ;
        public final C rl = new C();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final ParsableByteArray f57822t = new ParsableByteArray();
        private final ParsableByteArray mUb = new ParsableByteArray(1);
        private final ParsableByteArray gh = new ParsableByteArray();

        public int J2() {
            return !this.qie ? this.nr.nr[this.J2] : this.rl.xMQ[this.J2];
        }

        public boolean KN() {
            this.J2++;
            if (!this.qie) {
                return false;
            }
            int i2 = this.Uo + 1;
            this.Uo = i2;
            int[] iArr = this.rl.KN;
            int i3 = this.KN;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.KN = i3 + 1;
            this.Uo = 0;
            return false;
        }

        public long O() {
            return !this.qie ? this.nr.J2[this.J2] : this.rl.t(this.J2);
        }

        public TrackEncryptionBox Uo() {
            if (!this.qie) {
                return null;
            }
            int i2 = ((w6) Util.castNonNull(this.rl.f57810n)).f57851n;
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.rl.ty;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.nr.f57849n.getSampleDescriptionEncryptionBox(i2);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.isEncrypted) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public void gh() {
            this.rl.J2();
            this.J2 = 0;
            this.KN = 0;
            this.Uo = 0;
            this.xMQ = 0;
            this.qie = false;
        }

        public void mUb(o oVar, w6 w6Var) {
            this.nr = oVar;
            this.f57820O = w6Var;
            this.f57821n.format(oVar.f57849n.format);
            gh();
        }

        public long nr() {
            return !this.qie ? this.nr.f57850t[this.J2] : this.rl.Uo[this.KN];
        }

        public void qie(long j2) {
            int i2 = this.J2;
            while (true) {
                C c2 = this.rl;
                if (i2 >= c2.J2 || c2.t(i2) >= j2) {
                    return;
                }
                if (this.rl.gh[i2]) {
                    this.xMQ = i2;
                }
                i2++;
            }
        }

        public int t() {
            int i2 = !this.qie ? this.nr.Uo[this.J2] : this.rl.gh[this.J2] ? 1 : 0;
            return Uo() != null ? i2 | 1073741824 : i2;
        }

        public void ty(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.nr.f57849n.getSampleDescriptionEncryptionBox(((w6) Util.castNonNull(this.rl.f57810n)).f57851n);
            this.f57821n.format(this.nr.f57849n.format.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build());
        }

        public n(TrackOutput trackOutput, o oVar, w6 w6Var) {
            this.f57821n = trackOutput;
            this.nr = oVar;
            this.f57820O = w6Var;
            mUb(oVar, w6Var);
        }

        public void az() {
            TrackEncryptionBox trackEncryptionBoxUo = Uo();
            if (trackEncryptionBoxUo != null) {
                ParsableByteArray parsableByteArray = this.rl.HI;
                int i2 = trackEncryptionBoxUo.perSampleIvSize;
                if (i2 != 0) {
                    parsableByteArray.skipBytes(i2);
                }
                if (this.rl.Uo(this.J2)) {
                    parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
                }
            }
        }

        public int xMQ(int i2, int i3) {
            ParsableByteArray parsableByteArray;
            boolean z2;
            int i5;
            TrackEncryptionBox trackEncryptionBoxUo = Uo();
            if (trackEncryptionBoxUo == null) {
                return 0;
            }
            int length = trackEncryptionBoxUo.perSampleIvSize;
            if (length != 0) {
                parsableByteArray = this.rl.HI;
            } else {
                byte[] bArr = (byte[]) Util.castNonNull(trackEncryptionBoxUo.defaultInitializationVector);
                this.gh.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.gh;
                length = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean zUo = this.rl.Uo(this.J2);
            if (!zUo && i3 == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            byte[] data = this.mUb.getData();
            if (z2) {
                i5 = 128;
            } else {
                i5 = 0;
            }
            data[0] = (byte) (i5 | length);
            this.mUb.setPosition(0);
            this.f57821n.sampleData(this.mUb, 1, 1);
            this.f57821n.sampleData(parsableByteArray, length, 1);
            if (!z2) {
                return length + 1;
            }
            if (!zUo) {
                this.f57822t.reset(8);
                byte[] data2 = this.f57822t.getData();
                data2[0] = 0;
                data2[1] = 1;
                data2[2] = (byte) ((i3 >> 8) & 255);
                data2[3] = (byte) (i3 & 255);
                data2[4] = (byte) ((i2 >> 24) & 255);
                data2[5] = (byte) ((i2 >> 16) & 255);
                data2[6] = (byte) ((i2 >> 8) & 255);
                data2[7] = (byte) (i2 & 255);
                this.f57821n.sampleData(this.f57822t, 8, 1);
                return length + 9;
            }
            ParsableByteArray parsableByteArray3 = this.rl.HI;
            int unsignedShort = parsableByteArray3.readUnsignedShort();
            parsableByteArray3.skipBytes(-2);
            int i7 = (unsignedShort * 6) + 2;
            if (i3 != 0) {
                this.f57822t.reset(i7);
                byte[] data3 = this.f57822t.getData();
                parsableByteArray3.readBytes(data3, 0, i7);
                int i8 = (((data3[2] & UByte.MAX_VALUE) << 8) | (data3[3] & UByte.MAX_VALUE)) + i3;
                data3[2] = (byte) ((i8 >> 8) & 255);
                data3[3] = (byte) (i8 & 255);
                parsableByteArray3 = this.f57822t;
            }
            this.f57821n.sampleData(parsableByteArray3, i7, 1);
            return length + 1 + i7;
        }
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private void initExtraTracks() {
        int i2;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        TrackOutput trackOutput = this.additionalEmsgTrackOutput;
        int i3 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = 100;
        if ((this.flags & 4) != 0) {
            trackOutputArr[i2] = this.extractorOutput.track(100, 5);
            i5 = 101;
            i2++;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.nullSafeArrayCopy(this.emsgTrackOutputs, i2);
        this.emsgTrackOutputs = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(EMSG_FORMAT);
        }
        this.ceaTrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
        while (i3 < this.ceaTrackOutputs.length) {
            TrackOutput trackOutputTrack = this.extractorOutput.track(i5, 3);
            trackOutputTrack.format(this.closedCaptionFormats.get(i3));
            this.ceaTrackOutputs[i3] = trackOutputTrack;
            i3++;
            i5++;
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, C c2) throws ParserException {
        parseSenc(parsableByteArray, 0, c2);
    }

    private static boolean shouldParseContainerAtom(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227;
    }

    private static boolean shouldParseLeafAtom(int i2) {
        return i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1668576371 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1937011571 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783;
    }

    @Nullable
    protected Track modifyTrack(@Nullable Track track) {
        return track;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f57818n;
        public final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f57819t;

        public j(long j2, boolean z2, int i2) {
            this.f57818n = j2;
            this.rl = z2;
            this.f57819t = i2;
        }
    }

    public FragmentedMp4Extractor(int i2) {
        this(i2, null);
    }

    private static int checkNonNegative(int i2) throws ParserException {
        if (i2 >= 0) {
            return i2;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i2, null);
    }

    public static /* synthetic */ Extractor[] n() {
        return new Extractor[]{new FragmentedMp4Extractor()};
    }

    private void onContainerAtomRead(j.C0767j c0767j) throws ParserException {
        int i2 = c0767j.f57831n;
        if (i2 == 1836019574) {
            onMoovContainerAtomRead(c0767j);
        } else if (i2 == 1836019558) {
            onMoofContainerAtomRead(c0767j);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().nr(c0767j);
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        String str;
        String str2;
        long jScaleLargeTimestamp;
        long jScaleLargeTimestamp2;
        long unsignedInt;
        long jAdjustSampleTimestamp;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        parsableByteArray.setPosition(8);
        int iT = com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt());
        if (iT == 0) {
            str = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            str2 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, unsignedInt2);
            long j2 = this.segmentIndexEarliestPresentationTimeUs;
            long j3 = j2 != -9223372036854775807L ? j2 + jScaleLargeTimestamp : -9223372036854775807L;
            jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt2);
            unsignedInt = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = j3;
        } else {
            if (iT != 1) {
                Log.w(TAG, "Skipping unsupported emsg version: " + iT);
                return;
            }
            long unsignedInt3 = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedLongToLong(), 1000000L, unsignedInt3);
            long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt3);
            long unsignedInt4 = parsableByteArray.readUnsignedInt();
            str = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            str2 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            jScaleLargeTimestamp2 = jScaleLargeTimestamp3;
            unsignedInt = unsignedInt4;
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr, 0, parsableByteArray.bytesLeft());
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.eventMessageEncoder.encode(new EventMessage(str3, str4, jScaleLargeTimestamp2, unsignedInt, bArr)));
        int iBytesLeft = parsableByteArray2.bytesLeft();
        for (TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray2.setPosition(0);
            trackOutput.sampleData(parsableByteArray2, iBytesLeft);
        }
        if (jAdjustSampleTimestamp == -9223372036854775807L) {
            this.pendingMetadataSampleInfos.addLast(new j(jScaleLargeTimestamp, true, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        if (!this.pendingMetadataSampleInfos.isEmpty()) {
            this.pendingMetadataSampleInfos.addLast(new j(jAdjustSampleTimestamp, false, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        long j4 = jAdjustSampleTimestamp;
        for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(j4, 1, iBytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(j.n nVar, long j2) throws ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().O(nVar);
            return;
        }
        int i2 = nVar.f57831n;
        if (i2 != 1936286840) {
            if (i2 == 1701671783) {
                onEmsgLeafAtomRead(nVar.rl);
            }
        } else {
            Pair<Long, ChunkIndex> sidx = parseSidx(nVar.rl, j2);
            this.segmentIndexEarliestPresentationTimeUs = ((Long) sidx.first).longValue();
            this.extractorOutput.seekMap((SeekMap) sidx.second);
            this.haveOutputSeekMap = true;
        }
    }

    private void onMoofContainerAtomRead(j.C0767j c0767j) throws ParserException {
        parseMoof(c0767j, this.trackBundles, this.sideloadedTrack != null, this.flags, this.scratchBytes);
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(c0767j.f57832t);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.trackBundles.valueAt(i2).ty(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != -9223372036854775807L) {
            int size2 = this.trackBundles.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.trackBundles.valueAt(i3).qie(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = -9223372036854775807L;
        }
    }

    private void onMoovContainerAtomRead(j.C0767j c0767j) throws ParserException {
        int i2 = 0;
        Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(c0767j.f57832t);
        j.C0767j c0767j2 = (j.C0767j) Assertions.checkNotNull(c0767j.J2(Mp4Box.TYPE_mvex));
        SparseArray<w6> sparseArray = new SparseArray<>();
        int size = c0767j2.f57832t.size();
        long mehd = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            j.n nVar = (j.n) c0767j2.f57832t.get(i3);
            int i5 = nVar.f57831n;
            if (i5 == 1953654136) {
                Pair<Integer, w6> trex = parseTrex(nVar.rl);
                sparseArray.put(((Integer) trex.first).intValue(), (w6) trex.second);
            } else if (i5 == 1835362404) {
                mehd = parseMehd(nVar.rl);
            }
        }
        List listG = com.google.android.exoplayer2.extractor.mp4.n.g(c0767j, new GaplessInfoHolder(), mehd, drmInitDataFromAtoms, (this.flags & 16) != 0, false, new t1.CN3() { // from class: com.google.android.exoplayer2.extractor.mp4.I28
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return this.f57823n.modifyTrack((Track) obj);
            }
        });
        int size2 = listG.size();
        if (this.trackBundles.size() != 0) {
            Assertions.checkState(this.trackBundles.size() == size2);
            while (i2 < size2) {
                o oVar = (o) listG.get(i2);
                Track track = oVar.f57849n;
                this.trackBundles.get(track.id).mUb(oVar, getDefaultSampleValues(sparseArray, track.id));
                i2++;
            }
            return;
        }
        while (i2 < size2) {
            o oVar2 = (o) listG.get(i2);
            Track track2 = oVar2.f57849n;
            this.trackBundles.put(track2.id, new n(this.extractorOutput.track(i2, track2.type), oVar2, getDefaultSampleValues(sparseArray, track2.id)));
            this.durationUs = Math.max(this.durationUs, track2.durationUs);
            i2++;
        }
        this.extractorOutput.endTracks();
    }

    private void outputPendingMetadataSamples(long j2) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            j jVarRemoveFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= jVarRemoveFirst.f57819t;
            long jAdjustSampleTimestamp = jVarRemoveFirst.f57818n;
            if (jVarRemoveFirst.rl) {
                jAdjustSampleTimestamp += j2;
            }
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            long j3 = jAdjustSampleTimestamp;
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j3, 1, jVarRemoveFirst.f57819t, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(j.C0767j c0767j, SparseArray<n> sparseArray, boolean z2, int i2, byte[] bArr) throws ParserException {
        int size = c0767j.nr.size();
        for (int i3 = 0; i3 < size; i3++) {
            j.C0767j c0767j2 = (j.C0767j) c0767j.nr.get(i3);
            if (c0767j2.f57831n == 1953653094) {
                parseTraf(c0767j2, sparseArray, z2, i2, bArr);
            }
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, C c2) throws ParserException {
        parsableByteArray.setPosition(8);
        int i2 = parsableByteArray.readInt();
        if ((com.google.android.exoplayer2.extractor.mp4.j.rl(i2) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt == 1) {
            c2.nr += com.google.android.exoplayer2.extractor.mp4.j.t(i2) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
        } else {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + unsignedIntToInt, null);
        }
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, C c2) throws ParserException {
        int i2;
        int i3 = trackEncryptionBox.perSampleIvSize;
        parsableByteArray.setPosition(8);
        if ((com.google.android.exoplayer2.extractor.mp4.j.rl(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt > c2.J2) {
            throw ParserException.createForMalformedContainer("Saiz sample count " + unsignedIntToInt + " is greater than fragment sample count" + c2.J2, null);
        }
        if (unsignedByte == 0) {
            boolean[] zArr = c2.az;
            i2 = 0;
            for (int i5 = 0; i5 < unsignedIntToInt; i5++) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                i2 += unsignedByte2;
                zArr[i5] = unsignedByte2 > i3;
            }
        } else {
            i2 = unsignedByte * unsignedIntToInt;
            Arrays.fill(c2.az, 0, unsignedIntToInt, unsignedByte > i3);
        }
        Arrays.fill(c2.az, unsignedIntToInt, c2.J2, false);
        if (i2 > 0) {
            c2.nr(i2);
        }
    }

    private static void parseSampleGroups(j.C0767j c0767j, @Nullable String str, C c2) throws ParserException {
        byte[] bArr = null;
        ParsableByteArray parsableByteArray = null;
        ParsableByteArray parsableByteArray2 = null;
        for (int i2 = 0; i2 < c0767j.f57832t.size(); i2++) {
            j.n nVar = (j.n) c0767j.f57832t.get(i2);
            ParsableByteArray parsableByteArray3 = nVar.rl;
            int i3 = nVar.f57831n;
            if (i3 == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (i3 == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int iT = com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (iT == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int iT2 = com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        if (iT2 == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (iT2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int i5 = (unsignedByte & 240) >> 4;
        int i7 = unsignedByte & 15;
        boolean z2 = parsableByteArray2.readUnsignedByte() == 1;
        if (z2) {
            int unsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (unsignedByte2 == 0) {
                int unsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[unsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, unsignedByte3);
            }
            c2.qie = true;
            c2.ty = new TrackEncryptionBox(z2, str, unsignedByte2, bArr2, i5, i7, bArr);
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i2, C c2) throws ParserException {
        parsableByteArray.setPosition(i2 + 8);
        int iRl = com.google.android.exoplayer2.extractor.mp4.j.rl(parsableByteArray.readInt());
        if ((iRl & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iRl & 2) != 0;
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            Arrays.fill(c2.az, 0, c2.J2, false);
            return;
        }
        if (unsignedIntToInt == c2.J2) {
            Arrays.fill(c2.az, 0, unsignedIntToInt, z2);
            c2.nr(parsableByteArray.bytesLeft());
            c2.rl(parsableByteArray);
        } else {
            throw ParserException.createForMalformedContainer("Senc sample count " + unsignedIntToInt + " is different from fragment sample count" + c2.J2, null);
        }
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int iT = com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (iT == 0) {
            unsignedLongToLong = parsableByteArray.readUnsignedInt();
            unsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            unsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j3 = j2 + unsignedLongToLong2;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
        parsableByteArray.skipBytes(2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j4 = j3;
        long jScaleLargeTimestamp2 = jScaleLargeTimestamp;
        int i2 = 0;
        while (i2 < unsignedShort) {
            int i3 = parsableByteArray.readInt();
            if ((Integer.MIN_VALUE & i3) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i2] = i3 & Integer.MAX_VALUE;
            jArr[i2] = j4;
            jArr3[i2] = jScaleLargeTimestamp2;
            unsignedLongToLong += unsignedInt2;
            long[] jArr4 = jArr3;
            jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
            jArr2[i2] = jScaleLargeTimestamp2 - jArr4[i2];
            parsableByteArray.skipBytes(4);
            j4 += (long) iArr[i2];
            i2++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jScaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    @Nullable
    private static n parseTfhd(ParsableByteArray parsableByteArray, SparseArray<n> sparseArray, boolean z2) {
        parsableByteArray.setPosition(8);
        int iRl = com.google.android.exoplayer2.extractor.mp4.j.rl(parsableByteArray.readInt());
        n nVarValueAt = z2 ? sparseArray.valueAt(0) : sparseArray.get(parsableByteArray.readInt());
        if (nVarValueAt == null) {
            return null;
        }
        if ((iRl & 1) != 0) {
            long unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            C c2 = nVarValueAt.rl;
            c2.f57812t = unsignedLongToLong;
            c2.nr = unsignedLongToLong;
        }
        w6 w6Var = nVarValueAt.f57820O;
        nVarValueAt.rl.f57810n = new w6((iRl & 2) != 0 ? parsableByteArray.readInt() - 1 : w6Var.f57851n, (iRl & 8) != 0 ? parsableByteArray.readInt() : w6Var.rl, (iRl & 16) != 0 ? parsableByteArray.readInt() : w6Var.f57852t, (iRl & 32) != 0 ? parsableByteArray.readInt() : w6Var.nr);
        return nVarValueAt;
    }

    private static Pair<Integer, w6> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new w6(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
    }

    private static int parseTrun(n nVar, int i2, int i3, ParsableByteArray parsableByteArray, int i5) throws ParserException {
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        parsableByteArray.setPosition(8);
        int iRl = com.google.android.exoplayer2.extractor.mp4.j.rl(parsableByteArray.readInt());
        Track track = nVar.nr.f57849n;
        C c2 = nVar.rl;
        w6 w6Var = (w6) Util.castNonNull(c2.f57810n);
        c2.KN[i2] = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = c2.Uo;
        long j2 = c2.f57812t;
        jArr[i2] = j2;
        if ((iRl & 1) != 0) {
            jArr[i2] = j2 + ((long) parsableByteArray.readInt());
        }
        boolean z3 = (iRl & 4) != 0;
        int i14 = w6Var.nr;
        if (z3) {
            i14 = parsableByteArray.readInt();
        }
        boolean z4 = (iRl & 256) != 0;
        boolean z5 = (iRl & 512) != 0;
        boolean z6 = (iRl & 1024) != 0;
        boolean z7 = (iRl & 2048) != 0;
        long[] jArr2 = track.editListDurations;
        long j3 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j3 = ((long[]) Util.castNonNull(track.editListMediaTimes))[0];
        }
        int[] iArr = c2.xMQ;
        long[] jArr3 = c2.mUb;
        boolean[] zArr = c2.gh;
        boolean z9 = z7;
        boolean z10 = track.type == 2 && (i3 & 1) != 0;
        int i15 = i5 + c2.KN[i2];
        boolean z11 = z3;
        long j4 = track.timescale;
        long j5 = c2.Ik;
        int i16 = i5;
        while (i16 < i15) {
            if (z4) {
                i7 = parsableByteArray.readInt();
                z2 = z10;
            } else {
                z2 = z10;
                i7 = w6Var.rl;
            }
            int iCheckNonNegative = checkNonNegative(i7);
            if (z5) {
                i9 = parsableByteArray.readInt();
                i8 = i15;
            } else {
                i8 = i15;
                i9 = w6Var.f57852t;
            }
            int iCheckNonNegative2 = checkNonNegative(i9);
            if (z6) {
                i10 = iCheckNonNegative2;
                i11 = parsableByteArray.readInt();
            } else if (i16 == 0 && z11) {
                i10 = iCheckNonNegative2;
                i11 = i14;
            } else {
                i10 = iCheckNonNegative2;
                i11 = w6Var.nr;
            }
            if (z9) {
                i12 = i11;
                i13 = parsableByteArray.readInt();
            } else {
                i12 = i11;
                i13 = 0;
            }
            int i17 = i16;
            long jScaleLargeTimestamp = Util.scaleLargeTimestamp((((long) i13) + j5) - j3, 1000000L, j4);
            jArr3[i17] = jScaleLargeTimestamp;
            if (!c2.f57811r) {
                jArr3[i17] = jScaleLargeTimestamp + nVar.nr.KN;
            }
            iArr[i17] = i10;
            zArr[i17] = ((i12 >> 16) & 1) == 0 && (!z2 || i17 == 0);
            j5 += (long) iCheckNonNegative;
            i16 = i17 + 1;
            i15 = i8;
            z10 = z2;
        }
        int i18 = i15;
        c2.Ik = j5;
        return i18;
    }

    private static void parseTruns(j.C0767j c0767j, n nVar, int i2) throws ParserException {
        List list = c0767j.f57832t;
        int size = list.size();
        int i3 = 0;
        int i5 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            j.n nVar2 = (j.n) list.get(i7);
            if (nVar2.f57831n == 1953658222) {
                ParsableByteArray parsableByteArray = nVar2.rl;
                parsableByteArray.setPosition(12);
                int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i5 += unsignedIntToInt;
                    i3++;
                }
            }
        }
        nVar.KN = 0;
        nVar.Uo = 0;
        nVar.J2 = 0;
        nVar.rl.O(i3, i5);
        int i8 = 0;
        int trun = 0;
        for (int i9 = 0; i9 < size; i9++) {
            j.n nVar3 = (j.n) list.get(i9);
            if (nVar3.f57831n == 1953658222) {
                trun = parseTrun(nVar, i8, i2, nVar3.rl, trun);
                i8++;
            }
        }
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, C c2, byte[] bArr) throws ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, c2);
        }
    }

    private void processAtomEnded(long j2) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().rl == j2) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j2 = this.atomSize;
        if (j2 == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j2 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().rl;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - ((long) this.atomHeaderBytesRead);
        int i2 = this.atomType;
        if ((i2 == 1836019558 || i2 == 1835295092) && !this.haveOutputSeekMap) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
            this.haveOutputSeekMap = true;
        }
        if (this.atomType == 1836019558) {
            int size = this.trackBundles.size();
            for (int i3 = 0; i3 < size; i3++) {
                C c2 = this.trackBundles.valueAt(i3).rl;
                c2.rl = position;
                c2.nr = position;
                c2.f57812t = position;
            }
        }
        int i5 = this.atomType;
        if (i5 == 1835295092) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i5)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new j.C0767j(this.atomType, position2));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            long j3 = this.atomSize;
            if (j3 > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) j3);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            if (this.atomSize > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) throws IOException {
        int i2 = ((int) this.atomSize) - this.atomHeaderBytesRead;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), 8, i2);
            onLeafAtomRead(new j.n(this.atomType, parsableByteArray), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i2);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void readEncryptionData(ExtractorInput extractorInput) throws IOException {
        int size = this.trackBundles.size();
        long j2 = Long.MAX_VALUE;
        n nVarValueAt = null;
        for (int i2 = 0; i2 < size; i2++) {
            C c2 = this.trackBundles.valueAt(i2).rl;
            if (c2.ck) {
                long j3 = c2.nr;
                if (j3 < j2) {
                    nVarValueAt = this.trackBundles.valueAt(i2);
                    j2 = j3;
                }
            }
        }
        if (nVarValueAt == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j2 - extractorInput.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        extractorInput.skipFully(position);
        nVarValueAt.rl.n(extractorInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean readSample(ExtractorInput extractorInput) throws IOException {
        boolean z2;
        int i2;
        int iSampleData;
        n nextTrackBundle = this.currentTrackBundle;
        Throwable th = null;
        if (nextTrackBundle == null) {
            nextTrackBundle = getNextTrackBundle(this.trackBundles);
            if (nextTrackBundle == null) {
                int position = (int) (this.endOfMdatPosition - extractorInput.getPosition());
                if (position < 0) {
                    throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                extractorInput.skipFully(position);
                enterReadingAtomHeaderState();
                return false;
            }
            int iNr = (int) (nextTrackBundle.nr() - extractorInput.getPosition());
            if (iNr < 0) {
                Log.w(TAG, "Ignoring negative offset to sample data.");
                iNr = 0;
            }
            extractorInput.skipFully(iNr);
            this.currentTrackBundle = nextTrackBundle;
        }
        int i3 = 4;
        int i5 = 1;
        if (this.parserState == 3) {
            int iJ2 = nextTrackBundle.J2();
            this.sampleSize = iJ2;
            if (nextTrackBundle.J2 < nextTrackBundle.xMQ) {
                extractorInput.skipFully(iJ2);
                nextTrackBundle.az();
                if (!nextTrackBundle.KN()) {
                    this.currentTrackBundle = null;
                }
                this.parserState = 3;
                return true;
            }
            if (nextTrackBundle.nr.f57849n.sampleTransformation == 1) {
                this.sampleSize = iJ2 - 8;
                extractorInput.skipFully(8);
            }
            if ("audio/ac4".equals(nextTrackBundle.nr.f57849n.format.sampleMimeType)) {
                this.sampleBytesWritten = nextTrackBundle.xMQ(this.sampleSize, 7);
                Ac4Util.getAc4SampleHeader(this.sampleSize, this.scratch);
                nextTrackBundle.f57821n.sampleData(this.scratch, 7);
                this.sampleBytesWritten += 7;
            } else {
                this.sampleBytesWritten = nextTrackBundle.xMQ(this.sampleSize, 0);
            }
            this.sampleSize += this.sampleBytesWritten;
            this.parserState = 4;
            this.sampleCurrentNalBytesRemaining = 0;
        }
        Track track = nextTrackBundle.nr.f57849n;
        TrackOutput trackOutput = nextTrackBundle.f57821n;
        long jO = nextTrackBundle.O();
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            jO = timestampAdjuster.adjustSampleTimestamp(jO);
        }
        if (track.nalUnitLengthFieldLength == 0) {
            z2 = 1;
            while (true) {
                int i7 = this.sampleBytesWritten;
                int i8 = this.sampleSize;
                if (i7 >= i8) {
                    break;
                }
                this.sampleBytesWritten += trackOutput.sampleData((DataReader) extractorInput, i8 - i7, false);
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i9 = track.nalUnitLengthFieldLength;
            int i10 = i9 + 1;
            int i11 = 4 - i9;
            while (this.sampleBytesWritten < this.sampleSize) {
                int i12 = this.sampleCurrentNalBytesRemaining;
                if (i12 == 0) {
                    extractorInput.readFully(data, i11, i10);
                    this.nalPrefix.setPosition(0);
                    int i13 = this.nalPrefix.readInt();
                    if (i13 < i5) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", th);
                    }
                    this.sampleCurrentNalBytesRemaining = i13 - 1;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, i3);
                    trackOutput.sampleData(this.nalPrefix, i5);
                    this.processSeiNalUnitPayload = (this.ceaTrackOutputs.length <= 0 || !NalUnitUtil.isNalUnitSei(track.format.sampleMimeType, data[i3])) ? 0 : i5;
                    this.sampleBytesWritten += 5;
                    this.sampleSize += i11;
                } else {
                    if (this.processSeiNalUnitPayload) {
                        this.nalBuffer.reset(i12);
                        extractorInput.readFully(this.nalBuffer.getData(), 0, this.sampleCurrentNalBytesRemaining);
                        trackOutput.sampleData(this.nalBuffer, this.sampleCurrentNalBytesRemaining);
                        iSampleData = this.sampleCurrentNalBytesRemaining;
                        int iUnescapeStream = NalUnitUtil.unescapeStream(this.nalBuffer.getData(), this.nalBuffer.limit());
                        i2 = i5;
                        this.nalBuffer.setPosition("video/hevc".equals(track.format.sampleMimeType) ? 1 : 0);
                        this.nalBuffer.setLimit(iUnescapeStream);
                        CeaUtil.consume(jO, this.nalBuffer, this.ceaTrackOutputs);
                    } else {
                        i2 = i5;
                        iSampleData = trackOutput.sampleData((DataReader) extractorInput, i12, false);
                    }
                    this.sampleBytesWritten += iSampleData;
                    this.sampleCurrentNalBytesRemaining -= iSampleData;
                    i5 = i2;
                    th = null;
                    i3 = 4;
                }
            }
            z2 = i5;
        }
        int iT = nextTrackBundle.t();
        TrackEncryptionBox trackEncryptionBoxUo = nextTrackBundle.Uo();
        trackOutput.sampleMetadata(jO, iT, this.sampleSize, 0, trackEncryptionBoxUo != null ? trackEncryptionBoxUo.cryptoData : null);
        outputPendingMetadataSamples(jO);
        if (!nextTrackBundle.KN()) {
            this.currentTrackBundle = null;
        }
        this.parserState = 3;
        return z2;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        enterReadingAtomHeaderState();
        initExtraTracks();
        Track track = this.sideloadedTrack;
        if (track != null) {
            this.trackBundles.put(0, new n(extractorOutput.track(0, track.type), new o(this.sideloadedTrack, new long[0], new int[0], 0, new long[0], new int[0], 0L), new w6(0, 0, 0, 0)));
            this.extractorOutput.endTracks();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            int i2 = this.parserState;
            if (i2 != 0) {
                if (i2 == 1) {
                    readAtomPayload(extractorInput);
                } else if (i2 == 2) {
                    readEncryptionData(extractorInput);
                } else if (readSample(extractorInput)) {
                    return 0;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j2, long j3) {
        int size = this.trackBundles.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.trackBundles.valueAt(i2).gh();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.pendingSeekTimeUs = j3;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    public FragmentedMp4Extractor(int i2, @Nullable TimestampAdjuster timestampAdjuster) {
        this(i2, timestampAdjuster, null, Collections.EMPTY_LIST);
    }

    private w6 getDefaultSampleValues(SparseArray<w6> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (w6) Assertions.checkNotNull(sparseArray.get(i2));
    }

    @Nullable
    private static DrmInitData getDrmInitDataFromAtoms(List<j.n> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            j.n nVar = list.get(i2);
            if (nVar.f57831n == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = nVar.rl.getData();
                UUID uuid = PsshAtomUtil.parseUuid(data);
                if (uuid == null) {
                    Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, "video/mp4", data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @Nullable
    private static n getNextTrackBundle(SparseArray<n> sparseArray) {
        int size = sparseArray.size();
        n nVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            n nVarValueAt = sparseArray.valueAt(i2);
            if ((nVarValueAt.qie || nVarValueAt.J2 != nVarValueAt.nr.rl) && (!nVarValueAt.qie || nVarValueAt.KN != nVarValueAt.rl.f57809O)) {
                long jNr = nVarValueAt.nr();
                if (jNr < j2) {
                    nVar = nVarValueAt;
                    j2 = jNr;
                }
            }
        }
        return nVar;
    }

    private static void parseTraf(j.C0767j c0767j, SparseArray<n> sparseArray, boolean z2, int i2, byte[] bArr) throws ParserException {
        String str;
        n tfhd = parseTfhd(((j.n) Assertions.checkNotNull(c0767j.Uo(Mp4Box.TYPE_tfhd))).rl, sparseArray, z2);
        if (tfhd != null) {
            C c2 = tfhd.rl;
            long j2 = c2.Ik;
            boolean z3 = c2.f57811r;
            tfhd.gh();
            tfhd.qie = true;
            j.n nVarUo = c0767j.Uo(Mp4Box.TYPE_tfdt);
            if (nVarUo != null && (i2 & 2) == 0) {
                c2.Ik = parseTfdt(nVarUo.rl);
                c2.f57811r = true;
            } else {
                c2.Ik = j2;
                c2.f57811r = z3;
            }
            parseTruns(c0767j, tfhd, i2);
            TrackEncryptionBox sampleDescriptionEncryptionBox = tfhd.nr.f57849n.getSampleDescriptionEncryptionBox(((w6) Assertions.checkNotNull(c2.f57810n)).f57851n);
            j.n nVarUo2 = c0767j.Uo(Mp4Box.TYPE_saiz);
            if (nVarUo2 != null) {
                parseSaiz((TrackEncryptionBox) Assertions.checkNotNull(sampleDescriptionEncryptionBox), nVarUo2.rl, c2);
            }
            j.n nVarUo3 = c0767j.Uo(Mp4Box.TYPE_saio);
            if (nVarUo3 != null) {
                parseSaio(nVarUo3.rl, c2);
            }
            j.n nVarUo4 = c0767j.Uo(Mp4Box.TYPE_senc);
            if (nVarUo4 != null) {
                parseSenc(nVarUo4.rl, c2);
            }
            if (sampleDescriptionEncryptionBox != null) {
                str = sampleDescriptionEncryptionBox.schemeType;
            } else {
                str = null;
            }
            parseSampleGroups(c0767j, str, c2);
            int size = c0767j.f57832t.size();
            for (int i3 = 0; i3 < size; i3++) {
                j.n nVar = (j.n) c0767j.f57832t.get(i3);
                if (nVar.f57831n == 1970628964) {
                    parseUuid(nVar.rl, c2, bArr);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return aC.rl(extractorInput);
    }

    public FragmentedMp4Extractor(int i2, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track) {
        this(i2, timestampAdjuster, track, Collections.EMPTY_LIST);
    }

    public FragmentedMp4Extractor(int i2, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list) {
        this(i2, timestampAdjuster, track, list, null);
    }

    public FragmentedMp4Extractor(int i2, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list, @Nullable TrackOutput trackOutput) {
        this.flags = i2;
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new EventMessageEncoder();
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.nalBuffer = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new ParsableByteArray(bArr);
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.durationUs = -9223372036854775807L;
        this.pendingSeekTimeUs = -9223372036854775807L;
        this.segmentIndexEarliestPresentationTimeUs = -9223372036854775807L;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new TrackOutput[0];
        this.ceaTrackOutputs = new TrackOutput[0];
    }
}
