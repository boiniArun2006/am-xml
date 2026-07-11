package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CachedRegionTracker implements Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final String TAG = "CachedRegionTracker";
    private final Cache cache;
    private final String cacheKey;
    private final ChunkIndex chunkIndex;
    private final TreeSet<j> regions = new TreeSet<>();
    private final j lookupRegion = new j(0, 0);

    private static class j implements Comparable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f58420O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f58421n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f58422t;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(j jVar) {
            return Util.compareLong(this.f58421n, jVar.f58421n);
        }

        public j(long j2, long j3) {
            this.f58421n = j2;
            this.f58422t = j3;
        }
    }

    public synchronized int getRegionEndTimeMs(long j2) {
        int i2;
        j jVar = this.lookupRegion;
        jVar.f58421n = j2;
        j jVarFloor = this.regions.floor(jVar);
        if (jVarFloor != null) {
            long j3 = jVarFloor.f58422t;
            if (j2 <= j3 && (i2 = jVarFloor.f58420O) != -1) {
                ChunkIndex chunkIndex = this.chunkIndex;
                if (i2 == chunkIndex.length - 1) {
                    if (j3 == chunkIndex.offsets[i2] + ((long) chunkIndex.sizes[i2])) {
                        return -2;
                    }
                }
                return (int) ((chunkIndex.timesUs[i2] + ((chunkIndex.durationsUs[i2] * (j3 - chunkIndex.offsets[i2])) / ((long) chunkIndex.sizes[i2]))) / 1000);
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        long j2 = cacheSpan.position;
        j jVar = new j(j2, cacheSpan.length + j2);
        j jVarFloor = this.regions.floor(jVar);
        if (jVarFloor == null) {
            Log.e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(jVarFloor);
        long j3 = jVarFloor.f58421n;
        long j4 = jVar.f58421n;
        if (j3 < j4) {
            j jVar2 = new j(j3, j4);
            int iBinarySearch = Arrays.binarySearch(this.chunkIndex.offsets, jVar2.f58422t);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            jVar2.f58420O = iBinarySearch;
            this.regions.add(jVar2);
        }
        long j5 = jVarFloor.f58422t;
        long j6 = jVar.f58422t;
        if (j5 > j6) {
            j jVar3 = new j(j6 + 1, j5);
            jVar3.f58420O = jVarFloor.f58420O;
            this.regions.add(jVar3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }

    private void mergeSpan(CacheSpan cacheSpan) {
        long j2 = cacheSpan.position;
        j jVar = new j(j2, cacheSpan.length + j2);
        j jVarFloor = this.regions.floor(jVar);
        j jVarCeiling = this.regions.ceiling(jVar);
        boolean zRegionsConnect = regionsConnect(jVarFloor, jVar);
        if (regionsConnect(jVar, jVarCeiling)) {
            if (zRegionsConnect) {
                jVarFloor.f58422t = jVarCeiling.f58422t;
                jVarFloor.f58420O = jVarCeiling.f58420O;
            } else {
                jVar.f58422t = jVarCeiling.f58422t;
                jVar.f58420O = jVarCeiling.f58420O;
                this.regions.add(jVar);
            }
            this.regions.remove(jVarCeiling);
            return;
        }
        if (!zRegionsConnect) {
            int iBinarySearch = Arrays.binarySearch(this.chunkIndex.offsets, jVar.f58422t);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            jVar.f58420O = iBinarySearch;
            this.regions.add(jVar);
            return;
        }
        jVarFloor.f58422t = jVar.f58422t;
        int i2 = jVarFloor.f58420O;
        while (true) {
            ChunkIndex chunkIndex = this.chunkIndex;
            if (i2 >= chunkIndex.length - 1) {
                break;
            }
            int i3 = i2 + 1;
            if (chunkIndex.offsets[i3] > jVarFloor.f58422t) {
                break;
            } else {
                i2 = i3;
            }
        }
        jVarFloor.f58420O = i2;
    }

    private boolean regionsConnect(@Nullable j jVar, @Nullable j jVar2) {
        return (jVar == null || jVar2 == null || jVar.f58422t != jVar2.f58421n) ? false : true;
    }

    public void release() {
        this.cache.removeListener(this.cacheKey, this);
    }

    public CachedRegionTracker(Cache cache, String str, ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            try {
                Iterator<CacheSpan> itDescendingIterator = cache.addListener(str, this).descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    mergeSpan(itDescendingIterator.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
