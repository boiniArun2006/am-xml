package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.common.collect.xZD;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class DownloadHelper {
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    private Callback callback;
    private final Handler callbackHandler;
    private List<ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final MediaItem.LocalConfiguration localConfiguration;
    private MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private I28 mediaPreparer;

    @Nullable
    private final MediaSource mediaSource;
    private final RendererCapabilities[] rendererCapabilities;
    private final SparseIntArray scratchSet;
    private TrackGroupArray[] trackGroupArrays;
    private List<ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final DefaultTrackSelector trackSelector;
    private final Timeline.Window window;

    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class I28 implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        private boolean E2;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public Timeline f57995S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final Handler f57996Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public MediaPeriod[] f57997g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MediaSource f57998n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final HandlerThread f57999o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final DownloadHelper f58001t;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Allocator f57994O = new DefaultAllocator(true, 65536);
        private final ArrayList J2 = new ArrayList();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Handler f58000r = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.fuX
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f58037n.rl(message);
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public boolean rl(Message message) {
            if (this.E2) {
                return false;
            }
            int i2 = message.what;
            if (i2 == 0) {
                try {
                    this.f58001t.onMediaPrepared();
                } catch (ExoPlaybackException e2) {
                    this.f58000r.obtainMessage(1, new IOException(e2)).sendToTarget();
                }
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            nr();
            this.f58001t.onMediaPreparationFailed((IOException) Util.castNonNull(message.obj));
            return true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.f57998n.prepareSource(this, null, PlayerId.UNSET);
                this.f57996Z.sendEmptyMessage(1);
                return true;
            }
            int i3 = 0;
            if (i2 == 1) {
                try {
                    if (this.f57997g == null) {
                        this.f57998n.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i3 < this.J2.size()) {
                            ((MediaPeriod) this.J2.get(i3)).maybeThrowPrepareError();
                            i3++;
                        }
                    }
                    this.f57996Z.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e2) {
                    this.f58000r.obtainMessage(1, e2).sendToTarget();
                }
                return true;
            }
            if (i2 == 2) {
                MediaPeriod mediaPeriod = (MediaPeriod) message.obj;
                if (this.J2.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(0L);
                }
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            MediaPeriod[] mediaPeriodArr = this.f57997g;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i3 < length) {
                    this.f57998n.releasePeriod(mediaPeriodArr[i3]);
                    i3++;
                }
            }
            this.f57998n.releaseSource(this);
            this.f57996Z.removeCallbacksAndMessages(null);
            this.f57999o.quit();
            return true;
        }

        public void nr() {
            if (this.E2) {
                return;
            }
            this.E2 = true;
            this.f57996Z.sendEmptyMessage(3);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.J2.remove(mediaPeriod);
            if (this.J2.isEmpty()) {
                this.f57996Z.removeMessages(1);
                this.f58000r.sendEmptyMessage(0);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
            MediaPeriod[] mediaPeriodArr;
            if (this.f57995S != null) {
                return;
            }
            if (timeline.getWindow(0, new Timeline.Window()).isLive()) {
                this.f58000r.obtainMessage(1, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.f57995S = timeline;
            this.f57997g = new MediaPeriod[timeline.getPeriodCount()];
            int i2 = 0;
            while (true) {
                mediaPeriodArr = this.f57997g;
                if (i2 >= mediaPeriodArr.length) {
                    break;
                }
                MediaPeriod mediaPeriodCreatePeriod = this.f57998n.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i2)), this.f57994O, 0L);
                this.f57997g[i2] = mediaPeriodCreatePeriod;
                this.J2.add(mediaPeriodCreatePeriod);
                i2++;
            }
            for (MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            if (this.J2.contains(mediaPeriod)) {
                this.f57996Z.obtainMessage(2, mediaPeriod).sendToTarget();
            }
        }

        public I28(MediaSource mediaSource, DownloadHelper downloadHelper) {
            this.f57998n = mediaSource;
            this.f58001t = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f57999o = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.f57996Z = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(0);
        }
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    private static final class Ml implements BandwidthMeter {
        private Ml() {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public TransferListener getTransferListener() {
            return null;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        }

        /* synthetic */ Ml(j jVar) {
            this();
        }
    }

    public static /* synthetic */ void O(Metadata metadata) {
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    @Deprecated
    public static DownloadHelper forDash(Context context, Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory) {
        return forDash(uri, factory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    @Deprecated
    public static DownloadHelper forHls(Context context, Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory) {
        return forHls(uri, factory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem) {
        Assertions.checkArgument(isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)));
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), null, null, null);
    }

    @Deprecated
    public static DownloadHelper forProgressive(Context context, Uri uri) {
        return forMediaItem(context, new MediaItem.Builder().setUri(uri).build());
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory) {
        return forSmoothStreaming(uri, factory, renderersFactory, null, DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT);
    }

    public static /* synthetic */ void n(CueGroup cueGroup) {
    }

    public static /* synthetic */ void nr() {
    }

    public static /* synthetic */ DrmSessionManager rl(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
        return drmSessionManager;
    }

    private void setPreparedWithMedia() {
        this.isPreparedWithMedia = true;
    }

    public DownloadRequest getDownloadRequest(@Nullable byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    class j implements VideoRendererEventListener {
        j() {
        }
    }

    class n implements AudioRendererEventListener {
        n() {
        }
    }

    private static final class w6 extends BaseTrackSelection {

        private static final class j implements ExoTrackSelection.Factory {
            private j() {
            }

            @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
            public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
                ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
                for (int i2 = 0; i2 < definitionArr.length; i2++) {
                    ExoTrackSelection.Definition definition = definitionArr[i2];
                    exoTrackSelectionArr[i2] = definition == null ? null : new w6(definition.group, definition.tracks);
                }
                return exoTrackSelectionArr;
            }

            /* synthetic */ j(j jVar) {
                this();
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j2, long j3, long j4, List list, MediaChunkIterator[] mediaChunkIteratorArr) {
        }

        public w6(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }
    }

    private void addTrackSelectionInternal(int i2, TrackSelectionParameters trackSelectionParameters) throws ExoPlaybackException {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i2);
        xZD it = trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType((TrackSelectionOverride) it.next()).build());
            runTrackSelection(i2);
        }
    }

    private void assertPreparedWithMedia() {
        Assertions.checkState(this.isPreparedWithMedia);
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager);
    }

    private static MediaSource createMediaSourceInternal(MediaItem mediaItem, DataSource.Factory factory, @Nullable final DrmSessionManager drmSessionManager) {
        DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(factory, ExtractorsFactory.EMPTY);
        if (drmSessionManager != null) {
            defaultMediaSourceFactory.setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: com.google.android.exoplayer2.offline.j
                @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
                public final DrmSessionManager get(MediaItem mediaItem2) {
                    return DownloadHelper.rl(drmSessionManager, mediaItem2);
                }
            });
        }
        return defaultMediaSourceFactory.createMediaSource(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forProgressive(Context context, Uri uri, @Nullable String str) {
        return forMediaItem(context, new MediaItem.Builder().setUri(uri).setCustomCacheKey(str).build());
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Context context, Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory) {
        return forSmoothStreaming(uri, factory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    private static boolean isProgressive(MediaItem.LocalConfiguration localConfiguration) {
        return Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPreparationFailed(final IOException iOException) {
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: com.google.android.exoplayer2.offline.n
            @Override // java.lang.Runnable
            public final void run() {
                DownloadHelper downloadHelper = this.f58039n;
                ((DownloadHelper.Callback) Assertions.checkNotNull(downloadHelper.callback)).onPrepareError(downloadHelper, iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPrepared() throws ExoPlaybackException {
        Assertions.checkNotNull(this.mediaPreparer);
        Assertions.checkNotNull(this.mediaPreparer.f57997g);
        Assertions.checkNotNull(this.mediaPreparer.f57995S);
        int length = this.mediaPreparer.f57997g.length;
        int length2 = this.rendererCapabilities.length;
        this.trackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        this.immutableTrackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                this.trackSelectionsByPeriodAndRenderer[i2][i3] = new ArrayList();
                this.immutableTrackSelectionsByPeriodAndRenderer[i2][i3] = Collections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i2][i3]);
            }
        }
        this.trackGroupArrays = new TrackGroupArray[length];
        this.mappedTrackInfos = new MappingTrackSelector.MappedTrackInfo[length];
        for (int i5 = 0; i5 < length; i5++) {
            this.trackGroupArrays[i5] = this.mediaPreparer.f57997g[i5].getTrackGroups();
            this.trackSelector.onSelectionActivated(runTrackSelection(i5).info);
            this.mappedTrackInfos[i5] = (MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.trackSelector.getCurrentMappedTrackInfo());
        }
        setPreparedWithMedia();
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: com.google.android.exoplayer2.offline.CN3
            @Override // java.lang.Runnable
            public final void run() {
                DownloadHelper downloadHelper = this.f57992n;
                ((DownloadHelper.Callback) Assertions.checkNotNull(downloadHelper.callback)).onPrepared(downloadHelper);
            }
        });
    }

    private TrackSelectorResult runTrackSelection(int i2) throws ExoPlaybackException {
        TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, this.trackGroupArrays[i2], new MediaSource.MediaPeriodId(this.mediaPreparer.f57995S.getUidOfPeriod(i2)), this.mediaPreparer.f57995S);
        for (int i3 = 0; i3 < trackSelectorResultSelectTracks.length; i3++) {
            ExoTrackSelection exoTrackSelection = trackSelectorResultSelectTracks.selections[i3];
            if (exoTrackSelection != null) {
                List<ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i2][i3];
                int i5 = 0;
                while (true) {
                    if (i5 >= list.size()) {
                        list.add(exoTrackSelection);
                        break;
                    }
                    ExoTrackSelection exoTrackSelection2 = list.get(i5);
                    if (exoTrackSelection2.getTrackGroup().equals(exoTrackSelection.getTrackGroup())) {
                        this.scratchSet.clear();
                        for (int i7 = 0; i7 < exoTrackSelection2.length(); i7++) {
                            this.scratchSet.put(exoTrackSelection2.getIndexInTrackGroup(i7), 0);
                        }
                        for (int i8 = 0; i8 < exoTrackSelection.length(); i8++) {
                            this.scratchSet.put(exoTrackSelection.getIndexInTrackGroup(i8), 0);
                        }
                        int[] iArr = new int[this.scratchSet.size()];
                        for (int i9 = 0; i9 < this.scratchSet.size(); i9++) {
                            iArr[i9] = this.scratchSet.keyAt(i9);
                        }
                        list.set(i5, new w6(exoTrackSelection2.getTrackGroup(), iArr));
                    } else {
                        i5++;
                    }
                }
            }
        }
        return trackSelectorResultSelectTracks;
    }

    public DownloadRequest getDownloadRequest(String str, @Nullable byte[] bArr) {
        DownloadRequest.Builder mimeType = new DownloadRequest.Builder(str, this.localConfiguration.uri).setMimeType(this.localConfiguration.mimeType);
        MediaItem.DrmConfiguration drmConfiguration = this.localConfiguration.drmConfiguration;
        DownloadRequest.Builder data = mimeType.setKeySetId(drmConfiguration != null ? drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.localConfiguration.customCacheKey).setData(bArr);
        if (this.mediaSource == null) {
            return data.build();
        }
        assertPreparedWithMedia();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.trackSelectionsByPeriodAndRenderer.length;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList2.clear();
            int length2 = this.trackSelectionsByPeriodAndRenderer[i2].length;
            for (int i3 = 0; i3 < length2; i3++) {
                arrayList2.addAll(this.trackSelectionsByPeriodAndRenderer[i2][i3]);
            }
            arrayList.addAll(this.mediaPreparer.f57997g[i2].getStreamKeys(arrayList2));
        }
        return data.setStreamKeys(arrayList).build();
    }

    @Nullable
    public Object getManifest() {
        if (this.mediaSource == null) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.f57995S.getWindowCount() > 0) {
            return this.mediaPreparer.f57995S.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public int getPeriodCount() {
        if (this.mediaSource == null) {
            return 0;
        }
        assertPreparedWithMedia();
        return this.trackGroupArrays.length;
    }

    public void prepare(final Callback callback) {
        Assertions.checkState(this.callback == null);
        this.callback = callback;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null) {
            this.mediaPreparer = new I28(mediaSource, this);
        } else {
            this.callbackHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.offline.Ml
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadHelper.J2(this.f58022n, callback);
                }
            });
        }
    }

    public void release() {
        I28 i28 = this.mediaPreparer;
        if (i28 != null) {
            i28.nr();
        }
        this.trackSelector.release();
    }

    public DownloadHelper(MediaItem mediaItem, @Nullable MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilities[] rendererCapabilitiesArr) {
        this.localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration);
        this.mediaSource = mediaSource;
        j jVar = null;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(trackSelectionParameters, new w6.j(jVar));
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.scratchSet = new SparseIntArray();
        defaultTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: com.google.android.exoplayer2.offline.w6
            @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DownloadHelper.nr();
            }
        }, new Ml(jVar));
        this.callbackHandler = Util.createHandlerForCurrentOrMainLooper();
        this.window = new Timeline.Window();
    }

    public static /* synthetic */ void J2(DownloadHelper downloadHelper, Callback callback) {
        downloadHelper.getClass();
        callback.onPrepared(downloadHelper);
    }

    @Deprecated
    public static DownloadHelper forDash(Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, TrackSelectionParameters trackSelectionParameters) {
        return forMediaItem(new MediaItem.Builder().setUri(uri).setMimeType("application/dash+xml").build(), trackSelectionParameters, renderersFactory, factory, drmSessionManager);
    }

    @Deprecated
    public static DownloadHelper forHls(Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, TrackSelectionParameters trackSelectionParameters) {
        return forMediaItem(new MediaItem.Builder().setUri(uri).setMimeType("application/x-mpegURL").build(), trackSelectionParameters, renderersFactory, factory, drmSessionManager);
    }

    public static DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(Context context) {
        return DefaultTrackSelector.Parameters.getDefaults(context).buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    }

    public static RendererCapabilities[] getRendererCapabilities(RenderersFactory renderersFactory) {
        Renderer[] rendererArrCreateRenderers = renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new j(), new n(), new TextOutput() { // from class: com.google.android.exoplayer2.offline.I28
            @Override // com.google.android.exoplayer2.text.TextOutput
            public final void onCues(CueGroup cueGroup) {
                DownloadHelper.n(cueGroup);
            }
        }, new MetadataOutput() { // from class: com.google.android.exoplayer2.offline.Wre
            @Override // com.google.android.exoplayer2.metadata.MetadataOutput
            public final void onMetadata(Metadata metadata) {
                DownloadHelper.O(metadata);
            }
        });
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[rendererArrCreateRenderers.length];
        for (int i2 = 0; i2 < rendererArrCreateRenderers.length; i2++) {
            rendererCapabilitiesArr[i2] = rendererArrCreateRenderers[i2].getCapabilities();
        }
        return rendererCapabilitiesArr;
    }

    public void addAudioLanguagesToSelection(String... strArr) {
        boolean z2;
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities) {
                int trackType = rendererCapabilities.getTrackType();
                if (trackType != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                builderBuildUpon.setTrackTypeDisabled(trackType, z2);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredAudioLanguage(str).build();
                for (int i2 = 0; i2 < periodCount; i2++) {
                    addTrackSelectionInternal(i2, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void addTextLanguagesToSelection(boolean z2, String... strArr) {
        boolean z3;
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setSelectUndeterminedTextLanguage(z2);
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities) {
                int trackType = rendererCapabilities.getTrackType();
                if (trackType != 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                builderBuildUpon.setTrackTypeDisabled(trackType, z3);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredTextLanguage(str).build();
                for (int i2 = 0; i2 < periodCount; i2++) {
                    addTrackSelectionInternal(i2, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void addTrackSelection(int i2, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            addTrackSelectionInternal(i2, trackSelectionParameters);
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i2, int i3, DefaultTrackSelector.Parameters parameters, List<DefaultTrackSelector.SelectionOverride> list) {
        boolean z2;
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = parameters.buildUpon();
            for (int i5 = 0; i5 < this.mappedTrackInfos[i2].getRendererCount(); i5++) {
                if (i5 != i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                builderBuildUpon.setRendererDisabled(i5, z2);
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i2, builderBuildUpon.build());
                return;
            }
            TrackGroupArray trackGroups = this.mappedTrackInfos[i2].getTrackGroups(i3);
            for (int i7 = 0; i7 < list.size(); i7++) {
                builderBuildUpon.setSelectionOverride(i3, trackGroups, list.get(i7));
                addTrackSelectionInternal(i2, builderBuildUpon.build());
            }
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void clearTrackSelections(int i2) {
        assertPreparedWithMedia();
        for (int i3 = 0; i3 < this.rendererCapabilities.length; i3++) {
            this.trackSelectionsByPeriodAndRenderer[i2][i3].clear();
        }
    }

    public MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i2) {
        assertPreparedWithMedia();
        return this.mappedTrackInfos[i2];
    }

    public TrackGroupArray getTrackGroups(int i2) {
        assertPreparedWithMedia();
        return this.trackGroupArrays[i2];
    }

    public List<ExoTrackSelection> getTrackSelections(int i2, int i3) {
        assertPreparedWithMedia();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i2][i3];
    }

    public Tracks getTracks(int i2) {
        assertPreparedWithMedia();
        return TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i2], this.immutableTrackSelectionsByPeriodAndRenderer[i2]);
    }

    public void replaceTrackSelections(int i2, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            clearTrackSelections(i2);
            addTrackSelectionInternal(i2, trackSelectionParameters);
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), renderersFactory, factory, null);
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, TrackSelectionParameters trackSelectionParameters) {
        return forMediaItem(new MediaItem.Builder().setUri(uri).setMimeType("application/vnd.ms-sstr+xml").build(), trackSelectionParameters, renderersFactory, factory, drmSessionManager);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, trackSelectionParameters, renderersFactory, factory, null);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        RendererCapabilities[] rendererCapabilities;
        boolean zIsProgressive = isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration));
        Assertions.checkArgument(zIsProgressive || factory != null);
        MediaSource mediaSourceCreateMediaSourceInternal = zIsProgressive ? null : createMediaSourceInternal(mediaItem, (DataSource.Factory) Util.castNonNull(factory), drmSessionManager);
        if (renderersFactory != null) {
            rendererCapabilities = getRendererCapabilities(renderersFactory);
        } else {
            rendererCapabilities = new RendererCapabilities[0];
        }
        return new DownloadHelper(mediaItem, mediaSourceCreateMediaSourceInternal, trackSelectionParameters, rendererCapabilities);
    }
}
