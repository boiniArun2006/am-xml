package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    private final MediaSource.Factory adMediaSourceFactory;

    @Nullable
    private AdPlaybackState adPlaybackState;
    private final DataSpec adTagDataSpec;
    private final AdViewProvider adViewProvider;
    private final Object adsId;
    private final AdsLoader adsLoader;

    @Nullable
    private w6 componentListener;
    private final MediaSource contentMediaSource;

    @Nullable
    private Timeline contentTimeline;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Timeline.Period period = new Timeline.Period();
    private j[][] adMediaSourceHolders = new j[0][];

    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i2) {
            return new AdLoadException(1, new IOException("Failed to load ad group " + i2, exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            Assertions.checkState(this.type == 3);
            return (RuntimeException) Assertions.checkNotNull(getCause());
        }

        private AdLoadException(int i2, Exception exc) {
            super(exc);
            this.type = i2;
        }
    }

    private final class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Timeline f58136O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MediaSource.MediaPeriodId f58137n;
        private MediaSource nr;
        private final List rl = new ArrayList();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Uri f58138t;

        public j(MediaSource.MediaPeriodId mediaPeriodId) {
            this.f58137n = mediaPeriodId;
        }

        public boolean J2() {
            return this.rl.isEmpty();
        }

        public void KN(MaskingMediaPeriod maskingMediaPeriod) {
            this.rl.remove(maskingMediaPeriod);
            maskingMediaPeriod.releasePeriod();
        }

        public void O(MediaSource mediaSource, Uri uri) {
            this.nr = mediaSource;
            this.f58138t = uri;
            for (int i2 = 0; i2 < this.rl.size(); i2++) {
                MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) this.rl.get(i2);
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(AdsMediaSource.this.new n(uri));
            }
            AdsMediaSource.this.prepareChildSource(this.f58137n, mediaSource);
        }

        public MediaPeriod n(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j2);
            this.rl.add(maskingMediaPeriod);
            MediaSource mediaSource = this.nr;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(AdsMediaSource.this.new n((Uri) Assertions.checkNotNull(this.f58138t)));
            }
            Timeline timeline = this.f58136O;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return maskingMediaPeriod;
        }

        public boolean nr() {
            return this.nr != null;
        }

        public long rl() {
            Timeline timeline = this.f58136O;
            if (timeline == null) {
                return -9223372036854775807L;
            }
            return timeline.getPeriod(0, AdsMediaSource.this.period).getDurationUs();
        }

        public void Uo() {
            if (nr()) {
                AdsMediaSource.this.releaseChildSource(this.f58137n);
            }
        }

        public void t(Timeline timeline) {
            boolean z2 = true;
            if (timeline.getPeriodCount() != 1) {
                z2 = false;
            }
            Assertions.checkArgument(z2);
            if (this.f58136O == null) {
                Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i2 = 0; i2 < this.rl.size(); i2++) {
                    MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) this.rl.get(i2);
                    maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, maskingMediaPeriod.id.windowSequenceNumber));
                }
            }
            this.f58136O = timeline;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class n implements MaskingMediaPeriod.PrepareListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f58139n;

        public n(Uri uri) {
            this.f58139n = uri;
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(final MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.Wre
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.n nVar = this.f58167n;
                    MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
                    AdsMediaSource.this.adsLoader.handlePrepareComplete(AdsMediaSource.this, mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(final MediaSource.MediaPeriodId mediaPeriodId, final IOException iOException) {
            AdsMediaSource.this.createEventDispatcher(mediaPeriodId).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), new DataSpec(this.f58139n), SystemClock.elapsedRealtime()), 6, (IOException) AdLoadException.createForAd(iOException), true);
            AdsMediaSource.this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.I28
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.n nVar = this.f58145n;
                    MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
                    AdsMediaSource.this.adsLoader.handlePrepareError(AdsMediaSource.this, mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup, iOException);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class w6 implements AdsLoader.EventListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Handler f58140n = Util.createHandlerForCurrentLooper();
        private volatile boolean rl;

        public void rl() {
            this.rl = true;
            this.f58140n.removeCallbacksAndMessages(null);
        }

        public w6() {
        }

        public static /* synthetic */ void n(w6 w6Var, AdPlaybackState adPlaybackState) {
            if (w6Var.rl) {
                return;
            }
            AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdLoadError(AdLoadException adLoadException, DataSpec dataSpec) {
            if (this.rl) {
                return;
            }
            AdsMediaSource.this.createEventDispatcher(null).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), dataSpec, SystemClock.elapsedRealtime()), 6, (IOException) adLoadException, true);
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(final AdPlaybackState adPlaybackState) {
            if (this.rl) {
                return;
            }
            this.f58140n.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.CN3
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.w6.n(this.f58142n, adPlaybackState);
                }
            });
        }
    }

    private long[][] getAdDurationsUs() {
        long[][] jArr = new long[this.adMediaSourceHolders.length][];
        int i2 = 0;
        while (true) {
            j[][] jVarArr = this.adMediaSourceHolders;
            if (i2 >= jVarArr.length) {
                return jArr;
            }
            jArr[i2] = new long[jVarArr[i2].length];
            int i3 = 0;
            while (true) {
                j[] jVarArr2 = this.adMediaSourceHolders[i2];
                if (i3 < jVarArr2.length) {
                    j jVar = jVarArr2[i3];
                    jArr[i2][i3] = jVar == null ? -9223372036854775807L : jVar.rl();
                    i3++;
                }
            }
            i2++;
        }
    }

    private void maybeUpdateAdMediaSources() {
        Uri uri;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null) {
            return;
        }
        for (int i2 = 0; i2 < this.adMediaSourceHolders.length; i2++) {
            int i3 = 0;
            while (true) {
                j[] jVarArr = this.adMediaSourceHolders[i2];
                if (i3 < jVarArr.length) {
                    j jVar = jVarArr[i3];
                    AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i2);
                    if (jVar != null && !jVar.nr()) {
                        Uri[] uriArr = adGroup.uris;
                        if (i3 < uriArr.length && (uri = uriArr[i3]) != null) {
                            MediaItem.Builder uri2 = new MediaItem.Builder().setUri(uri);
                            MediaItem.LocalConfiguration localConfiguration = this.contentMediaSource.getMediaItem().localConfiguration;
                            if (localConfiguration != null) {
                                uri2.setDrmConfiguration(localConfiguration.drmConfiguration);
                            }
                            jVar.O(this.adMediaSourceFactory.createMediaSource(uri2.build()), uri);
                        }
                    }
                    i3++;
                }
            }
        }
    }

    private void maybeUpdateSourceInfo() {
        Timeline timeline = this.contentTimeline;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            refreshSourceInfo(timeline);
        } else {
            this.adPlaybackState = adPlaybackState.withAdDurationsUs(getAdDurationsUs());
            refreshSourceInfo(new SinglePeriodAdTimeline(timeline, this.adPlaybackState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        if (adPlaybackState2 == null) {
            j[][] jVarArr = new j[adPlaybackState.adGroupCount][];
            this.adMediaSourceHolders = jVarArr;
            Arrays.fill(jVarArr, new j[0]);
        } else {
            Assertions.checkState(adPlaybackState.adGroupCount == adPlaybackState2.adGroupCount);
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        if (((AdPlaybackState) Assertions.checkNotNull(this.adPlaybackState)).adGroupCount <= 0 || !mediaPeriodId.isAd()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j2);
            maskingMediaPeriod.setMediaSource(this.contentMediaSource);
            maskingMediaPeriod.createPeriod(mediaPeriodId);
            return maskingMediaPeriod;
        }
        int i2 = mediaPeriodId.adGroupIndex;
        int i3 = mediaPeriodId.adIndexInAdGroup;
        j[][] jVarArr = this.adMediaSourceHolders;
        j[] jVarArr2 = jVarArr[i2];
        if (jVarArr2.length <= i3) {
            jVarArr[i2] = (j[]) Arrays.copyOf(jVarArr2, i3 + 1);
        }
        j jVar = this.adMediaSourceHolders[i2][i3];
        if (jVar == null) {
            jVar = new j(mediaPeriodId);
            this.adMediaSourceHolders[i2][i3] = jVar;
            maybeUpdateAdMediaSources();
        }
        return jVar.n(mediaPeriodId, allocator, j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
        if (mediaPeriodId.isAd()) {
            ((j) Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup])).t(timeline);
        } else {
            Assertions.checkArgument(timeline.getPeriodCount() == 1);
            this.contentTimeline = timeline;
        }
        maybeUpdateSourceInfo();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.id;
        if (!mediaPeriodId.isAd()) {
            maskingMediaPeriod.releasePeriod();
            return;
        }
        j jVar = (j) Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup]);
        jVar.KN(maskingMediaPeriod);
        if (jVar.J2()) {
            jVar.Uo();
            this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider) {
        this.contentMediaSource = mediaSource;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        final w6 w6Var = new w6();
        this.componentListener = w6Var;
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.w6
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource adsMediaSource = this.f58171n;
                adsMediaSource.adsLoader.start(adsMediaSource, adsMediaSource.adTagDataSpec, adsMediaSource.adsId, adsMediaSource.adViewProvider, w6Var);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        final w6 w6Var = (w6) Assertions.checkNotNull(this.componentListener);
        this.componentListener = null;
        w6Var.rl();
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new j[0][];
        this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.Ml
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource adsMediaSource = this.f58147n;
                adsMediaSource.adsLoader.stop(adsMediaSource, w6Var);
            }
        });
    }
}
