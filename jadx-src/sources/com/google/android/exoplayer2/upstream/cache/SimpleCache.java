package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class SimpleCache implements Cache {
    private static final int SUBDIRECTORY_COUNT = 10;
    private static final String TAG = "SimpleCache";
    private static final String UID_FILE_SUFFIX = ".uid";
    private static final HashSet<File> lockedCacheDirs = new HashSet<>();
    private final File cacheDir;
    private final I28 contentIndex;
    private final CacheEvictor evictor;

    @Nullable
    private final n fileIndex;
    private Cache.CacheException initializationException;
    private final HashMap<String, ArrayList<Cache.Listener>> listeners;
    private final Random random;
    private boolean released;
    private long totalSpace;
    private final boolean touchCacheSpans;
    private long uid;

    class j extends Thread {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f58449n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f58449n = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (SimpleCache.this) {
                this.f58449n.open();
                SimpleCache.this.initialize();
                SimpleCache.this.evictor.onCacheInitialized();
            }
        }
    }

    @Deprecated
    public SimpleCache(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, (byte[]) null, false);
    }

    private static long loadUid(File[] fileArr) {
        int length = fileArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            File file = fileArr[i2];
            String name = file.getName();
            if (name.endsWith(UID_FILE_SUFFIX)) {
                try {
                    return parseUid(name);
                } catch (NumberFormatException unused) {
                    Log.e(TAG, "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> addListener(String str, Cache.Listener listener) {
        try {
            Assertions.checkState(!this.released);
            Assertions.checkNotNull(str);
            Assertions.checkNotNull(listener);
            ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.listeners.put(str, arrayList);
            }
            arrayList.add(listener);
        } catch (Throwable th) {
            throw th;
        }
        return getCachedSpans(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        checkInitialization();
        this.contentIndex.O(str, contentMetadataMutations);
        try {
            this.contentIndex.XQ();
        } catch (IOException e2) {
            throw new Cache.CacheException(e2);
        }
    }

    public synchronized void checkInitialization() throws Cache.CacheException {
        Cache.CacheException cacheException = this.initializationException;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void commitFile(File file, long j2) throws Cache.CacheException {
        Assertions.checkState(!this.released);
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            fuX fux = (fuX) Assertions.checkNotNull(fuX.t(file, j2, this.contentIndex));
            Ml ml = (Ml) Assertions.checkNotNull(this.contentIndex.KN(fux.key));
            Assertions.checkState(ml.KN(fux.position, fux.length));
            long contentLength = ContentMetadata.getContentLength(ml.nr());
            if (contentLength != -1) {
                Assertions.checkState(fux.position + fux.length <= contentLength);
            }
            if (this.fileIndex == null) {
                addSpan(fux);
                this.contentIndex.XQ();
                notifyAll();
                return;
            }
            try {
                this.fileIndex.xMQ(file.getName(), fux.length, fux.lastTouchTimestamp);
                addSpan(fux);
                try {
                    this.contentIndex.XQ();
                    notifyAll();
                    return;
                } catch (IOException e2) {
                    throw new Cache.CacheException(e2);
                }
            } catch (IOException e3) {
                throw new Cache.CacheException(e3);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCacheSpace() {
        Assertions.checkState(!this.released);
        return this.totalSpace;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedBytes(String str, long j2, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j2 + j3;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        long j7 = j2;
        j4 = 0;
        while (j7 < j6) {
            long cachedLength = getCachedLength(str, j7, j6 - j7);
            if (cachedLength > 0) {
                j4 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j7 += cachedLength;
        }
        return j4;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getCachedLength(String str, long j2, long j3) {
        Ml mlKN;
        Assertions.checkState(!this.released);
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        mlKN = this.contentIndex.KN(str);
        return mlKN != null ? mlKN.t(j2, j3) : -j3;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<CacheSpan> getCachedSpans(String str) {
        Ml mlKN;
        try {
            Assertions.checkState(!this.released);
            mlKN = this.contentIndex.KN(str);
        } catch (Throwable th) {
            throw th;
        }
        return (mlKN == null || mlKN.Uo()) ? new TreeSet() : new TreeSet((Collection) mlKN.J2());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized ContentMetadata getContentMetadata(String str) {
        Assertions.checkState(!this.released);
        return this.contentIndex.gh(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized Set<String> getKeys() {
        Assertions.checkState(!this.released);
        return new HashSet(this.contentIndex.az());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getUid() {
        return this.uid;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized boolean isCached(String str, long j2, long j3) {
        boolean z2;
        z2 = false;
        Assertions.checkState(!this.released);
        Ml mlKN = this.contentIndex.KN(str);
        if (mlKN != null) {
            if (mlKN.t(j2, j3) >= j3) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void release() {
        if (this.released) {
            return;
        }
        this.listeners.clear();
        removeStaleSpans();
        try {
            try {
                this.contentIndex.XQ();
                unlockFolder(this.cacheDir);
            } catch (IOException e2) {
                Log.e(TAG, "Storing index file failed", e2);
                unlockFolder(this.cacheDir);
            }
            this.released = true;
        } catch (Throwable th) {
            unlockFolder(this.cacheDir);
            this.released = true;
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void releaseHoleSpan(CacheSpan cacheSpan) {
        Assertions.checkState(!this.released);
        Ml ml = (Ml) Assertions.checkNotNull(this.contentIndex.KN(cacheSpan.key));
        ml.az(cacheSpan.position);
        this.contentIndex.r(ml.rl);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeListener(String str, Cache.Listener listener) {
        if (this.released) {
            return;
        }
        ArrayList<Cache.Listener> arrayList = this.listeners.get(str);
        if (arrayList != null) {
            arrayList.remove(listener);
            if (arrayList.isEmpty()) {
                this.listeners.remove(str);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeResource(String str) {
        Assertions.checkState(!this.released);
        Iterator<CacheSpan> it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            removeSpanInternal(it.next());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void removeSpan(CacheSpan cacheSpan) {
        Assertions.checkState(!this.released);
        removeSpanInternal(cacheSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File startFile(String str, long j2, long j3) throws Throwable {
        Throwable th;
        try {
            try {
                Assertions.checkState(!this.released);
                checkInitialization();
                Ml mlKN = this.contentIndex.KN(str);
                Assertions.checkNotNull(mlKN);
                Assertions.checkState(mlKN.KN(j2, j3));
                if (!this.cacheDir.exists()) {
                    try {
                        createCacheDirectories(this.cacheDir);
                        removeStaleSpans();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.evictor.onStartFile(this, str, j2, j3);
                File file = new File(this.cacheDir, Integer.toString(this.random.nextInt(10)));
                if (!file.exists()) {
                    createCacheDirectories(file);
                }
                return fuX.Uo(file, mlKN.f58446n, j2, System.currentTimeMillis());
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:? -> B:10:0x001e). Please report as a decompilation issue!!! */
    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized CacheSpan startReadWrite(String str, long j2, long j3) throws Throwable {
        try {
            Assertions.checkState(!this.released);
            checkInitialization();
            while (true) {
                CacheSpan cacheSpanStartReadWriteNonBlocking = startReadWriteNonBlocking(str, j2, j3);
                long j4 = j3;
                long j5 = j2;
                String str2 = str;
                if (cacheSpanStartReadWriteNonBlocking != null) {
                    return cacheSpanStartReadWriteNonBlocking;
                }
                try {
                    wait();
                    str = str2;
                    j2 = j5;
                    j3 = j4;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    @Nullable
    public synchronized CacheSpan startReadWriteNonBlocking(String str, long j2, long j3) throws Throwable {
        try {
            try {
                Assertions.checkState(!this.released);
                checkInitialization();
                fuX span = getSpan(str, j2, j3);
                if (span.isCached) {
                    return touchSpan(str, span);
                }
                if (this.contentIndex.HI(str).mUb(j2, span.length)) {
                    return span;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Deprecated
    public SimpleCache(File file, CacheEvictor cacheEvictor, @Nullable byte[] bArr) {
        this(file, cacheEvictor, bArr, bArr != null);
    }

    private void addSpan(fuX fux) {
        this.contentIndex.HI(fux.key).n(fux);
        this.totalSpace += fux.length;
        notifySpanAdded(fux);
    }

    private static long createUid(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + UID_FILE_SUFFIX);
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    @WorkerThread
    public static void delete(File file, @Nullable DatabaseProvider databaseProvider) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (databaseProvider != null) {
                long jLoadUid = loadUid(fileArrListFiles);
                if (jLoadUid != -1) {
                    try {
                        n.n(databaseProvider, jLoadUid);
                    } catch (DatabaseIOException unused) {
                        Log.w(TAG, "Failed to delete file metadata: " + jLoadUid);
                    }
                    try {
                        I28.Uo(databaseProvider, jLoadUid);
                    } catch (DatabaseIOException unused2) {
                        Log.w(TAG, "Failed to delete file metadata: " + jLoadUid);
                    }
                }
            }
            Util.recursiveDelete(file);
        }
    }

    private fuX getSpan(String str, long j2, long j3) {
        fuX fuxO;
        Ml mlKN = this.contentIndex.KN(str);
        if (mlKN == null) {
            return fuX.nr(str, j2, j3);
        }
        while (true) {
            fuxO = mlKN.O(j2, j3);
            if (!fuxO.isCached || fuxO.file.length() == fuxO.length) {
                break;
            }
            removeStaleSpans();
        }
        return fuxO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        if (!this.cacheDir.exists()) {
            try {
                createCacheDirectories(this.cacheDir);
            } catch (Cache.CacheException e2) {
                this.initializationException = e2;
                return;
            }
        }
        File[] fileArrListFiles = this.cacheDir.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.cacheDir;
            Log.e(TAG, str);
            this.initializationException = new Cache.CacheException(str);
            return;
        }
        long jLoadUid = loadUid(fileArrListFiles);
        this.uid = jLoadUid;
        if (jLoadUid == -1) {
            try {
                this.uid = createUid(this.cacheDir);
            } catch (IOException e3) {
                String str2 = "Failed to create cache UID: " + this.cacheDir;
                Log.e(TAG, str2, e3);
                this.initializationException = new Cache.CacheException(str2, e3);
                return;
            }
        }
        try {
            this.contentIndex.ck(this.uid);
            n nVar = this.fileIndex;
            if (nVar != null) {
                nVar.J2(this.uid);
                Map mapT = this.fileIndex.t();
                loadDirectory(this.cacheDir, true, fileArrListFiles, mapT);
                this.fileIndex.KN(mapT.keySet());
            } else {
                loadDirectory(this.cacheDir, true, fileArrListFiles, null);
            }
            this.contentIndex.Z();
            try {
                this.contentIndex.XQ();
            } catch (IOException e4) {
                Log.e(TAG, "Storing index file failed", e4);
            }
        } catch (IOException e5) {
            String str3 = "Failed to initialize cache indices: " + this.cacheDir;
            Log.e(TAG, str3, e5);
            this.initializationException = new Cache.CacheException(str3, e5);
        }
    }

    public static synchronized boolean isCacheFolderLocked(File file) {
        return lockedCacheDirs.contains(file.getAbsoluteFile());
    }

    private void loadDirectory(File file, boolean z2, @Nullable File[] fileArr, @Nullable Map<String, com.google.android.exoplayer2.upstream.cache.j> map) {
        long j2;
        long j3;
        if (fileArr == null || fileArr.length == 0) {
            if (z2) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z2 && name.indexOf(46) == -1) {
                loadDirectory(file2, false, file2.listFiles(), map);
            } else if (!z2 || (!I28.Ik(name) && !name.endsWith(UID_FILE_SUFFIX))) {
                com.google.android.exoplayer2.upstream.cache.j jVarRemove = map != null ? map.remove(name) : null;
                if (jVarRemove != null) {
                    j2 = jVarRemove.f58454n;
                    j3 = jVarRemove.rl;
                } else {
                    j2 = -1;
                    j3 = -9223372036854775807L;
                }
                fuX fuxRl = fuX.rl(file2, j2, j3, this.contentIndex);
                if (fuxRl != null) {
                    addSpan(fuxRl);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static synchronized boolean lockFolder(File file) {
        return lockedCacheDirs.add(file.getAbsoluteFile());
    }

    private void notifySpanAdded(fuX fux) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(fux.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, fux);
            }
        }
        this.evictor.onSpanAdded(this, fux);
    }

    private void notifySpanRemoved(CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(cacheSpan.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, cacheSpan);
            }
        }
        this.evictor.onSpanRemoved(this, cacheSpan);
    }

    private void notifySpanTouched(fuX fux, CacheSpan cacheSpan) {
        ArrayList<Cache.Listener> arrayList = this.listeners.get(fux.key);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, fux, cacheSpan);
            }
        }
        this.evictor.onSpanTouched(this, fux, cacheSpan);
    }

    private static long parseUid(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void removeSpanInternal(CacheSpan cacheSpan) {
        Ml mlKN = this.contentIndex.KN(cacheSpan.key);
        if (mlKN == null || !mlKN.gh(cacheSpan)) {
            return;
        }
        this.totalSpace -= cacheSpan.length;
        if (this.fileIndex != null) {
            String name = cacheSpan.file.getName();
            try {
                this.fileIndex.Uo(name);
            } catch (IOException unused) {
                Log.w(TAG, "Failed to remove file index entry for: " + name);
            }
        }
        this.contentIndex.r(mlKN.rl);
        notifySpanRemoved(cacheSpan);
    }

    private void removeStaleSpans() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.contentIndex.xMQ().iterator();
        while (it.hasNext()) {
            for (CacheSpan cacheSpan : ((Ml) it.next()).J2()) {
                if (cacheSpan.file.length() != cacheSpan.length) {
                    arrayList.add(cacheSpan);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            removeSpanInternal((CacheSpan) arrayList.get(i2));
        }
    }

    private fuX touchSpan(String str, fuX fux) {
        boolean z2;
        if (!this.touchCacheSpans) {
            return fux;
        }
        String name = ((File) Assertions.checkNotNull(fux.file)).getName();
        long j2 = fux.length;
        long jCurrentTimeMillis = System.currentTimeMillis();
        n nVar = this.fileIndex;
        if (nVar != null) {
            try {
                nVar.xMQ(name, j2, jCurrentTimeMillis);
            } catch (IOException unused) {
                Log.w(TAG, "Failed to update index with new touch timestamp.");
            }
            z2 = false;
        } else {
            z2 = true;
        }
        fuX fuxQie = this.contentIndex.KN(str).qie(fux, jCurrentTimeMillis, z2);
        notifySpanTouched(fux, fuxQie);
        return fuxQie;
    }

    private static synchronized void unlockFolder(File file) {
        lockedCacheDirs.remove(file.getAbsoluteFile());
    }

    @Deprecated
    public SimpleCache(File file, CacheEvictor cacheEvictor, @Nullable byte[] bArr, boolean z2) {
        this(file, cacheEvictor, null, bArr, z2, true);
    }

    private static void createCacheDirectories(File file) throws Cache.CacheException {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            Log.e(TAG, str);
            throw new Cache.CacheException(str);
        }
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, DatabaseProvider databaseProvider) {
        this(file, cacheEvictor, databaseProvider, null, false, false);
    }

    public SimpleCache(File file, CacheEvictor cacheEvictor, @Nullable DatabaseProvider databaseProvider, @Nullable byte[] bArr, boolean z2, boolean z3) {
        this(file, cacheEvictor, new I28(databaseProvider, file, bArr, z2, z3), (databaseProvider == null || z3) ? null : new n(databaseProvider));
    }

    SimpleCache(File file, CacheEvictor cacheEvictor, I28 i28, @Nullable n nVar) {
        if (lockFolder(file)) {
            this.cacheDir = file;
            this.evictor = cacheEvictor;
            this.contentIndex = i28;
            this.fileIndex = nVar;
            this.listeners = new HashMap<>();
            this.random = new Random();
            this.touchCacheSpans = cacheEvictor.requiresCacheSpanTouches();
            this.uid = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new j("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
