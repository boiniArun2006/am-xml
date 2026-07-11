package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class MetadataRetriever {

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MediaSource.Factory f57477n;
        private final com.google.common.util.concurrent.UGc nr;
        private final HandlerThread rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final HandlerWrapper f57478t;

        private final class j implements Handler.Callback {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private MediaPeriod f57479O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final C0763j f57480n = new C0763j();

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private MediaSource f57481t;

            /* JADX INFO: renamed from: com.google.android.exoplayer2.MetadataRetriever$n$j$j, reason: collision with other inner class name */
            private final class C0763j implements MediaSource.MediaSourceCaller {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private boolean f57482O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final C0764j f57483n = new C0764j();

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private final Allocator f57484t = new DefaultAllocator(true, 65536);

                /* JADX INFO: renamed from: com.google.android.exoplayer2.MetadataRetriever$n$j$j$j, reason: collision with other inner class name */
                private final class C0764j implements MediaPeriod.Callback {
                    private C0764j() {
                    }

                    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                        n.this.f57478t.obtainMessage(2).sendToTarget();
                    }

                    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
                    public void onPrepared(MediaPeriod mediaPeriod) {
                        n.this.nr.g(mediaPeriod.getTrackGroups());
                        n.this.f57478t.obtainMessage(3).sendToTarget();
                    }
                }

                public C0763j() {
                }

                @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                    if (this.f57482O) {
                        return;
                    }
                    this.f57482O = true;
                    j.this.f57479O = mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0)), this.f57484t, 0L);
                    j.this.f57479O.prepare(this.f57483n, 0L);
                }
            }

            public j() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 0) {
                    MediaSource mediaSourceCreateMediaSource = n.this.f57477n.createMediaSource((MediaItem) message.obj);
                    this.f57481t = mediaSourceCreateMediaSource;
                    mediaSourceCreateMediaSource.prepareSource(this.f57480n, null, PlayerId.UNSET);
                    n.this.f57478t.sendEmptyMessage(1);
                    return true;
                }
                if (i2 == 1) {
                    try {
                        MediaPeriod mediaPeriod = this.f57479O;
                        if (mediaPeriod == null) {
                            ((MediaSource) Assertions.checkNotNull(this.f57481t)).maybeThrowSourceInfoRefreshError();
                        } else {
                            mediaPeriod.maybeThrowPrepareError();
                        }
                        n.this.f57478t.sendEmptyMessageDelayed(1, 100);
                    } catch (Exception e2) {
                        n.this.nr.te(e2);
                        n.this.f57478t.obtainMessage(3).sendToTarget();
                    }
                    return true;
                }
                if (i2 == 2) {
                    ((MediaPeriod) Assertions.checkNotNull(this.f57479O)).continueLoading(0L);
                    return true;
                }
                if (i2 != 3) {
                    return false;
                }
                if (this.f57479O != null) {
                    ((MediaSource) Assertions.checkNotNull(this.f57481t)).releasePeriod(this.f57479O);
                }
                ((MediaSource) Assertions.checkNotNull(this.f57481t)).releaseSource(this.f57480n);
                n.this.f57478t.removeCallbacksAndMessages(null);
                n.this.rl.quit();
                return true;
            }
        }

        public com.google.common.util.concurrent.Xo O(MediaItem mediaItem) {
            this.f57478t.obtainMessage(0, mediaItem).sendToTarget();
            return this.nr;
        }

        public n(MediaSource.Factory factory, Clock clock) {
            this.f57477n = factory;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
            this.rl = handlerThread;
            handlerThread.start();
            this.f57478t = clock.createHandler(handlerThread.getLooper(), new j());
            this.nr = com.google.common.util.concurrent.UGc.E2();
        }
    }

    public static com.google.common.util.concurrent.Xo retrieveMetadata(Context context, MediaItem mediaItem) {
        return retrieveMetadata(context, mediaItem, Clock.DEFAULT);
    }

    public static com.google.common.util.concurrent.Xo retrieveMetadata(MediaSource.Factory factory, MediaItem mediaItem) {
        return retrieveMetadata(factory, mediaItem, Clock.DEFAULT);
    }

    private MetadataRetriever() {
    }

    @VisibleForTesting
    static com.google.common.util.concurrent.Xo retrieveMetadata(Context context, MediaItem mediaItem, Clock clock) {
        return retrieveMetadata(new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory().setMp4ExtractorFlags(6)), mediaItem, clock);
    }

    private static com.google.common.util.concurrent.Xo retrieveMetadata(MediaSource.Factory factory, MediaItem mediaItem, Clock clock) {
        return new n(factory, clock).O(mediaItem);
    }
}
