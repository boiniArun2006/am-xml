package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    @Nullable
    private MediaPeriod.Callback callback;

    @Nullable
    private ClippingMediaSource.IllegalClippingException clippingError;
    long endUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private j[] sampleStreams = new j[0];
    long startUs;

    private final class j implements SampleStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final SampleStream f58066n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f58067t;

        public void rl() {
            this.f58067t = false;
        }

        public j(SampleStream sampleStream) {
            this.f58066n = sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return !ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.f58066n.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.f58066n.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.f58067t) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            int data = this.f58066n.readData(formatHolder, decoderInputBuffer, i2);
            if (data == -5) {
                Format format = (Format) Assertions.checkNotNull(formatHolder.format);
                int i3 = format.encoderDelay;
                if (i3 != 0 || format.encoderPadding != 0) {
                    ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                    if (clippingMediaPeriod.startUs != 0) {
                        i3 = 0;
                    }
                    formatHolder.format = format.buildUpon().setEncoderDelay(i3).setEncoderPadding(clippingMediaPeriod.endUs == Long.MIN_VALUE ? format.encoderPadding : 0).build();
                }
                return -5;
            }
            ClippingMediaPeriod clippingMediaPeriod2 = ClippingMediaPeriod.this;
            long j2 = clippingMediaPeriod2.endUs;
            if (j2 == Long.MIN_VALUE || ((data != -4 || decoderInputBuffer.timeUs < j2) && !(data == -3 && clippingMediaPeriod2.getBufferedPositionUs() == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
                return data;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.setFlags(4);
            this.f58067t = true;
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j2) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.f58066n.skipData(j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        long j3;
        boolean z2;
        this.sampleStreams = new j[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i2 = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i2 >= sampleStreamArr.length) {
                break;
            }
            j[] jVarArr = this.sampleStreams;
            j jVar = (j) sampleStreamArr[i2];
            jVarArr[i2] = jVar;
            if (jVar != null) {
                sampleStream = jVar.f58066n;
            }
            sampleStreamArr2[i2] = sampleStream;
            i2++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j2);
        if (isPendingInitialDiscontinuity()) {
            long j4 = this.startUs;
            j3 = (j2 == j4 && shouldKeepInitialDiscontinuity(j4, exoTrackSelectionArr)) ? jSelectTracks : -9223372036854775807L;
        }
        this.pendingInitialDiscontinuityPositionUs = j3;
        if (jSelectTracks == j2) {
            z2 = true;
        } else {
            if (jSelectTracks >= this.startUs) {
                long j5 = this.endUs;
                if (j5 == Long.MIN_VALUE || jSelectTracks <= j5) {
                }
            }
            z2 = false;
        }
        Assertions.checkState(z2);
        for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
            SampleStream sampleStream2 = sampleStreamArr2[i3];
            if (sampleStream2 == null) {
                this.sampleStreams[i3] = null;
            } else {
                j[] jVarArr2 = this.sampleStreams;
                j jVar2 = jVarArr2[i3];
                if (jVar2 == null || jVar2.f58066n != sampleStream2) {
                    jVarArr2[i3] = new j(sampleStream2);
                }
            }
            sampleStreamArr[i3] = this.sampleStreams[i3];
        }
        return jSelectTracks;
    }

    private SeekParameters clipSeekParameters(long j2, SeekParameters seekParameters) {
        long jConstrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j2 - this.startUs);
        long j3 = seekParameters.toleranceAfterUs;
        long j4 = this.endUs;
        long jConstrainValue2 = Util.constrainValue(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j2);
        return (jConstrainValue == seekParameters.toleranceBeforeUs && jConstrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new SeekParameters(jConstrainValue, jConstrainValue2);
    }

    private static boolean shouldKeepInitialDiscontinuity(long j2, ExoTrackSelection[] exoTrackSelectionArr) {
        if (j2 != 0) {
            for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                if (exoTrackSelection != null) {
                    Format selectedFormat = exoTrackSelection.getSelectedFormat();
                    if (!MimeTypes.allSamplesAreSyncSamples(selectedFormat.sampleMimeType, selectedFormat.codecs)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        return this.mediaPeriod.continueLoading(j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z2) {
        this.mediaPeriod.discardBuffer(j2, z2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
        long j3 = this.startUs;
        if (j2 == j3) {
            return j3;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j2, clipSeekParameters(j2, seekParameters));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j2 = this.endUs;
            if (j2 == Long.MIN_VALUE || bufferedPositionUs < j2) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j2 = this.endUs;
            if (j2 == Long.MIN_VALUE || nextLoadPositionUs < j2) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    boolean isPendingInitialDiscontinuity() {
        return this.pendingInitialDiscontinuityPositionUs != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        if (this.clippingError != null) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j2) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        this.mediaPeriod.reevaluateBuffer(j2);
    }

    public void setClippingError(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.clippingError = illegalClippingException;
    }

    public void updateClipping(long j2, long j3) {
        this.startUs = j2;
        this.endUs = j3;
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z2, long j2, long j3) {
        long j4;
        this.mediaPeriod = mediaPeriod;
        if (z2) {
            j4 = j2;
        } else {
            j4 = -9223372036854775807L;
        }
        this.pendingInitialDiscontinuityPositionUs = j4;
        this.startUs = j2;
        this.endUs = j3;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        boolean z2;
        if (isPendingInitialDiscontinuity()) {
            long j2 = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            if (discontinuity != -9223372036854775807L) {
                return discontinuity;
            }
            return j2;
        }
        long discontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z3 = false;
        if (discontinuity2 >= this.startUs) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        long j3 = this.endUs;
        if (j3 == Long.MIN_VALUE || discontinuity2 <= j3) {
            z3 = true;
        }
        Assertions.checkState(z3);
        return discontinuity2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long seekToUs(long j2) {
        this.pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
        boolean z2 = false;
        for (j jVar : this.sampleStreams) {
            if (jVar != null) {
                jVar.rl();
            }
        }
        long jSeekToUs = this.mediaPeriod.seekToUs(j2);
        if (jSeekToUs != j2) {
            if (jSeekToUs >= this.startUs) {
                long j3 = this.endUs;
                if (j3 == Long.MIN_VALUE || jSeekToUs <= j3) {
                }
            }
        } else {
            z2 = true;
        }
        Assertions.checkState(z2);
        return jSeekToUs;
    }
}
