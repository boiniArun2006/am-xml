package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Loader implements LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final LoadErrorAction DONT_RETRY;
    public static final LoadErrorAction DONT_RETRY_FATAL;
    public static final LoadErrorAction RETRY = createRetryAction(false, -9223372036854775807L);
    public static final LoadErrorAction RETRY_RESET_ERROR_COUNT = createRetryAction(true, -9223372036854775807L);
    private static final String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";

    @Nullable
    private n currentTask;
    private final ExecutorService downloadExecutorService;

    @Nullable
    private IOException fatalError;

    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t3, long j2, long j3, boolean z2);

        void onLoadCompleted(T t3, long j2, long j3);

        LoadErrorAction onLoadError(T t3, long j2, long j3, IOException iOException, int i2);
    }

    public static final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        private LoadErrorAction(int i2, long j2) {
            this.type = i2;
            this.retryDelayMillis = j2;
        }

        public boolean isRetry() {
            int i2 = this.type;
            return i2 == 0 || i2 == 1;
        }
    }

    public interface Loadable {
        void cancelLoad();

        void load() throws IOException;
    }

    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    private final class n extends Handler implements Runnable {
        private Callback J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final long f58424O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private boolean f58425S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private Thread f58426Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile boolean f58427g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58428n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f58429o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private IOException f58430r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Loadable f58431t;

        private void rl() {
            this.f58430r = null;
            Loader.this.downloadExecutorService.execute((Runnable) Assertions.checkNotNull(Loader.this.currentTask));
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            try {
                synchronized (this) {
                    z2 = this.f58425S;
                    this.f58426Z = Thread.currentThread();
                }
                if (!z2) {
                    TraceUtil.beginSection("load:" + this.f58431t.getClass().getSimpleName());
                    try {
                        this.f58431t.load();
                        TraceUtil.endSection();
                    } catch (Throwable th) {
                        TraceUtil.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f58426Z = null;
                    Thread.interrupted();
                }
                if (this.f58427g) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e2) {
                if (this.f58427g) {
                    return;
                }
                obtainMessage(2, e2).sendToTarget();
            } catch (Error e3) {
                if (!this.f58427g) {
                    Log.e("LoadTask", "Unexpected error loading stream", e3);
                    obtainMessage(3, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                if (this.f58427g) {
                    return;
                }
                Log.e("LoadTask", "Unexpected exception loading stream", e4);
                obtainMessage(2, new UnexpectedLoaderException(e4)).sendToTarget();
            } catch (OutOfMemoryError e5) {
                if (this.f58427g) {
                    return;
                }
                Log.e("LoadTask", "OutOfMemory error loading stream", e5);
                obtainMessage(2, new UnexpectedLoaderException(e5)).sendToTarget();
            }
        }

        public n(Looper looper, Loadable loadable, Callback callback, int i2, long j2) {
            super(looper);
            this.f58431t = loadable;
            this.J2 = callback;
            this.f58428n = i2;
            this.f58424O = j2;
        }

        private long nr() {
            return Math.min((this.f58429o - 1) * 1000, 5000);
        }

        private void t() {
            Loader.this.currentTask = null;
        }

        public void J2(long j2) {
            Assertions.checkState(Loader.this.currentTask == null);
            Loader.this.currentTask = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                rl();
            }
        }

        public void O(int i2) throws IOException {
            IOException iOException = this.f58430r;
            if (iOException != null && this.f58429o > i2) {
                throw iOException;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f58427g) {
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                rl();
                return;
            }
            if (i2 == 3) {
                throw ((Error) message.obj);
            }
            t();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - this.f58424O;
            Callback callback = (Callback) Assertions.checkNotNull(this.J2);
            if (this.f58425S) {
                callback.onLoadCanceled(this.f58431t, jElapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                try {
                    callback.onLoadCompleted(this.f58431t, jElapsedRealtime, j2);
                    return;
                } catch (RuntimeException e2) {
                    Log.e("LoadTask", "Unexpected exception handling load completed", e2);
                    Loader.this.fatalError = new UnexpectedLoaderException(e2);
                    return;
                }
            }
            if (i3 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f58430r = iOException;
            int i5 = this.f58429o + 1;
            this.f58429o = i5;
            LoadErrorAction loadErrorActionOnLoadError = callback.onLoadError(this.f58431t, jElapsedRealtime, j2, iOException, i5);
            if (loadErrorActionOnLoadError.type == 3) {
                Loader.this.fatalError = this.f58430r;
            } else if (loadErrorActionOnLoadError.type != 2) {
                if (loadErrorActionOnLoadError.type == 1) {
                    this.f58429o = 1;
                }
                J2(loadErrorActionOnLoadError.retryDelayMillis != -9223372036854775807L ? loadErrorActionOnLoadError.retryDelayMillis : nr());
            }
        }

        public void n(boolean z2) {
            this.f58427g = z2;
            this.f58430r = null;
            if (hasMessages(0)) {
                this.f58425S = true;
                removeMessages(0);
                if (!z2) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f58425S = true;
                        this.f58431t.cancelLoad();
                        Thread thread = this.f58426Z;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z2) {
                t();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((Callback) Assertions.checkNotNull(this.J2)).onLoadCanceled(this.f58431t, jElapsedRealtime, jElapsedRealtime - this.f58424O, true);
                this.J2 = null;
            }
        }
    }

    private static final class w6 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ReleaseCallback f58432n;

        @Override // java.lang.Runnable
        public void run() {
            this.f58432n.onLoaderReleased();
        }

        public w6(ReleaseCallback releaseCallback) {
            this.f58432n = releaseCallback;
        }
    }

    static {
        long j2 = -9223372036854775807L;
        DONT_RETRY = new LoadErrorAction(2, j2);
        DONT_RETRY_FATAL = new LoadErrorAction(3, j2);
    }

    public void clearFatalError() {
        this.fatalError = null;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public static LoadErrorAction createRetryAction(boolean z2, long j2) {
        return new LoadErrorAction(z2 ? 1 : 0, j2);
    }

    public void cancelLoading() {
        ((n) Assertions.checkStateNotNull(this.currentTask)).n(false);
    }

    public boolean hasFatalError() {
        return this.fatalError != null;
    }

    public boolean isLoading() {
        return this.currentTask != null;
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int i2) throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        n nVar = this.currentTask;
        if (nVar != null) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = nVar.f58428n;
            }
            nVar.O(i2);
        }
    }

    public void release(@Nullable ReleaseCallback releaseCallback) {
        n nVar = this.currentTask;
        if (nVar != null) {
            nVar.n(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutorService.execute(new w6(releaseCallback));
        }
        this.downloadExecutorService.shutdown();
    }

    public Loader(String str) {
        this.downloadExecutorService = Util.newSingleThreadExecutor(THREAD_NAME_PREFIX + str);
    }

    public <T extends Loadable> long startLoading(T t3, Callback<T> callback, int i2) {
        Looper looper = (Looper) Assertions.checkStateNotNull(Looper.myLooper());
        this.fatalError = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new n(looper, t3, callback, i2, jElapsedRealtime).J2(0L);
        return jElapsedRealtime;
    }
}
