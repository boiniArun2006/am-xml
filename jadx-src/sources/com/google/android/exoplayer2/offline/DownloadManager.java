package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1);
    private static final int MSG_ADD_DOWNLOAD = 6;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 10;
    private static final int MSG_DOWNLOAD_UPDATE = 2;
    private static final int MSG_INITIALIZE = 0;
    private static final int MSG_INITIALIZED = 0;
    private static final int MSG_PROCESSED = 1;
    private static final int MSG_RELEASE = 12;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 8;
    private static final int MSG_REMOVE_DOWNLOAD = 7;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 1;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 4;
    private static final int MSG_SET_MIN_RETRY_COUNT = 5;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 2;
    private static final int MSG_SET_STOP_REASON = 3;
    private static final int MSG_TASK_STOPPED = 9;
    private static final int MSG_UPDATE_PROGRESS = 11;
    private static final String TAG = "DownloadManager";
    private int activeTaskCount;
    private final Handler applicationHandler;
    private final Context context;
    private final WritableDownloadIndex downloadIndex;
    private List<Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final w6 internalHandler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final RequirementsWatcher.Listener requirementsListener;
    private RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    public interface Listener {
        default void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception exc) {
        }

        default void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        default void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z2) {
        }

        default void onIdle(DownloadManager downloadManager) {
        }

        default void onInitialized(DownloadManager downloadManager) {
        }

        default void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i2) {
        }

        default void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z2) {
        }
    }

    private static class Ml extends Thread implements Downloader.ProgressListener {
        private final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final DownloadProgress f58002O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private Exception f58003S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private volatile boolean f58004Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f58005g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final DownloadRequest f58006n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private volatile w6 f58007o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f58008r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Downloader f58009t;

        private Ml(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z2, int i2, w6 w6Var) {
            this.f58006n = downloadRequest;
            this.f58009t = downloader;
            this.f58002O = downloadProgress;
            this.J2 = z2;
            this.f58008r = i2;
            this.f58007o = w6Var;
            this.f58005g = -1L;
        }

        private static int J2(int i2) {
            return Math.min((i2 - 1) * 1000, 5000);
        }

        public void O(boolean z2) {
            if (z2) {
                this.f58007o = null;
            }
            if (this.f58004Z) {
                return;
            }
            this.f58004Z = true;
            this.f58009t.cancel();
            interrupt();
        }

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        public void onProgress(long j2, long j3, float f3) {
            this.f58002O.bytesDownloaded = j3;
            this.f58002O.percentDownloaded = f3;
            if (j2 != this.f58005g) {
                this.f58005g = j2;
                w6 w6Var = this.f58007o;
                if (w6Var != null) {
                    w6Var.obtainMessage(10, (int) (j2 >> 32), (int) j2, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.J2) {
                    this.f58009t.remove();
                } else {
                    long j2 = -1;
                    int i2 = 0;
                    while (!this.f58004Z) {
                        try {
                            this.f58009t.download(this);
                            break;
                        } catch (IOException e2) {
                            if (!this.f58004Z) {
                                long j3 = this.f58002O.bytesDownloaded;
                                if (j3 != j2) {
                                    i2 = 0;
                                    j2 = j3;
                                }
                                i2++;
                                if (i2 > this.f58008r) {
                                    throw e2;
                                }
                                Thread.sleep(J2(i2));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e3) {
                this.f58003S = e3;
            }
            w6 w6Var = this.f58007o;
            if (w6Var != null) {
                w6Var.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class w6 extends Handler {
        private final ArrayList J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Handler f58012O;
        private final HashMap Uo;
        private int gh;
        private int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f58013n;
        private final DownloaderFactory nr;
        private int qie;
        private final HandlerThread rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final WritableDownloadIndex f58014t;
        private boolean xMQ;

        private void Ik(String str) {
            Download downloadJ2 = J2(str, true);
            if (downloadJ2 != null) {
                ty(downloadJ2, 5, 0);
                te();
            } else {
                Log.e(DownloadManager.TAG, "Failed to remove nonexistent download: " + str);
            }
        }

        private void S(Download download, int i2) {
            if (i2 == 0) {
                if (download.state == 1) {
                    ty(download, 0, 0);
                }
            } else if (i2 != download.stopReason) {
                int i3 = download.state;
                if (i3 == 0 || i3 == 2) {
                    i3 = 1;
                }
                az(new Download(download.request, i3, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i2, 0, download.progress));
            }
        }

        private int Uo(String str) {
            for (int i2 = 0; i2 < this.J2.size(); i2++) {
                if (((Download) this.J2.get(i2)).request.id.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        private Ml ViF(Ml ml, Download download) {
            if (ml != null) {
                Assertions.checkState(!ml.J2);
                ml.O(false);
                return ml;
            }
            if (!t() || this.qie >= this.mUb) {
                return null;
            }
            Download downloadTy = ty(download, 2, 0);
            Ml ml2 = new Ml(downloadTy.request, this.nr.createDownloader(downloadTy.request), downloadTy.progress, false, this.gh, this);
            this.Uo.put(downloadTy.request.id, ml2);
            int i2 = this.qie;
            this.qie = i2 + 1;
            if (i2 == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            ml2.start();
            return ml2;
        }

        private void iF() {
            for (int i2 = 0; i2 < this.J2.size(); i2++) {
                Download download = (Download) this.J2.get(i2);
                if (download.state == 2) {
                    try {
                        this.f58014t.putDownload(download);
                    } catch (IOException e2) {
                        Log.e(DownloadManager.TAG, "Failed to update index.", e2);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        private void te() {
            int i2 = 0;
            for (int i3 = 0; i3 < this.J2.size(); i3++) {
                Download download = (Download) this.J2.get(i3);
                Ml mlViF = (Ml) this.Uo.get(download.request.id);
                int i5 = download.state;
                if (i5 == 0) {
                    mlViF = ViF(mlViF, download);
                } else if (i5 == 1) {
                    g(mlViF);
                } else if (i5 == 2) {
                    Assertions.checkNotNull(mlViF);
                    aYN(mlViF, download, i2);
                } else {
                    if (i5 != 5 && i5 != 7) {
                        throw new IllegalStateException();
                    }
                    nY(mlViF, download);
                }
                if (mlViF != null && !mlViF.J2) {
                    i2++;
                }
            }
        }

        private Download ty(Download download, int i2, int i3) {
            Assertions.checkState((i2 == 3 || i2 == 4) ? false : true);
            return az(O(download, i2, i3));
        }

        private void HI() {
            Iterator it = this.Uo.values().iterator();
            while (it.hasNext()) {
                ((Ml) it.next()).O(true);
            }
            try {
                this.f58014t.setDownloadingStatesToQueued();
            } catch (IOException e2) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e2);
            }
            this.J2.clear();
            this.rl.quit();
            synchronized (this) {
                this.f58013n = true;
                notifyAll();
            }
        }

        private void KN(int i2) {
            this.KN = i2;
            DownloadCursor downloads = null;
            try {
                try {
                    this.f58014t.setDownloadingStatesToQueued();
                    downloads = this.f58014t.getDownloads(0, 1, 2, 5, 7);
                    while (downloads.moveToNext()) {
                        this.J2.add(downloads.getDownload());
                    }
                } catch (IOException e2) {
                    Log.e(DownloadManager.TAG, "Failed to load index.", e2);
                    this.J2.clear();
                }
                this.f58012O.obtainMessage(0, new ArrayList(this.J2)).sendToTarget();
                te();
            } finally {
                Util.closeQuietly(downloads);
            }
        }

        private static Download O(Download download, int i2, int i3) {
            return new Download(download.request, i2, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i3, 0, download.progress);
        }

        private void WPU(String str, int i2) {
            if (str == null) {
                for (int i3 = 0; i3 < this.J2.size(); i3++) {
                    S((Download) this.J2.get(i3), i2);
                }
                try {
                    this.f58014t.setStopReason(i2);
                } catch (IOException e2) {
                    Log.e(DownloadManager.TAG, "Failed to set manual stop reason", e2);
                }
            } else {
                Download downloadJ2 = J2(str, false);
                if (downloadJ2 != null) {
                    S(downloadJ2, i2);
                } else {
                    try {
                        this.f58014t.setStopReason(str, i2);
                    } catch (IOException e3) {
                        Log.e(DownloadManager.TAG, "Failed to set manual stop reason: " + str, e3);
                    }
                }
            }
            te();
        }

        private void XQ(int i2) {
            this.KN = i2;
            te();
        }

        private void Z(int i2) {
            this.gh = i2;
        }

        private Download az(Download download) {
            int i2 = download.state;
            Assertions.checkState((i2 == 3 || i2 == 4) ? false : true);
            int iUo = Uo(download.request.id);
            if (iUo == -1) {
                this.J2.add(download);
                Collections.sort(this.J2, new C());
            } else {
                boolean z2 = download.startTimeMs != ((Download) this.J2.get(iUo)).startTimeMs;
                this.J2.set(iUo, download);
                if (z2) {
                    Collections.sort(this.J2, new C());
                }
            }
            try {
                this.f58014t.putDownload(download);
            } catch (IOException e2) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e2);
            }
            this.f58012O.obtainMessage(2, new n(download, false, new ArrayList(this.J2), null)).sendToTarget();
            return download;
        }

        private void ck() {
            ArrayList arrayList = new ArrayList();
            try {
                DownloadCursor downloads = this.f58014t.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    try {
                        arrayList.add(downloads.getDownload());
                    } finally {
                    }
                }
                downloads.close();
            } catch (IOException unused) {
                Log.e(DownloadManager.TAG, "Failed to load downloads.");
            }
            for (int i2 = 0; i2 < this.J2.size(); i2++) {
                ArrayList arrayList2 = this.J2;
                arrayList2.set(i2, O((Download) arrayList2.get(i2), 5, 0));
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.J2.add(O((Download) arrayList.get(i3), 5, 0));
            }
            Collections.sort(this.J2, new C());
            try {
                this.f58014t.setStatesToRemoving();
            } catch (IOException e2) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e2);
            }
            ArrayList arrayList3 = new ArrayList(this.J2);
            for (int i5 = 0; i5 < this.J2.size(); i5++) {
                this.f58012O.obtainMessage(2, new n((Download) this.J2.get(i5), false, arrayList3, null)).sendToTarget();
            }
            te();
        }

        private void g(Ml ml) {
            if (ml != null) {
                Assertions.checkState(!ml.J2);
                ml.O(false);
            }
        }

        private void gh(Download download) {
            if (download.state == 7) {
                int i2 = download.stopReason;
                ty(download, i2 == 0 ? 0 : 1, i2);
                te();
            } else {
                this.J2.remove(Uo(download.request.id));
                try {
                    this.f58014t.removeDownload(download.request.id);
                } catch (IOException unused) {
                    Log.e(DownloadManager.TAG, "Failed to remove from database");
                }
                this.f58012O.obtainMessage(2, new n(download, true, new ArrayList(this.J2), null)).sendToTarget();
            }
        }

        private void mUb(Download download, Exception exc) {
            Download download2 = new Download(download.request, exc == null ? 3 : 4, download.startTimeMs, System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
            this.J2.remove(Uo(download2.request.id));
            try {
                this.f58014t.putDownload(download2);
            } catch (IOException e2) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e2);
            }
            this.f58012O.obtainMessage(2, new n(download2, false, new ArrayList(this.J2), exc)).sendToTarget();
        }

        private void nY(Ml ml, Download download) {
            if (ml != null) {
                if (ml.J2) {
                    return;
                }
                ml.O(false);
            } else {
                Ml ml2 = new Ml(download.request, this.nr.createDownloader(download.request), download.progress, true, this.gh, this);
                this.Uo.put(download.request.id, ml2);
                ml2.start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int nr(Download download, Download download2) {
            return Util.compareLong(download.startTimeMs, download2.startTimeMs);
        }

        private void o(int i2) {
            this.mUb = i2;
            te();
        }

        private void r(boolean z2) {
            this.xMQ = z2;
            te();
        }

        private void rl(DownloadRequest downloadRequest, int i2) {
            Download downloadJ2 = J2(downloadRequest.id, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (downloadJ2 != null) {
                az(DownloadManager.mergeRequest(downloadJ2, downloadRequest, i2, jCurrentTimeMillis));
            } else {
                az(new Download(downloadRequest, i2 == 0 ? 0 : 1, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i2, 0));
            }
            te();
        }

        private boolean t() {
            return !this.xMQ && this.KN == 0;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = 0;
            switch (message.what) {
                case 0:
                    KN(message.arg1);
                    i2 = 1;
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 1:
                    r(message.arg1 != 0);
                    i2 = 1;
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 2:
                    XQ(message.arg1);
                    i2 = 1;
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 3:
                    WPU((String) message.obj, message.arg1);
                    i2 = 1;
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 4:
                    o(message.arg1);
                    i2 = 1;
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 5:
                    Z(message.arg1);
                    i2 = 1;
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 6:
                    rl((DownloadRequest) message.obj, message.arg1);
                    i2 = 1;
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 7:
                    Ik((String) message.obj);
                    i2 = 1;
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 8:
                    ck();
                    i2 = 1;
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 9:
                    qie((Ml) message.obj);
                    this.f58012O.obtainMessage(1, i2, this.Uo.size()).sendToTarget();
                    return;
                case 10:
                    xMQ((Ml) message.obj, Util.toLong(message.arg1, message.arg2));
                    return;
                case 11:
                    iF();
                    return;
                case 12:
                    HI();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        public w6(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i2, int i3, boolean z2) {
            super(handlerThread.getLooper());
            this.rl = handlerThread;
            this.f58014t = writableDownloadIndex;
            this.nr = downloaderFactory;
            this.f58012O = handler;
            this.mUb = i2;
            this.gh = i3;
            this.xMQ = z2;
            this.J2 = new ArrayList();
            this.Uo = new HashMap();
        }

        private Download J2(String str, boolean z2) {
            int iUo = Uo(str);
            if (iUo != -1) {
                return (Download) this.J2.get(iUo);
            }
            if (z2) {
                try {
                    return this.f58014t.getDownload(str);
                } catch (IOException e2) {
                    Log.e(DownloadManager.TAG, "Failed to load download: " + str, e2);
                    return null;
                }
            }
            return null;
        }

        private void aYN(Ml ml, Download download, int i2) {
            Assertions.checkState(!ml.J2);
            if (t() && i2 < this.mUb) {
                return;
            }
            ty(download, 0, 0);
            ml.O(false);
        }

        private void qie(Ml ml) {
            String str = ml.f58006n.id;
            this.Uo.remove(str);
            boolean z2 = ml.J2;
            if (!z2) {
                int i2 = this.qie - 1;
                this.qie = i2;
                if (i2 == 0) {
                    removeMessages(11);
                }
            }
            if (!ml.f58004Z) {
                Exception exc = ml.f58003S;
                if (exc != null) {
                    Log.e(DownloadManager.TAG, "Task failed: " + ml.f58006n + ", " + z2, exc);
                }
                Download download = (Download) Assertions.checkNotNull(J2(str, false));
                int i3 = download.state;
                if (i3 != 2) {
                    if (i3 != 5 && i3 != 7) {
                        throw new IllegalStateException();
                    }
                    Assertions.checkState(z2);
                    gh(download);
                } else {
                    Assertions.checkState(!z2);
                    mUb(download, exc);
                }
                te();
                return;
            }
            te();
        }

        private void xMQ(Ml ml, long j2) {
            Download download = (Download) Assertions.checkNotNull(J2(ml.f58006n.id, false));
            if (j2 != download.contentLength && j2 != -1) {
                az(new Download(download.request, download.state, download.startTimeMs, System.currentTimeMillis(), j2, download.stopReason, download.failureReason, download.progress));
            }
        }
    }

    @Deprecated
    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory) {
        this(context, databaseProvider, cache, factory, new androidx.credentials.j());
    }

    private void onInitialized(List<Download> list) {
        this.initialized = true;
        this.downloads = Collections.unmodifiableList(list);
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onInitialized(this);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void pauseDownloads() {
        setDownloadsPaused(true);
    }

    public void resumeDownloads() {
        setDownloadsPaused(false);
    }

    public void setMaxParallelDownloads(@IntRange int i2) {
        Assertions.checkArgument(i2 > 0);
        if (this.maxParallelDownloads == i2) {
            return;
        }
        this.maxParallelDownloads = i2;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(4, i2, 0).sendToTarget();
    }

    public void setMinRetryCount(int i2) {
        Assertions.checkArgument(i2 >= 0);
        if (this.minRetryCount == i2) {
            return;
        }
        this.minRetryCount = i2;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(5, i2, 0).sendToTarget();
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Download f58010n;
        public final Exception nr;
        public final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final List f58011t;

        public n(Download download, boolean z2, List list, Exception exc) {
            this.f58010n = download;
            this.rl = z2;
            this.f58011t = list;
            this.nr = exc;
        }
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory, Executor executor) {
        this(context, new DefaultDownloadIndex(databaseProvider), new DefaultDownloaderFactory(new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMainMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            onInitialized((List) message.obj);
        } else if (i2 == 1) {
            onMessageProcessed(message.arg1, message.arg2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            onDownloadUpdate((n) message.obj);
        }
        return true;
    }

    static Download mergeRequest(Download download, DownloadRequest downloadRequest, int i2, long j2) {
        int i3 = download.state;
        long j3 = (i3 == 5 || download.isTerminalState()) ? j2 : download.startTimeMs;
        int i5 = 7;
        if (i3 != 5 && i3 != 7) {
            i5 = i2 != 0 ? 1 : 0;
        }
        return new Download(download.request.copyWithMergedRequest(downloadRequest), i5, j3, j2, -1L, i2, 0);
    }

    private void notifyWaitingForRequirementsChanged() {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.waitingForRequirements);
        }
    }

    private void onDownloadUpdate(n nVar) {
        this.downloads = Collections.unmodifiableList(nVar.f58011t);
        Download download = nVar.f58010n;
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        if (nVar.rl) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            Iterator<Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadChanged(this, download, nVar.nr);
            }
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onMessageProcessed(int i2, int i3) {
        this.pendingMessages -= i2;
        this.activeTaskCount = i3;
        if (isIdle()) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    private void setDownloadsPaused(boolean z2) {
        if (this.downloadsPaused == z2) {
            return;
        }
        this.downloadsPaused = z2;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownloadsPausedChanged(this, z2);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private boolean updateWaitingForRequirements() {
        boolean z2;
        if (this.downloadsPaused || this.notMetRequirements == 0) {
            z2 = false;
        } else {
            for (int i2 = 0; i2 < this.downloads.size(); i2++) {
                if (this.downloads.get(i2).state == 0) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        boolean z3 = this.waitingForRequirements != z2;
        this.waitingForRequirements = z2;
        return z3;
    }

    public void addDownload(DownloadRequest downloadRequest, int i2) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(6, i2, 0, downloadRequest).sendToTarget();
    }

    public Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    public List<Download> getCurrentDownloads() {
        return this.downloads;
    }

    public DownloadIndex getDownloadIndex() {
        return this.downloadIndex;
    }

    public boolean getDownloadsPaused() {
        return this.downloadsPaused;
    }

    public int getMaxParallelDownloads() {
        return this.maxParallelDownloads;
    }

    public int getMinRetryCount() {
        return this.minRetryCount;
    }

    public int getNotMetRequirements() {
        return this.notMetRequirements;
    }

    public Requirements getRequirements() {
        return this.requirementsWatcher.getRequirements();
    }

    public boolean isIdle() {
        return this.activeTaskCount == 0 && this.pendingMessages == 0;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isWaitingForRequirements() {
        return this.waitingForRequirements;
    }

    public void release() {
        synchronized (this.internalHandler) {
            try {
                w6 w6Var = this.internalHandler;
                if (w6Var.f58013n) {
                    return;
                }
                w6Var.sendEmptyMessage(12);
                boolean z2 = false;
                while (true) {
                    w6 w6Var2 = this.internalHandler;
                    if (w6Var2.f58013n) {
                        break;
                    }
                    try {
                        w6Var2.wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                this.applicationHandler.removeCallbacksAndMessages(null);
                this.downloads = Collections.EMPTY_LIST;
                this.pendingMessages = 0;
                this.activeTaskCount = 0;
                this.initialized = false;
                this.notMetRequirements = 0;
                this.waitingForRequirements = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeAllDownloads() {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(8).sendToTarget();
    }

    public void removeDownload(String str) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(7, str).sendToTarget();
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.requirementsWatcher.getRequirements())) {
            return;
        }
        this.requirementsWatcher.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.context, this.requirementsListener, requirements);
        this.requirementsWatcher = requirementsWatcher;
        onRequirementsStateChanged(this.requirementsWatcher, requirementsWatcher.start());
    }

    public void setStopReason(@Nullable String str, int i2) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(3, i2, 0, str).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i2) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.notMetRequirements != i2) {
            this.notMetRequirements = i2;
            this.pendingMessages++;
            this.internalHandler.obtainMessage(2, i2, 0).sendToTarget();
        }
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRequirementsStateChanged(this, requirements, i2);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    public void addListener(Listener listener) {
        Assertions.checkNotNull(listener);
        this.listeners.add(listener);
    }

    public DownloadManager(Context context, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory) {
        this.context = context.getApplicationContext();
        this.downloadIndex = writableDownloadIndex;
        this.maxParallelDownloads = 3;
        this.minRetryCount = 5;
        this.downloadsPaused = true;
        this.downloads = Collections.EMPTY_LIST;
        this.listeners = new CopyOnWriteArraySet<>();
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.Dsr
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f58021n.handleMainMessage(message);
            }
        });
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        w6 w6Var = new w6(handlerThread, writableDownloadIndex, downloaderFactory, handlerCreateHandlerForCurrentOrMainLooper, this.maxParallelDownloads, this.minRetryCount, this.downloadsPaused);
        this.internalHandler = w6Var;
        RequirementsWatcher.Listener listener = new RequirementsWatcher.Listener() { // from class: com.google.android.exoplayer2.offline.aC
            @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
            public final void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i2) {
                this.f58036n.onRequirementsStateChanged(requirementsWatcher, i2);
            }
        };
        this.requirementsListener = listener;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, listener, DEFAULT_REQUIREMENTS);
        this.requirementsWatcher = requirementsWatcher;
        int iStart = requirementsWatcher.start();
        this.notMetRequirements = iStart;
        this.pendingMessages = 1;
        w6Var.obtainMessage(0, iStart, 0).sendToTarget();
    }
}
