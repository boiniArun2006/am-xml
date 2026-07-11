package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void downstreamFormatChanged(int i2, @Nullable Format format, int i3, @Nullable Object obj, long j2) {
            downstreamFormatChanged(new MediaLoadData(1, i2, format, i3, obj, Util.usToMs(j2), -9223372036854775807L));
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

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, int i2) {
            loadStarted(loadEventInfo, i2, 0);
        }

        public void upstreamDiscarded(int i2, long j2, long j3) {
            upstreamDiscarded(new MediaLoadData(1, i2, null, 3, null, Util.usToMs(j2), Util.usToMs(j3)));
        }

        @CheckResult
        public EventDispatcher withParameters(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i2, mediaPeriodId);
        }

        private static final class ListenerAndHandler {
            public Handler handler;
            public MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i2;
            this.mediaPeriodId = mediaPeriodId;
        }

        public void dispatchEvent(final Consumer<MediaSourceEventListener> consumer) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.source.s4
                    @Override // java.lang.Runnable
                    public final void run() {
                        consumer.accept(mediaSourceEventListener);
                    }
                });
            }
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i5, @Nullable Object obj, long j2, long j3) {
            loadCanceled(loadEventInfo, new MediaLoadData(i2, i3, format, i5, obj, Util.usToMs(j2), Util.usToMs(j3)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i5, @Nullable Object obj, long j2, long j3) {
            loadCompleted(loadEventInfo, new MediaLoadData(i2, i3, format, i5, obj, Util.usToMs(j2), Util.usToMs(j3)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i5, @Nullable Object obj, long j2, long j3, IOException iOException, boolean z2) {
            loadError(loadEventInfo, new MediaLoadData(i2, i3, format, i5, obj, Util.usToMs(j2), Util.usToMs(j3)), iOException, z2);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i2, int i3) {
            loadStarted(loadEventInfo, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i3);
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        @CheckResult
        @Deprecated
        public EventDispatcher withParameters(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            return new EventDispatcher(this.listenerAndHandlers, i2, mediaPeriodId);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i5, @Nullable Object obj, long j2, long j3) {
            loadStarted(loadEventInfo, new MediaLoadData(i2, i3, format, i5, obj, Util.usToMs(j2), Util.usToMs(j3)));
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.Xo
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f39728n;
                    ((MediaSourceEventListener) obj).onDownstreamFormatChanged(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, mediaLoadData);
                }
            });
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.c
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
                    mediaSourceEventListener.onUpstreamDiscarded(this.f39749n.windowIndex, mediaPeriodId, mediaLoadData);
                }
            });
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.l3D
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f39758n;
                    ((MediaSourceEventListener) obj).onLoadCanceled(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                }
            });
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.z
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f39795n;
                    ((MediaSourceEventListener) obj).onLoadCompleted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                }
            });
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z2) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.QJ
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f39723n;
                    ((MediaSourceEventListener) obj).onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z2);
                }
            });
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i5, @Nullable Object obj, long j2, long j3, int i7) {
            loadStarted(loadEventInfo, new MediaLoadData(i2, i3, format, i5, obj, Util.usToMs(j2), Util.usToMs(j3)), i7);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            loadStarted(loadEventInfo, mediaLoadData, 0);
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final int i2) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.eO
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f39753n;
                    ((MediaSourceEventListener) obj).onLoadStarted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData, i2);
                }
            });
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

    default void onLoadStarted(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i3) {
    }

    default void onUpstreamDiscarded(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }
}
