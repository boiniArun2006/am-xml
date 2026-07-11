package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
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
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class TsExtractor implements Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.ts.aC
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return TsExtractor.n();
        }
    };
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DC2_H262 = 128;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    private final Dsr durationReader;
    private boolean hasOutputSeekMap;

    @Nullable
    private TsPayloadReader id3Reader;
    private final int mode;
    private ExtractorOutput output;
    private final TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final List<TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final SparseBooleanArray trackIds;
    private final SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private fuX tsBinarySearchSeeker;
    private final ParsableByteArray tsPacketBuffer;
    private final SparseArray<TsPayloadReader> tsPayloadReaders;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private class j implements SectionPayloadReader {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ParsableBitArray f57903n = new ParsableBitArray(new byte[4]);

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        public j() {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() == 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(6);
                int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                for (int i2 = 0; i2 < iBytesLeft; i2++) {
                    parsableByteArray.readBytes(this.f57903n, 4);
                    int bits = this.f57903n.readBits(16);
                    this.f57903n.skipBits(3);
                    if (bits == 0) {
                        this.f57903n.skipBits(13);
                    } else {
                        int bits2 = this.f57903n.readBits(13);
                        if (TsExtractor.this.tsPayloadReaders.get(bits2) == null) {
                            TsExtractor.this.tsPayloadReaders.put(bits2, new SectionReader(TsExtractor.this.new n(bits2)));
                            TsExtractor.access$108(TsExtractor.this);
                        }
                    }
                }
                if (TsExtractor.this.mode != 2) {
                    TsExtractor.this.tsPayloadReaders.remove(0);
                }
            }
        }
    }

    private class n implements SectionPayloadReader {
        private final int nr;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ParsableBitArray f57905n = new ParsableBitArray(new byte[5]);
        private final SparseArray rl = new SparseArray();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SparseIntArray f57906t = new SparseIntArray();

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        public n(int i2) {
            this.nr = i2;
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            TimestampAdjuster timestampAdjuster;
            if (parsableByteArray.readUnsignedByte() != 2) {
                return;
            }
            if (TsExtractor.this.mode == 1 || TsExtractor.this.mode == 2 || TsExtractor.this.remainingPmts == 1) {
                timestampAdjuster = (TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0);
            } else {
                timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                TsExtractor.this.timestampAdjusters.add(timestampAdjuster);
            }
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                return;
            }
            parsableByteArray.skipBytes(1);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            int i2 = 3;
            parsableByteArray.skipBytes(3);
            parsableByteArray.readBytes(this.f57905n, 2);
            this.f57905n.skipBits(3);
            int i3 = 13;
            TsExtractor.this.pcrPid = this.f57905n.readBits(13);
            parsableByteArray.readBytes(this.f57905n, 2);
            int i5 = 4;
            this.f57905n.skipBits(4);
            parsableByteArray.skipBytes(this.f57905n.readBits(12));
            if (TsExtractor.this.mode == 2 && TsExtractor.this.id3Reader == null) {
                TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(21, null, null, Util.EMPTY_BYTE_ARRAY);
                TsExtractor tsExtractor = TsExtractor.this;
                tsExtractor.id3Reader = tsExtractor.payloadReaderFactory.createPayloadReader(21, esInfo);
                if (TsExtractor.this.id3Reader != null) {
                    TsExtractor.this.id3Reader.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, 21, 8192));
                }
            }
            this.rl.clear();
            this.f57906t.clear();
            int iBytesLeft = parsableByteArray.bytesLeft();
            while (iBytesLeft > 0) {
                parsableByteArray.readBytes(this.f57905n, 5);
                int bits = this.f57905n.readBits(8);
                this.f57905n.skipBits(i2);
                int bits2 = this.f57905n.readBits(i3);
                this.f57905n.skipBits(i5);
                int bits3 = this.f57905n.readBits(12);
                TsPayloadReader.EsInfo esInfoN = n(parsableByteArray, bits3);
                if (bits == 6 || bits == 5) {
                    bits = esInfoN.streamType;
                }
                iBytesLeft -= bits3 + 5;
                int i7 = TsExtractor.this.mode == 2 ? bits : bits2;
                if (!TsExtractor.this.trackIds.get(i7)) {
                    TsPayloadReader tsPayloadReaderCreatePayloadReader = (TsExtractor.this.mode == 2 && bits == 21) ? TsExtractor.this.id3Reader : TsExtractor.this.payloadReaderFactory.createPayloadReader(bits, esInfoN);
                    if (TsExtractor.this.mode != 2 || bits2 < this.f57906t.get(i7, 8192)) {
                        this.f57906t.put(i7, bits2);
                        this.rl.put(i7, tsPayloadReaderCreatePayloadReader);
                    }
                }
                i2 = 3;
                i5 = 4;
                i3 = 13;
            }
            int size = this.f57906t.size();
            for (int i8 = 0; i8 < size; i8++) {
                int iKeyAt = this.f57906t.keyAt(i8);
                int iValueAt = this.f57906t.valueAt(i8);
                TsExtractor.this.trackIds.put(iKeyAt, true);
                TsExtractor.this.trackPids.put(iValueAt, true);
                TsPayloadReader tsPayloadReader = (TsPayloadReader) this.rl.valueAt(i8);
                if (tsPayloadReader != null) {
                    if (tsPayloadReader != TsExtractor.this.id3Reader) {
                        tsPayloadReader.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, iKeyAt, 8192));
                    }
                    TsExtractor.this.tsPayloadReaders.put(iValueAt, tsPayloadReader);
                }
            }
            if (TsExtractor.this.mode == 2) {
                if (TsExtractor.this.tracksEnded) {
                    return;
                }
                TsExtractor.this.output.endTracks();
                TsExtractor.this.remainingPmts = 0;
                TsExtractor.this.tracksEnded = true;
                return;
            }
            TsExtractor.this.tsPayloadReaders.remove(this.nr);
            TsExtractor tsExtractor2 = TsExtractor.this;
            tsExtractor2.remainingPmts = tsExtractor2.mode == 1 ? 0 : TsExtractor.this.remainingPmts - 1;
            if (TsExtractor.this.remainingPmts == 0) {
                TsExtractor.this.output.endTracks();
                TsExtractor.this.tracksEnded = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private TsPayloadReader.EsInfo n(ParsableByteArray parsableByteArray, int i2) {
            int position = parsableByteArray.getPosition();
            int i3 = i2 + position;
            int i5 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (parsableByteArray.getPosition() < i3) {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                int position2 = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
                if (position2 > i3) {
                    break;
                }
                if (unsignedByte == 5) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    if (unsignedInt != TsExtractor.AC3_FORMAT_IDENTIFIER) {
                        if (unsignedInt != TsExtractor.E_AC3_FORMAT_IDENTIFIER) {
                            if (unsignedInt == TsExtractor.AC4_FORMAT_IDENTIFIER) {
                                i5 = 172;
                            } else if (unsignedInt == TsExtractor.HEVC_FORMAT_IDENTIFIER) {
                                i5 = 36;
                            }
                        } else {
                            i5 = 135;
                        }
                    } else {
                        i5 = 129;
                    }
                } else if (unsignedByte != 106) {
                    if (unsignedByte != 122) {
                        if (unsignedByte == 127) {
                            if (parsableByteArray.readUnsignedByte() == 21) {
                            }
                        } else if (unsignedByte == 123) {
                            i5 = 138;
                        } else if (unsignedByte == 10) {
                            strTrim = parsableByteArray.readString(3).trim();
                        } else if (unsignedByte == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (parsableByteArray.getPosition() < position2) {
                                String strTrim2 = parsableByteArray.readString(3).trim();
                                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                                byte[] bArr = new byte[4];
                                parsableByteArray.readBytes(bArr, 0, 4);
                                arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(strTrim2, unsignedByte2, bArr));
                            }
                            arrayList = arrayList2;
                            i5 = 89;
                        } else if (unsignedByte == 111) {
                            i5 = 257;
                        }
                    }
                }
                parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
            }
            parsableByteArray.setPosition(i3);
            return new TsPayloadReader.EsInfo(i5, strTrim, arrayList, Arrays.copyOfRange(parsableByteArray.getData(), position, i3));
        }
    }

    public TsExtractor() {
        this(0);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public TsExtractor(int i2) {
        this(1, i2, 112800);
    }

    static /* synthetic */ int access$108(TsExtractor tsExtractor) {
        int i2 = tsExtractor.remainingPmts;
        tsExtractor.remainingPmts = i2 + 1;
        return i2;
    }

    private boolean fillBufferWithAtLeastOnePacket(ExtractorInput extractorInput) throws IOException {
        byte[] data = this.tsPacketBuffer.getData();
        if (9400 - this.tsPacketBuffer.getPosition() < 188) {
            int iBytesLeft = this.tsPacketBuffer.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, this.tsPacketBuffer.getPosition(), data, 0, iBytesLeft);
            }
            this.tsPacketBuffer.reset(data, iBytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < 188) {
            int iLimit = this.tsPacketBuffer.limit();
            int i2 = extractorInput.read(data, iLimit, 9400 - iLimit);
            if (i2 == -1) {
                return false;
            }
            this.tsPacketBuffer.setLimit(iLimit + i2);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws ParserException {
        int position = this.tsPacketBuffer.getPosition();
        int iLimit = this.tsPacketBuffer.limit();
        int iFindSyncBytePosition = TsUtil.findSyncBytePosition(this.tsPacketBuffer.getData(), position, iLimit);
        this.tsPacketBuffer.setPosition(iFindSyncBytePosition);
        int i2 = iFindSyncBytePosition + 188;
        if (i2 <= iLimit) {
            this.bytesSinceLastSync = 0;
            return i2;
        }
        int i3 = this.bytesSinceLastSync + (iFindSyncBytePosition - position);
        this.bytesSinceLastSync = i3;
        if (this.mode != 2 || i3 <= 376) {
            return i2;
        }
        throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void maybeOutputSeekMap(long j2) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.rl() == -9223372036854775807L) {
            this.output.seekMap(new SeekMap.Unseekable(this.durationReader.rl()));
            return;
        }
        fuX fux = new fuX(this.durationReader.t(), this.durationReader.rl(), j2, this.pcrPid, this.timestampSearchBytes);
        this.tsBinarySearchSeeker = fux;
        this.output.seekMap(fux.getSeekMap());
    }

    public static /* synthetic */ Extractor[] n() {
        return new Extractor[]{new TsExtractor()};
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        SparseArray<TsPayloadReader> sparseArrayCreateInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.tsPayloadReaders.put(sparseArrayCreateInitialPayloadReaders.keyAt(i2), sparseArrayCreateInitialPayloadReaders.valueAt(i2));
        }
        this.tsPayloadReaders.put(0, new SectionReader(new j()));
        this.id3Reader = null;
    }

    private boolean shouldConsumePacketPayload(int i2) {
        return this.mode == 2 || this.tracksEnded || !this.trackPids.get(i2, false);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long j2;
        long length = extractorInput.getLength();
        if (this.tracksEnded) {
            if (length != -1 && this.mode != 2 && !this.durationReader.nr()) {
                return this.durationReader.O(extractorInput, positionHolder, this.pcrPid);
            }
            maybeOutputSeekMap(length);
            if (this.pendingSeekToStart) {
                this.pendingSeekToStart = false;
                seek(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.position = 0L;
                    return 1;
                }
            }
            fuX fux = this.tsBinarySearchSeeker;
            if (fux != null && fux.isSeeking()) {
                return this.tsBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(extractorInput)) {
            return -1;
        }
        int iFindEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int iLimit = this.tsPacketBuffer.limit();
        if (iFindEndOfFirstTsPacketInBuffer > iLimit) {
            return 0;
        }
        int i2 = this.tsPacketBuffer.readInt();
        if ((8388608 & i2) != 0) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i3 = (4194304 & i2) != 0 ? 1 : 0;
        int i5 = (2096896 & i2) >> 8;
        boolean z2 = (i2 & 32) != 0;
        TsPayloadReader tsPayloadReader = (i2 & 16) != 0 ? this.tsPayloadReaders.get(i5) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.mode != 2) {
            int i7 = i2 & 15;
            j2 = -1;
            int i8 = this.continuityCounters.get(i5, i7 - 1);
            this.continuityCounters.put(i5, i7);
            if (i8 == i7) {
                this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i7 != ((i8 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        } else {
            j2 = -1;
        }
        if (z2) {
            int unsignedByte = this.tsPacketBuffer.readUnsignedByte();
            i3 |= (this.tsPacketBuffer.readUnsignedByte() & 64) != 0 ? 2 : 0;
            this.tsPacketBuffer.skipBytes(unsignedByte - 1);
        }
        boolean z3 = this.tracksEnded;
        if (shouldConsumePacketPayload(i5)) {
            this.tsPacketBuffer.setLimit(iFindEndOfFirstTsPacketInBuffer);
            tsPayloadReader.consume(this.tsPacketBuffer, i3);
            this.tsPacketBuffer.setLimit(iLimit);
        }
        if (this.mode != 2 && !z3 && this.tracksEnded && length != j2) {
            this.pendingSeekToStart = true;
        }
        this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j2, long j3) {
        fuX fux;
        Assertions.checkState(this.mode != 2);
        int size = this.timestampAdjusters.size();
        for (int i2 = 0; i2 < size; i2++) {
            TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i2);
            boolean z2 = timestampAdjuster.getTimestampOffsetUs() == -9223372036854775807L;
            if (!z2) {
                long firstSampleTimestampUs = timestampAdjuster.getFirstSampleTimestampUs();
                z2 = (firstSampleTimestampUs == -9223372036854775807L || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j3) ? false : true;
            }
            if (z2) {
                timestampAdjuster.reset(j3);
            }
        }
        if (j3 != 0 && (fux = this.tsBinarySearchSeeker) != null) {
            fux.setSeekTargetUs(j3);
        }
        this.tsPacketBuffer.reset(0);
        this.continuityCounters.clear();
        for (int i3 = 0; i3 < this.tsPayloadReaders.size(); i3++) {
            this.tsPayloadReaders.valueAt(i3).seek();
        }
        this.bytesSinceLastSync = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        byte[] data = this.tsPacketBuffer.getData();
        extractorInput.peekFully(data, 0, 940);
        int i2 = 0;
        while (i2 < 188) {
            for (int i3 = 0; i3 < 5; i3++) {
                if (data[(i3 * 188) + i2] != 71) {
                    break;
                }
            }
            extractorInput.skipFully(i2);
            return true;
        }
        return false;
    }

    public TsExtractor(int i2, int i3, int i5) {
        this(i2, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i3), i5);
    }

    public TsExtractor(int i2, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory) {
        this(i2, timestampAdjuster, factory, 112800);
    }

    public TsExtractor(int i2, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory, int i3) {
        this.payloadReaderFactory = (TsPayloadReader.Factory) Assertions.checkNotNull(factory);
        this.timestampSearchBytes = i3;
        this.mode = i2;
        if (i2 != 1 && i2 != 2) {
            ArrayList arrayList = new ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        }
        this.tsPacketBuffer = new ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new SparseBooleanArray();
        this.trackPids = new SparseBooleanArray();
        this.tsPayloadReaders = new SparseArray<>();
        this.continuityCounters = new SparseIntArray();
        this.durationReader = new Dsr(i3);
        this.output = ExtractorOutput.PLACEHOLDER;
        this.pcrPid = -1;
        resetPayloadReaders();
    }
}
