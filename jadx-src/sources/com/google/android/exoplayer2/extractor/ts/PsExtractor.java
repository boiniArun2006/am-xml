package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class PsExtractor implements Extractor {
    public static final int AUDIO_STREAM = 192;
    public static final int AUDIO_STREAM_MASK = 224;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.ts.CN3
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return PsExtractor.n();
        }
    };
    private static final long MAX_SEARCH_LENGTH = 1048576;
    private static final long MAX_SEARCH_LENGTH_AFTER_AUDIO_AND_VIDEO_FOUND = 8192;
    private static final int MAX_STREAM_ID_PLUS_ONE = 256;
    static final int MPEG_PROGRAM_END_CODE = 441;
    static final int PACKET_START_CODE_PREFIX = 1;
    static final int PACK_START_CODE = 442;
    public static final int PRIVATE_STREAM_1 = 189;
    static final int SYSTEM_HEADER_START_CODE = 443;
    public static final int VIDEO_STREAM = 224;
    public static final int VIDEO_STREAM_MASK = 240;
    private final Wre durationReader;
    private boolean foundAllTracks;
    private boolean foundAudioTrack;
    private boolean foundVideoTrack;
    private boolean hasOutputSeekMap;
    private long lastTrackPosition;
    private ExtractorOutput output;

    @Nullable
    private I28 psBinarySearchSeeker;
    private final ParsableByteArray psPacketBuffer;
    private final SparseArray<j> psPayloadReaders;
    private final TimestampAdjuster timestampAdjuster;

    private static final class j {
        private boolean J2;
        private long KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f57900O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ElementaryStreamReader f57901n;
        private boolean nr;
        private final TimestampAdjuster rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ParsableBitArray f57902t = new ParsableBitArray(new byte[64]);

        public void nr() {
            this.J2 = false;
            this.f57901n.seek();
        }

        private void rl() {
            this.f57902t.skipBits(8);
            this.nr = this.f57902t.readBit();
            this.f57900O = this.f57902t.readBit();
            this.f57902t.skipBits(6);
            this.Uo = this.f57902t.readBits(8);
        }

        private void t() {
            this.KN = 0L;
            if (this.nr) {
                this.f57902t.skipBits(4);
                long bits = ((long) this.f57902t.readBits(3)) << 30;
                this.f57902t.skipBits(1);
                long bits2 = bits | ((long) (this.f57902t.readBits(15) << 15));
                this.f57902t.skipBits(1);
                long bits3 = bits2 | ((long) this.f57902t.readBits(15));
                this.f57902t.skipBits(1);
                if (!this.J2 && this.f57900O) {
                    this.f57902t.skipBits(4);
                    long bits4 = ((long) this.f57902t.readBits(3)) << 30;
                    this.f57902t.skipBits(1);
                    long bits5 = bits4 | ((long) (this.f57902t.readBits(15) << 15));
                    this.f57902t.skipBits(1);
                    long bits6 = bits5 | ((long) this.f57902t.readBits(15));
                    this.f57902t.skipBits(1);
                    this.rl.adjustTsTimestamp(bits6);
                    this.J2 = true;
                }
                this.KN = this.rl.adjustTsTimestamp(bits3);
            }
        }

        public void n(ParsableByteArray parsableByteArray) throws ParserException {
            parsableByteArray.readBytes(this.f57902t.data, 0, 3);
            this.f57902t.setPosition(0);
            rl();
            parsableByteArray.readBytes(this.f57902t.data, 0, this.Uo);
            this.f57902t.setPosition(0);
            t();
            this.f57901n.packetStarted(this.KN, 4);
            this.f57901n.consume(parsableByteArray);
            this.f57901n.packetFinished();
        }

        public j(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.f57901n = elementaryStreamReader;
            this.rl = timestampAdjuster;
        }
    }

    public PsExtractor() {
        this(new TimestampAdjuster(0L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public PsExtractor(TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
        this.psPacketBuffer = new ParsableByteArray(4096);
        this.psPayloadReaders = new SparseArray<>();
        this.durationReader = new Wre();
    }

    private void maybeOutputSeekMap(long j2) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.t() == -9223372036854775807L) {
            this.output.seekMap(new SeekMap.Unseekable(this.durationReader.t()));
            return;
        }
        I28 i28 = new I28(this.durationReader.nr(), this.durationReader.t(), j2);
        this.psBinarySearchSeeker = i28;
        this.output.seekMap(i28.getSeekMap());
    }

    public static /* synthetic */ Extractor[] n() {
        return new Extractor[]{new PsExtractor()};
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ElementaryStreamReader h262Reader;
        Assertions.checkStateNotNull(this.output);
        long length = extractorInput.getLength();
        if (length != -1 && !this.durationReader.O()) {
            return this.durationReader.Uo(extractorInput, positionHolder);
        }
        maybeOutputSeekMap(length);
        I28 i28 = this.psBinarySearchSeeker;
        if (i28 != null && i28.isSeeking()) {
            return this.psBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
        }
        extractorInput.resetPeekPosition();
        long peekPosition = length != -1 ? length - extractorInput.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 4, true)) {
            return -1;
        }
        this.psPacketBuffer.setPosition(0);
        int i2 = this.psPacketBuffer.readInt();
        if (i2 == MPEG_PROGRAM_END_CODE) {
            return -1;
        }
        if (i2 == PACK_START_CODE) {
            extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 10);
            this.psPacketBuffer.setPosition(9);
            extractorInput.skipFully((this.psPacketBuffer.readUnsignedByte() & 7) + 14);
            return 0;
        }
        if (i2 == SYSTEM_HEADER_START_CODE) {
            extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 2);
            this.psPacketBuffer.setPosition(0);
            extractorInput.skipFully(this.psPacketBuffer.readUnsignedShort() + 6);
            return 0;
        }
        if (((i2 & (-256)) >> 8) != 1) {
            extractorInput.skipFully(1);
            return 0;
        }
        int i3 = i2 & 255;
        j jVar = this.psPayloadReaders.get(i3);
        if (!this.foundAllTracks) {
            if (jVar == null) {
                if (i3 == 189) {
                    h262Reader = new Ac3Reader();
                    this.foundAudioTrack = true;
                    this.lastTrackPosition = extractorInput.getPosition();
                } else if ((i2 & 224) == 192) {
                    h262Reader = new MpegAudioReader();
                    this.foundAudioTrack = true;
                    this.lastTrackPosition = extractorInput.getPosition();
                } else if ((i2 & 240) == 224) {
                    h262Reader = new H262Reader();
                    this.foundVideoTrack = true;
                    this.lastTrackPosition = extractorInput.getPosition();
                } else {
                    h262Reader = null;
                }
                if (h262Reader != null) {
                    h262Reader.createTracks(this.output, new TsPayloadReader.TrackIdGenerator(i3, 256));
                    jVar = new j(h262Reader, this.timestampAdjuster);
                    this.psPayloadReaders.put(i3, jVar);
                }
            }
            if (extractorInput.getPosition() > ((this.foundAudioTrack && this.foundVideoTrack) ? this.lastTrackPosition + MAX_SEARCH_LENGTH_AFTER_AUDIO_AND_VIDEO_FOUND : MAX_SEARCH_LENGTH)) {
                this.foundAllTracks = true;
                this.output.endTracks();
            }
        }
        extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 2);
        this.psPacketBuffer.setPosition(0);
        int unsignedShort = this.psPacketBuffer.readUnsignedShort() + 6;
        if (jVar == null) {
            extractorInput.skipFully(unsignedShort);
        } else {
            this.psPacketBuffer.reset(unsignedShort);
            extractorInput.readFully(this.psPacketBuffer.getData(), 0, unsignedShort);
            this.psPacketBuffer.setPosition(6);
            jVar.n(this.psPacketBuffer);
            ParsableByteArray parsableByteArray = this.psPacketBuffer;
            parsableByteArray.setLimit(parsableByteArray.capacity());
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j2, long j3) {
        boolean z2 = this.timestampAdjuster.getTimestampOffsetUs() == -9223372036854775807L;
        if (!z2) {
            long firstSampleTimestampUs = this.timestampAdjuster.getFirstSampleTimestampUs();
            z2 = (firstSampleTimestampUs == -9223372036854775807L || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j3) ? false : true;
        }
        if (z2) {
            this.timestampAdjuster.reset(j3);
        }
        I28 i28 = this.psBinarySearchSeeker;
        if (i28 != null) {
            i28.setSeekTargetUs(j3);
        }
        for (int i2 = 0; i2 < this.psPayloadReaders.size(); i2++) {
            this.psPayloadReaders.valueAt(i2).nr();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = new byte[14];
        extractorInput.peekFully(bArr, 0, 14);
        if (PACK_START_CODE != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        extractorInput.advancePeekPosition(bArr[13] & 7);
        extractorInput.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
    }
}
