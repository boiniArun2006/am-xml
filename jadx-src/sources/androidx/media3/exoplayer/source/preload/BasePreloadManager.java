package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public abstract class BasePreloadManager<T> {
    private final Handler applicationHandler;
    private final ListenerSet<PreloadManagerListener> listeners;
    private final Object lock = new Object();
    private final Map<MediaItem, BasePreloadManager<T>.MediaSourceHolder> mediaItemMediaSourceHolderMap;
    private final MediaSource.Factory mediaSourceFactory;
    protected final Comparator<T> rankingDataComparator;

    @GuardedBy
    private final PriorityQueue<BasePreloadManager<T>.MediaSourceHolder> sourceHolderPriorityQueue;
    private final TargetPreloadStatusControl<T> targetPreloadStatusControl;

    @Nullable
    @GuardedBy
    private TargetPreloadStatusControl.PreloadStatus targetPreloadStatusOfCurrentPreloadingSource;

    private final class MediaSourceHolder implements Comparable<BasePreloadManager<T>.MediaSourceHolder> {
        public final MediaSource mediaSource;
        public final T rankingData;
        public final long startPositionUs;

        public MediaSourceHolder(BasePreloadManager basePreloadManager, MediaSource mediaSource, T t3) {
            this(mediaSource, t3, -9223372036854775807L);
        }

        public MediaSourceHolder(MediaSource mediaSource, T t3, long j2) {
            this.mediaSource = mediaSource;
            this.rankingData = t3;
            this.startPositionUs = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(BasePreloadManager<T>.MediaSourceHolder mediaSourceHolder) {
            return BasePreloadManager.this.rankingDataComparator.compare(this.rankingData, mediaSourceHolder.rankingData);
        }
    }

    public static /* synthetic */ void J2(PreloadManagerListener preloadManagerListener, FlagSet flagSet) {
    }

    public final void add(MediaItem mediaItem, T t3) {
        add(this.mediaSourceFactory.createMediaSource(mediaItem), t3);
    }

    protected abstract void clearSourceInternal(MediaSource mediaSource);

    protected MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return mediaSource;
    }

    protected abstract void preloadSourceInternal(MediaSource mediaSource, long j2);

    protected void releaseInternal() {
    }

    protected abstract void releaseSourceInternal(MediaSource mediaSource);

    public final boolean remove(MediaItem mediaItem) {
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return false;
        }
        MediaSource mediaSource = this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    protected boolean shouldStartPreloadingNextSource() {
        return true;
    }

    protected static abstract class BuilderBase<T> {
        protected t1.UGc mediaSourceFactorySupplier;
        protected final Comparator<T> rankingDataComparator;
        protected final TargetPreloadStatusControl<T> targetPreloadStatusControl;

        public abstract BasePreloadManager<T> build();

        public BuilderBase(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, t1.UGc uGc) {
            this.rankingDataComparator = comparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactorySupplier = uGc;
        }
    }

    @GuardedBy
    private boolean isPreloading(MediaSource mediaSource) {
        return !this.sourceHolderPriorityQueue.isEmpty() && ((MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeAdvanceToNextSource(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    do {
                        this.sourceHolderPriorityQueue.poll();
                        if (this.sourceHolderPriorityQueue.isEmpty()) {
                            break;
                        }
                    } while (!maybeStartPreloadNextSource());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void n(BasePreloadManager basePreloadManager, final MediaSource mediaSource) {
        basePreloadManager.listeners.sendEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.j
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((PreloadManagerListener) obj).onCompleted(mediaSource.getMediaItem());
            }
        });
        basePreloadManager.maybeAdvanceToNextSource(mediaSource);
    }

    public static /* synthetic */ void t(BasePreloadManager basePreloadManager, final PreloadException preloadException, MediaSource mediaSource) {
        basePreloadManager.listeners.sendEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.n
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((PreloadManagerListener) obj).onError(preloadException);
            }
        });
        basePreloadManager.maybeAdvanceToNextSource(mediaSource);
    }

    public final void add(MediaSource mediaSource, T t3) {
        MediaSource mediaSourceCreateMediaSourceForPreloading = createMediaSourceForPreloading(mediaSource);
        this.mediaItemMediaSourceHolderMap.put(mediaSourceCreateMediaSourceForPreloading.getMediaItem(), new MediaSourceHolder(this, mediaSourceCreateMediaSourceForPreloading, t3));
    }

    public void addListener(PreloadManagerListener preloadManagerListener) {
        this.listeners.add(preloadManagerListener);
    }

    @Nullable
    public final MediaSource getMediaSource(MediaItem mediaItem) {
        if (this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        }
        return null;
    }

    public final int getSourceCount() {
        return this.mediaItemMediaSourceHolderMap.size();
    }

    @Nullable
    protected final TargetPreloadStatusControl.PreloadStatus getTargetPreloadStatus(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (!isPreloading(mediaSource)) {
                    return null;
                }
                return this.targetPreloadStatusOfCurrentPreloadingSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            try {
                this.sourceHolderPriorityQueue.clear();
                this.sourceHolderPriorityQueue.addAll(this.mediaItemMediaSourceHolderMap.values());
                while (!this.sourceHolderPriorityQueue.isEmpty() && !maybeStartPreloadNextSource()) {
                    this.sourceHolderPriorityQueue.poll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void onPreloadCompleted(final MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.w6
                        @Override // java.lang.Runnable
                        public final void run() {
                            BasePreloadManager.n(this.f39789n, mediaSource);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void onPreloadError(final PreloadException preloadException, final MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.I28
                        @Override // java.lang.Runnable
                        public final void run() {
                            BasePreloadManager.t(this.f39766n, preloadException, mediaSource);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void onPreloadSkipped(final MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.Ml
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f39768n.maybeAdvanceToNextSource(mediaSource);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void reset() {
        Iterator<BasePreloadManager<T>.MediaSourceHolder> it = this.mediaItemMediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseSourceInternal(it.next().mediaSource);
        }
        this.mediaItemMediaSourceHolderMap.clear();
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    protected BasePreloadManager(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, MediaSource.Factory factory) {
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        this.rankingDataComparator = comparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
        this.listeners = new ListenerSet<>(handlerCreateHandlerForCurrentOrMainLooper.getLooper(), Clock.DEFAULT, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.source.preload.Wre
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                BasePreloadManager.J2((PreloadManagerListener) obj, flagSet);
            }
        });
        this.mediaItemMediaSourceHolderMap = new HashMap();
        this.sourceHolderPriorityQueue = new PriorityQueue<>();
    }

    @GuardedBy
    private boolean maybeStartPreloadNextSource() {
        if (shouldStartPreloadingNextSource()) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek());
            TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(mediaSourceHolder.rankingData);
            this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
            if (targetPreloadStatus != null) {
                preloadSourceInternal(mediaSourceHolder.mediaSource, mediaSourceHolder.startPositionUs);
                return true;
            }
            clearSourceInternal(mediaSourceHolder.mediaSource);
            return false;
        }
        return false;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() == this.applicationHandler.getLooper()) {
        } else {
            throw new IllegalStateException("Preload manager is accessed on the wrong thread.");
        }
    }

    public void clearListeners() {
        verifyApplicationThread();
        this.listeners.clear();
    }

    public final void release() {
        reset();
        releaseInternal();
        clearListeners();
    }

    public void removeListener(PreloadManagerListener preloadManagerListener) {
        verifyApplicationThread();
        this.listeners.remove(preloadManagerListener);
    }

    public final boolean remove(MediaSource mediaSource) {
        MediaItem mediaItem = mediaSource.getMediaItem();
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem) || mediaSource != this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource) {
            return false;
        }
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }
}
