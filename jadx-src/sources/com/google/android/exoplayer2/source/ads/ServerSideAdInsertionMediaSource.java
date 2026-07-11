package com.google.android.exoplayer2.source.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Dsr;
import com.google.common.collect.M;
import com.google.common.collect.lej;
import com.google.common.collect.u;
import com.google.common.collect.xZD;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class ServerSideAdInsertionMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {

    @Nullable
    private final AdPlaybackStateUpdater adPlaybackStateUpdater;

    @Nullable
    private Timeline contentTimeline;

    @Nullable
    private Ml lastUsedMediaPeriod;
    private final MediaSource mediaSource;

    @Nullable
    @GuardedBy
    private Handler playbackHandler;
    private final M mediaPeriods = Dsr.E2();
    private u adPlaybackStates = u.ty();
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcherWithoutId = createEventDispatcher(null);
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcherWithoutId = createDrmEventDispatcher(null);

    public interface AdPlaybackStateUpdater {
        boolean onAdPlaybackStateUpdateRequested(Timeline timeline);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Ml implements MediaPeriod.Callback {
        private final Object J2;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private boolean f58150S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private boolean f58151Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MediaPeriod f58154n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private j f58155o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private AdPlaybackState f58156r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f58157t = new ArrayList();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Map f58149O = new HashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ExoTrackSelection[] f58153g = new ExoTrackSelection[0];
        public SampleStream[] E2 = new SampleStream[0];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public MediaLoadData[] f58152e = new MediaLoadData[0];

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.f58150S = true;
            for (int i2 = 0; i2 < this.f58157t.size(); i2++) {
                j jVar = (j) this.f58157t.get(i2);
                MediaPeriod.Callback callback = jVar.f58162r;
                if (callback != null) {
                    callback.onPrepared(jVar);
                }
            }
        }

        private long HI(j jVar, long j2) {
            long j3 = jVar.f58161o;
            return j2 < j3 ? ServerSideAdInsertionUtil.getStreamPositionUs(j3, jVar.f58163t, this.f58156r) - (jVar.f58161o - j2) : ServerSideAdInsertionUtil.getStreamPositionUs(j2, jVar.f58163t, this.f58156r);
        }

        private int KN(MediaLoadData mediaLoadData) {
            String str;
            if (mediaLoadData.trackFormat == null) {
                return -1;
            }
            int i2 = 0;
            loop0: while (true) {
                ExoTrackSelection[] exoTrackSelectionArr = this.f58153g;
                if (i2 >= exoTrackSelectionArr.length) {
                    return -1;
                }
                ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
                if (exoTrackSelection != null) {
                    TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                    boolean z2 = mediaLoadData.trackType == 0 && trackGroup.equals(ck().get(0));
                    for (int i3 = 0; i3 < trackGroup.length; i3++) {
                        Format format = trackGroup.getFormat(i3);
                        if (format.equals(mediaLoadData.trackFormat) || (z2 && (str = format.id) != null && str.equals(mediaLoadData.trackFormat.id))) {
                            break loop0;
                        }
                    }
                }
                i2++;
            }
            return i2;
        }

        private void Z(j jVar, int i2) {
            MediaLoadData mediaLoadData;
            boolean[] zArr = jVar.f58159Z;
            if (zArr[i2] || (mediaLoadData = this.f58152e[i2]) == null) {
                return;
            }
            zArr[i2] = true;
            jVar.f58158O.downstreamFormatChanged(ServerSideAdInsertionMediaSource.correctMediaLoadData(jVar, mediaLoadData, this.f58156r));
        }

        private long qie(j jVar, long j2) {
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long mediaPeriodPositionUs = ServerSideAdInsertionUtil.getMediaPeriodPositionUs(j2, jVar.f58163t, this.f58156r);
            if (mediaPeriodPositionUs >= ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(jVar, this.f58156r)) {
                return Long.MIN_VALUE;
            }
            return mediaPeriodPositionUs;
        }

        public void E2(MediaSource mediaSource) {
            mediaSource.releasePeriod(this.f58154n);
        }

        public boolean Ik(j jVar) {
            return jVar.equals(this.f58155o) && this.f58154n.isLoading();
        }

        public boolean J2(j jVar, long j2) {
            j jVar2 = this.f58155o;
            if (jVar2 != null && !jVar.equals(jVar2)) {
                for (Pair pair : this.f58149O.values()) {
                    jVar2.f58158O.loadCompleted((LoadEventInfo) pair.first, ServerSideAdInsertionMediaSource.correctMediaLoadData(jVar2, (MediaLoadData) pair.second, this.f58156r));
                    jVar.f58158O.loadStarted((LoadEventInfo) pair.first, ServerSideAdInsertionMediaSource.correctMediaLoadData(jVar, (MediaLoadData) pair.second, this.f58156r));
                }
            }
            this.f58155o = jVar;
            return this.f58154n.continueLoading(HI(jVar, j2));
        }

        public int N(j jVar, int i2, long j2) {
            return ((SampleStream) Util.castNonNull(this.E2[i2])).skipData(ServerSideAdInsertionUtil.getStreamPositionUs(j2, jVar.f58163t, this.f58156r));
        }

        public boolean O(MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            j jVar = (j) lej.nr(this.f58157t);
            return ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodId, this.f58156r) == ServerSideAdInsertionUtil.getStreamPositionUs(ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(jVar, this.f58156r), jVar.f58163t, this.f58156r);
        }

        public void S() throws IOException {
            this.f58154n.maybeThrowPrepareError();
        }

        public long T(j jVar, ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
            jVar.f58161o = j2;
            if (!jVar.equals(this.f58157t.get(0))) {
                for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
                    ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
                    boolean z2 = true;
                    if (exoTrackSelection != null) {
                        if (zArr[i2] && sampleStreamArr[i2] != null) {
                            z2 = false;
                        }
                        zArr2[i2] = z2;
                        if (z2) {
                            sampleStreamArr[i2] = Util.areEqual(this.f58153g[i2], exoTrackSelection) ? new n(jVar, i2) : new EmptySampleStream();
                        }
                    } else {
                        sampleStreamArr[i2] = null;
                        zArr2[i2] = true;
                    }
                }
                return j2;
            }
            this.f58153g = (ExoTrackSelection[]) Arrays.copyOf(exoTrackSelectionArr, exoTrackSelectionArr.length);
            long streamPositionUs = ServerSideAdInsertionUtil.getStreamPositionUs(j2, jVar.f58163t, this.f58156r);
            SampleStream[] sampleStreamArr2 = this.E2;
            SampleStream[] sampleStreamArr3 = sampleStreamArr2.length == 0 ? new SampleStream[exoTrackSelectionArr.length] : (SampleStream[]) Arrays.copyOf(sampleStreamArr2, sampleStreamArr2.length);
            long jSelectTracks = this.f58154n.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr3, zArr2, streamPositionUs);
            this.E2 = (SampleStream[]) Arrays.copyOf(sampleStreamArr3, sampleStreamArr3.length);
            this.f58152e = (MediaLoadData[]) Arrays.copyOf(this.f58152e, sampleStreamArr3.length);
            for (int i3 = 0; i3 < sampleStreamArr3.length; i3++) {
                if (sampleStreamArr3[i3] == null) {
                    sampleStreamArr[i3] = null;
                    this.f58152e[i3] = null;
                } else if (sampleStreamArr[i3] == null || zArr2[i3]) {
                    sampleStreamArr[i3] = new n(jVar, i3);
                    this.f58152e[i3] = null;
                }
            }
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(jSelectTracks, jVar.f58163t, this.f58156r);
        }

        public void Uo(j jVar, long j2, boolean z2) {
            this.f58154n.discardBuffer(ServerSideAdInsertionUtil.getStreamPositionUs(j2, jVar.f58163t, this.f58156r), z2);
        }

        public void ViF(LoadEventInfo loadEventInfo) {
            this.f58149O.remove(Long.valueOf(loadEventInfo.loadTaskId));
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            j jVar = this.f58155o;
            if (jVar == null) {
                return;
            }
            ((MediaPeriod.Callback) Assertions.checkNotNull(jVar.f58162r)).onContinueLoadingRequested(this.f58155o);
        }

        public long X(j jVar, long j2) {
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.f58154n.seekToUs(ServerSideAdInsertionUtil.getStreamPositionUs(j2, jVar.f58163t, this.f58156r)), jVar.f58163t, this.f58156r);
        }

        public void XQ(int i2) throws IOException {
            ((SampleStream) Util.castNonNull(this.E2[i2])).maybeThrowError();
        }

        public long az(j jVar) {
            return qie(jVar, this.f58154n.getNextLoadPositionUs());
        }

        public TrackGroupArray ck() {
            return this.f58154n.getTrackGroups();
        }

        public void e(j jVar) {
            if (jVar.equals(this.f58155o)) {
                this.f58155o = null;
                this.f58149O.clear();
            }
            this.f58157t.remove(jVar);
        }

        public void fD(j jVar, long j2) {
            this.f58154n.reevaluateBuffer(HI(jVar, j2));
        }

        public void g(j jVar, long j2) {
            jVar.f58161o = j2;
            if (this.f58151Z) {
                if (this.f58150S) {
                    ((MediaPeriod.Callback) Assertions.checkNotNull(jVar.f58162r)).onPrepared(jVar);
                }
            } else {
                this.f58151Z = true;
                this.f58154n.prepare(this, ServerSideAdInsertionUtil.getStreamPositionUs(j2, jVar.f58163t, this.f58156r));
            }
        }

        public j gh(MediaLoadData mediaLoadData) {
            if (mediaLoadData == null || mediaLoadData.mediaStartTimeMs == -9223372036854775807L) {
                return null;
            }
            for (int i2 = 0; i2 < this.f58157t.size(); i2++) {
                j jVar = (j) this.f58157t.get(i2);
                long mediaPeriodPositionUs = ServerSideAdInsertionUtil.getMediaPeriodPositionUs(Util.msToUs(mediaLoadData.mediaStartTimeMs), jVar.f58163t, this.f58156r);
                long mediaPeriodEndPositionUs = ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(jVar, this.f58156r);
                if (mediaPeriodPositionUs >= 0 && mediaPeriodPositionUs < mediaPeriodEndPositionUs) {
                    return jVar;
                }
            }
            return null;
        }

        public long iF(j jVar) {
            if (!jVar.equals(this.f58157t.get(0))) {
                return -9223372036854775807L;
            }
            long discontinuity = this.f58154n.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(discontinuity, jVar.f58163t, this.f58156r);
        }

        public long mUb(j jVar) {
            return qie(jVar, this.f58154n.getBufferedPositionUs());
        }

        public void nHg(AdPlaybackState adPlaybackState) {
            this.f58156r = adPlaybackState;
        }

        public void nY(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            this.f58149O.put(Long.valueOf(loadEventInfo.loadTaskId), Pair.create(loadEventInfo, mediaLoadData));
        }

        public void nr(j jVar) {
            this.f58157t.add(jVar);
        }

        public boolean o() {
            return this.f58157t.isEmpty();
        }

        public boolean r(int i2) {
            return ((SampleStream) Util.castNonNull(this.E2[i2])).isReady();
        }

        public int te(j jVar, int i2, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i3) {
            int data = ((SampleStream) Util.castNonNull(this.E2[i2])).readData(formatHolder, decoderInputBuffer, i3 | 5);
            long jQie = qie(jVar, decoderInputBuffer.timeUs);
            if ((data == -4 && jQie == Long.MIN_VALUE) || (data == -3 && mUb(jVar) == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys)) {
                Z(jVar, i2);
                decoderInputBuffer.clear();
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if (data == -4) {
                Z(jVar, i2);
                ((SampleStream) Util.castNonNull(this.E2[i2])).readData(formatHolder, decoderInputBuffer, i3);
                decoderInputBuffer.timeUs = jQie;
            }
            return data;
        }

        public List ty(List list) {
            return this.f58154n.getStreamKeys(list);
        }

        public long xMQ(j jVar, long j2, SeekParameters seekParameters) {
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.f58154n.getAdjustedSeekPositionUs(ServerSideAdInsertionUtil.getStreamPositionUs(j2, jVar.f58163t, this.f58156r), seekParameters), jVar.f58163t, this.f58156r);
        }

        public Ml(MediaPeriod mediaPeriod, Object obj, AdPlaybackState adPlaybackState) {
            this.f58154n = mediaPeriod;
            this.J2 = obj;
            this.f58156r = adPlaybackState;
        }

        public void aYN(j jVar, MediaLoadData mediaLoadData) {
            int iKN = KN(mediaLoadData);
            if (iKN != -1) {
                this.f58152e[iKN] = mediaLoadData;
                jVar.f58159Z[iKN] = true;
            }
        }
    }

    private static final class j implements MediaPeriod {
        public final DrmSessionEventListener.EventDispatcher J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final MediaSourceEventListener.EventDispatcher f58158O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public boolean[] f58159Z = new boolean[0];

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Ml f58160n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f58161o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public MediaPeriod.Callback f58162r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f58163t;

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j2) {
            return this.f58160n.J2(this, j2);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j2, boolean z2) {
            this.f58160n.Uo(this, j2, z2);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
            return this.f58160n.xMQ(this, j2, seekParameters);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.f58160n.mUb(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.f58160n.az(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public List getStreamKeys(List list) {
            return this.f58160n.ty(list);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.f58160n.ck();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.f58160n.Ik(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws IOException {
            this.f58160n.S();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j2) {
            this.f58162r = callback;
            this.f58160n.g(this, j2);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            return this.f58160n.iF(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j2) {
            this.f58160n.fD(this, j2);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j2) {
            return this.f58160n.X(this, j2);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
            if (this.f58159Z.length == 0) {
                this.f58159Z = new boolean[sampleStreamArr.length];
            }
            return this.f58160n.T(this, exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j2);
        }

        public j(Ml ml, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener.EventDispatcher eventDispatcher2) {
            this.f58160n = ml;
            this.f58163t = mediaPeriodId;
            this.f58158O = eventDispatcher;
            this.J2 = eventDispatcher2;
        }
    }

    private static final class n implements SampleStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j f58164n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f58165t;

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.f58164n.f58160n.r(this.f58165t);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.f58164n.f58160n.XQ(this.f58165t);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            j jVar = this.f58164n;
            return jVar.f58160n.te(jVar, this.f58165t, formatHolder, decoderInputBuffer, i2);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j2) {
            j jVar = this.f58164n;
            return jVar.f58160n.N(jVar, this.f58165t, j2);
        }

        public n(j jVar, int i2) {
            this.f58164n = jVar;
            this.f58165t = i2;
        }
    }

    @Nullable
    private j getMediaPeriodForEvent(@Nullable MediaSource.MediaPeriodId mediaPeriodId, @Nullable MediaLoadData mediaLoadData, boolean z2) {
        if (mediaPeriodId == null) {
            return null;
        }
        List list = this.mediaPeriods.get((Object) new Pair(Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid));
        if (list.isEmpty()) {
            return null;
        }
        if (z2) {
            Ml ml = (Ml) lej.nr(list);
            return ml.f58155o != null ? ml.f58155o : (j) lej.nr(ml.f58157t);
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            j jVarGh = ((Ml) list.get(i2)).gh(mediaLoadData);
            if (jVarGh != null) {
                return jVarGh;
            }
        }
        return (j) ((Ml) list.get(0)).f58157t.get(0);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.downstreamFormatChanged(mediaLoadData);
        } else {
            mediaPeriodForEvent.f58160n.aYN(mediaPeriodForEvent, mediaLoadData);
            mediaPeriodForEvent.f58158O.downstreamFormatChanged(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.f58163t.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysLoaded();
        } else {
            mediaPeriodForEvent.J2.drmKeysLoaded();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRemoved(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRemoved();
        } else {
            mediaPeriodForEvent.J2.drmKeysRemoved();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRestored(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRestored();
        } else {
            mediaPeriodForEvent.J2.drmKeysRestored();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionAcquired(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, true);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionAcquired(i3);
        } else {
            mediaPeriodForEvent.J2.drmSessionAcquired(i3);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionManagerError(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionManagerError(exc);
        } else {
            mediaPeriodForEvent.J2.drmSessionManagerError(exc);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionReleased(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionReleased();
        } else {
            mediaPeriodForEvent.J2.drmSessionReleased();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCanceled(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCanceled(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.f58160n.ViF(loadEventInfo);
            mediaPeriodForEvent.f58158O.loadCanceled(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.f58163t.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCompleted(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCompleted(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.f58160n.ViF(loadEventInfo);
            mediaPeriodForEvent.f58158O.loadCompleted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.f58163t.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadError(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadError(loadEventInfo, mediaLoadData, iOException, z2);
            return;
        }
        if (z2) {
            mediaPeriodForEvent.f58160n.ViF(loadEventInfo);
        }
        mediaPeriodForEvent.f58158O.loadError(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.f58163t.periodUid))), iOException, z2);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadStarted(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadStarted(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.f58160n.nY(loadEventInfo, mediaLoadData);
            mediaPeriodForEvent.f58158O.loadStarted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.f58163t.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        j mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.upstreamDiscarded(mediaLoadData);
        } else {
            mediaPeriodForEvent.f58158O.upstreamDiscarded(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.adPlaybackStates.get(mediaPeriodForEvent.f58163t.periodUid))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class w6 extends ForwardingTimeline {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final u f58166n;

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z2) {
            super.getPeriod(i2, period, true);
            AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.f58166n.get(period.uid));
            long j2 = period.durationUs;
            long mediaPeriodPositionUsForContent = j2 == -9223372036854775807L ? adPlaybackState.contentDurationUs : ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(j2, -1, adPlaybackState);
            Timeline.Period period2 = new Timeline.Period();
            long mediaPeriodPositionUsForContent2 = 0;
            for (int i3 = 0; i3 < i2 + 1; i3++) {
                this.timeline.getPeriod(i3, period2, true);
                AdPlaybackState adPlaybackState2 = (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.f58166n.get(period2.uid));
                if (i3 == 0) {
                    mediaPeriodPositionUsForContent2 = -ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(-period2.getPositionInWindowUs(), -1, adPlaybackState2);
                }
                if (i3 != i2) {
                    mediaPeriodPositionUsForContent2 += ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(period2.durationUs, -1, adPlaybackState2);
                }
            }
            period.set(period.id, period.uid, period.windowIndex, mediaPeriodPositionUsForContent, mediaPeriodPositionUsForContent2, adPlaybackState, period.isPlaceholder);
            return period;
        }

        public w6(Timeline timeline, u uVar) {
            boolean z2;
            super(timeline);
            if (timeline.getWindowCount() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Assertions.checkState(z2);
            Timeline.Period period = new Timeline.Period();
            for (int i2 = 0; i2 < timeline.getPeriodCount(); i2++) {
                timeline.getPeriod(i2, period, true);
                Assertions.checkState(uVar.containsKey(Assertions.checkNotNull(period.uid)));
            }
            this.f58166n = uVar;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            super.getWindow(i2, window, j2);
            AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.f58166n.get(Assertions.checkNotNull(getPeriod(window.firstPeriodIndex, new Timeline.Period(), true).uid)));
            long mediaPeriodPositionUsForContent = ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.positionInFirstPeriodUs, -1, adPlaybackState);
            long j3 = -9223372036854775807L;
            if (window.durationUs == -9223372036854775807L) {
                long j4 = adPlaybackState.contentDurationUs;
                if (j4 != -9223372036854775807L) {
                    window.durationUs = j4 - mediaPeriodPositionUsForContent;
                }
            } else {
                Timeline.Period period = getPeriod(window.lastPeriodIndex, new Timeline.Period());
                long j5 = period.durationUs;
                if (j5 != -9223372036854775807L) {
                    j3 = period.positionInWindowUs + j5;
                }
                window.durationUs = j3;
            }
            window.positionInFirstPeriodUs = mediaPeriodPositionUsForContent;
            return window;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaLoadData correctMediaLoadData(j jVar, MediaLoadData mediaLoadData, AdPlaybackState adPlaybackState) {
        return new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, correctMediaLoadDataPositionMs(mediaLoadData.mediaStartTimeMs, jVar, adPlaybackState), correctMediaLoadDataPositionMs(mediaLoadData.mediaEndTimeMs, jVar, adPlaybackState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getMediaPeriodEndPositionUs(j jVar, AdPlaybackState adPlaybackState) {
        MediaSource.MediaPeriodId mediaPeriodId = jVar.f58163t;
        if (mediaPeriodId.isAd()) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
            if (adGroup.count == -1) {
                return 0L;
            }
            return adGroup.durationsUs[mediaPeriodId.adIndexInAdGroup];
        }
        int i2 = mediaPeriodId.nextAdGroupIndex;
        if (i2 == -1) {
            return Long.MAX_VALUE;
        }
        long j2 = adPlaybackState.getAdGroup(i2).timeUs;
        if (j2 == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j2;
    }

    public static /* synthetic */ void n(ServerSideAdInsertionMediaSource serverSideAdInsertionMediaSource, u uVar) {
        AdPlaybackState adPlaybackState;
        for (Ml ml : serverSideAdInsertionMediaSource.mediaPeriods.values()) {
            AdPlaybackState adPlaybackState2 = (AdPlaybackState) uVar.get(ml.J2);
            if (adPlaybackState2 != null) {
                ml.nHg(adPlaybackState2);
            }
        }
        Ml ml2 = serverSideAdInsertionMediaSource.lastUsedMediaPeriod;
        if (ml2 != null && (adPlaybackState = (AdPlaybackState) uVar.get(ml2.J2)) != null) {
            serverSideAdInsertionMediaSource.lastUsedMediaPeriod.nHg(adPlaybackState);
        }
        serverSideAdInsertionMediaSource.adPlaybackStates = uVar;
        if (serverSideAdInsertionMediaSource.contentTimeline != null) {
            serverSideAdInsertionMediaSource.refreshSourceInfo(new w6(serverSideAdInsertionMediaSource.contentTimeline, uVar));
        }
    }

    private void releaseLastUsedMediaPeriod() {
        Ml ml = this.lastUsedMediaPeriod;
        if (ml != null) {
            ml.E2(this.mediaSource);
            this.lastUsedMediaPeriod = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        Ml ml;
        Pair pair = new Pair(Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid);
        Ml ml2 = this.lastUsedMediaPeriod;
        boolean z2 = false;
        if (ml2 != null) {
            if (ml2.J2.equals(mediaPeriodId.periodUid)) {
                ml = this.lastUsedMediaPeriod;
                this.mediaPeriods.put(pair, ml);
                z2 = true;
            } else {
                this.lastUsedMediaPeriod.E2(this.mediaSource);
                ml = null;
            }
            this.lastUsedMediaPeriod = null;
        } else {
            ml = null;
        }
        if (ml == null && ((ml = (Ml) lej.O(this.mediaPeriods.get((Object) pair), null)) == null || !ml.O(mediaPeriodId, j2))) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) this.adPlaybackStates.get(mediaPeriodId.periodUid));
            Ml ml3 = new Ml(this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(mediaPeriodId.periodUid, mediaPeriodId.windowSequenceNumber), allocator, ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodId, adPlaybackState)), mediaPeriodId.periodUid, adPlaybackState);
            this.mediaPeriods.put(pair, ml3);
            ml = ml3;
        }
        j jVar = new j(ml, mediaPeriodId, createEventDispatcher(mediaPeriodId), createDrmEventDispatcher(mediaPeriodId));
        ml.nr(jVar);
        if (z2 && ml.f58153g.length > 0) {
            jVar.seekToUs(j2);
        }
        return jVar;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void enableInternal() {
        this.mediaSource.enable(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.mediaSource.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
        this.contentTimeline = timeline;
        AdPlaybackStateUpdater adPlaybackStateUpdater = this.adPlaybackStateUpdater;
        if ((adPlaybackStateUpdater == null || !adPlaybackStateUpdater.onAdPlaybackStateUpdateRequested(timeline)) && !this.adPlaybackStates.isEmpty()) {
            refreshSourceInfo(new w6(timeline, this.adPlaybackStates));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        j jVar = (j) mediaPeriod;
        jVar.f58160n.e(jVar);
        if (jVar.f58160n.o()) {
            this.mediaPeriods.remove(new Pair(Long.valueOf(jVar.f58163t.windowSequenceNumber), jVar.f58163t.periodUid), jVar.f58160n);
            if (this.mediaPeriods.isEmpty()) {
                this.lastUsedMediaPeriod = jVar.f58160n;
            } else {
                jVar.f58160n.E2(this.mediaSource);
            }
        }
    }

    public ServerSideAdInsertionMediaSource(MediaSource mediaSource, @Nullable AdPlaybackStateUpdater adPlaybackStateUpdater) {
        this.mediaSource = mediaSource;
        this.adPlaybackStateUpdater = adPlaybackStateUpdater;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void disableInternal() {
        releaseLastUsedMediaPeriod();
        this.mediaSource.disable(this);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        synchronized (this) {
            this.playbackHandler = handlerCreateHandlerForCurrentLooper;
        }
        this.mediaSource.addEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.mediaSource.addDrmEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.mediaSource.prepareSource(this, transferListener, getPlayerId());
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        releaseLastUsedMediaPeriod();
        this.contentTimeline = null;
        synchronized (this) {
            this.playbackHandler = null;
        }
        this.mediaSource.releaseSource(this);
        this.mediaSource.removeEventListener(this);
        this.mediaSource.removeDrmEventListener(this);
    }

    public void setAdPlaybackStates(final u uVar) {
        boolean z2;
        boolean z3;
        Assertions.checkArgument(!uVar.isEmpty());
        Object objCheckNotNull = Assertions.checkNotNull(((AdPlaybackState) uVar.values().rl().get(0)).adsId);
        xZD it = uVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AdPlaybackState adPlaybackState = (AdPlaybackState) entry.getValue();
            Assertions.checkArgument(Util.areEqual(objCheckNotNull, adPlaybackState.adsId));
            AdPlaybackState adPlaybackState2 = (AdPlaybackState) this.adPlaybackStates.get(key);
            if (adPlaybackState2 != null) {
                for (int i2 = adPlaybackState.removedAdGroupCount; i2 < adPlaybackState.adGroupCount; i2++) {
                    AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i2);
                    Assertions.checkArgument(adGroup.isServerSideInserted);
                    if (i2 < adPlaybackState2.adGroupCount) {
                        if (ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState, i2) >= ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState2, i2)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Assertions.checkArgument(z3);
                    }
                    if (adGroup.timeUs == Long.MIN_VALUE) {
                        if (ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState, i2) == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Assertions.checkArgument(z2);
                    }
                }
            }
        }
        synchronized (this) {
            try {
                Handler handler = this.playbackHandler;
                if (handler == null) {
                    this.adPlaybackStates = uVar;
                } else {
                    handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.fuX
                        @Override // java.lang.Runnable
                        public final void run() {
                            ServerSideAdInsertionMediaSource.n(this.f58169n, uVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static long correctMediaLoadDataPositionMs(long j2, j jVar, AdPlaybackState adPlaybackState) {
        long mediaPeriodPositionUsForContent;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jMsToUs = Util.msToUs(j2);
        MediaSource.MediaPeriodId mediaPeriodId = jVar.f58163t;
        if (mediaPeriodId.isAd()) {
            mediaPeriodPositionUsForContent = ServerSideAdInsertionUtil.getMediaPeriodPositionUsForAd(jMsToUs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        } else {
            mediaPeriodPositionUsForContent = ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(jMsToUs, -1, adPlaybackState);
        }
        return Util.usToMs(mediaPeriodPositionUsForContent);
    }
}
