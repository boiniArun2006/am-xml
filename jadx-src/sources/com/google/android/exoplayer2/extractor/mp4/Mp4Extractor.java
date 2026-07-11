package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.container.Mp4Box;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.extractor.mp4.j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Mp4Extractor implements Extractor, SeekMap {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.mp4.fuX
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp4Extractor.t();
        }
    };
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final ArrayDeque<j.C0767j> containerAtoms;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;

    @Nullable
    private MotionPhotoMetadata motionPhotoMetadata;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private final Dsr sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private j[] tracks;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp4Extractor() {
        this(0);
    }

    private static int brandToFileType(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] calculateAccumulatedSampleSizes(j[] jVarArr) {
        long[][] jArr = new long[jVarArr.length][];
        int[] iArr = new int[jVarArr.length];
        long[] jArr2 = new long[jVarArr.length];
        boolean[] zArr = new boolean[jVarArr.length];
        for (int i2 = 0; i2 < jVarArr.length; i2++) {
            jArr[i2] = new long[jVarArr[i2].rl.rl];
            jArr2[i2] = jVarArr[i2].rl.J2[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < jVarArr.length) {
            long j3 = Long.MAX_VALUE;
            int i5 = -1;
            for (int i7 = 0; i7 < jVarArr.length; i7++) {
                if (!zArr[i7]) {
                    long j4 = jArr2[i7];
                    if (j4 <= j3) {
                        i5 = i7;
                        j3 = j4;
                    }
                }
            }
            int i8 = iArr[i5];
            long[] jArr3 = jArr[i5];
            jArr3[i8] = j2;
            o oVar = jVarArr[i5].rl;
            j2 += (long) oVar.nr[i8];
            int i9 = i8 + 1;
            iArr[i5] = i9;
            if (i9 < jArr3.length) {
                jArr2[i5] = oVar.J2[i9];
            } else {
                zArr[i5] = true;
                i3++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        this.extractorOutput.track(0, 4).format(new Format.Builder().setMetadata(this.motionPhotoMetadata == null ? null : new Metadata(this.motionPhotoMetadata)).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
    }

    public static /* synthetic */ Track rl(Track track) {
        return track;
    }

    private static boolean shouldParseContainerAtom(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i2) {
        return i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        return getSeekPoints(j2, -1);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    private static final class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f57824O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Track f57825n;
        public final TrueHdSampleRechunker nr;
        public final o rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final TrackOutput f57826t;

        public j(Track track, o oVar, TrackOutput trackOutput) {
            TrueHdSampleRechunker trueHdSampleRechunker;
            this.f57825n = track;
            this.rl = oVar;
            this.f57826t = trackOutput;
            if ("audio/true-hd".equals(track.format.sampleMimeType)) {
                trueHdSampleRechunker = new TrueHdSampleRechunker();
            } else {
                trueHdSampleRechunker = null;
            }
            this.nr = trueHdSampleRechunker;
        }
    }

    public Mp4Extractor(int i2) {
        this.flags = i2;
        this.parserState = (i2 & 4) != 0 ? 3 : 0;
        this.sefReader = new Dsr();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new j[0];
    }

    private int getTrackIndexOfNextReadSample(long j2) {
        int i2 = -1;
        int i3 = -1;
        int i5 = 0;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        boolean z3 = true;
        long j5 = Long.MAX_VALUE;
        while (true) {
            j[] jVarArr = this.tracks;
            if (i5 >= jVarArr.length) {
                break;
            }
            j jVar = jVarArr[i5];
            int i7 = jVar.f57824O;
            o oVar = jVar.rl;
            if (i7 != oVar.rl) {
                long j6 = oVar.f57850t[i7];
                long j7 = ((long[][]) Util.castNonNull(this.accumulatedSampleSizes))[i5][i7];
                long j9 = j6 - j2;
                boolean z4 = j9 < 0 || j9 >= RELOAD_MINIMUM_SEEK_DISTANCE;
                if ((!z4 && z3) || (z4 == z3 && j9 < j5)) {
                    z3 = z4;
                    j4 = j7;
                    i3 = i5;
                    j5 = j9;
                }
                if (j7 < j3) {
                    z2 = z4;
                    j3 = j7;
                    i2 = i5;
                }
            }
            i5++;
        }
        return (j3 == Long.MAX_VALUE || !z2 || j4 < j3 + MAXIMUM_READ_AHEAD_BYTES_STREAM) ? i3 : i2;
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) throws IOException {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        n.O(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    private void processAtomEnded(long j2) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().rl == j2) {
            j.C0767j c0767jPop = this.containerAtoms.pop();
            if (c0767jPop.f57831n == 1836019574) {
                processMoovAtom(c0767jPop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().nr(c0767jPop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int iBrandToFileType = brandToFileType(parsableByteArray.readInt());
        if (iBrandToFileType != 0) {
            return iBrandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int iBrandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (iBrandToFileType2 != 0) {
                return iBrandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(j.C0767j c0767j) throws ParserException {
        Metadata metadata;
        Metadata metadata2;
        List list;
        int i2;
        int i3;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        boolean z4 = this.fileType == 1;
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        j.n nVarUo = c0767j.Uo(Mp4Box.TYPE_udta);
        if (nVarUo != null) {
            Pair pairTe = n.te(nVarUo);
            Metadata metadata3 = (Metadata) pairTe.first;
            Metadata metadata4 = (Metadata) pairTe.second;
            if (metadata3 != null) {
                gaplessInfoHolder.setFromMetadata(metadata3);
            }
            metadata = metadata4;
            metadata2 = metadata3;
        } else {
            metadata = null;
            metadata2 = null;
        }
        j.C0767j c0767jJ2 = c0767j.J2(Mp4Box.TYPE_meta);
        Metadata metadataTy = c0767jJ2 != null ? n.ty(c0767jJ2) : null;
        List listG = n.g(c0767j, gaplessInfoHolder, -9223372036854775807L, null, (this.flags & 1) != 0, z4, new t1.CN3() { // from class: com.google.android.exoplayer2.extractor.mp4.CN3
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return Mp4Extractor.rl((Track) obj);
            }
        });
        int size = listG.size();
        long j2 = -9223372036854775807L;
        int i5 = 0;
        int size2 = -1;
        while (i5 < size) {
            o oVar = (o) listG.get(i5);
            if (oVar.rl == 0) {
                list = listG;
                i2 = size;
                i3 = i5;
                z2 = z3;
            } else {
                Track track = oVar.f57849n;
                long j3 = j2;
                long j4 = track.durationUs;
                if (j4 == -9223372036854775807L) {
                    j4 = oVar.KN;
                }
                long jMax = Math.max(j3, j4);
                list = listG;
                i2 = size;
                j jVar = new j(track, oVar, this.extractorOutput.track(i5, track.type));
                i3 = i5;
                int i7 = "audio/true-hd".equals(track.format.sampleMimeType) ? oVar.f57848O * 16 : oVar.f57848O + 30;
                Format.Builder builderBuildUpon = track.format.buildUpon();
                builderBuildUpon.setMaxInputSize(i7);
                if (track.type != 2 || j4 <= 0) {
                    z2 = true;
                } else {
                    int i8 = oVar.rl;
                    z2 = true;
                    if (i8 > 1) {
                        builderBuildUpon.setFrameRate(i8 / (j4 / 1000000.0f));
                    }
                }
                Wre.gh(track.type, gaplessInfoHolder, builderBuildUpon);
                Wre.qie(track.type, metadata2, metadataTy, builderBuildUpon, metadata, this.slowMotionMetadataEntries.isEmpty() ? null : new Metadata(this.slowMotionMetadataEntries));
                jVar.f57826t.format(builderBuildUpon.build());
                if (track.type == 2 && size2 == -1) {
                    size2 = arrayList.size();
                }
                arrayList.add(jVar);
                j2 = jMax;
            }
            i5 = i3 + 1;
            z3 = z2;
            listG = list;
            size = i2;
        }
        this.firstVideoTrackIndex = size2;
        this.durationUs = j2;
        j[] jVarArr = (j[]) arrayList.toArray(new j[0]);
        this.tracks = jVarArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(jVarArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private void processUnparsedAtom(long j2) {
        if (this.atomType == 1836086884) {
            int i2 = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new MotionPhotoMetadata(0L, j2, -9223372036854775807L, j2 + ((long) i2), this.atomSize - ((long) i2));
        }
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException {
        j.C0767j c0767jPeek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
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
            if (length == -1 && (c0767jPeek = this.containerAtoms.peek()) != null) {
                length = c0767jPeek.rl;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j3 = this.atomSize;
            int i2 = this.atomHeaderBytesRead;
            long j4 = (position + j3) - ((long) i2);
            if (j3 != i2 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new j.C0767j(this.atomType, j4));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j4);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            Assertions.checkState(this.atomHeaderBytesRead == 8);
            Assertions.checkState(this.atomSize <= 2147483647L);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - ((long) this.atomHeaderBytesRead));
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private boolean readAtomPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z2;
        long j2 = this.atomSize - ((long) this.atomHeaderBytesRead);
        long position = extractorInput.getPosition() + j2;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), this.atomHeaderBytesRead, (int) j2);
            if (this.atomType == 1718909296) {
                this.fileType = processFtypAtom(parsableByteArray);
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().O(new j.n(this.atomType, parsableByteArray));
            }
        } else {
            if (j2 >= RELOAD_MINIMUM_SEEK_DISTANCE) {
                positionHolder.position = extractorInput.getPosition() + j2;
                z2 = true;
                processAtomEnded(position);
                return (z2 || this.parserState == 2) ? false : true;
            }
            extractorInput.skipFully((int) j2);
        }
        z2 = false;
        processAtomEnded(position);
        if (z2) {
        }
    }

    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i2;
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        j jVar = this.tracks[this.sampleTrackIndex];
        TrackOutput trackOutput = jVar.f57826t;
        int i3 = jVar.f57824O;
        o oVar = jVar.rl;
        long j2 = oVar.f57850t[i3];
        int i5 = oVar.nr[i3];
        TrueHdSampleRechunker trueHdSampleRechunker = jVar.nr;
        long j3 = (j2 - position) + ((long) this.sampleBytesRead);
        if (j3 < 0 || j3 >= RELOAD_MINIMUM_SEEK_DISTANCE) {
            positionHolder.position = j2;
            return 1;
        }
        if (jVar.f57825n.sampleTransformation == 1) {
            j3 += 8;
            i5 -= 8;
        }
        extractorInput.skipFully((int) j3);
        Track track = jVar.f57825n;
        if (track.nalUnitLengthFieldLength == 0) {
            if ("audio/ac4".equals(track.format.sampleMimeType)) {
                if (this.sampleBytesWritten == 0) {
                    Ac4Util.getAc4SampleHeader(i5, this.scratch);
                    trackOutput.sampleData(this.scratch, 7);
                    this.sampleBytesWritten += 7;
                }
                i5 += 7;
            } else if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i7 = this.sampleBytesWritten;
                if (i7 >= i5) {
                    break;
                }
                int iSampleData = trackOutput.sampleData((DataReader) extractorInput, i5 - i7, false);
                this.sampleBytesRead += iSampleData;
                this.sampleBytesWritten += iSampleData;
                this.sampleCurrentNalBytesRemaining -= iSampleData;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i8 = jVar.f57825n.nalUnitLengthFieldLength;
            int i9 = 4 - i8;
            while (this.sampleBytesWritten < i5) {
                int i10 = this.sampleCurrentNalBytesRemaining;
                if (i10 == 0) {
                    extractorInput.readFully(data, i9, i8);
                    this.sampleBytesRead += i8;
                    this.nalLength.setPosition(0);
                    int i11 = this.nalLength.readInt();
                    if (i11 < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.sampleCurrentNalBytesRemaining = i11;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                    i5 += i9;
                } else {
                    int iSampleData2 = trackOutput.sampleData((DataReader) extractorInput, i10, false);
                    this.sampleBytesRead += iSampleData2;
                    this.sampleBytesWritten += iSampleData2;
                    this.sampleCurrentNalBytesRemaining -= iSampleData2;
                }
            }
        }
        int i12 = i5;
        o oVar2 = jVar.rl;
        long j4 = oVar2.J2[i3];
        int i13 = oVar2.Uo[i3];
        if (trueHdSampleRechunker != null) {
            i2 = 0;
            trueHdSampleRechunker.sampleMetadata(trackOutput, j4, i13, i12, 0, null);
            if (i3 + 1 == jVar.rl.rl) {
                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
            }
        } else {
            i2 = 0;
            trackOutput.sampleMetadata(j4, i13, i12, 0, null);
        }
        jVar.f57824O++;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = i2;
        this.sampleBytesWritten = i2;
        this.sampleCurrentNalBytesRemaining = i2;
        return i2;
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int iT = this.sefReader.t(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (iT == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return iT;
    }

    public static /* synthetic */ Extractor[] t() {
        return new Extractor[]{new Mp4Extractor()};
    }

    private void updateSampleIndex(j jVar, long j2) {
        o oVar = jVar.rl;
        int iN = oVar.n(j2);
        if (iN == -1) {
            iN = oVar.rl(j2);
        }
        jVar.f57824O = iN;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SeekMap.SeekPoints getSeekPoints(long j2, int i2) {
        long j3;
        long j4;
        long jMaybeAdjustSeekOffset;
        long j5;
        int iRl;
        j[] jVarArr = this.tracks;
        if (jVarArr.length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int i3 = i2 != -1 ? i2 : this.firstVideoTrackIndex;
        if (i3 != -1) {
            o oVar = jVarArr[i3].rl;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(oVar, j2);
            if (synchronizationSampleIndex == -1) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            j4 = oVar.J2[synchronizationSampleIndex];
            j3 = oVar.f57850t[synchronizationSampleIndex];
            if (j4 < j2 && synchronizationSampleIndex < oVar.rl - 1 && (iRl = oVar.rl(j2)) != -1 && iRl != synchronizationSampleIndex) {
                j5 = oVar.J2[iRl];
                jMaybeAdjustSeekOffset = oVar.f57850t[iRl];
            }
            if (i2 == -1) {
                int i5 = 0;
                while (true) {
                    j[] jVarArr2 = this.tracks;
                    if (i5 >= jVarArr2.length) {
                        break;
                    }
                    if (i5 != this.firstVideoTrackIndex) {
                        o oVar2 = jVarArr2[i5].rl;
                        long jMaybeAdjustSeekOffset2 = maybeAdjustSeekOffset(oVar2, j4, j3);
                        if (j5 != -9223372036854775807L) {
                            jMaybeAdjustSeekOffset = maybeAdjustSeekOffset(oVar2, j5, jMaybeAdjustSeekOffset);
                        }
                        j3 = jMaybeAdjustSeekOffset2;
                    }
                    i5++;
                }
            }
            SeekPoint seekPoint = new SeekPoint(j4, j3);
            return j5 != -9223372036854775807L ? new SeekMap.SeekPoints(seekPoint) : new SeekMap.SeekPoints(seekPoint, new SeekPoint(j5, jMaybeAdjustSeekOffset));
        }
        j3 = Long.MAX_VALUE;
        j4 = j2;
        jMaybeAdjustSeekOffset = -1;
        j5 = -9223372036854775807L;
        if (i2 == -1) {
        }
        SeekPoint seekPoint2 = new SeekPoint(j4, j3);
        if (j5 != -9223372036854775807L) {
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            int i2 = this.parserState;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i2 == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j2, long j3) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j2 == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.Uo();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (j jVar : this.tracks) {
            updateSampleIndex(jVar, j3);
            TrueHdSampleRechunker trueHdSampleRechunker = jVar.nr;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return aC.nr(extractorInput, (this.flags & 2) != 0);
    }

    private static int getSynchronizationSampleIndex(o oVar, long j2) {
        int iN = oVar.n(j2);
        if (iN == -1) {
            return oVar.rl(j2);
        }
        return iN;
    }

    private static long maybeAdjustSeekOffset(o oVar, long j2, long j3) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(oVar, j2);
        if (synchronizationSampleIndex == -1) {
            return j3;
        }
        return Math.min(oVar.f57850t[synchronizationSampleIndex], j3);
    }
}
