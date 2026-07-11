package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    private static final long MAX_MERGED_SEGMENT_START_TIME_DIFF_US = 20000000;
    private final ArrayList<RunnableFutureTask<?, ?>> activeRunnables;
    private final Cache cache;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final CacheKeyFactory cacheKeyFactory;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final DataSpec manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;

    @Nullable
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<StreamKey> streamKeys;

    protected static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return Util.compareLong(this.startTimeUs, segment.startTimeUs);
        }

        public Segment(long j2, DataSpec dataSpec) {
            this.startTimeUs = j2;
            this.dataSpec = dataSpec;
        }
    }

    class j extends RunnableFutureTask {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ DataSource f58027n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ DataSpec f58028t;

        j(DataSource dataSource, DataSpec dataSpec) {
            this.f58027n = dataSource;
            this.f58028t = dataSpec;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public FilterableManifest doWork() {
            return (FilterableManifest) ParsingLoadable.load(this.f58027n, SegmentDownloader.this.manifestParser, this.f58028t, 4);
        }
    }

    private static final class n implements CacheWriter.ProgressListener {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f58029O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Downloader.ProgressListener f58030n;
        private long nr;
        private final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f58031t;

        private float n() {
            long j2 = this.rl;
            if (j2 != -1 && j2 != 0) {
                return (this.nr * 100.0f) / j2;
            }
            int i2 = this.f58031t;
            if (i2 != 0) {
                return (this.f58029O * 100.0f) / i2;
            }
            return -1.0f;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
        public void onProgress(long j2, long j3, long j4) {
            long j5 = this.nr + j4;
            this.nr = j5;
            this.f58030n.onProgress(this.rl, j5, n());
        }

        public void rl() {
            this.f58029O++;
            this.f58030n.onProgress(this.rl, this.nr, n());
        }

        public n(Downloader.ProgressListener progressListener, long j2, int i2, long j3, int i3) {
            this.f58030n = progressListener;
            this.rl = j2;
            this.f58031t = i2;
            this.nr = j3;
            this.f58029O = i3;
        }
    }

    private static final class w6 extends RunnableFutureTask {
        public final byte[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final n f58032O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Segment f58033n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final CacheWriter f58034r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final CacheDataSource f58035t;

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        protected void cancelWork() {
            this.f58034r.cancel();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Void doWork() throws IOException {
            this.f58034r.cache();
            n nVar = this.f58032O;
            if (nVar == null) {
                return null;
            }
            nVar.rl();
            return null;
        }

        public w6(Segment segment, CacheDataSource cacheDataSource, n nVar, byte[] bArr) {
            this.f58033n = segment;
            this.f58035t = cacheDataSource;
            this.f58032O = nVar;
            this.J2 = bArr;
            this.f58034r = new CacheWriter(cacheDataSource, segment.dataSpec, bArr, nVar);
        }
    }

    private void removeActiveRunnable(RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    protected abstract List<Segment> getSegments(DataSource dataSource, M m2, boolean z2) throws InterruptedException, IOException;

    private <T> void addActiveRunnable(RunnableFutureTask<T, ?> runnableFutureTask) throws InterruptedException {
        synchronized (this.activeRunnables) {
            try {
                if (this.isCanceled) {
                    throw new InterruptedException();
                }
                this.activeRunnables.add(runnableFutureTask);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean canMergeSegments(DataSpec dataSpec, DataSpec dataSpec2) {
        if (!dataSpec.uri.equals(dataSpec2.uri)) {
            return false;
        }
        long j2 = dataSpec.length;
        return j2 != -1 && dataSpec.position + j2 == dataSpec2.position && Util.areEqual(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders);
    }

    protected static DataSpec getCompressibleDataSpec(Uri uri) {
        return new DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    private static void mergeSegments(List<Segment> list, CacheKeyFactory cacheKeyFactory) {
        HashMap map = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Segment segment = list.get(i3);
            String strBuildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            Integer num = (Integer) map.get(strBuildCacheKey);
            Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + MAX_MERGED_SEGMENT_START_TIME_DIFF_US || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                map.put(strBuildCacheKey, Integer.valueOf(i2));
                list.set(i2, segment);
                i2++;
            } else {
                long j2 = segment.dataSpec.length;
                list.set(((Integer) Assertions.checkNotNull(num)).intValue(), new Segment(segment2.startTimeUs, segment2.dataSpec.subrange(0L, j2 != -1 ? segment2.dataSpec.length + j2 : -1L)));
            }
        }
        Util.removeRange(list, i2, list.size());
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            try {
                this.isCanceled = true;
                for (int i2 = 0; i2 < this.activeRunnables.size(); i2++) {
                    this.activeRunnables.get(i2).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1 A[LOOP:1: B:81:0x0199->B:83:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba A[LOOP:2: B:85:0x01b8->B:86:0x01ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf  */
    @Override // com.google.android.exoplayer2.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void download(@Nullable Downloader.ProgressListener progressListener) throws Throwable {
        int i2;
        int size;
        PriorityTaskManager priorityTaskManager;
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
        if (priorityTaskManager2 != null) {
            priorityTaskManager2.add(-1000);
        }
        boolean z2 = true;
        try {
            CacheDataSource cacheDataSourceCreateDataSourceForDownloading2 = this.cacheDataSourceFactory.createDataSourceForDownloading();
            FilterableManifest manifest = getManifest(cacheDataSourceCreateDataSourceForDownloading2, this.manifestDataSpec, false);
            if (!this.streamKeys.isEmpty()) {
                manifest = (FilterableManifest) manifest.copy(this.streamKeys);
            }
            List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForDownloading2, manifest, false);
            Collections.sort(segments);
            mergeSegments(segments, this.cacheKeyFactory);
            int size2 = segments.size();
            int size3 = segments.size() - 1;
            int i3 = 0;
            long j2 = 0;
            long j3 = 0;
            while (size3 >= 0) {
                try {
                    DataSpec dataSpec = segments.get(size3).dataSpec;
                    String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
                    boolean z3 = z2;
                    long j4 = dataSpec.length;
                    if (j4 == -1) {
                        long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(strBuildCacheKey));
                        if (contentLength != -1) {
                            j4 = contentLength - dataSpec.position;
                        }
                    }
                    long j5 = j4;
                    long cachedBytes = this.cache.getCachedBytes(strBuildCacheKey, dataSpec.position, j5);
                    j3 += cachedBytes;
                    if (j5 != -1) {
                        if (j5 == cachedBytes) {
                            i3++;
                            segments.remove(size3);
                        }
                        if (j2 != -1) {
                            j2 += j5;
                        }
                    } else {
                        j2 = -1;
                    }
                    size3--;
                    z2 = z3;
                } catch (Throwable th) {
                    th = th;
                    while (i2 < this.activeRunnables.size()) {
                    }
                    while (size >= 0) {
                    }
                    priorityTaskManager = this.priorityTaskManager;
                    if (priorityTaskManager != null) {
                    }
                    throw th;
                }
            }
            boolean z4 = z2;
            n nVar = progressListener != null ? new n(progressListener, j2, size2, j3, i3) : null;
            arrayDeque.addAll(segments);
            while (!this.isCanceled && !arrayDeque.isEmpty()) {
                PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.proceed(-1000);
                }
                if (arrayDeque2.isEmpty()) {
                    cacheDataSourceCreateDataSourceForDownloading = this.cacheDataSourceFactory.createDataSourceForDownloading();
                    bArr = new byte[131072];
                } else {
                    w6 w6Var = (w6) arrayDeque2.removeFirst();
                    cacheDataSourceCreateDataSourceForDownloading = w6Var.f58035t;
                    bArr = w6Var.J2;
                }
                w6 w6Var2 = new w6((Segment) arrayDeque.removeFirst(), cacheDataSourceCreateDataSourceForDownloading, nVar, bArr);
                addActiveRunnable(w6Var2);
                this.executor.execute(w6Var2);
                for (int size4 = this.activeRunnables.size() - 1; size4 >= 0; size4--) {
                    w6 w6Var3 = (w6) this.activeRunnables.get(size4);
                    if (arrayDeque.isEmpty() || w6Var3.isDone()) {
                        try {
                            w6Var3.get();
                            removeActiveRunnable(size4);
                            arrayDeque2.addLast(w6Var3);
                        } catch (ExecutionException e2) {
                            Throwable th2 = (Throwable) Assertions.checkNotNull(e2.getCause());
                            if (!(th2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                                if (th2 instanceof IOException) {
                                    throw ((IOException) th2);
                                }
                                Util.sneakyThrow(th2);
                                for (i2 = 0; i2 < this.activeRunnables.size(); i2++) {
                                    this.activeRunnables.get(i2).cancel(true);
                                }
                                for (size = this.activeRunnables.size() - 1; size >= 0; size--) {
                                    this.activeRunnables.get(size).blockUntilFinished();
                                    removeActiveRunnable(size);
                                }
                                priorityTaskManager = this.priorityTaskManager;
                                if (priorityTaskManager != null) {
                                    priorityTaskManager.remove(-1000);
                                }
                                throw th;
                            }
                            arrayDeque.addFirst(w6Var3.f58033n);
                            removeActiveRunnable(size4);
                            arrayDeque2.addLast(w6Var3);
                        }
                    }
                }
                w6Var2.blockUntilStarted();
            }
            for (int i5 = 0; i5 < this.activeRunnables.size(); i5++) {
                this.activeRunnables.get(i5).cancel(z4);
            }
            for (int size5 = this.activeRunnables.size() - (z4 ? 1 : 0); size5 >= 0; size5--) {
                this.activeRunnables.get(size5).blockUntilFinished();
                removeActiveRunnable(size5);
            }
            PriorityTaskManager priorityTaskManager4 = this.priorityTaskManager;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.remove(-1000);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:23|37|24|(2:27|(2:29|45)(3:44|31|32))(2:26|46)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r0 = (java.lang.Throwable) com.google.android.exoplayer2.util.Assertions.checkNotNull(r4.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if ((r0 instanceof com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r0 instanceof java.io.IOException) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        com.google.android.exoplayer2.util.Util.sneakyThrow(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        throw ((java.io.IOException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        r3.blockUntilFinished();
        removeActiveRunnable((com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final <T> T execute(RunnableFutureTask<T, ?> runnableFutureTask, boolean z2) throws Throwable {
        if (z2) {
            runnableFutureTask.run();
            try {
                return runnableFutureTask.get();
            } catch (ExecutionException e2) {
                Throwable th = (Throwable) Assertions.checkNotNull(e2.getCause());
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                Util.sneakyThrow(e2);
            }
        }
        while (!this.isCanceled) {
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-1000);
            }
            addActiveRunnable(runnableFutureTask);
            this.executor.execute(runnableFutureTask);
            return runnableFutureTask.get();
        }
        throw new InterruptedException();
    }

    protected final M getManifest(DataSource dataSource, DataSpec dataSpec, boolean z2) throws InterruptedException, IOException {
        return (M) execute(new j(dataSource, dataSpec), z2);
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
        CacheDataSource cacheDataSourceCreateDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            try {
                List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForRemovingDownload, getManifest(cacheDataSourceCreateDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
                for (int i2 = 0; i2 < segments.size(); i2++) {
                    this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(segments.get(i2).dataSpec));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
        }
    }

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.cache = (Cache) Assertions.checkNotNull(factory.getCache());
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new ArrayList<>();
    }

    private void removeActiveRunnable(int i2) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i2);
        }
    }
}
