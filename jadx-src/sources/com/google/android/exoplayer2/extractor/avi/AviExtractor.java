package com.google.android.exoplayer2.extractor.avi;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DummyExtractorOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.xZD;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class AviExtractor implements Extractor {
    private static final int AVIIF_KEYFRAME = 16;
    public static final int FOURCC_AVI_ = 541677121;
    public static final int FOURCC_JUNK = 1263424842;
    public static final int FOURCC_LIST = 1414744396;
    public static final int FOURCC_RIFF = 1179011410;
    public static final int FOURCC_auds = 1935963489;
    public static final int FOURCC_avih = 1751742049;
    public static final int FOURCC_hdrl = 1819436136;
    public static final int FOURCC_idx1 = 829973609;
    public static final int FOURCC_movi = 1769369453;
    public static final int FOURCC_strf = 1718776947;
    public static final int FOURCC_strh = 1752331379;
    public static final int FOURCC_strl = 1819440243;
    public static final int FOURCC_strn = 1852994675;
    public static final int FOURCC_txts = 1937012852;
    public static final int FOURCC_vids = 1935960438;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_FINDING_IDX1_HEADER = 4;
    private static final int STATE_FINDING_MOVI_HEADER = 3;
    private static final int STATE_READING_HDRL_BODY = 2;
    private static final int STATE_READING_HDRL_HEADER = 1;
    private static final int STATE_READING_IDX1_BODY = 5;
    private static final int STATE_READING_SAMPLES = 6;
    private static final int STATE_SKIPPING_TO_HDRL = 0;
    private static final String TAG = "AviExtractor";
    private com.google.android.exoplayer2.extractor.avi.n aviHeader;

    @Nullable
    private Ml currentChunkReader;
    private int idx1BodySize;
    private long pendingReposition;
    private boolean seekMapHasBeenOutput;
    private int state;
    private final ParsableByteArray scratch = new ParsableByteArray(12);
    private final w6 chunkHeaderHolder = new w6();
    private ExtractorOutput extractorOutput = new DummyExtractorOutput();
    private Ml[] chunkReaders = new Ml[0];
    private long moviStart = -1;
    private long moviEnd = -1;
    private int hdrlSize = -1;
    private long durationUs = -9223372036854775807L;

    private class n implements SeekMap {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f57758n;

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public n(long j2) {
            this.f57758n = j2;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.f57758n;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2) {
            SeekMap.SeekPoints seekPointsXMQ = AviExtractor.this.chunkReaders[0].xMQ(j2);
            for (int i2 = 1; i2 < AviExtractor.this.chunkReaders.length; i2++) {
                SeekMap.SeekPoints seekPointsXMQ2 = AviExtractor.this.chunkReaders[i2].xMQ(j2);
                if (seekPointsXMQ2.first.position < seekPointsXMQ.first.position) {
                    seekPointsXMQ = seekPointsXMQ2;
                }
            }
            return seekPointsXMQ;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.state = 0;
        this.extractorOutput = extractorOutput;
        this.pendingReposition = -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    private static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f57760n;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f57761t;

        private w6() {
        }

        public void n(ParsableByteArray parsableByteArray) {
            this.f57760n = parsableByteArray.readLittleEndianInt();
            this.rl = parsableByteArray.readLittleEndianInt();
            this.f57761t = 0;
        }

        public void rl(ParsableByteArray parsableByteArray) throws ParserException {
            n(parsableByteArray);
            if (this.f57760n == 1414744396) {
                this.f57761t = parsableByteArray.readLittleEndianInt();
                return;
            }
            throw ParserException.createForMalformedContainer("LIST expected, found: " + this.f57760n, null);
        }
    }

    @Nullable
    private Ml getChunkReader(int i2) {
        for (Ml ml : this.chunkReaders) {
            if (ml.mUb(i2)) {
                return ml;
            }
        }
        return null;
    }

    @Nullable
    private Ml processStreamList(I28 i28, int i2) {
        com.google.android.exoplayer2.extractor.avi.w6 w6Var = (com.google.android.exoplayer2.extractor.avi.w6) i28.rl(com.google.android.exoplayer2.extractor.avi.w6.class);
        Wre wre = (Wre) i28.rl(Wre.class);
        if (w6Var == null) {
            Log.w(TAG, "Missing Stream Header");
            return null;
        }
        if (wre == null) {
            Log.w(TAG, "Missing Stream Format");
            return null;
        }
        long jN = w6Var.n();
        Format format = wre.f57767n;
        Format.Builder builderBuildUpon = format.buildUpon();
        builderBuildUpon.setId(i2);
        int i3 = w6Var.J2;
        if (i3 != 0) {
            builderBuildUpon.setMaxInputSize(i3);
        }
        CN3 cn3 = (CN3) i28.rl(CN3.class);
        if (cn3 != null) {
            builderBuildUpon.setLabel(cn3.f57762n);
        }
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != 1 && trackType != 2) {
            return null;
        }
        TrackOutput trackOutputTrack = this.extractorOutput.track(i2, trackType);
        trackOutputTrack.format(builderBuildUpon.build());
        Ml ml = new Ml(i2, trackType, jN, w6Var.f57770O, trackOutputTrack);
        this.durationUs = jN;
        return ml;
    }

    private boolean resolvePendingReposition(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z2;
        if (this.pendingReposition != -1) {
            long position = extractorInput.getPosition();
            long j2 = this.pendingReposition;
            if (j2 < position || j2 > RELOAD_MINIMUM_SEEK_DISTANCE + position) {
                positionHolder.position = j2;
                z2 = true;
            } else {
                extractorInput.skipFully((int) (j2 - position));
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.pendingReposition = -1L;
        return z2;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j2, long j3) {
        this.pendingReposition = -1L;
        this.currentChunkReader = null;
        for (Ml ml : this.chunkReaders) {
            ml.HI(j2);
        }
        if (j2 != 0) {
            this.state = 6;
        } else if (this.chunkReaders.length == 0) {
            this.state = 0;
        } else {
            this.state = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 12);
        this.scratch.setPosition(0);
        if (this.scratch.readLittleEndianInt() != 1179011410) {
            return false;
        }
        this.scratch.skipBytes(4);
        return this.scratch.readLittleEndianInt() == 541677121;
    }

    private static void alignInputToEvenPosition(ExtractorInput extractorInput) throws IOException {
        if ((extractorInput.getPosition() & 1) == 1) {
            extractorInput.skipFully(1);
        }
    }

    private void parseHdrlBody(ParsableByteArray parsableByteArray) throws IOException {
        I28 i28T = I28.t(1819436136, parsableByteArray);
        if (i28T.getType() == 1819436136) {
            com.google.android.exoplayer2.extractor.avi.n nVar = (com.google.android.exoplayer2.extractor.avi.n) i28T.rl(com.google.android.exoplayer2.extractor.avi.n.class);
            if (nVar != null) {
                this.aviHeader = nVar;
                this.durationUs = ((long) nVar.f57769t) * ((long) nVar.f57768n);
                ArrayList arrayList = new ArrayList();
                xZD it = i28T.f57763n.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    com.google.android.exoplayer2.extractor.avi.j jVar = (com.google.android.exoplayer2.extractor.avi.j) it.next();
                    if (jVar.getType() == 1819440243) {
                        int i3 = i2 + 1;
                        Ml mlProcessStreamList = processStreamList((I28) jVar, i2);
                        if (mlProcessStreamList != null) {
                            arrayList.add(mlProcessStreamList);
                        }
                        i2 = i3;
                    }
                }
                this.chunkReaders = (Ml[]) arrayList.toArray(new Ml[0]);
                this.extractorOutput.endTracks();
                return;
            }
            throw ParserException.createForMalformedContainer("AviHeader not found", null);
        }
        throw ParserException.createForMalformedContainer("Unexpected header list type " + i28T.getType(), null);
    }

    private void parseIdx1Body(ParsableByteArray parsableByteArray) {
        long jPeekSeekOffset = peekSeekOffset(parsableByteArray);
        while (parsableByteArray.bytesLeft() >= 16) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
            long littleEndianInt3 = ((long) parsableByteArray.readLittleEndianInt()) + jPeekSeekOffset;
            parsableByteArray.readLittleEndianInt();
            Ml chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader != null) {
                if ((littleEndianInt2 & 16) == 16) {
                    chunkReader.rl(littleEndianInt3);
                }
                chunkReader.gh();
            }
        }
        for (Ml ml : this.chunkReaders) {
            ml.t();
        }
        this.seekMapHasBeenOutput = true;
        this.extractorOutput.seekMap(new n(this.durationUs));
    }

    private long peekSeekOffset(ParsableByteArray parsableByteArray) {
        long j2 = 0;
        if (parsableByteArray.bytesLeft() < 16) {
            return 0L;
        }
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(8);
        long littleEndianInt = parsableByteArray.readLittleEndianInt();
        long j3 = this.moviStart;
        if (littleEndianInt <= j3) {
            j2 = j3 + 8;
        }
        parsableByteArray.setPosition(position);
        return j2;
    }

    private int readMoviChunks(ExtractorInput extractorInput) throws IOException {
        if (extractorInput.getPosition() >= this.moviEnd) {
            return -1;
        }
        Ml ml = this.currentChunkReader;
        if (ml != null) {
            if (ml.az(extractorInput)) {
                this.currentChunkReader = null;
            }
        } else {
            alignInputToEvenPosition(extractorInput);
            int i2 = 12;
            extractorInput.peekFully(this.scratch.getData(), 0, 12);
            this.scratch.setPosition(0);
            int littleEndianInt = this.scratch.readLittleEndianInt();
            if (littleEndianInt == 1414744396) {
                this.scratch.setPosition(8);
                if (this.scratch.readLittleEndianInt() != 1769369453) {
                    i2 = 8;
                }
                extractorInput.skipFully(i2);
                extractorInput.resetPeekPosition();
                return 0;
            }
            int littleEndianInt2 = this.scratch.readLittleEndianInt();
            if (littleEndianInt == 1263424842) {
                this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt2) + 8;
                return 0;
            }
            extractorInput.skipFully(8);
            extractorInput.resetPeekPosition();
            Ml chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader == null) {
                this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt2);
                return 0;
            }
            chunkReader.ty(littleEndianInt2);
            this.currentChunkReader = chunkReader;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        if (resolvePendingReposition(extractorInput, positionHolder)) {
            return 1;
        }
        switch (this.state) {
            case 0:
                if (sniff(extractorInput)) {
                    extractorInput.skipFully(12);
                    this.state = 1;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("AVI Header List not found", null);
            case 1:
                extractorInput.readFully(this.scratch.getData(), 0, 12);
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.rl(this.scratch);
                w6 w6Var = this.chunkHeaderHolder;
                if (w6Var.f57761t == 1819436136) {
                    this.hdrlSize = w6Var.rl;
                    this.state = 2;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("hdrl expected, found: " + this.chunkHeaderHolder.f57761t, null);
            case 2:
                int i2 = this.hdrlSize - 4;
                ParsableByteArray parsableByteArray = new ParsableByteArray(i2);
                extractorInput.readFully(parsableByteArray.getData(), 0, i2);
                parseHdrlBody(parsableByteArray);
                this.state = 3;
                return 0;
            case 3:
                if (this.moviStart != -1) {
                    long position = extractorInput.getPosition();
                    long j2 = this.moviStart;
                    if (position != j2) {
                        this.pendingReposition = j2;
                        return 0;
                    }
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 12);
                extractorInput.resetPeekPosition();
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.n(this.scratch);
                int littleEndianInt = this.scratch.readLittleEndianInt();
                int i3 = this.chunkHeaderHolder.f57760n;
                if (i3 == 1179011410) {
                    extractorInput.skipFully(12);
                    return 0;
                }
                if (i3 == 1414744396 && littleEndianInt == 1769369453) {
                    long position2 = extractorInput.getPosition();
                    this.moviStart = position2;
                    this.moviEnd = position2 + ((long) this.chunkHeaderHolder.rl) + 8;
                    if (!this.seekMapHasBeenOutput) {
                        if (((com.google.android.exoplayer2.extractor.avi.n) Assertions.checkNotNull(this.aviHeader)).n()) {
                            this.state = 4;
                            this.pendingReposition = this.moviEnd;
                            return 0;
                        }
                        this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                        this.seekMapHasBeenOutput = true;
                    }
                    this.pendingReposition = extractorInput.getPosition() + 12;
                    this.state = 6;
                    return 0;
                }
                this.pendingReposition = extractorInput.getPosition() + ((long) this.chunkHeaderHolder.rl) + 8;
                return 0;
            case 4:
                extractorInput.readFully(this.scratch.getData(), 0, 8);
                this.scratch.setPosition(0);
                int littleEndianInt2 = this.scratch.readLittleEndianInt();
                int littleEndianInt3 = this.scratch.readLittleEndianInt();
                if (littleEndianInt2 == 829973609) {
                    this.state = 5;
                    this.idx1BodySize = littleEndianInt3;
                } else {
                    this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt3);
                }
                return 0;
            case 5:
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.idx1BodySize);
                extractorInput.readFully(parsableByteArray2.getData(), 0, this.idx1BodySize);
                parseIdx1Body(parsableByteArray2);
                this.state = 6;
                this.pendingReposition = this.moviStart;
                return 0;
            case 6:
                return readMoviChunks(extractorInput);
            default:
                throw new AssertionError();
        }
    }
}
