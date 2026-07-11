package com.google.android.exoplayer2.source;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.SingleSampleMediaSource;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.text.SubtitleDecoderFactory;
import com.google.android.exoplayer2.text.SubtitleExtractor;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.nKK;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DMediaSourceFactory";

    @Nullable
    private AdViewProvider adViewProvider;

    @Nullable
    private AdsLoader.Provider adsLoaderProvider;
    private DataSource.Factory dataSourceFactory;
    private final j delegateFactoryLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;

    @Nullable
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private boolean useProgressiveMediaSourceForSubtitles;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class j {
        private DrmSessionManagerProvider J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private DataSource.Factory f58088O;
        private LoadErrorHandlingPolicy Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ExtractorsFactory f58089n;
        private final Map rl = new HashMap();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Set f58090t = new HashSet();
        private final Map nr = new HashMap();

        private void J2() {
            xMQ(0);
            xMQ(1);
            xMQ(2);
            xMQ(3);
            xMQ(4);
        }

        public static /* synthetic */ MediaSource.Factory rl(j jVar) {
            return new ProgressiveMediaSource.Factory((DataSource.Factory) Assertions.checkNotNull(jVar.f58088O), jVar.f58089n);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private t1.UGc xMQ(int i2) {
            t1.UGc uGc;
            if (this.rl.containsKey(Integer.valueOf(i2))) {
                return (t1.UGc) this.rl.get(Integer.valueOf(i2));
            }
            t1.UGc uGc2 = null;
            if (i2 == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                uGc = new t1.UGc() { // from class: com.google.android.exoplayer2.source.Ml
                    @Override // t1.UGc
                    public final Object get() {
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass, (DataSource.Factory) Assertions.checkNotNull(this.f58106n.f58088O));
                    }
                };
            } else if (i2 == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                uGc = new t1.UGc() { // from class: com.google.android.exoplayer2.source.I28
                    @Override // t1.UGc
                    public final Object get() {
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass2, (DataSource.Factory) Assertions.checkNotNull(this.f58092n.f58088O));
                    }
                };
            } else if (i2 == 2) {
                final Class<? extends U> clsAsSubclass3 = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                uGc = new t1.UGc() { // from class: com.google.android.exoplayer2.source.Wre
                    @Override // t1.UGc
                    public final Object get() {
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass3, (DataSource.Factory) Assertions.checkNotNull(this.f58128n.f58088O));
                    }
                };
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        uGc2 = new t1.UGc() { // from class: com.google.android.exoplayer2.source.fuX
                            @Override // t1.UGc
                            public final Object get() {
                                return DefaultMediaSourceFactory.j.rl(this.f58226n);
                            }
                        };
                    }
                    this.rl.put(Integer.valueOf(i2), uGc2);
                    if (uGc2 != null) {
                        this.f58090t.add(Integer.valueOf(i2));
                    }
                    return uGc2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                uGc = new t1.UGc() { // from class: com.google.android.exoplayer2.source.CN3
                    @Override // t1.UGc
                    public final Object get() {
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass4);
                    }
                };
            }
            uGc2 = uGc;
            this.rl.put(Integer.valueOf(i2), uGc2);
            if (uGc2 != null) {
            }
            return uGc2;
        }

        public MediaSource.Factory Uo(int i2) {
            MediaSource.Factory factory = (MediaSource.Factory) this.nr.get(Integer.valueOf(i2));
            if (factory != null) {
                return factory;
            }
            t1.UGc uGcXMQ = xMQ(i2);
            if (uGcXMQ == null) {
                return null;
            }
            MediaSource.Factory factory2 = (MediaSource.Factory) uGcXMQ.get();
            DrmSessionManagerProvider drmSessionManagerProvider = this.J2;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.Uo;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            this.nr.put(Integer.valueOf(i2), factory2);
            return factory2;
        }

        public void gh(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.J2 = drmSessionManagerProvider;
            Iterator it = this.nr.values().iterator();
            while (it.hasNext()) {
                ((MediaSource.Factory) it.next()).setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void mUb(DataSource.Factory factory) {
            if (factory != this.f58088O) {
                this.f58088O = factory;
                this.nr.clear();
            }
        }

        public void qie(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.Uo = loadErrorHandlingPolicy;
            Iterator it = this.nr.values().iterator();
            while (it.hasNext()) {
                ((MediaSource.Factory) it.next()).setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public j(ExtractorsFactory extractorsFactory) {
            this.f58089n = extractorsFactory;
        }

        public int[] KN() {
            J2();
            return com.google.common.primitives.Wre.az(this.f58090t);
        }
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSource.Factory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, DataSource.Factory factory) {
        try {
            return cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    public DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class n implements Extractor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Format f58091n;

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void init(ExtractorOutput extractorOutput) {
            TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
            extractorOutput.endTracks();
            trackOutputTrack.format(this.f58091n.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(this.f58091n.sampleMimeType).build());
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void release() {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void seek(long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public boolean sniff(ExtractorInput extractorInput) {
            return true;
        }

        public n(Format format) {
            this.f58091n = format;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
            if (extractorInput.skip(Integer.MAX_VALUE) == -1) {
                return -1;
            }
            return 0;
        }
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        this(new DefaultDataSource.Factory(context), extractorsFactory);
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
        long j2 = clippingConfiguration.startPositionMs;
        if (j2 == 0 && clippingConfiguration.endPositionMs == Long.MIN_VALUE && !clippingConfiguration.relativeToDefaultPosition) {
            return mediaSource;
        }
        long jMsToUs = Util.msToUs(j2);
        long jMsToUs2 = Util.msToUs(mediaItem.clippingConfiguration.endPositionMs);
        MediaItem.ClippingConfiguration clippingConfiguration2 = mediaItem.clippingConfiguration;
        return new ClippingMediaSource(mediaSource, jMsToUs, jMsToUs2, !clippingConfiguration2.startsAtKeyFrame, clippingConfiguration2.relativeToLiveWindow, clippingConfiguration2.relativeToDefaultPosition);
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoader.Provider provider = this.adsLoaderProvider;
        AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
        Object objS = adsConfiguration.adsId;
        if (objS == null) {
            objS = nKK.S(mediaItem.mediaId, mediaItem.localConfiguration.uri, adsConfiguration.adTagUri);
        }
        return new AdsMediaSource(mediaSource, dataSpec, objS, this, adsLoader, adViewProvider);
    }

    public static /* synthetic */ Extractor[] n(Format format) {
        SubtitleDecoderFactory subtitleDecoderFactory = SubtitleDecoderFactory.DEFAULT;
        return new Extractor[]{subtitleDecoderFactory.supportsFormat(format) ? new SubtitleExtractor(subtitleDecoderFactory.createDecoder(format), format) : new n(format)};
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public MediaSource createMediaSource(MediaItem mediaItem) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals(aNrWBQYwFf.HsNaHne)) {
            return ((MediaSource.Factory) Assertions.checkNotNull(this.serverSideAdInsertionMediaSourceFactory)).createMediaSource(mediaItem);
        }
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        MediaSource.Factory factoryUo = this.delegateFactoryLoader.Uo(iInferContentTypeForUriAndMimeType);
        Assertions.checkStateNotNull(factoryUo, "No suitable media source factory found for content type: " + iInferContentTypeForUriAndMimeType);
        MediaItem.LiveConfiguration.Builder builderBuildUpon = mediaItem.liveConfiguration.buildUpon();
        if (mediaItem.liveConfiguration.targetOffsetMs == -9223372036854775807L) {
            builderBuildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
        }
        if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
            builderBuildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
        }
        if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
            builderBuildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
        }
        if (mediaItem.liveConfiguration.minOffsetMs == -9223372036854775807L) {
            builderBuildUpon.setMinOffsetMs(this.liveMinOffsetMs);
        }
        if (mediaItem.liveConfiguration.maxOffsetMs == -9223372036854775807L) {
            builderBuildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
        }
        MediaItem.LiveConfiguration liveConfigurationBuild = builderBuildUpon.build();
        if (!liveConfigurationBuild.equals(mediaItem.liveConfiguration)) {
            mediaItem = mediaItem.buildUpon().setLiveConfiguration(liveConfigurationBuild).build();
        }
        MediaSource mediaSourceCreateMediaSource = factoryUo.createMediaSource(mediaItem);
        nKK nkk = ((MediaItem.LocalConfiguration) Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
        if (!nkk.isEmpty()) {
            MediaSource[] mediaSourceArr = new MediaSource[nkk.size() + 1];
            mediaSourceArr[0] = mediaSourceCreateMediaSource;
            for (int i2 = 0; i2 < nkk.size(); i2++) {
                if (this.useProgressiveMediaSourceForSubtitles) {
                    final Format formatBuild = new Format.Builder().setSampleMimeType(((MediaItem.SubtitleConfiguration) nkk.get(i2)).mimeType).setLanguage(((MediaItem.SubtitleConfiguration) nkk.get(i2)).language).setSelectionFlags(((MediaItem.SubtitleConfiguration) nkk.get(i2)).selectionFlags).setRoleFlags(((MediaItem.SubtitleConfiguration) nkk.get(i2)).roleFlags).setLabel(((MediaItem.SubtitleConfiguration) nkk.get(i2)).label).setId(((MediaItem.SubtitleConfiguration) nkk.get(i2)).id).build();
                    ProgressiveMediaSource.Factory factory = new ProgressiveMediaSource.Factory(this.dataSourceFactory, new ExtractorsFactory() { // from class: com.google.android.exoplayer2.source.w6
                        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
                        public final Extractor[] createExtractors() {
                            return DefaultMediaSourceFactory.n(formatBuild);
                        }
                    });
                    LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                    if (loadErrorHandlingPolicy != null) {
                        factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                    }
                    mediaSourceArr[i2 + 1] = factory.createMediaSource(MediaItem.fromUri(((MediaItem.SubtitleConfiguration) nkk.get(i2)).uri.toString()));
                } else {
                    SingleSampleMediaSource.Factory factory2 = new SingleSampleMediaSource.Factory(this.dataSourceFactory);
                    LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                    if (loadErrorHandlingPolicy2 != null) {
                        factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                    }
                    mediaSourceArr[i2 + 1] = factory2.createMediaSource((MediaItem.SubtitleConfiguration) nkk.get(i2), -9223372036854775807L);
                }
            }
            mediaSourceCreateMediaSource = new MergingMediaSource(mediaSourceArr);
        }
        return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, mediaSourceCreateMediaSource));
    }

    public DefaultMediaSourceFactory experimentalUseProgressiveMediaSourceForSubtitles(boolean z2) {
        this.useProgressiveMediaSourceForSubtitles = z2;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.KN();
    }

    @Deprecated
    public DefaultMediaSourceFactory setAdViewProvider(@Nullable AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    @Deprecated
    public DefaultMediaSourceFactory setAdsLoaderProvider(@Nullable AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    public DefaultMediaSourceFactory setDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        this.delegateFactoryLoader.gh((DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j2) {
        this.liveMaxOffsetMs = j2;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxSpeed(float f3) {
        this.liveMaxSpeed = f3;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j2) {
        this.liveMinOffsetMs = j2;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinSpeed(float f3) {
        this.liveMinSpeed = f3;
        return this;
    }

    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j2) {
        this.liveTargetOffsetMs = j2;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.delegateFactoryLoader.qie(loadErrorHandlingPolicy);
        return this;
    }

    public DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(@Nullable MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory) {
        this(factory, new DefaultExtractorsFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    public DefaultMediaSourceFactory setLocalAdInsertionComponents(AdsLoader.Provider provider, AdViewProvider adViewProvider) {
        this.adsLoaderProvider = (AdsLoader.Provider) Assertions.checkNotNull(provider);
        this.adViewProvider = (AdViewProvider) Assertions.checkNotNull(adViewProvider);
        return this;
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        this.dataSourceFactory = factory;
        j jVar = new j(extractorsFactory);
        this.delegateFactoryLoader = jVar;
        jVar.mUb(factory);
        this.liveTargetOffsetMs = -9223372036854775807L;
        this.liveMinOffsetMs = -9223372036854775807L;
        this.liveMaxOffsetMs = -9223372036854775807L;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
    }
}
