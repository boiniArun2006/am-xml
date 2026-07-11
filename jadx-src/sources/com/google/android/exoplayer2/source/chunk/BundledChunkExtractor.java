package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {
    public static final ChunkExtractor.Factory FACTORY = new ChunkExtractor.Factory() { // from class: com.google.android.exoplayer2.source.chunk.j
        @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
        public final ChunkExtractor createProgressiveMediaExtractor(int i2, Format format, boolean z2, List list, TrackOutput trackOutput, PlayerId playerId) {
            return BundledChunkExtractor.n(i2, format, z2, list, trackOutput, playerId);
        }
    };
    private static final PositionHolder POSITION_HOLDER = new PositionHolder();
    private final SparseArray<j> bindingTrackOutputs = new SparseArray<>();
    private long endTimeUs;
    private final Extractor extractor;
    private boolean extractorInitialized;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private Format[] sampleFormats;
    private SeekMap seekMap;

    @Nullable
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    private static final class j implements TrackOutput {
        private TrackOutput J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public Format f58208O;
        private long Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f58209n;
        private final DummyTrackOutput nr = new DummyTrackOutput();
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Format f58210t;

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i2, boolean z2, int i3) {
            return ((TrackOutput) Util.castNonNull(this.J2)).sampleData(dataReader, i2, z2);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
            Format format2 = this.f58210t;
            if (format2 != null) {
                format = format.withManifestFormatInfo(format2);
            }
            this.f58208O = format;
            ((TrackOutput) Util.castNonNull(this.J2)).format(this.f58208O);
        }

        public void n(ChunkExtractor.TrackOutputProvider trackOutputProvider, long j2) {
            if (trackOutputProvider == null) {
                this.J2 = this.nr;
                return;
            }
            this.Uo = j2;
            TrackOutput trackOutputTrack = trackOutputProvider.track(this.f58209n, this.rl);
            this.J2 = trackOutputTrack;
            Format format = this.f58208O;
            if (format != null) {
                trackOutputTrack.format(format);
            }
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i2, int i3) {
            ((TrackOutput) Util.castNonNull(this.J2)).sampleData(parsableByteArray, i2);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long j2, int i2, int i3, int i5, TrackOutput.CryptoData cryptoData) {
            long j3 = this.Uo;
            if (j3 != -9223372036854775807L && j2 >= j3) {
                this.J2 = this.nr;
            }
            ((TrackOutput) Util.castNonNull(this.J2)).sampleMetadata(j2, i2, i3, i5, cryptoData);
        }

        public j(int i2, int i3, Format format) {
            this.f58209n = i2;
            this.rl = i3;
            this.f58210t = format;
        }
    }

    public static /* synthetic */ ChunkExtractor n(int i2, Format format, boolean z2, List list, TrackOutput trackOutput, PlayerId playerId) {
        Extractor fragmentedMp4Extractor;
        String str = format.containerMimeType;
        if (MimeTypes.isText(str)) {
            return null;
        }
        if (MimeTypes.isMatroska(str)) {
            fragmentedMp4Extractor = new MatroskaExtractor(1);
        } else {
            fragmentedMp4Extractor = new FragmentedMp4Extractor(z2 ? 4 : 0, null, null, list, trackOutput);
        }
        return new BundledChunkExtractor(fragmentedMp4Extractor, i2, format);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        Format[] formatArr = new Format[this.bindingTrackOutputs.size()];
        for (int i2 = 0; i2 < this.bindingTrackOutputs.size(); i2++) {
            formatArr[i2] = (Format) Assertions.checkStateNotNull(this.bindingTrackOutputs.valueAt(i2).f58208O);
        }
        this.sampleFormats = formatArr;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex getChunkIndex() {
        SeekMap seekMap = this.seekMap;
        if (seekMap instanceof ChunkIndex) {
            return (ChunkIndex) seekMap;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    public Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void init(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j2, long j3) {
        this.trackOutputProvider = trackOutputProvider;
        this.endTimeUs = j3;
        if (!this.extractorInitialized) {
            this.extractor.init(this);
            if (j2 != -9223372036854775807L) {
                this.extractor.seek(0L, j2);
            }
            this.extractorInitialized = true;
            return;
        }
        Extractor extractor = this.extractor;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        extractor.seek(0L, j2);
        for (int i2 = 0; i2 < this.bindingTrackOutputs.size(); i2++) {
            this.bindingTrackOutputs.valueAt(i2).n(trackOutputProvider, j3);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        int i2 = this.extractor.read(extractorInput, POSITION_HOLDER);
        Assertions.checkState(i2 != 1);
        return i2 == 0;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
        this.extractor.release();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i2, int i3) {
        j jVar = this.bindingTrackOutputs.get(i2);
        if (jVar == null) {
            Assertions.checkState(this.sampleFormats == null);
            jVar = new j(i2, i3, i3 == this.primaryTrackType ? this.primaryTrackManifestFormat : null);
            jVar.n(this.trackOutputProvider, this.endTimeUs);
            this.bindingTrackOutputs.put(i2, jVar);
        }
        return jVar;
    }

    public BundledChunkExtractor(Extractor extractor, int i2, Format format) {
        this.extractor = extractor;
        this.primaryTrackType = i2;
        this.primaryTrackManifestFormat = format;
    }
}
