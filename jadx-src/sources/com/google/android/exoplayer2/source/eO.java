package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class eO implements MediaPeriod, MediaPeriod.Callback {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final CompositeSequenceableLoaderFactory f58212O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private TrackGroupArray f58214Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SequenceableLoader f58215g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediaPeriod[] f58216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MediaPeriod.Callback f58217o;
    private final ArrayList J2 = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final HashMap f58218r = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final IdentityHashMap f58219t = new IdentityHashMap();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private MediaPeriod[] f58213S = new MediaPeriod[0];

    private static final class j implements ExoTrackSelection {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ExoTrackSelection f58220n;
        private final TrackGroup rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f58220n.equals(jVar.f58220n) && this.rl.equals(jVar.rl);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(Format format) {
            return this.f58220n.indexOf(format);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean blacklist(int i2, long j2) {
            return this.f58220n.blacklist(i2, j2);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void disable() {
            this.f58220n.disable();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void enable() {
            this.f58220n.enable();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int evaluateQueueSize(long j2, List list) {
            return this.f58220n.evaluateQueueSize(j2, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public Format getFormat(int i2) {
            return this.f58220n.getFormat(i2);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getIndexInTrackGroup(int i2) {
            return this.f58220n.getIndexInTrackGroup(i2);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public Format getSelectedFormat() {
            return this.f58220n.getSelectedFormat();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.f58220n.getSelectedIndex();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndexInTrackGroup() {
            return this.f58220n.getSelectedIndexInTrackGroup();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public Object getSelectionData() {
            return this.f58220n.getSelectionData();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return this.f58220n.getSelectionReason();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public TrackGroup getTrackGroup() {
            return this.rl;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getType() {
            return this.f58220n.getType();
        }

        public int hashCode() {
            return ((527 + this.rl.hashCode()) * 31) + this.f58220n.hashCode();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int indexOf(int i2) {
            return this.f58220n.indexOf(i2);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean isBlacklisted(int i2, long j2) {
            return this.f58220n.isBlacklisted(i2, j2);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int length() {
            return this.f58220n.length();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onDiscontinuity() {
            this.f58220n.onDiscontinuity();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlayWhenReadyChanged(boolean z2) {
            this.f58220n.onPlayWhenReadyChanged(z2);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onPlaybackSpeed(float f3) {
            this.f58220n.onPlaybackSpeed(f3);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void onRebuffer() {
            this.f58220n.onRebuffer();
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public boolean shouldCancelChunkLoad(long j2, Chunk chunk, List list) {
            return this.f58220n.shouldCancelChunkLoad(j2, chunk, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j2, long j3, long j4, List list, MediaChunkIterator[] mediaChunkIteratorArr) {
            this.f58220n.updateSelectedTrack(j2, j3, j4, list, mediaChunkIteratorArr);
        }

        public j(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            this.f58220n = exoTrackSelection;
            this.rl = trackGroup;
        }
    }

    private static final class n implements MediaPeriod, MediaPeriod.Callback {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private MediaPeriod.Callback f58221O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MediaPeriod f58222n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f58223t;

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
            SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
            int i2 = 0;
            while (true) {
                SampleStream sampleStreamRl = null;
                if (i2 >= sampleStreamArr.length) {
                    break;
                }
                w6 w6Var = (w6) sampleStreamArr[i2];
                if (w6Var != null) {
                    sampleStreamRl = w6Var.rl();
                }
                sampleStreamArr2[i2] = sampleStreamRl;
                i2++;
            }
            long jSelectTracks = this.f58222n.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j2 - this.f58223t);
            for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
                SampleStream sampleStream = sampleStreamArr2[i3];
                if (sampleStream == null) {
                    sampleStreamArr[i3] = null;
                } else {
                    SampleStream sampleStream2 = sampleStreamArr[i3];
                    if (sampleStream2 == null || ((w6) sampleStream2).rl() != sampleStream) {
                        sampleStreamArr[i3] = new w6(sampleStream, this.f58223t);
                    }
                }
            }
            return jSelectTracks + this.f58223t;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j2) {
            return this.f58222n.continueLoading(j2 - this.f58223t);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j2, boolean z2) {
            this.f58222n.discardBuffer(j2 - this.f58223t, z2);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
            return this.f58222n.getAdjustedSeekPositionUs(j2 - this.f58223t, seekParameters) + this.f58223t;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.f58222n.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return bufferedPositionUs + this.f58223t;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.f58222n.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return nextLoadPositionUs + this.f58223t;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public List getStreamKeys(List list) {
            return this.f58222n.getStreamKeys(list);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.f58222n.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.f58222n.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws IOException {
            this.f58222n.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.f58221O)).onPrepared(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j2) {
            this.f58221O = callback;
            this.f58222n.prepare(this, j2 - this.f58223t);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            long discontinuity = this.f58222n.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return discontinuity + this.f58223t;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j2) {
            this.f58222n.reevaluateBuffer(j2 - this.f58223t);
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.f58221O)).onContinueLoadingRequested(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j2) {
            return this.f58222n.seekToUs(j2 - this.f58223t) + this.f58223t;
        }

        public n(MediaPeriod mediaPeriod, long j2) {
            this.f58222n = mediaPeriod;
            this.f58223t = j2;
        }
    }

    private static final class w6 implements SampleStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SampleStream f58224n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f58225t;

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.f58224n.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.f58224n.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            int data = this.f58224n.readData(formatHolder, decoderInputBuffer, i2);
            if (data == -4) {
                decoderInputBuffer.timeUs = Math.max(0L, decoderInputBuffer.timeUs + this.f58225t);
            }
            return data;
        }

        public SampleStream rl() {
            return this.f58224n;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j2) {
            return this.f58224n.skipData(j2 - this.f58225t);
        }

        public w6(SampleStream sampleStream, long j2) {
            this.f58224n = sampleStream;
            this.f58225t = j2;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        if (this.J2.isEmpty()) {
            return this.f58215g.continueLoading(j2);
        }
        int size = this.J2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((MediaPeriod) this.J2.get(i2)).continueLoading(j2);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z2) {
        for (MediaPeriod mediaPeriod : this.f58213S) {
            mediaPeriod.discardBuffer(j2, z2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.f58213S;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.f58216n[0]).getAdjustedSeekPositionUs(j2, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.f58215g.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.f58215g.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.f58214Z);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f58215g.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (MediaPeriod mediaPeriod : this.f58216n) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    public MediaPeriod n(int i2) {
        MediaPeriod mediaPeriod = this.f58216n[i2];
        return mediaPeriod instanceof n ? ((n) mediaPeriod).f58222n : mediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.J2.remove(mediaPeriod);
        if (!this.J2.isEmpty()) {
            return;
        }
        int i2 = 0;
        for (MediaPeriod mediaPeriod2 : this.f58216n) {
            i2 += mediaPeriod2.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i2];
        int i3 = 0;
        int i5 = 0;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.f58216n;
            if (i3 >= mediaPeriodArr.length) {
                this.f58214Z = new TrackGroupArray(trackGroupArr);
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.f58217o)).onPrepared(this);
                return;
            }
            TrackGroupArray trackGroups = mediaPeriodArr[i3].getTrackGroups();
            int i7 = trackGroups.length;
            int i8 = 0;
            while (i8 < i7) {
                TrackGroup trackGroup = trackGroups.get(i8);
                TrackGroup trackGroupCopyWithId = trackGroup.copyWithId(i3 + ":" + trackGroup.id);
                this.f58218r.put(trackGroupCopyWithId, trackGroup);
                trackGroupArr[i5] = trackGroupCopyWithId;
                i8++;
                i5++;
            }
            i3++;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j2) {
        this.f58217o = callback;
        Collections.addAll(this.J2, this.f58216n);
        for (MediaPeriod mediaPeriod : this.f58216n) {
            mediaPeriod.prepare(this, j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        long j2 = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.f58213S) {
            long discontinuity = mediaPeriod.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j2 != -9223372036854775807L && mediaPeriod.seekToUs(j2) != j2) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j2 == -9223372036854775807L) {
                for (MediaPeriod mediaPeriod2 : this.f58213S) {
                    if (mediaPeriod2 == mediaPeriod) {
                        break;
                    }
                    if (mediaPeriod2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j2 = discontinuity;
            } else if (discontinuity != j2) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        this.f58215g.reevaluateBuffer(j2);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.f58217o)).onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j2) {
        long jSeekToUs = this.f58213S[0].seekToUs(j2);
        int i2 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.f58213S;
            if (i2 >= mediaPeriodArr.length) {
                return jSeekToUs;
            }
            if (mediaPeriodArr[i2].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            SampleStream sampleStream = sampleStreamArr[i2];
            Integer num = sampleStream == null ? null : (Integer) this.f58219t.get(sampleStream);
            iArr[i2] = num == null ? -1 : num.intValue();
            iArr2[i2] = -1;
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
            if (exoTrackSelection != null) {
                TrackGroup trackGroup = (TrackGroup) Assertions.checkNotNull((TrackGroup) this.f58218r.get(exoTrackSelection.getTrackGroup()));
                int i3 = 0;
                while (true) {
                    MediaPeriod[] mediaPeriodArr = this.f58216n;
                    if (i3 >= mediaPeriodArr.length) {
                        break;
                    }
                    if (mediaPeriodArr[i3].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        this.f58219t.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        ArrayList arrayList = new ArrayList(this.f58216n.length);
        long j3 = j2;
        int i5 = 0;
        while (i5 < this.f58216n.length) {
            for (int i7 = 0; i7 < exoTrackSelectionArr.length; i7++) {
                sampleStreamArr3[i7] = iArr[i7] == i5 ? sampleStreamArr[i7] : null;
                if (iArr2[i7] == i5) {
                    ExoTrackSelection exoTrackSelection2 = (ExoTrackSelection) Assertions.checkNotNull(exoTrackSelectionArr[i7]);
                    exoTrackSelectionArr2[i7] = new j(exoTrackSelection2, (TrackGroup) Assertions.checkNotNull((TrackGroup) this.f58218r.get(exoTrackSelection2.getTrackGroup())));
                } else {
                    exoTrackSelectionArr2[i7] = null;
                }
            }
            int i8 = i5;
            long jSelectTracks = this.f58216n[i5].selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j3);
            if (i8 == 0) {
                j3 = jSelectTracks;
            } else if (jSelectTracks != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i9 = 0; i9 < exoTrackSelectionArr.length; i9++) {
                if (iArr2[i9] == i8) {
                    SampleStream sampleStream2 = (SampleStream) Assertions.checkNotNull(sampleStreamArr3[i9]);
                    sampleStreamArr2[i9] = sampleStreamArr3[i9];
                    this.f58219t.put(sampleStream2, Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i9] == i8) {
                    Assertions.checkState(sampleStreamArr3[i9] == null);
                }
            }
            if (z2) {
                arrayList.add(this.f58216n[i8]);
            }
            i5 = i8 + 1;
        }
        System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, length);
        MediaPeriod[] mediaPeriodArr2 = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[0]);
        this.f58213S = mediaPeriodArr2;
        this.f58215g = this.f58212O.createCompositeSequenceableLoader(mediaPeriodArr2);
        return j3;
    }

    public eO(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.f58212O = compositeSequenceableLoaderFactory;
        this.f58216n = mediaPeriodArr;
        this.f58215g = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
        for (int i2 = 0; i2 < mediaPeriodArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                this.f58216n[i2] = new n(mediaPeriodArr[i2], j2);
            }
        }
    }
}
