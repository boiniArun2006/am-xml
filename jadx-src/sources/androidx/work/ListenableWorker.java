package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.Xo;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    public static abstract class Result {

        @RestrictTo
        public static final class Failure extends Result {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Data f42729n;

            public Failure() {
                this(Data.f42715t);
            }

            public Failure(Data data) {
                this.f42729n = data;
            }

            public Data O() {
                return this.f42729n;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Failure.class != obj.getClass()) {
                    return false;
                }
                return this.f42729n.equals(((Failure) obj).f42729n);
            }

            public int hashCode() {
                return (Failure.class.getName().hashCode() * 31) + this.f42729n.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f42729n + '}';
            }
        }

        @RestrictTo
        public static final class Retry extends Result {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && Retry.class == obj.getClass();
            }

            public int hashCode() {
                return Retry.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        @RestrictTo
        public static final class Success extends Result {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Data f42730n;

            public Success() {
                this(Data.f42715t);
            }

            public Success(Data data) {
                this.f42730n = data;
            }

            public Data O() {
                return this.f42730n;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Success.class != obj.getClass()) {
                    return false;
                }
                return this.f42730n.equals(((Success) obj).f42730n);
            }

            public int hashCode() {
                return (Success.class.getName().hashCode() * 31) + this.f42730n.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f42730n + '}';
            }
        }

        public static Result n() {
            return new Failure();
        }

        public static Result nr(Data data) {
            return new Success(data);
        }

        public static Result rl() {
            return new Retry();
        }

        public static Result t() {
            return new Success();
        }

        Result() {
        }
    }

    public void onStopped() {
    }

    @NonNull
    public final Xo setForegroundAsync(@NonNull ForegroundInfo foregroundInfo) {
        this.mRunInForeground = true;
        return this.mWorkerParams.rl().n(getApplicationContext(), getId(), foregroundInfo);
    }

    @RestrictTo
    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract Xo startWork();

    @RestrictTo
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @RestrictTo
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.n();
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.t();
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.nr();
    }

    @Nullable
    @RequiresApi
    public final Network getNetwork() {
        return this.mWorkerParams.O();
    }

    @IntRange
    public final int getRunAttemptCount() {
        return this.mWorkerParams.Uo();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.KN();
    }

    @NonNull
    @RestrictTo
    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.xMQ();
    }

    @NonNull
    @RequiresApi
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.mUb();
    }

    @NonNull
    @RequiresApi
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.gh();
    }

    @NonNull
    @RestrictTo
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.qie();
    }

    @RestrictTo
    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @RestrictTo
    public final boolean isUsed() {
        return this.mUsed;
    }

    @NonNull
    public Xo setProgressAsync(@NonNull Data data) {
        return this.mWorkerParams.J2().n(getApplicationContext(), getId(), data);
    }

    @RestrictTo
    public void setRunInForeground(boolean z2) {
        this.mRunInForeground = z2;
    }

    @Keep
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    @NonNull
    public Xo getForegroundInfoAsync() {
        SettableFuture settableFutureO = SettableFuture.o();
        settableFutureO.ck(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return settableFutureO;
    }
}
