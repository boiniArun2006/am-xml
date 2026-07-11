package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<j> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
        public final int windowIndex;

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void downstreamFormatChanged(int i2, @Nullable Format format, int i3, @Nullable Object obj, long j2) {
            downstreamFormatChanged(new MediaLoadData(1, i2, format, i3, obj, adjustMediaTime(j2), -9223372036854775807L));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i2) {
            loadCanceled(loadEventInfo, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i2) {
            loadCompleted(loadEventInfo, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadError(LoadEventInfo loadEventInfo, int i2, IOException iOException, boolean z2) {
            loadError(loadEventInfo, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z2);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i2) {
            loadStarted(loadEventInfo, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void upstreamDiscarded(int i2, long j2, long j3) {
            upstreamDiscarded(new MediaLoadData(1, i2, null, 3, null, adjustMediaTime(j2), adjustMediaTime(j3)));
        }

        private static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Handler f58103n;
            public MediaSourceEventListener rl;

            public j(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.f58103n = handler;
                this.rl = mediaSourceEventListener;
            }
        }

        private EventDispatcher(CopyOnWriteArrayList<j> copyOnWriteArrayList, int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i2;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaTimeOffsetMs = j2;
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i5, @Nullable Object obj, long j2, long j3) {
            loadCanceled(loadEventInfo, new MediaLoadData(i2, i3, format, i5, obj, adjustMediaTime(j2), adjustMediaTime(j3)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i5, @Nullable Object obj, long j2, long j3) {
            loadCompleted(loadEventInfo, new MediaLoadData(i2, i3, format, i5, obj, adjustMediaTime(j2), adjustMediaTime(j3)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i5, @Nullable Object obj, long j2, long j3, IOException iOException, boolean z2) {
            loadError(loadEventInfo, new MediaLoadData(i2, i3, format, i5, obj, adjustMediaTime(j2), adjustMediaTime(j3)), iOException, z2);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i5, @Nullable Object obj, long j2, long j3) {
            loadStarted(loadEventInfo, new MediaLoadData(i2, i3, format, i5, obj, adjustMediaTime(j2), adjustMediaTime(j3)));
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            for (j jVar : this.listenerAndHandlers) {
                if (jVar.rl == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(jVar);
                }
            }
        }

        @CheckResult
        public EventDispatcher withParameters(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            return new EventDispatcher(this.listenerAndHandlers, i2, mediaPeriodId, j2);
        }

        private long adjustMediaTime(long j2) {
            long jUsToMs = Util.usToMs(j2);
            if (jUsToMs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.mediaTimeOffsetMs + jUsToMs;
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new j(handler, mediaSourceEventListener));
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            for (j jVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = jVar.rl;
                Util.postOrRun(jVar.f58103n, new Runnable() { // from class: com.google.android.exoplayer2.source.Xo
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f58131n;
                        mediaSourceEventListener.onDownstreamFormatChanged(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (j jVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = jVar.rl;
                Util.postOrRun(jVar.f58103n, new Runnable() { // from class: com.google.android.exoplayer2.source.Pl
                    @Override // java.lang.Runnable
                    public final void run() {
                        mediaSourceEventListener.onUpstreamDiscarded(this.f58109n.windowIndex, mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (j jVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = jVar.rl;
                Util.postOrRun(jVar.f58103n, new Runnable() { // from class: com.google.android.exoplayer2.source.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f58235n;
                        mediaSourceEventListener.onLoadCanceled(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (j jVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = jVar.rl;
                Util.postOrRun(jVar.f58103n, new Runnable() { // from class: com.google.android.exoplayer2.source.aC
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f58134n;
                        mediaSourceEventListener.onLoadCompleted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z2) {
            for (j jVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = jVar.rl;
                Util.postOrRun(jVar.f58103n, new Runnable() { // from class: com.google.android.exoplayer2.source.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f58060n;
                        mediaSourceEventListener.onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z2);
                    }
                });
            }
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (j jVar : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = jVar.rl;
                Util.postOrRun(jVar.f58103n, new Runnable() { // from class: com.google.android.exoplayer2.source.qz
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f58238n;
                        mediaSourceEventListener.onLoadStarted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }
    }

    default void onDownstreamFormatChanged(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onLoadCanceled(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadError(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
    }

    default void onLoadStarted(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onUpstreamDiscarded(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }
}
